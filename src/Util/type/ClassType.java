package Util.type;

public class ClassType extends Type{
    public String className;
    public ClassType(String id){
        super("Class");
        className = id;
    }
    @Override
    public boolean equal(Object oth) {
        if(oth.getClass().equals(NullType.class)) return true;
        return oth.getClass().equals(ClassType.class) && className.equals(((ClassType) oth).className);
    }
    @Override public boolean isClass() {return true;}
    @Override public String getName() {return className;}
}
