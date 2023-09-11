package AST.stat;
import AST.ASTVisitor;
import AST.expr.exprNode;
import AST.forVarDefNode;
import Util.Position;

public class forDefStatNode extends statNode{
    public forVarDefNode init;
    public exprNode cond, step;
    public statNode stat;
    public forDefStatNode(Position pos){
        super(pos);
        init = null;
        cond = step = null;
        stat = null;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
