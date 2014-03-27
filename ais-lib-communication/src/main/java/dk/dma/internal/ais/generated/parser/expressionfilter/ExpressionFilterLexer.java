// Generated from ExpressionFilter.g4 by ANTLR 4.2
package dk.dma.internal.ais.generated.parser.expressionfilter;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionFilterLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__34=1, T__33=2, T__32=3, T__31=4, T__30=5, T__29=6, T__28=7, T__27=8, 
		T__26=9, T__25=10, T__24=11, T__23=12, T__22=13, T__21=14, T__20=15, T__19=16, 
		T__18=17, T__17=18, T__16=19, T__15=20, T__14=21, T__13=22, T__12=23, 
		T__11=24, T__10=25, T__9=26, T__8=27, T__7=28, T__6=29, T__5=30, T__4=31, 
		T__3=32, T__2=33, T__1=34, T__0=35, AND=36, OR=37, RANGE=38, BBOX=39, 
		CIRCLE=40, WITHIN=41, INT=42, FLOAT=43, WORD=44, STRING=45, WS=46;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'s.type'", "'m.lat'", "'m.name'", "'!='", "'='", "'m.mmsi'", "'<='", 
		"'m.hdg'", "'s.country'", "'('", "','", "'m.cog'", "'NOT IN'", "'not in'", 
		"'messagetype'", "'m.draught'", "'m.sog'", "'m.navstat'", "'!@'", "'>='", 
		"'<'", "'s.id'", "'s.region'", "'>'", "'@'", "'m.cs'", "'m.pos'", "'m.lon'", 
		"'m.type'", "'IN'", "'in'", "'m.imo'", "'m.id'", "')'", "'s.bs'", "'&'", 
		"'|'", "'..'", "BBOX", "CIRCLE", "WITHIN", "INT", "FLOAT", "WORD", "STRING", 
		"WS"
	};
	public static final String[] ruleNames = {
		"T__34", "T__33", "T__32", "T__31", "T__30", "T__29", "T__28", "T__27", 
		"T__26", "T__25", "T__24", "T__23", "T__22", "T__21", "T__20", "T__19", 
		"T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", 
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "AND", "OR", "RANGE", "BBOX", "CIRCLE", "WITHIN", "INT", 
		"FLOAT", "WORD", "STRING", "WS"
	};


	public ExpressionFilterLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ExpressionFilter.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\60\u015f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3"+
		"\"\3\"\3#\3#\3$\3$\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)"+
		"\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\5+\u0136\n+\3+\6+\u0139\n+"+
		"\r+\16+\u013a\3,\5,\u013e\n,\3,\6,\u0141\n,\r,\16,\u0142\3,\3,\6,\u0147"+
		"\n,\r,\16,\u0148\3-\6-\u014c\n-\r-\16-\u014d\3.\3.\7.\u0152\n.\f.\16."+
		"\u0155\13.\3.\3.\3/\6/\u015a\n/\r/\16/\u015b\3/\3/\3\u0153\2\60\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60\3\2\21\4\2DDdd\4\2QQqq\4\2ZZzz\4\2"+
		"EEee\4\2KKkk\4\2TTtt\4\2NNnn\4\2GGgg\4\2YYyy\4\2VVvv\4\2JJjj\4\2PPpp\3"+
		"\2\62;\7\2\62;AAC\\aac|\5\2\13\f\17\17\"\"\u0166\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5f\3\2\2\2\7l\3\2\2\2\ts\3"+
		"\2\2\2\13v\3\2\2\2\rx\3\2\2\2\17\177\3\2\2\2\21\u0082\3\2\2\2\23\u0088"+
		"\3\2\2\2\25\u0092\3\2\2\2\27\u0094\3\2\2\2\31\u0096\3\2\2\2\33\u009c\3"+
		"\2\2\2\35\u00a3\3\2\2\2\37\u00aa\3\2\2\2!\u00b6\3\2\2\2#\u00c0\3\2\2\2"+
		"%\u00c6\3\2\2\2\'\u00d0\3\2\2\2)\u00d3\3\2\2\2+\u00d6\3\2\2\2-\u00d8\3"+
		"\2\2\2/\u00dd\3\2\2\2\61\u00e6\3\2\2\2\63\u00e8\3\2\2\2\65\u00ea\3\2\2"+
		"\2\67\u00ef\3\2\2\29\u00f5\3\2\2\2;\u00fb\3\2\2\2=\u0102\3\2\2\2?\u0105"+
		"\3\2\2\2A\u0108\3\2\2\2C\u010e\3\2\2\2E\u0113\3\2\2\2G\u0115\3\2\2\2I"+
		"\u011a\3\2\2\2K\u011c\3\2\2\2M\u011e\3\2\2\2O\u0121\3\2\2\2Q\u0126\3\2"+
		"\2\2S\u012d\3\2\2\2U\u0135\3\2\2\2W\u013d\3\2\2\2Y\u014b\3\2\2\2[\u014f"+
		"\3\2\2\2]\u0159\3\2\2\2_`\7u\2\2`a\7\60\2\2ab\7v\2\2bc\7{\2\2cd\7r\2\2"+
		"de\7g\2\2e\4\3\2\2\2fg\7o\2\2gh\7\60\2\2hi\7n\2\2ij\7c\2\2jk\7v\2\2k\6"+
		"\3\2\2\2lm\7o\2\2mn\7\60\2\2no\7p\2\2op\7c\2\2pq\7o\2\2qr\7g\2\2r\b\3"+
		"\2\2\2st\7#\2\2tu\7?\2\2u\n\3\2\2\2vw\7?\2\2w\f\3\2\2\2xy\7o\2\2yz\7\60"+
		"\2\2z{\7o\2\2{|\7o\2\2|}\7u\2\2}~\7k\2\2~\16\3\2\2\2\177\u0080\7>\2\2"+
		"\u0080\u0081\7?\2\2\u0081\20\3\2\2\2\u0082\u0083\7o\2\2\u0083\u0084\7"+
		"\60\2\2\u0084\u0085\7j\2\2\u0085\u0086\7f\2\2\u0086\u0087\7i\2\2\u0087"+
		"\22\3\2\2\2\u0088\u0089\7u\2\2\u0089\u008a\7\60\2\2\u008a\u008b\7e\2\2"+
		"\u008b\u008c\7q\2\2\u008c\u008d\7w\2\2\u008d\u008e\7p\2\2\u008e\u008f"+
		"\7v\2\2\u008f\u0090\7t\2\2\u0090\u0091\7{\2\2\u0091\24\3\2\2\2\u0092\u0093"+
		"\7*\2\2\u0093\26\3\2\2\2\u0094\u0095\7.\2\2\u0095\30\3\2\2\2\u0096\u0097"+
		"\7o\2\2\u0097\u0098\7\60\2\2\u0098\u0099\7e\2\2\u0099\u009a\7q\2\2\u009a"+
		"\u009b\7i\2\2\u009b\32\3\2\2\2\u009c\u009d\7P\2\2\u009d\u009e\7Q\2\2\u009e"+
		"\u009f\7V\2\2\u009f\u00a0\7\"\2\2\u00a0\u00a1\7K\2\2\u00a1\u00a2\7P\2"+
		"\2\u00a2\34\3\2\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6"+
		"\7v\2\2\u00a6\u00a7\7\"\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7p\2\2\u00a9"+
		"\36\3\2\2\2\u00aa\u00ab\7o\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7u\2\2\u00ad"+
		"\u00ae\7u\2\2\u00ae\u00af\7c\2\2\u00af\u00b0\7i\2\2\u00b0\u00b1\7g\2\2"+
		"\u00b1\u00b2\7v\2\2\u00b2\u00b3\7{\2\2\u00b3\u00b4\7r\2\2\u00b4\u00b5"+
		"\7g\2\2\u00b5 \3\2\2\2\u00b6\u00b7\7o\2\2\u00b7\u00b8\7\60\2\2\u00b8\u00b9"+
		"\7f\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7w\2\2\u00bc"+
		"\u00bd\7i\2\2\u00bd\u00be\7j\2\2\u00be\u00bf\7v\2\2\u00bf\"\3\2\2\2\u00c0"+
		"\u00c1\7o\2\2\u00c1\u00c2\7\60\2\2\u00c2\u00c3\7u\2\2\u00c3\u00c4\7q\2"+
		"\2\u00c4\u00c5\7i\2\2\u00c5$\3\2\2\2\u00c6\u00c7\7o\2\2\u00c7\u00c8\7"+
		"\60\2\2\u00c8\u00c9\7p\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cb\7x\2\2\u00cb"+
		"\u00cc\7u\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7v\2\2"+
		"\u00cf&\3\2\2\2\u00d0\u00d1\7#\2\2\u00d1\u00d2\7B\2\2\u00d2(\3\2\2\2\u00d3"+
		"\u00d4\7@\2\2\u00d4\u00d5\7?\2\2\u00d5*\3\2\2\2\u00d6\u00d7\7>\2\2\u00d7"+
		",\3\2\2\2\u00d8\u00d9\7u\2\2\u00d9\u00da\7\60\2\2\u00da\u00db\7k\2\2\u00db"+
		"\u00dc\7f\2\2\u00dc.\3\2\2\2\u00dd\u00de\7u\2\2\u00de\u00df\7\60\2\2\u00df"+
		"\u00e0\7t\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2\7i\2\2\u00e2\u00e3\7k\2\2"+
		"\u00e3\u00e4\7q\2\2\u00e4\u00e5\7p\2\2\u00e5\60\3\2\2\2\u00e6\u00e7\7"+
		"@\2\2\u00e7\62\3\2\2\2\u00e8\u00e9\7B\2\2\u00e9\64\3\2\2\2\u00ea\u00eb"+
		"\7o\2\2\u00eb\u00ec\7\60\2\2\u00ec\u00ed\7e\2\2\u00ed\u00ee\7u\2\2\u00ee"+
		"\66\3\2\2\2\u00ef\u00f0\7o\2\2\u00f0\u00f1\7\60\2\2\u00f1\u00f2\7r\2\2"+
		"\u00f2\u00f3\7q\2\2\u00f3\u00f4\7u\2\2\u00f48\3\2\2\2\u00f5\u00f6\7o\2"+
		"\2\u00f6\u00f7\7\60\2\2\u00f7\u00f8\7n\2\2\u00f8\u00f9\7q\2\2\u00f9\u00fa"+
		"\7p\2\2\u00fa:\3\2\2\2\u00fb\u00fc\7o\2\2\u00fc\u00fd\7\60\2\2\u00fd\u00fe"+
		"\7v\2\2\u00fe\u00ff\7{\2\2\u00ff\u0100\7r\2\2\u0100\u0101\7g\2\2\u0101"+
		"<\3\2\2\2\u0102\u0103\7K\2\2\u0103\u0104\7P\2\2\u0104>\3\2\2\2\u0105\u0106"+
		"\7k\2\2\u0106\u0107\7p\2\2\u0107@\3\2\2\2\u0108\u0109\7o\2\2\u0109\u010a"+
		"\7\60\2\2\u010a\u010b\7k\2\2\u010b\u010c\7o\2\2\u010c\u010d\7q\2\2\u010d"+
		"B\3\2\2\2\u010e\u010f\7o\2\2\u010f\u0110\7\60\2\2\u0110\u0111\7k\2\2\u0111"+
		"\u0112\7f\2\2\u0112D\3\2\2\2\u0113\u0114\7+\2\2\u0114F\3\2\2\2\u0115\u0116"+
		"\7u\2\2\u0116\u0117\7\60\2\2\u0117\u0118\7d\2\2\u0118\u0119\7u\2\2\u0119"+
		"H\3\2\2\2\u011a\u011b\7(\2\2\u011bJ\3\2\2\2\u011c\u011d\7~\2\2\u011dL"+
		"\3\2\2\2\u011e\u011f\7\60\2\2\u011f\u0120\7\60\2\2\u0120N\3\2\2\2\u0121"+
		"\u0122\t\2\2\2\u0122\u0123\t\2\2\2\u0123\u0124\t\3\2\2\u0124\u0125\t\4"+
		"\2\2\u0125P\3\2\2\2\u0126\u0127\t\5\2\2\u0127\u0128\t\6\2\2\u0128\u0129"+
		"\t\7\2\2\u0129\u012a\t\5\2\2\u012a\u012b\t\b\2\2\u012b\u012c\t\t\2\2\u012c"+
		"R\3\2\2\2\u012d\u012e\t\n\2\2\u012e\u012f\t\6\2\2\u012f\u0130\t\13\2\2"+
		"\u0130\u0131\t\f\2\2\u0131\u0132\t\6\2\2\u0132\u0133\t\r\2\2\u0133T\3"+
		"\2\2\2\u0134\u0136\7/\2\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0138\3\2\2\2\u0137\u0139\t\16\2\2\u0138\u0137\3\2\2\2\u0139\u013a\3"+
		"\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013bV\3\2\2\2\u013c\u013e"+
		"\7/\2\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140\3\2\2\2\u013f"+
		"\u0141\t\16\2\2\u0140\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0140\3"+
		"\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146\7\60\2\2\u0145"+
		"\u0147\t\16\2\2\u0146\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0146\3"+
		"\2\2\2\u0148\u0149\3\2\2\2\u0149X\3\2\2\2\u014a\u014c\t\17\2\2\u014b\u014a"+
		"\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"Z\3\2\2\2\u014f\u0153\7)\2\2\u0150\u0152\13\2\2\2\u0151\u0150\3\2\2\2"+
		"\u0152\u0155\3\2\2\2\u0153\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0156"+
		"\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0157\7)\2\2\u0157\\\3\2\2\2\u0158"+
		"\u015a\t\20\2\2\u0159\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u0159\3"+
		"\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\b/\2\2\u015e"+
		"^\3\2\2\2\13\2\u0135\u013a\u013d\u0142\u0148\u014d\u0153\u015b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}