// Generated from C:/Code/minecraft/modding/mcfunction_lambdas/src/main/antlr\FunctionLexer.g4 by ANTLR 4.8
package com.function.main.grammar;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FunctionLexer extends Lexer {
    static {
        RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            ASSERT = 1, BREAK = 2, BOOL = 3, CASE = 4, CLASS = 5, CONSTRUCTOR = 6, CONTINUE = 7,
            DO = 8, ELSE = 9, FOR = 10, GEN = 11, IF = 12, IN = 13, IS = 14, LOG = 15, INSTANCE = 16,
            FUNCTION = 17, NULL = 18, NEW = 19, RETURN = 20, SWITCH = 21, THIS = 22, THROW = 23,
            VAR = 24, WHILE = 25, AND = 26, OR = 27, GT = 28, GE = 29, LT = 30, LE = 31, EQ = 32, NE = 33,
            NOT = 34, PLUSEQUAL = 35, MINUSEQUAL = 36, MULTEQUAL = 37, DIVIDEEQUAL = 38, PLUSPLUS = 39,
            MINUSMINUS = 40, POW = 41, MULT = 42, DIV = 43, MOD = 44, PLUS = 45, MINUS = 46, LPAREN = 47,
            RPAREN = 48, LBRACE = 49, RBRACE = 50, LBRACKET = 51, RBRACKET = 52, EQUAL = 53, ELVIS = 54,
            QUESTION = 55, DOTDOTDOT = 56, DOT = 57, SEMI = 58, COLON = 59, COMMA = 60, ARROW = 61,
            OPEN_STRING = 62, OPEN_COMMAND = 63, NUM = 64, IDEN = 65, WS = 66, NEWLINE = 67, COMMENT = 68,
            ENTER_EXPR_INTERP = 69, ID_INTERP = 70, ESCAPE = 71, TEXT = 72, CLOSE_STRING = 73,
            ENTER_EXPR_INTERP_COMMAND = 74, OPEN_FUNCTION = 75, ID_INTERP_COMMAND = 76,
            TEXT_COMMAND = 77, NEWLINE_COMMAND = 78, EXIT_COMMAND = 79, CONTINUE_COMMAND = 80;
    public static final int
            STRING = 1, DOUBLE_QUOTED_STRING = 2, COMMAND_MODE = 3, MULTI_LINE_COMMAND = 4;
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };

    public static String[] modeNames = {
            "DEFAULT_MODE", "STRING", "DOUBLE_QUOTED_STRING", "COMMAND_MODE", "MULTI_LINE_COMMAND"
    };

    private static String[] makeRuleNames() {
        return new String[]{
                "ASSERT", "BREAK", "BOOL", "CASE", "CLASS", "CONSTRUCTOR", "CONTINUE",
                "DO", "ELSE", "FOR", "GEN", "IF", "IN", "IS", "LOG", "INSTANCE", "FUNCTION",
                "NULL", "NEW", "RETURN", "SWITCH", "THIS", "THROW", "VAR", "WHILE", "AND",
                "OR", "GT", "GE", "LT", "LE", "EQ", "NE", "NOT", "PLUSEQUAL", "MINUSEQUAL",
                "MULTEQUAL", "DIVIDEEQUAL", "PLUSPLUS", "MINUSMINUS", "POW", "MULT",
                "DIV", "MOD", "PLUS", "MINUS", "LPAREN", "RPAREN", "LBRACE", "RBRACE",
                "LBRACKET", "RBRACKET", "EQUAL", "ELVIS", "QUESTION", "DOTDOTDOT", "DOT",
                "SEMI", "COLON", "COMMA", "ARROW", "OPEN_STRING", "OPEN_DOUBLE_QUOTED_STRING",
                "OPEN_COMMAND", "OPEN_MULTI_COMMAND", "NUM", "PINT", "IDEN", "WS", "NEWLINE",
                "COMMENT", "ENTER_EXPR_INTERP", "ID_INTERP", "ESCAPE", "HEX_DIGIT", "TEXT",
                "CLOSE_STRING", "ENTER_DOUBLE_EXPR_INTERP", "DOUBLE_ID_INTERP", "DOUBLE_TEXT",
                "DOUBLE_ESCAPE", "CLOSE_DOUBLE_QUOTED_STRING", "ENTER_EXPR_INTERP_COMMAND",
                "OPEN_FUNCTION", "ID_INTERP_COMMAND", "TEXT_COMMAND", "NEWLINE_COMMAND",
                "EXIT_COMMAND", "EXIT_MULTI_COMMAND", "ID_INTERP_MULTI_COMMAND", "TEXT_MULTI_COMMAND",
                "ENTER_EXPR_MULTI_INTERP", "CONTINUE_COMMAND"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'assert'", "'break'", null, "'case'", "'class'", "'constructor'",
                "'continue'", "'do'", "'else'", "'for'", "'gen'", "'if'", "'in'", "'is'",
                "'log'", "'instance'", "'function'", "'null'", "'new'", "'return'", "'switch'",
                "'this'", "'throw'", "'var'", "'while'", "'&&'", "'||'", "'>'", "'>='",
                "'<'", "'<='", "'=='", "'!='", "'!'", "'+='", "'-='", "'*='", "'/='",
                "'++'", "'--'", "'^'", "'*'", "'/'", "'%'", "'+'", "'-'", "'('", "')'",
                "'{'", "'}'", "'['", "']'", "'='", "'?:'", "'?'", "'...'", "'.'", "';'",
                "':'", "','", "'->'", "'''"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, "ASSERT", "BREAK", "BOOL", "CASE", "CLASS", "CONSTRUCTOR", "CONTINUE",
                "DO", "ELSE", "FOR", "GEN", "IF", "IN", "IS", "LOG", "INSTANCE", "FUNCTION",
                "NULL", "NEW", "RETURN", "SWITCH", "THIS", "THROW", "VAR", "WHILE", "AND",
                "OR", "GT", "GE", "LT", "LE", "EQ", "NE", "NOT", "PLUSEQUAL", "MINUSEQUAL",
                "MULTEQUAL", "DIVIDEEQUAL", "PLUSPLUS", "MINUSMINUS", "POW", "MULT",
                "DIV", "MOD", "PLUS", "MINUS", "LPAREN", "RPAREN", "LBRACE", "RBRACE",
                "LBRACKET", "RBRACKET", "EQUAL", "ELVIS", "QUESTION", "DOTDOTDOT", "DOT",
                "SEMI", "COLON", "COMMA", "ARROW", "OPEN_STRING", "OPEN_COMMAND", "NUM",
                "IDEN", "WS", "NEWLINE", "COMMENT", "ENTER_EXPR_INTERP", "ID_INTERP",
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
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    public String getGrammarFileName() {
        return "FunctionLexer.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2R\u027e\b\1\b\1\b" +
                    "\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t" +
                    "\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4" +
                    "\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4" +
                    "\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4" +
                    "\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)" +
                    "\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62" +
                    "\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4" +
                    ";\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\t" +
                    "F\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4" +
                    "R\tR\4S\tS\4T\tT\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]" +
                    "\t]\4^\t^\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4" +
                    "\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00d8\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6" +
                    "\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3" +
                    "\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3" +
                    "\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17" +
                    "\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22" +
                    "\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24" +
                    "\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26" +
                    "\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30" +
                    "\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34" +
                    "\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3" +
                    "\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)" +
                    "\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62" +
                    "\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67" +
                    "\38\38\39\39\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3>\3?\3?\3?\3?\3@\3@" +
                    "\3@\3@\3@\3A\3A\5A\u01bc\nA\3A\3A\3A\3A\3B\3B\5B\u01c4\nB\3B\3B\3B\3B" +
                    "\3B\7B\u01cb\nB\fB\16B\u01ce\13B\3B\3B\3B\3C\3C\3C\5C\u01d6\nC\3D\3D\7" +
                    "D\u01da\nD\fD\16D\u01dd\13D\3E\3E\7E\u01e1\nE\fE\16E\u01e4\13E\3F\6F\u01e7" +
                    "\nF\rF\16F\u01e8\3F\3F\3G\5G\u01ee\nG\3G\3G\5G\u01f2\nG\3G\3G\3H\3H\7" +
                    "H\u01f8\nH\fH\16H\u01fb\13H\3H\3H\3I\3I\3I\3I\3I\3J\3J\3J\3K\3K\3K\3K" +
                    "\3K\3K\3K\3K\5K\u020f\nK\3L\3L\3M\6M\u0214\nM\rM\16M\u0215\3N\3N\3N\3" +
                    "N\3O\3O\3O\3O\3O\3P\3P\3P\3P\3Q\6Q\u0226\nQ\rQ\16Q\u0227\3Q\3Q\3R\3R\3" +
                    "R\3R\3S\3S\3S\3S\3S\3T\3T\3T\3T\3T\3U\3U\3U\3U\3U\3U\3V\3V\3V\3W\3W\3" +
                    "W\6W\u0246\nW\rW\16W\u0247\6W\u024a\nW\rW\16W\u024b\3X\3X\3Y\3Y\3Y\3Y" +
                    "\3Z\7Z\u0255\nZ\fZ\16Z\u0258\13Z\3Z\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3\\\3\\" +
                    "\3\\\3\\\3\\\6\\\u0269\n\\\r\\\16\\\u026a\6\\\u026d\n\\\r\\\16\\\u026e" +
                    "\3\\\3\\\3]\3]\3]\3]\3]\3^\5^\u0279\n^\3^\3^\5^\u027d\n^\2\2_\7\3\t\4" +
                    "\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22" +
                    "\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!E\"G" +
                    "#I$K%M&O\'Q(S)U*W+Y,[-]._/a\60c\61e\62g\63i\64k\65m\66o\67q8s9u:w;y<{" +
                    "=}>\177?\u0081@\u0083\2\u0085A\u0087\2\u0089B\u008b\2\u008dC\u008fD\u0091" +
                    "E\u0093F\u0095G\u0097H\u0099I\u009b\2\u009dJ\u009fK\u00a1\2\u00a3\2\u00a5" +
                    "\2\u00a7\2\u00a9\2\u00abL\u00adM\u00afN\u00b1O\u00b3P\u00b5Q\u00b7\2\u00b9" +
                    "\2\u00bb\2\u00bd\2\u00bfR\7\2\3\4\5\6\16\3\2\62;\4\2\62;aa\5\2C\\aac|" +
                    "\6\2\62;C\\aac|\4\2\13\13\"\"\4\2\f\f\17\17\b\2$$&&))^^pptt\5\2\62;CH" +
                    "ch\7\2\f\f\17\17&&))^^\7\2\f\f\17\17$$&&^^\5\2\f\f\17\17&&\6\2\f\f\17" +
                    "\17&&\61\61\2\u0290\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2" +
                    "\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3" +
                    "\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2" +
                    "%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61" +
                    "\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2" +
                    "\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I" +
                    "\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2" +
                    "\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2" +
                    "\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o" +
                    "\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2" +
                    "\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085" +
                    "\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2" +
                    "\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\3\u0095\3\2\2\2\3\u0097\3\2\2\2\3\u0099" +
                    "\3\2\2\2\3\u009d\3\2\2\2\3\u009f\3\2\2\2\4\u00a1\3\2\2\2\4\u00a3\3\2\2" +
                    "\2\4\u00a5\3\2\2\2\4\u00a7\3\2\2\2\4\u00a9\3\2\2\2\5\u00ab\3\2\2\2\5\u00ad" +
                    "\3\2\2\2\5\u00af\3\2\2\2\5\u00b1\3\2\2\2\5\u00b3\3\2\2\2\5\u00b5\3\2\2" +
                    "\2\6\u00b7\3\2\2\2\6\u00b9\3\2\2\2\6\u00bb\3\2\2\2\6\u00bd\3\2\2\2\6\u00bf" +
                    "\3\2\2\2\7\u00c1\3\2\2\2\t\u00c8\3\2\2\2\13\u00d7\3\2\2\2\r\u00d9\3\2" +
                    "\2\2\17\u00de\3\2\2\2\21\u00e4\3\2\2\2\23\u00f0\3\2\2\2\25\u00f9\3\2\2" +
                    "\2\27\u00fc\3\2\2\2\31\u0101\3\2\2\2\33\u0105\3\2\2\2\35\u0109\3\2\2\2" +
                    "\37\u010c\3\2\2\2!\u010f\3\2\2\2#\u0112\3\2\2\2%\u0116\3\2\2\2\'\u011f" +
                    "\3\2\2\2)\u0128\3\2\2\2+\u012d\3\2\2\2-\u0131\3\2\2\2/\u0138\3\2\2\2\61" +
                    "\u013f\3\2\2\2\63\u0144\3\2\2\2\65\u014a\3\2\2\2\67\u014e\3\2\2\29\u0154" +
                    "\3\2\2\2;\u0157\3\2\2\2=\u015a\3\2\2\2?\u015c\3\2\2\2A\u015f\3\2\2\2C" +
                    "\u0161\3\2\2\2E\u0164\3\2\2\2G\u0167\3\2\2\2I\u016a\3\2\2\2K\u016c\3\2" +
                    "\2\2M\u016f\3\2\2\2O\u0172\3\2\2\2Q\u0175\3\2\2\2S\u0178\3\2\2\2U\u017b" +
                    "\3\2\2\2W\u017e\3\2\2\2Y\u0180\3\2\2\2[\u0182\3\2\2\2]\u0184\3\2\2\2_" +
                    "\u0186\3\2\2\2a\u0188\3\2\2\2c\u018a\3\2\2\2e\u018c\3\2\2\2g\u018e\3\2" +
                    "\2\2i\u0192\3\2\2\2k\u0196\3\2\2\2m\u0198\3\2\2\2o\u019a\3\2\2\2q\u019c" +
                    "\3\2\2\2s\u019f\3\2\2\2u\u01a1\3\2\2\2w\u01a5\3\2\2\2y\u01a7\3\2\2\2{" +
                    "\u01a9\3\2\2\2}\u01ab\3\2\2\2\177\u01ad\3\2\2\2\u0081\u01b0\3\2\2\2\u0083" +
                    "\u01b4\3\2\2\2\u0085\u01b9\3\2\2\2\u0087\u01c1\3\2\2\2\u0089\u01d2\3\2" +
                    "\2\2\u008b\u01d7\3\2\2\2\u008d\u01de\3\2\2\2\u008f\u01e6\3\2\2\2\u0091" +
                    "\u01f1\3\2\2\2\u0093\u01f5\3\2\2\2\u0095\u01fe\3\2\2\2\u0097\u0203\3\2" +
                    "\2\2\u0099\u0206\3\2\2\2\u009b\u0210\3\2\2\2\u009d\u0213\3\2\2\2\u009f" +
                    "\u0217\3\2\2\2\u00a1\u021b\3\2\2\2\u00a3\u0220\3\2\2\2\u00a5\u0225\3\2" +
                    "\2\2\u00a7\u022b\3\2\2\2\u00a9\u022f\3\2\2\2\u00ab\u0234\3\2\2\2\u00ad" +
                    "\u0239\3\2\2\2\u00af\u023f\3\2\2\2\u00b1\u0249\3\2\2\2\u00b3\u024d\3\2" +
                    "\2\2\u00b5\u024f\3\2\2\2\u00b7\u0256\3\2\2\2\u00b9\u025f\3\2\2\2\u00bb" +
                    "\u026c\3\2\2\2\u00bd\u0272\3\2\2\2\u00bf\u0278\3\2\2\2\u00c1\u00c2\7c" +
                    "\2\2\u00c2\u00c3\7u\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6" +
                    "\7t\2\2\u00c6\u00c7\7v\2\2\u00c7\b\3\2\2\2\u00c8\u00c9\7d\2\2\u00c9\u00ca" +
                    "\7t\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7c\2\2\u00cc\u00cd\7m\2\2\u00cd" +
                    "\n\3\2\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1\7w\2\2\u00d1" +
                    "\u00d8\7g\2\2\u00d2\u00d3\7h\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7n\2\2" +
                    "\u00d5\u00d6\7u\2\2\u00d6\u00d8\7g\2\2\u00d7\u00ce\3\2\2\2\u00d7\u00d2" +
                    "\3\2\2\2\u00d8\f\3\2\2\2\u00d9\u00da\7e\2\2\u00da\u00db\7c\2\2\u00db\u00dc" +
                    "\7u\2\2\u00dc\u00dd\7g\2\2\u00dd\16\3\2\2\2\u00de\u00df\7e\2\2\u00df\u00e0" +
                    "\7n\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7u\2\2\u00e2\u00e3\7u\2\2\u00e3" +
                    "\20\3\2\2\2\u00e4\u00e5\7e\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7p\2\2\u00e7" +
                    "\u00e8\7u\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb\7w\2\2" +
                    "\u00eb\u00ec\7e\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef" +
                    "\7t\2\2\u00ef\22\3\2\2\2\u00f0\u00f1\7e\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3" +
                    "\7p\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7p\2\2\u00f6" +
                    "\u00f7\7w\2\2\u00f7\u00f8\7g\2\2\u00f8\24\3\2\2\2\u00f9\u00fa\7f\2\2\u00fa" +
                    "\u00fb\7q\2\2\u00fb\26\3\2\2\2\u00fc\u00fd\7g\2\2\u00fd\u00fe\7n\2\2\u00fe" +
                    "\u00ff\7u\2\2\u00ff\u0100\7g\2\2\u0100\30\3\2\2\2\u0101\u0102\7h\2\2\u0102" +
                    "\u0103\7q\2\2\u0103\u0104\7t\2\2\u0104\32\3\2\2\2\u0105\u0106\7i\2\2\u0106" +
                    "\u0107\7g\2\2\u0107\u0108\7p\2\2\u0108\34\3\2\2\2\u0109\u010a\7k\2\2\u010a" +
                    "\u010b\7h\2\2\u010b\36\3\2\2\2\u010c\u010d\7k\2\2\u010d\u010e\7p\2\2\u010e" +
                    " \3\2\2\2\u010f\u0110\7k\2\2\u0110\u0111\7u\2\2\u0111\"\3\2\2\2\u0112" +
                    "\u0113\7n\2\2\u0113\u0114\7q\2\2\u0114\u0115\7i\2\2\u0115$\3\2\2\2\u0116" +
                    "\u0117\7k\2\2\u0117\u0118\7p\2\2\u0118\u0119\7u\2\2\u0119\u011a\7v\2\2" +
                    "\u011a\u011b\7c\2\2\u011b\u011c\7p\2\2\u011c\u011d\7e\2\2\u011d\u011e" +
                    "\7g\2\2\u011e&\3\2\2\2\u011f\u0120\7h\2\2\u0120\u0121\7w\2\2\u0121\u0122" +
                    "\7p\2\2\u0122\u0123\7e\2\2\u0123\u0124\7v\2\2\u0124\u0125\7k\2\2\u0125" +
                    "\u0126\7q\2\2\u0126\u0127\7p\2\2\u0127(\3\2\2\2\u0128\u0129\7p\2\2\u0129" +
                    "\u012a\7w\2\2\u012a\u012b\7n\2\2\u012b\u012c\7n\2\2\u012c*\3\2\2\2\u012d" +
                    "\u012e\7p\2\2\u012e\u012f\7g\2\2\u012f\u0130\7y\2\2\u0130,\3\2\2\2\u0131" +
                    "\u0132\7t\2\2\u0132\u0133\7g\2\2\u0133\u0134\7v\2\2\u0134\u0135\7w\2\2" +
                    "\u0135\u0136\7t\2\2\u0136\u0137\7p\2\2\u0137.\3\2\2\2\u0138\u0139\7u\2" +
                    "\2\u0139\u013a\7y\2\2\u013a\u013b\7k\2\2\u013b\u013c\7v\2\2\u013c\u013d" +
                    "\7e\2\2\u013d\u013e\7j\2\2\u013e\60\3\2\2\2\u013f\u0140\7v\2\2\u0140\u0141" +
                    "\7j\2\2\u0141\u0142\7k\2\2\u0142\u0143\7u\2\2\u0143\62\3\2\2\2\u0144\u0145" +
                    "\7v\2\2\u0145\u0146\7j\2\2\u0146\u0147\7t\2\2\u0147\u0148\7q\2\2\u0148" +
                    "\u0149\7y\2\2\u0149\64\3\2\2\2\u014a\u014b\7x\2\2\u014b\u014c\7c\2\2\u014c" +
                    "\u014d\7t\2\2\u014d\66\3\2\2\2\u014e\u014f\7y\2\2\u014f\u0150\7j\2\2\u0150" +
                    "\u0151\7k\2\2\u0151\u0152\7n\2\2\u0152\u0153\7g\2\2\u01538\3\2\2\2\u0154" +
                    "\u0155\7(\2\2\u0155\u0156\7(\2\2\u0156:\3\2\2\2\u0157\u0158\7~\2\2\u0158" +
                    "\u0159\7~\2\2\u0159<\3\2\2\2\u015a\u015b\7@\2\2\u015b>\3\2\2\2\u015c\u015d" +
                    "\7@\2\2\u015d\u015e\7?\2\2\u015e@\3\2\2\2\u015f\u0160\7>\2\2\u0160B\3" +
                    "\2\2\2\u0161\u0162\7>\2\2\u0162\u0163\7?\2\2\u0163D\3\2\2\2\u0164\u0165" +
                    "\7?\2\2\u0165\u0166\7?\2\2\u0166F\3\2\2\2\u0167\u0168\7#\2\2\u0168\u0169" +
                    "\7?\2\2\u0169H\3\2\2\2\u016a\u016b\7#\2\2\u016bJ\3\2\2\2\u016c\u016d\7" +
                    "-\2\2\u016d\u016e\7?\2\2\u016eL\3\2\2\2\u016f\u0170\7/\2\2\u0170\u0171" +
                    "\7?\2\2\u0171N\3\2\2\2\u0172\u0173\7,\2\2\u0173\u0174\7?\2\2\u0174P\3" +
                    "\2\2\2\u0175\u0176\7\61\2\2\u0176\u0177\7?\2\2\u0177R\3\2\2\2\u0178\u0179" +
                    "\7-\2\2\u0179\u017a\7-\2\2\u017aT\3\2\2\2\u017b\u017c\7/\2\2\u017c\u017d" +
                    "\7/\2\2\u017dV\3\2\2\2\u017e\u017f\7`\2\2\u017fX\3\2\2\2\u0180\u0181\7" +
                    ",\2\2\u0181Z\3\2\2\2\u0182\u0183\7\61\2\2\u0183\\\3\2\2\2\u0184\u0185" +
                    "\7\'\2\2\u0185^\3\2\2\2\u0186\u0187\7-\2\2\u0187`\3\2\2\2\u0188\u0189" +
                    "\7/\2\2\u0189b\3\2\2\2\u018a\u018b\7*\2\2\u018bd\3\2\2\2\u018c\u018d\7" +
                    "+\2\2\u018df\3\2\2\2\u018e\u018f\7}\2\2\u018f\u0190\3\2\2\2\u0190\u0191" +
                    "\b\62\2\2\u0191h\3\2\2\2\u0192\u0193\7\177\2\2\u0193\u0194\3\2\2\2\u0194" +
                    "\u0195\b\63\3\2\u0195j\3\2\2\2\u0196\u0197\7]\2\2\u0197l\3\2\2\2\u0198" +
                    "\u0199\7_\2\2\u0199n\3\2\2\2\u019a\u019b\7?\2\2\u019bp\3\2\2\2\u019c\u019d" +
                    "\7A\2\2\u019d\u019e\7<\2\2\u019er\3\2\2\2\u019f\u01a0\7A\2\2\u01a0t\3" +
                    "\2\2\2\u01a1\u01a2\7\60\2\2\u01a2\u01a3\7\60\2\2\u01a3\u01a4\7\60\2\2" +
                    "\u01a4v\3\2\2\2\u01a5\u01a6\7\60\2\2\u01a6x\3\2\2\2\u01a7\u01a8\7=\2\2" +
                    "\u01a8z\3\2\2\2\u01a9\u01aa\7<\2\2\u01aa|\3\2\2\2\u01ab\u01ac\7.\2\2\u01ac" +
                    "~\3\2\2\2\u01ad\u01ae\7/\2\2\u01ae\u01af\7@\2\2\u01af\u0080\3\2\2\2\u01b0" +
                    "\u01b1\7)\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\b?\4\2\u01b3\u0082\3\2\2" +
                    "\2\u01b4\u01b5\7$\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\b@\5\2\u01b7\u01b8" +
                    "\b@\6\2\u01b8\u0084\3\2\2\2\u01b9\u01bb\5\u0091G\2\u01ba\u01bc\5\u008f" +
                    "F\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd" +
                    "\u01be\7\61\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\bA\7\2\u01c0\u0086\3\2" +
                    "\2\2\u01c1\u01c3\5\u0091G\2\u01c2\u01c4\5\u008fF\2\u01c3\u01c2\3\2\2\2" +
                    "\u01c3\u01c4\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\7\61\2\2\u01c6\u01c7" +
                    "\7\61\2\2\u01c7\u01cc\3\2\2\2\u01c8\u01cb\5\u0091G\2\u01c9\u01cb\5\u008f" +
                    "F\2\u01ca\u01c8\3\2\2\2\u01ca\u01c9\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc" +
                    "\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01cc\3\2" +
                    "\2\2\u01cf\u01d0\bB\b\2\u01d0\u01d1\bB\t\2\u01d1\u0088\3\2\2\2\u01d2\u01d5" +
                    "\5\u008bD\2\u01d3\u01d4\7\60\2\2\u01d4\u01d6\5\u008bD\2\u01d5\u01d3\3" +
                    "\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u008a\3\2\2\2\u01d7\u01db\t\2\2\2\u01d8" +
                    "\u01da\t\3\2\2\u01d9\u01d8\3\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9\3\2" +
                    "\2\2\u01db\u01dc\3\2\2\2\u01dc\u008c\3\2\2\2\u01dd\u01db\3\2\2\2\u01de" +
                    "\u01e2\t\4\2\2\u01df\u01e1\t\5\2\2\u01e0\u01df\3\2\2\2\u01e1\u01e4\3\2" +
                    "\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u008e\3\2\2\2\u01e4" +
                    "\u01e2\3\2\2\2\u01e5\u01e7\t\6\2\2\u01e6\u01e5\3\2\2\2\u01e7\u01e8\3\2" +
                    "\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea" +
                    "\u01eb\bF\n\2\u01eb\u0090\3\2\2\2\u01ec\u01ee\7\17\2\2\u01ed\u01ec\3\2" +
                    "\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f2\7\f\2\2\u01f0" +
                    "\u01f2\7\17\2\2\u01f1\u01ed\3\2\2\2\u01f1\u01f0\3\2\2\2\u01f2\u01f3\3" +
                    "\2\2\2\u01f3\u01f4\bG\n\2\u01f4\u0092\3\2\2\2\u01f5\u01f9\7%\2\2\u01f6" +
                    "\u01f8\n\7\2\2\u01f7\u01f6\3\2\2\2\u01f8\u01fb\3\2\2\2\u01f9\u01f7\3\2" +
                    "\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fc\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc" +
                    "\u01fd\bH\n\2\u01fd\u0094\3\2\2\2\u01fe\u01ff\7&\2\2\u01ff\u0200\7}\2" +
                    "\2\u0200\u0201\3\2\2\2\u0201\u0202\bI\2\2\u0202\u0096\3\2\2\2\u0203\u0204" +
                    "\7&\2\2\u0204\u0205\5\u008dE\2\u0205\u0098\3\2\2\2\u0206\u020e\7^\2\2" +
                    "\u0207\u020f\t\b\2\2\u0208\u0209\7w\2\2\u0209\u020a\5\u009bL\2\u020a\u020b" +
                    "\5\u009bL\2\u020b\u020c\5\u009bL\2\u020c\u020d\5\u009bL\2\u020d\u020f" +
                    "\3\2\2\2\u020e\u0207\3\2\2\2\u020e\u0208\3\2\2\2\u020f\u009a\3\2\2\2\u0210" +
                    "\u0211\t\t\2\2\u0211\u009c\3\2\2\2\u0212\u0214\n\n\2\2\u0213\u0212\3\2" +
                    "\2\2\u0214\u0215\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216" +
                    "\u009e\3\2\2\2\u0217\u0218\5\u0081?\2\u0218\u0219\3\2\2\2\u0219\u021a" +
                    "\bN\3\2\u021a\u00a0\3\2\2\2\u021b\u021c\5\u0095I\2\u021c\u021d\3\2\2\2" +
                    "\u021d\u021e\bO\2\2\u021e\u021f\bO\13\2\u021f\u00a2\3\2\2\2\u0220\u0221" +
                    "\5\u0097J\2\u0221\u0222\3\2\2\2\u0222\u0223\bP\f\2\u0223\u00a4\3\2\2\2" +
                    "\u0224\u0226\n\13\2\2\u0225\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0225" +
                    "\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a\bQ\r\2\u022a" +
                    "\u00a6\3\2\2\2\u022b\u022c\5\u0099K\2\u022c\u022d\3\2\2\2\u022d\u022e" +
                    "\bR\16\2\u022e\u00a8\3\2\2\2\u022f\u0230\5\u0083@\2\u0230\u0231\3\2\2" +
                    "\2\u0231\u0232\bS\3\2\u0232\u0233\bS\17\2\u0233\u00aa\3\2\2\2\u0234\u0235" +
                    "\7&\2\2\u0235\u0236\7}\2\2\u0236\u0237\3\2\2\2\u0237\u0238\bT\2\2\u0238" +
                    "\u00ac\3\2\2\2\u0239\u023a\7&\2\2\u023a\u023b\5\'\22\2\u023b\u023c\3\2" +
                    "\2\2\u023c\u023d\bU\3\2\u023d\u023e\bU\2\2\u023e\u00ae\3\2\2\2\u023f\u0240" +
                    "\7&\2\2\u0240\u0241\5\u008dE\2\u0241\u00b0\3\2\2\2\u0242\u0243\7^\2\2" +
                    "\u0243\u024a\7&\2\2\u0244\u0246\n\f\2\2\u0245\u0244\3\2\2\2\u0246\u0247" +
                    "\3\2\2\2\u0247\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u024a\3\2\2\2\u0249" +
                    "\u0242\3\2\2\2\u0249\u0245\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u0249\3\2" +
                    "\2\2\u024b\u024c\3\2\2\2\u024c\u00b2\3\2\2\2\u024d\u024e\5\u0085A\2\u024e" +
                    "\u00b4\3\2\2\2\u024f\u0250\5\u0091G\2\u0250\u0251\3\2\2\2\u0251\u0252" +
                    "\bY\3\2\u0252\u00b6\3\2\2\2\u0253\u0255\5\u0091G\2\u0254\u0253\3\2\2\2" +
                    "\u0255\u0258\3\2\2\2\u0256\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0259" +
                    "\3\2\2\2\u0258\u0256\3\2\2\2\u0259\u025a\7\61\2\2\u025a\u025b\7\61\2\2" +
                    "\u025b\u025c\3\2\2\2\u025c\u025d\bZ\3\2\u025d\u025e\bZ\20\2\u025e\u00b8" +
                    "\3\2\2\2\u025f\u0260\5\u00afV\2\u0260\u0261\3\2\2\2\u0261\u0262\b[\21" +
                    "\2\u0262\u00ba\3\2\2\2\u0263\u0264\7^\2\2\u0264\u026d\7&\2\2\u0265\u0266" +
                    "\7\61\2\2\u0266\u026d\n\r\2\2\u0267\u0269\n\r\2\2\u0268\u0267\3\2\2\2" +
                    "\u0269\u026a\3\2\2\2\u026a\u0268\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026d" +
                    "\3\2\2\2\u026c\u0263\3\2\2\2\u026c\u0265\3\2\2\2\u026c\u0268\3\2\2\2\u026d" +
                    "\u026e\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0270\3\2" +
                    "\2\2\u0270\u0271\b\\\22\2\u0271\u00bc\3\2\2\2\u0272\u0273\5\u0095I\2\u0273" +
                    "\u0274\3\2\2\2\u0274\u0275\b]\2\2\u0275\u0276\b]\13\2\u0276\u00be\3\2" +
                    "\2\2\u0277\u0279\5\u008fF\2\u0278\u0277\3\2\2\2\u0278\u0279\3\2\2\2\u0279" +
                    "\u027a\3\2\2\2\u027a\u027c\5\u0091G\2\u027b\u027d\5\u008fF\2\u027c\u027b" +
                    "\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u00c0\3\2\2\2\37\2\3\4\5\6\u00d7\u01bb" +
                    "\u01c3\u01ca\u01cc\u01d5\u01db\u01e2\u01e8\u01ed\u01f1\u01f9\u020e\u0215" +
                    "\u0227\u0247\u0249\u024b\u0256\u026a\u026c\u026e\u0278\u027c\23\7\2\2" +
                    "\6\2\2\7\3\2\7\4\2\t@\2\7\5\2\7\6\2\tA\2\b\2\2\tG\2\tH\2\tJ\2\tI\2\tK" +
                    "\2\tQ\2\tN\2\tO\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}