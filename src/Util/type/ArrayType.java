package Util.type;

public class ArrayType extends Type{
    public Type type;
    public int d;
    public ArrayType(Type tp, int td){
        super("Array");
        type = tp;
        d = td;
    }
    @Override
    public boolean equal(Object oth) {
        if(oth.getClass().equals(NullType.class)) return true;
        return oth.getClass().equals(ArrayType.class) && type.equal(((ArrayType) oth).type) && (d == ((ArrayType) oth).d);
    }
    @Override
    public boolean isArray() {return true;}
    @Override
    public String getName() {return "_Array";}

}
