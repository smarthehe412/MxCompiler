package AST;

import Util.ParameterSingle;
import Util.Position;
import Util.type.Type;

import java.util.ArrayList;

public class funcDefNode extends ASTNode {
    public typenameNode typename;
    public String name;
    public ArrayList<ParameterSingle> paras;
    public suiteNode suite;
    public funcDefNode(String id, Position pos) {
        super(pos);
        name = id;
        typename = null;
        paras = new ArrayList<>();
        suite = null;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
