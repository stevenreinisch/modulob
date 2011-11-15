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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_DOC_COMMENT", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'current'", "'entities for module'", "'version'", "'abstract'", "'entity'", "':'", "'{'", "'}'", "'@'", "'indexed'", "'-['", "'='", "'<->'", "';'", "'enum'", "','", "'primitive type'", "'any type'", "'[]'", "'-'", "'.'", "'persistency'", "'CoreData'"
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
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:77:1: ruleEntityModel returns [EObject current=null] : ( ( (lv_current_0_0= 'current' ) )? otherlv_1= 'entities for module' ( ( ruleQualifiedName ) ) otherlv_3= 'version' ( (lv_version_4_0= RULE_STRING ) ) ( (lv_entities_5_0= ruleEntity ) )* ( (lv_enums_6_0= ruleEnum ) )* ) ;
    public final EObject ruleEntityModel() throws RecognitionException {
        EObject current = null;

        Token lv_current_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_version_4_0=null;
        EObject lv_entities_5_0 = null;

        EObject lv_enums_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:80:28: ( ( ( (lv_current_0_0= 'current' ) )? otherlv_1= 'entities for module' ( ( ruleQualifiedName ) ) otherlv_3= 'version' ( (lv_version_4_0= RULE_STRING ) ) ( (lv_entities_5_0= ruleEntity ) )* ( (lv_enums_6_0= ruleEnum ) )* ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:81:1: ( ( (lv_current_0_0= 'current' ) )? otherlv_1= 'entities for module' ( ( ruleQualifiedName ) ) otherlv_3= 'version' ( (lv_version_4_0= RULE_STRING ) ) ( (lv_entities_5_0= ruleEntity ) )* ( (lv_enums_6_0= ruleEnum ) )* )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:81:1: ( ( (lv_current_0_0= 'current' ) )? otherlv_1= 'entities for module' ( ( ruleQualifiedName ) ) otherlv_3= 'version' ( (lv_version_4_0= RULE_STRING ) ) ( (lv_entities_5_0= ruleEntity ) )* ( (lv_enums_6_0= ruleEnum ) )* )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:81:2: ( (lv_current_0_0= 'current' ) )? otherlv_1= 'entities for module' ( ( ruleQualifiedName ) ) otherlv_3= 'version' ( (lv_version_4_0= RULE_STRING ) ) ( (lv_entities_5_0= ruleEntity ) )* ( (lv_enums_6_0= ruleEnum ) )*
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:81:2: ( (lv_current_0_0= 'current' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:82:1: (lv_current_0_0= 'current' )
                    {
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:82:1: (lv_current_0_0= 'current' )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:83:3: lv_current_0_0= 'current'
                    {
                    lv_current_0_0=(Token)match(input,12,FOLLOW_12_in_ruleEntityModel128); 

                            newLeafNode(lv_current_0_0, grammarAccess.getEntityModelAccess().getCurrentCurrentKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityModelRule());
                    	        }
                           		setWithLastConsumed(current, "current", true, "current");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleEntityModel154); 

                	newLeafNode(otherlv_1, grammarAccess.getEntityModelAccess().getEntitiesForModuleKeyword_1());
                
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:100:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:101:1: ( ruleQualifiedName )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:101:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:102:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityModelRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getEntityModelAccess().getModuleModuleCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEntityModel177);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleEntityModel189); 

                	newLeafNode(otherlv_3, grammarAccess.getEntityModelAccess().getVersionKeyword_3());
                
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:119:1: ( (lv_version_4_0= RULE_STRING ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:120:1: (lv_version_4_0= RULE_STRING )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:120:1: (lv_version_4_0= RULE_STRING )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:121:3: lv_version_4_0= RULE_STRING
            {
            lv_version_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEntityModel206); 

            			newLeafNode(lv_version_4_0, grammarAccess.getEntityModelAccess().getVersionSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"version",
                    		lv_version_4_0, 
                    		"STRING");
            	    

            }


            }

            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:137:2: ( (lv_entities_5_0= ruleEntity ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_DOC_COMMENT||(LA2_0>=15 && LA2_0<=16)||LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:138:1: (lv_entities_5_0= ruleEntity )
            	    {
            	    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:138:1: (lv_entities_5_0= ruleEntity )
            	    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:139:3: lv_entities_5_0= ruleEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityModelAccess().getEntitiesEntityParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_ruleEntityModel232);
            	    lv_entities_5_0=ruleEntity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entities",
            	            		lv_entities_5_0, 
            	            		"Entity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:155:3: ( (lv_enums_6_0= ruleEnum ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==26) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:156:1: (lv_enums_6_0= ruleEnum )
            	    {
            	    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:156:1: (lv_enums_6_0= ruleEnum )
            	    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:157:3: lv_enums_6_0= ruleEnum
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityModelAccess().getEnumsEnumParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnum_in_ruleEntityModel254);
            	    lv_enums_6_0=ruleEnum();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"enums",
            	            		lv_enums_6_0, 
            	            		"Enum");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:181:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:182:2: (iv_ruleEntity= ruleEntity EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:183:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity291);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity301); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:190:1: ruleEntity returns [EObject current=null] : ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_annotations_1_0= ruleAnnotation ) )* ( (lv_isAbstract_2_0= 'abstract' ) )? otherlv_3= 'entity' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_features_8_0= ruleFeature ) )* otherlv_9= '}' ) ;
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
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:193:28: ( ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_annotations_1_0= ruleAnnotation ) )* ( (lv_isAbstract_2_0= 'abstract' ) )? otherlv_3= 'entity' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_features_8_0= ruleFeature ) )* otherlv_9= '}' ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:194:1: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_annotations_1_0= ruleAnnotation ) )* ( (lv_isAbstract_2_0= 'abstract' ) )? otherlv_3= 'entity' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_features_8_0= ruleFeature ) )* otherlv_9= '}' )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:194:1: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_annotations_1_0= ruleAnnotation ) )* ( (lv_isAbstract_2_0= 'abstract' ) )? otherlv_3= 'entity' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_features_8_0= ruleFeature ) )* otherlv_9= '}' )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:194:2: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_annotations_1_0= ruleAnnotation ) )* ( (lv_isAbstract_2_0= 'abstract' ) )? otherlv_3= 'entity' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_features_8_0= ruleFeature ) )* otherlv_9= '}'
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:194:2: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_DOC_COMMENT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:195:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                    {
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:195:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:196:3: lv_comment_0_0= RULE_DOC_COMMENT
                    {
                    lv_comment_0_0=(Token)match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_ruleEntity343); 

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

            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:212:3: ( (lv_annotations_1_0= ruleAnnotation ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:213:1: (lv_annotations_1_0= ruleAnnotation )
            	    {
            	    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:213:1: (lv_annotations_1_0= ruleAnnotation )
            	    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:214:3: lv_annotations_1_0= ruleAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleEntity370);
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
            	    break loop5;
                }
            } while (true);

            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:230:3: ( (lv_isAbstract_2_0= 'abstract' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:231:1: (lv_isAbstract_2_0= 'abstract' )
                    {
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:231:1: (lv_isAbstract_2_0= 'abstract' )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:232:3: lv_isAbstract_2_0= 'abstract'
                    {
                    lv_isAbstract_2_0=(Token)match(input,15,FOLLOW_15_in_ruleEntity389); 

                            newLeafNode(lv_isAbstract_2_0, grammarAccess.getEntityAccess().getIsAbstractAbstractKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                           		setWithLastConsumed(current, "isAbstract", true, "abstract");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleEntity415); 

                	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getEntityKeyword_3());
                
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:249:1: ( (lv_name_4_0= RULE_ID ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:250:1: (lv_name_4_0= RULE_ID )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:250:1: (lv_name_4_0= RULE_ID )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:251:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity432); 

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

            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:267:2: (otherlv_5= ':' ( ( ruleQualifiedName ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:267:4: otherlv_5= ':' ( ( ruleQualifiedName ) )
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleEntity450); 

                        	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getColonKeyword_5_0());
                        
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:271:1: ( ( ruleQualifiedName ) )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:272:1: ( ruleQualifiedName )
                    {
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:272:1: ( ruleQualifiedName )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:273:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getSuperEntityCrossReference_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEntity473);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleEntity487); 

                	newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_6());
                
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:290:1: ( (lv_features_8_0= ruleFeature ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_DOC_COMMENT && LA8_0<=RULE_ID)||(LA8_0>=21 && LA8_0<=22)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:291:1: (lv_features_8_0= ruleFeature )
            	    {
            	    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:291:1: (lv_features_8_0= ruleFeature )
            	    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:292:3: lv_features_8_0= ruleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_ruleEntity508);
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
            	    break loop8;
                }
            } while (true);

            otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleEntity521); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:320:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:321:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:322:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation557);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation567); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:329:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_option_1_0= ruleConfigOption ) ) (otherlv_2= ':' ( (lv_value_3_0= ruleConfigValue ) ) )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_option_1_0 = null;

        Enumerator lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:332:28: ( (otherlv_0= '@' ( (lv_option_1_0= ruleConfigOption ) ) (otherlv_2= ':' ( (lv_value_3_0= ruleConfigValue ) ) )? ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:333:1: (otherlv_0= '@' ( (lv_option_1_0= ruleConfigOption ) ) (otherlv_2= ':' ( (lv_value_3_0= ruleConfigValue ) ) )? )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:333:1: (otherlv_0= '@' ( (lv_option_1_0= ruleConfigOption ) ) (otherlv_2= ':' ( (lv_value_3_0= ruleConfigValue ) ) )? )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:333:3: otherlv_0= '@' ( (lv_option_1_0= ruleConfigOption ) ) (otherlv_2= ':' ( (lv_value_3_0= ruleConfigValue ) ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleAnnotation604); 

                	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
                
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:337:1: ( (lv_option_1_0= ruleConfigOption ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:338:1: (lv_option_1_0= ruleConfigOption )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:338:1: (lv_option_1_0= ruleConfigOption )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:339:3: lv_option_1_0= ruleConfigOption
            {
             
            	        newCompositeNode(grammarAccess.getAnnotationAccess().getOptionConfigOptionEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConfigOption_in_ruleAnnotation625);
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

            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:355:2: (otherlv_2= ':' ( (lv_value_3_0= ruleConfigValue ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:355:4: otherlv_2= ':' ( (lv_value_3_0= ruleConfigValue ) )
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleAnnotation638); 

                        	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getColonKeyword_2_0());
                        
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:359:1: ( (lv_value_3_0= ruleConfigValue ) )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:360:1: (lv_value_3_0= ruleConfigValue )
                    {
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:360:1: (lv_value_3_0= ruleConfigValue )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:361:3: lv_value_3_0= ruleConfigValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getValueConfigValueEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConfigValue_in_ruleAnnotation659);
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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:385:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:386:2: (iv_ruleFeature= ruleFeature EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:387:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature697);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature707); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:394:1: ruleFeature returns [EObject current=null] : ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_isIndexed_1_0= 'indexed' ) )? ( (lv_isContainment_2_0= '-[' ) )? ( (lv_type_3_0= ruleTypeRef ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '=' ( (lv_defaultValue_6_0= ruleValueObject ) ) )? (otherlv_7= '<->' ( ( ruleQualifiedName ) ) )? otherlv_9= ';' ) ;
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
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:397:28: ( ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_isIndexed_1_0= 'indexed' ) )? ( (lv_isContainment_2_0= '-[' ) )? ( (lv_type_3_0= ruleTypeRef ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '=' ( (lv_defaultValue_6_0= ruleValueObject ) ) )? (otherlv_7= '<->' ( ( ruleQualifiedName ) ) )? otherlv_9= ';' ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:398:1: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_isIndexed_1_0= 'indexed' ) )? ( (lv_isContainment_2_0= '-[' ) )? ( (lv_type_3_0= ruleTypeRef ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '=' ( (lv_defaultValue_6_0= ruleValueObject ) ) )? (otherlv_7= '<->' ( ( ruleQualifiedName ) ) )? otherlv_9= ';' )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:398:1: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_isIndexed_1_0= 'indexed' ) )? ( (lv_isContainment_2_0= '-[' ) )? ( (lv_type_3_0= ruleTypeRef ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '=' ( (lv_defaultValue_6_0= ruleValueObject ) ) )? (otherlv_7= '<->' ( ( ruleQualifiedName ) ) )? otherlv_9= ';' )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:398:2: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_isIndexed_1_0= 'indexed' ) )? ( (lv_isContainment_2_0= '-[' ) )? ( (lv_type_3_0= ruleTypeRef ) ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '=' ( (lv_defaultValue_6_0= ruleValueObject ) ) )? (otherlv_7= '<->' ( ( ruleQualifiedName ) ) )? otherlv_9= ';'
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:398:2: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_DOC_COMMENT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:399:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                    {
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:399:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:400:3: lv_comment_0_0= RULE_DOC_COMMENT
                    {
                    lv_comment_0_0=(Token)match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_ruleFeature749); 

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

            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:416:3: ( (lv_isIndexed_1_0= 'indexed' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:417:1: (lv_isIndexed_1_0= 'indexed' )
                    {
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:417:1: (lv_isIndexed_1_0= 'indexed' )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:418:3: lv_isIndexed_1_0= 'indexed'
                    {
                    lv_isIndexed_1_0=(Token)match(input,21,FOLLOW_21_in_ruleFeature773); 

                            newLeafNode(lv_isIndexed_1_0, grammarAccess.getFeatureAccess().getIsIndexedIndexedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "isIndexed", true, "indexed");
                    	    

                    }


                    }
                    break;

            }

            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:431:3: ( (lv_isContainment_2_0= '-[' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:432:1: (lv_isContainment_2_0= '-[' )
                    {
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:432:1: (lv_isContainment_2_0= '-[' )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:433:3: lv_isContainment_2_0= '-['
                    {
                    lv_isContainment_2_0=(Token)match(input,22,FOLLOW_22_in_ruleFeature805); 

                            newLeafNode(lv_isContainment_2_0, grammarAccess.getFeatureAccess().getIsContainmentHyphenMinusLeftSquareBracketKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "isContainment", true, "-[");
                    	    

                    }


                    }
                    break;

            }

            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:446:3: ( (lv_type_3_0= ruleTypeRef ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:447:1: (lv_type_3_0= ruleTypeRef )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:447:1: (lv_type_3_0= ruleTypeRef )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:448:3: lv_type_3_0= ruleTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getFeatureAccess().getTypeTypeRefParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleFeature840);
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

            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:464:2: ( (lv_name_4_0= RULE_ID ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:465:1: (lv_name_4_0= RULE_ID )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:465:1: (lv_name_4_0= RULE_ID )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:466:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature857); 

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

            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:482:2: (otherlv_5= '=' ( (lv_defaultValue_6_0= ruleValueObject ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:482:4: otherlv_5= '=' ( (lv_defaultValue_6_0= ruleValueObject ) )
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleFeature875); 

                        	newLeafNode(otherlv_5, grammarAccess.getFeatureAccess().getEqualsSignKeyword_5_0());
                        
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:486:1: ( (lv_defaultValue_6_0= ruleValueObject ) )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:487:1: (lv_defaultValue_6_0= ruleValueObject )
                    {
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:487:1: (lv_defaultValue_6_0= ruleValueObject )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:488:3: lv_defaultValue_6_0= ruleValueObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureAccess().getDefaultValueValueObjectParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueObject_in_ruleFeature896);
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

            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:504:4: (otherlv_7= '<->' ( ( ruleQualifiedName ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:504:6: otherlv_7= '<->' ( ( ruleQualifiedName ) )
                    {
                    otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleFeature911); 

                        	newLeafNode(otherlv_7, grammarAccess.getFeatureAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_6_0());
                        
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:508:1: ( ( ruleQualifiedName ) )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:509:1: ( ruleQualifiedName )
                    {
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:509:1: ( ruleQualifiedName )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:510:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getFeatureAccess().getInverseFeatureCrossReference_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleFeature934);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,25,FOLLOW_25_in_ruleFeature948); 

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


    // $ANTLR start "entryRuleEnum"
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:535:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:536:2: (iv_ruleEnum= ruleEnum EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:537:2: iv_ruleEnum= ruleEnum EOF
            {
             newCompositeNode(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum984);
            iv_ruleEnum=ruleEnum();

            state._fsp--;

             current =iv_ruleEnum; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum994); 

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
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:544:1: ruleEnum returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_literals_3_0 = null;

        EObject lv_literals_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:547:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) ) )* otherlv_6= '}' ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:548:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) ) )* otherlv_6= '}' )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:548:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) ) )* otherlv_6= '}' )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:548:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleEnum1031); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getEnumKeyword_0());
                
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:552:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:553:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:553:1: (lv_name_1_0= RULE_ID )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:554:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnum1048); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleEnum1065); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:574:1: ( (lv_literals_3_0= ruleEnumLiteral ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:575:1: (lv_literals_3_0= ruleEnumLiteral )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:575:1: (lv_literals_3_0= ruleEnumLiteral )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:576:3: lv_literals_3_0= ruleEnumLiteral
            {
             
            	        newCompositeNode(grammarAccess.getEnumAccess().getLiteralsEnumLiteralParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleEnumLiteral_in_ruleEnum1086);
            lv_literals_3_0=ruleEnumLiteral();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumRule());
            	        }
                   		add(
                   			current, 
                   			"literals",
                    		lv_literals_3_0, 
                    		"EnumLiteral");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:592:2: (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:592:4: otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) )
            	    {
            	    otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleEnum1099); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEnumAccess().getCommaKeyword_4_0());
            	        
            	    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:596:1: ( (lv_literals_5_0= ruleEnumLiteral ) )
            	    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:597:1: (lv_literals_5_0= ruleEnumLiteral )
            	    {
            	    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:597:1: (lv_literals_5_0= ruleEnumLiteral )
            	    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:598:3: lv_literals_5_0= ruleEnumLiteral
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumAccess().getLiteralsEnumLiteralParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumLiteral_in_ruleEnum1120);
            	    lv_literals_5_0=ruleEnumLiteral();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"literals",
            	            		lv_literals_5_0, 
            	            		"EnumLiteral");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleEnum1134); 

                	newLeafNode(otherlv_6, grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleEnumLiteral"
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:626:1: entryRuleEnumLiteral returns [EObject current=null] : iv_ruleEnumLiteral= ruleEnumLiteral EOF ;
    public final EObject entryRuleEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteral = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:627:2: (iv_ruleEnumLiteral= ruleEnumLiteral EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:628:2: iv_ruleEnumLiteral= ruleEnumLiteral EOF
            {
             newCompositeNode(grammarAccess.getEnumLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumLiteral_in_entryRuleEnumLiteral1170);
            iv_ruleEnumLiteral=ruleEnumLiteral();

            state._fsp--;

             current =iv_ruleEnumLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumLiteral1180); 

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
    // $ANTLR end "entryRuleEnumLiteral"


    // $ANTLR start "ruleEnumLiteral"
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:635:1: ruleEnumLiteral returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEnumLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:638:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:639:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:639:1: ( (lv_name_0_0= RULE_ID ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:640:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:640:1: (lv_name_0_0= RULE_ID )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:641:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumLiteral1221); 

            			newLeafNode(lv_name_0_0, grammarAccess.getEnumLiteralAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleEnumLiteral"


    // $ANTLR start "entryRulePrimitive"
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:667:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:668:2: (iv_rulePrimitive= rulePrimitive EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:669:2: iv_rulePrimitive= rulePrimitive EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive1263);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;

             current =iv_rulePrimitive; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive1273); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:676:1: rulePrimitive returns [EObject current=null] : (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:679:28: ( (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:680:1: (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:680:1: (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:680:3: otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_rulePrimitive1310); 

                	newLeafNode(otherlv_0, grammarAccess.getPrimitiveAccess().getPrimitiveTypeKeyword_0());
                
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:684:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:685:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:685:1: (lv_name_1_0= RULE_ID )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:686:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimitive1327); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:710:1: entryRuleAny returns [EObject current=null] : iv_ruleAny= ruleAny EOF ;
    public final EObject entryRuleAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAny = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:711:2: (iv_ruleAny= ruleAny EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:712:2: iv_ruleAny= ruleAny EOF
            {
             newCompositeNode(grammarAccess.getAnyRule()); 
            pushFollow(FOLLOW_ruleAny_in_entryRuleAny1368);
            iv_ruleAny=ruleAny();

            state._fsp--;

             current =iv_ruleAny; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAny1378); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:719:1: ruleAny returns [EObject current=null] : (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAny() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:722:28: ( (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:723:1: (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:723:1: (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:723:3: otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleAny1415); 

                	newLeafNode(otherlv_0, grammarAccess.getAnyAccess().getAnyTypeKeyword_0());
                
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:727:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:728:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:728:1: (lv_name_1_0= RULE_ID )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:729:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAny1432); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:753:1: entryRuleTypeRef returns [EObject current=null] : iv_ruleTypeRef= ruleTypeRef EOF ;
    public final EObject entryRuleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRef = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:754:2: (iv_ruleTypeRef= ruleTypeRef EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:755:2: iv_ruleTypeRef= ruleTypeRef EOF
            {
             newCompositeNode(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef1473);
            iv_ruleTypeRef=ruleTypeRef();

            state._fsp--;

             current =iv_ruleTypeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef1483); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:762:1: ruleTypeRef returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? ) ;
    public final EObject ruleTypeRef() throws RecognitionException {
        EObject current = null;

        Token lv_isMulti_1_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:765:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:766:1: ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:766:1: ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:766:2: ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )?
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:766:2: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:767:1: ( ruleQualifiedName )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:767:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:768:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeRefRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeRef1531);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:781:2: ( (lv_isMulti_1_0= '[]' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:782:1: (lv_isMulti_1_0= '[]' )
                    {
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:782:1: (lv_isMulti_1_0= '[]' )
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:783:3: lv_isMulti_1_0= '[]'
                    {
                    lv_isMulti_1_0=(Token)match(input,30,FOLLOW_30_in_ruleTypeRef1549); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:804:1: entryRuleValueObject returns [EObject current=null] : iv_ruleValueObject= ruleValueObject EOF ;
    public final EObject entryRuleValueObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueObject = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:805:2: (iv_ruleValueObject= ruleValueObject EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:806:2: iv_ruleValueObject= ruleValueObject EOF
            {
             newCompositeNode(grammarAccess.getValueObjectRule()); 
            pushFollow(FOLLOW_ruleValueObject_in_entryRuleValueObject1599);
            iv_ruleValueObject=ruleValueObject();

            state._fsp--;

             current =iv_ruleValueObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueObject1609); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:813:1: ruleValueObject returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue | this_FloatValue_2= ruleFloatValue ) ;
    public final EObject ruleValueObject() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_IntegerValue_1 = null;

        EObject this_FloatValue_2 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:816:28: ( (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue | this_FloatValue_2= ruleFloatValue ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:817:1: (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue | this_FloatValue_2= ruleFloatValue )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:817:1: (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue | this_FloatValue_2= ruleFloatValue )
            int alt17=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt17=1;
                }
                break;
            case RULE_INT:
                {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==32) ) {
                    alt17=3;
                }
                else if ( (LA17_2==EOF||(LA17_2>=24 && LA17_2<=25)) ) {
                    alt17=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;
                }
                }
                break;
            case 31:
            case 32:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:818:5: this_StringValue_0= ruleStringValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueObjectAccess().getStringValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringValue_in_ruleValueObject1656);
                    this_StringValue_0=ruleStringValue();

                    state._fsp--;

                     
                            current = this_StringValue_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:828:5: this_IntegerValue_1= ruleIntegerValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueObjectAccess().getIntegerValueParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIntegerValue_in_ruleValueObject1683);
                    this_IntegerValue_1=ruleIntegerValue();

                    state._fsp--;

                     
                            current = this_IntegerValue_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:838:5: this_FloatValue_2= ruleFloatValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueObjectAccess().getFloatValueParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFloatValue_in_ruleValueObject1710);
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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:854:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:855:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:856:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue1745);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue1755); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:863:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEStringObject ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:866:28: ( ( (lv_value_0_0= ruleEStringObject ) ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:867:1: ( (lv_value_0_0= ruleEStringObject ) )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:867:1: ( (lv_value_0_0= ruleEStringObject ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:868:1: (lv_value_0_0= ruleEStringObject )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:868:1: (lv_value_0_0= ruleEStringObject )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:869:3: lv_value_0_0= ruleEStringObject
            {
             
            	        newCompositeNode(grammarAccess.getStringValueAccess().getValueEStringObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEStringObject_in_ruleStringValue1800);
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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:893:1: entryRuleEStringObject returns [String current=null] : iv_ruleEStringObject= ruleEStringObject EOF ;
    public final String entryRuleEStringObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringObject = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:894:2: (iv_ruleEStringObject= ruleEStringObject EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:895:2: iv_ruleEStringObject= ruleEStringObject EOF
            {
             newCompositeNode(grammarAccess.getEStringObjectRule()); 
            pushFollow(FOLLOW_ruleEStringObject_in_entryRuleEStringObject1836);
            iv_ruleEStringObject=ruleEStringObject();

            state._fsp--;

             current =iv_ruleEStringObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEStringObject1847); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:902:1: ruleEStringObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEStringObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:905:28: (this_STRING_0= RULE_STRING )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:906:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEStringObject1886); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:921:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:922:2: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:923:2: iv_ruleIntegerValue= ruleIntegerValue EOF
            {
             newCompositeNode(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue1930);
            iv_ruleIntegerValue=ruleIntegerValue();

            state._fsp--;

             current =iv_ruleIntegerValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValue1940); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:930:1: ruleIntegerValue returns [EObject current=null] : ( (lv_value_0_0= ruleEIntegerObject ) ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:933:28: ( ( (lv_value_0_0= ruleEIntegerObject ) ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:934:1: ( (lv_value_0_0= ruleEIntegerObject ) )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:934:1: ( (lv_value_0_0= ruleEIntegerObject ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:935:1: (lv_value_0_0= ruleEIntegerObject )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:935:1: (lv_value_0_0= ruleEIntegerObject )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:936:3: lv_value_0_0= ruleEIntegerObject
            {
             
            	        newCompositeNode(grammarAccess.getIntegerValueAccess().getValueEIntegerObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEIntegerObject_in_ruleIntegerValue1985);
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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:960:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:961:2: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:962:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
            {
             newCompositeNode(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject2021);
            iv_ruleEIntegerObject=ruleEIntegerObject();

            state._fsp--;

             current =iv_ruleEIntegerObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEIntegerObject2032); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:969:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:972:28: (this_INT_0= RULE_INT )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:973:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEIntegerObject2071); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:988:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:989:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:990:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
             newCompositeNode(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue2115);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;

             current =iv_ruleFloatValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue2125); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:997:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= ruleEFloatObject ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:1000:28: ( ( (lv_value_0_0= ruleEFloatObject ) ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:1001:1: ( (lv_value_0_0= ruleEFloatObject ) )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:1001:1: ( (lv_value_0_0= ruleEFloatObject ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:1002:1: (lv_value_0_0= ruleEFloatObject )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:1002:1: (lv_value_0_0= ruleEFloatObject )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:1003:3: lv_value_0_0= ruleEFloatObject
            {
             
            	        newCompositeNode(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEFloatObject_in_ruleFloatValue2170);
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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:1027:1: entryRuleEFloatObject returns [String current=null] : iv_ruleEFloatObject= ruleEFloatObject EOF ;
    public final String entryRuleEFloatObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloatObject = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:1028:2: (iv_ruleEFloatObject= ruleEFloatObject EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:1029:2: iv_ruleEFloatObject= ruleEFloatObject EOF
            {
             newCompositeNode(grammarAccess.getEFloatObjectRule()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject2206);
            iv_ruleEFloatObject=ruleEFloatObject();

            state._fsp--;

             current =iv_ruleEFloatObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEFloatObject2217); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:1036:1: ruleEFloatObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEFloatObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:1039:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:1040:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:1040:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:1040:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:1040:2: (kw= '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:1041:2: kw= '-'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleEFloatObject2256); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:1046:3: (this_INT_1= RULE_INT )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:1046:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEFloatObject2274); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,32,FOLLOW_32_in_ruleEFloatObject2294); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEFloatObject2309); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:1074:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:1075:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:1076:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2355);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName2366); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:1083:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:1086:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:1087:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:1087:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:1087:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2406); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:1094:1: (kw= '.' this_ID_2= RULE_ID )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==32) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:1095:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,32,FOLLOW_32_in_ruleQualifiedName2425); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2440); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:1115:1: ruleConfigOption returns [Enumerator current=null] : (enumLiteral_0= 'persistency' ) ;
    public final Enumerator ruleConfigOption() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:1117:28: ( (enumLiteral_0= 'persistency' ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:1118:1: (enumLiteral_0= 'persistency' )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:1118:1: (enumLiteral_0= 'persistency' )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:1118:3: enumLiteral_0= 'persistency'
            {
            enumLiteral_0=(Token)match(input,33,FOLLOW_33_in_ruleConfigOption2500); 

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
    // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:1128:1: ruleConfigValue returns [Enumerator current=null] : (enumLiteral_0= 'CoreData' ) ;
    public final Enumerator ruleConfigValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:1130:28: ( (enumLiteral_0= 'CoreData' ) )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:1131:1: (enumLiteral_0= 'CoreData' )
            {
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:1131:1: (enumLiteral_0= 'CoreData' )
            // ../de.dubmas.modulob.datadsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalDataDsl.g:1131:3: enumLiteral_0= 'CoreData'
            {
            enumLiteral_0=(Token)match(input,34,FOLLOW_34_in_ruleConfigValue2543); 

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
    public static final BitSet FOLLOW_12_in_ruleEntityModel128 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEntityModel154 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEntityModel177 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEntityModel189 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEntityModel206 = new BitSet(new long[]{0x0000000004118022L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleEntityModel232 = new BitSet(new long[]{0x0000000004118022L});
    public static final BitSet FOLLOW_ruleEnum_in_ruleEntityModel254 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity291 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_ruleEntity343 = new BitSet(new long[]{0x0000000000118000L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleEntity370 = new BitSet(new long[]{0x0000000000118000L});
    public static final BitSet FOLLOW_15_in_ruleEntity389 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEntity415 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity432 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleEntity450 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEntity473 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEntity487 = new BitSet(new long[]{0x0000000000680060L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleEntity508 = new BitSet(new long[]{0x0000000000680060L});
    public static final BitSet FOLLOW_19_in_ruleEntity521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleAnnotation604 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ruleConfigOption_in_ruleAnnotation625 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleAnnotation638 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ruleConfigValue_in_ruleAnnotation659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_ruleFeature749 = new BitSet(new long[]{0x0000000000600060L});
    public static final BitSet FOLLOW_21_in_ruleFeature773 = new BitSet(new long[]{0x0000000000600060L});
    public static final BitSet FOLLOW_22_in_ruleFeature805 = new BitSet(new long[]{0x0000000000600060L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleFeature840 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature857 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_23_in_ruleFeature875 = new BitSet(new long[]{0x0000000180000090L});
    public static final BitSet FOLLOW_ruleValueObject_in_ruleFeature896 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_ruleFeature911 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFeature934 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleFeature948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum984 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleEnum1031 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnum1048 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEnum1065 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleEnumLiteral_in_ruleEnum1086 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_27_in_ruleEnum1099 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleEnumLiteral_in_ruleEnum1120 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_19_in_ruleEnum1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLiteral_in_entryRuleEnumLiteral1170 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumLiteral1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumLiteral1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive1263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulePrimitive1310 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimitive1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAny_in_entryRuleAny1368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAny1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleAny1415 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAny1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef1473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeRef1531 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleTypeRef1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueObject_in_entryRuleValueObject1599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueObject1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleValueObject1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_ruleValueObject1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_ruleValueObject1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue1745 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_ruleStringValue1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_entryRuleEStringObject1836 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEStringObject1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEStringObject1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue1930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_ruleIntegerValue1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject2021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEIntegerObject2032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEIntegerObject2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue2115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_ruleFloatValue2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject2206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEFloatObject2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleEFloatObject2256 = new BitSet(new long[]{0x0000000100000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatObject2274 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleEFloatObject2294 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatObject2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2406 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleQualifiedName2425 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2440 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_33_in_ruleConfigOption2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleConfigValue2543 = new BitSet(new long[]{0x0000000000000002L});

}