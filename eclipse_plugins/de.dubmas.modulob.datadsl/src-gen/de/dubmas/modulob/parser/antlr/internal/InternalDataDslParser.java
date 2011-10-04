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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_DOC_COMMENT", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'entities for module'", "'version'", "'abstract'", "'entity'", "':'", "'{'", "'}'", "'@'", "'indexed'", "'-['", "'='", "'<->'", "';'", "'primitive type'", "'any type'", "'[]'", "'-'", "'.'", "'persistency'", "'CoreData'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_DOC_COMMENT=5;
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
    public static final int RULE_INT=7;
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

                if ( (LA1_0==RULE_DOC_COMMENT||(LA1_0>=14 && LA1_0<=15)||LA1_0==19) ) {
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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:157:1: ruleEntity returns [EObject current=null] : ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_annotations_1_0= ruleAnnotation ) )* ( (lv_isAbstract_2_0= 'abstract' ) )? otherlv_3= 'entity' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_features_8_0= ruleFeature ) )* otherlv_9= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_0=null;
        Token lv_isAbstract_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_annotations_1_0 = null;

        EObject lv_features_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:160:28: ( ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_annotations_1_0= ruleAnnotation ) )* ( (lv_isAbstract_2_0= 'abstract' ) )? otherlv_3= 'entity' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_features_8_0= ruleFeature ) )* otherlv_9= '}' ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:161:1: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_annotations_1_0= ruleAnnotation ) )* ( (lv_isAbstract_2_0= 'abstract' ) )? otherlv_3= 'entity' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_features_8_0= ruleFeature ) )* otherlv_9= '}' )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:161:1: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_annotations_1_0= ruleAnnotation ) )* ( (lv_isAbstract_2_0= 'abstract' ) )? otherlv_3= 'entity' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_features_8_0= ruleFeature ) )* otherlv_9= '}' )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:161:2: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_annotations_1_0= ruleAnnotation ) )* ( (lv_isAbstract_2_0= 'abstract' ) )? otherlv_3= 'entity' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_features_8_0= ruleFeature ) )* otherlv_9= '}'
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:161:2: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_DOC_COMMENT) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:162:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                    {
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:162:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:163:3: lv_comment_0_0= RULE_DOC_COMMENT
                    {
                    lv_comment_0_0=(Token)match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_ruleEntity289); 

                    			newLeafNode(lv_comment_0_0, grammarAccess.getEntityAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"comment",
                            		lv_comment_0_0, 
                            		"DOC_COMMENT");
                    	    

                    }


                    }
                    break;

            }

            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:179:3: ( (lv_annotations_1_0= ruleAnnotation ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:180:1: (lv_annotations_1_0= ruleAnnotation )
            	    {
            	    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:180:1: (lv_annotations_1_0= ruleAnnotation )
            	    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:181:3: lv_annotations_1_0= ruleAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleEntity316);
            	    lv_annotations_1_0=ruleAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotations",
            	            		lv_annotations_1_0, 
            	            		"Annotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:197:3: ( (lv_isAbstract_2_0= 'abstract' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:198:1: (lv_isAbstract_2_0= 'abstract' )
                    {
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:198:1: (lv_isAbstract_2_0= 'abstract' )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:199:3: lv_isAbstract_2_0= 'abstract'
                    {
                    lv_isAbstract_2_0=(Token)match(input,14,FOLLOW_14_in_ruleEntity335); 

                            newLeafNode(lv_isAbstract_2_0, grammarAccess.getEntityAccess().getIsAbstractAbstractKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                           		setWithLastConsumed(current, "isAbstract", true, "abstract");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleEntity361); 

                	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getEntityKeyword_3());
                
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:216:1: ( (lv_name_4_0= RULE_ID ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:217:1: (lv_name_4_0= RULE_ID )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:217:1: (lv_name_4_0= RULE_ID )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:218:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity378); 

            			newLeafNode(lv_name_4_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"ID");
            	    

            }


            }

            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:234:2: (otherlv_5= ':' ( ( ruleQualifiedName ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:234:4: otherlv_5= ':' ( ( ruleQualifiedName ) )
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleEntity396); 

                        	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getColonKeyword_5_0());
                        
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:238:1: ( ( ruleQualifiedName ) )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:239:1: ( ruleQualifiedName )
                    {
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:239:1: ( ruleQualifiedName )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:240:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getSuperEntityCrossReference_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEntity419);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleEntity433); 

                	newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_6());
                
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:257:1: ( (lv_features_8_0= ruleFeature ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_DOC_COMMENT && LA6_0<=RULE_ID)||(LA6_0>=20 && LA6_0<=21)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:258:1: (lv_features_8_0= ruleFeature )
            	    {
            	    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:258:1: (lv_features_8_0= ruleFeature )
            	    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:259:3: lv_features_8_0= ruleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_ruleEntity454);
            	    lv_features_8_0=ruleFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_8_0, 
            	            		"Feature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleEntity467); 

                	newLeafNode(otherlv_9, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8());
                

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:287:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:288:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:289:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation503);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation513); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:296:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_option_1_0= ruleConfigOption ) ) (otherlv_2= ':' ( (lv_value_3_0= ruleConfigValue ) ) )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_option_1_0 = null;

        Enumerator lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:299:28: ( (otherlv_0= '@' ( (lv_option_1_0= ruleConfigOption ) ) (otherlv_2= ':' ( (lv_value_3_0= ruleConfigValue ) ) )? ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:300:1: (otherlv_0= '@' ( (lv_option_1_0= ruleConfigOption ) ) (otherlv_2= ':' ( (lv_value_3_0= ruleConfigValue ) ) )? )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:300:1: (otherlv_0= '@' ( (lv_option_1_0= ruleConfigOption ) ) (otherlv_2= ':' ( (lv_value_3_0= ruleConfigValue ) ) )? )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:300:3: otherlv_0= '@' ( (lv_option_1_0= ruleConfigOption ) ) (otherlv_2= ':' ( (lv_value_3_0= ruleConfigValue ) ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleAnnotation550); 

                	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
                
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:304:1: ( (lv_option_1_0= ruleConfigOption ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:305:1: (lv_option_1_0= ruleConfigOption )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:305:1: (lv_option_1_0= ruleConfigOption )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:306:3: lv_option_1_0= ruleConfigOption
            {
             
            	        newCompositeNode(grammarAccess.getAnnotationAccess().getOptionConfigOptionEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConfigOption_in_ruleAnnotation571);
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

            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:322:2: (otherlv_2= ':' ( (lv_value_3_0= ruleConfigValue ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:322:4: otherlv_2= ':' ( (lv_value_3_0= ruleConfigValue ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleAnnotation584); 

                        	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getColonKeyword_2_0());
                        
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:326:1: ( (lv_value_3_0= ruleConfigValue ) )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:327:1: (lv_value_3_0= ruleConfigValue )
                    {
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:327:1: (lv_value_3_0= ruleConfigValue )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:328:3: lv_value_3_0= ruleConfigValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getValueConfigValueEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConfigValue_in_ruleAnnotation605);
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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:352:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:353:2: (iv_ruleFeature= ruleFeature EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:354:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature643);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature653); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:361:1: ruleFeature returns [EObject current=null] : ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_isIndexed_1_0= 'indexed' ) )? ( (lv_isContainment_2_0= '-[' ) )? ( (lv_type_3_0= ruleTypeRef ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '=' ( (lv_defaultValue_6_0= ruleValueObject ) ) )? (otherlv_7= '<->' ( ( ruleQualifiedName ) ) )? otherlv_9= ';' ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_0=null;
        Token lv_isIndexed_1_0=null;
        Token lv_isContainment_2_0=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_type_3_0 = null;

        EObject lv_defaultValue_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:364:28: ( ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_isIndexed_1_0= 'indexed' ) )? ( (lv_isContainment_2_0= '-[' ) )? ( (lv_type_3_0= ruleTypeRef ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '=' ( (lv_defaultValue_6_0= ruleValueObject ) ) )? (otherlv_7= '<->' ( ( ruleQualifiedName ) ) )? otherlv_9= ';' ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:365:1: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_isIndexed_1_0= 'indexed' ) )? ( (lv_isContainment_2_0= '-[' ) )? ( (lv_type_3_0= ruleTypeRef ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '=' ( (lv_defaultValue_6_0= ruleValueObject ) ) )? (otherlv_7= '<->' ( ( ruleQualifiedName ) ) )? otherlv_9= ';' )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:365:1: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_isIndexed_1_0= 'indexed' ) )? ( (lv_isContainment_2_0= '-[' ) )? ( (lv_type_3_0= ruleTypeRef ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '=' ( (lv_defaultValue_6_0= ruleValueObject ) ) )? (otherlv_7= '<->' ( ( ruleQualifiedName ) ) )? otherlv_9= ';' )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:365:2: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_isIndexed_1_0= 'indexed' ) )? ( (lv_isContainment_2_0= '-[' ) )? ( (lv_type_3_0= ruleTypeRef ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '=' ( (lv_defaultValue_6_0= ruleValueObject ) ) )? (otherlv_7= '<->' ( ( ruleQualifiedName ) ) )? otherlv_9= ';'
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:365:2: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_DOC_COMMENT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:366:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                    {
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:366:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:367:3: lv_comment_0_0= RULE_DOC_COMMENT
                    {
                    lv_comment_0_0=(Token)match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_ruleFeature695); 

                    			newLeafNode(lv_comment_0_0, grammarAccess.getFeatureAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"comment",
                            		lv_comment_0_0, 
                            		"DOC_COMMENT");
                    	    

                    }


                    }
                    break;

            }

            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:383:3: ( (lv_isIndexed_1_0= 'indexed' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:384:1: (lv_isIndexed_1_0= 'indexed' )
                    {
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:384:1: (lv_isIndexed_1_0= 'indexed' )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:385:3: lv_isIndexed_1_0= 'indexed'
                    {
                    lv_isIndexed_1_0=(Token)match(input,20,FOLLOW_20_in_ruleFeature719); 

                            newLeafNode(lv_isIndexed_1_0, grammarAccess.getFeatureAccess().getIsIndexedIndexedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "isIndexed", true, "indexed");
                    	    

                    }


                    }
                    break;

            }

            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:398:3: ( (lv_isContainment_2_0= '-[' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:399:1: (lv_isContainment_2_0= '-[' )
                    {
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:399:1: (lv_isContainment_2_0= '-[' )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:400:3: lv_isContainment_2_0= '-['
                    {
                    lv_isContainment_2_0=(Token)match(input,21,FOLLOW_21_in_ruleFeature751); 

                            newLeafNode(lv_isContainment_2_0, grammarAccess.getFeatureAccess().getIsContainmentHyphenMinusLeftSquareBracketKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "isContainment", true, "-[");
                    	    

                    }


                    }
                    break;

            }

            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:413:3: ( (lv_type_3_0= ruleTypeRef ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:414:1: (lv_type_3_0= ruleTypeRef )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:414:1: (lv_type_3_0= ruleTypeRef )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:415:3: lv_type_3_0= ruleTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getFeatureAccess().getTypeTypeRefParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleFeature786);
            lv_type_3_0=ruleTypeRef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFeatureRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"TypeRef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:431:2: ( (lv_name_4_0= RULE_ID ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:432:1: (lv_name_4_0= RULE_ID )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:432:1: (lv_name_4_0= RULE_ID )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:433:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature803); 

            			newLeafNode(lv_name_4_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"ID");
            	    

            }


            }

            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:449:2: (otherlv_5= '=' ( (lv_defaultValue_6_0= ruleValueObject ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:449:4: otherlv_5= '=' ( (lv_defaultValue_6_0= ruleValueObject ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleFeature821); 

                        	newLeafNode(otherlv_5, grammarAccess.getFeatureAccess().getEqualsSignKeyword_5_0());
                        
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:453:1: ( (lv_defaultValue_6_0= ruleValueObject ) )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:454:1: (lv_defaultValue_6_0= ruleValueObject )
                    {
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:454:1: (lv_defaultValue_6_0= ruleValueObject )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:455:3: lv_defaultValue_6_0= ruleValueObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureAccess().getDefaultValueValueObjectParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueObject_in_ruleFeature842);
                    lv_defaultValue_6_0=ruleValueObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureRule());
                    	        }
                           		set(
                           			current, 
                           			"defaultValue",
                            		lv_defaultValue_6_0, 
                            		"ValueObject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:471:4: (otherlv_7= '<->' ( ( ruleQualifiedName ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:471:6: otherlv_7= '<->' ( ( ruleQualifiedName ) )
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleFeature857); 

                        	newLeafNode(otherlv_7, grammarAccess.getFeatureAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_6_0());
                        
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:475:1: ( ( ruleQualifiedName ) )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:476:1: ( ruleQualifiedName )
                    {
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:476:1: ( ruleQualifiedName )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:477:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getFeatureAccess().getInverseFeatureCrossReference_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleFeature880);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,24,FOLLOW_24_in_ruleFeature894); 

                	newLeafNode(otherlv_9, grammarAccess.getFeatureAccess().getSemicolonKeyword_7());
                

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:504:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:505:2: (iv_rulePrimitive= rulePrimitive EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:506:2: iv_rulePrimitive= rulePrimitive EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive932);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;

             current =iv_rulePrimitive; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive942); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:513:1: rulePrimitive returns [EObject current=null] : (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:516:28: ( (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:517:1: (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:517:1: (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:517:3: otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_rulePrimitive979); 

                	newLeafNode(otherlv_0, grammarAccess.getPrimitiveAccess().getPrimitiveTypeKeyword_0());
                
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:521:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:522:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:522:1: (lv_name_1_0= RULE_ID )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:523:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimitive996); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:547:1: entryRuleAny returns [EObject current=null] : iv_ruleAny= ruleAny EOF ;
    public final EObject entryRuleAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAny = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:548:2: (iv_ruleAny= ruleAny EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:549:2: iv_ruleAny= ruleAny EOF
            {
             newCompositeNode(grammarAccess.getAnyRule()); 
            pushFollow(FOLLOW_ruleAny_in_entryRuleAny1037);
            iv_ruleAny=ruleAny();

            state._fsp--;

             current =iv_ruleAny; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAny1047); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:556:1: ruleAny returns [EObject current=null] : (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAny() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:559:28: ( (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:560:1: (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:560:1: (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:560:3: otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleAny1084); 

                	newLeafNode(otherlv_0, grammarAccess.getAnyAccess().getAnyTypeKeyword_0());
                
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:564:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:565:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:565:1: (lv_name_1_0= RULE_ID )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:566:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAny1101); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:590:1: entryRuleTypeRef returns [EObject current=null] : iv_ruleTypeRef= ruleTypeRef EOF ;
    public final EObject entryRuleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRef = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:591:2: (iv_ruleTypeRef= ruleTypeRef EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:592:2: iv_ruleTypeRef= ruleTypeRef EOF
            {
             newCompositeNode(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef1142);
            iv_ruleTypeRef=ruleTypeRef();

            state._fsp--;

             current =iv_ruleTypeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef1152); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:599:1: ruleTypeRef returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? ) ;
    public final EObject ruleTypeRef() throws RecognitionException {
        EObject current = null;

        Token lv_isMulti_1_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:602:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:603:1: ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:603:1: ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:603:2: ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )?
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:603:2: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:604:1: ( ruleQualifiedName )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:604:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:605:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeRefRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeRef1200);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:618:2: ( (lv_isMulti_1_0= '[]' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:619:1: (lv_isMulti_1_0= '[]' )
                    {
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:619:1: (lv_isMulti_1_0= '[]' )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:620:3: lv_isMulti_1_0= '[]'
                    {
                    lv_isMulti_1_0=(Token)match(input,27,FOLLOW_27_in_ruleTypeRef1218); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:641:1: entryRuleValueObject returns [EObject current=null] : iv_ruleValueObject= ruleValueObject EOF ;
    public final EObject entryRuleValueObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueObject = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:642:2: (iv_ruleValueObject= ruleValueObject EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:643:2: iv_ruleValueObject= ruleValueObject EOF
            {
             newCompositeNode(grammarAccess.getValueObjectRule()); 
            pushFollow(FOLLOW_ruleValueObject_in_entryRuleValueObject1268);
            iv_ruleValueObject=ruleValueObject();

            state._fsp--;

             current =iv_ruleValueObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueObject1278); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:650:1: ruleValueObject returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue | this_FloatValue_2= ruleFloatValue ) ;
    public final EObject ruleValueObject() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_IntegerValue_1 = null;

        EObject this_FloatValue_2 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:653:28: ( (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue | this_FloatValue_2= ruleFloatValue ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:654:1: (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue | this_FloatValue_2= ruleFloatValue )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:654:1: (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue | this_FloatValue_2= ruleFloatValue )
            int alt14=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt14=1;
                }
                break;
            case RULE_INT:
                {
                int LA14_2 = input.LA(2);

                if ( (LA14_2==EOF||(LA14_2>=23 && LA14_2<=24)) ) {
                    alt14=2;
                }
                else if ( (LA14_2==29) ) {
                    alt14=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;
                }
                }
                break;
            case 28:
            case 29:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:655:5: this_StringValue_0= ruleStringValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueObjectAccess().getStringValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringValue_in_ruleValueObject1325);
                    this_StringValue_0=ruleStringValue();

                    state._fsp--;

                     
                            current = this_StringValue_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:665:5: this_IntegerValue_1= ruleIntegerValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueObjectAccess().getIntegerValueParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIntegerValue_in_ruleValueObject1352);
                    this_IntegerValue_1=ruleIntegerValue();

                    state._fsp--;

                     
                            current = this_IntegerValue_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:675:5: this_FloatValue_2= ruleFloatValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueObjectAccess().getFloatValueParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFloatValue_in_ruleValueObject1379);
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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:691:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:692:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:693:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue1414);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue1424); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:700:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEStringObject ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:703:28: ( ( (lv_value_0_0= ruleEStringObject ) ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:704:1: ( (lv_value_0_0= ruleEStringObject ) )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:704:1: ( (lv_value_0_0= ruleEStringObject ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:705:1: (lv_value_0_0= ruleEStringObject )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:705:1: (lv_value_0_0= ruleEStringObject )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:706:3: lv_value_0_0= ruleEStringObject
            {
             
            	        newCompositeNode(grammarAccess.getStringValueAccess().getValueEStringObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEStringObject_in_ruleStringValue1469);
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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:730:1: entryRuleEStringObject returns [String current=null] : iv_ruleEStringObject= ruleEStringObject EOF ;
    public final String entryRuleEStringObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringObject = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:731:2: (iv_ruleEStringObject= ruleEStringObject EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:732:2: iv_ruleEStringObject= ruleEStringObject EOF
            {
             newCompositeNode(grammarAccess.getEStringObjectRule()); 
            pushFollow(FOLLOW_ruleEStringObject_in_entryRuleEStringObject1505);
            iv_ruleEStringObject=ruleEStringObject();

            state._fsp--;

             current =iv_ruleEStringObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEStringObject1516); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:739:1: ruleEStringObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEStringObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:742:28: (this_STRING_0= RULE_STRING )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:743:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEStringObject1555); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:758:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:759:2: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:760:2: iv_ruleIntegerValue= ruleIntegerValue EOF
            {
             newCompositeNode(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue1599);
            iv_ruleIntegerValue=ruleIntegerValue();

            state._fsp--;

             current =iv_ruleIntegerValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValue1609); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:767:1: ruleIntegerValue returns [EObject current=null] : ( (lv_value_0_0= ruleEIntegerObject ) ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:770:28: ( ( (lv_value_0_0= ruleEIntegerObject ) ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:771:1: ( (lv_value_0_0= ruleEIntegerObject ) )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:771:1: ( (lv_value_0_0= ruleEIntegerObject ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:772:1: (lv_value_0_0= ruleEIntegerObject )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:772:1: (lv_value_0_0= ruleEIntegerObject )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:773:3: lv_value_0_0= ruleEIntegerObject
            {
             
            	        newCompositeNode(grammarAccess.getIntegerValueAccess().getValueEIntegerObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEIntegerObject_in_ruleIntegerValue1654);
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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:797:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:798:2: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:799:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
            {
             newCompositeNode(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject1690);
            iv_ruleEIntegerObject=ruleEIntegerObject();

            state._fsp--;

             current =iv_ruleEIntegerObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEIntegerObject1701); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:806:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:809:28: (this_INT_0= RULE_INT )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:810:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEIntegerObject1740); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:825:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:826:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:827:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
             newCompositeNode(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue1784);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;

             current =iv_ruleFloatValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue1794); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:834:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= ruleEFloatObject ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:837:28: ( ( (lv_value_0_0= ruleEFloatObject ) ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:838:1: ( (lv_value_0_0= ruleEFloatObject ) )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:838:1: ( (lv_value_0_0= ruleEFloatObject ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:839:1: (lv_value_0_0= ruleEFloatObject )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:839:1: (lv_value_0_0= ruleEFloatObject )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:840:3: lv_value_0_0= ruleEFloatObject
            {
             
            	        newCompositeNode(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEFloatObject_in_ruleFloatValue1839);
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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:864:1: entryRuleEFloatObject returns [String current=null] : iv_ruleEFloatObject= ruleEFloatObject EOF ;
    public final String entryRuleEFloatObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloatObject = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:865:2: (iv_ruleEFloatObject= ruleEFloatObject EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:866:2: iv_ruleEFloatObject= ruleEFloatObject EOF
            {
             newCompositeNode(grammarAccess.getEFloatObjectRule()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject1875);
            iv_ruleEFloatObject=ruleEFloatObject();

            state._fsp--;

             current =iv_ruleEFloatObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEFloatObject1886); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:873:1: ruleEFloatObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEFloatObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:876:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:877:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:877:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:877:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:877:2: (kw= '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:878:2: kw= '-'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleEFloatObject1925); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:883:3: (this_INT_1= RULE_INT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:883:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEFloatObject1943); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,29,FOLLOW_29_in_ruleEFloatObject1963); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEFloatObject1978); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:911:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:912:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:913:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2024);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName2035); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:920:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:923:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:924:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:924:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:924:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2075); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:931:1: (kw= '.' this_ID_2= RULE_ID )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==29) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:932:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,29,FOLLOW_29_in_ruleQualifiedName2094); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2109); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:952:1: ruleConfigOption returns [Enumerator current=null] : (enumLiteral_0= 'persistency' ) ;
    public final Enumerator ruleConfigOption() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:954:28: ( (enumLiteral_0= 'persistency' ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:955:1: (enumLiteral_0= 'persistency' )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:955:1: (enumLiteral_0= 'persistency' )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:955:3: enumLiteral_0= 'persistency'
            {
            enumLiteral_0=(Token)match(input,30,FOLLOW_30_in_ruleConfigOption2169); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:965:1: ruleConfigValue returns [Enumerator current=null] : (enumLiteral_0= 'CoreData' ) ;
    public final Enumerator ruleConfigValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:967:28: ( (enumLiteral_0= 'CoreData' ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:968:1: (enumLiteral_0= 'CoreData' )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:968:1: (enumLiteral_0= 'CoreData' )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:968:3: enumLiteral_0= 'CoreData'
            {
            enumLiteral_0=(Token)match(input,31,FOLLOW_31_in_ruleConfigValue2212); 

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
    public static final BitSet FOLLOW_12_in_ruleEntityModel122 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEntityModel145 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEntityModel157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEntityModel174 = new BitSet(new long[]{0x000000000008C022L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleEntityModel200 = new BitSet(new long[]{0x000000000008C022L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_ruleEntity289 = new BitSet(new long[]{0x000000000008C000L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleEntity316 = new BitSet(new long[]{0x000000000008C000L});
    public static final BitSet FOLLOW_14_in_ruleEntity335 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEntity361 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity378 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleEntity396 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEntity419 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEntity433 = new BitSet(new long[]{0x0000000000340060L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleEntity454 = new BitSet(new long[]{0x0000000000340060L});
    public static final BitSet FOLLOW_18_in_ruleEntity467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleAnnotation550 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleConfigOption_in_ruleAnnotation571 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleAnnotation584 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleConfigValue_in_ruleAnnotation605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_ruleFeature695 = new BitSet(new long[]{0x0000000000300060L});
    public static final BitSet FOLLOW_20_in_ruleFeature719 = new BitSet(new long[]{0x0000000000300060L});
    public static final BitSet FOLLOW_21_in_ruleFeature751 = new BitSet(new long[]{0x0000000000300060L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleFeature786 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature803 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_22_in_ruleFeature821 = new BitSet(new long[]{0x0000000030000090L});
    public static final BitSet FOLLOW_ruleValueObject_in_ruleFeature842 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleFeature857 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFeature880 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleFeature894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulePrimitive979 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimitive996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAny_in_entryRuleAny1037 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAny1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleAny1084 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAny1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef1142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeRef1200 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleTypeRef1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueObject_in_entryRuleValueObject1268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueObject1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleValueObject1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_ruleValueObject1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_ruleValueObject1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue1414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_ruleStringValue1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_entryRuleEStringObject1505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEStringObject1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEStringObject1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue1599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_ruleIntegerValue1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject1690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEIntegerObject1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEIntegerObject1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue1784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_ruleFloatValue1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject1875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEFloatObject1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleEFloatObject1925 = new BitSet(new long[]{0x0000000020000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatObject1943 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleEFloatObject1963 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatObject1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2075 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleQualifiedName2094 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2109 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_30_in_ruleConfigOption2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleConfigValue2212 = new BitSet(new long[]{0x0000000000000002L});

}