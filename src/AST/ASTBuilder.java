package AST;

import AST.expr.*;
import AST.expr.constExpr.*;
import AST.stat.*;
import Util.ParameterSingle;
import Util.Position;
import grammar.MxBaseVisitor;
import grammar.MxParser;
import Errors.*;


public class ASTBuilder extends MxBaseVisitor<ASTNode>{
    @Override public ASTNode visitProgram(MxParser.ProgramContext ctx){
        int cntMain = 0;
        programNode program = new programNode(new Position(ctx));
        for (var d : ctx.def()) {
            if (d.classDef() != null) {
                classDefNode ret = (classDefNode) visitClassDef(d.classDef());
                program.defNodes.add(ret);
                program.classDefNodes.add(ret);
            }
            else if (d.funcDef() != null) {
                if (d.funcDef().ID().getText().equals("main")) {
                    cntMain++;
                    if (cntMain > 1) throw new semanticError("multiple main()", new Position(d));
                }
                funcDefNode ret = (funcDefNode) visitFuncDef(d.funcDef());
                program.defNodes.add(ret);
                program.funcDefNodes.add(ret);
            }
            else program.defNodes.add(visitVarDef(d.varDef()));
        }
        if (cntMain == 0) throw new semanticError("no main()", new Position(ctx));
        return program;
    }
    @Override public ASTNode visitVarDef(MxParser.VarDefContext ctx){
        varDefNode varDef = new varDefNode(new Position(ctx));
        varDef.typename = (typenameNode) visitTypename(ctx.typename());
        ctx.varSingle().forEach(d -> varDef.varSingleNodes.add((varSingleNode) visitVarSingle(d)));
        return varDef;
    }
    @Override public ASTNode visitForVarDef(MxParser.ForVarDefContext ctx){
        forVarDefNode forVarDef = new forVarDefNode(new Position(ctx));
        forVarDef.typename = (typenameNode) visitTypename(ctx.typename());
        ctx.varSingle().forEach(d -> forVarDef.varSingleNodes.add((varSingleNode) visitVarSingle(d)));
        return forVarDef;
    }
    @Override public ASTNode visitVarSingle(MxParser.VarSingleContext ctx){
        varSingleNode varSingle = new varSingleNode(ctx.ID().getText(), new Position(ctx));
        if (ctx.expr() != null) varSingle.expr = (exprNode) visit(ctx.expr());
        return varSingle;
    }
    @Override public ASTNode visitClassDef(MxParser.ClassDefContext ctx){
        classDefNode classDef = new classDefNode(ctx.ID().getText(), new Position(ctx));
        ctx.funcDef().forEach(d -> classDef.funcDef.add((funcDefNode) visitFuncDef(d)));
        ctx.varDef().forEach(d -> classDef.varDef.add((varDefNode) visitVarDef(d)));
        if(ctx.conFuncDef().size() > 1){
            throw new semanticError("multiple class constructor", new Position(ctx));
        }
        ctx.conFuncDef().forEach(d -> classDef.conFuncDef = (conFuncDefNode) visitConFuncDef(d));
        return classDef;
    }
    @Override public ASTNode visitFuncDef(MxParser.FuncDefContext ctx){
        funcDefNode funcDef = new funcDefNode(ctx.ID().getText(), new Position(ctx));
        funcDef.typename = (typenameNode) visitTypename(ctx.typename());
        if (ctx.parameter() != null) {
            int siz = ctx.parameter().typename().size();
            for (int i = 0; i < siz; i++){
                funcDef.paras.add(new ParameterSingle(ctx.parameter().ID(i).getText(), new Position(ctx.parameter().typename(i)),
                        (typenameNode) visitTypename(ctx.parameter().typename(i))));
            }
        }
        funcDef.suite = (suiteNode) visitSuite(ctx.suite());
        return funcDef;
    }
    @Override public ASTNode visitConFuncDef(MxParser.ConFuncDefContext ctx){
        conFuncDefNode conFuncDef = new conFuncDefNode(ctx.ID().getText(), new Position(ctx));
        conFuncDef.suite = (suiteNode) visitSuite(ctx.suite());
        return conFuncDef;
    }

    @Override
    public ASTNode visitSuite(MxParser.SuiteContext ctx) {
        suiteNode suite = new suiteNode(new Position(ctx));
        ctx.stat().forEach(d -> suite.statNodes.add((statNode) visit(d)));
        return suite;
    }

