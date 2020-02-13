// Generated from C:/Code/minecraft/modding/mcfunction_lambdas/src/main/antlr\MainFunctionParser.g4 by ANTLR 4.8
package com.function.main.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MainFunctionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

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
		RULE_program = 0, RULE_statement = 1, RULE_line = 2, RULE_assert_line = 3, 
		RULE_ending_line = 4, RULE_function_class = 5, RULE_gen_mcfunction_line = 6, 
		RULE_class_line = 7, RULE_var_modification = 8, RULE_var_definition = 9, 
		RULE_if_statement = 10, RULE_expr_block = 11, RULE_stat_block = 12, RULE_block = 13, 
		RULE_for_loop = 14, RULE_foreach_loop = 15, RULE_while_loop = 16, RULE_do_while_loop = 17, 
		RULE_log_line = 18, RULE_function_call_line = 19, RULE_function_line = 20, 
		RULE_command = 21, RULE_command_part = 22, RULE_expr = 23, RULE_atom = 24, 
		RULE_string_part = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "line", "assert_line", "ending_line", "function_class", 
			"gen_mcfunction_line", "class_line", "var_modification", "var_definition", 
			"if_statement", "expr_block", "stat_block", "block", "for_loop", "foreach_loop", 
			"while_loop", "do_while_loop", "log_line", "function_call_line", "function_line", 
			"command", "command_part", "expr", "atom", "string_part"
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

	@Override
	public String getGrammarFileName() { return "MainFunctionParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MainFunctionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MainFunctionParser.EOF, 0); }
		public TerminalNode THIS() { return getToken(MainFunctionParser.THIS, 0); }
		public TerminalNode SEMI() { return getToken(MainFunctionParser.SEMI, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode TICK() { return getToken(MainFunctionParser.TICK, 0); }
		public TerminalNode LOAD() { return getToken(MainFunctionParser.LOAD, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOAD || _la==TICK) {
				{
				setState(52);
				_la = _input.LA(1);
				if ( !(_la==LOAD || _la==TICK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(53);
				match(THIS);
				setState(54);
				match(SEMI);
				}
			}

			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSERT) | (1L << BOOL) | (1L << CLASS) | (1L << DO) | (1L << FOR) | (1L << GEN) | (1L << IF) | (1L << LOG) | (1L << FUNCTION) | (1L << NULL) | (1L << THIS) | (1L << VAR) | (1L << WHILE) | (1L << NOT) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACKET))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OPEN_STRING - 64)) | (1L << (OPEN_COMMAND - 64)) | (1L << (NUM - 64)) | (1L << (IDEN - 64)) | (1L << (NEWLINE_COMMAND - 64)))) != 0)) {
				{
				{
				setState(57);
				statement();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
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

	public static class StatementContext extends ParserRuleContext {
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MainFunctionParser.SEMI, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public Foreach_loopContext foreach_loop() {
			return getRuleContext(Foreach_loopContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public Do_while_loopContext do_while_loop() {
			return getRuleContext(Do_while_loopContext.class,0);
		}
		public Function_classContext function_class() {
			return getRuleContext(Function_classContext.class,0);
		}
		public Function_lineContext function_line() {
			return getRuleContext(Function_lineContext.class,0);
		}
		public Gen_mcfunction_lineContext gen_mcfunction_line() {
			return getRuleContext(Gen_mcfunction_lineContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				line();
				setState(66);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				command();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				if_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				for_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(71);
				foreach_loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(72);
				while_loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(73);
				do_while_loop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(74);
				function_class();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(75);
				function_line();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(76);
				gen_mcfunction_line();
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

	public static class LineContext extends ParserRuleContext {
		public Var_definitionContext var_definition() {
			return getRuleContext(Var_definitionContext.class,0);
		}
		public Var_modificationContext var_modification() {
			return getRuleContext(Var_modificationContext.class,0);
		}
		public Log_lineContext log_line() {
			return getRuleContext(Log_lineContext.class,0);
		}
		public Assert_lineContext assert_line() {
			return getRuleContext(Assert_lineContext.class,0);
		}
		public Function_call_lineContext function_call_line() {
			return getRuleContext(Function_call_lineContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_line);
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				var_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				var_modification();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				log_line();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				assert_line();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
				function_call_line();
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

	public static class Assert_lineContext extends ParserRuleContext {
		public TerminalNode ASSERT() { return getToken(MainFunctionParser.ASSERT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assert_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assert_line; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitAssert_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assert_lineContext assert_line() throws RecognitionException {
		Assert_lineContext _localctx = new Assert_lineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assert_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(ASSERT);
			setState(87);
			expr(0);
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

	public static class Ending_lineContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(MainFunctionParser.SEMI, 0); }
		public TerminalNode RETURN() { return getToken(MainFunctionParser.RETURN, 0); }
		public TerminalNode BREAK() { return getToken(MainFunctionParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(MainFunctionParser.CONTINUE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Ending_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ending_line; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitEnding_line(this);
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
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				{
				setState(89);
				match(RETURN);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACKET))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OPEN_STRING - 64)) | (1L << (NUM - 64)) | (1L << (IDEN - 64)))) != 0)) {
					{
					setState(90);
					expr(0);
					}
				}

				}
				break;
			case BREAK:
				{
				setState(93);
				match(BREAK);
				}
				break;
			case CONTINUE:
				{
				setState(94);
				match(CONTINUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(97);
			match(SEMI);
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

	public static class Function_classContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(MainFunctionParser.CLASS, 0); }
		public TerminalNode IDEN() { return getToken(MainFunctionParser.IDEN, 0); }
		public TerminalNode LBRACE() { return getToken(MainFunctionParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MainFunctionParser.RBRACE, 0); }
		public List<Class_lineContext> class_line() {
			return getRuleContexts(Class_lineContext.class);
		}
		public Class_lineContext class_line(int i) {
			return getRuleContext(Class_lineContext.class,i);
		}
		public Function_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_class; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitFunction_class(this);
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
			setState(99);
			match(CLASS);
			setState(100);
			match(IDEN);
			setState(101);
			match(LBRACE);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSTRUCTOR) | (1L << INSTANCE) | (1L << FUNCTION) | (1L << VAR))) != 0)) {
				{
				{
				setState(102);
				class_line();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			match(RBRACE);
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

	public static class Gen_mcfunction_lineContext extends ParserRuleContext {
		public TerminalNode GEN() { return getToken(MainFunctionParser.GEN, 0); }
		public TerminalNode FUNCTION() { return getToken(MainFunctionParser.FUNCTION, 0); }
		public Expr_blockContext expr_block() {
			return getRuleContext(Expr_blockContext.class,0);
		}
		public Gen_mcfunction_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gen_mcfunction_line; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitGen_mcfunction_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gen_mcfunction_lineContext gen_mcfunction_line() throws RecognitionException {
		Gen_mcfunction_lineContext _localctx = new Gen_mcfunction_lineContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_gen_mcfunction_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(GEN);
			setState(111);
			match(FUNCTION);
			setState(112);
			expr_block();
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

	public static class Class_lineContext extends ParserRuleContext {
		public Class_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_line; }
	 
		public Class_lineContext() { }
		public void copyFrom(Class_lineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstructorClassLineContext extends Class_lineContext {
		public TerminalNode CONSTRUCTOR() { return getToken(MainFunctionParser.CONSTRUCTOR, 0); }
		public TerminalNode LPAREN() { return getToken(MainFunctionParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MainFunctionParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> IDEN() { return getTokens(MainFunctionParser.IDEN); }
		public TerminalNode IDEN(int i) {
			return getToken(MainFunctionParser.IDEN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MainFunctionParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MainFunctionParser.COMMA, i);
		}
		public ConstructorClassLineContext(Class_lineContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitConstructorClassLine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionClassLineContext extends Class_lineContext {
		public TerminalNode FUNCTION() { return getToken(MainFunctionParser.FUNCTION, 0); }
		public List<TerminalNode> IDEN() { return getTokens(MainFunctionParser.IDEN); }
		public TerminalNode IDEN(int i) {
			return getToken(MainFunctionParser.IDEN, i);
		}
		public TerminalNode LPAREN() { return getToken(MainFunctionParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MainFunctionParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode INSTANCE() { return getToken(MainFunctionParser.INSTANCE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MainFunctionParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MainFunctionParser.COMMA, i);
		}
		public FunctionClassLineContext(Class_lineContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitFunctionClassLine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantLineContext extends Class_lineContext {
		public Var_definitionContext var_definition() {
			return getRuleContext(Var_definitionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MainFunctionParser.SEMI, 0); }
		public TerminalNode INSTANCE() { return getToken(MainFunctionParser.INSTANCE, 0); }
		public ConstantLineContext(Class_lineContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitConstantLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_lineContext class_line() throws RecognitionException {
		Class_lineContext _localctx = new Class_lineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_class_line);
		int _la;
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new FunctionClassLineContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INSTANCE) {
					{
					setState(114);
					match(INSTANCE);
					}
				}

				setState(117);
				match(FUNCTION);
				setState(118);
				match(IDEN);
				setState(119);
				match(LPAREN);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDEN) {
					{
					setState(120);
					match(IDEN);
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(121);
						match(COMMA);
						setState(122);
						match(IDEN);
						}
						}
						setState(127);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(130);
				match(RPAREN);
				setState(131);
				block();
				}
				break;
			case 2:
				_localctx = new ConstructorClassLineContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(CONSTRUCTOR);
				setState(133);
				match(LPAREN);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDEN) {
					{
					setState(134);
					match(IDEN);
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(135);
						match(COMMA);
						setState(136);
						match(IDEN);
						}
						}
						setState(141);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(144);
				match(RPAREN);
				setState(145);
				block();
				}
				break;
			case 3:
				_localctx = new ConstantLineContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INSTANCE) {
					{
					setState(146);
					match(INSTANCE);
					}
				}

				setState(149);
				var_definition();
				setState(150);
				match(SEMI);
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

	public static class Var_modificationContext extends ParserRuleContext {
		public Var_modificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_modification; }
	 
		public Var_modificationContext() { }
		public void copyFrom(Var_modificationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarDeclarationModPlusPlusContext extends Var_modificationContext {
		public Token var_operator;
		public TerminalNode IDEN() { return getToken(MainFunctionParser.IDEN, 0); }
		public TerminalNode PLUSPLUS() { return getToken(MainFunctionParser.PLUSPLUS, 0); }
		public TerminalNode MINUSMINUS() { return getToken(MainFunctionParser.MINUSMINUS, 0); }
		public VarDeclarationModPlusPlusContext(Var_modificationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitVarDeclarationModPlusPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDeclarationListItemContext extends Var_modificationContext {
		public Token var_operator;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LBRACKET() { return getToken(MainFunctionParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(MainFunctionParser.RBRACKET, 0); }
		public TerminalNode EQUAL() { return getToken(MainFunctionParser.EQUAL, 0); }
		public TerminalNode PLUSEQUAL() { return getToken(MainFunctionParser.PLUSEQUAL, 0); }
		public TerminalNode MINUSEQUAL() { return getToken(MainFunctionParser.MINUSEQUAL, 0); }
		public TerminalNode MULTEQUAL() { return getToken(MainFunctionParser.MULTEQUAL, 0); }
		public TerminalNode DIVIDEEQUAL() { return getToken(MainFunctionParser.DIVIDEEQUAL, 0); }
		public VarDeclarationListItemContext(Var_modificationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitVarDeclarationListItem(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDeclarationListItemPlusPlusContext extends Var_modificationContext {
		public Token var_operator;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LBRACKET() { return getToken(MainFunctionParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(MainFunctionParser.RBRACKET, 0); }
		public TerminalNode PLUSPLUS() { return getToken(MainFunctionParser.PLUSPLUS, 0); }
		public TerminalNode MINUSMINUS() { return getToken(MainFunctionParser.MINUSMINUS, 0); }
		public VarDeclarationListItemPlusPlusContext(Var_modificationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitVarDeclarationListItemPlusPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDeclarationObjectItemContext extends Var_modificationContext {
		public Token var_operator;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DOT() { return getToken(MainFunctionParser.DOT, 0); }
		public TerminalNode IDEN() { return getToken(MainFunctionParser.IDEN, 0); }
		public TerminalNode EQUAL() { return getToken(MainFunctionParser.EQUAL, 0); }
		public TerminalNode PLUSEQUAL() { return getToken(MainFunctionParser.PLUSEQUAL, 0); }
		public TerminalNode MINUSEQUAL() { return getToken(MainFunctionParser.MINUSEQUAL, 0); }
		public TerminalNode MULTEQUAL() { return getToken(MainFunctionParser.MULTEQUAL, 0); }
		public TerminalNode DIVIDEEQUAL() { return getToken(MainFunctionParser.DIVIDEEQUAL, 0); }
		public VarDeclarationObjectItemContext(Var_modificationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitVarDeclarationObjectItem(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDeclarationObjectItemPlusPlusContext extends Var_modificationContext {
		public Token var_operator;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(MainFunctionParser.DOT, 0); }
		public TerminalNode IDEN() { return getToken(MainFunctionParser.IDEN, 0); }
		public TerminalNode PLUSPLUS() { return getToken(MainFunctionParser.PLUSPLUS, 0); }
		public TerminalNode MINUSMINUS() { return getToken(MainFunctionParser.MINUSMINUS, 0); }
		public VarDeclarationObjectItemPlusPlusContext(Var_modificationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitVarDeclarationObjectItemPlusPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDeclarationModContext extends Var_modificationContext {
		public Token var_operator;
		public TerminalNode IDEN() { return getToken(MainFunctionParser.IDEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(MainFunctionParser.EQUAL, 0); }
		public TerminalNode PLUSEQUAL() { return getToken(MainFunctionParser.PLUSEQUAL, 0); }
		public TerminalNode MINUSEQUAL() { return getToken(MainFunctionParser.MINUSEQUAL, 0); }
		public TerminalNode MULTEQUAL() { return getToken(MainFunctionParser.MULTEQUAL, 0); }
		public TerminalNode DIVIDEEQUAL() { return getToken(MainFunctionParser.DIVIDEEQUAL, 0); }
		public VarDeclarationModContext(Var_modificationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitVarDeclarationMod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_modificationContext var_modification() throws RecognitionException {
		Var_modificationContext _localctx = new Var_modificationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_var_modification);
		int _la;
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new VarDeclarationModContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(IDEN);
				setState(155);
				((VarDeclarationModContext)_localctx).var_operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUSEQUAL) | (1L << MINUSEQUAL) | (1L << MULTEQUAL) | (1L << DIVIDEEQUAL) | (1L << EQUAL))) != 0)) ) {
					((VarDeclarationModContext)_localctx).var_operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(156);
				expr(0);
				}
				break;
			case 2:
				_localctx = new VarDeclarationModPlusPlusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(IDEN);
				setState(158);
				((VarDeclarationModPlusPlusContext)_localctx).var_operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUSPLUS || _la==MINUSMINUS) ) {
					((VarDeclarationModPlusPlusContext)_localctx).var_operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				_localctx = new VarDeclarationListItemContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				expr(0);
				setState(160);
				match(LBRACKET);
				setState(161);
				expr(0);
				setState(162);
				match(RBRACKET);
				setState(163);
				((VarDeclarationListItemContext)_localctx).var_operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUSEQUAL) | (1L << MINUSEQUAL) | (1L << MULTEQUAL) | (1L << DIVIDEEQUAL) | (1L << EQUAL))) != 0)) ) {
					((VarDeclarationListItemContext)_localctx).var_operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(164);
				expr(0);
				}
				break;
			case 4:
				_localctx = new VarDeclarationListItemPlusPlusContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				expr(0);
				setState(167);
				match(LBRACKET);
				setState(168);
				expr(0);
				setState(169);
				match(RBRACKET);
				setState(170);
				((VarDeclarationListItemPlusPlusContext)_localctx).var_operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUSPLUS || _la==MINUSMINUS) ) {
					((VarDeclarationListItemPlusPlusContext)_localctx).var_operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 5:
				_localctx = new VarDeclarationObjectItemContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				expr(0);
				setState(173);
				match(DOT);
				setState(174);
				match(IDEN);
				setState(175);
				((VarDeclarationObjectItemContext)_localctx).var_operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUSEQUAL) | (1L << MINUSEQUAL) | (1L << MULTEQUAL) | (1L << DIVIDEEQUAL) | (1L << EQUAL))) != 0)) ) {
					((VarDeclarationObjectItemContext)_localctx).var_operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(176);
				expr(0);
				}
				break;
			case 6:
				_localctx = new VarDeclarationObjectItemPlusPlusContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(178);
				expr(0);
				setState(179);
				match(DOT);
				setState(180);
				match(IDEN);
				setState(181);
				((VarDeclarationObjectItemPlusPlusContext)_localctx).var_operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUSPLUS || _la==MINUSMINUS) ) {
					((VarDeclarationObjectItemPlusPlusContext)_localctx).var_operator = (Token)_errHandler.recoverInline(this);
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

	public static class Var_definitionContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MainFunctionParser.VAR, 0); }
		public List<TerminalNode> IDEN() { return getTokens(MainFunctionParser.IDEN); }
		public TerminalNode IDEN(int i) {
			return getToken(MainFunctionParser.IDEN, i);
		}
		public TerminalNode EQUAL() { return getToken(MainFunctionParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(MainFunctionParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MainFunctionParser.COMMA, i);
		}
		public Var_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitVar_definition(this);
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
			setState(185);
			match(VAR);
			setState(186);
			match(IDEN);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(187);
				match(COMMA);
				setState(188);
				match(IDEN);
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			match(EQUAL);
			setState(195);
			expr(0);
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MainFunctionParser.IF, 0); }
		public Expr_blockContext expr_block() {
			return getRuleContext(Expr_blockContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(MainFunctionParser.ELSE, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(IF);
			setState(198);
			expr_block();
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(199);
				match(ELSE);
				setState(200);
				stat_block();
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

	public static class Expr_blockContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public Expr_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitExpr_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_blockContext expr_block() throws RecognitionException {
		Expr_blockContext _localctx = new Expr_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			expr(0);
			setState(204);
			stat_block();
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

	public static class Stat_blockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Ending_lineContext ending_line() {
			return getRuleContext(Ending_lineContext.class,0);
		}
		public Stat_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitStat_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_blockContext stat_block() throws RecognitionException {
		Stat_blockContext _localctx = new Stat_blockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stat_block);
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				ending_line();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(MainFunctionParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MainFunctionParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Ending_lineContext ending_line() {
			return getRuleContext(Ending_lineContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitBlock(this);
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
			setState(211);
			match(LBRACE);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSERT) | (1L << BOOL) | (1L << CLASS) | (1L << DO) | (1L << FOR) | (1L << GEN) | (1L << IF) | (1L << LOG) | (1L << FUNCTION) | (1L << NULL) | (1L << THIS) | (1L << VAR) | (1L << WHILE) | (1L << NOT) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACKET))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OPEN_STRING - 64)) | (1L << (OPEN_COMMAND - 64)) | (1L << (NUM - 64)) | (1L << (IDEN - 64)) | (1L << (NEWLINE_COMMAND - 64)))) != 0)) {
				{
				{
				setState(212);
				statement();
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << CONTINUE) | (1L << RETURN))) != 0)) {
				{
				setState(218);
				ending_line();
				}
			}

			setState(221);
			match(RBRACE);
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

	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MainFunctionParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(MainFunctionParser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(MainFunctionParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(MainFunctionParser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(MainFunctionParser.RPAREN, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitFor_loop(this);
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
			setState(223);
			match(FOR);
			setState(224);
			match(LPAREN);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSERT) | (1L << BOOL) | (1L << LOG) | (1L << NULL) | (1L << THIS) | (1L << VAR) | (1L << NOT) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACKET))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OPEN_STRING - 64)) | (1L << (NUM - 64)) | (1L << (IDEN - 64)))) != 0)) {
				{
				setState(225);
				line();
				}
			}

			setState(228);
			match(SEMI);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACKET))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OPEN_STRING - 64)) | (1L << (NUM - 64)) | (1L << (IDEN - 64)))) != 0)) {
				{
				setState(229);
				expr(0);
				}
			}

			setState(232);
			match(SEMI);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSERT) | (1L << BOOL) | (1L << LOG) | (1L << NULL) | (1L << THIS) | (1L << VAR) | (1L << NOT) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACKET))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OPEN_STRING - 64)) | (1L << (NUM - 64)) | (1L << (IDEN - 64)))) != 0)) {
				{
				setState(233);
				line();
				}
			}

			setState(236);
			match(RPAREN);
			setState(237);
			stat_block();
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

	public static class Foreach_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MainFunctionParser.FOR, 0); }
		public List<TerminalNode> IDEN() { return getTokens(MainFunctionParser.IDEN); }
		public TerminalNode IDEN(int i) {
			return getToken(MainFunctionParser.IDEN, i);
		}
		public TerminalNode IN() { return getToken(MainFunctionParser.IN, 0); }
		public Expr_blockContext expr_block() {
			return getRuleContext(Expr_blockContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(MainFunctionParser.COMMA, 0); }
		public Foreach_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitForeach_loop(this);
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
			setState(239);
			match(FOR);
			setState(240);
			match(IDEN);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(241);
				match(COMMA);
				setState(242);
				match(IDEN);
				}
			}

			setState(245);
			match(IN);
			setState(246);
			expr_block();
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

	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MainFunctionParser.WHILE, 0); }
		public Expr_blockContext expr_block() {
			return getRuleContext(Expr_blockContext.class,0);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(WHILE);
			setState(249);
			expr_block();
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

	public static class Do_while_loopContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(MainFunctionParser.DO, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(MainFunctionParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MainFunctionParser.SEMI, 0); }
		public Do_while_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitDo_while_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_loopContext do_while_loop() throws RecognitionException {
		Do_while_loopContext _localctx = new Do_while_loopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_do_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(DO);
			setState(252);
			stat_block();
			setState(253);
			match(WHILE);
			setState(254);
			expr(0);
			setState(255);
			match(SEMI);
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

	public static class Log_lineContext extends ParserRuleContext {
		public TerminalNode LOG() { return getToken(MainFunctionParser.LOG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Log_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log_line; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitLog_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Log_lineContext log_line() throws RecognitionException {
		Log_lineContext _localctx = new Log_lineContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_log_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(LOG);
			setState(258);
			expr(0);
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

	public static class Function_call_lineContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(MainFunctionParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MainFunctionParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MainFunctionParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MainFunctionParser.COMMA, i);
		}
		public Function_call_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_line; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitFunction_call_line(this);
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
			setState(260);
			expr(0);
			setState(261);
			match(LPAREN);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACKET))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OPEN_STRING - 64)) | (1L << (NUM - 64)) | (1L << (IDEN - 64)))) != 0)) {
				{
				setState(262);
				expr(0);
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(263);
					match(COMMA);
					setState(264);
					expr(0);
					}
					}
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(272);
			match(RPAREN);
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

	public static class Function_lineContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(MainFunctionParser.FUNCTION, 0); }
		public List<TerminalNode> IDEN() { return getTokens(MainFunctionParser.IDEN); }
		public TerminalNode IDEN(int i) {
			return getToken(MainFunctionParser.IDEN, i);
		}
		public TerminalNode LPAREN() { return getToken(MainFunctionParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MainFunctionParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(MainFunctionParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MainFunctionParser.COMMA, i);
		}
		public Function_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_line; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitFunction_line(this);
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
			setState(274);
			match(FUNCTION);
			setState(275);
			match(IDEN);
			setState(276);
			match(LPAREN);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDEN) {
				{
				setState(277);
				match(IDEN);
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(278);
					match(COMMA);
					setState(279);
					match(IDEN);
					}
					}
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(287);
			match(RPAREN);
			setState(288);
			block();
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

	public static class CommandContext extends ParserRuleContext {
		public TerminalNode OPEN_COMMAND() { return getToken(MainFunctionParser.OPEN_COMMAND, 0); }
		public TerminalNode NEWLINE_COMMAND() { return getToken(MainFunctionParser.NEWLINE_COMMAND, 0); }
		public List<Command_partContext> command_part() {
			return getRuleContexts(Command_partContext.class);
		}
		public Command_partContext command_part(int i) {
			return getRuleContext(Command_partContext.class,i);
		}
		public TerminalNode OPEN_FUNCTION() { return getToken(MainFunctionParser.OPEN_FUNCTION, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public TerminalNode EXIT_COMMAND() { return getToken(MainFunctionParser.EXIT_COMMAND, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitCommand(this);
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
			setState(290);
			_la = _input.LA(1);
			if ( !(_la==OPEN_COMMAND || _la==NEWLINE_COMMAND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (ENTER_EXPR_INTERP_COMMAND - 76)) | (1L << (ID_INTERP_COMMAND - 76)) | (1L << (TEXT_COMMAND - 76)) | (1L << (CONTINUE_COMMAND - 76)))) != 0)) {
				{
				{
				setState(291);
				command_part();
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_FUNCTION:
				{
				setState(297);
				match(OPEN_FUNCTION);
				setState(299);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(298);
					expr(0);
					}
					break;
				}
				setState(301);
				stat_block();
				}
				break;
			case EXIT_COMMAND:
				{
				setState(302);
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

	public static class Command_partContext extends ParserRuleContext {
		public Command_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_part; }
	 
		public Command_partContext() { }
		public void copyFrom(Command_partContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CommmandGoOnPartContext extends Command_partContext {
		public TerminalNode CONTINUE_COMMAND() { return getToken(MainFunctionParser.CONTINUE_COMMAND, 0); }
		public CommmandGoOnPartContext(Command_partContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitCommmandGoOnPart(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommandTextContext extends Command_partContext {
		public TerminalNode TEXT_COMMAND() { return getToken(MainFunctionParser.TEXT_COMMAND, 0); }
		public CommandTextContext(Command_partContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitCommandText(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommandExprInterpPartContext extends Command_partContext {
		public TerminalNode ENTER_EXPR_INTERP_COMMAND() { return getToken(MainFunctionParser.ENTER_EXPR_INTERP_COMMAND, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(MainFunctionParser.RBRACE, 0); }
		public CommandExprInterpPartContext(Command_partContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitCommandExprInterpPart(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommandIdInterpPartContext extends Command_partContext {
		public TerminalNode ID_INTERP_COMMAND() { return getToken(MainFunctionParser.ID_INTERP_COMMAND, 0); }
		public CommandIdInterpPartContext(Command_partContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitCommandIdInterpPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Command_partContext command_part() throws RecognitionException {
		Command_partContext _localctx = new Command_partContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_command_part);
		try {
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT_COMMAND:
				_localctx = new CommandTextContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				match(TEXT_COMMAND);
				}
				break;
			case ID_INTERP_COMMAND:
				_localctx = new CommandIdInterpPartContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				match(ID_INTERP_COMMAND);
				}
				break;
			case ENTER_EXPR_INTERP_COMMAND:
				_localctx = new CommandExprInterpPartContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				match(ENTER_EXPR_INTERP_COMMAND);
				setState(308);
				expr(0);
				setState(309);
				match(RBRACE);
				}
				break;
			case CONTINUE_COMMAND:
				_localctx = new CommmandGoOnPartContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(311);
				match(CONTINUE_COMMAND);
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
	public static class NegationExprContext extends ExprContext {
		public TerminalNode MINUS() { return getToken(MainFunctionParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegationExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitNegationExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GetFromObjectExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(MainFunctionParser.DOT, 0); }
		public TerminalNode IDEN() { return getToken(MainFunctionParser.IDEN, 0); }
		public TerminalNode QUESTION() { return getToken(MainFunctionParser.QUESTION, 0); }
		public GetFromObjectExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitGetFromObjectExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomExprContext extends ExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(MainFunctionParser.OR, 0); }
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditiveExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(MainFunctionParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MainFunctionParser.MINUS, 0); }
		public AdditiveExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitAdditiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(MainFunctionParser.LT, 0); }
		public TerminalNode LE() { return getToken(MainFunctionParser.LE, 0); }
		public TerminalNode GT() { return getToken(MainFunctionParser.GT, 0); }
		public TerminalNode GE() { return getToken(MainFunctionParser.GE, 0); }
		public RelationalExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitRelationalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LBRACKET() { return getToken(MainFunctionParser.LBRACKET, 0); }
		public List<TerminalNode> COLON() { return getTokens(MainFunctionParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(MainFunctionParser.COLON, i);
		}
		public TerminalNode RBRACKET() { return getToken(MainFunctionParser.RBRACKET, 0); }
		public SubExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ElvisExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ELVIS() { return getToken(MainFunctionParser.ELVIS, 0); }
		public ElvisExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitElvisExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParExprContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(MainFunctionParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MainFunctionParser.RPAREN, 0); }
		public ParExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitParExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExprContext extends ExprContext {
		public TerminalNode NOT() { return getToken(MainFunctionParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TernaryExprContext extends ExprContext {
		public ExprContext left;
		public ExprContext condition;
		public ExprContext right;
		public TerminalNode IF() { return getToken(MainFunctionParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(MainFunctionParser.ELSE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TernaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitTernaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RunFunctionExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(MainFunctionParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MainFunctionParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MainFunctionParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MainFunctionParser.COMMA, i);
		}
		public RunFunctionExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitRunFunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(MainFunctionParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(MainFunctionParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MainFunctionParser.MOD, 0); }
		public MultiplicationExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitMultiplicationExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POW() { return getToken(MainFunctionParser.POW, 0); }
		public PowExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitPowExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IS() { return getToken(MainFunctionParser.IS, 0); }
		public IsExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitIsExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GetItemExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LBRACKET() { return getToken(MainFunctionParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(MainFunctionParser.RBRACKET, 0); }
		public GetItemExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitGetItemExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(MainFunctionParser.EQ, 0); }
		public TerminalNode NE() { return getToken(MainFunctionParser.NE, 0); }
		public EqualityExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(MainFunctionParser.AND, 0); }
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitAndExpr(this);
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
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				_localctx = new ParExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(315);
				match(LPAREN);
				setState(316);
				expr(0);
				setState(317);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new NegationExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(319);
				match(MINUS);
				setState(320);
				expr(13);
				}
				break;
			case 3:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(321);
				match(NOT);
				setState(322);
				expr(12);
				}
				break;
			case 4:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(323);
				atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(396);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(394);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						_localctx = new ElvisExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(326);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(327);
						match(ELVIS);
						setState(328);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new PowExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(329);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(330);
						match(POW);
						setState(331);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicationExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(332);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(333);
						((MultiplicationExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((MultiplicationExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(334);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new AdditiveExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(335);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(336);
						((AdditiveExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AdditiveExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(337);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(338);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(339);
						((RelationalExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GE) | (1L << LT) | (1L << LE))) != 0)) ) {
							((RelationalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(340);
						expr(8);
						}
						break;
					case 6:
						{
						_localctx = new EqualityExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(341);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(342);
						((EqualityExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NE) ) {
							((EqualityExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(343);
						expr(7);
						}
						break;
					case 7:
						{
						_localctx = new IsExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(344);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(345);
						match(IS);
						setState(346);
						expr(6);
						}
						break;
					case 8:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(347);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(348);
						match(AND);
						setState(349);
						expr(5);
						}
						break;
					case 9:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(350);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(351);
						match(OR);
						setState(352);
						expr(4);
						}
						break;
					case 10:
						{
						_localctx = new TernaryExprContext(new ExprContext(_parentctx, _parentState));
						((TernaryExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(353);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(354);
						match(IF);
						setState(355);
						((TernaryExprContext)_localctx).condition = expr(0);
						setState(356);
						match(ELSE);
						setState(357);
						((TernaryExprContext)_localctx).right = expr(2);
						}
						break;
					case 11:
						{
						_localctx = new GetFromObjectExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(359);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(361);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==QUESTION) {
							{
							setState(360);
							match(QUESTION);
							}
						}

						setState(363);
						match(DOT);
						setState(364);
						match(IDEN);
						}
						break;
					case 12:
						{
						_localctx = new RunFunctionExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(365);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(366);
						match(LPAREN);
						setState(375);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACKET))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OPEN_STRING - 64)) | (1L << (NUM - 64)) | (1L << (IDEN - 64)))) != 0)) {
							{
							setState(367);
							expr(0);
							setState(372);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(368);
								match(COMMA);
								setState(369);
								expr(0);
								}
								}
								setState(374);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(377);
						match(RPAREN);
						}
						break;
					case 13:
						{
						_localctx = new GetItemExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(378);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(379);
						match(LBRACKET);
						setState(380);
						expr(0);
						setState(381);
						match(RBRACKET);
						}
						break;
					case 14:
						{
						_localctx = new SubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(383);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(384);
						match(LBRACKET);
						setState(385);
						expr(0);
						setState(386);
						match(COLON);
						setState(387);
						expr(0);
						setState(390);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COLON) {
							{
							setState(388);
							match(COLON);
							setState(389);
							expr(0);
							}
						}

						setState(392);
						match(RBRACKET);
						}
						break;
					}
					} 
				}
				setState(398);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BooleanAtomContext extends AtomContext {
		public TerminalNode BOOL() { return getToken(MainFunctionParser.BOOL, 0); }
		public BooleanAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitBooleanAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListAtomContext extends AtomContext {
		public TerminalNode LBRACKET() { return getToken(MainFunctionParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(MainFunctionParser.RBRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MainFunctionParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MainFunctionParser.COMMA, i);
		}
		public ListAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitListAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumAtomContext extends AtomContext {
		public TerminalNode NUM() { return getToken(MainFunctionParser.NUM, 0); }
		public NumAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitNumAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierAtomContext extends AtomContext {
		public TerminalNode IDEN() { return getToken(MainFunctionParser.IDEN, 0); }
		public IdentifierAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitIdentifierAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringAtomContext extends AtomContext {
		public TerminalNode OPEN_STRING() { return getToken(MainFunctionParser.OPEN_STRING, 0); }
		public TerminalNode CLOSE_STRING() { return getToken(MainFunctionParser.CLOSE_STRING, 0); }
		public List<String_partContext> string_part() {
			return getRuleContexts(String_partContext.class);
		}
		public String_partContext string_part(int i) {
			return getRuleContext(String_partContext.class,i);
		}
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullAtomContext extends AtomContext {
		public TerminalNode NULL() { return getToken(MainFunctionParser.NULL, 0); }
		public NullAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitNullAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisAtomContext extends AtomContext {
		public TerminalNode THIS() { return getToken(MainFunctionParser.THIS, 0); }
		public ThisAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitThisAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectAtomContext extends AtomContext {
		public TerminalNode LBRACE() { return getToken(MainFunctionParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MainFunctionParser.RBRACE, 0); }
		public List<TerminalNode> IDEN() { return getTokens(MainFunctionParser.IDEN); }
		public TerminalNode IDEN(int i) {
			return getToken(MainFunctionParser.IDEN, i);
		}
		public List<TerminalNode> COLON() { return getTokens(MainFunctionParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(MainFunctionParser.COLON, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MainFunctionParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MainFunctionParser.COMMA, i);
		}
		public ObjectAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitObjectAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaAtomContext extends AtomContext {
		public TerminalNode ARROW() { return getToken(MainFunctionParser.ARROW, 0); }
		public List<TerminalNode> IDEN() { return getTokens(MainFunctionParser.IDEN); }
		public TerminalNode IDEN(int i) {
			return getToken(MainFunctionParser.IDEN, i);
		}
		public TerminalNode LPAREN() { return getToken(MainFunctionParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MainFunctionParser.RPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(MainFunctionParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MainFunctionParser.COMMA, i);
		}
		public LambdaAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitLambdaAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_atom);
		int _la;
		try {
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				_localctx = new NumAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				match(NUM);
				}
				break;
			case 2:
				_localctx = new NullAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				match(NULL);
				}
				break;
			case 3:
				_localctx = new ThisAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(401);
				match(THIS);
				}
				break;
			case 4:
				_localctx = new BooleanAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(402);
				match(BOOL);
				}
				break;
			case 5:
				_localctx = new IdentifierAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(403);
				match(IDEN);
				}
				break;
			case 6:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(404);
				match(OPEN_STRING);
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (ENTER_EXPR_INTERP - 71)) | (1L << (ID_INTERP - 71)) | (1L << (ESCAPE - 71)) | (1L << (TEXT - 71)))) != 0)) {
					{
					{
					setState(405);
					string_part();
					}
					}
					setState(410);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(411);
				match(CLOSE_STRING);
				}
				break;
			case 7:
				_localctx = new ListAtomContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(412);
				match(LBRACKET);
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACKET))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OPEN_STRING - 64)) | (1L << (NUM - 64)) | (1L << (IDEN - 64)))) != 0)) {
					{
					setState(413);
					expr(0);
					setState(418);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(414);
						match(COMMA);
						setState(415);
						expr(0);
						}
						}
						setState(420);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(423);
				match(RBRACKET);
				}
				break;
			case 8:
				_localctx = new ObjectAtomContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(424);
				match(LBRACE);
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDEN) {
					{
					{
					setState(425);
					match(IDEN);
					setState(426);
					match(COLON);
					setState(427);
					expr(0);
					}
					setState(435);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(429);
						match(COMMA);
						setState(430);
						match(IDEN);
						setState(431);
						match(COLON);
						setState(432);
						expr(0);
						}
						}
						setState(437);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(440);
				match(RBRACE);
				}
				break;
			case 9:
				_localctx = new LambdaAtomContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(454);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDEN:
					{
					setState(441);
					match(IDEN);
					}
					break;
				case LPAREN:
					{
					setState(442);
					match(LPAREN);
					setState(451);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IDEN) {
						{
						setState(443);
						match(IDEN);
						setState(448);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(444);
							match(COMMA);
							setState(445);
							match(IDEN);
							}
							}
							setState(450);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(453);
					match(RPAREN);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(456);
				match(ARROW);
				setState(459);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(457);
					expr(0);
					}
					break;
				case 2:
					{
					setState(458);
					block();
					}
					break;
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

	public static class String_partContext extends ParserRuleContext {
		public String_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_part; }
	 
		public String_partContext() { }
		public void copyFrom(String_partContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TextStringPartContext extends String_partContext {
		public TerminalNode TEXT() { return getToken(MainFunctionParser.TEXT, 0); }
		public TextStringPartContext(String_partContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitTextStringPart(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprInterpPartContext extends String_partContext {
		public TerminalNode ENTER_EXPR_INTERP() { return getToken(MainFunctionParser.ENTER_EXPR_INTERP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(MainFunctionParser.RBRACE, 0); }
		public ExprInterpPartContext(String_partContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitExprInterpPart(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EscapeStringPartContext extends String_partContext {
		public TerminalNode ESCAPE() { return getToken(MainFunctionParser.ESCAPE, 0); }
		public EscapeStringPartContext(String_partContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitEscapeStringPart(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdInterpPartContext extends String_partContext {
		public TerminalNode ID_INTERP() { return getToken(MainFunctionParser.ID_INTERP, 0); }
		public IdInterpPartContext(String_partContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainFunctionParserVisitor ) return ((MainFunctionParserVisitor<? extends T>)visitor).visitIdInterpPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_partContext string_part() throws RecognitionException {
		String_partContext _localctx = new String_partContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_string_part);
		try {
			setState(470);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT:
				_localctx = new TextStringPartContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				match(TEXT);
				}
				break;
			case ESCAPE:
				_localctx = new EscapeStringPartContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				match(ESCAPE);
				}
				break;
			case ID_INTERP:
				_localctx = new IdInterpPartContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(465);
				match(ID_INTERP);
				}
				break;
			case ENTER_EXPR_INTERP:
				_localctx = new ExprInterpPartContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(466);
				match(ENTER_EXPR_INTERP);
				setState(467);
				expr(0);
				setState(468);
				match(RBRACE);
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
		case 23:
			return expr_sempred((ExprContext)_localctx, predIndex);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3T\u01db\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\5\2:\n\2\3\2\7\2=\n\2\f\2\16\2@\13\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3P\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\5\4W\n\4\3\5\3\5\3\5\3\6\3\6\5\6^\n\6\3\6\3\6\5\6b\n"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7j\n\7\f\7\16\7m\13\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\t\5\tv\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t~\n\t\f\t\16\t\u0081\13\t"+
		"\5\t\u0083\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u008c\n\t\f\t\16\t\u008f"+
		"\13\t\5\t\u0091\n\t\3\t\3\t\3\t\5\t\u0096\n\t\3\t\3\t\3\t\5\t\u009b\n"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ba\n\n\3\13\3"+
		"\13\3\13\3\13\7\13\u00c0\n\13\f\13\16\13\u00c3\13\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\5\f\u00cc\n\f\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u00d4\n\16"+
		"\3\17\3\17\7\17\u00d8\n\17\f\17\16\17\u00db\13\17\3\17\5\17\u00de\n\17"+
		"\3\17\3\17\3\20\3\20\3\20\5\20\u00e5\n\20\3\20\3\20\5\20\u00e9\n\20\3"+
		"\20\3\20\5\20\u00ed\n\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00f6"+
		"\n\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\7\25\u010c\n\25\f\25\16\25\u010f\13"+
		"\25\5\25\u0111\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u011b"+
		"\n\26\f\26\16\26\u011e\13\26\5\26\u0120\n\26\3\26\3\26\3\26\3\27\3\27"+
		"\7\27\u0127\n\27\f\27\16\27\u012a\13\27\3\27\3\27\5\27\u012e\n\27\3\27"+
		"\3\27\5\27\u0132\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u013b\n"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0147\n\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u016c\n\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\7\31\u0175\n\31\f\31\16\31\u0178\13\31\5\31\u017a\n\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u0189\n\31\3\31\3\31\7\31\u018d\n\31\f\31\16\31\u0190\13\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\7\32\u0199\n\32\f\32\16\32\u019c\13\32\3\32"+
		"\3\32\3\32\3\32\3\32\7\32\u01a3\n\32\f\32\16\32\u01a6\13\32\5\32\u01a8"+
		"\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u01b4\n\32"+
		"\f\32\16\32\u01b7\13\32\5\32\u01b9\n\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\7\32\u01c1\n\32\f\32\16\32\u01c4\13\32\5\32\u01c6\n\32\3\32\5\32\u01c9"+
		"\n\32\3\32\3\32\3\32\5\32\u01ce\n\32\5\32\u01d0\n\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\5\33\u01d9\n\33\3\33\2\3\60\34\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\n\4\2\21\21\32\32\4\2\'*99\3\2"+
		"+,\4\2CCRR\3\2.\60\3\2\61\62\3\2 #\3\2$%\2\u021e\29\3\2\2\2\4O\3\2\2\2"+
		"\6V\3\2\2\2\bX\3\2\2\2\na\3\2\2\2\fe\3\2\2\2\16p\3\2\2\2\20\u009a\3\2"+
		"\2\2\22\u00b9\3\2\2\2\24\u00bb\3\2\2\2\26\u00c7\3\2\2\2\30\u00cd\3\2\2"+
		"\2\32\u00d3\3\2\2\2\34\u00d5\3\2\2\2\36\u00e1\3\2\2\2 \u00f1\3\2\2\2\""+
		"\u00fa\3\2\2\2$\u00fd\3\2\2\2&\u0103\3\2\2\2(\u0106\3\2\2\2*\u0114\3\2"+
		"\2\2,\u0124\3\2\2\2.\u013a\3\2\2\2\60\u0146\3\2\2\2\62\u01cf\3\2\2\2\64"+
		"\u01d8\3\2\2\2\66\67\t\2\2\2\678\7\31\2\28:\7>\2\29\66\3\2\2\29:\3\2\2"+
		"\2:>\3\2\2\2;=\5\4\3\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2"+
		"\2@>\3\2\2\2AB\7\2\2\3B\3\3\2\2\2CD\5\6\4\2DE\7>\2\2EP\3\2\2\2FP\5,\27"+
		"\2GP\5\26\f\2HP\5\36\20\2IP\5 \21\2JP\5\"\22\2KP\5$\23\2LP\5\f\7\2MP\5"+
		"*\26\2NP\5\16\b\2OC\3\2\2\2OF\3\2\2\2OG\3\2\2\2OH\3\2\2\2OI\3\2\2\2OJ"+
		"\3\2\2\2OK\3\2\2\2OL\3\2\2\2OM\3\2\2\2ON\3\2\2\2P\5\3\2\2\2QW\5\24\13"+
		"\2RW\5\22\n\2SW\5&\24\2TW\5\b\5\2UW\5(\25\2VQ\3\2\2\2VR\3\2\2\2VS\3\2"+
		"\2\2VT\3\2\2\2VU\3\2\2\2W\7\3\2\2\2XY\7\3\2\2YZ\5\60\31\2Z\t\3\2\2\2["+
		"]\7\27\2\2\\^\5\60\31\2]\\\3\2\2\2]^\3\2\2\2^b\3\2\2\2_b\7\4\2\2`b\7\t"+
		"\2\2a[\3\2\2\2a_\3\2\2\2a`\3\2\2\2bc\3\2\2\2cd\7>\2\2d\13\3\2\2\2ef\7"+
		"\7\2\2fg\7E\2\2gk\7\65\2\2hj\5\20\t\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl"+
		"\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7\66\2\2o\r\3\2\2\2pq\7\r\2\2qr\7\24\2"+
		"\2rs\5\30\r\2s\17\3\2\2\2tv\7\23\2\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\7"+
		"\24\2\2xy\7E\2\2y\u0082\7\63\2\2z\177\7E\2\2{|\7@\2\2|~\7E\2\2}{\3\2\2"+
		"\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0083\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0082z\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0085\7\64\2\2\u0085\u009b\5\34\17\2\u0086\u0087\7\b\2\2\u0087\u0090"+
		"\7\63\2\2\u0088\u008d\7E\2\2\u0089\u008a\7@\2\2\u008a\u008c\7E\2\2\u008b"+
		"\u0089\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0088\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\7\64\2\2\u0093\u009b\5"+
		"\34\17\2\u0094\u0096\7\23\2\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2"+
		"\u0096\u0097\3\2\2\2\u0097\u0098\5\24\13\2\u0098\u0099\7>\2\2\u0099\u009b"+
		"\3\2\2\2\u009au\3\2\2\2\u009a\u0086\3\2\2\2\u009a\u0095\3\2\2\2\u009b"+
		"\21\3\2\2\2\u009c\u009d\7E\2\2\u009d\u009e\t\3\2\2\u009e\u00ba\5\60\31"+
		"\2\u009f\u00a0\7E\2\2\u00a0\u00ba\t\4\2\2\u00a1\u00a2\5\60\31\2\u00a2"+
		"\u00a3\7\67\2\2\u00a3\u00a4\5\60\31\2\u00a4\u00a5\78\2\2\u00a5\u00a6\t"+
		"\3\2\2\u00a6\u00a7\5\60\31\2\u00a7\u00ba\3\2\2\2\u00a8\u00a9\5\60\31\2"+
		"\u00a9\u00aa\7\67\2\2\u00aa\u00ab\5\60\31\2\u00ab\u00ac\78\2\2\u00ac\u00ad"+
		"\t\4\2\2\u00ad\u00ba\3\2\2\2\u00ae\u00af\5\60\31\2\u00af\u00b0\7=\2\2"+
		"\u00b0\u00b1\7E\2\2\u00b1\u00b2\t\3\2\2\u00b2\u00b3\5\60\31\2\u00b3\u00ba"+
		"\3\2\2\2\u00b4\u00b5\5\60\31\2\u00b5\u00b6\7=\2\2\u00b6\u00b7\7E\2\2\u00b7"+
		"\u00b8\t\4\2\2\u00b8\u00ba\3\2\2\2\u00b9\u009c\3\2\2\2\u00b9\u009f\3\2"+
		"\2\2\u00b9\u00a1\3\2\2\2\u00b9\u00a8\3\2\2\2\u00b9\u00ae\3\2\2\2\u00b9"+
		"\u00b4\3\2\2\2\u00ba\23\3\2\2\2\u00bb\u00bc\7\34\2\2\u00bc\u00c1\7E\2"+
		"\2\u00bd\u00be\7@\2\2\u00be\u00c0\7E\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c3"+
		"\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c4\u00c5\79\2\2\u00c5\u00c6\5\60\31\2\u00c6\25\3\2\2"+
		"\2\u00c7\u00c8\7\16\2\2\u00c8\u00cb\5\30\r\2\u00c9\u00ca\7\13\2\2\u00ca"+
		"\u00cc\5\32\16\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\27\3\2"+
		"\2\2\u00cd\u00ce\5\60\31\2\u00ce\u00cf\5\32\16\2\u00cf\31\3\2\2\2\u00d0"+
		"\u00d4\5\34\17\2\u00d1\u00d4\5\4\3\2\u00d2\u00d4\5\n\6\2\u00d3\u00d0\3"+
		"\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\33\3\2\2\2\u00d5"+
		"\u00d9\7\65\2\2\u00d6\u00d8\5\4\3\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3"+
		"\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dd\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00dc\u00de\5\n\6\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2"+
		"\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\7\66\2\2\u00e0\35\3\2\2\2\u00e1\u00e2"+
		"\7\f\2\2\u00e2\u00e4\7\63\2\2\u00e3\u00e5\5\6\4\2\u00e4\u00e3\3\2\2\2"+
		"\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\7>\2\2\u00e7\u00e9"+
		"\5\60\31\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2"+
		"\u00ea\u00ec\7>\2\2\u00eb\u00ed\5\6\4\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\7\64\2\2\u00ef\u00f0\5\32\16"+
		"\2\u00f0\37\3\2\2\2\u00f1\u00f2\7\f\2\2\u00f2\u00f5\7E\2\2\u00f3\u00f4"+
		"\7@\2\2\u00f4\u00f6\7E\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f8\7\17\2\2\u00f8\u00f9\5\30\r\2\u00f9!\3\2\2"+
		"\2\u00fa\u00fb\7\35\2\2\u00fb\u00fc\5\30\r\2\u00fc#\3\2\2\2\u00fd\u00fe"+
		"\7\n\2\2\u00fe\u00ff\5\32\16\2\u00ff\u0100\7\35\2\2\u0100\u0101\5\60\31"+
		"\2\u0101\u0102\7>\2\2\u0102%\3\2\2\2\u0103\u0104\7\22\2\2\u0104\u0105"+
		"\5\60\31\2\u0105\'\3\2\2\2\u0106\u0107\5\60\31\2\u0107\u0110\7\63\2\2"+
		"\u0108\u010d\5\60\31\2\u0109\u010a\7@\2\2\u010a\u010c\5\60\31\2\u010b"+
		"\u0109\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2"+
		"\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0108\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\7\64\2\2\u0113)\3\2\2\2"+
		"\u0114\u0115\7\24\2\2\u0115\u0116\7E\2\2\u0116\u011f\7\63\2\2\u0117\u011c"+
		"\7E\2\2\u0118\u0119\7@\2\2\u0119\u011b\7E\2\2\u011a\u0118\3\2\2\2\u011b"+
		"\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0120\3\2"+
		"\2\2\u011e\u011c\3\2\2\2\u011f\u0117\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u0122\7\64\2\2\u0122\u0123\5\34\17\2\u0123+\3\2\2"+
		"\2\u0124\u0128\t\5\2\2\u0125\u0127\5.\30\2\u0126\u0125\3\2\2\2\u0127\u012a"+
		"\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0131\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012b\u012d\7O\2\2\u012c\u012e\5\60\31\2\u012d\u012c\3"+
		"\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0132\5\32\16\2\u0130"+
		"\u0132\7S\2\2\u0131\u012b\3\2\2\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2"+
		"\2\2\u0132-\3\2\2\2\u0133\u013b\7Q\2\2\u0134\u013b\7P\2\2\u0135\u0136"+
		"\7N\2\2\u0136\u0137\5\60\31\2\u0137\u0138\7\66\2\2\u0138\u013b\3\2\2\2"+
		"\u0139\u013b\7T\2\2\u013a\u0133\3\2\2\2\u013a\u0134\3\2\2\2\u013a\u0135"+
		"\3\2\2\2\u013a\u0139\3\2\2\2\u013b/\3\2\2\2\u013c\u013d\b\31\1\2\u013d"+
		"\u013e\7\63\2\2\u013e\u013f\5\60\31\2\u013f\u0140\7\64\2\2\u0140\u0147"+
		"\3\2\2\2\u0141\u0142\7\62\2\2\u0142\u0147\5\60\31\17\u0143\u0144\7&\2"+
		"\2\u0144\u0147\5\60\31\16\u0145\u0147\5\62\32\2\u0146\u013c\3\2\2\2\u0146"+
		"\u0141\3\2\2\2\u0146\u0143\3\2\2\2\u0146\u0145\3\2\2\2\u0147\u018e\3\2"+
		"\2\2\u0148\u0149\f\r\2\2\u0149\u014a\7:\2\2\u014a\u018d\5\60\31\16\u014b"+
		"\u014c\f\f\2\2\u014c\u014d\7-\2\2\u014d\u018d\5\60\31\f\u014e\u014f\f"+
		"\13\2\2\u014f\u0150\t\6\2\2\u0150\u018d\5\60\31\f\u0151\u0152\f\n\2\2"+
		"\u0152\u0153\t\7\2\2\u0153\u018d\5\60\31\13\u0154\u0155\f\t\2\2\u0155"+
		"\u0156\t\b\2\2\u0156\u018d\5\60\31\n\u0157\u0158\f\b\2\2\u0158\u0159\t"+
		"\t\2\2\u0159\u018d\5\60\31\t\u015a\u015b\f\7\2\2\u015b\u015c\7\20\2\2"+
		"\u015c\u018d\5\60\31\b\u015d\u015e\f\6\2\2\u015e\u015f\7\36\2\2\u015f"+
		"\u018d\5\60\31\7\u0160\u0161\f\5\2\2\u0161\u0162\7\37\2\2\u0162\u018d"+
		"\5\60\31\6\u0163\u0164\f\4\2\2\u0164\u0165\7\16\2\2\u0165\u0166\5\60\31"+
		"\2\u0166\u0167\7\13\2\2\u0167\u0168\5\60\31\4\u0168\u018d\3\2\2\2\u0169"+
		"\u016b\f\23\2\2\u016a\u016c\7;\2\2\u016b\u016a\3\2\2\2\u016b\u016c\3\2"+
		"\2\2\u016c\u016d\3\2\2\2\u016d\u016e\7=\2\2\u016e\u018d\7E\2\2\u016f\u0170"+
		"\f\22\2\2\u0170\u0179\7\63\2\2\u0171\u0176\5\60\31\2\u0172\u0173\7@\2"+
		"\2\u0173\u0175\5\60\31\2\u0174\u0172\3\2\2\2\u0175\u0178\3\2\2\2\u0176"+
		"\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2"+
		"\2\2\u0179\u0171\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b"+
		"\u018d\7\64\2\2\u017c\u017d\f\21\2\2\u017d\u017e\7\67\2\2\u017e\u017f"+
		"\5\60\31\2\u017f\u0180\78\2\2\u0180\u018d\3\2\2\2\u0181\u0182\f\20\2\2"+
		"\u0182\u0183\7\67\2\2\u0183\u0184\5\60\31\2\u0184\u0185\7?\2\2\u0185\u0188"+
		"\5\60\31\2\u0186\u0187\7?\2\2\u0187\u0189\5\60\31\2\u0188\u0186\3\2\2"+
		"\2\u0188\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\78\2\2\u018b\u018d"+
		"\3\2\2\2\u018c\u0148\3\2\2\2\u018c\u014b\3\2\2\2\u018c\u014e\3\2\2\2\u018c"+
		"\u0151\3\2\2\2\u018c\u0154\3\2\2\2\u018c\u0157\3\2\2\2\u018c\u015a\3\2"+
		"\2\2\u018c\u015d\3\2\2\2\u018c\u0160\3\2\2\2\u018c\u0163\3\2\2\2\u018c"+
		"\u0169\3\2\2\2\u018c\u016f\3\2\2\2\u018c\u017c\3\2\2\2\u018c\u0181\3\2"+
		"\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\61\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u01d0\7D\2\2\u0192\u01d0\7\25\2"+
		"\2\u0193\u01d0\7\31\2\2\u0194\u01d0\7\5\2\2\u0195\u01d0\7E\2\2\u0196\u019a"+
		"\7B\2\2\u0197\u0199\5\64\33\2\u0198\u0197\3\2\2\2\u0199\u019c\3\2\2\2"+
		"\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019d\3\2\2\2\u019c\u019a"+
		"\3\2\2\2\u019d\u01d0\7M\2\2\u019e\u01a7\7\67\2\2\u019f\u01a4\5\60\31\2"+
		"\u01a0\u01a1\7@\2\2\u01a1\u01a3\5\60\31\2\u01a2\u01a0\3\2\2\2\u01a3\u01a6"+
		"\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6"+
		"\u01a4\3\2\2\2\u01a7\u019f\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\3\2"+
		"\2\2\u01a9\u01d0\78\2\2\u01aa\u01b8\7\65\2\2\u01ab\u01ac\7E\2\2\u01ac"+
		"\u01ad\7?\2\2\u01ad\u01ae\5\60\31\2\u01ae\u01b5\3\2\2\2\u01af\u01b0\7"+
		"@\2\2\u01b0\u01b1\7E\2\2\u01b1\u01b2\7?\2\2\u01b2\u01b4\5\60\31\2\u01b3"+
		"\u01af\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2"+
		"\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01ab\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01d0\7\66\2\2\u01bb\u01c9\7"+
		"E\2\2\u01bc\u01c5\7\63\2\2\u01bd\u01c2\7E\2\2\u01be\u01bf\7@\2\2\u01bf"+
		"\u01c1\7E\2\2\u01c0\u01be\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c0\3\2"+
		"\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5"+
		"\u01bd\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9\7\64"+
		"\2\2\u01c8\u01bb\3\2\2\2\u01c8\u01bc\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca"+
		"\u01cd\7A\2\2\u01cb\u01ce\5\60\31\2\u01cc\u01ce\5\34\17\2\u01cd\u01cb"+
		"\3\2\2\2\u01cd\u01cc\3\2\2\2\u01ce\u01d0\3\2\2\2\u01cf\u0191\3\2\2\2\u01cf"+
		"\u0192\3\2\2\2\u01cf\u0193\3\2\2\2\u01cf\u0194\3\2\2\2\u01cf\u0195\3\2"+
		"\2\2\u01cf\u0196\3\2\2\2\u01cf\u019e\3\2\2\2\u01cf\u01aa\3\2\2\2\u01cf"+
		"\u01c8\3\2\2\2\u01d0\63\3\2\2\2\u01d1\u01d9\7L\2\2\u01d2\u01d9\7K\2\2"+
		"\u01d3\u01d9\7J\2\2\u01d4\u01d5\7I\2\2\u01d5\u01d6\5\60\31\2\u01d6\u01d7"+
		"\7\66\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01d1\3\2\2\2\u01d8\u01d2\3\2\2\2"+
		"\u01d8\u01d3\3\2\2\2\u01d8\u01d4\3\2\2\2\u01d9\65\3\2\2\2\649>OV]aku\177"+
		"\u0082\u008d\u0090\u0095\u009a\u00b9\u00c1\u00cb\u00d3\u00d9\u00dd\u00e4"+
		"\u00e8\u00ec\u00f5\u010d\u0110\u011c\u011f\u0128\u012d\u0131\u013a\u0146"+
		"\u016b\u0176\u0179\u0188\u018c\u018e\u019a\u01a4\u01a7\u01b5\u01b8\u01c2"+
		"\u01c5\u01c8\u01cd\u01cf\u01d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}