package AST.expr;

import AST.ASTVisitor;
import Util.Position;
import Util.type.Type;

public class varExprNode extends exprNode{
    public String name;
    public varExprNode(String s, Position pos){
        super(pos, null);
        name = s;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
