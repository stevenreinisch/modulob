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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_DOC_COMMENT", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'current'", "'notifications for module'", "'version'", "'notification'", "'{'", "'}'", "';'", "'primitive type'", "'any type'", "'[]'", "'-'", "'.'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_DOC_COMMENT=5;
    public static final int T__23=23;
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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:76:1: ruleNotificationModel returns [EObject current=null] : ( ( (lv_current_0_0= 'current' ) )? otherlv_1= 'notifications for module' ( ( ruleQualifiedName ) ) otherlv_3= 'version' ( (lv_version_4_0= RULE_STRING ) ) ( (lv_notifications_5_0= ruleNotification ) )* ) ;
    public final EObject ruleNotificationModel() throws RecognitionException {
        EObject current = null;

        Token lv_current_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_version_4_0=null;
        EObject lv_notifications_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:79:28: ( ( ( (lv_current_0_0= 'current' ) )? otherlv_1= 'notifications for module' ( ( ruleQualifiedName ) ) otherlv_3= 'version' ( (lv_version_4_0= RULE_STRING ) ) ( (lv_notifications_5_0= ruleNotification ) )* ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:80:1: ( ( (lv_current_0_0= 'current' ) )? otherlv_1= 'notifications for module' ( ( ruleQualifiedName ) ) otherlv_3= 'version' ( (lv_version_4_0= RULE_STRING ) ) ( (lv_notifications_5_0= ruleNotification ) )* )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:80:1: ( ( (lv_current_0_0= 'current' ) )? otherlv_1= 'notifications for module' ( ( ruleQualifiedName ) ) otherlv_3= 'version' ( (lv_version_4_0= RULE_STRING ) ) ( (lv_notifications_5_0= ruleNotification ) )* )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:80:2: ( (lv_current_0_0= 'current' ) )? otherlv_1= 'notifications for module' ( ( ruleQualifiedName ) ) otherlv_3= 'version' ( (lv_version_4_0= RULE_STRING ) ) ( (lv_notifications_5_0= ruleNotification ) )*
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:80:2: ( (lv_current_0_0= 'current' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:81:1: (lv_current_0_0= 'current' )
                    {
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:81:1: (lv_current_0_0= 'current' )
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:82:3: lv_current_0_0= 'current'
                    {
                    lv_current_0_0=(Token)match(input,12,FOLLOW_12_in_ruleNotificationModel128); 

                            newLeafNode(lv_current_0_0, grammarAccess.getNotificationModelAccess().getCurrentCurrentKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNotificationModelRule());
                    	        }
                           		setWithLastConsumed(current, "current", true, "current");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleNotificationModel154); 

                	newLeafNode(otherlv_1, grammarAccess.getNotificationModelAccess().getNotificationsForModuleKeyword_1());
                
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:99:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:100:1: ( ruleQualifiedName )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:100:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:101:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNotificationModelRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getNotificationModelAccess().getModuleModuleCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNotificationModel177);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleNotificationModel189); 

                	newLeafNode(otherlv_3, grammarAccess.getNotificationModelAccess().getVersionKeyword_3());
                
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:118:1: ( (lv_version_4_0= RULE_STRING ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:119:1: (lv_version_4_0= RULE_STRING )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:119:1: (lv_version_4_0= RULE_STRING )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:120:3: lv_version_4_0= RULE_STRING
            {
            lv_version_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNotificationModel206); 

            			newLeafNode(lv_version_4_0, grammarAccess.getNotificationModelAccess().getVersionSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNotificationModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"version",
                    		lv_version_4_0, 
                    		"STRING");
            	    

            }


            }

            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:136:2: ( (lv_notifications_5_0= ruleNotification ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_DOC_COMMENT||LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:137:1: (lv_notifications_5_0= ruleNotification )
            	    {
            	    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:137:1: (lv_notifications_5_0= ruleNotification )
            	    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:138:3: lv_notifications_5_0= ruleNotification
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNotificationModelAccess().getNotificationsNotificationParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNotification_in_ruleNotificationModel232);
            	    lv_notifications_5_0=ruleNotification();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNotificationModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"notifications",
            	            		lv_notifications_5_0, 
            	            		"Notification");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:162:1: entryRuleNotification returns [EObject current=null] : iv_ruleNotification= ruleNotification EOF ;
    public final EObject entryRuleNotification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotification = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:163:2: (iv_ruleNotification= ruleNotification EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:164:2: iv_ruleNotification= ruleNotification EOF
            {
             newCompositeNode(grammarAccess.getNotificationRule()); 
            pushFollow(FOLLOW_ruleNotification_in_entryRuleNotification269);
            iv_ruleNotification=ruleNotification();

            state._fsp--;

             current =iv_ruleNotification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotification279); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:171:1: ruleNotification returns [EObject current=null] : ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? otherlv_1= 'notification' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleFeature ) )* otherlv_5= '}' ) ;
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
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:174:28: ( ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? otherlv_1= 'notification' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleFeature ) )* otherlv_5= '}' ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:175:1: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? otherlv_1= 'notification' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleFeature ) )* otherlv_5= '}' )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:175:1: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? otherlv_1= 'notification' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleFeature ) )* otherlv_5= '}' )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:175:2: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? otherlv_1= 'notification' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleFeature ) )* otherlv_5= '}'
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:175:2: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_DOC_COMMENT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:176:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                    {
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:176:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:177:3: lv_comment_0_0= RULE_DOC_COMMENT
                    {
                    lv_comment_0_0=(Token)match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_ruleNotification321); 

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

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleNotification339); 

                	newLeafNode(otherlv_1, grammarAccess.getNotificationAccess().getNotificationKeyword_1());
                
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:197:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:198:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:198:1: (lv_name_2_0= RULE_ID )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:199:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNotification356); 

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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleNotification373); 

                	newLeafNode(otherlv_3, grammarAccess.getNotificationAccess().getLeftCurlyBracketKeyword_3());
                
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:219:1: ( (lv_features_4_0= ruleFeature ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_DOC_COMMENT && LA4_0<=RULE_ID)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:220:1: (lv_features_4_0= ruleFeature )
            	    {
            	    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:220:1: (lv_features_4_0= ruleFeature )
            	    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:221:3: lv_features_4_0= ruleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNotificationAccess().getFeaturesFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_ruleNotification394);
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
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleNotification407); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:249:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:250:2: (iv_ruleFeature= ruleFeature EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:251:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature443);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature453); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:258:1: ruleFeature returns [EObject current=null] : ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_type_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:261:28: ( ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_type_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:262:1: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_type_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:262:1: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_type_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:262:2: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( (lv_type_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:262:2: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_DOC_COMMENT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:263:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                    {
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:263:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:264:3: lv_comment_0_0= RULE_DOC_COMMENT
                    {
                    lv_comment_0_0=(Token)match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_ruleFeature495); 

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

            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:280:3: ( (lv_type_1_0= ruleTypeRef ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:281:1: (lv_type_1_0= ruleTypeRef )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:281:1: (lv_type_1_0= ruleTypeRef )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:282:3: lv_type_1_0= ruleTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getFeatureAccess().getTypeTypeRefParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleFeature522);
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

            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:298:2: ( (lv_name_2_0= RULE_ID ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:299:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:299:1: (lv_name_2_0= RULE_ID )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:300:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature539); 

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

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleFeature556); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:330:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:331:2: (iv_rulePrimitive= rulePrimitive EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:332:2: iv_rulePrimitive= rulePrimitive EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive594);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;

             current =iv_rulePrimitive; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive604); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:339:1: rulePrimitive returns [EObject current=null] : (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:342:28: ( (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:343:1: (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:343:1: (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:343:3: otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_rulePrimitive641); 

                	newLeafNode(otherlv_0, grammarAccess.getPrimitiveAccess().getPrimitiveTypeKeyword_0());
                
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:347:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:348:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:348:1: (lv_name_1_0= RULE_ID )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:349:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimitive658); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:373:1: entryRuleAny returns [EObject current=null] : iv_ruleAny= ruleAny EOF ;
    public final EObject entryRuleAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAny = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:374:2: (iv_ruleAny= ruleAny EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:375:2: iv_ruleAny= ruleAny EOF
            {
             newCompositeNode(grammarAccess.getAnyRule()); 
            pushFollow(FOLLOW_ruleAny_in_entryRuleAny699);
            iv_ruleAny=ruleAny();

            state._fsp--;

             current =iv_ruleAny; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAny709); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:382:1: ruleAny returns [EObject current=null] : (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAny() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:385:28: ( (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:386:1: (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:386:1: (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:386:3: otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleAny746); 

                	newLeafNode(otherlv_0, grammarAccess.getAnyAccess().getAnyTypeKeyword_0());
                
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:390:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:391:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:391:1: (lv_name_1_0= RULE_ID )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:392:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAny763); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:416:1: entryRuleTypeRef returns [EObject current=null] : iv_ruleTypeRef= ruleTypeRef EOF ;
    public final EObject entryRuleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRef = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:417:2: (iv_ruleTypeRef= ruleTypeRef EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:418:2: iv_ruleTypeRef= ruleTypeRef EOF
            {
             newCompositeNode(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef804);
            iv_ruleTypeRef=ruleTypeRef();

            state._fsp--;

             current =iv_ruleTypeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef814); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:425:1: ruleTypeRef returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? ) ;
    public final EObject ruleTypeRef() throws RecognitionException {
        EObject current = null;

        Token lv_isMulti_1_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:428:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:429:1: ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:429:1: ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:429:2: ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )?
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:429:2: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:430:1: ( ruleQualifiedName )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:430:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:431:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeRefRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeRef862);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:444:2: ( (lv_isMulti_1_0= '[]' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:445:1: (lv_isMulti_1_0= '[]' )
                    {
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:445:1: (lv_isMulti_1_0= '[]' )
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:446:3: lv_isMulti_1_0= '[]'
                    {
                    lv_isMulti_1_0=(Token)match(input,21,FOLLOW_21_in_ruleTypeRef880); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:469:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:470:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:471:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue932);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue942); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:478:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEStringObject ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:481:28: ( ( (lv_value_0_0= ruleEStringObject ) ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:482:1: ( (lv_value_0_0= ruleEStringObject ) )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:482:1: ( (lv_value_0_0= ruleEStringObject ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:483:1: (lv_value_0_0= ruleEStringObject )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:483:1: (lv_value_0_0= ruleEStringObject )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:484:3: lv_value_0_0= ruleEStringObject
            {
             
            	        newCompositeNode(grammarAccess.getStringValueAccess().getValueEStringObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEStringObject_in_ruleStringValue987);
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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:508:1: entryRuleEStringObject returns [String current=null] : iv_ruleEStringObject= ruleEStringObject EOF ;
    public final String entryRuleEStringObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringObject = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:509:2: (iv_ruleEStringObject= ruleEStringObject EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:510:2: iv_ruleEStringObject= ruleEStringObject EOF
            {
             newCompositeNode(grammarAccess.getEStringObjectRule()); 
            pushFollow(FOLLOW_ruleEStringObject_in_entryRuleEStringObject1023);
            iv_ruleEStringObject=ruleEStringObject();

            state._fsp--;

             current =iv_ruleEStringObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEStringObject1034); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:517:1: ruleEStringObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEStringObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:520:28: (this_STRING_0= RULE_STRING )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:521:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEStringObject1073); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:536:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:537:2: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:538:2: iv_ruleIntegerValue= ruleIntegerValue EOF
            {
             newCompositeNode(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue1117);
            iv_ruleIntegerValue=ruleIntegerValue();

            state._fsp--;

             current =iv_ruleIntegerValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValue1127); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:545:1: ruleIntegerValue returns [EObject current=null] : ( (lv_value_0_0= ruleEIntegerObject ) ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:548:28: ( ( (lv_value_0_0= ruleEIntegerObject ) ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:549:1: ( (lv_value_0_0= ruleEIntegerObject ) )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:549:1: ( (lv_value_0_0= ruleEIntegerObject ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:550:1: (lv_value_0_0= ruleEIntegerObject )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:550:1: (lv_value_0_0= ruleEIntegerObject )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:551:3: lv_value_0_0= ruleEIntegerObject
            {
             
            	        newCompositeNode(grammarAccess.getIntegerValueAccess().getValueEIntegerObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEIntegerObject_in_ruleIntegerValue1172);
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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:575:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:576:2: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:577:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
            {
             newCompositeNode(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject1208);
            iv_ruleEIntegerObject=ruleEIntegerObject();

            state._fsp--;

             current =iv_ruleEIntegerObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEIntegerObject1219); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:584:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:587:28: (this_INT_0= RULE_INT )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:588:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEIntegerObject1258); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:603:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:604:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:605:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
             newCompositeNode(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue1302);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;

             current =iv_ruleFloatValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue1312); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:612:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= ruleEFloatObject ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:615:28: ( ( (lv_value_0_0= ruleEFloatObject ) ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:616:1: ( (lv_value_0_0= ruleEFloatObject ) )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:616:1: ( (lv_value_0_0= ruleEFloatObject ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:617:1: (lv_value_0_0= ruleEFloatObject )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:617:1: (lv_value_0_0= ruleEFloatObject )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:618:3: lv_value_0_0= ruleEFloatObject
            {
             
            	        newCompositeNode(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEFloatObject_in_ruleFloatValue1357);
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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:642:1: entryRuleEFloatObject returns [String current=null] : iv_ruleEFloatObject= ruleEFloatObject EOF ;
    public final String entryRuleEFloatObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloatObject = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:643:2: (iv_ruleEFloatObject= ruleEFloatObject EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:644:2: iv_ruleEFloatObject= ruleEFloatObject EOF
            {
             newCompositeNode(grammarAccess.getEFloatObjectRule()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject1393);
            iv_ruleEFloatObject=ruleEFloatObject();

            state._fsp--;

             current =iv_ruleEFloatObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEFloatObject1404); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:651:1: ruleEFloatObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEFloatObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:654:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:655:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:655:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:655:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:655:2: (kw= '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:656:2: kw= '-'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleEFloatObject1443); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:661:3: (this_INT_1= RULE_INT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:661:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEFloatObject1461); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,23,FOLLOW_23_in_ruleEFloatObject1481); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEFloatObject1496); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:689:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:690:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:691:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1542);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1553); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:698:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:701:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:702:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:702:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:702:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1593); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:709:1: (kw= '.' this_ID_2= RULE_ID )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:710:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,23,FOLLOW_23_in_ruleQualifiedName1612); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1627); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop9;
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
    public static final BitSet FOLLOW_12_in_ruleNotificationModel128 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleNotificationModel154 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNotificationModel177 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNotificationModel189 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNotificationModel206 = new BitSet(new long[]{0x0000000000008022L});
    public static final BitSet FOLLOW_ruleNotification_in_ruleNotificationModel232 = new BitSet(new long[]{0x0000000000008022L});
    public static final BitSet FOLLOW_ruleNotification_in_entryRuleNotification269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotification279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_ruleNotification321 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleNotification339 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNotification356 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleNotification373 = new BitSet(new long[]{0x0000000000020060L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleNotification394 = new BitSet(new long[]{0x0000000000020060L});
    public static final BitSet FOLLOW_17_in_ruleNotification407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_ruleFeature495 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleFeature522 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature539 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFeature556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive594 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePrimitive641 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimitive658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAny_in_entryRuleAny699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAny709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleAny746 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAny763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeRef862 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleTypeRef880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_ruleStringValue987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_entryRuleEStringObject1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEStringObject1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEStringObject1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue1117 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_ruleIntegerValue1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject1208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEIntegerObject1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEIntegerObject1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue1302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_ruleFloatValue1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject1393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEFloatObject1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleEFloatObject1443 = new BitSet(new long[]{0x0000000000800080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatObject1461 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleEFloatObject1481 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatObject1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1593 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleQualifiedName1612 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1627 = new BitSet(new long[]{0x0000000000800002L});

}