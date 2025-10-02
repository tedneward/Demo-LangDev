package com.newardassociates.tinylang

public class VerboseListener : TLBaseListener() {
    override fun enterParse(ctx: TLParser.ParseContext) { println("Entering Parse") }
    override fun exitParse(ctx: TLParser.ParseContext) { println("Exiting Parse") }

    override fun enterBlock(ctx: TLParser.BlockContext) { println("Entering Block") }
    override fun exitBlock(ctx: TLParser.BlockContext) { println("Exiting Block") }

    override fun enterStatement(ctx: TLParser.StatementContext) { println("Entering Statement") }
    override fun exitStatement(ctx: TLParser.StatementContext) { println("Exiting Statement") }

    override fun enterAssignment(ctx: TLParser.AssignmentContext) { println("Entering Assignment") }
    override fun exitAssignment(ctx: TLParser.AssignmentContext) { println("Exiting Assignment") }

    override fun enterIdentifierFunctionCall(ctx: TLParser.IdentifierFunctionCallContext) { println("Entering Identifier FnCall") }
    override fun exitIdentifierFunctionCall(ctx: TLParser.IdentifierFunctionCallContext) { println("Exiting Identifier FnCall") }

    override fun enterPrintlnFunctionCall(ctx: TLParser.PrintlnFunctionCallContext) { println("Entering Println FnCall") }
    override fun exitPrintlnFunctionCall(ctx: TLParser.PrintlnFunctionCallContext) { println("Exiting Println FnCall") }

    override fun enterPrintFunctionCall(ctx: TLParser.PrintFunctionCallContext) { println("Entering Print FnCall") }
    override fun exitPrintFunctionCall(ctx: TLParser.PrintFunctionCallContext) { println("Exiting Print FnCall") }

    override fun enterAssertFunctionCall(ctx: TLParser.AssertFunctionCallContext) { println("Entering Assert FnCall") }
    override fun exitAssertFunctionCall(ctx: TLParser.AssertFunctionCallContext) { println("Exiting Assert FnCall") }

    override fun enterSizeFunctionCall(ctx: TLParser.SizeFunctionCallContext) { println("Entering Size FnCall") }
    override fun exitSizeFunctionCall(ctx: TLParser.SizeFunctionCallContext) { println("Exiting Size FnCall") }

    override fun enterIfStatement(ctx: TLParser.IfStatementContext) { println("Entering If") }
    override fun exitIfStatement(ctx: TLParser.IfStatementContext) { println("Exiting If") }

    override fun enterIfStat(ctx: TLParser.IfStatContext) { println("Entering IfStat") }
    override fun exitIfStat(ctx: TLParser.IfStatContext) { println("Exiting IfStat") }

    override fun enterElseIfStat(ctx: TLParser.ElseIfStatContext) { println("Entering ElseIfStat") }
    override fun exitElseIfStat(ctx: TLParser.ElseIfStatContext) { println("Exiting ElseIfStat") }

    override fun enterElseStat(ctx: TLParser.ElseStatContext) { println("Entering ElseStat") }
    override fun exitElseStat(ctx: TLParser.ElseStatContext) { println("Exiting ElseStat") }

    override fun enterFunctionDecl(ctx: TLParser.FunctionDeclContext) { println("Entering FnDecl") }
    override fun exitFunctionDecl(ctx: TLParser.FunctionDeclContext) { println("Exiting FnDecl") }

    override fun enterForStatement(ctx: TLParser.ForStatementContext) { println("Entering For") }
    override fun exitForStatement(ctx: TLParser.ForStatementContext) { println("Exiting For") }

    override fun enterWhileStatement(ctx: TLParser.WhileStatementContext) { println("Entering While") }
    override fun exitWhileStatement(ctx: TLParser.WhileStatementContext) { println("Exiting While") }

    override fun enterIdList(ctx: TLParser.IdListContext) { println("Entering IdList") }
    override fun exitIdList(ctx: TLParser.IdListContext) { println("Exiting IdList") }

    override fun enterExprList(ctx: TLParser.ExprListContext) { println("Entering ExprList") }
    override fun exitExprList(ctx: TLParser.ExprListContext) { println("Exiting ExprList") }

    override fun enterBoolExpression(ctx: TLParser.BoolExpressionContext) { println("Entering BoolExpr") }
    override fun exitBoolExpression(ctx: TLParser.BoolExpressionContext) { println("Exiting BoolExpr") }

