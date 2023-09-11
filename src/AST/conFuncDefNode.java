package AST;
import java.util.ArrayList;
import Util.Position;

public class conFuncDefNode extends ASTNode {
    public String name;
    public suiteNode suite;
    public conFuncDefNode(String id, Position pos) {
        super(pos);
        name = id;
        suite = null;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
