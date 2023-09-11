package AST.expr;

import AST.ASTVisitor;
import Util.Position;
import Util.type.Type;

public class parentExprNode extends exprNode{
    public exprNode expr;
    public parentExprNode(Position pos){
        super(pos, null);
        expr = null;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
