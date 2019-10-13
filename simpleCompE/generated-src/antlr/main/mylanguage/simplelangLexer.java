// Generated from simplelang.g4 by ANTLR 4.7.1
package mylanguage;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simplelangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, IF=5, THEN=6, ELSE=7, WHILE=8, CONDIT=9, 
		AND=10, OR=11, NOT=12, SEMI=13, EQ=14, OP1=15, OP2=16, FLOAT=17, NUM=18, 
		ID=19, WHITESPACE=20, COMMENT=21, COMMENT2=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "IF", "THEN", "ELSE", "WHILE", "CONDIT", 
		"AND", "OR", "NOT", "SEMI", "EQ", "OP1", "OP2", "FLOAT", "NUM", "ID", 
		"WHITESPACE", "COMMENT", "COMMENT2"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'('", "')'", "'if'", "'then'", "'else'", "'while'", 
		null, "'&&'", "'||'", "'!'", "';'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "IF", "THEN", "ELSE", "WHILE", "CONDIT", 
		"AND", "OR", "NOT", "SEMI", "EQ", "OP1", "OP2", "FLOAT", "NUM", "ID", 
		"WHITESPACE", "COMMENT", "COMMENT2"
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


	public simplelangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "simplelang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u009b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nT\n\n"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\6\22g\n\22\r\22\16\22h\3\22\3\22\6\22m\n\22\r\22\16\22n\5\22"+
		"q\n\22\3\23\3\23\3\24\6\24v\n\24\r\24\16\24w\3\25\6\25{\n\25\r\25\16\25"+
		"|\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u0085\n\26\f\26\16\26\u0088\13\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0092\n\27\f\27\16\27\u0095"+
		"\13\27\3\27\3\27\3\27\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"\3\2\13\4\2>>@@\5\2\'\',,\61\61\4\2--//\3\2\62;\5\2C\\aac|\5\2\13\f\17"+
		"\17\"\"\3\2\f\f\3\2,,\3\2\61\61\2\u00a6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2\2\7\63\3\2\2\2\t"+
		"\65\3\2\2\2\13\67\3\2\2\2\r:\3\2\2\2\17?\3\2\2\2\21D\3\2\2\2\23S\3\2\2"+
		"\2\25U\3\2\2\2\27X\3\2\2\2\31[\3\2\2\2\33]\3\2\2\2\35_\3\2\2\2\37a\3\2"+
		"\2\2!c\3\2\2\2#f\3\2\2\2%r\3\2\2\2\'u\3\2\2\2)z\3\2\2\2+\u0080\3\2\2\2"+
		"-\u008b\3\2\2\2/\60\7}\2\2\60\4\3\2\2\2\61\62\7\177\2\2\62\6\3\2\2\2\63"+
		"\64\7*\2\2\64\b\3\2\2\2\65\66\7+\2\2\66\n\3\2\2\2\678\7k\2\289\7h\2\2"+
		"9\f\3\2\2\2:;\7v\2\2;<\7j\2\2<=\7g\2\2=>\7p\2\2>\16\3\2\2\2?@\7g\2\2@"+
		"A\7n\2\2AB\7u\2\2BC\7g\2\2C\20\3\2\2\2DE\7y\2\2EF\7j\2\2FG\7k\2\2GH\7"+
		"n\2\2HI\7g\2\2I\22\3\2\2\2JK\7?\2\2KT\7?\2\2LM\7#\2\2MT\7?\2\2NT\t\2\2"+
		"\2OP\7>\2\2PT\7?\2\2QR\7@\2\2RT\7?\2\2SJ\3\2\2\2SL\3\2\2\2SN\3\2\2\2S"+
		"O\3\2\2\2SQ\3\2\2\2T\24\3\2\2\2UV\7(\2\2VW\7(\2\2W\26\3\2\2\2XY\7~\2\2"+
		"YZ\7~\2\2Z\30\3\2\2\2[\\\7#\2\2\\\32\3\2\2\2]^\7=\2\2^\34\3\2\2\2_`\7"+
		"?\2\2`\36\3\2\2\2ab\t\3\2\2b \3\2\2\2cd\t\4\2\2d\"\3\2\2\2eg\5%\23\2f"+
		"e\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2ip\3\2\2\2jl\7\60\2\2km\5%\23\2"+
		"lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pj\3\2\2\2pq\3\2\2\2"+
		"q$\3\2\2\2rs\t\5\2\2s&\3\2\2\2tv\t\6\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2"+
		"wx\3\2\2\2x(\3\2\2\2y{\t\7\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2"+
		"}~\3\2\2\2~\177\b\25\2\2\177*\3\2\2\2\u0080\u0081\7\61\2\2\u0081\u0082"+
		"\7\61\2\2\u0082\u0086\3\2\2\2\u0083\u0085\n\b\2\2\u0084\u0083\3\2\2\2"+
		"\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089"+
		"\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\b\26\2\2\u008a,\3\2\2\2\u008b"+
		"\u008c\7\61\2\2\u008c\u008d\7,\2\2\u008d\u0093\3\2\2\2\u008e\u0092\n\t"+
		"\2\2\u008f\u0090\7,\2\2\u0090\u0092\n\n\2\2\u0091\u008e\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7,\2\2\u0097"+
		"\u0098\7\61\2\2\u0098\u0099\3\2\2\2\u0099\u009a\b\27\2\2\u009a.\3\2\2"+
		"\2\f\2Shnpw|\u0086\u0091\u0093\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}