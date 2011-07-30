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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'notifications for module'", "'version'", "'notification'", "'{'", "'}'", "'indexed'", "'-['", "'='", "'<->'", "';'", "'[]'", "'-'", "'.'"
    };
    public static final int RULE_ID=5;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:76:1: ruleNotificationModel returns [EObject current=null] : (otherlv_0= 'notifications for module' ( ( ruleQualifiedName ) ) otherlv_2= 'version' ( (lv_version_3_0= RULE_STRING ) ) ( (lv_notifications_4_0= ruleNotification ) )+ ) ;
    public final EObject ruleNotificationModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_version_3_0=null;
        EObject lv_notifications_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:79:28: ( (otherlv_0= 'notifications for module' ( ( ruleQualifiedName ) ) otherlv_2= 'version' ( (lv_version_3_0= RULE_STRING ) ) ( (lv_notifications_4_0= ruleNotification ) )+ ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:80:1: (otherlv_0= 'notifications for module' ( ( ruleQualifiedName ) ) otherlv_2= 'version' ( (lv_version_3_0= RULE_STRING ) ) ( (lv_notifications_4_0= ruleNotification ) )+ )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:80:1: (otherlv_0= 'notifications for module' ( ( ruleQualifiedName ) ) otherlv_2= 'version' ( (lv_version_3_0= RULE_STRING ) ) ( (lv_notifications_4_0= ruleNotification ) )+ )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:80:3: otherlv_0= 'notifications for module' ( ( ruleQualifiedName ) ) otherlv_2= 'version' ( (lv_version_3_0= RULE_STRING ) ) ( (lv_notifications_4_0= ruleNotification ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleNotificationModel122); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleNotificationModel157); 

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

            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:121:2: ( (lv_notifications_4_0= ruleNotification ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
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
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:156:1: ruleNotification returns [EObject current=null] : (otherlv_0= 'notification' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' ) ;
    public final EObject ruleNotification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_features_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:159:28: ( (otherlv_0= 'notification' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:160:1: (otherlv_0= 'notification' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:160:1: (otherlv_0= 'notification' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:160:3: otherlv_0= 'notification' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleNotification284); 

                	newLeafNode(otherlv_0, grammarAccess.getNotificationAccess().getNotificationKeyword_0());
                
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:164:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:165:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:165:1: (lv_name_1_0= RULE_ID )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:166:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNotification301); 

            			newLeafNode(lv_name_1_0, grammarAccess.getNotificationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNotificationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleNotification318); 

                	newLeafNode(otherlv_2, grammarAccess.getNotificationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:186:1: ( (lv_features_3_0= ruleFeature ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||(LA2_0>=16 && LA2_0<=17)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:187:1: (lv_features_3_0= ruleFeature )
            	    {
            	    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:187:1: (lv_features_3_0= ruleFeature )
            	    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:188:3: lv_features_3_0= ruleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNotificationAccess().getFeaturesFeatureParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_ruleNotification339);
            	    lv_features_3_0=ruleFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNotificationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_3_0, 
            	            		"Feature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleNotification352); 

                	newLeafNode(otherlv_4, grammarAccess.getNotificationAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:216:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:217:2: (iv_ruleFeature= ruleFeature EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:218:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature388);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature398); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:225:1: ruleFeature returns [EObject current=null] : ( ( (lv_isIndexed_0_0= 'indexed' ) )? ( (lv_isContainment_1_0= '-[' ) )? ( (lv_type_2_0= ruleTypeRef ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleValueObject ) ) )? (otherlv_6= '<->' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= ';' )? ) ;
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
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:228:28: ( ( ( (lv_isIndexed_0_0= 'indexed' ) )? ( (lv_isContainment_1_0= '-[' ) )? ( (lv_type_2_0= ruleTypeRef ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleValueObject ) ) )? (otherlv_6= '<->' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= ';' )? ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:229:1: ( ( (lv_isIndexed_0_0= 'indexed' ) )? ( (lv_isContainment_1_0= '-[' ) )? ( (lv_type_2_0= ruleTypeRef ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleValueObject ) ) )? (otherlv_6= '<->' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= ';' )? )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:229:1: ( ( (lv_isIndexed_0_0= 'indexed' ) )? ( (lv_isContainment_1_0= '-[' ) )? ( (lv_type_2_0= ruleTypeRef ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleValueObject ) ) )? (otherlv_6= '<->' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= ';' )? )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:229:2: ( (lv_isIndexed_0_0= 'indexed' ) )? ( (lv_isContainment_1_0= '-[' ) )? ( (lv_type_2_0= ruleTypeRef ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleValueObject ) ) )? (otherlv_6= '<->' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= ';' )?
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:229:2: ( (lv_isIndexed_0_0= 'indexed' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:230:1: (lv_isIndexed_0_0= 'indexed' )
                    {
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:230:1: (lv_isIndexed_0_0= 'indexed' )
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:231:3: lv_isIndexed_0_0= 'indexed'
                    {
                    lv_isIndexed_0_0=(Token)match(input,16,FOLLOW_16_in_ruleFeature441); 

                            newLeafNode(lv_isIndexed_0_0, grammarAccess.getFeatureAccess().getIsIndexedIndexedKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "isIndexed", true, "indexed");
                    	    

                    }


                    }
                    break;

            }

            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:244:3: ( (lv_isContainment_1_0= '-[' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:245:1: (lv_isContainment_1_0= '-[' )
                    {
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:245:1: (lv_isContainment_1_0= '-[' )
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:246:3: lv_isContainment_1_0= '-['
                    {
                    lv_isContainment_1_0=(Token)match(input,17,FOLLOW_17_in_ruleFeature473); 

                            newLeafNode(lv_isContainment_1_0, grammarAccess.getFeatureAccess().getIsContainmentHyphenMinusLeftSquareBracketKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "isContainment", true, "-[");
                    	    

                    }


                    }
                    break;

            }

            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:259:3: ( (lv_type_2_0= ruleTypeRef ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:260:1: (lv_type_2_0= ruleTypeRef )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:260:1: (lv_type_2_0= ruleTypeRef )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:261:3: lv_type_2_0= ruleTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getFeatureAccess().getTypeTypeRefParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleFeature508);
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

            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:277:2: ( (lv_name_3_0= RULE_ID ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:278:1: (lv_name_3_0= RULE_ID )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:278:1: (lv_name_3_0= RULE_ID )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:279:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature525); 

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

            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:295:2: (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleValueObject ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:295:4: otherlv_4= '=' ( (lv_defaultValue_5_0= ruleValueObject ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleFeature543); 

                        	newLeafNode(otherlv_4, grammarAccess.getFeatureAccess().getEqualsSignKeyword_4_0());
                        
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:299:1: ( (lv_defaultValue_5_0= ruleValueObject ) )
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:300:1: (lv_defaultValue_5_0= ruleValueObject )
                    {
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:300:1: (lv_defaultValue_5_0= ruleValueObject )
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:301:3: lv_defaultValue_5_0= ruleValueObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureAccess().getDefaultValueValueObjectParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueObject_in_ruleFeature564);
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

            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:317:4: (otherlv_6= '<->' ( (otherlv_7= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:317:6: otherlv_6= '<->' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleFeature579); 

                        	newLeafNode(otherlv_6, grammarAccess.getFeatureAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5_0());
                        
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:321:1: ( (otherlv_7= RULE_ID ) )
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:322:1: (otherlv_7= RULE_ID )
                    {
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:322:1: (otherlv_7= RULE_ID )
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:323:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature599); 

                    		newLeafNode(otherlv_7, grammarAccess.getFeatureAccess().getInverseFeatureCrossReference_5_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:334:4: (otherlv_8= ';' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:334:6: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleFeature614); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:346:1: entryRuleTypeRef returns [EObject current=null] : iv_ruleTypeRef= ruleTypeRef EOF ;
    public final EObject entryRuleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRef = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:347:2: (iv_ruleTypeRef= ruleTypeRef EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:348:2: iv_ruleTypeRef= ruleTypeRef EOF
            {
             newCompositeNode(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef652);
            iv_ruleTypeRef=ruleTypeRef();

            state._fsp--;

             current =iv_ruleTypeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef662); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:355:1: ruleTypeRef returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? ) ;
    public final EObject ruleTypeRef() throws RecognitionException {
        EObject current = null;

        Token lv_isMulti_1_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:358:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:359:1: ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:359:1: ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:359:2: ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )?
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:359:2: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:360:1: ( ruleQualifiedName )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:360:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:361:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeRefRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeRef710);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:374:2: ( (lv_isMulti_1_0= '[]' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:375:1: (lv_isMulti_1_0= '[]' )
                    {
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:375:1: (lv_isMulti_1_0= '[]' )
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:376:3: lv_isMulti_1_0= '[]'
                    {
                    lv_isMulti_1_0=(Token)match(input,21,FOLLOW_21_in_ruleTypeRef728); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:397:1: entryRuleValueObject returns [EObject current=null] : iv_ruleValueObject= ruleValueObject EOF ;
    public final EObject entryRuleValueObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueObject = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:398:2: (iv_ruleValueObject= ruleValueObject EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:399:2: iv_ruleValueObject= ruleValueObject EOF
            {
             newCompositeNode(grammarAccess.getValueObjectRule()); 
            pushFollow(FOLLOW_ruleValueObject_in_entryRuleValueObject778);
            iv_ruleValueObject=ruleValueObject();

            state._fsp--;

             current =iv_ruleValueObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueObject788); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:406:1: ruleValueObject returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue | this_FloatValue_2= ruleFloatValue ) ;
    public final EObject ruleValueObject() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_IntegerValue_1 = null;

        EObject this_FloatValue_2 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:409:28: ( (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue | this_FloatValue_2= ruleFloatValue ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:410:1: (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue | this_FloatValue_2= ruleFloatValue )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:410:1: (this_StringValue_0= ruleStringValue | this_IntegerValue_1= ruleIntegerValue | this_FloatValue_2= ruleFloatValue )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt9=1;
                }
                break;
            case RULE_INT:
                {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==23) ) {
                    alt9=3;
                }
                else if ( (LA9_2==EOF||LA9_2==RULE_ID||(LA9_2>=15 && LA9_2<=17)||(LA9_2>=19 && LA9_2<=20)) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
                }
                break;
            case 22:
            case 23:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:411:5: this_StringValue_0= ruleStringValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueObjectAccess().getStringValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringValue_in_ruleValueObject835);
                    this_StringValue_0=ruleStringValue();

                    state._fsp--;

                     
                            current = this_StringValue_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:421:5: this_IntegerValue_1= ruleIntegerValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueObjectAccess().getIntegerValueParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIntegerValue_in_ruleValueObject862);
                    this_IntegerValue_1=ruleIntegerValue();

                    state._fsp--;

                     
                            current = this_IntegerValue_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:431:5: this_FloatValue_2= ruleFloatValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueObjectAccess().getFloatValueParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFloatValue_in_ruleValueObject889);
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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:447:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:448:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:449:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue924);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue934); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:456:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEStringObject ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:459:28: ( ( (lv_value_0_0= ruleEStringObject ) ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:460:1: ( (lv_value_0_0= ruleEStringObject ) )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:460:1: ( (lv_value_0_0= ruleEStringObject ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:461:1: (lv_value_0_0= ruleEStringObject )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:461:1: (lv_value_0_0= ruleEStringObject )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:462:3: lv_value_0_0= ruleEStringObject
            {
             
            	        newCompositeNode(grammarAccess.getStringValueAccess().getValueEStringObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEStringObject_in_ruleStringValue979);
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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:486:1: entryRuleEStringObject returns [String current=null] : iv_ruleEStringObject= ruleEStringObject EOF ;
    public final String entryRuleEStringObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringObject = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:487:2: (iv_ruleEStringObject= ruleEStringObject EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:488:2: iv_ruleEStringObject= ruleEStringObject EOF
            {
             newCompositeNode(grammarAccess.getEStringObjectRule()); 
            pushFollow(FOLLOW_ruleEStringObject_in_entryRuleEStringObject1015);
            iv_ruleEStringObject=ruleEStringObject();

            state._fsp--;

             current =iv_ruleEStringObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEStringObject1026); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:495:1: ruleEStringObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEStringObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:498:28: (this_STRING_0= RULE_STRING )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:499:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEStringObject1065); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:514:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:515:2: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:516:2: iv_ruleIntegerValue= ruleIntegerValue EOF
            {
             newCompositeNode(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue1109);
            iv_ruleIntegerValue=ruleIntegerValue();

            state._fsp--;

             current =iv_ruleIntegerValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValue1119); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:523:1: ruleIntegerValue returns [EObject current=null] : ( (lv_value_0_0= ruleEIntegerObject ) ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:526:28: ( ( (lv_value_0_0= ruleEIntegerObject ) ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:527:1: ( (lv_value_0_0= ruleEIntegerObject ) )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:527:1: ( (lv_value_0_0= ruleEIntegerObject ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:528:1: (lv_value_0_0= ruleEIntegerObject )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:528:1: (lv_value_0_0= ruleEIntegerObject )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:529:3: lv_value_0_0= ruleEIntegerObject
            {
             
            	        newCompositeNode(grammarAccess.getIntegerValueAccess().getValueEIntegerObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEIntegerObject_in_ruleIntegerValue1164);
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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:553:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:554:2: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:555:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
            {
             newCompositeNode(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject1200);
            iv_ruleEIntegerObject=ruleEIntegerObject();

            state._fsp--;

             current =iv_ruleEIntegerObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEIntegerObject1211); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:562:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:565:28: (this_INT_0= RULE_INT )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:566:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEIntegerObject1250); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:581:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:582:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:583:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
             newCompositeNode(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue1294);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;

             current =iv_ruleFloatValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue1304); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:590:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= ruleEFloatObject ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:593:28: ( ( (lv_value_0_0= ruleEFloatObject ) ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:594:1: ( (lv_value_0_0= ruleEFloatObject ) )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:594:1: ( (lv_value_0_0= ruleEFloatObject ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:595:1: (lv_value_0_0= ruleEFloatObject )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:595:1: (lv_value_0_0= ruleEFloatObject )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:596:3: lv_value_0_0= ruleEFloatObject
            {
             
            	        newCompositeNode(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEFloatObject_in_ruleFloatValue1349);
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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:620:1: entryRuleEFloatObject returns [String current=null] : iv_ruleEFloatObject= ruleEFloatObject EOF ;
    public final String entryRuleEFloatObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloatObject = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:621:2: (iv_ruleEFloatObject= ruleEFloatObject EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:622:2: iv_ruleEFloatObject= ruleEFloatObject EOF
            {
             newCompositeNode(grammarAccess.getEFloatObjectRule()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject1385);
            iv_ruleEFloatObject=ruleEFloatObject();

            state._fsp--;

             current =iv_ruleEFloatObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEFloatObject1396); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:629:1: ruleEFloatObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEFloatObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:632:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:633:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:633:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:633:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:633:2: (kw= '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:634:2: kw= '-'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleEFloatObject1435); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:639:3: (this_INT_1= RULE_INT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:639:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEFloatObject1453); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,23,FOLLOW_23_in_ruleEFloatObject1473); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEFloatObject1488); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:667:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:668:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:669:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1534);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1545); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:676:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:679:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:680:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:680:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:680:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1585); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:687:1: (kw= '.' this_ID_2= RULE_ID )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:688:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,23,FOLLOW_23_in_ruleQualifiedName1604); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1619); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop12;
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
    public static final BitSet FOLLOW_11_in_ruleNotificationModel122 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNotificationModel145 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleNotificationModel157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNotificationModel174 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleNotification_in_ruleNotificationModel200 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleNotification_in_entryRuleNotification237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotification247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleNotification284 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNotification301 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNotification318 = new BitSet(new long[]{0x0000000000038020L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleNotification339 = new BitSet(new long[]{0x0000000000038020L});
    public static final BitSet FOLLOW_15_in_ruleNotification352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleFeature441 = new BitSet(new long[]{0x0000000000030020L});
    public static final BitSet FOLLOW_17_in_ruleFeature473 = new BitSet(new long[]{0x0000000000030020L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleFeature508 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature525 = new BitSet(new long[]{0x00000000001C0002L});
    public static final BitSet FOLLOW_18_in_ruleFeature543 = new BitSet(new long[]{0x0000000000C00050L});
    public static final BitSet FOLLOW_ruleValueObject_in_ruleFeature564 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_19_in_ruleFeature579 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature599 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleFeature614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeRef710 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleTypeRef728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueObject_in_entryRuleValueObject778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueObject788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleValueObject835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_ruleValueObject862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_ruleValueObject889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue924 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_ruleStringValue979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_entryRuleEStringObject1015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEStringObject1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEStringObject1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue1109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_ruleIntegerValue1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject1200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEIntegerObject1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEIntegerObject1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue1294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_ruleFloatValue1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject1385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEFloatObject1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleEFloatObject1435 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatObject1453 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleEFloatObject1473 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatObject1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1585 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleQualifiedName1604 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1619 = new BitSet(new long[]{0x0000000000800002L});

}