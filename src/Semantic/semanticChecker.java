package Semantic;

import AST.*;
import AST.expr.constExpr.constExprNode;
import AST.expr.*;
import AST.stat.*;
import Errors.semanticError;
import Util.Position;
import Util.type.*;

public class semanticChecker implements ASTVisitor {
    private GlobalScope gS;
    private Scope tmpScope;
    private Type tmpType;
    public semanticChecker(GlobalScope tgs) {
        gS = tgs;
        tmpScope = gS;
    }

    @Override
    public void visit(programNode it) {
        it.defNodes.forEach(d -> d.accept(this));
    }

    @Override
    public void visit(classDefNode it) {
        tmpScope = new Scope(tmpScope);
        tmpScope.inClass = true;
        tmpScope.classType = gS.getClassByName(it.name, it.pos);
        it.varDef.forEach(d -> d.accept(this));
        it.funcDef.forEach(d -> d.accept(this));
        if(it.conFuncDef != null) it.conFuncDef.accept(this);
        tmpScope = tmpScope.parent;
    }

    @Override
    public void visit(varDefNode it) {
        tmpType = gS.getType(it.typename, it.pos);
        //System.err.println(it.typename);
        if (tmpType.isVoid()) throw new semanticError("define void variable", it.pos);
        it.varSingleNodes.forEach(d -> d.accept(this));
    }

    @Override
    public void visit(varSingleNode it) {
        if (it.expr != null) {
            it.expr.accept(this);
            if (it.expr.type.isNull()) {
                if (!tmpType.isClass() && !tmpType.isArray()) {
                    throw new semanticError("assign null to primary type", it.pos);
                }
            }
            else {
                if (!tmpType.equal(it.expr.type)) {
                    throw new semanticError("no match between definition and assignment", it.pos);
                }
            }
        }
        tmpScope.defineThing(it.name, tmpType, it.pos);
    }

    @Override
    public void visit(funcDefNode it) {
        if (it.name.equals("main")) {
            if (!it.paras.isEmpty()) throw new semanticError("main() can't has parameter", it.pos);
            if (!gS.getType(it.typename, it.typename.pos).isInt()) throw new semanticError("main() must be 'int'", it.pos);
        }
        tmpScope = new Scope(tmpScope);
        tmpScope.inFunc = true;
        tmpScope.funcType = gS.getType(it.typename, it.pos);
        it.paras.forEach(pa -> tmpScope.defineThing(pa.name, gS.getType(pa.type, pa.pos), pa.pos));
        if (it.suite != null) it.suite.accept(this);
        tmpScope = tmpScope.parent;
    }

    @Override
    public void visit(conFuncDefNode it) {
        if (!it.name.equals(tmpScope.classType.getName())) throw new semanticError("wrong constructor function", it.pos);
        tmpScope = new Scope(tmpScope);
        tmpScope.inFunc = true;
        tmpScope.funcType = new VoidType();
        it.suite.accept(this);
        tmpScope = tmpScope.parent;
    }

    @Override
    public void visit(mainNode it) {
        tmpScope = new Scope(tmpScope);
        tmpScope.inFunc = true;
        tmpScope.funcType = new IntType();
        if (it.suite != null) it.suite.accept(this);
        tmpScope = tmpScope.parent;
    }

    @Override
    public void visit(suiteNode it) {
        it.statNodes.forEach(d -> d.accept(this));
    }

    //------ Stat ------

    @Override
    public void visit(defStatNode it) {
        it.varDef.accept(this);
    }

    @Override
    public void visit(suiteStatNode it) {
        tmpScope = new Scope(tmpScope);
        it.suite.accept(this);
        tmpScope = tmpScope.parent;
    }

    @Override
    public void visit(ifStatNode it) {
        it.condExpr.accept(this);
        if (!it.condExpr.type.isBool()) {
            throw new semanticError("if_statement condition is not bool", it.condExpr.pos);
        }

        tmpScope = new Scope(tmpScope);
        it.ifStat.accept(this);
        tmpScope = tmpScope.parent;
        if (it.elseStat != null) {
            tmpScope = new Scope(tmpScope);
            it.elseStat.accept(this);
            tmpScope = tmpScope.parent;
        }
    }

