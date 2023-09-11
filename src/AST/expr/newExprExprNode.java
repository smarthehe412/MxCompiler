package AST.expr;
import AST.ASTVisitor;
import AST.newExprNode;
import Util.Position;
import Util.type.Type;

public class newExprExprNode extends exprNode{
    public newExprNode newExpr;
    public newExprExprNode(Position pos){
        super(pos, null);
        newExpr = null;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
