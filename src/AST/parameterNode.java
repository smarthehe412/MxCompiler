package AST;

import Util.ParameterSingle;
import Util.Position;

import java.util.ArrayList;

public class parameterNode extends ASTNode{
    public ArrayList<ParameterSingle> paras;
    public parameterNode(Position pos){
        super(pos);
        paras = new ArrayList<>();
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
