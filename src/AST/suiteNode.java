package AST;

import AST.stat.statNode;
import Util.Position;

import java.util.ArrayList;

public class suiteNode extends ASTNode{
    public ArrayList<statNode> statNodes;
    public suiteNode(Position pos){
        super(pos);
        statNodes = new ArrayList<>();
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
