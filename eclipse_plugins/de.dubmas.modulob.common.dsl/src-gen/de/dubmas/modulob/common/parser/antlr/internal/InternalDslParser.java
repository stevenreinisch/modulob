package de.dubmas.modulob.common.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.dubmas.modulob.common.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_DOC_COMMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'primitive type'", "'any type'", "'-'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_DOC_COMMENT=7;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;
     	
        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "TypeLib";	
       	}
       	
       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleTypeLib"
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:67:1: entryRuleTypeLib returns [EObject current=null] : iv_ruleTypeLib= ruleTypeLib EOF ;
    public final EObject entryRuleTypeLib() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLib = null;


        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:68:2: (iv_ruleTypeLib= ruleTypeLib EOF )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:69:2: iv_ruleTypeLib= ruleTypeLib EOF
            {
             newCompositeNode(grammarAccess.getTypeLibRule()); 
            pushFollow(FOLLOW_ruleTypeLib_in_entryRuleTypeLib75);
            iv_ruleTypeLib=ruleTypeLib();

            state._fsp--;

             current =iv_ruleTypeLib; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeLib85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeLib"


    // $ANTLR start "ruleTypeLib"
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:76:1: ruleTypeLib returns [EObject current=null] : ( ( (lv_primitiveTypes_0_0= rulePrimitive ) )+ ( (lv_anyType_1_0= ruleAny ) ) ) ;
    public final EObject ruleTypeLib() throws RecognitionException {
        EObject current = null;

        EObject lv_primitiveTypes_0_0 = null;

        EObject lv_anyType_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:79:28: ( ( ( (lv_primitiveTypes_0_0= rulePrimitive ) )+ ( (lv_anyType_1_0= ruleAny ) ) ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:80:1: ( ( (lv_primitiveTypes_0_0= rulePrimitive ) )+ ( (lv_anyType_1_0= ruleAny ) ) )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:80:1: ( ( (lv_primitiveTypes_0_0= rulePrimitive ) )+ ( (lv_anyType_1_0= ruleAny ) ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:80:2: ( (lv_primitiveTypes_0_0= rulePrimitive ) )+ ( (lv_anyType_1_0= ruleAny ) )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:80:2: ( (lv_primitiveTypes_0_0= rulePrimitive ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:81:1: (lv_primitiveTypes_0_0= rulePrimitive )
            	    {
            	    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:81:1: (lv_primitiveTypes_0_0= rulePrimitive )
            	    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:82:3: lv_primitiveTypes_0_0= rulePrimitive
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTypeLibAccess().getPrimitiveTypesPrimitiveParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimitive_in_ruleTypeLib131);
            	    lv_primitiveTypes_0_0=rulePrimitive();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTypeLibRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"primitiveTypes",
            	            		lv_primitiveTypes_0_0, 
            	            		"Primitive");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:98:3: ( (lv_anyType_1_0= ruleAny ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:99:1: (lv_anyType_1_0= ruleAny )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:99:1: (lv_anyType_1_0= ruleAny )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:100:3: lv_anyType_1_0= ruleAny
            {
             
            	        newCompositeNode(grammarAccess.getTypeLibAccess().getAnyTypeAnyParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAny_in_ruleTypeLib153);
            lv_anyType_1_0=ruleAny();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTypeLibRule());
            	        }
                   		set(
                   			current, 
                   			"anyType",
                    		lv_anyType_1_0, 
                    		"Any");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeLib"


    // $ANTLR start "entryRulePrimitive"
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:124:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:125:2: (iv_rulePrimitive= rulePrimitive EOF )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:126:2: iv_rulePrimitive= rulePrimitive EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive189);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;

             current =iv_rulePrimitive; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive199); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:133:1: rulePrimitive returns [EObject current=null] : (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:136:28: ( (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:137:1: (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:137:1: (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:137:3: otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_rulePrimitive236); 

                	newLeafNode(otherlv_0, grammarAccess.getPrimitiveAccess().getPrimitiveTypeKeyword_0());
                
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:141:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:142:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:142:1: (lv_name_1_0= RULE_ID )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:143:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimitive253); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPrimitiveAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPrimitiveRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleAny"
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:167:1: entryRuleAny returns [EObject current=null] : iv_ruleAny= ruleAny EOF ;
    public final EObject entryRuleAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAny = null;


        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:168:2: (iv_ruleAny= ruleAny EOF )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:169:2: iv_ruleAny= ruleAny EOF
            {
             newCompositeNode(grammarAccess.getAnyRule()); 
            pushFollow(FOLLOW_ruleAny_in_entryRuleAny294);
            iv_ruleAny=ruleAny();

            state._fsp--;

             current =iv_ruleAny; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAny304); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAny"


    // $ANTLR start "ruleAny"
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:176:1: ruleAny returns [EObject current=null] : (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAny() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:179:28: ( (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:180:1: (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:180:1: (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:180:3: otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleAny341); 

                	newLeafNode(otherlv_0, grammarAccess.getAnyAccess().getAnyTypeKeyword_0());
                
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:184:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:185:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:185:1: (lv_name_1_0= RULE_ID )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:186:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAny358); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAnyAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAnyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAny"


    // $ANTLR start "entryRuleStringValue"
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:214:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:215:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:216:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue403);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue413); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:223:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEStringObject ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:226:28: ( ( (lv_value_0_0= ruleEStringObject ) ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:227:1: ( (lv_value_0_0= ruleEStringObject ) )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:227:1: ( (lv_value_0_0= ruleEStringObject ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:228:1: (lv_value_0_0= ruleEStringObject )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:228:1: (lv_value_0_0= ruleEStringObject )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:229:3: lv_value_0_0= ruleEStringObject
            {
             
            	        newCompositeNode(grammarAccess.getStringValueAccess().getValueEStringObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEStringObject_in_ruleStringValue458);
            lv_value_0_0=ruleEStringObject();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStringValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"EStringObject");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleEStringObject"
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:253:1: entryRuleEStringObject returns [String current=null] : iv_ruleEStringObject= ruleEStringObject EOF ;
    public final String entryRuleEStringObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringObject = null;


        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:254:2: (iv_ruleEStringObject= ruleEStringObject EOF )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:255:2: iv_ruleEStringObject= ruleEStringObject EOF
            {
             newCompositeNode(grammarAccess.getEStringObjectRule()); 
            pushFollow(FOLLOW_ruleEStringObject_in_entryRuleEStringObject494);
            iv_ruleEStringObject=ruleEStringObject();

            state._fsp--;

             current =iv_ruleEStringObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEStringObject505); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEStringObject"


    // $ANTLR start "ruleEStringObject"
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:262:1: ruleEStringObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEStringObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:265:28: (this_STRING_0= RULE_STRING )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:266:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEStringObject544); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getEStringObjectAccess().getSTRINGTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEStringObject"


    // $ANTLR start "entryRuleIntegerValue"
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:281:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:282:2: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:283:2: iv_ruleIntegerValue= ruleIntegerValue EOF
            {
             newCompositeNode(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue588);
            iv_ruleIntegerValue=ruleIntegerValue();

            state._fsp--;

             current =iv_ruleIntegerValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValue598); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerValue"


    // $ANTLR start "ruleIntegerValue"
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:290:1: ruleIntegerValue returns [EObject current=null] : ( (lv_value_0_0= ruleEIntegerObject ) ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:293:28: ( ( (lv_value_0_0= ruleEIntegerObject ) ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:294:1: ( (lv_value_0_0= ruleEIntegerObject ) )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:294:1: ( (lv_value_0_0= ruleEIntegerObject ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:295:1: (lv_value_0_0= ruleEIntegerObject )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:295:1: (lv_value_0_0= ruleEIntegerObject )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:296:3: lv_value_0_0= ruleEIntegerObject
            {
             
            	        newCompositeNode(grammarAccess.getIntegerValueAccess().getValueEIntegerObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEIntegerObject_in_ruleIntegerValue643);
            lv_value_0_0=ruleEIntegerObject();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntegerValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"EIntegerObject");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerValue"


    // $ANTLR start "entryRuleEIntegerObject"
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:320:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:321:2: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:322:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
            {
             newCompositeNode(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject679);
            iv_ruleEIntegerObject=ruleEIntegerObject();

            state._fsp--;

             current =iv_ruleEIntegerObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEIntegerObject690); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEIntegerObject"


    // $ANTLR start "ruleEIntegerObject"
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:329:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:332:28: (this_INT_0= RULE_INT )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:333:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEIntegerObject729); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEIntegerObject"


    // $ANTLR start "entryRuleFloatValue"
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:348:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:349:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:350:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
             newCompositeNode(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue773);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;

             current =iv_ruleFloatValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue783); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatValue"


    // $ANTLR start "ruleFloatValue"
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:357:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= ruleEFloatObject ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:360:28: ( ( (lv_value_0_0= ruleEFloatObject ) ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:361:1: ( (lv_value_0_0= ruleEFloatObject ) )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:361:1: ( (lv_value_0_0= ruleEFloatObject ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:362:1: (lv_value_0_0= ruleEFloatObject )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:362:1: (lv_value_0_0= ruleEFloatObject )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:363:3: lv_value_0_0= ruleEFloatObject
            {
             
            	        newCompositeNode(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEFloatObject_in_ruleFloatValue828);
            lv_value_0_0=ruleEFloatObject();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFloatValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"EFloatObject");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloatValue"


    // $ANTLR start "entryRuleEFloatObject"
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:387:1: entryRuleEFloatObject returns [String current=null] : iv_ruleEFloatObject= ruleEFloatObject EOF ;
    public final String entryRuleEFloatObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloatObject = null;


        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:388:2: (iv_ruleEFloatObject= ruleEFloatObject EOF )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:389:2: iv_ruleEFloatObject= ruleEFloatObject EOF
            {
             newCompositeNode(grammarAccess.getEFloatObjectRule()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject864);
            iv_ruleEFloatObject=ruleEFloatObject();

            state._fsp--;

             current =iv_ruleEFloatObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEFloatObject875); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEFloatObject"


    // $ANTLR start "ruleEFloatObject"
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:396:1: ruleEFloatObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEFloatObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:399:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:400:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:400:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:400:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:400:2: (kw= '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:401:2: kw= '-'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleEFloatObject914); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:406:3: (this_INT_1= RULE_INT )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:406:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEFloatObject932); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,15,FOLLOW_15_in_ruleEFloatObject952); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEFloatObject967); 

            		current.merge(this_INT_3);
                
             
                newLeafNode(this_INT_3, grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_3()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEFloatObject"


    // $ANTLR start "entryRuleQualifiedName"
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:434:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:435:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:436:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1013);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1024); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:443:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:446:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:447:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:447:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:447:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1064); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:454:1: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:455:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedName1083); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1098); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleTypeLib_in_entryRuleTypeLib75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeLib85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_ruleTypeLib131 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_ruleAny_in_ruleTypeLib153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePrimitive236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimitive253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAny_in_entryRuleAny294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAny304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleAny341 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAny358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_ruleStringValue458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_entryRuleEStringObject494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEStringObject505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEStringObject544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_ruleIntegerValue643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEIntegerObject690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEIntegerObject729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue773 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_ruleFloatValue828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEFloatObject875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleEFloatObject914 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatObject932 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEFloatObject952 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatObject967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1013 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1064 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedName1083 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1098 = new BitSet(new long[]{0x0000000000008002L});

}