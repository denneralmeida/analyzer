// Generated from .\MiniJava.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, ID=33, INT=34, BOOLEAN=35, WS=36, COMMENT=37, LINE_COMMENT=38;
	public static final int
		RULE_prog = 0, RULE_mainClass = 1, RULE_classDecl = 2, RULE_varDecl = 3, 
		RULE_methodDecl = 4, RULE_formalList = 5, RULE_type = 6, RULE_statement = 7, 
		RULE_condExpr = 8, RULE_expr = 9, RULE_atom = 10;
	public static final String[] ruleNames = {
		"prog", "mainClass", "classDecl", "varDecl", "methodDecl", "formalList", 
		"type", "statement", "condExpr", "expr", "atom"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'{'", "'public'", "'static'", "'void'", "'main'", "'('", 
		"'String'", "'['", "']'", "')'", "'}'", "';'", "','", "'return'", "'int'", 
		"'boolean'", "'System.out.println'", "'='", "'while'", "'if'", "'else'", 
		"'!'", "'<'", "'&&'", "'+'", "'-'", "'*'", "'.'", "'length'", "'this'", 
		"'new'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "ID", "INT", "BOOLEAN", 
		"WS", "COMMENT", "LINE_COMMENT"
	};
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
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public List<ClassDeclContext> classDecl() {
			return getRuleContexts(ClassDeclContext.class);
		}
		public ClassDeclContext classDecl(int i) {
			return getRuleContext(ClassDeclContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			mainClass();
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(23);
				classDecl();
				}
				}
				setState(28);
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

	public static class MainClassContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiniJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniJavaParser.ID, i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(T__0);
			setState(30);
			match(ID);
			setState(31);
			match(T__1);
			setState(32);
			match(T__2);
			setState(33);
			match(T__3);
			setState(34);
			match(T__4);
			setState(35);
			match(T__5);
			setState(36);
			match(T__6);
			setState(37);
			match(T__7);
			setState(38);
			match(T__8);
			setState(39);
			match(T__9);
			setState(40);
			match(ID);
			setState(41);
			match(T__10);
			setState(42);
			match(T__1);
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(43);
					varDecl();
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << ID))) != 0)) {
				{
				{
				setState(49);
				statement();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			match(T__11);
			setState(56);
			match(T__11);
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

	public static class ClassDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<MethodDeclContext> methodDecl() {
			return getRuleContexts(MethodDeclContext.class);
		}
		public MethodDeclContext methodDecl(int i) {
			return getRuleContext(MethodDeclContext.class,i);
		}
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__0);
			setState(59);
			match(ID);
			setState(60);
			match(T__1);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << ID))) != 0)) {
				{
				{
				setState(61);
				varDecl();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(67);
				methodDecl();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			match(T__11);
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

	public static class VarDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			type();
			setState(76);
			match(ID);
			setState(77);
			match(T__12);
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

	public static class MethodDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<FormalListContext> formalList() {
			return getRuleContexts(FormalListContext.class);
		}
		public FormalListContext formalList(int i) {
			return getRuleContext(FormalListContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDecl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__2);
			setState(80);
			type();
			setState(81);
			match(ID);
			setState(82);
			match(T__6);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << ID))) != 0)) {
				{
				setState(83);
				formalList();
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(84);
					match(T__13);
					setState(86); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(85);
						formalList();
						}
						}
						setState(88); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << ID))) != 0) );
					}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(97);
			match(T__10);
			setState(98);
			match(T__1);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(99);
					varDecl();
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << ID))) != 0)) {
				{
				{
				setState(105);
				statement();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			match(T__14);
			setState(112);
			expr();
			setState(113);
			match(T__12);
			setState(114);
			match(T__11);
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

	public static class FormalListContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public FormalListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalList; }
	}

	public final FormalListContext formalList() throws RecognitionException {
		FormalListContext _localctx = new FormalListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_formalList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			type();
			setState(117);
			match(ID);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(T__15);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(T__15);
				setState(121);
				match(T__8);
				setState(122);
				match(T__9);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				match(T__16);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
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

	public static class StatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(MiniJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniJavaParser.ID, i);
		}
		public TerminalNode INT() { return getToken(MiniJavaParser.INT, 0); }
		public CondExprContext condExpr() {
			return getRuleContext(CondExprContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(T__1);
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << ID))) != 0)) {
					{
					{
					setState(128);
					statement();
					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(134);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(T__17);
				setState(136);
				match(T__6);
				setState(137);
				expr();
				setState(138);
				match(T__10);
				setState(139);
				match(T__12);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				match(ID);
				setState(142);
				match(T__18);
				setState(143);
				expr();
				setState(144);
				match(T__12);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				match(ID);
				setState(147);
				match(T__8);
				setState(148);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(149);
				match(T__9);
				setState(150);
				match(T__18);
				setState(151);
				expr();
				setState(152);
				match(T__12);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(154);
				match(T__19);
				setState(155);
				match(T__6);
				setState(156);
				condExpr(0);
				setState(157);
				match(T__10);
				setState(158);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(160);
				match(T__20);
				setState(161);
				match(T__6);
				setState(162);
				condExpr(0);
				setState(163);
				match(T__10);
				setState(164);
				statement();
				setState(165);
				match(T__21);
				setState(166);
				statement();
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

	public static class CondExprContext extends ParserRuleContext {
		public List<CondExprContext> condExpr() {
			return getRuleContexts(CondExprContext.class);
		}
		public CondExprContext condExpr(int i) {
			return getRuleContext(CondExprContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CondExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condExpr; }
	}

	public final CondExprContext condExpr() throws RecognitionException {
		return condExpr(0);
	}

	private CondExprContext condExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondExprContext _localctx = new CondExprContext(_ctx, _parentState);
		CondExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_condExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(171);
				match(T__6);
				setState(172);
				condExpr(0);
				setState(173);
				match(T__10);
				}
				break;
			case 2:
				{
				setState(175);
				match(T__22);
				setState(176);
				condExpr(4);
				}
				break;
			case 3:
				{
				setState(177);
				expr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(186);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new CondExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condExpr);
						setState(180);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(181);
						match(T__23);
						setState(182);
						condExpr(4);
						}
						break;
					case 2:
						{
						_localctx = new CondExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condExpr);
						setState(183);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(184);
						match(T__24);
						setState(185);
						condExpr(3);
						}
						break;
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class ExprContext extends ParserRuleContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr);
		int _la;
		try {
			int _alt;
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				atom();
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(198);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__25:
							{
							setState(192);
							match(T__25);
							setState(193);
							atom();
							}
							break;
						case T__26:
							{
							setState(194);
							match(T__26);
							setState(195);
							atom();
							}
							break;
						case T__27:
							{
							setState(196);
							match(T__27);
							setState(197);
							atom();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(202);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				_la = _input.LA(1);
				if ( !(_la==T__25 || _la==T__26) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(204);
				atom();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				atom();
				setState(206);
				match(T__8);
				setState(207);
				expr();
				setState(208);
				match(T__9);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				atom();
				setState(211);
				match(T__28);
				setState(212);
				match(T__29);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(214);
				atom();
				setState(215);
				match(T__28);
				setState(216);
				match(ID);
				setState(217);
				match(T__6);
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__25) | (1L << T__26) | (1L << T__30) | (1L << T__31) | (1L << ID) | (1L << INT))) != 0)) {
					{
					setState(218);
					expr();
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__13) {
						{
						{
						setState(219);
						match(T__13);
						setState(220);
						expr();
						}
						}
						setState(225);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(228);
				match(T__10);
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

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MiniJavaParser.INT, 0); }
		public List<TerminalNode> ID() { return getTokens(MiniJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniJavaParser.ID, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(232);
				match(INT);
				}
				break;
			case 2:
				{
				setState(233);
				_la = _input.LA(1);
				if ( !(_la==T__30 || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(240);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(234);
					match(T__28);
					setState(235);
					match(ID);
					setState(236);
					match(T__6);
					setState(237);
					expr();
					setState(238);
					match(T__10);
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(242);
				match(T__31);
				setState(243);
				match(ID);
				setState(244);
				match(T__6);
				setState(245);
				match(T__10);
				}
				break;
			case 4:
				{
				setState(246);
				match(T__30);
				}
				break;
			case 5:
				{
				setState(247);
				match(T__31);
				setState(248);
				match(T__15);
				setState(249);
				match(T__8);
				setState(250);
				expr();
				setState(251);
				match(T__9);
				}
				break;
			case 6:
				{
				setState(253);
				match(T__6);
				setState(254);
				expr();
				setState(255);
				match(T__10);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return condExpr_sempred((CondExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condExpr_sempred(CondExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u0106\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3/\n\3\f\3\16\3\62\13\3\3\3\7"+
		"\3\65\n\3\f\3\16\38\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4A\n\4\f\4\16\4"+
		"D\13\4\3\4\7\4G\n\4\f\4\16\4J\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\6\6Y\n\6\r\6\16\6Z\7\6]\n\6\f\6\16\6`\13\6\5\6b\n\6\3"+
		"\6\3\6\3\6\7\6g\n\6\f\6\16\6j\13\6\3\6\7\6m\n\6\f\6\16\6p\13\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0080\n\b\3\t\3\t"+
		"\7\t\u0084\n\t\f\t\16\t\u0087\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ab\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u00b5\n\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00bd\n\n\f\n\16\n\u00c0"+
		"\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00c9\n\13\f\13\16\13\u00cc"+
		"\13\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\7\13\u00e0\n\13\f\13\16\13\u00e3\13\13\5\13"+
		"\u00e5\n\13\3\13\3\13\5\13\u00e9\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u00f3\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u0104\n\f\3\f\2\3\22\r\2\4\6\b\n\f\16\20\22\24\26\2\5\3\2#$\3"+
		"\2\34\35\4\2!!##\2\u0120\2\30\3\2\2\2\4\37\3\2\2\2\6<\3\2\2\2\bM\3\2\2"+
		"\2\nQ\3\2\2\2\fv\3\2\2\2\16\177\3\2\2\2\20\u00aa\3\2\2\2\22\u00b4\3\2"+
		"\2\2\24\u00e8\3\2\2\2\26\u0103\3\2\2\2\30\34\5\4\3\2\31\33\5\6\4\2\32"+
		"\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\3\3\2\2\2\36"+
		"\34\3\2\2\2\37 \7\3\2\2 !\7#\2\2!\"\7\4\2\2\"#\7\5\2\2#$\7\6\2\2$%\7\7"+
		"\2\2%&\7\b\2\2&\'\7\t\2\2\'(\7\n\2\2()\7\13\2\2)*\7\f\2\2*+\7#\2\2+,\7"+
		"\r\2\2,\60\7\4\2\2-/\5\b\5\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3"+
		"\2\2\2\61\66\3\2\2\2\62\60\3\2\2\2\63\65\5\20\t\2\64\63\3\2\2\2\658\3"+
		"\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29:\7\16\2\2"+
		":;\7\16\2\2;\5\3\2\2\2<=\7\3\2\2=>\7#\2\2>B\7\4\2\2?A\5\b\5\2@?\3\2\2"+
		"\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CH\3\2\2\2DB\3\2\2\2EG\5\n\6\2FE\3\2\2"+
		"\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KL\7\16\2\2L\7\3\2"+
		"\2\2MN\5\16\b\2NO\7#\2\2OP\7\17\2\2P\t\3\2\2\2QR\7\5\2\2RS\5\16\b\2ST"+
		"\7#\2\2Ta\7\t\2\2U^\5\f\7\2VX\7\20\2\2WY\5\f\7\2XW\3\2\2\2YZ\3\2\2\2Z"+
		"X\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\V\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2"+
		"\2_b\3\2\2\2`^\3\2\2\2aU\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7\r\2\2dh\7\4\2"+
		"\2eg\5\b\5\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2in\3\2\2\2jh\3\2\2"+
		"\2km\5\20\t\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2"+
		"\2\2qr\7\21\2\2rs\5\24\13\2st\7\17\2\2tu\7\16\2\2u\13\3\2\2\2vw\5\16\b"+
		"\2wx\7#\2\2x\r\3\2\2\2y\u0080\7\22\2\2z{\7\22\2\2{|\7\13\2\2|\u0080\7"+
		"\f\2\2}\u0080\7\23\2\2~\u0080\7#\2\2\177y\3\2\2\2\177z\3\2\2\2\177}\3"+
		"\2\2\2\177~\3\2\2\2\u0080\17\3\2\2\2\u0081\u0085\7\4\2\2\u0082\u0084\5"+
		"\20\t\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u00ab\7\16"+
		"\2\2\u0089\u008a\7\24\2\2\u008a\u008b\7\t\2\2\u008b\u008c\5\24\13\2\u008c"+
		"\u008d\7\r\2\2\u008d\u008e\7\17\2\2\u008e\u00ab\3\2\2\2\u008f\u0090\7"+
		"#\2\2\u0090\u0091\7\25\2\2\u0091\u0092\5\24\13\2\u0092\u0093\7\17\2\2"+
		"\u0093\u00ab\3\2\2\2\u0094\u0095\7#\2\2\u0095\u0096\7\13\2\2\u0096\u0097"+
		"\t\2\2\2\u0097\u0098\7\f\2\2\u0098\u0099\7\25\2\2\u0099\u009a\5\24\13"+
		"\2\u009a\u009b\7\17\2\2\u009b\u00ab\3\2\2\2\u009c\u009d\7\26\2\2\u009d"+
		"\u009e\7\t\2\2\u009e\u009f\5\22\n\2\u009f\u00a0\7\r\2\2\u00a0\u00a1\5"+
		"\20\t\2\u00a1\u00ab\3\2\2\2\u00a2\u00a3\7\27\2\2\u00a3\u00a4\7\t\2\2\u00a4"+
		"\u00a5\5\22\n\2\u00a5\u00a6\7\r\2\2\u00a6\u00a7\5\20\t\2\u00a7\u00a8\7"+
		"\30\2\2\u00a8\u00a9\5\20\t\2\u00a9\u00ab\3\2\2\2\u00aa\u0081\3\2\2\2\u00aa"+
		"\u0089\3\2\2\2\u00aa\u008f\3\2\2\2\u00aa\u0094\3\2\2\2\u00aa\u009c\3\2"+
		"\2\2\u00aa\u00a2\3\2\2\2\u00ab\21\3\2\2\2\u00ac\u00ad\b\n\1\2\u00ad\u00ae"+
		"\7\t\2\2\u00ae\u00af\5\22\n\2\u00af\u00b0\7\r\2\2\u00b0\u00b5\3\2\2\2"+
		"\u00b1\u00b2\7\31\2\2\u00b2\u00b5\5\22\n\6\u00b3\u00b5\5\24\13\2\u00b4"+
		"\u00ac\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00be\3\2"+
		"\2\2\u00b6\u00b7\f\5\2\2\u00b7\u00b8\7\32\2\2\u00b8\u00bd\5\22\n\6\u00b9"+
		"\u00ba\f\4\2\2\u00ba\u00bb\7\33\2\2\u00bb\u00bd\5\22\n\5\u00bc\u00b6\3"+
		"\2\2\2\u00bc\u00b9\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\23\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00ca\5\26\f"+
		"\2\u00c2\u00c3\7\34\2\2\u00c3\u00c9\5\26\f\2\u00c4\u00c5\7\35\2\2\u00c5"+
		"\u00c9\5\26\f\2\u00c6\u00c7\7\36\2\2\u00c7\u00c9\5\26\f\2\u00c8\u00c2"+
		"\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00e9\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cd\u00ce\t\3\2\2\u00ce\u00e9\5\26\f\2\u00cf\u00d0\5\26\f\2\u00d0"+
		"\u00d1\7\13\2\2\u00d1\u00d2\5\24\13\2\u00d2\u00d3\7\f\2\2\u00d3\u00e9"+
		"\3\2\2\2\u00d4\u00d5\5\26\f\2\u00d5\u00d6\7\37\2\2\u00d6\u00d7\7 \2\2"+
		"\u00d7\u00e9\3\2\2\2\u00d8\u00d9\5\26\f\2\u00d9\u00da\7\37\2\2\u00da\u00db"+
		"\7#\2\2\u00db\u00e4\7\t\2\2\u00dc\u00e1\5\24\13\2\u00dd\u00de\7\20\2\2"+
		"\u00de\u00e0\5\24\13\2\u00df\u00dd\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df"+
		"\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4"+
		"\u00dc\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\7\r"+
		"\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00c1\3\2\2\2\u00e8\u00cd\3\2\2\2\u00e8"+
		"\u00cf\3\2\2\2\u00e8\u00d4\3\2\2\2\u00e8\u00d8\3\2\2\2\u00e9\25\3\2\2"+
		"\2\u00ea\u0104\7$\2\2\u00eb\u00f2\t\4\2\2\u00ec\u00ed\7\37\2\2\u00ed\u00ee"+
		"\7#\2\2\u00ee\u00ef\7\t\2\2\u00ef\u00f0\5\24\13\2\u00f0\u00f1\7\r\2\2"+
		"\u00f1\u00f3\3\2\2\2\u00f2\u00ec\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u0104"+
		"\3\2\2\2\u00f4\u00f5\7\"\2\2\u00f5\u00f6\7#\2\2\u00f6\u00f7\7\t\2\2\u00f7"+
		"\u0104\7\r\2\2\u00f8\u0104\7!\2\2\u00f9\u00fa\7\"\2\2\u00fa\u00fb\7\22"+
		"\2\2\u00fb\u00fc\7\13\2\2\u00fc\u00fd\5\24\13\2\u00fd\u00fe\7\f\2\2\u00fe"+
		"\u0104\3\2\2\2\u00ff\u0100\7\t\2\2\u0100\u0101\5\24\13\2\u0101\u0102\7"+
		"\r\2\2\u0102\u0104\3\2\2\2\u0103\u00ea\3\2\2\2\u0103\u00eb\3\2\2\2\u0103"+
		"\u00f4\3\2\2\2\u0103\u00f8\3\2\2\2\u0103\u00f9\3\2\2\2\u0103\u00ff\3\2"+
		"\2\2\u0104\27\3\2\2\2\31\34\60\66BHZ^ahn\177\u0085\u00aa\u00b4\u00bc\u00be"+
		"\u00c8\u00ca\u00e1\u00e4\u00e8\u00f2\u0103";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}