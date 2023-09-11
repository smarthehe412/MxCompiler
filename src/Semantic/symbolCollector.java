package Semantic;

import AST.*;
import AST.expr.*;
import AST.expr.constExpr.constExprNode;
import AST.stat.*;
import Errors.semanticError;
import Util.type.ClassType;
import Util.type.FuncType;
import Util.type.Type;


public class symbolCollector implements ASTVisitor {
    private GlobalScope gS;
    public symbolCollector(GlobalScope tgs) {
        gS = tgs;
    }

    @Override
    public void visit(programNode it) {
        it.classDefNodes.forEach(d -> d.accept(this));
        it.funcDefNodes.forEach(d -> d.accept(this));
        it.classDefNodes.forEach(this::visitClass);
    }

    public void visitClass(classDefNode it) {
        it.funcDef.forEach(f -> visitClassFunc(it, f));
        it.varDef.forEach(v -> visitClassVar(it, v));
        FuncType con = new FuncType(it.name, gS.getClassByName(it.name, it.pos));
        gS.defineFunc(it.name, con, it.pos);
    }

    public void visitClassFunc(classDefNode it, funcDefNode f) {
        if (f.name.equals(it.name)) {
            throw new semanticError("invalid constructor function of class: " + it.name, f.pos);
        }
        String gName = it.name + "::" + f.name;
        FuncType tp = new FuncType(f.name, gS.getType(f.typename, f.pos));
        tp.retType = gS.getType(f.typename, f.pos);
        f.paras.forEach(aug -> tp.paraType.add(gS.getType(aug.type, aug.pos)));
        gS.defineFunc(gName, tp, f.pos);
    }

    public void visitClassVar(classDefNode it, varDefNode v) {
        Type vType = gS.getType(v.typename, v.pos);
        v.varSingleNodes.forEach(va -> {
            gS.defineThing(it.name + "::" + va.name, vType, va.pos);
        });
    }

    @Override
    public void visit(classDefNode it) {
        if (it.name.equals("main")) {
            throw new semanticError("class name cannot be main", it.pos);
        }
        gS.defineType(it.name, new ClassType(it.name), it.pos);
    }

    @Override public void visit(funcDefNode it) {
        if(gS.hasType(it.name)) {
            throw new semanticError("function name and typename coincide", it.pos);
        }
        FuncType tp = new FuncType(it.name, gS.getType(it.typename, it.pos));
        tp.retType = gS.getType(it.typename, it.pos);
        it.paras.forEach(aug -> tp.paraType.add(gS.getType(aug.type, aug.pos)));
        gS.defineFunc(it.name, tp, it.pos);
    }

    @Override public void visit(arguNode it) {}
    @Override public void visit(conFuncDefNode it) {}
    @Override public void visit(forVarDefNode it) {}
    @Override public void visit(mainNode it) {}
    @Override public void visit(newExprNode it) {}
    @Override public void visit(newClassArrayNode it) {}
    @Override public void visit(parameterNode it) {}
    @Override public void visit(suiteNode it) {}
    @Override public void visit(varDefNode it) {}
    @Override public void visit(varSingleNode it) {}
    @Override public void visit(defStatNode it) {}
    @Override public void visit(suiteStatNode it) {}
    @Override public void visit(ifStatNode it) {}
    @Override public void visit(breakStatNode it) {}
    @Override public void visit(continueStatNode it) {}
    @Override public void visit(returnStatNode it) {}
    @Override public void visit(whileStatNode it) {}
    @Override public void visit(exprStatNode it) {}
    @Override public void visit(emptyStatNode it) {}
    @Override public void visit(constExprNode it) {}
    @Override public void visit(varExprNode it) {}
    @Override public void visit(newExprExprNode it) {}
    @Override public void visit(parentExprNode it) {}
    @Override public void visit(funcCallExprNode it) {}
    @Override public void visit(arrayIndexExprNode it) {}
    @Override public void visit(memberExprExprNode it) {}
    @Override public void visit(memberFuncExprNode it) {}
    @Override public void visit(leftExprNode it) {}
    @Override public void visit(rightExprNode it) {}
    @Override public void visit(unaryExprNode it) {}
    @Override public void visit(binaryExprNode it) {}
    @Override public void visit(condExprNode it) {}
    @Override public void visit(assignExprNode it) {}
    @Override public void visit(typenameNode it) {}
    @Override public void visit(forExpStatNode it) {}
    @Override public void visit(forDefStatNode it) {}
    @Override public void visit(newClassNode it) {}
}
