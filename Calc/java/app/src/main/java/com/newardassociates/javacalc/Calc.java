package com.newardassociates.javacalc;

import com.newardassociates.javacalc.parser.*;

import java.util.HashMap;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

class CalcVisitor extends LabeledExprBaseVisitor<Integer> {

    // {{## BEGIN literal ##}}
	@Override public Integer visitInt(LabeledExprParser.IntContext ctx) {
        int value = Integer.valueOf(ctx.INT().getText());
        System.out.println("INT: " + value);
        return value;
    }
    // {{## END literal ##}}

    // {{## BEGIN muldiv ##}}
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
    // {{## END muldiv ##}}
    // {{## BEGIN addsub ##}}
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
    // {{## END addsub ##}}

    // {{## BEGIN parens ##}}
    @Override public Integer visitParens(LabeledExprParser.ParensContext ctx) { 
        int value = visit(ctx.expr());
        System.out.println("PARENS: " + ctx.getText() + " = " + value);
        return value;
    }
    // {{## END parens ##}}

    // {{## BEGIN print ##}}
	@Override public Integer visitPrintExpr(LabeledExprParser.PrintExprContext ctx) { 
        Integer lineValue = visit(ctx.expr());
        if (lineValue != null) {
            System.out.println("PRINT (line " + ctx.getStart().getLine() + ") " + ctx.expr().getText() + " = " + lineValue);
        }
        return lineValue;
    }
    // {{## END print ##}}

    // {{## BEGIN assignment ##}}
    private HashMap<String, Integer> memory = new HashMap<>(); // memory for variables
    @Override public Integer visitAssign(LabeledExprParser.AssignContext ctx) { 
        String id = ctx.ID().getText();
        int value = visit(ctx.expr());
        memory.put(id, value);
        System.out.println("ASSIGN: " + id + " = " + value);
        return value;
    }
    // {{## END assignment ##}}
    // {{## BEGIN identifier ##}}
	@Override public Integer visitId(LabeledExprParser.IdContext ctx) { 
        String id = ctx.ID().getText();
        Integer value = memory.get(id);
        System.out.println("ID: " + id + " = " + value);
        return value;
    }
    // {{## END identifier ##}
}

public class Calc {
    // {{## BEGIN main ##}}
    public static void main(String[] args) throws Exception {
        System.out.println("Calc v1.0");
        System.out.println("Using ANTLR v" + org.antlr.v4.runtime.CharStreams.class.getPackage().getImplementationVersion());

        String filename = "../../test.expr";
        if (args.length > 0) {
            filename = args[0];
        }
        System.out.println("Parsing " + new java.io.File(filename).getAbsolutePath());

        CalcVisitor visitor = new CalcVisitor();
        LabeledExprLexer lexer = new LabeledExprLexer(CharStreams.fromFileName(filename));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LabeledExprParser parser = new LabeledExprParser(tokens);
        ParseTree tree = parser.prog(); // parse; start at prog
        System.out.println(tree.toStringTree(parser)); // print tree as text
        visitor.visit(tree);
    }    
    // {{## END main ##}}
}
