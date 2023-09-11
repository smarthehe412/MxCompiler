package AST;

import AST.ASTNode;
import AST.ASTVisitor;
import AST.newClassArrayNode;
import Util.Position;

public class newExprNode extends ASTNode {
    public newClassArrayNode newTypename;
    public newExprNode(Position pos) {
        super(pos);
        newTypename = null;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
