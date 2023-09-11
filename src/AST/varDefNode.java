package AST;

import Util.Position;

import java.util.ArrayList;

public class varDefNode extends ASTNode{
    public typenameNode typename;
    public ArrayList<varSingleNode> varSingleNodes;
    public varDefNode(Position pos){
        super(pos);
        typename = null;
        varSingleNodes = new ArrayList<>();
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
