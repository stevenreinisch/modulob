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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'primitive type'", "'any type'", "'[]'", "'-'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

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

                if ( (LA1_0==11) ) {
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
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulePrimitive236); 

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
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleAny341); 

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


    // $ANTLR start "entryRuleTypeRef"
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:212:1: entryRuleTypeRef returns [EObject current=null] : iv_ruleTypeRef= ruleTypeRef EOF ;
    public final EObject entryRuleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRef = null;


        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:213:2: (iv_ruleTypeRef= ruleTypeRef EOF )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:214:2: iv_ruleTypeRef= ruleTypeRef EOF
            {
             newCompositeNode(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef401);
            iv_ruleTypeRef=ruleTypeRef();

            state._fsp--;

             current =iv_ruleTypeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef411); 

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
    // $ANTLR end "entryRuleTypeRef"


    // $ANTLR start "ruleTypeRef"
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:221:1: ruleTypeRef returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? ) ;
    public final EObject ruleTypeRef() throws RecognitionException {
        EObject current = null;

        Token lv_isMulti_1_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:224:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:225:1: ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:225:1: ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:225:2: ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )?
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:225:2: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:226:1: ( ruleQualifiedName )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:226:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:227:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeRefRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeRef459);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:240:2: ( (lv_isMulti_1_0= '[]' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:241:1: (lv_isMulti_1_0= '[]' )
                    {
                    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:241:1: (lv_isMulti_1_0= '[]' )
                    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:242:3: lv_isMulti_1_0= '[]'
                    {
                    lv_isMulti_1_0=(Token)match(input,13,FOLLOW_13_in_ruleTypeRef477); 

                            newLeafNode(lv_isMulti_1_0, grammarAccess.getTypeRefAccess().getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRefRule());
                    	        }
                           		setWithLastConsumed(current, "isMulti", true, "[]");
                    	    

                    }


                    }
                    break;

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
    // $ANTLR end "ruleTypeRef"


    // $ANTLR start "entryRuleValueObject"
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:263:1: entryRuleValueObject returns [EObject current=null] : iv_ruleValueObject= ruleValueObject EOF ;
    public final EObject entryRuleValueObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueObject = null;


        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:264:2: (iv_ruleValueObject= ruleValueObject EOF )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:265:2: iv_ruleValueObject= ruleValueObject EOF
            {
             newCompositeNode(grammarAccess.getValueObjectRule()); 
            pushFollow(FOLLOW_ruleValueObject_in_entryRuleValueObject527);
            iv_ruleValueObject=ruleValueObject();

            state._fsp--;

             current =iv_ruleValueObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueObject537); 

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
    // $ANTLR end "entryRuleValueObject"


    // $ANTLR start "ruleValueObject"
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:272:1: ruleValueObject returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue | this_FloatValue_2= ruleFloatValue ) ;
    public final EObject ruleValueObject() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_IntegerValue_1 = null;

        EObject this_FloatValue_2 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:275:28: ( (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue | this_FloatValue_2= ruleFloatValue ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:276:1: (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue | this_FloatValue_2= ruleFloatValue )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:276:1: (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue | this_FloatValue_2= ruleFloatValue )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt3=1;
                }
                break;
            case RULE_INT:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==15) ) {
                    alt3=3;
                }
                else if ( (LA3_2==EOF) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 14:
            case 15:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:277:5: this_StringValue_0= ruleStringValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueObjectAccess().getStringValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringValue_in_ruleValueObject584);
                    this_StringValue_0=ruleStringValue();

                    state._fsp--;

                     
                            current = this_StringValue_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:287:5: this_IntegerValue_1= ruleIntegerValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueObjectAccess().getIntegerValueParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIntegerValue_in_ruleValueObject611);
                    this_IntegerValue_1=ruleIntegerValue();

                    state._fsp--;

                     
                            current = this_IntegerValue_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:297:5: this_FloatValue_2= ruleFloatValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueObjectAccess().getFloatValueParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFloatValue_in_ruleValueObject638);
                    this_FloatValue_2=ruleFloatValue();

                    state._fsp--;

                     
                            current = this_FloatValue_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleValueObject"


    // $ANTLR start "entryRuleStringValue"
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:313:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:314:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:315:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue673);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue683); 

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
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:322:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEStringObject ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:325:28: ( ( (lv_value_0_0= ruleEStringObject ) ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:326:1: ( (lv_value_0_0= ruleEStringObject ) )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:326:1: ( (lv_value_0_0= ruleEStringObject ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:327:1: (lv_value_0_0= ruleEStringObject )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:327:1: (lv_value_0_0= ruleEStringObject )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:328:3: lv_value_0_0= ruleEStringObject
            {
             
            	        newCompositeNode(grammarAccess.getStringValueAccess().getValueEStringObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEStringObject_in_ruleStringValue728);
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
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:352:1: entryRuleEStringObject returns [String current=null] : iv_ruleEStringObject= ruleEStringObject EOF ;
    public final String entryRuleEStringObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringObject = null;


        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:353:2: (iv_ruleEStringObject= ruleEStringObject EOF )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:354:2: iv_ruleEStringObject= ruleEStringObject EOF
            {
             newCompositeNode(grammarAccess.getEStringObjectRule()); 
            pushFollow(FOLLOW_ruleEStringObject_in_entryRuleEStringObject764);
            iv_ruleEStringObject=ruleEStringObject();

            state._fsp--;

             current =iv_ruleEStringObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEStringObject775); 

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
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:361:1: ruleEStringObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEStringObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:364:28: (this_STRING_0= RULE_STRING )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:365:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEStringObject814); 

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
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:380:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:381:2: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:382:2: iv_ruleIntegerValue= ruleIntegerValue EOF
            {
             newCompositeNode(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue858);
            iv_ruleIntegerValue=ruleIntegerValue();

            state._fsp--;

             current =iv_ruleIntegerValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValue868); 

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
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:389:1: ruleIntegerValue returns [EObject current=null] : ( (lv_value_0_0= ruleEIntegerObject ) ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:392:28: ( ( (lv_value_0_0= ruleEIntegerObject ) ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:393:1: ( (lv_value_0_0= ruleEIntegerObject ) )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:393:1: ( (lv_value_0_0= ruleEIntegerObject ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:394:1: (lv_value_0_0= ruleEIntegerObject )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:394:1: (lv_value_0_0= ruleEIntegerObject )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:395:3: lv_value_0_0= ruleEIntegerObject
            {
             
            	        newCompositeNode(grammarAccess.getIntegerValueAccess().getValueEIntegerObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEIntegerObject_in_ruleIntegerValue913);
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
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:419:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:420:2: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:421:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
            {
             newCompositeNode(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject949);
            iv_ruleEIntegerObject=ruleEIntegerObject();

            state._fsp--;

             current =iv_ruleEIntegerObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEIntegerObject960); 

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
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:428:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:431:28: (this_INT_0= RULE_INT )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:432:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEIntegerObject999); 

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
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:447:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:448:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:449:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
             newCompositeNode(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue1043);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;

             current =iv_ruleFloatValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue1053); 

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
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:456:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= ruleEFloatObject ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:459:28: ( ( (lv_value_0_0= ruleEFloatObject ) ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:460:1: ( (lv_value_0_0= ruleEFloatObject ) )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:460:1: ( (lv_value_0_0= ruleEFloatObject ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:461:1: (lv_value_0_0= ruleEFloatObject )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:461:1: (lv_value_0_0= ruleEFloatObject )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:462:3: lv_value_0_0= ruleEFloatObject
            {
             
            	        newCompositeNode(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEFloatObject_in_ruleFloatValue1098);
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
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:486:1: entryRuleEFloatObject returns [String current=null] : iv_ruleEFloatObject= ruleEFloatObject EOF ;
    public final String entryRuleEFloatObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloatObject = null;


        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:487:2: (iv_ruleEFloatObject= ruleEFloatObject EOF )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:488:2: iv_ruleEFloatObject= ruleEFloatObject EOF
            {
             newCompositeNode(grammarAccess.getEFloatObjectRule()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject1134);
            iv_ruleEFloatObject=ruleEFloatObject();

            state._fsp--;

             current =iv_ruleEFloatObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEFloatObject1145); 

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
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:495:1: ruleEFloatObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEFloatObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:498:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:499:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:499:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:499:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:499:2: (kw= '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:500:2: kw= '-'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleEFloatObject1184); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:505:3: (this_INT_1= RULE_INT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:505:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEFloatObject1202); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,15,FOLLOW_15_in_ruleEFloatObject1222); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEFloatObject1237); 

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
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:533:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:534:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:535:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1283);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1294); 

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
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:542:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:545:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:546:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:546:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:546:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1334); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:553:1: (kw= '.' this_ID_2= RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:554:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedName1353); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1368); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop6;
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
    public static final BitSet FOLLOW_rulePrimitive_in_ruleTypeLib131 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_ruleAny_in_ruleTypeLib153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePrimitive236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimitive253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAny_in_entryRuleAny294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAny304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleAny341 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAny358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeRef459 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleTypeRef477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueObject_in_entryRuleValueObject527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueObject537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleValueObject584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_ruleValueObject611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_ruleValueObject638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue673 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_ruleStringValue728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_entryRuleEStringObject764 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEStringObject775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEStringObject814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_ruleIntegerValue913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject949 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEIntegerObject960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEIntegerObject999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue1043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_ruleFloatValue1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject1134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEFloatObject1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleEFloatObject1184 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatObject1202 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEFloatObject1222 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatObject1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1334 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedName1353 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1368 = new BitSet(new long[]{0x0000000000008002L});

}