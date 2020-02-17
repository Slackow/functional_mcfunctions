// Generated from D:/code/mcfunction_lambdas/src/main/antlr\FunctionLexer.g4 by ANTLR 4.7.2
package com.function.main.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FunctionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASSERT=1, BREAK=2, BOOL=3, CASE=4, CLASS=5, CONSTRUCTOR=6, CONTINUE=7, 
		DO=8, ELSE=9, FOR=10, GEN=11, IF=12, IN=13, IS=14, LOAD=15, LOG=16, INSTANCE=17, 
		FUNCTION=18, NULL=19, NEW=20, RETURN=21, SWITCH=22, THIS=23, TICK=24, 
		THROW=25, VAR=26, WHILE=27, AND=28, OR=29, GT=30, GE=31, LT=32, LE=33, 
		EQ=34, NE=35, NOT=36, PLUSEQUAL=37, MINUSEQUAL=38, MULTEQUAL=39, DIVIDEEQUAL=40, 
		PLUSPLUS=41, MINUSMINUS=42, POW=43, MULT=44, DIV=45, MOD=46, PLUS=47, 
		MINUS=48, LPAREN=49, RPAREN=50, LBRACE=51, RBRACE=52, LBRACKET=53, RBRACKET=54, 
		EQUAL=55, ELVIS=56, QUESTION=57, DOTDOTDOT=58, DOT=59, SEMI=60, COLON=61, 
		COMMA=62, ARROW=63, OPEN_STRING=64, OPEN_COMMAND=65, NUM=66, IDEN=67, 
		WS=68, NEWLINE=69, COMMENT=70, ENTER_EXPR_INTERP=71, ID_INTERP=72, ESCAPE=73, 
		TEXT=74, CLOSE_STRING=75, ENTER_EXPR_INTERP_COMMAND=76, OPEN_FUNCTION=77, 
		ID_INTERP_COMMAND=78, TEXT_COMMAND=79, NEWLINE_COMMAND=80, EXIT_COMMAND=81, 
		CONTINUE_COMMAND=82;
	public static final int
		STRING=1, DOUBLE_QUOTED_STRING=2, COMMAND_MODE=3, MULTI_LINE_COMMAND=4;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "STRING", "DOUBLE_QUOTED_STRING", "COMMAND_MODE", "MULTI_LINE_COMMAND"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ASSERT", "BREAK", "BOOL", "CASE", "CLASS", "CONSTRUCTOR", "CONTINUE", 
			"DO", "ELSE", "FOR", "GEN", "IF", "IN", "IS", "LOAD", "LOG", "INSTANCE", 
			"FUNCTION", "NULL", "NEW", "RETURN", "SWITCH", "THIS", "TICK", "THROW", 
			"VAR", "WHILE", "AND", "OR", "GT", "GE", "LT", "LE", "EQ", "NE", "NOT", 
			"PLUSEQUAL", "MINUSEQUAL", "MULTEQUAL", "DIVIDEEQUAL", "PLUSPLUS", "MINUSMINUS", 
			"POW", "MULT", "DIV", "MOD", "PLUS", "MINUS", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "LBRACKET", "RBRACKET", "EQUAL", "ELVIS", "QUESTION", "DOTDOTDOT", 
			"DOT", "SEMI", "COLON", "COMMA", "ARROW", "OPEN_STRING", "OPEN_DOUBLE_QUOTED_STRING", 
			"OPEN_COMMAND", "OPEN_MULTI_COMMAND", "NUM", "PINT", "IDEN", "WS", "NEWLINE", 
			"COMMENT", "ENTER_EXPR_INTERP", "ID_INTERP", "ESCAPE", "HEX_DIGIT", "TEXT", 
			"CLOSE_STRING", "ENTER_DOUBLE_EXPR_INTERP", "DOUBLE_ID_INTERP", "DOUBLE_TEXT", 
			"DOUBLE_ESCAPE", "CLOSE_DOUBLE_QUOTED_STRING", "ENTER_EXPR_INTERP_COMMAND", 
			"OPEN_FUNCTION", "ID_INTERP_COMMAND", "TEXT_COMMAND", "OPEN_MULTI_COMMAND_COM", 
			"NEWLINE_COMMAND", "EXIT_COMMAND", "EXIT_MULTI_COMMAND", "ID_INTERP_MULTI_COMMAND", 
			"TEXT_MULTI_COMMAND", "ENTER_EXPR_MULTI_INTERP", "CONTINUE_COMMAND"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'assert'", "'break'", null, "'case'", "'class'", "'constructor'", 
			"'continue'", "'do'", "'else'", "'for'", "'gen'", "'if'", "'in'", "'is'", 
			"'load'", "'log'", "'instance'", "'function'", "'null'", "'new'", "'return'", 
			"'switch'", "'this'", "'tick'", "'throw'", "'var'", "'while'", "'&&'", 
			"'||'", "'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'!'", "'+='", 
			"'-='", "'*='", "'/='", "'++'", "'--'", "'^'", "'*'", "'/'", "'%'", "'+'", 
			"'-'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'='", "'?:'", "'?'", 
			"'...'", "'.'", "';'", "':'", "','", "'->'", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASSERT", "BREAK", "BOOL", "CASE", "CLASS", "CONSTRUCTOR", "CONTINUE", 
			"DO", "ELSE", "FOR", "GEN", "IF", "IN", "IS", "LOAD", "LOG", "INSTANCE", 
			"FUNCTION", "NULL", "NEW", "RETURN", "SWITCH", "THIS", "TICK", "THROW", 
			"VAR", "WHILE", "AND", "OR", "GT", "GE", "LT", "LE", "EQ", "NE", "NOT", 
			"PLUSEQUAL", "MINUSEQUAL", "MULTEQUAL", "DIVIDEEQUAL", "PLUSPLUS", "MINUSMINUS", 
			"POW", "MULT", "DIV", "MOD", "PLUS", "MINUS", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "LBRACKET", "RBRACKET", "EQUAL", "ELVIS", "QUESTION", "DOTDOTDOT", 
			"DOT", "SEMI", "COLON", "COMMA", "ARROW", "OPEN_STRING", "OPEN_COMMAND", 
			"NUM", "IDEN", "WS", "NEWLINE", "COMMENT", "ENTER_EXPR_INTERP", "ID_INTERP", 
			"ESCAPE", "TEXT", "CLOSE_STRING", "ENTER_EXPR_INTERP_COMMAND", "OPEN_FUNCTION", 
			"ID_INTERP_COMMAND", "TEXT_COMMAND", "NEWLINE_COMMAND", "EXIT_COMMAND", 
			"CONTINUE_COMMAND"
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


	public FunctionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FunctionLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2T\u0294\b\1\b\1\b"+
		"\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t"+
		"\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4"+
		"\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4"+
		"\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4"+
		"\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)"+
		"\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62"+
		"\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4"+
		";\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\t"+
		"F\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4"+
		"R\tR\4S\tS\4T\tT\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]"+
		"\t]\4^\t^\4_\t_\4`\t`\4a\ta\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00de\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%"+
		"\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3-\3-"+
		"\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3"+
		"\64\3\65\3\65\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\39\3:\3:\3;\3"+
		";\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3B\3B\3"+
		"C\3C\5C\u01cc\nC\3C\3C\3C\3C\3D\3D\5D\u01d4\nD\3D\3D\3D\3D\3D\7D\u01db"+
		"\nD\fD\16D\u01de\13D\3D\3D\3D\3E\3E\3E\5E\u01e6\nE\3F\3F\7F\u01ea\nF\f"+
		"F\16F\u01ed\13F\3G\3G\7G\u01f1\nG\fG\16G\u01f4\13G\3H\6H\u01f7\nH\rH\16"+
		"H\u01f8\3H\3H\3I\5I\u01fe\nI\3I\3I\5I\u0202\nI\3I\3I\3J\3J\7J\u0208\n"+
		"J\fJ\16J\u020b\13J\3J\3J\3K\3K\3K\3K\3K\3L\3L\3L\3M\3M\3M\3M\3M\3M\3M"+
		"\3M\5M\u021f\nM\3N\3N\3O\6O\u0224\nO\rO\16O\u0225\3P\3P\3P\3P\3Q\3Q\3"+
		"Q\3Q\3Q\3R\3R\3R\3R\3S\6S\u0236\nS\rS\16S\u0237\3S\3S\3T\3T\3T\3T\3U\3"+
		"U\3U\3U\3U\3V\3V\3V\3V\3V\3W\3W\3W\3W\3W\3W\3X\3X\3X\3Y\3Y\3Y\6Y\u0256"+
		"\nY\rY\16Y\u0257\6Y\u025a\nY\rY\16Y\u025b\3Z\3Z\3Z\3Z\3Z\3Z\3[\3[\3\\"+
		"\3\\\3\\\3\\\3]\7]\u026b\n]\f]\16]\u026e\13]\3]\3]\3]\3]\3]\3]\3^\3^\3"+
		"^\3^\3_\3_\3_\3_\3_\6_\u027f\n_\r_\16_\u0280\6_\u0283\n_\r_\16_\u0284"+
		"\3_\3_\3`\3`\3`\3`\3`\3a\5a\u028f\na\3a\3a\5a\u0293\na\2\2b\7\3\t\4\13"+
		"\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23"+
		")\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!E\"G#I$K%"+
		"M&O\'Q(S)U*W+Y,[-]._/a\60c\61e\62g\63i\64k\65m\66o\67q8s9u:w;y<{=}>\177"+
		"?\u0081@\u0083A\u0085B\u0087\2\u0089C\u008b\2\u008dD\u008f\2\u0091E\u0093"+
		"F\u0095G\u0097H\u0099I\u009bJ\u009dK\u009f\2\u00a1L\u00a3M\u00a5\2\u00a7"+
		"\2\u00a9\2\u00ab\2\u00ad\2\u00afN\u00b1O\u00b3P\u00b5Q\u00b7\2\u00b9R"+
		"\u00bbS\u00bd\2\u00bf\2\u00c1\2\u00c3\2\u00c5T\7\2\3\4\5\6\16\3\2\62;"+
		"\4\2\62;aa\5\2C\\aac|\6\2\62;C\\aac|\4\2\13\13\"\"\4\2\f\f\17\17\b\2$"+
		"$&&))^^pptt\5\2\62;CHch\7\2\f\f\17\17&&))^^\7\2\f\f\17\17$$&&^^\5\2\f"+
		"\f\17\17&&\6\2\f\f\17\17&&\61\61\2\u02a6\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2"+
		"\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2"+
		"\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b"+
		"\3\2\2\2\2\u008d\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2"+
		"\2\2\u0097\3\2\2\2\3\u0099\3\2\2\2\3\u009b\3\2\2\2\3\u009d\3\2\2\2\3\u00a1"+
		"\3\2\2\2\3\u00a3\3\2\2\2\4\u00a5\3\2\2\2\4\u00a7\3\2\2\2\4\u00a9\3\2\2"+
		"\2\4\u00ab\3\2\2\2\4\u00ad\3\2\2\2\5\u00af\3\2\2\2\5\u00b1\3\2\2\2\5\u00b3"+
		"\3\2\2\2\5\u00b5\3\2\2\2\5\u00b7\3\2\2\2\5\u00b9\3\2\2\2\5\u00bb\3\2\2"+
		"\2\6\u00bd\3\2\2\2\6\u00bf\3\2\2\2\6\u00c1\3\2\2\2\6\u00c3\3\2\2\2\6\u00c5"+
		"\3\2\2\2\7\u00c7\3\2\2\2\t\u00ce\3\2\2\2\13\u00dd\3\2\2\2\r\u00df\3\2"+
		"\2\2\17\u00e4\3\2\2\2\21\u00ea\3\2\2\2\23\u00f6\3\2\2\2\25\u00ff\3\2\2"+
		"\2\27\u0102\3\2\2\2\31\u0107\3\2\2\2\33\u010b\3\2\2\2\35\u010f\3\2\2\2"+
		"\37\u0112\3\2\2\2!\u0115\3\2\2\2#\u0118\3\2\2\2%\u011d\3\2\2\2\'\u0121"+
		"\3\2\2\2)\u012a\3\2\2\2+\u0133\3\2\2\2-\u0138\3\2\2\2/\u013c\3\2\2\2\61"+
		"\u0143\3\2\2\2\63\u014a\3\2\2\2\65\u014f\3\2\2\2\67\u0154\3\2\2\29\u015a"+
		"\3\2\2\2;\u015e\3\2\2\2=\u0164\3\2\2\2?\u0167\3\2\2\2A\u016a\3\2\2\2C"+
		"\u016c\3\2\2\2E\u016f\3\2\2\2G\u0171\3\2\2\2I\u0174\3\2\2\2K\u0177\3\2"+
		"\2\2M\u017a\3\2\2\2O\u017c\3\2\2\2Q\u017f\3\2\2\2S\u0182\3\2\2\2U\u0185"+
		"\3\2\2\2W\u0188\3\2\2\2Y\u018b\3\2\2\2[\u018e\3\2\2\2]\u0190\3\2\2\2_"+
		"\u0192\3\2\2\2a\u0194\3\2\2\2c\u0196\3\2\2\2e\u0198\3\2\2\2g\u019a\3\2"+
		"\2\2i\u019c\3\2\2\2k\u019e\3\2\2\2m\u01a2\3\2\2\2o\u01a6\3\2\2\2q\u01a8"+
		"\3\2\2\2s\u01aa\3\2\2\2u\u01ac\3\2\2\2w\u01af\3\2\2\2y\u01b1\3\2\2\2{"+
		"\u01b5\3\2\2\2}\u01b7\3\2\2\2\177\u01b9\3\2\2\2\u0081\u01bb\3\2\2\2\u0083"+
		"\u01bd\3\2\2\2\u0085\u01c0\3\2\2\2\u0087\u01c4\3\2\2\2\u0089\u01c9\3\2"+
		"\2\2\u008b\u01d1\3\2\2\2\u008d\u01e2\3\2\2\2\u008f\u01e7\3\2\2\2\u0091"+
		"\u01ee\3\2\2\2\u0093\u01f6\3\2\2\2\u0095\u0201\3\2\2\2\u0097\u0205\3\2"+
		"\2\2\u0099\u020e\3\2\2\2\u009b\u0213\3\2\2\2\u009d\u0216\3\2\2\2\u009f"+
		"\u0220\3\2\2\2\u00a1\u0223\3\2\2\2\u00a3\u0227\3\2\2\2\u00a5\u022b\3\2"+
		"\2\2\u00a7\u0230\3\2\2\2\u00a9\u0235\3\2\2\2\u00ab\u023b\3\2\2\2\u00ad"+
		"\u023f\3\2\2\2\u00af\u0244\3\2\2\2\u00b1\u0249\3\2\2\2\u00b3\u024f\3\2"+
		"\2\2\u00b5\u0259\3\2\2\2\u00b7\u025d\3\2\2\2\u00b9\u0263\3\2\2\2\u00bb"+
		"\u0265\3\2\2\2\u00bd\u026c\3\2\2\2\u00bf\u0275\3\2\2\2\u00c1\u0282\3\2"+
		"\2\2\u00c3\u0288\3\2\2\2\u00c5\u028e\3\2\2\2\u00c7\u00c8\7c\2\2\u00c8"+
		"\u00c9\7u\2\2\u00c9\u00ca\7u\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7t\2\2"+
		"\u00cc\u00cd\7v\2\2\u00cd\b\3\2\2\2\u00ce\u00cf\7d\2\2\u00cf\u00d0\7t"+
		"\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7m\2\2\u00d3\n"+
		"\3\2\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7w\2\2\u00d7"+
		"\u00de\7g\2\2\u00d8\u00d9\7h\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7n\2\2"+
		"\u00db\u00dc\7u\2\2\u00dc\u00de\7g\2\2\u00dd\u00d4\3\2\2\2\u00dd\u00d8"+
		"\3\2\2\2\u00de\f\3\2\2\2\u00df\u00e0\7e\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2"+
		"\7u\2\2\u00e2\u00e3\7g\2\2\u00e3\16\3\2\2\2\u00e4\u00e5\7e\2\2\u00e5\u00e6"+
		"\7n\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8\7u\2\2\u00e8\u00e9\7u\2\2\u00e9"+
		"\20\3\2\2\2\u00ea\u00eb\7e\2\2\u00eb\u00ec\7q\2\2\u00ec\u00ed\7p\2\2\u00ed"+
		"\u00ee\7u\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f1\7w\2\2"+
		"\u00f1\u00f2\7e\2\2\u00f2\u00f3\7v\2\2\u00f3\u00f4\7q\2\2\u00f4\u00f5"+
		"\7t\2\2\u00f5\22\3\2\2\2\u00f6\u00f7\7e\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9"+
		"\7p\2\2\u00f9\u00fa\7v\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc\7p\2\2\u00fc"+
		"\u00fd\7w\2\2\u00fd\u00fe\7g\2\2\u00fe\24\3\2\2\2\u00ff\u0100\7f\2\2\u0100"+
		"\u0101\7q\2\2\u0101\26\3\2\2\2\u0102\u0103\7g\2\2\u0103\u0104\7n\2\2\u0104"+
		"\u0105\7u\2\2\u0105\u0106\7g\2\2\u0106\30\3\2\2\2\u0107\u0108\7h\2\2\u0108"+
		"\u0109\7q\2\2\u0109\u010a\7t\2\2\u010a\32\3\2\2\2\u010b\u010c\7i\2\2\u010c"+
		"\u010d\7g\2\2\u010d\u010e\7p\2\2\u010e\34\3\2\2\2\u010f\u0110\7k\2\2\u0110"+
		"\u0111\7h\2\2\u0111\36\3\2\2\2\u0112\u0113\7k\2\2\u0113\u0114\7p\2\2\u0114"+
		" \3\2\2\2\u0115\u0116\7k\2\2\u0116\u0117\7u\2\2\u0117\"\3\2\2\2\u0118"+
		"\u0119\7n\2\2\u0119\u011a\7q\2\2\u011a\u011b\7c\2\2\u011b\u011c\7f\2\2"+
		"\u011c$\3\2\2\2\u011d\u011e\7n\2\2\u011e\u011f\7q\2\2\u011f\u0120\7i\2"+
		"\2\u0120&\3\2\2\2\u0121\u0122\7k\2\2\u0122\u0123\7p\2\2\u0123\u0124\7"+
		"u\2\2\u0124\u0125\7v\2\2\u0125\u0126\7c\2\2\u0126\u0127\7p\2\2\u0127\u0128"+
		"\7e\2\2\u0128\u0129\7g\2\2\u0129(\3\2\2\2\u012a\u012b\7h\2\2\u012b\u012c"+
		"\7w\2\2\u012c\u012d\7p\2\2\u012d\u012e\7e\2\2\u012e\u012f\7v\2\2\u012f"+
		"\u0130\7k\2\2\u0130\u0131\7q\2\2\u0131\u0132\7p\2\2\u0132*\3\2\2\2\u0133"+
		"\u0134\7p\2\2\u0134\u0135\7w\2\2\u0135\u0136\7n\2\2\u0136\u0137\7n\2\2"+
		"\u0137,\3\2\2\2\u0138\u0139\7p\2\2\u0139\u013a\7g\2\2\u013a\u013b\7y\2"+
		"\2\u013b.\3\2\2\2\u013c\u013d\7t\2\2\u013d\u013e\7g\2\2\u013e\u013f\7"+
		"v\2\2\u013f\u0140\7w\2\2\u0140\u0141\7t\2\2\u0141\u0142\7p\2\2\u0142\60"+
		"\3\2\2\2\u0143\u0144\7u\2\2\u0144\u0145\7y\2\2\u0145\u0146\7k\2\2\u0146"+
		"\u0147\7v\2\2\u0147\u0148\7e\2\2\u0148\u0149\7j\2\2\u0149\62\3\2\2\2\u014a"+
		"\u014b\7v\2\2\u014b\u014c\7j\2\2\u014c\u014d\7k\2\2\u014d\u014e\7u\2\2"+
		"\u014e\64\3\2\2\2\u014f\u0150\7v\2\2\u0150\u0151\7k\2\2\u0151\u0152\7"+
		"e\2\2\u0152\u0153\7m\2\2\u0153\66\3\2\2\2\u0154\u0155\7v\2\2\u0155\u0156"+
		"\7j\2\2\u0156\u0157\7t\2\2\u0157\u0158\7q\2\2\u0158\u0159\7y\2\2\u0159"+
		"8\3\2\2\2\u015a\u015b\7x\2\2\u015b\u015c\7c\2\2\u015c\u015d\7t\2\2\u015d"+
		":\3\2\2\2\u015e\u015f\7y\2\2\u015f\u0160\7j\2\2\u0160\u0161\7k\2\2\u0161"+
		"\u0162\7n\2\2\u0162\u0163\7g\2\2\u0163<\3\2\2\2\u0164\u0165\7(\2\2\u0165"+
		"\u0166\7(\2\2\u0166>\3\2\2\2\u0167\u0168\7~\2\2\u0168\u0169\7~\2\2\u0169"+
		"@\3\2\2\2\u016a\u016b\7@\2\2\u016bB\3\2\2\2\u016c\u016d\7@\2\2\u016d\u016e"+
		"\7?\2\2\u016eD\3\2\2\2\u016f\u0170\7>\2\2\u0170F\3\2\2\2\u0171\u0172\7"+
		">\2\2\u0172\u0173\7?\2\2\u0173H\3\2\2\2\u0174\u0175\7?\2\2\u0175\u0176"+
		"\7?\2\2\u0176J\3\2\2\2\u0177\u0178\7#\2\2\u0178\u0179\7?\2\2\u0179L\3"+
		"\2\2\2\u017a\u017b\7#\2\2\u017bN\3\2\2\2\u017c\u017d\7-\2\2\u017d\u017e"+
		"\7?\2\2\u017eP\3\2\2\2\u017f\u0180\7/\2\2\u0180\u0181\7?\2\2\u0181R\3"+
		"\2\2\2\u0182\u0183\7,\2\2\u0183\u0184\7?\2\2\u0184T\3\2\2\2\u0185\u0186"+
		"\7\61\2\2\u0186\u0187\7?\2\2\u0187V\3\2\2\2\u0188\u0189\7-\2\2\u0189\u018a"+
		"\7-\2\2\u018aX\3\2\2\2\u018b\u018c\7/\2\2\u018c\u018d\7/\2\2\u018dZ\3"+
		"\2\2\2\u018e\u018f\7`\2\2\u018f\\\3\2\2\2\u0190\u0191\7,\2\2\u0191^\3"+
		"\2\2\2\u0192\u0193\7\61\2\2\u0193`\3\2\2\2\u0194\u0195\7\'\2\2\u0195b"+
		"\3\2\2\2\u0196\u0197\7-\2\2\u0197d\3\2\2\2\u0198\u0199\7/\2\2\u0199f\3"+
		"\2\2\2\u019a\u019b\7*\2\2\u019bh\3\2\2\2\u019c\u019d\7+\2\2\u019dj\3\2"+
		"\2\2\u019e\u019f\7}\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\b\64\2\2\u01a1"+
		"l\3\2\2\2\u01a2\u01a3\7\177\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\b\65\3"+
		"\2\u01a5n\3\2\2\2\u01a6\u01a7\7]\2\2\u01a7p\3\2\2\2\u01a8\u01a9\7_\2\2"+
		"\u01a9r\3\2\2\2\u01aa\u01ab\7?\2\2\u01abt\3\2\2\2\u01ac\u01ad\7A\2\2\u01ad"+
		"\u01ae\7<\2\2\u01aev\3\2\2\2\u01af\u01b0\7A\2\2\u01b0x\3\2\2\2\u01b1\u01b2"+
		"\7\60\2\2\u01b2\u01b3\7\60\2\2\u01b3\u01b4\7\60\2\2\u01b4z\3\2\2\2\u01b5"+
		"\u01b6\7\60\2\2\u01b6|\3\2\2\2\u01b7\u01b8\7=\2\2\u01b8~\3\2\2\2\u01b9"+
		"\u01ba\7<\2\2\u01ba\u0080\3\2\2\2\u01bb\u01bc\7.\2\2\u01bc\u0082\3\2\2"+
		"\2\u01bd\u01be\7/\2\2\u01be\u01bf\7@\2\2\u01bf\u0084\3\2\2\2\u01c0\u01c1"+
		"\7)\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\bA\4\2\u01c3\u0086\3\2\2\2\u01c4"+
		"\u01c5\7$\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\bB\5\2\u01c7\u01c8\bB\6"+
		"\2\u01c8\u0088\3\2\2\2\u01c9\u01cb\5\u0095I\2\u01ca\u01cc\5\u0093H\2\u01cb"+
		"\u01ca\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\7\61"+
		"\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\bC\7\2\u01d0\u008a\3\2\2\2\u01d1"+
		"\u01d3\5\u0095I\2\u01d2\u01d4\5\u0093H\2\u01d3\u01d2\3\2\2\2\u01d3\u01d4"+
		"\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\7\61\2\2\u01d6\u01d7\7\61\2\2"+
		"\u01d7\u01dc\3\2\2\2\u01d8\u01db\5\u0095I\2\u01d9\u01db\5\u0093H\2\u01da"+
		"\u01d8\3\2\2\2\u01da\u01d9\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2"+
		"\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01df\3\2\2\2\u01de\u01dc\3\2\2\2\u01df"+
		"\u01e0\bD\b\2\u01e0\u01e1\bD\t\2\u01e1\u008c\3\2\2\2\u01e2\u01e5\5\u008f"+
		"F\2\u01e3\u01e4\7\60\2\2\u01e4\u01e6\5\u008fF\2\u01e5\u01e3\3\2\2\2\u01e5"+
		"\u01e6\3\2\2\2\u01e6\u008e\3\2\2\2\u01e7\u01eb\t\2\2\2\u01e8\u01ea\t\3"+
		"\2\2\u01e9\u01e8\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb"+
		"\u01ec\3\2\2\2\u01ec\u0090\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01f2\t\4"+
		"\2\2\u01ef\u01f1\t\5\2\2\u01f0\u01ef\3\2\2\2\u01f1\u01f4\3\2\2\2\u01f2"+
		"\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u0092\3\2\2\2\u01f4\u01f2\3\2"+
		"\2\2\u01f5\u01f7\t\6\2\2\u01f6\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8"+
		"\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\bH"+
		"\n\2\u01fb\u0094\3\2\2\2\u01fc\u01fe\7\17\2\2\u01fd\u01fc\3\2\2\2\u01fd"+
		"\u01fe\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0202\7\f\2\2\u0200\u0202\7\17"+
		"\2\2\u0201\u01fd\3\2\2\2\u0201\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203"+
		"\u0204\bI\n\2\u0204\u0096\3\2\2\2\u0205\u0209\7%\2\2\u0206\u0208\n\7\2"+
		"\2\u0207\u0206\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a"+
		"\3\2\2\2\u020a\u020c\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u020d\bJ\n\2\u020d"+
		"\u0098\3\2\2\2\u020e\u020f\7&\2\2\u020f\u0210\7}\2\2\u0210\u0211\3\2\2"+
		"\2\u0211\u0212\bK\2\2\u0212\u009a\3\2\2\2\u0213\u0214\7&\2\2\u0214\u0215"+
		"\5\u0091G\2\u0215\u009c\3\2\2\2\u0216\u021e\7^\2\2\u0217\u021f\t\b\2\2"+
		"\u0218\u0219\7w\2\2\u0219\u021a\5\u009fN\2\u021a\u021b\5\u009fN\2\u021b"+
		"\u021c\5\u009fN\2\u021c\u021d\5\u009fN\2\u021d\u021f\3\2\2\2\u021e\u0217"+
		"\3\2\2\2\u021e\u0218\3\2\2\2\u021f\u009e\3\2\2\2\u0220\u0221\t\t\2\2\u0221"+
		"\u00a0\3\2\2\2\u0222\u0224\n\n\2\2\u0223\u0222\3\2\2\2\u0224\u0225\3\2"+
		"\2\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u00a2\3\2\2\2\u0227"+
		"\u0228\5\u0085A\2\u0228\u0229\3\2\2\2\u0229\u022a\bP\3\2\u022a\u00a4\3"+
		"\2\2\2\u022b\u022c\5\u0099K\2\u022c\u022d\3\2\2\2\u022d\u022e\bQ\2\2\u022e"+
		"\u022f\bQ\13\2\u022f\u00a6\3\2\2\2\u0230\u0231\5\u009bL\2\u0231\u0232"+
		"\3\2\2\2\u0232\u0233\bR\f\2\u0233\u00a8\3\2\2\2\u0234\u0236\n\13\2\2\u0235"+
		"\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2"+
		"\2\2\u0238\u0239\3\2\2\2\u0239\u023a\bS\r\2\u023a\u00aa\3\2\2\2\u023b"+
		"\u023c\5\u009dM\2\u023c\u023d\3\2\2\2\u023d\u023e\bT\16\2\u023e\u00ac"+
		"\3\2\2\2\u023f\u0240\5\u0087B\2\u0240\u0241\3\2\2\2\u0241\u0242\bU\3\2"+
		"\u0242\u0243\bU\17\2\u0243\u00ae\3\2\2\2\u0244\u0245\7&\2\2\u0245\u0246"+
		"\7}\2\2\u0246\u0247\3\2\2\2\u0247\u0248\bV\2\2\u0248\u00b0\3\2\2\2\u0249"+
		"\u024a\7&\2\2\u024a\u024b\5)\23\2\u024b\u024c\3\2\2\2\u024c\u024d\bW\3"+
		"\2\u024d\u024e\bW\2\2\u024e\u00b2\3\2\2\2\u024f\u0250\7&\2\2\u0250\u0251"+
		"\5\u0091G\2\u0251\u00b4\3\2\2\2\u0252\u0253\7^\2\2\u0253\u025a\7&\2\2"+
		"\u0254\u0256\n\f\2\2\u0255\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0255"+
		"\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u025a\3\2\2\2\u0259\u0252\3\2\2\2\u0259"+
		"\u0255\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u0259\3\2\2\2\u025b\u025c\3\2"+
		"\2\2\u025c\u00b6\3\2\2\2\u025d\u025e\5\u008bD\2\u025e\u025f\3\2\2\2\u025f"+
		"\u0260\bZ\3\2\u0260\u0261\bZ\b\2\u0261\u0262\bZ\20\2\u0262\u00b8\3\2\2"+
		"\2\u0263\u0264\5\u0089C\2\u0264\u00ba\3\2\2\2\u0265\u0266\5\u0095I\2\u0266"+
		"\u0267\3\2\2\2\u0267\u0268\b\\\3\2\u0268\u00bc\3\2\2\2\u0269\u026b\5\u0095"+
		"I\2\u026a\u0269\3\2\2\2\u026b\u026e\3\2\2\2\u026c\u026a\3\2\2\2\u026c"+
		"\u026d\3\2\2\2\u026d\u026f\3\2\2\2\u026e\u026c\3\2\2\2\u026f\u0270\7\61"+
		"\2\2\u0270\u0271\7\61\2\2\u0271\u0272\3\2\2\2\u0272\u0273\b]\3\2\u0273"+
		"\u0274\b]\21\2\u0274\u00be\3\2\2\2\u0275\u0276\5\u00b3X\2\u0276\u0277"+
		"\3\2\2\2\u0277\u0278\b^\22\2\u0278\u00c0\3\2\2\2\u0279\u027a\7^\2\2\u027a"+
		"\u0283\7&\2\2\u027b\u027c\7\61\2\2\u027c\u0283\n\r\2\2\u027d\u027f\n\r"+
		"\2\2\u027e\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u027e\3\2\2\2\u0280"+
		"\u0281\3\2\2\2\u0281\u0283\3\2\2\2\u0282\u0279\3\2\2\2\u0282\u027b\3\2"+
		"\2\2\u0282\u027e\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0282\3\2\2\2\u0284"+
		"\u0285\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287\b_\23\2\u0287\u00c2\3\2"+
		"\2\2\u0288\u0289\5\u0099K\2\u0289\u028a\3\2\2\2\u028a\u028b\b`\2\2\u028b"+
		"\u028c\b`\13\2\u028c\u00c4\3\2\2\2\u028d\u028f\5\u0093H\2\u028e\u028d"+
		"\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0292\5\u0095I"+
		"\2\u0291\u0293\5\u0093H\2\u0292\u0291\3\2\2\2\u0292\u0293\3\2\2\2\u0293"+
		"\u00c6\3\2\2\2\37\2\3\4\5\6\u00dd\u01cb\u01d3\u01da\u01dc\u01e5\u01eb"+
		"\u01f2\u01f8\u01fd\u0201\u0209\u021e\u0225\u0237\u0257\u0259\u025b\u026c"+
		"\u0280\u0282\u0284\u028e\u0292\24\7\2\2\6\2\2\7\3\2\7\4\2\tB\2\7\5\2\7"+
		"\6\2\tC\2\b\2\2\tI\2\tJ\2\tL\2\tK\2\tM\2\tR\2\tS\2\tP\2\tQ\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}