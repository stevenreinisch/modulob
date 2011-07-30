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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'indexed'", "'-['", "'='", "'<->'", "';'", "'[]'", "'-'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
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
        	return "Feature";	
       	}
       	
       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleFeature"
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:67:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:68:2: (iv_ruleFeature= ruleFeature EOF )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:69:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature75);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature85); 

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:76:1: ruleFeature returns [EObject current=null] : ( ( (lv_isIndexed_0_0= 'indexed' ) )? ( (lv_isContainment_1_0= '-[' ) )? ( (lv_type_2_0= ruleTypeRef ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleValueObject ) ) )? (otherlv_6= '<->' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= ';' )? ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_isIndexed_0_0=null;
        Token lv_isContainment_1_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_type_2_0 = null;

        EObject lv_defaultValue_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:79:28: ( ( ( (lv_isIndexed_0_0= 'indexed' ) )? ( (lv_isContainment_1_0= '-[' ) )? ( (lv_type_2_0= ruleTypeRef ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleValueObject ) ) )? (otherlv_6= '<->' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= ';' )? ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:80:1: ( ( (lv_isIndexed_0_0= 'indexed' ) )? ( (lv_isContainment_1_0= '-[' ) )? ( (lv_type_2_0= ruleTypeRef ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleValueObject ) ) )? (otherlv_6= '<->' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= ';' )? )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:80:1: ( ( (lv_isIndexed_0_0= 'indexed' ) )? ( (lv_isContainment_1_0= '-[' ) )? ( (lv_type_2_0= ruleTypeRef ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleValueObject ) ) )? (otherlv_6= '<->' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= ';' )? )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:80:2: ( (lv_isIndexed_0_0= 'indexed' ) )? ( (lv_isContainment_1_0= '-[' ) )? ( (lv_type_2_0= ruleTypeRef ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleValueObject ) ) )? (otherlv_6= '<->' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= ';' )?
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:80:2: ( (lv_isIndexed_0_0= 'indexed' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:81:1: (lv_isIndexed_0_0= 'indexed' )
                    {
                    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:81:1: (lv_isIndexed_0_0= 'indexed' )
                    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:82:3: lv_isIndexed_0_0= 'indexed'
                    {
                    lv_isIndexed_0_0=(Token)match(input,11,FOLLOW_11_in_ruleFeature128); 

                            newLeafNode(lv_isIndexed_0_0, grammarAccess.getFeatureAccess().getIsIndexedIndexedKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "isIndexed", true, "indexed");
                    	    

                    }


                    }
                    break;

            }

            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:95:3: ( (lv_isContainment_1_0= '-[' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:96:1: (lv_isContainment_1_0= '-[' )
                    {
                    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:96:1: (lv_isContainment_1_0= '-[' )
                    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:97:3: lv_isContainment_1_0= '-['
                    {
                    lv_isContainment_1_0=(Token)match(input,12,FOLLOW_12_in_ruleFeature160); 

                            newLeafNode(lv_isContainment_1_0, grammarAccess.getFeatureAccess().getIsContainmentHyphenMinusLeftSquareBracketKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "isContainment", true, "-[");
                    	    

                    }


                    }
                    break;

            }

            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:110:3: ( (lv_type_2_0= ruleTypeRef ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:111:1: (lv_type_2_0= ruleTypeRef )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:111:1: (lv_type_2_0= ruleTypeRef )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:112:3: lv_type_2_0= ruleTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getFeatureAccess().getTypeTypeRefParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleFeature195);
            lv_type_2_0=ruleTypeRef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFeatureRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"TypeRef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:128:2: ( (lv_name_3_0= RULE_ID ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:129:1: (lv_name_3_0= RULE_ID )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:129:1: (lv_name_3_0= RULE_ID )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:130:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature212); 

            			newLeafNode(lv_name_3_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:146:2: (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleValueObject ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:146:4: otherlv_4= '=' ( (lv_defaultValue_5_0= ruleValueObject ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleFeature230); 

                        	newLeafNode(otherlv_4, grammarAccess.getFeatureAccess().getEqualsSignKeyword_4_0());
                        
                    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:150:1: ( (lv_defaultValue_5_0= ruleValueObject ) )
                    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:151:1: (lv_defaultValue_5_0= ruleValueObject )
                    {
                    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:151:1: (lv_defaultValue_5_0= ruleValueObject )
                    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:152:3: lv_defaultValue_5_0= ruleValueObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureAccess().getDefaultValueValueObjectParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueObject_in_ruleFeature251);
                    lv_defaultValue_5_0=ruleValueObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureRule());
                    	        }
                           		set(
                           			current, 
                           			"defaultValue",
                            		lv_defaultValue_5_0, 
                            		"ValueObject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:168:4: (otherlv_6= '<->' ( (otherlv_7= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:168:6: otherlv_6= '<->' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleFeature266); 

                        	newLeafNode(otherlv_6, grammarAccess.getFeatureAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5_0());
                        
                    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:172:1: ( (otherlv_7= RULE_ID ) )
                    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:173:1: (otherlv_7= RULE_ID )
                    {
                    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:173:1: (otherlv_7= RULE_ID )
                    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:174:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature286); 

                    		newLeafNode(otherlv_7, grammarAccess.getFeatureAccess().getInverseFeatureCrossReference_5_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:185:4: (otherlv_8= ';' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:185:6: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleFeature301); 

                        	newLeafNode(otherlv_8, grammarAccess.getFeatureAccess().getSemicolonKeyword_6());
                        

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleTypeRef"
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:197:1: entryRuleTypeRef returns [EObject current=null] : iv_ruleTypeRef= ruleTypeRef EOF ;
    public final EObject entryRuleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRef = null;


        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:198:2: (iv_ruleTypeRef= ruleTypeRef EOF )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:199:2: iv_ruleTypeRef= ruleTypeRef EOF
            {
             newCompositeNode(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef339);
            iv_ruleTypeRef=ruleTypeRef();

            state._fsp--;

             current =iv_ruleTypeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef349); 

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
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:206:1: ruleTypeRef returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? ) ;
    public final EObject ruleTypeRef() throws RecognitionException {
        EObject current = null;

        Token lv_isMulti_1_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:209:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:210:1: ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:210:1: ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:210:2: ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )?
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:210:2: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:211:1: ( ruleQualifiedName )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:211:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:212:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeRefRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeRef397);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:225:2: ( (lv_isMulti_1_0= '[]' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:226:1: (lv_isMulti_1_0= '[]' )
                    {
                    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:226:1: (lv_isMulti_1_0= '[]' )
                    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:227:3: lv_isMulti_1_0= '[]'
                    {
                    lv_isMulti_1_0=(Token)match(input,16,FOLLOW_16_in_ruleTypeRef415); 

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
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:248:1: entryRuleValueObject returns [EObject current=null] : iv_ruleValueObject= ruleValueObject EOF ;
    public final EObject entryRuleValueObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueObject = null;


        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:249:2: (iv_ruleValueObject= ruleValueObject EOF )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:250:2: iv_ruleValueObject= ruleValueObject EOF
            {
             newCompositeNode(grammarAccess.getValueObjectRule()); 
            pushFollow(FOLLOW_ruleValueObject_in_entryRuleValueObject465);
            iv_ruleValueObject=ruleValueObject();

            state._fsp--;

             current =iv_ruleValueObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueObject475); 

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
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:257:1: ruleValueObject returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue | this_FloatValue_2= ruleFloatValue ) ;
    public final EObject ruleValueObject() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_IntegerValue_1 = null;

        EObject this_FloatValue_2 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:260:28: ( (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue | this_FloatValue_2= ruleFloatValue ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:261:1: (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue | this_FloatValue_2= ruleFloatValue )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:261:1: (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue | this_FloatValue_2= ruleFloatValue )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt7=1;
                }
                break;
            case RULE_INT:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==EOF||(LA7_2>=14 && LA7_2<=15)) ) {
                    alt7=2;
                }
                else if ( (LA7_2==18) ) {
                    alt7=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case 17:
            case 18:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:262:5: this_StringValue_0= ruleStringValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueObjectAccess().getStringValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringValue_in_ruleValueObject522);
                    this_StringValue_0=ruleStringValue();

                    state._fsp--;

                     
                            current = this_StringValue_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:272:5: this_IntegerValue_1= ruleIntegerValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueObjectAccess().getIntegerValueParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIntegerValue_in_ruleValueObject549);
                    this_IntegerValue_1=ruleIntegerValue();

                    state._fsp--;

                     
                            current = this_IntegerValue_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:282:5: this_FloatValue_2= ruleFloatValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueObjectAccess().getFloatValueParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFloatValue_in_ruleValueObject576);
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
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:298:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:299:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:300:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue611);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue621); 

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
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:307:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEStringObject ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:310:28: ( ( (lv_value_0_0= ruleEStringObject ) ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:311:1: ( (lv_value_0_0= ruleEStringObject ) )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:311:1: ( (lv_value_0_0= ruleEStringObject ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:312:1: (lv_value_0_0= ruleEStringObject )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:312:1: (lv_value_0_0= ruleEStringObject )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:313:3: lv_value_0_0= ruleEStringObject
            {
             
            	        newCompositeNode(grammarAccess.getStringValueAccess().getValueEStringObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEStringObject_in_ruleStringValue666);
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
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:337:1: entryRuleEStringObject returns [String current=null] : iv_ruleEStringObject= ruleEStringObject EOF ;
    public final String entryRuleEStringObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringObject = null;


        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:338:2: (iv_ruleEStringObject= ruleEStringObject EOF )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:339:2: iv_ruleEStringObject= ruleEStringObject EOF
            {
             newCompositeNode(grammarAccess.getEStringObjectRule()); 
            pushFollow(FOLLOW_ruleEStringObject_in_entryRuleEStringObject702);
            iv_ruleEStringObject=ruleEStringObject();

            state._fsp--;

             current =iv_ruleEStringObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEStringObject713); 

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
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:346:1: ruleEStringObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEStringObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:349:28: (this_STRING_0= RULE_STRING )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:350:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEStringObject752); 

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
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:365:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:366:2: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:367:2: iv_ruleIntegerValue= ruleIntegerValue EOF
            {
             newCompositeNode(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue796);
            iv_ruleIntegerValue=ruleIntegerValue();

            state._fsp--;

             current =iv_ruleIntegerValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValue806); 

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
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:374:1: ruleIntegerValue returns [EObject current=null] : ( (lv_value_0_0= ruleEIntegerObject ) ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:377:28: ( ( (lv_value_0_0= ruleEIntegerObject ) ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:378:1: ( (lv_value_0_0= ruleEIntegerObject ) )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:378:1: ( (lv_value_0_0= ruleEIntegerObject ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:379:1: (lv_value_0_0= ruleEIntegerObject )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:379:1: (lv_value_0_0= ruleEIntegerObject )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:380:3: lv_value_0_0= ruleEIntegerObject
            {
             
            	        newCompositeNode(grammarAccess.getIntegerValueAccess().getValueEIntegerObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEIntegerObject_in_ruleIntegerValue851);
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
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:404:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:405:2: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:406:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
            {
             newCompositeNode(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject887);
            iv_ruleEIntegerObject=ruleEIntegerObject();

            state._fsp--;

             current =iv_ruleEIntegerObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEIntegerObject898); 

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
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:413:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:416:28: (this_INT_0= RULE_INT )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:417:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEIntegerObject937); 

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
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:432:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:433:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:434:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
             newCompositeNode(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue981);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;

             current =iv_ruleFloatValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue991); 

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
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:441:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= ruleEFloatObject ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:444:28: ( ( (lv_value_0_0= ruleEFloatObject ) ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:445:1: ( (lv_value_0_0= ruleEFloatObject ) )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:445:1: ( (lv_value_0_0= ruleEFloatObject ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:446:1: (lv_value_0_0= ruleEFloatObject )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:446:1: (lv_value_0_0= ruleEFloatObject )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:447:3: lv_value_0_0= ruleEFloatObject
            {
             
            	        newCompositeNode(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEFloatObject_in_ruleFloatValue1036);
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
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:471:1: entryRuleEFloatObject returns [String current=null] : iv_ruleEFloatObject= ruleEFloatObject EOF ;
    public final String entryRuleEFloatObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloatObject = null;


        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:472:2: (iv_ruleEFloatObject= ruleEFloatObject EOF )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:473:2: iv_ruleEFloatObject= ruleEFloatObject EOF
            {
             newCompositeNode(grammarAccess.getEFloatObjectRule()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject1072);
            iv_ruleEFloatObject=ruleEFloatObject();

            state._fsp--;

             current =iv_ruleEFloatObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEFloatObject1083); 

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
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:480:1: ruleEFloatObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEFloatObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:483:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:484:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:484:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:484:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:484:2: (kw= '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:485:2: kw= '-'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleEFloatObject1122); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:490:3: (this_INT_1= RULE_INT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:490:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEFloatObject1140); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,18,FOLLOW_18_in_ruleEFloatObject1160); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEFloatObject1175); 

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
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:518:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:519:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:520:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1221);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1232); 

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
    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:527:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:530:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:531:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:531:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:531:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1272); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:538:1: (kw= '.' this_ID_2= RULE_ID )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.dubmas.modulob.common.dsl/src-gen/de/dubmas/modulob/common/parser/antlr/internal/InternalDsl.g:539:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,18,FOLLOW_18_in_ruleQualifiedName1291); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1306); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop10;
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


 

    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleFeature128 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_ruleFeature160 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleFeature195 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature212 = new BitSet(new long[]{0x000000000000E002L});
    public static final BitSet FOLLOW_13_in_ruleFeature230 = new BitSet(new long[]{0x0000000000060060L});
    public static final BitSet FOLLOW_ruleValueObject_in_ruleFeature251 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_14_in_ruleFeature266 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature286 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleFeature301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeRef397 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleTypeRef415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueObject_in_entryRuleValueObject465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueObject475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleValueObject522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_ruleValueObject549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_ruleValueObject576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_ruleStringValue666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_entryRuleEStringObject702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEStringObject713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEStringObject752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_ruleIntegerValue851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEIntegerObject898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEIntegerObject937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_ruleFloatValue1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject1072 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEFloatObject1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleEFloatObject1122 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatObject1140 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEFloatObject1160 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatObject1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1272 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleQualifiedName1291 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1306 = new BitSet(new long[]{0x0000000000040002L});

}