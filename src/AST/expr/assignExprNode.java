package AST.expr;

import AST.ASTVisitor;
import Util.Position;
import Util.type.Type;

public class assignExprNode extends exprNode{
    public exprNode left, right;
    public assignExprNode(Position pos){
        super(pos, null);
        left = right = null;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
