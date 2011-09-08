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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'notifications for module'", "'version'", "'notification'", "'{'", "'}'", "'primitive type'", "'any type'", "';'", "'='", "'<->'", "'-'", "'.'", "'indexed'", "'-['", "'[]'"
    };
    public static final int RULE_ID=6;
    public static final int T__25=25;
    public static final int T__24=24;
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


    // $ANTLR start "entryRulePrimitive"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:118:1: entryRulePrimitive : rulePrimitive EOF ;
    public final void entryRulePrimitive() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:119:1: ( rulePrimitive EOF )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:120:1: rulePrimitive EOF
            {
             before(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive183);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getPrimitiveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive190); 

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:127:1: rulePrimitive : ( ( rule__Primitive__Group__0 ) ) ;
    public final void rulePrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:131:2: ( ( ( rule__Primitive__Group__0 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:132:1: ( ( rule__Primitive__Group__0 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:132:1: ( ( rule__Primitive__Group__0 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:133:1: ( rule__Primitive__Group__0 )
            {
             before(grammarAccess.getPrimitiveAccess().getGroup()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:134:1: ( rule__Primitive__Group__0 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:134:2: rule__Primitive__Group__0
            {
            pushFollow(FOLLOW_rule__Primitive__Group__0_in_rulePrimitive216);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:146:1: entryRuleAny : ruleAny EOF ;
    public final void entryRuleAny() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:147:1: ( ruleAny EOF )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:148:1: ruleAny EOF
            {
             before(grammarAccess.getAnyRule()); 
            pushFollow(FOLLOW_ruleAny_in_entryRuleAny243);
            ruleAny();

            state._fsp--;

             after(grammarAccess.getAnyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAny250); 

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:155:1: ruleAny : ( ( rule__Any__Group__0 ) ) ;
    public final void ruleAny() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:159:2: ( ( ( rule__Any__Group__0 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:160:1: ( ( rule__Any__Group__0 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:160:1: ( ( rule__Any__Group__0 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:161:1: ( rule__Any__Group__0 )
            {
             before(grammarAccess.getAnyAccess().getGroup()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:162:1: ( rule__Any__Group__0 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:162:2: rule__Any__Group__0
            {
            pushFollow(FOLLOW_rule__Any__Group__0_in_ruleAny276);
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


    // $ANTLR start "entryRuleFeature"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:174:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:175:1: ( ruleFeature EOF )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:176:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature303);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature310); 

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:183:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:187:2: ( ( ( rule__Feature__Group__0 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:188:1: ( ( rule__Feature__Group__0 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:188:1: ( ( rule__Feature__Group__0 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:189:1: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:190:1: ( rule__Feature__Group__0 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:190:2: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_rule__Feature__Group__0_in_ruleFeature336);
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


    // $ANTLR start "entryRuleValueObject"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:230:1: entryRuleValueObject : ruleValueObject EOF ;
    public final void entryRuleValueObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:231:1: ( ruleValueObject EOF )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:232:1: ruleValueObject EOF
            {
             before(grammarAccess.getValueObjectRule()); 
            pushFollow(FOLLOW_ruleValueObject_in_entryRuleValueObject423);
            ruleValueObject();

            state._fsp--;

             after(grammarAccess.getValueObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueObject430); 

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:239:1: ruleValueObject : ( ( rule__ValueObject__Alternatives ) ) ;
    public final void ruleValueObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:243:2: ( ( ( rule__ValueObject__Alternatives ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:244:1: ( ( rule__ValueObject__Alternatives ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:244:1: ( ( rule__ValueObject__Alternatives ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:245:1: ( rule__ValueObject__Alternatives )
            {
             before(grammarAccess.getValueObjectAccess().getAlternatives()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:246:1: ( rule__ValueObject__Alternatives )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:246:2: rule__ValueObject__Alternatives
            {
            pushFollow(FOLLOW_rule__ValueObject__Alternatives_in_ruleValueObject456);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:258:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:259:1: ( ruleStringValue EOF )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:260:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue483);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue490); 

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:267:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:271:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:272:1: ( ( rule__StringValue__ValueAssignment ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:272:1: ( ( rule__StringValue__ValueAssignment ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:273:1: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:274:1: ( rule__StringValue__ValueAssignment )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:274:2: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue516);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:286:1: entryRuleEStringObject : ruleEStringObject EOF ;
    public final void entryRuleEStringObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:287:1: ( ruleEStringObject EOF )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:288:1: ruleEStringObject EOF
            {
             before(grammarAccess.getEStringObjectRule()); 
            pushFollow(FOLLOW_ruleEStringObject_in_entryRuleEStringObject543);
            ruleEStringObject();

            state._fsp--;

             after(grammarAccess.getEStringObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEStringObject550); 

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:295:1: ruleEStringObject : ( RULE_STRING ) ;
    public final void ruleEStringObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:299:2: ( ( RULE_STRING ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:300:1: ( RULE_STRING )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:300:1: ( RULE_STRING )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:301:1: RULE_STRING
            {
             before(grammarAccess.getEStringObjectAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEStringObject576); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:314:1: entryRuleIntegerValue : ruleIntegerValue EOF ;
    public final void entryRuleIntegerValue() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:315:1: ( ruleIntegerValue EOF )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:316:1: ruleIntegerValue EOF
            {
             before(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue602);
            ruleIntegerValue();

            state._fsp--;

             after(grammarAccess.getIntegerValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValue609); 

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:323:1: ruleIntegerValue : ( ( rule__IntegerValue__ValueAssignment ) ) ;
    public final void ruleIntegerValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:327:2: ( ( ( rule__IntegerValue__ValueAssignment ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:328:1: ( ( rule__IntegerValue__ValueAssignment ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:328:1: ( ( rule__IntegerValue__ValueAssignment ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:329:1: ( rule__IntegerValue__ValueAssignment )
            {
             before(grammarAccess.getIntegerValueAccess().getValueAssignment()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:330:1: ( rule__IntegerValue__ValueAssignment )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:330:2: rule__IntegerValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntegerValue__ValueAssignment_in_ruleIntegerValue635);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:342:1: entryRuleEIntegerObject : ruleEIntegerObject EOF ;
    public final void entryRuleEIntegerObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:343:1: ( ruleEIntegerObject EOF )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:344:1: ruleEIntegerObject EOF
            {
             before(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject662);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getEIntegerObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEIntegerObject669); 

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:351:1: ruleEIntegerObject : ( RULE_INT ) ;
    public final void ruleEIntegerObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:355:2: ( ( RULE_INT ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:356:1: ( RULE_INT )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:356:1: ( RULE_INT )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:357:1: RULE_INT
            {
             before(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEIntegerObject695); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:370:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:371:1: ( ruleFloatValue EOF )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:372:1: ruleFloatValue EOF
            {
             before(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue721);
            ruleFloatValue();

            state._fsp--;

             after(grammarAccess.getFloatValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue728); 

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:379:1: ruleFloatValue : ( ( rule__FloatValue__ValueAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:383:2: ( ( ( rule__FloatValue__ValueAssignment ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:384:1: ( ( rule__FloatValue__ValueAssignment ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:384:1: ( ( rule__FloatValue__ValueAssignment ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:385:1: ( rule__FloatValue__ValueAssignment )
            {
             before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:386:1: ( rule__FloatValue__ValueAssignment )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:386:2: rule__FloatValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue754);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:398:1: entryRuleEFloatObject : ruleEFloatObject EOF ;
    public final void entryRuleEFloatObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:399:1: ( ruleEFloatObject EOF )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:400:1: ruleEFloatObject EOF
            {
             before(grammarAccess.getEFloatObjectRule()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject781);
            ruleEFloatObject();

            state._fsp--;

             after(grammarAccess.getEFloatObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEFloatObject788); 

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:407:1: ruleEFloatObject : ( ( rule__EFloatObject__Group__0 ) ) ;
    public final void ruleEFloatObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:411:2: ( ( ( rule__EFloatObject__Group__0 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:412:1: ( ( rule__EFloatObject__Group__0 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:412:1: ( ( rule__EFloatObject__Group__0 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:413:1: ( rule__EFloatObject__Group__0 )
            {
             before(grammarAccess.getEFloatObjectAccess().getGroup()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:414:1: ( rule__EFloatObject__Group__0 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:414:2: rule__EFloatObject__Group__0
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__0_in_ruleEFloatObject814);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:426:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:427:1: ( ruleQualifiedName EOF )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:428:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName841);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName848); 

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:435:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:439:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:440:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:440:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:441:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:442:1: ( rule__QualifiedName__Group__0 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:442:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName874);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:454:1: rule__ValueObject__Alternatives : ( ( ruleStringValue ) | ( ruleIntegerValue ) | ( ruleFloatValue ) );
    public final void rule__ValueObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:458:1: ( ( ruleStringValue ) | ( ruleIntegerValue ) | ( ruleFloatValue ) )
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

                if ( (LA1_2==22) ) {
                    alt1=3;
                }
                else if ( (LA1_2==EOF||LA1_2==RULE_ID||LA1_2==15||LA1_2==18||LA1_2==20||(LA1_2>=23 && LA1_2<=24)) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case 21:
            case 22:
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
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:459:1: ( ruleStringValue )
                    {
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:459:1: ( ruleStringValue )
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:460:1: ruleStringValue
                    {
                     before(grammarAccess.getValueObjectAccess().getStringValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringValue_in_rule__ValueObject__Alternatives910);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getValueObjectAccess().getStringValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:465:6: ( ruleIntegerValue )
                    {
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:465:6: ( ruleIntegerValue )
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:466:1: ruleIntegerValue
                    {
                     before(grammarAccess.getValueObjectAccess().getIntegerValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntegerValue_in_rule__ValueObject__Alternatives927);
                    ruleIntegerValue();

                    state._fsp--;

                     after(grammarAccess.getValueObjectAccess().getIntegerValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:471:6: ( ruleFloatValue )
                    {
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:471:6: ( ruleFloatValue )
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:472:1: ruleFloatValue
                    {
                     before(grammarAccess.getValueObjectAccess().getFloatValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleFloatValue_in_rule__ValueObject__Alternatives944);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:484:1: rule__NotificationModel__Group__0 : rule__NotificationModel__Group__0__Impl rule__NotificationModel__Group__1 ;
    public final void rule__NotificationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:488:1: ( rule__NotificationModel__Group__0__Impl rule__NotificationModel__Group__1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:489:2: rule__NotificationModel__Group__0__Impl rule__NotificationModel__Group__1
            {
            pushFollow(FOLLOW_rule__NotificationModel__Group__0__Impl_in_rule__NotificationModel__Group__0974);
            rule__NotificationModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NotificationModel__Group__1_in_rule__NotificationModel__Group__0977);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:496:1: rule__NotificationModel__Group__0__Impl : ( 'notifications for module' ) ;
    public final void rule__NotificationModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:500:1: ( ( 'notifications for module' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:501:1: ( 'notifications for module' )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:501:1: ( 'notifications for module' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:502:1: 'notifications for module'
            {
             before(grammarAccess.getNotificationModelAccess().getNotificationsForModuleKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__NotificationModel__Group__0__Impl1005); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:515:1: rule__NotificationModel__Group__1 : rule__NotificationModel__Group__1__Impl rule__NotificationModel__Group__2 ;
    public final void rule__NotificationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:519:1: ( rule__NotificationModel__Group__1__Impl rule__NotificationModel__Group__2 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:520:2: rule__NotificationModel__Group__1__Impl rule__NotificationModel__Group__2
            {
            pushFollow(FOLLOW_rule__NotificationModel__Group__1__Impl_in_rule__NotificationModel__Group__11036);
            rule__NotificationModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NotificationModel__Group__2_in_rule__NotificationModel__Group__11039);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:527:1: rule__NotificationModel__Group__1__Impl : ( ( rule__NotificationModel__ModuleAssignment_1 ) ) ;
    public final void rule__NotificationModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:531:1: ( ( ( rule__NotificationModel__ModuleAssignment_1 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:532:1: ( ( rule__NotificationModel__ModuleAssignment_1 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:532:1: ( ( rule__NotificationModel__ModuleAssignment_1 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:533:1: ( rule__NotificationModel__ModuleAssignment_1 )
            {
             before(grammarAccess.getNotificationModelAccess().getModuleAssignment_1()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:534:1: ( rule__NotificationModel__ModuleAssignment_1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:534:2: rule__NotificationModel__ModuleAssignment_1
            {
            pushFollow(FOLLOW_rule__NotificationModel__ModuleAssignment_1_in_rule__NotificationModel__Group__1__Impl1066);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:544:1: rule__NotificationModel__Group__2 : rule__NotificationModel__Group__2__Impl rule__NotificationModel__Group__3 ;
    public final void rule__NotificationModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:548:1: ( rule__NotificationModel__Group__2__Impl rule__NotificationModel__Group__3 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:549:2: rule__NotificationModel__Group__2__Impl rule__NotificationModel__Group__3
            {
            pushFollow(FOLLOW_rule__NotificationModel__Group__2__Impl_in_rule__NotificationModel__Group__21096);
            rule__NotificationModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NotificationModel__Group__3_in_rule__NotificationModel__Group__21099);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:556:1: rule__NotificationModel__Group__2__Impl : ( 'version' ) ;
    public final void rule__NotificationModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:560:1: ( ( 'version' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:561:1: ( 'version' )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:561:1: ( 'version' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:562:1: 'version'
            {
             before(grammarAccess.getNotificationModelAccess().getVersionKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__NotificationModel__Group__2__Impl1127); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:575:1: rule__NotificationModel__Group__3 : rule__NotificationModel__Group__3__Impl rule__NotificationModel__Group__4 ;
    public final void rule__NotificationModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:579:1: ( rule__NotificationModel__Group__3__Impl rule__NotificationModel__Group__4 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:580:2: rule__NotificationModel__Group__3__Impl rule__NotificationModel__Group__4
            {
            pushFollow(FOLLOW_rule__NotificationModel__Group__3__Impl_in_rule__NotificationModel__Group__31158);
            rule__NotificationModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NotificationModel__Group__4_in_rule__NotificationModel__Group__31161);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:587:1: rule__NotificationModel__Group__3__Impl : ( ( rule__NotificationModel__VersionAssignment_3 ) ) ;
    public final void rule__NotificationModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:591:1: ( ( ( rule__NotificationModel__VersionAssignment_3 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:592:1: ( ( rule__NotificationModel__VersionAssignment_3 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:592:1: ( ( rule__NotificationModel__VersionAssignment_3 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:593:1: ( rule__NotificationModel__VersionAssignment_3 )
            {
             before(grammarAccess.getNotificationModelAccess().getVersionAssignment_3()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:594:1: ( rule__NotificationModel__VersionAssignment_3 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:594:2: rule__NotificationModel__VersionAssignment_3
            {
            pushFollow(FOLLOW_rule__NotificationModel__VersionAssignment_3_in_rule__NotificationModel__Group__3__Impl1188);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:604:1: rule__NotificationModel__Group__4 : rule__NotificationModel__Group__4__Impl ;
    public final void rule__NotificationModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:608:1: ( rule__NotificationModel__Group__4__Impl )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:609:2: rule__NotificationModel__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__NotificationModel__Group__4__Impl_in_rule__NotificationModel__Group__41218);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:615:1: rule__NotificationModel__Group__4__Impl : ( ( rule__NotificationModel__NotificationsAssignment_4 )* ) ;
    public final void rule__NotificationModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:619:1: ( ( ( rule__NotificationModel__NotificationsAssignment_4 )* ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:620:1: ( ( rule__NotificationModel__NotificationsAssignment_4 )* )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:620:1: ( ( rule__NotificationModel__NotificationsAssignment_4 )* )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:621:1: ( rule__NotificationModel__NotificationsAssignment_4 )*
            {
             before(grammarAccess.getNotificationModelAccess().getNotificationsAssignment_4()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:622:1: ( rule__NotificationModel__NotificationsAssignment_4 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:622:2: rule__NotificationModel__NotificationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__NotificationModel__NotificationsAssignment_4_in_rule__NotificationModel__Group__4__Impl1245);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:642:1: rule__Notification__Group__0 : rule__Notification__Group__0__Impl rule__Notification__Group__1 ;
    public final void rule__Notification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:646:1: ( rule__Notification__Group__0__Impl rule__Notification__Group__1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:647:2: rule__Notification__Group__0__Impl rule__Notification__Group__1
            {
            pushFollow(FOLLOW_rule__Notification__Group__0__Impl_in_rule__Notification__Group__01286);
            rule__Notification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Notification__Group__1_in_rule__Notification__Group__01289);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:654:1: rule__Notification__Group__0__Impl : ( 'notification' ) ;
    public final void rule__Notification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:658:1: ( ( 'notification' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:659:1: ( 'notification' )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:659:1: ( 'notification' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:660:1: 'notification'
            {
             before(grammarAccess.getNotificationAccess().getNotificationKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Notification__Group__0__Impl1317); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:673:1: rule__Notification__Group__1 : rule__Notification__Group__1__Impl rule__Notification__Group__2 ;
    public final void rule__Notification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:677:1: ( rule__Notification__Group__1__Impl rule__Notification__Group__2 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:678:2: rule__Notification__Group__1__Impl rule__Notification__Group__2
            {
            pushFollow(FOLLOW_rule__Notification__Group__1__Impl_in_rule__Notification__Group__11348);
            rule__Notification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Notification__Group__2_in_rule__Notification__Group__11351);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:685:1: rule__Notification__Group__1__Impl : ( ( rule__Notification__NameAssignment_1 ) ) ;
    public final void rule__Notification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:689:1: ( ( ( rule__Notification__NameAssignment_1 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:690:1: ( ( rule__Notification__NameAssignment_1 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:690:1: ( ( rule__Notification__NameAssignment_1 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:691:1: ( rule__Notification__NameAssignment_1 )
            {
             before(grammarAccess.getNotificationAccess().getNameAssignment_1()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:692:1: ( rule__Notification__NameAssignment_1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:692:2: rule__Notification__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Notification__NameAssignment_1_in_rule__Notification__Group__1__Impl1378);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:702:1: rule__Notification__Group__2 : rule__Notification__Group__2__Impl rule__Notification__Group__3 ;
    public final void rule__Notification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:706:1: ( rule__Notification__Group__2__Impl rule__Notification__Group__3 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:707:2: rule__Notification__Group__2__Impl rule__Notification__Group__3
            {
            pushFollow(FOLLOW_rule__Notification__Group__2__Impl_in_rule__Notification__Group__21408);
            rule__Notification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Notification__Group__3_in_rule__Notification__Group__21411);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:714:1: rule__Notification__Group__2__Impl : ( '{' ) ;
    public final void rule__Notification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:718:1: ( ( '{' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:719:1: ( '{' )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:719:1: ( '{' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:720:1: '{'
            {
             before(grammarAccess.getNotificationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Notification__Group__2__Impl1439); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:733:1: rule__Notification__Group__3 : rule__Notification__Group__3__Impl rule__Notification__Group__4 ;
    public final void rule__Notification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:737:1: ( rule__Notification__Group__3__Impl rule__Notification__Group__4 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:738:2: rule__Notification__Group__3__Impl rule__Notification__Group__4
            {
            pushFollow(FOLLOW_rule__Notification__Group__3__Impl_in_rule__Notification__Group__31470);
            rule__Notification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Notification__Group__4_in_rule__Notification__Group__31473);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:745:1: rule__Notification__Group__3__Impl : ( ( rule__Notification__FeaturesAssignment_3 )* ) ;
    public final void rule__Notification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:749:1: ( ( ( rule__Notification__FeaturesAssignment_3 )* ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:750:1: ( ( rule__Notification__FeaturesAssignment_3 )* )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:750:1: ( ( rule__Notification__FeaturesAssignment_3 )* )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:751:1: ( rule__Notification__FeaturesAssignment_3 )*
            {
             before(grammarAccess.getNotificationAccess().getFeaturesAssignment_3()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:752:1: ( rule__Notification__FeaturesAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||(LA3_0>=23 && LA3_0<=24)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:752:2: rule__Notification__FeaturesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Notification__FeaturesAssignment_3_in_rule__Notification__Group__3__Impl1500);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:762:1: rule__Notification__Group__4 : rule__Notification__Group__4__Impl ;
    public final void rule__Notification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:766:1: ( rule__Notification__Group__4__Impl )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:767:2: rule__Notification__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Notification__Group__4__Impl_in_rule__Notification__Group__41531);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:773:1: rule__Notification__Group__4__Impl : ( '}' ) ;
    public final void rule__Notification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:777:1: ( ( '}' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:778:1: ( '}' )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:778:1: ( '}' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:779:1: '}'
            {
             before(grammarAccess.getNotificationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__Notification__Group__4__Impl1559); 
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


    // $ANTLR start "rule__Primitive__Group__0"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:803:1: rule__Primitive__Group__0 : rule__Primitive__Group__0__Impl rule__Primitive__Group__1 ;
    public final void rule__Primitive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:807:1: ( rule__Primitive__Group__0__Impl rule__Primitive__Group__1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:808:2: rule__Primitive__Group__0__Impl rule__Primitive__Group__1
            {
            pushFollow(FOLLOW_rule__Primitive__Group__0__Impl_in_rule__Primitive__Group__01601);
            rule__Primitive__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primitive__Group__1_in_rule__Primitive__Group__01604);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:815:1: rule__Primitive__Group__0__Impl : ( 'primitive type' ) ;
    public final void rule__Primitive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:819:1: ( ( 'primitive type' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:820:1: ( 'primitive type' )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:820:1: ( 'primitive type' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:821:1: 'primitive type'
            {
             before(grammarAccess.getPrimitiveAccess().getPrimitiveTypeKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Primitive__Group__0__Impl1632); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:834:1: rule__Primitive__Group__1 : rule__Primitive__Group__1__Impl ;
    public final void rule__Primitive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:838:1: ( rule__Primitive__Group__1__Impl )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:839:2: rule__Primitive__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Primitive__Group__1__Impl_in_rule__Primitive__Group__11663);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:845:1: rule__Primitive__Group__1__Impl : ( ( rule__Primitive__NameAssignment_1 ) ) ;
    public final void rule__Primitive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:849:1: ( ( ( rule__Primitive__NameAssignment_1 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:850:1: ( ( rule__Primitive__NameAssignment_1 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:850:1: ( ( rule__Primitive__NameAssignment_1 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:851:1: ( rule__Primitive__NameAssignment_1 )
            {
             before(grammarAccess.getPrimitiveAccess().getNameAssignment_1()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:852:1: ( rule__Primitive__NameAssignment_1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:852:2: rule__Primitive__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Primitive__NameAssignment_1_in_rule__Primitive__Group__1__Impl1690);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:866:1: rule__Any__Group__0 : rule__Any__Group__0__Impl rule__Any__Group__1 ;
    public final void rule__Any__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:870:1: ( rule__Any__Group__0__Impl rule__Any__Group__1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:871:2: rule__Any__Group__0__Impl rule__Any__Group__1
            {
            pushFollow(FOLLOW_rule__Any__Group__0__Impl_in_rule__Any__Group__01724);
            rule__Any__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Any__Group__1_in_rule__Any__Group__01727);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:878:1: rule__Any__Group__0__Impl : ( 'any type' ) ;
    public final void rule__Any__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:882:1: ( ( 'any type' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:883:1: ( 'any type' )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:883:1: ( 'any type' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:884:1: 'any type'
            {
             before(grammarAccess.getAnyAccess().getAnyTypeKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Any__Group__0__Impl1755); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:897:1: rule__Any__Group__1 : rule__Any__Group__1__Impl ;
    public final void rule__Any__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:901:1: ( rule__Any__Group__1__Impl )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:902:2: rule__Any__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Any__Group__1__Impl_in_rule__Any__Group__11786);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:908:1: rule__Any__Group__1__Impl : ( ( rule__Any__NameAssignment_1 ) ) ;
    public final void rule__Any__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:912:1: ( ( ( rule__Any__NameAssignment_1 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:913:1: ( ( rule__Any__NameAssignment_1 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:913:1: ( ( rule__Any__NameAssignment_1 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:914:1: ( rule__Any__NameAssignment_1 )
            {
             before(grammarAccess.getAnyAccess().getNameAssignment_1()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:915:1: ( rule__Any__NameAssignment_1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:915:2: rule__Any__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Any__NameAssignment_1_in_rule__Any__Group__1__Impl1813);
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


    // $ANTLR start "rule__Feature__Group__0"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:929:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:933:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:934:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__01847);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__01850);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:941:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__IsIndexedAssignment_0 )? ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:945:1: ( ( ( rule__Feature__IsIndexedAssignment_0 )? ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:946:1: ( ( rule__Feature__IsIndexedAssignment_0 )? )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:946:1: ( ( rule__Feature__IsIndexedAssignment_0 )? )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:947:1: ( rule__Feature__IsIndexedAssignment_0 )?
            {
             before(grammarAccess.getFeatureAccess().getIsIndexedAssignment_0()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:948:1: ( rule__Feature__IsIndexedAssignment_0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:948:2: rule__Feature__IsIndexedAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Feature__IsIndexedAssignment_0_in_rule__Feature__Group__0__Impl1877);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:958:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:962:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:963:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__11908);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__11911);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:970:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__IsContainmentAssignment_1 )? ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:974:1: ( ( ( rule__Feature__IsContainmentAssignment_1 )? ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:975:1: ( ( rule__Feature__IsContainmentAssignment_1 )? )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:975:1: ( ( rule__Feature__IsContainmentAssignment_1 )? )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:976:1: ( rule__Feature__IsContainmentAssignment_1 )?
            {
             before(grammarAccess.getFeatureAccess().getIsContainmentAssignment_1()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:977:1: ( rule__Feature__IsContainmentAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:977:2: rule__Feature__IsContainmentAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Feature__IsContainmentAssignment_1_in_rule__Feature__Group__1__Impl1938);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:987:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:991:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:992:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__21969);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__21972);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:999:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__TypeAssignment_2 ) ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1003:1: ( ( ( rule__Feature__TypeAssignment_2 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1004:1: ( ( rule__Feature__TypeAssignment_2 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1004:1: ( ( rule__Feature__TypeAssignment_2 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1005:1: ( rule__Feature__TypeAssignment_2 )
            {
             before(grammarAccess.getFeatureAccess().getTypeAssignment_2()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1006:1: ( rule__Feature__TypeAssignment_2 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1006:2: rule__Feature__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Feature__TypeAssignment_2_in_rule__Feature__Group__2__Impl1999);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1016:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1020:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1021:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
            {
            pushFollow(FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__32029);
            rule__Feature__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__4_in_rule__Feature__Group__32032);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1028:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__NameAssignment_3 ) ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1032:1: ( ( ( rule__Feature__NameAssignment_3 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1033:1: ( ( rule__Feature__NameAssignment_3 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1033:1: ( ( rule__Feature__NameAssignment_3 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1034:1: ( rule__Feature__NameAssignment_3 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_3()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1035:1: ( rule__Feature__NameAssignment_3 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1035:2: rule__Feature__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Feature__NameAssignment_3_in_rule__Feature__Group__3__Impl2059);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1045:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl rule__Feature__Group__5 ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1049:1: ( rule__Feature__Group__4__Impl rule__Feature__Group__5 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1050:2: rule__Feature__Group__4__Impl rule__Feature__Group__5
            {
            pushFollow(FOLLOW_rule__Feature__Group__4__Impl_in_rule__Feature__Group__42089);
            rule__Feature__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__5_in_rule__Feature__Group__42092);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1057:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__Group_4__0 )? ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1061:1: ( ( ( rule__Feature__Group_4__0 )? ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1062:1: ( ( rule__Feature__Group_4__0 )? )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1062:1: ( ( rule__Feature__Group_4__0 )? )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1063:1: ( rule__Feature__Group_4__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_4()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1064:1: ( rule__Feature__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1064:2: rule__Feature__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Feature__Group_4__0_in_rule__Feature__Group__4__Impl2119);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1074:1: rule__Feature__Group__5 : rule__Feature__Group__5__Impl rule__Feature__Group__6 ;
    public final void rule__Feature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1078:1: ( rule__Feature__Group__5__Impl rule__Feature__Group__6 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1079:2: rule__Feature__Group__5__Impl rule__Feature__Group__6
            {
            pushFollow(FOLLOW_rule__Feature__Group__5__Impl_in_rule__Feature__Group__52150);
            rule__Feature__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__6_in_rule__Feature__Group__52153);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1086:1: rule__Feature__Group__5__Impl : ( ( rule__Feature__Group_5__0 )? ) ;
    public final void rule__Feature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1090:1: ( ( ( rule__Feature__Group_5__0 )? ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1091:1: ( ( rule__Feature__Group_5__0 )? )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1091:1: ( ( rule__Feature__Group_5__0 )? )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1092:1: ( rule__Feature__Group_5__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_5()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1093:1: ( rule__Feature__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1093:2: rule__Feature__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Feature__Group_5__0_in_rule__Feature__Group__5__Impl2180);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1103:1: rule__Feature__Group__6 : rule__Feature__Group__6__Impl ;
    public final void rule__Feature__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1107:1: ( rule__Feature__Group__6__Impl )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1108:2: rule__Feature__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group__6__Impl_in_rule__Feature__Group__62211);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1114:1: rule__Feature__Group__6__Impl : ( ( ';' )? ) ;
    public final void rule__Feature__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1118:1: ( ( ( ';' )? ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1119:1: ( ( ';' )? )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1119:1: ( ( ';' )? )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1120:1: ( ';' )?
            {
             before(grammarAccess.getFeatureAccess().getSemicolonKeyword_6()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1121:1: ( ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1122:2: ';'
                    {
                    match(input,18,FOLLOW_18_in_rule__Feature__Group__6__Impl2240); 

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1147:1: rule__Feature__Group_4__0 : rule__Feature__Group_4__0__Impl rule__Feature__Group_4__1 ;
    public final void rule__Feature__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1151:1: ( rule__Feature__Group_4__0__Impl rule__Feature__Group_4__1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1152:2: rule__Feature__Group_4__0__Impl rule__Feature__Group_4__1
            {
            pushFollow(FOLLOW_rule__Feature__Group_4__0__Impl_in_rule__Feature__Group_4__02287);
            rule__Feature__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group_4__1_in_rule__Feature__Group_4__02290);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1159:1: rule__Feature__Group_4__0__Impl : ( '=' ) ;
    public final void rule__Feature__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1163:1: ( ( '=' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1164:1: ( '=' )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1164:1: ( '=' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1165:1: '='
            {
             before(grammarAccess.getFeatureAccess().getEqualsSignKeyword_4_0()); 
            match(input,19,FOLLOW_19_in_rule__Feature__Group_4__0__Impl2318); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1178:1: rule__Feature__Group_4__1 : rule__Feature__Group_4__1__Impl ;
    public final void rule__Feature__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1182:1: ( rule__Feature__Group_4__1__Impl )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1183:2: rule__Feature__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group_4__1__Impl_in_rule__Feature__Group_4__12349);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1189:1: rule__Feature__Group_4__1__Impl : ( ( rule__Feature__DefaultValueAssignment_4_1 ) ) ;
    public final void rule__Feature__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1193:1: ( ( ( rule__Feature__DefaultValueAssignment_4_1 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1194:1: ( ( rule__Feature__DefaultValueAssignment_4_1 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1194:1: ( ( rule__Feature__DefaultValueAssignment_4_1 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1195:1: ( rule__Feature__DefaultValueAssignment_4_1 )
            {
             before(grammarAccess.getFeatureAccess().getDefaultValueAssignment_4_1()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1196:1: ( rule__Feature__DefaultValueAssignment_4_1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1196:2: rule__Feature__DefaultValueAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Feature__DefaultValueAssignment_4_1_in_rule__Feature__Group_4__1__Impl2376);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1210:1: rule__Feature__Group_5__0 : rule__Feature__Group_5__0__Impl rule__Feature__Group_5__1 ;
    public final void rule__Feature__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1214:1: ( rule__Feature__Group_5__0__Impl rule__Feature__Group_5__1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1215:2: rule__Feature__Group_5__0__Impl rule__Feature__Group_5__1
            {
            pushFollow(FOLLOW_rule__Feature__Group_5__0__Impl_in_rule__Feature__Group_5__02410);
            rule__Feature__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group_5__1_in_rule__Feature__Group_5__02413);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1222:1: rule__Feature__Group_5__0__Impl : ( '<->' ) ;
    public final void rule__Feature__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1226:1: ( ( '<->' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1227:1: ( '<->' )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1227:1: ( '<->' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1228:1: '<->'
            {
             before(grammarAccess.getFeatureAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5_0()); 
            match(input,20,FOLLOW_20_in_rule__Feature__Group_5__0__Impl2441); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1241:1: rule__Feature__Group_5__1 : rule__Feature__Group_5__1__Impl ;
    public final void rule__Feature__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1245:1: ( rule__Feature__Group_5__1__Impl )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1246:2: rule__Feature__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group_5__1__Impl_in_rule__Feature__Group_5__12472);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1252:1: rule__Feature__Group_5__1__Impl : ( ( rule__Feature__InverseAssignment_5_1 ) ) ;
    public final void rule__Feature__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1256:1: ( ( ( rule__Feature__InverseAssignment_5_1 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1257:1: ( ( rule__Feature__InverseAssignment_5_1 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1257:1: ( ( rule__Feature__InverseAssignment_5_1 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1258:1: ( rule__Feature__InverseAssignment_5_1 )
            {
             before(grammarAccess.getFeatureAccess().getInverseAssignment_5_1()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1259:1: ( rule__Feature__InverseAssignment_5_1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1259:2: rule__Feature__InverseAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Feature__InverseAssignment_5_1_in_rule__Feature__Group_5__1__Impl2499);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1273:1: rule__TypeRef__Group__0 : rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 ;
    public final void rule__TypeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1277:1: ( rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1278:2: rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__02533);
            rule__TypeRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__02536);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1285:1: rule__TypeRef__Group__0__Impl : ( ( rule__TypeRef__ReferencedAssignment_0 ) ) ;
    public final void rule__TypeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1289:1: ( ( ( rule__TypeRef__ReferencedAssignment_0 ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1290:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1290:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1291:1: ( rule__TypeRef__ReferencedAssignment_0 )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedAssignment_0()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1292:1: ( rule__TypeRef__ReferencedAssignment_0 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1292:2: rule__TypeRef__ReferencedAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl2563);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1302:1: rule__TypeRef__Group__1 : rule__TypeRef__Group__1__Impl ;
    public final void rule__TypeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1306:1: ( rule__TypeRef__Group__1__Impl )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1307:2: rule__TypeRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__12593);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1313:1: rule__TypeRef__Group__1__Impl : ( ( rule__TypeRef__IsMultiAssignment_1 )? ) ;
    public final void rule__TypeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1317:1: ( ( ( rule__TypeRef__IsMultiAssignment_1 )? ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1318:1: ( ( rule__TypeRef__IsMultiAssignment_1 )? )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1318:1: ( ( rule__TypeRef__IsMultiAssignment_1 )? )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1319:1: ( rule__TypeRef__IsMultiAssignment_1 )?
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiAssignment_1()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1320:1: ( rule__TypeRef__IsMultiAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1320:2: rule__TypeRef__IsMultiAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TypeRef__IsMultiAssignment_1_in_rule__TypeRef__Group__1__Impl2620);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1334:1: rule__EFloatObject__Group__0 : rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1 ;
    public final void rule__EFloatObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1338:1: ( rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1339:2: rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__0__Impl_in_rule__EFloatObject__Group__02655);
            rule__EFloatObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__1_in_rule__EFloatObject__Group__02658);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1346:1: rule__EFloatObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloatObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1350:1: ( ( ( '-' )? ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1351:1: ( ( '-' )? )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1351:1: ( ( '-' )? )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1352:1: ( '-' )?
            {
             before(grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1353:1: ( '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1354:2: '-'
                    {
                    match(input,21,FOLLOW_21_in_rule__EFloatObject__Group__0__Impl2687); 

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1365:1: rule__EFloatObject__Group__1 : rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2 ;
    public final void rule__EFloatObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1369:1: ( rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1370:2: rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__1__Impl_in_rule__EFloatObject__Group__12720);
            rule__EFloatObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__2_in_rule__EFloatObject__Group__12723);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1377:1: rule__EFloatObject__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloatObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1381:1: ( ( ( RULE_INT )? ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1382:1: ( ( RULE_INT )? )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1382:1: ( ( RULE_INT )? )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1383:1: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1384:1: ( RULE_INT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1384:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EFloatObject__Group__1__Impl2751); 

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1394:1: rule__EFloatObject__Group__2 : rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3 ;
    public final void rule__EFloatObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1398:1: ( rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1399:2: rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__2__Impl_in_rule__EFloatObject__Group__22782);
            rule__EFloatObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__3_in_rule__EFloatObject__Group__22785);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1406:1: rule__EFloatObject__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloatObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1410:1: ( ( '.' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1411:1: ( '.' )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1411:1: ( '.' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1412:1: '.'
            {
             before(grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__EFloatObject__Group__2__Impl2813); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1425:1: rule__EFloatObject__Group__3 : rule__EFloatObject__Group__3__Impl ;
    public final void rule__EFloatObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1429:1: ( rule__EFloatObject__Group__3__Impl )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1430:2: rule__EFloatObject__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__3__Impl_in_rule__EFloatObject__Group__32844);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1436:1: rule__EFloatObject__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloatObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1440:1: ( ( RULE_INT ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1441:1: ( RULE_INT )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1441:1: ( RULE_INT )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1442:1: RULE_INT
            {
             before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EFloatObject__Group__3__Impl2871); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1461:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1465:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1466:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02908);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02911);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1473:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1477:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1478:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1478:1: ( RULE_ID )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1479:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2938); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1490:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1494:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1495:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12967);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1501:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1505:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1506:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1506:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1507:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1508:1: ( rule__QualifiedName__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1508:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2994);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1522:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1526:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1527:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03029);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03032);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1534:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1538:1: ( ( '.' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1539:1: ( '.' )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1539:1: ( '.' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1540:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,22,FOLLOW_22_in_rule__QualifiedName__Group_1__0__Impl3060); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1553:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1557:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1558:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13091);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1564:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1568:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1569:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1569:1: ( RULE_ID )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1570:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3118); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1586:1: rule__NotificationModel__ModuleAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__NotificationModel__ModuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1590:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1591:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1591:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1592:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getNotificationModelAccess().getModuleModuleCrossReference_1_0()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1593:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1594:1: ruleQualifiedName
            {
             before(grammarAccess.getNotificationModelAccess().getModuleModuleQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__NotificationModel__ModuleAssignment_13160);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1605:1: rule__NotificationModel__VersionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__NotificationModel__VersionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1609:1: ( ( RULE_STRING ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1610:1: ( RULE_STRING )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1610:1: ( RULE_STRING )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1611:1: RULE_STRING
            {
             before(grammarAccess.getNotificationModelAccess().getVersionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NotificationModel__VersionAssignment_33195); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1620:1: rule__NotificationModel__NotificationsAssignment_4 : ( ruleNotification ) ;
    public final void rule__NotificationModel__NotificationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1624:1: ( ( ruleNotification ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1625:1: ( ruleNotification )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1625:1: ( ruleNotification )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1626:1: ruleNotification
            {
             before(grammarAccess.getNotificationModelAccess().getNotificationsNotificationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleNotification_in_rule__NotificationModel__NotificationsAssignment_43226);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1635:1: rule__Notification__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Notification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1639:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1640:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1640:1: ( RULE_ID )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1641:1: RULE_ID
            {
             before(grammarAccess.getNotificationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Notification__NameAssignment_13257); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1650:1: rule__Notification__FeaturesAssignment_3 : ( ruleFeature ) ;
    public final void rule__Notification__FeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1654:1: ( ( ruleFeature ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1655:1: ( ruleFeature )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1655:1: ( ruleFeature )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1656:1: ruleFeature
            {
             before(grammarAccess.getNotificationAccess().getFeaturesFeatureParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Notification__FeaturesAssignment_33288);
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


    // $ANTLR start "rule__Primitive__NameAssignment_1"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1667:1: rule__Primitive__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Primitive__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1671:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1672:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1672:1: ( RULE_ID )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1673:1: RULE_ID
            {
             before(grammarAccess.getPrimitiveAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Primitive__NameAssignment_13321); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1682:1: rule__Any__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Any__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1686:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1687:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1687:1: ( RULE_ID )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1688:1: RULE_ID
            {
             before(grammarAccess.getAnyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Any__NameAssignment_13352); 
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


    // $ANTLR start "rule__Feature__IsIndexedAssignment_0"
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1697:1: rule__Feature__IsIndexedAssignment_0 : ( ( 'indexed' ) ) ;
    public final void rule__Feature__IsIndexedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1701:1: ( ( ( 'indexed' ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1702:1: ( ( 'indexed' ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1702:1: ( ( 'indexed' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1703:1: ( 'indexed' )
            {
             before(grammarAccess.getFeatureAccess().getIsIndexedIndexedKeyword_0_0()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1704:1: ( 'indexed' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1705:1: 'indexed'
            {
             before(grammarAccess.getFeatureAccess().getIsIndexedIndexedKeyword_0_0()); 
            match(input,23,FOLLOW_23_in_rule__Feature__IsIndexedAssignment_03388); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1720:1: rule__Feature__IsContainmentAssignment_1 : ( ( '-[' ) ) ;
    public final void rule__Feature__IsContainmentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1724:1: ( ( ( '-[' ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1725:1: ( ( '-[' ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1725:1: ( ( '-[' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1726:1: ( '-[' )
            {
             before(grammarAccess.getFeatureAccess().getIsContainmentHyphenMinusLeftSquareBracketKeyword_1_0()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1727:1: ( '-[' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1728:1: '-['
            {
             before(grammarAccess.getFeatureAccess().getIsContainmentHyphenMinusLeftSquareBracketKeyword_1_0()); 
            match(input,24,FOLLOW_24_in_rule__Feature__IsContainmentAssignment_13432); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1743:1: rule__Feature__TypeAssignment_2 : ( ruleTypeRef ) ;
    public final void rule__Feature__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1747:1: ( ( ruleTypeRef ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1748:1: ( ruleTypeRef )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1748:1: ( ruleTypeRef )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1749:1: ruleTypeRef
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeRefParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Feature__TypeAssignment_23471);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1758:1: rule__Feature__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1762:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1763:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1763:1: ( RULE_ID )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1764:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_33502); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1773:1: rule__Feature__DefaultValueAssignment_4_1 : ( ruleValueObject ) ;
    public final void rule__Feature__DefaultValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1777:1: ( ( ruleValueObject ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1778:1: ( ruleValueObject )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1778:1: ( ruleValueObject )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1779:1: ruleValueObject
            {
             before(grammarAccess.getFeatureAccess().getDefaultValueValueObjectParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleValueObject_in_rule__Feature__DefaultValueAssignment_4_13533);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1788:1: rule__Feature__InverseAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Feature__InverseAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1792:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1793:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1793:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1794:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getFeatureAccess().getInverseFeatureCrossReference_5_1_0()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1795:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1796:1: ruleQualifiedName
            {
             before(grammarAccess.getFeatureAccess().getInverseFeatureQualifiedNameParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Feature__InverseAssignment_5_13568);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getInverseFeatureQualifiedNameParserRuleCall_5_1_0_1()); 

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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1807:1: rule__TypeRef__ReferencedAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TypeRef__ReferencedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1811:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1812:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1812:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1813:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1814:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1815:1: ruleQualifiedName
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_03607);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1826:1: rule__TypeRef__IsMultiAssignment_1 : ( ( '[]' ) ) ;
    public final void rule__TypeRef__IsMultiAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1830:1: ( ( ( '[]' ) ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1831:1: ( ( '[]' ) )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1831:1: ( ( '[]' ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1832:1: ( '[]' )
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1833:1: ( '[]' )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1834:1: '[]'
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            match(input,25,FOLLOW_25_in_rule__TypeRef__IsMultiAssignment_13647); 
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1849:1: rule__StringValue__ValueAssignment : ( ruleEStringObject ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1853:1: ( ( ruleEStringObject ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1854:1: ( ruleEStringObject )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1854:1: ( ruleEStringObject )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1855:1: ruleEStringObject
            {
             before(grammarAccess.getStringValueAccess().getValueEStringObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEStringObject_in_rule__StringValue__ValueAssignment3686);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1864:1: rule__IntegerValue__ValueAssignment : ( ruleEIntegerObject ) ;
    public final void rule__IntegerValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1868:1: ( ( ruleEIntegerObject ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1869:1: ( ruleEIntegerObject )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1869:1: ( ruleEIntegerObject )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1870:1: ruleEIntegerObject
            {
             before(grammarAccess.getIntegerValueAccess().getValueEIntegerObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_rule__IntegerValue__ValueAssignment3717);
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
    // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1879:1: rule__FloatValue__ValueAssignment : ( ruleEFloatObject ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1883:1: ( ( ruleEFloatObject ) )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1884:1: ( ruleEFloatObject )
            {
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1884:1: ( ruleEFloatObject )
            // ../de.dubmas.modulob.notificationdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalNotificationDsl.g:1885:1: ruleEFloatObject
            {
             before(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_rule__FloatValue__ValueAssignment3748);
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
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__0_in_rulePrimitive216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAny_in_entryRuleAny243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAny250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__Group__0_in_ruleAny276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0_in_ruleFeature336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueObject_in_entryRuleValueObject423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueObject430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueObject__Alternatives_in_ruleValueObject456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_entryRuleEStringObject543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEStringObject550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEStringObject576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerValue__ValueAssignment_in_ruleIntegerValue635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEIntegerObject669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEIntegerObject695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEFloatObject788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__0_in_ruleEFloatObject814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__ValueObject__Alternatives910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_rule__ValueObject__Alternatives927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_rule__ValueObject__Alternatives944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationModel__Group__0__Impl_in_rule__NotificationModel__Group__0974 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__NotificationModel__Group__1_in_rule__NotificationModel__Group__0977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__NotificationModel__Group__0__Impl1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationModel__Group__1__Impl_in_rule__NotificationModel__Group__11036 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__NotificationModel__Group__2_in_rule__NotificationModel__Group__11039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationModel__ModuleAssignment_1_in_rule__NotificationModel__Group__1__Impl1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationModel__Group__2__Impl_in_rule__NotificationModel__Group__21096 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NotificationModel__Group__3_in_rule__NotificationModel__Group__21099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__NotificationModel__Group__2__Impl1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationModel__Group__3__Impl_in_rule__NotificationModel__Group__31158 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__NotificationModel__Group__4_in_rule__NotificationModel__Group__31161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationModel__VersionAssignment_3_in_rule__NotificationModel__Group__3__Impl1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationModel__Group__4__Impl_in_rule__NotificationModel__Group__41218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotificationModel__NotificationsAssignment_4_in_rule__NotificationModel__Group__4__Impl1245 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Notification__Group__0__Impl_in_rule__Notification__Group__01286 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Notification__Group__1_in_rule__Notification__Group__01289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Notification__Group__0__Impl1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Notification__Group__1__Impl_in_rule__Notification__Group__11348 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Notification__Group__2_in_rule__Notification__Group__11351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Notification__NameAssignment_1_in_rule__Notification__Group__1__Impl1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Notification__Group__2__Impl_in_rule__Notification__Group__21408 = new BitSet(new long[]{0x0000000001808040L});
    public static final BitSet FOLLOW_rule__Notification__Group__3_in_rule__Notification__Group__21411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Notification__Group__2__Impl1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Notification__Group__3__Impl_in_rule__Notification__Group__31470 = new BitSet(new long[]{0x0000000001808040L});
    public static final BitSet FOLLOW_rule__Notification__Group__4_in_rule__Notification__Group__31473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Notification__FeaturesAssignment_3_in_rule__Notification__Group__3__Impl1500 = new BitSet(new long[]{0x0000000001800042L});
    public static final BitSet FOLLOW_rule__Notification__Group__4__Impl_in_rule__Notification__Group__41531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Notification__Group__4__Impl1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__0__Impl_in_rule__Primitive__Group__01601 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Primitive__Group__1_in_rule__Primitive__Group__01604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Primitive__Group__0__Impl1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__1__Impl_in_rule__Primitive__Group__11663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__NameAssignment_1_in_rule__Primitive__Group__1__Impl1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__Group__0__Impl_in_rule__Any__Group__01724 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Any__Group__1_in_rule__Any__Group__01727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Any__Group__0__Impl1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__Group__1__Impl_in_rule__Any__Group__11786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__NameAssignment_1_in_rule__Any__Group__1__Impl1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__01847 = new BitSet(new long[]{0x0000000001800040L});
    public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__01850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__IsIndexedAssignment_0_in_rule__Feature__Group__0__Impl1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__11908 = new BitSet(new long[]{0x0000000001800040L});
    public static final BitSet FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__11911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__IsContainmentAssignment_1_in_rule__Feature__Group__1__Impl1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__21969 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__21972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__TypeAssignment_2_in_rule__Feature__Group__2__Impl1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__32029 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_rule__Feature__Group__4_in_rule__Feature__Group__32032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__NameAssignment_3_in_rule__Feature__Group__3__Impl2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__4__Impl_in_rule__Feature__Group__42089 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_rule__Feature__Group__5_in_rule__Feature__Group__42092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_4__0_in_rule__Feature__Group__4__Impl2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__5__Impl_in_rule__Feature__Group__52150 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_rule__Feature__Group__6_in_rule__Feature__Group__52153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_5__0_in_rule__Feature__Group__5__Impl2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__6__Impl_in_rule__Feature__Group__62211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Feature__Group__6__Impl2240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_4__0__Impl_in_rule__Feature__Group_4__02287 = new BitSet(new long[]{0x0000000000600030L});
    public static final BitSet FOLLOW_rule__Feature__Group_4__1_in_rule__Feature__Group_4__02290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Feature__Group_4__0__Impl2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_4__1__Impl_in_rule__Feature__Group_4__12349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__DefaultValueAssignment_4_1_in_rule__Feature__Group_4__1__Impl2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_5__0__Impl_in_rule__Feature__Group_5__02410 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Feature__Group_5__1_in_rule__Feature__Group_5__02413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Feature__Group_5__0__Impl2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_5__1__Impl_in_rule__Feature__Group_5__12472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__InverseAssignment_5_1_in_rule__Feature__Group_5__1__Impl2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__02533 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__02536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl2563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__12593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__IsMultiAssignment_1_in_rule__TypeRef__Group__1__Impl2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__0__Impl_in_rule__EFloatObject__Group__02655 = new BitSet(new long[]{0x0000000000600030L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__1_in_rule__EFloatObject__Group__02658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EFloatObject__Group__0__Impl2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__1__Impl_in_rule__EFloatObject__Group__12720 = new BitSet(new long[]{0x0000000000600030L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__2_in_rule__EFloatObject__Group__12723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group__1__Impl2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__2__Impl_in_rule__EFloatObject__Group__22782 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__3_in_rule__EFloatObject__Group__22785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EFloatObject__Group__2__Impl2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__3__Impl_in_rule__EFloatObject__Group__32844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group__3__Impl2871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02908 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2994 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03029 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__QualifiedName__Group_1__0__Impl3060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__NotificationModel__ModuleAssignment_13160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__NotificationModel__VersionAssignment_33195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotification_in_rule__NotificationModel__NotificationsAssignment_43226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Notification__NameAssignment_13257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Notification__FeaturesAssignment_33288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Primitive__NameAssignment_13321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Any__NameAssignment_13352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Feature__IsIndexedAssignment_03388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Feature__IsContainmentAssignment_13432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Feature__TypeAssignment_23471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_33502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueObject_in_rule__Feature__DefaultValueAssignment_4_13533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Feature__InverseAssignment_5_13568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_03607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__TypeRef__IsMultiAssignment_13647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_rule__StringValue__ValueAssignment3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_rule__IntegerValue__ValueAssignment3717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_rule__FloatValue__ValueAssignment3748 = new BitSet(new long[]{0x0000000000000002L});

}