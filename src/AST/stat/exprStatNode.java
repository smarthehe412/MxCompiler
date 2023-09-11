package AST.stat;
import AST.ASTVisitor;
import AST.expr.exprNode;
import Util.Position;

public class exprStatNode extends statNode{
    public exprNode expr;
    public exprStatNode(Position pos){
        super(pos);
        expr = null;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
