package AST;
import AST.expr.exprNode;
import Util.Position;
import java.util.ArrayList;
public class arguNode extends ASTNode {
    public ArrayList<exprNode> exprNodes;
    public arguNode(Position pos) {
        super(pos);
        exprNodes = new ArrayList<>();
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
