import AST.ASTBuilder;
import AST.programNode;
import Errors.mxErrorListener;
import Semantic.GlobalScope;
import grammar.MxLexer;
import grammar.MxParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.semantics.SymbolCollector;
import Semantic.*;

import java.io.*;

public class Main {
    public static boolean checkOk(String name) throws IOException{
        File file = new File(name);
        FileReader rd = new FileReader(file);
        BufferedReader br = new BufferedReader(rd);
        String line;
        while((line = br.readLine()) != null && !line.contains("Verdict"));
        if(line != null){
            return line.contains("Success");
        }
        return false;
    }
    public static void compile(String filename) throws Exception{
        FileInputStream input = new FileInputStream(filename);

        MxLexer lexer = new MxLexer(CharStreams.fromStream(input));
        lexer.removeErrorListeners();
        lexer.addErrorListener(new mxErrorListener());
        MxParser parser = new MxParser(new CommonTokenStream(lexer));
        parser.removeErrorListeners();
        parser.addErrorListener(new mxErrorListener());

        ASTBuilder astBuilder = new ASTBuilder();
        programNode rt = (programNode) astBuilder.visitProgram(parser.program());
        GlobalScope gS = new GlobalScopeInit();
        new symbolCollector(gS).visit(rt);
        new semanticChecker(gS).visit(rt);
        //System.err.println("semantic ok");
    }
    public static void testCompile() throws Exception{
        File justList = new File("testcases/sema/judgelist.txt");
        FileReader rd = new FileReader(justList);
        BufferedReader br = new BufferedReader(rd);
        String name;
        while((name = br.readLine()) != null) {
            String fileName = "testcases/sema/" + name;
            boolean semanticOk = true;
            System.out.println(fileName);
            try {
                compile(fileName);
            }
            catch (Exception exception) {
                //System.err.println("semantic error");
                semanticOk = false;
            }
            if (checkOk(fileName) != semanticOk) throw new Error("Test failed");
        }
    }
    public static void main(String[] args) throws Exception {
        testCompile();
        //compile("testcases/sema/ternary-package/ternary-expression-5.mx");
    }
}