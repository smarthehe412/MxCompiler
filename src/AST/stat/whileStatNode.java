package AST.stat;
import AST.ASTVisitor;
import AST.expr.exprNode;
import Util.Position;

public class whileStatNode extends statNode{
    public exprNode cond;
    public statNode stat;
    public whileStatNode(Position pos){
        super(pos);
        cond = null;
        stat = null;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
