package AST.expr;
import AST.ASTVisitor;
import AST.arguNode;
import Util.Position;
import Util.type.Type;

import java.util.ArrayList;

public class funcCallExprNode extends exprNode{
    public String name;
    public ArrayList<exprNode> arguExprNodes;
    public funcCallExprNode(String id, Position pos){
        super(pos, null);
        name = id;
        arguExprNodes = new ArrayList<>();
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
