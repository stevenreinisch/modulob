package de.dubmas.modulob.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_DOC_COMMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'notifications for module'", "'version'", "'notification'", "'{'", "'}'", "';'", "'primitive type'", "'any type'", "'-'", "'.'", "'[]'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_DOC_COMMENT=7;
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
    public static final int RULE_INT=5;
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:60:1: entryRuleNotificationModel : ruleNotificationModel EOF ;
    public final void entryRuleNotificationModel() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:61:1: ( ruleNotificationModel EOF )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:62:1: ruleNotificationModel EOF
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:69:1: ruleNotificationModel : ( ( rule__NotificationModel__Group__0 ) ) ;
    public final void ruleNotificationModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:73:2: ( ( ( rule__NotificationModel__Group__0 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:74:1: ( ( rule__NotificationModel__Group__0 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:74:1: ( ( rule__NotificationModel__Group__0 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:75:1: ( rule__NotificationModel__Group__0 )
            {
             before(grammarAccess.getNotificationModelAccess().getGroup()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:76:1: ( rule__NotificationModel__Group__0 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:76:2: rule__NotificationModel__Group__0
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:88:1: entryRuleNotification : ruleNotification EOF ;
    public final void entryRuleNotification() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:89:1: ( ruleNotification EOF )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:90:1: ruleNotification EOF
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:97:1: ruleNotification : ( ( rule__Notification__Group__0 ) ) ;
    public final void ruleNotification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:101:2: ( ( ( rule__Notification__Group__0 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:102:1: ( ( rule__Notification__Group__0 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:102:1: ( ( rule__Notification__Group__0 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:103:1: ( rule__Notification__Group__0 )
            {
             before(grammarAccess.getNotificationAccess().getGroup()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:104:1: ( rule__Notification__Group__0 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:104:2: rule__Notification__Group__0
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:116:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:117:1: ( ruleFeature EOF )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:118:1: ruleFeature EOF
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:125:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:129:2: ( ( ( rule__Feature__Group__0 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:130:1: ( ( rule__Feature__Group__0 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:130:1: ( ( rule__Feature__Group__0 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:131:1: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:132:1: ( rule__Feature__Group__0 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:132:2: rule__Feature__Group__0
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


    // $ANTLR start "entryRulePrimitive"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:146:1: entryRulePrimitive : rulePrimitive EOF ;
    public final void entryRulePrimitive() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:147:1: ( rulePrimitive EOF )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:148:1: rulePrimitive EOF
            {
             before(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive243);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getPrimitiveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive250); 

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
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:155:1: rulePrimitive : ( ( rule__Primitive__Group__0 ) ) ;
    public final void rulePrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:159:2: ( ( ( rule__Primitive__Group__0 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:160:1: ( ( rule__Primitive__Group__0 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:160:1: ( ( rule__Primitive__Group__0 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:161:1: ( rule__Primitive__Group__0 )
            {
             before(grammarAccess.getPrimitiveAccess().getGroup()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:162:1: ( rule__Primitive__Group__0 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:162:2: rule__Primitive__Group__0
            {
            pushFollow(FOLLOW_rule__Primitive__Group__0_in_rulePrimitive276);
            rule__Primitive__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveAccess().getGroup()); 

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
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleAny"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:174:1: entryRuleAny : ruleAny EOF ;
    public final void entryRuleAny() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:175:1: ( ruleAny EOF )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:176:1: ruleAny EOF
            {
             before(grammarAccess.getAnyRule()); 
            pushFollow(FOLLOW_ruleAny_in_entryRuleAny303);
            ruleAny();

            state._fsp--;

             after(grammarAccess.getAnyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAny310); 

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
    // $ANTLR end "entryRuleAny"


    // $ANTLR start "ruleAny"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:183:1: ruleAny : ( ( rule__Any__Group__0 ) ) ;
    public final void ruleAny() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:187:2: ( ( ( rule__Any__Group__0 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:188:1: ( ( rule__Any__Group__0 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:188:1: ( ( rule__Any__Group__0 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:189:1: ( rule__Any__Group__0 )
            {
             before(grammarAccess.getAnyAccess().getGroup()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:190:1: ( rule__Any__Group__0 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:190:2: rule__Any__Group__0
            {
            pushFollow(FOLLOW_rule__Any__Group__0_in_ruleAny336);
            rule__Any__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnyAccess().getGroup()); 

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
    // $ANTLR end "ruleAny"


    // $ANTLR start "entryRuleTypeRef"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:202:1: entryRuleTypeRef : ruleTypeRef EOF ;
    public final void entryRuleTypeRef() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:203:1: ( ruleTypeRef EOF )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:204:1: ruleTypeRef EOF
            {
             before(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef363);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getTypeRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef370); 

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:211:1: ruleTypeRef : ( ( rule__TypeRef__Group__0 ) ) ;
    public final void ruleTypeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:215:2: ( ( ( rule__TypeRef__Group__0 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:216:1: ( ( rule__TypeRef__Group__0 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:216:1: ( ( rule__TypeRef__Group__0 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:217:1: ( rule__TypeRef__Group__0 )
            {
             before(grammarAccess.getTypeRefAccess().getGroup()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:218:1: ( rule__TypeRef__Group__0 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:218:2: rule__TypeRef__Group__0
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef396);
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


    // $ANTLR start "entryRuleStringValue"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:232:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:233:1: ( ruleStringValue EOF )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:234:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue425);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue432); 

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:241:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:245:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:246:1: ( ( rule__StringValue__ValueAssignment ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:246:1: ( ( rule__StringValue__ValueAssignment ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:247:1: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:248:1: ( rule__StringValue__ValueAssignment )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:248:2: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue458);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:260:1: entryRuleEStringObject : ruleEStringObject EOF ;
    public final void entryRuleEStringObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:261:1: ( ruleEStringObject EOF )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:262:1: ruleEStringObject EOF
            {
             before(grammarAccess.getEStringObjectRule()); 
            pushFollow(FOLLOW_ruleEStringObject_in_entryRuleEStringObject485);
            ruleEStringObject();

            state._fsp--;

             after(grammarAccess.getEStringObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEStringObject492); 

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:269:1: ruleEStringObject : ( RULE_STRING ) ;
    public final void ruleEStringObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:273:2: ( ( RULE_STRING ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:274:1: ( RULE_STRING )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:274:1: ( RULE_STRING )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:275:1: RULE_STRING
            {
             before(grammarAccess.getEStringObjectAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEStringObject518); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:288:1: entryRuleIntegerValue : ruleIntegerValue EOF ;
    public final void entryRuleIntegerValue() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:289:1: ( ruleIntegerValue EOF )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:290:1: ruleIntegerValue EOF
            {
             before(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue544);
            ruleIntegerValue();

            state._fsp--;

             after(grammarAccess.getIntegerValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValue551); 

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:297:1: ruleIntegerValue : ( ( rule__IntegerValue__ValueAssignment ) ) ;
    public final void ruleIntegerValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:301:2: ( ( ( rule__IntegerValue__ValueAssignment ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:302:1: ( ( rule__IntegerValue__ValueAssignment ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:302:1: ( ( rule__IntegerValue__ValueAssignment ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:303:1: ( rule__IntegerValue__ValueAssignment )
            {
             before(grammarAccess.getIntegerValueAccess().getValueAssignment()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:304:1: ( rule__IntegerValue__ValueAssignment )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:304:2: rule__IntegerValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntegerValue__ValueAssignment_in_ruleIntegerValue577);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:316:1: entryRuleEIntegerObject : ruleEIntegerObject EOF ;
    public final void entryRuleEIntegerObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:317:1: ( ruleEIntegerObject EOF )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:318:1: ruleEIntegerObject EOF
            {
             before(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject604);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getEIntegerObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEIntegerObject611); 

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:325:1: ruleEIntegerObject : ( RULE_INT ) ;
    public final void ruleEIntegerObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:329:2: ( ( RULE_INT ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:330:1: ( RULE_INT )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:330:1: ( RULE_INT )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:331:1: RULE_INT
            {
             before(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEIntegerObject637); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:344:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:345:1: ( ruleFloatValue EOF )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:346:1: ruleFloatValue EOF
            {
             before(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue663);
            ruleFloatValue();

            state._fsp--;

             after(grammarAccess.getFloatValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue670); 

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:353:1: ruleFloatValue : ( ( rule__FloatValue__ValueAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:357:2: ( ( ( rule__FloatValue__ValueAssignment ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:358:1: ( ( rule__FloatValue__ValueAssignment ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:358:1: ( ( rule__FloatValue__ValueAssignment ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:359:1: ( rule__FloatValue__ValueAssignment )
            {
             before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:360:1: ( rule__FloatValue__ValueAssignment )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:360:2: rule__FloatValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue696);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:372:1: entryRuleEFloatObject : ruleEFloatObject EOF ;
    public final void entryRuleEFloatObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:373:1: ( ruleEFloatObject EOF )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:374:1: ruleEFloatObject EOF
            {
             before(grammarAccess.getEFloatObjectRule()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject723);
            ruleEFloatObject();

            state._fsp--;

             after(grammarAccess.getEFloatObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEFloatObject730); 

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:381:1: ruleEFloatObject : ( ( rule__EFloatObject__Group__0 ) ) ;
    public final void ruleEFloatObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:385:2: ( ( ( rule__EFloatObject__Group__0 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:386:1: ( ( rule__EFloatObject__Group__0 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:386:1: ( ( rule__EFloatObject__Group__0 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:387:1: ( rule__EFloatObject__Group__0 )
            {
             before(grammarAccess.getEFloatObjectAccess().getGroup()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:388:1: ( rule__EFloatObject__Group__0 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:388:2: rule__EFloatObject__Group__0
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__0_in_ruleEFloatObject756);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:400:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:401:1: ( ruleQualifiedName EOF )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:402:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName783);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName790); 

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:409:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:413:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:414:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:414:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:415:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:416:1: ( rule__QualifiedName__Group__0 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:416:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName816);
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


    // $ANTLR start "rule__NotificationModel__Group__0"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:431:1: rule__NotificationModel__Group__0 : rule__NotificationModel__Group__0__Impl rule__NotificationModel__Group__1 ;
    public final void rule__NotificationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:435:1: ( rule__NotificationModel__Group__0__Impl rule__NotificationModel__Group__1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:436:2: rule__NotificationModel__Group__0__Impl rule__NotificationModel__Group__1
            {
            pushFollow(FOLLOW_rule__NotificationModel__Group__0__Impl_in_rule__NotificationModel__Group__0851);
            rule__NotificationModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NotificationModel__Group__1_in_rule__NotificationModel__Group__0854);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:443:1: rule__NotificationModel__Group__0__Impl : ( 'notifications for module' ) ;
    public final void rule__NotificationModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:447:1: ( ( 'notifications for module' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:448:1: ( 'notifications for module' )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:448:1: ( 'notifications for module' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:449:1: 'notifications for module'
            {
             before(grammarAccess.getNotificationModelAccess().getNotificationsForModuleKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__NotificationModel__Group__0__Impl882); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:462:1: rule__NotificationModel__Group__1 : rule__NotificationModel__Group__1__Impl rule__NotificationModel__Group__2 ;
    public final void rule__NotificationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:466:1: ( rule__NotificationModel__Group__1__Impl rule__NotificationModel__Group__2 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:467:2: rule__NotificationModel__Group__1__Impl rule__NotificationModel__Group__2
            {
            pushFollow(FOLLOW_rule__NotificationModel__Group__1__Impl_in_rule__NotificationModel__Group__1913);
            rule__NotificationModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NotificationModel__Group__2_in_rule__NotificationModel__Group__1916);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:474:1: rule__NotificationModel__Group__1__Impl : ( ( rule__NotificationModel__ModuleAssignment_1 ) ) ;
    public final void rule__NotificationModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:478:1: ( ( ( rule__NotificationModel__ModuleAssignment_1 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:479:1: ( ( rule__NotificationModel__ModuleAssignment_1 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:479:1: ( ( rule__NotificationModel__ModuleAssignment_1 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:480:1: ( rule__NotificationModel__ModuleAssignment_1 )
            {
             before(grammarAccess.getNotificationModelAccess().getModuleAssignment_1()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:481:1: ( rule__NotificationModel__ModuleAssignment_1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:481:2: rule__NotificationModel__ModuleAssignment_1
            {
            pushFollow(FOLLOW_rule__NotificationModel__ModuleAssignment_1_in_rule__NotificationModel__Group__1__Impl943);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:491:1: rule__NotificationModel__Group__2 : rule__NotificationModel__Group__2__Impl rule__NotificationModel__Group__3 ;
    public final void rule__NotificationModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:495:1: ( rule__NotificationModel__Group__2__Impl rule__NotificationModel__Group__3 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:496:2: rule__NotificationModel__Group__2__Impl rule__NotificationModel__Group__3
            {
            pushFollow(FOLLOW_rule__NotificationModel__Group__2__Impl_in_rule__NotificationModel__Group__2973);
            rule__NotificationModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NotificationModel__Group__3_in_rule__NotificationModel__Group__2976);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:503:1: rule__NotificationModel__Group__2__Impl : ( 'version' ) ;
    public final void rule__NotificationModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:507:1: ( ( 'version' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:508:1: ( 'version' )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:508:1: ( 'version' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:509:1: 'version'
            {
             before(grammarAccess.getNotificationModelAccess().getVersionKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__NotificationModel__Group__2__Impl1004); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:522:1: rule__NotificationModel__Group__3 : rule__NotificationModel__Group__3__Impl rule__NotificationModel__Group__4 ;
    public final void rule__NotificationModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:526:1: ( rule__NotificationModel__Group__3__Impl rule__NotificationModel__Group__4 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:527:2: rule__NotificationModel__Group__3__Impl rule__NotificationModel__Group__4
            {
            pushFollow(FOLLOW_rule__NotificationModel__Group__3__Impl_in_rule__NotificationModel__Group__31035);
            rule__NotificationModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NotificationModel__Group__4_in_rule__NotificationModel__Group__31038);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:534:1: rule__NotificationModel__Group__3__Impl : ( ( rule__NotificationModel__VersionAssignment_3 ) ) ;
    public final void rule__NotificationModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:538:1: ( ( ( rule__NotificationModel__VersionAssignment_3 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:539:1: ( ( rule__NotificationModel__VersionAssignment_3 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:539:1: ( ( rule__NotificationModel__VersionAssignment_3 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:540:1: ( rule__NotificationModel__VersionAssignment_3 )
            {
             before(grammarAccess.getNotificationModelAccess().getVersionAssignment_3()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:541:1: ( rule__NotificationModel__VersionAssignment_3 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:541:2: rule__NotificationModel__VersionAssignment_3
            {
            pushFollow(FOLLOW_rule__NotificationModel__VersionAssignment_3_in_rule__NotificationModel__Group__3__Impl1065);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:551:1: rule__NotificationModel__Group__4 : rule__NotificationModel__Group__4__Impl ;
    public final void rule__NotificationModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:555:1: ( rule__NotificationModel__Group__4__Impl )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:556:2: rule__NotificationModel__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__NotificationModel__Group__4__Impl_in_rule__NotificationModel__Group__41095);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:562:1: rule__NotificationModel__Group__4__Impl : ( ( rule__NotificationModel__NotificationsAssignment_4 )* ) ;
    public final void rule__NotificationModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:566:1: ( ( ( rule__NotificationModel__NotificationsAssignment_4 )* ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:567:1: ( ( rule__NotificationModel__NotificationsAssignment_4 )* )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:567:1: ( ( rule__NotificationModel__NotificationsAssignment_4 )* )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:568:1: ( rule__NotificationModel__NotificationsAssignment_4 )*
            {
             before(grammarAccess.getNotificationModelAccess().getNotificationsAssignment_4()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:569:1: ( rule__NotificationModel__NotificationsAssignment_4 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_DOC_COMMENT||LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:569:2: rule__NotificationModel__NotificationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__NotificationModel__NotificationsAssignment_4_in_rule__NotificationModel__Group__4__Impl1122);
            	    rule__NotificationModel__NotificationsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getNotificationModelAccess().getNotificationsAssignment_4()); 

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:589:1: rule__Notification__Group__0 : rule__Notification__Group__0__Impl rule__Notification__Group__1 ;
    public final void rule__Notification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:593:1: ( rule__Notification__Group__0__Impl rule__Notification__Group__1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:594:2: rule__Notification__Group__0__Impl rule__Notification__Group__1
            {
            pushFollow(FOLLOW_rule__Notification__Group__0__Impl_in_rule__Notification__Group__01163);
            rule__Notification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Notification__Group__1_in_rule__Notification__Group__01166);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:601:1: rule__Notification__Group__0__Impl : ( ( rule__Notification__CommentAssignment_0 )? ) ;
    public final void rule__Notification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:605:1: ( ( ( rule__Notification__CommentAssignment_0 )? ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:606:1: ( ( rule__Notification__CommentAssignment_0 )? )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:606:1: ( ( rule__Notification__CommentAssignment_0 )? )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:607:1: ( rule__Notification__CommentAssignment_0 )?
            {
             before(grammarAccess.getNotificationAccess().getCommentAssignment_0()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:608:1: ( rule__Notification__CommentAssignment_0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_DOC_COMMENT) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:608:2: rule__Notification__CommentAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Notification__CommentAssignment_0_in_rule__Notification__Group__0__Impl1193);
                    rule__Notification__CommentAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNotificationAccess().getCommentAssignment_0()); 

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:618:1: rule__Notification__Group__1 : rule__Notification__Group__1__Impl rule__Notification__Group__2 ;
    public final void rule__Notification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:622:1: ( rule__Notification__Group__1__Impl rule__Notification__Group__2 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:623:2: rule__Notification__Group__1__Impl rule__Notification__Group__2
            {
            pushFollow(FOLLOW_rule__Notification__Group__1__Impl_in_rule__Notification__Group__11224);
            rule__Notification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Notification__Group__2_in_rule__Notification__Group__11227);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:630:1: rule__Notification__Group__1__Impl : ( 'notification' ) ;
    public final void rule__Notification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:634:1: ( ( 'notification' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:635:1: ( 'notification' )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:635:1: ( 'notification' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:636:1: 'notification'
            {
             before(grammarAccess.getNotificationAccess().getNotificationKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__Notification__Group__1__Impl1255); 
             after(grammarAccess.getNotificationAccess().getNotificationKeyword_1()); 

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:649:1: rule__Notification__Group__2 : rule__Notification__Group__2__Impl rule__Notification__Group__3 ;
    public final void rule__Notification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:653:1: ( rule__Notification__Group__2__Impl rule__Notification__Group__3 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:654:2: rule__Notification__Group__2__Impl rule__Notification__Group__3
            {
            pushFollow(FOLLOW_rule__Notification__Group__2__Impl_in_rule__Notification__Group__21286);
            rule__Notification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Notification__Group__3_in_rule__Notification__Group__21289);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:661:1: rule__Notification__Group__2__Impl : ( ( rule__Notification__NameAssignment_2 ) ) ;
    public final void rule__Notification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:665:1: ( ( ( rule__Notification__NameAssignment_2 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:666:1: ( ( rule__Notification__NameAssignment_2 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:666:1: ( ( rule__Notification__NameAssignment_2 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:667:1: ( rule__Notification__NameAssignment_2 )
            {
             before(grammarAccess.getNotificationAccess().getNameAssignment_2()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:668:1: ( rule__Notification__NameAssignment_2 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:668:2: rule__Notification__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Notification__NameAssignment_2_in_rule__Notification__Group__2__Impl1316);
            rule__Notification__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNotificationAccess().getNameAssignment_2()); 

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:678:1: rule__Notification__Group__3 : rule__Notification__Group__3__Impl rule__Notification__Group__4 ;
    public final void rule__Notification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:682:1: ( rule__Notification__Group__3__Impl rule__Notification__Group__4 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:683:2: rule__Notification__Group__3__Impl rule__Notification__Group__4
            {
            pushFollow(FOLLOW_rule__Notification__Group__3__Impl_in_rule__Notification__Group__31346);
            rule__Notification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Notification__Group__4_in_rule__Notification__Group__31349);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:690:1: rule__Notification__Group__3__Impl : ( '{' ) ;
    public final void rule__Notification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:694:1: ( ( '{' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:695:1: ( '{' )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:695:1: ( '{' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:696:1: '{'
            {
             before(grammarAccess.getNotificationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__Notification__Group__3__Impl1377); 
             after(grammarAccess.getNotificationAccess().getLeftCurlyBracketKeyword_3()); 

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:709:1: rule__Notification__Group__4 : rule__Notification__Group__4__Impl rule__Notification__Group__5 ;
    public final void rule__Notification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:713:1: ( rule__Notification__Group__4__Impl rule__Notification__Group__5 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:714:2: rule__Notification__Group__4__Impl rule__Notification__Group__5
            {
            pushFollow(FOLLOW_rule__Notification__Group__4__Impl_in_rule__Notification__Group__41408);
            rule__Notification__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Notification__Group__5_in_rule__Notification__Group__41411);
            rule__Notification__Group__5();

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:721:1: rule__Notification__Group__4__Impl : ( ( rule__Notification__FeaturesAssignment_4 )* ) ;
    public final void rule__Notification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:725:1: ( ( ( rule__Notification__FeaturesAssignment_4 )* ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:726:1: ( ( rule__Notification__FeaturesAssignment_4 )* )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:726:1: ( ( rule__Notification__FeaturesAssignment_4 )* )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:727:1: ( rule__Notification__FeaturesAssignment_4 )*
            {
             before(grammarAccess.getNotificationAccess().getFeaturesAssignment_4()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:728:1: ( rule__Notification__FeaturesAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_DOC_COMMENT)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:728:2: rule__Notification__FeaturesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Notification__FeaturesAssignment_4_in_rule__Notification__Group__4__Impl1438);
            	    rule__Notification__FeaturesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getNotificationAccess().getFeaturesAssignment_4()); 

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


    // $ANTLR start "rule__Notification__Group__5"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:738:1: rule__Notification__Group__5 : rule__Notification__Group__5__Impl ;
    public final void rule__Notification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:742:1: ( rule__Notification__Group__5__Impl )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:743:2: rule__Notification__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Notification__Group__5__Impl_in_rule__Notification__Group__51469);
            rule__Notification__Group__5__Impl();

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
    // $ANTLR end "rule__Notification__Group__5"


    // $ANTLR start "rule__Notification__Group__5__Impl"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:749:1: rule__Notification__Group__5__Impl : ( '}' ) ;
    public final void rule__Notification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:753:1: ( ( '}' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:754:1: ( '}' )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:754:1: ( '}' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:755:1: '}'
            {
             before(grammarAccess.getNotificationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_16_in_rule__Notification__Group__5__Impl1497); 
             after(grammarAccess.getNotificationAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Notification__Group__5__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:780:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:784:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:785:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__01540);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__01543);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:792:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__CommentAssignment_0 )? ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:796:1: ( ( ( rule__Feature__CommentAssignment_0 )? ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:797:1: ( ( rule__Feature__CommentAssignment_0 )? )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:797:1: ( ( rule__Feature__CommentAssignment_0 )? )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:798:1: ( rule__Feature__CommentAssignment_0 )?
            {
             before(grammarAccess.getFeatureAccess().getCommentAssignment_0()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:799:1: ( rule__Feature__CommentAssignment_0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_DOC_COMMENT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:799:2: rule__Feature__CommentAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Feature__CommentAssignment_0_in_rule__Feature__Group__0__Impl1570);
                    rule__Feature__CommentAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getCommentAssignment_0()); 

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:809:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:813:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:814:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__11601);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__11604);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:821:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__TypeAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:825:1: ( ( ( rule__Feature__TypeAssignment_1 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:826:1: ( ( rule__Feature__TypeAssignment_1 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:826:1: ( ( rule__Feature__TypeAssignment_1 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:827:1: ( rule__Feature__TypeAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getTypeAssignment_1()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:828:1: ( rule__Feature__TypeAssignment_1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:828:2: rule__Feature__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Feature__TypeAssignment_1_in_rule__Feature__Group__1__Impl1631);
            rule__Feature__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getTypeAssignment_1()); 

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:838:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:842:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:843:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__21661);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__21664);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:850:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__NameAssignment_2 ) ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:854:1: ( ( ( rule__Feature__NameAssignment_2 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:855:1: ( ( rule__Feature__NameAssignment_2 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:855:1: ( ( rule__Feature__NameAssignment_2 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:856:1: ( rule__Feature__NameAssignment_2 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_2()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:857:1: ( rule__Feature__NameAssignment_2 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:857:2: rule__Feature__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Feature__NameAssignment_2_in_rule__Feature__Group__2__Impl1691);
            rule__Feature__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_2()); 

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:867:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:871:1: ( rule__Feature__Group__3__Impl )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:872:2: rule__Feature__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__31721);
            rule__Feature__Group__3__Impl();

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:878:1: rule__Feature__Group__3__Impl : ( ';' ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:882:1: ( ( ';' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:883:1: ( ';' )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:883:1: ( ';' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:884:1: ';'
            {
             before(grammarAccess.getFeatureAccess().getSemicolonKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__Feature__Group__3__Impl1749); 
             after(grammarAccess.getFeatureAccess().getSemicolonKeyword_3()); 

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


    // $ANTLR start "rule__Primitive__Group__0"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:906:1: rule__Primitive__Group__0 : rule__Primitive__Group__0__Impl rule__Primitive__Group__1 ;
    public final void rule__Primitive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:910:1: ( rule__Primitive__Group__0__Impl rule__Primitive__Group__1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:911:2: rule__Primitive__Group__0__Impl rule__Primitive__Group__1
            {
            pushFollow(FOLLOW_rule__Primitive__Group__0__Impl_in_rule__Primitive__Group__01789);
            rule__Primitive__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primitive__Group__1_in_rule__Primitive__Group__01792);
            rule__Primitive__Group__1();

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
    // $ANTLR end "rule__Primitive__Group__0"


    // $ANTLR start "rule__Primitive__Group__0__Impl"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:918:1: rule__Primitive__Group__0__Impl : ( 'primitive type' ) ;
    public final void rule__Primitive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:922:1: ( ( 'primitive type' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:923:1: ( 'primitive type' )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:923:1: ( 'primitive type' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:924:1: 'primitive type'
            {
             before(grammarAccess.getPrimitiveAccess().getPrimitiveTypeKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Primitive__Group__0__Impl1820); 
             after(grammarAccess.getPrimitiveAccess().getPrimitiveTypeKeyword_0()); 

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
    // $ANTLR end "rule__Primitive__Group__0__Impl"


    // $ANTLR start "rule__Primitive__Group__1"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:937:1: rule__Primitive__Group__1 : rule__Primitive__Group__1__Impl ;
    public final void rule__Primitive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:941:1: ( rule__Primitive__Group__1__Impl )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:942:2: rule__Primitive__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Primitive__Group__1__Impl_in_rule__Primitive__Group__11851);
            rule__Primitive__Group__1__Impl();

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
    // $ANTLR end "rule__Primitive__Group__1"


    // $ANTLR start "rule__Primitive__Group__1__Impl"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:948:1: rule__Primitive__Group__1__Impl : ( ( rule__Primitive__NameAssignment_1 ) ) ;
    public final void rule__Primitive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:952:1: ( ( ( rule__Primitive__NameAssignment_1 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:953:1: ( ( rule__Primitive__NameAssignment_1 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:953:1: ( ( rule__Primitive__NameAssignment_1 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:954:1: ( rule__Primitive__NameAssignment_1 )
            {
             before(grammarAccess.getPrimitiveAccess().getNameAssignment_1()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:955:1: ( rule__Primitive__NameAssignment_1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:955:2: rule__Primitive__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Primitive__NameAssignment_1_in_rule__Primitive__Group__1__Impl1878);
            rule__Primitive__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Primitive__Group__1__Impl"


    // $ANTLR start "rule__Any__Group__0"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:969:1: rule__Any__Group__0 : rule__Any__Group__0__Impl rule__Any__Group__1 ;
    public final void rule__Any__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:973:1: ( rule__Any__Group__0__Impl rule__Any__Group__1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:974:2: rule__Any__Group__0__Impl rule__Any__Group__1
            {
            pushFollow(FOLLOW_rule__Any__Group__0__Impl_in_rule__Any__Group__01912);
            rule__Any__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Any__Group__1_in_rule__Any__Group__01915);
            rule__Any__Group__1();

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
    // $ANTLR end "rule__Any__Group__0"


    // $ANTLR start "rule__Any__Group__0__Impl"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:981:1: rule__Any__Group__0__Impl : ( 'any type' ) ;
    public final void rule__Any__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:985:1: ( ( 'any type' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:986:1: ( 'any type' )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:986:1: ( 'any type' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:987:1: 'any type'
            {
             before(grammarAccess.getAnyAccess().getAnyTypeKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Any__Group__0__Impl1943); 
             after(grammarAccess.getAnyAccess().getAnyTypeKeyword_0()); 

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
    // $ANTLR end "rule__Any__Group__0__Impl"


    // $ANTLR start "rule__Any__Group__1"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1000:1: rule__Any__Group__1 : rule__Any__Group__1__Impl ;
    public final void rule__Any__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1004:1: ( rule__Any__Group__1__Impl )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1005:2: rule__Any__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Any__Group__1__Impl_in_rule__Any__Group__11974);
            rule__Any__Group__1__Impl();

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
    // $ANTLR end "rule__Any__Group__1"


    // $ANTLR start "rule__Any__Group__1__Impl"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1011:1: rule__Any__Group__1__Impl : ( ( rule__Any__NameAssignment_1 ) ) ;
    public final void rule__Any__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1015:1: ( ( ( rule__Any__NameAssignment_1 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1016:1: ( ( rule__Any__NameAssignment_1 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1016:1: ( ( rule__Any__NameAssignment_1 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1017:1: ( rule__Any__NameAssignment_1 )
            {
             before(grammarAccess.getAnyAccess().getNameAssignment_1()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1018:1: ( rule__Any__NameAssignment_1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1018:2: rule__Any__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Any__NameAssignment_1_in_rule__Any__Group__1__Impl2001);
            rule__Any__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAnyAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Any__Group__1__Impl"


    // $ANTLR start "rule__TypeRef__Group__0"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1032:1: rule__TypeRef__Group__0 : rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 ;
    public final void rule__TypeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1036:1: ( rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1037:2: rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__02035);
            rule__TypeRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__02038);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1044:1: rule__TypeRef__Group__0__Impl : ( ( rule__TypeRef__ReferencedAssignment_0 ) ) ;
    public final void rule__TypeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1048:1: ( ( ( rule__TypeRef__ReferencedAssignment_0 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1049:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1049:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1050:1: ( rule__TypeRef__ReferencedAssignment_0 )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedAssignment_0()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1051:1: ( rule__TypeRef__ReferencedAssignment_0 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1051:2: rule__TypeRef__ReferencedAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl2065);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1061:1: rule__TypeRef__Group__1 : rule__TypeRef__Group__1__Impl ;
    public final void rule__TypeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1065:1: ( rule__TypeRef__Group__1__Impl )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1066:2: rule__TypeRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__12095);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1072:1: rule__TypeRef__Group__1__Impl : ( ( rule__TypeRef__IsMultiAssignment_1 )? ) ;
    public final void rule__TypeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1076:1: ( ( ( rule__TypeRef__IsMultiAssignment_1 )? ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1077:1: ( ( rule__TypeRef__IsMultiAssignment_1 )? )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1077:1: ( ( rule__TypeRef__IsMultiAssignment_1 )? )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1078:1: ( rule__TypeRef__IsMultiAssignment_1 )?
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiAssignment_1()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1079:1: ( rule__TypeRef__IsMultiAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1079:2: rule__TypeRef__IsMultiAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TypeRef__IsMultiAssignment_1_in_rule__TypeRef__Group__1__Impl2122);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1093:1: rule__EFloatObject__Group__0 : rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1 ;
    public final void rule__EFloatObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1097:1: ( rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1098:2: rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__0__Impl_in_rule__EFloatObject__Group__02157);
            rule__EFloatObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__1_in_rule__EFloatObject__Group__02160);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1105:1: rule__EFloatObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloatObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1109:1: ( ( ( '-' )? ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1110:1: ( ( '-' )? )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1110:1: ( ( '-' )? )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1111:1: ( '-' )?
            {
             before(grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1112:1: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1113:2: '-'
                    {
                    match(input,20,FOLLOW_20_in_rule__EFloatObject__Group__0__Impl2189); 

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1124:1: rule__EFloatObject__Group__1 : rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2 ;
    public final void rule__EFloatObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1128:1: ( rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1129:2: rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__1__Impl_in_rule__EFloatObject__Group__12222);
            rule__EFloatObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__2_in_rule__EFloatObject__Group__12225);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1136:1: rule__EFloatObject__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloatObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1140:1: ( ( ( RULE_INT )? ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1141:1: ( ( RULE_INT )? )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1141:1: ( ( RULE_INT )? )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1142:1: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1143:1: ( RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1143:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EFloatObject__Group__1__Impl2253); 

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1153:1: rule__EFloatObject__Group__2 : rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3 ;
    public final void rule__EFloatObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1157:1: ( rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1158:2: rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__2__Impl_in_rule__EFloatObject__Group__22284);
            rule__EFloatObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__3_in_rule__EFloatObject__Group__22287);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1165:1: rule__EFloatObject__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloatObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1169:1: ( ( '.' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1170:1: ( '.' )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1170:1: ( '.' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1171:1: '.'
            {
             before(grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__EFloatObject__Group__2__Impl2315); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1184:1: rule__EFloatObject__Group__3 : rule__EFloatObject__Group__3__Impl ;
    public final void rule__EFloatObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1188:1: ( rule__EFloatObject__Group__3__Impl )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1189:2: rule__EFloatObject__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__3__Impl_in_rule__EFloatObject__Group__32346);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1195:1: rule__EFloatObject__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloatObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1199:1: ( ( RULE_INT ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1200:1: ( RULE_INT )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1200:1: ( RULE_INT )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1201:1: RULE_INT
            {
             before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EFloatObject__Group__3__Impl2373); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1220:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1224:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1225:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02410);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02413);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1232:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1236:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1237:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1237:1: ( RULE_ID )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1238:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2440); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1249:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1253:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1254:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12469);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1260:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1264:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1265:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1265:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1266:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1267:1: ( rule__QualifiedName__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1267:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2496);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1281:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1285:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1286:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02531);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02534);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1293:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1297:1: ( ( '.' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1298:1: ( '.' )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1298:1: ( '.' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1299:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,21,FOLLOW_21_in_rule__QualifiedName__Group_1__0__Impl2562); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1312:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1316:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1317:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12593);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1323:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1327:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1328:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1328:1: ( RULE_ID )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1329:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2620); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1345:1: rule__NotificationModel__ModuleAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__NotificationModel__ModuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1349:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1350:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1350:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1351:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getNotificationModelAccess().getModuleModuleCrossReference_1_0()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1352:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1353:1: ruleQualifiedName
            {
             before(grammarAccess.getNotificationModelAccess().getModuleModuleQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__NotificationModel__ModuleAssignment_12662);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1364:1: rule__NotificationModel__VersionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__NotificationModel__VersionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1368:1: ( ( RULE_STRING ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1369:1: ( RULE_STRING )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1369:1: ( RULE_STRING )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1370:1: RULE_STRING
            {
             before(grammarAccess.getNotificationModelAccess().getVersionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NotificationModel__VersionAssignment_32697); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1379:1: rule__NotificationModel__NotificationsAssignment_4 : ( ruleNotification ) ;
    public final void rule__NotificationModel__NotificationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1383:1: ( ( ruleNotification ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1384:1: ( ruleNotification )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1384:1: ( ruleNotification )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1385:1: ruleNotification
            {
             before(grammarAccess.getNotificationModelAccess().getNotificationsNotificationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleNotification_in_rule__NotificationModel__NotificationsAssignment_42728);
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


    // $ANTLR start "rule__Notification__CommentAssignment_0"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1394:1: rule__Notification__CommentAssignment_0 : ( RULE_DOC_COMMENT ) ;
    public final void rule__Notification__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1398:1: ( ( RULE_DOC_COMMENT ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1399:1: ( RULE_DOC_COMMENT )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1399:1: ( RULE_DOC_COMMENT )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1400:1: RULE_DOC_COMMENT
            {
             before(grammarAccess.getNotificationAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_rule__Notification__CommentAssignment_02759); 
             after(grammarAccess.getNotificationAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Notification__CommentAssignment_0"


    // $ANTLR start "rule__Notification__NameAssignment_2"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1409:1: rule__Notification__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Notification__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1413:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1414:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1414:1: ( RULE_ID )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1415:1: RULE_ID
            {
             before(grammarAccess.getNotificationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Notification__NameAssignment_22790); 
             after(grammarAccess.getNotificationAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Notification__NameAssignment_2"


    // $ANTLR start "rule__Notification__FeaturesAssignment_4"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1424:1: rule__Notification__FeaturesAssignment_4 : ( ruleFeature ) ;
    public final void rule__Notification__FeaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1428:1: ( ( ruleFeature ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1429:1: ( ruleFeature )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1429:1: ( ruleFeature )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1430:1: ruleFeature
            {
             before(grammarAccess.getNotificationAccess().getFeaturesFeatureParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Notification__FeaturesAssignment_42821);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getNotificationAccess().getFeaturesFeatureParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Notification__FeaturesAssignment_4"


    // $ANTLR start "rule__Feature__CommentAssignment_0"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1439:1: rule__Feature__CommentAssignment_0 : ( RULE_DOC_COMMENT ) ;
    public final void rule__Feature__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1443:1: ( ( RULE_DOC_COMMENT ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1444:1: ( RULE_DOC_COMMENT )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1444:1: ( RULE_DOC_COMMENT )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1445:1: RULE_DOC_COMMENT
            {
             before(grammarAccess.getFeatureAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_rule__Feature__CommentAssignment_02852); 
             after(grammarAccess.getFeatureAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Feature__CommentAssignment_0"


    // $ANTLR start "rule__Feature__TypeAssignment_1"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1454:1: rule__Feature__TypeAssignment_1 : ( ruleTypeRef ) ;
    public final void rule__Feature__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1458:1: ( ( ruleTypeRef ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1459:1: ( ruleTypeRef )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1459:1: ( ruleTypeRef )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1460:1: ruleTypeRef
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeRefParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Feature__TypeAssignment_12883);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getTypeTypeRefParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Feature__TypeAssignment_1"


    // $ANTLR start "rule__Feature__NameAssignment_2"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1469:1: rule__Feature__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1473:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1474:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1474:1: ( RULE_ID )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1475:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_22914); 
             after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Feature__NameAssignment_2"


    // $ANTLR start "rule__Primitive__NameAssignment_1"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1486:1: rule__Primitive__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Primitive__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1490:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1491:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1491:1: ( RULE_ID )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1492:1: RULE_ID
            {
             before(grammarAccess.getPrimitiveAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Primitive__NameAssignment_12947); 
             after(grammarAccess.getPrimitiveAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Primitive__NameAssignment_1"


    // $ANTLR start "rule__Any__NameAssignment_1"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1501:1: rule__Any__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Any__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1505:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1506:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1506:1: ( RULE_ID )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1507:1: RULE_ID
            {
             before(grammarAccess.getAnyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Any__NameAssignment_12978); 
             after(grammarAccess.getAnyAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Any__NameAssignment_1"


    // $ANTLR start "rule__TypeRef__ReferencedAssignment_0"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1516:1: rule__TypeRef__ReferencedAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TypeRef__ReferencedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1520:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1521:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1521:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1522:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1523:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1524:1: ruleQualifiedName
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_03013);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1535:1: rule__TypeRef__IsMultiAssignment_1 : ( ( '[]' ) ) ;
    public final void rule__TypeRef__IsMultiAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1539:1: ( ( ( '[]' ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1540:1: ( ( '[]' ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1540:1: ( ( '[]' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1541:1: ( '[]' )
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1542:1: ( '[]' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1543:1: '[]'
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            match(input,22,FOLLOW_22_in_rule__TypeRef__IsMultiAssignment_13053); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1558:1: rule__StringValue__ValueAssignment : ( ruleEStringObject ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1562:1: ( ( ruleEStringObject ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1563:1: ( ruleEStringObject )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1563:1: ( ruleEStringObject )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1564:1: ruleEStringObject
            {
             before(grammarAccess.getStringValueAccess().getValueEStringObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEStringObject_in_rule__StringValue__ValueAssignment3092);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1573:1: rule__IntegerValue__ValueAssignment : ( ruleEIntegerObject ) ;
    public final void rule__IntegerValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1577:1: ( ( ruleEIntegerObject ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1578:1: ( ruleEIntegerObject )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1578:1: ( ruleEIntegerObject )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1579:1: ruleEIntegerObject
            {
             before(grammarAccess.getIntegerValueAccess().getValueEIntegerObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_rule__IntegerValue__ValueAssignment3123);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1588:1: rule__FloatValue__ValueAssignment : ( ruleEFloatObject ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1592:1: ( ( ruleEFloatObject ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1593:1: ( ruleEFloatObject )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1593:1: ( ruleEFloatObject )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1594:1: ruleEFloatObject
            {
             before(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_rule__FloatValue__ValueAssignment3154);
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
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__0_in_rulePrimitive276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAny_in_entryRuleAny303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAny310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__Group__0_in_ruleAny336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_entryRuleEStringObject485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEStringObject492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEStringObject518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerValue__ValueAssignment_in_ruleIntegerValue577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEIntegerObject611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEIntegerObject637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEFloatObject730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__0_in_ruleEFloatObject756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationModel__Group__0__Impl_in_rule__NotificationModel__Group__0851 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__NotificationModel__Group__1_in_rule__NotificationModel__Group__0854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__NotificationModel__Group__0__Impl882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationModel__Group__1__Impl_in_rule__NotificationModel__Group__1913 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__NotificationModel__Group__2_in_rule__NotificationModel__Group__1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationModel__ModuleAssignment_1_in_rule__NotificationModel__Group__1__Impl943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationModel__Group__2__Impl_in_rule__NotificationModel__Group__2973 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NotificationModel__Group__3_in_rule__NotificationModel__Group__2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__NotificationModel__Group__2__Impl1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationModel__Group__3__Impl_in_rule__NotificationModel__Group__31035 = new BitSet(new long[]{0x0000000000004080L});
    public static final BitSet FOLLOW_rule__NotificationModel__Group__4_in_rule__NotificationModel__Group__31038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationModel__VersionAssignment_3_in_rule__NotificationModel__Group__3__Impl1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationModel__Group__4__Impl_in_rule__NotificationModel__Group__41095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationModel__NotificationsAssignment_4_in_rule__NotificationModel__Group__4__Impl1122 = new BitSet(new long[]{0x0000000000004082L});
    public static final BitSet FOLLOW_rule__Notification__Group__0__Impl_in_rule__Notification__Group__01163 = new BitSet(new long[]{0x0000000000004080L});
    public static final BitSet FOLLOW_rule__Notification__Group__1_in_rule__Notification__Group__01166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Notification__CommentAssignment_0_in_rule__Notification__Group__0__Impl1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Notification__Group__1__Impl_in_rule__Notification__Group__11224 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Notification__Group__2_in_rule__Notification__Group__11227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Notification__Group__1__Impl1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Notification__Group__2__Impl_in_rule__Notification__Group__21286 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Notification__Group__3_in_rule__Notification__Group__21289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Notification__NameAssignment_2_in_rule__Notification__Group__2__Impl1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Notification__Group__3__Impl_in_rule__Notification__Group__31346 = new BitSet(new long[]{0x00000000000100C0L});
    public static final BitSet FOLLOW_rule__Notification__Group__4_in_rule__Notification__Group__31349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Notification__Group__3__Impl1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Notification__Group__4__Impl_in_rule__Notification__Group__41408 = new BitSet(new long[]{0x00000000000100C0L});
    public static final BitSet FOLLOW_rule__Notification__Group__5_in_rule__Notification__Group__41411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Notification__FeaturesAssignment_4_in_rule__Notification__Group__4__Impl1438 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_rule__Notification__Group__5__Impl_in_rule__Notification__Group__51469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Notification__Group__5__Impl1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__01540 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__01543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__CommentAssignment_0_in_rule__Feature__Group__0__Impl1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__11601 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__11604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__TypeAssignment_1_in_rule__Feature__Group__1__Impl1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__21661 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__21664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__NameAssignment_2_in_rule__Feature__Group__2__Impl1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__31721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Feature__Group__3__Impl1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__0__Impl_in_rule__Primitive__Group__01789 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Primitive__Group__1_in_rule__Primitive__Group__01792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Primitive__Group__0__Impl1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__1__Impl_in_rule__Primitive__Group__11851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__NameAssignment_1_in_rule__Primitive__Group__1__Impl1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__Group__0__Impl_in_rule__Any__Group__01912 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Any__Group__1_in_rule__Any__Group__01915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Any__Group__0__Impl1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__Group__1__Impl_in_rule__Any__Group__11974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__NameAssignment_1_in_rule__Any__Group__1__Impl2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__02035 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__02038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl2065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__12095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__IsMultiAssignment_1_in_rule__TypeRef__Group__1__Impl2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__0__Impl_in_rule__EFloatObject__Group__02157 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__1_in_rule__EFloatObject__Group__02160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EFloatObject__Group__0__Impl2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__1__Impl_in_rule__EFloatObject__Group__12222 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__2_in_rule__EFloatObject__Group__12225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group__1__Impl2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__2__Impl_in_rule__EFloatObject__Group__22284 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__3_in_rule__EFloatObject__Group__22287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EFloatObject__Group__2__Impl2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__3__Impl_in_rule__EFloatObject__Group__32346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group__3__Impl2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02410 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2496 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02531 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__QualifiedName__Group_1__0__Impl2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__NotificationModel__ModuleAssignment_12662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__NotificationModel__VersionAssignment_32697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotification_in_rule__NotificationModel__NotificationsAssignment_42728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_rule__Notification__CommentAssignment_02759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Notification__NameAssignment_22790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Notification__FeaturesAssignment_42821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_rule__Feature__CommentAssignment_02852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Feature__TypeAssignment_12883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_22914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Primitive__NameAssignment_12947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Any__NameAssignment_12978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_03013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TypeRef__IsMultiAssignment_13053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_rule__StringValue__ValueAssignment3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_rule__IntegerValue__ValueAssignment3123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_rule__FloatValue__ValueAssignment3154 = new BitSet(new long[]{0x0000000000000002L});

}