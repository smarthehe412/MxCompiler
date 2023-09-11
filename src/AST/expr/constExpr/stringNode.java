package AST.expr.constExpr;

import Util.Position;
import Util.type.StringType;
import Util.type.Type;

public class stringNode extends constExprNode{
    public String val;
    public stringNode(String value, Position pos){
        super(pos, new StringType());
        val = value;
    }
}
