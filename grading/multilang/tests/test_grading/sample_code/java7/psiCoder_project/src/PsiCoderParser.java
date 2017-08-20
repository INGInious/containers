// Generated from PsiCoder.g by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PsiCoderParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, COMMENT=24, 
		LINE_COMMENT=25, WS=26, TIPO2=27, TK_ROMPER=28, TK_REAL=29, TK_BOOLEANO=30, 
		TK_ENTERO=31, TK_CADENA=32, TK_CARACTER=33, TK_MULT=34, TK_SUMA=35, TK_COMPARACION=36, 
		TK_IGUALDAD=37, TK_IGUAL=38, TK_PYC=39, TK_PI=40, TK_PD=41, TK_PUNTO=42, 
		TK_DOSPUNTOS=43, TK_OR=44, TK_AND=45, TK_DIFERENTE=46, TK_COMA=47, ID=48;
	public static final int
		RULE_programa = 0, RULE_declaracionesExternas = 1, RULE_funcionN = 2, 
		RULE_estructuraN = 3, RULE_declaraciones = 4, RULE_declaracion = 5, RULE_declaracionesMultiples = 6, 
		RULE_declaracion2 = 7, RULE_declaracion2Aux = 8, RULE_asignador = 9, RULE_parametros = 10, 
		RULE_parametrosMultiples = 11, RULE_tipo = 12, RULE_identificadorDeclaracion = 13, 
		RULE_identificador = 14, RULE_identificadorEstructura = 15, RULE_lexemaConcreto = 16, 
		RULE_expresion = 17, RULE_expresionBooleana = 18, RULE_expresionRelacional1 = 19, 
		RULE_expresionRelacional = 20, RULE_expresionAritmetica1 = 21, RULE_expresionAritmetica = 22, 
		RULE_expresionUnaria = 23, RULE_expresionBasica = 24, RULE_auxiliarExpresionBasica = 25, 
		RULE_auxiliarExpresionBasica2 = 26, RULE_comandos = 27, RULE_comando = 28, 
		RULE_auxiliarComando = 29, RULE_auxiliarComando2 = 30, RULE_funcionEspecial = 31, 
		RULE_condicional = 32, RULE_elseNonTerminal = 33, RULE_valores = 34, RULE_valoresImprimir = 35, 
		RULE_valoresMultiplesImprimir = 36, RULE_valoresMultiples = 37, RULE_cicloWhile = 38, 
		RULE_cicloDoWhile = 39, RULE_cicloPara = 40, RULE_seleccionador = 41, 
		RULE_declaracionFor = 42, RULE_auxiliarCasos = 43, RULE_auxiliarCasos2 = 44, 
		RULE_auxiliarCasos3 = 45, RULE_opcionalRomper = 46;
	public static final String[] ruleNames = {
		"programa", "declaracionesExternas", "funcionN", "estructuraN", "declaraciones", 
		"declaracion", "declaracionesMultiples", "declaracion2", "declaracion2Aux", 
		"asignador", "parametros", "parametrosMultiples", "tipo", "identificadorDeclaracion", 
		"identificador", "identificadorEstructura", "lexemaConcreto", "expresion", 
		"expresionBooleana", "expresionRelacional1", "expresionRelacional", "expresionAritmetica1", 
		"expresionAritmetica", "expresionUnaria", "expresionBasica", "auxiliarExpresionBasica", 
		"auxiliarExpresionBasica2", "comandos", "comando", "auxiliarComando", 
		"auxiliarComando2", "funcionEspecial", "condicional", "elseNonTerminal", 
		"valores", "valoresImprimir", "valoresMultiplesImprimir", "valoresMultiples", 
		"cicloWhile", "cicloDoWhile", "cicloPara", "seleccionador", "declaracionFor", 
		"auxiliarCasos", "auxiliarCasos2", "auxiliarCasos3", "opcionalRomper"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'funcion_principal'", "'fin_principal'", "'funcion'", "'hacer'", 
		"'retornar'", "'fin_funcion'", "'estructura'", "'fin_estructura'", "'imprimir'", 
		"'leer'", "'si'", "'entonces'", "'fin_si'", "'si_no'", "'mientras'", "'fin_mientras'", 
		"'para'", "'fin_para'", "'seleccionar'", "'entre'", "'fin_seleccionar'", 
		"'caso'", "'defecto'", null, null, null, null, "'romper'", null, null, 
		null, null, null, null, null, null, null, "'='", "';'", "'('", "')'", 
		"'.'", "':'", "'||'", "'&&'", "'!'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"COMMENT", "LINE_COMMENT", "WS", "TIPO2", "TK_ROMPER", "TK_REAL", "TK_BOOLEANO", 
		"TK_ENTERO", "TK_CADENA", "TK_CARACTER", "TK_MULT", "TK_SUMA", "TK_COMPARACION", 
		"TK_IGUALDAD", "TK_IGUAL", "TK_PYC", "TK_PI", "TK_PD", "TK_PUNTO", "TK_DOSPUNTOS", 
		"TK_OR", "TK_AND", "TK_DIFERENTE", "TK_COMA", "ID"
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
	public String getGrammarFileName() { return "PsiCoder.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PsiCoderParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public List<DeclaracionesExternasContext> declaracionesExternas() {
			return getRuleContexts(DeclaracionesExternasContext.class);
		}
		public DeclaracionesExternasContext declaracionesExternas(int i) {
			return getRuleContext(DeclaracionesExternasContext.class,i);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PsiCoderParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			declaracionesExternas();
			setState(95);
			match(T__0);
			setState(96);
			comandos();
			setState(97);
			match(T__1);
			setState(98);
			declaracionesExternas();
			setState(99);
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

	public static class DeclaracionesExternasContext extends ParserRuleContext {
		public FuncionNContext funcionN() {
			return getRuleContext(FuncionNContext.class,0);
		}
		public DeclaracionesExternasContext declaracionesExternas() {
			return getRuleContext(DeclaracionesExternasContext.class,0);
		}
		public EstructuraNContext estructuraN() {
			return getRuleContext(EstructuraNContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public DeclaracionesExternasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionesExternas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterDeclaracionesExternas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitDeclaracionesExternas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitDeclaracionesExternas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionesExternasContext declaracionesExternas() throws RecognitionException {
		DeclaracionesExternasContext _localctx = new DeclaracionesExternasContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracionesExternas);
		try {
			setState(111);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				funcionN();
				setState(102);
				declaracionesExternas();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				estructuraN();
				setState(105);
				declaracionesExternas();
				}
				break;
			case TIPO2:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				declaracion();
				setState(108);
				declaracionesExternas();
				}
				break;
			case EOF:
			case T__0:
				enterOuterAlt(_localctx, 4);
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

	public static class FuncionNContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public IdentificadorDeclaracionContext identificadorDeclaracion() {
			return getRuleContext(IdentificadorDeclaracionContext.class,0);
		}
		public TerminalNode TK_PI() { return getToken(PsiCoderParser.TK_PI, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode TK_PD() { return getToken(PsiCoderParser.TK_PD, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode TK_PYC() { return getToken(PsiCoderParser.TK_PYC, 0); }
		public FuncionNContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionN; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterFuncionN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitFuncionN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitFuncionN(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionNContext funcionN() throws RecognitionException {
		FuncionNContext _localctx = new FuncionNContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcionN);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__2);
			setState(114);
			tipo();
			setState(115);
			identificadorDeclaracion();
			setState(116);
			match(TK_PI);
			setState(117);
			parametros();
			setState(118);
			match(TK_PD);
			setState(119);
			match(T__3);
			setState(120);
			comandos();
			setState(121);
			match(T__4);
			setState(122);
			expresion(0);
			setState(123);
			match(TK_PYC);
			setState(124);
			match(T__5);
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

	public static class EstructuraNContext extends ParserRuleContext {
		public IdentificadorDeclaracionContext identificadorDeclaracion() {
			return getRuleContext(IdentificadorDeclaracionContext.class,0);
		}
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
		}
		public EstructuraNContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estructuraN; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterEstructuraN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitEstructuraN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitEstructuraN(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstructuraNContext estructuraN() throws RecognitionException {
		EstructuraNContext _localctx = new EstructuraNContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_estructuraN);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__6);
			setState(127);
			identificadorDeclaracion();
			setState(128);
			declaraciones();
			setState(129);
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

	public static class DeclaracionesContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
		}
		public DeclaracionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaraciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterDeclaraciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitDeclaraciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitDeclaraciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionesContext declaraciones() throws RecognitionException {
		DeclaracionesContext _localctx = new DeclaracionesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaraciones);
		try {
			setState(135);
			switch (_input.LA(1)) {
			case TIPO2:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				declaracion();
				setState(132);
				declaraciones();
				}
				break;
			case T__7:
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

	public static class DeclaracionContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public IdentificadorDeclaracionContext identificadorDeclaracion() {
			return getRuleContext(IdentificadorDeclaracionContext.class,0);
		}
		public AsignadorContext asignador() {
			return getRuleContext(AsignadorContext.class,0);
		}
		public DeclaracionesMultiplesContext declaracionesMultiples() {
			return getRuleContext(DeclaracionesMultiplesContext.class,0);
		}
		public TerminalNode TK_PYC() { return getToken(PsiCoderParser.TK_PYC, 0); }
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			tipo();
			setState(138);
			identificadorDeclaracion();
			setState(139);
			asignador();
			setState(140);
			declaracionesMultiples();
			setState(141);
			match(TK_PYC);
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

	public static class DeclaracionesMultiplesContext extends ParserRuleContext {
		public TerminalNode TK_COMA() { return getToken(PsiCoderParser.TK_COMA, 0); }
		public IdentificadorDeclaracionContext identificadorDeclaracion() {
			return getRuleContext(IdentificadorDeclaracionContext.class,0);
		}
		public AsignadorContext asignador() {
			return getRuleContext(AsignadorContext.class,0);
		}
		public DeclaracionesMultiplesContext declaracionesMultiples() {
			return getRuleContext(DeclaracionesMultiplesContext.class,0);
		}
		public DeclaracionesMultiplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionesMultiples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterDeclaracionesMultiples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitDeclaracionesMultiples(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitDeclaracionesMultiples(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionesMultiplesContext declaracionesMultiples() throws RecognitionException {
		DeclaracionesMultiplesContext _localctx = new DeclaracionesMultiplesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaracionesMultiples);
		try {
			setState(149);
			switch (_input.LA(1)) {
			case TK_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(TK_COMA);
				setState(144);
				identificadorDeclaracion();
				setState(145);
				asignador();
				setState(146);
				declaracionesMultiples();
				}
				break;
			case TK_PYC:
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

	public static class Declaracion2Context extends ParserRuleContext {
		public TerminalNode TIPO2() { return getToken(PsiCoderParser.TIPO2, 0); }
		public IdentificadorDeclaracionContext identificadorDeclaracion() {
			return getRuleContext(IdentificadorDeclaracionContext.class,0);
		}
		public AsignadorContext asignador() {
			return getRuleContext(AsignadorContext.class,0);
		}
		public DeclaracionesMultiplesContext declaracionesMultiples() {
			return getRuleContext(DeclaracionesMultiplesContext.class,0);
		}
		public Declaracion2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterDeclaracion2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitDeclaracion2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitDeclaracion2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracion2Context declaracion2() throws RecognitionException {
		Declaracion2Context _localctx = new Declaracion2Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaracion2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(TIPO2);
			setState(152);
			identificadorDeclaracion();
			setState(153);
			asignador();
			setState(154);
			declaracionesMultiples();
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

	public static class Declaracion2AuxContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public AsignadorContext asignador() {
			return getRuleContext(AsignadorContext.class,0);
		}
		public DeclaracionesMultiplesContext declaracionesMultiples() {
			return getRuleContext(DeclaracionesMultiplesContext.class,0);
		}
		public TerminalNode TK_IGUAL() { return getToken(PsiCoderParser.TK_IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Declaracion2AuxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion2Aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterDeclaracion2Aux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitDeclaracion2Aux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitDeclaracion2Aux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracion2AuxContext declaracion2Aux() throws RecognitionException {
		Declaracion2AuxContext _localctx = new Declaracion2AuxContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaracion2Aux);
		try {
			setState(162);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				identificador();
				setState(157);
				asignador();
				setState(158);
				declaracionesMultiples();
				}
				break;
			case TK_IGUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(TK_IGUAL);
				setState(161);
				expresion(0);
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

	public static class AsignadorContext extends ParserRuleContext {
		public TerminalNode TK_IGUAL() { return getToken(PsiCoderParser.TK_IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsignadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterAsignador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitAsignador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitAsignador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignadorContext asignador() throws RecognitionException {
		AsignadorContext _localctx = new AsignadorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_asignador);
		try {
			setState(167);
			switch (_input.LA(1)) {
			case TK_IGUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(TK_IGUAL);
				setState(165);
				expresion(0);
				}
				break;
			case TK_PYC:
			case TK_COMA:
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

	public static class ParametrosContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public IdentificadorDeclaracionContext identificadorDeclaracion() {
			return getRuleContext(IdentificadorDeclaracionContext.class,0);
		}
		public ParametrosMultiplesContext parametrosMultiples() {
			return getRuleContext(ParametrosMultiplesContext.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parametros);
		try {
			setState(174);
			switch (_input.LA(1)) {
			case TIPO2:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				tipo();
				setState(170);
				identificadorDeclaracion();
				setState(171);
				parametrosMultiples();
				}
				break;
			case TK_PD:
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

	public static class ParametrosMultiplesContext extends ParserRuleContext {
		public TerminalNode TK_COMA() { return getToken(PsiCoderParser.TK_COMA, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public IdentificadorDeclaracionContext identificadorDeclaracion() {
			return getRuleContext(IdentificadorDeclaracionContext.class,0);
		}
		public ParametrosMultiplesContext parametrosMultiples() {
			return getRuleContext(ParametrosMultiplesContext.class,0);
		}
		public ParametrosMultiplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrosMultiples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterParametrosMultiples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitParametrosMultiples(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitParametrosMultiples(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosMultiplesContext parametrosMultiples() throws RecognitionException {
		ParametrosMultiplesContext _localctx = new ParametrosMultiplesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parametrosMultiples);
		try {
			setState(182);
			switch (_input.LA(1)) {
			case TK_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(TK_COMA);
				setState(177);
				tipo();
				setState(178);
				identificadorDeclaracion();
				setState(179);
				parametrosMultiples();
				}
				break;
			case TK_PD:
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode TIPO2() { return getToken(PsiCoderParser.TIPO2, 0); }
		public IdentificadorDeclaracionContext identificadorDeclaracion() {
			return getRuleContext(IdentificadorDeclaracionContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tipo);
		try {
			setState(186);
			switch (_input.LA(1)) {
			case TIPO2:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(TIPO2);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				identificadorDeclaracion();
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

	public static class IdentificadorDeclaracionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PsiCoderParser.ID, 0); }
		public IdentificadorDeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificadorDeclaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterIdentificadorDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitIdentificadorDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitIdentificadorDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificadorDeclaracionContext identificadorDeclaracion() throws RecognitionException {
		IdentificadorDeclaracionContext _localctx = new IdentificadorDeclaracionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_identificadorDeclaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
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

	public static class IdentificadorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PsiCoderParser.ID, 0); }
		public IdentificadorEstructuraContext identificadorEstructura() {
			return getRuleContext(IdentificadorEstructuraContext.class,0);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_identificador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(ID);
			setState(191);
			identificadorEstructura();
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

	public static class IdentificadorEstructuraContext extends ParserRuleContext {
		public TerminalNode TK_PUNTO() { return getToken(PsiCoderParser.TK_PUNTO, 0); }
		public TerminalNode ID() { return getToken(PsiCoderParser.ID, 0); }
		public IdentificadorEstructuraContext identificadorEstructura() {
			return getRuleContext(IdentificadorEstructuraContext.class,0);
		}
		public IdentificadorEstructuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificadorEstructura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterIdentificadorEstructura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitIdentificadorEstructura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitIdentificadorEstructura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificadorEstructuraContext identificadorEstructura() throws RecognitionException {
		IdentificadorEstructuraContext _localctx = new IdentificadorEstructuraContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_identificadorEstructura);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(TK_PUNTO);
				setState(194);
				match(ID);
				setState(195);
				identificadorEstructura();
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

	public static class LexemaConcretoContext extends ParserRuleContext {
		public TerminalNode TK_ENTERO() { return getToken(PsiCoderParser.TK_ENTERO, 0); }
		public TerminalNode TK_REAL() { return getToken(PsiCoderParser.TK_REAL, 0); }
		public TerminalNode TK_CADENA() { return getToken(PsiCoderParser.TK_CADENA, 0); }
		public TerminalNode TK_CARACTER() { return getToken(PsiCoderParser.TK_CARACTER, 0); }
		public TerminalNode TK_BOOLEANO() { return getToken(PsiCoderParser.TK_BOOLEANO, 0); }
		public LexemaConcretoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexemaConcreto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterLexemaConcreto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitLexemaConcreto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitLexemaConcreto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexemaConcretoContext lexemaConcreto() throws RecognitionException {
		LexemaConcretoContext _localctx = new LexemaConcretoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_lexemaConcreto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_REAL) | (1L << TK_BOOLEANO) | (1L << TK_ENTERO) | (1L << TK_CADENA) | (1L << TK_CARACTER))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ExpresionContext extends ParserRuleContext {
		public ExpresionBooleanaContext expresionBooleana() {
			return getRuleContext(ExpresionBooleanaContext.class,0);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode TK_OR() { return getToken(PsiCoderParser.TK_OR, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expresion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(202);
			expresionBooleana(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpresionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expresion);
					setState(204);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(205);
					match(TK_OR);
					setState(206);
					expresion(3);
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class ExpresionBooleanaContext extends ParserRuleContext {
		public ExpresionRelacional1Context expresionRelacional1() {
			return getRuleContext(ExpresionRelacional1Context.class,0);
		}
		public List<ExpresionBooleanaContext> expresionBooleana() {
			return getRuleContexts(ExpresionBooleanaContext.class);
		}
		public ExpresionBooleanaContext expresionBooleana(int i) {
			return getRuleContext(ExpresionBooleanaContext.class,i);
		}
		public TerminalNode TK_AND() { return getToken(PsiCoderParser.TK_AND, 0); }
		public ExpresionBooleanaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionBooleana; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterExpresionBooleana(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitExpresionBooleana(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitExpresionBooleana(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionBooleanaContext expresionBooleana() throws RecognitionException {
		return expresionBooleana(0);
	}

	private ExpresionBooleanaContext expresionBooleana(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionBooleanaContext _localctx = new ExpresionBooleanaContext(_ctx, _parentState);
		ExpresionBooleanaContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expresionBooleana, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(213);
			expresionRelacional1(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpresionBooleanaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expresionBooleana);
					setState(215);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(216);
					match(TK_AND);
					setState(217);
					expresionBooleana(3);
					}
					} 
				}
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class ExpresionRelacional1Context extends ParserRuleContext {
		public ExpresionRelacionalContext expresionRelacional() {
			return getRuleContext(ExpresionRelacionalContext.class,0);
		}
		public List<ExpresionRelacional1Context> expresionRelacional1() {
			return getRuleContexts(ExpresionRelacional1Context.class);
		}
		public ExpresionRelacional1Context expresionRelacional1(int i) {
			return getRuleContext(ExpresionRelacional1Context.class,i);
		}
		public TerminalNode TK_IGUALDAD() { return getToken(PsiCoderParser.TK_IGUALDAD, 0); }
		public ExpresionRelacional1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionRelacional1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterExpresionRelacional1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitExpresionRelacional1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitExpresionRelacional1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionRelacional1Context expresionRelacional1() throws RecognitionException {
		return expresionRelacional1(0);
	}

	private ExpresionRelacional1Context expresionRelacional1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionRelacional1Context _localctx = new ExpresionRelacional1Context(_ctx, _parentState);
		ExpresionRelacional1Context _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expresionRelacional1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(224);
			expresionRelacional(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpresionRelacional1Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expresionRelacional1);
					setState(226);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(227);
					match(TK_IGUALDAD);
					setState(228);
					expresionRelacional1(3);
					}
					} 
				}
				setState(233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class ExpresionRelacionalContext extends ParserRuleContext {
		public ExpresionAritmetica1Context expresionAritmetica1() {
			return getRuleContext(ExpresionAritmetica1Context.class,0);
		}
		public List<ExpresionRelacionalContext> expresionRelacional() {
			return getRuleContexts(ExpresionRelacionalContext.class);
		}
		public ExpresionRelacionalContext expresionRelacional(int i) {
			return getRuleContext(ExpresionRelacionalContext.class,i);
		}
		public TerminalNode TK_COMPARACION() { return getToken(PsiCoderParser.TK_COMPARACION, 0); }
		public ExpresionRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterExpresionRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitExpresionRelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitExpresionRelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionRelacionalContext expresionRelacional() throws RecognitionException {
		return expresionRelacional(0);
	}

	private ExpresionRelacionalContext expresionRelacional(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionRelacionalContext _localctx = new ExpresionRelacionalContext(_ctx, _parentState);
		ExpresionRelacionalContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expresionRelacional, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(235);
			expresionAritmetica1(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(242);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpresionRelacionalContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expresionRelacional);
					setState(237);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(238);
					match(TK_COMPARACION);
					setState(239);
					expresionRelacional(3);
					}
					} 
				}
				setState(244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class ExpresionAritmetica1Context extends ParserRuleContext {
		public ExpresionAritmeticaContext expresionAritmetica() {
			return getRuleContext(ExpresionAritmeticaContext.class,0);
		}
		public List<ExpresionAritmetica1Context> expresionAritmetica1() {
			return getRuleContexts(ExpresionAritmetica1Context.class);
		}
		public ExpresionAritmetica1Context expresionAritmetica1(int i) {
			return getRuleContext(ExpresionAritmetica1Context.class,i);
		}
		public TerminalNode TK_SUMA() { return getToken(PsiCoderParser.TK_SUMA, 0); }
		public ExpresionAritmetica1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionAritmetica1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterExpresionAritmetica1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitExpresionAritmetica1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitExpresionAritmetica1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionAritmetica1Context expresionAritmetica1() throws RecognitionException {
		return expresionAritmetica1(0);
	}

	private ExpresionAritmetica1Context expresionAritmetica1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionAritmetica1Context _localctx = new ExpresionAritmetica1Context(_ctx, _parentState);
		ExpresionAritmetica1Context _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expresionAritmetica1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(246);
			expresionAritmetica(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpresionAritmetica1Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expresionAritmetica1);
					setState(248);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(249);
					match(TK_SUMA);
					setState(250);
					expresionAritmetica1(2);
					}
					} 
				}
				setState(255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class ExpresionAritmeticaContext extends ParserRuleContext {
		public ExpresionUnariaContext expresionUnaria() {
			return getRuleContext(ExpresionUnariaContext.class,0);
		}
		public List<ExpresionAritmeticaContext> expresionAritmetica() {
			return getRuleContexts(ExpresionAritmeticaContext.class);
		}
		public ExpresionAritmeticaContext expresionAritmetica(int i) {
			return getRuleContext(ExpresionAritmeticaContext.class,i);
		}
		public TerminalNode TK_MULT() { return getToken(PsiCoderParser.TK_MULT, 0); }
		public ExpresionAritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionAritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterExpresionAritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitExpresionAritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitExpresionAritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionAritmeticaContext expresionAritmetica() throws RecognitionException {
		return expresionAritmetica(0);
	}

	private ExpresionAritmeticaContext expresionAritmetica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionAritmeticaContext _localctx = new ExpresionAritmeticaContext(_ctx, _parentState);
		ExpresionAritmeticaContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expresionAritmetica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(257);
			expresionUnaria();
			}
			_ctx.stop = _input.LT(-1);
			setState(264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpresionAritmeticaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expresionAritmetica);
					setState(259);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(260);
					match(TK_MULT);
					setState(261);
					expresionAritmetica(2);
					}
					} 
				}
				setState(266);
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

	public static class ExpresionUnariaContext extends ParserRuleContext {
		public TerminalNode TK_SUMA() { return getToken(PsiCoderParser.TK_SUMA, 0); }
		public ExpresionBasicaContext expresionBasica() {
			return getRuleContext(ExpresionBasicaContext.class,0);
		}
		public TerminalNode TK_DIFERENTE() { return getToken(PsiCoderParser.TK_DIFERENTE, 0); }
		public ExpresionUnariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionUnaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterExpresionUnaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitExpresionUnaria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitExpresionUnaria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionUnariaContext expresionUnaria() throws RecognitionException {
		ExpresionUnariaContext _localctx = new ExpresionUnariaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expresionUnaria);
		try {
			setState(272);
			switch (_input.LA(1)) {
			case TK_SUMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(TK_SUMA);
				setState(268);
				expresionBasica();
				}
				break;
			case TK_DIFERENTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(TK_DIFERENTE);
				setState(270);
				expresionBasica();
				}
				break;
			case TK_REAL:
			case TK_BOOLEANO:
			case TK_ENTERO:
			case TK_CADENA:
			case TK_CARACTER:
			case TK_PI:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				expresionBasica();
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

	public static class ExpresionBasicaContext extends ParserRuleContext {
		public TerminalNode TK_CADENA() { return getToken(PsiCoderParser.TK_CADENA, 0); }
		public TerminalNode TK_ENTERO() { return getToken(PsiCoderParser.TK_ENTERO, 0); }
		public TerminalNode TK_REAL() { return getToken(PsiCoderParser.TK_REAL, 0); }
		public TerminalNode TK_CARACTER() { return getToken(PsiCoderParser.TK_CARACTER, 0); }
		public TerminalNode TK_BOOLEANO() { return getToken(PsiCoderParser.TK_BOOLEANO, 0); }
		public TerminalNode TK_PI() { return getToken(PsiCoderParser.TK_PI, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode TK_PD() { return getToken(PsiCoderParser.TK_PD, 0); }
		public AuxiliarExpresionBasicaContext auxiliarExpresionBasica() {
			return getRuleContext(AuxiliarExpresionBasicaContext.class,0);
		}
		public ExpresionBasicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionBasica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterExpresionBasica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitExpresionBasica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitExpresionBasica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionBasicaContext expresionBasica() throws RecognitionException {
		ExpresionBasicaContext _localctx = new ExpresionBasicaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expresionBasica);
		try {
			setState(284);
			switch (_input.LA(1)) {
			case TK_CADENA:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(TK_CADENA);
				}
				break;
			case TK_ENTERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				match(TK_ENTERO);
				}
				break;
			case TK_REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				match(TK_REAL);
				}
				break;
			case TK_CARACTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(277);
				match(TK_CARACTER);
				}
				break;
			case TK_BOOLEANO:
				enterOuterAlt(_localctx, 5);
				{
				setState(278);
				match(TK_BOOLEANO);
				}
				break;
			case TK_PI:
				enterOuterAlt(_localctx, 6);
				{
				setState(279);
				match(TK_PI);
				setState(280);
				expresion(0);
				setState(281);
				match(TK_PD);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(283);
				auxiliarExpresionBasica();
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

	public static class AuxiliarExpresionBasicaContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public AuxiliarExpresionBasica2Context auxiliarExpresionBasica2() {
			return getRuleContext(AuxiliarExpresionBasica2Context.class,0);
		}
		public AuxiliarExpresionBasicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxiliarExpresionBasica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterAuxiliarExpresionBasica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitAuxiliarExpresionBasica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitAuxiliarExpresionBasica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuxiliarExpresionBasicaContext auxiliarExpresionBasica() throws RecognitionException {
		AuxiliarExpresionBasicaContext _localctx = new AuxiliarExpresionBasicaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_auxiliarExpresionBasica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			identificador();
			setState(287);
			auxiliarExpresionBasica2();
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

	public static class AuxiliarExpresionBasica2Context extends ParserRuleContext {
		public TerminalNode TK_PI() { return getToken(PsiCoderParser.TK_PI, 0); }
		public ValoresContext valores() {
			return getRuleContext(ValoresContext.class,0);
		}
		public TerminalNode TK_PD() { return getToken(PsiCoderParser.TK_PD, 0); }
		public AuxiliarExpresionBasica2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxiliarExpresionBasica2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterAuxiliarExpresionBasica2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitAuxiliarExpresionBasica2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitAuxiliarExpresionBasica2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuxiliarExpresionBasica2Context auxiliarExpresionBasica2() throws RecognitionException {
		AuxiliarExpresionBasica2Context _localctx = new AuxiliarExpresionBasica2Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_auxiliarExpresionBasica2);
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(TK_PI);
				setState(290);
				valores();
				setState(291);
				match(TK_PD);
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

	public static class ComandosContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitComandos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitComandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_comandos);
		try {
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				comando();
				setState(297);
				comandos();
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

	public static class ComandoContext extends ParserRuleContext {
		public TerminalNode TK_ROMPER() { return getToken(PsiCoderParser.TK_ROMPER, 0); }
		public TerminalNode TK_PYC() { return getToken(PsiCoderParser.TK_PYC, 0); }
		public FuncionEspecialContext funcionEspecial() {
			return getRuleContext(FuncionEspecialContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public Declaracion2Context declaracion2() {
			return getRuleContext(Declaracion2Context.class,0);
		}
		public CicloWhileContext cicloWhile() {
			return getRuleContext(CicloWhileContext.class,0);
		}
		public CicloDoWhileContext cicloDoWhile() {
			return getRuleContext(CicloDoWhileContext.class,0);
		}
		public CicloParaContext cicloPara() {
			return getRuleContext(CicloParaContext.class,0);
		}
		public SeleccionadorContext seleccionador() {
			return getRuleContext(SeleccionadorContext.class,0);
		}
		public AuxiliarComandoContext auxiliarComando() {
			return getRuleContext(AuxiliarComandoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_comando);
		try {
			setState(316);
			switch (_input.LA(1)) {
			case TK_ROMPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(TK_ROMPER);
				setState(303);
				match(TK_PYC);
				}
				break;
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				funcionEspecial();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				condicional();
				}
				break;
			case TIPO2:
				enterOuterAlt(_localctx, 4);
				{
				setState(306);
				declaracion2();
				setState(307);
				match(TK_PYC);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 5);
				{
				setState(309);
				cicloWhile();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 6);
				{
				setState(310);
				cicloDoWhile();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 7);
				{
				setState(311);
				cicloPara();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 8);
				{
				setState(312);
				seleccionador();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 9);
				{
				setState(313);
				auxiliarComando();
				setState(314);
				match(TK_PYC);
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

	public static class AuxiliarComandoContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public AuxiliarComando2Context auxiliarComando2() {
			return getRuleContext(AuxiliarComando2Context.class,0);
		}
		public AuxiliarComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxiliarComando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterAuxiliarComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitAuxiliarComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitAuxiliarComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuxiliarComandoContext auxiliarComando() throws RecognitionException {
		AuxiliarComandoContext _localctx = new AuxiliarComandoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_auxiliarComando);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			identificador();
			setState(319);
			auxiliarComando2();
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

	public static class AuxiliarComando2Context extends ParserRuleContext {
		public TerminalNode TK_PI() { return getToken(PsiCoderParser.TK_PI, 0); }
		public ValoresContext valores() {
			return getRuleContext(ValoresContext.class,0);
		}
		public TerminalNode TK_PD() { return getToken(PsiCoderParser.TK_PD, 0); }
		public Declaracion2AuxContext declaracion2Aux() {
			return getRuleContext(Declaracion2AuxContext.class,0);
		}
		public AuxiliarComando2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxiliarComando2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterAuxiliarComando2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitAuxiliarComando2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitAuxiliarComando2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuxiliarComando2Context auxiliarComando2() throws RecognitionException {
		AuxiliarComando2Context _localctx = new AuxiliarComando2Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_auxiliarComando2);
		try {
			setState(326);
			switch (_input.LA(1)) {
			case TK_PI:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				match(TK_PI);
				setState(322);
				valores();
				setState(323);
				match(TK_PD);
				}
				break;
			case TK_IGUAL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				declaracion2Aux();
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

	public static class FuncionEspecialContext extends ParserRuleContext {
		public TerminalNode TK_PI() { return getToken(PsiCoderParser.TK_PI, 0); }
		public ValoresImprimirContext valoresImprimir() {
			return getRuleContext(ValoresImprimirContext.class,0);
		}
		public TerminalNode TK_PD() { return getToken(PsiCoderParser.TK_PD, 0); }
		public TerminalNode TK_PYC() { return getToken(PsiCoderParser.TK_PYC, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public FuncionEspecialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionEspecial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterFuncionEspecial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitFuncionEspecial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitFuncionEspecial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionEspecialContext funcionEspecial() throws RecognitionException {
		FuncionEspecialContext _localctx = new FuncionEspecialContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_funcionEspecial);
		try {
			setState(340);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				match(T__8);
				setState(329);
				match(TK_PI);
				setState(330);
				valoresImprimir();
				setState(331);
				match(TK_PD);
				setState(332);
				match(TK_PYC);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				match(T__9);
				setState(335);
				match(TK_PI);
				setState(336);
				identificador();
				setState(337);
				match(TK_PD);
				setState(338);
				match(TK_PYC);
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

	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode TK_PI() { return getToken(PsiCoderParser.TK_PI, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode TK_PD() { return getToken(PsiCoderParser.TK_PD, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public ElseNonTerminalContext elseNonTerminal() {
			return getRuleContext(ElseNonTerminalContext.class,0);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(T__10);
			setState(343);
			match(TK_PI);
			setState(344);
			expresion(0);
			setState(345);
			match(TK_PD);
			setState(346);
			match(T__11);
			setState(347);
			comandos();
			setState(348);
			elseNonTerminal();
			setState(349);
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

	public static class ElseNonTerminalContext extends ParserRuleContext {
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public ElseNonTerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseNonTerminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterElseNonTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitElseNonTerminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitElseNonTerminal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseNonTerminalContext elseNonTerminal() throws RecognitionException {
		ElseNonTerminalContext _localctx = new ElseNonTerminalContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_elseNonTerminal);
		try {
			setState(354);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				match(T__13);
				setState(352);
				comandos();
				}
				break;
			case T__12:
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

	public static class ValoresContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ValoresMultiplesContext valoresMultiples() {
			return getRuleContext(ValoresMultiplesContext.class,0);
		}
		public ValoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterValores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitValores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitValores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValoresContext valores() throws RecognitionException {
		ValoresContext _localctx = new ValoresContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_valores);
		try {
			setState(360);
			switch (_input.LA(1)) {
			case TK_REAL:
			case TK_BOOLEANO:
			case TK_ENTERO:
			case TK_CADENA:
			case TK_CARACTER:
			case TK_SUMA:
			case TK_PI:
			case TK_DIFERENTE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				expresion(0);
				setState(357);
				valoresMultiples();
				}
				break;
			case TK_PD:
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

	public static class ValoresImprimirContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ValoresMultiplesImprimirContext valoresMultiplesImprimir() {
			return getRuleContext(ValoresMultiplesImprimirContext.class,0);
		}
		public ValoresImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valoresImprimir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterValoresImprimir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitValoresImprimir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitValoresImprimir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValoresImprimirContext valoresImprimir() throws RecognitionException {
		ValoresImprimirContext _localctx = new ValoresImprimirContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_valoresImprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			expresion(0);
			setState(363);
			valoresMultiplesImprimir();
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

	public static class ValoresMultiplesImprimirContext extends ParserRuleContext {
		public TerminalNode TK_COMA() { return getToken(PsiCoderParser.TK_COMA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ValoresMultiplesImprimirContext valoresMultiplesImprimir() {
			return getRuleContext(ValoresMultiplesImprimirContext.class,0);
		}
		public ValoresMultiplesImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valoresMultiplesImprimir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterValoresMultiplesImprimir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitValoresMultiplesImprimir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitValoresMultiplesImprimir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValoresMultiplesImprimirContext valoresMultiplesImprimir() throws RecognitionException {
		ValoresMultiplesImprimirContext _localctx = new ValoresMultiplesImprimirContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_valoresMultiplesImprimir);
		try {
			setState(370);
			switch (_input.LA(1)) {
			case TK_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(TK_COMA);
				setState(366);
				expresion(0);
				setState(367);
				valoresMultiplesImprimir();
				}
				break;
			case TK_PD:
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

	public static class ValoresMultiplesContext extends ParserRuleContext {
		public TerminalNode TK_COMA() { return getToken(PsiCoderParser.TK_COMA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ValoresMultiplesContext valoresMultiples() {
			return getRuleContext(ValoresMultiplesContext.class,0);
		}
		public ValoresMultiplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valoresMultiples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterValoresMultiples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitValoresMultiples(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitValoresMultiples(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValoresMultiplesContext valoresMultiples() throws RecognitionException {
		ValoresMultiplesContext _localctx = new ValoresMultiplesContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_valoresMultiples);
		try {
			setState(377);
			switch (_input.LA(1)) {
			case TK_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				match(TK_COMA);
				setState(373);
				expresion(0);
				setState(374);
				valoresMultiples();
				}
				break;
			case TK_PD:
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

	public static class CicloWhileContext extends ParserRuleContext {
		public TerminalNode TK_PI() { return getToken(PsiCoderParser.TK_PI, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode TK_PD() { return getToken(PsiCoderParser.TK_PD, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public CicloWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cicloWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterCicloWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitCicloWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitCicloWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloWhileContext cicloWhile() throws RecognitionException {
		CicloWhileContext _localctx = new CicloWhileContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_cicloWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(T__14);
			setState(380);
			match(TK_PI);
			setState(381);
			expresion(0);
			setState(382);
			match(TK_PD);
			setState(383);
			match(T__3);
			setState(384);
			comandos();
			setState(385);
			match(T__15);
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

	public static class CicloDoWhileContext extends ParserRuleContext {
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode TK_PI() { return getToken(PsiCoderParser.TK_PI, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode TK_PD() { return getToken(PsiCoderParser.TK_PD, 0); }
		public TerminalNode TK_PYC() { return getToken(PsiCoderParser.TK_PYC, 0); }
		public CicloDoWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cicloDoWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterCicloDoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitCicloDoWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitCicloDoWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloDoWhileContext cicloDoWhile() throws RecognitionException {
		CicloDoWhileContext _localctx = new CicloDoWhileContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_cicloDoWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(T__3);
			setState(388);
			comandos();
			setState(389);
			match(T__14);
			setState(390);
			match(TK_PI);
			setState(391);
			expresion(0);
			setState(392);
			match(TK_PD);
			setState(393);
			match(TK_PYC);
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

	public static class CicloParaContext extends ParserRuleContext {
		public TerminalNode TK_PI() { return getToken(PsiCoderParser.TK_PI, 0); }
		public DeclaracionForContext declaracionFor() {
			return getRuleContext(DeclaracionForContext.class,0);
		}
		public List<TerminalNode> TK_PYC() { return getTokens(PsiCoderParser.TK_PYC); }
		public TerminalNode TK_PYC(int i) {
			return getToken(PsiCoderParser.TK_PYC, i);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ExpresionAritmetica1Context expresionAritmetica1() {
			return getRuleContext(ExpresionAritmetica1Context.class,0);
		}
		public TerminalNode TK_PD() { return getToken(PsiCoderParser.TK_PD, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public CicloParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cicloPara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterCicloPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitCicloPara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitCicloPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloParaContext cicloPara() throws RecognitionException {
		CicloParaContext _localctx = new CicloParaContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_cicloPara);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(T__16);
			setState(396);
			match(TK_PI);
			setState(397);
			declaracionFor();
			setState(398);
			match(TK_PYC);
			setState(399);
			expresion(0);
			setState(400);
			match(TK_PYC);
			setState(401);
			expresionAritmetica1(0);
			setState(402);
			match(TK_PD);
			setState(403);
			match(T__3);
			setState(404);
			comandos();
			setState(405);
			match(T__17);
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

	public static class SeleccionadorContext extends ParserRuleContext {
		public TerminalNode TK_PI() { return getToken(PsiCoderParser.TK_PI, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode TK_PD() { return getToken(PsiCoderParser.TK_PD, 0); }
		public AuxiliarCasosContext auxiliarCasos() {
			return getRuleContext(AuxiliarCasosContext.class,0);
		}
		public SeleccionadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seleccionador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterSeleccionador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitSeleccionador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitSeleccionador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeleccionadorContext seleccionador() throws RecognitionException {
		SeleccionadorContext _localctx = new SeleccionadorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_seleccionador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(T__18);
			setState(408);
			match(TK_PI);
			setState(409);
			identificador();
			setState(410);
			match(TK_PD);
			setState(411);
			match(T__19);
			setState(412);
			auxiliarCasos();
			setState(413);
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

	public static class DeclaracionForContext extends ParserRuleContext {
		public Declaracion2Context declaracion2() {
			return getRuleContext(Declaracion2Context.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode TK_IGUAL() { return getToken(PsiCoderParser.TK_IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public DeclaracionForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterDeclaracionFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitDeclaracionFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitDeclaracionFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionForContext declaracionFor() throws RecognitionException {
		DeclaracionForContext _localctx = new DeclaracionForContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_declaracionFor);
		try {
			setState(420);
			switch (_input.LA(1)) {
			case TIPO2:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				declaracion2();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				identificador();
				setState(417);
				match(TK_IGUAL);
				setState(418);
				expresion(0);
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

	public static class AuxiliarCasosContext extends ParserRuleContext {
		public LexemaConcretoContext lexemaConcreto() {
			return getRuleContext(LexemaConcretoContext.class,0);
		}
		public TerminalNode TK_DOSPUNTOS() { return getToken(PsiCoderParser.TK_DOSPUNTOS, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public OpcionalRomperContext opcionalRomper() {
			return getRuleContext(OpcionalRomperContext.class,0);
		}
		public AuxiliarCasos2Context auxiliarCasos2() {
			return getRuleContext(AuxiliarCasos2Context.class,0);
		}
		public AuxiliarCasos3Context auxiliarCasos3() {
			return getRuleContext(AuxiliarCasos3Context.class,0);
		}
		public AuxiliarCasosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxiliarCasos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterAuxiliarCasos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitAuxiliarCasos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitAuxiliarCasos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuxiliarCasosContext auxiliarCasos() throws RecognitionException {
		AuxiliarCasosContext _localctx = new AuxiliarCasosContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_auxiliarCasos);
		try {
			setState(430);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				match(T__21);
				setState(423);
				lexemaConcreto();
				setState(424);
				match(TK_DOSPUNTOS);
				setState(425);
				comandos();
				setState(426);
				opcionalRomper();
				setState(427);
				auxiliarCasos2();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				auxiliarCasos3();
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

	public static class AuxiliarCasos2Context extends ParserRuleContext {
		public LexemaConcretoContext lexemaConcreto() {
			return getRuleContext(LexemaConcretoContext.class,0);
		}
		public TerminalNode TK_DOSPUNTOS() { return getToken(PsiCoderParser.TK_DOSPUNTOS, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public OpcionalRomperContext opcionalRomper() {
			return getRuleContext(OpcionalRomperContext.class,0);
		}
		public AuxiliarCasos2Context auxiliarCasos2() {
			return getRuleContext(AuxiliarCasos2Context.class,0);
		}
		public AuxiliarCasos3Context auxiliarCasos3() {
			return getRuleContext(AuxiliarCasos3Context.class,0);
		}
		public AuxiliarCasos2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxiliarCasos2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterAuxiliarCasos2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitAuxiliarCasos2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitAuxiliarCasos2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuxiliarCasos2Context auxiliarCasos2() throws RecognitionException {
		AuxiliarCasos2Context _localctx = new AuxiliarCasos2Context(_ctx, getState());
		enterRule(_localctx, 88, RULE_auxiliarCasos2);
		try {
			setState(441);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				match(T__21);
				setState(433);
				lexemaConcreto();
				setState(434);
				match(TK_DOSPUNTOS);
				setState(435);
				comandos();
				setState(436);
				opcionalRomper();
				setState(437);
				auxiliarCasos2();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
				auxiliarCasos3();
				}
				break;
			case T__20:
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

	public static class AuxiliarCasos3Context extends ParserRuleContext {
		public TerminalNode TK_DOSPUNTOS() { return getToken(PsiCoderParser.TK_DOSPUNTOS, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public OpcionalRomperContext opcionalRomper() {
			return getRuleContext(OpcionalRomperContext.class,0);
		}
		public AuxiliarCasos3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxiliarCasos3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterAuxiliarCasos3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitAuxiliarCasos3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitAuxiliarCasos3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuxiliarCasos3Context auxiliarCasos3() throws RecognitionException {
		AuxiliarCasos3Context _localctx = new AuxiliarCasos3Context(_ctx, getState());
		enterRule(_localctx, 90, RULE_auxiliarCasos3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(T__22);
			setState(444);
			match(TK_DOSPUNTOS);
			setState(445);
			comandos();
			setState(446);
			opcionalRomper();
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

	public static class OpcionalRomperContext extends ParserRuleContext {
		public TerminalNode TK_ROMPER() { return getToken(PsiCoderParser.TK_ROMPER, 0); }
		public TerminalNode TK_PYC() { return getToken(PsiCoderParser.TK_PYC, 0); }
		public OpcionalRomperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcionalRomper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterOpcionalRomper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitOpcionalRomper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitOpcionalRomper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpcionalRomperContext opcionalRomper() throws RecognitionException {
		OpcionalRomperContext _localctx = new OpcionalRomperContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_opcionalRomper);
		try {
			setState(451);
			switch (_input.LA(1)) {
			case TK_ROMPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				match(TK_ROMPER);
				setState(449);
				match(TK_PYC);
				}
				break;
			case T__20:
			case T__21:
			case T__22:
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		case 18:
			return expresionBooleana_sempred((ExpresionBooleanaContext)_localctx, predIndex);
		case 19:
			return expresionRelacional1_sempred((ExpresionRelacional1Context)_localctx, predIndex);
		case 20:
			return expresionRelacional_sempred((ExpresionRelacionalContext)_localctx, predIndex);
		case 21:
			return expresionAritmetica1_sempred((ExpresionAritmetica1Context)_localctx, predIndex);
		case 22:
			return expresionAritmetica_sempred((ExpresionAritmeticaContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expresionBooleana_sempred(ExpresionBooleanaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expresionRelacional1_sempred(ExpresionRelacional1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expresionRelacional_sempred(ExpresionRelacionalContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expresionAritmetica1_sempred(ExpresionAritmetica1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expresionAritmetica_sempred(ExpresionAritmeticaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\62\u01c8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3r\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6\u008a\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0098\n\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a5\n\n\3\13\3\13\3\13\5"+
		"\13\u00aa\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u00b1\n\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00b9\n\r\3\16\3\16\5\16\u00bd\n\16\3\17\3\17\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\5\21\u00c8\n\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\7\23\u00d2\n\23\f\23\16\23\u00d5\13\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\7\24\u00dd\n\24\f\24\16\24\u00e0\13\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\7\25\u00e8\n\25\f\25\16\25\u00eb\13\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\7\26\u00f3\n\26\f\26\16\26\u00f6\13\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\7\27\u00fe\n\27\f\27\16\27\u0101\13\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\7\30\u0109\n\30\f\30\16\30\u010c\13\30\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u0113\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u011f\n\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\5\34\u0129\n\34\3"+
		"\35\3\35\3\35\3\35\5\35\u012f\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u013f\n\36\3\37\3\37\3\37\3 "+
		"\3 \3 \3 \3 \5 \u0149\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0157"+
		"\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\5#\u0165\n#\3$\3$\3$"+
		"\3$\5$\u016b\n$\3%\3%\3%\3&\3&\3&\3&\3&\5&\u0175\n&\3\'\3\'\3\'\3\'\3"+
		"\'\5\'\u017c\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3"+
		",\5,\u01a7\n,\3-\3-\3-\3-\3-\3-\3-\3-\5-\u01b1\n-\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\5.\u01bc\n.\3/\3/\3/\3/\3/\3\60\3\60\3\60\5\60\u01c6\n\60\3\60"+
		"\2\b$&(*,.\61\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^\2\3\3\2\37#\u01c6\2`\3\2\2\2\4q\3\2\2\2\6s\3"+
		"\2\2\2\b\u0080\3\2\2\2\n\u0089\3\2\2\2\f\u008b\3\2\2\2\16\u0097\3\2\2"+
		"\2\20\u0099\3\2\2\2\22\u00a4\3\2\2\2\24\u00a9\3\2\2\2\26\u00b0\3\2\2\2"+
		"\30\u00b8\3\2\2\2\32\u00bc\3\2\2\2\34\u00be\3\2\2\2\36\u00c0\3\2\2\2 "+
		"\u00c7\3\2\2\2\"\u00c9\3\2\2\2$\u00cb\3\2\2\2&\u00d6\3\2\2\2(\u00e1\3"+
		"\2\2\2*\u00ec\3\2\2\2,\u00f7\3\2\2\2.\u0102\3\2\2\2\60\u0112\3\2\2\2\62"+
		"\u011e\3\2\2\2\64\u0120\3\2\2\2\66\u0128\3\2\2\28\u012e\3\2\2\2:\u013e"+
		"\3\2\2\2<\u0140\3\2\2\2>\u0148\3\2\2\2@\u0156\3\2\2\2B\u0158\3\2\2\2D"+
		"\u0164\3\2\2\2F\u016a\3\2\2\2H\u016c\3\2\2\2J\u0174\3\2\2\2L\u017b\3\2"+
		"\2\2N\u017d\3\2\2\2P\u0185\3\2\2\2R\u018d\3\2\2\2T\u0199\3\2\2\2V\u01a6"+
		"\3\2\2\2X\u01b0\3\2\2\2Z\u01bb\3\2\2\2\\\u01bd\3\2\2\2^\u01c5\3\2\2\2"+
		"`a\5\4\3\2ab\7\3\2\2bc\58\35\2cd\7\4\2\2de\5\4\3\2ef\7\2\2\3f\3\3\2\2"+
		"\2gh\5\6\4\2hi\5\4\3\2ir\3\2\2\2jk\5\b\5\2kl\5\4\3\2lr\3\2\2\2mn\5\f\7"+
		"\2no\5\4\3\2or\3\2\2\2pr\3\2\2\2qg\3\2\2\2qj\3\2\2\2qm\3\2\2\2qp\3\2\2"+
		"\2r\5\3\2\2\2st\7\5\2\2tu\5\32\16\2uv\5\34\17\2vw\7*\2\2wx\5\26\f\2xy"+
		"\7+\2\2yz\7\6\2\2z{\58\35\2{|\7\7\2\2|}\5$\23\2}~\7)\2\2~\177\7\b\2\2"+
		"\177\7\3\2\2\2\u0080\u0081\7\t\2\2\u0081\u0082\5\34\17\2\u0082\u0083\5"+
		"\n\6\2\u0083\u0084\7\n\2\2\u0084\t\3\2\2\2\u0085\u0086\5\f\7\2\u0086\u0087"+
		"\5\n\6\2\u0087\u008a\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0085\3\2\2\2\u0089"+
		"\u0088\3\2\2\2\u008a\13\3\2\2\2\u008b\u008c\5\32\16\2\u008c\u008d\5\34"+
		"\17\2\u008d\u008e\5\24\13\2\u008e\u008f\5\16\b\2\u008f\u0090\7)\2\2\u0090"+
		"\r\3\2\2\2\u0091\u0092\7\61\2\2\u0092\u0093\5\34\17\2\u0093\u0094\5\24"+
		"\13\2\u0094\u0095\5\16\b\2\u0095\u0098\3\2\2\2\u0096\u0098\3\2\2\2\u0097"+
		"\u0091\3\2\2\2\u0097\u0096\3\2\2\2\u0098\17\3\2\2\2\u0099\u009a\7\35\2"+
		"\2\u009a\u009b\5\34\17\2\u009b\u009c\5\24\13\2\u009c\u009d\5\16\b\2\u009d"+
		"\21\3\2\2\2\u009e\u009f\5\36\20\2\u009f\u00a0\5\24\13\2\u00a0\u00a1\5"+
		"\16\b\2\u00a1\u00a5\3\2\2\2\u00a2\u00a3\7(\2\2\u00a3\u00a5\5$\23\2\u00a4"+
		"\u009e\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\23\3\2\2\2\u00a6\u00a7\7(\2\2"+
		"\u00a7\u00aa\5$\23\2\u00a8\u00aa\3\2\2\2\u00a9\u00a6\3\2\2\2\u00a9\u00a8"+
		"\3\2\2\2\u00aa\25\3\2\2\2\u00ab\u00ac\5\32\16\2\u00ac\u00ad\5\34\17\2"+
		"\u00ad\u00ae\5\30\r\2\u00ae\u00b1\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ab"+
		"\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\27\3\2\2\2\u00b2\u00b3\7\61\2\2\u00b3"+
		"\u00b4\5\32\16\2\u00b4\u00b5\5\34\17\2\u00b5\u00b6\5\30\r\2\u00b6\u00b9"+
		"\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b2\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9"+
		"\31\3\2\2\2\u00ba\u00bd\7\35\2\2\u00bb\u00bd\5\34\17\2\u00bc\u00ba\3\2"+
		"\2\2\u00bc\u00bb\3\2\2\2\u00bd\33\3\2\2\2\u00be\u00bf\7\62\2\2\u00bf\35"+
		"\3\2\2\2\u00c0\u00c1\7\62\2\2\u00c1\u00c2\5 \21\2\u00c2\37\3\2\2\2\u00c3"+
		"\u00c4\7,\2\2\u00c4\u00c5\7\62\2\2\u00c5\u00c8\5 \21\2\u00c6\u00c8\3\2"+
		"\2\2\u00c7\u00c3\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8!\3\2\2\2\u00c9\u00ca"+
		"\t\2\2\2\u00ca#\3\2\2\2\u00cb\u00cc\b\23\1\2\u00cc\u00cd\5&\24\2\u00cd"+
		"\u00d3\3\2\2\2\u00ce\u00cf\f\4\2\2\u00cf\u00d0\7.\2\2\u00d0\u00d2\5$\23"+
		"\5\u00d1\u00ce\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4"+
		"\3\2\2\2\u00d4%\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\b\24\1\2\u00d7"+
		"\u00d8\5(\25\2\u00d8\u00de\3\2\2\2\u00d9\u00da\f\4\2\2\u00da\u00db\7/"+
		"\2\2\u00db\u00dd\5&\24\5\u00dc\u00d9\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\'\3\2\2\2\u00e0\u00de\3\2\2\2"+
		"\u00e1\u00e2\b\25\1\2\u00e2\u00e3\5*\26\2\u00e3\u00e9\3\2\2\2\u00e4\u00e5"+
		"\f\4\2\2\u00e5\u00e6\7\'\2\2\u00e6\u00e8\5(\25\5\u00e7\u00e4\3\2\2\2\u00e8"+
		"\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea)\3\2\2\2"+
		"\u00eb\u00e9\3\2\2\2\u00ec\u00ed\b\26\1\2\u00ed\u00ee\5,\27\2\u00ee\u00f4"+
		"\3\2\2\2\u00ef\u00f0\f\4\2\2\u00f0\u00f1\7&\2\2\u00f1\u00f3\5*\26\5\u00f2"+
		"\u00ef\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5+\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\b\27\1\2\u00f8\u00f9"+
		"\5.\30\2\u00f9\u00ff\3\2\2\2\u00fa\u00fb\f\3\2\2\u00fb\u00fc\7%\2\2\u00fc"+
		"\u00fe\5,\27\4\u00fd\u00fa\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2"+
		"\2\2\u00ff\u0100\3\2\2\2\u0100-\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103"+
		"\b\30\1\2\u0103\u0104\5\60\31\2\u0104\u010a\3\2\2\2\u0105\u0106\f\3\2"+
		"\2\u0106\u0107\7$\2\2\u0107\u0109\5.\30\4\u0108\u0105\3\2\2\2\u0109\u010c"+
		"\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b/\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010d\u010e\7%\2\2\u010e\u0113\5\62\32\2\u010f\u0110\7"+
		"\60\2\2\u0110\u0113\5\62\32\2\u0111\u0113\5\62\32\2\u0112\u010d\3\2\2"+
		"\2\u0112\u010f\3\2\2\2\u0112\u0111\3\2\2\2\u0113\61\3\2\2\2\u0114\u011f"+
		"\7\"\2\2\u0115\u011f\7!\2\2\u0116\u011f\7\37\2\2\u0117\u011f\7#\2\2\u0118"+
		"\u011f\7 \2\2\u0119\u011a\7*\2\2\u011a\u011b\5$\23\2\u011b\u011c\7+\2"+
		"\2\u011c\u011f\3\2\2\2\u011d\u011f\5\64\33\2\u011e\u0114\3\2\2\2\u011e"+
		"\u0115\3\2\2\2\u011e\u0116\3\2\2\2\u011e\u0117\3\2\2\2\u011e\u0118\3\2"+
		"\2\2\u011e\u0119\3\2\2\2\u011e\u011d\3\2\2\2\u011f\63\3\2\2\2\u0120\u0121"+
		"\5\36\20\2\u0121\u0122\5\66\34\2\u0122\65\3\2\2\2\u0123\u0124\7*\2\2\u0124"+
		"\u0125\5F$\2\u0125\u0126\7+\2\2\u0126\u0129\3\2\2\2\u0127\u0129\3\2\2"+
		"\2\u0128\u0123\3\2\2\2\u0128\u0127\3\2\2\2\u0129\67\3\2\2\2\u012a\u012b"+
		"\5:\36\2\u012b\u012c\58\35\2\u012c\u012f\3\2\2\2\u012d\u012f\3\2\2\2\u012e"+
		"\u012a\3\2\2\2\u012e\u012d\3\2\2\2\u012f9\3\2\2\2\u0130\u0131\7\36\2\2"+
		"\u0131\u013f\7)\2\2\u0132\u013f\5@!\2\u0133\u013f\5B\"\2\u0134\u0135\5"+
		"\20\t\2\u0135\u0136\7)\2\2\u0136\u013f\3\2\2\2\u0137\u013f\5N(\2\u0138"+
		"\u013f\5P)\2\u0139\u013f\5R*\2\u013a\u013f\5T+\2\u013b\u013c\5<\37\2\u013c"+
		"\u013d\7)\2\2\u013d\u013f\3\2\2\2\u013e\u0130\3\2\2\2\u013e\u0132\3\2"+
		"\2\2\u013e\u0133\3\2\2\2\u013e\u0134\3\2\2\2\u013e\u0137\3\2\2\2\u013e"+
		"\u0138\3\2\2\2\u013e\u0139\3\2\2\2\u013e\u013a\3\2\2\2\u013e\u013b\3\2"+
		"\2\2\u013f;\3\2\2\2\u0140\u0141\5\36\20\2\u0141\u0142\5> \2\u0142=\3\2"+
		"\2\2\u0143\u0144\7*\2\2\u0144\u0145\5F$\2\u0145\u0146\7+\2\2\u0146\u0149"+
		"\3\2\2\2\u0147\u0149\5\22\n\2\u0148\u0143\3\2\2\2\u0148\u0147\3\2\2\2"+
		"\u0149?\3\2\2\2\u014a\u014b\7\13\2\2\u014b\u014c\7*\2\2\u014c\u014d\5"+
		"H%\2\u014d\u014e\7+\2\2\u014e\u014f\7)\2\2\u014f\u0157\3\2\2\2\u0150\u0151"+
		"\7\f\2\2\u0151\u0152\7*\2\2\u0152\u0153\5\36\20\2\u0153\u0154\7+\2\2\u0154"+
		"\u0155\7)\2\2\u0155\u0157\3\2\2\2\u0156\u014a\3\2\2\2\u0156\u0150\3\2"+
		"\2\2\u0157A\3\2\2\2\u0158\u0159\7\r\2\2\u0159\u015a\7*\2\2\u015a\u015b"+
		"\5$\23\2\u015b\u015c\7+\2\2\u015c\u015d\7\16\2\2\u015d\u015e\58\35\2\u015e"+
		"\u015f\5D#\2\u015f\u0160\7\17\2\2\u0160C\3\2\2\2\u0161\u0162\7\20\2\2"+
		"\u0162\u0165\58\35\2\u0163\u0165\3\2\2\2\u0164\u0161\3\2\2\2\u0164\u0163"+
		"\3\2\2\2\u0165E\3\2\2\2\u0166\u0167\5$\23\2\u0167\u0168\5L\'\2\u0168\u016b"+
		"\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u0166\3\2\2\2\u016a\u0169\3\2\2\2\u016b"+
		"G\3\2\2\2\u016c\u016d\5$\23\2\u016d\u016e\5J&\2\u016eI\3\2\2\2\u016f\u0170"+
		"\7\61\2\2\u0170\u0171\5$\23\2\u0171\u0172\5J&\2\u0172\u0175\3\2\2\2\u0173"+
		"\u0175\3\2\2\2\u0174\u016f\3\2\2\2\u0174\u0173\3\2\2\2\u0175K\3\2\2\2"+
		"\u0176\u0177\7\61\2\2\u0177\u0178\5$\23\2\u0178\u0179\5L\'\2\u0179\u017c"+
		"\3\2\2\2\u017a\u017c\3\2\2\2\u017b\u0176\3\2\2\2\u017b\u017a\3\2\2\2\u017c"+
		"M\3\2\2\2\u017d\u017e\7\21\2\2\u017e\u017f\7*\2\2\u017f\u0180\5$\23\2"+
		"\u0180\u0181\7+\2\2\u0181\u0182\7\6\2\2\u0182\u0183\58\35\2\u0183\u0184"+
		"\7\22\2\2\u0184O\3\2\2\2\u0185\u0186\7\6\2\2\u0186\u0187\58\35\2\u0187"+
		"\u0188\7\21\2\2\u0188\u0189\7*\2\2\u0189\u018a\5$\23\2\u018a\u018b\7+"+
		"\2\2\u018b\u018c\7)\2\2\u018cQ\3\2\2\2\u018d\u018e\7\23\2\2\u018e\u018f"+
		"\7*\2\2\u018f\u0190\5V,\2\u0190\u0191\7)\2\2\u0191\u0192\5$\23\2\u0192"+
		"\u0193\7)\2\2\u0193\u0194\5,\27\2\u0194\u0195\7+\2\2\u0195\u0196\7\6\2"+
		"\2\u0196\u0197\58\35\2\u0197\u0198\7\24\2\2\u0198S\3\2\2\2\u0199\u019a"+
		"\7\25\2\2\u019a\u019b\7*\2\2\u019b\u019c\5\36\20\2\u019c\u019d\7+\2\2"+
		"\u019d\u019e\7\26\2\2\u019e\u019f\5X-\2\u019f\u01a0\7\27\2\2\u01a0U\3"+
		"\2\2\2\u01a1\u01a7\5\20\t\2\u01a2\u01a3\5\36\20\2\u01a3\u01a4\7(\2\2\u01a4"+
		"\u01a5\5$\23\2\u01a5\u01a7\3\2\2\2\u01a6\u01a1\3\2\2\2\u01a6\u01a2\3\2"+
		"\2\2\u01a7W\3\2\2\2\u01a8\u01a9\7\30\2\2\u01a9\u01aa\5\"\22\2\u01aa\u01ab"+
		"\7-\2\2\u01ab\u01ac\58\35\2\u01ac\u01ad\5^\60\2\u01ad\u01ae\5Z.\2\u01ae"+
		"\u01b1\3\2\2\2\u01af\u01b1\5\\/\2\u01b0\u01a8\3\2\2\2\u01b0\u01af\3\2"+
		"\2\2\u01b1Y\3\2\2\2\u01b2\u01b3\7\30\2\2\u01b3\u01b4\5\"\22\2\u01b4\u01b5"+
		"\7-\2\2\u01b5\u01b6\58\35\2\u01b6\u01b7\5^\60\2\u01b7\u01b8\5Z.\2\u01b8"+
		"\u01bc\3\2\2\2\u01b9\u01bc\5\\/\2\u01ba\u01bc\3\2\2\2\u01bb\u01b2\3\2"+
		"\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01ba\3\2\2\2\u01bc[\3\2\2\2\u01bd\u01be"+
		"\7\31\2\2\u01be\u01bf\7-\2\2\u01bf\u01c0\58\35\2\u01c0\u01c1\5^\60\2\u01c1"+
		"]\3\2\2\2\u01c2\u01c3\7\36\2\2\u01c3\u01c6\7)\2\2\u01c4\u01c6\3\2\2\2"+
		"\u01c5\u01c2\3\2\2\2\u01c5\u01c4\3\2\2\2\u01c6_\3\2\2\2 q\u0089\u0097"+
		"\u00a4\u00a9\u00b0\u00b8\u00bc\u00c7\u00d3\u00de\u00e9\u00f4\u00ff\u010a"+
		"\u0112\u011e\u0128\u012e\u013e\u0148\u0156\u0164\u016a\u0174\u017b\u01a6"+
		"\u01b0\u01bb\u01c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}