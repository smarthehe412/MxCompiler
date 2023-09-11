package AST;

public class typenameArrayNode extends typenameNode{
    public int d;
    public typenameArrayNode(String tp, int td){
        super(tp);
        d = td;
    }
    @Override public boolean isArray() {return true;}
}
