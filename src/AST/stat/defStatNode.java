package AST.stat;

import AST.ASTVisitor;
import AST.varDefNode;
import Util.Position;

public class defStatNode extends statNode{
    public varDefNode varDef;
    public defStatNode(Position pos){
        super(pos);
        varDef = null;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
