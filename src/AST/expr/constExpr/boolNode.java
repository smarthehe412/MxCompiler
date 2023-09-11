package AST.expr.constExpr;

import Util.Position;
import Util.type.BoolType;
import Util.type.Type;

public class boolNode extends constExprNode{
    public boolean val;
    public boolNode(boolean value, Position pos){
        super(pos, new BoolType());
        val = value;
    }
}
