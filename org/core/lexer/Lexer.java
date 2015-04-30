package org.core.lexer;

import org.core.tokens.IntToken;
import org.core.tokens.Sym;
import org.core.tokens.Token;
import org.core.tokens.VarToken;

/* The following code was generated by JFlex 1.6.0 */

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.0
 * from the specification file <tt>expression.flex</tt>
 */
public class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\1\2\0\1\1\22\0\1\1\7\0\1\6\1\7"+
    "\1\12\1\10\1\0\1\11\1\0\1\13\1\3\11\2\1\41\1\42"+
    "\1\15\1\14\1\16\2\0\32\5\6\0\1\17\2\4\1\21\1\31"+
    "\1\30\2\4\1\27\2\4\1\32\1\4\1\20\1\22\1\40\1\4"+
    "\1\23\1\33\1\36\1\37\1\34\1\35\1\24\2\4\1\25\1\0"+
    "\1\26\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uff92\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\2\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\4\4\1\16"+
    "\1\17\10\4\1\20\1\21\2\4\1\22\1\4\1\23"+
    "\6\4\1\24\1\4\1\25\1\4\1\26\1\4\1\27"+
    "\3\4\1\30\2\4\1\31\1\4\1\32\1\33\1\4"+
    "\1\34\2\4\1\35\1\36\1\4\1\37";

  private static int [] zzUnpackAction() {
    int [] result = new int[67];
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
    "\0\0\0\43\0\43\0\106\0\43\0\151\0\43\0\43"+
    "\0\43\0\43\0\43\0\43\0\43\0\43\0\43\0\214"+
    "\0\257\0\322\0\365\0\43\0\43\0\u0118\0\u013b\0\u015e"+
    "\0\u0181\0\u01a4\0\u01c7\0\u01ea\0\u020d\0\43\0\43\0\u0230"+
    "\0\u0253\0\151\0\u0276\0\151\0\u0299\0\u02bc\0\u02df\0\u0302"+
    "\0\u0325\0\u0348\0\151\0\u036b\0\151\0\u038e\0\151\0\u03b1"+
    "\0\151\0\u03d4\0\u03f7\0\u041a\0\151\0\u043d\0\u0460\0\151"+
    "\0\u0483\0\151\0\151\0\u04a6\0\151\0\u04c9\0\u04ec\0\151"+
    "\0\151\0\u050f\0\151";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[67];
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
    "\1\2\1\3\1\4\1\5\1\6\1\2\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\6\1\21\1\22\1\6\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\6\1\31\1\32\1\6\1\33\1\34"+
    "\1\35\1\36\1\37\45\0\2\4\43\0\2\6\11\0"+
    "\6\6\2\0\12\6\6\0\2\6\11\0\1\6\1\40"+
    "\4\6\2\0\12\6\6\0\2\6\11\0\3\6\1\41"+
    "\2\6\2\0\12\6\6\0\2\6\11\0\4\6\1\42"+
    "\1\6\2\0\12\6\6\0\2\6\11\0\3\6\1\43"+
    "\2\6\2\0\12\6\6\0\2\6\11\0\6\6\2\0"+
    "\1\6\1\44\10\6\6\0\2\6\11\0\3\6\1\45"+
    "\2\6\2\0\12\6\6\0\2\6\11\0\1\6\1\46"+
    "\4\6\2\0\3\6\1\47\6\6\6\0\2\6\11\0"+
    "\6\6\2\0\7\6\1\50\2\6\6\0\2\6\11\0"+
    "\1\51\5\6\2\0\12\6\6\0\2\6\11\0\6\6"+
    "\2\0\10\6\1\52\1\6\6\0\2\6\11\0\6\6"+
    "\2\0\11\6\1\53\6\0\2\6\11\0\4\6\1\54"+
    "\1\6\2\0\12\6\6\0\2\6\11\0\2\6\1\55"+
    "\3\6\2\0\12\6\6\0\2\6\11\0\6\6\2\0"+
    "\6\6\1\56\3\6\6\0\2\6\11\0\4\6\1\57"+
    "\1\6\2\0\12\6\6\0\2\6\11\0\4\6\1\60"+
    "\1\6\2\0\12\6\6\0\2\6\11\0\2\6\1\61"+
    "\3\6\2\0\12\6\6\0\2\6\11\0\6\6\2\0"+
    "\1\62\3\6\1\63\5\6\6\0\2\6\11\0\1\64"+
    "\5\6\2\0\12\6\6\0\2\6\11\0\4\6\1\65"+
    "\1\6\2\0\12\6\6\0\2\6\11\0\4\6\1\66"+
    "\1\6\2\0\12\6\6\0\2\6\11\0\6\6\2\0"+
    "\1\67\11\6\6\0\2\6\11\0\1\6\1\70\4\6"+
    "\2\0\12\6\6\0\2\6\11\0\6\6\2\0\6\6"+
    "\1\71\3\6\6\0\2\6\11\0\6\6\2\0\1\6"+
    "\1\72\10\6\6\0\2\6\11\0\6\6\2\0\2\6"+
    "\1\73\7\6\6\0\2\6\11\0\4\6\1\74\1\6"+
    "\2\0\12\6\6\0\2\6\11\0\1\6\1\75\4\6"+
    "\2\0\12\6\6\0\2\6\11\0\1\6\1\76\4\6"+
    "\2\0\12\6\6\0\2\6\11\0\1\77\5\6\2\0"+
    "\12\6\6\0\2\6\11\0\6\6\2\0\7\6\1\100"+
    "\2\6\6\0\2\6\11\0\6\6\2\0\7\6\1\101"+
    "\2\6\6\0\2\6\11\0\4\6\1\102\1\6\2\0"+
    "\12\6\6\0\2\6\11\0\2\6\1\103\3\6\2\0"+
    "\12\6\2\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1330];
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
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\1\1\1\11\1\1\11\11\4\1\2\11"+
    "\10\1\2\11\44\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[67];
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
	private Token token(Sym type) {
		return new Token(type);
	}
	private IntToken token(Sym type, int n) {
		return new IntToken(type, n);
	}
	private VarToken token(Sym type, String name) {
		return new VarToken(type, name);
	}
	public int[] getPosition() {
		return new int[]{yyline, yycolumn}; 
	}


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
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
    while (i < 136) {
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
    int totalRead = 0;
    while (totalRead < requested) {
      int numRead = zzReader.read(zzBuffer, zzEndRead + totalRead, requested - totalRead);
      if (numRead == -1) {
        break;
      }
      totalRead += numRead;
    }

    if (totalRead > 0) {
      zzEndRead += totalRead;
      if (totalRead == requested) { /* possibly more input available */
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      return false;
    }

    // totalRead = 0: End of stream
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
  public Token yylex() throws java.io.IOException, 	LexerException
 {
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

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 1: 
          { throw new LexerException(yyline, yycolumn);
          }
        case 32: break;
        case 2: 
          { 
          }
        case 33: break;
        case 3: 
          { return token(Sym.INT, Integer.parseInt(yytext()));
          }
        case 34: break;
        case 4: 
          { return token(Sym.VARIABLE, yytext());
          }
        case 35: break;
        case 5: 
          { return token(Sym.LPAR);
          }
        case 36: break;
        case 6: 
          { return token(Sym.RPAR);
          }
        case 37: break;
        case 7: 
          { return token(Sym.PLUS);
          }
        case 38: break;
        case 8: 
          { return token(Sym.MINUS);
          }
        case 39: break;
        case 9: 
          { return token(Sym.TIMES);
          }
        case 40: break;
        case 10: 
          { return token(Sym.DIV);
          }
        case 41: break;
        case 11: 
          { return token(Sym.EQ);
          }
        case 42: break;
        case 12: 
          { return token(Sym.INF);
          }
        case 43: break;
        case 13: 
          { return token(Sym.SUP);
          }
        case 44: break;
        case 14: 
          { return token(Sym.LBRA);
          }
        case 45: break;
        case 15: 
          { return token(Sym.RBRA);
          }
        case 46: break;
        case 16: 
          { return token(Sym.COLON);
          }
        case 47: break;
        case 17: 
          { return token(Sym.ENDL);
          }
        case 48: break;
        case 18: 
          { return token(Sym.OR);
          }
        case 49: break;
        case 19: 
          { return token(Sym.IF);
          }
        case 50: break;
        case 20: 
          { return token(Sym.UP);
          }
        case 51: break;
        case 21: 
          { return token(Sym.AND);
          }
        case 52: break;
        case 22: 
          { return token(Sym.XOR);
          }
        case 53: break;
        case 23: 
          { return token(Sym.END);
          }
        case 54: break;
        case 24: 
          { return token(Sym.VAR);
          }
        case 55: break;
        case 25: 
          { return token(Sym.DOWN);
          }
        case 56: break;
        case 26: 
          { return token(Sym.ELIF);
          }
        case 57: break;
        case 27: 
          { return token(Sym.ELSE);
          }
        case 58: break;
        case 28: 
          { return token(Sym.TURN);
          }
        case 59: break;
        case 29: 
          { return token(Sym.START);
          }
        case 60: break;
        case 30: 
          { return token(Sym.PRINT);
          }
        case 61: break;
        case 31: 
          { return token(Sym.FORWARD);
          }
        case 62: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            switch (zzLexicalState) {
            case YYINITIAL: {
              return token(Sym.EOF);
            }
            case 68: break;
            default:
            return null;
            }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
