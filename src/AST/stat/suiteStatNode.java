package AST.stat;

import AST.ASTVisitor;
import AST.suiteNode;
import Util.Position;

public class suiteStatNode extends statNode{
    public suiteNode suite;
    public suiteStatNode(Position pos){
        super(pos);
        suite = null;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
