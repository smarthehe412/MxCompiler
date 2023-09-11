package AST.expr;

import AST.ASTVisitor;
import Util.Position;
import Util.type.Type;

public class binaryExprNode extends exprNode{
    public binaryOperator op;
    public exprNode left, right;
    public binaryExprNode(binaryOperator ops, Position pos){
        super(pos, null);
        op = ops;
        left = right = null;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
