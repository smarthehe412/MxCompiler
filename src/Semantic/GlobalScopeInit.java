package Semantic;
import Util.type.*;
import AST.typenameNode;

public class GlobalScopeInit extends GlobalScope {
    public GlobalScopeInit() {
        super();
        IntType inttype = new IntType();
        BoolType booltype = new BoolType();
        StringType stringtype = new StringType();
        VoidType voidtype = new VoidType();
        NullType nulltype = new NullType();
        typenameNode intNode = new typenameNode("int");
        typenameNode boolNode = new typenameNode("bool");
        typenameNode stringNode = new typenameNode("string");
        typenameNode voidNode = new typenameNode("void");
        typenameNode nullNode = new typenameNode("null");
        defineType("int", inttype, null);
        defineType("bool", booltype, null);
        defineType("string", stringtype, null);
        defineType("void", voidtype, null);
        defineType("null", nulltype, null);
        FuncType MyPrint = new FuncType("print", voidtype),
                MyPrintln = new FuncType("println", voidtype),
                MyPrintInt = new FuncType("printInt", voidtype),
                MyPrintlnInt = new FuncType("printlnInt", voidtype);
        MyPrint.paraType.add(stringtype);
        MyPrintln.paraType.add(stringtype);
        MyPrintInt.paraType.add(inttype);
        MyPrintlnInt.paraType.add(inttype);
        FuncType MyGetString = new FuncType("getString", stringtype),
                MyGetInt = new FuncType("getInt", inttype);
        FuncType MyToString = new FuncType("toString", stringtype);
        MyToString.paraType.add(inttype);
        defineFunc("print", MyPrint, null);
        defineFunc("println", MyPrint, null);
        defineFunc("printInt", MyPrintInt, null);
        defineFunc("printlnInt", MyPrintlnInt, null);
        defineFunc("getString", MyGetString, null);
        defineFunc("getInt", MyGetInt, null);
        defineFunc("toString", MyToString, null);

        FuncType MyLength = new FuncType("length", inttype);
        FuncType MySubstring = new FuncType("substring", stringtype);
        FuncType MyParseInt = new FuncType("parseInt", inttype);
        FuncType MyOrd = new FuncType("ord", inttype);
        MySubstring.paraType.add(inttype); MySubstring.paraType.add(inttype);
        MyOrd.paraType.add(inttype);
        defineFunc("string::length", MyLength, null);
        defineFunc("string::substring", MySubstring, null);
        defineFunc("string::parseInt", MyParseInt, null);
        defineFunc("string::ord", MyOrd, null);

        FuncType MySize = new FuncType("size", inttype);
        defineFunc("_Array::size", MySize, null);
    }
}
