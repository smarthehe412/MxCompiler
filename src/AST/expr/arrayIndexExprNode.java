package AST.expr;

import AST.ASTVisitor;
import Util.Position;
import Util.type.Type;

public class arrayIndexExprNode extends exprNode{
    public exprNode start, index;
    public arrayIndexExprNode(Position pos){
        super(pos, null);
        start = index = null;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
