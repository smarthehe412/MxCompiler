package AST;
import Util.Position;
import Util.type.Type;
import java.util.ArrayList;

public class forVarDefNode extends ASTNode {
    public typenameNode typename;
    public ArrayList<varSingleNode> varSingleNodes;
    public forVarDefNode(Position pos) {
        super(pos);
        typename = null;
        varSingleNodes = new ArrayList<>();
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