    override fun enterNumberExpression(ctx: TLParser.NumberExpressionContext) { println("Entering NumberExpr") }
    override fun exitNumberExpression(ctx: TLParser.NumberExpressionContext) { println("Exiting NumberExpr") }

    override fun enterIdentifierExpression(ctx: TLParser.IdentifierExpressionContext) { println("Entering Identifier") }
    override fun exitIdentifierExpression(ctx: TLParser.IdentifierExpressionContext) { println("Exiting Identifier") }

    override fun enterNotExpression(ctx: TLParser.NotExpressionContext) { println("Entering Not") }
    override fun exitNotExpression(ctx: TLParser.NotExpressionContext) { println("Exiting Not") }

    override fun enterOrExpression(ctx: TLParser.OrExpressionContext) { println("Entering Or") }
    override fun exitOrExpression(ctx: TLParser.OrExpressionContext) { println("Exiting Or") }

    override fun enterUnaryMinusExpression(ctx: TLParser.UnaryMinusExpressionContext) { println("Entering UnaryMinus") }
    override fun exitUnaryMinusExpression(ctx: TLParser.UnaryMinusExpressionContext) { println("Exiting UnaryMinus") }

    override fun enterPowerExpression(ctx: TLParser.PowerExpressionContext) { println("Entering Power") }
    override fun exitPowerExpression(ctx: TLParser.PowerExpressionContext) { println("Exiting Power") }

    override fun enterEqExpression(ctx: TLParser.EqExpressionContext) { println("Entering EqExpr") }
    override fun exitEqExpression(ctx: TLParser.EqExpressionContext) { println("Exiting EqExpr") }

    override fun enterAndExpression(ctx: TLParser.AndExpressionContext) { println("Entering And") }
    override fun exitAndExpression(ctx: TLParser.AndExpressionContext) { println("Exiting And") }

    override fun enterInExpression(ctx: TLParser.InExpressionContext) { println("Entering In") }
    override fun exitInExpression(ctx: TLParser.InExpressionContext) { println("Exiting In") }

    override fun enterStringExpression(ctx: TLParser.StringExpressionContext) { println("Entering StringExpr") }
    override fun exitStringExpression(ctx: TLParser.StringExpressionContext) { println("Exiting StringExpr") }

    override fun enterExpressionExpression(ctx: TLParser.ExpressionExpressionContext) { println("Entering ExprExpr") }
    override fun exitExpressionExpression(ctx: TLParser.ExpressionExpressionContext) { println("Exiting ExprExpr") }

    override fun enterAddExpression(ctx: TLParser.AddExpressionContext) { println("Entering Add") }
    override fun exitAddExpression(ctx: TLParser.AddExpressionContext) { println("Exiting Add") }

    override fun enterCompExpression(ctx: TLParser.CompExpressionContext) { println("Entering Comp") }
    override fun exitCompExpression(ctx: TLParser.CompExpressionContext) { println("Exiting Comp") }

    override fun enterNullExpression(ctx: TLParser.NullExpressionContext) { println("Entering Null") }
    override fun exitNullExpression(ctx: TLParser.NullExpressionContext) { println("Exiting Null") }

    override fun enterFunctionCallExpression(ctx: TLParser.FunctionCallExpressionContext) { println("Entering FnCall") }
    override fun exitFunctionCallExpression(ctx: TLParser.FunctionCallExpressionContext) { println("Exiting FnCall") }

    override fun enterMultExpression(ctx: TLParser.MultExpressionContext) { println("Entering Mult") }
    override fun exitMultExpression(ctx: TLParser.MultExpressionContext) { println("Exiting Mult") }

    override fun enterListExpression(ctx: TLParser.ListExpressionContext) { println("Entering ListExpr") }
    override fun exitListExpression(ctx: TLParser.ListExpressionContext) { println("Exiting ListExpr") }

    override fun enterTernaryExpression(ctx: TLParser.TernaryExpressionContext) { println("Entering Ternary") }
    override fun exitTernaryExpression(ctx: TLParser.TernaryExpressionContext) { println("Exiting Ternary") }

    override fun enterInputExpression(ctx: TLParser.InputExpressionContext) { println("Entering Input") }
    override fun exitInputExpression(ctx: TLParser.InputExpressionContext) { println("Exiting Input") }

    override fun enterList(ctx: TLParser.ListContext) { println("Entering List") }
    override fun exitList(ctx: TLParser.ListContext) { println("Exiting List") }

    override fun enterIndexes(ctx: TLParser.IndexesContext) { println("Entering Indexes") }
    override fun exitIndexes(ctx: TLParser.IndexesContext) { println("Exiting Indexes") }
}
