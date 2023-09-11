package AST.expr;

import AST.ASTVisitor;
import Util.Position;
import Util.type.Type;

public class condExprNode extends exprNode{
    public exprNode condExpr, ifExpr, elseExpr;
    public condExprNode(Position pos){
        super(pos, null);
        condExpr = ifExpr = elseExpr = null;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
