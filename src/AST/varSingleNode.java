package AST;

import AST.expr.exprNode;
import Util.Position;

public class varSingleNode extends ASTNode{
    public String name;
    public exprNode expr;
    public varSingleNode(String id, Position pos){
        super(pos);
        name = id;
        expr = null;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
