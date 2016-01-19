/**
 * @author Anuradha Vakil
 * @author Nikos Arechiga
 * Toyota InfoTechnology Center, USA
 * 465 N Bernardo Ave, Mountain View, CA 94043
 */
package dl.parser;

/* The following code was generated by JFlex 1.6.1 */


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>dLLexer.lex</tt>
 */
public class dLLexer implements dLParser.Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int SCHEMAS = 2;
  public static final int COMMENTS = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\17\1\14\1\0\1\17\1\15\22\0\1\71\1\12\4\0"+
    "\1\67\1\56\1\61\1\63\1\21\1\54\1\62\1\5\1\3\1\20"+
    "\12\2\1\52\1\16\1\7\1\11\1\10\1\53\1\0\4\1\1\6"+
    "\1\66\13\1\1\51\1\1\1\65\1\1\1\44\4\1\1\57\1\22"+
    "\1\60\1\64\1\1\1\0\1\27\1\40\1\33\1\42\1\4\1\31"+
    "\1\50\1\43\1\34\1\47\1\1\1\30\1\41\1\26\1\35\1\37"+
    "\1\1\1\25\1\36\1\24\1\32\1\45\1\46\1\23\2\1\1\55"+
    "\1\70\1\13\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uff92\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\1\3\1\4\2\5\1\6\1\7"+
    "\1\10\2\11\1\12\1\11\1\13\1\14\1\1\2\2"+
    "\1\15\1\1\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\2\2\1\26\1\27\1\30\1\31\1\32"+
    "\1\3\1\0\1\33\1\0\1\5\3\0\1\34\1\35"+
    "\11\0\1\36\1\37\2\2\1\40\1\41\2\2\1\42"+
    "\1\43\1\3\1\0\1\44\2\45\22\0\4\2\1\45"+
    "\1\0\1\45\22\0\1\46\1\2\1\47\1\2\22\0"+
    "\1\50\1\51\4\0\1\52\35\0\1\53\15\0\1\54"+
    "\1\0\1\55\1\56\1\57\1\60\3\0\1\61\6\0"+
    "\1\62\4\0\1\63\4\0\1\64\6\0\1\65\1\0"+
    "\1\66\4\0\1\67\21\0\1\70\3\0\1\71\1\0"+
    "\1\72\2\0\1\73\2\0\1\74\1\75";

  private static int [] zzUnpackAction() {
    int [] result = new int[259];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\72\0\164\0\164\0\256\0\350\0\u0122\0\u015c"+
    "\0\u0196\0\164\0\u0196\0\164\0\u01d0\0\u020a\0\164\0\164"+
    "\0\u0244\0\164\0\u027e\0\u02b8\0\u02f2\0\256\0\u032c\0\164"+
    "\0\u0366\0\164\0\164\0\164\0\164\0\164\0\164\0\u03a0"+
    "\0\u03da\0\u0414\0\u044e\0\u0488\0\164\0\164\0\u04c2\0\u04fc"+
    "\0\164\0\u0536\0\164\0\u0570\0\u05aa\0\u05e4\0\164\0\164"+
    "\0\u061e\0\u0658\0\u0692\0\u06cc\0\u0706\0\u0740\0\u077a\0\u07b4"+
    "\0\u07ee\0\164\0\164\0\u0828\0\u0862\0\164\0\164\0\u089c"+
    "\0\u08d6\0\164\0\164\0\u0910\0\u0910\0\164\0\u094a\0\u0984"+
    "\0\u09be\0\u09f8\0\u0a32\0\u0a6c\0\u0aa6\0\u0ae0\0\u0b1a\0\u0b54"+
    "\0\u0b8e\0\u0bc8\0\u0c02\0\u0c3c\0\u0c76\0\u0cb0\0\u0cea\0\u0d24"+
    "\0\u0d5e\0\u0d98\0\u0dd2\0\u0e0c\0\u0e46\0\u0e80\0\164\0\u0eba"+
    "\0\u09be\0\u0ef4\0\u0f2e\0\u0f68\0\u0fa2\0\u0fdc\0\u1016\0\u1050"+
    "\0\u108a\0\u10c4\0\u10fe\0\u1138\0\u1172\0\u11ac\0\u11e6\0\u1220"+
    "\0\u125a\0\u1294\0\u12ce\0\256\0\u1308\0\256\0\u1342\0\u137c"+
    "\0\u13b6\0\u13f0\0\u142a\0\u1464\0\u149e\0\u14d8\0\u1512\0\u154c"+
    "\0\u1586\0\u15c0\0\u15fa\0\u1634\0\u166e\0\u16a8\0\u16e2\0\u171c"+
    "\0\u1756\0\256\0\256\0\u1790\0\u17ca\0\u1804\0\u183e\0\164"+
    "\0\u1878\0\u18b2\0\u18ec\0\u1926\0\u1960\0\u199a\0\u19d4\0\u1a0e"+
    "\0\u1a48\0\u1a82\0\u1abc\0\u1af6\0\u1b30\0\u1b6a\0\u1ba4\0\u1bde"+
    "\0\u1c18\0\u1c52\0\u1c8c\0\u1cc6\0\u1d00\0\u1d3a\0\u1d74\0\u1dae"+
    "\0\u1de8\0\u1e22\0\u1e5c\0\u1e96\0\u1ed0\0\164\0\u1f0a\0\u1f44"+
    "\0\u1f7e\0\u1fb8\0\u1ff2\0\u202c\0\u2066\0\u20a0\0\u20da\0\u2114"+
    "\0\u214e\0\u2188\0\u21c2\0\164\0\u21fc\0\164\0\164\0\164"+
    "\0\164\0\u2236\0\u2270\0\u22aa\0\164\0\u22e4\0\u231e\0\u2358"+
    "\0\u2392\0\u23cc\0\u2406\0\164\0\u2440\0\u247a\0\u24b4\0\u24ee"+
    "\0\164\0\u2528\0\u2562\0\u259c\0\u25d6\0\164\0\u2610\0\u264a"+
    "\0\u2684\0\u26be\0\u26f8\0\u2732\0\164\0\u276c\0\164\0\u27a6"+
    "\0\u27e0\0\u281a\0\u2854\0\164\0\u288e\0\u28c8\0\u2902\0\u293c"+
    "\0\u2976\0\u29b0\0\u29ea\0\u2a24\0\u2a5e\0\u2a98\0\u2ad2\0\u2b0c"+
    "\0\u2b46\0\u2b80\0\u2bba\0\u2bf4\0\u2c2e\0\164\0\u2c68\0\u2ca2"+
    "\0\u2cdc\0\164\0\u2d16\0\164\0\u2d50\0\u2d8a\0\164\0\u2dc4"+
    "\0\u2dfe\0\164\0\164";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[259];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\1\5\1\6\1\4\1\5\1\7\1\5\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\5\1\24\4\5\1\25\17\5"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\2\4\1\34"+
    "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\20"+
    "\13\44\1\45\41\44\1\46\14\44\73\0\2\5\1\0"+
    "\1\5\1\0\1\5\14\0\27\5\13\0\2\5\5\0"+
    "\1\6\1\47\1\50\1\0\1\50\73\0\1\51\66\0"+
    "\1\52\3\0\1\53\71\0\1\53\76\0\1\20\67\0"+
    "\1\20\75\0\1\54\1\55\54\0\1\56\2\0\1\57"+
    "\1\60\14\0\1\61\1\0\1\62\1\0\1\63\1\0"+
    "\1\64\1\65\1\66\1\67\1\70\1\71\16\0\1\72"+
    "\1\73\12\0\2\5\1\0\1\5\1\0\1\5\14\0"+
    "\2\5\1\74\24\5\13\0\2\5\4\0\2\5\1\0"+
    "\1\5\1\0\1\5\14\0\4\5\1\75\22\5\13\0"+
    "\2\5\14\0\1\76\134\0\1\77\16\0\2\5\1\0"+
    "\1\5\1\0\1\5\14\0\2\5\1\100\24\5\13\0"+
    "\2\5\4\0\2\5\1\0\1\5\1\0\1\5\14\0"+
    "\4\5\1\101\22\5\13\0\2\5\72\0\1\102\72\0"+
    "\1\103\1\0\13\44\1\0\41\44\1\0\14\44\2\0"+
    "\1\47\1\0\1\50\1\0\1\50\65\0\1\104\2\0"+
    "\1\105\46\0\1\105\25\0\1\106\61\0\14\54\1\107"+
    "\1\110\54\54\21\111\1\112\50\111\23\0\1\113\2\0"+
    "\1\114\5\0\1\115\67\0\1\116\65\0\1\117\75\0"+
    "\1\120\2\0\1\121\71\0\1\122\62\0\1\123\103\0"+
    "\1\124\35\0\1\125\17\0\1\126\2\0\1\127\3\0"+
    "\1\130\63\0\1\131\101\0\1\132\35\0\2\5\1\0"+
    "\1\5\1\0\1\5\14\0\7\5\1\133\17\5\13\0"+
    "\2\5\4\0\2\5\1\0\1\5\1\0\1\5\14\0"+
    "\5\5\1\134\21\5\13\0\2\5\4\0\2\5\1\0"+
    "\1\5\1\0\1\5\14\0\7\5\1\135\17\5\13\0"+
    "\2\5\4\0\2\5\1\0\1\5\1\0\1\5\14\0"+
    "\5\5\1\136\21\5\13\0\2\5\5\0\1\104\105\0"+
    "\1\137\67\0\1\137\55\0\21\111\1\140\70\111\1\141"+
    "\1\140\50\111\24\0\1\142\7\0\1\143\102\0\1\144"+
    "\63\0\1\145\62\0\1\146\67\0\1\147\71\0\1\150"+
    "\70\0\1\151\72\0\1\152\77\0\1\153\10\0\1\154"+
    "\73\0\1\155\46\0\1\156\74\0\1\157\73\0\1\160"+
    "\103\0\1\161\63\0\1\162\66\0\1\163\40\0\2\5"+
    "\1\0\1\164\1\0\1\5\14\0\27\5\13\0\2\5"+
    "\4\0\2\5\1\0\1\5\1\0\1\5\14\0\13\5"+
    "\1\165\13\5\13\0\2\5\4\0\2\5\1\0\1\166"+
    "\1\0\1\5\14\0\27\5\13\0\2\5\4\0\2\5"+
    "\1\0\1\5\1\0\1\5\14\0\13\5\1\167\13\5"+
    "\13\0\2\5\3\0\20\111\1\137\1\140\50\111\4\0"+
    "\1\170\123\0\1\171\37\0\1\172\114\0\1\173\46\0"+
    "\1\174\122\0\1\175\67\0\1\176\65\0\1\177\66\0"+
    "\1\200\71\0\1\201\74\0\1\202\46\0\1\203\111\0"+
    "\1\204\71\0\1\205\51\0\1\206\71\0\1\207\125\0"+
    "\1\210\57\0\1\211\44\0\2\5\1\0\1\212\1\0"+
    "\1\5\14\0\27\5\13\0\2\5\4\0\2\5\1\0"+
    "\1\213\1\0\1\5\14\0\27\5\13\0\2\5\30\0"+
    "\1\214\70\0\1\215\75\0\1\216\66\0\1\217\102\0"+
    "\1\220\57\0\1\221\71\0\1\222\75\0\1\223\66\0"+
    "\1\224\100\0\1\225\62\0\1\226\77\0\1\227\72\0"+
    "\1\230\41\0\1\231\123\0\1\232\74\0\1\233\60\0"+
    "\1\234\103\0\1\235\55\0\1\236\101\0\1\237\70\0"+
    "\1\240\63\0\1\241\71\0\1\242\76\0\1\243\65\0"+
    "\1\244\76\0\1\245\63\0\1\246\76\0\1\247\61\0"+
    "\1\250\73\0\1\251\110\0\1\252\30\0\1\253\114\0"+
    "\1\254\46\0\1\255\123\0\1\256\62\0\1\257\133\0"+
    "\1\260\37\0\1\261\73\0\1\262\54\0\1\263\102\0"+
    "\1\264\125\0\1\265\30\0\1\266\71\0\1\267\70\0"+
    "\1\270\76\0\1\271\105\0\1\272\50\0\1\273\66\0"+
    "\1\274\111\0\1\275\66\0\1\276\60\0\1\277\112\0"+
    "\1\300\24\0\1\301\71\0\1\302\121\0\1\303\63\0"+
    "\1\304\114\0\1\305\44\0\1\306\3\0\1\307\6\0"+
    "\1\310\70\0\1\311\61\0\1\312\110\0\1\313\62\0"+
    "\1\314\60\0\1\315\73\0\1\316\66\0\1\317\102\0"+
    "\1\320\72\0\1\321\37\0\1\322\114\0\1\323\71\0"+
    "\1\324\46\0\1\325\111\0\1\326\51\0\1\327\121\0"+
    "\1\330\62\0\1\331\50\0\1\332\113\0\1\333\104\0"+
    "\1\334\76\0\1\335\50\0\1\336\70\0\1\337\76\0"+
    "\1\340\67\0\1\341\76\0\1\342\62\0\1\343\102\0"+
    "\1\344\72\0\1\345\61\0\1\346\74\0\1\347\77\0"+
    "\1\350\60\0\1\351\100\0\1\352\63\0\1\353\102\0"+
    "\1\354\56\0\1\355\73\0\1\356\101\0\1\357\35\0"+
    "\1\360\114\0\1\361\46\0\1\362\120\0\1\363\42\0"+
    "\1\364\115\0\1\365\65\0\1\366\71\0\1\367\71\0"+
    "\1\370\71\0\1\371\103\0\1\372\37\0\1\373\71\0"+
    "\1\374\71\0\1\375\121\0\1\376\73\0\1\377\60\0"+
    "\1\u0100\101\0\1\u0101\72\0\1\u0102\61\0\1\u0103\43\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[11832];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\10\1\11\5\1\1\11\1\1\1\11\2\1"+
    "\2\11\1\1\1\11\5\1\1\11\1\1\6\11\5\1"+
    "\2\11\1\1\1\0\1\11\1\0\1\11\3\0\2\11"+
    "\11\0\2\11\2\1\2\11\2\1\2\11\1\1\1\0"+
    "\1\11\2\1\22\0\4\1\1\11\1\0\1\1\22\0"+
    "\4\1\22\0\2\1\4\0\1\11\35\0\1\11\15\0"+
    "\1\11\1\0\4\11\3\0\1\11\6\0\1\11\4\0"+
    "\1\11\4\0\1\11\6\0\1\11\1\0\1\11\4\0"+
    "\1\11\21\0\1\11\3\0\1\11\1\0\1\11\2\0"+
    "\1\11\2\0\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[259];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
	int openBraceCount = 0;
	boolean debug = false;
	public Object getLVal() {
		//System.out.println("YYTEXT is: " + yytext() );
		return yytext();
	}

	public void yyerror ( String S ) {
		System.err.println( S );
	}


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public dLLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 178) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.out.println("Lexer: I'm confused, throwing error");
		System.out.println("Lexer @ " + yytext() );
		return dLParser.YYERROR;
            }
          case 62: break;
          case 2: 
            { if ( debug ) {
			System.out.println("Lexer: IDENTIFIER");
			System.out.println("Lexer @ " + yytext() );
		}
		return IDENTIFIER;
            }
          case 63: break;
          case 3: 
            { if ( debug ) {
			System.out.println("Lexer: NUMBER");
			System.out.println("Lexer @ " + yytext() );
		}
		return NUMBER;
            }
          case 64: break;
          case 4: 
            { if ( debug ) {
			System.out.println("Lexer: MINUS");
			System.out.println("Lexer @ " + yytext() );
		}
		return MINUS;
            }
          case 65: break;
          case 5: 
            { if ( debug ) {
			System.out.println("Lexer: INEQUALITY");
			System.out.println("Lexer @ " + yytext() );
		}
		return INEQUALITY;
            }
          case 66: break;
          case 6: 
            { if ( debug ) {
			System.out.println("Lexer: EQUALS");
			System.out.println("Lexer @ " + yytext() );
		}
		return EQUALS;
            }
          case 67: break;
          case 7: 
            { if ( debug ) {
			System.out.println("Lexer: NOT");
			System.out.println("Lexer @ " + yytext() );
		}
		return NOT;
            }
          case 68: break;
          case 8: 
            { if ( debug ) {
			System.out.println("Lexer: CLOSEBRACE");
			System.out.println("Lexer @ " + yytext() );
		}
		return CLOSEBRACE;
            }
          case 69: break;
          case 9: 
            { if ( debug ) {
			System.out.println("Lexer: space");
			System.out.println("Lexer @ " + yytext() );
		}
            }
          case 70: break;
          case 10: 
            { if ( debug ) {
			System.out.println("Lexer: SEMICOLON");
			System.out.println("Lexer @ " + yytext() );
		}
		return SEMICOLON;
            }
          case 71: break;
          case 11: 
            { if ( debug ) {
			System.out.println("Lexer: DIVIDE");
			System.out.println("Lexer @ " + yytext() );
		}
		return DIVIDE;
            }
          case 72: break;
          case 12: 
            { if ( debug ) {
			System.out.println("Lexer: ASTERISK");
			System.out.println("Lexer @ " + yytext() );
		}
		return ASTERISK;
            }
          case 73: break;
          case 13: 
            { if ( debug ) {
			System.out.println("Lexer: REALDECLARATION");
			System.out.println("Lexer @ " + yytext() );
		}
		return REALDECLARATION;
            }
          case 74: break;
          case 14: 
            { if ( debug ) {
			System.out.println("Lexer: TEST");
			System.out.println("Lexer @ " + yytext() );
		}
		return TEST;
            }
          case 75: break;
          case 15: 
            { if ( debug ) {
			System.out.println("Lexer: PLUS");
			System.out.println("Lexer @ " + yytext() );
		}
		return PLUS;
            }
          case 76: break;
          case 16: 
            { if ( debug ) {
			System.out.println("Lexer: OPENBRACE");
			System.out.println("Lexer @ " + yytext() );
		}
		return OPENBRACE;
            }
          case 77: break;
          case 17: 
            { if ( debug ) {
			System.out.println("Lexer: PRIME");
			System.out.println("Lexer @ " + yytext() );
		}
		return PRIME;
            }
          case 78: break;
          case 18: 
            { if ( debug ) {
			System.out.println("Lexer: LPAREN");
			System.out.println("Lexer @ " + yytext() );
		}
		return LPAREN;
            }
          case 79: break;
          case 19: 
            { if ( debug ) {
			System.out.println("Lexer: COMMA");
			System.out.println("Lexer @ " + yytext() );
		}
		return COMMA;
            }
          case 80: break;
          case 20: 
            { if ( debug ) {
			System.out.println("Lexer: RPAREN");
			System.out.println("Lexer @ " + yytext() );
		}
		return RPAREN;
            }
          case 81: break;
          case 21: 
            { if ( debug ) {
			System.out.println("Lexer: POWER");
			System.out.println("Lexer @ " + yytext() );
		}
		return POWER;
            }
          case 82: break;
          case 22: 
            { if ( debug ) {
			System.out.println("Lexer: AND");
			System.out.println("Lexer @ " + yytext() );
		}
		return AND;
            }
          case 83: break;
          case 23: 
            { if ( debug ) {
			System.out.println("Lexer: OR");
			System.out.println("Lexer @ " + yytext() );
		}
		return OR;
            }
          case 84: break;
          case 24: 
            { if ( debug ) {
			System.out.println("Lexer: SCHEMATEXT");
		}
		return SCHEMATEXT;
            }
          case 85: break;
          case 25: 
            { openBraceCount = openBraceCount - 1; 
		if ( openBraceCount == 0 ) {
			if ( debug ) {
				System.out.println("Lexer: CLOSEBRACE");
			}
			yybegin( YYINITIAL );
			return CLOSEBRACE;			
		} else {
			if ( debug ) {
				System.out.println("Lexer: SCHEMATEXT");
			}
			return SCHEMATEXT;
		}
            }
          case 86: break;
          case 26: 
            { if ( openBraceCount == 0 ) {
			openBraceCount = openBraceCount + 1;
			if ( debug ) {
				System.out.println("Lexer: OPENBRACE");
			}
			return OPENBRACE;
		} else {
			openBraceCount = openBraceCount + 1;
			if ( debug ) {
				System.out.println("Lexer: SCHEMATEXT");
			}
			return SCHEMATEXT;
		}
            }
          case 87: break;
          case 27: 
            { if ( debug ) {
			System.out.println("Lexer: IMPLIES");
			System.out.println("Lexer @ " + yytext() );
		}
		return IMPLIES;
            }
          case 88: break;
          case 28: 
            { if ( debug ) {
			System.out.println("Lexer: OPENDIAMOND");
			System.out.println("Lexer @ " + yytext() );
		}
		return OPENDIAMOND;
            }
          case 89: break;
          case 29: 
            { if ( debug ) {
			System.out.println("Lexer: CLOSEDIAMOND");
			System.out.println("Lexer @ " + yytext() );
		}
		return CLOSEDIAMOND;
            }
          case 90: break;
          case 30: 
            { if ( debug ) {
			System.out.println("Lexer: OPENBOX");
			System.out.println("Lexer @ " + yytext() );
		}
		return OPENBOX;
            }
          case 91: break;
          case 31: 
            { if ( debug ) {
			System.out.println("Lexer: CLOSEBOX");
			System.out.println("Lexer @ " + yytext() );
		}
		return CLOSEBOX;
            }
          case 92: break;
          case 32: 
            { if ( debug ) {
			System.out.println("Lexer: ASSIGN");
			System.out.println("Lexer @ " + yytext() );
		}
		return ASSIGN;
            }
          case 93: break;
          case 33: 
            { if ( debug ) {
			System.out.println("Lexer: CUP");
			System.out.println("Lexer @ " + yytext() );
		}
		return CUP;
            }
          case 94: break;
          case 34: 
            { // For mathematica
		if ( debug ) {
			System.out.println("Lexer: AND");
			System.out.println("Lexer @ " + yytext() );
		}
		return AND;
            }
          case 95: break;
          case 35: 
            { // For mathematica
		if ( debug ) {
			System.out.println("Lexer: OR");
			System.out.println("Lexer @ " + yytext() );
		}
		return OR;
            }
          case 96: break;
          case 36: 
            { if ( debug ) {
			System.out.println("Lexer: IFF");
			System.out.println("Lexer @ " + yytext() );
		}
		return IFF;
            }
          case 97: break;
          case 37: 
            { if ( debug ) {
			System.out.println("Lexer: comment");	
			System.out.println("Lexer @ " + yytext() );
		}
            }
          case 98: break;
          case 38: 
            { if ( debug ) {
			System.out.println("Lexer: TRUE");
			System.out.println("Lexer @ " + yytext() );
		}
		return TRUE;
            }
          case 99: break;
          case 39: 
            { // for mathematica
		if ( debug ) {
			System.out.println("Lexer: TRUE");
			System.out.println("Lexer @ " + yytext() );
		}
		return TRUE;
            }
          case 100: break;
          case 40: 
            { if ( debug ) {
			System.out.println("Lexer: FALSE");
			System.out.println("Lexer @ " + yytext() );
		}
		return FALSE;
            }
          case 101: break;
          case 41: 
            { // for mathematica
		if ( debug ) {
			System.out.println("Lexer: FALSE");
			System.out.println("Lexer @ " + yytext() );
		}
		return FALSE;
            }
          case 102: break;
          case 42: 
            { if ( debug ) {
			System.out.println("Lexer: RULES");
			System.out.println("Lexer @ " + yytext() );
		}
		yybegin( SCHEMAS ); return RULES;
            }
          case 103: break;
          case 43: 
            { if ( debug ) {
			System.out.println("Lexer: BOUNDS");
			System.out.println("Lexer @ " + yytext() );
		}
		return BOUNDS;
            }
          case 104: break;
          case 44: 
            { if ( debug ) {
			System.out.println("Lexer: SAFESET");
			System.out.println("Lexer @ " + yytext() );
		}
		return SAFESET;
            }
          case 105: break;
          case 45: 
            { if ( debug ) {
			System.out.println("Lexer: PROBLEM");
			System.out.println("Lexer @ " + yytext() );
		}
		return PROBLEM;
            }
          case 106: break;
          case 46: 
            { if ( debug ) {
			System.out.println("Lexer: EXTERNAL");
			System.out.println("Lexer @ " + yytext() );
		}
		return EXTERNAL;
            }
          case 107: break;
          case 47: 
            { if ( debug ) {
			System.out.println("Lexer: EXISTS");
			System.out.println("Lexer @ " + yytext() );
		}
		return EXISTS;
            }
          case 108: break;
          case 48: 
            { if ( debug ) {
			System.out.println("Lexer: ENVELOPE");
			System.out.println("Lexer @ " + yytext() );
		}
		return ENVELOPE;
            }
          case 109: break;
          case 49: 
            { if ( debug ) {
			System.out.println("Lexer: FORALL");
			System.out.println("Lexer @ " + yytext() );
		}
		return FORALL;
            }
          case 110: break;
          case 50: 
            { if ( debug ) { 
                        System.out.println("Lexer: SETTINGS");
                        System.out.println("Lexer @ " + yytext() );
                }
                return SETTINGS;
            }
          case 111: break;
          case 51: 
            { if ( debug ) {
			System.out.println("Lexer: FUNCTIONS");
			System.out.println("Lexer @ " + yytext() );
		}
		return FUNCTIONS;
            }
          case 112: break;
          case 52: 
            { if ( debug ) {
			System.out.println("Lexer: INVARIANT");
			System.out.println("Lexer @ " + yytext() );
		}
		return INVARIANT;
            }
          case 113: break;
          case 53: 
            { if ( debug ) {
			System.out.println("Lexer: CONTROLLAW");
			System.out.println("Lexer @ " + yytext() );
		}
		return CONTROLLAW;
            }
          case 114: break;
          case 54: 
            { if ( debug ) {
			System.out.println("Lexer: INITIALSET");
			System.out.println("Lexer @ " + yytext() );
		}
		return INITIALSET;
            }
          case 115: break;
          case 55: 
            { if ( debug ) {
			System.out.println("Lexer: ANNOTATION");
			System.out.println("Lexer @ " + yytext() );
		}
		return ANNOTATION;
            }
          case 116: break;
          case 56: 
            { if ( debug ) {
			System.out.println("Lexer: EIPARAMETERS");
			System.out.println("Lexer @ " + yytext() );
		}
		return EIPARAMETERS;
            }
          case 117: break;
          case 57: 
            { if ( debug ) {
			System.out.println("Lexer: STATEVARIABLES");
			System.out.println("Lexer @ " + yytext() );
		}
		return STATEVARIABLES;
            }
          case 118: break;
          case 58: 
            { if ( debug ) {
			System.out.println("Lexer: CONTROLTEMPLATE");
			System.out.println("Lexer @ " + yytext() );
		}
		return CONTROLTEMPLATE;
            }
          case 119: break;
          case 59: 
            { if ( debug ) {
			System.out.println("Lexer: SCHEMAVARIABLES");
			System.out.println("Lexer @ " + yytext() );
		}
		yybegin( SCHEMAS ); 
		return SCHEMAVARIABLES;
            }
          case 120: break;
          case 60: 
            { if ( debug ) {
			System.out.println("Lexer: CONTROLPARAMETERS");
			System.out.println("Lexer @ " + yytext() );
		}
		return CONTROLPARAMETERS;
            }
          case 121: break;
          case 61: 
            { if ( debug ) {
			System.out.println("Lexer: OBJECTIVEFUNCTION");
			System.out.println("Lexer @ " + yytext() );
		}
		return OBJECTIVEFUNCTION;
            }
          case 122: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}

