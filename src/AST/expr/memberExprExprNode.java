package AST.expr;

import AST.ASTVisitor;
import Util.Position;
import Util.type.Type;

public class memberExprExprNode extends exprNode{
    public exprNode expr;
    public String name;
    public memberExprExprNode(String id, Position pos){
        super(pos, null);

        expr = null;
        name = id;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
