package Util.type;

public class VoidType extends Type {
    public VoidType() {
        super("Void");
    }
    @Override
    public boolean equal(Object oth) {
        return oth.getClass().equals(VoidType.class);
    }
    @Override
    public boolean isVoid() {return true;}
    @Override
    public String getName() {return "void";}
}