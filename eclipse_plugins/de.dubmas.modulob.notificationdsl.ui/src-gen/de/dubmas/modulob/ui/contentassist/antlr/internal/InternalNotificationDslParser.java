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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'notifications for module'", "'version'", "'notification'", "'{'", "'}'", "';'", "'primitive type'", "'any type'", "'-'", "'.'", "'[]'"
    };
    public static final int RULE_ID=6;
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
            match(input,11,FOLLOW_11_in_rule__NotificationModel__Group__0__Impl882); 
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
            match(input,12,FOLLOW_12_in_rule__NotificationModel__Group__2__Impl1004); 
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

                if ( (LA1_0==13) ) {
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:601:1: rule__Notification__Group__0__Impl : ( 'notification' ) ;
    public final void rule__Notification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:605:1: ( ( 'notification' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:606:1: ( 'notification' )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:606:1: ( 'notification' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:607:1: 'notification'
            {
             before(grammarAccess.getNotificationAccess().getNotificationKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Notification__Group__0__Impl1194); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:620:1: rule__Notification__Group__1 : rule__Notification__Group__1__Impl rule__Notification__Group__2 ;
    public final void rule__Notification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:624:1: ( rule__Notification__Group__1__Impl rule__Notification__Group__2 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:625:2: rule__Notification__Group__1__Impl rule__Notification__Group__2
            {
            pushFollow(FOLLOW_rule__Notification__Group__1__Impl_in_rule__Notification__Group__11225);
            rule__Notification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Notification__Group__2_in_rule__Notification__Group__11228);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:632:1: rule__Notification__Group__1__Impl : ( ( rule__Notification__NameAssignment_1 ) ) ;
    public final void rule__Notification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:636:1: ( ( ( rule__Notification__NameAssignment_1 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:637:1: ( ( rule__Notification__NameAssignment_1 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:637:1: ( ( rule__Notification__NameAssignment_1 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:638:1: ( rule__Notification__NameAssignment_1 )
            {
             before(grammarAccess.getNotificationAccess().getNameAssignment_1()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:639:1: ( rule__Notification__NameAssignment_1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:639:2: rule__Notification__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Notification__NameAssignment_1_in_rule__Notification__Group__1__Impl1255);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:649:1: rule__Notification__Group__2 : rule__Notification__Group__2__Impl rule__Notification__Group__3 ;
    public final void rule__Notification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:653:1: ( rule__Notification__Group__2__Impl rule__Notification__Group__3 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:654:2: rule__Notification__Group__2__Impl rule__Notification__Group__3
            {
            pushFollow(FOLLOW_rule__Notification__Group__2__Impl_in_rule__Notification__Group__21285);
            rule__Notification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Notification__Group__3_in_rule__Notification__Group__21288);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:661:1: rule__Notification__Group__2__Impl : ( '{' ) ;
    public final void rule__Notification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:665:1: ( ( '{' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:666:1: ( '{' )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:666:1: ( '{' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:667:1: '{'
            {
             before(grammarAccess.getNotificationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Notification__Group__2__Impl1316); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:680:1: rule__Notification__Group__3 : rule__Notification__Group__3__Impl rule__Notification__Group__4 ;
    public final void rule__Notification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:684:1: ( rule__Notification__Group__3__Impl rule__Notification__Group__4 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:685:2: rule__Notification__Group__3__Impl rule__Notification__Group__4
            {
            pushFollow(FOLLOW_rule__Notification__Group__3__Impl_in_rule__Notification__Group__31347);
            rule__Notification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Notification__Group__4_in_rule__Notification__Group__31350);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:692:1: rule__Notification__Group__3__Impl : ( ( rule__Notification__FeaturesAssignment_3 )* ) ;
    public final void rule__Notification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:696:1: ( ( ( rule__Notification__FeaturesAssignment_3 )* ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:697:1: ( ( rule__Notification__FeaturesAssignment_3 )* )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:697:1: ( ( rule__Notification__FeaturesAssignment_3 )* )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:698:1: ( rule__Notification__FeaturesAssignment_3 )*
            {
             before(grammarAccess.getNotificationAccess().getFeaturesAssignment_3()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:699:1: ( rule__Notification__FeaturesAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:699:2: rule__Notification__FeaturesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Notification__FeaturesAssignment_3_in_rule__Notification__Group__3__Impl1377);
            	    rule__Notification__FeaturesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:709:1: rule__Notification__Group__4 : rule__Notification__Group__4__Impl ;
    public final void rule__Notification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:713:1: ( rule__Notification__Group__4__Impl )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:714:2: rule__Notification__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Notification__Group__4__Impl_in_rule__Notification__Group__41408);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:720:1: rule__Notification__Group__4__Impl : ( '}' ) ;
    public final void rule__Notification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:724:1: ( ( '}' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:725:1: ( '}' )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:725:1: ( '}' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:726:1: '}'
            {
             before(grammarAccess.getNotificationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__Notification__Group__4__Impl1436); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:749:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:753:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:754:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__01477);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__01480);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:761:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__TypeAssignment_0 ) ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:765:1: ( ( ( rule__Feature__TypeAssignment_0 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:766:1: ( ( rule__Feature__TypeAssignment_0 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:766:1: ( ( rule__Feature__TypeAssignment_0 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:767:1: ( rule__Feature__TypeAssignment_0 )
            {
             before(grammarAccess.getFeatureAccess().getTypeAssignment_0()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:768:1: ( rule__Feature__TypeAssignment_0 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:768:2: rule__Feature__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Feature__TypeAssignment_0_in_rule__Feature__Group__0__Impl1507);
            rule__Feature__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getTypeAssignment_0()); 

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:778:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:782:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:783:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__11537);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__11540);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:790:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__NameAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:794:1: ( ( ( rule__Feature__NameAssignment_1 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:795:1: ( ( rule__Feature__NameAssignment_1 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:795:1: ( ( rule__Feature__NameAssignment_1 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:796:1: ( rule__Feature__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_1()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:797:1: ( rule__Feature__NameAssignment_1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:797:2: rule__Feature__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Feature__NameAssignment_1_in_rule__Feature__Group__1__Impl1567);
            rule__Feature__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_1()); 

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:807:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:811:1: ( rule__Feature__Group__2__Impl )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:812:2: rule__Feature__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__21597);
            rule__Feature__Group__2__Impl();

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:818:1: rule__Feature__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:822:1: ( ( ( ';' )? ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:823:1: ( ( ';' )? )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:823:1: ( ( ';' )? )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:824:1: ( ';' )?
            {
             before(grammarAccess.getFeatureAccess().getSemicolonKeyword_2()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:825:1: ( ';' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:826:2: ';'
                    {
                    match(input,16,FOLLOW_16_in_rule__Feature__Group__2__Impl1626); 

                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getSemicolonKeyword_2()); 

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


    // $ANTLR start "rule__Primitive__Group__0"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:844:1: rule__Primitive__Group__0 : rule__Primitive__Group__0__Impl rule__Primitive__Group__1 ;
    public final void rule__Primitive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:848:1: ( rule__Primitive__Group__0__Impl rule__Primitive__Group__1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:849:2: rule__Primitive__Group__0__Impl rule__Primitive__Group__1
            {
            pushFollow(FOLLOW_rule__Primitive__Group__0__Impl_in_rule__Primitive__Group__01666);
            rule__Primitive__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primitive__Group__1_in_rule__Primitive__Group__01669);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:856:1: rule__Primitive__Group__0__Impl : ( 'primitive type' ) ;
    public final void rule__Primitive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:860:1: ( ( 'primitive type' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:861:1: ( 'primitive type' )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:861:1: ( 'primitive type' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:862:1: 'primitive type'
            {
             before(grammarAccess.getPrimitiveAccess().getPrimitiveTypeKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Primitive__Group__0__Impl1697); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:875:1: rule__Primitive__Group__1 : rule__Primitive__Group__1__Impl ;
    public final void rule__Primitive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:879:1: ( rule__Primitive__Group__1__Impl )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:880:2: rule__Primitive__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Primitive__Group__1__Impl_in_rule__Primitive__Group__11728);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:886:1: rule__Primitive__Group__1__Impl : ( ( rule__Primitive__NameAssignment_1 ) ) ;
    public final void rule__Primitive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:890:1: ( ( ( rule__Primitive__NameAssignment_1 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:891:1: ( ( rule__Primitive__NameAssignment_1 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:891:1: ( ( rule__Primitive__NameAssignment_1 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:892:1: ( rule__Primitive__NameAssignment_1 )
            {
             before(grammarAccess.getPrimitiveAccess().getNameAssignment_1()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:893:1: ( rule__Primitive__NameAssignment_1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:893:2: rule__Primitive__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Primitive__NameAssignment_1_in_rule__Primitive__Group__1__Impl1755);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:907:1: rule__Any__Group__0 : rule__Any__Group__0__Impl rule__Any__Group__1 ;
    public final void rule__Any__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:911:1: ( rule__Any__Group__0__Impl rule__Any__Group__1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:912:2: rule__Any__Group__0__Impl rule__Any__Group__1
            {
            pushFollow(FOLLOW_rule__Any__Group__0__Impl_in_rule__Any__Group__01789);
            rule__Any__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Any__Group__1_in_rule__Any__Group__01792);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:919:1: rule__Any__Group__0__Impl : ( 'any type' ) ;
    public final void rule__Any__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:923:1: ( ( 'any type' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:924:1: ( 'any type' )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:924:1: ( 'any type' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:925:1: 'any type'
            {
             before(grammarAccess.getAnyAccess().getAnyTypeKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Any__Group__0__Impl1820); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:938:1: rule__Any__Group__1 : rule__Any__Group__1__Impl ;
    public final void rule__Any__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:942:1: ( rule__Any__Group__1__Impl )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:943:2: rule__Any__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Any__Group__1__Impl_in_rule__Any__Group__11851);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:949:1: rule__Any__Group__1__Impl : ( ( rule__Any__NameAssignment_1 ) ) ;
    public final void rule__Any__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:953:1: ( ( ( rule__Any__NameAssignment_1 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:954:1: ( ( rule__Any__NameAssignment_1 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:954:1: ( ( rule__Any__NameAssignment_1 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:955:1: ( rule__Any__NameAssignment_1 )
            {
             before(grammarAccess.getAnyAccess().getNameAssignment_1()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:956:1: ( rule__Any__NameAssignment_1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:956:2: rule__Any__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Any__NameAssignment_1_in_rule__Any__Group__1__Impl1878);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:970:1: rule__TypeRef__Group__0 : rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 ;
    public final void rule__TypeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:974:1: ( rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:975:2: rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__01912);
            rule__TypeRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__01915);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:982:1: rule__TypeRef__Group__0__Impl : ( ( rule__TypeRef__ReferencedAssignment_0 ) ) ;
    public final void rule__TypeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:986:1: ( ( ( rule__TypeRef__ReferencedAssignment_0 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:987:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:987:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:988:1: ( rule__TypeRef__ReferencedAssignment_0 )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedAssignment_0()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:989:1: ( rule__TypeRef__ReferencedAssignment_0 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:989:2: rule__TypeRef__ReferencedAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl1942);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:999:1: rule__TypeRef__Group__1 : rule__TypeRef__Group__1__Impl ;
    public final void rule__TypeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1003:1: ( rule__TypeRef__Group__1__Impl )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1004:2: rule__TypeRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__11972);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1010:1: rule__TypeRef__Group__1__Impl : ( ( rule__TypeRef__IsMultiAssignment_1 )? ) ;
    public final void rule__TypeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1014:1: ( ( ( rule__TypeRef__IsMultiAssignment_1 )? ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1015:1: ( ( rule__TypeRef__IsMultiAssignment_1 )? )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1015:1: ( ( rule__TypeRef__IsMultiAssignment_1 )? )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1016:1: ( rule__TypeRef__IsMultiAssignment_1 )?
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiAssignment_1()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1017:1: ( rule__TypeRef__IsMultiAssignment_1 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1017:2: rule__TypeRef__IsMultiAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TypeRef__IsMultiAssignment_1_in_rule__TypeRef__Group__1__Impl1999);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1031:1: rule__EFloatObject__Group__0 : rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1 ;
    public final void rule__EFloatObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1035:1: ( rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1036:2: rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__0__Impl_in_rule__EFloatObject__Group__02034);
            rule__EFloatObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__1_in_rule__EFloatObject__Group__02037);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1043:1: rule__EFloatObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloatObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1047:1: ( ( ( '-' )? ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1048:1: ( ( '-' )? )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1048:1: ( ( '-' )? )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1049:1: ( '-' )?
            {
             before(grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1050:1: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1051:2: '-'
                    {
                    match(input,19,FOLLOW_19_in_rule__EFloatObject__Group__0__Impl2066); 

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1062:1: rule__EFloatObject__Group__1 : rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2 ;
    public final void rule__EFloatObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1066:1: ( rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1067:2: rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__1__Impl_in_rule__EFloatObject__Group__12099);
            rule__EFloatObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__2_in_rule__EFloatObject__Group__12102);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1074:1: rule__EFloatObject__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloatObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1078:1: ( ( ( RULE_INT )? ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1079:1: ( ( RULE_INT )? )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1079:1: ( ( RULE_INT )? )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1080:1: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1081:1: ( RULE_INT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1081:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EFloatObject__Group__1__Impl2130); 

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1091:1: rule__EFloatObject__Group__2 : rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3 ;
    public final void rule__EFloatObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1095:1: ( rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1096:2: rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__2__Impl_in_rule__EFloatObject__Group__22161);
            rule__EFloatObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__3_in_rule__EFloatObject__Group__22164);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1103:1: rule__EFloatObject__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloatObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1107:1: ( ( '.' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1108:1: ( '.' )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1108:1: ( '.' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1109:1: '.'
            {
             before(grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__EFloatObject__Group__2__Impl2192); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1122:1: rule__EFloatObject__Group__3 : rule__EFloatObject__Group__3__Impl ;
    public final void rule__EFloatObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1126:1: ( rule__EFloatObject__Group__3__Impl )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1127:2: rule__EFloatObject__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__3__Impl_in_rule__EFloatObject__Group__32223);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1133:1: rule__EFloatObject__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloatObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1137:1: ( ( RULE_INT ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1138:1: ( RULE_INT )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1138:1: ( RULE_INT )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1139:1: RULE_INT
            {
             before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EFloatObject__Group__3__Impl2250); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1158:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1162:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1163:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02287);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02290);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1170:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1174:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1175:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1175:1: ( RULE_ID )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1176:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2317); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1187:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1191:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1192:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12346);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1198:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1202:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1203:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1203:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1204:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1205:1: ( rule__QualifiedName__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1205:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2373);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1219:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1223:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1224:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02408);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02411);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1231:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1235:1: ( ( '.' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1236:1: ( '.' )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1236:1: ( '.' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1237:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,20,FOLLOW_20_in_rule__QualifiedName__Group_1__0__Impl2439); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1250:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1254:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1255:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12470);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1261:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1265:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1266:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1266:1: ( RULE_ID )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1267:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2497); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1283:1: rule__NotificationModel__ModuleAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__NotificationModel__ModuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1287:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1288:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1288:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1289:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getNotificationModelAccess().getModuleModuleCrossReference_1_0()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1290:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1291:1: ruleQualifiedName
            {
             before(grammarAccess.getNotificationModelAccess().getModuleModuleQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__NotificationModel__ModuleAssignment_12539);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1302:1: rule__NotificationModel__VersionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__NotificationModel__VersionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1306:1: ( ( RULE_STRING ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1307:1: ( RULE_STRING )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1307:1: ( RULE_STRING )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1308:1: RULE_STRING
            {
             before(grammarAccess.getNotificationModelAccess().getVersionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NotificationModel__VersionAssignment_32574); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1317:1: rule__NotificationModel__NotificationsAssignment_4 : ( ruleNotification ) ;
    public final void rule__NotificationModel__NotificationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1321:1: ( ( ruleNotification ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1322:1: ( ruleNotification )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1322:1: ( ruleNotification )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1323:1: ruleNotification
            {
             before(grammarAccess.getNotificationModelAccess().getNotificationsNotificationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleNotification_in_rule__NotificationModel__NotificationsAssignment_42605);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1332:1: rule__Notification__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Notification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1336:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1337:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1337:1: ( RULE_ID )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1338:1: RULE_ID
            {
             before(grammarAccess.getNotificationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Notification__NameAssignment_12636); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1347:1: rule__Notification__FeaturesAssignment_3 : ( ruleFeature ) ;
    public final void rule__Notification__FeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1351:1: ( ( ruleFeature ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1352:1: ( ruleFeature )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1352:1: ( ruleFeature )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1353:1: ruleFeature
            {
             before(grammarAccess.getNotificationAccess().getFeaturesFeatureParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Notification__FeaturesAssignment_32667);
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


    // $ANTLR start "rule__Feature__TypeAssignment_0"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1362:1: rule__Feature__TypeAssignment_0 : ( ruleTypeRef ) ;
    public final void rule__Feature__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1366:1: ( ( ruleTypeRef ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1367:1: ( ruleTypeRef )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1367:1: ( ruleTypeRef )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1368:1: ruleTypeRef
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeRefParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Feature__TypeAssignment_02698);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getTypeTypeRefParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Feature__TypeAssignment_0"


    // $ANTLR start "rule__Feature__NameAssignment_1"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1377:1: rule__Feature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1381:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1382:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1382:1: ( RULE_ID )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1383:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_12729); 
             after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Feature__NameAssignment_1"


    // $ANTLR start "rule__Primitive__NameAssignment_1"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1394:1: rule__Primitive__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Primitive__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1398:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1399:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1399:1: ( RULE_ID )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1400:1: RULE_ID
            {
             before(grammarAccess.getPrimitiveAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Primitive__NameAssignment_12762); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1409:1: rule__Any__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Any__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1413:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1414:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1414:1: ( RULE_ID )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1415:1: RULE_ID
            {
             before(grammarAccess.getAnyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Any__NameAssignment_12793); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1424:1: rule__TypeRef__ReferencedAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TypeRef__ReferencedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1428:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1429:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1429:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1430:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1431:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1432:1: ruleQualifiedName
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_02828);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1443:1: rule__TypeRef__IsMultiAssignment_1 : ( ( '[]' ) ) ;
    public final void rule__TypeRef__IsMultiAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1447:1: ( ( ( '[]' ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1448:1: ( ( '[]' ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1448:1: ( ( '[]' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1449:1: ( '[]' )
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1450:1: ( '[]' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1451:1: '[]'
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            match(input,21,FOLLOW_21_in_rule__TypeRef__IsMultiAssignment_12868); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1466:1: rule__StringValue__ValueAssignment : ( ruleEStringObject ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1470:1: ( ( ruleEStringObject ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1471:1: ( ruleEStringObject )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1471:1: ( ruleEStringObject )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1472:1: ruleEStringObject
            {
             before(grammarAccess.getStringValueAccess().getValueEStringObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEStringObject_in_rule__StringValue__ValueAssignment2907);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1481:1: rule__IntegerValue__ValueAssignment : ( ruleEIntegerObject ) ;
    public final void rule__IntegerValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1485:1: ( ( ruleEIntegerObject ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1486:1: ( ruleEIntegerObject )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1486:1: ( ruleEIntegerObject )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1487:1: ruleEIntegerObject
            {
             before(grammarAccess.getIntegerValueAccess().getValueEIntegerObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_rule__IntegerValue__ValueAssignment2938);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1496:1: rule__FloatValue__ValueAssignment : ( ruleEFloatObject ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1500:1: ( ( ruleEFloatObject ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1501:1: ( ruleEFloatObject )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1501:1: ( ruleEFloatObject )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1502:1: ruleEFloatObject
            {
             before(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_rule__FloatValue__ValueAssignment2969);
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
    public static final BitSet FOLLOW_11_in_rule__NotificationModel__Group__0__Impl882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationModel__Group__1__Impl_in_rule__NotificationModel__Group__1913 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__NotificationModel__Group__2_in_rule__NotificationModel__Group__1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationModel__ModuleAssignment_1_in_rule__NotificationModel__Group__1__Impl943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationModel__Group__2__Impl_in_rule__NotificationModel__Group__2973 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NotificationModel__Group__3_in_rule__NotificationModel__Group__2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__NotificationModel__Group__2__Impl1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationModel__Group__3__Impl_in_rule__NotificationModel__Group__31035 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__NotificationModel__Group__4_in_rule__NotificationModel__Group__31038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationModel__VersionAssignment_3_in_rule__NotificationModel__Group__3__Impl1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationModel__Group__4__Impl_in_rule__NotificationModel__Group__41095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationModel__NotificationsAssignment_4_in_rule__NotificationModel__Group__4__Impl1122 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Notification__Group__0__Impl_in_rule__Notification__Group__01163 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Notification__Group__1_in_rule__Notification__Group__01166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Notification__Group__0__Impl1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Notification__Group__1__Impl_in_rule__Notification__Group__11225 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Notification__Group__2_in_rule__Notification__Group__11228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Notification__NameAssignment_1_in_rule__Notification__Group__1__Impl1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Notification__Group__2__Impl_in_rule__Notification__Group__21285 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_rule__Notification__Group__3_in_rule__Notification__Group__21288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Notification__Group__2__Impl1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Notification__Group__3__Impl_in_rule__Notification__Group__31347 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_rule__Notification__Group__4_in_rule__Notification__Group__31350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Notification__FeaturesAssignment_3_in_rule__Notification__Group__3__Impl1377 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Notification__Group__4__Impl_in_rule__Notification__Group__41408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Notification__Group__4__Impl1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__01477 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__01480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__TypeAssignment_0_in_rule__Feature__Group__0__Impl1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__11537 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__11540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__NameAssignment_1_in_rule__Feature__Group__1__Impl1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__21597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Feature__Group__2__Impl1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__0__Impl_in_rule__Primitive__Group__01666 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Primitive__Group__1_in_rule__Primitive__Group__01669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Primitive__Group__0__Impl1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__1__Impl_in_rule__Primitive__Group__11728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__NameAssignment_1_in_rule__Primitive__Group__1__Impl1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__Group__0__Impl_in_rule__Any__Group__01789 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Any__Group__1_in_rule__Any__Group__01792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Any__Group__0__Impl1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__Group__1__Impl_in_rule__Any__Group__11851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__NameAssignment_1_in_rule__Any__Group__1__Impl1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__01912 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__01915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__11972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__IsMultiAssignment_1_in_rule__TypeRef__Group__1__Impl1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__0__Impl_in_rule__EFloatObject__Group__02034 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__1_in_rule__EFloatObject__Group__02037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EFloatObject__Group__0__Impl2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__1__Impl_in_rule__EFloatObject__Group__12099 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__2_in_rule__EFloatObject__Group__12102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group__1__Impl2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__2__Impl_in_rule__EFloatObject__Group__22161 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__3_in_rule__EFloatObject__Group__22164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EFloatObject__Group__2__Impl2192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__3__Impl_in_rule__EFloatObject__Group__32223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group__3__Impl2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02287 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2373 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02408 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__QualifiedName__Group_1__0__Impl2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__NotificationModel__ModuleAssignment_12539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__NotificationModel__VersionAssignment_32574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotification_in_rule__NotificationModel__NotificationsAssignment_42605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Notification__NameAssignment_12636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Notification__FeaturesAssignment_32667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Feature__TypeAssignment_02698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_12729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Primitive__NameAssignment_12762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Any__NameAssignment_12793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_02828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__TypeRef__IsMultiAssignment_12868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_rule__StringValue__ValueAssignment2907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_rule__IntegerValue__ValueAssignment2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_rule__FloatValue__ValueAssignment2969 = new BitSet(new long[]{0x0000000000000002L});

}