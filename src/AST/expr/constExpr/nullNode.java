package AST.expr.constExpr;

import Util.Position;
import Util.type.IntType;
import Util.type.NullType;

public class nullNode extends constExprNode{
    public nullNode(Position pos){
        super(pos, new NullType());
    }
}
