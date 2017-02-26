// Generated from C:/dev/repo/git/botparty/face/app/src/main\Bellechat.g4 by ANTLR 4.6
package com.lukeyes.annabelleface.parser.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BellechatParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NULLCMD=2, UNCMD=3, BINCMD=4, TERNCMD=5, CMDPFX=6, STRING=7, ALPHANUM=8, 
		WS=9, UNKNOWN=10;
	public static final int
		RULE_chat = 0, RULE_item = 1, RULE_expr = 2, RULE_parm = 3, RULE_nullary = 4, 
		RULE_unary = 5, RULE_binary = 6, RULE_ternary = 7, RULE_textblock = 8, 
		RULE_phoneme = 9, RULE_ignored = 10;
	public static final String[] ruleNames = {
		"chat", "item", "expr", "parm", "nullary", "unary", "binary", "ternary", 
		"textblock", "phoneme", "ignored"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\"'", null, null, null, null, "'\\'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "NULLCMD", "UNCMD", "BINCMD", "TERNCMD", "CMDPFX", "STRING", 
		"ALPHANUM", "WS", "UNKNOWN"
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
	public String getGrammarFileName() { return "Bellechat.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BellechatParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ChatContext extends ParserRuleContext {
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public ChatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BellechatListener ) ((BellechatListener)listener).enterChat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BellechatListener ) ((BellechatListener)listener).exitChat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BellechatVisitor ) return ((BellechatVisitor<? extends T>)visitor).visitChat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChatContext chat() throws RecognitionException {
		ChatContext _localctx = new ChatContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_chat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULLCMD) | (1L << UNCMD) | (1L << BINCMD) | (1L << TERNCMD) | (1L << STRING))) != 0)) {
				{
				{
				setState(22);
				item();
				}
				}
				setState(27);
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

	public static class ItemContext extends ParserRuleContext {
		public TextblockContext textblock() {
			return getRuleContext(TextblockContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BellechatListener ) ((BellechatListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BellechatListener ) ((BellechatListener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BellechatVisitor ) return ((BellechatVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(28);
				textblock();
				}
				break;
			case NULLCMD:
			case UNCMD:
			case BINCMD:
			case TERNCMD:
				{
				setState(29);
				expr();
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

	public static class ExprContext extends ParserRuleContext {
		public NullaryContext nullary() {
			return getRuleContext(NullaryContext.class,0);
		}
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public BinaryContext binary() {
			return getRuleContext(BinaryContext.class,0);
		}
		public TernaryContext ternary() {
			return getRuleContext(TernaryContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BellechatListener ) ((BellechatListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BellechatListener ) ((BellechatListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BellechatVisitor ) return ((BellechatVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULLCMD:
				{
				setState(32);
				nullary();
				}
				break;
			case UNCMD:
				{
				setState(33);
				unary();
				}
				break;
			case BINCMD:
				{
				setState(34);
				binary();
				}
				break;
			case TERNCMD:
				{
				setState(35);
				ternary();
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

	public static class ParmContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(BellechatParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(BellechatParser.STRING, i);
		}
		public ParmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BellechatListener ) ((BellechatListener)listener).enterParm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BellechatListener ) ((BellechatListener)listener).exitParm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BellechatVisitor ) return ((BellechatVisitor<? extends T>)visitor).visitParm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParmContext parm() throws RecognitionException {
		ParmContext _localctx = new ParmContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(38);
				match(STRING);
				}
				break;
			case T__0:
				{
				setState(39);
				match(T__0);
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(40);
					match(STRING);
					}
					}
					setState(43); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STRING );
				setState(45);
				match(T__0);
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

	public static class NullaryContext extends ParserRuleContext {
		public TerminalNode NULLCMD() { return getToken(BellechatParser.NULLCMD, 0); }
		public NullaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BellechatListener ) ((BellechatListener)listener).enterNullary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BellechatListener ) ((BellechatListener)listener).exitNullary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BellechatVisitor ) return ((BellechatVisitor<? extends T>)visitor).visitNullary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullaryContext nullary() throws RecognitionException {
		NullaryContext _localctx = new NullaryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nullary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(NULLCMD);
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

	public static class UnaryContext extends ParserRuleContext {
		public TerminalNode UNCMD() { return getToken(BellechatParser.UNCMD, 0); }
		public ParmContext parm() {
			return getRuleContext(ParmContext.class,0);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BellechatListener ) ((BellechatListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BellechatListener ) ((BellechatListener)listener).exitUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BellechatVisitor ) return ((BellechatVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_unary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(UNCMD);
			setState(51);
			parm();
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

	public static class BinaryContext extends ParserRuleContext {
		public TerminalNode BINCMD() { return getToken(BellechatParser.BINCMD, 0); }
		public List<ParmContext> parm() {
			return getRuleContexts(ParmContext.class);
		}
		public ParmContext parm(int i) {
			return getRuleContext(ParmContext.class,i);
		}
		public BinaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BellechatListener ) ((BellechatListener)listener).enterBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BellechatListener ) ((BellechatListener)listener).exitBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BellechatVisitor ) return ((BellechatVisitor<? extends T>)visitor).visitBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryContext binary() throws RecognitionException {
		BinaryContext _localctx = new BinaryContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_binary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(BINCMD);
			setState(54);
			parm();
			setState(55);
			parm();
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

	public static class TernaryContext extends ParserRuleContext {
		public TerminalNode TERNCMD() { return getToken(BellechatParser.TERNCMD, 0); }
		public List<ParmContext> parm() {
			return getRuleContexts(ParmContext.class);
		}
		public ParmContext parm(int i) {
			return getRuleContext(ParmContext.class,i);
		}
		public TernaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BellechatListener ) ((BellechatListener)listener).enterTernary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BellechatListener ) ((BellechatListener)listener).exitTernary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BellechatVisitor ) return ((BellechatVisitor<? extends T>)visitor).visitTernary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TernaryContext ternary() throws RecognitionException {
		TernaryContext _localctx = new TernaryContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ternary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(TERNCMD);
			setState(58);
			parm();
			setState(59);
			parm();
			setState(60);
			parm();
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

	public static class TextblockContext extends ParserRuleContext {
		public List<PhonemeContext> phoneme() {
			return getRuleContexts(PhonemeContext.class);
		}
		public PhonemeContext phoneme(int i) {
			return getRuleContext(PhonemeContext.class,i);
		}
		public TextblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BellechatListener ) ((BellechatListener)listener).enterTextblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BellechatListener ) ((BellechatListener)listener).exitTextblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BellechatVisitor ) return ((BellechatVisitor<? extends T>)visitor).visitTextblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextblockContext textblock() throws RecognitionException {
		TextblockContext _localctx = new TextblockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_textblock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(62);
					phoneme();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(65); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class PhonemeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(BellechatParser.STRING, 0); }
		public PhonemeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phoneme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BellechatListener ) ((BellechatListener)listener).enterPhoneme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BellechatListener ) ((BellechatListener)listener).exitPhoneme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BellechatVisitor ) return ((BellechatVisitor<? extends T>)visitor).visitPhoneme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PhonemeContext phoneme() throws RecognitionException {
		PhonemeContext _localctx = new PhonemeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_phoneme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(STRING);
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

	public static class IgnoredContext extends ParserRuleContext {
		public List<TerminalNode> UNKNOWN() { return getTokens(BellechatParser.UNKNOWN); }
		public TerminalNode UNKNOWN(int i) {
			return getToken(BellechatParser.UNKNOWN, i);
		}
		public IgnoredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignored; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BellechatListener ) ((BellechatListener)listener).enterIgnored(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BellechatListener ) ((BellechatListener)listener).exitIgnored(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BellechatVisitor ) return ((BellechatVisitor<? extends T>)visitor).visitIgnored(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgnoredContext ignored() throws RecognitionException {
		IgnoredContext _localctx = new IgnoredContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ignored);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(69);
				match(UNKNOWN);
				}
				}
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==UNKNOWN );
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\fM\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\3\3\3\5\3!\n\3\3\4\3\4\3\4\3"+
		"\4\5\4\'\n\4\3\5\3\5\3\5\6\5,\n\5\r\5\16\5-\3\5\5\5\61\n\5\3\6\3\6\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\6\nB\n\n\r\n\16\nC\3"+
		"\13\3\13\3\f\6\fI\n\f\r\f\16\fJ\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2"+
		"\2J\2\33\3\2\2\2\4 \3\2\2\2\6&\3\2\2\2\b\60\3\2\2\2\n\62\3\2\2\2\f\64"+
		"\3\2\2\2\16\67\3\2\2\2\20;\3\2\2\2\22A\3\2\2\2\24E\3\2\2\2\26H\3\2\2\2"+
		"\30\32\5\4\3\2\31\30\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2"+
		"\34\3\3\2\2\2\35\33\3\2\2\2\36!\5\22\n\2\37!\5\6\4\2 \36\3\2\2\2 \37\3"+
		"\2\2\2!\5\3\2\2\2\"\'\5\n\6\2#\'\5\f\7\2$\'\5\16\b\2%\'\5\20\t\2&\"\3"+
		"\2\2\2&#\3\2\2\2&$\3\2\2\2&%\3\2\2\2\'\7\3\2\2\2(\61\7\t\2\2)+\7\3\2\2"+
		"*,\7\t\2\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2./\3\2\2\2/\61\7\3\2"+
		"\2\60(\3\2\2\2\60)\3\2\2\2\61\t\3\2\2\2\62\63\7\4\2\2\63\13\3\2\2\2\64"+
		"\65\7\5\2\2\65\66\5\b\5\2\66\r\3\2\2\2\678\7\6\2\289\5\b\5\29:\5\b\5\2"+
		":\17\3\2\2\2;<\7\7\2\2<=\5\b\5\2=>\5\b\5\2>?\5\b\5\2?\21\3\2\2\2@B\5\24"+
		"\13\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\23\3\2\2\2EF\7\t\2\2F\25"+
		"\3\2\2\2GI\7\f\2\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\27\3\2\2\2"+
		"\t\33 &-\60CJ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}