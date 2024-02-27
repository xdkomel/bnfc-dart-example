// Generated from /Users/kamil/bnfc-dart-example/lib/gen/arith/ArithLexer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ArithLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Surrogate_id_SYMB_0=1, Surrogate_id_SYMB_1=2, Surrogate_id_SYMB_2=3, Surrogate_id_SYMB_3=4, 
		Surrogate_id_SYMB_4=5, DOUBLE=6, INTEGER=7, WS=8, ErrorToken=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETTER", "CAPITAL", "SMALL", "DIGIT", "Surrogate_id_SYMB_0", "Surrogate_id_SYMB_1", 
			"Surrogate_id_SYMB_2", "Surrogate_id_SYMB_3", "Surrogate_id_SYMB_4", 
			"DOUBLE", "INTEGER", "WS", "Escapable", "ErrorToken"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'/'", "'+'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Surrogate_id_SYMB_0", "Surrogate_id_SYMB_1", "Surrogate_id_SYMB_2", 
			"Surrogate_id_SYMB_3", "Surrogate_id_SYMB_4", "DOUBLE", "INTEGER", "WS", 
			"ErrorToken"
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


	public ArithLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ArithLexer.g4"; }

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
		"\u0004\u0000\tW\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0003"+
		"\u0000 \b\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0004"+
		"\t3\b\t\u000b\t\f\t4\u0001\t\u0001\t\u0004\t9\b\t\u000b\t\f\t:\u0001\t"+
		"\u0001\t\u0003\t?\b\t\u0001\t\u0004\tB\b\t\u000b\t\f\tC\u0003\tF\b\t\u0001"+
		"\n\u0004\nI\b\n\u000b\n\f\nJ\u0001\u000b\u0004\u000bN\b\u000b\u000b\u000b"+
		"\f\u000bO\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0000"+
		"\u0000\u000e\u0001\u0000\u0003\u0000\u0005\u0000\u0007\u0000\t\u0001\u000b"+
		"\u0002\r\u0003\u000f\u0004\u0011\u0005\u0013\u0006\u0015\u0007\u0017\b"+
		"\u0019\u0000\u001b\t\u0001\u0000\u0005\u0003\u0000AZ\u00c0\u00d6\u00d8"+
		"\u00de\u0003\u0000az\u00df\u00f6\u00f8\u00ff\u0001\u000009\u0003\u0000"+
		"\t\n\f\r  \u0006\u0000\"\"\\\\ffnnrrttY\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0001"+
		"\u001f\u0001\u0000\u0000\u0000\u0003!\u0001\u0000\u0000\u0000\u0005#\u0001"+
		"\u0000\u0000\u0000\u0007%\u0001\u0000\u0000\u0000\t\'\u0001\u0000\u0000"+
		"\u0000\u000b)\u0001\u0000\u0000\u0000\r+\u0001\u0000\u0000\u0000\u000f"+
		"-\u0001\u0000\u0000\u0000\u0011/\u0001\u0000\u0000\u0000\u00132\u0001"+
		"\u0000\u0000\u0000\u0015H\u0001\u0000\u0000\u0000\u0017M\u0001\u0000\u0000"+
		"\u0000\u0019S\u0001\u0000\u0000\u0000\u001bU\u0001\u0000\u0000\u0000\u001d"+
		" \u0003\u0003\u0001\u0000\u001e \u0003\u0005\u0002\u0000\u001f\u001d\u0001"+
		"\u0000\u0000\u0000\u001f\u001e\u0001\u0000\u0000\u0000 \u0002\u0001\u0000"+
		"\u0000\u0000!\"\u0007\u0000\u0000\u0000\"\u0004\u0001\u0000\u0000\u0000"+
		"#$\u0007\u0001\u0000\u0000$\u0006\u0001\u0000\u0000\u0000%&\u0007\u0002"+
		"\u0000\u0000&\b\u0001\u0000\u0000\u0000\'(\u0005*\u0000\u0000(\n\u0001"+
		"\u0000\u0000\u0000)*\u0005/\u0000\u0000*\f\u0001\u0000\u0000\u0000+,\u0005"+
		"+\u0000\u0000,\u000e\u0001\u0000\u0000\u0000-.\u0005(\u0000\u0000.\u0010"+
		"\u0001\u0000\u0000\u0000/0\u0005)\u0000\u00000\u0012\u0001\u0000\u0000"+
		"\u000013\u0003\u0007\u0003\u000021\u0001\u0000\u0000\u000034\u0001\u0000"+
		"\u0000\u000042\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000056\u0001"+
		"\u0000\u0000\u000068\u0005.\u0000\u000079\u0003\u0007\u0003\u000087\u0001"+
		"\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000"+
		":;\u0001\u0000\u0000\u0000;E\u0001\u0000\u0000\u0000<>\u0005e\u0000\u0000"+
		"=?\u0005-\u0000\u0000>=\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000"+
		"?A\u0001\u0000\u0000\u0000@B\u0003\u0007\u0003\u0000A@\u0001\u0000\u0000"+
		"\u0000BC\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000"+
		"\u0000\u0000DF\u0001\u0000\u0000\u0000E<\u0001\u0000\u0000\u0000EF\u0001"+
		"\u0000\u0000\u0000F\u0014\u0001\u0000\u0000\u0000GI\u0003\u0007\u0003"+
		"\u0000HG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JH\u0001\u0000"+
		"\u0000\u0000JK\u0001\u0000\u0000\u0000K\u0016\u0001\u0000\u0000\u0000"+
		"LN\u0007\u0003\u0000\u0000ML\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000"+
		"\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0001\u0000"+
		"\u0000\u0000QR\u0006\u000b\u0000\u0000R\u0018\u0001\u0000\u0000\u0000"+
		"ST\u0007\u0004\u0000\u0000T\u001a\u0001\u0000\u0000\u0000UV\t\u0000\u0000"+
		"\u0000V\u001c\u0001\u0000\u0000\u0000\t\u0000\u001f4:>CEJO\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}