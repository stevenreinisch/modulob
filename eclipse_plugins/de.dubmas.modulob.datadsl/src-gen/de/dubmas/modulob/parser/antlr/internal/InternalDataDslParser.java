package de.dubmas.modulob.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.dubmas.modulob.services.DataDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDataDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_DOC_COMMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'entities for module'", "'version'", "'abstract'", "'entity'", "':'", "'{'", "'}'", "'@'", "'indexed'", "'-['", "'='", "'<->'", "';'", "'primitive type'", "'any type'", "'[]'", "'-'", "'.'", "'persistency'", "'CoreData'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_DOC_COMMENT=7;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
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


        public InternalDataDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDataDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDataDslParser.tokenNames; }
    public String getGrammarFileName() { return "../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g"; }



     	private DataDslGrammarAccess grammarAccess;
     	
        public InternalDataDslParser(TokenStream input, DataDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "EntityModel";	
       	}
       	
       	@Override
       	protected DataDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleEntityModel"
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:68:1: entryRuleEntityModel returns [EObject current=null] : iv_ruleEntityModel= ruleEntityModel EOF ;
    public final EObject entryRuleEntityModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityModel = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:69:2: (iv_ruleEntityModel= ruleEntityModel EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:70:2: iv_ruleEntityModel= ruleEntityModel EOF
            {
             newCompositeNode(grammarAccess.getEntityModelRule()); 
            pushFollow(FOLLOW_ruleEntityModel_in_entryRuleEntityModel75);
            iv_ruleEntityModel=ruleEntityModel();

            state._fsp--;

             current =iv_ruleEntityModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityModel85); 

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
    // $ANTLR end "entryRuleEntityModel"


    // $ANTLR start "ruleEntityModel"
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:77:1: ruleEntityModel returns [EObject current=null] : (otherlv_0= 'entities for module' ( ( ruleQualifiedName ) ) otherlv_2= 'version' ( (lv_version_3_0= RULE_STRING ) ) ( (lv_entities_4_0= ruleEntity ) )* ) ;
    public final EObject ruleEntityModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_version_3_0=null;
        EObject lv_entities_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:80:28: ( (otherlv_0= 'entities for module' ( ( ruleQualifiedName ) ) otherlv_2= 'version' ( (lv_version_3_0= RULE_STRING ) ) ( (lv_entities_4_0= ruleEntity ) )* ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:81:1: (otherlv_0= 'entities for module' ( ( ruleQualifiedName ) ) otherlv_2= 'version' ( (lv_version_3_0= RULE_STRING ) ) ( (lv_entities_4_0= ruleEntity ) )* )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:81:1: (otherlv_0= 'entities for module' ( ( ruleQualifiedName ) ) otherlv_2= 'version' ( (lv_version_3_0= RULE_STRING ) ) ( (lv_entities_4_0= ruleEntity ) )* )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:81:3: otherlv_0= 'entities for module' ( ( ruleQualifiedName ) ) otherlv_2= 'version' ( (lv_version_3_0= RULE_STRING ) ) ( (lv_entities_4_0= ruleEntity ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleEntityModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityModelAccess().getEntitiesForModuleKeyword_0());
                
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:85:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:86:1: ( ruleQualifiedName )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:86:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:87:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityModelRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getEntityModelAccess().getModuleModuleCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEntityModel145);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleEntityModel157); 

                	newLeafNode(otherlv_2, grammarAccess.getEntityModelAccess().getVersionKeyword_2());
                
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:104:1: ( (lv_version_3_0= RULE_STRING ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:105:1: (lv_version_3_0= RULE_STRING )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:105:1: (lv_version_3_0= RULE_STRING )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:106:3: lv_version_3_0= RULE_STRING
            {
            lv_version_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEntityModel174); 

            			newLeafNode(lv_version_3_0, grammarAccess.getEntityModelAccess().getVersionSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"version",
                    		lv_version_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:122:2: ( (lv_entities_4_0= ruleEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=15)||LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:123:1: (lv_entities_4_0= ruleEntity )
            	    {
            	    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:123:1: (lv_entities_4_0= ruleEntity )
            	    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:124:3: lv_entities_4_0= ruleEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityModelAccess().getEntitiesEntityParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_ruleEntityModel200);
            	    lv_entities_4_0=ruleEntity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entities",
            	            		lv_entities_4_0, 
            	            		"Entity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleEntityModel"


    // $ANTLR start "entryRuleEntity"
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:148:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:149:2: (iv_ruleEntity= ruleEntity EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:150:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity237);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity247); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:157:1: ruleEntity returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_isAbstract_1_0= 'abstract' ) )? otherlv_2= 'entity' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) )? otherlv_6= '{' ( (lv_features_7_0= ruleFeature ) )* otherlv_8= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_features_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:160:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_isAbstract_1_0= 'abstract' ) )? otherlv_2= 'entity' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) )? otherlv_6= '{' ( (lv_features_7_0= ruleFeature ) )* otherlv_8= '}' ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:161:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_isAbstract_1_0= 'abstract' ) )? otherlv_2= 'entity' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) )? otherlv_6= '{' ( (lv_features_7_0= ruleFeature ) )* otherlv_8= '}' )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:161:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_isAbstract_1_0= 'abstract' ) )? otherlv_2= 'entity' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) )? otherlv_6= '{' ( (lv_features_7_0= ruleFeature ) )* otherlv_8= '}' )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:161:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_isAbstract_1_0= 'abstract' ) )? otherlv_2= 'entity' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) )? otherlv_6= '{' ( (lv_features_7_0= ruleFeature ) )* otherlv_8= '}'
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:161:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:162:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:162:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:163:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleEntity293);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotations",
            	            		lv_annotations_0_0, 
            	            		"Annotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:179:3: ( (lv_isAbstract_1_0= 'abstract' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:180:1: (lv_isAbstract_1_0= 'abstract' )
                    {
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:180:1: (lv_isAbstract_1_0= 'abstract' )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:181:3: lv_isAbstract_1_0= 'abstract'
                    {
                    lv_isAbstract_1_0=(Token)match(input,14,FOLLOW_14_in_ruleEntity312); 

                            newLeafNode(lv_isAbstract_1_0, grammarAccess.getEntityAccess().getIsAbstractAbstractKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                           		setWithLastConsumed(current, "isAbstract", true, "abstract");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleEntity338); 

                	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getEntityKeyword_2());
                
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:198:1: ( (lv_name_3_0= RULE_ID ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:199:1: (lv_name_3_0= RULE_ID )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:199:1: (lv_name_3_0= RULE_ID )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:200:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity355); 

            			newLeafNode(lv_name_3_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:216:2: (otherlv_4= ':' ( ( ruleQualifiedName ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:216:4: otherlv_4= ':' ( ( ruleQualifiedName ) )
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleEntity373); 

                        	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getColonKeyword_4_0());
                        
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:220:1: ( ( ruleQualifiedName ) )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:221:1: ( ruleQualifiedName )
                    {
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:221:1: ( ruleQualifiedName )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:222:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getSuperEntityCrossReference_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEntity396);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleEntity410); 

                	newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5());
                
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:239:1: ( (lv_features_7_0= ruleFeature ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||(LA5_0>=20 && LA5_0<=21)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:240:1: (lv_features_7_0= ruleFeature )
            	    {
            	    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:240:1: (lv_features_7_0= ruleFeature )
            	    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:241:3: lv_features_7_0= ruleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_ruleEntity431);
            	    lv_features_7_0=ruleFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_7_0, 
            	            		"Feature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleEntity444); 

                	newLeafNode(otherlv_8, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAnnotation"
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:269:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:270:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:271:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation480);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation490); 

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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:278:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_option_1_0= ruleConfigOption ) ) (otherlv_2= ':' ( (lv_value_3_0= ruleConfigValue ) ) )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_option_1_0 = null;

        Enumerator lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:281:28: ( (otherlv_0= '@' ( (lv_option_1_0= ruleConfigOption ) ) (otherlv_2= ':' ( (lv_value_3_0= ruleConfigValue ) ) )? ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:282:1: (otherlv_0= '@' ( (lv_option_1_0= ruleConfigOption ) ) (otherlv_2= ':' ( (lv_value_3_0= ruleConfigValue ) ) )? )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:282:1: (otherlv_0= '@' ( (lv_option_1_0= ruleConfigOption ) ) (otherlv_2= ':' ( (lv_value_3_0= ruleConfigValue ) ) )? )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:282:3: otherlv_0= '@' ( (lv_option_1_0= ruleConfigOption ) ) (otherlv_2= ':' ( (lv_value_3_0= ruleConfigValue ) ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleAnnotation527); 

                	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
                
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:286:1: ( (lv_option_1_0= ruleConfigOption ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:287:1: (lv_option_1_0= ruleConfigOption )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:287:1: (lv_option_1_0= ruleConfigOption )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:288:3: lv_option_1_0= ruleConfigOption
            {
             
            	        newCompositeNode(grammarAccess.getAnnotationAccess().getOptionConfigOptionEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConfigOption_in_ruleAnnotation548);
            lv_option_1_0=ruleConfigOption();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
            	        }
                   		set(
                   			current, 
                   			"option",
                    		lv_option_1_0, 
                    		"ConfigOption");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:304:2: (otherlv_2= ':' ( (lv_value_3_0= ruleConfigValue ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:304:4: otherlv_2= ':' ( (lv_value_3_0= ruleConfigValue ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleAnnotation561); 

                        	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getColonKeyword_2_0());
                        
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:308:1: ( (lv_value_3_0= ruleConfigValue ) )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:309:1: (lv_value_3_0= ruleConfigValue )
                    {
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:309:1: (lv_value_3_0= ruleConfigValue )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:310:3: lv_value_3_0= ruleConfigValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getValueConfigValueEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConfigValue_in_ruleAnnotation582);
                    lv_value_3_0=ruleConfigValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"ConfigValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleFeature"
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:334:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:335:2: (iv_ruleFeature= ruleFeature EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:336:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature620);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature630); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:343:1: ruleFeature returns [EObject current=null] : ( ( (lv_isIndexed_0_0= 'indexed' ) )? ( (lv_isContainment_1_0= '-[' ) )? ( (lv_type_2_0= ruleTypeRef ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleValueObject ) ) )? (otherlv_6= '<->' ( ( ruleQualifiedName ) ) )? (otherlv_8= ';' )? ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_isIndexed_0_0=null;
        Token lv_isContainment_1_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_type_2_0 = null;

        EObject lv_defaultValue_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:346:28: ( ( ( (lv_isIndexed_0_0= 'indexed' ) )? ( (lv_isContainment_1_0= '-[' ) )? ( (lv_type_2_0= ruleTypeRef ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleValueObject ) ) )? (otherlv_6= '<->' ( ( ruleQualifiedName ) ) )? (otherlv_8= ';' )? ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:347:1: ( ( (lv_isIndexed_0_0= 'indexed' ) )? ( (lv_isContainment_1_0= '-[' ) )? ( (lv_type_2_0= ruleTypeRef ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleValueObject ) ) )? (otherlv_6= '<->' ( ( ruleQualifiedName ) ) )? (otherlv_8= ';' )? )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:347:1: ( ( (lv_isIndexed_0_0= 'indexed' ) )? ( (lv_isContainment_1_0= '-[' ) )? ( (lv_type_2_0= ruleTypeRef ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleValueObject ) ) )? (otherlv_6= '<->' ( ( ruleQualifiedName ) ) )? (otherlv_8= ';' )? )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:347:2: ( (lv_isIndexed_0_0= 'indexed' ) )? ( (lv_isContainment_1_0= '-[' ) )? ( (lv_type_2_0= ruleTypeRef ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleValueObject ) ) )? (otherlv_6= '<->' ( ( ruleQualifiedName ) ) )? (otherlv_8= ';' )?
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:347:2: ( (lv_isIndexed_0_0= 'indexed' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:348:1: (lv_isIndexed_0_0= 'indexed' )
                    {
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:348:1: (lv_isIndexed_0_0= 'indexed' )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:349:3: lv_isIndexed_0_0= 'indexed'
                    {
                    lv_isIndexed_0_0=(Token)match(input,20,FOLLOW_20_in_ruleFeature673); 

                            newLeafNode(lv_isIndexed_0_0, grammarAccess.getFeatureAccess().getIsIndexedIndexedKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "isIndexed", true, "indexed");
                    	    

                    }


                    }
                    break;

            }

            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:362:3: ( (lv_isContainment_1_0= '-[' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:363:1: (lv_isContainment_1_0= '-[' )
                    {
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:363:1: (lv_isContainment_1_0= '-[' )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:364:3: lv_isContainment_1_0= '-['
                    {
                    lv_isContainment_1_0=(Token)match(input,21,FOLLOW_21_in_ruleFeature705); 

                            newLeafNode(lv_isContainment_1_0, grammarAccess.getFeatureAccess().getIsContainmentHyphenMinusLeftSquareBracketKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "isContainment", true, "-[");
                    	    

                    }


                    }
                    break;

            }

            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:377:3: ( (lv_type_2_0= ruleTypeRef ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:378:1: (lv_type_2_0= ruleTypeRef )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:378:1: (lv_type_2_0= ruleTypeRef )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:379:3: lv_type_2_0= ruleTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getFeatureAccess().getTypeTypeRefParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleFeature740);
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

            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:395:2: ( (lv_name_3_0= RULE_ID ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:396:1: (lv_name_3_0= RULE_ID )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:396:1: (lv_name_3_0= RULE_ID )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:397:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature757); 

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

            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:413:2: (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleValueObject ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:413:4: otherlv_4= '=' ( (lv_defaultValue_5_0= ruleValueObject ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleFeature775); 

                        	newLeafNode(otherlv_4, grammarAccess.getFeatureAccess().getEqualsSignKeyword_4_0());
                        
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:417:1: ( (lv_defaultValue_5_0= ruleValueObject ) )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:418:1: (lv_defaultValue_5_0= ruleValueObject )
                    {
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:418:1: (lv_defaultValue_5_0= ruleValueObject )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:419:3: lv_defaultValue_5_0= ruleValueObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureAccess().getDefaultValueValueObjectParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueObject_in_ruleFeature796);
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

            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:435:4: (otherlv_6= '<->' ( ( ruleQualifiedName ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:435:6: otherlv_6= '<->' ( ( ruleQualifiedName ) )
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleFeature811); 

                        	newLeafNode(otherlv_6, grammarAccess.getFeatureAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5_0());
                        
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:439:1: ( ( ruleQualifiedName ) )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:440:1: ( ruleQualifiedName )
                    {
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:440:1: ( ruleQualifiedName )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:441:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getFeatureAccess().getInverseFeatureCrossReference_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleFeature834);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:454:4: (otherlv_8= ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:454:6: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleFeature849); 

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


    // $ANTLR start "entryRulePrimitive"
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:468:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:469:2: (iv_rulePrimitive= rulePrimitive EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:470:2: iv_rulePrimitive= rulePrimitive EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive889);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;

             current =iv_rulePrimitive; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive899); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:477:1: rulePrimitive returns [EObject current=null] : (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:480:28: ( (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:481:1: (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:481:1: (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:481:3: otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_rulePrimitive936); 

                	newLeafNode(otherlv_0, grammarAccess.getPrimitiveAccess().getPrimitiveTypeKeyword_0());
                
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:485:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:486:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:486:1: (lv_name_1_0= RULE_ID )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:487:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimitive953); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:511:1: entryRuleAny returns [EObject current=null] : iv_ruleAny= ruleAny EOF ;
    public final EObject entryRuleAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAny = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:512:2: (iv_ruleAny= ruleAny EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:513:2: iv_ruleAny= ruleAny EOF
            {
             newCompositeNode(grammarAccess.getAnyRule()); 
            pushFollow(FOLLOW_ruleAny_in_entryRuleAny994);
            iv_ruleAny=ruleAny();

            state._fsp--;

             current =iv_ruleAny; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAny1004); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:520:1: ruleAny returns [EObject current=null] : (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAny() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:523:28: ( (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:524:1: (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:524:1: (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:524:3: otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleAny1041); 

                	newLeafNode(otherlv_0, grammarAccess.getAnyAccess().getAnyTypeKeyword_0());
                
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:528:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:529:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:529:1: (lv_name_1_0= RULE_ID )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:530:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAny1058); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:554:1: entryRuleTypeRef returns [EObject current=null] : iv_ruleTypeRef= ruleTypeRef EOF ;
    public final EObject entryRuleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRef = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:555:2: (iv_ruleTypeRef= ruleTypeRef EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:556:2: iv_ruleTypeRef= ruleTypeRef EOF
            {
             newCompositeNode(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef1099);
            iv_ruleTypeRef=ruleTypeRef();

            state._fsp--;

             current =iv_ruleTypeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef1109); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:563:1: ruleTypeRef returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? ) ;
    public final EObject ruleTypeRef() throws RecognitionException {
        EObject current = null;

        Token lv_isMulti_1_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:566:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:567:1: ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:567:1: ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:567:2: ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )?
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:567:2: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:568:1: ( ruleQualifiedName )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:568:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:569:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeRefRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeRef1157);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:582:2: ( (lv_isMulti_1_0= '[]' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:583:1: (lv_isMulti_1_0= '[]' )
                    {
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:583:1: (lv_isMulti_1_0= '[]' )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:584:3: lv_isMulti_1_0= '[]'
                    {
                    lv_isMulti_1_0=(Token)match(input,27,FOLLOW_27_in_ruleTypeRef1175); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:605:1: entryRuleValueObject returns [EObject current=null] : iv_ruleValueObject= ruleValueObject EOF ;
    public final EObject entryRuleValueObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueObject = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:606:2: (iv_ruleValueObject= ruleValueObject EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:607:2: iv_ruleValueObject= ruleValueObject EOF
            {
             newCompositeNode(grammarAccess.getValueObjectRule()); 
            pushFollow(FOLLOW_ruleValueObject_in_entryRuleValueObject1225);
            iv_ruleValueObject=ruleValueObject();

            state._fsp--;

             current =iv_ruleValueObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueObject1235); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:614:1: ruleValueObject returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue | this_FloatValue_2= ruleFloatValue ) ;
    public final EObject ruleValueObject() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_IntegerValue_1 = null;

        EObject this_FloatValue_2 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:617:28: ( (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue | this_FloatValue_2= ruleFloatValue ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:618:1: (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue | this_FloatValue_2= ruleFloatValue )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:618:1: (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue | this_FloatValue_2= ruleFloatValue )
            int alt13=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt13=1;
                }
                break;
            case RULE_INT:
                {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==29) ) {
                    alt13=3;
                }
                else if ( (LA13_2==EOF||LA13_2==RULE_ID||LA13_2==18||(LA13_2>=20 && LA13_2<=21)||(LA13_2>=23 && LA13_2<=24)) ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }
                }
                break;
            case 28:
            case 29:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:619:5: this_StringValue_0= ruleStringValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueObjectAccess().getStringValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringValue_in_ruleValueObject1282);
                    this_StringValue_0=ruleStringValue();

                    state._fsp--;

                     
                            current = this_StringValue_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:629:5: this_IntegerValue_1= ruleIntegerValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueObjectAccess().getIntegerValueParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIntegerValue_in_ruleValueObject1309);
                    this_IntegerValue_1=ruleIntegerValue();

                    state._fsp--;

                     
                            current = this_IntegerValue_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:639:5: this_FloatValue_2= ruleFloatValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueObjectAccess().getFloatValueParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFloatValue_in_ruleValueObject1336);
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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:655:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:656:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:657:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue1371);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue1381); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:664:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEStringObject ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:667:28: ( ( (lv_value_0_0= ruleEStringObject ) ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:668:1: ( (lv_value_0_0= ruleEStringObject ) )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:668:1: ( (lv_value_0_0= ruleEStringObject ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:669:1: (lv_value_0_0= ruleEStringObject )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:669:1: (lv_value_0_0= ruleEStringObject )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:670:3: lv_value_0_0= ruleEStringObject
            {
             
            	        newCompositeNode(grammarAccess.getStringValueAccess().getValueEStringObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEStringObject_in_ruleStringValue1426);
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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:694:1: entryRuleEStringObject returns [String current=null] : iv_ruleEStringObject= ruleEStringObject EOF ;
    public final String entryRuleEStringObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringObject = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:695:2: (iv_ruleEStringObject= ruleEStringObject EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:696:2: iv_ruleEStringObject= ruleEStringObject EOF
            {
             newCompositeNode(grammarAccess.getEStringObjectRule()); 
            pushFollow(FOLLOW_ruleEStringObject_in_entryRuleEStringObject1462);
            iv_ruleEStringObject=ruleEStringObject();

            state._fsp--;

             current =iv_ruleEStringObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEStringObject1473); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:703:1: ruleEStringObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEStringObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:706:28: (this_STRING_0= RULE_STRING )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:707:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEStringObject1512); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:722:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:723:2: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:724:2: iv_ruleIntegerValue= ruleIntegerValue EOF
            {
             newCompositeNode(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue1556);
            iv_ruleIntegerValue=ruleIntegerValue();

            state._fsp--;

             current =iv_ruleIntegerValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValue1566); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:731:1: ruleIntegerValue returns [EObject current=null] : ( (lv_value_0_0= ruleEIntegerObject ) ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:734:28: ( ( (lv_value_0_0= ruleEIntegerObject ) ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:735:1: ( (lv_value_0_0= ruleEIntegerObject ) )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:735:1: ( (lv_value_0_0= ruleEIntegerObject ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:736:1: (lv_value_0_0= ruleEIntegerObject )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:736:1: (lv_value_0_0= ruleEIntegerObject )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:737:3: lv_value_0_0= ruleEIntegerObject
            {
             
            	        newCompositeNode(grammarAccess.getIntegerValueAccess().getValueEIntegerObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEIntegerObject_in_ruleIntegerValue1611);
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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:761:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:762:2: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:763:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
            {
             newCompositeNode(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject1647);
            iv_ruleEIntegerObject=ruleEIntegerObject();

            state._fsp--;

             current =iv_ruleEIntegerObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEIntegerObject1658); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:770:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:773:28: (this_INT_0= RULE_INT )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:774:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEIntegerObject1697); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:789:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:790:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:791:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
             newCompositeNode(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue1741);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;

             current =iv_ruleFloatValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue1751); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:798:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= ruleEFloatObject ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:801:28: ( ( (lv_value_0_0= ruleEFloatObject ) ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:802:1: ( (lv_value_0_0= ruleEFloatObject ) )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:802:1: ( (lv_value_0_0= ruleEFloatObject ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:803:1: (lv_value_0_0= ruleEFloatObject )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:803:1: (lv_value_0_0= ruleEFloatObject )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:804:3: lv_value_0_0= ruleEFloatObject
            {
             
            	        newCompositeNode(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEFloatObject_in_ruleFloatValue1796);
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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:828:1: entryRuleEFloatObject returns [String current=null] : iv_ruleEFloatObject= ruleEFloatObject EOF ;
    public final String entryRuleEFloatObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloatObject = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:829:2: (iv_ruleEFloatObject= ruleEFloatObject EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:830:2: iv_ruleEFloatObject= ruleEFloatObject EOF
            {
             newCompositeNode(grammarAccess.getEFloatObjectRule()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject1832);
            iv_ruleEFloatObject=ruleEFloatObject();

            state._fsp--;

             current =iv_ruleEFloatObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEFloatObject1843); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:837:1: ruleEFloatObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEFloatObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:840:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:841:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:841:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:841:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:841:2: (kw= '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:842:2: kw= '-'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleEFloatObject1882); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:847:3: (this_INT_1= RULE_INT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:847:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEFloatObject1900); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,29,FOLLOW_29_in_ruleEFloatObject1920); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEFloatObject1935); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:875:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:876:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:877:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1981);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1992); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:884:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:887:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:888:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:888:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:888:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2032); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:895:1: (kw= '.' this_ID_2= RULE_ID )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==29) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:896:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,29,FOLLOW_29_in_ruleQualifiedName2051); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2066); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop16;
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


    // $ANTLR start "ruleConfigOption"
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:916:1: ruleConfigOption returns [Enumerator current=null] : (enumLiteral_0= 'persistency' ) ;
    public final Enumerator ruleConfigOption() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:918:28: ( (enumLiteral_0= 'persistency' ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:919:1: (enumLiteral_0= 'persistency' )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:919:1: (enumLiteral_0= 'persistency' )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:919:3: enumLiteral_0= 'persistency'
            {
            enumLiteral_0=(Token)match(input,30,FOLLOW_30_in_ruleConfigOption2126); 

                    current = grammarAccess.getConfigOptionAccess().getPersistencyEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getConfigOptionAccess().getPersistencyEnumLiteralDeclaration()); 
                

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
    // $ANTLR end "ruleConfigOption"


    // $ANTLR start "ruleConfigValue"
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:929:1: ruleConfigValue returns [Enumerator current=null] : (enumLiteral_0= 'CoreData' ) ;
    public final Enumerator ruleConfigValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:931:28: ( (enumLiteral_0= 'CoreData' ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:932:1: (enumLiteral_0= 'CoreData' )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:932:1: (enumLiteral_0= 'CoreData' )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:932:3: enumLiteral_0= 'CoreData'
            {
            enumLiteral_0=(Token)match(input,31,FOLLOW_31_in_ruleConfigValue2169); 

                    current = grammarAccess.getConfigValueAccess().getCoreDataEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getConfigValueAccess().getCoreDataEnumLiteralDeclaration()); 
                

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
    // $ANTLR end "ruleConfigValue"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleEntityModel_in_entryRuleEntityModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleEntityModel122 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEntityModel145 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEntityModel157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEntityModel174 = new BitSet(new long[]{0x000000000008C002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleEntityModel200 = new BitSet(new long[]{0x000000000008C002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleEntity293 = new BitSet(new long[]{0x000000000008C000L});
    public static final BitSet FOLLOW_14_in_ruleEntity312 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEntity338 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity355 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleEntity373 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEntity396 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEntity410 = new BitSet(new long[]{0x0000000000340020L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleEntity431 = new BitSet(new long[]{0x0000000000340020L});
    public static final BitSet FOLLOW_18_in_ruleEntity444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleAnnotation527 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleConfigOption_in_ruleAnnotation548 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleAnnotation561 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleConfigValue_in_ruleAnnotation582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleFeature673 = new BitSet(new long[]{0x0000000000300020L});
    public static final BitSet FOLLOW_21_in_ruleFeature705 = new BitSet(new long[]{0x0000000000300020L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleFeature740 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature757 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_22_in_ruleFeature775 = new BitSet(new long[]{0x0000000030000050L});
    public static final BitSet FOLLOW_ruleValueObject_in_ruleFeature796 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_23_in_ruleFeature811 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFeature834 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleFeature849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulePrimitive936 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimitive953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAny_in_entryRuleAny994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAny1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleAny1041 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAny1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef1099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeRef1157 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleTypeRef1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueObject_in_entryRuleValueObject1225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueObject1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleValueObject1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_ruleValueObject1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_ruleValueObject1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue1371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_ruleStringValue1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_entryRuleEStringObject1462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEStringObject1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEStringObject1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue1556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_ruleIntegerValue1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject1647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEIntegerObject1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEIntegerObject1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue1741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_ruleFloatValue1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject1832 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEFloatObject1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleEFloatObject1882 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatObject1900 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleEFloatObject1920 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatObject1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2032 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleQualifiedName2051 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2066 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_30_in_ruleConfigOption2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleConfigValue2169 = new BitSet(new long[]{0x0000000000000002L});

}