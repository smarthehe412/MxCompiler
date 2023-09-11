package AST;

public class newClassNode extends ASTNode{
    public String type;
    public newClassNode(String tp){
        super(null);
        type = tp;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
