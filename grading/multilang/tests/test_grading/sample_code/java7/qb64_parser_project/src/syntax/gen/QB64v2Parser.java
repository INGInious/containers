// Generated from /home/milderhc/Documents/lenguajes/ta/antlr/qb64-parser/grammar/QB64v2.g4 by ANTLR 4.6
package syntax.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QB64v2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, VALOR_ENTERO=55, VALOR_LONG=56, VALOR_SINGLE=57, VALOR_DOUBLE=58, 
		VALOR_STRING=59, ID=60, COMMENT=61, WS=62;
	public static final int
		RULE_qb = 0, RULE_instruction = 1, RULE_declaration = 2, RULE_declaration1 = 3, 
		RULE_dim_id = 4, RULE_array = 5, RULE_dim_id_list = 6, RULE_dim_id_list1 = 7, 
		RULE_single_id = 8, RULE_single_numeric_id = 9, RULE_id = 10, RULE_suffix = 11, 
		RULE_non_empty_suffix = 12, RULE_numeric_suffix = 13, RULE_arg_expression_list = 14, 
		RULE_arg_expression_list1 = 15, RULE_expression_list = 16, RULE_expression_list1 = 17, 
		RULE_constdeclaration = 18, RULE_constdeclaration1 = 19, RULE_idblock = 20, 
		RULE_idblock1 = 21, RULE_idblock2 = 22, RULE_idblock3 = 23, RULE_idblock6 = 24, 
		RULE_idblock7 = 25, RULE_arg_expression = 26, RULE_arg_expression1 = 27, 
		RULE_arg_expression2 = 28, RULE_expression = 29, RULE_unary_expression = 30, 
		RULE_binary_expression = 31, RULE_expression1 = 32, RULE_ifblock = 33, 
		RULE_elseif = 34, RULE_elseblock = 35, RULE_forblock = 36, RULE_step = 37, 
		RULE_whileblock = 38, RULE_dosomethingblock = 39, RULE_doblocks = 40, 
		RULE_selectblock = 41, RULE_case_list = 42, RULE_case_list1 = 43, RULE_function_sub = 44, 
		RULE_parameters_list = 45, RULE_parameters_list1 = 46, RULE_parameters_list2 = 47, 
		RULE_parameters_list3 = 48, RULE_arguments_list = 49, RULE_arguments_list1 = 50, 
		RULE_input = 51, RULE_id_list = 52, RULE_print = 53, RULE_print1 = 54, 
		RULE_value = 55, RULE_binary_operator = 56, RULE_unary_operator = 57, 
		RULE_type = 58;
	public static final String[] ruleNames = {
		"qb", "instruction", "declaration", "declaration1", "dim_id", "array", 
		"dim_id_list", "dim_id_list1", "single_id", "single_numeric_id", "id", 
		"suffix", "non_empty_suffix", "numeric_suffix", "arg_expression_list", 
		"arg_expression_list1", "expression_list", "expression_list1", "constdeclaration", 
		"constdeclaration1", "idblock", "idblock1", "idblock2", "idblock3", "idblock6", 
		"idblock7", "arg_expression", "arg_expression1", "arg_expression2", "expression", 
		"unary_expression", "binary_expression", "expression1", "ifblock", "elseif", 
		"elseblock", "forblock", "step", "whileblock", "dosomethingblock", "doblocks", 
		"selectblock", "case_list", "case_list1", "function_sub", "parameters_list", 
		"parameters_list1", "parameters_list2", "parameters_list3", "arguments_list", 
		"arguments_list1", "input", "id_list", "print", "print1", "value", "binary_operator", 
		"unary_operator", "type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'dim'", "'as'", "'shared'", "'('", "')'", "','", "'$'", "'!'", 
		"'%'", "'&'", "'#'", "'const'", "'='", "'if'", "'then'", "'end'", "'elseif'", 
		"'else'", "'for'", "'to'", "'next'", "'step'", "'while'", "'wend'", "'do'", 
		"'loop'", "'until'", "'select'", "'case'", "'sub'", "'function'", "'input'", 
		"'print'", "';'", "'and'", "'or'", "'xor'", "'+'", "'-'", "'*'", "'/'", 
		"'<>'", "'<'", "'>'", "'<='", "'>='", "'^'", "'mod'", "'not'", "'integer'", 
		"'single'", "'double'", "'long'", "'string'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "VALOR_ENTERO", "VALOR_LONG", 
		"VALOR_SINGLE", "VALOR_DOUBLE", "VALOR_STRING", "ID", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "QB64v2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QB64v2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class QbContext extends ParserRuleContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public Function_subContext function_sub() {
			return getRuleContext(Function_subContext.class,0);
		}
		public TerminalNode EOF() { return getToken(QB64v2Parser.EOF, 0); }
		public QbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterQb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitQb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitQb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QbContext qb() throws RecognitionException {
		QbContext _localctx = new QbContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_qb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			instruction();
			setState(119);
			function_sub();
			setState(120);
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
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public ConstdeclarationContext constdeclaration() {
			return getRuleContext(ConstdeclarationContext.class,0);
		}
		public IfblockContext ifblock() {
			return getRuleContext(IfblockContext.class,0);
		}
		public ForblockContext forblock() {
			return getRuleContext(ForblockContext.class,0);
		}
		public WhileblockContext whileblock() {
			return getRuleContext(WhileblockContext.class,0);
		}
		public DosomethingblockContext dosomethingblock() {
			return getRuleContext(DosomethingblockContext.class,0);
		}
		public SelectblockContext selectblock() {
			return getRuleContext(SelectblockContext.class,0);
		}
		public IdblockContext idblock() {
			return getRuleContext(IdblockContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruction);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				declaration();
				setState(123);
				instruction();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				constdeclaration();
				setState(126);
				instruction();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				ifblock();
				setState(129);
				instruction();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				forblock();
				setState(132);
				instruction();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 5);
				{
				setState(134);
				whileblock();
				setState(135);
				instruction();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 6);
				{
				setState(137);
				dosomethingblock();
				setState(138);
				instruction();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 7);
				{
				setState(140);
				selectblock();
				setState(141);
				instruction();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 8);
				{
				setState(143);
				idblock();
				setState(144);
				instruction();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 9);
				{
				setState(146);
				input();
				setState(147);
				instruction();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 10);
				{
				setState(149);
				print();
				setState(150);
				instruction();
				}
				break;
			case EOF:
			case T__15:
			case T__16:
			case T__17:
			case T__20:
			case T__23:
			case T__25:
			case T__28:
			case T__29:
			case T__30:
				enterOuterAlt(_localctx, 11);
				{
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

	public static class DeclarationContext extends ParserRuleContext {
		public Declaration1Context declaration1() {
			return getRuleContext(Declaration1Context.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__0);
			setState(156);
			declaration1();
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

	public static class Declaration1Context extends ParserRuleContext {
		public Dim_id_listContext dim_id_list() {
			return getRuleContext(Dim_id_listContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Declaration1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterDeclaration1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitDeclaration1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitDeclaration1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration1Context declaration1() throws RecognitionException {
		Declaration1Context _localctx = new Declaration1Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration1);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				dim_id_list();
				setState(159);
				match(T__1);
				setState(160);
				type();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(T__2);
				setState(163);
				dim_id_list();
				setState(164);
				match(T__1);
				setState(165);
				type();
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

	public static class Dim_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QB64v2Parser.ID, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Dim_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dim_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterDim_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitDim_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitDim_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dim_idContext dim_id() throws RecognitionException {
		Dim_idContext _localctx = new Dim_idContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dim_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(ID);
			setState(170);
			array();
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
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_array);
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(T__3);
				setState(173);
				expression_list();
				setState(174);
				match(T__4);
				}
				break;
			case EOF:
			case T__0:
			case T__1:
			case T__5:
			case T__11:
			case T__13:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__20:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Dim_id_listContext extends ParserRuleContext {
		public Dim_idContext dim_id() {
			return getRuleContext(Dim_idContext.class,0);
		}
		public Dim_id_list1Context dim_id_list1() {
			return getRuleContext(Dim_id_list1Context.class,0);
		}
		public Dim_id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dim_id_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterDim_id_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitDim_id_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitDim_id_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dim_id_listContext dim_id_list() throws RecognitionException {
		Dim_id_listContext _localctx = new Dim_id_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dim_id_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			dim_id();
			setState(180);
			dim_id_list1();
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

	public static class Dim_id_list1Context extends ParserRuleContext {
		public Dim_id_listContext dim_id_list() {
			return getRuleContext(Dim_id_listContext.class,0);
		}
		public Dim_id_list1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dim_id_list1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterDim_id_list1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitDim_id_list1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitDim_id_list1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dim_id_list1Context dim_id_list1() throws RecognitionException {
		Dim_id_list1Context _localctx = new Dim_id_list1Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_dim_id_list1);
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(T__5);
				setState(183);
				dim_id_list();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Single_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QB64v2Parser.ID, 0); }
		public SuffixContext suffix() {
			return getRuleContext(SuffixContext.class,0);
		}
		public Single_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterSingle_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitSingle_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitSingle_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_idContext single_id() throws RecognitionException {
		Single_idContext _localctx = new Single_idContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_single_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(ID);
			setState(188);
			suffix();
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

	public static class Single_numeric_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QB64v2Parser.ID, 0); }
		public Numeric_suffixContext numeric_suffix() {
			return getRuleContext(Numeric_suffixContext.class,0);
		}
		public Single_numeric_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_numeric_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterSingle_numeric_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitSingle_numeric_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitSingle_numeric_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_numeric_idContext single_numeric_id() throws RecognitionException {
		Single_numeric_idContext _localctx = new Single_numeric_idContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_single_numeric_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(ID);
			setState(191);
			numeric_suffix();
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
		public TerminalNode ID() { return getToken(QB64v2Parser.ID, 0); }
		public SuffixContext suffix() {
			return getRuleContext(SuffixContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(ID);
			setState(194);
			suffix();
			setState(195);
			array();
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
		public SuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuffixContext suffix() throws RecognitionException {
		SuffixContext _localctx = new SuffixContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_suffix);
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				match(T__8);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(200);
				match(T__9);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				setState(201);
				match(T__10);
				}
				break;
			case EOF:
			case T__0:
			case T__3:
			case T__4:
			case T__5:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case VALOR_ENTERO:
			case VALOR_LONG:
			case VALOR_SINGLE:
			case VALOR_DOUBLE:
			case VALOR_STRING:
			case ID:
				enterOuterAlt(_localctx, 6);
				{
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

	public static class Non_empty_suffixContext extends ParserRuleContext {
		public Non_empty_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_empty_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterNon_empty_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitNon_empty_suffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitNon_empty_suffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_empty_suffixContext non_empty_suffix() throws RecognitionException {
		Non_empty_suffixContext _localctx = new Non_empty_suffixContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_non_empty_suffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
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

	public static class Numeric_suffixContext extends ParserRuleContext {
		public Numeric_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterNumeric_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitNumeric_suffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitNumeric_suffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_suffixContext numeric_suffix() throws RecognitionException {
		Numeric_suffixContext _localctx = new Numeric_suffixContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_numeric_suffix);
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(T__8);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				match(T__9);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				match(T__10);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
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

	public static class Arg_expression_listContext extends ParserRuleContext {
		public Arg_expressionContext arg_expression() {
			return getRuleContext(Arg_expressionContext.class,0);
		}
		public Arg_expression_list1Context arg_expression_list1() {
			return getRuleContext(Arg_expression_list1Context.class,0);
		}
		public Arg_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterArg_expression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitArg_expression_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitArg_expression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_expression_listContext arg_expression_list() throws RecognitionException {
		Arg_expression_listContext _localctx = new Arg_expression_listContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arg_expression_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			arg_expression();
			setState(215);
			arg_expression_list1();
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

	public static class Arg_expression_list1Context extends ParserRuleContext {
		public Arg_expression_listContext arg_expression_list() {
			return getRuleContext(Arg_expression_listContext.class,0);
		}
		public Arg_expression_list1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_expression_list1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterArg_expression_list1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitArg_expression_list1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitArg_expression_list1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_expression_list1Context arg_expression_list1() throws RecognitionException {
		Arg_expression_list1Context _localctx = new Arg_expression_list1Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_arg_expression_list1);
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(T__5);
				setState(218);
				arg_expression_list();
				}
				break;
			case EOF:
			case T__0:
			case T__11:
			case T__13:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__20:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Expression_listContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_list1Context expression_list1() {
			return getRuleContext(Expression_list1Context.class,0);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitExpression_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitExpression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expression_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			expression();
			setState(223);
			expression_list1();
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

	public static class Expression_list1Context extends ParserRuleContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Expression_list1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterExpression_list1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitExpression_list1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitExpression_list1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_list1Context expression_list1() throws RecognitionException {
		Expression_list1Context _localctx = new Expression_list1Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_expression_list1);
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(T__5);
				setState(226);
				expression_list();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ConstdeclarationContext extends ParserRuleContext {
		public Single_idContext single_id() {
			return getRuleContext(Single_idContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Constdeclaration1Context constdeclaration1() {
			return getRuleContext(Constdeclaration1Context.class,0);
		}
		public ConstdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterConstdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitConstdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitConstdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstdeclarationContext constdeclaration() throws RecognitionException {
		ConstdeclarationContext _localctx = new ConstdeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_constdeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(T__11);
			setState(231);
			single_id();
			setState(232);
			match(T__12);
			setState(233);
			expression();
			setState(234);
			constdeclaration1();
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

	public static class Constdeclaration1Context extends ParserRuleContext {
		public Single_idContext single_id() {
			return getRuleContext(Single_idContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Constdeclaration1Context constdeclaration1() {
			return getRuleContext(Constdeclaration1Context.class,0);
		}
		public Constdeclaration1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constdeclaration1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterConstdeclaration1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitConstdeclaration1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitConstdeclaration1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constdeclaration1Context constdeclaration1() throws RecognitionException {
		Constdeclaration1Context _localctx = new Constdeclaration1Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_constdeclaration1);
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(T__5);
				setState(237);
				single_id();
				setState(238);
				match(T__12);
				setState(239);
				expression();
				setState(240);
				constdeclaration1();
				}
				break;
			case EOF:
			case T__0:
			case T__11:
			case T__13:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__20:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class IdblockContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QB64v2Parser.ID, 0); }
		public Idblock1Context idblock1() {
			return getRuleContext(Idblock1Context.class,0);
		}
		public IdblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterIdblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitIdblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitIdblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdblockContext idblock() throws RecognitionException {
		IdblockContext _localctx = new IdblockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_idblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(ID);
			setState(246);
			idblock1();
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

	public static class Idblock1Context extends ParserRuleContext {
		public Non_empty_suffixContext non_empty_suffix() {
			return getRuleContext(Non_empty_suffixContext.class,0);
		}
		public Idblock2Context idblock2() {
			return getRuleContext(Idblock2Context.class,0);
		}
		public Idblock3Context idblock3() {
			return getRuleContext(Idblock3Context.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Arg_expression_listContext arg_expression_list() {
			return getRuleContext(Arg_expression_listContext.class,0);
		}
		public Idblock1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idblock1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterIdblock1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitIdblock1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitIdblock1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Idblock1Context idblock1() throws RecognitionException {
		Idblock1Context _localctx = new Idblock1Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_idblock1);
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				non_empty_suffix();
				setState(249);
				idblock2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(T__3);
				setState(252);
				idblock3();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				match(T__12);
				setState(254);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
				arg_expression_list();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
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

	public static class Idblock2Context extends ParserRuleContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Idblock2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idblock2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterIdblock2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitIdblock2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitIdblock2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Idblock2Context idblock2() throws RecognitionException {
		Idblock2Context _localctx = new Idblock2Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_idblock2);
		try {
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(T__3);
				setState(260);
				expression_list();
				setState(261);
				match(T__4);
				setState(262);
				match(T__12);
				setState(263);
				expression();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(T__12);
				setState(266);
				expression();
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

	public static class Idblock3Context extends ParserRuleContext {
		public Arg_expressionContext arg_expression() {
			return getRuleContext(Arg_expressionContext.class,0);
		}
		public Idblock6Context idblock6() {
			return getRuleContext(Idblock6Context.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Idblock7Context idblock7() {
			return getRuleContext(Idblock7Context.class,0);
		}
		public Idblock3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idblock3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterIdblock3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitIdblock3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitIdblock3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Idblock3Context idblock3() throws RecognitionException {
		Idblock3Context _localctx = new Idblock3Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_idblock3);
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				arg_expression();
				setState(270);
				match(T__4);
				setState(271);
				idblock6();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				expression();
				setState(274);
				idblock7();
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

	public static class Idblock6Context extends ParserRuleContext {
		public Arg_expression_listContext arg_expression_list() {
			return getRuleContext(Arg_expression_listContext.class,0);
		}
		public Idblock6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idblock6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterIdblock6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitIdblock6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitIdblock6(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Idblock6Context idblock6() throws RecognitionException {
		Idblock6Context _localctx = new Idblock6Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_idblock6);
		try {
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(T__5);
				setState(279);
				arg_expression_list();
				}
				break;
			case EOF:
			case T__0:
			case T__11:
			case T__13:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__20:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Idblock7Context extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Idblock7Context idblock7() {
			return getRuleContext(Idblock7Context.class,0);
		}
		public Idblock7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idblock7; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterIdblock7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitIdblock7(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitIdblock7(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Idblock7Context idblock7() throws RecognitionException {
		Idblock7Context _localctx = new Idblock7Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_idblock7);
		try {
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				match(T__4);
				setState(284);
				match(T__12);
				setState(285);
				expression();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				match(T__5);
				setState(287);
				expression();
				setState(288);
				idblock7();
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

	public static class Arg_expressionContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Binary_expressionContext binary_expression() {
			return getRuleContext(Binary_expressionContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Arg_expressionContext arg_expression() {
			return getRuleContext(Arg_expressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(QB64v2Parser.ID, 0); }
		public Arg_expression1Context arg_expression1() {
			return getRuleContext(Arg_expression1Context.class,0);
		}
		public Arg_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterArg_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitArg_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitArg_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_expressionContext arg_expression() throws RecognitionException {
		Arg_expressionContext _localctx = new Arg_expressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_arg_expression);
		try {
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALOR_ENTERO:
			case VALOR_LONG:
			case VALOR_SINGLE:
			case VALOR_DOUBLE:
			case VALOR_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				value();
				setState(293);
				binary_expression();
				}
				break;
			case T__38:
			case T__48:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				unary_expression();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				match(T__3);
				setState(297);
				arg_expression();
				setState(298);
				match(T__4);
				setState(299);
				binary_expression();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(301);
				match(ID);
				setState(302);
				arg_expression1();
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

	public static class Arg_expression1Context extends ParserRuleContext {
		public Non_empty_suffixContext non_empty_suffix() {
			return getRuleContext(Non_empty_suffixContext.class,0);
		}
		public Arguments_listContext arguments_list() {
			return getRuleContext(Arguments_listContext.class,0);
		}
		public Binary_expressionContext binary_expression() {
			return getRuleContext(Binary_expressionContext.class,0);
		}
		public Arg_expression2Context arg_expression2() {
			return getRuleContext(Arg_expression2Context.class,0);
		}
		public Arg_expression1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_expression1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterArg_expression1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitArg_expression1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitArg_expression1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_expression1Context arg_expression1() throws RecognitionException {
		Arg_expression1Context _localctx = new Arg_expression1Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_arg_expression1);
		try {
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				non_empty_suffix();
				setState(306);
				match(T__3);
				setState(307);
				arguments_list();
				setState(308);
				match(T__4);
				setState(309);
				binary_expression();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				match(T__3);
				setState(312);
				arg_expression2();
				}
				break;
			case EOF:
			case T__0:
			case T__4:
			case T__5:
			case T__11:
			case T__12:
			case T__13:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__20:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(313);
				binary_expression();
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

	public static class Arg_expression2Context extends ParserRuleContext {
		public Arguments_listContext arguments_list() {
			return getRuleContext(Arguments_listContext.class,0);
		}
		public Binary_expressionContext binary_expression() {
			return getRuleContext(Binary_expressionContext.class,0);
		}
		public Arg_expression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_expression2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterArg_expression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitArg_expression2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitArg_expression2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_expression2Context arg_expression2() throws RecognitionException {
		Arg_expression2Context _localctx = new Arg_expression2Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_arg_expression2);
		try {
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				match(T__4);
				}
				break;
			case T__3:
			case T__38:
			case T__48:
			case VALOR_ENTERO:
			case VALOR_LONG:
			case VALOR_SINGLE:
			case VALOR_DOUBLE:
			case VALOR_STRING:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				arguments_list();
				setState(318);
				match(T__4);
				setState(319);
				binary_expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Binary_expressionContext binary_expression() {
			return getRuleContext(Binary_expressionContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Single_idContext single_id() {
			return getRuleContext(Single_idContext.class,0);
		}
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expression);
		try {
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALOR_ENTERO:
			case VALOR_LONG:
			case VALOR_SINGLE:
			case VALOR_DOUBLE:
			case VALOR_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				value();
				setState(324);
				binary_expression();
				}
				break;
			case T__38:
			case T__48:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				unary_expression();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(327);
				match(T__3);
				setState(328);
				expression();
				setState(329);
				match(T__4);
				setState(330);
				binary_expression();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(332);
				single_id();
				setState(333);
				expression1();
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

	public static class Unary_expressionContext extends ParserRuleContext {
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitUnary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitUnary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_unary_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			unary_operator();
			setState(338);
			expression();
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

	public static class Binary_expressionContext extends ParserRuleContext {
		public Binary_operatorContext binary_operator() {
			return getRuleContext(Binary_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Binary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterBinary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitBinary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitBinary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_expressionContext binary_expression() throws RecognitionException {
		Binary_expressionContext _localctx = new Binary_expressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_binary_expression);
		try {
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				binary_operator();
				setState(341);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Expression1Context extends ParserRuleContext {
		public Arguments_listContext arguments_list() {
			return getRuleContext(Arguments_listContext.class,0);
		}
		public Binary_expressionContext binary_expression() {
			return getRuleContext(Binary_expressionContext.class,0);
		}
		public Expression1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterExpression1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitExpression1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitExpression1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression1Context expression1() throws RecognitionException {
		Expression1Context _localctx = new Expression1Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_expression1);
		try {
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				match(T__3);
				setState(347);
				arguments_list();
				setState(348);
				match(T__4);
				setState(349);
				binary_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				binary_expression();
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

	public static class IfblockContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public ElseifContext elseif() {
			return getRuleContext(ElseifContext.class,0);
		}
		public ElseblockContext elseblock() {
			return getRuleContext(ElseblockContext.class,0);
		}
		public IfblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterIfblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitIfblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitIfblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfblockContext ifblock() throws RecognitionException {
		IfblockContext _localctx = new IfblockContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_ifblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(T__13);
			setState(355);
			expression();
			setState(356);
			match(T__14);
			setState(357);
			instruction();
			setState(358);
			elseif();
			setState(359);
			elseblock();
			setState(360);
			match(T__15);
			setState(361);
			match(T__13);
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

	public static class ElseifContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public ElseifContext elseif() {
			return getRuleContext(ElseifContext.class,0);
		}
		public ElseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterElseif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitElseif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitElseif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifContext elseif() throws RecognitionException {
		ElseifContext _localctx = new ElseifContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_elseif);
		try {
			setState(370);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				match(T__16);
				setState(364);
				expression();
				setState(365);
				match(T__14);
				setState(366);
				instruction();
				setState(367);
				elseif();
				}
				break;
			case T__15:
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ElseblockContext extends ParserRuleContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public ElseblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterElseblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitElseblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitElseblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseblockContext elseblock() throws RecognitionException {
		ElseblockContext _localctx = new ElseblockContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_elseblock);
		try {
			setState(375);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				match(T__17);
				setState(373);
				instruction();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ForblockContext extends ParserRuleContext {
		public Single_numeric_idContext single_numeric_id() {
			return getRuleContext(Single_numeric_idContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StepContext step() {
			return getRuleContext(StepContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public ForblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterForblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitForblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitForblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForblockContext forblock() throws RecognitionException {
		ForblockContext _localctx = new ForblockContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_forblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(T__18);
			setState(378);
			single_numeric_id();
			setState(379);
			match(T__12);
			setState(380);
			expression();
			setState(381);
			match(T__19);
			setState(382);
			expression();
			setState(383);
			step();
			setState(384);
			instruction();
			setState(385);
			match(T__20);
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

	public static class StepContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_step);
		try {
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				match(T__21);
				setState(388);
				expression();
				}
				break;
			case T__0:
			case T__11:
			case T__13:
			case T__18:
			case T__20:
			case T__22:
			case T__24:
			case T__27:
			case T__31:
			case T__32:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class WhileblockContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public WhileblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterWhileblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitWhileblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitWhileblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileblockContext whileblock() throws RecognitionException {
		WhileblockContext _localctx = new WhileblockContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_whileblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(T__22);
			setState(393);
			expression();
			setState(394);
			instruction();
			setState(395);
			match(T__23);
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

	public static class DosomethingblockContext extends ParserRuleContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public DoblocksContext doblocks() {
			return getRuleContext(DoblocksContext.class,0);
		}
		public DosomethingblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dosomethingblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterDosomethingblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitDosomethingblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitDosomethingblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DosomethingblockContext dosomethingblock() throws RecognitionException {
		DosomethingblockContext _localctx = new DosomethingblockContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_dosomethingblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(T__24);
			setState(398);
			instruction();
			setState(399);
			match(T__25);
			setState(400);
			doblocks();
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

	public static class DoblocksContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoblocksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doblocks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterDoblocks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitDoblocks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitDoblocks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoblocksContext doblocks() throws RecognitionException {
		DoblocksContext _localctx = new DoblocksContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_doblocks);
		try {
			setState(406);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				match(T__22);
				setState(403);
				expression();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				match(T__26);
				setState(405);
				expression();
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

	public static class SelectblockContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Case_listContext case_list() {
			return getRuleContext(Case_listContext.class,0);
		}
		public SelectblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterSelectblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitSelectblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitSelectblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectblockContext selectblock() throws RecognitionException {
		SelectblockContext _localctx = new SelectblockContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_selectblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(T__27);
			setState(409);
			match(T__28);
			setState(410);
			id();
			setState(411);
			case_list();
			setState(412);
			match(T__15);
			setState(413);
			match(T__27);
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

	public static class Case_listContext extends ParserRuleContext {
		public Case_list1Context case_list1() {
			return getRuleContext(Case_list1Context.class,0);
		}
		public Case_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterCase_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitCase_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitCase_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_listContext case_list() throws RecognitionException {
		Case_listContext _localctx = new Case_listContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_case_list);
		try {
			setState(418);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				match(T__28);
				setState(416);
				case_list1();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Case_list1Context extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public Case_listContext case_list() {
			return getRuleContext(Case_listContext.class,0);
		}
		public Case_list1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_list1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterCase_list1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitCase_list1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitCase_list1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_list1Context case_list1() throws RecognitionException {
		Case_list1Context _localctx = new Case_list1Context(_ctx, getState());
		enterRule(_localctx, 86, RULE_case_list1);
		try {
			setState(426);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALOR_ENTERO:
			case VALOR_LONG:
			case VALOR_SINGLE:
			case VALOR_DOUBLE:
			case VALOR_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				value();
				setState(421);
				instruction();
				setState(422);
				case_list();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
				match(T__17);
				setState(425);
				instruction();
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

	public static class Function_subContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QB64v2Parser.ID, 0); }
		public Parameters_listContext parameters_list() {
			return getRuleContext(Parameters_listContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public Function_subContext function_sub() {
			return getRuleContext(Function_subContext.class,0);
		}
		public Single_idContext single_id() {
			return getRuleContext(Single_idContext.class,0);
		}
		public Function_subContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterFunction_sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitFunction_sub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitFunction_sub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_subContext function_sub() throws RecognitionException {
		Function_subContext _localctx = new Function_subContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_function_sub);
		try {
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				match(T__29);
				setState(429);
				match(ID);
				setState(430);
				parameters_list();
				setState(431);
				instruction();
				setState(432);
				match(T__15);
				setState(433);
				match(T__29);
				setState(434);
				function_sub();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				match(T__30);
				setState(437);
				single_id();
				setState(438);
				parameters_list();
				setState(439);
				instruction();
				setState(440);
				match(T__15);
				setState(441);
				match(T__30);
				setState(442);
				function_sub();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class Parameters_listContext extends ParserRuleContext {
		public Parameters_list1Context parameters_list1() {
			return getRuleContext(Parameters_list1Context.class,0);
		}
		public Parameters_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterParameters_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitParameters_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitParameters_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameters_listContext parameters_list() throws RecognitionException {
		Parameters_listContext _localctx = new Parameters_listContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_parameters_list);
		try {
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				match(T__3);
				setState(448);
				parameters_list1();
				setState(449);
				match(T__4);
				}
				break;
			case T__0:
			case T__11:
			case T__13:
			case T__15:
			case T__18:
			case T__22:
			case T__24:
			case T__27:
			case T__31:
			case T__32:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Parameters_list1Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QB64v2Parser.ID, 0); }
		public Parameters_list2Context parameters_list2() {
			return getRuleContext(Parameters_list2Context.class,0);
		}
		public Parameters_list1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters_list1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterParameters_list1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitParameters_list1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitParameters_list1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameters_list1Context parameters_list1() throws RecognitionException {
		Parameters_list1Context _localctx = new Parameters_list1Context(_ctx, getState());
		enterRule(_localctx, 92, RULE_parameters_list1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(ID);
			setState(455);
			parameters_list2();
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

	public static class Parameters_list2Context extends ParserRuleContext {
		public Non_empty_suffixContext non_empty_suffix() {
			return getRuleContext(Non_empty_suffixContext.class,0);
		}
		public Parameters_list3Context parameters_list3() {
			return getRuleContext(Parameters_list3Context.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Parameters_list2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters_list2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterParameters_list2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitParameters_list2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitParameters_list2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameters_list2Context parameters_list2() throws RecognitionException {
		Parameters_list2Context _localctx = new Parameters_list2Context(_ctx, getState());
		enterRule(_localctx, 94, RULE_parameters_list2);
		try {
			setState(467);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				non_empty_suffix();
				setState(458);
				parameters_list3();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				match(T__3);
				setState(461);
				match(T__4);
				setState(462);
				match(T__1);
				setState(463);
				type();
				setState(464);
				parameters_list3();
				}
				break;
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(466);
				parameters_list3();
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

	public static class Parameters_list3Context extends ParserRuleContext {
		public Parameters_list1Context parameters_list1() {
			return getRuleContext(Parameters_list1Context.class,0);
		}
		public Parameters_list3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters_list3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterParameters_list3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitParameters_list3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitParameters_list3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameters_list3Context parameters_list3() throws RecognitionException {
		Parameters_list3Context _localctx = new Parameters_list3Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_parameters_list3);
		try {
			setState(472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				match(T__5);
				setState(470);
				parameters_list1();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Arguments_listContext extends ParserRuleContext {
		public Arg_expressionContext arg_expression() {
			return getRuleContext(Arg_expressionContext.class,0);
		}
		public Arguments_list1Context arguments_list1() {
			return getRuleContext(Arguments_list1Context.class,0);
		}
		public Arguments_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterArguments_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitArguments_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitArguments_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arguments_listContext arguments_list() throws RecognitionException {
		Arguments_listContext _localctx = new Arguments_listContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_arguments_list);
		try {
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				match(T__3);
				setState(475);
				arg_expression();
				setState(476);
				match(T__4);
				setState(477);
				arguments_list1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(479);
				arg_expression();
				setState(480);
				arguments_list1();
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

	public static class Arguments_list1Context extends ParserRuleContext {
		public Arguments_listContext arguments_list() {
			return getRuleContext(Arguments_listContext.class,0);
		}
		public Arguments_list1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments_list1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterArguments_list1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitArguments_list1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitArguments_list1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arguments_list1Context arguments_list1() throws RecognitionException {
		Arguments_list1Context _localctx = new Arguments_list1Context(_ctx, getState());
		enterRule(_localctx, 100, RULE_arguments_list1);
		try {
			setState(487);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				match(T__5);
				setState(485);
				arguments_list();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class InputContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(T__31);
			setState(490);
			id();
			setState(491);
			id_list();
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

	public static class Id_listContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterId_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitId_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitId_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_listContext id_list() throws RecognitionException {
		Id_listContext _localctx = new Id_listContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_id_list);
		try {
			setState(498);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				match(T__5);
				setState(494);
				id();
				setState(495);
				id_list();
				}
				break;
			case EOF:
			case T__0:
			case T__11:
			case T__13:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__20:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class PrintContext extends ParserRuleContext {
		public Print1Context print1() {
			return getRuleContext(Print1Context.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(T__32);
			setState(501);
			print1();
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

	public static class Print1Context extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Print1Context print1() {
			return getRuleContext(Print1Context.class,0);
		}
		public Print1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterPrint1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitPrint1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitPrint1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print1Context print1() throws RecognitionException {
		Print1Context _localctx = new Print1Context(_ctx, getState());
		enterRule(_localctx, 108, RULE_print1);
		try {
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				expression();
				setState(504);
				print1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
				match(T__33);
				setState(507);
				print1();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode VALOR_ENTERO() { return getToken(QB64v2Parser.VALOR_ENTERO, 0); }
		public TerminalNode VALOR_SINGLE() { return getToken(QB64v2Parser.VALOR_SINGLE, 0); }
		public TerminalNode VALOR_DOUBLE() { return getToken(QB64v2Parser.VALOR_DOUBLE, 0); }
		public TerminalNode VALOR_LONG() { return getToken(QB64v2Parser.VALOR_LONG, 0); }
		public TerminalNode VALOR_STRING() { return getToken(QB64v2Parser.VALOR_STRING, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VALOR_ENTERO) | (1L << VALOR_LONG) | (1L << VALOR_SINGLE) | (1L << VALOR_DOUBLE) | (1L << VALOR_STRING))) != 0)) ) {
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

	public static class Binary_operatorContext extends ParserRuleContext {
		public Binary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterBinary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitBinary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitBinary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_operatorContext binary_operator() throws RecognitionException {
		Binary_operatorContext _localctx = new Binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_binary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0)) ) {
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			_la = _input.LA(1);
			if ( !(_la==T__38 || _la==T__48) ) {
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QB64v2Listener ) ((QB64v2Listener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QB64v2Visitor ) return ((QB64v2Visitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3@\u020a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u009c"+
		"\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00aa\n\5\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u00b4\n\7\3\b\3\b\3\b\3\t\3\t\3\t\5\t"+
		"\u00bc\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\5\r\u00ce\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u00d7\n"+
		"\17\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u00df\n\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\5\23\u00e7\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u00f6\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u0104\n\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u010e\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0117"+
		"\n\31\3\32\3\32\3\32\5\32\u011c\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u0125\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u0132\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u013d"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\5\36\u0144\n\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0152\n\37\3 \3 \3 \3!\3!\3!"+
		"\3!\5!\u015b\n!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0163\n\"\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\5$\u0175\n$\3%\3%\3%\5%\u017a\n%\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\5\'\u0189\n\'\3(\3(\3(\3(\3(\3)"+
		"\3)\3)\3)\3)\3*\3*\3*\3*\5*\u0199\n*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\5,"+
		"\u01a5\n,\3-\3-\3-\3-\3-\3-\5-\u01ad\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\5.\u01c0\n.\3/\3/\3/\3/\3/\5/\u01c7\n/\3\60\3\60"+
		"\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u01d6\n\61"+
		"\3\62\3\62\3\62\5\62\u01db\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\5\63\u01e5\n\63\3\64\3\64\3\64\5\64\u01ea\n\64\3\65\3\65\3\65\3\65\3"+
		"\66\3\66\3\66\3\66\3\66\5\66\u01f5\n\66\3\67\3\67\3\67\38\38\38\38\38"+
		"\38\58\u0200\n8\39\39\3:\3:\3;\3;\3<\3<\3<\2\2=\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"\2\7\3\2\t\r\3\29=\4\2\17\17%\62\4\2))\63\63\3\2\648\u020b\2x\3\2\2\2"+
		"\4\u009b\3\2\2\2\6\u009d\3\2\2\2\b\u00a9\3\2\2\2\n\u00ab\3\2\2\2\f\u00b3"+
		"\3\2\2\2\16\u00b5\3\2\2\2\20\u00bb\3\2\2\2\22\u00bd\3\2\2\2\24\u00c0\3"+
		"\2\2\2\26\u00c3\3\2\2\2\30\u00cd\3\2\2\2\32\u00cf\3\2\2\2\34\u00d6\3\2"+
		"\2\2\36\u00d8\3\2\2\2 \u00de\3\2\2\2\"\u00e0\3\2\2\2$\u00e6\3\2\2\2&\u00e8"+
		"\3\2\2\2(\u00f5\3\2\2\2*\u00f7\3\2\2\2,\u0103\3\2\2\2.\u010d\3\2\2\2\60"+
		"\u0116\3\2\2\2\62\u011b\3\2\2\2\64\u0124\3\2\2\2\66\u0131\3\2\2\28\u013c"+
		"\3\2\2\2:\u0143\3\2\2\2<\u0151\3\2\2\2>\u0153\3\2\2\2@\u015a\3\2\2\2B"+
		"\u0162\3\2\2\2D\u0164\3\2\2\2F\u0174\3\2\2\2H\u0179\3\2\2\2J\u017b\3\2"+
		"\2\2L\u0188\3\2\2\2N\u018a\3\2\2\2P\u018f\3\2\2\2R\u0198\3\2\2\2T\u019a"+
		"\3\2\2\2V\u01a4\3\2\2\2X\u01ac\3\2\2\2Z\u01bf\3\2\2\2\\\u01c6\3\2\2\2"+
		"^\u01c8\3\2\2\2`\u01d5\3\2\2\2b\u01da\3\2\2\2d\u01e4\3\2\2\2f\u01e9\3"+
		"\2\2\2h\u01eb\3\2\2\2j\u01f4\3\2\2\2l\u01f6\3\2\2\2n\u01ff\3\2\2\2p\u0201"+
		"\3\2\2\2r\u0203\3\2\2\2t\u0205\3\2\2\2v\u0207\3\2\2\2xy\5\4\3\2yz\5Z."+
		"\2z{\7\2\2\3{\3\3\2\2\2|}\5\6\4\2}~\5\4\3\2~\u009c\3\2\2\2\177\u0080\5"+
		"&\24\2\u0080\u0081\5\4\3\2\u0081\u009c\3\2\2\2\u0082\u0083\5D#\2\u0083"+
		"\u0084\5\4\3\2\u0084\u009c\3\2\2\2\u0085\u0086\5J&\2\u0086\u0087\5\4\3"+
		"\2\u0087\u009c\3\2\2\2\u0088\u0089\5N(\2\u0089\u008a\5\4\3\2\u008a\u009c"+
		"\3\2\2\2\u008b\u008c\5P)\2\u008c\u008d\5\4\3\2\u008d\u009c\3\2\2\2\u008e"+
		"\u008f\5T+\2\u008f\u0090\5\4\3\2\u0090\u009c\3\2\2\2\u0091\u0092\5*\26"+
		"\2\u0092\u0093\5\4\3\2\u0093\u009c\3\2\2\2\u0094\u0095\5h\65\2\u0095\u0096"+
		"\5\4\3\2\u0096\u009c\3\2\2\2\u0097\u0098\5l\67\2\u0098\u0099\5\4\3\2\u0099"+
		"\u009c\3\2\2\2\u009a\u009c\3\2\2\2\u009b|\3\2\2\2\u009b\177\3\2\2\2\u009b"+
		"\u0082\3\2\2\2\u009b\u0085\3\2\2\2\u009b\u0088\3\2\2\2\u009b\u008b\3\2"+
		"\2\2\u009b\u008e\3\2\2\2\u009b\u0091\3\2\2\2\u009b\u0094\3\2\2\2\u009b"+
		"\u0097\3\2\2\2\u009b\u009a\3\2\2\2\u009c\5\3\2\2\2\u009d\u009e\7\3\2\2"+
		"\u009e\u009f\5\b\5\2\u009f\7\3\2\2\2\u00a0\u00a1\5\16\b\2\u00a1\u00a2"+
		"\7\4\2\2\u00a2\u00a3\5v<\2\u00a3\u00aa\3\2\2\2\u00a4\u00a5\7\5\2\2\u00a5"+
		"\u00a6\5\16\b\2\u00a6\u00a7\7\4\2\2\u00a7\u00a8\5v<\2\u00a8\u00aa\3\2"+
		"\2\2\u00a9\u00a0\3\2\2\2\u00a9\u00a4\3\2\2\2\u00aa\t\3\2\2\2\u00ab\u00ac"+
		"\7>\2\2\u00ac\u00ad\5\f\7\2\u00ad\13\3\2\2\2\u00ae\u00af\7\6\2\2\u00af"+
		"\u00b0\5\"\22\2\u00b0\u00b1\7\7\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b4\3"+
		"\2\2\2\u00b3\u00ae\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\r\3\2\2\2\u00b5\u00b6"+
		"\5\n\6\2\u00b6\u00b7\5\20\t\2\u00b7\17\3\2\2\2\u00b8\u00b9\7\b\2\2\u00b9"+
		"\u00bc\5\16\b\2\u00ba\u00bc\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bb\u00ba\3"+
		"\2\2\2\u00bc\21\3\2\2\2\u00bd\u00be\7>\2\2\u00be\u00bf\5\30\r\2\u00bf"+
		"\23\3\2\2\2\u00c0\u00c1\7>\2\2\u00c1\u00c2\5\34\17\2\u00c2\25\3\2\2\2"+
		"\u00c3\u00c4\7>\2\2\u00c4\u00c5\5\30\r\2\u00c5\u00c6\5\f\7\2\u00c6\27"+
		"\3\2\2\2\u00c7\u00ce\7\t\2\2\u00c8\u00ce\7\n\2\2\u00c9\u00ce\7\13\2\2"+
		"\u00ca\u00ce\7\f\2\2\u00cb\u00ce\7\r\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00c7"+
		"\3\2\2\2\u00cd\u00c8\3\2\2\2\u00cd\u00c9\3\2\2\2\u00cd\u00ca\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\31\3\2\2\2\u00cf\u00d0\t\2\2"+
		"\2\u00d0\33\3\2\2\2\u00d1\u00d7\7\n\2\2\u00d2\u00d7\7\13\2\2\u00d3\u00d7"+
		"\7\f\2\2\u00d4\u00d7\7\r\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d1\3\2\2\2\u00d6"+
		"\u00d2\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2"+
		"\2\2\u00d7\35\3\2\2\2\u00d8\u00d9\5\66\34\2\u00d9\u00da\5 \21\2\u00da"+
		"\37\3\2\2\2\u00db\u00dc\7\b\2\2\u00dc\u00df\5\36\20\2\u00dd\u00df\3\2"+
		"\2\2\u00de\u00db\3\2\2\2\u00de\u00dd\3\2\2\2\u00df!\3\2\2\2\u00e0\u00e1"+
		"\5<\37\2\u00e1\u00e2\5$\23\2\u00e2#\3\2\2\2\u00e3\u00e4\7\b\2\2\u00e4"+
		"\u00e7\5\"\22\2\u00e5\u00e7\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e6\u00e5\3"+
		"\2\2\2\u00e7%\3\2\2\2\u00e8\u00e9\7\16\2\2\u00e9\u00ea\5\22\n\2\u00ea"+
		"\u00eb\7\17\2\2\u00eb\u00ec\5<\37\2\u00ec\u00ed\5(\25\2\u00ed\'\3\2\2"+
		"\2\u00ee\u00ef\7\b\2\2\u00ef\u00f0\5\22\n\2\u00f0\u00f1\7\17\2\2\u00f1"+
		"\u00f2\5<\37\2\u00f2\u00f3\5(\25\2\u00f3\u00f6\3\2\2\2\u00f4\u00f6\3\2"+
		"\2\2\u00f5\u00ee\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6)\3\2\2\2\u00f7\u00f8"+
		"\7>\2\2\u00f8\u00f9\5,\27\2\u00f9+\3\2\2\2\u00fa\u00fb\5\32\16\2\u00fb"+
		"\u00fc\5.\30\2\u00fc\u0104\3\2\2\2\u00fd\u00fe\7\6\2\2\u00fe\u0104\5\60"+
		"\31\2\u00ff\u0100\7\17\2\2\u0100\u0104\5<\37\2\u0101\u0104\5\36\20\2\u0102"+
		"\u0104\3\2\2\2\u0103\u00fa\3\2\2\2\u0103\u00fd\3\2\2\2\u0103\u00ff\3\2"+
		"\2\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104-\3\2\2\2\u0105\u0106"+
		"\7\6\2\2\u0106\u0107\5\"\22\2\u0107\u0108\7\7\2\2\u0108\u0109\7\17\2\2"+
		"\u0109\u010a\5<\37\2\u010a\u010e\3\2\2\2\u010b\u010c\7\17\2\2\u010c\u010e"+
		"\5<\37\2\u010d\u0105\3\2\2\2\u010d\u010b\3\2\2\2\u010e/\3\2\2\2\u010f"+
		"\u0110\5\66\34\2\u0110\u0111\7\7\2\2\u0111\u0112\5\62\32\2\u0112\u0117"+
		"\3\2\2\2\u0113\u0114\5<\37\2\u0114\u0115\5\64\33\2\u0115\u0117\3\2\2\2"+
		"\u0116\u010f\3\2\2\2\u0116\u0113\3\2\2\2\u0117\61\3\2\2\2\u0118\u0119"+
		"\7\b\2\2\u0119\u011c\5\36\20\2\u011a\u011c\3\2\2\2\u011b\u0118\3\2\2\2"+
		"\u011b\u011a\3\2\2\2\u011c\63\3\2\2\2\u011d\u011e\7\7\2\2\u011e\u011f"+
		"\7\17\2\2\u011f\u0125\5<\37\2\u0120\u0121\7\b\2\2\u0121\u0122\5<\37\2"+
		"\u0122\u0123\5\64\33\2\u0123\u0125\3\2\2\2\u0124\u011d\3\2\2\2\u0124\u0120"+
		"\3\2\2\2\u0125\65\3\2\2\2\u0126\u0127\5p9\2\u0127\u0128\5@!\2\u0128\u0132"+
		"\3\2\2\2\u0129\u0132\5> \2\u012a\u012b\7\6\2\2\u012b\u012c\5\66\34\2\u012c"+
		"\u012d\7\7\2\2\u012d\u012e\5@!\2\u012e\u0132\3\2\2\2\u012f\u0130\7>\2"+
		"\2\u0130\u0132\58\35\2\u0131\u0126\3\2\2\2\u0131\u0129\3\2\2\2\u0131\u012a"+
		"\3\2\2\2\u0131\u012f\3\2\2\2\u0132\67\3\2\2\2\u0133\u0134\5\32\16\2\u0134"+
		"\u0135\7\6\2\2\u0135\u0136\5d\63\2\u0136\u0137\7\7\2\2\u0137\u0138\5@"+
		"!\2\u0138\u013d\3\2\2\2\u0139\u013a\7\6\2\2\u013a\u013d\5:\36\2\u013b"+
		"\u013d\5@!\2\u013c\u0133\3\2\2\2\u013c\u0139\3\2\2\2\u013c\u013b\3\2\2"+
		"\2\u013d9\3\2\2\2\u013e\u0144\7\7\2\2\u013f\u0140\5d\63\2\u0140\u0141"+
		"\7\7\2\2\u0141\u0142\5@!\2\u0142\u0144\3\2\2\2\u0143\u013e\3\2\2\2\u0143"+
		"\u013f\3\2\2\2\u0144;\3\2\2\2\u0145\u0146\5p9\2\u0146\u0147\5@!\2\u0147"+
		"\u0152\3\2\2\2\u0148\u0152\5> \2\u0149\u014a\7\6\2\2\u014a\u014b\5<\37"+
		"\2\u014b\u014c\7\7\2\2\u014c\u014d\5@!\2\u014d\u0152\3\2\2\2\u014e\u014f"+
		"\5\22\n\2\u014f\u0150\5B\"\2\u0150\u0152\3\2\2\2\u0151\u0145\3\2\2\2\u0151"+
		"\u0148\3\2\2\2\u0151\u0149\3\2\2\2\u0151\u014e\3\2\2\2\u0152=\3\2\2\2"+
		"\u0153\u0154\5t;\2\u0154\u0155\5<\37\2\u0155?\3\2\2\2\u0156\u0157\5r:"+
		"\2\u0157\u0158\5<\37\2\u0158\u015b\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u0156"+
		"\3\2\2\2\u015a\u0159\3\2\2\2\u015bA\3\2\2\2\u015c\u015d\7\6\2\2\u015d"+
		"\u015e\5d\63\2\u015e\u015f\7\7\2\2\u015f\u0160\5@!\2\u0160\u0163\3\2\2"+
		"\2\u0161\u0163\5@!\2\u0162\u015c\3\2\2\2\u0162\u0161\3\2\2\2\u0163C\3"+
		"\2\2\2\u0164\u0165\7\20\2\2\u0165\u0166\5<\37\2\u0166\u0167\7\21\2\2\u0167"+
		"\u0168\5\4\3\2\u0168\u0169\5F$\2\u0169\u016a\5H%\2\u016a\u016b\7\22\2"+
		"\2\u016b\u016c\7\20\2\2\u016cE\3\2\2\2\u016d\u016e\7\23\2\2\u016e\u016f"+
		"\5<\37\2\u016f\u0170\7\21\2\2\u0170\u0171\5\4\3\2\u0171\u0172\5F$\2\u0172"+
		"\u0175\3\2\2\2\u0173\u0175\3\2\2\2\u0174\u016d\3\2\2\2\u0174\u0173\3\2"+
		"\2\2\u0175G\3\2\2\2\u0176\u0177\7\24\2\2\u0177\u017a\5\4\3\2\u0178\u017a"+
		"\3\2\2\2\u0179\u0176\3\2\2\2\u0179\u0178\3\2\2\2\u017aI\3\2\2\2\u017b"+
		"\u017c\7\25\2\2\u017c\u017d\5\24\13\2\u017d\u017e\7\17\2\2\u017e\u017f"+
		"\5<\37\2\u017f\u0180\7\26\2\2\u0180\u0181\5<\37\2\u0181\u0182\5L\'\2\u0182"+
		"\u0183\5\4\3\2\u0183\u0184\7\27\2\2\u0184K\3\2\2\2\u0185\u0186\7\30\2"+
		"\2\u0186\u0189\5<\37\2\u0187\u0189\3\2\2\2\u0188\u0185\3\2\2\2\u0188\u0187"+
		"\3\2\2\2\u0189M\3\2\2\2\u018a\u018b\7\31\2\2\u018b\u018c\5<\37\2\u018c"+
		"\u018d\5\4\3\2\u018d\u018e\7\32\2\2\u018eO\3\2\2\2\u018f\u0190\7\33\2"+
		"\2\u0190\u0191\5\4\3\2\u0191\u0192\7\34\2\2\u0192\u0193\5R*\2\u0193Q\3"+
		"\2\2\2\u0194\u0195\7\31\2\2\u0195\u0199\5<\37\2\u0196\u0197\7\35\2\2\u0197"+
		"\u0199\5<\37\2\u0198\u0194\3\2\2\2\u0198\u0196\3\2\2\2\u0199S\3\2\2\2"+
		"\u019a\u019b\7\36\2\2\u019b\u019c\7\37\2\2\u019c\u019d\5\26\f\2\u019d"+
		"\u019e\5V,\2\u019e\u019f\7\22\2\2\u019f\u01a0\7\36\2\2\u01a0U\3\2\2\2"+
		"\u01a1\u01a2\7\37\2\2\u01a2\u01a5\5X-\2\u01a3\u01a5\3\2\2\2\u01a4\u01a1"+
		"\3\2\2\2\u01a4\u01a3\3\2\2\2\u01a5W\3\2\2\2\u01a6\u01a7\5p9\2\u01a7\u01a8"+
		"\5\4\3\2\u01a8\u01a9\5V,\2\u01a9\u01ad\3\2\2\2\u01aa\u01ab\7\24\2\2\u01ab"+
		"\u01ad\5\4\3\2\u01ac\u01a6\3\2\2\2\u01ac\u01aa\3\2\2\2\u01adY\3\2\2\2"+
		"\u01ae\u01af\7 \2\2\u01af\u01b0\7>\2\2\u01b0\u01b1\5\\/\2\u01b1\u01b2"+
		"\5\4\3\2\u01b2\u01b3\7\22\2\2\u01b3\u01b4\7 \2\2\u01b4\u01b5\5Z.\2\u01b5"+
		"\u01c0\3\2\2\2\u01b6\u01b7\7!\2\2\u01b7\u01b8\5\22\n\2\u01b8\u01b9\5\\"+
		"/\2\u01b9\u01ba\5\4\3\2\u01ba\u01bb\7\22\2\2\u01bb\u01bc\7!\2\2\u01bc"+
		"\u01bd\5Z.\2\u01bd\u01c0\3\2\2\2\u01be\u01c0\3\2\2\2\u01bf\u01ae\3\2\2"+
		"\2\u01bf\u01b6\3\2\2\2\u01bf\u01be\3\2\2\2\u01c0[\3\2\2\2\u01c1\u01c2"+
		"\7\6\2\2\u01c2\u01c3\5^\60\2\u01c3\u01c4\7\7\2\2\u01c4\u01c7\3\2\2\2\u01c5"+
		"\u01c7\3\2\2\2\u01c6\u01c1\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7]\3\2\2\2"+
		"\u01c8\u01c9\7>\2\2\u01c9\u01ca\5`\61\2\u01ca_\3\2\2\2\u01cb\u01cc\5\32"+
		"\16\2\u01cc\u01cd\5b\62\2\u01cd\u01d6\3\2\2\2\u01ce\u01cf\7\6\2\2\u01cf"+
		"\u01d0\7\7\2\2\u01d0\u01d1\7\4\2\2\u01d1\u01d2\5v<\2\u01d2\u01d3\5b\62"+
		"\2\u01d3\u01d6\3\2\2\2\u01d4\u01d6\5b\62\2\u01d5\u01cb\3\2\2\2\u01d5\u01ce"+
		"\3\2\2\2\u01d5\u01d4\3\2\2\2\u01d6a\3\2\2\2\u01d7\u01d8\7\b\2\2\u01d8"+
		"\u01db\5^\60\2\u01d9\u01db\3\2\2\2\u01da\u01d7\3\2\2\2\u01da\u01d9\3\2"+
		"\2\2\u01dbc\3\2\2\2\u01dc\u01dd\7\6\2\2\u01dd\u01de\5\66\34\2\u01de\u01df"+
		"\7\7\2\2\u01df\u01e0\5f\64\2\u01e0\u01e5\3\2\2\2\u01e1\u01e2\5\66\34\2"+
		"\u01e2\u01e3\5f\64\2\u01e3\u01e5\3\2\2\2\u01e4\u01dc\3\2\2\2\u01e4\u01e1"+
		"\3\2\2\2\u01e5e\3\2\2\2\u01e6\u01e7\7\b\2\2\u01e7\u01ea\5d\63\2\u01e8"+
		"\u01ea\3\2\2\2\u01e9\u01e6\3\2\2\2\u01e9\u01e8\3\2\2\2\u01eag\3\2\2\2"+
		"\u01eb\u01ec\7\"\2\2\u01ec\u01ed\5\26\f\2\u01ed\u01ee\5j\66\2\u01eei\3"+
		"\2\2\2\u01ef\u01f0\7\b\2\2\u01f0\u01f1\5\26\f\2\u01f1\u01f2\5j\66\2\u01f2"+
		"\u01f5\3\2\2\2\u01f3\u01f5\3\2\2\2\u01f4\u01ef\3\2\2\2\u01f4\u01f3\3\2"+
		"\2\2\u01f5k\3\2\2\2\u01f6\u01f7\7#\2\2\u01f7\u01f8\5n8\2\u01f8m\3\2\2"+
		"\2\u01f9\u01fa\5<\37\2\u01fa\u01fb\5n8\2\u01fb\u0200\3\2\2\2\u01fc\u01fd"+
		"\7$\2\2\u01fd\u0200\5n8\2\u01fe\u0200\3\2\2\2\u01ff\u01f9\3\2\2\2\u01ff"+
		"\u01fc\3\2\2\2\u01ff\u01fe\3\2\2\2\u0200o\3\2\2\2\u0201\u0202\t\3\2\2"+
		"\u0202q\3\2\2\2\u0203\u0204\t\4\2\2\u0204s\3\2\2\2\u0205\u0206\t\5\2\2"+
		"\u0206u\3\2\2\2\u0207\u0208\t\6\2\2\u0208w\3\2\2\2$\u009b\u00a9\u00b3"+
		"\u00bb\u00cd\u00d6\u00de\u00e6\u00f5\u0103\u010d\u0116\u011b\u0124\u0131"+
		"\u013c\u0143\u0151\u015a\u0162\u0174\u0179\u0188\u0198\u01a4\u01ac\u01bf"+
		"\u01c6\u01d5\u01da\u01e4\u01e9\u01f4\u01ff";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}