    @Override
    public void visit(breakStatNode it) {
        if (!tmpScope.inLoop) {
            throw new semanticError("break when not in-loop", it.pos);
        }
    }

    @Override
    public void visit(continueStatNode it) {
        if (!tmpScope.inLoop) {
            throw new semanticError("continue when not in-loop", it.pos);
        }
    }

    @Override
    public void visit(returnStatNode it) {
        if (!tmpScope.inFunc) {
            throw new semanticError("return when not in-function", it.pos);
        }
        if (it.expr == null) {
            if (!tmpScope.funcType.isVoid()) {
                throw new semanticError("no match between function type and return value: "
                        + tmpScope.funcType.getName() + " & void", it.pos);
            }
        }
        else {
            it.expr.accept(this);
            if (it.expr.type.isNull()) {
                if (!tmpScope.funcType.isClass() && tmpScope.funcType.isArray()) {
                    throw new semanticError("no match between function type and return value: "
                            + tmpScope.funcType.getName() + " & null", it.pos);
                }
            }
            else {
                if (!tmpScope.funcType.equal(it.expr.type)) {
                    throw new semanticError("no match between function type and return value: "
                            + tmpScope.funcType.getName() + " & " + it.expr.type.getName(), it.pos);
                }
            }
        }
    }

    @Override
    public void visit(whileStatNode it) {
        it.cond.accept(this);
        if (!it.cond.type.isBool()) {
            throw new semanticError("while_statement condition is not bool", it.cond.pos);
        }
        tmpScope = new Scope(tmpScope);
        tmpScope.inLoop = true;
        it.stat.accept(this);
        tmpScope = tmpScope.parent;
    }

    @Override
    public void visit(forExpStatNode it) {
        tmpScope = new Scope(tmpScope);
        tmpScope.inLoop = true;
        if (it.cond != null) it.cond.accept(this);
        if (it.cond != null && !it.cond.type.isBool()) {
            throw new semanticError("forExp_statement condition is not bool", it.cond.pos);
        }
        if (it.init != null) it.init.accept(this);
        if (it.step != null) it.step.accept(this);
        it.stat.accept(this);
        tmpScope = tmpScope.parent;
    }

    @Override
    public void visit(forDefStatNode it) {
        tmpScope = new Scope(tmpScope);
        tmpScope.inLoop = true;
        if (it.cond != null) it.cond.accept(this);
        if (it.cond != null && !it.cond.type.isBool()) {
            throw new semanticError("forDef_statement condition is not bool", it.cond.pos);
        }
        if (it.init != null) it.init.accept(this);
        if (it.step != null) it.step.accept(this);
        it.stat.accept(this);
        tmpScope = tmpScope.parent;
    }

    @Override
    public void visit(forVarDefNode it) {
        tmpType = gS.getType(it.typename, it.pos);
        if (tmpType.isVoid()) throw new semanticError("define void variable", it.pos);
        if (tmpType.isArray()) throw new semanticError("define array without 'new'", it.pos);
        it.varSingleNodes.forEach(d -> d.accept(this));
    }

    @Override
    public void visit(exprStatNode it) {
        it.expr.accept(this);
    }

    @Override
    public void visit(emptyStatNode it) {}

    // ------ expr ------

    @Override
    public void visit(constExprNode it) {
        if (it.type == null) {
            if (!tmpScope.inClass) throw new semanticError("use 'this' when not in-class", it.pos);
            it.type = tmpScope.classType;
        }
    }

    @Override
    public void visit(varExprNode it) {
        if (!tmpScope.hasThing(it.name)) {
            throw new semanticError("undefined variable: " + it.name, it.pos);
        }
        it.type = tmpScope.getType(it.name);
        it.canAssign = true;
    }

