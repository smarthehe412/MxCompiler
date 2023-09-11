package Util.type;

public class IntType extends Type{
    public IntType(){
        super("Int");
    }
    @Override
    public boolean equal(Object oth){
        return oth.getClass().equals(IntType.class);
    }
    @Override
    public boolean isInt() {return true;}
    @Override
    public String getName() {return "int";}
}
