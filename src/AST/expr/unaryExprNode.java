package AST.expr;

import AST.ASTVisitor;
import Util.Position;
import Util.type.Type;

public class unaryExprNode extends exprNode{
    public unaryOperator op;
    public exprNode expr;
    public unaryExprNode(unaryOperator ops, Position pos){
        super(pos, null);
        op = ops;
        expr = null;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
