package AST.stat;

import AST.ASTVisitor;
import Util.Position;

public class breakStatNode extends statNode{
    public breakStatNode(Position pos){
        super(pos);
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
