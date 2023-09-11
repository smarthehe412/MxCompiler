package AST.expr;
import AST.ASTVisitor;
import AST.arguNode;
import Util.Position;
import Util.type.Type;

import java.util.ArrayList;

public class memberFuncExprNode extends exprNode{
    public String name;
    public exprNode expr;
    public ArrayList<exprNode> arguExprNodes;
    public memberFuncExprNode(String id, Position pos){
        super(pos, null);
        name = id;
        expr = null;
        arguExprNodes = new ArrayList<>();
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
