// Generated from D:/MxCompiler/src/grammar\Mx.g4 by ANTLR 4.12.0
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MxParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MxVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MxParser#builtinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltinType(MxParser.BuiltinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst(MxParser.ConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MxParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(MxParser.DefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef(MxParser.VarDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#forVarDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForVarDef(MxParser.ForVarDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#varSingle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSingle(MxParser.VarSingleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(MxParser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(MxParser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#conFuncDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConFuncDef(MxParser.ConFuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite(MxParser.SuiteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code def_statement}
	 * labeled alternative in {@link MxParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_statement(MxParser.Def_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code suite_statement}
	 * labeled alternative in {@link MxParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite_statement(MxParser.Suite_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if_statement}
	 * labeled alternative in {@link MxParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(MxParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code break_statement}
	 * labeled alternative in {@link MxParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_statement(MxParser.Break_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continue_statement}
	 * labeled alternative in {@link MxParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_statement(MxParser.Continue_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return_statement}
	 * labeled alternative in {@link MxParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(MxParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while_statement}
	 * labeled alternative in {@link MxParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(MxParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forExp_statement}
	 * labeled alternative in {@link MxParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExp_statement(MxParser.ForExp_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forDef_statement}
	 * labeled alternative in {@link MxParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDef_statement(MxParser.ForDef_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression_statement}
	 * labeled alternative in {@link MxParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_statement(MxParser.Expression_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code empty_statement}
	 * labeled alternative in {@link MxParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty_statement(MxParser.Empty_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditional}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(MxParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code memberExpr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberExpr(MxParser.MemberExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unary}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(MxParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code left_inc_dec}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft_inc_dec(MxParser.Left_inc_decContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constvalue}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstvalue(MxParser.ConstvalueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(MxParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binary}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(MxParser.BinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code memberFunc}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberFunc(MxParser.MemberFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(MxParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code right_inc_dec}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight_inc_dec(MxParser.Right_inc_decContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayIndex}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIndex(MxParser.ArrayIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code new_expression}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_expression(MxParser.New_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parent_expression}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParent_expression(MxParser.Parent_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(MxParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#bracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracket(MxParser.BracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#newBracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewBracket(MxParser.NewBracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#typename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypename(MxParser.TypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#argu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgu(MxParser.ArguContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(MxParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#newExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpr(MxParser.NewExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newBuiltinArray}
	 * labeled alternative in {@link MxParser#newTypename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewBuiltinArray(MxParser.NewBuiltinArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newClassArray}
	 * labeled alternative in {@link MxParser#newTypename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewClassArray(MxParser.NewClassArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newClass}
	 * labeled alternative in {@link MxParser#newTypename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewClass(MxParser.NewClassContext ctx);
}