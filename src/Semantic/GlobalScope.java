package Semantic;

import Errors.semanticError;
import Util.Position;
import Util.type.ArrayType;
import Util.type.FuncType;
import Util.type.Type;
import AST.typenameNode;
import AST.typenameArrayNode;

import java.util.ArrayList;
import java.util.HashMap;

public class GlobalScope extends Scope{
    private HashMap<String, Type> types;
    private HashMap<String, FuncType> funcs;
    public GlobalScope() {
        super(null);
        types = new HashMap<>();
        funcs = new HashMap<>();
    }
    public void defineType(String name, Type tp, Position pos) {
        if (types.containsKey(name)) {
            throw new semanticError("multiple definition of class: " + name, pos);
        }
        types.put(name, tp);
    }
    public Type getType(typenameNode tpn, Position pos) {
        if (types.containsKey(tpn.id)) {
            if (tpn.isArray()) {
                return new ArrayType(types.get(tpn.id), ((typenameArrayNode) tpn).d);
            }
            return types.get(tpn.id);
        }
        throw new semanticError("undefined type: " + tpn.id, pos);
    }
    public Type getClassByName(String name, Position pos) {
        if (types.containsKey(name)) {
            return types.get(name);
        }
        throw new semanticError("undefined type: " + name, pos);
    }
    public boolean hasType(String name) {
        return types.containsKey(name);
    }

    public void defineFunc(String name, FuncType f, Position p) {
        if(funcs.containsKey(name)) {
            throw new semanticError("multiple definition of function: " + name, p);
        }
        funcs.put(name, f);
    }


    public FuncType getFunc(String name, Position p) {
        if(funcs.containsKey(name)){
            return funcs.get(name);
        }
        throw new semanticError("undefined function: " + name, p);
    }
    public boolean hasFunc(String name) {return funcs.containsKey(name);}
}
