package Util;
import AST.typenameNode;
public class ParameterSingle {
    public typenameNode type;
    public Position pos;
    public String name;
    public ParameterSingle(String id, Position p, typenameNode tpn){
        name = id;
        pos = p;
        type = tpn;
    }
}
