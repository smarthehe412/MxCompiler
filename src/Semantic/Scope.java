package Semantic;

import Errors.semanticError;
import Util.Position;
import Util.type.Type;
import java.util.HashMap;

public class Scope {
    private HashMap<String, Type> things;
    public Scope parent;
    public boolean inLoop, inFunc, inClass;
    public Type funcType, classType;
    public Scope(Scope parentScope)
    {
        things = new HashMap<>();
        parent = parentScope;
        if (parent == null) {
            inLoop = inFunc = inClass = false;
            funcType = classType = null;
        }
        else {
            inLoop = parent.inLoop;
            inFunc = parent.inFunc;
            inClass = parent.inClass;
            funcType = parent.funcType;
            classType = parent.classType;
        }
    }
    public void defineThing(String name, Type t, Position pos) {
        if (things.containsKey(name))
            throw new semanticError("multiple definition", pos);
        things.put(name, t);
    }
    public boolean hasThing(String name) {
        if (things.containsKey(name)) return true;
        if (parent != null) return parent.hasThing(name);
        return false;
    }
    public Type getType(String name) {
        if (things.containsKey(name)) return things.get(name);
        return parent.getType(name);
    }
}
