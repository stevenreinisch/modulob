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
import de.dubmas.modulob.services.InterfaceDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalInterfaceDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_DOC_COMMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'interfaces for module'", "'version'", "'interface'", "'{'", "'}'", "'requires'", "','", "';'", "':'", "'delegate'", "'primitive type'", "'any type'", "'-'", "'.'", "'current'", "'static'", "'[]'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_DOC_COMMENT=7;
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


        public InternalInterfaceDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalInterfaceDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalInterfaceDslParser.tokenNames; }
    public String getGrammarFileName() { return "../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g"; }


     
     	private InterfaceDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(InterfaceDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleInterfaceModel"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:60:1: entryRuleInterfaceModel : ruleInterfaceModel EOF ;
    public final void entryRuleInterfaceModel() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:61:1: ( ruleInterfaceModel EOF )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:62:1: ruleInterfaceModel EOF
            {
             before(grammarAccess.getInterfaceModelRule()); 
            pushFollow(FOLLOW_ruleInterfaceModel_in_entryRuleInterfaceModel61);
            ruleInterfaceModel();

            state._fsp--;

             after(grammarAccess.getInterfaceModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceModel68); 

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
    // $ANTLR end "entryRuleInterfaceModel"


    // $ANTLR start "ruleInterfaceModel"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:69:1: ruleInterfaceModel : ( ( rule__InterfaceModel__Group__0 ) ) ;
    public final void ruleInterfaceModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:73:2: ( ( ( rule__InterfaceModel__Group__0 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:74:1: ( ( rule__InterfaceModel__Group__0 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:74:1: ( ( rule__InterfaceModel__Group__0 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:75:1: ( rule__InterfaceModel__Group__0 )
            {
             before(grammarAccess.getInterfaceModelAccess().getGroup()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:76:1: ( rule__InterfaceModel__Group__0 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:76:2: rule__InterfaceModel__Group__0
            {
            pushFollow(FOLLOW_rule__InterfaceModel__Group__0_in_ruleInterfaceModel94);
            rule__InterfaceModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterfaceModel"


    // $ANTLR start "entryRuleInterface"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:88:1: entryRuleInterface : ruleInterface EOF ;
    public final void entryRuleInterface() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:89:1: ( ruleInterface EOF )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:90:1: ruleInterface EOF
            {
             before(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface121);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getInterfaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface128); 

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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:97:1: ruleInterface : ( ( rule__Interface__Group__0 ) ) ;
    public final void ruleInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:101:2: ( ( ( rule__Interface__Group__0 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:102:1: ( ( rule__Interface__Group__0 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:102:1: ( ( rule__Interface__Group__0 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:103:1: ( rule__Interface__Group__0 )
            {
             before(grammarAccess.getInterfaceAccess().getGroup()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:104:1: ( rule__Interface__Group__0 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:104:2: rule__Interface__Group__0
            {
            pushFollow(FOLLOW_rule__Interface__Group__0_in_ruleInterface154);
            rule__Interface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleMethod"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:116:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:117:1: ( ruleMethod EOF )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:118:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod181);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod188); 

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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:125:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:129:2: ( ( ( rule__Method__Group__0 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:130:1: ( ( rule__Method__Group__0 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:130:1: ( ( rule__Method__Group__0 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:131:1: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:132:1: ( rule__Method__Group__0 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:132:2: rule__Method__Group__0
            {
            pushFollow(FOLLOW_rule__Method__Group__0_in_ruleMethod214);
            rule__Method__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleParameter"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:144:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:145:1: ( ruleParameter EOF )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:146:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter241);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter248); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:153:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:157:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:158:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:158:1: ( ( rule__Parameter__Group__0 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:159:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:160:1: ( rule__Parameter__Group__0 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:160:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter274);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleDelegate"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:172:1: entryRuleDelegate : ruleDelegate EOF ;
    public final void entryRuleDelegate() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:173:1: ( ruleDelegate EOF )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:174:1: ruleDelegate EOF
            {
             before(grammarAccess.getDelegateRule()); 
            pushFollow(FOLLOW_ruleDelegate_in_entryRuleDelegate301);
            ruleDelegate();

            state._fsp--;

             after(grammarAccess.getDelegateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDelegate308); 

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
    // $ANTLR end "entryRuleDelegate"


    // $ANTLR start "ruleDelegate"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:181:1: ruleDelegate : ( ( rule__Delegate__Group__0 ) ) ;
    public final void ruleDelegate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:185:2: ( ( ( rule__Delegate__Group__0 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:186:1: ( ( rule__Delegate__Group__0 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:186:1: ( ( rule__Delegate__Group__0 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:187:1: ( rule__Delegate__Group__0 )
            {
             before(grammarAccess.getDelegateAccess().getGroup()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:188:1: ( rule__Delegate__Group__0 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:188:2: rule__Delegate__Group__0
            {
            pushFollow(FOLLOW_rule__Delegate__Group__0_in_ruleDelegate334);
            rule__Delegate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDelegateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDelegate"


    // $ANTLR start "entryRulePrimitive"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:202:1: entryRulePrimitive : rulePrimitive EOF ;
    public final void entryRulePrimitive() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:203:1: ( rulePrimitive EOF )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:204:1: rulePrimitive EOF
            {
             before(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive363);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getPrimitiveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive370); 

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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:211:1: rulePrimitive : ( ( rule__Primitive__Group__0 ) ) ;
    public final void rulePrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:215:2: ( ( ( rule__Primitive__Group__0 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:216:1: ( ( rule__Primitive__Group__0 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:216:1: ( ( rule__Primitive__Group__0 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:217:1: ( rule__Primitive__Group__0 )
            {
             before(grammarAccess.getPrimitiveAccess().getGroup()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:218:1: ( rule__Primitive__Group__0 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:218:2: rule__Primitive__Group__0
            {
            pushFollow(FOLLOW_rule__Primitive__Group__0_in_rulePrimitive396);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:230:1: entryRuleAny : ruleAny EOF ;
    public final void entryRuleAny() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:231:1: ( ruleAny EOF )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:232:1: ruleAny EOF
            {
             before(grammarAccess.getAnyRule()); 
            pushFollow(FOLLOW_ruleAny_in_entryRuleAny423);
            ruleAny();

            state._fsp--;

             after(grammarAccess.getAnyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAny430); 

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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:239:1: ruleAny : ( ( rule__Any__Group__0 ) ) ;
    public final void ruleAny() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:243:2: ( ( ( rule__Any__Group__0 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:244:1: ( ( rule__Any__Group__0 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:244:1: ( ( rule__Any__Group__0 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:245:1: ( rule__Any__Group__0 )
            {
             before(grammarAccess.getAnyAccess().getGroup()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:246:1: ( rule__Any__Group__0 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:246:2: rule__Any__Group__0
            {
            pushFollow(FOLLOW_rule__Any__Group__0_in_ruleAny456);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:258:1: entryRuleTypeRef : ruleTypeRef EOF ;
    public final void entryRuleTypeRef() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:259:1: ( ruleTypeRef EOF )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:260:1: ruleTypeRef EOF
            {
             before(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef483);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getTypeRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef490); 

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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:267:1: ruleTypeRef : ( ( rule__TypeRef__Group__0 ) ) ;
    public final void ruleTypeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:271:2: ( ( ( rule__TypeRef__Group__0 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:272:1: ( ( rule__TypeRef__Group__0 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:272:1: ( ( rule__TypeRef__Group__0 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:273:1: ( rule__TypeRef__Group__0 )
            {
             before(grammarAccess.getTypeRefAccess().getGroup()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:274:1: ( rule__TypeRef__Group__0 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:274:2: rule__TypeRef__Group__0
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef516);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:288:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:289:1: ( ruleStringValue EOF )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:290:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue545);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue552); 

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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:297:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:301:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:302:1: ( ( rule__StringValue__ValueAssignment ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:302:1: ( ( rule__StringValue__ValueAssignment ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:303:1: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:304:1: ( rule__StringValue__ValueAssignment )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:304:2: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue578);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:316:1: entryRuleEStringObject : ruleEStringObject EOF ;
    public final void entryRuleEStringObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:317:1: ( ruleEStringObject EOF )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:318:1: ruleEStringObject EOF
            {
             before(grammarAccess.getEStringObjectRule()); 
            pushFollow(FOLLOW_ruleEStringObject_in_entryRuleEStringObject605);
            ruleEStringObject();

            state._fsp--;

             after(grammarAccess.getEStringObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEStringObject612); 

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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:325:1: ruleEStringObject : ( RULE_STRING ) ;
    public final void ruleEStringObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:329:2: ( ( RULE_STRING ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:330:1: ( RULE_STRING )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:330:1: ( RULE_STRING )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:331:1: RULE_STRING
            {
             before(grammarAccess.getEStringObjectAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEStringObject638); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:344:1: entryRuleIntegerValue : ruleIntegerValue EOF ;
    public final void entryRuleIntegerValue() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:345:1: ( ruleIntegerValue EOF )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:346:1: ruleIntegerValue EOF
            {
             before(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue664);
            ruleIntegerValue();

            state._fsp--;

             after(grammarAccess.getIntegerValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValue671); 

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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:353:1: ruleIntegerValue : ( ( rule__IntegerValue__ValueAssignment ) ) ;
    public final void ruleIntegerValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:357:2: ( ( ( rule__IntegerValue__ValueAssignment ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:358:1: ( ( rule__IntegerValue__ValueAssignment ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:358:1: ( ( rule__IntegerValue__ValueAssignment ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:359:1: ( rule__IntegerValue__ValueAssignment )
            {
             before(grammarAccess.getIntegerValueAccess().getValueAssignment()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:360:1: ( rule__IntegerValue__ValueAssignment )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:360:2: rule__IntegerValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntegerValue__ValueAssignment_in_ruleIntegerValue697);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:372:1: entryRuleEIntegerObject : ruleEIntegerObject EOF ;
    public final void entryRuleEIntegerObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:373:1: ( ruleEIntegerObject EOF )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:374:1: ruleEIntegerObject EOF
            {
             before(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject724);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getEIntegerObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEIntegerObject731); 

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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:381:1: ruleEIntegerObject : ( RULE_INT ) ;
    public final void ruleEIntegerObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:385:2: ( ( RULE_INT ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:386:1: ( RULE_INT )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:386:1: ( RULE_INT )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:387:1: RULE_INT
            {
             before(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEIntegerObject757); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:400:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:401:1: ( ruleFloatValue EOF )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:402:1: ruleFloatValue EOF
            {
             before(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue783);
            ruleFloatValue();

            state._fsp--;

             after(grammarAccess.getFloatValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue790); 

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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:409:1: ruleFloatValue : ( ( rule__FloatValue__ValueAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:413:2: ( ( ( rule__FloatValue__ValueAssignment ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:414:1: ( ( rule__FloatValue__ValueAssignment ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:414:1: ( ( rule__FloatValue__ValueAssignment ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:415:1: ( rule__FloatValue__ValueAssignment )
            {
             before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:416:1: ( rule__FloatValue__ValueAssignment )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:416:2: rule__FloatValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue816);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:428:1: entryRuleEFloatObject : ruleEFloatObject EOF ;
    public final void entryRuleEFloatObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:429:1: ( ruleEFloatObject EOF )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:430:1: ruleEFloatObject EOF
            {
             before(grammarAccess.getEFloatObjectRule()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject843);
            ruleEFloatObject();

            state._fsp--;

             after(grammarAccess.getEFloatObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEFloatObject850); 

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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:437:1: ruleEFloatObject : ( ( rule__EFloatObject__Group__0 ) ) ;
    public final void ruleEFloatObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:441:2: ( ( ( rule__EFloatObject__Group__0 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:442:1: ( ( rule__EFloatObject__Group__0 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:442:1: ( ( rule__EFloatObject__Group__0 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:443:1: ( rule__EFloatObject__Group__0 )
            {
             before(grammarAccess.getEFloatObjectAccess().getGroup()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:444:1: ( rule__EFloatObject__Group__0 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:444:2: rule__EFloatObject__Group__0
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__0_in_ruleEFloatObject876);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:456:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:457:1: ( ruleQualifiedName EOF )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:458:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName903);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName910); 

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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:465:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:469:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:470:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:470:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:471:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:472:1: ( rule__QualifiedName__Group__0 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:472:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName936);
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


    // $ANTLR start "rule__InterfaceModel__Group__0"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:487:1: rule__InterfaceModel__Group__0 : rule__InterfaceModel__Group__0__Impl rule__InterfaceModel__Group__1 ;
    public final void rule__InterfaceModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:491:1: ( rule__InterfaceModel__Group__0__Impl rule__InterfaceModel__Group__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:492:2: rule__InterfaceModel__Group__0__Impl rule__InterfaceModel__Group__1
            {
            pushFollow(FOLLOW_rule__InterfaceModel__Group__0__Impl_in_rule__InterfaceModel__Group__0971);
            rule__InterfaceModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfaceModel__Group__1_in_rule__InterfaceModel__Group__0974);
            rule__InterfaceModel__Group__1();

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
    // $ANTLR end "rule__InterfaceModel__Group__0"


    // $ANTLR start "rule__InterfaceModel__Group__0__Impl"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:499:1: rule__InterfaceModel__Group__0__Impl : ( ( rule__InterfaceModel__CurrentAssignment_0 )? ) ;
    public final void rule__InterfaceModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:503:1: ( ( ( rule__InterfaceModel__CurrentAssignment_0 )? ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:504:1: ( ( rule__InterfaceModel__CurrentAssignment_0 )? )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:504:1: ( ( rule__InterfaceModel__CurrentAssignment_0 )? )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:505:1: ( rule__InterfaceModel__CurrentAssignment_0 )?
            {
             before(grammarAccess.getInterfaceModelAccess().getCurrentAssignment_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:506:1: ( rule__InterfaceModel__CurrentAssignment_0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==26) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:506:2: rule__InterfaceModel__CurrentAssignment_0
                    {
                    pushFollow(FOLLOW_rule__InterfaceModel__CurrentAssignment_0_in_rule__InterfaceModel__Group__0__Impl1001);
                    rule__InterfaceModel__CurrentAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceModelAccess().getCurrentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceModel__Group__0__Impl"


    // $ANTLR start "rule__InterfaceModel__Group__1"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:516:1: rule__InterfaceModel__Group__1 : rule__InterfaceModel__Group__1__Impl rule__InterfaceModel__Group__2 ;
    public final void rule__InterfaceModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:520:1: ( rule__InterfaceModel__Group__1__Impl rule__InterfaceModel__Group__2 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:521:2: rule__InterfaceModel__Group__1__Impl rule__InterfaceModel__Group__2
            {
            pushFollow(FOLLOW_rule__InterfaceModel__Group__1__Impl_in_rule__InterfaceModel__Group__11032);
            rule__InterfaceModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfaceModel__Group__2_in_rule__InterfaceModel__Group__11035);
            rule__InterfaceModel__Group__2();

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
    // $ANTLR end "rule__InterfaceModel__Group__1"


    // $ANTLR start "rule__InterfaceModel__Group__1__Impl"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:528:1: rule__InterfaceModel__Group__1__Impl : ( 'interfaces for module' ) ;
    public final void rule__InterfaceModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:532:1: ( ( 'interfaces for module' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:533:1: ( 'interfaces for module' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:533:1: ( 'interfaces for module' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:534:1: 'interfaces for module'
            {
             before(grammarAccess.getInterfaceModelAccess().getInterfacesForModuleKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__InterfaceModel__Group__1__Impl1063); 
             after(grammarAccess.getInterfaceModelAccess().getInterfacesForModuleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceModel__Group__1__Impl"


    // $ANTLR start "rule__InterfaceModel__Group__2"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:547:1: rule__InterfaceModel__Group__2 : rule__InterfaceModel__Group__2__Impl rule__InterfaceModel__Group__3 ;
    public final void rule__InterfaceModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:551:1: ( rule__InterfaceModel__Group__2__Impl rule__InterfaceModel__Group__3 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:552:2: rule__InterfaceModel__Group__2__Impl rule__InterfaceModel__Group__3
            {
            pushFollow(FOLLOW_rule__InterfaceModel__Group__2__Impl_in_rule__InterfaceModel__Group__21094);
            rule__InterfaceModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfaceModel__Group__3_in_rule__InterfaceModel__Group__21097);
            rule__InterfaceModel__Group__3();

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
    // $ANTLR end "rule__InterfaceModel__Group__2"


    // $ANTLR start "rule__InterfaceModel__Group__2__Impl"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:559:1: rule__InterfaceModel__Group__2__Impl : ( ( rule__InterfaceModel__ModuleAssignment_2 ) ) ;
    public final void rule__InterfaceModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:563:1: ( ( ( rule__InterfaceModel__ModuleAssignment_2 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:564:1: ( ( rule__InterfaceModel__ModuleAssignment_2 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:564:1: ( ( rule__InterfaceModel__ModuleAssignment_2 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:565:1: ( rule__InterfaceModel__ModuleAssignment_2 )
            {
             before(grammarAccess.getInterfaceModelAccess().getModuleAssignment_2()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:566:1: ( rule__InterfaceModel__ModuleAssignment_2 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:566:2: rule__InterfaceModel__ModuleAssignment_2
            {
            pushFollow(FOLLOW_rule__InterfaceModel__ModuleAssignment_2_in_rule__InterfaceModel__Group__2__Impl1124);
            rule__InterfaceModel__ModuleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceModelAccess().getModuleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceModel__Group__2__Impl"


    // $ANTLR start "rule__InterfaceModel__Group__3"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:576:1: rule__InterfaceModel__Group__3 : rule__InterfaceModel__Group__3__Impl rule__InterfaceModel__Group__4 ;
    public final void rule__InterfaceModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:580:1: ( rule__InterfaceModel__Group__3__Impl rule__InterfaceModel__Group__4 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:581:2: rule__InterfaceModel__Group__3__Impl rule__InterfaceModel__Group__4
            {
            pushFollow(FOLLOW_rule__InterfaceModel__Group__3__Impl_in_rule__InterfaceModel__Group__31154);
            rule__InterfaceModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfaceModel__Group__4_in_rule__InterfaceModel__Group__31157);
            rule__InterfaceModel__Group__4();

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
    // $ANTLR end "rule__InterfaceModel__Group__3"


    // $ANTLR start "rule__InterfaceModel__Group__3__Impl"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:588:1: rule__InterfaceModel__Group__3__Impl : ( 'version' ) ;
    public final void rule__InterfaceModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:592:1: ( ( 'version' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:593:1: ( 'version' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:593:1: ( 'version' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:594:1: 'version'
            {
             before(grammarAccess.getInterfaceModelAccess().getVersionKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__InterfaceModel__Group__3__Impl1185); 
             after(grammarAccess.getInterfaceModelAccess().getVersionKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceModel__Group__3__Impl"


    // $ANTLR start "rule__InterfaceModel__Group__4"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:607:1: rule__InterfaceModel__Group__4 : rule__InterfaceModel__Group__4__Impl rule__InterfaceModel__Group__5 ;
    public final void rule__InterfaceModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:611:1: ( rule__InterfaceModel__Group__4__Impl rule__InterfaceModel__Group__5 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:612:2: rule__InterfaceModel__Group__4__Impl rule__InterfaceModel__Group__5
            {
            pushFollow(FOLLOW_rule__InterfaceModel__Group__4__Impl_in_rule__InterfaceModel__Group__41216);
            rule__InterfaceModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfaceModel__Group__5_in_rule__InterfaceModel__Group__41219);
            rule__InterfaceModel__Group__5();

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
    // $ANTLR end "rule__InterfaceModel__Group__4"


    // $ANTLR start "rule__InterfaceModel__Group__4__Impl"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:619:1: rule__InterfaceModel__Group__4__Impl : ( ( rule__InterfaceModel__VersionAssignment_4 ) ) ;
    public final void rule__InterfaceModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:623:1: ( ( ( rule__InterfaceModel__VersionAssignment_4 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:624:1: ( ( rule__InterfaceModel__VersionAssignment_4 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:624:1: ( ( rule__InterfaceModel__VersionAssignment_4 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:625:1: ( rule__InterfaceModel__VersionAssignment_4 )
            {
             before(grammarAccess.getInterfaceModelAccess().getVersionAssignment_4()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:626:1: ( rule__InterfaceModel__VersionAssignment_4 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:626:2: rule__InterfaceModel__VersionAssignment_4
            {
            pushFollow(FOLLOW_rule__InterfaceModel__VersionAssignment_4_in_rule__InterfaceModel__Group__4__Impl1246);
            rule__InterfaceModel__VersionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceModelAccess().getVersionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceModel__Group__4__Impl"


    // $ANTLR start "rule__InterfaceModel__Group__5"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:636:1: rule__InterfaceModel__Group__5 : rule__InterfaceModel__Group__5__Impl ;
    public final void rule__InterfaceModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:640:1: ( rule__InterfaceModel__Group__5__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:641:2: rule__InterfaceModel__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__InterfaceModel__Group__5__Impl_in_rule__InterfaceModel__Group__51276);
            rule__InterfaceModel__Group__5__Impl();

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
    // $ANTLR end "rule__InterfaceModel__Group__5"


    // $ANTLR start "rule__InterfaceModel__Group__5__Impl"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:647:1: rule__InterfaceModel__Group__5__Impl : ( ( rule__InterfaceModel__InterfacesAssignment_5 )* ) ;
    public final void rule__InterfaceModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:651:1: ( ( ( rule__InterfaceModel__InterfacesAssignment_5 )* ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:652:1: ( ( rule__InterfaceModel__InterfacesAssignment_5 )* )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:652:1: ( ( rule__InterfaceModel__InterfacesAssignment_5 )* )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:653:1: ( rule__InterfaceModel__InterfacesAssignment_5 )*
            {
             before(grammarAccess.getInterfaceModelAccess().getInterfacesAssignment_5()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:654:1: ( rule__InterfaceModel__InterfacesAssignment_5 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_DOC_COMMENT||LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:654:2: rule__InterfaceModel__InterfacesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__InterfaceModel__InterfacesAssignment_5_in_rule__InterfaceModel__Group__5__Impl1303);
            	    rule__InterfaceModel__InterfacesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getInterfaceModelAccess().getInterfacesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceModel__Group__5__Impl"


    // $ANTLR start "rule__Interface__Group__0"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:676:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:680:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:681:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__01346);
            rule__Interface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__01349);
            rule__Interface__Group__1();

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
    // $ANTLR end "rule__Interface__Group__0"


    // $ANTLR start "rule__Interface__Group__0__Impl"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:688:1: rule__Interface__Group__0__Impl : ( ( rule__Interface__CommentAssignment_0 )? ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:692:1: ( ( ( rule__Interface__CommentAssignment_0 )? ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:693:1: ( ( rule__Interface__CommentAssignment_0 )? )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:693:1: ( ( rule__Interface__CommentAssignment_0 )? )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:694:1: ( rule__Interface__CommentAssignment_0 )?
            {
             before(grammarAccess.getInterfaceAccess().getCommentAssignment_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:695:1: ( rule__Interface__CommentAssignment_0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_DOC_COMMENT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:695:2: rule__Interface__CommentAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Interface__CommentAssignment_0_in_rule__Interface__Group__0__Impl1376);
                    rule__Interface__CommentAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceAccess().getCommentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__0__Impl"


    // $ANTLR start "rule__Interface__Group__1"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:705:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:709:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:710:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__11407);
            rule__Interface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__11410);
            rule__Interface__Group__2();

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
    // $ANTLR end "rule__Interface__Group__1"


    // $ANTLR start "rule__Interface__Group__1__Impl"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:717:1: rule__Interface__Group__1__Impl : ( 'interface' ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:721:1: ( ( 'interface' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:722:1: ( 'interface' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:722:1: ( 'interface' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:723:1: 'interface'
            {
             before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__Interface__Group__1__Impl1438); 
             after(grammarAccess.getInterfaceAccess().getInterfaceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__1__Impl"


    // $ANTLR start "rule__Interface__Group__2"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:736:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl rule__Interface__Group__3 ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:740:1: ( rule__Interface__Group__2__Impl rule__Interface__Group__3 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:741:2: rule__Interface__Group__2__Impl rule__Interface__Group__3
            {
            pushFollow(FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__21469);
            rule__Interface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__3_in_rule__Interface__Group__21472);
            rule__Interface__Group__3();

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
    // $ANTLR end "rule__Interface__Group__2"


    // $ANTLR start "rule__Interface__Group__2__Impl"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:748:1: rule__Interface__Group__2__Impl : ( ( rule__Interface__NameAssignment_2 ) ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:752:1: ( ( ( rule__Interface__NameAssignment_2 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:753:1: ( ( rule__Interface__NameAssignment_2 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:753:1: ( ( rule__Interface__NameAssignment_2 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:754:1: ( rule__Interface__NameAssignment_2 )
            {
             before(grammarAccess.getInterfaceAccess().getNameAssignment_2()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:755:1: ( rule__Interface__NameAssignment_2 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:755:2: rule__Interface__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Interface__NameAssignment_2_in_rule__Interface__Group__2__Impl1499);
            rule__Interface__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__2__Impl"


    // $ANTLR start "rule__Interface__Group__3"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:765:1: rule__Interface__Group__3 : rule__Interface__Group__3__Impl rule__Interface__Group__4 ;
    public final void rule__Interface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:769:1: ( rule__Interface__Group__3__Impl rule__Interface__Group__4 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:770:2: rule__Interface__Group__3__Impl rule__Interface__Group__4
            {
            pushFollow(FOLLOW_rule__Interface__Group__3__Impl_in_rule__Interface__Group__31529);
            rule__Interface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__4_in_rule__Interface__Group__31532);
            rule__Interface__Group__4();

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
    // $ANTLR end "rule__Interface__Group__3"


    // $ANTLR start "rule__Interface__Group__3__Impl"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:777:1: rule__Interface__Group__3__Impl : ( ( rule__Interface__Group_3__0 )? ) ;
    public final void rule__Interface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:781:1: ( ( ( rule__Interface__Group_3__0 )? ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:782:1: ( ( rule__Interface__Group_3__0 )? )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:782:1: ( ( rule__Interface__Group_3__0 )? )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:783:1: ( rule__Interface__Group_3__0 )?
            {
             before(grammarAccess.getInterfaceAccess().getGroup_3()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:784:1: ( rule__Interface__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:784:2: rule__Interface__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Interface__Group_3__0_in_rule__Interface__Group__3__Impl1559);
                    rule__Interface__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__3__Impl"


    // $ANTLR start "rule__Interface__Group__4"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:794:1: rule__Interface__Group__4 : rule__Interface__Group__4__Impl rule__Interface__Group__5 ;
    public final void rule__Interface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:798:1: ( rule__Interface__Group__4__Impl rule__Interface__Group__5 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:799:2: rule__Interface__Group__4__Impl rule__Interface__Group__5
            {
            pushFollow(FOLLOW_rule__Interface__Group__4__Impl_in_rule__Interface__Group__41590);
            rule__Interface__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__5_in_rule__Interface__Group__41593);
            rule__Interface__Group__5();

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
    // $ANTLR end "rule__Interface__Group__4"


    // $ANTLR start "rule__Interface__Group__4__Impl"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:806:1: rule__Interface__Group__4__Impl : ( '{' ) ;
    public final void rule__Interface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:810:1: ( ( '{' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:811:1: ( '{' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:811:1: ( '{' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:812:1: '{'
            {
             before(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__Interface__Group__4__Impl1621); 
             after(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__4__Impl"


    // $ANTLR start "rule__Interface__Group__5"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:825:1: rule__Interface__Group__5 : rule__Interface__Group__5__Impl rule__Interface__Group__6 ;
    public final void rule__Interface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:829:1: ( rule__Interface__Group__5__Impl rule__Interface__Group__6 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:830:2: rule__Interface__Group__5__Impl rule__Interface__Group__6
            {
            pushFollow(FOLLOW_rule__Interface__Group__5__Impl_in_rule__Interface__Group__51652);
            rule__Interface__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__6_in_rule__Interface__Group__51655);
            rule__Interface__Group__6();

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
    // $ANTLR end "rule__Interface__Group__5"


    // $ANTLR start "rule__Interface__Group__5__Impl"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:837:1: rule__Interface__Group__5__Impl : ( ( rule__Interface__MethodsAssignment_5 )* ) ;
    public final void rule__Interface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:841:1: ( ( ( rule__Interface__MethodsAssignment_5 )* ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:842:1: ( ( rule__Interface__MethodsAssignment_5 )* )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:842:1: ( ( rule__Interface__MethodsAssignment_5 )* )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:843:1: ( rule__Interface__MethodsAssignment_5 )*
            {
             before(grammarAccess.getInterfaceAccess().getMethodsAssignment_5()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:844:1: ( rule__Interface__MethodsAssignment_5 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_DOC_COMMENT)||LA5_0==27) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:844:2: rule__Interface__MethodsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Interface__MethodsAssignment_5_in_rule__Interface__Group__5__Impl1682);
            	    rule__Interface__MethodsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getInterfaceAccess().getMethodsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__5__Impl"


    // $ANTLR start "rule__Interface__Group__6"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:854:1: rule__Interface__Group__6 : rule__Interface__Group__6__Impl rule__Interface__Group__7 ;
    public final void rule__Interface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:858:1: ( rule__Interface__Group__6__Impl rule__Interface__Group__7 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:859:2: rule__Interface__Group__6__Impl rule__Interface__Group__7
            {
            pushFollow(FOLLOW_rule__Interface__Group__6__Impl_in_rule__Interface__Group__61713);
            rule__Interface__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__7_in_rule__Interface__Group__61716);
            rule__Interface__Group__7();

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
    // $ANTLR end "rule__Interface__Group__6"


    // $ANTLR start "rule__Interface__Group__6__Impl"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:866:1: rule__Interface__Group__6__Impl : ( ( rule__Interface__DelegatesAssignment_6 )* ) ;
    public final void rule__Interface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:870:1: ( ( ( rule__Interface__DelegatesAssignment_6 )* ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:871:1: ( ( rule__Interface__DelegatesAssignment_6 )* )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:871:1: ( ( rule__Interface__DelegatesAssignment_6 )* )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:872:1: ( rule__Interface__DelegatesAssignment_6 )*
            {
             before(grammarAccess.getInterfaceAccess().getDelegatesAssignment_6()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:873:1: ( rule__Interface__DelegatesAssignment_6 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:873:2: rule__Interface__DelegatesAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Interface__DelegatesAssignment_6_in_rule__Interface__Group__6__Impl1743);
            	    rule__Interface__DelegatesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getInterfaceAccess().getDelegatesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__6__Impl"


    // $ANTLR start "rule__Interface__Group__7"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:883:1: rule__Interface__Group__7 : rule__Interface__Group__7__Impl ;
    public final void rule__Interface__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:887:1: ( rule__Interface__Group__7__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:888:2: rule__Interface__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group__7__Impl_in_rule__Interface__Group__71774);
            rule__Interface__Group__7__Impl();

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
    // $ANTLR end "rule__Interface__Group__7"


    // $ANTLR start "rule__Interface__Group__7__Impl"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:894:1: rule__Interface__Group__7__Impl : ( '}' ) ;
    public final void rule__Interface__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:898:1: ( ( '}' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:899:1: ( '}' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:899:1: ( '}' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:900:1: '}'
            {
             before(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_16_in_rule__Interface__Group__7__Impl1802); 
             after(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__7__Impl"


    // $ANTLR start "rule__Interface__Group_3__0"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:929:1: rule__Interface__Group_3__0 : rule__Interface__Group_3__0__Impl rule__Interface__Group_3__1 ;
    public final void rule__Interface__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:933:1: ( rule__Interface__Group_3__0__Impl rule__Interface__Group_3__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:934:2: rule__Interface__Group_3__0__Impl rule__Interface__Group_3__1
            {
            pushFollow(FOLLOW_rule__Interface__Group_3__0__Impl_in_rule__Interface__Group_3__01849);
            rule__Interface__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_3__1_in_rule__Interface__Group_3__01852);
            rule__Interface__Group_3__1();

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
    // $ANTLR end "rule__Interface__Group_3__0"


    // $ANTLR start "rule__Interface__Group_3__0__Impl"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:941:1: rule__Interface__Group_3__0__Impl : ( 'requires' ) ;
    public final void rule__Interface__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:945:1: ( ( 'requires' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:946:1: ( 'requires' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:946:1: ( 'requires' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:947:1: 'requires'
            {
             before(grammarAccess.getInterfaceAccess().getRequiresKeyword_3_0()); 
            match(input,17,FOLLOW_17_in_rule__Interface__Group_3__0__Impl1880); 
             after(grammarAccess.getInterfaceAccess().getRequiresKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_3__0__Impl"


    // $ANTLR start "rule__Interface__Group_3__1"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:960:1: rule__Interface__Group_3__1 : rule__Interface__Group_3__1__Impl rule__Interface__Group_3__2 ;
    public final void rule__Interface__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:964:1: ( rule__Interface__Group_3__1__Impl rule__Interface__Group_3__2 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:965:2: rule__Interface__Group_3__1__Impl rule__Interface__Group_3__2
            {
            pushFollow(FOLLOW_rule__Interface__Group_3__1__Impl_in_rule__Interface__Group_3__11911);
            rule__Interface__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_3__2_in_rule__Interface__Group_3__11914);
            rule__Interface__Group_3__2();

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
    // $ANTLR end "rule__Interface__Group_3__1"


    // $ANTLR start "rule__Interface__Group_3__1__Impl"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:972:1: rule__Interface__Group_3__1__Impl : ( ( rule__Interface__RequiredInterfacesAssignment_3_1 ) ) ;
    public final void rule__Interface__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:976:1: ( ( ( rule__Interface__RequiredInterfacesAssignment_3_1 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:977:1: ( ( rule__Interface__RequiredInterfacesAssignment_3_1 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:977:1: ( ( rule__Interface__RequiredInterfacesAssignment_3_1 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:978:1: ( rule__Interface__RequiredInterfacesAssignment_3_1 )
            {
             before(grammarAccess.getInterfaceAccess().getRequiredInterfacesAssignment_3_1()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:979:1: ( rule__Interface__RequiredInterfacesAssignment_3_1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:979:2: rule__Interface__RequiredInterfacesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Interface__RequiredInterfacesAssignment_3_1_in_rule__Interface__Group_3__1__Impl1941);
            rule__Interface__RequiredInterfacesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getRequiredInterfacesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_3__1__Impl"


    // $ANTLR start "rule__Interface__Group_3__2"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:989:1: rule__Interface__Group_3__2 : rule__Interface__Group_3__2__Impl ;
    public final void rule__Interface__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:993:1: ( rule__Interface__Group_3__2__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:994:2: rule__Interface__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group_3__2__Impl_in_rule__Interface__Group_3__21971);
            rule__Interface__Group_3__2__Impl();

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
    // $ANTLR end "rule__Interface__Group_3__2"


    // $ANTLR start "rule__Interface__Group_3__2__Impl"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1000:1: rule__Interface__Group_3__2__Impl : ( ( rule__Interface__Group_3_2__0 )* ) ;
    public final void rule__Interface__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1004:1: ( ( ( rule__Interface__Group_3_2__0 )* ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1005:1: ( ( rule__Interface__Group_3_2__0 )* )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1005:1: ( ( rule__Interface__Group_3_2__0 )* )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1006:1: ( rule__Interface__Group_3_2__0 )*
            {
             before(grammarAccess.getInterfaceAccess().getGroup_3_2()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1007:1: ( rule__Interface__Group_3_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1007:2: rule__Interface__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Interface__Group_3_2__0_in_rule__Interface__Group_3__2__Impl1998);
            	    rule__Interface__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getInterfaceAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_3__2__Impl"


    // $ANTLR start "rule__Interface__Group_3_2__0"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1023:1: rule__Interface__Group_3_2__0 : rule__Interface__Group_3_2__0__Impl rule__Interface__Group_3_2__1 ;
    public final void rule__Interface__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1027:1: ( rule__Interface__Group_3_2__0__Impl rule__Interface__Group_3_2__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1028:2: rule__Interface__Group_3_2__0__Impl rule__Interface__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Interface__Group_3_2__0__Impl_in_rule__Interface__Group_3_2__02035);
            rule__Interface__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_3_2__1_in_rule__Interface__Group_3_2__02038);
            rule__Interface__Group_3_2__1();

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
    // $ANTLR end "rule__Interface__Group_3_2__0"


    // $ANTLR start "rule__Interface__Group_3_2__0__Impl"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1035:1: rule__Interface__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Interface__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1039:1: ( ( ',' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1040:1: ( ',' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1040:1: ( ',' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1041:1: ','
            {
             before(grammarAccess.getInterfaceAccess().getCommaKeyword_3_2_0()); 
            match(input,18,FOLLOW_18_in_rule__Interface__Group_3_2__0__Impl2066); 
             after(grammarAccess.getInterfaceAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_3_2__0__Impl"


    // $ANTLR start "rule__Interface__Group_3_2__1"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1054:1: rule__Interface__Group_3_2__1 : rule__Interface__Group_3_2__1__Impl ;
    public final void rule__Interface__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1058:1: ( rule__Interface__Group_3_2__1__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1059:2: rule__Interface__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group_3_2__1__Impl_in_rule__Interface__Group_3_2__12097);
            rule__Interface__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__Interface__Group_3_2__1"


    // $ANTLR start "rule__Interface__Group_3_2__1__Impl"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1065:1: rule__Interface__Group_3_2__1__Impl : ( ( rule__Interface__RequiredInterfacesAssignment_3_2_1 ) ) ;
    public final void rule__Interface__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1069:1: ( ( ( rule__Interface__RequiredInterfacesAssignment_3_2_1 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1070:1: ( ( rule__Interface__RequiredInterfacesAssignment_3_2_1 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1070:1: ( ( rule__Interface__RequiredInterfacesAssignment_3_2_1 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1071:1: ( rule__Interface__RequiredInterfacesAssignment_3_2_1 )
            {
             before(grammarAccess.getInterfaceAccess().getRequiredInterfacesAssignment_3_2_1()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1072:1: ( rule__Interface__RequiredInterfacesAssignment_3_2_1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1072:2: rule__Interface__RequiredInterfacesAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Interface__RequiredInterfacesAssignment_3_2_1_in_rule__Interface__Group_3_2__1__Impl2124);
            rule__Interface__RequiredInterfacesAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getRequiredInterfacesAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_3_2__1__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1086:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1090:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1091:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__02158);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__1_in_rule__Method__Group__02161);
            rule__Method__Group__1();

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
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1098:1: rule__Method__Group__0__Impl : ( ( rule__Method__CommentAssignment_0 )? ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1102:1: ( ( ( rule__Method__CommentAssignment_0 )? ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1103:1: ( ( rule__Method__CommentAssignment_0 )? )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1103:1: ( ( rule__Method__CommentAssignment_0 )? )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1104:1: ( rule__Method__CommentAssignment_0 )?
            {
             before(grammarAccess.getMethodAccess().getCommentAssignment_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1105:1: ( rule__Method__CommentAssignment_0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_DOC_COMMENT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1105:2: rule__Method__CommentAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Method__CommentAssignment_0_in_rule__Method__Group__0__Impl2188);
                    rule__Method__CommentAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getCommentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1115:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1119:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1120:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__12219);
            rule__Method__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__2_in_rule__Method__Group__12222);
            rule__Method__Group__2();

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
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1127:1: rule__Method__Group__1__Impl : ( ( rule__Method__IsStaticAssignment_1 )? ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1131:1: ( ( ( rule__Method__IsStaticAssignment_1 )? ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1132:1: ( ( rule__Method__IsStaticAssignment_1 )? )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1132:1: ( ( rule__Method__IsStaticAssignment_1 )? )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1133:1: ( rule__Method__IsStaticAssignment_1 )?
            {
             before(grammarAccess.getMethodAccess().getIsStaticAssignment_1()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1134:1: ( rule__Method__IsStaticAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1134:2: rule__Method__IsStaticAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Method__IsStaticAssignment_1_in_rule__Method__Group__1__Impl2249);
                    rule__Method__IsStaticAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getIsStaticAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__2"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1144:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1148:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1149:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__22280);
            rule__Method__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__3_in_rule__Method__Group__22283);
            rule__Method__Group__3();

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
    // $ANTLR end "rule__Method__Group__2"


    // $ANTLR start "rule__Method__Group__2__Impl"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1156:1: rule__Method__Group__2__Impl : ( ( rule__Method__TypeAssignment_2 ) ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1160:1: ( ( ( rule__Method__TypeAssignment_2 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1161:1: ( ( rule__Method__TypeAssignment_2 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1161:1: ( ( rule__Method__TypeAssignment_2 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1162:1: ( rule__Method__TypeAssignment_2 )
            {
             before(grammarAccess.getMethodAccess().getTypeAssignment_2()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1163:1: ( rule__Method__TypeAssignment_2 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1163:2: rule__Method__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Method__TypeAssignment_2_in_rule__Method__Group__2__Impl2310);
            rule__Method__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__3"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1173:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1177:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1178:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__32340);
            rule__Method__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__4_in_rule__Method__Group__32343);
            rule__Method__Group__4();

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
    // $ANTLR end "rule__Method__Group__3"


    // $ANTLR start "rule__Method__Group__3__Impl"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1185:1: rule__Method__Group__3__Impl : ( ( rule__Method__NameAssignment_3 ) ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1189:1: ( ( ( rule__Method__NameAssignment_3 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1190:1: ( ( rule__Method__NameAssignment_3 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1190:1: ( ( rule__Method__NameAssignment_3 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1191:1: ( rule__Method__NameAssignment_3 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_3()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1192:1: ( rule__Method__NameAssignment_3 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1192:2: rule__Method__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Method__NameAssignment_3_in_rule__Method__Group__3__Impl2370);
            rule__Method__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__4"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1202:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1206:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1207:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__42400);
            rule__Method__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__5_in_rule__Method__Group__42403);
            rule__Method__Group__5();

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
    // $ANTLR end "rule__Method__Group__4"


    // $ANTLR start "rule__Method__Group__4__Impl"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1214:1: rule__Method__Group__4__Impl : ( ( rule__Method__ParametersAssignment_4 )* ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1218:1: ( ( ( rule__Method__ParametersAssignment_4 )* ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1219:1: ( ( rule__Method__ParametersAssignment_4 )* )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1219:1: ( ( rule__Method__ParametersAssignment_4 )* )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1220:1: ( rule__Method__ParametersAssignment_4 )*
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_4()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1221:1: ( rule__Method__ParametersAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    int LA10_2 = input.LA(2);

                    if ( (LA10_2==20) ) {
                        alt10=1;
                    }


                }
                else if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1221:2: rule__Method__ParametersAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Method__ParametersAssignment_4_in_rule__Method__Group__4__Impl2430);
            	    rule__Method__ParametersAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getParametersAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4__Impl"


    // $ANTLR start "rule__Method__Group__5"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1231:1: rule__Method__Group__5 : rule__Method__Group__5__Impl ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1235:1: ( rule__Method__Group__5__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1236:2: rule__Method__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__52461);
            rule__Method__Group__5__Impl();

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
    // $ANTLR end "rule__Method__Group__5"


    // $ANTLR start "rule__Method__Group__5__Impl"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1242:1: rule__Method__Group__5__Impl : ( ( ';' )? ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1246:1: ( ( ( ';' )? ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1247:1: ( ( ';' )? )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1247:1: ( ( ';' )? )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1248:1: ( ';' )?
            {
             before(grammarAccess.getMethodAccess().getSemicolonKeyword_5()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1249:1: ( ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1250:2: ';'
                    {
                    match(input,19,FOLLOW_19_in_rule__Method__Group__5__Impl2490); 

                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1273:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1277:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1278:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__02535);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__02538);
            rule__Parameter__Group__1();

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
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1285:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__SignaturePartAssignment_0 )? ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1289:1: ( ( ( rule__Parameter__SignaturePartAssignment_0 )? ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1290:1: ( ( rule__Parameter__SignaturePartAssignment_0 )? )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1290:1: ( ( rule__Parameter__SignaturePartAssignment_0 )? )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1291:1: ( rule__Parameter__SignaturePartAssignment_0 )?
            {
             before(grammarAccess.getParameterAccess().getSignaturePartAssignment_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1292:1: ( rule__Parameter__SignaturePartAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1292:2: rule__Parameter__SignaturePartAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Parameter__SignaturePartAssignment_0_in_rule__Parameter__Group__0__Impl2565);
                    rule__Parameter__SignaturePartAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAccess().getSignaturePartAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1302:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1306:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1307:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__12596);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__12599);
            rule__Parameter__Group__2();

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
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1314:1: rule__Parameter__Group__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1318:1: ( ( ':' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1319:1: ( ':' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1319:1: ( ':' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1320:1: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__Parameter__Group__1__Impl2627); 
             after(grammarAccess.getParameterAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1333:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1337:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1338:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__22658);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__22661);
            rule__Parameter__Group__3();

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
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1345:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__TypeAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1349:1: ( ( ( rule__Parameter__TypeAssignment_2 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1350:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1350:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1351:1: ( rule__Parameter__TypeAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_2()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1352:1: ( rule__Parameter__TypeAssignment_2 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1352:2: rule__Parameter__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Parameter__TypeAssignment_2_in_rule__Parameter__Group__2__Impl2688);
            rule__Parameter__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1362:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1366:1: ( rule__Parameter__Group__3__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1367:2: rule__Parameter__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__32718);
            rule__Parameter__Group__3__Impl();

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
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1373:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__NameAssignment_3 ) ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1377:1: ( ( ( rule__Parameter__NameAssignment_3 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1378:1: ( ( rule__Parameter__NameAssignment_3 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1378:1: ( ( rule__Parameter__NameAssignment_3 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1379:1: ( rule__Parameter__NameAssignment_3 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_3()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1380:1: ( rule__Parameter__NameAssignment_3 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1380:2: rule__Parameter__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_3_in_rule__Parameter__Group__3__Impl2745);
            rule__Parameter__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Delegate__Group__0"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1398:1: rule__Delegate__Group__0 : rule__Delegate__Group__0__Impl rule__Delegate__Group__1 ;
    public final void rule__Delegate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1402:1: ( rule__Delegate__Group__0__Impl rule__Delegate__Group__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1403:2: rule__Delegate__Group__0__Impl rule__Delegate__Group__1
            {
            pushFollow(FOLLOW_rule__Delegate__Group__0__Impl_in_rule__Delegate__Group__02783);
            rule__Delegate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delegate__Group__1_in_rule__Delegate__Group__02786);
            rule__Delegate__Group__1();

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
    // $ANTLR end "rule__Delegate__Group__0"


    // $ANTLR start "rule__Delegate__Group__0__Impl"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1410:1: rule__Delegate__Group__0__Impl : ( 'delegate' ) ;
    public final void rule__Delegate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1414:1: ( ( 'delegate' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1415:1: ( 'delegate' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1415:1: ( 'delegate' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1416:1: 'delegate'
            {
             before(grammarAccess.getDelegateAccess().getDelegateKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Delegate__Group__0__Impl2814); 
             after(grammarAccess.getDelegateAccess().getDelegateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegate__Group__0__Impl"


    // $ANTLR start "rule__Delegate__Group__1"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1429:1: rule__Delegate__Group__1 : rule__Delegate__Group__1__Impl rule__Delegate__Group__2 ;
    public final void rule__Delegate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1433:1: ( rule__Delegate__Group__1__Impl rule__Delegate__Group__2 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1434:2: rule__Delegate__Group__1__Impl rule__Delegate__Group__2
            {
            pushFollow(FOLLOW_rule__Delegate__Group__1__Impl_in_rule__Delegate__Group__12845);
            rule__Delegate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delegate__Group__2_in_rule__Delegate__Group__12848);
            rule__Delegate__Group__2();

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
    // $ANTLR end "rule__Delegate__Group__1"


    // $ANTLR start "rule__Delegate__Group__1__Impl"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1441:1: rule__Delegate__Group__1__Impl : ( ( rule__Delegate__NameAssignment_1 ) ) ;
    public final void rule__Delegate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1445:1: ( ( ( rule__Delegate__NameAssignment_1 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1446:1: ( ( rule__Delegate__NameAssignment_1 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1446:1: ( ( rule__Delegate__NameAssignment_1 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1447:1: ( rule__Delegate__NameAssignment_1 )
            {
             before(grammarAccess.getDelegateAccess().getNameAssignment_1()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1448:1: ( rule__Delegate__NameAssignment_1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1448:2: rule__Delegate__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Delegate__NameAssignment_1_in_rule__Delegate__Group__1__Impl2875);
            rule__Delegate__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDelegateAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegate__Group__1__Impl"


    // $ANTLR start "rule__Delegate__Group__2"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1458:1: rule__Delegate__Group__2 : rule__Delegate__Group__2__Impl rule__Delegate__Group__3 ;
    public final void rule__Delegate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1462:1: ( rule__Delegate__Group__2__Impl rule__Delegate__Group__3 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1463:2: rule__Delegate__Group__2__Impl rule__Delegate__Group__3
            {
            pushFollow(FOLLOW_rule__Delegate__Group__2__Impl_in_rule__Delegate__Group__22905);
            rule__Delegate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delegate__Group__3_in_rule__Delegate__Group__22908);
            rule__Delegate__Group__3();

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
    // $ANTLR end "rule__Delegate__Group__2"


    // $ANTLR start "rule__Delegate__Group__2__Impl"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1470:1: rule__Delegate__Group__2__Impl : ( '{' ) ;
    public final void rule__Delegate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1474:1: ( ( '{' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1475:1: ( '{' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1475:1: ( '{' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1476:1: '{'
            {
             before(grammarAccess.getDelegateAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Delegate__Group__2__Impl2936); 
             after(grammarAccess.getDelegateAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegate__Group__2__Impl"


    // $ANTLR start "rule__Delegate__Group__3"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1489:1: rule__Delegate__Group__3 : rule__Delegate__Group__3__Impl rule__Delegate__Group__4 ;
    public final void rule__Delegate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1493:1: ( rule__Delegate__Group__3__Impl rule__Delegate__Group__4 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1494:2: rule__Delegate__Group__3__Impl rule__Delegate__Group__4
            {
            pushFollow(FOLLOW_rule__Delegate__Group__3__Impl_in_rule__Delegate__Group__32967);
            rule__Delegate__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delegate__Group__4_in_rule__Delegate__Group__32970);
            rule__Delegate__Group__4();

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
    // $ANTLR end "rule__Delegate__Group__3"


    // $ANTLR start "rule__Delegate__Group__3__Impl"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1501:1: rule__Delegate__Group__3__Impl : ( ( rule__Delegate__MethodsAssignment_3 )* ) ;
    public final void rule__Delegate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1505:1: ( ( ( rule__Delegate__MethodsAssignment_3 )* ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1506:1: ( ( rule__Delegate__MethodsAssignment_3 )* )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1506:1: ( ( rule__Delegate__MethodsAssignment_3 )* )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1507:1: ( rule__Delegate__MethodsAssignment_3 )*
            {
             before(grammarAccess.getDelegateAccess().getMethodsAssignment_3()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1508:1: ( rule__Delegate__MethodsAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_DOC_COMMENT)||LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1508:2: rule__Delegate__MethodsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Delegate__MethodsAssignment_3_in_rule__Delegate__Group__3__Impl2997);
            	    rule__Delegate__MethodsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getDelegateAccess().getMethodsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegate__Group__3__Impl"


    // $ANTLR start "rule__Delegate__Group__4"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1518:1: rule__Delegate__Group__4 : rule__Delegate__Group__4__Impl ;
    public final void rule__Delegate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1522:1: ( rule__Delegate__Group__4__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1523:2: rule__Delegate__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Delegate__Group__4__Impl_in_rule__Delegate__Group__43028);
            rule__Delegate__Group__4__Impl();

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
    // $ANTLR end "rule__Delegate__Group__4"


    // $ANTLR start "rule__Delegate__Group__4__Impl"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1529:1: rule__Delegate__Group__4__Impl : ( '}' ) ;
    public final void rule__Delegate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1533:1: ( ( '}' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1534:1: ( '}' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1534:1: ( '}' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1535:1: '}'
            {
             before(grammarAccess.getDelegateAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__Delegate__Group__4__Impl3056); 
             after(grammarAccess.getDelegateAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegate__Group__4__Impl"


    // $ANTLR start "rule__Primitive__Group__0"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1559:1: rule__Primitive__Group__0 : rule__Primitive__Group__0__Impl rule__Primitive__Group__1 ;
    public final void rule__Primitive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1563:1: ( rule__Primitive__Group__0__Impl rule__Primitive__Group__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1564:2: rule__Primitive__Group__0__Impl rule__Primitive__Group__1
            {
            pushFollow(FOLLOW_rule__Primitive__Group__0__Impl_in_rule__Primitive__Group__03098);
            rule__Primitive__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primitive__Group__1_in_rule__Primitive__Group__03101);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1571:1: rule__Primitive__Group__0__Impl : ( 'primitive type' ) ;
    public final void rule__Primitive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1575:1: ( ( 'primitive type' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1576:1: ( 'primitive type' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1576:1: ( 'primitive type' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1577:1: 'primitive type'
            {
             before(grammarAccess.getPrimitiveAccess().getPrimitiveTypeKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Primitive__Group__0__Impl3129); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1590:1: rule__Primitive__Group__1 : rule__Primitive__Group__1__Impl ;
    public final void rule__Primitive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1594:1: ( rule__Primitive__Group__1__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1595:2: rule__Primitive__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Primitive__Group__1__Impl_in_rule__Primitive__Group__13160);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1601:1: rule__Primitive__Group__1__Impl : ( ( rule__Primitive__NameAssignment_1 ) ) ;
    public final void rule__Primitive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1605:1: ( ( ( rule__Primitive__NameAssignment_1 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1606:1: ( ( rule__Primitive__NameAssignment_1 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1606:1: ( ( rule__Primitive__NameAssignment_1 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1607:1: ( rule__Primitive__NameAssignment_1 )
            {
             before(grammarAccess.getPrimitiveAccess().getNameAssignment_1()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1608:1: ( rule__Primitive__NameAssignment_1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1608:2: rule__Primitive__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Primitive__NameAssignment_1_in_rule__Primitive__Group__1__Impl3187);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1622:1: rule__Any__Group__0 : rule__Any__Group__0__Impl rule__Any__Group__1 ;
    public final void rule__Any__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1626:1: ( rule__Any__Group__0__Impl rule__Any__Group__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1627:2: rule__Any__Group__0__Impl rule__Any__Group__1
            {
            pushFollow(FOLLOW_rule__Any__Group__0__Impl_in_rule__Any__Group__03221);
            rule__Any__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Any__Group__1_in_rule__Any__Group__03224);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1634:1: rule__Any__Group__0__Impl : ( 'any type' ) ;
    public final void rule__Any__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1638:1: ( ( 'any type' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1639:1: ( 'any type' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1639:1: ( 'any type' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1640:1: 'any type'
            {
             before(grammarAccess.getAnyAccess().getAnyTypeKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Any__Group__0__Impl3252); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1653:1: rule__Any__Group__1 : rule__Any__Group__1__Impl ;
    public final void rule__Any__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1657:1: ( rule__Any__Group__1__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1658:2: rule__Any__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Any__Group__1__Impl_in_rule__Any__Group__13283);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1664:1: rule__Any__Group__1__Impl : ( ( rule__Any__NameAssignment_1 ) ) ;
    public final void rule__Any__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1668:1: ( ( ( rule__Any__NameAssignment_1 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1669:1: ( ( rule__Any__NameAssignment_1 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1669:1: ( ( rule__Any__NameAssignment_1 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1670:1: ( rule__Any__NameAssignment_1 )
            {
             before(grammarAccess.getAnyAccess().getNameAssignment_1()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1671:1: ( rule__Any__NameAssignment_1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1671:2: rule__Any__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Any__NameAssignment_1_in_rule__Any__Group__1__Impl3310);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1685:1: rule__TypeRef__Group__0 : rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 ;
    public final void rule__TypeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1689:1: ( rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1690:2: rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__03344);
            rule__TypeRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__03347);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1697:1: rule__TypeRef__Group__0__Impl : ( ( rule__TypeRef__ReferencedAssignment_0 ) ) ;
    public final void rule__TypeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1701:1: ( ( ( rule__TypeRef__ReferencedAssignment_0 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1702:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1702:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1703:1: ( rule__TypeRef__ReferencedAssignment_0 )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedAssignment_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1704:1: ( rule__TypeRef__ReferencedAssignment_0 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1704:2: rule__TypeRef__ReferencedAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl3374);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1714:1: rule__TypeRef__Group__1 : rule__TypeRef__Group__1__Impl ;
    public final void rule__TypeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1718:1: ( rule__TypeRef__Group__1__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1719:2: rule__TypeRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__13404);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1725:1: rule__TypeRef__Group__1__Impl : ( ( rule__TypeRef__IsMultiAssignment_1 )? ) ;
    public final void rule__TypeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1729:1: ( ( ( rule__TypeRef__IsMultiAssignment_1 )? ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1730:1: ( ( rule__TypeRef__IsMultiAssignment_1 )? )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1730:1: ( ( rule__TypeRef__IsMultiAssignment_1 )? )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1731:1: ( rule__TypeRef__IsMultiAssignment_1 )?
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiAssignment_1()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1732:1: ( rule__TypeRef__IsMultiAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1732:2: rule__TypeRef__IsMultiAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TypeRef__IsMultiAssignment_1_in_rule__TypeRef__Group__1__Impl3431);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1746:1: rule__EFloatObject__Group__0 : rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1 ;
    public final void rule__EFloatObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1750:1: ( rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1751:2: rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__0__Impl_in_rule__EFloatObject__Group__03466);
            rule__EFloatObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__1_in_rule__EFloatObject__Group__03469);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1758:1: rule__EFloatObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloatObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1762:1: ( ( ( '-' )? ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1763:1: ( ( '-' )? )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1763:1: ( ( '-' )? )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1764:1: ( '-' )?
            {
             before(grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1765:1: ( '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1766:2: '-'
                    {
                    match(input,24,FOLLOW_24_in_rule__EFloatObject__Group__0__Impl3498); 

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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1777:1: rule__EFloatObject__Group__1 : rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2 ;
    public final void rule__EFloatObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1781:1: ( rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1782:2: rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__1__Impl_in_rule__EFloatObject__Group__13531);
            rule__EFloatObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__2_in_rule__EFloatObject__Group__13534);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1789:1: rule__EFloatObject__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloatObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1793:1: ( ( ( RULE_INT )? ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1794:1: ( ( RULE_INT )? )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1794:1: ( ( RULE_INT )? )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1795:1: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1796:1: ( RULE_INT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1796:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EFloatObject__Group__1__Impl3562); 

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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1806:1: rule__EFloatObject__Group__2 : rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3 ;
    public final void rule__EFloatObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1810:1: ( rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1811:2: rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__2__Impl_in_rule__EFloatObject__Group__23593);
            rule__EFloatObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__3_in_rule__EFloatObject__Group__23596);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1818:1: rule__EFloatObject__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloatObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1822:1: ( ( '.' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1823:1: ( '.' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1823:1: ( '.' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1824:1: '.'
            {
             before(grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__EFloatObject__Group__2__Impl3624); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1837:1: rule__EFloatObject__Group__3 : rule__EFloatObject__Group__3__Impl ;
    public final void rule__EFloatObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1841:1: ( rule__EFloatObject__Group__3__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1842:2: rule__EFloatObject__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__3__Impl_in_rule__EFloatObject__Group__33655);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1848:1: rule__EFloatObject__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloatObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1852:1: ( ( RULE_INT ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1853:1: ( RULE_INT )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1853:1: ( RULE_INT )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1854:1: RULE_INT
            {
             before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EFloatObject__Group__3__Impl3682); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1873:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1877:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1878:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03719);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03722);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1885:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1889:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1890:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1890:1: ( RULE_ID )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1891:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3749); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1902:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1906:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1907:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13778);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1913:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1917:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1918:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1918:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1919:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1920:1: ( rule__QualifiedName__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==25) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1920:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3805);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1934:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1938:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1939:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03840);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03843);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1946:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1950:1: ( ( '.' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1951:1: ( '.' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1951:1: ( '.' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1952:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,25,FOLLOW_25_in_rule__QualifiedName__Group_1__0__Impl3871); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1965:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1969:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1970:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13902);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1976:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1980:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1981:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1981:1: ( RULE_ID )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1982:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3929); 
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


    // $ANTLR start "rule__InterfaceModel__CurrentAssignment_0"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1998:1: rule__InterfaceModel__CurrentAssignment_0 : ( ( 'current' ) ) ;
    public final void rule__InterfaceModel__CurrentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2002:1: ( ( ( 'current' ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2003:1: ( ( 'current' ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2003:1: ( ( 'current' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2004:1: ( 'current' )
            {
             before(grammarAccess.getInterfaceModelAccess().getCurrentCurrentKeyword_0_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2005:1: ( 'current' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2006:1: 'current'
            {
             before(grammarAccess.getInterfaceModelAccess().getCurrentCurrentKeyword_0_0()); 
            match(input,26,FOLLOW_26_in_rule__InterfaceModel__CurrentAssignment_03972); 
             after(grammarAccess.getInterfaceModelAccess().getCurrentCurrentKeyword_0_0()); 

            }

             after(grammarAccess.getInterfaceModelAccess().getCurrentCurrentKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceModel__CurrentAssignment_0"


    // $ANTLR start "rule__InterfaceModel__ModuleAssignment_2"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2021:1: rule__InterfaceModel__ModuleAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__InterfaceModel__ModuleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2025:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2026:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2026:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2027:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getInterfaceModelAccess().getModuleModuleCrossReference_2_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2028:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2029:1: ruleQualifiedName
            {
             before(grammarAccess.getInterfaceModelAccess().getModuleModuleQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__InterfaceModel__ModuleAssignment_24015);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getInterfaceModelAccess().getModuleModuleQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getInterfaceModelAccess().getModuleModuleCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceModel__ModuleAssignment_2"


    // $ANTLR start "rule__InterfaceModel__VersionAssignment_4"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2040:1: rule__InterfaceModel__VersionAssignment_4 : ( RULE_STRING ) ;
    public final void rule__InterfaceModel__VersionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2044:1: ( ( RULE_STRING ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2045:1: ( RULE_STRING )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2045:1: ( RULE_STRING )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2046:1: RULE_STRING
            {
             before(grammarAccess.getInterfaceModelAccess().getVersionSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__InterfaceModel__VersionAssignment_44050); 
             after(grammarAccess.getInterfaceModelAccess().getVersionSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceModel__VersionAssignment_4"


    // $ANTLR start "rule__InterfaceModel__InterfacesAssignment_5"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2055:1: rule__InterfaceModel__InterfacesAssignment_5 : ( ruleInterface ) ;
    public final void rule__InterfaceModel__InterfacesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2059:1: ( ( ruleInterface ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2060:1: ( ruleInterface )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2060:1: ( ruleInterface )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2061:1: ruleInterface
            {
             before(grammarAccess.getInterfaceModelAccess().getInterfacesInterfaceParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleInterface_in_rule__InterfaceModel__InterfacesAssignment_54081);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getInterfaceModelAccess().getInterfacesInterfaceParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceModel__InterfacesAssignment_5"


    // $ANTLR start "rule__Interface__CommentAssignment_0"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2070:1: rule__Interface__CommentAssignment_0 : ( RULE_DOC_COMMENT ) ;
    public final void rule__Interface__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2074:1: ( ( RULE_DOC_COMMENT ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2075:1: ( RULE_DOC_COMMENT )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2075:1: ( RULE_DOC_COMMENT )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2076:1: RULE_DOC_COMMENT
            {
             before(grammarAccess.getInterfaceAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_rule__Interface__CommentAssignment_04112); 
             after(grammarAccess.getInterfaceAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__CommentAssignment_0"


    // $ANTLR start "rule__Interface__NameAssignment_2"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2085:1: rule__Interface__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Interface__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2089:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2090:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2090:1: ( RULE_ID )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2091:1: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interface__NameAssignment_24143); 
             after(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__NameAssignment_2"


    // $ANTLR start "rule__Interface__RequiredInterfacesAssignment_3_1"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2100:1: rule__Interface__RequiredInterfacesAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Interface__RequiredInterfacesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2104:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2105:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2105:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2106:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getInterfaceAccess().getRequiredInterfacesInterfaceCrossReference_3_1_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2107:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2108:1: ruleQualifiedName
            {
             before(grammarAccess.getInterfaceAccess().getRequiredInterfacesInterfaceQualifiedNameParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Interface__RequiredInterfacesAssignment_3_14178);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getRequiredInterfacesInterfaceQualifiedNameParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getInterfaceAccess().getRequiredInterfacesInterfaceCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__RequiredInterfacesAssignment_3_1"


    // $ANTLR start "rule__Interface__RequiredInterfacesAssignment_3_2_1"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2119:1: rule__Interface__RequiredInterfacesAssignment_3_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Interface__RequiredInterfacesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2123:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2124:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2124:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2125:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getInterfaceAccess().getRequiredInterfacesInterfaceCrossReference_3_2_1_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2126:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2127:1: ruleQualifiedName
            {
             before(grammarAccess.getInterfaceAccess().getRequiredInterfacesInterfaceQualifiedNameParserRuleCall_3_2_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Interface__RequiredInterfacesAssignment_3_2_14217);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getRequiredInterfacesInterfaceQualifiedNameParserRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getInterfaceAccess().getRequiredInterfacesInterfaceCrossReference_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__RequiredInterfacesAssignment_3_2_1"


    // $ANTLR start "rule__Interface__MethodsAssignment_5"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2138:1: rule__Interface__MethodsAssignment_5 : ( ruleMethod ) ;
    public final void rule__Interface__MethodsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2142:1: ( ( ruleMethod ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2143:1: ( ruleMethod )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2143:1: ( ruleMethod )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2144:1: ruleMethod
            {
             before(grammarAccess.getInterfaceAccess().getMethodsMethodParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleMethod_in_rule__Interface__MethodsAssignment_54252);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getMethodsMethodParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__MethodsAssignment_5"


    // $ANTLR start "rule__Interface__DelegatesAssignment_6"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2153:1: rule__Interface__DelegatesAssignment_6 : ( ruleDelegate ) ;
    public final void rule__Interface__DelegatesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2157:1: ( ( ruleDelegate ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2158:1: ( ruleDelegate )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2158:1: ( ruleDelegate )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2159:1: ruleDelegate
            {
             before(grammarAccess.getInterfaceAccess().getDelegatesDelegateParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleDelegate_in_rule__Interface__DelegatesAssignment_64283);
            ruleDelegate();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getDelegatesDelegateParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__DelegatesAssignment_6"


    // $ANTLR start "rule__Method__CommentAssignment_0"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2168:1: rule__Method__CommentAssignment_0 : ( RULE_DOC_COMMENT ) ;
    public final void rule__Method__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2172:1: ( ( RULE_DOC_COMMENT ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2173:1: ( RULE_DOC_COMMENT )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2173:1: ( RULE_DOC_COMMENT )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2174:1: RULE_DOC_COMMENT
            {
             before(grammarAccess.getMethodAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_rule__Method__CommentAssignment_04314); 
             after(grammarAccess.getMethodAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__CommentAssignment_0"


    // $ANTLR start "rule__Method__IsStaticAssignment_1"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2183:1: rule__Method__IsStaticAssignment_1 : ( ( 'static' ) ) ;
    public final void rule__Method__IsStaticAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2187:1: ( ( ( 'static' ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2188:1: ( ( 'static' ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2188:1: ( ( 'static' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2189:1: ( 'static' )
            {
             before(grammarAccess.getMethodAccess().getIsStaticStaticKeyword_1_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2190:1: ( 'static' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2191:1: 'static'
            {
             before(grammarAccess.getMethodAccess().getIsStaticStaticKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__Method__IsStaticAssignment_14350); 
             after(grammarAccess.getMethodAccess().getIsStaticStaticKeyword_1_0()); 

            }

             after(grammarAccess.getMethodAccess().getIsStaticStaticKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__IsStaticAssignment_1"


    // $ANTLR start "rule__Method__TypeAssignment_2"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2206:1: rule__Method__TypeAssignment_2 : ( ruleTypeRef ) ;
    public final void rule__Method__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2210:1: ( ( ruleTypeRef ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2211:1: ( ruleTypeRef )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2211:1: ( ruleTypeRef )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2212:1: ruleTypeRef
            {
             before(grammarAccess.getMethodAccess().getTypeTypeRefParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Method__TypeAssignment_24389);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getTypeTypeRefParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__TypeAssignment_2"


    // $ANTLR start "rule__Method__NameAssignment_3"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2221:1: rule__Method__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2225:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2226:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2226:1: ( RULE_ID )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2227:1: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Method__NameAssignment_34420); 
             after(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__NameAssignment_3"


    // $ANTLR start "rule__Method__ParametersAssignment_4"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2236:1: rule__Method__ParametersAssignment_4 : ( ruleParameter ) ;
    public final void rule__Method__ParametersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2240:1: ( ( ruleParameter ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2241:1: ( ruleParameter )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2241:1: ( ruleParameter )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2242:1: ruleParameter
            {
             before(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Method__ParametersAssignment_44451);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParametersAssignment_4"


    // $ANTLR start "rule__Parameter__SignaturePartAssignment_0"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2251:1: rule__Parameter__SignaturePartAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__SignaturePartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2255:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2256:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2256:1: ( RULE_ID )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2257:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getSignaturePartIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__SignaturePartAssignment_04482); 
             after(grammarAccess.getParameterAccess().getSignaturePartIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__SignaturePartAssignment_0"


    // $ANTLR start "rule__Parameter__TypeAssignment_2"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2266:1: rule__Parameter__TypeAssignment_2 : ( ruleTypeRef ) ;
    public final void rule__Parameter__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2270:1: ( ( ruleTypeRef ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2271:1: ( ruleTypeRef )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2271:1: ( ruleTypeRef )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2272:1: ruleTypeRef
            {
             before(grammarAccess.getParameterAccess().getTypeTypeRefParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Parameter__TypeAssignment_24513);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeTypeRefParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_2"


    // $ANTLR start "rule__Parameter__NameAssignment_3"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2281:1: rule__Parameter__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2285:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2286:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2286:1: ( RULE_ID )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2287:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_34544); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_3"


    // $ANTLR start "rule__Delegate__NameAssignment_1"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2296:1: rule__Delegate__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Delegate__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2300:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2301:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2301:1: ( RULE_ID )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2302:1: RULE_ID
            {
             before(grammarAccess.getDelegateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Delegate__NameAssignment_14575); 
             after(grammarAccess.getDelegateAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegate__NameAssignment_1"


    // $ANTLR start "rule__Delegate__MethodsAssignment_3"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2311:1: rule__Delegate__MethodsAssignment_3 : ( ruleMethod ) ;
    public final void rule__Delegate__MethodsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2315:1: ( ( ruleMethod ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2316:1: ( ruleMethod )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2316:1: ( ruleMethod )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2317:1: ruleMethod
            {
             before(grammarAccess.getDelegateAccess().getMethodsMethodParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMethod_in_rule__Delegate__MethodsAssignment_34606);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getDelegateAccess().getMethodsMethodParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delegate__MethodsAssignment_3"


    // $ANTLR start "rule__Primitive__NameAssignment_1"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2328:1: rule__Primitive__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Primitive__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2332:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2333:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2333:1: ( RULE_ID )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2334:1: RULE_ID
            {
             before(grammarAccess.getPrimitiveAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Primitive__NameAssignment_14639); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2343:1: rule__Any__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Any__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2347:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2348:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2348:1: ( RULE_ID )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2349:1: RULE_ID
            {
             before(grammarAccess.getAnyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Any__NameAssignment_14670); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2358:1: rule__TypeRef__ReferencedAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TypeRef__ReferencedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2362:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2363:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2363:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2364:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2365:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2366:1: ruleQualifiedName
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_04705);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2377:1: rule__TypeRef__IsMultiAssignment_1 : ( ( '[]' ) ) ;
    public final void rule__TypeRef__IsMultiAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2381:1: ( ( ( '[]' ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2382:1: ( ( '[]' ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2382:1: ( ( '[]' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2383:1: ( '[]' )
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2384:1: ( '[]' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2385:1: '[]'
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__TypeRef__IsMultiAssignment_14745); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2400:1: rule__StringValue__ValueAssignment : ( ruleEStringObject ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2404:1: ( ( ruleEStringObject ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2405:1: ( ruleEStringObject )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2405:1: ( ruleEStringObject )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2406:1: ruleEStringObject
            {
             before(grammarAccess.getStringValueAccess().getValueEStringObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEStringObject_in_rule__StringValue__ValueAssignment4784);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2415:1: rule__IntegerValue__ValueAssignment : ( ruleEIntegerObject ) ;
    public final void rule__IntegerValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2419:1: ( ( ruleEIntegerObject ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2420:1: ( ruleEIntegerObject )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2420:1: ( ruleEIntegerObject )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2421:1: ruleEIntegerObject
            {
             before(grammarAccess.getIntegerValueAccess().getValueEIntegerObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_rule__IntegerValue__ValueAssignment4815);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2430:1: rule__FloatValue__ValueAssignment : ( ruleEFloatObject ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2434:1: ( ( ruleEFloatObject ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2435:1: ( ruleEFloatObject )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2435:1: ( ruleEFloatObject )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2436:1: ruleEFloatObject
            {
             before(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_rule__FloatValue__ValueAssignment4846);
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


 

    public static final BitSet FOLLOW_ruleInterfaceModel_in_entryRuleInterfaceModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceModel__Group__0_in_ruleInterfaceModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__0_in_ruleInterface154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0_in_ruleMethod214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelegate_in_entryRuleDelegate301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDelegate308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegate__Group__0_in_ruleDelegate334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__0_in_rulePrimitive396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAny_in_entryRuleAny423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAny430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__Group__0_in_ruleAny456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_entryRuleEStringObject605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEStringObject612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEStringObject638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerValue__ValueAssignment_in_ruleIntegerValue697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEIntegerObject731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEIntegerObject757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEFloatObject850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__0_in_ruleEFloatObject876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceModel__Group__0__Impl_in_rule__InterfaceModel__Group__0971 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__InterfaceModel__Group__1_in_rule__InterfaceModel__Group__0974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceModel__CurrentAssignment_0_in_rule__InterfaceModel__Group__0__Impl1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceModel__Group__1__Impl_in_rule__InterfaceModel__Group__11032 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__InterfaceModel__Group__2_in_rule__InterfaceModel__Group__11035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__InterfaceModel__Group__1__Impl1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceModel__Group__2__Impl_in_rule__InterfaceModel__Group__21094 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__InterfaceModel__Group__3_in_rule__InterfaceModel__Group__21097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceModel__ModuleAssignment_2_in_rule__InterfaceModel__Group__2__Impl1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceModel__Group__3__Impl_in_rule__InterfaceModel__Group__31154 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InterfaceModel__Group__4_in_rule__InterfaceModel__Group__31157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__InterfaceModel__Group__3__Impl1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceModel__Group__4__Impl_in_rule__InterfaceModel__Group__41216 = new BitSet(new long[]{0x0000000000004080L});
    public static final BitSet FOLLOW_rule__InterfaceModel__Group__5_in_rule__InterfaceModel__Group__41219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceModel__VersionAssignment_4_in_rule__InterfaceModel__Group__4__Impl1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceModel__Group__5__Impl_in_rule__InterfaceModel__Group__51276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceModel__InterfacesAssignment_5_in_rule__InterfaceModel__Group__5__Impl1303 = new BitSet(new long[]{0x0000000000004082L});
    public static final BitSet FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__01346 = new BitSet(new long[]{0x0000000000004080L});
    public static final BitSet FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__01349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__CommentAssignment_0_in_rule__Interface__Group__0__Impl1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__11407 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__11410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Interface__Group__1__Impl1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__21469 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__Interface__Group__3_in_rule__Interface__Group__21472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__NameAssignment_2_in_rule__Interface__Group__2__Impl1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__3__Impl_in_rule__Interface__Group__31529 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__Interface__Group__4_in_rule__Interface__Group__31532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_3__0_in_rule__Interface__Group__3__Impl1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__4__Impl_in_rule__Interface__Group__41590 = new BitSet(new long[]{0x00000000082100C0L});
    public static final BitSet FOLLOW_rule__Interface__Group__5_in_rule__Interface__Group__41593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Interface__Group__4__Impl1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__5__Impl_in_rule__Interface__Group__51652 = new BitSet(new long[]{0x00000000082100C0L});
    public static final BitSet FOLLOW_rule__Interface__Group__6_in_rule__Interface__Group__51655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__MethodsAssignment_5_in_rule__Interface__Group__5__Impl1682 = new BitSet(new long[]{0x00000000080000C2L});
    public static final BitSet FOLLOW_rule__Interface__Group__6__Impl_in_rule__Interface__Group__61713 = new BitSet(new long[]{0x00000000082100C0L});
    public static final BitSet FOLLOW_rule__Interface__Group__7_in_rule__Interface__Group__61716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__DelegatesAssignment_6_in_rule__Interface__Group__6__Impl1743 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Interface__Group__7__Impl_in_rule__Interface__Group__71774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Interface__Group__7__Impl1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_3__0__Impl_in_rule__Interface__Group_3__01849 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Interface__Group_3__1_in_rule__Interface__Group_3__01852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Interface__Group_3__0__Impl1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_3__1__Impl_in_rule__Interface__Group_3__11911 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Interface__Group_3__2_in_rule__Interface__Group_3__11914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__RequiredInterfacesAssignment_3_1_in_rule__Interface__Group_3__1__Impl1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_3__2__Impl_in_rule__Interface__Group_3__21971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_3_2__0_in_rule__Interface__Group_3__2__Impl1998 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Interface__Group_3_2__0__Impl_in_rule__Interface__Group_3_2__02035 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Interface__Group_3_2__1_in_rule__Interface__Group_3_2__02038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Interface__Group_3_2__0__Impl2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_3_2__1__Impl_in_rule__Interface__Group_3_2__12097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__RequiredInterfacesAssignment_3_2_1_in_rule__Interface__Group_3_2__1__Impl2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__02158 = new BitSet(new long[]{0x00000000080000C0L});
    public static final BitSet FOLLOW_rule__Method__Group__1_in_rule__Method__Group__02161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__CommentAssignment_0_in_rule__Method__Group__0__Impl2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__12219 = new BitSet(new long[]{0x00000000080000C0L});
    public static final BitSet FOLLOW_rule__Method__Group__2_in_rule__Method__Group__12222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__IsStaticAssignment_1_in_rule__Method__Group__1__Impl2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__22280 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Method__Group__3_in_rule__Method__Group__22283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__TypeAssignment_2_in_rule__Method__Group__2__Impl2310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__32340 = new BitSet(new long[]{0x0000000000180040L});
    public static final BitSet FOLLOW_rule__Method__Group__4_in_rule__Method__Group__32343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__NameAssignment_3_in_rule__Method__Group__3__Impl2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__42400 = new BitSet(new long[]{0x0000000000180040L});
    public static final BitSet FOLLOW_rule__Method__Group__5_in_rule__Method__Group__42403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ParametersAssignment_4_in_rule__Method__Group__4__Impl2430 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__52461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Method__Group__5__Impl2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__02535 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__02538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__SignaturePartAssignment_0_in_rule__Parameter__Group__0__Impl2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__12596 = new BitSet(new long[]{0x00000000080000C0L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__12599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Parameter__Group__1__Impl2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__22658 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__22661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_2_in_rule__Parameter__Group__2__Impl2688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__32718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_3_in_rule__Parameter__Group__3__Impl2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegate__Group__0__Impl_in_rule__Delegate__Group__02783 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Delegate__Group__1_in_rule__Delegate__Group__02786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Delegate__Group__0__Impl2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegate__Group__1__Impl_in_rule__Delegate__Group__12845 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Delegate__Group__2_in_rule__Delegate__Group__12848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegate__NameAssignment_1_in_rule__Delegate__Group__1__Impl2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegate__Group__2__Impl_in_rule__Delegate__Group__22905 = new BitSet(new long[]{0x00000000080100C0L});
    public static final BitSet FOLLOW_rule__Delegate__Group__3_in_rule__Delegate__Group__22908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Delegate__Group__2__Impl2936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegate__Group__3__Impl_in_rule__Delegate__Group__32967 = new BitSet(new long[]{0x00000000080100C0L});
    public static final BitSet FOLLOW_rule__Delegate__Group__4_in_rule__Delegate__Group__32970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegate__MethodsAssignment_3_in_rule__Delegate__Group__3__Impl2997 = new BitSet(new long[]{0x00000000080000C2L});
    public static final BitSet FOLLOW_rule__Delegate__Group__4__Impl_in_rule__Delegate__Group__43028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Delegate__Group__4__Impl3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__0__Impl_in_rule__Primitive__Group__03098 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Primitive__Group__1_in_rule__Primitive__Group__03101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Primitive__Group__0__Impl3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__1__Impl_in_rule__Primitive__Group__13160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__NameAssignment_1_in_rule__Primitive__Group__1__Impl3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__Group__0__Impl_in_rule__Any__Group__03221 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Any__Group__1_in_rule__Any__Group__03224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Any__Group__0__Impl3252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__Group__1__Impl_in_rule__Any__Group__13283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__NameAssignment_1_in_rule__Any__Group__1__Impl3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__03344 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__03347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl3374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__13404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__IsMultiAssignment_1_in_rule__TypeRef__Group__1__Impl3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__0__Impl_in_rule__EFloatObject__Group__03466 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__1_in_rule__EFloatObject__Group__03469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__EFloatObject__Group__0__Impl3498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__1__Impl_in_rule__EFloatObject__Group__13531 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__2_in_rule__EFloatObject__Group__13534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group__1__Impl3562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__2__Impl_in_rule__EFloatObject__Group__23593 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__3_in_rule__EFloatObject__Group__23596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__EFloatObject__Group__2__Impl3624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__3__Impl_in_rule__EFloatObject__Group__33655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group__3__Impl3682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03719 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3805 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03840 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__QualifiedName__Group_1__0__Impl3871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__InterfaceModel__CurrentAssignment_03972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__InterfaceModel__ModuleAssignment_24015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__InterfaceModel__VersionAssignment_44050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_rule__InterfaceModel__InterfacesAssignment_54081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_rule__Interface__CommentAssignment_04112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interface__NameAssignment_24143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Interface__RequiredInterfacesAssignment_3_14178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Interface__RequiredInterfacesAssignment_3_2_14217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__Interface__MethodsAssignment_54252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelegate_in_rule__Interface__DelegatesAssignment_64283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_rule__Method__CommentAssignment_04314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Method__IsStaticAssignment_14350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Method__TypeAssignment_24389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Method__NameAssignment_34420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Method__ParametersAssignment_44451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__SignaturePartAssignment_04482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Parameter__TypeAssignment_24513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_34544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Delegate__NameAssignment_14575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__Delegate__MethodsAssignment_34606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Primitive__NameAssignment_14639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Any__NameAssignment_14670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_04705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TypeRef__IsMultiAssignment_14745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_rule__StringValue__ValueAssignment4784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_rule__IntegerValue__ValueAssignment4815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_rule__FloatValue__ValueAssignment4846 = new BitSet(new long[]{0x0000000000000002L});

}