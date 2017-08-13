// Generated from /home/milderhc/Documents/lenguajes/ta/antlr/qb64-parser/grammar/QB64v3.g4 by ANTLR 4.6
package semantic.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QB64v3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTEGERV=1, LONGV=2, SINGLEV=3, DOUBLEV=4, STRINGV=5, EQUAL=6, POT=7, 
		DIV=8, PRODUCT=9, ADD=10, SUBT=11, DIFF=12, LESS=13, LESSOREQUAL=14, GREATER=15, 
		GREATEROREQUAL=16, SEMICOLON=17, COLON=18, COMMA=19, LEFTPAR=20, RIGHTPAR=21, 
		SINGLESUFFIX=22, DOUBLESUFFIX=23, INTEGERSUFFIX=24, LONGSUFFIX=25, STRINGSUFFIX=26, 
		INPUT=27, PRINT=28, IF=29, THEN=30, ELSE=31, ELSEIF=32, END=33, WHILE=34, 
		WEND=35, DO=36, LOOP=37, UNTIL=38, FOR=39, TO=40, STEP=41, NEXT=42, INTEGER=43, 
		SINGLE=44, DOUBLE=45, LONG=46, STRING=47, DIM=48, AS=49, NOT=50, OR=51, 
		AND=52, XOR=53, MOD=54, SUB=55, FUNCTION=56, SELECT=57, CASE=58, SHARED=59, 
		CONST=60, ID=61, COMMENT=62, WS=63;
	public static final int
		RULE_qb = 0, RULE_instruction = 1, RULE_declaration = 2, RULE_dimId = 3, 
		RULE_id = 4, RULE_callId = 5, RULE_singleId = 6, RULE_array = 7, RULE_constDeclaration = 8, 
		RULE_assignment = 9, RULE_expression = 10, RULE_argExpression = 11, RULE_callSub = 12, 
		RULE_input = 13, RULE_print = 14, RULE_ifBlock = 15, RULE_whileBlock = 16, 
		RULE_doWhileBlock = 17, RULE_doUntilBlock = 18, RULE_forBlock = 19, RULE_selectBlock = 20, 
		RULE_instructionBlock = 21, RULE_funproc = 22, RULE_funprocPar = 23, RULE_suffix = 24;
	public static final String[] ruleNames = {
		"qb", "instruction", "declaration", "dimId", "id", "callId", "singleId", 
		"array", "constDeclaration", "assignment", "expression", "argExpression", 
		"callSub", "input", "print", "ifBlock", "whileBlock", "doWhileBlock", 
		"doUntilBlock", "forBlock", "selectBlock", "instructionBlock", "funproc", 
		"funprocPar", "suffix"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'='", "'^'", "'/'", "'*'", "'+'", 
		"'-'", "'<>'", "'<'", "'<='", "'>'", "'>='", "';'", "':'", "','", "'('", 
		"')'", "'!'", "'#'", "'%'", "'&'", "'$'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INTEGERV", "LONGV", "SINGLEV", "DOUBLEV", "STRINGV", "EQUAL", "POT", 
		"DIV", "PRODUCT", "ADD", "SUBT", "DIFF", "LESS", "LESSOREQUAL", "GREATER", 
		"GREATEROREQUAL", "SEMICOLON", "COLON", "COMMA", "LEFTPAR", "RIGHTPAR", 
		"SINGLESUFFIX", "DOUBLESUFFIX", "INTEGERSUFFIX", "LONGSUFFIX", "STRINGSUFFIX", 
		"INPUT", "PRINT", "IF", "THEN", "ELSE", "ELSEIF", "END", "WHILE", "WEND", 
		"DO", "LOOP", "UNTIL", "FOR", "TO", "STEP", "NEXT", "INTEGER", "SINGLE", 
		"DOUBLE", "LONG", "STRING", "DIM", "AS", "NOT", "OR", "AND", "XOR", "MOD", 
		"SUB", "FUNCTION", "SELECT", "CASE", "SHARED", "CONST", "ID", "COMMENT", 
		"WS"
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
	public String getGrammarFileName() { return "QB64v3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QB64v3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class QbContext extends ParserRuleContext {
		public InstructionBlockContext instructionBlock() {
			return getRuleContext(InstructionBlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(QB64v3Parser.EOF, 0); }
		public List<FunprocContext> funproc() {
			return getRuleContexts(FunprocContext.class);
		}
		public FunprocContext funproc(int i) {
			return getRuleContext(FunprocContext.class,i);
		}
		public QbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterQb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitQb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitQb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QbContext qb() throws RecognitionException {
		QbContext _localctx = new QbContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_qb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			instructionBlock();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUB || _la==FUNCTION) {
				{
				{
				setState(51);
				funproc();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			match(EOF);
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

	public static class InstructionContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public WhileBlockContext whileBlock() {
			return getRuleContext(WhileBlockContext.class,0);
		}
		public DoWhileBlockContext doWhileBlock() {
			return getRuleContext(DoWhileBlockContext.class,0);
		}
		public DoUntilBlockContext doUntilBlock() {
			return getRuleContext(DoUntilBlockContext.class,0);
		}
		public ForBlockContext forBlock() {
			return getRuleContext(ForBlockContext.class,0);
		}
		public SelectBlockContext selectBlock() {
			return getRuleContext(SelectBlockContext.class,0);
		}
		public CallSubContext callSub() {
			return getRuleContext(CallSubContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruction);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				constDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				ifBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				whileBlock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(64);
				doWhileBlock();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(65);
				doUntilBlock();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(66);
				forBlock();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(67);
				selectBlock();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(68);
				callSub();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(69);
				print();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(70);
				input();
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

	public static class DeclarationContext extends ParserRuleContext {
		public Token type;
		public TerminalNode DIM() { return getToken(QB64v3Parser.DIM, 0); }
		public List<DimIdContext> dimId() {
			return getRuleContexts(DimIdContext.class);
		}
		public DimIdContext dimId(int i) {
			return getRuleContext(DimIdContext.class,i);
		}
		public TerminalNode AS() { return getToken(QB64v3Parser.AS, 0); }
		public TerminalNode INTEGER() { return getToken(QB64v3Parser.INTEGER, 0); }
		public TerminalNode LONG() { return getToken(QB64v3Parser.LONG, 0); }
		public TerminalNode SINGLE() { return getToken(QB64v3Parser.SINGLE, 0); }
		public TerminalNode DOUBLE() { return getToken(QB64v3Parser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(QB64v3Parser.STRING, 0); }
		public TerminalNode SHARED() { return getToken(QB64v3Parser.SHARED, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(DIM);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SHARED) {
				{
				setState(74);
				match(SHARED);
				}
			}

			setState(77);
			dimId();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(78);
				match(COMMA);
				setState(79);
				dimId();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			match(AS);
			setState(86);
			((DeclarationContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << SINGLE) | (1L << DOUBLE) | (1L << LONG) | (1L << STRING))) != 0)) ) {
				((DeclarationContext)_localctx).type = (Token)_errHandler.recoverInline(this);
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

	public static class DimIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QB64v3Parser.ID, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public DimIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterDimId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitDimId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitDimId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimIdContext dimId() throws RecognitionException {
		DimIdContext _localctx = new DimIdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dimId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(ID);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTPAR) {
				{
				setState(89);
				array();
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

	public static class IdContext extends ParserRuleContext {
		public SingleIdContext singleId() {
			return getRuleContext(SingleIdContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			singleId();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTPAR) {
				{
				setState(93);
				match(LEFTPAR);
				setState(94);
				expression(0);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(95);
					match(COMMA);
					setState(96);
					expression(0);
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(102);
				match(RIGHTPAR);
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

	public static class CallIdContext extends ParserRuleContext {
		public SingleIdContext singleId() {
			return getRuleContext(SingleIdContext.class,0);
		}
		public List<ArgExpressionContext> argExpression() {
			return getRuleContexts(ArgExpressionContext.class);
		}
		public ArgExpressionContext argExpression(int i) {
			return getRuleContext(ArgExpressionContext.class,i);
		}
		public CallIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterCallId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitCallId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitCallId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallIdContext callId() throws RecognitionException {
		CallIdContext _localctx = new CallIdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_callId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			singleId();
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(107);
				match(LEFTPAR);
				setState(108);
				argExpression();
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(109);
					match(COMMA);
					setState(110);
					argExpression();
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(116);
				match(RIGHTPAR);
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

	public static class SingleIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QB64v3Parser.ID, 0); }
		public SuffixContext suffix() {
			return getRuleContext(SuffixContext.class,0);
		}
		public SingleIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterSingleId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitSingleId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitSingleId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleIdContext singleId() throws RecognitionException {
		SingleIdContext _localctx = new SingleIdContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_singleId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(ID);
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(121);
				suffix();
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

	public static class ArrayContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(LEFTPAR);
			setState(125);
			expression(0);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(126);
				match(COMMA);
				setState(127);
				expression(0);
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			match(RIGHTPAR);
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

	public static class ConstDeclarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(QB64v3Parser.CONST, 0); }
		public List<SingleIdContext> singleId() {
			return getRuleContexts(SingleIdContext.class);
		}
		public SingleIdContext singleId(int i) {
			return getRuleContext(SingleIdContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitConstDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitConstDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(CONST);
			setState(136);
			singleId();
			setState(137);
			match(EQUAL);
			setState(138);
			expression(0);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(139);
				match(COMMA);
				setState(140);
				singleId();
				setState(141);
				match(EQUAL);
				setState(142);
				expression(0);
				}
				}
				setState(148);
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

	public static class AssignmentContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			id();
			setState(150);
			match(EQUAL);
			setState(151);
			expression(0);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EqExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterEqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitEqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueExprContext extends ExpressionContext {
		public Token value;
		public TerminalNode INTEGERV() { return getToken(QB64v3Parser.INTEGERV, 0); }
		public TerminalNode DOUBLEV() { return getToken(QB64v3Parser.DOUBLEV, 0); }
		public TerminalNode STRINGV() { return getToken(QB64v3Parser.STRINGV, 0); }
		public TerminalNode SINGLEV() { return getToken(QB64v3Parser.SINGLEV, 0); }
		public TerminalNode LONGV() { return getToken(QB64v3Parser.LONGV, 0); }
		public ValueExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterValueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitValueExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitValueExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExprContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(QB64v3Parser.NOT, 0); }
		public UnaryExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitAddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MOD() { return getToken(QB64v3Parser.MOD, 0); }
		public MulExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterMulExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitMulExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitMulExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(QB64v3Parser.OR, 0); }
		public TerminalNode XOR() { return getToken(QB64v3Parser.XOR, 0); }
		public OrExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PotExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PotExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterPotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitPotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitPotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdExprContext extends ExpressionContext {
		public CallIdContext callId() {
			return getRuleContext(CallIdContext.class,0);
		}
		public IdExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmpExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CmpExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterCmpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitCmpExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitCmpExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(QB64v3Parser.AND, 0); }
		public AndExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGERV:
			case LONGV:
			case SINGLEV:
			case DOUBLEV:
			case STRINGV:
				{
				_localctx = new ValueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(154);
				((ValueExprContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGERV) | (1L << LONGV) | (1L << SINGLEV) | (1L << DOUBLEV) | (1L << STRINGV))) != 0)) ) {
					((ValueExprContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case ID:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(155);
				callId();
				}
				break;
			case LEFTPAR:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				match(LEFTPAR);
				setState(157);
				expression(0);
				setState(158);
				match(RIGHTPAR);
				}
				break;
			case SUBT:
			case NOT:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				((UnaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==SUBT || _la==NOT) ) {
					((UnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(161);
				expression(8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(185);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new PotExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(164);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(165);
						match(POT);
						setState(166);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new MulExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(167);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(168);
						((MulExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << PRODUCT) | (1L << MOD))) != 0)) ) {
							((MulExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(169);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new AddExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(170);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(171);
						((AddExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUBT) ) {
							((AddExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(172);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new CmpExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(173);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(174);
						((CmpExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LESSOREQUAL) | (1L << GREATER) | (1L << GREATEROREQUAL))) != 0)) ) {
							((CmpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(175);
						expression(5);
						}
						break;
					case 5:
						{
						_localctx = new EqExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(176);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(177);
						((EqExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==DIFF) ) {
							((EqExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(178);
						expression(4);
						}
						break;
					case 6:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(179);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(180);
						match(AND);
						setState(181);
						expression(3);
						}
						break;
					case 7:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(182);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(183);
						((OrExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==OR || _la==XOR) ) {
							((OrExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(184);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class ArgExpressionContext extends ParserRuleContext {
		public ArgExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argExpression; }
	 
		public ArgExpressionContext() { }
		public void copyFrom(ArgExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArgArrContext extends ArgExpressionContext {
		public TerminalNode ID() { return getToken(QB64v3Parser.ID, 0); }
		public ArgArrContext(ArgExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterArgArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitArgArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitArgArr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArgExprContext extends ArgExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgExprContext(ArgExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterArgExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitArgExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitArgExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenArgExprContext extends ArgExpressionContext {
		public ArgExpressionContext argExpression() {
			return getRuleContext(ArgExpressionContext.class,0);
		}
		public ParenArgExprContext(ArgExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterParenArgExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitParenArgExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitParenArgExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgExpressionContext argExpression() throws RecognitionException {
		ArgExpressionContext _localctx = new ArgExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_argExpression);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new ArgExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				expression(0);
				}
				break;
			case 2:
				_localctx = new ArgArrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(ID);
				setState(192);
				match(LEFTPAR);
				setState(193);
				match(RIGHTPAR);
				}
				break;
			case 3:
				_localctx = new ParenArgExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				match(LEFTPAR);
				setState(195);
				argExpression();
				setState(196);
				match(RIGHTPAR);
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

	public static class CallSubContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QB64v3Parser.ID, 0); }
		public List<ArgExpressionContext> argExpression() {
			return getRuleContexts(ArgExpressionContext.class);
		}
		public ArgExpressionContext argExpression(int i) {
			return getRuleContext(ArgExpressionContext.class,i);
		}
		public CallSubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callSub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterCallSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitCallSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitCallSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallSubContext callSub() throws RecognitionException {
		CallSubContext _localctx = new CallSubContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_callSub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(ID);
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(202);
				argExpression();
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(203);
					match(COMMA);
					setState(204);
					argExpression();
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class InputContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(QB64v3Parser.INPUT, 0); }
		public List<CallIdContext> callId() {
			return getRuleContexts(CallIdContext.class);
		}
		public CallIdContext callId(int i) {
			return getRuleContext(CallIdContext.class,i);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(INPUT);
			setState(213);
			callId();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(214);
				match(COMMA);
				setState(215);
				callId();
				}
				}
				setState(220);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(QB64v3Parser.PRINT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(PRINT);
			setState(222);
			expression(0);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(223);
				match(SEMICOLON);
				setState(224);
				expression(0);
				}
				}
				setState(229);
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

	public static class IfBlockContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(QB64v3Parser.IF); }
		public TerminalNode IF(int i) {
			return getToken(QB64v3Parser.IF, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> THEN() { return getTokens(QB64v3Parser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(QB64v3Parser.THEN, i);
		}
		public List<InstructionBlockContext> instructionBlock() {
			return getRuleContexts(InstructionBlockContext.class);
		}
		public InstructionBlockContext instructionBlock(int i) {
			return getRuleContext(InstructionBlockContext.class,i);
		}
		public TerminalNode END() { return getToken(QB64v3Parser.END, 0); }
		public List<TerminalNode> ELSEIF() { return getTokens(QB64v3Parser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(QB64v3Parser.ELSEIF, i);
		}
		public TerminalNode ELSE() { return getToken(QB64v3Parser.ELSE, 0); }
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(IF);
			setState(231);
			expression(0);
			setState(232);
			match(THEN);
			setState(233);
			instructionBlock();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(234);
				match(ELSEIF);
				setState(235);
				expression(0);
				setState(236);
				match(THEN);
				setState(237);
				instructionBlock();
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(244);
				match(ELSE);
				setState(245);
				instructionBlock();
				}
			}

			setState(248);
			match(END);
			setState(249);
			match(IF);
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

	public static class WhileBlockContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(QB64v3Parser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InstructionBlockContext instructionBlock() {
			return getRuleContext(InstructionBlockContext.class,0);
		}
		public TerminalNode WEND() { return getToken(QB64v3Parser.WEND, 0); }
		public WhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(WHILE);
			setState(252);
			expression(0);
			setState(253);
			instructionBlock();
			setState(254);
			match(WEND);
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

	public static class DoWhileBlockContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(QB64v3Parser.DO, 0); }
		public InstructionBlockContext instructionBlock() {
			return getRuleContext(InstructionBlockContext.class,0);
		}
		public TerminalNode LOOP() { return getToken(QB64v3Parser.LOOP, 0); }
		public TerminalNode WHILE() { return getToken(QB64v3Parser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoWhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterDoWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitDoWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitDoWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileBlockContext doWhileBlock() throws RecognitionException {
		DoWhileBlockContext _localctx = new DoWhileBlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_doWhileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(DO);
			setState(257);
			instructionBlock();
			setState(258);
			match(LOOP);
			setState(259);
			match(WHILE);
			setState(260);
			expression(0);
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

	public static class DoUntilBlockContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(QB64v3Parser.DO, 0); }
		public InstructionBlockContext instructionBlock() {
			return getRuleContext(InstructionBlockContext.class,0);
		}
		public TerminalNode LOOP() { return getToken(QB64v3Parser.LOOP, 0); }
		public TerminalNode UNTIL() { return getToken(QB64v3Parser.UNTIL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoUntilBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doUntilBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterDoUntilBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitDoUntilBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitDoUntilBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoUntilBlockContext doUntilBlock() throws RecognitionException {
		DoUntilBlockContext _localctx = new DoUntilBlockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_doUntilBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(DO);
			setState(263);
			instructionBlock();
			setState(264);
			match(LOOP);
			setState(265);
			match(UNTIL);
			setState(266);
			expression(0);
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

	public static class ForBlockContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(QB64v3Parser.FOR, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode TO() { return getToken(QB64v3Parser.TO, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public InstructionBlockContext instructionBlock() {
			return getRuleContext(InstructionBlockContext.class,0);
		}
		public TerminalNode NEXT() { return getToken(QB64v3Parser.NEXT, 0); }
		public TerminalNode STEP() { return getToken(QB64v3Parser.STEP, 0); }
		public ForBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterForBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitForBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitForBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForBlockContext forBlock() throws RecognitionException {
		ForBlockContext _localctx = new ForBlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_forBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(FOR);
			setState(269);
			assignment();
			setState(270);
			match(TO);
			setState(271);
			expression(0);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STEP) {
				{
				setState(272);
				match(STEP);
				setState(273);
				expression(0);
				}
			}

			setState(276);
			instructionBlock();
			setState(277);
			match(NEXT);
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

	public static class SelectBlockContext extends ParserRuleContext {
		public List<TerminalNode> SELECT() { return getTokens(QB64v3Parser.SELECT); }
		public TerminalNode SELECT(int i) {
			return getToken(QB64v3Parser.SELECT, i);
		}
		public List<TerminalNode> CASE() { return getTokens(QB64v3Parser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(QB64v3Parser.CASE, i);
		}
		public CallIdContext callId() {
			return getRuleContext(CallIdContext.class,0);
		}
		public TerminalNode END() { return getToken(QB64v3Parser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<InstructionBlockContext> instructionBlock() {
			return getRuleContexts(InstructionBlockContext.class);
		}
		public InstructionBlockContext instructionBlock(int i) {
			return getRuleContext(InstructionBlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(QB64v3Parser.ELSE, 0); }
		public SelectBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterSelectBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitSelectBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitSelectBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectBlockContext selectBlock() throws RecognitionException {
		SelectBlockContext _localctx = new SelectBlockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_selectBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(SELECT);
			setState(280);
			match(CASE);
			setState(281);
			callId();
			setState(288);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(282);
					match(CASE);
					setState(283);
					expression(0);
					setState(284);
					instructionBlock();
					}
					} 
				}
				setState(290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASE) {
				{
				setState(291);
				match(CASE);
				setState(292);
				match(ELSE);
				setState(293);
				instructionBlock();
				}
			}

			setState(296);
			match(END);
			setState(297);
			match(SELECT);
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

	public static class InstructionBlockContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public InstructionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructionBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterInstructionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitInstructionBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitInstructionBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionBlockContext instructionBlock() throws RecognitionException {
		InstructionBlockContext _localctx = new InstructionBlockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_instructionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << DIM) | (1L << SELECT) | (1L << CONST) | (1L << ID))) != 0)) {
				{
				{
				setState(299);
				instruction();
				}
				}
				setState(304);
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

	public static class FunprocContext extends ParserRuleContext {
		public FunprocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funproc; }
	 
		public FunprocContext() { }
		public void copyFrom(FunprocContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubContext extends FunprocContext {
		public List<TerminalNode> SUB() { return getTokens(QB64v3Parser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(QB64v3Parser.SUB, i);
		}
		public TerminalNode ID() { return getToken(QB64v3Parser.ID, 0); }
		public InstructionBlockContext instructionBlock() {
			return getRuleContext(InstructionBlockContext.class,0);
		}
		public TerminalNode END() { return getToken(QB64v3Parser.END, 0); }
		public List<FunprocParContext> funprocPar() {
			return getRuleContexts(FunprocParContext.class);
		}
		public FunprocParContext funprocPar(int i) {
			return getRuleContext(FunprocParContext.class,i);
		}
		public SubContext(FunprocContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionContext extends FunprocContext {
		public List<TerminalNode> FUNCTION() { return getTokens(QB64v3Parser.FUNCTION); }
		public TerminalNode FUNCTION(int i) {
			return getToken(QB64v3Parser.FUNCTION, i);
		}
		public SingleIdContext singleId() {
			return getRuleContext(SingleIdContext.class,0);
		}
		public InstructionBlockContext instructionBlock() {
			return getRuleContext(InstructionBlockContext.class,0);
		}
		public TerminalNode END() { return getToken(QB64v3Parser.END, 0); }
		public List<FunprocParContext> funprocPar() {
			return getRuleContexts(FunprocParContext.class);
		}
		public FunprocParContext funprocPar(int i) {
			return getRuleContext(FunprocParContext.class,i);
		}
		public FunctionContext(FunprocContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunprocContext funproc() throws RecognitionException {
		FunprocContext _localctx = new FunprocContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_funproc);
		int _la;
		try {
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				_localctx = new FunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				match(FUNCTION);
				setState(306);
				singleId();
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTPAR) {
					{
					setState(307);
					match(LEFTPAR);
					setState(308);
					funprocPar();
					setState(313);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(309);
						match(COMMA);
						setState(310);
						funprocPar();
						}
						}
						setState(315);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(316);
					match(RIGHTPAR);
					}
				}

				setState(320);
				instructionBlock();
				setState(321);
				match(END);
				setState(322);
				match(FUNCTION);
				}
				break;
			case SUB:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				match(SUB);
				setState(325);
				match(ID);
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTPAR) {
					{
					setState(326);
					match(LEFTPAR);
					setState(327);
					funprocPar();
					setState(332);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(328);
						match(COMMA);
						setState(329);
						funprocPar();
						}
						}
						setState(334);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(335);
					match(RIGHTPAR);
					}
				}

				setState(339);
				instructionBlock();
				setState(340);
				match(END);
				setState(341);
				match(SUB);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FunprocParContext extends ParserRuleContext {
		public FunprocParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funprocPar; }
	 
		public FunprocParContext() { }
		public void copyFrom(FunprocParContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleIdParContext extends FunprocParContext {
		public SingleIdContext singleId() {
			return getRuleContext(SingleIdContext.class,0);
		}
		public SingleIdParContext(FunprocParContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterSingleIdPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitSingleIdPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitSingleIdPar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayParContext extends FunprocParContext {
		public Token type;
		public TerminalNode ID() { return getToken(QB64v3Parser.ID, 0); }
		public TerminalNode AS() { return getToken(QB64v3Parser.AS, 0); }
		public TerminalNode INTEGER() { return getToken(QB64v3Parser.INTEGER, 0); }
		public TerminalNode LONG() { return getToken(QB64v3Parser.LONG, 0); }
		public TerminalNode SINGLE() { return getToken(QB64v3Parser.SINGLE, 0); }
		public TerminalNode DOUBLE() { return getToken(QB64v3Parser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(QB64v3Parser.STRING, 0); }
		public ArrayParContext(FunprocParContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterArrayPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitArrayPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitArrayPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunprocParContext funprocPar() throws RecognitionException {
		FunprocParContext _localctx = new FunprocParContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_funprocPar);
		int _la;
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				_localctx = new SingleIdParContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				singleId();
				}
				break;
			case 2:
				_localctx = new ArrayParContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				match(ID);
				setState(347);
				match(LEFTPAR);
				setState(348);
				match(RIGHTPAR);
				setState(349);
				match(AS);
				setState(350);
				((ArrayParContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << SINGLE) | (1L << DOUBLE) | (1L << LONG) | (1L << STRING))) != 0)) ) {
					((ArrayParContext)_localctx).type = (Token)_errHandler.recoverInline(this);
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

	public static class SuffixContext extends ParserRuleContext {
		public Token suffixType;
		public SuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).enterSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v3Listener ) ((QB64v3Listener)listener).exitSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v3Visitor ) return ((QB64v3Visitor<? extends T>)visitor).visitSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuffixContext suffix() throws RecognitionException {
		SuffixContext _localctx = new SuffixContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_suffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			((SuffixContext)_localctx).suffixType = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SINGLESUFFIX) | (1L << DOUBLESUFFIX) | (1L << INTEGERSUFFIX) | (1L << LONGSUFFIX) | (1L << STRINGSUFFIX))) != 0)) ) {
				((SuffixContext)_localctx).suffixType = (Token)_errHandler.recoverInline(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3A\u0166\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3J\n\3\3\4\3\4\5\4N\n\4\3\4\3\4\3\4\7"+
		"\4S\n\4\f\4\16\4V\13\4\3\4\3\4\3\4\3\5\3\5\5\5]\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\7\6d\n\6\f\6\16\6g\13\6\3\6\3\6\5\6k\n\6\3\7\3\7\3\7\3\7\3\7\7\7r\n"+
		"\7\f\7\16\7u\13\7\3\7\3\7\5\7y\n\7\3\b\3\b\5\b}\n\b\3\t\3\t\3\t\3\t\7"+
		"\t\u0083\n\t\f\t\16\t\u0086\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\7\n\u0093\n\n\f\n\16\n\u0096\13\n\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a5\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00bc\n\f\f"+
		"\f\16\f\u00bf\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c9\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\7\16\u00d0\n\16\f\16\16\16\u00d3\13\16\5\16\u00d5"+
		"\n\16\3\17\3\17\3\17\3\17\7\17\u00db\n\17\f\17\16\17\u00de\13\17\3\20"+
		"\3\20\3\20\3\20\7\20\u00e4\n\20\f\20\16\20\u00e7\13\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00f2\n\21\f\21\16\21\u00f5\13\21"+
		"\3\21\3\21\5\21\u00f9\n\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u0115\n\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\7\26\u0121\n\26\f\26\16\26\u0124\13\26\3\26\3\26\3\26\5\26"+
		"\u0129\n\26\3\26\3\26\3\26\3\27\7\27\u012f\n\27\f\27\16\27\u0132\13\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u013a\n\30\f\30\16\30\u013d\13\30"+
		"\3\30\3\30\5\30\u0141\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\7\30\u014d\n\30\f\30\16\30\u0150\13\30\3\30\3\30\5\30\u0154\n\30"+
		"\3\30\3\30\3\30\3\30\5\30\u015a\n\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u0162\n\31\3\32\3\32\3\32\2\3\26\33\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\2\13\3\2-\61\3\2\3\7\4\2\r\r\64\64\4\2\n\1388\3"+
		"\2\f\r\3\2\17\22\4\2\b\b\16\16\4\2\65\65\67\67\3\2\30\34\u017e\2\64\3"+
		"\2\2\2\4I\3\2\2\2\6K\3\2\2\2\bZ\3\2\2\2\n^\3\2\2\2\fl\3\2\2\2\16z\3\2"+
		"\2\2\20~\3\2\2\2\22\u0089\3\2\2\2\24\u0097\3\2\2\2\26\u00a4\3\2\2\2\30"+
		"\u00c8\3\2\2\2\32\u00ca\3\2\2\2\34\u00d6\3\2\2\2\36\u00df\3\2\2\2 \u00e8"+
		"\3\2\2\2\"\u00fd\3\2\2\2$\u0102\3\2\2\2&\u0108\3\2\2\2(\u010e\3\2\2\2"+
		"*\u0119\3\2\2\2,\u0130\3\2\2\2.\u0159\3\2\2\2\60\u0161\3\2\2\2\62\u0163"+
		"\3\2\2\2\648\5,\27\2\65\67\5.\30\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2"+
		"\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\7\2\2\3<\3\3\2\2\2=J\5\6\4\2>J\5\22"+
		"\n\2?J\5\24\13\2@J\5 \21\2AJ\5\"\22\2BJ\5$\23\2CJ\5&\24\2DJ\5(\25\2EJ"+
		"\5*\26\2FJ\5\32\16\2GJ\5\36\20\2HJ\5\34\17\2I=\3\2\2\2I>\3\2\2\2I?\3\2"+
		"\2\2I@\3\2\2\2IA\3\2\2\2IB\3\2\2\2IC\3\2\2\2ID\3\2\2\2IE\3\2\2\2IF\3\2"+
		"\2\2IG\3\2\2\2IH\3\2\2\2J\5\3\2\2\2KM\7\62\2\2LN\7=\2\2ML\3\2\2\2MN\3"+
		"\2\2\2NO\3\2\2\2OT\5\b\5\2PQ\7\25\2\2QS\5\b\5\2RP\3\2\2\2SV\3\2\2\2TR"+
		"\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7\63\2\2XY\t\2\2\2Y\7\3\2\2\2"+
		"Z\\\7?\2\2[]\5\20\t\2\\[\3\2\2\2\\]\3\2\2\2]\t\3\2\2\2^j\5\16\b\2_`\7"+
		"\26\2\2`e\5\26\f\2ab\7\25\2\2bd\5\26\f\2ca\3\2\2\2dg\3\2\2\2ec\3\2\2\2"+
		"ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7\27\2\2ik\3\2\2\2j_\3\2\2\2jk\3\2\2"+
		"\2k\13\3\2\2\2lx\5\16\b\2mn\7\26\2\2ns\5\30\r\2op\7\25\2\2pr\5\30\r\2"+
		"qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7\27\2"+
		"\2wy\3\2\2\2xm\3\2\2\2xy\3\2\2\2y\r\3\2\2\2z|\7?\2\2{}\5\62\32\2|{\3\2"+
		"\2\2|}\3\2\2\2}\17\3\2\2\2~\177\7\26\2\2\177\u0084\5\26\f\2\u0080\u0081"+
		"\7\25\2\2\u0081\u0083\5\26\f\2\u0082\u0080\3\2\2\2\u0083\u0086\3\2\2\2"+
		"\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0087\u0088\7\27\2\2\u0088\21\3\2\2\2\u0089\u008a\7>\2\2\u008a"+
		"\u008b\5\16\b\2\u008b\u008c\7\b\2\2\u008c\u0094\5\26\f\2\u008d\u008e\7"+
		"\25\2\2\u008e\u008f\5\16\b\2\u008f\u0090\7\b\2\2\u0090\u0091\5\26\f\2"+
		"\u0091\u0093\3\2\2\2\u0092\u008d\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092"+
		"\3\2\2\2\u0094\u0095\3\2\2\2\u0095\23\3\2\2\2\u0096\u0094\3\2\2\2\u0097"+
		"\u0098\5\n\6\2\u0098\u0099\7\b\2\2\u0099\u009a\5\26\f\2\u009a\25\3\2\2"+
		"\2\u009b\u009c\b\f\1\2\u009c\u00a5\t\3\2\2\u009d\u00a5\5\f\7\2\u009e\u009f"+
		"\7\26\2\2\u009f\u00a0\5\26\f\2\u00a0\u00a1\7\27\2\2\u00a1\u00a5\3\2\2"+
		"\2\u00a2\u00a3\t\4\2\2\u00a3\u00a5\5\26\f\n\u00a4\u009b\3\2\2\2\u00a4"+
		"\u009d\3\2\2\2\u00a4\u009e\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00bd\3\2"+
		"\2\2\u00a6\u00a7\f\t\2\2\u00a7\u00a8\7\t\2\2\u00a8\u00bc\5\26\f\n\u00a9"+
		"\u00aa\f\b\2\2\u00aa\u00ab\t\5\2\2\u00ab\u00bc\5\26\f\t\u00ac\u00ad\f"+
		"\7\2\2\u00ad\u00ae\t\6\2\2\u00ae\u00bc\5\26\f\b\u00af\u00b0\f\6\2\2\u00b0"+
		"\u00b1\t\7\2\2\u00b1\u00bc\5\26\f\7\u00b2\u00b3\f\5\2\2\u00b3\u00b4\t"+
		"\b\2\2\u00b4\u00bc\5\26\f\6\u00b5\u00b6\f\4\2\2\u00b6\u00b7\7\66\2\2\u00b7"+
		"\u00bc\5\26\f\5\u00b8\u00b9\f\3\2\2\u00b9\u00ba\t\t\2\2\u00ba\u00bc\5"+
		"\26\f\4\u00bb\u00a6\3\2\2\2\u00bb\u00a9\3\2\2\2\u00bb\u00ac\3\2\2\2\u00bb"+
		"\u00af\3\2\2\2\u00bb\u00b2\3\2\2\2\u00bb\u00b5\3\2\2\2\u00bb\u00b8\3\2"+
		"\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\27\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c9\5\26\f\2\u00c1\u00c2\7?\2"+
		"\2\u00c2\u00c3\7\26\2\2\u00c3\u00c9\7\27\2\2\u00c4\u00c5\7\26\2\2\u00c5"+
		"\u00c6\5\30\r\2\u00c6\u00c7\7\27\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c0\3"+
		"\2\2\2\u00c8\u00c1\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c9\31\3\2\2\2\u00ca"+
		"\u00d4\7?\2\2\u00cb\u00d5\3\2\2\2\u00cc\u00d1\5\30\r\2\u00cd\u00ce\7\25"+
		"\2\2\u00ce\u00d0\5\30\r\2\u00cf\u00cd\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d4\u00cb\3\2\2\2\u00d4\u00cc\3\2\2\2\u00d5\33\3\2\2\2\u00d6\u00d7"+
		"\7\35\2\2\u00d7\u00dc\5\f\7\2\u00d8\u00d9\7\25\2\2\u00d9\u00db\5\f\7\2"+
		"\u00da\u00d8\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd\35\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7\36\2\2\u00e0"+
		"\u00e5\5\26\f\2\u00e1\u00e2\7\23\2\2\u00e2\u00e4\5\26\f\2\u00e3\u00e1"+
		"\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\37\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\7\37\2\2\u00e9\u00ea\5\26"+
		"\f\2\u00ea\u00eb\7 \2\2\u00eb\u00f3\5,\27\2\u00ec\u00ed\7\"\2\2\u00ed"+
		"\u00ee\5\26\f\2\u00ee\u00ef\7 \2\2\u00ef\u00f0\5,\27\2\u00f0\u00f2\3\2"+
		"\2\2\u00f1\u00ec\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f8\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7!"+
		"\2\2\u00f7\u00f9\5,\27\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u00fb\7#\2\2\u00fb\u00fc\7\37\2\2\u00fc!\3\2\2\2"+
		"\u00fd\u00fe\7$\2\2\u00fe\u00ff\5\26\f\2\u00ff\u0100\5,\27\2\u0100\u0101"+
		"\7%\2\2\u0101#\3\2\2\2\u0102\u0103\7&\2\2\u0103\u0104\5,\27\2\u0104\u0105"+
		"\7\'\2\2\u0105\u0106\7$\2\2\u0106\u0107\5\26\f\2\u0107%\3\2\2\2\u0108"+
		"\u0109\7&\2\2\u0109\u010a\5,\27\2\u010a\u010b\7\'\2\2\u010b\u010c\7(\2"+
		"\2\u010c\u010d\5\26\f\2\u010d\'\3\2\2\2\u010e\u010f\7)\2\2\u010f\u0110"+
		"\5\24\13\2\u0110\u0111\7*\2\2\u0111\u0114\5\26\f\2\u0112\u0113\7+\2\2"+
		"\u0113\u0115\5\26\f\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116"+
		"\3\2\2\2\u0116\u0117\5,\27\2\u0117\u0118\7,\2\2\u0118)\3\2\2\2\u0119\u011a"+
		"\7;\2\2\u011a\u011b\7<\2\2\u011b\u0122\5\f\7\2\u011c\u011d\7<\2\2\u011d"+
		"\u011e\5\26\f\2\u011e\u011f\5,\27\2\u011f\u0121\3\2\2\2\u0120\u011c\3"+
		"\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\u0128\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\7<\2\2\u0126\u0127\7!\2"+
		"\2\u0127\u0129\5,\27\2\u0128\u0125\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a"+
		"\3\2\2\2\u012a\u012b\7#\2\2\u012b\u012c\7;\2\2\u012c+\3\2\2\2\u012d\u012f"+
		"\5\4\3\2\u012e\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131-\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\7:\2\2\u0134"+
		"\u0140\5\16\b\2\u0135\u0136\7\26\2\2\u0136\u013b\5\60\31\2\u0137\u0138"+
		"\7\25\2\2\u0138\u013a\5\60\31\2\u0139\u0137\3\2\2\2\u013a\u013d\3\2\2"+
		"\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013b"+
		"\3\2\2\2\u013e\u013f\7\27\2\2\u013f\u0141\3\2\2\2\u0140\u0135\3\2\2\2"+
		"\u0140\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\5,\27\2\u0143\u0144"+
		"\7#\2\2\u0144\u0145\7:\2\2\u0145\u015a\3\2\2\2\u0146\u0147\79\2\2\u0147"+
		"\u0153\7?\2\2\u0148\u0149\7\26\2\2\u0149\u014e\5\60\31\2\u014a\u014b\7"+
		"\25\2\2\u014b\u014d\5\60\31\2\u014c\u014a\3\2\2\2\u014d\u0150\3\2\2\2"+
		"\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150\u014e"+
		"\3\2\2\2\u0151\u0152\7\27\2\2\u0152\u0154\3\2\2\2\u0153\u0148\3\2\2\2"+
		"\u0153\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\5,\27\2\u0156\u0157"+
		"\7#\2\2\u0157\u0158\79\2\2\u0158\u015a\3\2\2\2\u0159\u0133\3\2\2\2\u0159"+
		"\u0146\3\2\2\2\u015a/\3\2\2\2\u015b\u0162\5\16\b\2\u015c\u015d\7?\2\2"+
		"\u015d\u015e\7\26\2\2\u015e\u015f\7\27\2\2\u015f\u0160\7\63\2\2\u0160"+
		"\u0162\t\2\2\2\u0161\u015b\3\2\2\2\u0161\u015c\3\2\2\2\u0162\61\3\2\2"+
		"\2\u0163\u0164\t\n\2\2\u0164\63\3\2\2\2\"8IMT\\ejsx|\u0084\u0094\u00a4"+
		"\u00bb\u00bd\u00c8\u00d1\u00d4\u00dc\u00e5\u00f3\u00f8\u0114\u0122\u0128"+
		"\u0130\u013b\u0140\u014e\u0153\u0159\u0161";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}