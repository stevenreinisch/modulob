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
import de.dubmas.modulob.services.SystemDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSystemDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_DOC_COMMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'consistsOf'", "','", "'module'", "'primitive type'", "'any type'", "'-'", "'.'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_DOC_COMMENT=7;
    public static final int RULE_ANY_OTHER=11;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=9;
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


        public InternalSystemDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSystemDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSystemDslParser.tokenNames; }
    public String getGrammarFileName() { return "../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g"; }


     
     	private SystemDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SystemDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleSystem"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:60:1: entryRuleSystem : ruleSystem EOF ;
    public final void entryRuleSystem() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:61:1: ( ruleSystem EOF )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:62:1: ruleSystem EOF
            {
             before(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_ruleSystem_in_entryRuleSystem61);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getSystemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystem68); 

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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:69:1: ruleSystem : ( ( rule__System__Group__0 ) ) ;
    public final void ruleSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:73:2: ( ( ( rule__System__Group__0 ) ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:74:1: ( ( rule__System__Group__0 ) )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:74:1: ( ( rule__System__Group__0 ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:75:1: ( rule__System__Group__0 )
            {
             before(grammarAccess.getSystemAccess().getGroup()); 
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:76:1: ( rule__System__Group__0 )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:76:2: rule__System__Group__0
            {
            pushFollow(FOLLOW_rule__System__Group__0_in_ruleSystem94);
            rule__System__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getGroup()); 

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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleModule"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:88:1: entryRuleModule : ruleModule EOF ;
    public final void entryRuleModule() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:89:1: ( ruleModule EOF )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:90:1: ruleModule EOF
            {
             before(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule121);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getModuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule128); 

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
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:97:1: ruleModule : ( ( rule__Module__Group__0 ) ) ;
    public final void ruleModule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:101:2: ( ( ( rule__Module__Group__0 ) ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:102:1: ( ( rule__Module__Group__0 ) )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:102:1: ( ( rule__Module__Group__0 ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:103:1: ( rule__Module__Group__0 )
            {
             before(grammarAccess.getModuleAccess().getGroup()); 
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:104:1: ( rule__Module__Group__0 )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:104:2: rule__Module__Group__0
            {
            pushFollow(FOLLOW_rule__Module__Group__0_in_ruleModule154);
            rule__Module__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getGroup()); 

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
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRulePrimitive"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:118:1: entryRulePrimitive : rulePrimitive EOF ;
    public final void entryRulePrimitive() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:119:1: ( rulePrimitive EOF )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:120:1: rulePrimitive EOF
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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:127:1: rulePrimitive : ( ( rule__Primitive__Group__0 ) ) ;
    public final void rulePrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:131:2: ( ( ( rule__Primitive__Group__0 ) ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:132:1: ( ( rule__Primitive__Group__0 ) )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:132:1: ( ( rule__Primitive__Group__0 ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:133:1: ( rule__Primitive__Group__0 )
            {
             before(grammarAccess.getPrimitiveAccess().getGroup()); 
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:134:1: ( rule__Primitive__Group__0 )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:134:2: rule__Primitive__Group__0
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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:146:1: entryRuleAny : ruleAny EOF ;
    public final void entryRuleAny() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:147:1: ( ruleAny EOF )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:148:1: ruleAny EOF
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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:155:1: ruleAny : ( ( rule__Any__Group__0 ) ) ;
    public final void ruleAny() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:159:2: ( ( ( rule__Any__Group__0 ) ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:160:1: ( ( rule__Any__Group__0 ) )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:160:1: ( ( rule__Any__Group__0 ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:161:1: ( rule__Any__Group__0 )
            {
             before(grammarAccess.getAnyAccess().getGroup()); 
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:162:1: ( rule__Any__Group__0 )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:162:2: rule__Any__Group__0
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


    // $ANTLR start "entryRuleStringValue"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:178:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:179:1: ( ruleStringValue EOF )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:180:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue307);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue314); 

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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:187:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:191:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:192:1: ( ( rule__StringValue__ValueAssignment ) )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:192:1: ( ( rule__StringValue__ValueAssignment ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:193:1: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:194:1: ( rule__StringValue__ValueAssignment )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:194:2: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue340);
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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:206:1: entryRuleEStringObject : ruleEStringObject EOF ;
    public final void entryRuleEStringObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:207:1: ( ruleEStringObject EOF )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:208:1: ruleEStringObject EOF
            {
             before(grammarAccess.getEStringObjectRule()); 
            pushFollow(FOLLOW_ruleEStringObject_in_entryRuleEStringObject367);
            ruleEStringObject();

            state._fsp--;

             after(grammarAccess.getEStringObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEStringObject374); 

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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:215:1: ruleEStringObject : ( RULE_STRING ) ;
    public final void ruleEStringObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:219:2: ( ( RULE_STRING ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:220:1: ( RULE_STRING )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:220:1: ( RULE_STRING )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:221:1: RULE_STRING
            {
             before(grammarAccess.getEStringObjectAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEStringObject400); 
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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:234:1: entryRuleIntegerValue : ruleIntegerValue EOF ;
    public final void entryRuleIntegerValue() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:235:1: ( ruleIntegerValue EOF )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:236:1: ruleIntegerValue EOF
            {
             before(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue426);
            ruleIntegerValue();

            state._fsp--;

             after(grammarAccess.getIntegerValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValue433); 

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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:243:1: ruleIntegerValue : ( ( rule__IntegerValue__ValueAssignment ) ) ;
    public final void ruleIntegerValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:247:2: ( ( ( rule__IntegerValue__ValueAssignment ) ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:248:1: ( ( rule__IntegerValue__ValueAssignment ) )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:248:1: ( ( rule__IntegerValue__ValueAssignment ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:249:1: ( rule__IntegerValue__ValueAssignment )
            {
             before(grammarAccess.getIntegerValueAccess().getValueAssignment()); 
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:250:1: ( rule__IntegerValue__ValueAssignment )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:250:2: rule__IntegerValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntegerValue__ValueAssignment_in_ruleIntegerValue459);
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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:262:1: entryRuleEIntegerObject : ruleEIntegerObject EOF ;
    public final void entryRuleEIntegerObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:263:1: ( ruleEIntegerObject EOF )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:264:1: ruleEIntegerObject EOF
            {
             before(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject486);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getEIntegerObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEIntegerObject493); 

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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:271:1: ruleEIntegerObject : ( RULE_INT ) ;
    public final void ruleEIntegerObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:275:2: ( ( RULE_INT ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:276:1: ( RULE_INT )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:276:1: ( RULE_INT )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:277:1: RULE_INT
            {
             before(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEIntegerObject519); 
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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:290:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:291:1: ( ruleFloatValue EOF )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:292:1: ruleFloatValue EOF
            {
             before(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue545);
            ruleFloatValue();

            state._fsp--;

             after(grammarAccess.getFloatValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue552); 

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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:299:1: ruleFloatValue : ( ( rule__FloatValue__ValueAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:303:2: ( ( ( rule__FloatValue__ValueAssignment ) ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:304:1: ( ( rule__FloatValue__ValueAssignment ) )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:304:1: ( ( rule__FloatValue__ValueAssignment ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:305:1: ( rule__FloatValue__ValueAssignment )
            {
             before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:306:1: ( rule__FloatValue__ValueAssignment )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:306:2: rule__FloatValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue578);
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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:318:1: entryRuleEFloatObject : ruleEFloatObject EOF ;
    public final void entryRuleEFloatObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:319:1: ( ruleEFloatObject EOF )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:320:1: ruleEFloatObject EOF
            {
             before(grammarAccess.getEFloatObjectRule()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject605);
            ruleEFloatObject();

            state._fsp--;

             after(grammarAccess.getEFloatObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEFloatObject612); 

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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:327:1: ruleEFloatObject : ( ( rule__EFloatObject__Group__0 ) ) ;
    public final void ruleEFloatObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:331:2: ( ( ( rule__EFloatObject__Group__0 ) ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:332:1: ( ( rule__EFloatObject__Group__0 ) )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:332:1: ( ( rule__EFloatObject__Group__0 ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:333:1: ( rule__EFloatObject__Group__0 )
            {
             before(grammarAccess.getEFloatObjectAccess().getGroup()); 
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:334:1: ( rule__EFloatObject__Group__0 )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:334:2: rule__EFloatObject__Group__0
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__0_in_ruleEFloatObject638);
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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:346:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:347:1: ( ruleQualifiedName EOF )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:348:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName665);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName672); 

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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:355:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:359:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:360:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:360:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:361:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:362:1: ( rule__QualifiedName__Group__0 )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:362:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName698);
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


    // $ANTLR start "rule__System__Group__0"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:377:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:381:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:382:2: rule__System__Group__0__Impl rule__System__Group__1
            {
            pushFollow(FOLLOW_rule__System__Group__0__Impl_in_rule__System__Group__0733);
            rule__System__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__1_in_rule__System__Group__0736);
            rule__System__Group__1();

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
    // $ANTLR end "rule__System__Group__0"


    // $ANTLR start "rule__System__Group__0__Impl"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:389:1: rule__System__Group__0__Impl : ( 'system' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:393:1: ( ( 'system' ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:394:1: ( 'system' )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:394:1: ( 'system' )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:395:1: 'system'
            {
             before(grammarAccess.getSystemAccess().getSystemKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__System__Group__0__Impl764); 
             after(grammarAccess.getSystemAccess().getSystemKeyword_0()); 

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
    // $ANTLR end "rule__System__Group__0__Impl"


    // $ANTLR start "rule__System__Group__1"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:408:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:412:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:413:2: rule__System__Group__1__Impl rule__System__Group__2
            {
            pushFollow(FOLLOW_rule__System__Group__1__Impl_in_rule__System__Group__1795);
            rule__System__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__2_in_rule__System__Group__1798);
            rule__System__Group__2();

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
    // $ANTLR end "rule__System__Group__1"


    // $ANTLR start "rule__System__Group__1__Impl"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:420:1: rule__System__Group__1__Impl : ( ( rule__System__NameAssignment_1 ) ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:424:1: ( ( ( rule__System__NameAssignment_1 ) ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:425:1: ( ( rule__System__NameAssignment_1 ) )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:425:1: ( ( rule__System__NameAssignment_1 ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:426:1: ( rule__System__NameAssignment_1 )
            {
             before(grammarAccess.getSystemAccess().getNameAssignment_1()); 
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:427:1: ( rule__System__NameAssignment_1 )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:427:2: rule__System__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__System__NameAssignment_1_in_rule__System__Group__1__Impl825);
            rule__System__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__System__Group__1__Impl"


    // $ANTLR start "rule__System__Group__2"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:437:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:441:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:442:2: rule__System__Group__2__Impl rule__System__Group__3
            {
            pushFollow(FOLLOW_rule__System__Group__2__Impl_in_rule__System__Group__2855);
            rule__System__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__3_in_rule__System__Group__2858);
            rule__System__Group__3();

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
    // $ANTLR end "rule__System__Group__2"


    // $ANTLR start "rule__System__Group__2__Impl"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:449:1: rule__System__Group__2__Impl : ( 'consistsOf' ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:453:1: ( ( 'consistsOf' ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:454:1: ( 'consistsOf' )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:454:1: ( 'consistsOf' )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:455:1: 'consistsOf'
            {
             before(grammarAccess.getSystemAccess().getConsistsOfKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__System__Group__2__Impl886); 
             after(grammarAccess.getSystemAccess().getConsistsOfKeyword_2()); 

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
    // $ANTLR end "rule__System__Group__2__Impl"


    // $ANTLR start "rule__System__Group__3"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:468:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:472:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:473:2: rule__System__Group__3__Impl rule__System__Group__4
            {
            pushFollow(FOLLOW_rule__System__Group__3__Impl_in_rule__System__Group__3917);
            rule__System__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__4_in_rule__System__Group__3920);
            rule__System__Group__4();

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
    // $ANTLR end "rule__System__Group__3"


    // $ANTLR start "rule__System__Group__3__Impl"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:480:1: rule__System__Group__3__Impl : ( ( rule__System__ModulesAssignment_3 ) ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:484:1: ( ( ( rule__System__ModulesAssignment_3 ) ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:485:1: ( ( rule__System__ModulesAssignment_3 ) )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:485:1: ( ( rule__System__ModulesAssignment_3 ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:486:1: ( rule__System__ModulesAssignment_3 )
            {
             before(grammarAccess.getSystemAccess().getModulesAssignment_3()); 
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:487:1: ( rule__System__ModulesAssignment_3 )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:487:2: rule__System__ModulesAssignment_3
            {
            pushFollow(FOLLOW_rule__System__ModulesAssignment_3_in_rule__System__Group__3__Impl947);
            rule__System__ModulesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getModulesAssignment_3()); 

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
    // $ANTLR end "rule__System__Group__3__Impl"


    // $ANTLR start "rule__System__Group__4"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:497:1: rule__System__Group__4 : rule__System__Group__4__Impl ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:501:1: ( rule__System__Group__4__Impl )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:502:2: rule__System__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__System__Group__4__Impl_in_rule__System__Group__4977);
            rule__System__Group__4__Impl();

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
    // $ANTLR end "rule__System__Group__4"


    // $ANTLR start "rule__System__Group__4__Impl"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:508:1: rule__System__Group__4__Impl : ( ( rule__System__Group_4__0 )* ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:512:1: ( ( ( rule__System__Group_4__0 )* ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:513:1: ( ( rule__System__Group_4__0 )* )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:513:1: ( ( rule__System__Group_4__0 )* )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:514:1: ( rule__System__Group_4__0 )*
            {
             before(grammarAccess.getSystemAccess().getGroup_4()); 
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:515:1: ( rule__System__Group_4__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:515:2: rule__System__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__System__Group_4__0_in_rule__System__Group__4__Impl1004);
            	    rule__System__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getGroup_4()); 

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
    // $ANTLR end "rule__System__Group__4__Impl"


    // $ANTLR start "rule__System__Group_4__0"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:535:1: rule__System__Group_4__0 : rule__System__Group_4__0__Impl rule__System__Group_4__1 ;
    public final void rule__System__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:539:1: ( rule__System__Group_4__0__Impl rule__System__Group_4__1 )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:540:2: rule__System__Group_4__0__Impl rule__System__Group_4__1
            {
            pushFollow(FOLLOW_rule__System__Group_4__0__Impl_in_rule__System__Group_4__01045);
            rule__System__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group_4__1_in_rule__System__Group_4__01048);
            rule__System__Group_4__1();

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
    // $ANTLR end "rule__System__Group_4__0"


    // $ANTLR start "rule__System__Group_4__0__Impl"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:547:1: rule__System__Group_4__0__Impl : ( ',' ) ;
    public final void rule__System__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:551:1: ( ( ',' ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:552:1: ( ',' )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:552:1: ( ',' )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:553:1: ','
            {
             before(grammarAccess.getSystemAccess().getCommaKeyword_4_0()); 
            match(input,14,FOLLOW_14_in_rule__System__Group_4__0__Impl1076); 
             after(grammarAccess.getSystemAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__System__Group_4__0__Impl"


    // $ANTLR start "rule__System__Group_4__1"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:566:1: rule__System__Group_4__1 : rule__System__Group_4__1__Impl ;
    public final void rule__System__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:570:1: ( rule__System__Group_4__1__Impl )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:571:2: rule__System__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__System__Group_4__1__Impl_in_rule__System__Group_4__11107);
            rule__System__Group_4__1__Impl();

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
    // $ANTLR end "rule__System__Group_4__1"


    // $ANTLR start "rule__System__Group_4__1__Impl"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:577:1: rule__System__Group_4__1__Impl : ( ( rule__System__ModulesAssignment_4_1 ) ) ;
    public final void rule__System__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:581:1: ( ( ( rule__System__ModulesAssignment_4_1 ) ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:582:1: ( ( rule__System__ModulesAssignment_4_1 ) )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:582:1: ( ( rule__System__ModulesAssignment_4_1 ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:583:1: ( rule__System__ModulesAssignment_4_1 )
            {
             before(grammarAccess.getSystemAccess().getModulesAssignment_4_1()); 
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:584:1: ( rule__System__ModulesAssignment_4_1 )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:584:2: rule__System__ModulesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__System__ModulesAssignment_4_1_in_rule__System__Group_4__1__Impl1134);
            rule__System__ModulesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getModulesAssignment_4_1()); 

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
    // $ANTLR end "rule__System__Group_4__1__Impl"


    // $ANTLR start "rule__Module__Group__0"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:598:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:602:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:603:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__01168);
            rule__Module__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__1_in_rule__Module__Group__01171);
            rule__Module__Group__1();

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
    // $ANTLR end "rule__Module__Group__0"


    // $ANTLR start "rule__Module__Group__0__Impl"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:610:1: rule__Module__Group__0__Impl : ( ( rule__Module__CommentAssignment_0 )? ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:614:1: ( ( ( rule__Module__CommentAssignment_0 )? ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:615:1: ( ( rule__Module__CommentAssignment_0 )? )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:615:1: ( ( rule__Module__CommentAssignment_0 )? )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:616:1: ( rule__Module__CommentAssignment_0 )?
            {
             before(grammarAccess.getModuleAccess().getCommentAssignment_0()); 
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:617:1: ( rule__Module__CommentAssignment_0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_DOC_COMMENT) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:617:2: rule__Module__CommentAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Module__CommentAssignment_0_in_rule__Module__Group__0__Impl1198);
                    rule__Module__CommentAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModuleAccess().getCommentAssignment_0()); 

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
    // $ANTLR end "rule__Module__Group__0__Impl"


    // $ANTLR start "rule__Module__Group__1"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:627:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:631:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:632:2: rule__Module__Group__1__Impl rule__Module__Group__2
            {
            pushFollow(FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__11229);
            rule__Module__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__2_in_rule__Module__Group__11232);
            rule__Module__Group__2();

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
    // $ANTLR end "rule__Module__Group__1"


    // $ANTLR start "rule__Module__Group__1__Impl"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:639:1: rule__Module__Group__1__Impl : ( 'module' ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:643:1: ( ( 'module' ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:644:1: ( 'module' )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:644:1: ( 'module' )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:645:1: 'module'
            {
             before(grammarAccess.getModuleAccess().getModuleKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__Module__Group__1__Impl1260); 
             after(grammarAccess.getModuleAccess().getModuleKeyword_1()); 

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
    // $ANTLR end "rule__Module__Group__1__Impl"


    // $ANTLR start "rule__Module__Group__2"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:658:1: rule__Module__Group__2 : rule__Module__Group__2__Impl ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:662:1: ( rule__Module__Group__2__Impl )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:663:2: rule__Module__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__21291);
            rule__Module__Group__2__Impl();

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
    // $ANTLR end "rule__Module__Group__2"


    // $ANTLR start "rule__Module__Group__2__Impl"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:669:1: rule__Module__Group__2__Impl : ( ( rule__Module__NameAssignment_2 ) ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:673:1: ( ( ( rule__Module__NameAssignment_2 ) ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:674:1: ( ( rule__Module__NameAssignment_2 ) )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:674:1: ( ( rule__Module__NameAssignment_2 ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:675:1: ( rule__Module__NameAssignment_2 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_2()); 
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:676:1: ( rule__Module__NameAssignment_2 )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:676:2: rule__Module__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Module__NameAssignment_2_in_rule__Module__Group__2__Impl1318);
            rule__Module__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Module__Group__2__Impl"


    // $ANTLR start "rule__Primitive__Group__0"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:693:1: rule__Primitive__Group__0 : rule__Primitive__Group__0__Impl rule__Primitive__Group__1 ;
    public final void rule__Primitive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:697:1: ( rule__Primitive__Group__0__Impl rule__Primitive__Group__1 )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:698:2: rule__Primitive__Group__0__Impl rule__Primitive__Group__1
            {
            pushFollow(FOLLOW_rule__Primitive__Group__0__Impl_in_rule__Primitive__Group__01355);
            rule__Primitive__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primitive__Group__1_in_rule__Primitive__Group__01358);
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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:705:1: rule__Primitive__Group__0__Impl : ( 'primitive type' ) ;
    public final void rule__Primitive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:709:1: ( ( 'primitive type' ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:710:1: ( 'primitive type' )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:710:1: ( 'primitive type' )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:711:1: 'primitive type'
            {
             before(grammarAccess.getPrimitiveAccess().getPrimitiveTypeKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Primitive__Group__0__Impl1386); 
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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:724:1: rule__Primitive__Group__1 : rule__Primitive__Group__1__Impl ;
    public final void rule__Primitive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:728:1: ( rule__Primitive__Group__1__Impl )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:729:2: rule__Primitive__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Primitive__Group__1__Impl_in_rule__Primitive__Group__11417);
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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:735:1: rule__Primitive__Group__1__Impl : ( ( rule__Primitive__NameAssignment_1 ) ) ;
    public final void rule__Primitive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:739:1: ( ( ( rule__Primitive__NameAssignment_1 ) ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:740:1: ( ( rule__Primitive__NameAssignment_1 ) )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:740:1: ( ( rule__Primitive__NameAssignment_1 ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:741:1: ( rule__Primitive__NameAssignment_1 )
            {
             before(grammarAccess.getPrimitiveAccess().getNameAssignment_1()); 
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:742:1: ( rule__Primitive__NameAssignment_1 )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:742:2: rule__Primitive__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Primitive__NameAssignment_1_in_rule__Primitive__Group__1__Impl1444);
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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:756:1: rule__Any__Group__0 : rule__Any__Group__0__Impl rule__Any__Group__1 ;
    public final void rule__Any__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:760:1: ( rule__Any__Group__0__Impl rule__Any__Group__1 )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:761:2: rule__Any__Group__0__Impl rule__Any__Group__1
            {
            pushFollow(FOLLOW_rule__Any__Group__0__Impl_in_rule__Any__Group__01478);
            rule__Any__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Any__Group__1_in_rule__Any__Group__01481);
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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:768:1: rule__Any__Group__0__Impl : ( 'any type' ) ;
    public final void rule__Any__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:772:1: ( ( 'any type' ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:773:1: ( 'any type' )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:773:1: ( 'any type' )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:774:1: 'any type'
            {
             before(grammarAccess.getAnyAccess().getAnyTypeKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Any__Group__0__Impl1509); 
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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:787:1: rule__Any__Group__1 : rule__Any__Group__1__Impl ;
    public final void rule__Any__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:791:1: ( rule__Any__Group__1__Impl )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:792:2: rule__Any__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Any__Group__1__Impl_in_rule__Any__Group__11540);
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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:798:1: rule__Any__Group__1__Impl : ( ( rule__Any__NameAssignment_1 ) ) ;
    public final void rule__Any__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:802:1: ( ( ( rule__Any__NameAssignment_1 ) ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:803:1: ( ( rule__Any__NameAssignment_1 ) )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:803:1: ( ( rule__Any__NameAssignment_1 ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:804:1: ( rule__Any__NameAssignment_1 )
            {
             before(grammarAccess.getAnyAccess().getNameAssignment_1()); 
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:805:1: ( rule__Any__NameAssignment_1 )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:805:2: rule__Any__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Any__NameAssignment_1_in_rule__Any__Group__1__Impl1567);
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


    // $ANTLR start "rule__EFloatObject__Group__0"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:820:1: rule__EFloatObject__Group__0 : rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1 ;
    public final void rule__EFloatObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:824:1: ( rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1 )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:825:2: rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__0__Impl_in_rule__EFloatObject__Group__01602);
            rule__EFloatObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__1_in_rule__EFloatObject__Group__01605);
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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:832:1: rule__EFloatObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloatObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:836:1: ( ( ( '-' )? ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:837:1: ( ( '-' )? )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:837:1: ( ( '-' )? )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:838:1: ( '-' )?
            {
             before(grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); 
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:839:1: ( '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:840:2: '-'
                    {
                    match(input,18,FOLLOW_18_in_rule__EFloatObject__Group__0__Impl1634); 

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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:851:1: rule__EFloatObject__Group__1 : rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2 ;
    public final void rule__EFloatObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:855:1: ( rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2 )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:856:2: rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__1__Impl_in_rule__EFloatObject__Group__11667);
            rule__EFloatObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__2_in_rule__EFloatObject__Group__11670);
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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:863:1: rule__EFloatObject__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloatObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:867:1: ( ( ( RULE_INT )? ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:868:1: ( ( RULE_INT )? )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:868:1: ( ( RULE_INT )? )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:869:1: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); 
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:870:1: ( RULE_INT )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:870:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EFloatObject__Group__1__Impl1698); 

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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:880:1: rule__EFloatObject__Group__2 : rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3 ;
    public final void rule__EFloatObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:884:1: ( rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3 )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:885:2: rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__2__Impl_in_rule__EFloatObject__Group__21729);
            rule__EFloatObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__3_in_rule__EFloatObject__Group__21732);
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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:892:1: rule__EFloatObject__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloatObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:896:1: ( ( '.' ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:897:1: ( '.' )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:897:1: ( '.' )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:898:1: '.'
            {
             before(grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__EFloatObject__Group__2__Impl1760); 
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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:911:1: rule__EFloatObject__Group__3 : rule__EFloatObject__Group__3__Impl ;
    public final void rule__EFloatObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:915:1: ( rule__EFloatObject__Group__3__Impl )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:916:2: rule__EFloatObject__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__3__Impl_in_rule__EFloatObject__Group__31791);
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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:922:1: rule__EFloatObject__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloatObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:926:1: ( ( RULE_INT ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:927:1: ( RULE_INT )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:927:1: ( RULE_INT )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:928:1: RULE_INT
            {
             before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EFloatObject__Group__3__Impl1818); 
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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:947:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:951:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:952:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01855);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01858);
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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:959:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:963:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:964:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:964:1: ( RULE_ID )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:965:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1885); 
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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:976:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:980:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:981:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11914);
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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:987:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:991:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:992:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:992:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:993:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:994:1: ( rule__QualifiedName__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:994:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1941);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1008:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1012:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1013:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01976);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01979);
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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1020:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1024:1: ( ( '.' ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1025:1: ( '.' )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1025:1: ( '.' )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1026:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,19,FOLLOW_19_in_rule__QualifiedName__Group_1__0__Impl2007); 
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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1039:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1043:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1044:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12038);
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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1050:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1054:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1055:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1055:1: ( RULE_ID )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1056:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2065); 
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


    // $ANTLR start "rule__System__NameAssignment_1"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1072:1: rule__System__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__System__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1076:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1077:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1077:1: ( RULE_ID )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1078:1: RULE_ID
            {
             before(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__System__NameAssignment_12103); 
             after(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__System__NameAssignment_1"


    // $ANTLR start "rule__System__ModulesAssignment_3"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1087:1: rule__System__ModulesAssignment_3 : ( ruleModule ) ;
    public final void rule__System__ModulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1091:1: ( ( ruleModule ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1092:1: ( ruleModule )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1092:1: ( ruleModule )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1093:1: ruleModule
            {
             before(grammarAccess.getSystemAccess().getModulesModuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleModule_in_rule__System__ModulesAssignment_32134);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getModulesModuleParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__System__ModulesAssignment_3"


    // $ANTLR start "rule__System__ModulesAssignment_4_1"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1102:1: rule__System__ModulesAssignment_4_1 : ( ruleModule ) ;
    public final void rule__System__ModulesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1106:1: ( ( ruleModule ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1107:1: ( ruleModule )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1107:1: ( ruleModule )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1108:1: ruleModule
            {
             before(grammarAccess.getSystemAccess().getModulesModuleParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleModule_in_rule__System__ModulesAssignment_4_12165);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getModulesModuleParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__System__ModulesAssignment_4_1"


    // $ANTLR start "rule__Module__CommentAssignment_0"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1117:1: rule__Module__CommentAssignment_0 : ( RULE_DOC_COMMENT ) ;
    public final void rule__Module__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1121:1: ( ( RULE_DOC_COMMENT ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1122:1: ( RULE_DOC_COMMENT )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1122:1: ( RULE_DOC_COMMENT )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1123:1: RULE_DOC_COMMENT
            {
             before(grammarAccess.getModuleAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_rule__Module__CommentAssignment_02196); 
             after(grammarAccess.getModuleAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Module__CommentAssignment_0"


    // $ANTLR start "rule__Module__NameAssignment_2"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1132:1: rule__Module__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Module__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1136:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1137:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1137:1: ( RULE_ID )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1138:1: RULE_ID
            {
             before(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Module__NameAssignment_22227); 
             after(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Module__NameAssignment_2"


    // $ANTLR start "rule__Primitive__NameAssignment_1"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1149:1: rule__Primitive__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Primitive__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1153:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1154:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1154:1: ( RULE_ID )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1155:1: RULE_ID
            {
             before(grammarAccess.getPrimitiveAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Primitive__NameAssignment_12260); 
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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1164:1: rule__Any__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Any__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1168:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1169:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1169:1: ( RULE_ID )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1170:1: RULE_ID
            {
             before(grammarAccess.getAnyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Any__NameAssignment_12291); 
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


    // $ANTLR start "rule__StringValue__ValueAssignment"
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1181:1: rule__StringValue__ValueAssignment : ( ruleEStringObject ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1185:1: ( ( ruleEStringObject ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1186:1: ( ruleEStringObject )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1186:1: ( ruleEStringObject )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1187:1: ruleEStringObject
            {
             before(grammarAccess.getStringValueAccess().getValueEStringObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEStringObject_in_rule__StringValue__ValueAssignment2324);
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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1196:1: rule__IntegerValue__ValueAssignment : ( ruleEIntegerObject ) ;
    public final void rule__IntegerValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1200:1: ( ( ruleEIntegerObject ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1201:1: ( ruleEIntegerObject )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1201:1: ( ruleEIntegerObject )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1202:1: ruleEIntegerObject
            {
             before(grammarAccess.getIntegerValueAccess().getValueEIntegerObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_rule__IntegerValue__ValueAssignment2355);
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
    // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1211:1: rule__FloatValue__ValueAssignment : ( ruleEFloatObject ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1215:1: ( ( ruleEFloatObject ) )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1216:1: ( ruleEFloatObject )
            {
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1216:1: ( ruleEFloatObject )
            // ../de.dubmas.modulob.systemdsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalSystemDsl.g:1217:1: ruleEFloatObject
            {
             before(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_rule__FloatValue__ValueAssignment2386);
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


 

    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__0_in_ruleSystem94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0_in_ruleModule154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__0_in_rulePrimitive216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAny_in_entryRuleAny243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAny250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__Group__0_in_ruleAny276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_entryRuleEStringObject367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEStringObject374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEStringObject400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerValue__ValueAssignment_in_ruleIntegerValue459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEIntegerObject493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEIntegerObject519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEFloatObject612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__0_in_ruleEFloatObject638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__0__Impl_in_rule__System__Group__0733 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__System__Group__1_in_rule__System__Group__0736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__System__Group__0__Impl764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__1__Impl_in_rule__System__Group__1795 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__System__Group__2_in_rule__System__Group__1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__NameAssignment_1_in_rule__System__Group__1__Impl825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__2__Impl_in_rule__System__Group__2855 = new BitSet(new long[]{0x0000000000008080L});
    public static final BitSet FOLLOW_rule__System__Group__3_in_rule__System__Group__2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__System__Group__2__Impl886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__3__Impl_in_rule__System__Group__3917 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__System__Group__4_in_rule__System__Group__3920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__ModulesAssignment_3_in_rule__System__Group__3__Impl947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__4__Impl_in_rule__System__Group__4977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group_4__0_in_rule__System__Group__4__Impl1004 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__System__Group_4__0__Impl_in_rule__System__Group_4__01045 = new BitSet(new long[]{0x0000000000008080L});
    public static final BitSet FOLLOW_rule__System__Group_4__1_in_rule__System__Group_4__01048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__System__Group_4__0__Impl1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group_4__1__Impl_in_rule__System__Group_4__11107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__ModulesAssignment_4_1_in_rule__System__Group_4__1__Impl1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__01168 = new BitSet(new long[]{0x0000000000008080L});
    public static final BitSet FOLLOW_rule__Module__Group__1_in_rule__Module__Group__01171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__CommentAssignment_0_in_rule__Module__Group__0__Impl1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__11229 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Module__Group__2_in_rule__Module__Group__11232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Module__Group__1__Impl1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__21291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__NameAssignment_2_in_rule__Module__Group__2__Impl1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__0__Impl_in_rule__Primitive__Group__01355 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Primitive__Group__1_in_rule__Primitive__Group__01358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Primitive__Group__0__Impl1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__1__Impl_in_rule__Primitive__Group__11417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__NameAssignment_1_in_rule__Primitive__Group__1__Impl1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__Group__0__Impl_in_rule__Any__Group__01478 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Any__Group__1_in_rule__Any__Group__01481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Any__Group__0__Impl1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__Group__1__Impl_in_rule__Any__Group__11540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__NameAssignment_1_in_rule__Any__Group__1__Impl1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__0__Impl_in_rule__EFloatObject__Group__01602 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__1_in_rule__EFloatObject__Group__01605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EFloatObject__Group__0__Impl1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__1__Impl_in_rule__EFloatObject__Group__11667 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__2_in_rule__EFloatObject__Group__11670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group__1__Impl1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__2__Impl_in_rule__EFloatObject__Group__21729 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__3_in_rule__EFloatObject__Group__21732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EFloatObject__Group__2__Impl1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__3__Impl_in_rule__EFloatObject__Group__31791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group__3__Impl1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01855 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1941 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01976 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__QualifiedName__Group_1__0__Impl2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__System__NameAssignment_12103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_rule__System__ModulesAssignment_32134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_rule__System__ModulesAssignment_4_12165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_rule__Module__CommentAssignment_02196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Module__NameAssignment_22227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Primitive__NameAssignment_12260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Any__NameAssignment_12291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_rule__StringValue__ValueAssignment2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_rule__IntegerValue__ValueAssignment2355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_rule__FloatValue__ValueAssignment2386 = new BitSet(new long[]{0x0000000000000002L});

}