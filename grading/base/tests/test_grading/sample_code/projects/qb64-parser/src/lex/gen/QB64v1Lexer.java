// Generated from /home/milderhc/Documents/lenguajes/ta/antlr/qb64-parser/grammar/QB64v1.g4 by ANTLR 4.6
package lex.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QB64v1Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTEGERSUFFIX=1, LONGSUFFIX=2, SINGLESUFFIX=3, DOUBLESUFFIX=4, STRINGSUFFIX=5, 
		INTEGERVALUE=6, LONGVALUE=7, SINGLEVALUE=8, DOUBLEVALUE=9, STRINGVALUE=10, 
		EQUALOP=11, POTOP=12, DIVOP=13, PRODUCTOP=14, ADDOP=15, SUBOP=16, DIFFOP=17, 
		LESSOP=18, LESSOREQUALOP=19, GREATER=20, GREATEROREQUAL=21, SEMICOLON=22, 
		COLON=23, COMMA=24, LEFTPAR=25, RIGHTPAR=26, INPUT=27, PRINT=28, IF=29, 
		THEN=30, ELSE=31, ELSEIF=32, END=33, WHILE=34, WEND=35, DO=36, LOOP=37, 
		UNTIL=38, FOR=39, TO=40, STEP=41, NEXT=42, INTEGER=43, SINGLE=44, DOUBLE=45, 
		LONG=46, STRING=47, DIM=48, AS=49, NOT=50, OR=51, AND=52, XOR=53, MOD=54, 
		SUB=55, FUNCTION=56, SELECT=57, CASE=58, SHARED=59, CONST=60, IDPREFIX=61, 
		COMMENT=62, WS=63, ErrorCharacter=64;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INTEGERSUFFIX", "LONGSUFFIX", "SINGLESUFFIX", "DOUBLESUFFIX", "STRINGSUFFIX", 
		"INTEGERVALUE", "LONGVALUE", "SINGLEVALUE", "DOUBLEVALUE", "STRINGVALUE", 
		"EQUALOP", "POTOP", "DIVOP", "PRODUCTOP", "ADDOP", "SUBOP", "DIFFOP", 
		"LESSOP", "LESSOREQUALOP", "GREATER", "GREATEROREQUAL", "SEMICOLON", "COLON", 
		"COMMA", "LEFTPAR", "RIGHTPAR", "INPUT", "PRINT", "IF", "THEN", "ELSE", 
		"ELSEIF", "END", "WHILE", "WEND", "DO", "LOOP", "UNTIL", "FOR", "TO", 
		"STEP", "NEXT", "INTEGER", "SINGLE", "DOUBLE", "LONG", "STRING", "DIM", 
		"AS", "NOT", "OR", "AND", "XOR", "MOD", "SUB", "FUNCTION", "SELECT", "CASE", 
		"SHARED", "CONST", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", 
		"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", 
		"Z", "IDPREFIX", "COMMENT", "WS", "ErrorCharacter"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'%'", "'&'", "'!'", "'#'", "'$'", null, null, null, null, null, 
		"'='", null, "'/'", "'*'", null, null, "'<>'", "'<'", "'<='", "'>'", "'>='", 
		"';'", "':'", "','", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INTEGERSUFFIX", "LONGSUFFIX", "SINGLESUFFIX", "DOUBLESUFFIX", "STRINGSUFFIX", 
		"INTEGERVALUE", "LONGVALUE", "SINGLEVALUE", "DOUBLEVALUE", "STRINGVALUE", 
		"EQUALOP", "POTOP", "DIVOP", "PRODUCTOP", "ADDOP", "SUBOP", "DIFFOP", 
		"LESSOP", "LESSOREQUALOP", "GREATER", "GREATEROREQUAL", "SEMICOLON", "COLON", 
		"COMMA", "LEFTPAR", "RIGHTPAR", "INPUT", "PRINT", "IF", "THEN", "ELSE", 
		"ELSEIF", "END", "WHILE", "WEND", "DO", "LOOP", "UNTIL", "FOR", "TO", 
		"STEP", "NEXT", "INTEGER", "SINGLE", "DOUBLE", "LONG", "STRING", "DIM", 
		"AS", "NOT", "OR", "AND", "XOR", "MOD", "SUB", "FUNCTION", "SELECT", "CASE", 
		"SHARED", "CONST", "IDPREFIX", "COMMENT", "WS", "ErrorCharacter"
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


	public QB64v1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "QB64v1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2B\u023e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\3\2\3\2\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00dc\n\7\3\7\5\7\u00df"+
		"\n\7\3\7\5\7\u00e2\n\7\3\7\5\7\u00e5\n\7\3\7\5\7\u00e8\n\7\3\b\6\b\u00eb"+
		"\n\b\r\b\16\b\u00ec\3\t\6\t\u00f0\n\t\r\t\16\t\u00f1\3\t\3\t\3\t\5\t\u00f7"+
		"\n\t\3\t\5\t\u00fa\n\t\3\t\5\t\u00fd\n\t\3\t\5\t\u0100\n\t\3\t\5\t\u0103"+
		"\n\t\3\n\6\n\u0106\n\n\r\n\16\n\u0107\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\6\n\u0112\n\n\r\n\16\n\u0113\3\13\3\13\7\13\u0118\n\13\f\13\16\13\u011b"+
		"\13\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#"+
		"\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66"+
		"\3\67\3\67\3\67\3\67\38\38\38\38\39\39\39\39\39\39\39\39\39\3:\3:\3:\3"+
		":\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3>\3"+
		">\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3"+
		"J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3"+
		"U\3V\3V\3W\3W\3X\3X\7X\u0228\nX\fX\16X\u022b\13X\3Y\3Y\7Y\u022f\nY\fY"+
		"\16Y\u0232\13Y\3Y\3Y\3Z\6Z\u0237\nZ\rZ\16Z\u0238\3Z\3Z\3[\3[\2\2\\\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<w=y>{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d"+
		"\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b\2\u009d\2\u009f"+
		"\2\u00a1\2\u00a3\2\u00a5\2\u00a7\2\u00a9\2\u00ab\2\u00ad\2\u00af?\u00b1"+
		"@\u00b3A\u00b5B\3\2-\3\2\65\65\3\2\64\64\3\299\3\288\3\2\629\3\2\62\67"+
		"\3\2\62;\3\2\628\3\2\62\63\3\2\63\64\3\2\62\62\3\2\60\60\4\2\f\f$$\4\2"+
		"CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4"+
		"\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTt"+
		"t\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\4"+
		"\2C\\c|\6\2\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\u0239\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2"+
		"c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3"+
		"\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2\u00af"+
		"\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\3\u00b7\3\2\2"+
		"\2\5\u00b9\3\2\2\2\7\u00bb\3\2\2\2\t\u00bd\3\2\2\2\13\u00bf\3\2\2\2\r"+
		"\u00e7\3\2\2\2\17\u00ea\3\2\2\2\21\u00ef\3\2\2\2\23\u0105\3\2\2\2\25\u0115"+
		"\3\2\2\2\27\u011e\3\2\2\2\31\u0120\3\2\2\2\33\u0122\3\2\2\2\35\u0124\3"+
		"\2\2\2\37\u0126\3\2\2\2!\u0128\3\2\2\2#\u012a\3\2\2\2%\u012d\3\2\2\2\'"+
		"\u012f\3\2\2\2)\u0132\3\2\2\2+\u0134\3\2\2\2-\u0137\3\2\2\2/\u0139\3\2"+
		"\2\2\61\u013b\3\2\2\2\63\u013d\3\2\2\2\65\u013f\3\2\2\2\67\u0141\3\2\2"+
		"\29\u0147\3\2\2\2;\u014d\3\2\2\2=\u0150\3\2\2\2?\u0155\3\2\2\2A\u015a"+
		"\3\2\2\2C\u0161\3\2\2\2E\u0165\3\2\2\2G\u016b\3\2\2\2I\u0170\3\2\2\2K"+
		"\u0173\3\2\2\2M\u0178\3\2\2\2O\u017e\3\2\2\2Q\u0182\3\2\2\2S\u0185\3\2"+
		"\2\2U\u018a\3\2\2\2W\u018f\3\2\2\2Y\u0197\3\2\2\2[\u019e\3\2\2\2]\u01a5"+
		"\3\2\2\2_\u01aa\3\2\2\2a\u01b1\3\2\2\2c\u01b5\3\2\2\2e\u01b8\3\2\2\2g"+
		"\u01bc\3\2\2\2i\u01bf\3\2\2\2k\u01c3\3\2\2\2m\u01c7\3\2\2\2o\u01cb\3\2"+
		"\2\2q\u01cf\3\2\2\2s\u01d8\3\2\2\2u\u01df\3\2\2\2w\u01e4\3\2\2\2y\u01eb"+
		"\3\2\2\2{\u01f1\3\2\2\2}\u01f3\3\2\2\2\177\u01f5\3\2\2\2\u0081\u01f7\3"+
		"\2\2\2\u0083\u01f9\3\2\2\2\u0085\u01fb\3\2\2\2\u0087\u01fd\3\2\2\2\u0089"+
		"\u01ff\3\2\2\2\u008b\u0201\3\2\2\2\u008d\u0203\3\2\2\2\u008f\u0205\3\2"+
		"\2\2\u0091\u0207\3\2\2\2\u0093\u0209\3\2\2\2\u0095\u020b\3\2\2\2\u0097"+
		"\u020d\3\2\2\2\u0099\u020f\3\2\2\2\u009b\u0211\3\2\2\2\u009d\u0213\3\2"+
		"\2\2\u009f\u0215\3\2\2\2\u00a1\u0217\3\2\2\2\u00a3\u0219\3\2\2\2\u00a5"+
		"\u021b\3\2\2\2\u00a7\u021d\3\2\2\2\u00a9\u021f\3\2\2\2\u00ab\u0221\3\2"+
		"\2\2\u00ad\u0223\3\2\2\2\u00af\u0225\3\2\2\2\u00b1\u022c\3\2\2\2\u00b3"+
		"\u0236\3\2\2\2\u00b5\u023c\3\2\2\2\u00b7\u00b8\7\'\2\2\u00b8\4\3\2\2\2"+
		"\u00b9\u00ba\7(\2\2\u00ba\6\3\2\2\2\u00bb\u00bc\7#\2\2\u00bc\b\3\2\2\2"+
		"\u00bd\u00be\7%\2\2\u00be\n\3\2\2\2\u00bf\u00c0\7&\2\2\u00c0\f\3\2\2\2"+
		"\u00c1\u00c2\t\2\2\2\u00c2\u00c3\t\3\2\2\u00c3\u00c4\t\4\2\2\u00c4\u00c5"+
		"\t\5\2\2\u00c5\u00e8\t\6\2\2\u00c6\u00c7\t\2\2\2\u00c7\u00c8\t\3\2\2\u00c8"+
		"\u00c9\t\4\2\2\u00c9\u00ca\t\7\2\2\u00ca\u00e8\t\b\2\2\u00cb\u00cc\t\2"+
		"\2\2\u00cc\u00cd\t\3\2\2\u00cd\u00ce\t\t\2\2\u00ce\u00cf\t\b\2\2\u00cf"+
		"\u00e8\t\b\2\2\u00d0\u00d1\t\2\2\2\u00d1\u00d2\t\n\2\2\u00d2\u00d3\t\b"+
		"\2\2\u00d3\u00d4\t\b\2\2\u00d4\u00e8\t\b\2\2\u00d5\u00d6\t\13\2\2\u00d6"+
		"\u00d7\t\b\2\2\u00d7\u00d8\t\b\2\2\u00d8\u00d9\t\b\2\2\u00d9\u00e8\t\b"+
		"\2\2\u00da\u00dc\t\f\2\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00de\3\2\2\2\u00dd\u00df\t\b\2\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2"+
		"\2\2\u00df\u00e1\3\2\2\2\u00e0\u00e2\t\b\2\2\u00e1\u00e0\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e5\t\b\2\2\u00e4\u00e3\3\2"+
		"\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\t\b\2\2\u00e7"+
		"\u00c1\3\2\2\2\u00e7\u00c6\3\2\2\2\u00e7\u00cb\3\2\2\2\u00e7\u00d0\3\2"+
		"\2\2\u00e7\u00d5\3\2\2\2\u00e7\u00db\3\2\2\2\u00e8\16\3\2\2\2\u00e9\u00eb"+
		"\t\b\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\20\3\2\2\2\u00ee\u00f0\t\b\2\2\u00ef\u00ee\3\2\2"+
		"\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3"+
		"\3\2\2\2\u00f3\u00f4\t\r\2\2\u00f4\u00f6\t\b\2\2\u00f5\u00f7\t\b\2\2\u00f6"+
		"\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00fa\t\b"+
		"\2\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb"+
		"\u00fd\t\b\2\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2"+
		"\2\2\u00fe\u0100\t\b\2\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0102\3\2\2\2\u0101\u0103\t\b\2\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2"+
		"\2\2\u0103\22\3\2\2\2\u0104\u0106\t\b\2\2\u0105\u0104\3\2\2\2\u0106\u0107"+
		"\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u010a\t\r\2\2\u010a\u010b\t\b\2\2\u010b\u010c\t\b\2\2\u010c\u010d\t\b"+
		"\2\2\u010d\u010e\t\b\2\2\u010e\u010f\t\b\2\2\u010f\u0111\t\b\2\2\u0110"+
		"\u0112\t\b\2\2\u0111\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0113\u0114\3\2\2\2\u0114\24\3\2\2\2\u0115\u0119\7$\2\2\u0116\u0118"+
		"\n\16\2\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2"+
		"\u0119\u011a\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d"+
		"\7$\2\2\u011d\26\3\2\2\2\u011e\u011f\7?\2\2\u011f\30\3\2\2\2\u0120\u0121"+
		"\7`\2\2\u0121\32\3\2\2\2\u0122\u0123\7\61\2\2\u0123\34\3\2\2\2\u0124\u0125"+
		"\7,\2\2\u0125\36\3\2\2\2\u0126\u0127\7-\2\2\u0127 \3\2\2\2\u0128\u0129"+
		"\7/\2\2\u0129\"\3\2\2\2\u012a\u012b\7>\2\2\u012b\u012c\7@\2\2\u012c$\3"+
		"\2\2\2\u012d\u012e\7>\2\2\u012e&\3\2\2\2\u012f\u0130\7>\2\2\u0130\u0131"+
		"\7?\2\2\u0131(\3\2\2\2\u0132\u0133\7@\2\2\u0133*\3\2\2\2\u0134\u0135\7"+
		"@\2\2\u0135\u0136\7?\2\2\u0136,\3\2\2\2\u0137\u0138\7=\2\2\u0138.\3\2"+
		"\2\2\u0139\u013a\7<\2\2\u013a\60\3\2\2\2\u013b\u013c\7.\2\2\u013c\62\3"+
		"\2\2\2\u013d\u013e\7*\2\2\u013e\64\3\2\2\2\u013f\u0140\7+\2\2\u0140\66"+
		"\3\2\2\2\u0141\u0142\5\u008bF\2\u0142\u0143\5\u0095K\2\u0143\u0144\5\u0099"+
		"M\2\u0144\u0145\5\u00a3R\2\u0145\u0146\5\u00a1Q\2\u01468\3\2\2\2\u0147"+
		"\u0148\5\u0099M\2\u0148\u0149\5\u009dO\2\u0149\u014a\5\u008bF\2\u014a"+
		"\u014b\5\u0095K\2\u014b\u014c\5\u00a1Q\2\u014c:\3\2\2\2\u014d\u014e\5"+
		"\u008bF\2\u014e\u014f\5\u0085C\2\u014f<\3\2\2\2\u0150\u0151\5\u00a1Q\2"+
		"\u0151\u0152\5\u0089E\2\u0152\u0153\5\u0083B\2\u0153\u0154\5\u0095K\2"+
		"\u0154>\3\2\2\2\u0155\u0156\5\u0083B\2\u0156\u0157\5\u0091I\2\u0157\u0158"+
		"\5\u009fP\2\u0158\u0159\5\u0083B\2\u0159@\3\2\2\2\u015a\u015b\5\u0083"+
		"B\2\u015b\u015c\5\u0091I\2\u015c\u015d\5\u009fP\2\u015d\u015e\5\u0083"+
		"B\2\u015e\u015f\5\u008bF\2\u015f\u0160\5\u0085C\2\u0160B\3\2\2\2\u0161"+
		"\u0162\5\u0083B\2\u0162\u0163\5\u0095K\2\u0163\u0164\5\u0081A\2\u0164"+
		"D\3\2\2\2\u0165\u0166\5\u00a7T\2\u0166\u0167\5\u0089E\2\u0167\u0168\5"+
		"\u008bF\2\u0168\u0169\5\u0091I\2\u0169\u016a\5\u0083B\2\u016aF\3\2\2\2"+
		"\u016b\u016c\5\u00a7T\2\u016c\u016d\5\u0083B\2\u016d\u016e\5\u0095K\2"+
		"\u016e\u016f\5\u0081A\2\u016fH\3\2\2\2\u0170\u0171\5\u0081A\2\u0171\u0172"+
		"\5\u0097L\2\u0172J\3\2\2\2\u0173\u0174\5\u0091I\2\u0174\u0175\5\u0097"+
		"L\2\u0175\u0176\5\u0097L\2\u0176\u0177\5\u0099M\2\u0177L\3\2\2\2\u0178"+
		"\u0179\5\u00a3R\2\u0179\u017a\5\u0095K\2\u017a\u017b\5\u00a1Q\2\u017b"+
		"\u017c\5\u008bF\2\u017c\u017d\5\u0091I\2\u017dN\3\2\2\2\u017e\u017f\5"+
		"\u0085C\2\u017f\u0180\5\u0097L\2\u0180\u0181\5\u009dO\2\u0181P\3\2\2\2"+
		"\u0182\u0183\5\u00a1Q\2\u0183\u0184\5\u0097L\2\u0184R\3\2\2\2\u0185\u0186"+
		"\5\u009fP\2\u0186\u0187\5\u00a1Q\2\u0187\u0188\5\u0083B\2\u0188\u0189"+
		"\5\u0099M\2\u0189T\3\2\2\2\u018a\u018b\5\u0095K\2\u018b\u018c\5\u0083"+
		"B\2\u018c\u018d\5\u00a9U\2\u018d\u018e\5\u00a1Q\2\u018eV\3\2\2\2\u018f"+
		"\u0190\5\u008bF\2\u0190\u0191\5\u0095K\2\u0191\u0192\5\u00a1Q\2\u0192"+
		"\u0193\5\u0083B\2\u0193\u0194\5\u0087D\2\u0194\u0195\5\u0083B\2\u0195"+
		"\u0196\5\u009dO\2\u0196X\3\2\2\2\u0197\u0198\5\u009fP\2\u0198\u0199\5"+
		"\u008bF\2\u0199\u019a\5\u0095K\2\u019a\u019b\5\u0087D\2\u019b\u019c\5"+
		"\u0091I\2\u019c\u019d\5\u0083B\2\u019dZ\3\2\2\2\u019e\u019f\5\u0081A\2"+
		"\u019f\u01a0\5\u0097L\2\u01a0\u01a1\5\u00a3R\2\u01a1\u01a2\5}?\2\u01a2"+
		"\u01a3\5\u0091I\2\u01a3\u01a4\5\u0083B\2\u01a4\\\3\2\2\2\u01a5\u01a6\5"+
		"\u0091I\2\u01a6\u01a7\5\u0097L\2\u01a7\u01a8\5\u0095K\2\u01a8\u01a9\5"+
		"\u0087D\2\u01a9^\3\2\2\2\u01aa\u01ab\5\u009fP\2\u01ab\u01ac\5\u00a1Q\2"+
		"\u01ac\u01ad\5\u009dO\2\u01ad\u01ae\5\u008bF\2\u01ae\u01af\5\u0095K\2"+
		"\u01af\u01b0\5\u0087D\2\u01b0`\3\2\2\2\u01b1\u01b2\5\u0081A\2\u01b2\u01b3"+
		"\5\u008bF\2\u01b3\u01b4\5\u0093J\2\u01b4b\3\2\2\2\u01b5\u01b6\5{>\2\u01b6"+
		"\u01b7\5\u009fP\2\u01b7d\3\2\2\2\u01b8\u01b9\5\u0095K\2\u01b9\u01ba\5"+
		"\u0097L\2\u01ba\u01bb\5\u00a1Q\2\u01bbf\3\2\2\2\u01bc\u01bd\5\u0097L\2"+
		"\u01bd\u01be\5\u009dO\2\u01beh\3\2\2\2\u01bf\u01c0\5{>\2\u01c0\u01c1\5"+
		"\u0095K\2\u01c1\u01c2\5\u0081A\2\u01c2j\3\2\2\2\u01c3\u01c4\5\u00a9U\2"+
		"\u01c4\u01c5\5\u0097L\2\u01c5\u01c6\5\u009dO\2\u01c6l\3\2\2\2\u01c7\u01c8"+
		"\5\u0093J\2\u01c8\u01c9\5\u0097L\2\u01c9\u01ca\5\u0081A\2\u01can\3\2\2"+
		"\2\u01cb\u01cc\5\u009fP\2\u01cc\u01cd\5\u00a3R\2\u01cd\u01ce\5}?\2\u01ce"+
		"p\3\2\2\2\u01cf\u01d0\5\u0085C\2\u01d0\u01d1\5\u00a3R\2\u01d1\u01d2\5"+
		"\u0095K\2\u01d2\u01d3\5\177@\2\u01d3\u01d4\5\u00a1Q\2\u01d4\u01d5\5\u008b"+
		"F\2\u01d5\u01d6\5\u0097L\2\u01d6\u01d7\5\u0095K\2\u01d7r\3\2\2\2\u01d8"+
		"\u01d9\5\u009fP\2\u01d9\u01da\5\u0083B\2\u01da\u01db\5\u0091I\2\u01db"+
		"\u01dc\5\u0083B\2\u01dc\u01dd\5\177@\2\u01dd\u01de\5\u00a1Q\2\u01det\3"+
		"\2\2\2\u01df\u01e0\5\177@\2\u01e0\u01e1\5{>\2\u01e1\u01e2\5\u009fP\2\u01e2"+
		"\u01e3\5\u0083B\2\u01e3v\3\2\2\2\u01e4\u01e5\5\u009fP\2\u01e5\u01e6\5"+
		"\u0089E\2\u01e6\u01e7\5{>\2\u01e7\u01e8\5\u009dO\2\u01e8\u01e9\5\u0083"+
		"B\2\u01e9\u01ea\5\u0081A\2\u01eax\3\2\2\2\u01eb\u01ec\5\177@\2\u01ec\u01ed"+
		"\5\u0097L\2\u01ed\u01ee\5\u0095K\2\u01ee\u01ef\5\u009fP\2\u01ef\u01f0"+
		"\5\u00a1Q\2\u01f0z\3\2\2\2\u01f1\u01f2\t\17\2\2\u01f2|\3\2\2\2\u01f3\u01f4"+
		"\t\20\2\2\u01f4~\3\2\2\2\u01f5\u01f6\t\21\2\2\u01f6\u0080\3\2\2\2\u01f7"+
		"\u01f8\t\22\2\2\u01f8\u0082\3\2\2\2\u01f9\u01fa\t\23\2\2\u01fa\u0084\3"+
		"\2\2\2\u01fb\u01fc\t\24\2\2\u01fc\u0086\3\2\2\2\u01fd\u01fe\t\25\2\2\u01fe"+
		"\u0088\3\2\2\2\u01ff\u0200\t\26\2\2\u0200\u008a\3\2\2\2\u0201\u0202\t"+
		"\27\2\2\u0202\u008c\3\2\2\2\u0203\u0204\t\30\2\2\u0204\u008e\3\2\2\2\u0205"+
		"\u0206\t\31\2\2\u0206\u0090\3\2\2\2\u0207\u0208\t\32\2\2\u0208\u0092\3"+
		"\2\2\2\u0209\u020a\t\33\2\2\u020a\u0094\3\2\2\2\u020b\u020c\t\34\2\2\u020c"+
		"\u0096\3\2\2\2\u020d\u020e\t\35\2\2\u020e\u0098\3\2\2\2\u020f\u0210\t"+
		"\36\2\2\u0210\u009a\3\2\2\2\u0211\u0212\t\37\2\2\u0212\u009c\3\2\2\2\u0213"+
		"\u0214\t \2\2\u0214\u009e\3\2\2\2\u0215\u0216\t!\2\2\u0216\u00a0\3\2\2"+
		"\2\u0217\u0218\t\"\2\2\u0218\u00a2\3\2\2\2\u0219\u021a\t#\2\2\u021a\u00a4"+
		"\3\2\2\2\u021b\u021c\t$\2\2\u021c\u00a6\3\2\2\2\u021d\u021e\t%\2\2\u021e"+
		"\u00a8\3\2\2\2\u021f\u0220\t&\2\2\u0220\u00aa\3\2\2\2\u0221\u0222\t\'"+
		"\2\2\u0222\u00ac\3\2\2\2\u0223\u0224\t(\2\2\u0224\u00ae\3\2\2\2\u0225"+
		"\u0229\t)\2\2\u0226\u0228\t*\2\2\u0227\u0226\3\2\2\2\u0228\u022b\3\2\2"+
		"\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u00b0\3\2\2\2\u022b\u0229"+
		"\3\2\2\2\u022c\u0230\7)\2\2\u022d\u022f\n+\2\2\u022e\u022d\3\2\2\2\u022f"+
		"\u0232\3\2\2\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0233\3\2"+
		"\2\2\u0232\u0230\3\2\2\2\u0233\u0234\bY\2\2\u0234\u00b2\3\2\2\2\u0235"+
		"\u0237\t,\2\2\u0236\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0236\3\2"+
		"\2\2\u0238\u0239\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\bZ\2\2\u023b"+
		"\u00b4\3\2\2\2\u023c\u023d\13\2\2\2\u023d\u00b6\3\2\2\2\25\2\u00db\u00de"+
		"\u00e1\u00e4\u00e7\u00ec\u00f1\u00f6\u00f9\u00fc\u00ff\u0102\u0107\u0113"+
		"\u0119\u0229\u0230\u0238\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}