package AST.stat;
import AST.ASTVisitor;
import AST.expr.exprNode;
import Util.Position;

public class returnStatNode extends statNode{
    public exprNode expr;
    public returnStatNode(Position pos){
        super(pos);
        expr = null;
    }
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
