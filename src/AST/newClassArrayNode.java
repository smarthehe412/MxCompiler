package AST;

import AST.expr.exprNode;
import Util.Position;

import java.util.ArrayList;

public class newClassArrayNode extends ASTNode {
    public int d;
    public String type;
    public ArrayList<exprNode> exprNodes;
    public newClassArrayNode(String tp, int td, Position p) {
        super(p);
        type = tp;
        d = td;
        exprNodes = new ArrayList<>();
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
