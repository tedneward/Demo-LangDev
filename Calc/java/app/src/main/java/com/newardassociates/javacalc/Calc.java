package com.newardassociates.javacalc;

import com.newardassociates.javacalc.parser.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

class CalcVisitor extends LabeledExprBaseVisitor<Integer> {

	@Override public Integer visitInt(LabeledExprParser.IntContext ctx) {
        int value = Integer.valueOf(ctx.INT().getText());
        System.out.println("INT: " + value);
        return value;
    }

	@Override public Integer visitMulDiv(LabeledExprParser.MulDivContext ctx) { 
        int lhs = visit(ctx.expr(0));
        int rhs = visit(ctx.expr(1));
        if (ctx.op.getType() == LabeledExprParser.MUL) {
            System.out.println("MUL: " + lhs + " * " + rhs);
            return lhs * rhs;
        } else {
            System.out.println("DIV: " + lhs + " / " + rhs);
            return lhs / rhs;
        }
    }
	@Override public Integer visitAddSub(LabeledExprParser.AddSubContext ctx) { 
        int lhs = visit(ctx.expr(0));
        int rhs = visit(ctx.expr(1));
        if (ctx.op.getType() == LabeledExprParser.ADD) {
            System.out.println("ADD: " + lhs + " + " + rhs);
            return lhs + rhs;
        } else {
            System.out.println("SUB: " + lhs + " - " + rhs);
            return lhs - rhs;
        }
    }

    @Override public Integer visitParens(LabeledExprParser.ParensContext ctx) { 
        int value = visit(ctx.expr());
        System.out.println("PARENS: " + ctx.getText() + " = " + value);
        return value;
    }

	@Override public Integer visitPrintExpr(LabeledExprParser.PrintExprContext ctx) { 
        Integer lineValue = visit(ctx.expr());
        if (lineValue != null) {
            System.out.println("PRINT (line " + ctx.getStart().getLine() + ") " + ctx.expr().getText() + " = " + lineValue);
        }
        return lineValue;
    }
}

public class Calc {
    public static void main(String[] args) throws Exception {
        System.out.println("Calc v1.0");
        System.out.println("Using ANTLR v" + org.antlr.v4.runtime.CharStreams.class.getPackage().getImplementationVersion());
        System.out.println("Parsing " + new java.io.File(".").getAbsolutePath());

        String filename = "../../test.expr";
        if (args.length > 0) {
            filename = args[0];
        }

        CalcVisitor visitor = new CalcVisitor();
        LabeledExprLexer lexer = new LabeledExprLexer(CharStreams.fromFileName(filename));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LabeledExprParser parser = new LabeledExprParser(tokens);
        ParseTree tree = parser.prog(); // parse; start at prog
        System.out.println(tree.toStringTree(parser)); // print tree as text
        visitor.visit(tree);
    }    
}
