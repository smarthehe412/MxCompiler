// Generated from D:/MxCompiler/src/grammar\Mx.g4 by ANTLR 4.12.0
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MxParser}.
 */
public interface MxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MxParser#builtinType}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinType(MxParser.BuiltinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#builtinType}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinType(MxParser.BuiltinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#const}.
	 * @param ctx the parse tree
	 */
	void enterConst(MxParser.ConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#const}.
	 * @param ctx the parse tree
	 */
	void exitConst(MxParser.ConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MxParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MxParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(MxParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(MxParser.DefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(MxParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(MxParser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#forVarDef}.
	 * @param ctx the parse tree
	 */
	void enterForVarDef(MxParser.ForVarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#forVarDef}.
	 * @param ctx the parse tree
	 */
	void exitForVarDef(MxParser.ForVarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#varSingle}.
	 * @param ctx the parse tree
	 */
	void enterVarSingle(MxParser.VarSingleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#varSingle}.
	 * @param ctx the parse tree
	 */
	void exitVarSingle(MxParser.VarSingleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(MxParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(MxParser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(MxParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(MxParser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#conFuncDef}.
	 * @param ctx the parse tree
	 */
	void enterConFuncDef(MxParser.ConFuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#conFuncDef}.
	 * @param ctx the parse tree
	 */
	void exitConFuncDef(MxParser.ConFuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite(MxParser.SuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite(MxParser.SuiteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code def_statement}
	 * labeled alternative in {@link MxParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDef_statement(MxParser.Def_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code def_statement}
	 * labeled alternative in {@link MxParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDef_statement(MxParser.Def_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code suite_statement}
	 * labeled alternative in {@link MxParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterSuite_statement(MxParser.Suite_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code suite_statement}
	 * labeled alternative in {@link MxParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitSuite_statement(MxParser.Suite_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if_statement}
	 * labeled alternative in {@link MxParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(MxParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if_statement}
	 * labeled alternative in {@link MxParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(MxParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code break_statement}
	 * labeled alternative in {@link MxParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBreak_statement(MxParser.Break_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code break_statement}
	 * labeled alternative in {@link MxParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBreak_statement(MxParser.Break_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continue_statement}
	 * labeled alternative in {@link MxParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(MxParser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continue_statement}
	 * labeled alternative in {@link MxParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(MxParser.Continue_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code return_statement}
	 * labeled alternative in {@link MxParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(MxParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return_statement}
	 * labeled alternative in {@link MxParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(MxParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while_statement}
	 * labeled alternative in {@link MxParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(MxParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while_statement}
	 * labeled alternative in {@link MxParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(MxParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forExp_statement}
	 * labeled alternative in {@link MxParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterForExp_statement(MxParser.ForExp_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forExp_statement}
	 * labeled alternative in {@link MxParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitForExp_statement(MxParser.ForExp_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forDef_statement}
	 * labeled alternative in {@link MxParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterForDef_statement(MxParser.ForDef_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forDef_statement}
	 * labeled alternative in {@link MxParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitForDef_statement(MxParser.ForDef_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_statement}
	 * labeled alternative in {@link MxParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterExpression_statement(MxParser.Expression_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_statement}
	 * labeled alternative in {@link MxParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitExpression_statement(MxParser.Expression_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code empty_statement}
	 * labeled alternative in {@link MxParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_statement(MxParser.Empty_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code empty_statement}
	 * labeled alternative in {@link MxParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_statement(MxParser.Empty_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditional}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConditional(MxParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditional}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConditional(MxParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberExpr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMemberExpr(MxParser.MemberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberExpr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMemberExpr(MxParser.MemberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unary}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary(MxParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary(MxParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code left_inc_dec}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLeft_inc_dec(MxParser.Left_inc_decContext ctx);
	/**
	 * Exit a parse tree produced by the {@code left_inc_dec}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLeft_inc_dec(MxParser.Left_inc_decContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constvalue}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstvalue(MxParser.ConstvalueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constvalue}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstvalue(MxParser.ConstvalueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(MxParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(MxParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binary}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinary(MxParser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binary}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinary(MxParser.BinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberFunc}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMemberFunc(MxParser.MemberFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberFunc}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMemberFunc(MxParser.MemberFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variable}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(MxParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(MxParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code right_inc_dec}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRight_inc_dec(MxParser.Right_inc_decContext ctx);
	/**
	 * Exit a parse tree produced by the {@code right_inc_dec}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRight_inc_dec(MxParser.Right_inc_decContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayIndex}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayIndex(MxParser.ArrayIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayIndex}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayIndex(MxParser.ArrayIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code new_expression}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNew_expression(MxParser.New_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code new_expression}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNew_expression(MxParser.New_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parent_expression}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParent_expression(MxParser.Parent_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parent_expression}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParent_expression(MxParser.Parent_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign(MxParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign(MxParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#bracket}.
	 * @param ctx the parse tree
	 */
	void enterBracket(MxParser.BracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#bracket}.
	 * @param ctx the parse tree
	 */
	void exitBracket(MxParser.BracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#newBracket}.
	 * @param ctx the parse tree
	 */
	void enterNewBracket(MxParser.NewBracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#newBracket}.
	 * @param ctx the parse tree
	 */
	void exitNewBracket(MxParser.NewBracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#typename}.
	 * @param ctx the parse tree
	 */
	void enterTypename(MxParser.TypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#typename}.
	 * @param ctx the parse tree
	 */
	void exitTypename(MxParser.TypenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#argu}.
	 * @param ctx the parse tree
	 */
	void enterArgu(MxParser.ArguContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#argu}.
	 * @param ctx the parse tree
	 */
	void exitArgu(MxParser.ArguContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(MxParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(MxParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#newExpr}.
	 * @param ctx the parse tree
	 */
	void enterNewExpr(MxParser.NewExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#newExpr}.
	 * @param ctx the parse tree
	 */
	void exitNewExpr(MxParser.NewExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newBuiltinArray}
	 * labeled alternative in {@link MxParser#newTypename}.
	 * @param ctx the parse tree
	 */
	void enterNewBuiltinArray(MxParser.NewBuiltinArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newBuiltinArray}
	 * labeled alternative in {@link MxParser#newTypename}.
	 * @param ctx the parse tree
	 */
	void exitNewBuiltinArray(MxParser.NewBuiltinArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newClassArray}
	 * labeled alternative in {@link MxParser#newTypename}.
	 * @param ctx the parse tree
	 */
	void enterNewClassArray(MxParser.NewClassArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newClassArray}
	 * labeled alternative in {@link MxParser#newTypename}.
	 * @param ctx the parse tree
	 */
	void exitNewClassArray(MxParser.NewClassArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newClass}
	 * labeled alternative in {@link MxParser#newTypename}.
	 * @param ctx the parse tree
	 */
	void enterNewClass(MxParser.NewClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newClass}
	 * labeled alternative in {@link MxParser#newTypename}.
	 * @param ctx the parse tree
	 */
	void exitNewClass(MxParser.NewClassContext ctx);
}