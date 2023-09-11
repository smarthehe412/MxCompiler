package Util.type;

import java.util.HashMap;

public abstract class Type {
    private String name;
    public Type(String s) {name = s;}
    public abstract boolean equal(Object oth);
    public abstract String getName();
    public boolean isInt() {return false;}
    public boolean isBool() {return false;}
    public boolean isString() {return false;}
    public boolean isVoid() {return false;}
    public boolean isNull() {return false;}
    public boolean isArray() {return false;}
    public boolean isClass() {return false;}
}