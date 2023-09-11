package AST.expr.constExpr;

import AST.ASTVisitor;
import AST.expr.exprNode;
import Util.Position;
import Util.type.Type;

public abstract class constExprNode extends exprNode {
    public constExprNode(Position pos, Type tp){
        super(pos, tp);
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
