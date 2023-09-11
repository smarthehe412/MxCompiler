package AST.stat;

import AST.ASTVisitor;
import Util.Position;

public class emptyStatNode extends statNode{
    public emptyStatNode(Position pos){
        super(pos);
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
