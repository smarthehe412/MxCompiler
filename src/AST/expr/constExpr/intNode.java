package AST.expr.constExpr;

import Util.Position;
import Util.type.IntType;
import Util.type.Type;

public class intNode extends constExprNode{
    public long val;
    public intNode(long value, Position pos){
        super(pos, new IntType());
        val = value;
    }
}
