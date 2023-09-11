package Util.type;

public class NullType extends Type{
    public NullType(){
        super("Null");
    }
    @Override
    public boolean equal(Object oth) {
        return oth.getClass().equals(NullType.class);
    }
    @Override
    public boolean isNull() {return true;}
    @Override
    public String getName() {return "null";}
}
