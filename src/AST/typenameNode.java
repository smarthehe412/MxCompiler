package AST;

public class typenameNode extends ASTNode{
    public String id;
    public typenameNode(String tp){
        super(null);
        id = tp;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
    public boolean isArray() {return false;}
}
