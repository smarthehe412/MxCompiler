package AST.expr;
import AST.ASTNode;
import Util.type.Type;
import Util.Position;
public abstract class exprNode extends ASTNode {
    public Type type;
    public boolean canAssign = false;
    public boolean arrayOk = false;
    public exprNode(Position pos, Type tp) {
        super(pos);
        type = tp;
    }
}
