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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_DOC_COMMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'interfaces for module'", "'version'", "'interface'", "'{'", "'}'", "'requires'", "','", "';'", "':'", "'delegate'", "'primitive type'", "'any type'", "'-'", "'.'", "'static'", "'[]'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_DOC_COMMENT=7;
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:499:1: rule__InterfaceModel__Group__0__Impl : ( 'interfaces for module' ) ;
    public final void rule__InterfaceModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:503:1: ( ( 'interfaces for module' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:504:1: ( 'interfaces for module' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:504:1: ( 'interfaces for module' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:505:1: 'interfaces for module'
            {
             before(grammarAccess.getInterfaceModelAccess().getInterfacesForModuleKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__InterfaceModel__Group__0__Impl1002); 
             after(grammarAccess.getInterfaceModelAccess().getInterfacesForModuleKeyword_0()); 

            }


            }

        }
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:518:1: rule__InterfaceModel__Group__1 : rule__InterfaceModel__Group__1__Impl rule__InterfaceModel__Group__2 ;
    public final void rule__InterfaceModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:522:1: ( rule__InterfaceModel__Group__1__Impl rule__InterfaceModel__Group__2 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:523:2: rule__InterfaceModel__Group__1__Impl rule__InterfaceModel__Group__2
            {
            pushFollow(FOLLOW_rule__InterfaceModel__Group__1__Impl_in_rule__InterfaceModel__Group__11033);
            rule__InterfaceModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfaceModel__Group__2_in_rule__InterfaceModel__Group__11036);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:530:1: rule__InterfaceModel__Group__1__Impl : ( ( rule__InterfaceModel__ModuleAssignment_1 ) ) ;
    public final void rule__InterfaceModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:534:1: ( ( ( rule__InterfaceModel__ModuleAssignment_1 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:535:1: ( ( rule__InterfaceModel__ModuleAssignment_1 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:535:1: ( ( rule__InterfaceModel__ModuleAssignment_1 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:536:1: ( rule__InterfaceModel__ModuleAssignment_1 )
            {
             before(grammarAccess.getInterfaceModelAccess().getModuleAssignment_1()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:537:1: ( rule__InterfaceModel__ModuleAssignment_1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:537:2: rule__InterfaceModel__ModuleAssignment_1
            {
            pushFollow(FOLLOW_rule__InterfaceModel__ModuleAssignment_1_in_rule__InterfaceModel__Group__1__Impl1063);
            rule__InterfaceModel__ModuleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceModelAccess().getModuleAssignment_1()); 

            }


            }

        }
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
            pushFollow(FOLLOW_rule__InterfaceModel__Group__2__Impl_in_rule__InterfaceModel__Group__21093);
            rule__InterfaceModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfaceModel__Group__3_in_rule__InterfaceModel__Group__21096);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:559:1: rule__InterfaceModel__Group__2__Impl : ( 'version' ) ;
    public final void rule__InterfaceModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:563:1: ( ( 'version' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:564:1: ( 'version' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:564:1: ( 'version' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:565:1: 'version'
            {
             before(grammarAccess.getInterfaceModelAccess().getVersionKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__InterfaceModel__Group__2__Impl1124); 
             after(grammarAccess.getInterfaceModelAccess().getVersionKeyword_2()); 

            }


            }

        }
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:578:1: rule__InterfaceModel__Group__3 : rule__InterfaceModel__Group__3__Impl rule__InterfaceModel__Group__4 ;
    public final void rule__InterfaceModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:582:1: ( rule__InterfaceModel__Group__3__Impl rule__InterfaceModel__Group__4 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:583:2: rule__InterfaceModel__Group__3__Impl rule__InterfaceModel__Group__4
            {
            pushFollow(FOLLOW_rule__InterfaceModel__Group__3__Impl_in_rule__InterfaceModel__Group__31155);
            rule__InterfaceModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfaceModel__Group__4_in_rule__InterfaceModel__Group__31158);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:590:1: rule__InterfaceModel__Group__3__Impl : ( ( rule__InterfaceModel__VersionAssignment_3 ) ) ;
    public final void rule__InterfaceModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:594:1: ( ( ( rule__InterfaceModel__VersionAssignment_3 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:595:1: ( ( rule__InterfaceModel__VersionAssignment_3 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:595:1: ( ( rule__InterfaceModel__VersionAssignment_3 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:596:1: ( rule__InterfaceModel__VersionAssignment_3 )
            {
             before(grammarAccess.getInterfaceModelAccess().getVersionAssignment_3()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:597:1: ( rule__InterfaceModel__VersionAssignment_3 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:597:2: rule__InterfaceModel__VersionAssignment_3
            {
            pushFollow(FOLLOW_rule__InterfaceModel__VersionAssignment_3_in_rule__InterfaceModel__Group__3__Impl1185);
            rule__InterfaceModel__VersionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceModelAccess().getVersionAssignment_3()); 

            }


            }

        }
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:607:1: rule__InterfaceModel__Group__4 : rule__InterfaceModel__Group__4__Impl ;
    public final void rule__InterfaceModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:611:1: ( rule__InterfaceModel__Group__4__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:612:2: rule__InterfaceModel__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__InterfaceModel__Group__4__Impl_in_rule__InterfaceModel__Group__41215);
            rule__InterfaceModel__Group__4__Impl();

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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:618:1: rule__InterfaceModel__Group__4__Impl : ( ( rule__InterfaceModel__InterfacesAssignment_4 )* ) ;
    public final void rule__InterfaceModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:622:1: ( ( ( rule__InterfaceModel__InterfacesAssignment_4 )* ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:623:1: ( ( rule__InterfaceModel__InterfacesAssignment_4 )* )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:623:1: ( ( rule__InterfaceModel__InterfacesAssignment_4 )* )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:624:1: ( rule__InterfaceModel__InterfacesAssignment_4 )*
            {
             before(grammarAccess.getInterfaceModelAccess().getInterfacesAssignment_4()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:625:1: ( rule__InterfaceModel__InterfacesAssignment_4 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_DOC_COMMENT||LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:625:2: rule__InterfaceModel__InterfacesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__InterfaceModel__InterfacesAssignment_4_in_rule__InterfaceModel__Group__4__Impl1242);
            	    rule__InterfaceModel__InterfacesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getInterfaceModelAccess().getInterfacesAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Interface__Group__0"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:645:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:649:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:650:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__01283);
            rule__Interface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__01286);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:657:1: rule__Interface__Group__0__Impl : ( ( rule__Interface__CommentAssignment_0 )? ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:661:1: ( ( ( rule__Interface__CommentAssignment_0 )? ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:662:1: ( ( rule__Interface__CommentAssignment_0 )? )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:662:1: ( ( rule__Interface__CommentAssignment_0 )? )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:663:1: ( rule__Interface__CommentAssignment_0 )?
            {
             before(grammarAccess.getInterfaceAccess().getCommentAssignment_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:664:1: ( rule__Interface__CommentAssignment_0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_DOC_COMMENT) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:664:2: rule__Interface__CommentAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Interface__CommentAssignment_0_in_rule__Interface__Group__0__Impl1313);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:674:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:678:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:679:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__11344);
            rule__Interface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__11347);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:686:1: rule__Interface__Group__1__Impl : ( 'interface' ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:690:1: ( ( 'interface' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:691:1: ( 'interface' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:691:1: ( 'interface' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:692:1: 'interface'
            {
             before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__Interface__Group__1__Impl1375); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:705:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl rule__Interface__Group__3 ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:709:1: ( rule__Interface__Group__2__Impl rule__Interface__Group__3 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:710:2: rule__Interface__Group__2__Impl rule__Interface__Group__3
            {
            pushFollow(FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__21406);
            rule__Interface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__3_in_rule__Interface__Group__21409);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:717:1: rule__Interface__Group__2__Impl : ( ( rule__Interface__NameAssignment_2 ) ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:721:1: ( ( ( rule__Interface__NameAssignment_2 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:722:1: ( ( rule__Interface__NameAssignment_2 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:722:1: ( ( rule__Interface__NameAssignment_2 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:723:1: ( rule__Interface__NameAssignment_2 )
            {
             before(grammarAccess.getInterfaceAccess().getNameAssignment_2()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:724:1: ( rule__Interface__NameAssignment_2 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:724:2: rule__Interface__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Interface__NameAssignment_2_in_rule__Interface__Group__2__Impl1436);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:734:1: rule__Interface__Group__3 : rule__Interface__Group__3__Impl rule__Interface__Group__4 ;
    public final void rule__Interface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:738:1: ( rule__Interface__Group__3__Impl rule__Interface__Group__4 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:739:2: rule__Interface__Group__3__Impl rule__Interface__Group__4
            {
            pushFollow(FOLLOW_rule__Interface__Group__3__Impl_in_rule__Interface__Group__31466);
            rule__Interface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__4_in_rule__Interface__Group__31469);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:746:1: rule__Interface__Group__3__Impl : ( ( rule__Interface__Group_3__0 )? ) ;
    public final void rule__Interface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:750:1: ( ( ( rule__Interface__Group_3__0 )? ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:751:1: ( ( rule__Interface__Group_3__0 )? )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:751:1: ( ( rule__Interface__Group_3__0 )? )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:752:1: ( rule__Interface__Group_3__0 )?
            {
             before(grammarAccess.getInterfaceAccess().getGroup_3()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:753:1: ( rule__Interface__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:753:2: rule__Interface__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Interface__Group_3__0_in_rule__Interface__Group__3__Impl1496);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:763:1: rule__Interface__Group__4 : rule__Interface__Group__4__Impl rule__Interface__Group__5 ;
    public final void rule__Interface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:767:1: ( rule__Interface__Group__4__Impl rule__Interface__Group__5 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:768:2: rule__Interface__Group__4__Impl rule__Interface__Group__5
            {
            pushFollow(FOLLOW_rule__Interface__Group__4__Impl_in_rule__Interface__Group__41527);
            rule__Interface__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__5_in_rule__Interface__Group__41530);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:775:1: rule__Interface__Group__4__Impl : ( '{' ) ;
    public final void rule__Interface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:779:1: ( ( '{' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:780:1: ( '{' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:780:1: ( '{' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:781:1: '{'
            {
             before(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__Interface__Group__4__Impl1558); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:794:1: rule__Interface__Group__5 : rule__Interface__Group__5__Impl rule__Interface__Group__6 ;
    public final void rule__Interface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:798:1: ( rule__Interface__Group__5__Impl rule__Interface__Group__6 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:799:2: rule__Interface__Group__5__Impl rule__Interface__Group__6
            {
            pushFollow(FOLLOW_rule__Interface__Group__5__Impl_in_rule__Interface__Group__51589);
            rule__Interface__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__6_in_rule__Interface__Group__51592);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:806:1: rule__Interface__Group__5__Impl : ( ( rule__Interface__MethodsAssignment_5 )* ) ;
    public final void rule__Interface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:810:1: ( ( ( rule__Interface__MethodsAssignment_5 )* ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:811:1: ( ( rule__Interface__MethodsAssignment_5 )* )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:811:1: ( ( rule__Interface__MethodsAssignment_5 )* )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:812:1: ( rule__Interface__MethodsAssignment_5 )*
            {
             before(grammarAccess.getInterfaceAccess().getMethodsAssignment_5()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:813:1: ( rule__Interface__MethodsAssignment_5 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_DOC_COMMENT)||LA4_0==26) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:813:2: rule__Interface__MethodsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Interface__MethodsAssignment_5_in_rule__Interface__Group__5__Impl1619);
            	    rule__Interface__MethodsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:823:1: rule__Interface__Group__6 : rule__Interface__Group__6__Impl rule__Interface__Group__7 ;
    public final void rule__Interface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:827:1: ( rule__Interface__Group__6__Impl rule__Interface__Group__7 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:828:2: rule__Interface__Group__6__Impl rule__Interface__Group__7
            {
            pushFollow(FOLLOW_rule__Interface__Group__6__Impl_in_rule__Interface__Group__61650);
            rule__Interface__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__7_in_rule__Interface__Group__61653);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:835:1: rule__Interface__Group__6__Impl : ( ( rule__Interface__DelegatesAssignment_6 )* ) ;
    public final void rule__Interface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:839:1: ( ( ( rule__Interface__DelegatesAssignment_6 )* ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:840:1: ( ( rule__Interface__DelegatesAssignment_6 )* )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:840:1: ( ( rule__Interface__DelegatesAssignment_6 )* )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:841:1: ( rule__Interface__DelegatesAssignment_6 )*
            {
             before(grammarAccess.getInterfaceAccess().getDelegatesAssignment_6()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:842:1: ( rule__Interface__DelegatesAssignment_6 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:842:2: rule__Interface__DelegatesAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Interface__DelegatesAssignment_6_in_rule__Interface__Group__6__Impl1680);
            	    rule__Interface__DelegatesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:852:1: rule__Interface__Group__7 : rule__Interface__Group__7__Impl ;
    public final void rule__Interface__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:856:1: ( rule__Interface__Group__7__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:857:2: rule__Interface__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group__7__Impl_in_rule__Interface__Group__71711);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:863:1: rule__Interface__Group__7__Impl : ( '}' ) ;
    public final void rule__Interface__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:867:1: ( ( '}' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:868:1: ( '}' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:868:1: ( '}' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:869:1: '}'
            {
             before(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_16_in_rule__Interface__Group__7__Impl1739); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:898:1: rule__Interface__Group_3__0 : rule__Interface__Group_3__0__Impl rule__Interface__Group_3__1 ;
    public final void rule__Interface__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:902:1: ( rule__Interface__Group_3__0__Impl rule__Interface__Group_3__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:903:2: rule__Interface__Group_3__0__Impl rule__Interface__Group_3__1
            {
            pushFollow(FOLLOW_rule__Interface__Group_3__0__Impl_in_rule__Interface__Group_3__01786);
            rule__Interface__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_3__1_in_rule__Interface__Group_3__01789);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:910:1: rule__Interface__Group_3__0__Impl : ( 'requires' ) ;
    public final void rule__Interface__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:914:1: ( ( 'requires' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:915:1: ( 'requires' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:915:1: ( 'requires' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:916:1: 'requires'
            {
             before(grammarAccess.getInterfaceAccess().getRequiresKeyword_3_0()); 
            match(input,17,FOLLOW_17_in_rule__Interface__Group_3__0__Impl1817); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:929:1: rule__Interface__Group_3__1 : rule__Interface__Group_3__1__Impl rule__Interface__Group_3__2 ;
    public final void rule__Interface__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:933:1: ( rule__Interface__Group_3__1__Impl rule__Interface__Group_3__2 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:934:2: rule__Interface__Group_3__1__Impl rule__Interface__Group_3__2
            {
            pushFollow(FOLLOW_rule__Interface__Group_3__1__Impl_in_rule__Interface__Group_3__11848);
            rule__Interface__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_3__2_in_rule__Interface__Group_3__11851);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:941:1: rule__Interface__Group_3__1__Impl : ( ( rule__Interface__RequiredInterfacesAssignment_3_1 ) ) ;
    public final void rule__Interface__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:945:1: ( ( ( rule__Interface__RequiredInterfacesAssignment_3_1 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:946:1: ( ( rule__Interface__RequiredInterfacesAssignment_3_1 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:946:1: ( ( rule__Interface__RequiredInterfacesAssignment_3_1 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:947:1: ( rule__Interface__RequiredInterfacesAssignment_3_1 )
            {
             before(grammarAccess.getInterfaceAccess().getRequiredInterfacesAssignment_3_1()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:948:1: ( rule__Interface__RequiredInterfacesAssignment_3_1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:948:2: rule__Interface__RequiredInterfacesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Interface__RequiredInterfacesAssignment_3_1_in_rule__Interface__Group_3__1__Impl1878);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:958:1: rule__Interface__Group_3__2 : rule__Interface__Group_3__2__Impl ;
    public final void rule__Interface__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:962:1: ( rule__Interface__Group_3__2__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:963:2: rule__Interface__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group_3__2__Impl_in_rule__Interface__Group_3__21908);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:969:1: rule__Interface__Group_3__2__Impl : ( ( rule__Interface__Group_3_2__0 )* ) ;
    public final void rule__Interface__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:973:1: ( ( ( rule__Interface__Group_3_2__0 )* ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:974:1: ( ( rule__Interface__Group_3_2__0 )* )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:974:1: ( ( rule__Interface__Group_3_2__0 )* )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:975:1: ( rule__Interface__Group_3_2__0 )*
            {
             before(grammarAccess.getInterfaceAccess().getGroup_3_2()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:976:1: ( rule__Interface__Group_3_2__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:976:2: rule__Interface__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Interface__Group_3_2__0_in_rule__Interface__Group_3__2__Impl1935);
            	    rule__Interface__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:992:1: rule__Interface__Group_3_2__0 : rule__Interface__Group_3_2__0__Impl rule__Interface__Group_3_2__1 ;
    public final void rule__Interface__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:996:1: ( rule__Interface__Group_3_2__0__Impl rule__Interface__Group_3_2__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:997:2: rule__Interface__Group_3_2__0__Impl rule__Interface__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Interface__Group_3_2__0__Impl_in_rule__Interface__Group_3_2__01972);
            rule__Interface__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_3_2__1_in_rule__Interface__Group_3_2__01975);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1004:1: rule__Interface__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Interface__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1008:1: ( ( ',' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1009:1: ( ',' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1009:1: ( ',' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1010:1: ','
            {
             before(grammarAccess.getInterfaceAccess().getCommaKeyword_3_2_0()); 
            match(input,18,FOLLOW_18_in_rule__Interface__Group_3_2__0__Impl2003); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1023:1: rule__Interface__Group_3_2__1 : rule__Interface__Group_3_2__1__Impl ;
    public final void rule__Interface__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1027:1: ( rule__Interface__Group_3_2__1__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1028:2: rule__Interface__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group_3_2__1__Impl_in_rule__Interface__Group_3_2__12034);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1034:1: rule__Interface__Group_3_2__1__Impl : ( ( rule__Interface__RequiredInterfacesAssignment_3_2_1 ) ) ;
    public final void rule__Interface__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1038:1: ( ( ( rule__Interface__RequiredInterfacesAssignment_3_2_1 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1039:1: ( ( rule__Interface__RequiredInterfacesAssignment_3_2_1 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1039:1: ( ( rule__Interface__RequiredInterfacesAssignment_3_2_1 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1040:1: ( rule__Interface__RequiredInterfacesAssignment_3_2_1 )
            {
             before(grammarAccess.getInterfaceAccess().getRequiredInterfacesAssignment_3_2_1()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1041:1: ( rule__Interface__RequiredInterfacesAssignment_3_2_1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1041:2: rule__Interface__RequiredInterfacesAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Interface__RequiredInterfacesAssignment_3_2_1_in_rule__Interface__Group_3_2__1__Impl2061);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1055:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1059:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1060:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__02095);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__1_in_rule__Method__Group__02098);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1067:1: rule__Method__Group__0__Impl : ( ( rule__Method__CommentAssignment_0 )? ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1071:1: ( ( ( rule__Method__CommentAssignment_0 )? ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1072:1: ( ( rule__Method__CommentAssignment_0 )? )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1072:1: ( ( rule__Method__CommentAssignment_0 )? )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1073:1: ( rule__Method__CommentAssignment_0 )?
            {
             before(grammarAccess.getMethodAccess().getCommentAssignment_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1074:1: ( rule__Method__CommentAssignment_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_DOC_COMMENT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1074:2: rule__Method__CommentAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Method__CommentAssignment_0_in_rule__Method__Group__0__Impl2125);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1084:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1088:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1089:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__12156);
            rule__Method__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__2_in_rule__Method__Group__12159);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1096:1: rule__Method__Group__1__Impl : ( ( rule__Method__IsStaticAssignment_1 )? ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1100:1: ( ( ( rule__Method__IsStaticAssignment_1 )? ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1101:1: ( ( rule__Method__IsStaticAssignment_1 )? )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1101:1: ( ( rule__Method__IsStaticAssignment_1 )? )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1102:1: ( rule__Method__IsStaticAssignment_1 )?
            {
             before(grammarAccess.getMethodAccess().getIsStaticAssignment_1()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1103:1: ( rule__Method__IsStaticAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1103:2: rule__Method__IsStaticAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Method__IsStaticAssignment_1_in_rule__Method__Group__1__Impl2186);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1113:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1117:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1118:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__22217);
            rule__Method__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__3_in_rule__Method__Group__22220);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1125:1: rule__Method__Group__2__Impl : ( ( rule__Method__TypeAssignment_2 ) ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1129:1: ( ( ( rule__Method__TypeAssignment_2 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1130:1: ( ( rule__Method__TypeAssignment_2 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1130:1: ( ( rule__Method__TypeAssignment_2 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1131:1: ( rule__Method__TypeAssignment_2 )
            {
             before(grammarAccess.getMethodAccess().getTypeAssignment_2()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1132:1: ( rule__Method__TypeAssignment_2 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1132:2: rule__Method__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Method__TypeAssignment_2_in_rule__Method__Group__2__Impl2247);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1142:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1146:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1147:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__32277);
            rule__Method__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__4_in_rule__Method__Group__32280);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1154:1: rule__Method__Group__3__Impl : ( ( rule__Method__NameAssignment_3 ) ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1158:1: ( ( ( rule__Method__NameAssignment_3 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1159:1: ( ( rule__Method__NameAssignment_3 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1159:1: ( ( rule__Method__NameAssignment_3 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1160:1: ( rule__Method__NameAssignment_3 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_3()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1161:1: ( rule__Method__NameAssignment_3 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1161:2: rule__Method__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Method__NameAssignment_3_in_rule__Method__Group__3__Impl2307);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1171:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1175:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1176:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__42337);
            rule__Method__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__5_in_rule__Method__Group__42340);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1183:1: rule__Method__Group__4__Impl : ( ( rule__Method__ParametersAssignment_4 )* ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1187:1: ( ( ( rule__Method__ParametersAssignment_4 )* ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1188:1: ( ( rule__Method__ParametersAssignment_4 )* )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1188:1: ( ( rule__Method__ParametersAssignment_4 )* )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1189:1: ( rule__Method__ParametersAssignment_4 )*
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_4()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1190:1: ( rule__Method__ParametersAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    int LA9_2 = input.LA(2);

                    if ( (LA9_2==20) ) {
                        alt9=1;
                    }


                }
                else if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1190:2: rule__Method__ParametersAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Method__ParametersAssignment_4_in_rule__Method__Group__4__Impl2367);
            	    rule__Method__ParametersAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1200:1: rule__Method__Group__5 : rule__Method__Group__5__Impl ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1204:1: ( rule__Method__Group__5__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1205:2: rule__Method__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__52398);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1211:1: rule__Method__Group__5__Impl : ( ( ';' )? ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1215:1: ( ( ( ';' )? ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1216:1: ( ( ';' )? )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1216:1: ( ( ';' )? )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1217:1: ( ';' )?
            {
             before(grammarAccess.getMethodAccess().getSemicolonKeyword_5()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1218:1: ( ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1219:2: ';'
                    {
                    match(input,19,FOLLOW_19_in_rule__Method__Group__5__Impl2427); 

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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1242:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1246:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1247:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__02472);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__02475);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1254:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__SignaturePartAssignment_0 )? ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1258:1: ( ( ( rule__Parameter__SignaturePartAssignment_0 )? ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1259:1: ( ( rule__Parameter__SignaturePartAssignment_0 )? )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1259:1: ( ( rule__Parameter__SignaturePartAssignment_0 )? )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1260:1: ( rule__Parameter__SignaturePartAssignment_0 )?
            {
             before(grammarAccess.getParameterAccess().getSignaturePartAssignment_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1261:1: ( rule__Parameter__SignaturePartAssignment_0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1261:2: rule__Parameter__SignaturePartAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Parameter__SignaturePartAssignment_0_in_rule__Parameter__Group__0__Impl2502);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1271:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1275:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1276:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__12533);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__12536);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1283:1: rule__Parameter__Group__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1287:1: ( ( ':' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1288:1: ( ':' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1288:1: ( ':' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1289:1: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__Parameter__Group__1__Impl2564); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1302:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1306:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1307:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__22595);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__22598);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1314:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__TypeAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1318:1: ( ( ( rule__Parameter__TypeAssignment_2 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1319:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1319:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1320:1: ( rule__Parameter__TypeAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_2()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1321:1: ( rule__Parameter__TypeAssignment_2 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1321:2: rule__Parameter__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Parameter__TypeAssignment_2_in_rule__Parameter__Group__2__Impl2625);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1331:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1335:1: ( rule__Parameter__Group__3__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1336:2: rule__Parameter__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__32655);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1342:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__NameAssignment_3 ) ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1346:1: ( ( ( rule__Parameter__NameAssignment_3 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1347:1: ( ( rule__Parameter__NameAssignment_3 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1347:1: ( ( rule__Parameter__NameAssignment_3 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1348:1: ( rule__Parameter__NameAssignment_3 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_3()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1349:1: ( rule__Parameter__NameAssignment_3 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1349:2: rule__Parameter__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_3_in_rule__Parameter__Group__3__Impl2682);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1367:1: rule__Delegate__Group__0 : rule__Delegate__Group__0__Impl rule__Delegate__Group__1 ;
    public final void rule__Delegate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1371:1: ( rule__Delegate__Group__0__Impl rule__Delegate__Group__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1372:2: rule__Delegate__Group__0__Impl rule__Delegate__Group__1
            {
            pushFollow(FOLLOW_rule__Delegate__Group__0__Impl_in_rule__Delegate__Group__02720);
            rule__Delegate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delegate__Group__1_in_rule__Delegate__Group__02723);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1379:1: rule__Delegate__Group__0__Impl : ( 'delegate' ) ;
    public final void rule__Delegate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1383:1: ( ( 'delegate' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1384:1: ( 'delegate' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1384:1: ( 'delegate' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1385:1: 'delegate'
            {
             before(grammarAccess.getDelegateAccess().getDelegateKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Delegate__Group__0__Impl2751); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1398:1: rule__Delegate__Group__1 : rule__Delegate__Group__1__Impl rule__Delegate__Group__2 ;
    public final void rule__Delegate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1402:1: ( rule__Delegate__Group__1__Impl rule__Delegate__Group__2 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1403:2: rule__Delegate__Group__1__Impl rule__Delegate__Group__2
            {
            pushFollow(FOLLOW_rule__Delegate__Group__1__Impl_in_rule__Delegate__Group__12782);
            rule__Delegate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delegate__Group__2_in_rule__Delegate__Group__12785);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1410:1: rule__Delegate__Group__1__Impl : ( ( rule__Delegate__NameAssignment_1 ) ) ;
    public final void rule__Delegate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1414:1: ( ( ( rule__Delegate__NameAssignment_1 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1415:1: ( ( rule__Delegate__NameAssignment_1 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1415:1: ( ( rule__Delegate__NameAssignment_1 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1416:1: ( rule__Delegate__NameAssignment_1 )
            {
             before(grammarAccess.getDelegateAccess().getNameAssignment_1()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1417:1: ( rule__Delegate__NameAssignment_1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1417:2: rule__Delegate__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Delegate__NameAssignment_1_in_rule__Delegate__Group__1__Impl2812);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1427:1: rule__Delegate__Group__2 : rule__Delegate__Group__2__Impl rule__Delegate__Group__3 ;
    public final void rule__Delegate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1431:1: ( rule__Delegate__Group__2__Impl rule__Delegate__Group__3 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1432:2: rule__Delegate__Group__2__Impl rule__Delegate__Group__3
            {
            pushFollow(FOLLOW_rule__Delegate__Group__2__Impl_in_rule__Delegate__Group__22842);
            rule__Delegate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delegate__Group__3_in_rule__Delegate__Group__22845);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1439:1: rule__Delegate__Group__2__Impl : ( '{' ) ;
    public final void rule__Delegate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1443:1: ( ( '{' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1444:1: ( '{' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1444:1: ( '{' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1445:1: '{'
            {
             before(grammarAccess.getDelegateAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Delegate__Group__2__Impl2873); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1458:1: rule__Delegate__Group__3 : rule__Delegate__Group__3__Impl rule__Delegate__Group__4 ;
    public final void rule__Delegate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1462:1: ( rule__Delegate__Group__3__Impl rule__Delegate__Group__4 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1463:2: rule__Delegate__Group__3__Impl rule__Delegate__Group__4
            {
            pushFollow(FOLLOW_rule__Delegate__Group__3__Impl_in_rule__Delegate__Group__32904);
            rule__Delegate__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delegate__Group__4_in_rule__Delegate__Group__32907);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1470:1: rule__Delegate__Group__3__Impl : ( ( rule__Delegate__MethodsAssignment_3 )* ) ;
    public final void rule__Delegate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1474:1: ( ( ( rule__Delegate__MethodsAssignment_3 )* ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1475:1: ( ( rule__Delegate__MethodsAssignment_3 )* )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1475:1: ( ( rule__Delegate__MethodsAssignment_3 )* )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1476:1: ( rule__Delegate__MethodsAssignment_3 )*
            {
             before(grammarAccess.getDelegateAccess().getMethodsAssignment_3()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1477:1: ( rule__Delegate__MethodsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_DOC_COMMENT)||LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1477:2: rule__Delegate__MethodsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Delegate__MethodsAssignment_3_in_rule__Delegate__Group__3__Impl2934);
            	    rule__Delegate__MethodsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1487:1: rule__Delegate__Group__4 : rule__Delegate__Group__4__Impl ;
    public final void rule__Delegate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1491:1: ( rule__Delegate__Group__4__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1492:2: rule__Delegate__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Delegate__Group__4__Impl_in_rule__Delegate__Group__42965);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1498:1: rule__Delegate__Group__4__Impl : ( '}' ) ;
    public final void rule__Delegate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1502:1: ( ( '}' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1503:1: ( '}' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1503:1: ( '}' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1504:1: '}'
            {
             before(grammarAccess.getDelegateAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__Delegate__Group__4__Impl2993); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1528:1: rule__Primitive__Group__0 : rule__Primitive__Group__0__Impl rule__Primitive__Group__1 ;
    public final void rule__Primitive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1532:1: ( rule__Primitive__Group__0__Impl rule__Primitive__Group__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1533:2: rule__Primitive__Group__0__Impl rule__Primitive__Group__1
            {
            pushFollow(FOLLOW_rule__Primitive__Group__0__Impl_in_rule__Primitive__Group__03035);
            rule__Primitive__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primitive__Group__1_in_rule__Primitive__Group__03038);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1540:1: rule__Primitive__Group__0__Impl : ( 'primitive type' ) ;
    public final void rule__Primitive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1544:1: ( ( 'primitive type' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1545:1: ( 'primitive type' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1545:1: ( 'primitive type' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1546:1: 'primitive type'
            {
             before(grammarAccess.getPrimitiveAccess().getPrimitiveTypeKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Primitive__Group__0__Impl3066); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1559:1: rule__Primitive__Group__1 : rule__Primitive__Group__1__Impl ;
    public final void rule__Primitive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1563:1: ( rule__Primitive__Group__1__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1564:2: rule__Primitive__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Primitive__Group__1__Impl_in_rule__Primitive__Group__13097);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1570:1: rule__Primitive__Group__1__Impl : ( ( rule__Primitive__NameAssignment_1 ) ) ;
    public final void rule__Primitive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1574:1: ( ( ( rule__Primitive__NameAssignment_1 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1575:1: ( ( rule__Primitive__NameAssignment_1 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1575:1: ( ( rule__Primitive__NameAssignment_1 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1576:1: ( rule__Primitive__NameAssignment_1 )
            {
             before(grammarAccess.getPrimitiveAccess().getNameAssignment_1()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1577:1: ( rule__Primitive__NameAssignment_1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1577:2: rule__Primitive__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Primitive__NameAssignment_1_in_rule__Primitive__Group__1__Impl3124);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1591:1: rule__Any__Group__0 : rule__Any__Group__0__Impl rule__Any__Group__1 ;
    public final void rule__Any__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1595:1: ( rule__Any__Group__0__Impl rule__Any__Group__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1596:2: rule__Any__Group__0__Impl rule__Any__Group__1
            {
            pushFollow(FOLLOW_rule__Any__Group__0__Impl_in_rule__Any__Group__03158);
            rule__Any__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Any__Group__1_in_rule__Any__Group__03161);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1603:1: rule__Any__Group__0__Impl : ( 'any type' ) ;
    public final void rule__Any__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1607:1: ( ( 'any type' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1608:1: ( 'any type' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1608:1: ( 'any type' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1609:1: 'any type'
            {
             before(grammarAccess.getAnyAccess().getAnyTypeKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Any__Group__0__Impl3189); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1622:1: rule__Any__Group__1 : rule__Any__Group__1__Impl ;
    public final void rule__Any__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1626:1: ( rule__Any__Group__1__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1627:2: rule__Any__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Any__Group__1__Impl_in_rule__Any__Group__13220);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1633:1: rule__Any__Group__1__Impl : ( ( rule__Any__NameAssignment_1 ) ) ;
    public final void rule__Any__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1637:1: ( ( ( rule__Any__NameAssignment_1 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1638:1: ( ( rule__Any__NameAssignment_1 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1638:1: ( ( rule__Any__NameAssignment_1 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1639:1: ( rule__Any__NameAssignment_1 )
            {
             before(grammarAccess.getAnyAccess().getNameAssignment_1()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1640:1: ( rule__Any__NameAssignment_1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1640:2: rule__Any__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Any__NameAssignment_1_in_rule__Any__Group__1__Impl3247);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1654:1: rule__TypeRef__Group__0 : rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 ;
    public final void rule__TypeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1658:1: ( rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1659:2: rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__03281);
            rule__TypeRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__03284);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1666:1: rule__TypeRef__Group__0__Impl : ( ( rule__TypeRef__ReferencedAssignment_0 ) ) ;
    public final void rule__TypeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1670:1: ( ( ( rule__TypeRef__ReferencedAssignment_0 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1671:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1671:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1672:1: ( rule__TypeRef__ReferencedAssignment_0 )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedAssignment_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1673:1: ( rule__TypeRef__ReferencedAssignment_0 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1673:2: rule__TypeRef__ReferencedAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl3311);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1683:1: rule__TypeRef__Group__1 : rule__TypeRef__Group__1__Impl ;
    public final void rule__TypeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1687:1: ( rule__TypeRef__Group__1__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1688:2: rule__TypeRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__13341);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1694:1: rule__TypeRef__Group__1__Impl : ( ( rule__TypeRef__IsMultiAssignment_1 )? ) ;
    public final void rule__TypeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1698:1: ( ( ( rule__TypeRef__IsMultiAssignment_1 )? ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1699:1: ( ( rule__TypeRef__IsMultiAssignment_1 )? )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1699:1: ( ( rule__TypeRef__IsMultiAssignment_1 )? )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1700:1: ( rule__TypeRef__IsMultiAssignment_1 )?
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiAssignment_1()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1701:1: ( rule__TypeRef__IsMultiAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1701:2: rule__TypeRef__IsMultiAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TypeRef__IsMultiAssignment_1_in_rule__TypeRef__Group__1__Impl3368);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1715:1: rule__EFloatObject__Group__0 : rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1 ;
    public final void rule__EFloatObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1719:1: ( rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1720:2: rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__0__Impl_in_rule__EFloatObject__Group__03403);
            rule__EFloatObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__1_in_rule__EFloatObject__Group__03406);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1727:1: rule__EFloatObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloatObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1731:1: ( ( ( '-' )? ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1732:1: ( ( '-' )? )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1732:1: ( ( '-' )? )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1733:1: ( '-' )?
            {
             before(grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1734:1: ( '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1735:2: '-'
                    {
                    match(input,24,FOLLOW_24_in_rule__EFloatObject__Group__0__Impl3435); 

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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1746:1: rule__EFloatObject__Group__1 : rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2 ;
    public final void rule__EFloatObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1750:1: ( rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1751:2: rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__1__Impl_in_rule__EFloatObject__Group__13468);
            rule__EFloatObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__2_in_rule__EFloatObject__Group__13471);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1758:1: rule__EFloatObject__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloatObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1762:1: ( ( ( RULE_INT )? ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1763:1: ( ( RULE_INT )? )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1763:1: ( ( RULE_INT )? )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1764:1: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1765:1: ( RULE_INT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1765:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EFloatObject__Group__1__Impl3499); 

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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1775:1: rule__EFloatObject__Group__2 : rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3 ;
    public final void rule__EFloatObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1779:1: ( rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1780:2: rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__2__Impl_in_rule__EFloatObject__Group__23530);
            rule__EFloatObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__3_in_rule__EFloatObject__Group__23533);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1787:1: rule__EFloatObject__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloatObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1791:1: ( ( '.' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1792:1: ( '.' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1792:1: ( '.' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1793:1: '.'
            {
             before(grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__EFloatObject__Group__2__Impl3561); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1806:1: rule__EFloatObject__Group__3 : rule__EFloatObject__Group__3__Impl ;
    public final void rule__EFloatObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1810:1: ( rule__EFloatObject__Group__3__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1811:2: rule__EFloatObject__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__3__Impl_in_rule__EFloatObject__Group__33592);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1817:1: rule__EFloatObject__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloatObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1821:1: ( ( RULE_INT ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1822:1: ( RULE_INT )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1822:1: ( RULE_INT )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1823:1: RULE_INT
            {
             before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EFloatObject__Group__3__Impl3619); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1842:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1846:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1847:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03656);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03659);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1854:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1858:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1859:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1859:1: ( RULE_ID )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1860:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3686); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1871:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1875:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1876:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13715);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1882:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1886:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1887:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1887:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1888:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1889:1: ( rule__QualifiedName__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==25) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1889:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3742);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1903:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1907:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1908:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03777);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03780);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1915:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1919:1: ( ( '.' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1920:1: ( '.' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1920:1: ( '.' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1921:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,25,FOLLOW_25_in_rule__QualifiedName__Group_1__0__Impl3808); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1934:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1938:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1939:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13839);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1945:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1949:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1950:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1950:1: ( RULE_ID )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1951:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3866); 
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


    // $ANTLR start "rule__InterfaceModel__ModuleAssignment_1"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1967:1: rule__InterfaceModel__ModuleAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__InterfaceModel__ModuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1971:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1972:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1972:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1973:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getInterfaceModelAccess().getModuleModuleCrossReference_1_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1974:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1975:1: ruleQualifiedName
            {
             before(grammarAccess.getInterfaceModelAccess().getModuleModuleQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__InterfaceModel__ModuleAssignment_13908);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getInterfaceModelAccess().getModuleModuleQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getInterfaceModelAccess().getModuleModuleCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceModel__ModuleAssignment_1"


    // $ANTLR start "rule__InterfaceModel__VersionAssignment_3"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1986:1: rule__InterfaceModel__VersionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__InterfaceModel__VersionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1990:1: ( ( RULE_STRING ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1991:1: ( RULE_STRING )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1991:1: ( RULE_STRING )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1992:1: RULE_STRING
            {
             before(grammarAccess.getInterfaceModelAccess().getVersionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__InterfaceModel__VersionAssignment_33943); 
             after(grammarAccess.getInterfaceModelAccess().getVersionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceModel__VersionAssignment_3"


    // $ANTLR start "rule__InterfaceModel__InterfacesAssignment_4"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2001:1: rule__InterfaceModel__InterfacesAssignment_4 : ( ruleInterface ) ;
    public final void rule__InterfaceModel__InterfacesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2005:1: ( ( ruleInterface ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2006:1: ( ruleInterface )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2006:1: ( ruleInterface )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2007:1: ruleInterface
            {
             before(grammarAccess.getInterfaceModelAccess().getInterfacesInterfaceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleInterface_in_rule__InterfaceModel__InterfacesAssignment_43974);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getInterfaceModelAccess().getInterfacesInterfaceParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceModel__InterfacesAssignment_4"


    // $ANTLR start "rule__Interface__CommentAssignment_0"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2016:1: rule__Interface__CommentAssignment_0 : ( RULE_DOC_COMMENT ) ;
    public final void rule__Interface__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2020:1: ( ( RULE_DOC_COMMENT ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2021:1: ( RULE_DOC_COMMENT )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2021:1: ( RULE_DOC_COMMENT )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2022:1: RULE_DOC_COMMENT
            {
             before(grammarAccess.getInterfaceAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_rule__Interface__CommentAssignment_04005); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2031:1: rule__Interface__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Interface__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2035:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2036:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2036:1: ( RULE_ID )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2037:1: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interface__NameAssignment_24036); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2046:1: rule__Interface__RequiredInterfacesAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Interface__RequiredInterfacesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2050:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2051:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2051:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2052:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getInterfaceAccess().getRequiredInterfacesInterfaceCrossReference_3_1_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2053:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2054:1: ruleQualifiedName
            {
             before(grammarAccess.getInterfaceAccess().getRequiredInterfacesInterfaceQualifiedNameParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Interface__RequiredInterfacesAssignment_3_14071);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2065:1: rule__Interface__RequiredInterfacesAssignment_3_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Interface__RequiredInterfacesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2069:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2070:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2070:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2071:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getInterfaceAccess().getRequiredInterfacesInterfaceCrossReference_3_2_1_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2072:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2073:1: ruleQualifiedName
            {
             before(grammarAccess.getInterfaceAccess().getRequiredInterfacesInterfaceQualifiedNameParserRuleCall_3_2_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Interface__RequiredInterfacesAssignment_3_2_14110);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2084:1: rule__Interface__MethodsAssignment_5 : ( ruleMethod ) ;
    public final void rule__Interface__MethodsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2088:1: ( ( ruleMethod ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2089:1: ( ruleMethod )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2089:1: ( ruleMethod )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2090:1: ruleMethod
            {
             before(grammarAccess.getInterfaceAccess().getMethodsMethodParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleMethod_in_rule__Interface__MethodsAssignment_54145);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2099:1: rule__Interface__DelegatesAssignment_6 : ( ruleDelegate ) ;
    public final void rule__Interface__DelegatesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2103:1: ( ( ruleDelegate ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2104:1: ( ruleDelegate )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2104:1: ( ruleDelegate )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2105:1: ruleDelegate
            {
             before(grammarAccess.getInterfaceAccess().getDelegatesDelegateParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleDelegate_in_rule__Interface__DelegatesAssignment_64176);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2114:1: rule__Method__CommentAssignment_0 : ( RULE_DOC_COMMENT ) ;
    public final void rule__Method__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2118:1: ( ( RULE_DOC_COMMENT ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2119:1: ( RULE_DOC_COMMENT )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2119:1: ( RULE_DOC_COMMENT )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2120:1: RULE_DOC_COMMENT
            {
             before(grammarAccess.getMethodAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_rule__Method__CommentAssignment_04207); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2129:1: rule__Method__IsStaticAssignment_1 : ( ( 'static' ) ) ;
    public final void rule__Method__IsStaticAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2133:1: ( ( ( 'static' ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2134:1: ( ( 'static' ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2134:1: ( ( 'static' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2135:1: ( 'static' )
            {
             before(grammarAccess.getMethodAccess().getIsStaticStaticKeyword_1_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2136:1: ( 'static' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2137:1: 'static'
            {
             before(grammarAccess.getMethodAccess().getIsStaticStaticKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__Method__IsStaticAssignment_14243); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2152:1: rule__Method__TypeAssignment_2 : ( ruleTypeRef ) ;
    public final void rule__Method__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2156:1: ( ( ruleTypeRef ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2157:1: ( ruleTypeRef )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2157:1: ( ruleTypeRef )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2158:1: ruleTypeRef
            {
             before(grammarAccess.getMethodAccess().getTypeTypeRefParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Method__TypeAssignment_24282);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2167:1: rule__Method__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2171:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2172:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2172:1: ( RULE_ID )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2173:1: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Method__NameAssignment_34313); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2182:1: rule__Method__ParametersAssignment_4 : ( ruleParameter ) ;
    public final void rule__Method__ParametersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2186:1: ( ( ruleParameter ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2187:1: ( ruleParameter )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2187:1: ( ruleParameter )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2188:1: ruleParameter
            {
             before(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Method__ParametersAssignment_44344);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2197:1: rule__Parameter__SignaturePartAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__SignaturePartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2201:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2202:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2202:1: ( RULE_ID )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2203:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getSignaturePartIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__SignaturePartAssignment_04375); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2212:1: rule__Parameter__TypeAssignment_2 : ( ruleTypeRef ) ;
    public final void rule__Parameter__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2216:1: ( ( ruleTypeRef ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2217:1: ( ruleTypeRef )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2217:1: ( ruleTypeRef )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2218:1: ruleTypeRef
            {
             before(grammarAccess.getParameterAccess().getTypeTypeRefParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Parameter__TypeAssignment_24406);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2227:1: rule__Parameter__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2231:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2232:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2232:1: ( RULE_ID )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2233:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_34437); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2242:1: rule__Delegate__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Delegate__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2246:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2247:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2247:1: ( RULE_ID )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2248:1: RULE_ID
            {
             before(grammarAccess.getDelegateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Delegate__NameAssignment_14468); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2257:1: rule__Delegate__MethodsAssignment_3 : ( ruleMethod ) ;
    public final void rule__Delegate__MethodsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2261:1: ( ( ruleMethod ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2262:1: ( ruleMethod )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2262:1: ( ruleMethod )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2263:1: ruleMethod
            {
             before(grammarAccess.getDelegateAccess().getMethodsMethodParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMethod_in_rule__Delegate__MethodsAssignment_34499);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2274:1: rule__Primitive__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Primitive__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2278:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2279:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2279:1: ( RULE_ID )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2280:1: RULE_ID
            {
             before(grammarAccess.getPrimitiveAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Primitive__NameAssignment_14532); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2289:1: rule__Any__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Any__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2293:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2294:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2294:1: ( RULE_ID )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2295:1: RULE_ID
            {
             before(grammarAccess.getAnyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Any__NameAssignment_14563); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2304:1: rule__TypeRef__ReferencedAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TypeRef__ReferencedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2308:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2309:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2309:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2310:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2311:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2312:1: ruleQualifiedName
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_04598);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2323:1: rule__TypeRef__IsMultiAssignment_1 : ( ( '[]' ) ) ;
    public final void rule__TypeRef__IsMultiAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2327:1: ( ( ( '[]' ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2328:1: ( ( '[]' ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2328:1: ( ( '[]' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2329:1: ( '[]' )
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2330:1: ( '[]' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2331:1: '[]'
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__TypeRef__IsMultiAssignment_14638); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2346:1: rule__StringValue__ValueAssignment : ( ruleEStringObject ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2350:1: ( ( ruleEStringObject ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2351:1: ( ruleEStringObject )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2351:1: ( ruleEStringObject )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2352:1: ruleEStringObject
            {
             before(grammarAccess.getStringValueAccess().getValueEStringObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEStringObject_in_rule__StringValue__ValueAssignment4677);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2361:1: rule__IntegerValue__ValueAssignment : ( ruleEIntegerObject ) ;
    public final void rule__IntegerValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2365:1: ( ( ruleEIntegerObject ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2366:1: ( ruleEIntegerObject )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2366:1: ( ruleEIntegerObject )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2367:1: ruleEIntegerObject
            {
             before(grammarAccess.getIntegerValueAccess().getValueEIntegerObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_rule__IntegerValue__ValueAssignment4708);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2376:1: rule__FloatValue__ValueAssignment : ( ruleEFloatObject ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2380:1: ( ( ruleEFloatObject ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2381:1: ( ruleEFloatObject )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2381:1: ( ruleEFloatObject )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2382:1: ruleEFloatObject
            {
             before(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_rule__FloatValue__ValueAssignment4739);
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
    public static final BitSet FOLLOW_rule__InterfaceModel__Group__0__Impl_in_rule__InterfaceModel__Group__0971 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__InterfaceModel__Group__1_in_rule__InterfaceModel__Group__0974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__InterfaceModel__Group__0__Impl1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceModel__Group__1__Impl_in_rule__InterfaceModel__Group__11033 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__InterfaceModel__Group__2_in_rule__InterfaceModel__Group__11036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceModel__ModuleAssignment_1_in_rule__InterfaceModel__Group__1__Impl1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceModel__Group__2__Impl_in_rule__InterfaceModel__Group__21093 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InterfaceModel__Group__3_in_rule__InterfaceModel__Group__21096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__InterfaceModel__Group__2__Impl1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceModel__Group__3__Impl_in_rule__InterfaceModel__Group__31155 = new BitSet(new long[]{0x0000000000004080L});
    public static final BitSet FOLLOW_rule__InterfaceModel__Group__4_in_rule__InterfaceModel__Group__31158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceModel__VersionAssignment_3_in_rule__InterfaceModel__Group__3__Impl1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceModel__Group__4__Impl_in_rule__InterfaceModel__Group__41215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceModel__InterfacesAssignment_4_in_rule__InterfaceModel__Group__4__Impl1242 = new BitSet(new long[]{0x0000000000004082L});
    public static final BitSet FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__01283 = new BitSet(new long[]{0x0000000000004080L});
    public static final BitSet FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__01286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__CommentAssignment_0_in_rule__Interface__Group__0__Impl1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__11344 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__11347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Interface__Group__1__Impl1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__21406 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__Interface__Group__3_in_rule__Interface__Group__21409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__NameAssignment_2_in_rule__Interface__Group__2__Impl1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__3__Impl_in_rule__Interface__Group__31466 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__Interface__Group__4_in_rule__Interface__Group__31469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_3__0_in_rule__Interface__Group__3__Impl1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__4__Impl_in_rule__Interface__Group__41527 = new BitSet(new long[]{0x00000000042100C0L});
    public static final BitSet FOLLOW_rule__Interface__Group__5_in_rule__Interface__Group__41530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Interface__Group__4__Impl1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__5__Impl_in_rule__Interface__Group__51589 = new BitSet(new long[]{0x00000000042100C0L});
    public static final BitSet FOLLOW_rule__Interface__Group__6_in_rule__Interface__Group__51592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__MethodsAssignment_5_in_rule__Interface__Group__5__Impl1619 = new BitSet(new long[]{0x00000000040000C2L});
    public static final BitSet FOLLOW_rule__Interface__Group__6__Impl_in_rule__Interface__Group__61650 = new BitSet(new long[]{0x00000000042100C0L});
    public static final BitSet FOLLOW_rule__Interface__Group__7_in_rule__Interface__Group__61653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__DelegatesAssignment_6_in_rule__Interface__Group__6__Impl1680 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Interface__Group__7__Impl_in_rule__Interface__Group__71711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Interface__Group__7__Impl1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_3__0__Impl_in_rule__Interface__Group_3__01786 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Interface__Group_3__1_in_rule__Interface__Group_3__01789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Interface__Group_3__0__Impl1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_3__1__Impl_in_rule__Interface__Group_3__11848 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Interface__Group_3__2_in_rule__Interface__Group_3__11851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__RequiredInterfacesAssignment_3_1_in_rule__Interface__Group_3__1__Impl1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_3__2__Impl_in_rule__Interface__Group_3__21908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_3_2__0_in_rule__Interface__Group_3__2__Impl1935 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Interface__Group_3_2__0__Impl_in_rule__Interface__Group_3_2__01972 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Interface__Group_3_2__1_in_rule__Interface__Group_3_2__01975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Interface__Group_3_2__0__Impl2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_3_2__1__Impl_in_rule__Interface__Group_3_2__12034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__RequiredInterfacesAssignment_3_2_1_in_rule__Interface__Group_3_2__1__Impl2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__02095 = new BitSet(new long[]{0x00000000040000C0L});
    public static final BitSet FOLLOW_rule__Method__Group__1_in_rule__Method__Group__02098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__CommentAssignment_0_in_rule__Method__Group__0__Impl2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__12156 = new BitSet(new long[]{0x00000000040000C0L});
    public static final BitSet FOLLOW_rule__Method__Group__2_in_rule__Method__Group__12159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__IsStaticAssignment_1_in_rule__Method__Group__1__Impl2186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__22217 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Method__Group__3_in_rule__Method__Group__22220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__TypeAssignment_2_in_rule__Method__Group__2__Impl2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__32277 = new BitSet(new long[]{0x0000000000180040L});
    public static final BitSet FOLLOW_rule__Method__Group__4_in_rule__Method__Group__32280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__NameAssignment_3_in_rule__Method__Group__3__Impl2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__42337 = new BitSet(new long[]{0x0000000000180040L});
    public static final BitSet FOLLOW_rule__Method__Group__5_in_rule__Method__Group__42340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ParametersAssignment_4_in_rule__Method__Group__4__Impl2367 = new BitSet(new long[]{0x0000000000100042L});
    public static final BitSet FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__52398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Method__Group__5__Impl2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__02472 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__02475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__SignaturePartAssignment_0_in_rule__Parameter__Group__0__Impl2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__12533 = new BitSet(new long[]{0x00000000040000C0L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__12536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Parameter__Group__1__Impl2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__22595 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__22598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_2_in_rule__Parameter__Group__2__Impl2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__32655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_3_in_rule__Parameter__Group__3__Impl2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegate__Group__0__Impl_in_rule__Delegate__Group__02720 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Delegate__Group__1_in_rule__Delegate__Group__02723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Delegate__Group__0__Impl2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegate__Group__1__Impl_in_rule__Delegate__Group__12782 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Delegate__Group__2_in_rule__Delegate__Group__12785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegate__NameAssignment_1_in_rule__Delegate__Group__1__Impl2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegate__Group__2__Impl_in_rule__Delegate__Group__22842 = new BitSet(new long[]{0x00000000040100C0L});
    public static final BitSet FOLLOW_rule__Delegate__Group__3_in_rule__Delegate__Group__22845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Delegate__Group__2__Impl2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegate__Group__3__Impl_in_rule__Delegate__Group__32904 = new BitSet(new long[]{0x00000000040100C0L});
    public static final BitSet FOLLOW_rule__Delegate__Group__4_in_rule__Delegate__Group__32907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegate__MethodsAssignment_3_in_rule__Delegate__Group__3__Impl2934 = new BitSet(new long[]{0x00000000040000C2L});
    public static final BitSet FOLLOW_rule__Delegate__Group__4__Impl_in_rule__Delegate__Group__42965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Delegate__Group__4__Impl2993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__0__Impl_in_rule__Primitive__Group__03035 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Primitive__Group__1_in_rule__Primitive__Group__03038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Primitive__Group__0__Impl3066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__1__Impl_in_rule__Primitive__Group__13097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__NameAssignment_1_in_rule__Primitive__Group__1__Impl3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__Group__0__Impl_in_rule__Any__Group__03158 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Any__Group__1_in_rule__Any__Group__03161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Any__Group__0__Impl3189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__Group__1__Impl_in_rule__Any__Group__13220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__NameAssignment_1_in_rule__Any__Group__1__Impl3247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__03281 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__03284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__13341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__IsMultiAssignment_1_in_rule__TypeRef__Group__1__Impl3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__0__Impl_in_rule__EFloatObject__Group__03403 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__1_in_rule__EFloatObject__Group__03406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__EFloatObject__Group__0__Impl3435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__1__Impl_in_rule__EFloatObject__Group__13468 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__2_in_rule__EFloatObject__Group__13471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group__1__Impl3499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__2__Impl_in_rule__EFloatObject__Group__23530 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__3_in_rule__EFloatObject__Group__23533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__EFloatObject__Group__2__Impl3561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__3__Impl_in_rule__EFloatObject__Group__33592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group__3__Impl3619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03656 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3742 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03777 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__QualifiedName__Group_1__0__Impl3808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__InterfaceModel__ModuleAssignment_13908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__InterfaceModel__VersionAssignment_33943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_rule__InterfaceModel__InterfacesAssignment_43974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_rule__Interface__CommentAssignment_04005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interface__NameAssignment_24036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Interface__RequiredInterfacesAssignment_3_14071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Interface__RequiredInterfacesAssignment_3_2_14110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__Interface__MethodsAssignment_54145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelegate_in_rule__Interface__DelegatesAssignment_64176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_rule__Method__CommentAssignment_04207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Method__IsStaticAssignment_14243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Method__TypeAssignment_24282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Method__NameAssignment_34313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Method__ParametersAssignment_44344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__SignaturePartAssignment_04375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Parameter__TypeAssignment_24406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_34437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Delegate__NameAssignment_14468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__Delegate__MethodsAssignment_34499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Primitive__NameAssignment_14532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Any__NameAssignment_14563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_04598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TypeRef__IsMultiAssignment_14638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_rule__StringValue__ValueAssignment4677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_rule__IntegerValue__ValueAssignment4708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_rule__FloatValue__ValueAssignment4739 = new BitSet(new long[]{0x0000000000000002L});

}