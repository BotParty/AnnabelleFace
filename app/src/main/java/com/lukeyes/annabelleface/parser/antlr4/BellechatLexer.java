// Generated from C:/dev/repo/git/botparty/face/app/src/main\Bellechat.g4 by ANTLR 4.6
package com.lukeyes.annabelleface.parser.antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BellechatLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NULLCMD=2, UNCMD=3, BINCMD=4, TERNCMD=5, CMDPFX=6, STRING=7, ALPHANUM=8, 
		WS=9, UNKNOWN=10;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "NULLCMD", "UNCMD", "BINCMD", "TERNCMD", "CMDPFX", "STRING", "ALPHANUM", 
		"WS", "UNKNOWN"
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


	public BellechatLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Bellechat.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\fn\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3%\n\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4A\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5O\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\b\6\b^\n\b\r\b\16\b_\3\t\3\t\3\n\6\ne\n\n\r\n\16\nf\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\2\2\f\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\3"+
		"\2\4\5\2\62;C\\c|\5\2\13\f\17\17\"\"u\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\3\27\3\2\2\2\5\31\3\2\2\2\7&\3\2\2\2\tB\3\2\2"+
		"\2\13P\3\2\2\2\rZ\3\2\2\2\17]\3\2\2\2\21a\3\2\2\2\23d\3\2\2\2\25j\3\2"+
		"\2\2\27\30\7$\2\2\30\4\3\2\2\2\31$\5\r\7\2\32\33\7u\2\2\33\34\7e\2\2\34"+
		"\35\7t\2\2\35\36\7g\2\2\36\37\7c\2\2\37%\7o\2\2 !\7p\2\2!\"\7q\2\2\"#"+
		"\7q\2\2#%\7r\2\2$\32\3\2\2\2$ \3\2\2\2%\6\3\2\2\2&@\5\r\7\2\'(\7r\2\2"+
		"()\7k\2\2)*\7v\2\2*+\7e\2\2+A\7j\2\2,-\7p\2\2-.\7q\2\2./\7q\2\2/\60\7"+
		"r\2\2\60\61\7\63\2\2\61\62\7c\2\2\62\63\7t\2\2\63A\7{\2\2\64\65\7r\2\2"+
		"\65\66\7c\2\2\66\67\7w\2\2\678\7u\2\28A\7g\2\29:\7h\2\2:;\7c\2\2;<\7e"+
		"\2\2<A\7g\2\2=>\7u\2\2>?\7c\2\2?A\7{\2\2@\'\3\2\2\2@,\3\2\2\2@\64\3\2"+
		"\2\2@9\3\2\2\2@=\3\2\2\2A\b\3\2\2\2BN\5\r\7\2CD\7t\2\2DE\7w\2\2EO\7p\2"+
		"\2FG\7p\2\2GH\7q\2\2HI\7q\2\2IJ\7r\2\2JK\7\64\2\2KL\7c\2\2LM\7t\2\2MO"+
		"\7{\2\2NC\3\2\2\2NF\3\2\2\2O\n\3\2\2\2PQ\5\r\7\2QR\7p\2\2RS\7q\2\2ST\7"+
		"q\2\2TU\7r\2\2UV\7\65\2\2VW\7c\2\2WX\7t\2\2XY\7{\2\2Y\f\3\2\2\2Z[\7^\2"+
		"\2[\16\3\2\2\2\\^\5\21\t\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\20"+
		"\3\2\2\2ab\t\2\2\2b\22\3\2\2\2ce\t\3\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2"+
		"fg\3\2\2\2gh\3\2\2\2hi\b\n\2\2i\24\3\2\2\2jk\13\2\2\2kl\3\2\2\2lm\b\13"+
		"\2\2m\26\3\2\2\2\b\2$@N_f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}