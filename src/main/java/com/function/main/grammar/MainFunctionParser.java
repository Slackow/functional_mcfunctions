// Generated from C:/Code/minecraft/modding/mcfunction_lambdas/src/main/antlr\MainFunctionParser.g4 by ANTLR 4.8
package com.function.main.grammar;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MainFunctionParser extends Parser {
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
            RULE_program = 0, RULE_statement = 1, RULE_line = 2, RULE_assert_line = 3,
            RULE_ending_line = 4, RULE_function_class = 5, RULE_gen_mcfunction_line = 6,
            RULE_class_line = 7, RULE_var_modification = 8, RULE_var_definition = 9,
            RULE_if_statement = 10, RULE_expr_block = 11, RULE_stat_block = 12, RULE_block = 13,
            RULE_for_loop = 14, RULE_foreach_loop = 15, RULE_while_loop = 16, RULE_do_while_loop = 17,
            RULE_log_line = 18, RULE_function_call_line = 19, RULE_function_line = 20,
            RULE_command = 21, RULE_command_part = 22, RULE_expr = 23, RULE_atom = 24,
            RULE_string_part = 25, RULE_range_expr = 26;

    private static String[] makeRuleNames() {
        return new String[]{
                "program", "statement", "line", "assert_line", "ending_line", "function_class",
                "gen_mcfunction_line", "class_line", "var_modification", "var_definition",
                "if_statement", "expr_block", "stat_block", "block", "for_loop", "foreach_loop",
                "while_loop", "do_while_loop", "log_line", "function_call_line", "function_line",
                "command", "command_part", "expr", "atom", "string_part", "range_expr"
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

    @Override
    public String getGrammarFileName() {
        return "MainFunctionParser.g4";
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
    public ATN getATN() {
        return _ATN;
    }

    public MainFunctionParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class ProgramContext extends ParserRuleContext {
        public TerminalNode EOF() {
            return getToken(MainFunctionParser.EOF, 0);
        }

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        public ProgramContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_program;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterProgram(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitProgram(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitProgram(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ProgramContext program() throws RecognitionException {
        ProgramContext _localctx = new ProgramContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_program);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(57);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSERT) | (1L << BOOL) | (1L << CLASS) | (1L << DO) | (1L << FOR) | (1L << GEN) | (1L << IF) | (1L << LOG) | (1L << FUNCTION) | (1L << NULL) | (1L << THIS) | (1L << VAR) | (1L << WHILE) | (1L << NOT) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACKET) | (1L << OPEN_STRING) | (1L << OPEN_COMMAND))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NUM - 64)) | (1L << (IDEN - 64)) | (1L << (NEWLINE_COMMAND - 64)))) != 0)) {
                    {
                        {
                            setState(54);
                            statement();
                        }
                    }
                    setState(59);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(60);
                match(EOF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class StatementContext extends ParserRuleContext {
        public LineContext line() {
            return getRuleContext(LineContext.class, 0);
        }

        public TerminalNode SEMI() {
            return getToken(MainFunctionParser.SEMI, 0);
        }

        public CommandContext command() {
            return getRuleContext(CommandContext.class, 0);
        }

        public If_statementContext if_statement() {
            return getRuleContext(If_statementContext.class, 0);
        }

        public For_loopContext for_loop() {
            return getRuleContext(For_loopContext.class, 0);
        }

        public Foreach_loopContext foreach_loop() {
            return getRuleContext(Foreach_loopContext.class, 0);
        }

        public While_loopContext while_loop() {
            return getRuleContext(While_loopContext.class, 0);
        }

        public Do_while_loopContext do_while_loop() {
            return getRuleContext(Do_while_loopContext.class, 0);
        }

        public Function_classContext function_class() {
            return getRuleContext(Function_classContext.class, 0);
        }

        public Function_lineContext function_line() {
            return getRuleContext(Function_lineContext.class, 0);
        }

        public Gen_mcfunction_lineContext gen_mcfunction_line() {
            return getRuleContext(Gen_mcfunction_lineContext.class, 0);
        }

        public StatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public final StatementContext statement() throws RecognitionException {
        StatementContext _localctx = new StatementContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_statement);
        try {
            setState(74);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(62);
                    line();
                    setState(63);
                    match(SEMI);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(65);
                    command();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(66);
                    if_statement();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(67);
                    for_loop();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(68);
                    foreach_loop();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(69);
                    while_loop();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(70);
                    do_while_loop();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(71);
                    function_class();
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(72);
                    function_line();
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(73);
                    gen_mcfunction_line();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class LineContext extends ParserRuleContext {
        public Var_definitionContext var_definition() {
            return getRuleContext(Var_definitionContext.class, 0);
        }

        public Var_modificationContext var_modification() {
            return getRuleContext(Var_modificationContext.class, 0);
        }

        public Log_lineContext log_line() {
            return getRuleContext(Log_lineContext.class, 0);
        }

        public Assert_lineContext assert_line() {
            return getRuleContext(Assert_lineContext.class, 0);
        }

        public Function_call_lineContext function_call_line() {
            return getRuleContext(Function_call_lineContext.class, 0);
        }

        public LineContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_line;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener) ((MainFunctionParserListener) listener).enterLine(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener) ((MainFunctionParserListener) listener).exitLine(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitLine(this);
            else return visitor.visitChildren(this);
        }
    }

    public final LineContext line() throws RecognitionException {
        LineContext _localctx = new LineContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_line);
        try {
            setState(81);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(76);
                    var_definition();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(77);
                    var_modification();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(78);
                    log_line();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(79);
                    assert_line();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(80);
                    function_call_line();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Assert_lineContext extends ParserRuleContext {
        public TerminalNode ASSERT() {
            return getToken(MainFunctionParser.ASSERT, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public Assert_lineContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_assert_line;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterAssert_line(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitAssert_line(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitAssert_line(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Assert_lineContext assert_line() throws RecognitionException {
        Assert_lineContext _localctx = new Assert_lineContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_assert_line);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(83);
                match(ASSERT);
                setState(84);
                expr(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Ending_lineContext extends ParserRuleContext {
        public TerminalNode SEMI() {
            return getToken(MainFunctionParser.SEMI, 0);
        }

        public TerminalNode RETURN() {
            return getToken(MainFunctionParser.RETURN, 0);
        }

        public TerminalNode BREAK() {
            return getToken(MainFunctionParser.BREAK, 0);
        }

        public TerminalNode CONTINUE() {
            return getToken(MainFunctionParser.CONTINUE, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public Ending_lineContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ending_line;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterEnding_line(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitEnding_line(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitEnding_line(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Ending_lineContext ending_line() throws RecognitionException {
        Ending_lineContext _localctx = new Ending_lineContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_ending_line);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(92);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case RETURN: {
                        setState(86);
                        match(RETURN);
                        setState(88);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOL - 3)) | (1L << (NULL - 3)) | (1L << (THIS - 3)) | (1L << (NOT - 3)) | (1L << (MINUS - 3)) | (1L << (LPAREN - 3)) | (1L << (LBRACE - 3)) | (1L << (LBRACKET - 3)) | (1L << (OPEN_STRING - 3)) | (1L << (NUM - 3)) | (1L << (IDEN - 3)))) != 0)) {
                            {
                                setState(87);
                                expr(0);
                            }
                        }

                    }
                    break;
                    case BREAK: {
                        setState(90);
                        match(BREAK);
                    }
                    break;
                    case CONTINUE: {
                        setState(91);
                        match(CONTINUE);
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(94);
                match(SEMI);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Function_classContext extends ParserRuleContext {
        public TerminalNode CLASS() {
            return getToken(MainFunctionParser.CLASS, 0);
        }

        public TerminalNode IDEN() {
            return getToken(MainFunctionParser.IDEN, 0);
        }

        public TerminalNode LBRACE() {
            return getToken(MainFunctionParser.LBRACE, 0);
        }

        public TerminalNode RBRACE() {
            return getToken(MainFunctionParser.RBRACE, 0);
        }

        public List<Class_lineContext> class_line() {
            return getRuleContexts(Class_lineContext.class);
        }

        public Class_lineContext class_line(int i) {
            return getRuleContext(Class_lineContext.class, i);
        }

        public Function_classContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_function_class;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterFunction_class(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitFunction_class(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitFunction_class(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Function_classContext function_class() throws RecognitionException {
        Function_classContext _localctx = new Function_classContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_function_class);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(96);
                match(CLASS);
                setState(97);
                match(IDEN);
                setState(98);
                match(LBRACE);
                setState(102);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSTRUCTOR) | (1L << INSTANCE) | (1L << FUNCTION) | (1L << VAR))) != 0)) {
                    {
                        {
                            setState(99);
                            class_line();
                        }
                    }
                    setState(104);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(105);
                match(RBRACE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Gen_mcfunction_lineContext extends ParserRuleContext {
        public TerminalNode GEN() {
            return getToken(MainFunctionParser.GEN, 0);
        }

        public TerminalNode FUNCTION() {
            return getToken(MainFunctionParser.FUNCTION, 0);
        }

        public Expr_blockContext expr_block() {
            return getRuleContext(Expr_blockContext.class, 0);
        }

        public Gen_mcfunction_lineContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_gen_mcfunction_line;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterGen_mcfunction_line(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitGen_mcfunction_line(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitGen_mcfunction_line(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Gen_mcfunction_lineContext gen_mcfunction_line() throws RecognitionException {
        Gen_mcfunction_lineContext _localctx = new Gen_mcfunction_lineContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_gen_mcfunction_line);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(107);
                match(GEN);
                setState(108);
                match(FUNCTION);
                setState(109);
                expr_block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Class_lineContext extends ParserRuleContext {
        public Class_lineContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_class_line;
        }

        public Class_lineContext() {
        }

        public void copyFrom(Class_lineContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class ConstructorClassLineContext extends Class_lineContext {
        public TerminalNode CONSTRUCTOR() {
            return getToken(MainFunctionParser.CONSTRUCTOR, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(MainFunctionParser.LPAREN, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(MainFunctionParser.RPAREN, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public List<TerminalNode> IDEN() {
            return getTokens(MainFunctionParser.IDEN);
        }

        public TerminalNode IDEN(int i) {
            return getToken(MainFunctionParser.IDEN, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(MainFunctionParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(MainFunctionParser.COMMA, i);
        }

        public ConstructorClassLineContext(Class_lineContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterConstructorClassLine(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitConstructorClassLine(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitConstructorClassLine(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FunctionClassLineContext extends Class_lineContext {
        public TerminalNode FUNCTION() {
            return getToken(MainFunctionParser.FUNCTION, 0);
        }

        public List<TerminalNode> IDEN() {
            return getTokens(MainFunctionParser.IDEN);
        }

        public TerminalNode IDEN(int i) {
            return getToken(MainFunctionParser.IDEN, i);
        }

        public TerminalNode LPAREN() {
            return getToken(MainFunctionParser.LPAREN, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(MainFunctionParser.RPAREN, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode INSTANCE() {
            return getToken(MainFunctionParser.INSTANCE, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(MainFunctionParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(MainFunctionParser.COMMA, i);
        }

        public FunctionClassLineContext(Class_lineContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterFunctionClassLine(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitFunctionClassLine(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitFunctionClassLine(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ConstantLineContext extends Class_lineContext {
        public Var_definitionContext var_definition() {
            return getRuleContext(Var_definitionContext.class, 0);
        }

        public TerminalNode SEMI() {
            return getToken(MainFunctionParser.SEMI, 0);
        }

        public TerminalNode INSTANCE() {
            return getToken(MainFunctionParser.INSTANCE, 0);
        }

        public ConstantLineContext(Class_lineContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterConstantLine(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitConstantLine(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitConstantLine(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Class_lineContext class_line() throws RecognitionException {
        Class_lineContext _localctx = new Class_lineContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_class_line);
        int _la;
        try {
            setState(149);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 12, _ctx)) {
                case 1:
                    _localctx = new FunctionClassLineContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(112);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == INSTANCE) {
                        {
                            setState(111);
                            match(INSTANCE);
                        }
                    }

                    setState(114);
                    match(FUNCTION);
                    setState(115);
                    match(IDEN);
                    setState(116);
                    match(LPAREN);
                    setState(125);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == IDEN) {
                        {
                            setState(117);
                            match(IDEN);
                            setState(122);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            while (_la == COMMA) {
                                {
                                    {
                                        setState(118);
                                        match(COMMA);
                                        setState(119);
                                        match(IDEN);
                                    }
                                }
                                setState(124);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                            }
                        }
                    }

                    setState(127);
                    match(RPAREN);
                    setState(128);
                    block();
                }
                break;
                case 2:
                    _localctx = new ConstructorClassLineContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(129);
                    match(CONSTRUCTOR);
                    setState(130);
                    match(LPAREN);
                    setState(139);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == IDEN) {
                        {
                            setState(131);
                            match(IDEN);
                            setState(136);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            while (_la == COMMA) {
                                {
                                    {
                                        setState(132);
                                        match(COMMA);
                                        setState(133);
                                        match(IDEN);
                                    }
                                }
                                setState(138);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                            }
                        }
                    }

                    setState(141);
                    match(RPAREN);
                    setState(142);
                    block();
                }
                break;
                case 3:
                    _localctx = new ConstantLineContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(144);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == INSTANCE) {
                        {
                            setState(143);
                            match(INSTANCE);
                        }
                    }

                    setState(146);
                    var_definition();
                    setState(147);
                    match(SEMI);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Var_modificationContext extends ParserRuleContext {
        public Var_modificationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_var_modification;
        }

        public Var_modificationContext() {
        }

        public void copyFrom(Var_modificationContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class VarDeclarationModPlusPlusContext extends Var_modificationContext {
        public Token var_operator;

        public TerminalNode IDEN() {
            return getToken(MainFunctionParser.IDEN, 0);
        }

        public TerminalNode PLUSPLUS() {
            return getToken(MainFunctionParser.PLUSPLUS, 0);
        }

        public TerminalNode MINUSMINUS() {
            return getToken(MainFunctionParser.MINUSMINUS, 0);
        }

        public VarDeclarationModPlusPlusContext(Var_modificationContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterVarDeclarationModPlusPlus(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitVarDeclarationModPlusPlus(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitVarDeclarationModPlusPlus(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class VarDeclarationListItemContext extends Var_modificationContext {
        public Token var_operator;

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode LBRACKET() {
            return getToken(MainFunctionParser.LBRACKET, 0);
        }

        public TerminalNode RBRACKET() {
            return getToken(MainFunctionParser.RBRACKET, 0);
        }

        public TerminalNode EQUAL() {
            return getToken(MainFunctionParser.EQUAL, 0);
        }

        public TerminalNode PLUSEQUAL() {
            return getToken(MainFunctionParser.PLUSEQUAL, 0);
        }

        public TerminalNode MINUSEQUAL() {
            return getToken(MainFunctionParser.MINUSEQUAL, 0);
        }

        public TerminalNode MULTEQUAL() {
            return getToken(MainFunctionParser.MULTEQUAL, 0);
        }

        public TerminalNode DIVIDEEQUAL() {
            return getToken(MainFunctionParser.DIVIDEEQUAL, 0);
        }

        public VarDeclarationListItemContext(Var_modificationContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterVarDeclarationListItem(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitVarDeclarationListItem(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitVarDeclarationListItem(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class VarDeclarationListItemPlusPlusContext extends Var_modificationContext {
        public Token var_operator;

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode LBRACKET() {
            return getToken(MainFunctionParser.LBRACKET, 0);
        }

        public TerminalNode RBRACKET() {
            return getToken(MainFunctionParser.RBRACKET, 0);
        }

        public TerminalNode PLUSPLUS() {
            return getToken(MainFunctionParser.PLUSPLUS, 0);
        }

        public TerminalNode MINUSMINUS() {
            return getToken(MainFunctionParser.MINUSMINUS, 0);
        }

        public VarDeclarationListItemPlusPlusContext(Var_modificationContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterVarDeclarationListItemPlusPlus(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitVarDeclarationListItemPlusPlus(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitVarDeclarationListItemPlusPlus(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class VarDeclarationObjectItemContext extends Var_modificationContext {
        public Token var_operator;

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode DOT() {
            return getToken(MainFunctionParser.DOT, 0);
        }

        public TerminalNode IDEN() {
            return getToken(MainFunctionParser.IDEN, 0);
        }

        public TerminalNode EQUAL() {
            return getToken(MainFunctionParser.EQUAL, 0);
        }

        public TerminalNode PLUSEQUAL() {
            return getToken(MainFunctionParser.PLUSEQUAL, 0);
        }

        public TerminalNode MINUSEQUAL() {
            return getToken(MainFunctionParser.MINUSEQUAL, 0);
        }

        public TerminalNode MULTEQUAL() {
            return getToken(MainFunctionParser.MULTEQUAL, 0);
        }

        public TerminalNode DIVIDEEQUAL() {
            return getToken(MainFunctionParser.DIVIDEEQUAL, 0);
        }

        public VarDeclarationObjectItemContext(Var_modificationContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterVarDeclarationObjectItem(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitVarDeclarationObjectItem(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitVarDeclarationObjectItem(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class VarDeclarationObjectItemPlusPlusContext extends Var_modificationContext {
        public Token var_operator;

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode DOT() {
            return getToken(MainFunctionParser.DOT, 0);
        }

        public TerminalNode IDEN() {
            return getToken(MainFunctionParser.IDEN, 0);
        }

        public TerminalNode PLUSPLUS() {
            return getToken(MainFunctionParser.PLUSPLUS, 0);
        }

        public TerminalNode MINUSMINUS() {
            return getToken(MainFunctionParser.MINUSMINUS, 0);
        }

        public VarDeclarationObjectItemPlusPlusContext(Var_modificationContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterVarDeclarationObjectItemPlusPlus(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitVarDeclarationObjectItemPlusPlus(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitVarDeclarationObjectItemPlusPlus(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class VarDeclarationModContext extends Var_modificationContext {
        public Token var_operator;

        public TerminalNode IDEN() {
            return getToken(MainFunctionParser.IDEN, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode EQUAL() {
            return getToken(MainFunctionParser.EQUAL, 0);
        }

        public TerminalNode PLUSEQUAL() {
            return getToken(MainFunctionParser.PLUSEQUAL, 0);
        }

        public TerminalNode MINUSEQUAL() {
            return getToken(MainFunctionParser.MINUSEQUAL, 0);
        }

        public TerminalNode MULTEQUAL() {
            return getToken(MainFunctionParser.MULTEQUAL, 0);
        }

        public TerminalNode DIVIDEEQUAL() {
            return getToken(MainFunctionParser.DIVIDEEQUAL, 0);
        }

        public VarDeclarationModContext(Var_modificationContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterVarDeclarationMod(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitVarDeclarationMod(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitVarDeclarationMod(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Var_modificationContext var_modification() throws RecognitionException {
        Var_modificationContext _localctx = new Var_modificationContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_var_modification);
        int _la;
        try {
            setState(180);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
                case 1:
                    _localctx = new VarDeclarationModContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(151);
                    match(IDEN);
                    setState(152);
                    ((VarDeclarationModContext) _localctx).var_operator = _input.LT(1);
                    _la = _input.LA(1);
                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUSEQUAL) | (1L << MINUSEQUAL) | (1L << MULTEQUAL) | (1L << DIVIDEEQUAL) | (1L << EQUAL))) != 0))) {
                        ((VarDeclarationModContext) _localctx).var_operator = (Token) _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                    setState(153);
                    expr(0);
                }
                break;
                case 2:
                    _localctx = new VarDeclarationModPlusPlusContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(154);
                    match(IDEN);
                    setState(155);
                    ((VarDeclarationModPlusPlusContext) _localctx).var_operator = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(_la == PLUSPLUS || _la == MINUSMINUS)) {
                        ((VarDeclarationModPlusPlusContext) _localctx).var_operator = (Token) _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                }
                break;
                case 3:
                    _localctx = new VarDeclarationListItemContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(156);
                    expr(0);
                    setState(157);
                    match(LBRACKET);
                    setState(158);
                    expr(0);
                    setState(159);
                    match(RBRACKET);
                    setState(160);
                    ((VarDeclarationListItemContext) _localctx).var_operator = _input.LT(1);
                    _la = _input.LA(1);
                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUSEQUAL) | (1L << MINUSEQUAL) | (1L << MULTEQUAL) | (1L << DIVIDEEQUAL) | (1L << EQUAL))) != 0))) {
                        ((VarDeclarationListItemContext) _localctx).var_operator = (Token) _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                    setState(161);
                    expr(0);
                }
                break;
                case 4:
                    _localctx = new VarDeclarationListItemPlusPlusContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(163);
                    expr(0);
                    setState(164);
                    match(LBRACKET);
                    setState(165);
                    expr(0);
                    setState(166);
                    match(RBRACKET);
                    setState(167);
                    ((VarDeclarationListItemPlusPlusContext) _localctx).var_operator = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(_la == PLUSPLUS || _la == MINUSMINUS)) {
                        ((VarDeclarationListItemPlusPlusContext) _localctx).var_operator = (Token) _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                }
                break;
                case 5:
                    _localctx = new VarDeclarationObjectItemContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(169);
                    expr(0);
                    setState(170);
                    match(DOT);
                    setState(171);
                    match(IDEN);
                    setState(172);
                    ((VarDeclarationObjectItemContext) _localctx).var_operator = _input.LT(1);
                    _la = _input.LA(1);
                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUSEQUAL) | (1L << MINUSEQUAL) | (1L << MULTEQUAL) | (1L << DIVIDEEQUAL) | (1L << EQUAL))) != 0))) {
                        ((VarDeclarationObjectItemContext) _localctx).var_operator = (Token) _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                    setState(173);
                    expr(0);
                }
                break;
                case 6:
                    _localctx = new VarDeclarationObjectItemPlusPlusContext(_localctx);
                    enterOuterAlt(_localctx, 6);
                {
                    setState(175);
                    expr(0);
                    setState(176);
                    match(DOT);
                    setState(177);
                    match(IDEN);
                    setState(178);
                    ((VarDeclarationObjectItemPlusPlusContext) _localctx).var_operator = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(_la == PLUSPLUS || _la == MINUSMINUS)) {
                        ((VarDeclarationObjectItemPlusPlusContext) _localctx).var_operator = (Token) _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Var_definitionContext extends ParserRuleContext {
        public TerminalNode VAR() {
            return getToken(MainFunctionParser.VAR, 0);
        }

        public List<TerminalNode> IDEN() {
            return getTokens(MainFunctionParser.IDEN);
        }

        public TerminalNode IDEN(int i) {
            return getToken(MainFunctionParser.IDEN, i);
        }

        public TerminalNode EQUAL() {
            return getToken(MainFunctionParser.EQUAL, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(MainFunctionParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(MainFunctionParser.COMMA, i);
        }

        public Var_definitionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_var_definition;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterVar_definition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitVar_definition(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitVar_definition(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Var_definitionContext var_definition() throws RecognitionException {
        Var_definitionContext _localctx = new Var_definitionContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_var_definition);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(182);
                match(VAR);
                setState(183);
                match(IDEN);
                setState(188);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(184);
                            match(COMMA);
                            setState(185);
                            match(IDEN);
                        }
                    }
                    setState(190);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(191);
                match(EQUAL);
                setState(192);
                expr(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class If_statementContext extends ParserRuleContext {
        public TerminalNode IF() {
            return getToken(MainFunctionParser.IF, 0);
        }

        public Expr_blockContext expr_block() {
            return getRuleContext(Expr_blockContext.class, 0);
        }

        public TerminalNode ELSE() {
            return getToken(MainFunctionParser.ELSE, 0);
        }

        public Stat_blockContext stat_block() {
            return getRuleContext(Stat_blockContext.class, 0);
        }

        public If_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_if_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterIf_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitIf_statement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitIf_statement(this);
            else return visitor.visitChildren(this);
        }
    }

    public final If_statementContext if_statement() throws RecognitionException {
        If_statementContext _localctx = new If_statementContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_if_statement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(194);
                match(IF);
                setState(195);
                expr_block();
                setState(198);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 15, _ctx)) {
                    case 1: {
                        setState(196);
                        match(ELSE);
                        setState(197);
                        stat_block();
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Expr_blockContext extends ParserRuleContext {
        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public Stat_blockContext stat_block() {
            return getRuleContext(Stat_blockContext.class, 0);
        }

        public Expr_blockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterExpr_block(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitExpr_block(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitExpr_block(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Expr_blockContext expr_block() throws RecognitionException {
        Expr_blockContext _localctx = new Expr_blockContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_expr_block);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(200);
                expr(0);
                setState(201);
                stat_block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Stat_blockContext extends ParserRuleContext {
        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public StatementContext statement() {
            return getRuleContext(StatementContext.class, 0);
        }

        public Ending_lineContext ending_line() {
            return getRuleContext(Ending_lineContext.class, 0);
        }

        public Stat_blockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_stat_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterStat_block(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitStat_block(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitStat_block(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Stat_blockContext stat_block() throws RecognitionException {
        Stat_blockContext _localctx = new Stat_blockContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_stat_block);
        try {
            setState(206);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 16, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(203);
                    block();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(204);
                    statement();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(205);
                    ending_line();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class BlockContext extends ParserRuleContext {
        public TerminalNode LBRACE() {
            return getToken(MainFunctionParser.LBRACE, 0);
        }

        public TerminalNode RBRACE() {
            return getToken(MainFunctionParser.RBRACE, 0);
        }

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        public Ending_lineContext ending_line() {
            return getRuleContext(Ending_lineContext.class, 0);
        }

        public BlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterBlock(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener) ((MainFunctionParserListener) listener).exitBlock(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitBlock(this);
            else return visitor.visitChildren(this);
        }
    }

    public final BlockContext block() throws RecognitionException {
        BlockContext _localctx = new BlockContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_block);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(208);
                match(LBRACE);
                setState(212);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSERT) | (1L << BOOL) | (1L << CLASS) | (1L << DO) | (1L << FOR) | (1L << GEN) | (1L << IF) | (1L << LOG) | (1L << FUNCTION) | (1L << NULL) | (1L << THIS) | (1L << VAR) | (1L << WHILE) | (1L << NOT) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACKET) | (1L << OPEN_STRING) | (1L << OPEN_COMMAND))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NUM - 64)) | (1L << (IDEN - 64)) | (1L << (NEWLINE_COMMAND - 64)))) != 0)) {
                    {
                        {
                            setState(209);
                            statement();
                        }
                    }
                    setState(214);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(216);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << CONTINUE) | (1L << RETURN))) != 0)) {
                    {
                        setState(215);
                        ending_line();
                    }
                }

                setState(218);
                match(RBRACE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class For_loopContext extends ParserRuleContext {
        public TerminalNode FOR() {
            return getToken(MainFunctionParser.FOR, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(MainFunctionParser.LPAREN, 0);
        }

        public List<TerminalNode> SEMI() {
            return getTokens(MainFunctionParser.SEMI);
        }

        public TerminalNode SEMI(int i) {
            return getToken(MainFunctionParser.SEMI, i);
        }

        public TerminalNode RPAREN() {
            return getToken(MainFunctionParser.RPAREN, 0);
        }

        public Stat_blockContext stat_block() {
            return getRuleContext(Stat_blockContext.class, 0);
        }

        public List<LineContext> line() {
            return getRuleContexts(LineContext.class);
        }

        public LineContext line(int i) {
            return getRuleContext(LineContext.class, i);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public For_loopContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_for_loop;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterFor_loop(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitFor_loop(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitFor_loop(this);
            else return visitor.visitChildren(this);
        }
    }

    public final For_loopContext for_loop() throws RecognitionException {
        For_loopContext _localctx = new For_loopContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_for_loop);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(220);
                match(FOR);
                setState(221);
                match(LPAREN);
                setState(223);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSERT) | (1L << BOOL) | (1L << LOG) | (1L << NULL) | (1L << THIS) | (1L << VAR) | (1L << NOT) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACKET) | (1L << OPEN_STRING))) != 0) || _la == NUM || _la == IDEN) {
                    {
                        setState(222);
                        line();
                    }
                }

                setState(225);
                match(SEMI);
                setState(227);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOL - 3)) | (1L << (NULL - 3)) | (1L << (THIS - 3)) | (1L << (NOT - 3)) | (1L << (MINUS - 3)) | (1L << (LPAREN - 3)) | (1L << (LBRACE - 3)) | (1L << (LBRACKET - 3)) | (1L << (OPEN_STRING - 3)) | (1L << (NUM - 3)) | (1L << (IDEN - 3)))) != 0)) {
                    {
                        setState(226);
                        expr(0);
                    }
                }

                setState(229);
                match(SEMI);
                setState(231);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSERT) | (1L << BOOL) | (1L << LOG) | (1L << NULL) | (1L << THIS) | (1L << VAR) | (1L << NOT) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACKET) | (1L << OPEN_STRING))) != 0) || _la == NUM || _la == IDEN) {
                    {
                        setState(230);
                        line();
                    }
                }

                setState(233);
                match(RPAREN);
                setState(234);
                stat_block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Foreach_loopContext extends ParserRuleContext {
        public TerminalNode FOR() {
            return getToken(MainFunctionParser.FOR, 0);
        }

        public List<TerminalNode> IDEN() {
            return getTokens(MainFunctionParser.IDEN);
        }

        public TerminalNode IDEN(int i) {
            return getToken(MainFunctionParser.IDEN, i);
        }

        public TerminalNode IN() {
            return getToken(MainFunctionParser.IN, 0);
        }

        public Expr_blockContext expr_block() {
            return getRuleContext(Expr_blockContext.class, 0);
        }

        public TerminalNode COMMA() {
            return getToken(MainFunctionParser.COMMA, 0);
        }

        public Foreach_loopContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_foreach_loop;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterForeach_loop(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitForeach_loop(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitForeach_loop(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Foreach_loopContext foreach_loop() throws RecognitionException {
        Foreach_loopContext _localctx = new Foreach_loopContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_foreach_loop);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(236);
                match(FOR);
                setState(237);
                match(IDEN);
                setState(240);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == COMMA) {
                    {
                        setState(238);
                        match(COMMA);
                        setState(239);
                        match(IDEN);
                    }
                }

                setState(242);
                match(IN);
                setState(243);
                expr_block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class While_loopContext extends ParserRuleContext {
        public TerminalNode WHILE() {
            return getToken(MainFunctionParser.WHILE, 0);
        }

        public Expr_blockContext expr_block() {
            return getRuleContext(Expr_blockContext.class, 0);
        }

        public While_loopContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_while_loop;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterWhile_loop(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitWhile_loop(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitWhile_loop(this);
            else return visitor.visitChildren(this);
        }
    }

    public final While_loopContext while_loop() throws RecognitionException {
        While_loopContext _localctx = new While_loopContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_while_loop);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(245);
                match(WHILE);
                setState(246);
                expr_block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Do_while_loopContext extends ParserRuleContext {
        public TerminalNode DO() {
            return getToken(MainFunctionParser.DO, 0);
        }

        public Stat_blockContext stat_block() {
            return getRuleContext(Stat_blockContext.class, 0);
        }

        public TerminalNode WHILE() {
            return getToken(MainFunctionParser.WHILE, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode SEMI() {
            return getToken(MainFunctionParser.SEMI, 0);
        }

        public Do_while_loopContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_do_while_loop;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterDo_while_loop(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitDo_while_loop(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitDo_while_loop(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Do_while_loopContext do_while_loop() throws RecognitionException {
        Do_while_loopContext _localctx = new Do_while_loopContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_do_while_loop);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(248);
                match(DO);
                setState(249);
                stat_block();
                setState(250);
                match(WHILE);
                setState(251);
                expr(0);
                setState(252);
                match(SEMI);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Log_lineContext extends ParserRuleContext {
        public TerminalNode LOG() {
            return getToken(MainFunctionParser.LOG, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public Log_lineContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_log_line;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterLog_line(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitLog_line(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitLog_line(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Log_lineContext log_line() throws RecognitionException {
        Log_lineContext _localctx = new Log_lineContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_log_line);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(254);
                match(LOG);
                setState(255);
                expr(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Function_call_lineContext extends ParserRuleContext {
        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode LPAREN() {
            return getToken(MainFunctionParser.LPAREN, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(MainFunctionParser.RPAREN, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(MainFunctionParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(MainFunctionParser.COMMA, i);
        }

        public Function_call_lineContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_function_call_line;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterFunction_call_line(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitFunction_call_line(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitFunction_call_line(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Function_call_lineContext function_call_line() throws RecognitionException {
        Function_call_lineContext _localctx = new Function_call_lineContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_function_call_line);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(257);
                expr(0);
                setState(258);
                match(LPAREN);
                setState(267);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOL - 3)) | (1L << (NULL - 3)) | (1L << (THIS - 3)) | (1L << (NOT - 3)) | (1L << (MINUS - 3)) | (1L << (LPAREN - 3)) | (1L << (LBRACE - 3)) | (1L << (LBRACKET - 3)) | (1L << (OPEN_STRING - 3)) | (1L << (NUM - 3)) | (1L << (IDEN - 3)))) != 0)) {
                    {
                        setState(259);
                        expr(0);
                        setState(264);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA) {
                            {
                                {
                                    setState(260);
                                    match(COMMA);
                                    setState(261);
                                    expr(0);
                                }
                            }
                            setState(266);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

                setState(269);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Function_lineContext extends ParserRuleContext {
        public TerminalNode FUNCTION() {
            return getToken(MainFunctionParser.FUNCTION, 0);
        }

        public List<TerminalNode> IDEN() {
            return getTokens(MainFunctionParser.IDEN);
        }

        public TerminalNode IDEN(int i) {
            return getToken(MainFunctionParser.IDEN, i);
        }

        public TerminalNode LPAREN() {
            return getToken(MainFunctionParser.LPAREN, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(MainFunctionParser.RPAREN, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(MainFunctionParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(MainFunctionParser.COMMA, i);
        }

        public Function_lineContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_function_line;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterFunction_line(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitFunction_line(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitFunction_line(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Function_lineContext function_line() throws RecognitionException {
        Function_lineContext _localctx = new Function_lineContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_function_line);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(271);
                match(FUNCTION);
                setState(272);
                match(IDEN);
                setState(273);
                match(LPAREN);
                setState(282);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == IDEN) {
                    {
                        setState(274);
                        match(IDEN);
                        setState(279);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA) {
                            {
                                {
                                    setState(275);
                                    match(COMMA);
                                    setState(276);
                                    match(IDEN);
                                }
                            }
                            setState(281);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

                setState(284);
                match(RPAREN);
                setState(285);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class CommandContext extends ParserRuleContext {
        public TerminalNode OPEN_COMMAND() {
            return getToken(MainFunctionParser.OPEN_COMMAND, 0);
        }

        public TerminalNode NEWLINE_COMMAND() {
            return getToken(MainFunctionParser.NEWLINE_COMMAND, 0);
        }

        public List<Command_partContext> command_part() {
            return getRuleContexts(Command_partContext.class);
        }

        public Command_partContext command_part(int i) {
            return getRuleContext(Command_partContext.class, i);
        }

        public TerminalNode OPEN_FUNCTION() {
            return getToken(MainFunctionParser.OPEN_FUNCTION, 0);
        }

        public Stat_blockContext stat_block() {
            return getRuleContext(Stat_blockContext.class, 0);
        }

        public TerminalNode EXIT_COMMAND() {
            return getToken(MainFunctionParser.EXIT_COMMAND, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public CommandContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_command;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterCommand(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitCommand(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitCommand(this);
            else return visitor.visitChildren(this);
        }
    }

    public final CommandContext command() throws RecognitionException {
        CommandContext _localctx = new CommandContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_command);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(287);
                _la = _input.LA(1);
                if (!(_la == OPEN_COMMAND || _la == NEWLINE_COMMAND)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
                setState(291);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (ENTER_EXPR_INTERP_COMMAND - 74)) | (1L << (ID_INTERP_COMMAND - 74)) | (1L << (TEXT_COMMAND - 74)) | (1L << (CONTINUE_COMMAND - 74)))) != 0)) {
                    {
                        {
                            setState(288);
                            command_part();
                        }
                    }
                    setState(293);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(300);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case OPEN_FUNCTION: {
                        setState(294);
                        match(OPEN_FUNCTION);
                        setState(296);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 28, _ctx)) {
                            case 1: {
                                setState(295);
                                expr(0);
                            }
                            break;
                        }
                        setState(298);
                        stat_block();
                    }
                    break;
                    case EXIT_COMMAND: {
                        setState(299);
                        match(EXIT_COMMAND);
                    }
                    break;
                    case EOF:
                    case ASSERT:
                    case BREAK:
                    case BOOL:
                    case CLASS:
                    case CONTINUE:
                    case DO:
                    case ELSE:
                    case FOR:
                    case GEN:
                    case IF:
                    case LOG:
                    case FUNCTION:
                    case NULL:
                    case RETURN:
                    case THIS:
                    case VAR:
                    case WHILE:
                    case NOT:
                    case MINUS:
                    case LPAREN:
                    case LBRACE:
                    case RBRACE:
                    case LBRACKET:
                    case OPEN_STRING:
                    case OPEN_COMMAND:
                    case NUM:
                    case IDEN:
                    case NEWLINE_COMMAND:
                        break;
                    default:
                        break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Command_partContext extends ParserRuleContext {
        public Command_partContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_command_part;
        }

        public Command_partContext() {
        }

        public void copyFrom(Command_partContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class CommmandGoOnPartContext extends Command_partContext {
        public TerminalNode CONTINUE_COMMAND() {
            return getToken(MainFunctionParser.CONTINUE_COMMAND, 0);
        }

        public CommmandGoOnPartContext(Command_partContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterCommmandGoOnPart(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitCommmandGoOnPart(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitCommmandGoOnPart(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class CommandTextContext extends Command_partContext {
        public TerminalNode TEXT_COMMAND() {
            return getToken(MainFunctionParser.TEXT_COMMAND, 0);
        }

        public CommandTextContext(Command_partContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterCommandText(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitCommandText(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitCommandText(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class CommandExprInterpPartContext extends Command_partContext {
        public TerminalNode ENTER_EXPR_INTERP_COMMAND() {
            return getToken(MainFunctionParser.ENTER_EXPR_INTERP_COMMAND, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode RBRACE() {
            return getToken(MainFunctionParser.RBRACE, 0);
        }

        public CommandExprInterpPartContext(Command_partContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterCommandExprInterpPart(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitCommandExprInterpPart(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitCommandExprInterpPart(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class CommandIdInterpPartContext extends Command_partContext {
        public TerminalNode ID_INTERP_COMMAND() {
            return getToken(MainFunctionParser.ID_INTERP_COMMAND, 0);
        }

        public CommandIdInterpPartContext(Command_partContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterCommandIdInterpPart(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitCommandIdInterpPart(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitCommandIdInterpPart(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Command_partContext command_part() throws RecognitionException {
        Command_partContext _localctx = new Command_partContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_command_part);
        try {
            setState(309);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case TEXT_COMMAND:
                    _localctx = new CommandTextContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(302);
                    match(TEXT_COMMAND);
                }
                break;
                case ID_INTERP_COMMAND:
                    _localctx = new CommandIdInterpPartContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(303);
                    match(ID_INTERP_COMMAND);
                }
                break;
                case ENTER_EXPR_INTERP_COMMAND:
                    _localctx = new CommandExprInterpPartContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(304);
                    match(ENTER_EXPR_INTERP_COMMAND);
                    setState(305);
                    expr(0);
                    setState(306);
                    match(RBRACE);
                }
                break;
                case CONTINUE_COMMAND:
                    _localctx = new CommmandGoOnPartContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(308);
                    match(CONTINUE_COMMAND);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ExprContext extends ParserRuleContext {
        public ExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr;
        }

        public ExprContext() {
        }

        public void copyFrom(ExprContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class NegationExprContext extends ExprContext {
        public TerminalNode MINUS() {
            return getToken(MainFunctionParser.MINUS, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public NegationExprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterNegationExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitNegationExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitNegationExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class GetFromObjectExprContext extends ExprContext {
        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode DOT() {
            return getToken(MainFunctionParser.DOT, 0);
        }

        public TerminalNode IDEN() {
            return getToken(MainFunctionParser.IDEN, 0);
        }

        public TerminalNode QUESTION() {
            return getToken(MainFunctionParser.QUESTION, 0);
        }

        public GetFromObjectExprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterGetFromObjectExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitGetFromObjectExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitGetFromObjectExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class AtomExprContext extends ExprContext {
        public AtomContext atom() {
            return getRuleContext(AtomContext.class, 0);
        }

        public AtomExprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterAtomExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitAtomExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitAtomExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class OrExprContext extends ExprContext {
        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode OR() {
            return getToken(MainFunctionParser.OR, 0);
        }

        public OrExprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterOrExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitOrExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitOrExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class AdditiveExprContext extends ExprContext {
        public Token op;

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode PLUS() {
            return getToken(MainFunctionParser.PLUS, 0);
        }

        public TerminalNode MINUS() {
            return getToken(MainFunctionParser.MINUS, 0);
        }

        public AdditiveExprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterAdditiveExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitAdditiveExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitAdditiveExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class RelationalExprContext extends ExprContext {
        public Token op;

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode LT() {
            return getToken(MainFunctionParser.LT, 0);
        }

        public TerminalNode LE() {
            return getToken(MainFunctionParser.LE, 0);
        }

        public TerminalNode GT() {
            return getToken(MainFunctionParser.GT, 0);
        }

        public TerminalNode GE() {
            return getToken(MainFunctionParser.GE, 0);
        }

        public RelationalExprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterRelationalExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitRelationalExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitRelationalExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SubExprContext extends ExprContext {
        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode LBRACKET() {
            return getToken(MainFunctionParser.LBRACKET, 0);
        }

        public Range_exprContext range_expr() {
            return getRuleContext(Range_exprContext.class, 0);
        }

        public TerminalNode RBRACKET() {
            return getToken(MainFunctionParser.RBRACKET, 0);
        }

        public SubExprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterSubExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitSubExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitSubExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ElvisExprContext extends ExprContext {
        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode ELVIS() {
            return getToken(MainFunctionParser.ELVIS, 0);
        }

        public ElvisExprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterElvisExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitElvisExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitElvisExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ParExprContext extends ExprContext {
        public TerminalNode LPAREN() {
            return getToken(MainFunctionParser.LPAREN, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(MainFunctionParser.RPAREN, 0);
        }

        public ParExprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterParExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitParExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitParExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class NotExprContext extends ExprContext {
        public TerminalNode NOT() {
            return getToken(MainFunctionParser.NOT, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public NotExprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterNotExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitNotExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitNotExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class TernaryExprContext extends ExprContext {
        public ExprContext left;
        public ExprContext condition;
        public ExprContext right;

        public TerminalNode IF() {
            return getToken(MainFunctionParser.IF, 0);
        }

        public TerminalNode ELSE() {
            return getToken(MainFunctionParser.ELSE, 0);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TernaryExprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterTernaryExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitTernaryExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitTernaryExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class RunFunctionExprContext extends ExprContext {
        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode LPAREN() {
            return getToken(MainFunctionParser.LPAREN, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(MainFunctionParser.RPAREN, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(MainFunctionParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(MainFunctionParser.COMMA, i);
        }

        public RunFunctionExprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterRunFunctionExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitRunFunctionExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitRunFunctionExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class MultiplicationExprContext extends ExprContext {
        public Token op;

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode MULT() {
            return getToken(MainFunctionParser.MULT, 0);
        }

        public TerminalNode DIV() {
            return getToken(MainFunctionParser.DIV, 0);
        }

        public TerminalNode MOD() {
            return getToken(MainFunctionParser.MOD, 0);
        }

        public MultiplicationExprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterMultiplicationExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitMultiplicationExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitMultiplicationExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class PowExprContext extends ExprContext {
        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode POW() {
            return getToken(MainFunctionParser.POW, 0);
        }

        public PowExprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterPowExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitPowExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitPowExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IsExprContext extends ExprContext {
        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode IS() {
            return getToken(MainFunctionParser.IS, 0);
        }

        public IsExprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterIsExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitIsExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitIsExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class GetItemExprContext extends ExprContext {
        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode LBRACKET() {
            return getToken(MainFunctionParser.LBRACKET, 0);
        }

        public TerminalNode RBRACKET() {
            return getToken(MainFunctionParser.RBRACKET, 0);
        }

        public GetItemExprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterGetItemExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitGetItemExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitGetItemExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class EqualityExprContext extends ExprContext {
        public Token op;

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode EQ() {
            return getToken(MainFunctionParser.EQ, 0);
        }

        public TerminalNode NE() {
            return getToken(MainFunctionParser.NE, 0);
        }

        public EqualityExprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterEqualityExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitEqualityExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitEqualityExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class AndExprContext extends ExprContext {
        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode AND() {
            return getToken(MainFunctionParser.AND, 0);
        }

        public AndExprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterAndExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitAndExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitAndExpr(this);
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
        int _startState = 46;
        enterRecursionRule(_localctx, 46, RULE_expr, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(321);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 31, _ctx)) {
                    case 1: {
                        _localctx = new ParExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(312);
                        match(LPAREN);
                        setState(313);
                        expr(0);
                        setState(314);
                        match(RPAREN);
                    }
                    break;
                    case 2: {
                        _localctx = new NegationExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(316);
                        match(MINUS);
                        setState(317);
                        expr(13);
                    }
                    break;
                    case 3: {
                        _localctx = new NotExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(318);
                        match(NOT);
                        setState(319);
                        expr(12);
                    }
                    break;
                    case 4: {
                        _localctx = new AtomExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(320);
                        atom();
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(387);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 36, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(385);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 35, _ctx)) {
                                case 1: {
                                    _localctx = new ElvisExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(323);
                                    if (!(precpred(_ctx, 11)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 11)");
                                    setState(324);
                                    match(ELVIS);
                                    setState(325);
                                    expr(12);
                                }
                                break;
                                case 2: {
                                    _localctx = new PowExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(326);
                                    if (!(precpred(_ctx, 10)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 10)");
                                    setState(327);
                                    match(POW);
                                    setState(328);
                                    expr(10);
                                }
                                break;
                                case 3: {
                                    _localctx = new MultiplicationExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(329);
                                    if (!(precpred(_ctx, 9)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                                    setState(330);
                                    ((MultiplicationExprContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0))) {
                                        ((MultiplicationExprContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(331);
                                    expr(10);
                                }
                                break;
                                case 4: {
                                    _localctx = new AdditiveExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(332);
                                    if (!(precpred(_ctx, 8)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                                    setState(333);
                                    ((AdditiveExprContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == PLUS || _la == MINUS)) {
                                        ((AdditiveExprContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(334);
                                    expr(9);
                                }
                                break;
                                case 5: {
                                    _localctx = new RelationalExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(335);
                                    if (!(precpred(_ctx, 7)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                                    setState(336);
                                    ((RelationalExprContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GE) | (1L << LT) | (1L << LE))) != 0))) {
                                        ((RelationalExprContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(337);
                                    expr(8);
                                }
                                break;
                                case 6: {
                                    _localctx = new EqualityExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(338);
                                    if (!(precpred(_ctx, 6)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                                    setState(339);
                                    ((EqualityExprContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == EQ || _la == NE)) {
                                        ((EqualityExprContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(340);
                                    expr(7);
                                }
                                break;
                                case 7: {
                                    _localctx = new IsExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(341);
                                    if (!(precpred(_ctx, 5)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                                    setState(342);
                                    match(IS);
                                    setState(343);
                                    expr(6);
                                }
                                break;
                                case 8: {
                                    _localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(344);
                                    if (!(precpred(_ctx, 4)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                    setState(345);
                                    match(AND);
                                    setState(346);
                                    expr(5);
                                }
                                break;
                                case 9: {
                                    _localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(347);
                                    if (!(precpred(_ctx, 3)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                    setState(348);
                                    match(OR);
                                    setState(349);
                                    expr(4);
                                }
                                break;
                                case 10: {
                                    _localctx = new TernaryExprContext(new ExprContext(_parentctx, _parentState));
                                    ((TernaryExprContext) _localctx).left = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(350);
                                    if (!(precpred(_ctx, 2)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                    setState(351);
                                    match(IF);
                                    setState(352);
                                    ((TernaryExprContext) _localctx).condition = expr(0);
                                    setState(353);
                                    match(ELSE);
                                    setState(354);
                                    ((TernaryExprContext) _localctx).right = expr(2);
                                }
                                break;
                                case 11: {
                                    _localctx = new GetFromObjectExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(356);
                                    if (!(precpred(_ctx, 17)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 17)");
                                    setState(358);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    if (_la == QUESTION) {
                                        {
                                            setState(357);
                                            match(QUESTION);
                                        }
                                    }

                                    setState(360);
                                    match(DOT);
                                    setState(361);
                                    match(IDEN);
                                }
                                break;
                                case 12: {
                                    _localctx = new RunFunctionExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(362);
                                    if (!(precpred(_ctx, 16)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 16)");
                                    setState(363);
                                    match(LPAREN);
                                    setState(372);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOL - 3)) | (1L << (NULL - 3)) | (1L << (THIS - 3)) | (1L << (NOT - 3)) | (1L << (MINUS - 3)) | (1L << (LPAREN - 3)) | (1L << (LBRACE - 3)) | (1L << (LBRACKET - 3)) | (1L << (OPEN_STRING - 3)) | (1L << (NUM - 3)) | (1L << (IDEN - 3)))) != 0)) {
                                        {
                                            setState(364);
                                            expr(0);
                                            setState(369);
                                            _errHandler.sync(this);
                                            _la = _input.LA(1);
                                            while (_la == COMMA) {
                                                {
                                                    {
                                                        setState(365);
                                                        match(COMMA);
                                                        setState(366);
                                                        expr(0);
                                                    }
                                                }
                                                setState(371);
                                                _errHandler.sync(this);
                                                _la = _input.LA(1);
                                            }
                                        }
                                    }

                                    setState(374);
                                    match(RPAREN);
                                }
                                break;
                                case 13: {
                                    _localctx = new GetItemExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(375);
                                    if (!(precpred(_ctx, 15)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 15)");
                                    setState(376);
                                    match(LBRACKET);
                                    setState(377);
                                    expr(0);
                                    setState(378);
                                    match(RBRACKET);
                                }
                                break;
                                case 14: {
                                    _localctx = new SubExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(380);
                                    if (!(precpred(_ctx, 14)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 14)");
                                    setState(381);
                                    match(LBRACKET);
                                    setState(382);
                                    range_expr();
                                    setState(383);
                                    match(RBRACKET);
                                }
                                break;
                            }
                        }
                    }
                    setState(389);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 36, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class AtomContext extends ParserRuleContext {
        public AtomContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_atom;
        }

        public AtomContext() {
        }

        public void copyFrom(AtomContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class BooleanAtomContext extends AtomContext {
        public TerminalNode BOOL() {
            return getToken(MainFunctionParser.BOOL, 0);
        }

        public BooleanAtomContext(AtomContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterBooleanAtom(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitBooleanAtom(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitBooleanAtom(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ListAtomContext extends AtomContext {
        public TerminalNode LBRACKET() {
            return getToken(MainFunctionParser.LBRACKET, 0);
        }

        public TerminalNode RBRACKET() {
            return getToken(MainFunctionParser.RBRACKET, 0);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(MainFunctionParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(MainFunctionParser.COMMA, i);
        }

        public ListAtomContext(AtomContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterListAtom(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitListAtom(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitListAtom(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class NumAtomContext extends AtomContext {
        public TerminalNode NUM() {
            return getToken(MainFunctionParser.NUM, 0);
        }

        public NumAtomContext(AtomContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterNumAtom(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitNumAtom(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitNumAtom(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IdentifierAtomContext extends AtomContext {
        public TerminalNode IDEN() {
            return getToken(MainFunctionParser.IDEN, 0);
        }

        public IdentifierAtomContext(AtomContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterIdentifierAtom(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitIdentifierAtom(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitIdentifierAtom(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class StringAtomContext extends AtomContext {
        public TerminalNode OPEN_STRING() {
            return getToken(MainFunctionParser.OPEN_STRING, 0);
        }

        public TerminalNode CLOSE_STRING() {
            return getToken(MainFunctionParser.CLOSE_STRING, 0);
        }

        public List<String_partContext> string_part() {
            return getRuleContexts(String_partContext.class);
        }

        public String_partContext string_part(int i) {
            return getRuleContext(String_partContext.class, i);
        }

        public StringAtomContext(AtomContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterStringAtom(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitStringAtom(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitStringAtom(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class NullAtomContext extends AtomContext {
        public TerminalNode NULL() {
            return getToken(MainFunctionParser.NULL, 0);
        }

        public NullAtomContext(AtomContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterNullAtom(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitNullAtom(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitNullAtom(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ThisAtomContext extends AtomContext {
        public TerminalNode THIS() {
            return getToken(MainFunctionParser.THIS, 0);
        }

        public ThisAtomContext(AtomContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterThisAtom(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitThisAtom(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitThisAtom(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ObjectAtomContext extends AtomContext {
        public TerminalNode LBRACE() {
            return getToken(MainFunctionParser.LBRACE, 0);
        }

        public TerminalNode RBRACE() {
            return getToken(MainFunctionParser.RBRACE, 0);
        }

        public List<TerminalNode> IDEN() {
            return getTokens(MainFunctionParser.IDEN);
        }

        public TerminalNode IDEN(int i) {
            return getToken(MainFunctionParser.IDEN, i);
        }

        public List<TerminalNode> COLON() {
            return getTokens(MainFunctionParser.COLON);
        }

        public TerminalNode COLON(int i) {
            return getToken(MainFunctionParser.COLON, i);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(MainFunctionParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(MainFunctionParser.COMMA, i);
        }

        public ObjectAtomContext(AtomContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterObjectAtom(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitObjectAtom(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitObjectAtom(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class LambdaAtomContext extends AtomContext {
        public TerminalNode ARROW() {
            return getToken(MainFunctionParser.ARROW, 0);
        }

        public List<TerminalNode> IDEN() {
            return getTokens(MainFunctionParser.IDEN);
        }

        public TerminalNode IDEN(int i) {
            return getToken(MainFunctionParser.IDEN, i);
        }

        public TerminalNode LPAREN() {
            return getToken(MainFunctionParser.LPAREN, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(MainFunctionParser.RPAREN, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(MainFunctionParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(MainFunctionParser.COMMA, i);
        }

        public LambdaAtomContext(AtomContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterLambdaAtom(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitLambdaAtom(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitLambdaAtom(this);
            else return visitor.visitChildren(this);
        }
    }

    public final AtomContext atom() throws RecognitionException {
        AtomContext _localctx = new AtomContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_atom);
        int _la;
        try {
            setState(452);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 46, _ctx)) {
                case 1:
                    _localctx = new NumAtomContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(390);
                    match(NUM);
                }
                break;
                case 2:
                    _localctx = new NullAtomContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(391);
                    match(NULL);
                }
                break;
                case 3:
                    _localctx = new ThisAtomContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(392);
                    match(THIS);
                }
                break;
                case 4:
                    _localctx = new BooleanAtomContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(393);
                    match(BOOL);
                }
                break;
                case 5:
                    _localctx = new IdentifierAtomContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(394);
                    match(IDEN);
                }
                break;
                case 6:
                    _localctx = new StringAtomContext(_localctx);
                    enterOuterAlt(_localctx, 6);
                {
                    setState(395);
                    match(OPEN_STRING);
                    setState(399);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (ENTER_EXPR_INTERP - 69)) | (1L << (ID_INTERP - 69)) | (1L << (ESCAPE - 69)) | (1L << (TEXT - 69)))) != 0)) {
                        {
                            {
                                setState(396);
                                string_part();
                            }
                        }
                        setState(401);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(402);
                    match(CLOSE_STRING);
                }
                break;
                case 7:
                    _localctx = new ListAtomContext(_localctx);
                    enterOuterAlt(_localctx, 7);
                {
                    setState(403);
                    match(LBRACKET);
                    setState(412);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOL - 3)) | (1L << (NULL - 3)) | (1L << (THIS - 3)) | (1L << (NOT - 3)) | (1L << (MINUS - 3)) | (1L << (LPAREN - 3)) | (1L << (LBRACE - 3)) | (1L << (LBRACKET - 3)) | (1L << (OPEN_STRING - 3)) | (1L << (NUM - 3)) | (1L << (IDEN - 3)))) != 0)) {
                        {
                            setState(404);
                            expr(0);
                            setState(409);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            while (_la == COMMA) {
                                {
                                    {
                                        setState(405);
                                        match(COMMA);
                                        setState(406);
                                        expr(0);
                                    }
                                }
                                setState(411);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                            }
                        }
                    }

                    setState(414);
                    match(RBRACKET);
                }
                break;
                case 8:
                    _localctx = new ObjectAtomContext(_localctx);
                    enterOuterAlt(_localctx, 8);
                {
                    setState(415);
                    match(LBRACE);
                    setState(429);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == IDEN) {
                        {
                            {
                                setState(416);
                                match(IDEN);
                                setState(417);
                                match(COLON);
                                setState(418);
                                expr(0);
                            }
                            setState(426);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            while (_la == COMMA) {
                                {
                                    {
                                        setState(420);
                                        match(COMMA);
                                        setState(421);
                                        match(IDEN);
                                        setState(422);
                                        match(COLON);
                                        setState(423);
                                        expr(0);
                                    }
                                }
                                setState(428);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                            }
                        }
                    }

                    setState(431);
                    match(RBRACE);
                }
                break;
                case 9:
                    _localctx = new LambdaAtomContext(_localctx);
                    enterOuterAlt(_localctx, 9);
                {
                    setState(445);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case IDEN: {
                            setState(432);
                            match(IDEN);
                        }
                        break;
                        case LPAREN: {
                            setState(433);
                            match(LPAREN);
                            setState(442);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if (_la == IDEN) {
                                {
                                    setState(434);
                                    match(IDEN);
                                    setState(439);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    while (_la == COMMA) {
                                        {
                                            {
                                                setState(435);
                                                match(COMMA);
                                                setState(436);
                                                match(IDEN);
                                            }
                                        }
                                        setState(441);
                                        _errHandler.sync(this);
                                        _la = _input.LA(1);
                                    }
                                }
                            }

                            setState(444);
                            match(RPAREN);
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(447);
                    match(ARROW);
                    setState(450);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 45, _ctx)) {
                        case 1: {
                            setState(448);
                            expr(0);
                        }
                        break;
                        case 2: {
                            setState(449);
                            block();
                        }
                        break;
                    }
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class String_partContext extends ParserRuleContext {
        public String_partContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_string_part;
        }

        public String_partContext() {
        }

        public void copyFrom(String_partContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class TextStringPartContext extends String_partContext {
        public TerminalNode TEXT() {
            return getToken(MainFunctionParser.TEXT, 0);
        }

        public TextStringPartContext(String_partContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterTextStringPart(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitTextStringPart(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitTextStringPart(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ExprInterpPartContext extends String_partContext {
        public TerminalNode ENTER_EXPR_INTERP() {
            return getToken(MainFunctionParser.ENTER_EXPR_INTERP, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode RBRACE() {
            return getToken(MainFunctionParser.RBRACE, 0);
        }

        public ExprInterpPartContext(String_partContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterExprInterpPart(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitExprInterpPart(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitExprInterpPart(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class EscapeStringPartContext extends String_partContext {
        public TerminalNode ESCAPE() {
            return getToken(MainFunctionParser.ESCAPE, 0);
        }

        public EscapeStringPartContext(String_partContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterEscapeStringPart(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitEscapeStringPart(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitEscapeStringPart(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IdInterpPartContext extends String_partContext {
        public TerminalNode ID_INTERP() {
            return getToken(MainFunctionParser.ID_INTERP, 0);
        }

        public IdInterpPartContext(String_partContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterIdInterpPart(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitIdInterpPart(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitIdInterpPart(this);
            else return visitor.visitChildren(this);
        }
    }

    public final String_partContext string_part() throws RecognitionException {
        String_partContext _localctx = new String_partContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_string_part);
        try {
            setState(461);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case TEXT:
                    _localctx = new TextStringPartContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(454);
                    match(TEXT);
                }
                break;
                case ESCAPE:
                    _localctx = new EscapeStringPartContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(455);
                    match(ESCAPE);
                }
                break;
                case ID_INTERP:
                    _localctx = new IdInterpPartContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(456);
                    match(ID_INTERP);
                }
                break;
                case ENTER_EXPR_INTERP:
                    _localctx = new ExprInterpPartContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(457);
                    match(ENTER_EXPR_INTERP);
                    setState(458);
                    expr(0);
                    setState(459);
                    match(RBRACE);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Range_exprContext extends ParserRuleContext {
        public Range_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_range_expr;
        }

        public Range_exprContext() {
        }

        public void copyFrom(Range_exprContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class RangeExpressionNoIncContext extends Range_exprContext {
        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode COLON() {
            return getToken(MainFunctionParser.COLON, 0);
        }

        public RangeExpressionNoIncContext(Range_exprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterRangeExpressionNoInc(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitRangeExpressionNoInc(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitRangeExpressionNoInc(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class RangeExpressionIncContext extends Range_exprContext {
        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public List<TerminalNode> COLON() {
            return getTokens(MainFunctionParser.COLON);
        }

        public TerminalNode COLON(int i) {
            return getToken(MainFunctionParser.COLON, i);
        }

        public RangeExpressionIncContext(Range_exprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).enterRangeExpressionInc(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof MainFunctionParserListener)
                ((MainFunctionParserListener) listener).exitRangeExpressionInc(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof MainFunctionParserVisitor)
                return ((MainFunctionParserVisitor<? extends T>) visitor).visitRangeExpressionInc(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Range_exprContext range_expr() throws RecognitionException {
        Range_exprContext _localctx = new Range_exprContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_range_expr);
        try {
            setState(473);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 48, _ctx)) {
                case 1:
                    _localctx = new RangeExpressionNoIncContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(463);
                    expr(0);
                    setState(464);
                    match(COLON);
                    setState(465);
                    expr(0);
                }
                break;
                case 2:
                    _localctx = new RangeExpressionIncContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(467);
                    expr(0);
                    setState(468);
                    match(COLON);
                    setState(469);
                    expr(0);
                    setState(470);
                    match(COLON);
                    setState(471);
                    expr(0);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 23:
                return expr_sempred((ExprContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean expr_sempred(ExprContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 11);
            case 1:
                return precpred(_ctx, 10);
            case 2:
                return precpred(_ctx, 9);
            case 3:
                return precpred(_ctx, 8);
            case 4:
                return precpred(_ctx, 7);
            case 5:
                return precpred(_ctx, 6);
            case 6:
                return precpred(_ctx, 5);
            case 7:
                return precpred(_ctx, 4);
            case 8:
                return precpred(_ctx, 3);
            case 9:
                return precpred(_ctx, 2);
            case 10:
                return precpred(_ctx, 17);
            case 11:
                return precpred(_ctx, 16);
            case 12:
                return precpred(_ctx, 15);
            case 13:
                return precpred(_ctx, 14);
        }
        return true;
    }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3R\u01de\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\3\2\3\3" +
                    "\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3M\n\3\3\4\3\4\3\4\3\4" +
                    "\3\4\5\4T\n\4\3\5\3\5\3\5\3\6\3\6\5\6[\n\6\3\6\3\6\5\6_\n\6\3\6\3\6\3" +
                    "\7\3\7\3\7\3\7\7\7g\n\7\f\7\16\7j\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\5\t" +
                    "s\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t{\n\t\f\t\16\t~\13\t\5\t\u0080\n\t\3" +
                    "\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0089\n\t\f\t\16\t\u008c\13\t\5\t\u008e" +
                    "\n\t\3\t\3\t\3\t\5\t\u0093\n\t\3\t\3\t\3\t\5\t\u0098\n\t\3\n\3\n\3\n\3" +
                    "\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n" +
                    "\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b7\n\n\3\13\3\13\3\13\3\13\7\13" +
                    "\u00bd\n\13\f\13\16\13\u00c0\13\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f" +
                    "\u00c9\n\f\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u00d1\n\16\3\17\3\17\7\17\u00d5" +
                    "\n\17\f\17\16\17\u00d8\13\17\3\17\5\17\u00db\n\17\3\17\3\17\3\20\3\20" +
                    "\3\20\5\20\u00e2\n\20\3\20\3\20\5\20\u00e6\n\20\3\20\3\20\5\20\u00ea\n" +
                    "\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00f3\n\21\3\21\3\21\3\21" +
                    "\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25" +
                    "\3\25\3\25\3\25\7\25\u0109\n\25\f\25\16\25\u010c\13\25\5\25\u010e\n\25" +
                    "\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0118\n\26\f\26\16\26\u011b" +
                    "\13\26\5\26\u011d\n\26\3\26\3\26\3\26\3\27\3\27\7\27\u0124\n\27\f\27\16" +
                    "\27\u0127\13\27\3\27\3\27\5\27\u012b\n\27\3\27\3\27\5\27\u012f\n\27\3" +
                    "\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0138\n\30\3\31\3\31\3\31\3\31" +
                    "\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0144\n\31\3\31\3\31\3\31\3\31\3\31" +
                    "\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31" +
                    "\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31" +
                    "\3\31\3\31\5\31\u0169\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0172" +
                    "\n\31\f\31\16\31\u0175\13\31\5\31\u0177\n\31\3\31\3\31\3\31\3\31\3\31" +
                    "\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0184\n\31\f\31\16\31\u0187\13\31" +
                    "\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0190\n\32\f\32\16\32\u0193\13" +
                    "\32\3\32\3\32\3\32\3\32\3\32\7\32\u019a\n\32\f\32\16\32\u019d\13\32\5" +
                    "\32\u019f\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32" +
                    "\u01ab\n\32\f\32\16\32\u01ae\13\32\5\32\u01b0\n\32\3\32\3\32\3\32\3\32" +
                    "\3\32\3\32\7\32\u01b8\n\32\f\32\16\32\u01bb\13\32\5\32\u01bd\n\32\3\32" +
                    "\5\32\u01c0\n\32\3\32\3\32\3\32\5\32\u01c5\n\32\5\32\u01c7\n\32\3\33\3" +
                    "\33\3\33\3\33\3\33\3\33\3\33\5\33\u01d0\n\33\3\34\3\34\3\34\3\34\3\34" +
                    "\3\34\3\34\3\34\3\34\3\34\5\34\u01dc\n\34\3\34\2\3\60\35\2\4\6\b\n\f\16" +
                    "\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\t\4\2%(\67\67\3\2)*\4" +
                    "\2AAPP\3\2,.\3\2/\60\3\2\36!\3\2\"#\2\u021f\2;\3\2\2\2\4L\3\2\2\2\6S\3" +
                    "\2\2\2\bU\3\2\2\2\n^\3\2\2\2\fb\3\2\2\2\16m\3\2\2\2\20\u0097\3\2\2\2\22" +
                    "\u00b6\3\2\2\2\24\u00b8\3\2\2\2\26\u00c4\3\2\2\2\30\u00ca\3\2\2\2\32\u00d0" +
                    "\3\2\2\2\34\u00d2\3\2\2\2\36\u00de\3\2\2\2 \u00ee\3\2\2\2\"\u00f7\3\2" +
                    "\2\2$\u00fa\3\2\2\2&\u0100\3\2\2\2(\u0103\3\2\2\2*\u0111\3\2\2\2,\u0121" +
                    "\3\2\2\2.\u0137\3\2\2\2\60\u0143\3\2\2\2\62\u01c6\3\2\2\2\64\u01cf\3\2" +
                    "\2\2\66\u01db\3\2\2\28:\5\4\3\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2" +
                    "\2<>\3\2\2\2=;\3\2\2\2>?\7\2\2\3?\3\3\2\2\2@A\5\6\4\2AB\7<\2\2BM\3\2\2" +
                    "\2CM\5,\27\2DM\5\26\f\2EM\5\36\20\2FM\5 \21\2GM\5\"\22\2HM\5$\23\2IM\5" +
                    "\f\7\2JM\5*\26\2KM\5\16\b\2L@\3\2\2\2LC\3\2\2\2LD\3\2\2\2LE\3\2\2\2LF" +
                    "\3\2\2\2LG\3\2\2\2LH\3\2\2\2LI\3\2\2\2LJ\3\2\2\2LK\3\2\2\2M\5\3\2\2\2" +
                    "NT\5\24\13\2OT\5\22\n\2PT\5&\24\2QT\5\b\5\2RT\5(\25\2SN\3\2\2\2SO\3\2" +
                    "\2\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2T\7\3\2\2\2UV\7\3\2\2VW\5\60\31\2W\t" +
                    "\3\2\2\2XZ\7\26\2\2Y[\5\60\31\2ZY\3\2\2\2Z[\3\2\2\2[_\3\2\2\2\\_\7\4\2" +
                    "\2]_\7\t\2\2^X\3\2\2\2^\\\3\2\2\2^]\3\2\2\2_`\3\2\2\2`a\7<\2\2a\13\3\2" +
                    "\2\2bc\7\7\2\2cd\7C\2\2dh\7\63\2\2eg\5\20\t\2fe\3\2\2\2gj\3\2\2\2hf\3" +
                    "\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7\64\2\2l\r\3\2\2\2mn\7\r\2\2n" +
                    "o\7\23\2\2op\5\30\r\2p\17\3\2\2\2qs\7\22\2\2rq\3\2\2\2rs\3\2\2\2st\3\2" +
                    "\2\2tu\7\23\2\2uv\7C\2\2v\177\7\61\2\2w|\7C\2\2xy\7>\2\2y{\7C\2\2zx\3" +
                    "\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2\177w\3\2" +
                    "\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\7\62\2\2\u0082" +
                    "\u0098\5\34\17\2\u0083\u0084\7\b\2\2\u0084\u008d\7\61\2\2\u0085\u008a" +
                    "\7C\2\2\u0086\u0087\7>\2\2\u0087\u0089\7C\2\2\u0088\u0086\3\2\2\2\u0089" +
                    "\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008e\3\2" +
                    "\2\2\u008c\u008a\3\2\2\2\u008d\u0085\3\2\2\2\u008d\u008e\3\2\2\2\u008e" +
                    "\u008f\3\2\2\2\u008f\u0090\7\62\2\2\u0090\u0098\5\34\17\2\u0091\u0093" +
                    "\7\22\2\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2" +
                    "\u0094\u0095\5\24\13\2\u0095\u0096\7<\2\2\u0096\u0098\3\2\2\2\u0097r\3" +
                    "\2\2\2\u0097\u0083\3\2\2\2\u0097\u0092\3\2\2\2\u0098\21\3\2\2\2\u0099" +
                    "\u009a\7C\2\2\u009a\u009b\t\2\2\2\u009b\u00b7\5\60\31\2\u009c\u009d\7" +
                    "C\2\2\u009d\u00b7\t\3\2\2\u009e\u009f\5\60\31\2\u009f\u00a0\7\65\2\2\u00a0" +
                    "\u00a1\5\60\31\2\u00a1\u00a2\7\66\2\2\u00a2\u00a3\t\2\2\2\u00a3\u00a4" +
                    "\5\60\31\2\u00a4\u00b7\3\2\2\2\u00a5\u00a6\5\60\31\2\u00a6\u00a7\7\65" +
                    "\2\2\u00a7\u00a8\5\60\31\2\u00a8\u00a9\7\66\2\2\u00a9\u00aa\t\3\2\2\u00aa" +
                    "\u00b7\3\2\2\2\u00ab\u00ac\5\60\31\2\u00ac\u00ad\7;\2\2\u00ad\u00ae\7" +
                    "C\2\2\u00ae\u00af\t\2\2\2\u00af\u00b0\5\60\31\2\u00b0\u00b7\3\2\2\2\u00b1" +
                    "\u00b2\5\60\31\2\u00b2\u00b3\7;\2\2\u00b3\u00b4\7C\2\2\u00b4\u00b5\t\3" +
                    "\2\2\u00b5\u00b7\3\2\2\2\u00b6\u0099\3\2\2\2\u00b6\u009c\3\2\2\2\u00b6" +
                    "\u009e\3\2\2\2\u00b6\u00a5\3\2\2\2\u00b6\u00ab\3\2\2\2\u00b6\u00b1\3\2" +
                    "\2\2\u00b7\23\3\2\2\2\u00b8\u00b9\7\32\2\2\u00b9\u00be\7C\2\2\u00ba\u00bb" +
                    "\7>\2\2\u00bb\u00bd\7C\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be" +
                    "\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2" +
                    "\2\2\u00c1\u00c2\7\67\2\2\u00c2\u00c3\5\60\31\2\u00c3\25\3\2\2\2\u00c4" +
                    "\u00c5\7\16\2\2\u00c5\u00c8\5\30\r\2\u00c6\u00c7\7\13\2\2\u00c7\u00c9" +
                    "\5\32\16\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\27\3\2\2\2\u00ca" +
                    "\u00cb\5\60\31\2\u00cb\u00cc\5\32\16\2\u00cc\31\3\2\2\2\u00cd\u00d1\5" +
                    "\34\17\2\u00ce\u00d1\5\4\3\2\u00cf\u00d1\5\n\6\2\u00d0\u00cd\3\2\2\2\u00d0" +
                    "\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\33\3\2\2\2\u00d2\u00d6\7\63\2" +
                    "\2\u00d3\u00d5\5\4\3\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4" +
                    "\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9" +
                    "\u00db\5\n\6\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2" +
                    "\2\2\u00dc\u00dd\7\64\2\2\u00dd\35\3\2\2\2\u00de\u00df\7\f\2\2\u00df\u00e1" +
                    "\7\61\2\2\u00e0\u00e2\5\6\4\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2" +
                    "\u00e2\u00e3\3\2\2\2\u00e3\u00e5\7<\2\2\u00e4\u00e6\5\60\31\2\u00e5\u00e4" +
                    "\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\7<\2\2\u00e8" +
                    "\u00ea\5\6\4\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2" +
                    "\2\2\u00eb\u00ec\7\62\2\2\u00ec\u00ed\5\32\16\2\u00ed\37\3\2\2\2\u00ee" +
                    "\u00ef\7\f\2\2\u00ef\u00f2\7C\2\2\u00f0\u00f1\7>\2\2\u00f1\u00f3\7C\2" +
                    "\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5" +
                    "\7\17\2\2\u00f5\u00f6\5\30\r\2\u00f6!\3\2\2\2\u00f7\u00f8\7\33\2\2\u00f8" +
                    "\u00f9\5\30\r\2\u00f9#\3\2\2\2\u00fa\u00fb\7\n\2\2\u00fb\u00fc\5\32\16" +
                    "\2\u00fc\u00fd\7\33\2\2\u00fd\u00fe\5\60\31\2\u00fe\u00ff\7<\2\2\u00ff" +
                    "%\3\2\2\2\u0100\u0101\7\21\2\2\u0101\u0102\5\60\31\2\u0102\'\3\2\2\2\u0103" +
                    "\u0104\5\60\31\2\u0104\u010d\7\61\2\2\u0105\u010a\5\60\31\2\u0106\u0107" +
                    "\7>\2\2\u0107\u0109\5\60\31\2\u0108\u0106\3\2\2\2\u0109\u010c\3\2\2\2" +
                    "\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a" +
                    "\3\2\2\2\u010d\u0105\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f" +
                    "\u0110\7\62\2\2\u0110)\3\2\2\2\u0111\u0112\7\23\2\2\u0112\u0113\7C\2\2" +
                    "\u0113\u011c\7\61\2\2\u0114\u0119\7C\2\2\u0115\u0116\7>\2\2\u0116\u0118" +
                    "\7C\2\2\u0117\u0115\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119" +
                    "\u011a\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u0114\3\2" +
                    "\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\7\62\2\2\u011f" +
                    "\u0120\5\34\17\2\u0120+\3\2\2\2\u0121\u0125\t\4\2\2\u0122\u0124\5.\30" +
                    "\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126" +
                    "\3\2\2\2\u0126\u012e\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012a\7M\2\2\u0129" +
                    "\u012b\5\60\31\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3" +
                    "\2\2\2\u012c\u012f\5\32\16\2\u012d\u012f\7Q\2\2\u012e\u0128\3\2\2\2\u012e" +
                    "\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f-\3\2\2\2\u0130\u0138\7O\2\2\u0131" +
                    "\u0138\7N\2\2\u0132\u0133\7L\2\2\u0133\u0134\5\60\31\2\u0134\u0135\7\64" +
                    "\2\2\u0135\u0138\3\2\2\2\u0136\u0138\7R\2\2\u0137\u0130\3\2\2\2\u0137" +
                    "\u0131\3\2\2\2\u0137\u0132\3\2\2\2\u0137\u0136\3\2\2\2\u0138/\3\2\2\2" +
                    "\u0139\u013a\b\31\1\2\u013a\u013b\7\61\2\2\u013b\u013c\5\60\31\2\u013c" +
                    "\u013d\7\62\2\2\u013d\u0144\3\2\2\2\u013e\u013f\7\60\2\2\u013f\u0144\5" +
                    "\60\31\17\u0140\u0141\7$\2\2\u0141\u0144\5\60\31\16\u0142\u0144\5\62\32" +
                    "\2\u0143\u0139\3\2\2\2\u0143\u013e\3\2\2\2\u0143\u0140\3\2\2\2\u0143\u0142" +
                    "\3\2\2\2\u0144\u0185\3\2\2\2\u0145\u0146\f\r\2\2\u0146\u0147\78\2\2\u0147" +
                    "\u0184\5\60\31\16\u0148\u0149\f\f\2\2\u0149\u014a\7+\2\2\u014a\u0184\5" +
                    "\60\31\f\u014b\u014c\f\13\2\2\u014c\u014d\t\5\2\2\u014d\u0184\5\60\31" +
                    "\f\u014e\u014f\f\n\2\2\u014f\u0150\t\6\2\2\u0150\u0184\5\60\31\13\u0151" +
                    "\u0152\f\t\2\2\u0152\u0153\t\7\2\2\u0153\u0184\5\60\31\n\u0154\u0155\f" +
                    "\b\2\2\u0155\u0156\t\b\2\2\u0156\u0184\5\60\31\t\u0157\u0158\f\7\2\2\u0158" +
                    "\u0159\7\20\2\2\u0159\u0184\5\60\31\b\u015a\u015b\f\6\2\2\u015b\u015c" +
                    "\7\34\2\2\u015c\u0184\5\60\31\7\u015d\u015e\f\5\2\2\u015e\u015f\7\35\2" +
                    "\2\u015f\u0184\5\60\31\6\u0160\u0161\f\4\2\2\u0161\u0162\7\16\2\2\u0162" +
                    "\u0163\5\60\31\2\u0163\u0164\7\13\2\2\u0164\u0165\5\60\31\4\u0165\u0184" +
                    "\3\2\2\2\u0166\u0168\f\23\2\2\u0167\u0169\79\2\2\u0168\u0167\3\2\2\2\u0168" +
                    "\u0169\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\7;\2\2\u016b\u0184\7C\2" +
                    "\2\u016c\u016d\f\22\2\2\u016d\u0176\7\61\2\2\u016e\u0173\5\60\31\2\u016f" +
                    "\u0170\7>\2\2\u0170\u0172\5\60\31\2\u0171\u016f\3\2\2\2\u0172\u0175\3" +
                    "\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0177\3\2\2\2\u0175" +
                    "\u0173\3\2\2\2\u0176\u016e\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\3\2" +
                    "\2\2\u0178\u0184\7\62\2\2\u0179\u017a\f\21\2\2\u017a\u017b\7\65\2\2\u017b" +
                    "\u017c\5\60\31\2\u017c\u017d\7\66\2\2\u017d\u0184\3\2\2\2\u017e\u017f" +
                    "\f\20\2\2\u017f\u0180\7\65\2\2\u0180\u0181\5\66\34\2\u0181\u0182\7\66" +
                    "\2\2\u0182\u0184\3\2\2\2\u0183\u0145\3\2\2\2\u0183\u0148\3\2\2\2\u0183" +
                    "\u014b\3\2\2\2\u0183\u014e\3\2\2\2\u0183\u0151\3\2\2\2\u0183\u0154\3\2" +
                    "\2\2\u0183\u0157\3\2\2\2\u0183\u015a\3\2\2\2\u0183\u015d\3\2\2\2\u0183" +
                    "\u0160\3\2\2\2\u0183\u0166\3\2\2\2\u0183\u016c\3\2\2\2\u0183\u0179\3\2" +
                    "\2\2\u0183\u017e\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185" +
                    "\u0186\3\2\2\2\u0186\61\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u01c7\7B\2\2" +
                    "\u0189\u01c7\7\24\2\2\u018a\u01c7\7\30\2\2\u018b\u01c7\7\5\2\2\u018c\u01c7" +
                    "\7C\2\2\u018d\u0191\7@\2\2\u018e\u0190\5\64\33\2\u018f\u018e\3\2\2\2\u0190" +
                    "\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0194\3\2" +
                    "\2\2\u0193\u0191\3\2\2\2\u0194\u01c7\7K\2\2\u0195\u019e\7\65\2\2\u0196" +
                    "\u019b\5\60\31\2\u0197\u0198\7>\2\2\u0198\u019a\5\60\31\2\u0199\u0197" +
                    "\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c" +
                    "\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u0196\3\2\2\2\u019e\u019f\3\2" +
                    "\2\2\u019f\u01a0\3\2\2\2\u01a0\u01c7\7\66\2\2\u01a1\u01af\7\63\2\2\u01a2" +
                    "\u01a3\7C\2\2\u01a3\u01a4\7=\2\2\u01a4\u01a5\5\60\31\2\u01a5\u01ac\3\2" +
                    "\2\2\u01a6\u01a7\7>\2\2\u01a7\u01a8\7C\2\2\u01a8\u01a9\7=\2\2\u01a9\u01ab" +
                    "\5\60\31\2\u01aa\u01a6\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2" +
                    "\u01ac\u01ad\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af\u01a2" +
                    "\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01c7\7\64\2\2" +
                    "\u01b2\u01c0\7C\2\2\u01b3\u01bc\7\61\2\2\u01b4\u01b9\7C\2\2\u01b5\u01b6" +
                    "\7>\2\2\u01b6\u01b8\7C\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9" +
                    "\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3\2" +
                    "\2\2\u01bc\u01b4\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\3\2\2\2\u01be" +
                    "\u01c0\7\62\2\2\u01bf\u01b2\3\2\2\2\u01bf\u01b3\3\2\2\2\u01c0\u01c1\3" +
                    "\2\2\2\u01c1\u01c4\7?\2\2\u01c2\u01c5\5\60\31\2\u01c3\u01c5\5\34\17\2" +
                    "\u01c4\u01c2\3\2\2\2\u01c4\u01c3\3\2\2\2\u01c5\u01c7\3\2\2\2\u01c6\u0188" +
                    "\3\2\2\2\u01c6\u0189\3\2\2\2\u01c6\u018a\3\2\2\2\u01c6\u018b\3\2\2\2\u01c6" +
                    "\u018c\3\2\2\2\u01c6\u018d\3\2\2\2\u01c6\u0195\3\2\2\2\u01c6\u01a1\3\2" +
                    "\2\2\u01c6\u01bf\3\2\2\2\u01c7\63\3\2\2\2\u01c8\u01d0\7J\2\2\u01c9\u01d0" +
                    "\7I\2\2\u01ca\u01d0\7H\2\2\u01cb\u01cc\7G\2\2\u01cc\u01cd\5\60\31\2\u01cd" +
                    "\u01ce\7\64\2\2\u01ce\u01d0\3\2\2\2\u01cf\u01c8\3\2\2\2\u01cf\u01c9\3" +
                    "\2\2\2\u01cf\u01ca\3\2\2\2\u01cf\u01cb\3\2\2\2\u01d0\65\3\2\2\2\u01d1" +
                    "\u01d2\5\60\31\2\u01d2\u01d3\7=\2\2\u01d3\u01d4\5\60\31\2\u01d4\u01dc" +
                    "\3\2\2\2\u01d5\u01d6\5\60\31\2\u01d6\u01d7\7=\2\2\u01d7\u01d8\5\60\31" +
                    "\2\u01d8\u01d9\7=\2\2\u01d9\u01da\5\60\31\2\u01da\u01dc\3\2\2\2\u01db" +
                    "\u01d1\3\2\2\2\u01db\u01d5\3\2\2\2\u01dc\67\3\2\2\2\63;LSZ^hr|\177\u008a" +
                    "\u008d\u0092\u0097\u00b6\u00be\u00c8\u00d0\u00d6\u00da\u00e1\u00e5\u00e9" +
                    "\u00f2\u010a\u010d\u0119\u011c\u0125\u012a\u012e\u0137\u0143\u0168\u0173" +
                    "\u0176\u0183\u0185\u0191\u019b\u019e\u01ac\u01af\u01b9\u01bc\u01bf\u01c4" +
                    "\u01c6\u01cf\u01db";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}