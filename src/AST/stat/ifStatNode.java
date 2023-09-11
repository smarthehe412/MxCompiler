package AST.stat;

import AST.ASTVisitor;
import AST.expr.exprNode;
import Util.Position;

public class ifStatNode extends statNode {
    public exprNode condExpr;
    public statNode ifStat, elseStat;
    public ifStatNode(Position pos){
        super(pos);
        condExpr = null;
        ifStat = elseStat = null;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
