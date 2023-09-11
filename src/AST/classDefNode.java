package AST;
import java.util.ArrayList;
import Util.Position;
public class classDefNode extends ASTNode {

    public String name;
    public ArrayList<varDefNode> varDef;
    public ArrayList<funcDefNode> funcDef;
    public conFuncDefNode conFuncDef;
    public classDefNode(String id, Position pos) {
        super(pos);
        name = id;
        varDef = new ArrayList<>();
        funcDef = new ArrayList<>();
        conFuncDef = null;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
