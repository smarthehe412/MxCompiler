package Util.type;

public class StringType extends Type{
    public StringType() {
        super("String");
    }
    @Override
    public boolean equal(Object oth) {
        return oth.getClass().equals(StringType.class);
    }
    @Override
    public boolean isString() {return true;}
    @Override
    public String getName() {return "string";}
}
