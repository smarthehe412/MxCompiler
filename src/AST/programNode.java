package AST;

import Util.Position;

import java.util.ArrayList;

public class programNode extends ASTNode{
    public ArrayList<ASTNode> defNodes;
    public ArrayList<classDefNode> classDefNodes;
    public ArrayList<funcDefNode> funcDefNodes;
    public mainNode mainNode;

    public programNode(Position pos) {
        super(pos);
        defNodes = new ArrayList<>();
        classDefNodes = new ArrayList<>();
        funcDefNodes = new ArrayList<>();
        mainNode = null;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