    @Override public ASTNode visitDef_statement(MxParser.Def_statementContext ctx){
        defStatNode defStat = new defStatNode(new Position(ctx));
        defStat.varDef = (varDefNode) visitVarDef(ctx.varDef());
        return defStat;
    }
    @Override public ASTNode visitSuite_statement(MxParser.Suite_statementContext ctx){
        suiteStatNode suiteStat = new suiteStatNode(new Position(ctx));
        suiteStat.suite = (suiteNode) visitSuite(ctx.suite());
        return suiteStat;
    }
    @Override public ASTNode visitIf_statement(MxParser.If_statementContext ctx){
        ifStatNode ifStat = new ifStatNode(new Position(ctx));
        ifStat.condExpr = (exprNode) visit(ctx.expr());
        ifStat.ifStat = (statNode) visit(ctx.ifstat);
        if(ctx.elsestat != null) ifStat.elseStat = (statNode) visit(ctx.elsestat);
        return ifStat;
    }
    @Override public ASTNode visitBreak_statement(MxParser.Break_statementContext ctx){
        return new breakStatNode(new Position(ctx));
    }
    @Override public ASTNode visitContinue_statement(MxParser.Continue_statementContext ctx){
        return new continueStatNode(new Position(ctx));
    }
    @Override public ASTNode visitReturn_statement(MxParser.Return_statementContext ctx){
        returnStatNode returnStat = new returnStatNode(new Position(ctx));
        if(ctx.expr() != null) returnStat.expr = (exprNode) visit(ctx.expr());
        return returnStat;
    }
    @Override public ASTNode visitWhile_statement(MxParser.While_statementContext ctx){
        whileStatNode whileStat = new whileStatNode(new Position(ctx));
        whileStat.cond = (exprNode) visit(ctx.expr());
        whileStat.stat = (statNode) visit(ctx.stat());
        return whileStat;
    }
    @Override public ASTNode visitForExp_statement(MxParser.ForExp_statementContext ctx){
        forExpStatNode forExpStat = new forExpStatNode(new Position(ctx));
        if(ctx.init != null) forExpStat.init = (exprNode) visit(ctx.init);
        if(ctx.cond != null) forExpStat.cond = (exprNode) visit(ctx.cond);
        if(ctx.step != null) forExpStat.step = (exprNode) visit(ctx.step);
        forExpStat.stat = (statNode) visit(ctx.stat());
        return forExpStat;
    }
    @Override public ASTNode visitForDef_statement(MxParser.ForDef_statementContext ctx){
        forDefStatNode forDefStat = new forDefStatNode(new Position(ctx));
        if(ctx.init != null) forDefStat.init = (forVarDefNode) visitForVarDef(ctx.init);
        if(ctx.cond != null) forDefStat.cond = (exprNode) visit(ctx.cond);
        if(ctx.step != null) forDefStat.step = (exprNode) visit(ctx.step);
        forDefStat.stat = (statNode) visit(ctx.stat());
        return forDefStat;
    }
    @Override public ASTNode visitExpression_statement(MxParser.Expression_statementContext ctx){
        exprStatNode exprStat = new exprStatNode(new Position(ctx));
        exprStat.expr = (exprNode) visit(ctx.expr());
        return exprStat;
    }
    @Override public ASTNode visitEmpty_statement(MxParser.Empty_statementContext ctx){
        return new emptyStatNode(new Position(ctx));
    }
    @Override public ASTNode visitConstvalue(MxParser.ConstvalueContext ctx){
        return visitConst(ctx.const_());
    }
    @Override public ASTNode visitVariable(MxParser.VariableContext ctx){
        return new varExprNode(ctx.ID().getText(), new Position(ctx));
    }
    @Override public ASTNode visitNew_expression(MxParser.New_expressionContext ctx){
        newExprExprNode newExpr = new newExprExprNode(new Position(ctx));
        newExpr.newExpr = (newExprNode) visitNewExpr(ctx.newExpr());
        return newExpr;
    }
    @Override public ASTNode visitParent_expression(MxParser.Parent_expressionContext ctx){
        parentExprNode parentExpr = new parentExprNode(new Position(ctx));
        parentExpr.expr = (exprNode) visit(ctx.expr());
        return parentExpr;
    }
    @Override public ASTNode visitFunctionCall(MxParser.FunctionCallContext ctx){
        funcCallExprNode funcCallExpr = new funcCallExprNode(ctx.ID().getText(), new Position(ctx));
        if (ctx.argu() != null) ctx.argu().expr().forEach(d -> funcCallExpr.arguExprNodes.add((exprNode) visit(d)));
        return funcCallExpr;
    }
    @Override public ASTNode visitArrayIndex(MxParser.ArrayIndexContext ctx){
        arrayIndexExprNode arrayIndexExpr = new arrayIndexExprNode(new Position(ctx));
        arrayIndexExpr.start = (exprNode) visit(ctx.expr(0));
        arrayIndexExpr.index = (exprNode) visit(ctx.expr(1));
        return arrayIndexExpr;
    }
    @Override public ASTNode visitMemberExpr(MxParser.MemberExprContext ctx){
        memberExprExprNode memberExprExpr = new memberExprExprNode(ctx.ID().getText(), new Position(ctx));
        memberExprExpr.expr = (exprNode) visit(ctx.expr());
        return memberExprExpr;
    }
    @Override public ASTNode visitMemberFunc(MxParser.MemberFuncContext ctx){
        memberFuncExprNode memberFuncExpr = new memberFuncExprNode(ctx.ID().getText(), new Position(ctx));
        memberFuncExpr.expr = (exprNode) visit(ctx.expr());
        if (ctx.argu() != null) ctx.argu().expr().forEach(d -> memberFuncExpr.arguExprNodes.add((exprNode) visit(d)));
        return memberFuncExpr;
    }
    @Override public ASTNode visitLeft_inc_dec(MxParser.Left_inc_decContext ctx){
        String s = ctx.getText();
        selfOperator op = selfOperator.INC;
        switch (s)
        {
            case "++" -> op = selfOperator.INC;
            case "--" -> op = selfOperator.DEC;
        }
        leftExprNode leftExpr = new leftExprNode(op, new Position(ctx));
        leftExpr.expr = (exprNode) visit(ctx.expr());
        return leftExpr;
    }
    @Override public ASTNode visitRight_inc_dec(MxParser.Right_inc_decContext ctx){
        String s = ctx.op.getText();
        selfOperator op;
        switch (s)
        {
            case "++" -> op = selfOperator.INC;
            case "--" -> op = selfOperator.DEC;
            default -> throw new syntaxError("wrong g4", new Position(ctx));
        }
        rightExprNode rightExpr = new rightExprNode(op, new Position(ctx));
        rightExpr.expr = (exprNode) visit(ctx.expr());
        return rightExpr;
    }
    @Override public ASTNode visitUnary(MxParser.UnaryContext ctx){
        String s = ctx.op.getText();
        unaryOperator op;
        switch (s)
        {
            case "-" -> op = unaryOperator.NEG;
            case "!" -> op = unaryOperator.LNOT;
            case "~" -> op = unaryOperator.BNOT;
            default -> throw new syntaxError("wrong g4", new Position(ctx));
        }
        unaryExprNode unaryExpr = new unaryExprNode(op, new Position(ctx));
        unaryExpr.expr = (exprNode) visit(ctx.expr());
        return unaryExpr;
    }
    @Override public ASTNode visitBinary(MxParser.BinaryContext ctx){
        String s = ctx.op.getText();
        binaryOperator op;
        switch (s)
        {
            case "+" -> op = binaryOperator.ADD;
            case "-" -> op = binaryOperator.DEC;
            case "*" -> op = binaryOperator.MUL;
            case "/" -> op = binaryOperator.DIV;
            case "%" -> op = binaryOperator.MOD;
            case "<<" -> op = binaryOperator.LSFT;
            case ">>" -> op = binaryOperator.RSFT;
            case "<" -> op = binaryOperator.LE;
            case "<=" -> op = binaryOperator.LEQ;
            case ">" -> op = binaryOperator.GE;
            case ">=" -> op = binaryOperator.GEQ;
            case "==" -> op = binaryOperator.EQ;
            case "!=" -> op = binaryOperator.NEQ;
            case "&" -> op = binaryOperator.AND;
            case "^" -> op = binaryOperator.XOR;
            case "|" -> op = binaryOperator.OR;
            case "&&" -> op = binaryOperator.LAND;
            case "||" -> op = binaryOperator.LOR;
            default -> throw new syntaxError("wrong g4, s = " + s, new Position(ctx));
        }
        binaryExprNode binaryExpr = new binaryExprNode(op, new Position(ctx));
        binaryExpr.left = (exprNode) visit(ctx.expr(0));
        binaryExpr.right = (exprNode) visit(ctx.expr(1));
        return binaryExpr;
    }
    @Override public ASTNode visitConditional(MxParser.ConditionalContext ctx){
        condExprNode condExpr = new condExprNode(new Position(ctx));
        condExpr.condExpr = (exprNode) visit(ctx.expr(0));
        condExpr.ifExpr = (exprNode) visit(ctx.expr(1));
        condExpr.elseExpr = (exprNode) visit(ctx.expr(2));
        return condExpr;
    }
    @Override public ASTNode visitAssign(MxParser.AssignContext ctx){
        assignExprNode assignExpr = new assignExprNode(new Position(ctx));
        assignExpr.left = (exprNode) visit(ctx.expr(0));
        assignExpr.right = (exprNode) visit(ctx.expr(1));
        return assignExpr;
    }
    @Override public ASTNode visitConst(MxParser.ConstContext ctx){
        if (ctx.Num() != null) return new intNode(Long.parseLong(ctx.Num().getText()), new Position(ctx));
        if (ctx.True() != null) return new boolNode(true, new Position(ctx));
        if (ctx.False() != null) return new boolNode(false, new Position(ctx));
        if (ctx.Str() != null){
            int len = ctx.Str().getText().length();
            if (len == 1) return new stringNode("", new Position(ctx));
            else return new stringNode(ctx.Str().getText().substring(1, len - 1), new Position(ctx));
        }
        if (ctx.Null() != null) return new nullNode(new Position(ctx));
        return new thisNode(new Position(ctx));
    }
    @Override public ASTNode visitTypename(MxParser.TypenameContext ctx){
        int d = ctx.bracket().size();
        if (d > 0) {
            if (ctx.Int() != null) return new typenameArrayNode("int", d);
            if (ctx.Bool() != null) return new typenameArrayNode("bool", d);
            if (ctx.Void() != null) throw new semanticError("void array", new Position(ctx));
            if (ctx.String() != null) return new typenameArrayNode("string", d);
            return new typenameArrayNode(ctx.ID().getText(), d);
        }
        else {
            if (ctx.Int() != null) return new typenameNode("int");
            if (ctx.Bool() != null) return new typenameNode("bool");
            if (ctx.Void() != null) return new typenameNode("void");
            if (ctx.String() != null) return new typenameNode("string");
            return new typenameNode(ctx.ID().getText());
        }
    }
    @Override public ASTNode visitArgu(MxParser.ArguContext ctx){
        arguNode argu = new arguNode(new Position(ctx));
        ctx.expr().forEach(d -> argu.exprNodes.add((exprNode) visit(d)));
        return argu;
    }
    @Override public ASTNode visitParameter(MxParser.ParameterContext ctx){
        parameterNode parameter = new parameterNode(new Position(ctx));
        int siz = ctx.typename().size();
        for (int i = 0; i < siz; i++){
            parameter.paras.add(new ParameterSingle(ctx.ID(i).getText(), new Position(ctx.typename(i)),
                    (typenameNode) visitTypename(ctx.typename(i))));
        }
        return parameter;
    }
    @Override public ASTNode visitNewExpr(MxParser.NewExprContext ctx){
        newExprNode newExpr = new newExprNode(new Position(ctx));
        newExpr.newTypename = (newClassArrayNode) visit(ctx.newTypename());
        return newExpr;
    }
    @Override public ASTNode visitNewClass(MxParser.NewClassContext ctx){
        return new newClassArrayNode(ctx.ID().getText(), 0, new Position(ctx));
    }
    @Override public ASTNode visitNewClassArray(MxParser.NewClassArrayContext ctx){
        newClassArrayNode newClassArray = new newClassArrayNode(ctx.ID().getText(), ctx.newBracket().size(), new Position(ctx));
        boolean exprEnd = false;
        for (int i = 0; i < ctx.newBracket().size(); i++) {
            if (ctx.newBracket(i).expr() == null) exprEnd = true;
            else {
                if (exprEnd) throw new semanticError("new expression with wrong format", new Position(ctx));
                newClassArray.exprNodes.add((exprNode) visit(ctx.newBracket(i).expr()));
            }
        }
        return newClassArray;
    }
    @Override public ASTNode visitNewBuiltinArray(MxParser.NewBuiltinArrayContext ctx){
        newClassArrayNode newClassArray = new newClassArrayNode(ctx.builtinType().getText(), ctx.newBracket().size(), new Position(ctx));
        boolean exprEnd = false;
        for (int i = 0; i < ctx.newBracket().size(); i++) {
            if (ctx.newBracket(i).expr() == null) exprEnd = true;
            else {
                if (exprEnd) throw new semanticError("new expression with wrong format", new Position(ctx));
                newClassArray.exprNodes.add((exprNode) visit(ctx.newBracket(i).expr()));
            }
        }
        return newClassArray;
    }
}
