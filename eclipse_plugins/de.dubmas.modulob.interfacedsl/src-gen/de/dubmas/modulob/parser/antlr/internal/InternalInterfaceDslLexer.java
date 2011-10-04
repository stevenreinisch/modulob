package de.dubmas.modulob.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalInterfaceDslLexer extends Lexer {
    public static final int RULE_ID=6;
    public static final int RULE_DOC_COMMENT=5;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
    public static final int RULE_WS=10;

    // delegates
    // delegators

    public InternalInterfaceDslLexer() {;} 
    public InternalInterfaceDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalInterfaceDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:11:7: ( 'interfaces for module' )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:11:9: 'interfaces for module'
            {
            match("interfaces for module"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:12:7: ( 'version' )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:12:9: 'version'
            {
            match("version"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:13:7: ( 'interface' )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:13:9: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:14:7: ( 'requires' )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:14:9: 'requires'
            {
            match("requires"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:15:7: ( ',' )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:15:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:16:7: ( '{' )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:16:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:17:7: ( '}' )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:17:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:18:7: ( 'static' )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:18:9: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:19:7: ( ';' )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:19:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:20:7: ( ':' )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:20:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:21:7: ( 'primitive type' )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:21:9: 'primitive type'
            {
            match("primitive type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:22:7: ( 'any type' )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:22:9: 'any type'
            {
            match("any type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:23:7: ( '[]' )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:23:9: '[]'
            {
            match("[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:24:7: ( '-' )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:24:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:25:7: ( '.' )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:25:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "RULE_DOC_COMMENT"
    public final void mRULE_DOC_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_DOC_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:864:18: ( '<*' ( options {greedy=false; } : . )* '*>' )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:864:20: '<*' ( options {greedy=false; } : . )* '*>'
            {
            match("<*"); 

            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:864:25: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='>') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='=')||(LA1_1>='?' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<=')')||(LA1_0>='+' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:864:53: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match("*>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOC_COMMENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:866:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:866:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:866:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:866:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:866:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:868:10: ( ( '0' .. '9' )+ )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:868:12: ( '0' .. '9' )+
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:868:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:868:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:870:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:870:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:870:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:870:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:870:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:870:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:870:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:870:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:870:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:870:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:870:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:872:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:872:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:872:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:872:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:874:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:874:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:874:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:874:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:874:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:874:41: ( '\\r' )? '\\n'
                    {
                    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:874:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:874:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:876:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:876:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:876:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:878:16: ( . )
            // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:878:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | RULE_DOC_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=23;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:1:100: RULE_DOC_COMMENT
                {
                mRULE_DOC_COMMENT(); 

                }
                break;
            case 17 :
                // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:1:117: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 18 :
                // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:1:125: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 19 :
                // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:1:134: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 20 :
                // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:1:146: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 21 :
                // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:1:162: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 22 :
                // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:1:178: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 23 :
                // ../de.dubmas.modulob.interfacedsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalInterfaceDsl.g:1:186: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\3\31\3\uffff\1\31\2\uffff\2\31\1\27\2\uffff\2\27\2\uffff"+
        "\3\27\2\uffff\1\31\1\uffff\2\31\3\uffff\1\31\2\uffff\2\31\11\uffff"+
        "\13\31\1\uffff\10\31\1\106\2\31\1\111\1\31\1\uffff\2\31\1\uffff"+
        "\1\115\1\31\1\120\1\uffff\2\31\3\uffff";
    static final String DFA13_eofS =
        "\123\uffff";
    static final String DFA13_minS =
        "\1\0\1\156\2\145\3\uffff\1\164\2\uffff\1\162\1\156\1\135\2\uffff"+
        "\1\52\1\101\2\uffff\2\0\1\52\2\uffff\1\164\1\uffff\1\162\1\161\3"+
        "\uffff\1\141\2\uffff\1\151\1\171\11\uffff\1\145\1\163\1\165\1\164"+
        "\1\155\1\40\1\162\4\151\1\uffff\1\146\1\157\1\162\1\143\1\164\1"+
        "\141\1\156\1\145\1\60\1\151\1\143\1\60\1\163\1\uffff\1\166\1\145"+
        "\1\uffff\1\60\1\145\1\60\1\uffff\2\40\3\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\156\2\145\3\uffff\1\164\2\uffff\1\162\1\156\1\135\2\uffff"+
        "\1\52\1\172\2\uffff\2\uffff\1\57\2\uffff\1\164\1\uffff\1\162\1\161"+
        "\3\uffff\1\141\2\uffff\1\151\1\171\11\uffff\1\145\1\163\1\165\1"+
        "\164\1\155\1\40\1\162\4\151\1\uffff\1\146\1\157\1\162\1\143\1\164"+
        "\1\141\1\156\1\145\1\172\1\151\1\143\1\172\1\163\1\uffff\1\166\1"+
        "\145\1\uffff\1\172\1\145\1\172\1\uffff\2\40\3\uffff";
    static final String DFA13_acceptS =
        "\4\uffff\1\5\1\6\1\7\1\uffff\1\11\1\12\3\uffff\1\16\1\17\2\uffff"+
        "\1\21\1\22\3\uffff\1\26\1\27\1\uffff\1\21\2\uffff\1\5\1\6\1\7\1"+
        "\uffff\1\11\1\12\2\uffff\1\15\1\16\1\17\1\20\1\22\1\23\1\24\1\25"+
        "\1\26\13\uffff\1\14\15\uffff\1\10\2\uffff\1\2\3\uffff\1\4\2\uffff"+
        "\1\3\1\13\1\1";
    static final String DFA13_specialS =
        "\1\0\22\uffff\1\2\1\1\76\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\27\2\26\2\27\1\26\22\27\1\26\1\27\1\23\4\27\1\24\4\27\1"+
            "\4\1\15\1\16\1\25\12\22\1\11\1\10\1\17\4\27\32\21\1\14\2\27"+
            "\1\20\1\21\1\27\1\13\7\21\1\1\6\21\1\12\1\21\1\3\1\7\2\21\1"+
            "\2\4\21\1\5\1\27\1\6\uff82\27",
            "\1\30",
            "\1\32",
            "\1\33",
            "",
            "",
            "",
            "\1\37",
            "",
            "",
            "\1\42",
            "\1\43",
            "\1\44",
            "",
            "",
            "\1\47",
            "\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\0\51",
            "\0\51",
            "\1\52\4\uffff\1\53",
            "",
            "",
            "\1\55",
            "",
            "\1\56",
            "\1\57",
            "",
            "",
            "",
            "\1\60",
            "",
            "",
            "\1\61",
            "\1\62",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\107",
            "\1\110",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\112",
            "",
            "\1\113",
            "\1\114",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\116",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\22\31\1\117\7\31",
            "",
            "\1\121",
            "\1\122",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | RULE_DOC_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='i') ) {s = 1;}

                        else if ( (LA13_0=='v') ) {s = 2;}

                        else if ( (LA13_0=='r') ) {s = 3;}

                        else if ( (LA13_0==',') ) {s = 4;}

                        else if ( (LA13_0=='{') ) {s = 5;}

                        else if ( (LA13_0=='}') ) {s = 6;}

                        else if ( (LA13_0=='s') ) {s = 7;}

                        else if ( (LA13_0==';') ) {s = 8;}

                        else if ( (LA13_0==':') ) {s = 9;}

                        else if ( (LA13_0=='p') ) {s = 10;}

                        else if ( (LA13_0=='a') ) {s = 11;}

                        else if ( (LA13_0=='[') ) {s = 12;}

                        else if ( (LA13_0=='-') ) {s = 13;}

                        else if ( (LA13_0=='.') ) {s = 14;}

                        else if ( (LA13_0=='<') ) {s = 15;}

                        else if ( (LA13_0=='^') ) {s = 16;}

                        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='b' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='o')||LA13_0=='q'||(LA13_0>='t' && LA13_0<='u')||(LA13_0>='w' && LA13_0<='z')) ) {s = 17;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 18;}

                        else if ( (LA13_0=='\"') ) {s = 19;}

                        else if ( (LA13_0=='\'') ) {s = 20;}

                        else if ( (LA13_0=='/') ) {s = 21;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 22;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='+')||(LA13_0>='=' && LA13_0<='@')||(LA13_0>='\\' && LA13_0<=']')||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 23;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_20 = input.LA(1);

                        s = -1;
                        if ( ((LA13_20>='\u0000' && LA13_20<='\uFFFF')) ) {s = 41;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_19 = input.LA(1);

                        s = -1;
                        if ( ((LA13_19>='\u0000' && LA13_19<='\uFFFF')) ) {s = 41;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}