package AST;

import Util.Position;

public class mainNode extends ASTNode {
    public suiteNode suite;
    public mainNode(Position pos) {
        super(pos);
        suite = null;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
