package AST.stat;

import AST.ASTVisitor;
import Util.Position;

public class continueStatNode extends statNode{
    public continueStatNode(Position pos){
        super(pos);
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
