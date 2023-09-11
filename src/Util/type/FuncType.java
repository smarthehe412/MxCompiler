package Util.type;

import java.util.ArrayList;

public class FuncType extends Type{
    public Type retType;
    public String funcName;
    public ArrayList<Type> paraType;
    public FuncType(String id, Type ret){
        super("Function");
        retType = ret;
        funcName = id;
        paraType = new ArrayList<>();
    }
    @Override
    public boolean equal(Object oth) {
        if(!oth.getClass().equals(FuncType.class)) return false;
        FuncType tmp = (FuncType) oth;
        if(!tmp.retType.equal(retType)) {
            return false;
        }
        if(tmp.paraType.size() != paraType.size()) {
            return false;
        }
        int n = paraType.size();
        for(int i = 0; i < n; ++i)
            if(!paraType.get(i).equal(tmp.paraType.get(i))) {
                return false;
            }
        return true;
    }
    @Override public String getName() {return funcName;}
}
