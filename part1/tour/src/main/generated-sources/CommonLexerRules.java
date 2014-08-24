// Generated from CommonLexerRules.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CommonLexerRules extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, INT=2, NEWLINE=3, WS=4;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"ID", "INT", "NEWLINE", "WS"
	};
	public static final String[] ruleNames = {
		"ID", "INT", "NEWLINE", "WS"
	};


	public CommonLexerRules(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "org/sqtds/antlr4/spiltexpr/CommonLexerRules.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\6!\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\3\2\6\2\r\n\2\r\2\16\2\16\3\3\6\3\22\n\3\r\3\16"+
		"\3\23\3\4\5\4\27\n\4\3\4\3\4\3\5\6\5\34\n\5\r\5\16\5\35\3\5\3\5\2\2\6"+
		"\3\3\5\4\7\5\t\6\3\2\5\4\2C\\c|\3\2\62;\4\2\13\13\"\"$\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\3\f\3\2\2\2\5\21\3\2\2\2\7\26\3\2\2\2"+
		"\t\33\3\2\2\2\13\r\t\2\2\2\f\13\3\2\2\2\r\16\3\2\2\2\16\f\3\2\2\2\16\17"+
		"\3\2\2\2\17\4\3\2\2\2\20\22\t\3\2\2\21\20\3\2\2\2\22\23\3\2\2\2\23\21"+
		"\3\2\2\2\23\24\3\2\2\2\24\6\3\2\2\2\25\27\7\17\2\2\26\25\3\2\2\2\26\27"+
		"\3\2\2\2\27\30\3\2\2\2\30\31\7\f\2\2\31\b\3\2\2\2\32\34\t\4\2\2\33\32"+
		"\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\37\3\2\2\2\37 \b"+
		"\5\2\2 \n\3\2\2\2\7\2\16\23\26\35\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}