    @Override
    public void visit(newExprExprNode it) {
        it.newExpr.accept(this);
        if (it.newExpr.newTypename.d != 0) {
            it.type = new ArrayType(gS.getClassByName(it.newExpr.newTypename.type, it.newExpr.newTypename.pos),it.newExpr.newTypename.d);
        }
        else it.type = gS.getClassByName(it.newExpr.newTypename.type, it.newExpr.newTypename.pos);
    }

    @Override
    public void visit(parentExprNode it) {
        it.expr.accept(this);
        it.type = it.expr.type;
        it.canAssign = it.expr.canAssign;
    }

    @Override
    public void visit(funcCallExprNode it) {
        FuncType tmp;
        if (tmpScope.inClass && gS.hasFunc(tmpScope.classType.getName() + "::" + it.name)) {
            tmp = gS.getFunc(tmpScope.classType.getName() + "::" + it.name, it.pos);
        }
        else if (gS.hasFunc(it.name)) {
            tmp = gS.getFunc(it.name, it.pos);
        }
        else throw new semanticError("undefined function: " + it.name, it.pos);
        if (it.arguExprNodes.size() != tmp.paraType.size()) {
            throw new semanticError("parameter number not match", it.pos);
        }
        for (int i = 0; i < it.arguExprNodes.size(); i++) {
            it.arguExprNodes.get(i).accept(this);
            if (!tmp.paraType.get(i).equal(it.arguExprNodes.get(i).type)) {
                throw new semanticError("parameter type not match", it.arguExprNodes.get(i).pos);
            }
        }
        it.type = tmp.retType;
    }

    @Override
    public void visit(arrayIndexExprNode it) {
        it.start.accept(this);
        if (!it.start.type.isArray()) {
            throw new semanticError("use index of not array", it.pos);
        }
        it.index.accept(this);
        if (!it.index.type.isInt()) {
            throw new semanticError("index is not integer", it.pos);
        }
        ArrayType tmp = (ArrayType) it.start.type;
        if (tmp.d == 1)  it.type = tmp.type;
        else it.type = new ArrayType(tmp.type, tmp.d - 1);
        it.canAssign = true;
    }

    @Override
    public void visit(memberExprExprNode it) {
        it.expr.accept(this);
        if (!gS.hasThing(it.expr.type.getName() + "::" + it.name)) {
            throw new semanticError("type '" + it.expr.type.getName() +
                    "' doesn't have a member variable '" + it.name + "'", it.pos);
        }
        it.type = gS.getType(it.expr.type.getName() + "::" + it.name);
        it.canAssign = true;
    }

    @Override
    public void visit(memberFuncExprNode it) {
        it.expr.accept(this);
        FuncType tmp = gS.getFunc(it.expr.type.getName() + "::" + it.name, it.pos);
        if (it.arguExprNodes.size() != tmp.paraType.size()) {
            throw new semanticError("parameter number not match", it.pos);
        }
        for (int i = 0; i < it.arguExprNodes.size(); i++) {
            it.arguExprNodes.get(i).accept(this);
            if (!it.arguExprNodes.get(i).type.equal(tmp.paraType.get(i))) {
                throw new semanticError("parameter type not match", it.arguExprNodes.get(i).pos);
            }
        }
        it.type = tmp.retType;
    }

    @Override
    public void visit(leftExprNode it) {
        it.expr.accept(this);
        if (!it.expr.canAssign) {
            throw new semanticError("this expression cannot be assigned", it.pos);
        }
        if (!it.expr.type.isInt()) {
            throw new semanticError("type of the expression is not 'int'", it.pos);
        }
        it.type = it.expr.type;
        it.canAssign = false;
    }

    @Override
    public void visit(rightExprNode it) {
        it.expr.accept(this);
        if (!it.expr.canAssign) {
            throw new semanticError("this expression cannot be assigned", it.pos);
        }
        if (!it.expr.type.isInt()) {
            throw new semanticError("type of the expression is not 'int'", it.pos);
        }
        it.type = it.expr.type;
        it.canAssign = true;
    }

