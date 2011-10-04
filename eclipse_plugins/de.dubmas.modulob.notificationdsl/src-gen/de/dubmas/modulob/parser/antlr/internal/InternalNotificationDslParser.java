package de.dubmas.modulob.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.dubmas.modulob.services.NotificationDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNotificationDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_DOC_COMMENT", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'notifications for module'", "'version'", "'notification'", "'{'", "'}'", "';'", "'primitive type'", "'any type'", "'[]'", "'-'", "'.'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_DOC_COMMENT=5;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
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


        public InternalNotificationDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalNotificationDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalNotificationDslParser.tokenNames; }
    public String getGrammarFileName() { return "../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g"; }



     	private NotificationDslGrammarAccess grammarAccess;
     	
        public InternalNotificationDslParser(TokenStream input, NotificationDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "NotificationModel";	
       	}
       	
       	@Override
       	protected NotificationDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleNotificationModel"
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:67:1: entryRuleNotificationModel returns [EObject current=null] : iv_ruleNotificationModel= ruleNotificationModel EOF ;
    public final EObject entryRuleNotificationModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotificationModel = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:68:2: (iv_ruleNotificationModel= ruleNotificationModel EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:69:2: iv_ruleNotificationModel= ruleNotificationModel EOF
            {
             newCompositeNode(grammarAccess.getNotificationModelRule()); 
            pushFollow(FOLLOW_ruleNotificationModel_in_entryRuleNotificationModel75);
            iv_ruleNotificationModel=ruleNotificationModel();

            state._fsp--;

             current =iv_ruleNotificationModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotificationModel85); 

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
    // $ANTLR end "entryRuleNotificationModel"


    // $ANTLR start "ruleNotificationModel"
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:76:1: ruleNotificationModel returns [EObject current=null] : (otherlv_0= 'notifications for module' ( ( ruleQualifiedName ) ) otherlv_2= 'version' ( (lv_version_3_0= RULE_STRING ) ) ( (lv_notifications_4_0= ruleNotification ) )* ) ;
    public final EObject ruleNotificationModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_version_3_0=null;
        EObject lv_notifications_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:79:28: ( (otherlv_0= 'notifications for module' ( ( ruleQualifiedName ) ) otherlv_2= 'version' ( (lv_version_3_0= RULE_STRING ) ) ( (lv_notifications_4_0= ruleNotification ) )* ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:80:1: (otherlv_0= 'notifications for module' ( ( ruleQualifiedName ) ) otherlv_2= 'version' ( (lv_version_3_0= RULE_STRING ) ) ( (lv_notifications_4_0= ruleNotification ) )* )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:80:1: (otherlv_0= 'notifications for module' ( ( ruleQualifiedName ) ) otherlv_2= 'version' ( (lv_version_3_0= RULE_STRING ) ) ( (lv_notifications_4_0= ruleNotification ) )* )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:80:3: otherlv_0= 'notifications for module' ( ( ruleQualifiedName ) ) otherlv_2= 'version' ( (lv_version_3_0= RULE_STRING ) ) ( (lv_notifications_4_0= ruleNotification ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleNotificationModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getNotificationModelAccess().getNotificationsForModuleKeyword_0());
                
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:84:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:85:1: ( ruleQualifiedName )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:85:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:86:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNotificationModelRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getNotificationModelAccess().getModuleModuleCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNotificationModel145);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleNotificationModel157); 

                	newLeafNode(otherlv_2, grammarAccess.getNotificationModelAccess().getVersionKeyword_2());
                
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:103:1: ( (lv_version_3_0= RULE_STRING ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:104:1: (lv_version_3_0= RULE_STRING )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:104:1: (lv_version_3_0= RULE_STRING )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:105:3: lv_version_3_0= RULE_STRING
            {
            lv_version_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNotificationModel174); 

            			newLeafNode(lv_version_3_0, grammarAccess.getNotificationModelAccess().getVersionSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNotificationModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"version",
                    		lv_version_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:121:2: ( (lv_notifications_4_0= ruleNotification ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_DOC_COMMENT||LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:122:1: (lv_notifications_4_0= ruleNotification )
            	    {
            	    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:122:1: (lv_notifications_4_0= ruleNotification )
            	    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:123:3: lv_notifications_4_0= ruleNotification
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNotificationModelAccess().getNotificationsNotificationParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNotification_in_ruleNotificationModel200);
            	    lv_notifications_4_0=ruleNotification();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNotificationModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"notifications",
            	            		lv_notifications_4_0, 
            	            		"Notification");
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
    // $ANTLR end "ruleNotificationModel"


    // $ANTLR start "entryRuleNotification"
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:147:1: entryRuleNotification returns [EObject current=null] : iv_ruleNotification= ruleNotification EOF ;
    public final EObject entryRuleNotification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotification = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:148:2: (iv_ruleNotification= ruleNotification EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:149:2: iv_ruleNotification= ruleNotification EOF
            {
             newCompositeNode(grammarAccess.getNotificationRule()); 
            pushFollow(FOLLOW_ruleNotification_in_entryRuleNotification237);
            iv_ruleNotification=ruleNotification();

            state._fsp--;

             current =iv_ruleNotification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotification247); 

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
    // $ANTLR end "entryRuleNotification"


    // $ANTLR start "ruleNotification"
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:156:1: ruleNotification returns [EObject current=null] : ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? otherlv_1= 'notification' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleFeature ) )* otherlv_5= '}' ) ;
    public final EObject ruleNotification() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_features_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:159:28: ( ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? otherlv_1= 'notification' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleFeature ) )* otherlv_5= '}' ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:160:1: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? otherlv_1= 'notification' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleFeature ) )* otherlv_5= '}' )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:160:1: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? otherlv_1= 'notification' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleFeature ) )* otherlv_5= '}' )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:160:2: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? otherlv_1= 'notification' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleFeature ) )* otherlv_5= '}'
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:160:2: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_DOC_COMMENT) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:161:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                    {
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:161:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:162:3: lv_comment_0_0= RULE_DOC_COMMENT
                    {
                    lv_comment_0_0=(Token)match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_ruleNotification289); 

                    			newLeafNode(lv_comment_0_0, grammarAccess.getNotificationAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNotificationRule());
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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleNotification307); 

                	newLeafNode(otherlv_1, grammarAccess.getNotificationAccess().getNotificationKeyword_1());
                
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:182:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:183:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:183:1: (lv_name_2_0= RULE_ID )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:184:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNotification324); 

            			newLeafNode(lv_name_2_0, grammarAccess.getNotificationAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNotificationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleNotification341); 

                	newLeafNode(otherlv_3, grammarAccess.getNotificationAccess().getLeftCurlyBracketKeyword_3());
                
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:204:1: ( (lv_features_4_0= ruleFeature ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_DOC_COMMENT && LA3_0<=RULE_ID)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:205:1: (lv_features_4_0= ruleFeature )
            	    {
            	    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:205:1: (lv_features_4_0= ruleFeature )
            	    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:206:3: lv_features_4_0= ruleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNotificationAccess().getFeaturesFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_ruleNotification362);
            	    lv_features_4_0=ruleFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNotificationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_4_0, 
            	            		"Feature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleNotification375); 

                	newLeafNode(otherlv_5, grammarAccess.getNotificationAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleNotification"


    // $ANTLR start "entryRuleFeature"
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:234:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:235:2: (iv_ruleFeature= ruleFeature EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:236:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature411);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature421); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:243:1: ruleFeature returns [EObject current=null] : ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_type_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:246:28: ( ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_type_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:247:1: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_type_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:247:1: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_type_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:247:2: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_type_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:247:2: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_DOC_COMMENT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:248:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                    {
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:248:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:249:3: lv_comment_0_0= RULE_DOC_COMMENT
                    {
                    lv_comment_0_0=(Token)match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_ruleFeature463); 

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

            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:265:3: ( (lv_type_1_0= ruleTypeRef ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:266:1: (lv_type_1_0= ruleTypeRef )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:266:1: (lv_type_1_0= ruleTypeRef )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:267:3: lv_type_1_0= ruleTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getFeatureAccess().getTypeTypeRefParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleFeature490);
            lv_type_1_0=ruleTypeRef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFeatureRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"TypeRef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:283:2: ( (lv_name_2_0= RULE_ID ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:284:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:284:1: (lv_name_2_0= RULE_ID )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:285:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature507); 

            			newLeafNode(lv_name_2_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleFeature524); 

                	newLeafNode(otherlv_3, grammarAccess.getFeatureAccess().getSemicolonKeyword_3());
                

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:315:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:316:2: (iv_rulePrimitive= rulePrimitive EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:317:2: iv_rulePrimitive= rulePrimitive EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive562);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;

             current =iv_rulePrimitive; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive572); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:324:1: rulePrimitive returns [EObject current=null] : (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:327:28: ( (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:328:1: (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:328:1: (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:328:3: otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_rulePrimitive609); 

                	newLeafNode(otherlv_0, grammarAccess.getPrimitiveAccess().getPrimitiveTypeKeyword_0());
                
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:332:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:333:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:333:1: (lv_name_1_0= RULE_ID )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:334:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimitive626); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:358:1: entryRuleAny returns [EObject current=null] : iv_ruleAny= ruleAny EOF ;
    public final EObject entryRuleAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAny = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:359:2: (iv_ruleAny= ruleAny EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:360:2: iv_ruleAny= ruleAny EOF
            {
             newCompositeNode(grammarAccess.getAnyRule()); 
            pushFollow(FOLLOW_ruleAny_in_entryRuleAny667);
            iv_ruleAny=ruleAny();

            state._fsp--;

             current =iv_ruleAny; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAny677); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:367:1: ruleAny returns [EObject current=null] : (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAny() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:370:28: ( (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:371:1: (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:371:1: (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:371:3: otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleAny714); 

                	newLeafNode(otherlv_0, grammarAccess.getAnyAccess().getAnyTypeKeyword_0());
                
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:375:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:376:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:376:1: (lv_name_1_0= RULE_ID )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:377:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAny731); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:401:1: entryRuleTypeRef returns [EObject current=null] : iv_ruleTypeRef= ruleTypeRef EOF ;
    public final EObject entryRuleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRef = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:402:2: (iv_ruleTypeRef= ruleTypeRef EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:403:2: iv_ruleTypeRef= ruleTypeRef EOF
            {
             newCompositeNode(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef772);
            iv_ruleTypeRef=ruleTypeRef();

            state._fsp--;

             current =iv_ruleTypeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef782); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:410:1: ruleTypeRef returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? ) ;
    public final EObject ruleTypeRef() throws RecognitionException {
        EObject current = null;

        Token lv_isMulti_1_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:413:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:414:1: ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:414:1: ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:414:2: ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )?
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:414:2: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:415:1: ( ruleQualifiedName )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:415:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:416:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeRefRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeRef830);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:429:2: ( (lv_isMulti_1_0= '[]' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:430:1: (lv_isMulti_1_0= '[]' )
                    {
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:430:1: (lv_isMulti_1_0= '[]' )
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:431:3: lv_isMulti_1_0= '[]'
                    {
                    lv_isMulti_1_0=(Token)match(input,20,FOLLOW_20_in_ruleTypeRef848); 

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


    // $ANTLR start "entryRuleStringValue"
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:454:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:455:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:456:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue900);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue910); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:463:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEStringObject ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:466:28: ( ( (lv_value_0_0= ruleEStringObject ) ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:467:1: ( (lv_value_0_0= ruleEStringObject ) )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:467:1: ( (lv_value_0_0= ruleEStringObject ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:468:1: (lv_value_0_0= ruleEStringObject )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:468:1: (lv_value_0_0= ruleEStringObject )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:469:3: lv_value_0_0= ruleEStringObject
            {
             
            	        newCompositeNode(grammarAccess.getStringValueAccess().getValueEStringObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEStringObject_in_ruleStringValue955);
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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:493:1: entryRuleEStringObject returns [String current=null] : iv_ruleEStringObject= ruleEStringObject EOF ;
    public final String entryRuleEStringObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringObject = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:494:2: (iv_ruleEStringObject= ruleEStringObject EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:495:2: iv_ruleEStringObject= ruleEStringObject EOF
            {
             newCompositeNode(grammarAccess.getEStringObjectRule()); 
            pushFollow(FOLLOW_ruleEStringObject_in_entryRuleEStringObject991);
            iv_ruleEStringObject=ruleEStringObject();

            state._fsp--;

             current =iv_ruleEStringObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEStringObject1002); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:502:1: ruleEStringObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEStringObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:505:28: (this_STRING_0= RULE_STRING )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:506:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEStringObject1041); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:521:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:522:2: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:523:2: iv_ruleIntegerValue= ruleIntegerValue EOF
            {
             newCompositeNode(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue1085);
            iv_ruleIntegerValue=ruleIntegerValue();

            state._fsp--;

             current =iv_ruleIntegerValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValue1095); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:530:1: ruleIntegerValue returns [EObject current=null] : ( (lv_value_0_0= ruleEIntegerObject ) ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:533:28: ( ( (lv_value_0_0= ruleEIntegerObject ) ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:534:1: ( (lv_value_0_0= ruleEIntegerObject ) )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:534:1: ( (lv_value_0_0= ruleEIntegerObject ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:535:1: (lv_value_0_0= ruleEIntegerObject )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:535:1: (lv_value_0_0= ruleEIntegerObject )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:536:3: lv_value_0_0= ruleEIntegerObject
            {
             
            	        newCompositeNode(grammarAccess.getIntegerValueAccess().getValueEIntegerObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEIntegerObject_in_ruleIntegerValue1140);
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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:560:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:561:2: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:562:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
            {
             newCompositeNode(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject1176);
            iv_ruleEIntegerObject=ruleEIntegerObject();

            state._fsp--;

             current =iv_ruleEIntegerObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEIntegerObject1187); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:569:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:572:28: (this_INT_0= RULE_INT )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:573:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEIntegerObject1226); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:588:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:589:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:590:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
             newCompositeNode(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue1270);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;

             current =iv_ruleFloatValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue1280); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:597:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= ruleEFloatObject ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:600:28: ( ( (lv_value_0_0= ruleEFloatObject ) ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:601:1: ( (lv_value_0_0= ruleEFloatObject ) )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:601:1: ( (lv_value_0_0= ruleEFloatObject ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:602:1: (lv_value_0_0= ruleEFloatObject )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:602:1: (lv_value_0_0= ruleEFloatObject )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:603:3: lv_value_0_0= ruleEFloatObject
            {
             
            	        newCompositeNode(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEFloatObject_in_ruleFloatValue1325);
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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:627:1: entryRuleEFloatObject returns [String current=null] : iv_ruleEFloatObject= ruleEFloatObject EOF ;
    public final String entryRuleEFloatObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloatObject = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:628:2: (iv_ruleEFloatObject= ruleEFloatObject EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:629:2: iv_ruleEFloatObject= ruleEFloatObject EOF
            {
             newCompositeNode(grammarAccess.getEFloatObjectRule()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject1361);
            iv_ruleEFloatObject=ruleEFloatObject();

            state._fsp--;

             current =iv_ruleEFloatObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEFloatObject1372); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:636:1: ruleEFloatObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEFloatObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:639:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:640:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:640:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:640:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:640:2: (kw= '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:641:2: kw= '-'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleEFloatObject1411); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:646:3: (this_INT_1= RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:646:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEFloatObject1429); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,22,FOLLOW_22_in_ruleEFloatObject1449); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEFloatObject1464); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:674:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:675:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:676:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1510);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1521); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:683:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:686:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:687:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:687:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:687:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1561); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:694:1: (kw= '.' this_ID_2= RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:695:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,22,FOLLOW_22_in_ruleQualifiedName1580); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1595); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop8;
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


 

    public static final BitSet FOLLOW_ruleNotificationModel_in_entryRuleNotificationModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotificationModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleNotificationModel122 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNotificationModel145 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleNotificationModel157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNotificationModel174 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_ruleNotification_in_ruleNotificationModel200 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_ruleNotification_in_entryRuleNotification237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotification247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_ruleNotification289 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNotification307 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNotification324 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleNotification341 = new BitSet(new long[]{0x0000000000010060L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleNotification362 = new BitSet(new long[]{0x0000000000010060L});
    public static final BitSet FOLLOW_16_in_ruleNotification375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_ruleFeature463 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleFeature490 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature507 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFeature524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulePrimitive609 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimitive626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAny_in_entryRuleAny667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAny677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleAny714 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAny731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeRef830 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleTypeRef848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_ruleStringValue955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_entryRuleEStringObject991 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEStringObject1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEStringObject1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue1085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_ruleIntegerValue1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject1176 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEIntegerObject1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEIntegerObject1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue1270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_ruleFloatValue1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject1361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEFloatObject1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleEFloatObject1411 = new BitSet(new long[]{0x0000000000400080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatObject1429 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleEFloatObject1449 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatObject1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1561 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleQualifiedName1580 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1595 = new BitSet(new long[]{0x0000000000400002L});

}