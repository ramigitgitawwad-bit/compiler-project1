// Generated from d:/Compiler/Compiler_Project/grammar/TemplateParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TemplateParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HTML_DOCTYPE=1, HTML_COMMENT=2, STYLE_OPEN=3, SCRIPT_OPEN=4, JINJA_EXPR_START=5, 
		JINJA_STMT_START=6, JINJA_COMMENT=7, HTML_TAG_OPEN=8, HTML_TAG_CLOSE_START=9, 
		HTML_SELF_CLOSE=10, HTML_TAG_END=11, HTML_TAG_NAME=12, HTML_ATTR_NAME=13, 
		HTML_ATTR_EQUALS=14, HTML_ATTR_VALUE=15, HTML_TEXT=16, HTML_WS=17, CSS_STYLE_CLOSE=18, 
		CSS_COMMENT=19, CSS_ID_SELECTOR=20, CSS_CLASS_SELECTOR=21, CSS_ELEMENT_SELECTOR=22, 
		CSS_LBRACE=23, CSS_RBRACE=24, CSS_COLON=25, CSS_SEMI=26, CSS_COMMA=27, 
		CSS_NUMBER=28, CSS_UNIT=29, CSS_COLOR=30, CSS_URL=31, CSS_STRING=32, CSS_IDENTIFIER=33, 
		CSS_WS=34, SCRIPT_CLOSE=35, SCRIPT_TEXT=36, JINJA_EXPR_END=37, JINJA_ID=38, 
		JINJA_INT=39, JINJA_FLOAT=40, JINJA_STRING=41, JINJA_DOT=42, JINJA_ARITH_OP=43, 
		JINJA_COMP_OP=44, JINJA_BOOL_OP=45, JINJA_LPAREN=46, JINJA_RPAREN=47, 
		JINJA_COMMA=48, JINJA_WS=49, JINJA_STMT_END=50, JINJA_IF=51, JINJA_ELSE=52, 
		JINJA_ELIF=53, JINJA_ENDIF=54, JINJA_FOR=55, JINJA_IN=56, JINJA_ENDFOR=57, 
		JINJA_BLOCK=58, JINJA_ENDBLOCK=59, JINJA_STMT_ID=60, JINJA_STMT_INT=61, 
		JINJA_STMT_STRING=62, JINJA_STMT_DOT=63, JINJA_OP=64, JINJA_STMT_WS=65;
	public static final int
		RULE_template = 0, RULE_element = 1, RULE_htmlElement = 2, RULE_attribute = 3, 
		RULE_htmlText = 4, RULE_jinjaStatement = 5, RULE_jinjaIf = 6, RULE_jinjaFor = 7, 
		RULE_jinjaExpression = 8, RULE_condition = 9, RULE_expression = 10, RULE_cssBlock = 11, 
		RULE_cssRule = 12, RULE_declaration = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"template", "element", "htmlElement", "attribute", "htmlText", "jinjaStatement", 
			"jinjaIf", "jinjaFor", "jinjaExpression", "condition", "expression", 
			"cssBlock", "cssRule", "declaration"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'<style>'", "'<script>'", "'{{'", "'{%'", null, "'<'", 
			"'</'", "'/>'", "'>'", null, null, "'='", null, null, null, "'</style>'", 
			null, null, null, null, "'{'", "'}'", "':'", "';'", "','", null, null, 
			null, null, null, null, null, "'</script>'", null, "'}}'", null, null, 
			null, null, null, null, null, null, null, null, null, null, "'%}'", "'if'", 
			"'else'", "'elif'", "'endif'", "'for'", "'in'", "'endfor'", "'block'", 
			"'endblock'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HTML_DOCTYPE", "HTML_COMMENT", "STYLE_OPEN", "SCRIPT_OPEN", "JINJA_EXPR_START", 
			"JINJA_STMT_START", "JINJA_COMMENT", "HTML_TAG_OPEN", "HTML_TAG_CLOSE_START", 
			"HTML_SELF_CLOSE", "HTML_TAG_END", "HTML_TAG_NAME", "HTML_ATTR_NAME", 
			"HTML_ATTR_EQUALS", "HTML_ATTR_VALUE", "HTML_TEXT", "HTML_WS", "CSS_STYLE_CLOSE", 
			"CSS_COMMENT", "CSS_ID_SELECTOR", "CSS_CLASS_SELECTOR", "CSS_ELEMENT_SELECTOR", 
			"CSS_LBRACE", "CSS_RBRACE", "CSS_COLON", "CSS_SEMI", "CSS_COMMA", "CSS_NUMBER", 
			"CSS_UNIT", "CSS_COLOR", "CSS_URL", "CSS_STRING", "CSS_IDENTIFIER", "CSS_WS", 
			"SCRIPT_CLOSE", "SCRIPT_TEXT", "JINJA_EXPR_END", "JINJA_ID", "JINJA_INT", 
			"JINJA_FLOAT", "JINJA_STRING", "JINJA_DOT", "JINJA_ARITH_OP", "JINJA_COMP_OP", 
			"JINJA_BOOL_OP", "JINJA_LPAREN", "JINJA_RPAREN", "JINJA_COMMA", "JINJA_WS", 
			"JINJA_STMT_END", "JINJA_IF", "JINJA_ELSE", "JINJA_ELIF", "JINJA_ENDIF", 
			"JINJA_FOR", "JINJA_IN", "JINJA_ENDFOR", "JINJA_BLOCK", "JINJA_ENDBLOCK", 
			"JINJA_STMT_ID", "JINJA_STMT_INT", "JINJA_STMT_STRING", "JINJA_STMT_DOT", 
			"JINJA_OP", "JINJA_STMT_WS"
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
	public String getGrammarFileName() { return "TemplateParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TemplateParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TemplateParser.EOF, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_template);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 65896L) != 0)) {
				{
				{
				setState(28);
				element();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementContext extends ParserRuleContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public JinjaStatementContext jinjaStatement() {
			return getRuleContext(JinjaStatementContext.class,0);
		}
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public HtmlTextContext htmlText() {
			return getRuleContext(HtmlTextContext.class,0);
		}
		public CssBlockContext cssBlock() {
			return getRuleContext(CssBlockContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		try {
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_TAG_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				htmlElement();
				}
				break;
			case JINJA_STMT_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				jinjaStatement();
				}
				break;
			case JINJA_EXPR_START:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				jinjaExpression();
				}
				break;
			case HTML_TEXT:
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				htmlText();
				}
				break;
			case STYLE_OPEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(40);
				cssBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends ParserRuleContext {
		public TerminalNode HTML_TAG_OPEN() { return getToken(TemplateParser.HTML_TAG_OPEN, 0); }
		public List<TerminalNode> HTML_TAG_NAME() { return getTokens(TemplateParser.HTML_TAG_NAME); }
		public TerminalNode HTML_TAG_NAME(int i) {
			return getToken(TemplateParser.HTML_TAG_NAME, i);
		}
		public List<TerminalNode> HTML_TAG_END() { return getTokens(TemplateParser.HTML_TAG_END); }
		public TerminalNode HTML_TAG_END(int i) {
			return getToken(TemplateParser.HTML_TAG_END, i);
		}
		public TerminalNode HTML_TAG_CLOSE_START() { return getToken(TemplateParser.HTML_TAG_CLOSE_START, 0); }
		public TerminalNode HTML_SELF_CLOSE() { return getToken(TemplateParser.HTML_SELF_CLOSE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(HTML_TAG_OPEN);
			setState(44);
			match(HTML_TAG_NAME);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HTML_ATTR_NAME) {
				{
				{
				setState(45);
				attribute();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_TAG_END:
				{
				setState(51);
				match(HTML_TAG_END);
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 65896L) != 0)) {
					{
					{
					setState(52);
					element();
					}
					}
					setState(57);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(58);
				match(HTML_TAG_CLOSE_START);
				setState(59);
				match(HTML_TAG_NAME);
				setState(60);
				match(HTML_TAG_END);
				}
				break;
			case HTML_SELF_CLOSE:
				{
				setState(61);
				match(HTML_SELF_CLOSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode HTML_ATTR_NAME() { return getToken(TemplateParser.HTML_ATTR_NAME, 0); }
		public TerminalNode HTML_ATTR_EQUALS() { return getToken(TemplateParser.HTML_ATTR_EQUALS, 0); }
		public TerminalNode HTML_ATTR_VALUE() { return getToken(TemplateParser.HTML_ATTR_VALUE, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(HTML_ATTR_NAME);
			setState(65);
			match(HTML_ATTR_EQUALS);
			setState(66);
			match(HTML_ATTR_VALUE);
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
	public static class HtmlTextContext extends ParserRuleContext {
		public TerminalNode HTML_TEXT() { return getToken(TemplateParser.HTML_TEXT, 0); }
		public HtmlTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlText; }
	}

	public final HtmlTextContext htmlText() throws RecognitionException {
		HtmlTextContext _localctx = new HtmlTextContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_htmlText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(HTML_TEXT);
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
	public static class JinjaStatementContext extends ParserRuleContext {
		public JinjaIfContext jinjaIf() {
			return getRuleContext(JinjaIfContext.class,0);
		}
		public JinjaForContext jinjaFor() {
			return getRuleContext(JinjaForContext.class,0);
		}
		public JinjaStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaStatement; }
	}

	public final JinjaStatementContext jinjaStatement() throws RecognitionException {
		JinjaStatementContext _localctx = new JinjaStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_jinjaStatement);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				jinjaIf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				jinjaFor();
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
	public static class JinjaIfContext extends ParserRuleContext {
		public List<TerminalNode> JINJA_STMT_START() { return getTokens(TemplateParser.JINJA_STMT_START); }
		public TerminalNode JINJA_STMT_START(int i) {
			return getToken(TemplateParser.JINJA_STMT_START, i);
		}
		public TerminalNode JINJA_IF() { return getToken(TemplateParser.JINJA_IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<TerminalNode> JINJA_STMT_END() { return getTokens(TemplateParser.JINJA_STMT_END); }
		public TerminalNode JINJA_STMT_END(int i) {
			return getToken(TemplateParser.JINJA_STMT_END, i);
		}
		public TerminalNode JINJA_ENDIF() { return getToken(TemplateParser.JINJA_ENDIF, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode JINJA_ELSE() { return getToken(TemplateParser.JINJA_ELSE, 0); }
		public JinjaIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaIf; }
	}

	public final JinjaIfContext jinjaIf() throws RecognitionException {
		JinjaIfContext _localctx = new JinjaIfContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_jinjaIf);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(JINJA_STMT_START);
			setState(75);
			match(JINJA_IF);
			setState(76);
			condition();
			setState(77);
			match(JINJA_STMT_END);
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(78);
					element();
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(84);
				match(JINJA_STMT_START);
				setState(85);
				match(JINJA_ELSE);
				setState(86);
				match(JINJA_STMT_END);
				setState(90);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(87);
						element();
						}
						} 
					}
					setState(92);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
				break;
			}
			setState(95);
			match(JINJA_STMT_START);
			setState(96);
			match(JINJA_ENDIF);
			setState(97);
			match(JINJA_STMT_END);
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
	public static class JinjaForContext extends ParserRuleContext {
		public List<TerminalNode> JINJA_STMT_START() { return getTokens(TemplateParser.JINJA_STMT_START); }
		public TerminalNode JINJA_STMT_START(int i) {
			return getToken(TemplateParser.JINJA_STMT_START, i);
		}
		public TerminalNode JINJA_FOR() { return getToken(TemplateParser.JINJA_FOR, 0); }
		public List<TerminalNode> JINJA_STMT_ID() { return getTokens(TemplateParser.JINJA_STMT_ID); }
		public TerminalNode JINJA_STMT_ID(int i) {
			return getToken(TemplateParser.JINJA_STMT_ID, i);
		}
		public TerminalNode JINJA_IN() { return getToken(TemplateParser.JINJA_IN, 0); }
		public List<TerminalNode> JINJA_STMT_END() { return getTokens(TemplateParser.JINJA_STMT_END); }
		public TerminalNode JINJA_STMT_END(int i) {
			return getToken(TemplateParser.JINJA_STMT_END, i);
		}
		public TerminalNode JINJA_ENDFOR() { return getToken(TemplateParser.JINJA_ENDFOR, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public JinjaForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaFor; }
	}

	public final JinjaForContext jinjaFor() throws RecognitionException {
		JinjaForContext _localctx = new JinjaForContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_jinjaFor);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(JINJA_STMT_START);
			setState(100);
			match(JINJA_FOR);
			setState(101);
			match(JINJA_STMT_ID);
			setState(102);
			match(JINJA_IN);
			setState(103);
			match(JINJA_STMT_ID);
			setState(104);
			match(JINJA_STMT_END);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(105);
					element();
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(111);
			match(JINJA_STMT_START);
			setState(112);
			match(JINJA_ENDFOR);
			setState(113);
			match(JINJA_STMT_END);
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
	public static class JinjaExpressionContext extends ParserRuleContext {
		public TerminalNode JINJA_EXPR_START() { return getToken(TemplateParser.JINJA_EXPR_START, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode JINJA_EXPR_END() { return getToken(TemplateParser.JINJA_EXPR_END, 0); }
		public JinjaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaExpression; }
	}

	public final JinjaExpressionContext jinjaExpression() throws RecognitionException {
		JinjaExpressionContext _localctx = new JinjaExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_jinjaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(JINJA_EXPR_START);
			setState(116);
			expression();
			setState(117);
			match(JINJA_EXPR_END);
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
	public static class ConditionContext extends ParserRuleContext {
		public List<TerminalNode> JINJA_STMT_ID() { return getTokens(TemplateParser.JINJA_STMT_ID); }
		public TerminalNode JINJA_STMT_ID(int i) {
			return getToken(TemplateParser.JINJA_STMT_ID, i);
		}
		public TerminalNode JINJA_OP() { return getToken(TemplateParser.JINJA_OP, 0); }
		public TerminalNode JINJA_STMT_INT() { return getToken(TemplateParser.JINJA_STMT_INT, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(JINJA_STMT_ID);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JINJA_OP) {
				{
				setState(120);
				match(JINJA_OP);
				setState(121);
				_la = _input.LA(1);
				if ( !(_la==JINJA_STMT_ID || _la==JINJA_STMT_INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
	public static class ExpressionContext extends ParserRuleContext {
		public List<TerminalNode> JINJA_ID() { return getTokens(TemplateParser.JINJA_ID); }
		public TerminalNode JINJA_ID(int i) {
			return getToken(TemplateParser.JINJA_ID, i);
		}
		public List<TerminalNode> JINJA_DOT() { return getTokens(TemplateParser.JINJA_DOT); }
		public TerminalNode JINJA_DOT(int i) {
			return getToken(TemplateParser.JINJA_DOT, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(JINJA_ID);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JINJA_DOT) {
				{
				{
				setState(125);
				match(JINJA_DOT);
				setState(126);
				match(JINJA_ID);
				}
				}
				setState(131);
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
	public static class CssBlockContext extends ParserRuleContext {
		public TerminalNode STYLE_OPEN() { return getToken(TemplateParser.STYLE_OPEN, 0); }
		public TerminalNode CSS_STYLE_CLOSE() { return getToken(TemplateParser.CSS_STYLE_CLOSE, 0); }
		public List<CssRuleContext> cssRule() {
			return getRuleContexts(CssRuleContext.class);
		}
		public CssRuleContext cssRule(int i) {
			return getRuleContext(CssRuleContext.class,i);
		}
		public CssBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssBlock; }
	}

	public final CssBlockContext cssBlock() throws RecognitionException {
		CssBlockContext _localctx = new CssBlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cssBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(STYLE_OPEN);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) {
				{
				{
				setState(133);
				cssRule();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			match(CSS_STYLE_CLOSE);
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
	public static class CssRuleContext extends ParserRuleContext {
		public TerminalNode CSS_LBRACE() { return getToken(TemplateParser.CSS_LBRACE, 0); }
		public TerminalNode CSS_RBRACE() { return getToken(TemplateParser.CSS_RBRACE, 0); }
		public TerminalNode CSS_ID_SELECTOR() { return getToken(TemplateParser.CSS_ID_SELECTOR, 0); }
		public TerminalNode CSS_CLASS_SELECTOR() { return getToken(TemplateParser.CSS_CLASS_SELECTOR, 0); }
		public TerminalNode CSS_ELEMENT_SELECTOR() { return getToken(TemplateParser.CSS_ELEMENT_SELECTOR, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public CssRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssRule; }
	}

	public final CssRuleContext cssRule() throws RecognitionException {
		CssRuleContext _localctx = new CssRuleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cssRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(142);
			match(CSS_LBRACE);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_IDENTIFIER) {
				{
				{
				setState(143);
				declaration();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			match(CSS_RBRACE);
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
	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode CSS_IDENTIFIER() { return getToken(TemplateParser.CSS_IDENTIFIER, 0); }
		public TerminalNode CSS_COLON() { return getToken(TemplateParser.CSS_COLON, 0); }
		public TerminalNode CSS_SEMI() { return getToken(TemplateParser.CSS_SEMI, 0); }
		public TerminalNode CSS_NUMBER() { return getToken(TemplateParser.CSS_NUMBER, 0); }
		public TerminalNode CSS_UNIT() { return getToken(TemplateParser.CSS_UNIT, 0); }
		public TerminalNode CSS_COLOR() { return getToken(TemplateParser.CSS_COLOR, 0); }
		public TerminalNode CSS_STRING() { return getToken(TemplateParser.CSS_STRING, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(CSS_IDENTIFIER);
			setState(152);
			match(CSS_COLON);
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_NUMBER:
				{
				setState(153);
				match(CSS_NUMBER);
				setState(154);
				match(CSS_UNIT);
				}
				break;
			case CSS_COLOR:
				{
				setState(155);
				match(CSS_COLOR);
				}
				break;
			case CSS_STRING:
				{
				setState(156);
				match(CSS_STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(159);
			match(CSS_SEMI);
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
		"\u0004\u0001A\u00a2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0005\u0000\u001e\b\u0000\n\u0000"+
		"\f\u0000!\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001*\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002/\b\u0002\n\u0002\f\u00022\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u00026\b\u0002\n\u0002\f\u00029\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002?\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0003\u0005I\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006P\b\u0006\n\u0006\f\u0006S\t"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006Y\b"+
		"\u0006\n\u0006\f\u0006\\\t\u0006\u0003\u0006^\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007k\b\u0007\n\u0007"+
		"\f\u0007n\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003\t{\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u0080\b\n\n\n\f\n\u0083\t\n\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u0087\b\u000b\n\u000b\f\u000b\u008a\t\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u0091\b\f\n\f\f\f\u0094\t"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u009e\b\r\u0001\r\u0001\r\u0001\r\u0000\u0000\u000e\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0002\u0001"+
		"\u0000<=\u0001\u0000\u0014\u0016\u00a6\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0002)\u0001\u0000\u0000\u0000\u0004+\u0001\u0000\u0000\u0000\u0006@"+
		"\u0001\u0000\u0000\u0000\bD\u0001\u0000\u0000\u0000\nH\u0001\u0000\u0000"+
		"\u0000\fJ\u0001\u0000\u0000\u0000\u000ec\u0001\u0000\u0000\u0000\u0010"+
		"s\u0001\u0000\u0000\u0000\u0012w\u0001\u0000\u0000\u0000\u0014|\u0001"+
		"\u0000\u0000\u0000\u0016\u0084\u0001\u0000\u0000\u0000\u0018\u008d\u0001"+
		"\u0000\u0000\u0000\u001a\u0097\u0001\u0000\u0000\u0000\u001c\u001e\u0003"+
		"\u0002\u0001\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e!\u0001\u0000"+
		"\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000"+
		"\u0000 \"\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\"#\u0005"+
		"\u0000\u0000\u0001#\u0001\u0001\u0000\u0000\u0000$*\u0003\u0004\u0002"+
		"\u0000%*\u0003\n\u0005\u0000&*\u0003\u0010\b\u0000\'*\u0003\b\u0004\u0000"+
		"(*\u0003\u0016\u000b\u0000)$\u0001\u0000\u0000\u0000)%\u0001\u0000\u0000"+
		"\u0000)&\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)(\u0001\u0000"+
		"\u0000\u0000*\u0003\u0001\u0000\u0000\u0000+,\u0005\b\u0000\u0000,0\u0005"+
		"\f\u0000\u0000-/\u0003\u0006\u0003\u0000.-\u0001\u0000\u0000\u0000/2\u0001"+
		"\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u0000"+
		"1>\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000037\u0005\u000b\u0000"+
		"\u000046\u0003\u0002\u0001\u000054\u0001\u0000\u0000\u000069\u0001\u0000"+
		"\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008:\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u0000:;\u0005\t\u0000\u0000;<\u0005"+
		"\f\u0000\u0000<?\u0005\u000b\u0000\u0000=?\u0005\n\u0000\u0000>3\u0001"+
		"\u0000\u0000\u0000>=\u0001\u0000\u0000\u0000?\u0005\u0001\u0000\u0000"+
		"\u0000@A\u0005\r\u0000\u0000AB\u0005\u000e\u0000\u0000BC\u0005\u000f\u0000"+
		"\u0000C\u0007\u0001\u0000\u0000\u0000DE\u0005\u0010\u0000\u0000E\t\u0001"+
		"\u0000\u0000\u0000FI\u0003\f\u0006\u0000GI\u0003\u000e\u0007\u0000HF\u0001"+
		"\u0000\u0000\u0000HG\u0001\u0000\u0000\u0000I\u000b\u0001\u0000\u0000"+
		"\u0000JK\u0005\u0006\u0000\u0000KL\u00053\u0000\u0000LM\u0003\u0012\t"+
		"\u0000MQ\u00052\u0000\u0000NP\u0003\u0002\u0001\u0000ON\u0001\u0000\u0000"+
		"\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000"+
		"\u0000\u0000R]\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000TU\u0005"+
		"\u0006\u0000\u0000UV\u00054\u0000\u0000VZ\u00052\u0000\u0000WY\u0003\u0002"+
		"\u0001\u0000XW\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001"+
		"\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000"+
		"\\Z\u0001\u0000\u0000\u0000]T\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000"+
		"\u0000^_\u0001\u0000\u0000\u0000_`\u0005\u0006\u0000\u0000`a\u00056\u0000"+
		"\u0000ab\u00052\u0000\u0000b\r\u0001\u0000\u0000\u0000cd\u0005\u0006\u0000"+
		"\u0000de\u00057\u0000\u0000ef\u0005<\u0000\u0000fg\u00058\u0000\u0000"+
		"gh\u0005<\u0000\u0000hl\u00052\u0000\u0000ik\u0003\u0002\u0001\u0000j"+
		"i\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000"+
		"\u0000lm\u0001\u0000\u0000\u0000mo\u0001\u0000\u0000\u0000nl\u0001\u0000"+
		"\u0000\u0000op\u0005\u0006\u0000\u0000pq\u00059\u0000\u0000qr\u00052\u0000"+
		"\u0000r\u000f\u0001\u0000\u0000\u0000st\u0005\u0005\u0000\u0000tu\u0003"+
		"\u0014\n\u0000uv\u0005%\u0000\u0000v\u0011\u0001\u0000\u0000\u0000wz\u0005"+
		"<\u0000\u0000xy\u0005@\u0000\u0000y{\u0007\u0000\u0000\u0000zx\u0001\u0000"+
		"\u0000\u0000z{\u0001\u0000\u0000\u0000{\u0013\u0001\u0000\u0000\u0000"+
		"|\u0081\u0005&\u0000\u0000}~\u0005*\u0000\u0000~\u0080\u0005&\u0000\u0000"+
		"\u007f}\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081"+
		"\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082"+
		"\u0015\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084"+
		"\u0088\u0005\u0003\u0000\u0000\u0085\u0087\u0003\u0018\f\u0000\u0086\u0085"+
		"\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008b"+
		"\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0005\u0012\u0000\u0000\u008c\u0017\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0007\u0001\u0000\u0000\u008e\u0092\u0005\u0017\u0000\u0000\u008f\u0091"+
		"\u0003\u001a\r\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0094\u0001"+
		"\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001"+
		"\u0000\u0000\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u0092\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0005\u0018\u0000\u0000\u0096\u0019\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0005!\u0000\u0000\u0098\u009d\u0005\u0019"+
		"\u0000\u0000\u0099\u009a\u0005\u001c\u0000\u0000\u009a\u009e\u0005\u001d"+
		"\u0000\u0000\u009b\u009e\u0005\u001e\u0000\u0000\u009c\u009e\u0005 \u0000"+
		"\u0000\u009d\u0099\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000"+
		"\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0005\u001a\u0000\u0000\u00a0\u001b\u0001\u0000\u0000"+
		"\u0000\u000f\u001f)07>HQZ]lz\u0081\u0088\u0092\u009d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}