    @Override
    public void visit(unaryExprNode it) {
        it.expr.accept(this);
        if (it.expr.type.isInt()) {
            if (it.op == unaryOperator.LNOT) throw new semanticError("Logical operator on 'int'", it.pos);
        }
        else if (it.expr.type.isBool()) {
            if (it.op != unaryOperator.LNOT) throw new semanticError("Arithmetic operator on 'bool'", it.pos);
        }
        else throw new semanticError("invalid operator on this type", it.pos);
        it.type = it.expr.type;
    }

    @Override
    public void visit(binaryExprNode it) {
        it.left.accept(this);
        it.right.accept(this);
        if (it.left.type.isVoid() || it.right.type.isVoid()) throw new semanticError("use operator on 'void'", it.pos);
        if (it.op == binaryOperator.EQ || it.op == binaryOperator.NEQ) {
            if (it.left.type.isNull() || it.right.type.isNull()) {
                if (!(it.left.type.isNull() && it.right.type.isNull() || it.left.type.isArray() || it.right.type.isArray()
                || it.left.type.isClass() || it.right.type.isClass())) throw new semanticError("invalid compare with 'null'", it.pos);
            }
            else if (!it.left.type.equal(it.right.type)) throw new semanticError("type not matched", it.pos);
            it.type = new BoolType();
        }
        else if (it.op == binaryOperator.ADD || it.op == binaryOperator.LE || it.op == binaryOperator.LEQ ||
                it.op == binaryOperator.GE || it.op == binaryOperator.GEQ) {
            if (it.left.type.isInt()) {
                if (!it.right.type.isInt()) throw new semanticError("type not matched", it.pos);
            }
            else if (it.left.type.isString()) {
                if (!it.right.type.isString()) throw new semanticError("type not matched", it.pos);
            }
            else throw new semanticError("invalid operator on this type", it.pos);
            if (it.op == binaryOperator.ADD) it.type = it.left.type;
            else it.type = new BoolType();
        }
        else if (it.op == binaryOperator.LAND || it.op == binaryOperator.LOR) {
            if (it.left.type.isBool()) {
                if (!it.right.type.isBool()) throw new semanticError("type not matched", it.pos);
            }
            else throw new semanticError("invalid operator on this type", it.pos);
            it.type = it.left.type;
        }
        else {
            if (it.left.type.isInt()) {
                if (!it.right.type.isInt()) throw new semanticError("type not matched", it.pos);
            }
            else throw new semanticError("invalid operator on this type", it.pos);
            it.type = it.left.type;
        }
    }

    @Override
    public void visit(condExprNode it) {
        it.condExpr.accept(this);
        it.ifExpr.accept(this);
        it.elseExpr.accept(this);
        if (!it.condExpr.type.isBool()) throw new semanticError("condition is not 'bool'", it.pos);
        if (!it.ifExpr.type.equal(it.elseExpr.type) && !it.elseExpr.type.equal(it.ifExpr.type)) throw new semanticError("type not matched", it.pos);
        it.type = it.ifExpr.type;
    }

    @Override
    public void visit(assignExprNode it) {
        it.left.accept(this);
        it.right.accept(this);
        if (!it.left.canAssign) throw new semanticError("this expression cannot be assigned", it.pos);
        if (it.right.type.isNull()) {
            if (!(it.left.type.isArray() || it.left.type.isClass())) throw new semanticError("this expression cannot be assigned 'null'", it.pos);
        }
        else if (!it.left.type.equal(it.right.type)) throw new semanticError("type not matched", it.pos);
        it.type = it.left.type;
    }

    // ------ ------

    @Override
    public void visit(typenameNode it) {}

    @Override
    public void visit(arguNode it) {}

    @Override
    public void visit(parameterNode it) {}

    @Override
    public void visit(newExprNode it) {it.newTypename.accept(this);}

    @Override
    public void visit(newClassNode it) {}

    @Override
    public void visit(newClassArrayNode it) {
        for (int i = 0 ; i < it.exprNodes.size(); i++) {
            it.exprNodes.get(i).accept(this);
            if (!it.exprNodes.get(i).type.isInt()) throw new semanticError("new expression with wrong format", it.pos);
        }
    }
}
