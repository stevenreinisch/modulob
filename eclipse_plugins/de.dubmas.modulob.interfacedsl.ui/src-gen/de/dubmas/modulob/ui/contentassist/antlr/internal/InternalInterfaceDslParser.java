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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'interfaces for module'", "'version'", "'interface'", "'{'", "'}'", "'requires'", "','", "';'", "':'", "'primitive type'", "'any type'", "'-'", "'.'", "'static'", "'[]'"
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


    // $ANTLR start "entryRulePrimitive"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:174:1: entryRulePrimitive : rulePrimitive EOF ;
    public final void entryRulePrimitive() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:175:1: ( rulePrimitive EOF )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:176:1: rulePrimitive EOF
            {
             before(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive303);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getPrimitiveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive310); 

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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:183:1: rulePrimitive : ( ( rule__Primitive__Group__0 ) ) ;
    public final void rulePrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:187:2: ( ( ( rule__Primitive__Group__0 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:188:1: ( ( rule__Primitive__Group__0 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:188:1: ( ( rule__Primitive__Group__0 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:189:1: ( rule__Primitive__Group__0 )
            {
             before(grammarAccess.getPrimitiveAccess().getGroup()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:190:1: ( rule__Primitive__Group__0 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:190:2: rule__Primitive__Group__0
            {
            pushFollow(FOLLOW_rule__Primitive__Group__0_in_rulePrimitive336);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:202:1: entryRuleAny : ruleAny EOF ;
    public final void entryRuleAny() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:203:1: ( ruleAny EOF )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:204:1: ruleAny EOF
            {
             before(grammarAccess.getAnyRule()); 
            pushFollow(FOLLOW_ruleAny_in_entryRuleAny363);
            ruleAny();

            state._fsp--;

             after(grammarAccess.getAnyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAny370); 

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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:211:1: ruleAny : ( ( rule__Any__Group__0 ) ) ;
    public final void ruleAny() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:215:2: ( ( ( rule__Any__Group__0 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:216:1: ( ( rule__Any__Group__0 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:216:1: ( ( rule__Any__Group__0 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:217:1: ( rule__Any__Group__0 )
            {
             before(grammarAccess.getAnyAccess().getGroup()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:218:1: ( rule__Any__Group__0 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:218:2: rule__Any__Group__0
            {
            pushFollow(FOLLOW_rule__Any__Group__0_in_ruleAny396);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:232:1: entryRuleTypeRef : ruleTypeRef EOF ;
    public final void entryRuleTypeRef() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:233:1: ( ruleTypeRef EOF )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:234:1: ruleTypeRef EOF
            {
             before(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef425);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getTypeRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef432); 

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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:241:1: ruleTypeRef : ( ( rule__TypeRef__Group__0 ) ) ;
    public final void ruleTypeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:245:2: ( ( ( rule__TypeRef__Group__0 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:246:1: ( ( rule__TypeRef__Group__0 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:246:1: ( ( rule__TypeRef__Group__0 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:247:1: ( rule__TypeRef__Group__0 )
            {
             before(grammarAccess.getTypeRefAccess().getGroup()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:248:1: ( rule__TypeRef__Group__0 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:248:2: rule__TypeRef__Group__0
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef458);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:260:1: entryRuleValueObject : ruleValueObject EOF ;
    public final void entryRuleValueObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:261:1: ( ruleValueObject EOF )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:262:1: ruleValueObject EOF
            {
             before(grammarAccess.getValueObjectRule()); 
            pushFollow(FOLLOW_ruleValueObject_in_entryRuleValueObject485);
            ruleValueObject();

            state._fsp--;

             after(grammarAccess.getValueObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueObject492); 

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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:269:1: ruleValueObject : ( ( rule__ValueObject__Alternatives ) ) ;
    public final void ruleValueObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:273:2: ( ( ( rule__ValueObject__Alternatives ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:274:1: ( ( rule__ValueObject__Alternatives ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:274:1: ( ( rule__ValueObject__Alternatives ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:275:1: ( rule__ValueObject__Alternatives )
            {
             before(grammarAccess.getValueObjectAccess().getAlternatives()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:276:1: ( rule__ValueObject__Alternatives )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:276:2: rule__ValueObject__Alternatives
            {
            pushFollow(FOLLOW_rule__ValueObject__Alternatives_in_ruleValueObject518);
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


    // $ANTLR start "rule__ValueObject__Alternatives"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:484:1: rule__ValueObject__Alternatives : ( ( ruleStringValue ) | ( ruleIntegerValue ) | ( ruleFloatValue ) );
    public final void rule__ValueObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:488:1: ( ( ruleStringValue ) | ( ruleIntegerValue ) | ( ruleFloatValue ) )
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

                if ( (LA1_2==EOF) ) {
                    alt1=2;
                }
                else if ( (LA1_2==23) ) {
                    alt1=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case 22:
            case 23:
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
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:489:1: ( ruleStringValue )
                    {
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:489:1: ( ruleStringValue )
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:490:1: ruleStringValue
                    {
                     before(grammarAccess.getValueObjectAccess().getStringValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringValue_in_rule__ValueObject__Alternatives972);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getValueObjectAccess().getStringValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:495:6: ( ruleIntegerValue )
                    {
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:495:6: ( ruleIntegerValue )
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:496:1: ruleIntegerValue
                    {
                     before(grammarAccess.getValueObjectAccess().getIntegerValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntegerValue_in_rule__ValueObject__Alternatives989);
                    ruleIntegerValue();

                    state._fsp--;

                     after(grammarAccess.getValueObjectAccess().getIntegerValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:501:6: ( ruleFloatValue )
                    {
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:501:6: ( ruleFloatValue )
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:502:1: ruleFloatValue
                    {
                     before(grammarAccess.getValueObjectAccess().getFloatValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleFloatValue_in_rule__ValueObject__Alternatives1006);
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


    // $ANTLR start "rule__InterfaceModel__Group__0"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:514:1: rule__InterfaceModel__Group__0 : rule__InterfaceModel__Group__0__Impl rule__InterfaceModel__Group__1 ;
    public final void rule__InterfaceModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:518:1: ( rule__InterfaceModel__Group__0__Impl rule__InterfaceModel__Group__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:519:2: rule__InterfaceModel__Group__0__Impl rule__InterfaceModel__Group__1
            {
            pushFollow(FOLLOW_rule__InterfaceModel__Group__0__Impl_in_rule__InterfaceModel__Group__01036);
            rule__InterfaceModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfaceModel__Group__1_in_rule__InterfaceModel__Group__01039);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:526:1: rule__InterfaceModel__Group__0__Impl : ( 'interfaces for module' ) ;
    public final void rule__InterfaceModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:530:1: ( ( 'interfaces for module' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:531:1: ( 'interfaces for module' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:531:1: ( 'interfaces for module' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:532:1: 'interfaces for module'
            {
             before(grammarAccess.getInterfaceModelAccess().getInterfacesForModuleKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__InterfaceModel__Group__0__Impl1067); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:545:1: rule__InterfaceModel__Group__1 : rule__InterfaceModel__Group__1__Impl rule__InterfaceModel__Group__2 ;
    public final void rule__InterfaceModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:549:1: ( rule__InterfaceModel__Group__1__Impl rule__InterfaceModel__Group__2 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:550:2: rule__InterfaceModel__Group__1__Impl rule__InterfaceModel__Group__2
            {
            pushFollow(FOLLOW_rule__InterfaceModel__Group__1__Impl_in_rule__InterfaceModel__Group__11098);
            rule__InterfaceModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfaceModel__Group__2_in_rule__InterfaceModel__Group__11101);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:557:1: rule__InterfaceModel__Group__1__Impl : ( ( rule__InterfaceModel__ModuleAssignment_1 ) ) ;
    public final void rule__InterfaceModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:561:1: ( ( ( rule__InterfaceModel__ModuleAssignment_1 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:562:1: ( ( rule__InterfaceModel__ModuleAssignment_1 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:562:1: ( ( rule__InterfaceModel__ModuleAssignment_1 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:563:1: ( rule__InterfaceModel__ModuleAssignment_1 )
            {
             before(grammarAccess.getInterfaceModelAccess().getModuleAssignment_1()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:564:1: ( rule__InterfaceModel__ModuleAssignment_1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:564:2: rule__InterfaceModel__ModuleAssignment_1
            {
            pushFollow(FOLLOW_rule__InterfaceModel__ModuleAssignment_1_in_rule__InterfaceModel__Group__1__Impl1128);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:574:1: rule__InterfaceModel__Group__2 : rule__InterfaceModel__Group__2__Impl rule__InterfaceModel__Group__3 ;
    public final void rule__InterfaceModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:578:1: ( rule__InterfaceModel__Group__2__Impl rule__InterfaceModel__Group__3 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:579:2: rule__InterfaceModel__Group__2__Impl rule__InterfaceModel__Group__3
            {
            pushFollow(FOLLOW_rule__InterfaceModel__Group__2__Impl_in_rule__InterfaceModel__Group__21158);
            rule__InterfaceModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfaceModel__Group__3_in_rule__InterfaceModel__Group__21161);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:586:1: rule__InterfaceModel__Group__2__Impl : ( 'version' ) ;
    public final void rule__InterfaceModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:590:1: ( ( 'version' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:591:1: ( 'version' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:591:1: ( 'version' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:592:1: 'version'
            {
             before(grammarAccess.getInterfaceModelAccess().getVersionKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__InterfaceModel__Group__2__Impl1189); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:605:1: rule__InterfaceModel__Group__3 : rule__InterfaceModel__Group__3__Impl rule__InterfaceModel__Group__4 ;
    public final void rule__InterfaceModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:609:1: ( rule__InterfaceModel__Group__3__Impl rule__InterfaceModel__Group__4 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:610:2: rule__InterfaceModel__Group__3__Impl rule__InterfaceModel__Group__4
            {
            pushFollow(FOLLOW_rule__InterfaceModel__Group__3__Impl_in_rule__InterfaceModel__Group__31220);
            rule__InterfaceModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfaceModel__Group__4_in_rule__InterfaceModel__Group__31223);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:617:1: rule__InterfaceModel__Group__3__Impl : ( ( rule__InterfaceModel__VersionAssignment_3 ) ) ;
    public final void rule__InterfaceModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:621:1: ( ( ( rule__InterfaceModel__VersionAssignment_3 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:622:1: ( ( rule__InterfaceModel__VersionAssignment_3 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:622:1: ( ( rule__InterfaceModel__VersionAssignment_3 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:623:1: ( rule__InterfaceModel__VersionAssignment_3 )
            {
             before(grammarAccess.getInterfaceModelAccess().getVersionAssignment_3()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:624:1: ( rule__InterfaceModel__VersionAssignment_3 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:624:2: rule__InterfaceModel__VersionAssignment_3
            {
            pushFollow(FOLLOW_rule__InterfaceModel__VersionAssignment_3_in_rule__InterfaceModel__Group__3__Impl1250);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:634:1: rule__InterfaceModel__Group__4 : rule__InterfaceModel__Group__4__Impl ;
    public final void rule__InterfaceModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:638:1: ( rule__InterfaceModel__Group__4__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:639:2: rule__InterfaceModel__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__InterfaceModel__Group__4__Impl_in_rule__InterfaceModel__Group__41280);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:645:1: rule__InterfaceModel__Group__4__Impl : ( ( rule__InterfaceModel__InterfacesAssignment_4 )* ) ;
    public final void rule__InterfaceModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:649:1: ( ( ( rule__InterfaceModel__InterfacesAssignment_4 )* ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:650:1: ( ( rule__InterfaceModel__InterfacesAssignment_4 )* )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:650:1: ( ( rule__InterfaceModel__InterfacesAssignment_4 )* )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:651:1: ( rule__InterfaceModel__InterfacesAssignment_4 )*
            {
             before(grammarAccess.getInterfaceModelAccess().getInterfacesAssignment_4()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:652:1: ( rule__InterfaceModel__InterfacesAssignment_4 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:652:2: rule__InterfaceModel__InterfacesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__InterfaceModel__InterfacesAssignment_4_in_rule__InterfaceModel__Group__4__Impl1307);
            	    rule__InterfaceModel__InterfacesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:672:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:676:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:677:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__01348);
            rule__Interface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__01351);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:684:1: rule__Interface__Group__0__Impl : ( 'interface' ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:688:1: ( ( 'interface' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:689:1: ( 'interface' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:689:1: ( 'interface' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:690:1: 'interface'
            {
             before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Interface__Group__0__Impl1379); 
             after(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); 

            }


            }

        }
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:703:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:707:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:708:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__11410);
            rule__Interface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__11413);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:715:1: rule__Interface__Group__1__Impl : ( ( rule__Interface__NameAssignment_1 ) ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:719:1: ( ( ( rule__Interface__NameAssignment_1 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:720:1: ( ( rule__Interface__NameAssignment_1 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:720:1: ( ( rule__Interface__NameAssignment_1 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:721:1: ( rule__Interface__NameAssignment_1 )
            {
             before(grammarAccess.getInterfaceAccess().getNameAssignment_1()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:722:1: ( rule__Interface__NameAssignment_1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:722:2: rule__Interface__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Interface__NameAssignment_1_in_rule__Interface__Group__1__Impl1440);
            rule__Interface__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:732:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl rule__Interface__Group__3 ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:736:1: ( rule__Interface__Group__2__Impl rule__Interface__Group__3 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:737:2: rule__Interface__Group__2__Impl rule__Interface__Group__3
            {
            pushFollow(FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__21470);
            rule__Interface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__3_in_rule__Interface__Group__21473);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:744:1: rule__Interface__Group__2__Impl : ( ( rule__Interface__Group_2__0 )? ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:748:1: ( ( ( rule__Interface__Group_2__0 )? ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:749:1: ( ( rule__Interface__Group_2__0 )? )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:749:1: ( ( rule__Interface__Group_2__0 )? )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:750:1: ( rule__Interface__Group_2__0 )?
            {
             before(grammarAccess.getInterfaceAccess().getGroup_2()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:751:1: ( rule__Interface__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:751:2: rule__Interface__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Interface__Group_2__0_in_rule__Interface__Group__2__Impl1500);
                    rule__Interface__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceAccess().getGroup_2()); 

            }


            }

        }
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:761:1: rule__Interface__Group__3 : rule__Interface__Group__3__Impl rule__Interface__Group__4 ;
    public final void rule__Interface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:765:1: ( rule__Interface__Group__3__Impl rule__Interface__Group__4 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:766:2: rule__Interface__Group__3__Impl rule__Interface__Group__4
            {
            pushFollow(FOLLOW_rule__Interface__Group__3__Impl_in_rule__Interface__Group__31531);
            rule__Interface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__4_in_rule__Interface__Group__31534);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:773:1: rule__Interface__Group__3__Impl : ( '{' ) ;
    public final void rule__Interface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:777:1: ( ( '{' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:778:1: ( '{' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:778:1: ( '{' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:779:1: '{'
            {
             before(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__Interface__Group__3__Impl1562); 
             after(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:792:1: rule__Interface__Group__4 : rule__Interface__Group__4__Impl rule__Interface__Group__5 ;
    public final void rule__Interface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:796:1: ( rule__Interface__Group__4__Impl rule__Interface__Group__5 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:797:2: rule__Interface__Group__4__Impl rule__Interface__Group__5
            {
            pushFollow(FOLLOW_rule__Interface__Group__4__Impl_in_rule__Interface__Group__41593);
            rule__Interface__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__5_in_rule__Interface__Group__41596);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:804:1: rule__Interface__Group__4__Impl : ( ( rule__Interface__MethodsAssignment_4 )* ) ;
    public final void rule__Interface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:808:1: ( ( ( rule__Interface__MethodsAssignment_4 )* ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:809:1: ( ( rule__Interface__MethodsAssignment_4 )* )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:809:1: ( ( rule__Interface__MethodsAssignment_4 )* )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:810:1: ( rule__Interface__MethodsAssignment_4 )*
            {
             before(grammarAccess.getInterfaceAccess().getMethodsAssignment_4()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:811:1: ( rule__Interface__MethodsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:811:2: rule__Interface__MethodsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Interface__MethodsAssignment_4_in_rule__Interface__Group__4__Impl1623);
            	    rule__Interface__MethodsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getInterfaceAccess().getMethodsAssignment_4()); 

            }


            }

        }
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:821:1: rule__Interface__Group__5 : rule__Interface__Group__5__Impl ;
    public final void rule__Interface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:825:1: ( rule__Interface__Group__5__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:826:2: rule__Interface__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group__5__Impl_in_rule__Interface__Group__51654);
            rule__Interface__Group__5__Impl();

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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:832:1: rule__Interface__Group__5__Impl : ( '}' ) ;
    public final void rule__Interface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:836:1: ( ( '}' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:837:1: ( '}' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:837:1: ( '}' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:838:1: '}'
            {
             before(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__Interface__Group__5__Impl1682); 
             after(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Interface__Group_2__0"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:863:1: rule__Interface__Group_2__0 : rule__Interface__Group_2__0__Impl rule__Interface__Group_2__1 ;
    public final void rule__Interface__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:867:1: ( rule__Interface__Group_2__0__Impl rule__Interface__Group_2__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:868:2: rule__Interface__Group_2__0__Impl rule__Interface__Group_2__1
            {
            pushFollow(FOLLOW_rule__Interface__Group_2__0__Impl_in_rule__Interface__Group_2__01725);
            rule__Interface__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_2__1_in_rule__Interface__Group_2__01728);
            rule__Interface__Group_2__1();

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
    // $ANTLR end "rule__Interface__Group_2__0"


    // $ANTLR start "rule__Interface__Group_2__0__Impl"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:875:1: rule__Interface__Group_2__0__Impl : ( 'requires' ) ;
    public final void rule__Interface__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:879:1: ( ( 'requires' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:880:1: ( 'requires' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:880:1: ( 'requires' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:881:1: 'requires'
            {
             before(grammarAccess.getInterfaceAccess().getRequiresKeyword_2_0()); 
            match(input,16,FOLLOW_16_in_rule__Interface__Group_2__0__Impl1756); 
             after(grammarAccess.getInterfaceAccess().getRequiresKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_2__0__Impl"


    // $ANTLR start "rule__Interface__Group_2__1"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:894:1: rule__Interface__Group_2__1 : rule__Interface__Group_2__1__Impl rule__Interface__Group_2__2 ;
    public final void rule__Interface__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:898:1: ( rule__Interface__Group_2__1__Impl rule__Interface__Group_2__2 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:899:2: rule__Interface__Group_2__1__Impl rule__Interface__Group_2__2
            {
            pushFollow(FOLLOW_rule__Interface__Group_2__1__Impl_in_rule__Interface__Group_2__11787);
            rule__Interface__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_2__2_in_rule__Interface__Group_2__11790);
            rule__Interface__Group_2__2();

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
    // $ANTLR end "rule__Interface__Group_2__1"


    // $ANTLR start "rule__Interface__Group_2__1__Impl"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:906:1: rule__Interface__Group_2__1__Impl : ( ( rule__Interface__RequiredInterfacesAssignment_2_1 ) ) ;
    public final void rule__Interface__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:910:1: ( ( ( rule__Interface__RequiredInterfacesAssignment_2_1 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:911:1: ( ( rule__Interface__RequiredInterfacesAssignment_2_1 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:911:1: ( ( rule__Interface__RequiredInterfacesAssignment_2_1 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:912:1: ( rule__Interface__RequiredInterfacesAssignment_2_1 )
            {
             before(grammarAccess.getInterfaceAccess().getRequiredInterfacesAssignment_2_1()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:913:1: ( rule__Interface__RequiredInterfacesAssignment_2_1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:913:2: rule__Interface__RequiredInterfacesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Interface__RequiredInterfacesAssignment_2_1_in_rule__Interface__Group_2__1__Impl1817);
            rule__Interface__RequiredInterfacesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getRequiredInterfacesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_2__1__Impl"


    // $ANTLR start "rule__Interface__Group_2__2"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:923:1: rule__Interface__Group_2__2 : rule__Interface__Group_2__2__Impl ;
    public final void rule__Interface__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:927:1: ( rule__Interface__Group_2__2__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:928:2: rule__Interface__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group_2__2__Impl_in_rule__Interface__Group_2__21847);
            rule__Interface__Group_2__2__Impl();

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
    // $ANTLR end "rule__Interface__Group_2__2"


    // $ANTLR start "rule__Interface__Group_2__2__Impl"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:934:1: rule__Interface__Group_2__2__Impl : ( ( rule__Interface__Group_2_2__0 )* ) ;
    public final void rule__Interface__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:938:1: ( ( ( rule__Interface__Group_2_2__0 )* ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:939:1: ( ( rule__Interface__Group_2_2__0 )* )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:939:1: ( ( rule__Interface__Group_2_2__0 )* )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:940:1: ( rule__Interface__Group_2_2__0 )*
            {
             before(grammarAccess.getInterfaceAccess().getGroup_2_2()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:941:1: ( rule__Interface__Group_2_2__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:941:2: rule__Interface__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Interface__Group_2_2__0_in_rule__Interface__Group_2__2__Impl1874);
            	    rule__Interface__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getInterfaceAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_2__2__Impl"


    // $ANTLR start "rule__Interface__Group_2_2__0"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:957:1: rule__Interface__Group_2_2__0 : rule__Interface__Group_2_2__0__Impl rule__Interface__Group_2_2__1 ;
    public final void rule__Interface__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:961:1: ( rule__Interface__Group_2_2__0__Impl rule__Interface__Group_2_2__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:962:2: rule__Interface__Group_2_2__0__Impl rule__Interface__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Interface__Group_2_2__0__Impl_in_rule__Interface__Group_2_2__01911);
            rule__Interface__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_2_2__1_in_rule__Interface__Group_2_2__01914);
            rule__Interface__Group_2_2__1();

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
    // $ANTLR end "rule__Interface__Group_2_2__0"


    // $ANTLR start "rule__Interface__Group_2_2__0__Impl"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:969:1: rule__Interface__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Interface__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:973:1: ( ( ',' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:974:1: ( ',' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:974:1: ( ',' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:975:1: ','
            {
             before(grammarAccess.getInterfaceAccess().getCommaKeyword_2_2_0()); 
            match(input,17,FOLLOW_17_in_rule__Interface__Group_2_2__0__Impl1942); 
             after(grammarAccess.getInterfaceAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_2_2__0__Impl"


    // $ANTLR start "rule__Interface__Group_2_2__1"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:988:1: rule__Interface__Group_2_2__1 : rule__Interface__Group_2_2__1__Impl ;
    public final void rule__Interface__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:992:1: ( rule__Interface__Group_2_2__1__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:993:2: rule__Interface__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group_2_2__1__Impl_in_rule__Interface__Group_2_2__11973);
            rule__Interface__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__Interface__Group_2_2__1"


    // $ANTLR start "rule__Interface__Group_2_2__1__Impl"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:999:1: rule__Interface__Group_2_2__1__Impl : ( ( rule__Interface__RequiredInterfacesAssignment_2_2_1 ) ) ;
    public final void rule__Interface__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1003:1: ( ( ( rule__Interface__RequiredInterfacesAssignment_2_2_1 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1004:1: ( ( rule__Interface__RequiredInterfacesAssignment_2_2_1 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1004:1: ( ( rule__Interface__RequiredInterfacesAssignment_2_2_1 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1005:1: ( rule__Interface__RequiredInterfacesAssignment_2_2_1 )
            {
             before(grammarAccess.getInterfaceAccess().getRequiredInterfacesAssignment_2_2_1()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1006:1: ( rule__Interface__RequiredInterfacesAssignment_2_2_1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1006:2: rule__Interface__RequiredInterfacesAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Interface__RequiredInterfacesAssignment_2_2_1_in_rule__Interface__Group_2_2__1__Impl2000);
            rule__Interface__RequiredInterfacesAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getRequiredInterfacesAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_2_2__1__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1020:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1024:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1025:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__02034);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__1_in_rule__Method__Group__02037);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1032:1: rule__Method__Group__0__Impl : ( ( rule__Method__IsStaticAssignment_0 )? ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1036:1: ( ( ( rule__Method__IsStaticAssignment_0 )? ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1037:1: ( ( rule__Method__IsStaticAssignment_0 )? )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1037:1: ( ( rule__Method__IsStaticAssignment_0 )? )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1038:1: ( rule__Method__IsStaticAssignment_0 )?
            {
             before(grammarAccess.getMethodAccess().getIsStaticAssignment_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1039:1: ( rule__Method__IsStaticAssignment_0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1039:2: rule__Method__IsStaticAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Method__IsStaticAssignment_0_in_rule__Method__Group__0__Impl2064);
                    rule__Method__IsStaticAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getIsStaticAssignment_0()); 

            }


            }

        }
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1049:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1053:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1054:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__12095);
            rule__Method__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__2_in_rule__Method__Group__12098);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1061:1: rule__Method__Group__1__Impl : ( ( rule__Method__TypeAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1065:1: ( ( ( rule__Method__TypeAssignment_1 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1066:1: ( ( rule__Method__TypeAssignment_1 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1066:1: ( ( rule__Method__TypeAssignment_1 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1067:1: ( rule__Method__TypeAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getTypeAssignment_1()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1068:1: ( rule__Method__TypeAssignment_1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1068:2: rule__Method__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Method__TypeAssignment_1_in_rule__Method__Group__1__Impl2125);
            rule__Method__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getTypeAssignment_1()); 

            }


            }

        }
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1078:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1082:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1083:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__22155);
            rule__Method__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__3_in_rule__Method__Group__22158);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1090:1: rule__Method__Group__2__Impl : ( ( rule__Method__NameAssignment_2 ) ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1094:1: ( ( ( rule__Method__NameAssignment_2 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1095:1: ( ( rule__Method__NameAssignment_2 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1095:1: ( ( rule__Method__NameAssignment_2 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1096:1: ( rule__Method__NameAssignment_2 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_2()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1097:1: ( rule__Method__NameAssignment_2 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1097:2: rule__Method__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Method__NameAssignment_2_in_rule__Method__Group__2__Impl2185);
            rule__Method__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1107:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1111:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1112:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__32215);
            rule__Method__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__4_in_rule__Method__Group__32218);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1119:1: rule__Method__Group__3__Impl : ( ( rule__Method__ParametersAssignment_3 )* ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1123:1: ( ( ( rule__Method__ParametersAssignment_3 )* ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1124:1: ( ( rule__Method__ParametersAssignment_3 )* )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1124:1: ( ( rule__Method__ParametersAssignment_3 )* )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1125:1: ( rule__Method__ParametersAssignment_3 )*
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_3()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1126:1: ( rule__Method__ParametersAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    int LA7_2 = input.LA(2);

                    if ( (LA7_2==19) ) {
                        alt7=1;
                    }


                }
                else if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1126:2: rule__Method__ParametersAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Method__ParametersAssignment_3_in_rule__Method__Group__3__Impl2245);
            	    rule__Method__ParametersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getParametersAssignment_3()); 

            }


            }

        }
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1136:1: rule__Method__Group__4 : rule__Method__Group__4__Impl ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1140:1: ( rule__Method__Group__4__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1141:2: rule__Method__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__42276);
            rule__Method__Group__4__Impl();

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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1147:1: rule__Method__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1151:1: ( ( ( ';' )? ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1152:1: ( ( ';' )? )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1152:1: ( ( ';' )? )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1153:1: ( ';' )?
            {
             before(grammarAccess.getMethodAccess().getSemicolonKeyword_4()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1154:1: ( ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1155:2: ';'
                    {
                    match(input,18,FOLLOW_18_in_rule__Method__Group__4__Impl2305); 

                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getSemicolonKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Parameter__Group__0"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1176:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1180:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1181:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__02348);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__02351);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1188:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__SignaturePartAssignment_0 )? ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1192:1: ( ( ( rule__Parameter__SignaturePartAssignment_0 )? ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1193:1: ( ( rule__Parameter__SignaturePartAssignment_0 )? )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1193:1: ( ( rule__Parameter__SignaturePartAssignment_0 )? )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1194:1: ( rule__Parameter__SignaturePartAssignment_0 )?
            {
             before(grammarAccess.getParameterAccess().getSignaturePartAssignment_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1195:1: ( rule__Parameter__SignaturePartAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1195:2: rule__Parameter__SignaturePartAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Parameter__SignaturePartAssignment_0_in_rule__Parameter__Group__0__Impl2378);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1205:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1209:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1210:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__12409);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__12412);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1217:1: rule__Parameter__Group__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1221:1: ( ( ':' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1222:1: ( ':' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1222:1: ( ':' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1223:1: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__Parameter__Group__1__Impl2440); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1236:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1240:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1241:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__22471);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__22474);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1248:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__TypeAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1252:1: ( ( ( rule__Parameter__TypeAssignment_2 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1253:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1253:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1254:1: ( rule__Parameter__TypeAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_2()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1255:1: ( rule__Parameter__TypeAssignment_2 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1255:2: rule__Parameter__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Parameter__TypeAssignment_2_in_rule__Parameter__Group__2__Impl2501);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1265:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1269:1: ( rule__Parameter__Group__3__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1270:2: rule__Parameter__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__32531);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1276:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__NameAssignment_3 ) ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1280:1: ( ( ( rule__Parameter__NameAssignment_3 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1281:1: ( ( rule__Parameter__NameAssignment_3 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1281:1: ( ( rule__Parameter__NameAssignment_3 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1282:1: ( rule__Parameter__NameAssignment_3 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_3()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1283:1: ( rule__Parameter__NameAssignment_3 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1283:2: rule__Parameter__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_3_in_rule__Parameter__Group__3__Impl2558);
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


    // $ANTLR start "rule__Primitive__Group__0"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1302:1: rule__Primitive__Group__0 : rule__Primitive__Group__0__Impl rule__Primitive__Group__1 ;
    public final void rule__Primitive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1306:1: ( rule__Primitive__Group__0__Impl rule__Primitive__Group__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1307:2: rule__Primitive__Group__0__Impl rule__Primitive__Group__1
            {
            pushFollow(FOLLOW_rule__Primitive__Group__0__Impl_in_rule__Primitive__Group__02597);
            rule__Primitive__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primitive__Group__1_in_rule__Primitive__Group__02600);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1314:1: rule__Primitive__Group__0__Impl : ( 'primitive type' ) ;
    public final void rule__Primitive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1318:1: ( ( 'primitive type' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1319:1: ( 'primitive type' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1319:1: ( 'primitive type' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1320:1: 'primitive type'
            {
             before(grammarAccess.getPrimitiveAccess().getPrimitiveTypeKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Primitive__Group__0__Impl2628); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1333:1: rule__Primitive__Group__1 : rule__Primitive__Group__1__Impl ;
    public final void rule__Primitive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1337:1: ( rule__Primitive__Group__1__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1338:2: rule__Primitive__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Primitive__Group__1__Impl_in_rule__Primitive__Group__12659);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1344:1: rule__Primitive__Group__1__Impl : ( ( rule__Primitive__NameAssignment_1 ) ) ;
    public final void rule__Primitive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1348:1: ( ( ( rule__Primitive__NameAssignment_1 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1349:1: ( ( rule__Primitive__NameAssignment_1 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1349:1: ( ( rule__Primitive__NameAssignment_1 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1350:1: ( rule__Primitive__NameAssignment_1 )
            {
             before(grammarAccess.getPrimitiveAccess().getNameAssignment_1()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1351:1: ( rule__Primitive__NameAssignment_1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1351:2: rule__Primitive__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Primitive__NameAssignment_1_in_rule__Primitive__Group__1__Impl2686);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1365:1: rule__Any__Group__0 : rule__Any__Group__0__Impl rule__Any__Group__1 ;
    public final void rule__Any__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1369:1: ( rule__Any__Group__0__Impl rule__Any__Group__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1370:2: rule__Any__Group__0__Impl rule__Any__Group__1
            {
            pushFollow(FOLLOW_rule__Any__Group__0__Impl_in_rule__Any__Group__02720);
            rule__Any__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Any__Group__1_in_rule__Any__Group__02723);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1377:1: rule__Any__Group__0__Impl : ( 'any type' ) ;
    public final void rule__Any__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1381:1: ( ( 'any type' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1382:1: ( 'any type' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1382:1: ( 'any type' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1383:1: 'any type'
            {
             before(grammarAccess.getAnyAccess().getAnyTypeKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Any__Group__0__Impl2751); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1396:1: rule__Any__Group__1 : rule__Any__Group__1__Impl ;
    public final void rule__Any__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1400:1: ( rule__Any__Group__1__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1401:2: rule__Any__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Any__Group__1__Impl_in_rule__Any__Group__12782);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1407:1: rule__Any__Group__1__Impl : ( ( rule__Any__NameAssignment_1 ) ) ;
    public final void rule__Any__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1411:1: ( ( ( rule__Any__NameAssignment_1 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1412:1: ( ( rule__Any__NameAssignment_1 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1412:1: ( ( rule__Any__NameAssignment_1 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1413:1: ( rule__Any__NameAssignment_1 )
            {
             before(grammarAccess.getAnyAccess().getNameAssignment_1()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1414:1: ( rule__Any__NameAssignment_1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1414:2: rule__Any__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Any__NameAssignment_1_in_rule__Any__Group__1__Impl2809);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1431:1: rule__TypeRef__Group__0 : rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 ;
    public final void rule__TypeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1435:1: ( rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1436:2: rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__02846);
            rule__TypeRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__02849);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1443:1: rule__TypeRef__Group__0__Impl : ( ( rule__TypeRef__ReferencedAssignment_0 ) ) ;
    public final void rule__TypeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1447:1: ( ( ( rule__TypeRef__ReferencedAssignment_0 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1448:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1448:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1449:1: ( rule__TypeRef__ReferencedAssignment_0 )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedAssignment_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1450:1: ( rule__TypeRef__ReferencedAssignment_0 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1450:2: rule__TypeRef__ReferencedAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl2876);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1460:1: rule__TypeRef__Group__1 : rule__TypeRef__Group__1__Impl ;
    public final void rule__TypeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1464:1: ( rule__TypeRef__Group__1__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1465:2: rule__TypeRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__12906);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1471:1: rule__TypeRef__Group__1__Impl : ( ( rule__TypeRef__IsMultiAssignment_1 )? ) ;
    public final void rule__TypeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1475:1: ( ( ( rule__TypeRef__IsMultiAssignment_1 )? ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1476:1: ( ( rule__TypeRef__IsMultiAssignment_1 )? )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1476:1: ( ( rule__TypeRef__IsMultiAssignment_1 )? )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1477:1: ( rule__TypeRef__IsMultiAssignment_1 )?
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiAssignment_1()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1478:1: ( rule__TypeRef__IsMultiAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1478:2: rule__TypeRef__IsMultiAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TypeRef__IsMultiAssignment_1_in_rule__TypeRef__Group__1__Impl2933);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1492:1: rule__EFloatObject__Group__0 : rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1 ;
    public final void rule__EFloatObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1496:1: ( rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1497:2: rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__0__Impl_in_rule__EFloatObject__Group__02968);
            rule__EFloatObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__1_in_rule__EFloatObject__Group__02971);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1504:1: rule__EFloatObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloatObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1508:1: ( ( ( '-' )? ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1509:1: ( ( '-' )? )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1509:1: ( ( '-' )? )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1510:1: ( '-' )?
            {
             before(grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1511:1: ( '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1512:2: '-'
                    {
                    match(input,22,FOLLOW_22_in_rule__EFloatObject__Group__0__Impl3000); 

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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1523:1: rule__EFloatObject__Group__1 : rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2 ;
    public final void rule__EFloatObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1527:1: ( rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1528:2: rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__1__Impl_in_rule__EFloatObject__Group__13033);
            rule__EFloatObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__2_in_rule__EFloatObject__Group__13036);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1535:1: rule__EFloatObject__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloatObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1539:1: ( ( ( RULE_INT )? ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1540:1: ( ( RULE_INT )? )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1540:1: ( ( RULE_INT )? )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1541:1: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1542:1: ( RULE_INT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1542:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EFloatObject__Group__1__Impl3064); 

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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1552:1: rule__EFloatObject__Group__2 : rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3 ;
    public final void rule__EFloatObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1556:1: ( rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1557:2: rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__2__Impl_in_rule__EFloatObject__Group__23095);
            rule__EFloatObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__3_in_rule__EFloatObject__Group__23098);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1564:1: rule__EFloatObject__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloatObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1568:1: ( ( '.' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1569:1: ( '.' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1569:1: ( '.' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1570:1: '.'
            {
             before(grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__EFloatObject__Group__2__Impl3126); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1583:1: rule__EFloatObject__Group__3 : rule__EFloatObject__Group__3__Impl ;
    public final void rule__EFloatObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1587:1: ( rule__EFloatObject__Group__3__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1588:2: rule__EFloatObject__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__3__Impl_in_rule__EFloatObject__Group__33157);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1594:1: rule__EFloatObject__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloatObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1598:1: ( ( RULE_INT ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1599:1: ( RULE_INT )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1599:1: ( RULE_INT )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1600:1: RULE_INT
            {
             before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EFloatObject__Group__3__Impl3184); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1619:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1623:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1624:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03221);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03224);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1631:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1635:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1636:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1636:1: ( RULE_ID )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1637:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3251); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1648:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1652:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1653:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13280);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1659:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1663:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1664:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1664:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1665:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1666:1: ( rule__QualifiedName__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==23) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1666:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3307);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1680:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1684:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1685:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03342);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03345);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1692:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1696:1: ( ( '.' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1697:1: ( '.' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1697:1: ( '.' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1698:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,23,FOLLOW_23_in_rule__QualifiedName__Group_1__0__Impl3373); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1711:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1715:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1716:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13404);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1722:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1726:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1727:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1727:1: ( RULE_ID )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1728:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3431); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1744:1: rule__InterfaceModel__ModuleAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__InterfaceModel__ModuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1748:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1749:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1749:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1750:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getInterfaceModelAccess().getModuleModuleCrossReference_1_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1751:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1752:1: ruleQualifiedName
            {
             before(grammarAccess.getInterfaceModelAccess().getModuleModuleQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__InterfaceModel__ModuleAssignment_13473);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1763:1: rule__InterfaceModel__VersionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__InterfaceModel__VersionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1767:1: ( ( RULE_STRING ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1768:1: ( RULE_STRING )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1768:1: ( RULE_STRING )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1769:1: RULE_STRING
            {
             before(grammarAccess.getInterfaceModelAccess().getVersionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__InterfaceModel__VersionAssignment_33508); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1778:1: rule__InterfaceModel__InterfacesAssignment_4 : ( ruleInterface ) ;
    public final void rule__InterfaceModel__InterfacesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1782:1: ( ( ruleInterface ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1783:1: ( ruleInterface )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1783:1: ( ruleInterface )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1784:1: ruleInterface
            {
             before(grammarAccess.getInterfaceModelAccess().getInterfacesInterfaceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleInterface_in_rule__InterfaceModel__InterfacesAssignment_43539);
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


    // $ANTLR start "rule__Interface__NameAssignment_1"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1793:1: rule__Interface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Interface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1797:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1798:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1798:1: ( RULE_ID )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1799:1: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interface__NameAssignment_13570); 
             after(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__NameAssignment_1"


    // $ANTLR start "rule__Interface__RequiredInterfacesAssignment_2_1"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1808:1: rule__Interface__RequiredInterfacesAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Interface__RequiredInterfacesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1812:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1813:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1813:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1814:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getInterfaceAccess().getRequiredInterfacesInterfaceCrossReference_2_1_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1815:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1816:1: ruleQualifiedName
            {
             before(grammarAccess.getInterfaceAccess().getRequiredInterfacesInterfaceQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Interface__RequiredInterfacesAssignment_2_13605);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getRequiredInterfacesInterfaceQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getInterfaceAccess().getRequiredInterfacesInterfaceCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__RequiredInterfacesAssignment_2_1"


    // $ANTLR start "rule__Interface__RequiredInterfacesAssignment_2_2_1"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1827:1: rule__Interface__RequiredInterfacesAssignment_2_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Interface__RequiredInterfacesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1831:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1832:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1832:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1833:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getInterfaceAccess().getRequiredInterfacesInterfaceCrossReference_2_2_1_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1834:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1835:1: ruleQualifiedName
            {
             before(grammarAccess.getInterfaceAccess().getRequiredInterfacesInterfaceQualifiedNameParserRuleCall_2_2_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Interface__RequiredInterfacesAssignment_2_2_13644);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getRequiredInterfacesInterfaceQualifiedNameParserRuleCall_2_2_1_0_1()); 

            }

             after(grammarAccess.getInterfaceAccess().getRequiredInterfacesInterfaceCrossReference_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__RequiredInterfacesAssignment_2_2_1"


    // $ANTLR start "rule__Interface__MethodsAssignment_4"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1846:1: rule__Interface__MethodsAssignment_4 : ( ruleMethod ) ;
    public final void rule__Interface__MethodsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1850:1: ( ( ruleMethod ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1851:1: ( ruleMethod )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1851:1: ( ruleMethod )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1852:1: ruleMethod
            {
             before(grammarAccess.getInterfaceAccess().getMethodsMethodParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMethod_in_rule__Interface__MethodsAssignment_43679);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getMethodsMethodParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__MethodsAssignment_4"


    // $ANTLR start "rule__Method__IsStaticAssignment_0"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1861:1: rule__Method__IsStaticAssignment_0 : ( ( 'static' ) ) ;
    public final void rule__Method__IsStaticAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1865:1: ( ( ( 'static' ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1866:1: ( ( 'static' ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1866:1: ( ( 'static' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1867:1: ( 'static' )
            {
             before(grammarAccess.getMethodAccess().getIsStaticStaticKeyword_0_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1868:1: ( 'static' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1869:1: 'static'
            {
             before(grammarAccess.getMethodAccess().getIsStaticStaticKeyword_0_0()); 
            match(input,24,FOLLOW_24_in_rule__Method__IsStaticAssignment_03715); 
             after(grammarAccess.getMethodAccess().getIsStaticStaticKeyword_0_0()); 

            }

             after(grammarAccess.getMethodAccess().getIsStaticStaticKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__IsStaticAssignment_0"


    // $ANTLR start "rule__Method__TypeAssignment_1"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1884:1: rule__Method__TypeAssignment_1 : ( ruleTypeRef ) ;
    public final void rule__Method__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1888:1: ( ( ruleTypeRef ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1889:1: ( ruleTypeRef )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1889:1: ( ruleTypeRef )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1890:1: ruleTypeRef
            {
             before(grammarAccess.getMethodAccess().getTypeTypeRefParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Method__TypeAssignment_13754);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getTypeTypeRefParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__TypeAssignment_1"


    // $ANTLR start "rule__Method__NameAssignment_2"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1899:1: rule__Method__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1903:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1904:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1904:1: ( RULE_ID )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1905:1: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Method__NameAssignment_23785); 
             after(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__NameAssignment_2"


    // $ANTLR start "rule__Method__ParametersAssignment_3"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1914:1: rule__Method__ParametersAssignment_3 : ( ruleParameter ) ;
    public final void rule__Method__ParametersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1918:1: ( ( ruleParameter ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1919:1: ( ruleParameter )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1919:1: ( ruleParameter )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1920:1: ruleParameter
            {
             before(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Method__ParametersAssignment_33816);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParametersAssignment_3"


    // $ANTLR start "rule__Parameter__SignaturePartAssignment_0"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1929:1: rule__Parameter__SignaturePartAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__SignaturePartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1933:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1934:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1934:1: ( RULE_ID )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1935:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getSignaturePartIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__SignaturePartAssignment_03847); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1944:1: rule__Parameter__TypeAssignment_2 : ( ruleTypeRef ) ;
    public final void rule__Parameter__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1948:1: ( ( ruleTypeRef ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1949:1: ( ruleTypeRef )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1949:1: ( ruleTypeRef )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1950:1: ruleTypeRef
            {
             before(grammarAccess.getParameterAccess().getTypeTypeRefParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Parameter__TypeAssignment_23878);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1959:1: rule__Parameter__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1963:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1964:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1964:1: ( RULE_ID )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1965:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_33909); 
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


    // $ANTLR start "rule__Primitive__NameAssignment_1"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1976:1: rule__Primitive__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Primitive__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1980:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1981:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1981:1: ( RULE_ID )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1982:1: RULE_ID
            {
             before(grammarAccess.getPrimitiveAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Primitive__NameAssignment_13942); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1991:1: rule__Any__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Any__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1995:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1996:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1996:1: ( RULE_ID )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1997:1: RULE_ID
            {
             before(grammarAccess.getAnyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Any__NameAssignment_13973); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2012:1: rule__TypeRef__ReferencedAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TypeRef__ReferencedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2016:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2017:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2017:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2018:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2019:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2020:1: ruleQualifiedName
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_04014);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2031:1: rule__TypeRef__IsMultiAssignment_1 : ( ( '[]' ) ) ;
    public final void rule__TypeRef__IsMultiAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2035:1: ( ( ( '[]' ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2036:1: ( ( '[]' ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2036:1: ( ( '[]' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2037:1: ( '[]' )
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2038:1: ( '[]' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2039:1: '[]'
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            match(input,25,FOLLOW_25_in_rule__TypeRef__IsMultiAssignment_14054); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2054:1: rule__StringValue__ValueAssignment : ( ruleEStringObject ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2058:1: ( ( ruleEStringObject ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2059:1: ( ruleEStringObject )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2059:1: ( ruleEStringObject )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2060:1: ruleEStringObject
            {
             before(grammarAccess.getStringValueAccess().getValueEStringObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEStringObject_in_rule__StringValue__ValueAssignment4093);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2069:1: rule__IntegerValue__ValueAssignment : ( ruleEIntegerObject ) ;
    public final void rule__IntegerValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2073:1: ( ( ruleEIntegerObject ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2074:1: ( ruleEIntegerObject )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2074:1: ( ruleEIntegerObject )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2075:1: ruleEIntegerObject
            {
             before(grammarAccess.getIntegerValueAccess().getValueEIntegerObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_rule__IntegerValue__ValueAssignment4124);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2084:1: rule__FloatValue__ValueAssignment : ( ruleEFloatObject ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2088:1: ( ( ruleEFloatObject ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2089:1: ( ruleEFloatObject )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2089:1: ( ruleEFloatObject )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:2090:1: ruleEFloatObject
            {
             before(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_rule__FloatValue__ValueAssignment4155);
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
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__0_in_rulePrimitive336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAny_in_entryRuleAny363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAny370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__Group__0_in_ruleAny396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueObject_in_entryRuleValueObject485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueObject492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueObject__Alternatives_in_ruleValueObject518 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleStringValue_in_rule__ValueObject__Alternatives972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_rule__ValueObject__Alternatives989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_rule__ValueObject__Alternatives1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceModel__Group__0__Impl_in_rule__InterfaceModel__Group__01036 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__InterfaceModel__Group__1_in_rule__InterfaceModel__Group__01039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__InterfaceModel__Group__0__Impl1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceModel__Group__1__Impl_in_rule__InterfaceModel__Group__11098 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__InterfaceModel__Group__2_in_rule__InterfaceModel__Group__11101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceModel__ModuleAssignment_1_in_rule__InterfaceModel__Group__1__Impl1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceModel__Group__2__Impl_in_rule__InterfaceModel__Group__21158 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InterfaceModel__Group__3_in_rule__InterfaceModel__Group__21161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__InterfaceModel__Group__2__Impl1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceModel__Group__3__Impl_in_rule__InterfaceModel__Group__31220 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__InterfaceModel__Group__4_in_rule__InterfaceModel__Group__31223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceModel__VersionAssignment_3_in_rule__InterfaceModel__Group__3__Impl1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceModel__Group__4__Impl_in_rule__InterfaceModel__Group__41280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceModel__InterfacesAssignment_4_in_rule__InterfaceModel__Group__4__Impl1307 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__01348 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__01351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Interface__Group__0__Impl1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__11410 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__11413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__NameAssignment_1_in_rule__Interface__Group__1__Impl1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__21470 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Interface__Group__3_in_rule__Interface__Group__21473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_2__0_in_rule__Interface__Group__2__Impl1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__3__Impl_in_rule__Interface__Group__31531 = new BitSet(new long[]{0x0000000001008040L});
    public static final BitSet FOLLOW_rule__Interface__Group__4_in_rule__Interface__Group__31534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Interface__Group__3__Impl1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__4__Impl_in_rule__Interface__Group__41593 = new BitSet(new long[]{0x0000000001008040L});
    public static final BitSet FOLLOW_rule__Interface__Group__5_in_rule__Interface__Group__41596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__MethodsAssignment_4_in_rule__Interface__Group__4__Impl1623 = new BitSet(new long[]{0x0000000001000042L});
    public static final BitSet FOLLOW_rule__Interface__Group__5__Impl_in_rule__Interface__Group__51654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Interface__Group__5__Impl1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_2__0__Impl_in_rule__Interface__Group_2__01725 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Interface__Group_2__1_in_rule__Interface__Group_2__01728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Interface__Group_2__0__Impl1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_2__1__Impl_in_rule__Interface__Group_2__11787 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Interface__Group_2__2_in_rule__Interface__Group_2__11790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__RequiredInterfacesAssignment_2_1_in_rule__Interface__Group_2__1__Impl1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_2__2__Impl_in_rule__Interface__Group_2__21847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_2_2__0_in_rule__Interface__Group_2__2__Impl1874 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Interface__Group_2_2__0__Impl_in_rule__Interface__Group_2_2__01911 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Interface__Group_2_2__1_in_rule__Interface__Group_2_2__01914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Interface__Group_2_2__0__Impl1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_2_2__1__Impl_in_rule__Interface__Group_2_2__11973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__RequiredInterfacesAssignment_2_2_1_in_rule__Interface__Group_2_2__1__Impl2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__02034 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_rule__Method__Group__1_in_rule__Method__Group__02037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__IsStaticAssignment_0_in_rule__Method__Group__0__Impl2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__12095 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Method__Group__2_in_rule__Method__Group__12098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__TypeAssignment_1_in_rule__Method__Group__1__Impl2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__22155 = new BitSet(new long[]{0x00000000000C0040L});
    public static final BitSet FOLLOW_rule__Method__Group__3_in_rule__Method__Group__22158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__NameAssignment_2_in_rule__Method__Group__2__Impl2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__32215 = new BitSet(new long[]{0x00000000000C0040L});
    public static final BitSet FOLLOW_rule__Method__Group__4_in_rule__Method__Group__32218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ParametersAssignment_3_in_rule__Method__Group__3__Impl2245 = new BitSet(new long[]{0x0000000000080042L});
    public static final BitSet FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__42276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Method__Group__4__Impl2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__02348 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__02351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__SignaturePartAssignment_0_in_rule__Parameter__Group__0__Impl2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__12409 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__12412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Parameter__Group__1__Impl2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__22471 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__22474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_2_in_rule__Parameter__Group__2__Impl2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__32531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_3_in_rule__Parameter__Group__3__Impl2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__0__Impl_in_rule__Primitive__Group__02597 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Primitive__Group__1_in_rule__Primitive__Group__02600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Primitive__Group__0__Impl2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__1__Impl_in_rule__Primitive__Group__12659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__NameAssignment_1_in_rule__Primitive__Group__1__Impl2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__Group__0__Impl_in_rule__Any__Group__02720 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Any__Group__1_in_rule__Any__Group__02723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Any__Group__0__Impl2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__Group__1__Impl_in_rule__Any__Group__12782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__NameAssignment_1_in_rule__Any__Group__1__Impl2809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__02846 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__02849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__12906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__IsMultiAssignment_1_in_rule__TypeRef__Group__1__Impl2933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__0__Impl_in_rule__EFloatObject__Group__02968 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__1_in_rule__EFloatObject__Group__02971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EFloatObject__Group__0__Impl3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__1__Impl_in_rule__EFloatObject__Group__13033 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__2_in_rule__EFloatObject__Group__13036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group__1__Impl3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__2__Impl_in_rule__EFloatObject__Group__23095 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__3_in_rule__EFloatObject__Group__23098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EFloatObject__Group__2__Impl3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__3__Impl_in_rule__EFloatObject__Group__33157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group__3__Impl3184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03221 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3307 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03342 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__QualifiedName__Group_1__0__Impl3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__InterfaceModel__ModuleAssignment_13473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__InterfaceModel__VersionAssignment_33508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_rule__InterfaceModel__InterfacesAssignment_43539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interface__NameAssignment_13570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Interface__RequiredInterfacesAssignment_2_13605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Interface__RequiredInterfacesAssignment_2_2_13644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__Interface__MethodsAssignment_43679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Method__IsStaticAssignment_03715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Method__TypeAssignment_13754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Method__NameAssignment_23785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Method__ParametersAssignment_33816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__SignaturePartAssignment_03847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Parameter__TypeAssignment_23878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_33909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Primitive__NameAssignment_13942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Any__NameAssignment_13973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_04014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__TypeRef__IsMultiAssignment_14054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_rule__StringValue__ValueAssignment4093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_rule__IntegerValue__ValueAssignment4124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_rule__FloatValue__ValueAssignment4155 = new BitSet(new long[]{0x0000000000000002L});

}