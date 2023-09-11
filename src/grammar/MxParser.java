// Generated from D:/MxCompiler/src/grammar\Mx.g4 by ANTLR 4.12.0
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, Add=11, Dec=12, Mul=13, Div=14, Mod=15, Ge=16, Le=17, Geq=18, 
		Leq=19, Eq=20, Neq=21, LogicAnd=22, LogicOr=23, LogicNot=24, BitAnd=25, 
		BitOr=26, BitXor=27, BitNot=28, Lsft=29, Rsft=30, Assign=31, SelfAdd=32, 
		SelfDec=33, Dot=34, Arrow=35, Void=36, Bool=37, Int=38, String=39, New=40, 
		Class=41, If=42, Else=43, For=44, While=45, Break=46, Continue=47, Return=48, 
		True=49, False=50, Null=51, This=52, ID=53, Num=54, Str=55, WhiteSpace=56, 
		NewLine=57, LineCom=58, BlockCom=59;
	public static final int
		RULE_builtinType = 0, RULE_const = 1, RULE_program = 2, RULE_def = 3, 
		RULE_varDef = 4, RULE_forVarDef = 5, RULE_varSingle = 6, RULE_classDef = 7, 
		RULE_funcDef = 8, RULE_conFuncDef = 9, RULE_suite = 10, RULE_stat = 11, 
		RULE_expr = 12, RULE_bracket = 13, RULE_newBracket = 14, RULE_typename = 15, 
		RULE_argu = 16, RULE_parameter = 17, RULE_newExpr = 18, RULE_newTypename = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"builtinType", "const", "program", "def", "varDef", "forVarDef", "varSingle", 
			"classDef", "funcDef", "conFuncDef", "suite", "stat", "expr", "bracket", 
			"newBracket", "typename", "argu", "parameter", "newExpr", "newTypename"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "';'", "'{'", "'}'", "'('", "')'", "'['", "']'", "'?'", 
			"':'", "'+'", "'-'", "'*'", "'/'", "'%'", "'>'", "'<'", "'>='", "'<='", 
			"'=='", "'!='", "'&&'", "'||'", "'!'", "'&'", "'|'", "'^'", "'~'", "'<<'", 
			"'>>'", "'='", "'++'", "'--'", "'.'", "'->'", "'void'", "'bool'", "'int'", 
			"'string'", "'new'", "'class'", "'if'", "'else'", "'for'", "'while'", 
			"'break'", "'continue'", "'return'", "'true'", "'false'", "'null'", "'this'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "Add", 
			"Dec", "Mul", "Div", "Mod", "Ge", "Le", "Geq", "Leq", "Eq", "Neq", "LogicAnd", 
			"LogicOr", "LogicNot", "BitAnd", "BitOr", "BitXor", "BitNot", "Lsft", 
			"Rsft", "Assign", "SelfAdd", "SelfDec", "Dot", "Arrow", "Void", "Bool", 
			"Int", "String", "New", "Class", "If", "Else", "For", "While", "Break", 
			"Continue", "Return", "True", "False", "Null", "This", "ID", "Num", "Str", 
			"WhiteSpace", "NewLine", "LineCom", "BlockCom"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Mx.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BuiltinTypeContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(MxParser.Int, 0); }
		public TerminalNode Bool() { return getToken(MxParser.Bool, 0); }
		public TerminalNode Void() { return getToken(MxParser.Void, 0); }
		public TerminalNode String() { return getToken(MxParser.String, 0); }
		public BuiltinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterBuiltinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitBuiltinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitBuiltinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuiltinTypeContext builtinType() throws RecognitionException {
		BuiltinTypeContext _localctx = new BuiltinTypeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_builtinType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1030792151040L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstContext extends ParserRuleContext {
		public TerminalNode True() { return getToken(MxParser.True, 0); }
		public TerminalNode False() { return getToken(MxParser.False, 0); }
		public TerminalNode Num() { return getToken(MxParser.Num, 0); }
		public TerminalNode Str() { return getToken(MxParser.Str, 0); }
		public TerminalNode Null() { return getToken(MxParser.Null, 0); }
		public TerminalNode This() { return getToken(MxParser.This, 0); }
		public ConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstContext const_() throws RecognitionException {
		ConstContext _localctx = new ConstContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_const);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62487444829765632L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<DefContext> def() {
			return getRuleContexts(DefContext.class);
		}
		public DefContext def(int i) {
			return getRuleContext(DefContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9010429070147584L) != 0)) {
				{
				{
				setState(44);
				def();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefContext extends ParserRuleContext {
		public ClassDefContext classDef() {
			return getRuleContext(ClassDefContext.class,0);
		}
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_def);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				classDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				funcDef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				varDef();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarDefContext extends ParserRuleContext {
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public List<VarSingleContext> varSingle() {
			return getRuleContexts(VarSingleContext.class);
		}
		public VarSingleContext varSingle(int i) {
			return getRuleContext(VarSingleContext.class,i);
		}
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitVarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitVarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			typename();
			setState(56);
			varSingle();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(57);
				match(T__0);
				setState(58);
				varSingle();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForVarDefContext extends ParserRuleContext {
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public List<VarSingleContext> varSingle() {
			return getRuleContexts(VarSingleContext.class);
		}
		public VarSingleContext varSingle(int i) {
			return getRuleContext(VarSingleContext.class,i);
		}
		public ForVarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forVarDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterForVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitForVarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitForVarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForVarDefContext forVarDef() throws RecognitionException {
		ForVarDefContext _localctx = new ForVarDefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_forVarDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			typename();
			setState(67);
			varSingle();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(68);
				match(T__0);
				setState(69);
				varSingle();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarSingleContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MxParser.ID, 0); }
		public TerminalNode Assign() { return getToken(MxParser.Assign, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarSingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSingle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterVarSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitVarSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitVarSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarSingleContext varSingle() throws RecognitionException {
		VarSingleContext _localctx = new VarSingleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varSingle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(ID);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(76);
				match(Assign);
				setState(77);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDefContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(MxParser.Class, 0); }
		public TerminalNode ID() { return getToken(MxParser.ID, 0); }
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public List<FuncDefContext> funcDef() {
			return getRuleContexts(FuncDefContext.class);
		}
		public FuncDefContext funcDef(int i) {
			return getRuleContext(FuncDefContext.class,i);
		}
		public List<ConFuncDefContext> conFuncDef() {
			return getRuleContexts(ConFuncDefContext.class);
		}
		public ConFuncDefContext conFuncDef(int i) {
			return getRuleContext(ConFuncDefContext.class,i);
		}
		public ClassDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterClassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitClassDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitClassDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefContext classDef() throws RecognitionException {
		ClassDefContext _localctx = new ClassDefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(Class);
			setState(81);
			match(ID);
			setState(82);
			match(T__2);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9008230046892032L) != 0)) {
				{
				setState(86);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(83);
					varDef();
					}
					break;
				case 2:
					{
					setState(84);
					funcDef();
					}
					break;
				case 3:
					{
					setState(85);
					conFuncDef();
					}
					break;
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(T__3);
			setState(92);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncDefContext extends ParserRuleContext {
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public TerminalNode ID() { return getToken(MxParser.ID, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			typename();
			setState(95);
			match(ID);
			setState(96);
			match(T__4);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9008230046892032L) != 0)) {
				{
				setState(97);
				parameter();
				}
			}

			setState(100);
			match(T__5);
			setState(101);
			suite();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConFuncDefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MxParser.ID, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public ConFuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conFuncDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterConFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitConFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitConFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConFuncDefContext conFuncDef() throws RecognitionException {
		ConFuncDefContext _localctx = new ConFuncDefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_conFuncDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(ID);
			setState(104);
			match(T__4);
			setState(105);
			match(T__5);
			setState(106);
			suite();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SuiteContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public SuiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterSuite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitSuite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitSuite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuiteContext suite() throws RecognitionException {
		SuiteContext _localctx = new SuiteContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_suite);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__2);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72046543372292140L) != 0)) {
				{
				{
				setState(109);
				stat();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Suite_statementContext extends StatContext {
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public Suite_statementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterSuite_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitSuite_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitSuite_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Continue_statementContext extends StatContext {
		public TerminalNode Continue() { return getToken(MxParser.Continue, 0); }
		public Continue_statementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterContinue_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitContinue_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitContinue_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForExp_statementContext extends StatContext {
		public ExprContext init;
		public ExprContext cond;
		public ExprContext step;
		public TerminalNode For() { return getToken(MxParser.For, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ForExp_statementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterForExp_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitForExp_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitForExp_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Expression_statementContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expression_statementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterExpression_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitExpression_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitExpression_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Def_statementContext extends StatContext {
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public Def_statementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterDef_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitDef_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitDef_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends StatContext {
		public StatContext ifstat;
		public StatContext elsestat;
		public TerminalNode If() { return getToken(MxParser.If, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TerminalNode Else() { return getToken(MxParser.Else, 0); }
		public If_statementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class While_statementContext extends StatContext {
		public ExprContext cond;
		public TerminalNode While() { return getToken(MxParser.While, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public While_statementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForDef_statementContext extends StatContext {
		public ForVarDefContext init;
		public ExprContext cond;
		public ExprContext step;
		public TerminalNode For() { return getToken(MxParser.For, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public ForVarDefContext forVarDef() {
			return getRuleContext(ForVarDefContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ForDef_statementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterForDef_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitForDef_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitForDef_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Break_statementContext extends StatContext {
		public TerminalNode Break() { return getToken(MxParser.Break, 0); }
		public Break_statementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterBreak_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitBreak_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitBreak_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Return_statementContext extends StatContext {
		public TerminalNode Return() { return getToken(MxParser.Return, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_statementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Empty_statementContext extends StatContext {
		public Empty_statementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterEmpty_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitEmpty_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitEmpty_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stat);
		int _la;
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new Def_statementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				varDef();
				}
				break;
			case 2:
				_localctx = new Suite_statementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				suite();
				}
				break;
			case 3:
				_localctx = new If_statementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				match(If);
				setState(120);
				match(T__4);
				setState(121);
				expr(0);
				setState(122);
				match(T__5);
				{
				setState(123);
				((If_statementContext)_localctx).ifstat = stat();
				}
				setState(126);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(124);
					match(Else);
					{
					setState(125);
					((If_statementContext)_localctx).elsestat = stat();
					}
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new Break_statementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				match(Break);
				setState(129);
				match(T__1);
				}
				break;
			case 5:
				_localctx = new Continue_statementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(130);
				match(Continue);
				setState(131);
				match(T__1);
				}
				break;
			case 6:
				_localctx = new Return_statementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(132);
				match(Return);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 71495756766253088L) != 0)) {
					{
					setState(133);
					expr(0);
					}
				}

				setState(136);
				match(T__1);
				}
				break;
			case 7:
				_localctx = new While_statementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(137);
				match(While);
				setState(138);
				match(T__4);
				{
				setState(139);
				((While_statementContext)_localctx).cond = expr(0);
				}
				setState(140);
				match(T__5);
				setState(141);
				stat();
				}
				break;
			case 8:
				_localctx = new ForExp_statementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(143);
				match(For);
				setState(144);
				match(T__4);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 71495756766253088L) != 0)) {
					{
					setState(145);
					((ForExp_statementContext)_localctx).init = expr(0);
					}
				}

				setState(148);
				match(T__1);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 71495756766253088L) != 0)) {
					{
					setState(149);
					((ForExp_statementContext)_localctx).cond = expr(0);
					}
				}

				setState(152);
				match(T__1);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 71495756766253088L) != 0)) {
					{
					setState(153);
					((ForExp_statementContext)_localctx).step = expr(0);
					}
				}

				setState(156);
				match(T__5);
				setState(157);
				stat();
				}
				break;
			case 9:
				_localctx = new ForDef_statementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(158);
				match(For);
				setState(159);
				match(T__4);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9008230046892032L) != 0)) {
					{
					setState(160);
					((ForDef_statementContext)_localctx).init = forVarDef();
					}
				}

				setState(163);
				match(T__1);
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 71495756766253088L) != 0)) {
					{
					setState(164);
					((ForDef_statementContext)_localctx).cond = expr(0);
					}
				}

				setState(167);
				match(T__1);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 71495756766253088L) != 0)) {
					{
					setState(168);
					((ForDef_statementContext)_localctx).step = expr(0);
					}
				}

				setState(171);
				match(T__5);
				setState(172);
				stat();
				}
				break;
			case 10:
				_localctx = new Expression_statementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(173);
				expr(0);
				setState(174);
				match(T__1);
				}
				break;
			case 11:
				_localctx = new Empty_statementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(176);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ConditionalContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Dot() { return getToken(MxParser.Dot, 0); }
		public TerminalNode ID() { return getToken(MxParser.ID, 0); }
		public MemberExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterMemberExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitMemberExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitMemberExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Dec() { return getToken(MxParser.Dec, 0); }
		public TerminalNode LogicNot() { return getToken(MxParser.LogicNot, 0); }
		public TerminalNode BitNot() { return getToken(MxParser.BitNot, 0); }
		public UnaryContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Left_inc_decContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SelfDec() { return getToken(MxParser.SelfDec, 0); }
		public TerminalNode SelfAdd() { return getToken(MxParser.SelfAdd, 0); }
		public Left_inc_decContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterLeft_inc_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitLeft_inc_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitLeft_inc_dec(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstvalueContext extends ExprContext {
		public ConstContext const_() {
			return getRuleContext(ConstContext.class,0);
		}
		public ConstvalueContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterConstvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitConstvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitConstvalue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ExprContext {
		public TerminalNode ID() { return getToken(MxParser.ID, 0); }
		public ArguContext argu() {
			return getRuleContext(ArguContext.class,0);
		}
		public FunctionCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Mul() { return getToken(MxParser.Mul, 0); }
		public TerminalNode Div() { return getToken(MxParser.Div, 0); }
		public TerminalNode Mod() { return getToken(MxParser.Mod, 0); }
		public TerminalNode Add() { return getToken(MxParser.Add, 0); }
		public TerminalNode Dec() { return getToken(MxParser.Dec, 0); }
		public TerminalNode Lsft() { return getToken(MxParser.Lsft, 0); }
		public TerminalNode Rsft() { return getToken(MxParser.Rsft, 0); }
		public TerminalNode Le() { return getToken(MxParser.Le, 0); }
		public TerminalNode Leq() { return getToken(MxParser.Leq, 0); }
		public TerminalNode Ge() { return getToken(MxParser.Ge, 0); }
		public TerminalNode Geq() { return getToken(MxParser.Geq, 0); }
		public TerminalNode Eq() { return getToken(MxParser.Eq, 0); }
		public TerminalNode Neq() { return getToken(MxParser.Neq, 0); }
		public TerminalNode BitAnd() { return getToken(MxParser.BitAnd, 0); }
		public TerminalNode BitXor() { return getToken(MxParser.BitXor, 0); }
		public TerminalNode BitOr() { return getToken(MxParser.BitOr, 0); }
		public TerminalNode LogicAnd() { return getToken(MxParser.LogicAnd, 0); }
		public TerminalNode LogicOr() { return getToken(MxParser.LogicOr, 0); }
		public BinaryContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberFuncContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Dot() { return getToken(MxParser.Dot, 0); }
		public TerminalNode ID() { return getToken(MxParser.ID, 0); }
		public ArguContext argu() {
			return getRuleContext(ArguContext.class,0);
		}
		public MemberFuncContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterMemberFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitMemberFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitMemberFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ExprContext {
		public TerminalNode ID() { return getToken(MxParser.ID, 0); }
		public VariableContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Right_inc_decContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SelfDec() { return getToken(MxParser.SelfDec, 0); }
		public TerminalNode SelfAdd() { return getToken(MxParser.SelfAdd, 0); }
		public Right_inc_decContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterRight_inc_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitRight_inc_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitRight_inc_dec(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayIndexContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArrayIndexContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterArrayIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitArrayIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitArrayIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class New_expressionContext extends ExprContext {
		public NewExprContext newExpr() {
			return getRuleContext(NewExprContext.class,0);
		}
		public New_expressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterNew_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitNew_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitNew_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Parent_expressionContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Parent_expressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterParent_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitParent_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitParent_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Assign() { return getToken(MxParser.Assign, 0); }
		public AssignContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new ConstvalueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(180);
				const_();
				}
				break;
			case 2:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				match(ID);
				}
				break;
			case 3:
				{
				_localctx = new New_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				newExpr();
				}
				break;
			case 4:
				{
				_localctx = new Parent_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				match(T__4);
				setState(184);
				expr(0);
				setState(185);
				match(T__5);
				}
				break;
			case 5:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187);
				match(ID);
				setState(188);
				match(T__4);
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 71495756766253088L) != 0)) {
					{
					setState(189);
					argu();
					}
				}

				setState(192);
				match(T__5);
				}
				break;
			case 6:
				{
				_localctx = new Right_inc_decContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193);
				((Right_inc_decContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==SelfAdd || _la==SelfDec) ) {
					((Right_inc_decContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(194);
				expr(15);
				}
				break;
			case 7:
				{
				_localctx = new UnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195);
				((UnaryContext)_localctx).op = match(Dec);
				setState(196);
				expr(14);
				}
				break;
			case 8:
				{
				_localctx = new UnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197);
				((UnaryContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LogicNot || _la==BitNot) ) {
					((UnaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(198);
				expr(13);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(258);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(201);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(202);
						((BinaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0)) ) {
							((BinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(203);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new BinaryContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(204);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(205);
						((BinaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Add || _la==Dec) ) {
							((BinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(206);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new BinaryContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(207);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(208);
						((BinaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Lsft || _la==Rsft) ) {
							((BinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(209);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new BinaryContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(210);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(211);
						((BinaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 983040L) != 0)) ) {
							((BinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(212);
						expr(10);
						}
						break;
					case 5:
						{
						_localctx = new BinaryContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(213);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(214);
						((BinaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Eq || _la==Neq) ) {
							((BinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(215);
						expr(9);
						}
						break;
					case 6:
						{
						_localctx = new BinaryContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(216);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(217);
						((BinaryContext)_localctx).op = match(BitAnd);
						setState(218);
						expr(8);
						}
						break;
					case 7:
						{
						_localctx = new BinaryContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(219);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(220);
						((BinaryContext)_localctx).op = match(BitXor);
						setState(221);
						expr(7);
						}
						break;
					case 8:
						{
						_localctx = new BinaryContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(222);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(223);
						((BinaryContext)_localctx).op = match(BitOr);
						setState(224);
						expr(6);
						}
						break;
					case 9:
						{
						_localctx = new BinaryContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(225);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(226);
						((BinaryContext)_localctx).op = match(LogicAnd);
						setState(227);
						expr(5);
						}
						break;
					case 10:
						{
						_localctx = new BinaryContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(228);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(229);
						((BinaryContext)_localctx).op = match(LogicOr);
						setState(230);
						expr(4);
						}
						break;
					case 11:
						{
						_localctx = new ConditionalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(231);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(232);
						match(T__8);
						setState(233);
						expr(0);
						setState(234);
						match(T__9);
						setState(235);
						expr(2);
						}
						break;
					case 12:
						{
						_localctx = new AssignContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(237);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(238);
						match(Assign);
						setState(239);
						expr(1);
						}
						break;
					case 13:
						{
						_localctx = new ArrayIndexContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(240);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(241);
						match(T__6);
						setState(242);
						expr(0);
						setState(243);
						match(T__7);
						}
						break;
					case 14:
						{
						_localctx = new MemberExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(245);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(246);
						match(Dot);
						setState(247);
						match(ID);
						}
						break;
					case 15:
						{
						_localctx = new MemberFuncContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(248);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(249);
						match(Dot);
						setState(250);
						match(ID);
						setState(251);
						match(T__4);
						setState(253);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 71495756766253088L) != 0)) {
							{
							setState(252);
							argu();
							}
						}

						setState(255);
						match(T__5);
						}
						break;
					case 16:
						{
						_localctx = new Left_inc_decContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(256);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(257);
						((Left_inc_decContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SelfAdd || _la==SelfDec) ) {
							((Left_inc_decContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BracketContext extends ParserRuleContext {
		public BracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitBracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracketContext bracket() throws RecognitionException {
		BracketContext _localctx = new BracketContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(T__6);
			setState(264);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NewBracketContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NewBracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newBracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterNewBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitNewBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitNewBracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewBracketContext newBracket() throws RecognitionException {
		NewBracketContext _localctx = new NewBracketContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_newBracket);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(T__6);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 71495756766253088L) != 0)) {
				{
				setState(267);
				expr(0);
				}
			}

			setState(270);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypenameContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(MxParser.Int, 0); }
		public TerminalNode Bool() { return getToken(MxParser.Bool, 0); }
		public TerminalNode Void() { return getToken(MxParser.Void, 0); }
		public TerminalNode String() { return getToken(MxParser.String, 0); }
		public TerminalNode ID() { return getToken(MxParser.ID, 0); }
		public List<BracketContext> bracket() {
			return getRuleContexts(BracketContext.class);
		}
		public BracketContext bracket(int i) {
			return getRuleContext(BracketContext.class,i);
		}
		public TypenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterTypename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitTypename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitTypename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypenameContext typename() throws RecognitionException {
		TypenameContext _localctx = new TypenameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_typename);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 9008230046892032L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(273);
				bracket();
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArguContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArguContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterArgu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitArgu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitArgu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArguContext argu() throws RecognitionException {
		ArguContext _localctx = new ArguContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_argu);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			expr(0);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(280);
				match(T__0);
				setState(281);
				expr(0);
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public List<TypenameContext> typename() {
			return getRuleContexts(TypenameContext.class);
		}
		public TypenameContext typename(int i) {
			return getRuleContext(TypenameContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(MxParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MxParser.ID, i);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			typename();
			setState(288);
			match(ID);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(289);
				match(T__0);
				setState(290);
				typename();
				setState(291);
				match(ID);
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NewExprContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(MxParser.New, 0); }
		public NewTypenameContext newTypename() {
			return getRuleContext(NewTypenameContext.class,0);
		}
		public NewExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterNewExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitNewExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitNewExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewExprContext newExpr() throws RecognitionException {
		NewExprContext _localctx = new NewExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_newExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(New);
			setState(299);
			newTypename();
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(300);
				match(T__4);
				setState(301);
				match(T__5);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NewTypenameContext extends ParserRuleContext {
		public NewTypenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newTypename; }
	 
		public NewTypenameContext() { }
		public void copyFrom(NewTypenameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewBuiltinArrayContext extends NewTypenameContext {
		public BuiltinTypeContext builtinType() {
			return getRuleContext(BuiltinTypeContext.class,0);
		}
		public List<NewBracketContext> newBracket() {
			return getRuleContexts(NewBracketContext.class);
		}
		public NewBracketContext newBracket(int i) {
			return getRuleContext(NewBracketContext.class,i);
		}
		public NewBuiltinArrayContext(NewTypenameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterNewBuiltinArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitNewBuiltinArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitNewBuiltinArray(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewClassContext extends NewTypenameContext {
		public TerminalNode ID() { return getToken(MxParser.ID, 0); }
		public NewClassContext(NewTypenameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterNewClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitNewClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitNewClass(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewClassArrayContext extends NewTypenameContext {
		public TerminalNode ID() { return getToken(MxParser.ID, 0); }
		public List<NewBracketContext> newBracket() {
			return getRuleContexts(NewBracketContext.class);
		}
		public NewBracketContext newBracket(int i) {
			return getRuleContext(NewBracketContext.class,i);
		}
		public NewClassArrayContext(NewTypenameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterNewClassArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitNewClassArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitNewClassArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewTypenameContext newTypename() throws RecognitionException {
		NewTypenameContext _localctx = new NewTypenameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_newTypename);
		try {
			int _alt;
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new NewBuiltinArrayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				builtinType();
				setState(306); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(305);
						newBracket();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(308); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new NewClassArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				match(ID);
				setState(312); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(311);
						newBracket();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(314); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				_localctx = new NewClassContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		case 12:
			return precpred(_ctx, 19);
		case 13:
			return precpred(_ctx, 18);
		case 14:
			return precpred(_ctx, 17);
		case 15:
			return precpred(_ctx, 16);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001;\u0140\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0005\u0002.\b\u0002\n\u0002\f\u00021\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u00036\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004<\b\u0004\n\u0004\f\u0004?\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005G\b\u0005\n\u0005\f\u0005J\t\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006O\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007W\b\u0007\n\u0007\f\u0007"+
		"Z\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0003\bc\b\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0005\no\b\n\n\n\f\nr\t\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u007f\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0087\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0093\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0097\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u009b\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00a2\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00a6\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00aa"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00b2\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00bf\b\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00c8\b\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00fe\b\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u0103\b\f\n\f\f\f\u0106\t\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0003\u000e\u010d\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0005\u000f\u0113\b\u000f\n\u000f"+
		"\f\u000f\u0116\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u011b\b\u0010\n\u0010\f\u0010\u011e\t\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0126\b\u0011\n"+
		"\u0011\f\u0011\u0129\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u012f\b\u0012\u0001\u0013\u0001\u0013\u0004\u0013\u0133"+
		"\b\u0013\u000b\u0013\f\u0013\u0134\u0001\u0013\u0001\u0013\u0004\u0013"+
		"\u0139\b\u0013\u000b\u0013\f\u0013\u013a\u0001\u0013\u0003\u0013\u013e"+
		"\b\u0013\u0001\u0013\u0000\u0001\u0018\u0014\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&\u0000"+
		"\n\u0001\u0000$\'\u0002\u00001467\u0001\u0000 !\u0002\u0000\u0018\u0018"+
		"\u001c\u001c\u0001\u0000\r\u000f\u0001\u0000\u000b\f\u0001\u0000\u001d"+
		"\u001e\u0001\u0000\u0010\u0013\u0001\u0000\u0014\u0015\u0002\u0000$\'"+
		"55\u016a\u0000(\u0001\u0000\u0000\u0000\u0002*\u0001\u0000\u0000\u0000"+
		"\u0004/\u0001\u0000\u0000\u0000\u00065\u0001\u0000\u0000\u0000\b7\u0001"+
		"\u0000\u0000\u0000\nB\u0001\u0000\u0000\u0000\fK\u0001\u0000\u0000\u0000"+
		"\u000eP\u0001\u0000\u0000\u0000\u0010^\u0001\u0000\u0000\u0000\u0012g"+
		"\u0001\u0000\u0000\u0000\u0014l\u0001\u0000\u0000\u0000\u0016\u00b1\u0001"+
		"\u0000\u0000\u0000\u0018\u00c7\u0001\u0000\u0000\u0000\u001a\u0107\u0001"+
		"\u0000\u0000\u0000\u001c\u010a\u0001\u0000\u0000\u0000\u001e\u0110\u0001"+
		"\u0000\u0000\u0000 \u0117\u0001\u0000\u0000\u0000\"\u011f\u0001\u0000"+
		"\u0000\u0000$\u012a\u0001\u0000\u0000\u0000&\u013d\u0001\u0000\u0000\u0000"+
		"()\u0007\u0000\u0000\u0000)\u0001\u0001\u0000\u0000\u0000*+\u0007\u0001"+
		"\u0000\u0000+\u0003\u0001\u0000\u0000\u0000,.\u0003\u0006\u0003\u0000"+
		"-,\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000"+
		"\u0000/0\u0001\u0000\u0000\u00000\u0005\u0001\u0000\u0000\u00001/\u0001"+
		"\u0000\u0000\u000026\u0003\u000e\u0007\u000036\u0003\u0010\b\u000046\u0003"+
		"\b\u0004\u000052\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000054\u0001"+
		"\u0000\u0000\u00006\u0007\u0001\u0000\u0000\u000078\u0003\u001e\u000f"+
		"\u00008=\u0003\f\u0006\u00009:\u0005\u0001\u0000\u0000:<\u0003\f\u0006"+
		"\u0000;9\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000\u0000=;\u0001\u0000"+
		"\u0000\u0000=>\u0001\u0000\u0000\u0000>@\u0001\u0000\u0000\u0000?=\u0001"+
		"\u0000\u0000\u0000@A\u0005\u0002\u0000\u0000A\t\u0001\u0000\u0000\u0000"+
		"BC\u0003\u001e\u000f\u0000CH\u0003\f\u0006\u0000DE\u0005\u0001\u0000\u0000"+
		"EG\u0003\f\u0006\u0000FD\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000"+
		"HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000I\u000b\u0001\u0000"+
		"\u0000\u0000JH\u0001\u0000\u0000\u0000KN\u00055\u0000\u0000LM\u0005\u001f"+
		"\u0000\u0000MO\u0003\u0018\f\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000"+
		"\u0000\u0000O\r\u0001\u0000\u0000\u0000PQ\u0005)\u0000\u0000QR\u00055"+
		"\u0000\u0000RX\u0005\u0003\u0000\u0000SW\u0003\b\u0004\u0000TW\u0003\u0010"+
		"\b\u0000UW\u0003\u0012\t\u0000VS\u0001\u0000\u0000\u0000VT\u0001\u0000"+
		"\u0000\u0000VU\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001"+
		"\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y[\u0001\u0000\u0000\u0000"+
		"ZX\u0001\u0000\u0000\u0000[\\\u0005\u0004\u0000\u0000\\]\u0005\u0002\u0000"+
		"\u0000]\u000f\u0001\u0000\u0000\u0000^_\u0003\u001e\u000f\u0000_`\u0005"+
		"5\u0000\u0000`b\u0005\u0005\u0000\u0000ac\u0003\"\u0011\u0000ba\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000"+
		"de\u0005\u0006\u0000\u0000ef\u0003\u0014\n\u0000f\u0011\u0001\u0000\u0000"+
		"\u0000gh\u00055\u0000\u0000hi\u0005\u0005\u0000\u0000ij\u0005\u0006\u0000"+
		"\u0000jk\u0003\u0014\n\u0000k\u0013\u0001\u0000\u0000\u0000lp\u0005\u0003"+
		"\u0000\u0000mo\u0003\u0016\u000b\u0000nm\u0001\u0000\u0000\u0000or\u0001"+
		"\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000"+
		"qs\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000st\u0005\u0004\u0000"+
		"\u0000t\u0015\u0001\u0000\u0000\u0000u\u00b2\u0003\b\u0004\u0000v\u00b2"+
		"\u0003\u0014\n\u0000wx\u0005*\u0000\u0000xy\u0005\u0005\u0000\u0000yz"+
		"\u0003\u0018\f\u0000z{\u0005\u0006\u0000\u0000{~\u0003\u0016\u000b\u0000"+
		"|}\u0005+\u0000\u0000}\u007f\u0003\u0016\u000b\u0000~|\u0001\u0000\u0000"+
		"\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u00b2\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0005.\u0000\u0000\u0081\u00b2\u0005\u0002\u0000\u0000\u0082"+
		"\u0083\u0005/\u0000\u0000\u0083\u00b2\u0005\u0002\u0000\u0000\u0084\u0086"+
		"\u00050\u0000\u0000\u0085\u0087\u0003\u0018\f\u0000\u0086\u0085\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0001"+
		"\u0000\u0000\u0000\u0088\u00b2\u0005\u0002\u0000\u0000\u0089\u008a\u0005"+
		"-\u0000\u0000\u008a\u008b\u0005\u0005\u0000\u0000\u008b\u008c\u0003\u0018"+
		"\f\u0000\u008c\u008d\u0005\u0006\u0000\u0000\u008d\u008e\u0003\u0016\u000b"+
		"\u0000\u008e\u00b2\u0001\u0000\u0000\u0000\u008f\u0090\u0005,\u0000\u0000"+
		"\u0090\u0092\u0005\u0005\u0000\u0000\u0091\u0093\u0003\u0018\f\u0000\u0092"+
		"\u0091\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0001\u0000\u0000\u0000\u0094\u0096\u0005\u0002\u0000\u0000\u0095"+
		"\u0097\u0003\u0018\f\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009a"+
		"\u0005\u0002\u0000\u0000\u0099\u009b\u0003\u0018\f\u0000\u009a\u0099\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009c\u0001"+
		"\u0000\u0000\u0000\u009c\u009d\u0005\u0006\u0000\u0000\u009d\u00b2\u0003"+
		"\u0016\u000b\u0000\u009e\u009f\u0005,\u0000\u0000\u009f\u00a1\u0005\u0005"+
		"\u0000\u0000\u00a0\u00a2\u0003\n\u0005\u0000\u00a1\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a5\u0005\u0002\u0000\u0000\u00a4\u00a6\u0003\u0018\f\u0000"+
		"\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a9\u0005\u0002\u0000\u0000"+
		"\u00a8\u00aa\u0003\u0018\f\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0005\u0006\u0000\u0000\u00ac\u00b2\u0003\u0016\u000b\u0000\u00ad"+
		"\u00ae\u0003\u0018\f\u0000\u00ae\u00af\u0005\u0002\u0000\u0000\u00af\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b2\u0005\u0002\u0000\u0000\u00b1u\u0001"+
		"\u0000\u0000\u0000\u00b1v\u0001\u0000\u0000\u0000\u00b1w\u0001\u0000\u0000"+
		"\u0000\u00b1\u0080\u0001\u0000\u0000\u0000\u00b1\u0082\u0001\u0000\u0000"+
		"\u0000\u00b1\u0084\u0001\u0000\u0000\u0000\u00b1\u0089\u0001\u0000\u0000"+
		"\u0000\u00b1\u008f\u0001\u0000\u0000\u0000\u00b1\u009e\u0001\u0000\u0000"+
		"\u0000\u00b1\u00ad\u0001\u0000\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b2\u0017\u0001\u0000\u0000\u0000\u00b3\u00b4\u0006\f\uffff\uffff"+
		"\u0000\u00b4\u00c8\u0003\u0002\u0001\u0000\u00b5\u00c8\u00055\u0000\u0000"+
		"\u00b6\u00c8\u0003$\u0012\u0000\u00b7\u00b8\u0005\u0005\u0000\u0000\u00b8"+
		"\u00b9\u0003\u0018\f\u0000\u00b9\u00ba\u0005\u0006\u0000\u0000\u00ba\u00c8"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bc\u00055\u0000\u0000\u00bc\u00be\u0005"+
		"\u0005\u0000\u0000\u00bd\u00bf\u0003 \u0010\u0000\u00be\u00bd\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c8\u0005\u0006\u0000\u0000\u00c1\u00c2\u0007\u0002"+
		"\u0000\u0000\u00c2\u00c8\u0003\u0018\f\u000f\u00c3\u00c4\u0005\f\u0000"+
		"\u0000\u00c4\u00c8\u0003\u0018\f\u000e\u00c5\u00c6\u0007\u0003\u0000\u0000"+
		"\u00c6\u00c8\u0003\u0018\f\r\u00c7\u00b3\u0001\u0000\u0000\u0000\u00c7"+
		"\u00b5\u0001\u0000\u0000\u0000\u00c7\u00b6\u0001\u0000\u0000\u0000\u00c7"+
		"\u00b7\u0001\u0000\u0000\u0000\u00c7\u00bb\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c7\u00c3\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c8\u0104\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\n\f\u0000\u0000\u00ca\u00cb\u0007\u0004\u0000\u0000\u00cb\u0103"+
		"\u0003\u0018\f\r\u00cc\u00cd\n\u000b\u0000\u0000\u00cd\u00ce\u0007\u0005"+
		"\u0000\u0000\u00ce\u0103\u0003\u0018\f\f\u00cf\u00d0\n\n\u0000\u0000\u00d0"+
		"\u00d1\u0007\u0006\u0000\u0000\u00d1\u0103\u0003\u0018\f\u000b\u00d2\u00d3"+
		"\n\t\u0000\u0000\u00d3\u00d4\u0007\u0007\u0000\u0000\u00d4\u0103\u0003"+
		"\u0018\f\n\u00d5\u00d6\n\b\u0000\u0000\u00d6\u00d7\u0007\b\u0000\u0000"+
		"\u00d7\u0103\u0003\u0018\f\t\u00d8\u00d9\n\u0007\u0000\u0000\u00d9\u00da"+
		"\u0005\u0019\u0000\u0000\u00da\u0103\u0003\u0018\f\b\u00db\u00dc\n\u0006"+
		"\u0000\u0000\u00dc\u00dd\u0005\u001b\u0000\u0000\u00dd\u0103\u0003\u0018"+
		"\f\u0007\u00de\u00df\n\u0005\u0000\u0000\u00df\u00e0\u0005\u001a\u0000"+
		"\u0000\u00e0\u0103\u0003\u0018\f\u0006\u00e1\u00e2\n\u0004\u0000\u0000"+
		"\u00e2\u00e3\u0005\u0016\u0000\u0000\u00e3\u0103\u0003\u0018\f\u0005\u00e4"+
		"\u00e5\n\u0003\u0000\u0000\u00e5\u00e6\u0005\u0017\u0000\u0000\u00e6\u0103"+
		"\u0003\u0018\f\u0004\u00e7\u00e8\n\u0002\u0000\u0000\u00e8\u00e9\u0005"+
		"\t\u0000\u0000\u00e9\u00ea\u0003\u0018\f\u0000\u00ea\u00eb\u0005\n\u0000"+
		"\u0000\u00eb\u00ec\u0003\u0018\f\u0002\u00ec\u0103\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ee\n\u0001\u0000\u0000\u00ee\u00ef\u0005\u001f\u0000\u0000\u00ef"+
		"\u0103\u0003\u0018\f\u0001\u00f0\u00f1\n\u0013\u0000\u0000\u00f1\u00f2"+
		"\u0005\u0007\u0000\u0000\u00f2\u00f3\u0003\u0018\f\u0000\u00f3\u00f4\u0005"+
		"\b\u0000\u0000\u00f4\u0103\u0001\u0000\u0000\u0000\u00f5\u00f6\n\u0012"+
		"\u0000\u0000\u00f6\u00f7\u0005\"\u0000\u0000\u00f7\u0103\u00055\u0000"+
		"\u0000\u00f8\u00f9\n\u0011\u0000\u0000\u00f9\u00fa\u0005\"\u0000\u0000"+
		"\u00fa\u00fb\u00055\u0000\u0000\u00fb\u00fd\u0005\u0005\u0000\u0000\u00fc"+
		"\u00fe\u0003 \u0010\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fd\u00fe"+
		"\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0103"+
		"\u0005\u0006\u0000\u0000\u0100\u0101\n\u0010\u0000\u0000\u0101\u0103\u0007"+
		"\u0002\u0000\u0000\u0102\u00c9\u0001\u0000\u0000\u0000\u0102\u00cc\u0001"+
		"\u0000\u0000\u0000\u0102\u00cf\u0001\u0000\u0000\u0000\u0102\u00d2\u0001"+
		"\u0000\u0000\u0000\u0102\u00d5\u0001\u0000\u0000\u0000\u0102\u00d8\u0001"+
		"\u0000\u0000\u0000\u0102\u00db\u0001\u0000\u0000\u0000\u0102\u00de\u0001"+
		"\u0000\u0000\u0000\u0102\u00e1\u0001\u0000\u0000\u0000\u0102\u00e4\u0001"+
		"\u0000\u0000\u0000\u0102\u00e7\u0001\u0000\u0000\u0000\u0102\u00ed\u0001"+
		"\u0000\u0000\u0000\u0102\u00f0\u0001\u0000\u0000\u0000\u0102\u00f5\u0001"+
		"\u0000\u0000\u0000\u0102\u00f8\u0001\u0000\u0000\u0000\u0102\u0100\u0001"+
		"\u0000\u0000\u0000\u0103\u0106\u0001\u0000\u0000\u0000\u0104\u0102\u0001"+
		"\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0019\u0001"+
		"\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0107\u0108\u0005"+
		"\u0007\u0000\u0000\u0108\u0109\u0005\b\u0000\u0000\u0109\u001b\u0001\u0000"+
		"\u0000\u0000\u010a\u010c\u0005\u0007\u0000\u0000\u010b\u010d\u0003\u0018"+
		"\f\u0000\u010c\u010b\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000"+
		"\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u010f\u0005\b\u0000\u0000"+
		"\u010f\u001d\u0001\u0000\u0000\u0000\u0110\u0114\u0007\t\u0000\u0000\u0111"+
		"\u0113\u0003\u001a\r\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u0113\u0116"+
		"\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0115"+
		"\u0001\u0000\u0000\u0000\u0115\u001f\u0001\u0000\u0000\u0000\u0116\u0114"+
		"\u0001\u0000\u0000\u0000\u0117\u011c\u0003\u0018\f\u0000\u0118\u0119\u0005"+
		"\u0001\u0000\u0000\u0119\u011b\u0003\u0018\f\u0000\u011a\u0118\u0001\u0000"+
		"\u0000\u0000\u011b\u011e\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000"+
		"\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d!\u0001\u0000\u0000"+
		"\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011f\u0120\u0003\u001e\u000f"+
		"\u0000\u0120\u0127\u00055\u0000\u0000\u0121\u0122\u0005\u0001\u0000\u0000"+
		"\u0122\u0123\u0003\u001e\u000f\u0000\u0123\u0124\u00055\u0000\u0000\u0124"+
		"\u0126\u0001\u0000\u0000\u0000\u0125\u0121\u0001\u0000\u0000\u0000\u0126"+
		"\u0129\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0127"+
		"\u0128\u0001\u0000\u0000\u0000\u0128#\u0001\u0000\u0000\u0000\u0129\u0127"+
		"\u0001\u0000\u0000\u0000\u012a\u012b\u0005(\u0000\u0000\u012b\u012e\u0003"+
		"&\u0013\u0000\u012c\u012d\u0005\u0005\u0000\u0000\u012d\u012f\u0005\u0006"+
		"\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000"+
		"\u0000\u0000\u012f%\u0001\u0000\u0000\u0000\u0130\u0132\u0003\u0000\u0000"+
		"\u0000\u0131\u0133\u0003\u001c\u000e\u0000\u0132\u0131\u0001\u0000\u0000"+
		"\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000"+
		"\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u013e\u0001\u0000\u0000"+
		"\u0000\u0136\u0138\u00055\u0000\u0000\u0137\u0139\u0003\u001c\u000e\u0000"+
		"\u0138\u0137\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000"+
		"\u013a\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000"+
		"\u013b\u013e\u0001\u0000\u0000\u0000\u013c\u013e\u00055\u0000\u0000\u013d"+
		"\u0130\u0001\u0000\u0000\u0000\u013d\u0136\u0001\u0000\u0000\u0000\u013d"+
		"\u013c\u0001\u0000\u0000\u0000\u013e\'\u0001\u0000\u0000\u0000\u001f/"+
		"5=HNVXbp~\u0086\u0092\u0096\u009a\u00a1\u00a5\u00a9\u00b1\u00be\u00c7"+
		"\u00fd\u0102\u0104\u010c\u0114\u011c\u0127\u012e\u0134\u013a\u013d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}