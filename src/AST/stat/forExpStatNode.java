package AST.stat;
import AST.ASTVisitor;
import AST.expr.exprNode;
import Util.Position;

public class forExpStatNode extends statNode{
    public exprNode init, cond, step;
    public statNode stat;
    public forExpStatNode(Position pos){
        super(pos);
        init = cond = step = null;
        stat = null;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
