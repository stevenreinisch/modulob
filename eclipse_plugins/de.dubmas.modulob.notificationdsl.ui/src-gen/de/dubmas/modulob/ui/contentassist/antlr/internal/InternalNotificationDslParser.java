package de.dubmas.modulob.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.dubmas.modulob.services.NotificationDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNotificationDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'notifications for module'", "'version'", "'notification'", "'{'", "'}'", "';'", "'='", "'<->'", "'-'", "'.'", "'indexed'", "'-['", "'[]'"
    };
    public static final int RULE_ID=6;
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
    public static final int RULE_INT=5;
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
    public String getGrammarFileName() { return "../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g"; }


     
     	private NotificationDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(NotificationDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleNotificationModel"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:61:1: entryRuleNotificationModel : ruleNotificationModel EOF ;
    public final void entryRuleNotificationModel() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:62:1: ( ruleNotificationModel EOF )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:63:1: ruleNotificationModel EOF
            {
             before(grammarAccess.getNotificationModelRule()); 
            pushFollow(FOLLOW_ruleNotificationModel_in_entryRuleNotificationModel61);
            ruleNotificationModel();

            state._fsp--;

             after(grammarAccess.getNotificationModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotificationModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNotificationModel"


    // $ANTLR start "ruleNotificationModel"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:70:1: ruleNotificationModel : ( ( rule__NotificationModel__Group__0 ) ) ;
    public final void ruleNotificationModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:74:2: ( ( ( rule__NotificationModel__Group__0 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:75:1: ( ( rule__NotificationModel__Group__0 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:75:1: ( ( rule__NotificationModel__Group__0 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:76:1: ( rule__NotificationModel__Group__0 )
            {
             before(grammarAccess.getNotificationModelAccess().getGroup()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:77:1: ( rule__NotificationModel__Group__0 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:77:2: rule__NotificationModel__Group__0
            {
            pushFollow(FOLLOW_rule__NotificationModel__Group__0_in_ruleNotificationModel94);
            rule__NotificationModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNotificationModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNotificationModel"


    // $ANTLR start "entryRuleNotification"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:89:1: entryRuleNotification : ruleNotification EOF ;
    public final void entryRuleNotification() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:90:1: ( ruleNotification EOF )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:91:1: ruleNotification EOF
            {
             before(grammarAccess.getNotificationRule()); 
            pushFollow(FOLLOW_ruleNotification_in_entryRuleNotification121);
            ruleNotification();

            state._fsp--;

             after(grammarAccess.getNotificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotification128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNotification"


    // $ANTLR start "ruleNotification"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:98:1: ruleNotification : ( ( rule__Notification__Group__0 ) ) ;
    public final void ruleNotification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:102:2: ( ( ( rule__Notification__Group__0 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:103:1: ( ( rule__Notification__Group__0 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:103:1: ( ( rule__Notification__Group__0 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:104:1: ( rule__Notification__Group__0 )
            {
             before(grammarAccess.getNotificationAccess().getGroup()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:105:1: ( rule__Notification__Group__0 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:105:2: rule__Notification__Group__0
            {
            pushFollow(FOLLOW_rule__Notification__Group__0_in_ruleNotification154);
            rule__Notification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNotificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNotification"


    // $ANTLR start "entryRuleFeature"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:117:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:118:1: ( ruleFeature EOF )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:119:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature181);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:126:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:130:2: ( ( ( rule__Feature__Group__0 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:131:1: ( ( rule__Feature__Group__0 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:131:1: ( ( rule__Feature__Group__0 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:132:1: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:133:1: ( rule__Feature__Group__0 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:133:2: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_rule__Feature__Group__0_in_ruleFeature214);
            rule__Feature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleTypeRef"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:145:1: entryRuleTypeRef : ruleTypeRef EOF ;
    public final void entryRuleTypeRef() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:146:1: ( ruleTypeRef EOF )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:147:1: ruleTypeRef EOF
            {
             before(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef241);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getTypeRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeRef"


    // $ANTLR start "ruleTypeRef"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:154:1: ruleTypeRef : ( ( rule__TypeRef__Group__0 ) ) ;
    public final void ruleTypeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:158:2: ( ( ( rule__TypeRef__Group__0 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:159:1: ( ( rule__TypeRef__Group__0 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:159:1: ( ( rule__TypeRef__Group__0 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:160:1: ( rule__TypeRef__Group__0 )
            {
             before(grammarAccess.getTypeRefAccess().getGroup()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:161:1: ( rule__TypeRef__Group__0 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:161:2: rule__TypeRef__Group__0
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef274);
            rule__TypeRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeRef"


    // $ANTLR start "entryRuleValueObject"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:173:1: entryRuleValueObject : ruleValueObject EOF ;
    public final void entryRuleValueObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:174:1: ( ruleValueObject EOF )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:175:1: ruleValueObject EOF
            {
             before(grammarAccess.getValueObjectRule()); 
            pushFollow(FOLLOW_ruleValueObject_in_entryRuleValueObject301);
            ruleValueObject();

            state._fsp--;

             after(grammarAccess.getValueObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueObject308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValueObject"


    // $ANTLR start "ruleValueObject"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:182:1: ruleValueObject : ( ( rule__ValueObject__Alternatives ) ) ;
    public final void ruleValueObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:186:2: ( ( ( rule__ValueObject__Alternatives ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:187:1: ( ( rule__ValueObject__Alternatives ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:187:1: ( ( rule__ValueObject__Alternatives ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:188:1: ( rule__ValueObject__Alternatives )
            {
             before(grammarAccess.getValueObjectAccess().getAlternatives()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:189:1: ( rule__ValueObject__Alternatives )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:189:2: rule__ValueObject__Alternatives
            {
            pushFollow(FOLLOW_rule__ValueObject__Alternatives_in_ruleValueObject334);
            rule__ValueObject__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueObjectAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValueObject"


    // $ANTLR start "entryRuleStringValue"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:201:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:202:1: ( ruleStringValue EOF )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:203:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue361);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:210:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:214:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:215:1: ( ( rule__StringValue__ValueAssignment ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:215:1: ( ( rule__StringValue__ValueAssignment ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:216:1: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:217:1: ( rule__StringValue__ValueAssignment )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:217:2: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue394);
            rule__StringValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleEStringObject"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:229:1: entryRuleEStringObject : ruleEStringObject EOF ;
    public final void entryRuleEStringObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:230:1: ( ruleEStringObject EOF )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:231:1: ruleEStringObject EOF
            {
             before(grammarAccess.getEStringObjectRule()); 
            pushFollow(FOLLOW_ruleEStringObject_in_entryRuleEStringObject421);
            ruleEStringObject();

            state._fsp--;

             after(grammarAccess.getEStringObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEStringObject428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEStringObject"


    // $ANTLR start "ruleEStringObject"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:238:1: ruleEStringObject : ( RULE_STRING ) ;
    public final void ruleEStringObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:242:2: ( ( RULE_STRING ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:243:1: ( RULE_STRING )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:243:1: ( RULE_STRING )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:244:1: RULE_STRING
            {
             before(grammarAccess.getEStringObjectAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEStringObject454); 
             after(grammarAccess.getEStringObjectAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEStringObject"


    // $ANTLR start "entryRuleIntegerValue"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:257:1: entryRuleIntegerValue : ruleIntegerValue EOF ;
    public final void entryRuleIntegerValue() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:258:1: ( ruleIntegerValue EOF )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:259:1: ruleIntegerValue EOF
            {
             before(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue480);
            ruleIntegerValue();

            state._fsp--;

             after(grammarAccess.getIntegerValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValue487); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerValue"


    // $ANTLR start "ruleIntegerValue"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:266:1: ruleIntegerValue : ( ( rule__IntegerValue__ValueAssignment ) ) ;
    public final void ruleIntegerValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:270:2: ( ( ( rule__IntegerValue__ValueAssignment ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:271:1: ( ( rule__IntegerValue__ValueAssignment ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:271:1: ( ( rule__IntegerValue__ValueAssignment ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:272:1: ( rule__IntegerValue__ValueAssignment )
            {
             before(grammarAccess.getIntegerValueAccess().getValueAssignment()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:273:1: ( rule__IntegerValue__ValueAssignment )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:273:2: rule__IntegerValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntegerValue__ValueAssignment_in_ruleIntegerValue513);
            rule__IntegerValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntegerValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerValue"


    // $ANTLR start "entryRuleEIntegerObject"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:285:1: entryRuleEIntegerObject : ruleEIntegerObject EOF ;
    public final void entryRuleEIntegerObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:286:1: ( ruleEIntegerObject EOF )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:287:1: ruleEIntegerObject EOF
            {
             before(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject540);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getEIntegerObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEIntegerObject547); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEIntegerObject"


    // $ANTLR start "ruleEIntegerObject"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:294:1: ruleEIntegerObject : ( RULE_INT ) ;
    public final void ruleEIntegerObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:298:2: ( ( RULE_INT ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:299:1: ( RULE_INT )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:299:1: ( RULE_INT )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:300:1: RULE_INT
            {
             before(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEIntegerObject573); 
             after(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEIntegerObject"


    // $ANTLR start "entryRuleFloatValue"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:313:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:314:1: ( ruleFloatValue EOF )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:315:1: ruleFloatValue EOF
            {
             before(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue599);
            ruleFloatValue();

            state._fsp--;

             after(grammarAccess.getFloatValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue606); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFloatValue"


    // $ANTLR start "ruleFloatValue"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:322:1: ruleFloatValue : ( ( rule__FloatValue__ValueAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:326:2: ( ( ( rule__FloatValue__ValueAssignment ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:327:1: ( ( rule__FloatValue__ValueAssignment ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:327:1: ( ( rule__FloatValue__ValueAssignment ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:328:1: ( rule__FloatValue__ValueAssignment )
            {
             before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:329:1: ( rule__FloatValue__ValueAssignment )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:329:2: rule__FloatValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue632);
            rule__FloatValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFloatValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloatValue"


    // $ANTLR start "entryRuleEFloatObject"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:341:1: entryRuleEFloatObject : ruleEFloatObject EOF ;
    public final void entryRuleEFloatObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:342:1: ( ruleEFloatObject EOF )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:343:1: ruleEFloatObject EOF
            {
             before(grammarAccess.getEFloatObjectRule()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject659);
            ruleEFloatObject();

            state._fsp--;

             after(grammarAccess.getEFloatObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEFloatObject666); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEFloatObject"


    // $ANTLR start "ruleEFloatObject"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:350:1: ruleEFloatObject : ( ( rule__EFloatObject__Group__0 ) ) ;
    public final void ruleEFloatObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:354:2: ( ( ( rule__EFloatObject__Group__0 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:355:1: ( ( rule__EFloatObject__Group__0 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:355:1: ( ( rule__EFloatObject__Group__0 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:356:1: ( rule__EFloatObject__Group__0 )
            {
             before(grammarAccess.getEFloatObjectAccess().getGroup()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:357:1: ( rule__EFloatObject__Group__0 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:357:2: rule__EFloatObject__Group__0
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__0_in_ruleEFloatObject692);
            rule__EFloatObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEFloatObject"


    // $ANTLR start "entryRuleQualifiedName"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:369:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:370:1: ( ruleQualifiedName EOF )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:371:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName719);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName726); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:378:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:382:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:383:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:383:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:384:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:385:1: ( rule__QualifiedName__Group__0 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:385:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName752);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "rule__ValueObject__Alternatives"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:397:1: rule__ValueObject__Alternatives : ( ( ruleStringValue ) | ( ruleIntegerValue ) | ( ruleFloatValue ) );
    public final void rule__ValueObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:401:1: ( ( ruleStringValue ) | ( ruleIntegerValue ) | ( ruleFloatValue ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt1=1;
                }
                break;
            case RULE_INT:
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==EOF||LA1_2==RULE_ID||(LA1_2>=15 && LA1_2<=16)||LA1_2==18||(LA1_2>=21 && LA1_2<=22)) ) {
                    alt1=2;
                }
                else if ( (LA1_2==20) ) {
                    alt1=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case 19:
            case 20:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:402:1: ( ruleStringValue )
                    {
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:402:1: ( ruleStringValue )
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:403:1: ruleStringValue
                    {
                     before(grammarAccess.getValueObjectAccess().getStringValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringValue_in_rule__ValueObject__Alternatives788);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getValueObjectAccess().getStringValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:408:6: ( ruleIntegerValue )
                    {
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:408:6: ( ruleIntegerValue )
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:409:1: ruleIntegerValue
                    {
                     before(grammarAccess.getValueObjectAccess().getIntegerValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntegerValue_in_rule__ValueObject__Alternatives805);
                    ruleIntegerValue();

                    state._fsp--;

                     after(grammarAccess.getValueObjectAccess().getIntegerValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:414:6: ( ruleFloatValue )
                    {
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:414:6: ( ruleFloatValue )
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:415:1: ruleFloatValue
                    {
                     before(grammarAccess.getValueObjectAccess().getFloatValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleFloatValue_in_rule__ValueObject__Alternatives822);
                    ruleFloatValue();

                    state._fsp--;

                     after(grammarAccess.getValueObjectAccess().getFloatValueParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueObject__Alternatives"


    // $ANTLR start "rule__NotificationModel__Group__0"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:427:1: rule__NotificationModel__Group__0 : rule__NotificationModel__Group__0__Impl rule__NotificationModel__Group__1 ;
    public final void rule__NotificationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:431:1: ( rule__NotificationModel__Group__0__Impl rule__NotificationModel__Group__1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:432:2: rule__NotificationModel__Group__0__Impl rule__NotificationModel__Group__1
            {
            pushFollow(FOLLOW_rule__NotificationModel__Group__0__Impl_in_rule__NotificationModel__Group__0852);
            rule__NotificationModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NotificationModel__Group__1_in_rule__NotificationModel__Group__0855);
            rule__NotificationModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotificationModel__Group__0"


    // $ANTLR start "rule__NotificationModel__Group__0__Impl"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:439:1: rule__NotificationModel__Group__0__Impl : ( 'notifications for module' ) ;
    public final void rule__NotificationModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:443:1: ( ( 'notifications for module' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:444:1: ( 'notifications for module' )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:444:1: ( 'notifications for module' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:445:1: 'notifications for module'
            {
             before(grammarAccess.getNotificationModelAccess().getNotificationsForModuleKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__NotificationModel__Group__0__Impl883); 
             after(grammarAccess.getNotificationModelAccess().getNotificationsForModuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotificationModel__Group__0__Impl"


    // $ANTLR start "rule__NotificationModel__Group__1"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:458:1: rule__NotificationModel__Group__1 : rule__NotificationModel__Group__1__Impl rule__NotificationModel__Group__2 ;
    public final void rule__NotificationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:462:1: ( rule__NotificationModel__Group__1__Impl rule__NotificationModel__Group__2 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:463:2: rule__NotificationModel__Group__1__Impl rule__NotificationModel__Group__2
            {
            pushFollow(FOLLOW_rule__NotificationModel__Group__1__Impl_in_rule__NotificationModel__Group__1914);
            rule__NotificationModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NotificationModel__Group__2_in_rule__NotificationModel__Group__1917);
            rule__NotificationModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotificationModel__Group__1"


    // $ANTLR start "rule__NotificationModel__Group__1__Impl"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:470:1: rule__NotificationModel__Group__1__Impl : ( ( rule__NotificationModel__ModuleAssignment_1 ) ) ;
    public final void rule__NotificationModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:474:1: ( ( ( rule__NotificationModel__ModuleAssignment_1 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:475:1: ( ( rule__NotificationModel__ModuleAssignment_1 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:475:1: ( ( rule__NotificationModel__ModuleAssignment_1 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:476:1: ( rule__NotificationModel__ModuleAssignment_1 )
            {
             before(grammarAccess.getNotificationModelAccess().getModuleAssignment_1()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:477:1: ( rule__NotificationModel__ModuleAssignment_1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:477:2: rule__NotificationModel__ModuleAssignment_1
            {
            pushFollow(FOLLOW_rule__NotificationModel__ModuleAssignment_1_in_rule__NotificationModel__Group__1__Impl944);
            rule__NotificationModel__ModuleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNotificationModelAccess().getModuleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotificationModel__Group__1__Impl"


    // $ANTLR start "rule__NotificationModel__Group__2"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:487:1: rule__NotificationModel__Group__2 : rule__NotificationModel__Group__2__Impl rule__NotificationModel__Group__3 ;
    public final void rule__NotificationModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:491:1: ( rule__NotificationModel__Group__2__Impl rule__NotificationModel__Group__3 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:492:2: rule__NotificationModel__Group__2__Impl rule__NotificationModel__Group__3
            {
            pushFollow(FOLLOW_rule__NotificationModel__Group__2__Impl_in_rule__NotificationModel__Group__2974);
            rule__NotificationModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NotificationModel__Group__3_in_rule__NotificationModel__Group__2977);
            rule__NotificationModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotificationModel__Group__2"


    // $ANTLR start "rule__NotificationModel__Group__2__Impl"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:499:1: rule__NotificationModel__Group__2__Impl : ( 'version' ) ;
    public final void rule__NotificationModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:503:1: ( ( 'version' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:504:1: ( 'version' )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:504:1: ( 'version' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:505:1: 'version'
            {
             before(grammarAccess.getNotificationModelAccess().getVersionKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__NotificationModel__Group__2__Impl1005); 
             after(grammarAccess.getNotificationModelAccess().getVersionKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotificationModel__Group__2__Impl"


    // $ANTLR start "rule__NotificationModel__Group__3"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:518:1: rule__NotificationModel__Group__3 : rule__NotificationModel__Group__3__Impl rule__NotificationModel__Group__4 ;
    public final void rule__NotificationModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:522:1: ( rule__NotificationModel__Group__3__Impl rule__NotificationModel__Group__4 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:523:2: rule__NotificationModel__Group__3__Impl rule__NotificationModel__Group__4
            {
            pushFollow(FOLLOW_rule__NotificationModel__Group__3__Impl_in_rule__NotificationModel__Group__31036);
            rule__NotificationModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NotificationModel__Group__4_in_rule__NotificationModel__Group__31039);
            rule__NotificationModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotificationModel__Group__3"


    // $ANTLR start "rule__NotificationModel__Group__3__Impl"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:530:1: rule__NotificationModel__Group__3__Impl : ( ( rule__NotificationModel__VersionAssignment_3 ) ) ;
    public final void rule__NotificationModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:534:1: ( ( ( rule__NotificationModel__VersionAssignment_3 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:535:1: ( ( rule__NotificationModel__VersionAssignment_3 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:535:1: ( ( rule__NotificationModel__VersionAssignment_3 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:536:1: ( rule__NotificationModel__VersionAssignment_3 )
            {
             before(grammarAccess.getNotificationModelAccess().getVersionAssignment_3()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:537:1: ( rule__NotificationModel__VersionAssignment_3 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:537:2: rule__NotificationModel__VersionAssignment_3
            {
            pushFollow(FOLLOW_rule__NotificationModel__VersionAssignment_3_in_rule__NotificationModel__Group__3__Impl1066);
            rule__NotificationModel__VersionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNotificationModelAccess().getVersionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotificationModel__Group__3__Impl"


    // $ANTLR start "rule__NotificationModel__Group__4"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:547:1: rule__NotificationModel__Group__4 : rule__NotificationModel__Group__4__Impl ;
    public final void rule__NotificationModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:551:1: ( rule__NotificationModel__Group__4__Impl )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:552:2: rule__NotificationModel__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__NotificationModel__Group__4__Impl_in_rule__NotificationModel__Group__41096);
            rule__NotificationModel__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotificationModel__Group__4"


    // $ANTLR start "rule__NotificationModel__Group__4__Impl"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:558:1: rule__NotificationModel__Group__4__Impl : ( ( ( rule__NotificationModel__NotificationsAssignment_4 ) ) ( ( rule__NotificationModel__NotificationsAssignment_4 )* ) ) ;
    public final void rule__NotificationModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:562:1: ( ( ( ( rule__NotificationModel__NotificationsAssignment_4 ) ) ( ( rule__NotificationModel__NotificationsAssignment_4 )* ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:563:1: ( ( ( rule__NotificationModel__NotificationsAssignment_4 ) ) ( ( rule__NotificationModel__NotificationsAssignment_4 )* ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:563:1: ( ( ( rule__NotificationModel__NotificationsAssignment_4 ) ) ( ( rule__NotificationModel__NotificationsAssignment_4 )* ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:564:1: ( ( rule__NotificationModel__NotificationsAssignment_4 ) ) ( ( rule__NotificationModel__NotificationsAssignment_4 )* )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:564:1: ( ( rule__NotificationModel__NotificationsAssignment_4 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:565:1: ( rule__NotificationModel__NotificationsAssignment_4 )
            {
             before(grammarAccess.getNotificationModelAccess().getNotificationsAssignment_4()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:566:1: ( rule__NotificationModel__NotificationsAssignment_4 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:566:2: rule__NotificationModel__NotificationsAssignment_4
            {
            pushFollow(FOLLOW_rule__NotificationModel__NotificationsAssignment_4_in_rule__NotificationModel__Group__4__Impl1125);
            rule__NotificationModel__NotificationsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getNotificationModelAccess().getNotificationsAssignment_4()); 

            }

            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:569:1: ( ( rule__NotificationModel__NotificationsAssignment_4 )* )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:570:1: ( rule__NotificationModel__NotificationsAssignment_4 )*
            {
             before(grammarAccess.getNotificationModelAccess().getNotificationsAssignment_4()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:571:1: ( rule__NotificationModel__NotificationsAssignment_4 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:571:2: rule__NotificationModel__NotificationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__NotificationModel__NotificationsAssignment_4_in_rule__NotificationModel__Group__4__Impl1137);
            	    rule__NotificationModel__NotificationsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getNotificationModelAccess().getNotificationsAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotificationModel__Group__4__Impl"


    // $ANTLR start "rule__Notification__Group__0"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:592:1: rule__Notification__Group__0 : rule__Notification__Group__0__Impl rule__Notification__Group__1 ;
    public final void rule__Notification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:596:1: ( rule__Notification__Group__0__Impl rule__Notification__Group__1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:597:2: rule__Notification__Group__0__Impl rule__Notification__Group__1
            {
            pushFollow(FOLLOW_rule__Notification__Group__0__Impl_in_rule__Notification__Group__01180);
            rule__Notification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Notification__Group__1_in_rule__Notification__Group__01183);
            rule__Notification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notification__Group__0"


    // $ANTLR start "rule__Notification__Group__0__Impl"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:604:1: rule__Notification__Group__0__Impl : ( 'notification' ) ;
    public final void rule__Notification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:608:1: ( ( 'notification' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:609:1: ( 'notification' )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:609:1: ( 'notification' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:610:1: 'notification'
            {
             before(grammarAccess.getNotificationAccess().getNotificationKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Notification__Group__0__Impl1211); 
             after(grammarAccess.getNotificationAccess().getNotificationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notification__Group__0__Impl"


    // $ANTLR start "rule__Notification__Group__1"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:623:1: rule__Notification__Group__1 : rule__Notification__Group__1__Impl rule__Notification__Group__2 ;
    public final void rule__Notification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:627:1: ( rule__Notification__Group__1__Impl rule__Notification__Group__2 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:628:2: rule__Notification__Group__1__Impl rule__Notification__Group__2
            {
            pushFollow(FOLLOW_rule__Notification__Group__1__Impl_in_rule__Notification__Group__11242);
            rule__Notification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Notification__Group__2_in_rule__Notification__Group__11245);
            rule__Notification__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notification__Group__1"


    // $ANTLR start "rule__Notification__Group__1__Impl"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:635:1: rule__Notification__Group__1__Impl : ( ( rule__Notification__NameAssignment_1 ) ) ;
    public final void rule__Notification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:639:1: ( ( ( rule__Notification__NameAssignment_1 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:640:1: ( ( rule__Notification__NameAssignment_1 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:640:1: ( ( rule__Notification__NameAssignment_1 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:641:1: ( rule__Notification__NameAssignment_1 )
            {
             before(grammarAccess.getNotificationAccess().getNameAssignment_1()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:642:1: ( rule__Notification__NameAssignment_1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:642:2: rule__Notification__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Notification__NameAssignment_1_in_rule__Notification__Group__1__Impl1272);
            rule__Notification__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNotificationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notification__Group__1__Impl"


    // $ANTLR start "rule__Notification__Group__2"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:652:1: rule__Notification__Group__2 : rule__Notification__Group__2__Impl rule__Notification__Group__3 ;
    public final void rule__Notification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:656:1: ( rule__Notification__Group__2__Impl rule__Notification__Group__3 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:657:2: rule__Notification__Group__2__Impl rule__Notification__Group__3
            {
            pushFollow(FOLLOW_rule__Notification__Group__2__Impl_in_rule__Notification__Group__21302);
            rule__Notification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Notification__Group__3_in_rule__Notification__Group__21305);
            rule__Notification__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notification__Group__2"


    // $ANTLR start "rule__Notification__Group__2__Impl"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:664:1: rule__Notification__Group__2__Impl : ( '{' ) ;
    public final void rule__Notification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:668:1: ( ( '{' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:669:1: ( '{' )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:669:1: ( '{' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:670:1: '{'
            {
             before(grammarAccess.getNotificationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Notification__Group__2__Impl1333); 
             after(grammarAccess.getNotificationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notification__Group__2__Impl"


    // $ANTLR start "rule__Notification__Group__3"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:683:1: rule__Notification__Group__3 : rule__Notification__Group__3__Impl rule__Notification__Group__4 ;
    public final void rule__Notification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:687:1: ( rule__Notification__Group__3__Impl rule__Notification__Group__4 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:688:2: rule__Notification__Group__3__Impl rule__Notification__Group__4
            {
            pushFollow(FOLLOW_rule__Notification__Group__3__Impl_in_rule__Notification__Group__31364);
            rule__Notification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Notification__Group__4_in_rule__Notification__Group__31367);
            rule__Notification__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notification__Group__3"


    // $ANTLR start "rule__Notification__Group__3__Impl"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:695:1: rule__Notification__Group__3__Impl : ( ( rule__Notification__FeaturesAssignment_3 )* ) ;
    public final void rule__Notification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:699:1: ( ( ( rule__Notification__FeaturesAssignment_3 )* ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:700:1: ( ( rule__Notification__FeaturesAssignment_3 )* )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:700:1: ( ( rule__Notification__FeaturesAssignment_3 )* )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:701:1: ( rule__Notification__FeaturesAssignment_3 )*
            {
             before(grammarAccess.getNotificationAccess().getFeaturesAssignment_3()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:702:1: ( rule__Notification__FeaturesAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||(LA3_0>=21 && LA3_0<=22)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:702:2: rule__Notification__FeaturesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Notification__FeaturesAssignment_3_in_rule__Notification__Group__3__Impl1394);
            	    rule__Notification__FeaturesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getNotificationAccess().getFeaturesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notification__Group__3__Impl"


    // $ANTLR start "rule__Notification__Group__4"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:712:1: rule__Notification__Group__4 : rule__Notification__Group__4__Impl ;
    public final void rule__Notification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:716:1: ( rule__Notification__Group__4__Impl )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:717:2: rule__Notification__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Notification__Group__4__Impl_in_rule__Notification__Group__41425);
            rule__Notification__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notification__Group__4"


    // $ANTLR start "rule__Notification__Group__4__Impl"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:723:1: rule__Notification__Group__4__Impl : ( '}' ) ;
    public final void rule__Notification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:727:1: ( ( '}' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:728:1: ( '}' )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:728:1: ( '}' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:729:1: '}'
            {
             before(grammarAccess.getNotificationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__Notification__Group__4__Impl1453); 
             after(grammarAccess.getNotificationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notification__Group__4__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:752:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:756:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:757:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__01494);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__01497);
            rule__Feature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0"


    // $ANTLR start "rule__Feature__Group__0__Impl"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:764:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__IsIndexedAssignment_0 )? ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:768:1: ( ( ( rule__Feature__IsIndexedAssignment_0 )? ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:769:1: ( ( rule__Feature__IsIndexedAssignment_0 )? )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:769:1: ( ( rule__Feature__IsIndexedAssignment_0 )? )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:770:1: ( rule__Feature__IsIndexedAssignment_0 )?
            {
             before(grammarAccess.getFeatureAccess().getIsIndexedAssignment_0()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:771:1: ( rule__Feature__IsIndexedAssignment_0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:771:2: rule__Feature__IsIndexedAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Feature__IsIndexedAssignment_0_in_rule__Feature__Group__0__Impl1524);
                    rule__Feature__IsIndexedAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getIsIndexedAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0__Impl"


    // $ANTLR start "rule__Feature__Group__1"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:781:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:785:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:786:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__11555);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__11558);
            rule__Feature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1"


    // $ANTLR start "rule__Feature__Group__1__Impl"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:793:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__IsContainmentAssignment_1 )? ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:797:1: ( ( ( rule__Feature__IsContainmentAssignment_1 )? ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:798:1: ( ( rule__Feature__IsContainmentAssignment_1 )? )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:798:1: ( ( rule__Feature__IsContainmentAssignment_1 )? )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:799:1: ( rule__Feature__IsContainmentAssignment_1 )?
            {
             before(grammarAccess.getFeatureAccess().getIsContainmentAssignment_1()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:800:1: ( rule__Feature__IsContainmentAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:800:2: rule__Feature__IsContainmentAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Feature__IsContainmentAssignment_1_in_rule__Feature__Group__1__Impl1585);
                    rule__Feature__IsContainmentAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getIsContainmentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__2"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:810:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:814:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:815:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__21616);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__21619);
            rule__Feature__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2"


    // $ANTLR start "rule__Feature__Group__2__Impl"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:822:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__TypeAssignment_2 ) ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:826:1: ( ( ( rule__Feature__TypeAssignment_2 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:827:1: ( ( rule__Feature__TypeAssignment_2 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:827:1: ( ( rule__Feature__TypeAssignment_2 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:828:1: ( rule__Feature__TypeAssignment_2 )
            {
             before(grammarAccess.getFeatureAccess().getTypeAssignment_2()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:829:1: ( rule__Feature__TypeAssignment_2 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:829:2: rule__Feature__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Feature__TypeAssignment_2_in_rule__Feature__Group__2__Impl1646);
            rule__Feature__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2__Impl"


    // $ANTLR start "rule__Feature__Group__3"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:839:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:843:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:844:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
            {
            pushFollow(FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__31676);
            rule__Feature__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__4_in_rule__Feature__Group__31679);
            rule__Feature__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3"


    // $ANTLR start "rule__Feature__Group__3__Impl"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:851:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__NameAssignment_3 ) ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:855:1: ( ( ( rule__Feature__NameAssignment_3 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:856:1: ( ( rule__Feature__NameAssignment_3 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:856:1: ( ( rule__Feature__NameAssignment_3 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:857:1: ( rule__Feature__NameAssignment_3 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_3()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:858:1: ( rule__Feature__NameAssignment_3 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:858:2: rule__Feature__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Feature__NameAssignment_3_in_rule__Feature__Group__3__Impl1706);
            rule__Feature__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3__Impl"


    // $ANTLR start "rule__Feature__Group__4"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:868:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl rule__Feature__Group__5 ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:872:1: ( rule__Feature__Group__4__Impl rule__Feature__Group__5 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:873:2: rule__Feature__Group__4__Impl rule__Feature__Group__5
            {
            pushFollow(FOLLOW_rule__Feature__Group__4__Impl_in_rule__Feature__Group__41736);
            rule__Feature__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__5_in_rule__Feature__Group__41739);
            rule__Feature__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__4"


    // $ANTLR start "rule__Feature__Group__4__Impl"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:880:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__Group_4__0 )? ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:884:1: ( ( ( rule__Feature__Group_4__0 )? ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:885:1: ( ( rule__Feature__Group_4__0 )? )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:885:1: ( ( rule__Feature__Group_4__0 )? )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:886:1: ( rule__Feature__Group_4__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_4()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:887:1: ( rule__Feature__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:887:2: rule__Feature__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Feature__Group_4__0_in_rule__Feature__Group__4__Impl1766);
                    rule__Feature__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__4__Impl"


    // $ANTLR start "rule__Feature__Group__5"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:897:1: rule__Feature__Group__5 : rule__Feature__Group__5__Impl rule__Feature__Group__6 ;
    public final void rule__Feature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:901:1: ( rule__Feature__Group__5__Impl rule__Feature__Group__6 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:902:2: rule__Feature__Group__5__Impl rule__Feature__Group__6
            {
            pushFollow(FOLLOW_rule__Feature__Group__5__Impl_in_rule__Feature__Group__51797);
            rule__Feature__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__6_in_rule__Feature__Group__51800);
            rule__Feature__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__5"


    // $ANTLR start "rule__Feature__Group__5__Impl"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:909:1: rule__Feature__Group__5__Impl : ( ( rule__Feature__Group_5__0 )? ) ;
    public final void rule__Feature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:913:1: ( ( ( rule__Feature__Group_5__0 )? ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:914:1: ( ( rule__Feature__Group_5__0 )? )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:914:1: ( ( rule__Feature__Group_5__0 )? )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:915:1: ( rule__Feature__Group_5__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_5()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:916:1: ( rule__Feature__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:916:2: rule__Feature__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Feature__Group_5__0_in_rule__Feature__Group__5__Impl1827);
                    rule__Feature__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__5__Impl"


    // $ANTLR start "rule__Feature__Group__6"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:926:1: rule__Feature__Group__6 : rule__Feature__Group__6__Impl ;
    public final void rule__Feature__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:930:1: ( rule__Feature__Group__6__Impl )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:931:2: rule__Feature__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group__6__Impl_in_rule__Feature__Group__61858);
            rule__Feature__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__6"


    // $ANTLR start "rule__Feature__Group__6__Impl"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:937:1: rule__Feature__Group__6__Impl : ( ( ';' )? ) ;
    public final void rule__Feature__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:941:1: ( ( ( ';' )? ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:942:1: ( ( ';' )? )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:942:1: ( ( ';' )? )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:943:1: ( ';' )?
            {
             before(grammarAccess.getFeatureAccess().getSemicolonKeyword_6()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:944:1: ( ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:945:2: ';'
                    {
                    match(input,16,FOLLOW_16_in_rule__Feature__Group__6__Impl1887); 

                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__6__Impl"


    // $ANTLR start "rule__Feature__Group_4__0"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:970:1: rule__Feature__Group_4__0 : rule__Feature__Group_4__0__Impl rule__Feature__Group_4__1 ;
    public final void rule__Feature__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:974:1: ( rule__Feature__Group_4__0__Impl rule__Feature__Group_4__1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:975:2: rule__Feature__Group_4__0__Impl rule__Feature__Group_4__1
            {
            pushFollow(FOLLOW_rule__Feature__Group_4__0__Impl_in_rule__Feature__Group_4__01934);
            rule__Feature__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group_4__1_in_rule__Feature__Group_4__01937);
            rule__Feature__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_4__0"


    // $ANTLR start "rule__Feature__Group_4__0__Impl"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:982:1: rule__Feature__Group_4__0__Impl : ( '=' ) ;
    public final void rule__Feature__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:986:1: ( ( '=' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:987:1: ( '=' )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:987:1: ( '=' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:988:1: '='
            {
             before(grammarAccess.getFeatureAccess().getEqualsSignKeyword_4_0()); 
            match(input,17,FOLLOW_17_in_rule__Feature__Group_4__0__Impl1965); 
             after(grammarAccess.getFeatureAccess().getEqualsSignKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_4__0__Impl"


    // $ANTLR start "rule__Feature__Group_4__1"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1001:1: rule__Feature__Group_4__1 : rule__Feature__Group_4__1__Impl ;
    public final void rule__Feature__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1005:1: ( rule__Feature__Group_4__1__Impl )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1006:2: rule__Feature__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group_4__1__Impl_in_rule__Feature__Group_4__11996);
            rule__Feature__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_4__1"


    // $ANTLR start "rule__Feature__Group_4__1__Impl"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1012:1: rule__Feature__Group_4__1__Impl : ( ( rule__Feature__DefaultValueAssignment_4_1 ) ) ;
    public final void rule__Feature__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1016:1: ( ( ( rule__Feature__DefaultValueAssignment_4_1 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1017:1: ( ( rule__Feature__DefaultValueAssignment_4_1 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1017:1: ( ( rule__Feature__DefaultValueAssignment_4_1 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1018:1: ( rule__Feature__DefaultValueAssignment_4_1 )
            {
             before(grammarAccess.getFeatureAccess().getDefaultValueAssignment_4_1()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1019:1: ( rule__Feature__DefaultValueAssignment_4_1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1019:2: rule__Feature__DefaultValueAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Feature__DefaultValueAssignment_4_1_in_rule__Feature__Group_4__1__Impl2023);
            rule__Feature__DefaultValueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getDefaultValueAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_4__1__Impl"


    // $ANTLR start "rule__Feature__Group_5__0"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1033:1: rule__Feature__Group_5__0 : rule__Feature__Group_5__0__Impl rule__Feature__Group_5__1 ;
    public final void rule__Feature__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1037:1: ( rule__Feature__Group_5__0__Impl rule__Feature__Group_5__1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1038:2: rule__Feature__Group_5__0__Impl rule__Feature__Group_5__1
            {
            pushFollow(FOLLOW_rule__Feature__Group_5__0__Impl_in_rule__Feature__Group_5__02057);
            rule__Feature__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group_5__1_in_rule__Feature__Group_5__02060);
            rule__Feature__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_5__0"


    // $ANTLR start "rule__Feature__Group_5__0__Impl"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1045:1: rule__Feature__Group_5__0__Impl : ( '<->' ) ;
    public final void rule__Feature__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1049:1: ( ( '<->' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1050:1: ( '<->' )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1050:1: ( '<->' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1051:1: '<->'
            {
             before(grammarAccess.getFeatureAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5_0()); 
            match(input,18,FOLLOW_18_in_rule__Feature__Group_5__0__Impl2088); 
             after(grammarAccess.getFeatureAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_5__0__Impl"


    // $ANTLR start "rule__Feature__Group_5__1"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1064:1: rule__Feature__Group_5__1 : rule__Feature__Group_5__1__Impl ;
    public final void rule__Feature__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1068:1: ( rule__Feature__Group_5__1__Impl )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1069:2: rule__Feature__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group_5__1__Impl_in_rule__Feature__Group_5__12119);
            rule__Feature__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_5__1"


    // $ANTLR start "rule__Feature__Group_5__1__Impl"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1075:1: rule__Feature__Group_5__1__Impl : ( ( rule__Feature__InverseAssignment_5_1 ) ) ;
    public final void rule__Feature__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1079:1: ( ( ( rule__Feature__InverseAssignment_5_1 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1080:1: ( ( rule__Feature__InverseAssignment_5_1 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1080:1: ( ( rule__Feature__InverseAssignment_5_1 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1081:1: ( rule__Feature__InverseAssignment_5_1 )
            {
             before(grammarAccess.getFeatureAccess().getInverseAssignment_5_1()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1082:1: ( rule__Feature__InverseAssignment_5_1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1082:2: rule__Feature__InverseAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Feature__InverseAssignment_5_1_in_rule__Feature__Group_5__1__Impl2146);
            rule__Feature__InverseAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getInverseAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_5__1__Impl"


    // $ANTLR start "rule__TypeRef__Group__0"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1096:1: rule__TypeRef__Group__0 : rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 ;
    public final void rule__TypeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1100:1: ( rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1101:2: rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__02180);
            rule__TypeRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__02183);
            rule__TypeRef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group__0"


    // $ANTLR start "rule__TypeRef__Group__0__Impl"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1108:1: rule__TypeRef__Group__0__Impl : ( ( rule__TypeRef__ReferencedAssignment_0 ) ) ;
    public final void rule__TypeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1112:1: ( ( ( rule__TypeRef__ReferencedAssignment_0 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1113:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1113:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1114:1: ( rule__TypeRef__ReferencedAssignment_0 )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedAssignment_0()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1115:1: ( rule__TypeRef__ReferencedAssignment_0 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1115:2: rule__TypeRef__ReferencedAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl2210);
            rule__TypeRef__ReferencedAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeRefAccess().getReferencedAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group__0__Impl"


    // $ANTLR start "rule__TypeRef__Group__1"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1125:1: rule__TypeRef__Group__1 : rule__TypeRef__Group__1__Impl ;
    public final void rule__TypeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1129:1: ( rule__TypeRef__Group__1__Impl )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1130:2: rule__TypeRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__12240);
            rule__TypeRef__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group__1"


    // $ANTLR start "rule__TypeRef__Group__1__Impl"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1136:1: rule__TypeRef__Group__1__Impl : ( ( rule__TypeRef__IsMultiAssignment_1 )? ) ;
    public final void rule__TypeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1140:1: ( ( ( rule__TypeRef__IsMultiAssignment_1 )? ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1141:1: ( ( rule__TypeRef__IsMultiAssignment_1 )? )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1141:1: ( ( rule__TypeRef__IsMultiAssignment_1 )? )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1142:1: ( rule__TypeRef__IsMultiAssignment_1 )?
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiAssignment_1()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1143:1: ( rule__TypeRef__IsMultiAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1143:2: rule__TypeRef__IsMultiAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TypeRef__IsMultiAssignment_1_in_rule__TypeRef__Group__1__Impl2267);
                    rule__TypeRef__IsMultiAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeRefAccess().getIsMultiAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group__1__Impl"


    // $ANTLR start "rule__EFloatObject__Group__0"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1157:1: rule__EFloatObject__Group__0 : rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1 ;
    public final void rule__EFloatObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1161:1: ( rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1162:2: rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__0__Impl_in_rule__EFloatObject__Group__02302);
            rule__EFloatObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__1_in_rule__EFloatObject__Group__02305);
            rule__EFloatObject__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloatObject__Group__0"


    // $ANTLR start "rule__EFloatObject__Group__0__Impl"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1169:1: rule__EFloatObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloatObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1173:1: ( ( ( '-' )? ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1174:1: ( ( '-' )? )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1174:1: ( ( '-' )? )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1175:1: ( '-' )?
            {
             before(grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1176:1: ( '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1177:2: '-'
                    {
                    match(input,19,FOLLOW_19_in_rule__EFloatObject__Group__0__Impl2334); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloatObject__Group__0__Impl"


    // $ANTLR start "rule__EFloatObject__Group__1"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1188:1: rule__EFloatObject__Group__1 : rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2 ;
    public final void rule__EFloatObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1192:1: ( rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1193:2: rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__1__Impl_in_rule__EFloatObject__Group__12367);
            rule__EFloatObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__2_in_rule__EFloatObject__Group__12370);
            rule__EFloatObject__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloatObject__Group__1"


    // $ANTLR start "rule__EFloatObject__Group__1__Impl"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1200:1: rule__EFloatObject__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloatObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1204:1: ( ( ( RULE_INT )? ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1205:1: ( ( RULE_INT )? )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1205:1: ( ( RULE_INT )? )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1206:1: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1207:1: ( RULE_INT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1207:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EFloatObject__Group__1__Impl2398); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloatObject__Group__1__Impl"


    // $ANTLR start "rule__EFloatObject__Group__2"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1217:1: rule__EFloatObject__Group__2 : rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3 ;
    public final void rule__EFloatObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1221:1: ( rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1222:2: rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__2__Impl_in_rule__EFloatObject__Group__22429);
            rule__EFloatObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__3_in_rule__EFloatObject__Group__22432);
            rule__EFloatObject__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloatObject__Group__2"


    // $ANTLR start "rule__EFloatObject__Group__2__Impl"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1229:1: rule__EFloatObject__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloatObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1233:1: ( ( '.' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1234:1: ( '.' )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1234:1: ( '.' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1235:1: '.'
            {
             before(grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__EFloatObject__Group__2__Impl2460); 
             after(grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloatObject__Group__2__Impl"


    // $ANTLR start "rule__EFloatObject__Group__3"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1248:1: rule__EFloatObject__Group__3 : rule__EFloatObject__Group__3__Impl ;
    public final void rule__EFloatObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1252:1: ( rule__EFloatObject__Group__3__Impl )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1253:2: rule__EFloatObject__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__3__Impl_in_rule__EFloatObject__Group__32491);
            rule__EFloatObject__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloatObject__Group__3"


    // $ANTLR start "rule__EFloatObject__Group__3__Impl"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1259:1: rule__EFloatObject__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloatObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1263:1: ( ( RULE_INT ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1264:1: ( RULE_INT )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1264:1: ( RULE_INT )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1265:1: RULE_INT
            {
             before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EFloatObject__Group__3__Impl2518); 
             after(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloatObject__Group__3__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1284:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1288:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1289:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02555);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02558);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1296:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1300:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1301:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1301:1: ( RULE_ID )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1302:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2585); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1313:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1317:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1318:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12614);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1324:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1328:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1329:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1329:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1330:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1331:1: ( rule__QualifiedName__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1331:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2641);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1345:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1349:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1350:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02676);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02679);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1357:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1361:1: ( ( '.' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1362:1: ( '.' )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1362:1: ( '.' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1363:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,20,FOLLOW_20_in_rule__QualifiedName__Group_1__0__Impl2707); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1376:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1380:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1381:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12738);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1387:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1391:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1392:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1392:1: ( RULE_ID )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1393:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2765); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__NotificationModel__ModuleAssignment_1"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1409:1: rule__NotificationModel__ModuleAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__NotificationModel__ModuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1413:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1414:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1414:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1415:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getNotificationModelAccess().getModuleModuleCrossReference_1_0()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1416:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1417:1: ruleQualifiedName
            {
             before(grammarAccess.getNotificationModelAccess().getModuleModuleQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__NotificationModel__ModuleAssignment_12807);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getNotificationModelAccess().getModuleModuleQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getNotificationModelAccess().getModuleModuleCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotificationModel__ModuleAssignment_1"


    // $ANTLR start "rule__NotificationModel__VersionAssignment_3"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1428:1: rule__NotificationModel__VersionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__NotificationModel__VersionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1432:1: ( ( RULE_STRING ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1433:1: ( RULE_STRING )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1433:1: ( RULE_STRING )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1434:1: RULE_STRING
            {
             before(grammarAccess.getNotificationModelAccess().getVersionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NotificationModel__VersionAssignment_32842); 
             after(grammarAccess.getNotificationModelAccess().getVersionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotificationModel__VersionAssignment_3"


    // $ANTLR start "rule__NotificationModel__NotificationsAssignment_4"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1443:1: rule__NotificationModel__NotificationsAssignment_4 : ( ruleNotification ) ;
    public final void rule__NotificationModel__NotificationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1447:1: ( ( ruleNotification ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1448:1: ( ruleNotification )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1448:1: ( ruleNotification )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1449:1: ruleNotification
            {
             before(grammarAccess.getNotificationModelAccess().getNotificationsNotificationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleNotification_in_rule__NotificationModel__NotificationsAssignment_42873);
            ruleNotification();

            state._fsp--;

             after(grammarAccess.getNotificationModelAccess().getNotificationsNotificationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotificationModel__NotificationsAssignment_4"


    // $ANTLR start "rule__Notification__NameAssignment_1"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1458:1: rule__Notification__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Notification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1462:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1463:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1463:1: ( RULE_ID )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1464:1: RULE_ID
            {
             before(grammarAccess.getNotificationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Notification__NameAssignment_12904); 
             after(grammarAccess.getNotificationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notification__NameAssignment_1"


    // $ANTLR start "rule__Notification__FeaturesAssignment_3"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1473:1: rule__Notification__FeaturesAssignment_3 : ( ruleFeature ) ;
    public final void rule__Notification__FeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1477:1: ( ( ruleFeature ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1478:1: ( ruleFeature )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1478:1: ( ruleFeature )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1479:1: ruleFeature
            {
             before(grammarAccess.getNotificationAccess().getFeaturesFeatureParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Notification__FeaturesAssignment_32935);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getNotificationAccess().getFeaturesFeatureParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notification__FeaturesAssignment_3"


    // $ANTLR start "rule__Feature__IsIndexedAssignment_0"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1488:1: rule__Feature__IsIndexedAssignment_0 : ( ( 'indexed' ) ) ;
    public final void rule__Feature__IsIndexedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1492:1: ( ( ( 'indexed' ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1493:1: ( ( 'indexed' ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1493:1: ( ( 'indexed' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1494:1: ( 'indexed' )
            {
             before(grammarAccess.getFeatureAccess().getIsIndexedIndexedKeyword_0_0()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1495:1: ( 'indexed' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1496:1: 'indexed'
            {
             before(grammarAccess.getFeatureAccess().getIsIndexedIndexedKeyword_0_0()); 
            match(input,21,FOLLOW_21_in_rule__Feature__IsIndexedAssignment_02971); 
             after(grammarAccess.getFeatureAccess().getIsIndexedIndexedKeyword_0_0()); 

            }

             after(grammarAccess.getFeatureAccess().getIsIndexedIndexedKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__IsIndexedAssignment_0"


    // $ANTLR start "rule__Feature__IsContainmentAssignment_1"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1511:1: rule__Feature__IsContainmentAssignment_1 : ( ( '-[' ) ) ;
    public final void rule__Feature__IsContainmentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1515:1: ( ( ( '-[' ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1516:1: ( ( '-[' ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1516:1: ( ( '-[' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1517:1: ( '-[' )
            {
             before(grammarAccess.getFeatureAccess().getIsContainmentHyphenMinusLeftSquareBracketKeyword_1_0()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1518:1: ( '-[' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1519:1: '-['
            {
             before(grammarAccess.getFeatureAccess().getIsContainmentHyphenMinusLeftSquareBracketKeyword_1_0()); 
            match(input,22,FOLLOW_22_in_rule__Feature__IsContainmentAssignment_13015); 
             after(grammarAccess.getFeatureAccess().getIsContainmentHyphenMinusLeftSquareBracketKeyword_1_0()); 

            }

             after(grammarAccess.getFeatureAccess().getIsContainmentHyphenMinusLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__IsContainmentAssignment_1"


    // $ANTLR start "rule__Feature__TypeAssignment_2"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1534:1: rule__Feature__TypeAssignment_2 : ( ruleTypeRef ) ;
    public final void rule__Feature__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1538:1: ( ( ruleTypeRef ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1539:1: ( ruleTypeRef )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1539:1: ( ruleTypeRef )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1540:1: ruleTypeRef
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeRefParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Feature__TypeAssignment_23054);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getTypeTypeRefParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__TypeAssignment_2"


    // $ANTLR start "rule__Feature__NameAssignment_3"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1549:1: rule__Feature__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1553:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1554:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1554:1: ( RULE_ID )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1555:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_33085); 
             after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__NameAssignment_3"


    // $ANTLR start "rule__Feature__DefaultValueAssignment_4_1"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1564:1: rule__Feature__DefaultValueAssignment_4_1 : ( ruleValueObject ) ;
    public final void rule__Feature__DefaultValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1568:1: ( ( ruleValueObject ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1569:1: ( ruleValueObject )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1569:1: ( ruleValueObject )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1570:1: ruleValueObject
            {
             before(grammarAccess.getFeatureAccess().getDefaultValueValueObjectParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleValueObject_in_rule__Feature__DefaultValueAssignment_4_13116);
            ruleValueObject();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getDefaultValueValueObjectParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__DefaultValueAssignment_4_1"


    // $ANTLR start "rule__Feature__InverseAssignment_5_1"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1579:1: rule__Feature__InverseAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__InverseAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1583:1: ( ( ( RULE_ID ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1584:1: ( ( RULE_ID ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1584:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1585:1: ( RULE_ID )
            {
             before(grammarAccess.getFeatureAccess().getInverseFeatureCrossReference_5_1_0()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1586:1: ( RULE_ID )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1587:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getInverseFeatureIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__InverseAssignment_5_13151); 
             after(grammarAccess.getFeatureAccess().getInverseFeatureIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getFeatureAccess().getInverseFeatureCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__InverseAssignment_5_1"


    // $ANTLR start "rule__TypeRef__ReferencedAssignment_0"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1598:1: rule__TypeRef__ReferencedAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TypeRef__ReferencedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1602:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1603:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1603:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1604:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1605:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1606:1: ruleQualifiedName
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_03190);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getTypeRefAccess().getReferencedTypeQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__ReferencedAssignment_0"


    // $ANTLR start "rule__TypeRef__IsMultiAssignment_1"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1617:1: rule__TypeRef__IsMultiAssignment_1 : ( ( '[]' ) ) ;
    public final void rule__TypeRef__IsMultiAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1621:1: ( ( ( '[]' ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1622:1: ( ( '[]' ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1622:1: ( ( '[]' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1623:1: ( '[]' )
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1624:1: ( '[]' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1625:1: '[]'
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            match(input,23,FOLLOW_23_in_rule__TypeRef__IsMultiAssignment_13230); 
             after(grammarAccess.getTypeRefAccess().getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); 

            }

             after(grammarAccess.getTypeRefAccess().getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__IsMultiAssignment_1"


    // $ANTLR start "rule__StringValue__ValueAssignment"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1640:1: rule__StringValue__ValueAssignment : ( ruleEStringObject ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1644:1: ( ( ruleEStringObject ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1645:1: ( ruleEStringObject )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1645:1: ( ruleEStringObject )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1646:1: ruleEStringObject
            {
             before(grammarAccess.getStringValueAccess().getValueEStringObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEStringObject_in_rule__StringValue__ValueAssignment3269);
            ruleEStringObject();

            state._fsp--;

             after(grammarAccess.getStringValueAccess().getValueEStringObjectParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__ValueAssignment"


    // $ANTLR start "rule__IntegerValue__ValueAssignment"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1655:1: rule__IntegerValue__ValueAssignment : ( ruleEIntegerObject ) ;
    public final void rule__IntegerValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1659:1: ( ( ruleEIntegerObject ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1660:1: ( ruleEIntegerObject )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1660:1: ( ruleEIntegerObject )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1661:1: ruleEIntegerObject
            {
             before(grammarAccess.getIntegerValueAccess().getValueEIntegerObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_rule__IntegerValue__ValueAssignment3300);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getIntegerValueAccess().getValueEIntegerObjectParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__ValueAssignment"


    // $ANTLR start "rule__FloatValue__ValueAssignment"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1670:1: rule__FloatValue__ValueAssignment : ( ruleEFloatObject ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1674:1: ( ( ruleEFloatObject ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1675:1: ( ruleEFloatObject )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1675:1: ( ruleEFloatObject )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1676:1: ruleEFloatObject
            {
             before(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_rule__FloatValue__ValueAssignment3331);
            ruleEFloatObject();

            state._fsp--;

             after(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatValue__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleNotificationModel_in_entryRuleNotificationModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotificationModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationModel__Group__0_in_ruleNotificationModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotification_in_entryRuleNotification121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotification128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Notification__Group__0_in_ruleNotification154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0_in_ruleFeature214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueObject_in_entryRuleValueObject301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueObject308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueObject__Alternatives_in_ruleValueObject334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_entryRuleEStringObject421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEStringObject428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEStringObject454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerValue__ValueAssignment_in_ruleIntegerValue513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEIntegerObject547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEIntegerObject573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEFloatObject666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__0_in_ruleEFloatObject692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__ValueObject__Alternatives788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_rule__ValueObject__Alternatives805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_rule__ValueObject__Alternatives822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationModel__Group__0__Impl_in_rule__NotificationModel__Group__0852 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__NotificationModel__Group__1_in_rule__NotificationModel__Group__0855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__NotificationModel__Group__0__Impl883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationModel__Group__1__Impl_in_rule__NotificationModel__Group__1914 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__NotificationModel__Group__2_in_rule__NotificationModel__Group__1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationModel__ModuleAssignment_1_in_rule__NotificationModel__Group__1__Impl944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationModel__Group__2__Impl_in_rule__NotificationModel__Group__2974 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NotificationModel__Group__3_in_rule__NotificationModel__Group__2977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__NotificationModel__Group__2__Impl1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationModel__Group__3__Impl_in_rule__NotificationModel__Group__31036 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__NotificationModel__Group__4_in_rule__NotificationModel__Group__31039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationModel__VersionAssignment_3_in_rule__NotificationModel__Group__3__Impl1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationModel__Group__4__Impl_in_rule__NotificationModel__Group__41096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationModel__NotificationsAssignment_4_in_rule__NotificationModel__Group__4__Impl1125 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__NotificationModel__NotificationsAssignment_4_in_rule__NotificationModel__Group__4__Impl1137 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Notification__Group__0__Impl_in_rule__Notification__Group__01180 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Notification__Group__1_in_rule__Notification__Group__01183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Notification__Group__0__Impl1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Notification__Group__1__Impl_in_rule__Notification__Group__11242 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Notification__Group__2_in_rule__Notification__Group__11245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Notification__NameAssignment_1_in_rule__Notification__Group__1__Impl1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Notification__Group__2__Impl_in_rule__Notification__Group__21302 = new BitSet(new long[]{0x0000000000608040L});
    public static final BitSet FOLLOW_rule__Notification__Group__3_in_rule__Notification__Group__21305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Notification__Group__2__Impl1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Notification__Group__3__Impl_in_rule__Notification__Group__31364 = new BitSet(new long[]{0x0000000000608040L});
    public static final BitSet FOLLOW_rule__Notification__Group__4_in_rule__Notification__Group__31367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Notification__FeaturesAssignment_3_in_rule__Notification__Group__3__Impl1394 = new BitSet(new long[]{0x0000000000600042L});
    public static final BitSet FOLLOW_rule__Notification__Group__4__Impl_in_rule__Notification__Group__41425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Notification__Group__4__Impl1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__01494 = new BitSet(new long[]{0x0000000000600040L});
    public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__01497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__IsIndexedAssignment_0_in_rule__Feature__Group__0__Impl1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__11555 = new BitSet(new long[]{0x0000000000600040L});
    public static final BitSet FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__11558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__IsContainmentAssignment_1_in_rule__Feature__Group__1__Impl1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__21616 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__21619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__TypeAssignment_2_in_rule__Feature__Group__2__Impl1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__31676 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_rule__Feature__Group__4_in_rule__Feature__Group__31679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__NameAssignment_3_in_rule__Feature__Group__3__Impl1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__4__Impl_in_rule__Feature__Group__41736 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_rule__Feature__Group__5_in_rule__Feature__Group__41739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_4__0_in_rule__Feature__Group__4__Impl1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__5__Impl_in_rule__Feature__Group__51797 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_rule__Feature__Group__6_in_rule__Feature__Group__51800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_5__0_in_rule__Feature__Group__5__Impl1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__6__Impl_in_rule__Feature__Group__61858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Feature__Group__6__Impl1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_4__0__Impl_in_rule__Feature__Group_4__01934 = new BitSet(new long[]{0x0000000000180030L});
    public static final BitSet FOLLOW_rule__Feature__Group_4__1_in_rule__Feature__Group_4__01937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Feature__Group_4__0__Impl1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_4__1__Impl_in_rule__Feature__Group_4__11996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__DefaultValueAssignment_4_1_in_rule__Feature__Group_4__1__Impl2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_5__0__Impl_in_rule__Feature__Group_5__02057 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Feature__Group_5__1_in_rule__Feature__Group_5__02060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Feature__Group_5__0__Impl2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_5__1__Impl_in_rule__Feature__Group_5__12119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__InverseAssignment_5_1_in_rule__Feature__Group_5__1__Impl2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__02180 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__02183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__12240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__IsMultiAssignment_1_in_rule__TypeRef__Group__1__Impl2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__0__Impl_in_rule__EFloatObject__Group__02302 = new BitSet(new long[]{0x0000000000180030L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__1_in_rule__EFloatObject__Group__02305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EFloatObject__Group__0__Impl2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__1__Impl_in_rule__EFloatObject__Group__12367 = new BitSet(new long[]{0x0000000000180030L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__2_in_rule__EFloatObject__Group__12370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group__1__Impl2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__2__Impl_in_rule__EFloatObject__Group__22429 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__3_in_rule__EFloatObject__Group__22432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EFloatObject__Group__2__Impl2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__3__Impl_in_rule__EFloatObject__Group__32491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group__3__Impl2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02555 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2641 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02676 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__QualifiedName__Group_1__0__Impl2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__NotificationModel__ModuleAssignment_12807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__NotificationModel__VersionAssignment_32842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotification_in_rule__NotificationModel__NotificationsAssignment_42873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Notification__NameAssignment_12904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Notification__FeaturesAssignment_32935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Feature__IsIndexedAssignment_02971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Feature__IsContainmentAssignment_13015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Feature__TypeAssignment_23054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_33085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueObject_in_rule__Feature__DefaultValueAssignment_4_13116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__InverseAssignment_5_13151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_03190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TypeRef__IsMultiAssignment_13230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_rule__StringValue__ValueAssignment3269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_rule__IntegerValue__ValueAssignment3300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_rule__FloatValue__ValueAssignment3331 = new BitSet(new long[]{0x0000000000000002L});

}