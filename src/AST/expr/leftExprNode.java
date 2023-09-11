package AST.expr;

import AST.ASTVisitor;
import Util.Position;
import Util.type.Type;

public class leftExprNode extends exprNode{
    public selfOperator op;
    public exprNode expr;
    public leftExprNode(selfOperator ops, Position pos){
        super(pos, null);
        op = ops;
        expr = null;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
