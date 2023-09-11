package AST.expr;

import AST.ASTVisitor;
import Util.Position;
import Util.type.Type;

public class rightExprNode extends exprNode{
    public selfOperator op;
    public exprNode expr;
    public rightExprNode(selfOperator ops, Position pos){
        super(pos, null);
        op = ops;
        expr = null;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
