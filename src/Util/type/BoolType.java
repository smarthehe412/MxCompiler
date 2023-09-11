package Util.type;

public class BoolType extends Type{
    public BoolType(){
        super("Bool");
    }
    @Override
    public boolean equal(Object oth){
        return oth.getClass().equals(BoolType.class);
    }
    @Override
    public boolean isBool(){return true;}
    @Override
    public String getName(){return "bool";}
}
