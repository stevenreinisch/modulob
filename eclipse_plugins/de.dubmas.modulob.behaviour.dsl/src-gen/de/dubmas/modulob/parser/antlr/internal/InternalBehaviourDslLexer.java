package de.dubmas.modulob.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBehaviourDslLexer extends Lexer {
    public static final int RULE_ID=5;
    public static final int RULE_DOC_COMMENT=7;
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
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;

    // delegates
    // delegators

    public InternalBehaviourDslLexer() {;} 
    public InternalBehaviourDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalBehaviourDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:11:7: ( 'current' )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:11:9: 'current'
            {
            match("current"); 


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
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:12:7: ( 'behaviours for system' )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:12:9: 'behaviours for system'
            {
            match("behaviours for system"); 


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
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:13:7: ( 'version' )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:13:9: 'version'
            {
            match("version"); 


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
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:14:7: ( 'behaviour' )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:14:9: 'behaviour'
            {
            match("behaviour"); 


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
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:15:7: ( '{' )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:15:9: '{'
            {
            match('{'); 

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
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:16:7: ( '}' )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:16:9: '}'
            {
            match('}'); 

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
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:17:7: ( 'interface' )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:17:9: 'interface'
            {
            match("interface"); 


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
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:18:7: ( 'reacts to' )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:18:9: 'reacts to'
            {
            match("reacts to"); 


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
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:19:7: ( 'as' )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:19:9: 'as'
            {
            match("as"); 


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
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:20:7: ( '.' )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:20:9: '.'
            {
            match('.'); 

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
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:21:7: ( 'by calling' )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:21:9: 'by calling'
            {
            match("by calling"); 


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
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:22:7: ( ':' )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:22:9: ':'
            {
            match(':'); 

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
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:23:7: ( 'primitive type' )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:23:9: 'primitive type'
            {
            match("primitive type"); 


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
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:24:7: ( 'any type' )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:24:9: 'any type'
            {
            match("any type"); 


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
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:25:7: ( '-' )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:25:9: '-'
            {
            match('-'); 

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
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:728:18: ( '<*' ( options {greedy=false; } : . )* '*>' )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:728:20: '<*' ( options {greedy=false; } : . )* '*>'
            {
            match("<*"); 

            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:728:25: ( options {greedy=false; } : . )*
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
            	    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:728:53: .
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
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:730:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:730:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:730:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:730:11: '^'
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

            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:730:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:
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
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:732:10: ( ( '0' .. '9' )+ )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:732:12: ( '0' .. '9' )+
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:732:12: ( '0' .. '9' )+
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
            	    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:732:13: '0' .. '9'
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
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:734:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:734:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:734:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:734:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:734:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:734:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:734:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:734:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:734:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:734:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:734:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:736:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:736:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:736:24: ( options {greedy=false; } : . )*
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
            	    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:736:52: .
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
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:738:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:738:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:738:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:738:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:738:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:738:41: ( '\\r' )? '\\n'
                    {
                    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:738:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:738:41: '\\r'
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
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:740:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:740:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:740:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:
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
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:742:16: ( . )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:742:18: .
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
        // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | RULE_DOC_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=23;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:1:100: RULE_DOC_COMMENT
                {
                mRULE_DOC_COMMENT(); 

                }
                break;
            case 17 :
                // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:1:117: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 18 :
                // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:1:125: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 19 :
                // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:1:134: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 20 :
                // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:1:146: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 21 :
                // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:1:162: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 22 :
                // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:1:178: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 23 :
                // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:1:186: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\3\27\2\uffff\3\27\2\uffff\1\27\1\uffff\2\25\2\uffff\3\25"+
        "\2\uffff\1\27\1\uffff\3\27\2\uffff\2\27\1\61\1\27\2\uffff\1\27\7"+
        "\uffff\2\27\1\uffff\3\27\1\uffff\7\27\1\uffff\15\27\1\115\1\27\1"+
        "\117\1\27\1\uffff\1\27\1\uffff\1\27\1\uffff\2\27\1\126\1\127\2\27"+
        "\4\uffff";
    static final String DFA13_eofS =
        "\132\uffff";
    static final String DFA13_minS =
        "\1\0\1\165\2\145\2\uffff\1\156\1\145\1\156\2\uffff\1\162\1\uffff"+
        "\1\52\1\101\2\uffff\2\0\1\52\2\uffff\1\162\1\uffff\1\150\1\40\1"+
        "\162\2\uffff\1\164\1\141\1\60\1\171\2\uffff\1\151\7\uffff\1\162"+
        "\1\141\1\uffff\1\163\1\145\1\143\1\uffff\1\40\1\155\1\145\1\166"+
        "\1\151\1\162\1\164\1\uffff\1\151\1\156\1\151\1\157\1\146\1\163\2"+
        "\164\1\157\1\156\1\141\1\40\1\151\1\60\1\165\1\60\1\143\1\uffff"+
        "\1\166\1\uffff\1\162\1\uffff\2\145\2\60\2\40\4\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\165\1\171\1\145\2\uffff\1\156\1\145\1\163\2\uffff\1\162"+
        "\1\uffff\1\52\1\172\2\uffff\2\uffff\1\57\2\uffff\1\162\1\uffff\1"+
        "\150\1\40\1\162\2\uffff\1\164\1\141\1\172\1\171\2\uffff\1\151\7"+
        "\uffff\1\162\1\141\1\uffff\1\163\1\145\1\143\1\uffff\1\40\1\155"+
        "\1\145\1\166\1\151\1\162\1\164\1\uffff\1\151\1\156\1\151\1\157\1"+
        "\146\1\163\2\164\1\157\1\156\1\141\1\40\1\151\1\172\1\165\1\172"+
        "\1\143\1\uffff\1\166\1\uffff\1\162\1\uffff\2\145\2\172\2\40\4\uffff";
    static final String DFA13_acceptS =
        "\4\uffff\1\5\1\6\3\uffff\1\12\1\14\1\uffff\1\17\2\uffff\1\21\1\22"+
        "\3\uffff\1\26\1\27\1\uffff\1\21\3\uffff\1\5\1\6\4\uffff\1\12\1\14"+
        "\1\uffff\1\17\1\20\1\22\1\23\1\24\1\25\1\26\2\uffff\1\13\3\uffff"+
        "\1\11\7\uffff\1\16\21\uffff\1\10\1\uffff\1\1\1\uffff\1\3\6\uffff"+
        "\1\4\1\7\1\15\1\2";
    static final String DFA13_specialS =
        "\1\1\20\uffff\1\0\1\2\107\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\25\2\24\2\25\1\24\22\25\1\24\1\25\1\21\4\25\1\22\5\25\1"+
            "\14\1\11\1\23\12\20\1\12\1\25\1\15\4\25\32\17\3\25\1\16\1\17"+
            "\1\25\1\10\1\2\1\1\5\17\1\6\6\17\1\13\1\17\1\7\3\17\1\3\4\17"+
            "\1\4\1\25\1\5\uff82\25",
            "\1\26",
            "\1\30\23\uffff\1\31",
            "\1\32",
            "",
            "",
            "\1\35",
            "\1\36",
            "\1\40\4\uffff\1\37",
            "",
            "",
            "\1\43",
            "",
            "\1\45",
            "\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "\0\47",
            "\0\47",
            "\1\50\4\uffff\1\51",
            "",
            "",
            "\1\53",
            "",
            "\1\54",
            "\1\55",
            "\1\56",
            "",
            "",
            "\1\57",
            "\1\60",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\62",
            "",
            "",
            "\1\63",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\64",
            "\1\65",
            "",
            "\1\66",
            "\1\67",
            "\1\70",
            "",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\116",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\120",
            "",
            "\1\121",
            "",
            "\1\122",
            "",
            "\1\123",
            "\1\124",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\22\27\1\125\7\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\130",
            "\1\131",
            "",
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
                        int LA13_17 = input.LA(1);

                        s = -1;
                        if ( ((LA13_17>='\u0000' && LA13_17<='\uFFFF')) ) {s = 39;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='c') ) {s = 1;}

                        else if ( (LA13_0=='b') ) {s = 2;}

                        else if ( (LA13_0=='v') ) {s = 3;}

                        else if ( (LA13_0=='{') ) {s = 4;}

                        else if ( (LA13_0=='}') ) {s = 5;}

                        else if ( (LA13_0=='i') ) {s = 6;}

                        else if ( (LA13_0=='r') ) {s = 7;}

                        else if ( (LA13_0=='a') ) {s = 8;}

                        else if ( (LA13_0=='.') ) {s = 9;}

                        else if ( (LA13_0==':') ) {s = 10;}

                        else if ( (LA13_0=='p') ) {s = 11;}

                        else if ( (LA13_0=='-') ) {s = 12;}

                        else if ( (LA13_0=='<') ) {s = 13;}

                        else if ( (LA13_0=='^') ) {s = 14;}

                        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='d' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='o')||LA13_0=='q'||(LA13_0>='s' && LA13_0<='u')||(LA13_0>='w' && LA13_0<='z')) ) {s = 15;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 16;}

                        else if ( (LA13_0=='\"') ) {s = 17;}

                        else if ( (LA13_0=='\'') ) {s = 18;}

                        else if ( (LA13_0=='/') ) {s = 19;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 20;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<=',')||LA13_0==';'||(LA13_0>='=' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_18 = input.LA(1);

                        s = -1;
                        if ( ((LA13_18>='\u0000' && LA13_18<='\uFFFF')) ) {s = 39;}

                        else s = 21;

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