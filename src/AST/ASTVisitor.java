package AST;

import AST.expr.*;
import AST.expr.constExpr.constExprNode;
import AST.stat.*;

public interface ASTVisitor {
    void visit(arguNode it);
    void visit(classDefNode it);
    void visit(conFuncDefNode it);
    void visit(forVarDefNode it);
    void visit(funcDefNode it);
    void visit(mainNode it);
    void visit(newExprNode it);
    void visit(newClassArrayNode it);
    void visit(parameterNode it);
    void visit(programNode it);
    void visit(suiteNode it);
    void visit(varDefNode it);
    void visit(varSingleNode it);
    void visit(defStatNode it);
    void visit(suiteStatNode it);
    void visit(ifStatNode it);
    void visit(breakStatNode it);
    void visit(continueStatNode it);
    void visit(returnStatNode it);
    void visit(whileStatNode it);
    void visit(exprStatNode it);
    void visit(emptyStatNode it);
    void visit(constExprNode it);
    void visit(varExprNode it);
    void visit(newExprExprNode it);
    void visit(parentExprNode it);
    void visit(funcCallExprNode it);
    void visit(arrayIndexExprNode it);
    void visit(memberExprExprNode it);
    void visit(memberFuncExprNode it);
    void visit(leftExprNode it);
    void visit(rightExprNode it);
    void visit(unaryExprNode it);
    void visit(binaryExprNode it);
    void visit(condExprNode it);
    void visit(assignExprNode it);
    void visit(typenameNode it);
    void visit(forExpStatNode it);
    void visit(forDefStatNode it);
    void visit(newClassNode it);
}