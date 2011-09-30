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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'notifications for module'", "'version'", "'notification'", "'{'", "'}'", "';'", "'primitive type'", "'any type'", "'[]'", "'-'", "'.'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
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

            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:121:2: ( (lv_notifications_4_0= ruleNotification ) )*
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

                if ( (LA2_0==RULE_ID) ) {
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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:225:1: ruleFeature returns [EObject current=null] : ( ( (lv_type_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:228:28: ( ( ( (lv_type_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' )? ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:229:1: ( ( (lv_type_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' )? )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:229:1: ( ( (lv_type_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' )? )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:229:2: ( (lv_type_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' )?
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:229:2: ( (lv_type_0_0= ruleTypeRef ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:230:1: (lv_type_0_0= ruleTypeRef )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:230:1: (lv_type_0_0= ruleTypeRef )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:231:3: lv_type_0_0= ruleTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getFeatureAccess().getTypeTypeRefParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleFeature444);
            lv_type_0_0=ruleTypeRef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFeatureRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"TypeRef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:247:2: ( (lv_name_1_0= RULE_ID ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:248:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:248:1: (lv_name_1_0= RULE_ID )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:249:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature461); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:265:2: (otherlv_2= ';' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:265:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleFeature479); 

                        	newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getSemicolonKeyword_2());
                        

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:279:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:280:2: (iv_rulePrimitive= rulePrimitive EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:281:2: iv_rulePrimitive= rulePrimitive EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive519);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;

             current =iv_rulePrimitive; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive529); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:288:1: rulePrimitive returns [EObject current=null] : (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:291:28: ( (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:292:1: (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:292:1: (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:292:3: otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_rulePrimitive566); 

                	newLeafNode(otherlv_0, grammarAccess.getPrimitiveAccess().getPrimitiveTypeKeyword_0());
                
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:296:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:297:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:297:1: (lv_name_1_0= RULE_ID )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:298:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimitive583); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:322:1: entryRuleAny returns [EObject current=null] : iv_ruleAny= ruleAny EOF ;
    public final EObject entryRuleAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAny = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:323:2: (iv_ruleAny= ruleAny EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:324:2: iv_ruleAny= ruleAny EOF
            {
             newCompositeNode(grammarAccess.getAnyRule()); 
            pushFollow(FOLLOW_ruleAny_in_entryRuleAny624);
            iv_ruleAny=ruleAny();

            state._fsp--;

             current =iv_ruleAny; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAny634); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:331:1: ruleAny returns [EObject current=null] : (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAny() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:334:28: ( (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:335:1: (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:335:1: (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:335:3: otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleAny671); 

                	newLeafNode(otherlv_0, grammarAccess.getAnyAccess().getAnyTypeKeyword_0());
                
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:339:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:340:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:340:1: (lv_name_1_0= RULE_ID )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:341:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAny688); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:365:1: entryRuleTypeRef returns [EObject current=null] : iv_ruleTypeRef= ruleTypeRef EOF ;
    public final EObject entryRuleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRef = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:366:2: (iv_ruleTypeRef= ruleTypeRef EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:367:2: iv_ruleTypeRef= ruleTypeRef EOF
            {
             newCompositeNode(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef729);
            iv_ruleTypeRef=ruleTypeRef();

            state._fsp--;

             current =iv_ruleTypeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef739); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:374:1: ruleTypeRef returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? ) ;
    public final EObject ruleTypeRef() throws RecognitionException {
        EObject current = null;

        Token lv_isMulti_1_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:377:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:378:1: ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:378:1: ( ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )? )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:378:2: ( ( ruleQualifiedName ) ) ( (lv_isMulti_1_0= '[]' ) )?
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:378:2: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:379:1: ( ruleQualifiedName )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:379:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:380:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeRefRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeRef787);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:393:2: ( (lv_isMulti_1_0= '[]' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:394:1: (lv_isMulti_1_0= '[]' )
                    {
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:394:1: (lv_isMulti_1_0= '[]' )
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:395:3: lv_isMulti_1_0= '[]'
                    {
                    lv_isMulti_1_0=(Token)match(input,19,FOLLOW_19_in_ruleTypeRef805); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:418:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:419:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:420:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue857);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue867); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:427:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEStringObject ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:430:28: ( ( (lv_value_0_0= ruleEStringObject ) ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:431:1: ( (lv_value_0_0= ruleEStringObject ) )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:431:1: ( (lv_value_0_0= ruleEStringObject ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:432:1: (lv_value_0_0= ruleEStringObject )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:432:1: (lv_value_0_0= ruleEStringObject )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:433:3: lv_value_0_0= ruleEStringObject
            {
             
            	        newCompositeNode(grammarAccess.getStringValueAccess().getValueEStringObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEStringObject_in_ruleStringValue912);
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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:457:1: entryRuleEStringObject returns [String current=null] : iv_ruleEStringObject= ruleEStringObject EOF ;
    public final String entryRuleEStringObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringObject = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:458:2: (iv_ruleEStringObject= ruleEStringObject EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:459:2: iv_ruleEStringObject= ruleEStringObject EOF
            {
             newCompositeNode(grammarAccess.getEStringObjectRule()); 
            pushFollow(FOLLOW_ruleEStringObject_in_entryRuleEStringObject948);
            iv_ruleEStringObject=ruleEStringObject();

            state._fsp--;

             current =iv_ruleEStringObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEStringObject959); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:466:1: ruleEStringObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEStringObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:469:28: (this_STRING_0= RULE_STRING )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:470:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEStringObject998); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:485:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:486:2: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:487:2: iv_ruleIntegerValue= ruleIntegerValue EOF
            {
             newCompositeNode(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue1042);
            iv_ruleIntegerValue=ruleIntegerValue();

            state._fsp--;

             current =iv_ruleIntegerValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValue1052); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:494:1: ruleIntegerValue returns [EObject current=null] : ( (lv_value_0_0= ruleEIntegerObject ) ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:497:28: ( ( (lv_value_0_0= ruleEIntegerObject ) ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:498:1: ( (lv_value_0_0= ruleEIntegerObject ) )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:498:1: ( (lv_value_0_0= ruleEIntegerObject ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:499:1: (lv_value_0_0= ruleEIntegerObject )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:499:1: (lv_value_0_0= ruleEIntegerObject )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:500:3: lv_value_0_0= ruleEIntegerObject
            {
             
            	        newCompositeNode(grammarAccess.getIntegerValueAccess().getValueEIntegerObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEIntegerObject_in_ruleIntegerValue1097);
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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:524:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:525:2: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:526:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
            {
             newCompositeNode(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject1133);
            iv_ruleEIntegerObject=ruleEIntegerObject();

            state._fsp--;

             current =iv_ruleEIntegerObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEIntegerObject1144); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:533:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:536:28: (this_INT_0= RULE_INT )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:537:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEIntegerObject1183); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:552:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:553:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:554:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
             newCompositeNode(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue1227);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;

             current =iv_ruleFloatValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue1237); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:561:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= ruleEFloatObject ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:564:28: ( ( (lv_value_0_0= ruleEFloatObject ) ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:565:1: ( (lv_value_0_0= ruleEFloatObject ) )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:565:1: ( (lv_value_0_0= ruleEFloatObject ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:566:1: (lv_value_0_0= ruleEFloatObject )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:566:1: (lv_value_0_0= ruleEFloatObject )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:567:3: lv_value_0_0= ruleEFloatObject
            {
             
            	        newCompositeNode(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEFloatObject_in_ruleFloatValue1282);
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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:591:1: entryRuleEFloatObject returns [String current=null] : iv_ruleEFloatObject= ruleEFloatObject EOF ;
    public final String entryRuleEFloatObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloatObject = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:592:2: (iv_ruleEFloatObject= ruleEFloatObject EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:593:2: iv_ruleEFloatObject= ruleEFloatObject EOF
            {
             newCompositeNode(grammarAccess.getEFloatObjectRule()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject1318);
            iv_ruleEFloatObject=ruleEFloatObject();

            state._fsp--;

             current =iv_ruleEFloatObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEFloatObject1329); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:600:1: ruleEFloatObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEFloatObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:603:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:604:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:604:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:604:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:604:2: (kw= '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:605:2: kw= '-'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleEFloatObject1368); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:610:3: (this_INT_1= RULE_INT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:610:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEFloatObject1386); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,21,FOLLOW_21_in_ruleEFloatObject1406); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEFloatObject1421); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:638:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:639:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:640:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1467);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1478); 

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
    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:647:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:650:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:651:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:651:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:651:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1518); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:658:1: (kw= '.' this_ID_2= RULE_ID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.dubmas.modulob.notificationdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalNotificationDsl.g:659:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,21,FOLLOW_21_in_ruleQualifiedName1537); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1552); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop7;
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
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNotificationModel174 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleNotification_in_ruleNotificationModel200 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleNotification_in_entryRuleNotification237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotification247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleNotification284 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNotification301 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNotification318 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleNotification339 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_15_in_ruleNotification352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleFeature444 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature461 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleFeature479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulePrimitive566 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimitive583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAny_in_entryRuleAny624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAny634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleAny671 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAny688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeRef787 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleTypeRef805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_ruleStringValue912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_entryRuleEStringObject948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEStringObject959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEStringObject998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue1042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_ruleIntegerValue1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject1133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEIntegerObject1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEIntegerObject1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue1227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_ruleFloatValue1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject1318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEFloatObject1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleEFloatObject1368 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatObject1386 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleEFloatObject1406 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatObject1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1518 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleQualifiedName1537 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1552 = new BitSet(new long[]{0x0000000000200002L});

}