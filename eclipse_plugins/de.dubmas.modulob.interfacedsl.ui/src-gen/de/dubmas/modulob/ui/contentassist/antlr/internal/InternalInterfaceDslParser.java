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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'interfaces for module'", "'version'", "'interface'", "'{'", "'}'", "'requires'", "','", "';'", "':'", "'-'", "'.'", "'static'", "'[]'"
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


    // $ANTLR start "entryRuleTypeRef"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:174:1: entryRuleTypeRef : ruleTypeRef EOF ;
    public final void entryRuleTypeRef() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:175:1: ( ruleTypeRef EOF )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:176:1: ruleTypeRef EOF
            {
             before(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef303);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getTypeRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef310); 

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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:183:1: ruleTypeRef : ( ( rule__TypeRef__Group__0 ) ) ;
    public final void ruleTypeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:187:2: ( ( ( rule__TypeRef__Group__0 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:188:1: ( ( rule__TypeRef__Group__0 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:188:1: ( ( rule__TypeRef__Group__0 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:189:1: ( rule__TypeRef__Group__0 )
            {
             before(grammarAccess.getTypeRefAccess().getGroup()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:190:1: ( rule__TypeRef__Group__0 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:190:2: rule__TypeRef__Group__0
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef336);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:202:1: entryRuleValueObject : ruleValueObject EOF ;
    public final void entryRuleValueObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:203:1: ( ruleValueObject EOF )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:204:1: ruleValueObject EOF
            {
             before(grammarAccess.getValueObjectRule()); 
            pushFollow(FOLLOW_ruleValueObject_in_entryRuleValueObject363);
            ruleValueObject();

            state._fsp--;

             after(grammarAccess.getValueObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueObject370); 

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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:211:1: ruleValueObject : ( ( rule__ValueObject__Alternatives ) ) ;
    public final void ruleValueObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:215:2: ( ( ( rule__ValueObject__Alternatives ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:216:1: ( ( rule__ValueObject__Alternatives ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:216:1: ( ( rule__ValueObject__Alternatives ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:217:1: ( rule__ValueObject__Alternatives )
            {
             before(grammarAccess.getValueObjectAccess().getAlternatives()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:218:1: ( rule__ValueObject__Alternatives )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:218:2: rule__ValueObject__Alternatives
            {
            pushFollow(FOLLOW_rule__ValueObject__Alternatives_in_ruleValueObject396);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:230:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:231:1: ( ruleStringValue EOF )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:232:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue423);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue430); 

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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:239:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:243:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:244:1: ( ( rule__StringValue__ValueAssignment ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:244:1: ( ( rule__StringValue__ValueAssignment ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:245:1: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:246:1: ( rule__StringValue__ValueAssignment )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:246:2: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue456);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:258:1: entryRuleEStringObject : ruleEStringObject EOF ;
    public final void entryRuleEStringObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:259:1: ( ruleEStringObject EOF )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:260:1: ruleEStringObject EOF
            {
             before(grammarAccess.getEStringObjectRule()); 
            pushFollow(FOLLOW_ruleEStringObject_in_entryRuleEStringObject483);
            ruleEStringObject();

            state._fsp--;

             after(grammarAccess.getEStringObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEStringObject490); 

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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:267:1: ruleEStringObject : ( RULE_STRING ) ;
    public final void ruleEStringObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:271:2: ( ( RULE_STRING ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:272:1: ( RULE_STRING )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:272:1: ( RULE_STRING )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:273:1: RULE_STRING
            {
             before(grammarAccess.getEStringObjectAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEStringObject516); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:286:1: entryRuleIntegerValue : ruleIntegerValue EOF ;
    public final void entryRuleIntegerValue() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:287:1: ( ruleIntegerValue EOF )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:288:1: ruleIntegerValue EOF
            {
             before(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue542);
            ruleIntegerValue();

            state._fsp--;

             after(grammarAccess.getIntegerValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValue549); 

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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:295:1: ruleIntegerValue : ( ( rule__IntegerValue__ValueAssignment ) ) ;
    public final void ruleIntegerValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:299:2: ( ( ( rule__IntegerValue__ValueAssignment ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:300:1: ( ( rule__IntegerValue__ValueAssignment ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:300:1: ( ( rule__IntegerValue__ValueAssignment ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:301:1: ( rule__IntegerValue__ValueAssignment )
            {
             before(grammarAccess.getIntegerValueAccess().getValueAssignment()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:302:1: ( rule__IntegerValue__ValueAssignment )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:302:2: rule__IntegerValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntegerValue__ValueAssignment_in_ruleIntegerValue575);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:314:1: entryRuleEIntegerObject : ruleEIntegerObject EOF ;
    public final void entryRuleEIntegerObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:315:1: ( ruleEIntegerObject EOF )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:316:1: ruleEIntegerObject EOF
            {
             before(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject602);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getEIntegerObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEIntegerObject609); 

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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:323:1: ruleEIntegerObject : ( RULE_INT ) ;
    public final void ruleEIntegerObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:327:2: ( ( RULE_INT ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:328:1: ( RULE_INT )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:328:1: ( RULE_INT )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:329:1: RULE_INT
            {
             before(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEIntegerObject635); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:342:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:343:1: ( ruleFloatValue EOF )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:344:1: ruleFloatValue EOF
            {
             before(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue661);
            ruleFloatValue();

            state._fsp--;

             after(grammarAccess.getFloatValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue668); 

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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:351:1: ruleFloatValue : ( ( rule__FloatValue__ValueAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:355:2: ( ( ( rule__FloatValue__ValueAssignment ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:356:1: ( ( rule__FloatValue__ValueAssignment ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:356:1: ( ( rule__FloatValue__ValueAssignment ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:357:1: ( rule__FloatValue__ValueAssignment )
            {
             before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:358:1: ( rule__FloatValue__ValueAssignment )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:358:2: rule__FloatValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue694);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:370:1: entryRuleEFloatObject : ruleEFloatObject EOF ;
    public final void entryRuleEFloatObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:371:1: ( ruleEFloatObject EOF )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:372:1: ruleEFloatObject EOF
            {
             before(grammarAccess.getEFloatObjectRule()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject721);
            ruleEFloatObject();

            state._fsp--;

             after(grammarAccess.getEFloatObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEFloatObject728); 

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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:379:1: ruleEFloatObject : ( ( rule__EFloatObject__Group__0 ) ) ;
    public final void ruleEFloatObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:383:2: ( ( ( rule__EFloatObject__Group__0 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:384:1: ( ( rule__EFloatObject__Group__0 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:384:1: ( ( rule__EFloatObject__Group__0 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:385:1: ( rule__EFloatObject__Group__0 )
            {
             before(grammarAccess.getEFloatObjectAccess().getGroup()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:386:1: ( rule__EFloatObject__Group__0 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:386:2: rule__EFloatObject__Group__0
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__0_in_ruleEFloatObject754);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:398:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:399:1: ( ruleQualifiedName EOF )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:400:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName781);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName788); 

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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:407:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:411:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:412:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:412:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:413:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:414:1: ( rule__QualifiedName__Group__0 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:414:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName814);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:426:1: rule__ValueObject__Alternatives : ( ( ruleStringValue ) | ( ruleIntegerValue ) | ( ruleFloatValue ) );
    public final void rule__ValueObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:430:1: ( ( ruleStringValue ) | ( ruleIntegerValue ) | ( ruleFloatValue ) )
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

                if ( (LA1_2==21) ) {
                    alt1=3;
                }
                else if ( (LA1_2==EOF) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case 20:
            case 21:
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
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:431:1: ( ruleStringValue )
                    {
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:431:1: ( ruleStringValue )
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:432:1: ruleStringValue
                    {
                     before(grammarAccess.getValueObjectAccess().getStringValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringValue_in_rule__ValueObject__Alternatives850);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getValueObjectAccess().getStringValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:437:6: ( ruleIntegerValue )
                    {
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:437:6: ( ruleIntegerValue )
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:438:1: ruleIntegerValue
                    {
                     before(grammarAccess.getValueObjectAccess().getIntegerValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntegerValue_in_rule__ValueObject__Alternatives867);
                    ruleIntegerValue();

                    state._fsp--;

                     after(grammarAccess.getValueObjectAccess().getIntegerValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:443:6: ( ruleFloatValue )
                    {
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:443:6: ( ruleFloatValue )
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:444:1: ruleFloatValue
                    {
                     before(grammarAccess.getValueObjectAccess().getFloatValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleFloatValue_in_rule__ValueObject__Alternatives884);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:456:1: rule__InterfaceModel__Group__0 : rule__InterfaceModel__Group__0__Impl rule__InterfaceModel__Group__1 ;
    public final void rule__InterfaceModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:460:1: ( rule__InterfaceModel__Group__0__Impl rule__InterfaceModel__Group__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:461:2: rule__InterfaceModel__Group__0__Impl rule__InterfaceModel__Group__1
            {
            pushFollow(FOLLOW_rule__InterfaceModel__Group__0__Impl_in_rule__InterfaceModel__Group__0914);
            rule__InterfaceModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfaceModel__Group__1_in_rule__InterfaceModel__Group__0917);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:468:1: rule__InterfaceModel__Group__0__Impl : ( 'interfaces for module' ) ;
    public final void rule__InterfaceModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:472:1: ( ( 'interfaces for module' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:473:1: ( 'interfaces for module' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:473:1: ( 'interfaces for module' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:474:1: 'interfaces for module'
            {
             before(grammarAccess.getInterfaceModelAccess().getInterfacesForModuleKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__InterfaceModel__Group__0__Impl945); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:487:1: rule__InterfaceModel__Group__1 : rule__InterfaceModel__Group__1__Impl rule__InterfaceModel__Group__2 ;
    public final void rule__InterfaceModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:491:1: ( rule__InterfaceModel__Group__1__Impl rule__InterfaceModel__Group__2 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:492:2: rule__InterfaceModel__Group__1__Impl rule__InterfaceModel__Group__2
            {
            pushFollow(FOLLOW_rule__InterfaceModel__Group__1__Impl_in_rule__InterfaceModel__Group__1976);
            rule__InterfaceModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfaceModel__Group__2_in_rule__InterfaceModel__Group__1979);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:499:1: rule__InterfaceModel__Group__1__Impl : ( ( rule__InterfaceModel__ModuleAssignment_1 ) ) ;
    public final void rule__InterfaceModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:503:1: ( ( ( rule__InterfaceModel__ModuleAssignment_1 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:504:1: ( ( rule__InterfaceModel__ModuleAssignment_1 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:504:1: ( ( rule__InterfaceModel__ModuleAssignment_1 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:505:1: ( rule__InterfaceModel__ModuleAssignment_1 )
            {
             before(grammarAccess.getInterfaceModelAccess().getModuleAssignment_1()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:506:1: ( rule__InterfaceModel__ModuleAssignment_1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:506:2: rule__InterfaceModel__ModuleAssignment_1
            {
            pushFollow(FOLLOW_rule__InterfaceModel__ModuleAssignment_1_in_rule__InterfaceModel__Group__1__Impl1006);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:516:1: rule__InterfaceModel__Group__2 : rule__InterfaceModel__Group__2__Impl rule__InterfaceModel__Group__3 ;
    public final void rule__InterfaceModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:520:1: ( rule__InterfaceModel__Group__2__Impl rule__InterfaceModel__Group__3 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:521:2: rule__InterfaceModel__Group__2__Impl rule__InterfaceModel__Group__3
            {
            pushFollow(FOLLOW_rule__InterfaceModel__Group__2__Impl_in_rule__InterfaceModel__Group__21036);
            rule__InterfaceModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfaceModel__Group__3_in_rule__InterfaceModel__Group__21039);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:528:1: rule__InterfaceModel__Group__2__Impl : ( 'version' ) ;
    public final void rule__InterfaceModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:532:1: ( ( 'version' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:533:1: ( 'version' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:533:1: ( 'version' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:534:1: 'version'
            {
             before(grammarAccess.getInterfaceModelAccess().getVersionKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__InterfaceModel__Group__2__Impl1067); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:547:1: rule__InterfaceModel__Group__3 : rule__InterfaceModel__Group__3__Impl rule__InterfaceModel__Group__4 ;
    public final void rule__InterfaceModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:551:1: ( rule__InterfaceModel__Group__3__Impl rule__InterfaceModel__Group__4 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:552:2: rule__InterfaceModel__Group__3__Impl rule__InterfaceModel__Group__4
            {
            pushFollow(FOLLOW_rule__InterfaceModel__Group__3__Impl_in_rule__InterfaceModel__Group__31098);
            rule__InterfaceModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfaceModel__Group__4_in_rule__InterfaceModel__Group__31101);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:559:1: rule__InterfaceModel__Group__3__Impl : ( ( rule__InterfaceModel__VersionAssignment_3 ) ) ;
    public final void rule__InterfaceModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:563:1: ( ( ( rule__InterfaceModel__VersionAssignment_3 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:564:1: ( ( rule__InterfaceModel__VersionAssignment_3 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:564:1: ( ( rule__InterfaceModel__VersionAssignment_3 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:565:1: ( rule__InterfaceModel__VersionAssignment_3 )
            {
             before(grammarAccess.getInterfaceModelAccess().getVersionAssignment_3()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:566:1: ( rule__InterfaceModel__VersionAssignment_3 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:566:2: rule__InterfaceModel__VersionAssignment_3
            {
            pushFollow(FOLLOW_rule__InterfaceModel__VersionAssignment_3_in_rule__InterfaceModel__Group__3__Impl1128);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:576:1: rule__InterfaceModel__Group__4 : rule__InterfaceModel__Group__4__Impl ;
    public final void rule__InterfaceModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:580:1: ( rule__InterfaceModel__Group__4__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:581:2: rule__InterfaceModel__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__InterfaceModel__Group__4__Impl_in_rule__InterfaceModel__Group__41158);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:587:1: rule__InterfaceModel__Group__4__Impl : ( ( ( rule__InterfaceModel__InterfacesAssignment_4 ) ) ( ( rule__InterfaceModel__InterfacesAssignment_4 )* ) ) ;
    public final void rule__InterfaceModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:591:1: ( ( ( ( rule__InterfaceModel__InterfacesAssignment_4 ) ) ( ( rule__InterfaceModel__InterfacesAssignment_4 )* ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:592:1: ( ( ( rule__InterfaceModel__InterfacesAssignment_4 ) ) ( ( rule__InterfaceModel__InterfacesAssignment_4 )* ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:592:1: ( ( ( rule__InterfaceModel__InterfacesAssignment_4 ) ) ( ( rule__InterfaceModel__InterfacesAssignment_4 )* ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:593:1: ( ( rule__InterfaceModel__InterfacesAssignment_4 ) ) ( ( rule__InterfaceModel__InterfacesAssignment_4 )* )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:593:1: ( ( rule__InterfaceModel__InterfacesAssignment_4 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:594:1: ( rule__InterfaceModel__InterfacesAssignment_4 )
            {
             before(grammarAccess.getInterfaceModelAccess().getInterfacesAssignment_4()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:595:1: ( rule__InterfaceModel__InterfacesAssignment_4 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:595:2: rule__InterfaceModel__InterfacesAssignment_4
            {
            pushFollow(FOLLOW_rule__InterfaceModel__InterfacesAssignment_4_in_rule__InterfaceModel__Group__4__Impl1187);
            rule__InterfaceModel__InterfacesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceModelAccess().getInterfacesAssignment_4()); 

            }

            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:598:1: ( ( rule__InterfaceModel__InterfacesAssignment_4 )* )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:599:1: ( rule__InterfaceModel__InterfacesAssignment_4 )*
            {
             before(grammarAccess.getInterfaceModelAccess().getInterfacesAssignment_4()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:600:1: ( rule__InterfaceModel__InterfacesAssignment_4 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:600:2: rule__InterfaceModel__InterfacesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__InterfaceModel__InterfacesAssignment_4_in_rule__InterfaceModel__Group__4__Impl1199);
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

        }
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:621:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:625:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:626:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__01242);
            rule__Interface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__01245);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:633:1: rule__Interface__Group__0__Impl : ( 'interface' ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:637:1: ( ( 'interface' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:638:1: ( 'interface' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:638:1: ( 'interface' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:639:1: 'interface'
            {
             before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Interface__Group__0__Impl1273); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:652:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:656:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:657:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__11304);
            rule__Interface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__11307);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:664:1: rule__Interface__Group__1__Impl : ( ( rule__Interface__NameAssignment_1 ) ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:668:1: ( ( ( rule__Interface__NameAssignment_1 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:669:1: ( ( rule__Interface__NameAssignment_1 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:669:1: ( ( rule__Interface__NameAssignment_1 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:670:1: ( rule__Interface__NameAssignment_1 )
            {
             before(grammarAccess.getInterfaceAccess().getNameAssignment_1()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:671:1: ( rule__Interface__NameAssignment_1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:671:2: rule__Interface__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Interface__NameAssignment_1_in_rule__Interface__Group__1__Impl1334);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:681:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl rule__Interface__Group__3 ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:685:1: ( rule__Interface__Group__2__Impl rule__Interface__Group__3 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:686:2: rule__Interface__Group__2__Impl rule__Interface__Group__3
            {
            pushFollow(FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__21364);
            rule__Interface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__3_in_rule__Interface__Group__21367);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:693:1: rule__Interface__Group__2__Impl : ( ( rule__Interface__Group_2__0 )? ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:697:1: ( ( ( rule__Interface__Group_2__0 )? ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:698:1: ( ( rule__Interface__Group_2__0 )? )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:698:1: ( ( rule__Interface__Group_2__0 )? )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:699:1: ( rule__Interface__Group_2__0 )?
            {
             before(grammarAccess.getInterfaceAccess().getGroup_2()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:700:1: ( rule__Interface__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:700:2: rule__Interface__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Interface__Group_2__0_in_rule__Interface__Group__2__Impl1394);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:710:1: rule__Interface__Group__3 : rule__Interface__Group__3__Impl rule__Interface__Group__4 ;
    public final void rule__Interface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:714:1: ( rule__Interface__Group__3__Impl rule__Interface__Group__4 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:715:2: rule__Interface__Group__3__Impl rule__Interface__Group__4
            {
            pushFollow(FOLLOW_rule__Interface__Group__3__Impl_in_rule__Interface__Group__31425);
            rule__Interface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__4_in_rule__Interface__Group__31428);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:722:1: rule__Interface__Group__3__Impl : ( '{' ) ;
    public final void rule__Interface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:726:1: ( ( '{' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:727:1: ( '{' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:727:1: ( '{' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:728:1: '{'
            {
             before(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__Interface__Group__3__Impl1456); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:741:1: rule__Interface__Group__4 : rule__Interface__Group__4__Impl rule__Interface__Group__5 ;
    public final void rule__Interface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:745:1: ( rule__Interface__Group__4__Impl rule__Interface__Group__5 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:746:2: rule__Interface__Group__4__Impl rule__Interface__Group__5
            {
            pushFollow(FOLLOW_rule__Interface__Group__4__Impl_in_rule__Interface__Group__41487);
            rule__Interface__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__5_in_rule__Interface__Group__41490);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:753:1: rule__Interface__Group__4__Impl : ( ( rule__Interface__MethodsAssignment_4 )* ) ;
    public final void rule__Interface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:757:1: ( ( ( rule__Interface__MethodsAssignment_4 )* ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:758:1: ( ( rule__Interface__MethodsAssignment_4 )* )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:758:1: ( ( rule__Interface__MethodsAssignment_4 )* )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:759:1: ( rule__Interface__MethodsAssignment_4 )*
            {
             before(grammarAccess.getInterfaceAccess().getMethodsAssignment_4()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:760:1: ( rule__Interface__MethodsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:760:2: rule__Interface__MethodsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Interface__MethodsAssignment_4_in_rule__Interface__Group__4__Impl1517);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:770:1: rule__Interface__Group__5 : rule__Interface__Group__5__Impl ;
    public final void rule__Interface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:774:1: ( rule__Interface__Group__5__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:775:2: rule__Interface__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group__5__Impl_in_rule__Interface__Group__51548);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:781:1: rule__Interface__Group__5__Impl : ( '}' ) ;
    public final void rule__Interface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:785:1: ( ( '}' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:786:1: ( '}' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:786:1: ( '}' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:787:1: '}'
            {
             before(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__Interface__Group__5__Impl1576); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:812:1: rule__Interface__Group_2__0 : rule__Interface__Group_2__0__Impl rule__Interface__Group_2__1 ;
    public final void rule__Interface__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:816:1: ( rule__Interface__Group_2__0__Impl rule__Interface__Group_2__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:817:2: rule__Interface__Group_2__0__Impl rule__Interface__Group_2__1
            {
            pushFollow(FOLLOW_rule__Interface__Group_2__0__Impl_in_rule__Interface__Group_2__01619);
            rule__Interface__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_2__1_in_rule__Interface__Group_2__01622);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:824:1: rule__Interface__Group_2__0__Impl : ( 'requires' ) ;
    public final void rule__Interface__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:828:1: ( ( 'requires' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:829:1: ( 'requires' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:829:1: ( 'requires' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:830:1: 'requires'
            {
             before(grammarAccess.getInterfaceAccess().getRequiresKeyword_2_0()); 
            match(input,16,FOLLOW_16_in_rule__Interface__Group_2__0__Impl1650); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:843:1: rule__Interface__Group_2__1 : rule__Interface__Group_2__1__Impl rule__Interface__Group_2__2 ;
    public final void rule__Interface__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:847:1: ( rule__Interface__Group_2__1__Impl rule__Interface__Group_2__2 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:848:2: rule__Interface__Group_2__1__Impl rule__Interface__Group_2__2
            {
            pushFollow(FOLLOW_rule__Interface__Group_2__1__Impl_in_rule__Interface__Group_2__11681);
            rule__Interface__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_2__2_in_rule__Interface__Group_2__11684);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:855:1: rule__Interface__Group_2__1__Impl : ( ( rule__Interface__RequiredInterfacesAssignment_2_1 ) ) ;
    public final void rule__Interface__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:859:1: ( ( ( rule__Interface__RequiredInterfacesAssignment_2_1 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:860:1: ( ( rule__Interface__RequiredInterfacesAssignment_2_1 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:860:1: ( ( rule__Interface__RequiredInterfacesAssignment_2_1 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:861:1: ( rule__Interface__RequiredInterfacesAssignment_2_1 )
            {
             before(grammarAccess.getInterfaceAccess().getRequiredInterfacesAssignment_2_1()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:862:1: ( rule__Interface__RequiredInterfacesAssignment_2_1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:862:2: rule__Interface__RequiredInterfacesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Interface__RequiredInterfacesAssignment_2_1_in_rule__Interface__Group_2__1__Impl1711);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:872:1: rule__Interface__Group_2__2 : rule__Interface__Group_2__2__Impl ;
    public final void rule__Interface__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:876:1: ( rule__Interface__Group_2__2__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:877:2: rule__Interface__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group_2__2__Impl_in_rule__Interface__Group_2__21741);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:883:1: rule__Interface__Group_2__2__Impl : ( ( rule__Interface__Group_2_2__0 )* ) ;
    public final void rule__Interface__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:887:1: ( ( ( rule__Interface__Group_2_2__0 )* ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:888:1: ( ( rule__Interface__Group_2_2__0 )* )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:888:1: ( ( rule__Interface__Group_2_2__0 )* )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:889:1: ( rule__Interface__Group_2_2__0 )*
            {
             before(grammarAccess.getInterfaceAccess().getGroup_2_2()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:890:1: ( rule__Interface__Group_2_2__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:890:2: rule__Interface__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Interface__Group_2_2__0_in_rule__Interface__Group_2__2__Impl1768);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:906:1: rule__Interface__Group_2_2__0 : rule__Interface__Group_2_2__0__Impl rule__Interface__Group_2_2__1 ;
    public final void rule__Interface__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:910:1: ( rule__Interface__Group_2_2__0__Impl rule__Interface__Group_2_2__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:911:2: rule__Interface__Group_2_2__0__Impl rule__Interface__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Interface__Group_2_2__0__Impl_in_rule__Interface__Group_2_2__01805);
            rule__Interface__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_2_2__1_in_rule__Interface__Group_2_2__01808);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:918:1: rule__Interface__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Interface__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:922:1: ( ( ',' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:923:1: ( ',' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:923:1: ( ',' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:924:1: ','
            {
             before(grammarAccess.getInterfaceAccess().getCommaKeyword_2_2_0()); 
            match(input,17,FOLLOW_17_in_rule__Interface__Group_2_2__0__Impl1836); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:937:1: rule__Interface__Group_2_2__1 : rule__Interface__Group_2_2__1__Impl ;
    public final void rule__Interface__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:941:1: ( rule__Interface__Group_2_2__1__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:942:2: rule__Interface__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group_2_2__1__Impl_in_rule__Interface__Group_2_2__11867);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:948:1: rule__Interface__Group_2_2__1__Impl : ( ( rule__Interface__RequiredInterfacesAssignment_2_2_1 ) ) ;
    public final void rule__Interface__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:952:1: ( ( ( rule__Interface__RequiredInterfacesAssignment_2_2_1 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:953:1: ( ( rule__Interface__RequiredInterfacesAssignment_2_2_1 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:953:1: ( ( rule__Interface__RequiredInterfacesAssignment_2_2_1 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:954:1: ( rule__Interface__RequiredInterfacesAssignment_2_2_1 )
            {
             before(grammarAccess.getInterfaceAccess().getRequiredInterfacesAssignment_2_2_1()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:955:1: ( rule__Interface__RequiredInterfacesAssignment_2_2_1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:955:2: rule__Interface__RequiredInterfacesAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Interface__RequiredInterfacesAssignment_2_2_1_in_rule__Interface__Group_2_2__1__Impl1894);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:969:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:973:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:974:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__01928);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__1_in_rule__Method__Group__01931);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:981:1: rule__Method__Group__0__Impl : ( ( rule__Method__IsStaticAssignment_0 )? ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:985:1: ( ( ( rule__Method__IsStaticAssignment_0 )? ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:986:1: ( ( rule__Method__IsStaticAssignment_0 )? )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:986:1: ( ( rule__Method__IsStaticAssignment_0 )? )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:987:1: ( rule__Method__IsStaticAssignment_0 )?
            {
             before(grammarAccess.getMethodAccess().getIsStaticAssignment_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:988:1: ( rule__Method__IsStaticAssignment_0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:988:2: rule__Method__IsStaticAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Method__IsStaticAssignment_0_in_rule__Method__Group__0__Impl1958);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:998:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1002:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1003:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__11989);
            rule__Method__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__2_in_rule__Method__Group__11992);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1010:1: rule__Method__Group__1__Impl : ( ( rule__Method__TypeAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1014:1: ( ( ( rule__Method__TypeAssignment_1 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1015:1: ( ( rule__Method__TypeAssignment_1 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1015:1: ( ( rule__Method__TypeAssignment_1 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1016:1: ( rule__Method__TypeAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getTypeAssignment_1()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1017:1: ( rule__Method__TypeAssignment_1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1017:2: rule__Method__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Method__TypeAssignment_1_in_rule__Method__Group__1__Impl2019);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1027:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1031:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1032:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__22049);
            rule__Method__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__3_in_rule__Method__Group__22052);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1039:1: rule__Method__Group__2__Impl : ( ( rule__Method__NameAssignment_2 ) ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1043:1: ( ( ( rule__Method__NameAssignment_2 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1044:1: ( ( rule__Method__NameAssignment_2 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1044:1: ( ( rule__Method__NameAssignment_2 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1045:1: ( rule__Method__NameAssignment_2 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_2()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1046:1: ( rule__Method__NameAssignment_2 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1046:2: rule__Method__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Method__NameAssignment_2_in_rule__Method__Group__2__Impl2079);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1056:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1060:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1061:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__32109);
            rule__Method__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__4_in_rule__Method__Group__32112);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1068:1: rule__Method__Group__3__Impl : ( ( rule__Method__ParametersAssignment_3 )* ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1072:1: ( ( ( rule__Method__ParametersAssignment_3 )* ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1073:1: ( ( rule__Method__ParametersAssignment_3 )* )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1073:1: ( ( rule__Method__ParametersAssignment_3 )* )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1074:1: ( rule__Method__ParametersAssignment_3 )*
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_3()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1075:1: ( rule__Method__ParametersAssignment_3 )*
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
            	    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1075:2: rule__Method__ParametersAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Method__ParametersAssignment_3_in_rule__Method__Group__3__Impl2139);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1085:1: rule__Method__Group__4 : rule__Method__Group__4__Impl ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1089:1: ( rule__Method__Group__4__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1090:2: rule__Method__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__42170);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1096:1: rule__Method__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1100:1: ( ( ( ';' )? ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1101:1: ( ( ';' )? )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1101:1: ( ( ';' )? )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1102:1: ( ';' )?
            {
             before(grammarAccess.getMethodAccess().getSemicolonKeyword_4()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1103:1: ( ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1104:2: ';'
                    {
                    match(input,18,FOLLOW_18_in_rule__Method__Group__4__Impl2199); 

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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1125:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1129:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1130:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__02242);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__02245);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1137:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__SignaturePartAssignment_0 )? ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1141:1: ( ( ( rule__Parameter__SignaturePartAssignment_0 )? ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1142:1: ( ( rule__Parameter__SignaturePartAssignment_0 )? )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1142:1: ( ( rule__Parameter__SignaturePartAssignment_0 )? )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1143:1: ( rule__Parameter__SignaturePartAssignment_0 )?
            {
             before(grammarAccess.getParameterAccess().getSignaturePartAssignment_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1144:1: ( rule__Parameter__SignaturePartAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1144:2: rule__Parameter__SignaturePartAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Parameter__SignaturePartAssignment_0_in_rule__Parameter__Group__0__Impl2272);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1154:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1158:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1159:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__12303);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__12306);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1166:1: rule__Parameter__Group__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1170:1: ( ( ':' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1171:1: ( ':' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1171:1: ( ':' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1172:1: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__Parameter__Group__1__Impl2334); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1185:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1189:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1190:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__22365);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__22368);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1197:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__TypeAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1201:1: ( ( ( rule__Parameter__TypeAssignment_2 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1202:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1202:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1203:1: ( rule__Parameter__TypeAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_2()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1204:1: ( rule__Parameter__TypeAssignment_2 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1204:2: rule__Parameter__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Parameter__TypeAssignment_2_in_rule__Parameter__Group__2__Impl2395);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1214:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1218:1: ( rule__Parameter__Group__3__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1219:2: rule__Parameter__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__32425);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1225:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__NameAssignment_3 ) ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1229:1: ( ( ( rule__Parameter__NameAssignment_3 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1230:1: ( ( rule__Parameter__NameAssignment_3 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1230:1: ( ( rule__Parameter__NameAssignment_3 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1231:1: ( rule__Parameter__NameAssignment_3 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_3()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1232:1: ( rule__Parameter__NameAssignment_3 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1232:2: rule__Parameter__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_3_in_rule__Parameter__Group__3__Impl2452);
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


    // $ANTLR start "rule__TypeRef__Group__0"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1253:1: rule__TypeRef__Group__0 : rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 ;
    public final void rule__TypeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1257:1: ( rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1258:2: rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__02493);
            rule__TypeRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__02496);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1265:1: rule__TypeRef__Group__0__Impl : ( ( rule__TypeRef__ReferencedAssignment_0 ) ) ;
    public final void rule__TypeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1269:1: ( ( ( rule__TypeRef__ReferencedAssignment_0 ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1270:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1270:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1271:1: ( rule__TypeRef__ReferencedAssignment_0 )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedAssignment_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1272:1: ( rule__TypeRef__ReferencedAssignment_0 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1272:2: rule__TypeRef__ReferencedAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl2523);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1282:1: rule__TypeRef__Group__1 : rule__TypeRef__Group__1__Impl ;
    public final void rule__TypeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1286:1: ( rule__TypeRef__Group__1__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1287:2: rule__TypeRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__12553);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1293:1: rule__TypeRef__Group__1__Impl : ( ( rule__TypeRef__IsMultiAssignment_1 )? ) ;
    public final void rule__TypeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1297:1: ( ( ( rule__TypeRef__IsMultiAssignment_1 )? ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1298:1: ( ( rule__TypeRef__IsMultiAssignment_1 )? )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1298:1: ( ( rule__TypeRef__IsMultiAssignment_1 )? )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1299:1: ( rule__TypeRef__IsMultiAssignment_1 )?
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiAssignment_1()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1300:1: ( rule__TypeRef__IsMultiAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1300:2: rule__TypeRef__IsMultiAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TypeRef__IsMultiAssignment_1_in_rule__TypeRef__Group__1__Impl2580);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1314:1: rule__EFloatObject__Group__0 : rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1 ;
    public final void rule__EFloatObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1318:1: ( rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1319:2: rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__0__Impl_in_rule__EFloatObject__Group__02615);
            rule__EFloatObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__1_in_rule__EFloatObject__Group__02618);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1326:1: rule__EFloatObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloatObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1330:1: ( ( ( '-' )? ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1331:1: ( ( '-' )? )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1331:1: ( ( '-' )? )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1332:1: ( '-' )?
            {
             before(grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1333:1: ( '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1334:2: '-'
                    {
                    match(input,20,FOLLOW_20_in_rule__EFloatObject__Group__0__Impl2647); 

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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1345:1: rule__EFloatObject__Group__1 : rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2 ;
    public final void rule__EFloatObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1349:1: ( rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1350:2: rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__1__Impl_in_rule__EFloatObject__Group__12680);
            rule__EFloatObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__2_in_rule__EFloatObject__Group__12683);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1357:1: rule__EFloatObject__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloatObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1361:1: ( ( ( RULE_INT )? ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1362:1: ( ( RULE_INT )? )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1362:1: ( ( RULE_INT )? )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1363:1: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1364:1: ( RULE_INT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1364:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EFloatObject__Group__1__Impl2711); 

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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1374:1: rule__EFloatObject__Group__2 : rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3 ;
    public final void rule__EFloatObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1378:1: ( rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1379:2: rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__2__Impl_in_rule__EFloatObject__Group__22742);
            rule__EFloatObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__3_in_rule__EFloatObject__Group__22745);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1386:1: rule__EFloatObject__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloatObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1390:1: ( ( '.' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1391:1: ( '.' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1391:1: ( '.' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1392:1: '.'
            {
             before(grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__EFloatObject__Group__2__Impl2773); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1405:1: rule__EFloatObject__Group__3 : rule__EFloatObject__Group__3__Impl ;
    public final void rule__EFloatObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1409:1: ( rule__EFloatObject__Group__3__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1410:2: rule__EFloatObject__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__3__Impl_in_rule__EFloatObject__Group__32804);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1416:1: rule__EFloatObject__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloatObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1420:1: ( ( RULE_INT ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1421:1: ( RULE_INT )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1421:1: ( RULE_INT )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1422:1: RULE_INT
            {
             before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EFloatObject__Group__3__Impl2831); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1441:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1445:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1446:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02868);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02871);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1453:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1457:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1458:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1458:1: ( RULE_ID )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1459:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2898); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1470:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1474:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1475:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12927);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1481:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1485:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1486:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1486:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1487:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1488:1: ( rule__QualifiedName__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==21) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1488:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2954);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1502:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1506:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1507:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02989);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02992);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1514:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1518:1: ( ( '.' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1519:1: ( '.' )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1519:1: ( '.' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1520:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,21,FOLLOW_21_in_rule__QualifiedName__Group_1__0__Impl3020); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1533:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1537:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1538:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13051);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1544:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1548:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1549:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1549:1: ( RULE_ID )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1550:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3078); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1566:1: rule__InterfaceModel__ModuleAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__InterfaceModel__ModuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1570:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1571:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1571:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1572:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getInterfaceModelAccess().getModuleModuleCrossReference_1_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1573:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1574:1: ruleQualifiedName
            {
             before(grammarAccess.getInterfaceModelAccess().getModuleModuleQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__InterfaceModel__ModuleAssignment_13120);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1585:1: rule__InterfaceModel__VersionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__InterfaceModel__VersionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1589:1: ( ( RULE_STRING ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1590:1: ( RULE_STRING )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1590:1: ( RULE_STRING )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1591:1: RULE_STRING
            {
             before(grammarAccess.getInterfaceModelAccess().getVersionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__InterfaceModel__VersionAssignment_33155); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1600:1: rule__InterfaceModel__InterfacesAssignment_4 : ( ruleInterface ) ;
    public final void rule__InterfaceModel__InterfacesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1604:1: ( ( ruleInterface ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1605:1: ( ruleInterface )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1605:1: ( ruleInterface )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1606:1: ruleInterface
            {
             before(grammarAccess.getInterfaceModelAccess().getInterfacesInterfaceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleInterface_in_rule__InterfaceModel__InterfacesAssignment_43186);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1615:1: rule__Interface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Interface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1619:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1620:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1620:1: ( RULE_ID )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1621:1: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interface__NameAssignment_13217); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1630:1: rule__Interface__RequiredInterfacesAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Interface__RequiredInterfacesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1634:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1635:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1635:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1636:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getInterfaceAccess().getRequiredInterfacesInterfaceCrossReference_2_1_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1637:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1638:1: ruleQualifiedName
            {
             before(grammarAccess.getInterfaceAccess().getRequiredInterfacesInterfaceQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Interface__RequiredInterfacesAssignment_2_13252);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1649:1: rule__Interface__RequiredInterfacesAssignment_2_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Interface__RequiredInterfacesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1653:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1654:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1654:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1655:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getInterfaceAccess().getRequiredInterfacesInterfaceCrossReference_2_2_1_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1656:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1657:1: ruleQualifiedName
            {
             before(grammarAccess.getInterfaceAccess().getRequiredInterfacesInterfaceQualifiedNameParserRuleCall_2_2_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Interface__RequiredInterfacesAssignment_2_2_13291);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1668:1: rule__Interface__MethodsAssignment_4 : ( ruleMethod ) ;
    public final void rule__Interface__MethodsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1672:1: ( ( ruleMethod ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1673:1: ( ruleMethod )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1673:1: ( ruleMethod )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1674:1: ruleMethod
            {
             before(grammarAccess.getInterfaceAccess().getMethodsMethodParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMethod_in_rule__Interface__MethodsAssignment_43326);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1683:1: rule__Method__IsStaticAssignment_0 : ( ( 'static' ) ) ;
    public final void rule__Method__IsStaticAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1687:1: ( ( ( 'static' ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1688:1: ( ( 'static' ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1688:1: ( ( 'static' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1689:1: ( 'static' )
            {
             before(grammarAccess.getMethodAccess().getIsStaticStaticKeyword_0_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1690:1: ( 'static' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1691:1: 'static'
            {
             before(grammarAccess.getMethodAccess().getIsStaticStaticKeyword_0_0()); 
            match(input,22,FOLLOW_22_in_rule__Method__IsStaticAssignment_03362); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1706:1: rule__Method__TypeAssignment_1 : ( ruleTypeRef ) ;
    public final void rule__Method__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1710:1: ( ( ruleTypeRef ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1711:1: ( ruleTypeRef )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1711:1: ( ruleTypeRef )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1712:1: ruleTypeRef
            {
             before(grammarAccess.getMethodAccess().getTypeTypeRefParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Method__TypeAssignment_13401);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1721:1: rule__Method__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1725:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1726:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1726:1: ( RULE_ID )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1727:1: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Method__NameAssignment_23432); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1736:1: rule__Method__ParametersAssignment_3 : ( ruleParameter ) ;
    public final void rule__Method__ParametersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1740:1: ( ( ruleParameter ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1741:1: ( ruleParameter )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1741:1: ( ruleParameter )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1742:1: ruleParameter
            {
             before(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Method__ParametersAssignment_33463);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1751:1: rule__Parameter__SignaturePartAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__SignaturePartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1755:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1756:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1756:1: ( RULE_ID )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1757:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getSignaturePartIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__SignaturePartAssignment_03494); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1766:1: rule__Parameter__TypeAssignment_2 : ( ruleTypeRef ) ;
    public final void rule__Parameter__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1770:1: ( ( ruleTypeRef ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1771:1: ( ruleTypeRef )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1771:1: ( ruleTypeRef )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1772:1: ruleTypeRef
            {
             before(grammarAccess.getParameterAccess().getTypeTypeRefParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Parameter__TypeAssignment_23525);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1781:1: rule__Parameter__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1785:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1786:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1786:1: ( RULE_ID )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1787:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_33556); 
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


    // $ANTLR start "rule__TypeRef__ReferencedAssignment_0"
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1802:1: rule__TypeRef__ReferencedAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TypeRef__ReferencedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1806:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1807:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1807:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1808:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1809:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1810:1: ruleQualifiedName
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_03597);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1821:1: rule__TypeRef__IsMultiAssignment_1 : ( ( '[]' ) ) ;
    public final void rule__TypeRef__IsMultiAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1825:1: ( ( ( '[]' ) ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1826:1: ( ( '[]' ) )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1826:1: ( ( '[]' ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1827:1: ( '[]' )
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1828:1: ( '[]' )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1829:1: '[]'
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            match(input,23,FOLLOW_23_in_rule__TypeRef__IsMultiAssignment_13637); 
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1844:1: rule__StringValue__ValueAssignment : ( ruleEStringObject ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1848:1: ( ( ruleEStringObject ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1849:1: ( ruleEStringObject )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1849:1: ( ruleEStringObject )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1850:1: ruleEStringObject
            {
             before(grammarAccess.getStringValueAccess().getValueEStringObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEStringObject_in_rule__StringValue__ValueAssignment3676);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1859:1: rule__IntegerValue__ValueAssignment : ( ruleEIntegerObject ) ;
    public final void rule__IntegerValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1863:1: ( ( ruleEIntegerObject ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1864:1: ( ruleEIntegerObject )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1864:1: ( ruleEIntegerObject )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1865:1: ruleEIntegerObject
            {
             before(grammarAccess.getIntegerValueAccess().getValueEIntegerObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_rule__IntegerValue__ValueAssignment3707);
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
    // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1874:1: rule__FloatValue__ValueAssignment : ( ruleEFloatObject ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1878:1: ( ( ruleEFloatObject ) )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1879:1: ( ruleEFloatObject )
            {
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1879:1: ( ruleEFloatObject )
            // ../de.dubmas.modulob.interfacedsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalInterfaceDsl.g:1880:1: ruleEFloatObject
            {
             before(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_rule__FloatValue__ValueAssignment3738);
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
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueObject_in_entryRuleValueObject363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueObject370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueObject__Alternatives_in_ruleValueObject396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_entryRuleEStringObject483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEStringObject490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEStringObject516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerValue__ValueAssignment_in_ruleIntegerValue575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEIntegerObject609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEIntegerObject635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEFloatObject728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__0_in_ruleEFloatObject754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__ValueObject__Alternatives850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_rule__ValueObject__Alternatives867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_rule__ValueObject__Alternatives884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceModel__Group__0__Impl_in_rule__InterfaceModel__Group__0914 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__InterfaceModel__Group__1_in_rule__InterfaceModel__Group__0917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__InterfaceModel__Group__0__Impl945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceModel__Group__1__Impl_in_rule__InterfaceModel__Group__1976 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__InterfaceModel__Group__2_in_rule__InterfaceModel__Group__1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceModel__ModuleAssignment_1_in_rule__InterfaceModel__Group__1__Impl1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceModel__Group__2__Impl_in_rule__InterfaceModel__Group__21036 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InterfaceModel__Group__3_in_rule__InterfaceModel__Group__21039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__InterfaceModel__Group__2__Impl1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceModel__Group__3__Impl_in_rule__InterfaceModel__Group__31098 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__InterfaceModel__Group__4_in_rule__InterfaceModel__Group__31101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceModel__VersionAssignment_3_in_rule__InterfaceModel__Group__3__Impl1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceModel__Group__4__Impl_in_rule__InterfaceModel__Group__41158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceModel__InterfacesAssignment_4_in_rule__InterfaceModel__Group__4__Impl1187 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__InterfaceModel__InterfacesAssignment_4_in_rule__InterfaceModel__Group__4__Impl1199 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__01242 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__01245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Interface__Group__0__Impl1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__11304 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__11307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__NameAssignment_1_in_rule__Interface__Group__1__Impl1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__21364 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Interface__Group__3_in_rule__Interface__Group__21367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_2__0_in_rule__Interface__Group__2__Impl1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__3__Impl_in_rule__Interface__Group__31425 = new BitSet(new long[]{0x0000000000408040L});
    public static final BitSet FOLLOW_rule__Interface__Group__4_in_rule__Interface__Group__31428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Interface__Group__3__Impl1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__4__Impl_in_rule__Interface__Group__41487 = new BitSet(new long[]{0x0000000000408040L});
    public static final BitSet FOLLOW_rule__Interface__Group__5_in_rule__Interface__Group__41490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__MethodsAssignment_4_in_rule__Interface__Group__4__Impl1517 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_rule__Interface__Group__5__Impl_in_rule__Interface__Group__51548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Interface__Group__5__Impl1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_2__0__Impl_in_rule__Interface__Group_2__01619 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Interface__Group_2__1_in_rule__Interface__Group_2__01622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Interface__Group_2__0__Impl1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_2__1__Impl_in_rule__Interface__Group_2__11681 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Interface__Group_2__2_in_rule__Interface__Group_2__11684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__RequiredInterfacesAssignment_2_1_in_rule__Interface__Group_2__1__Impl1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_2__2__Impl_in_rule__Interface__Group_2__21741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_2_2__0_in_rule__Interface__Group_2__2__Impl1768 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Interface__Group_2_2__0__Impl_in_rule__Interface__Group_2_2__01805 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Interface__Group_2_2__1_in_rule__Interface__Group_2_2__01808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Interface__Group_2_2__0__Impl1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_2_2__1__Impl_in_rule__Interface__Group_2_2__11867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__RequiredInterfacesAssignment_2_2_1_in_rule__Interface__Group_2_2__1__Impl1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__01928 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_rule__Method__Group__1_in_rule__Method__Group__01931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__IsStaticAssignment_0_in_rule__Method__Group__0__Impl1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__11989 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Method__Group__2_in_rule__Method__Group__11992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__TypeAssignment_1_in_rule__Method__Group__1__Impl2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__22049 = new BitSet(new long[]{0x00000000000C0040L});
    public static final BitSet FOLLOW_rule__Method__Group__3_in_rule__Method__Group__22052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__NameAssignment_2_in_rule__Method__Group__2__Impl2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__32109 = new BitSet(new long[]{0x00000000000C0040L});
    public static final BitSet FOLLOW_rule__Method__Group__4_in_rule__Method__Group__32112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ParametersAssignment_3_in_rule__Method__Group__3__Impl2139 = new BitSet(new long[]{0x0000000000080042L});
    public static final BitSet FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__42170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Method__Group__4__Impl2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__02242 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__02245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__SignaturePartAssignment_0_in_rule__Parameter__Group__0__Impl2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__12303 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__12306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Parameter__Group__1__Impl2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__22365 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__22368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_2_in_rule__Parameter__Group__2__Impl2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__3__Impl_in_rule__Parameter__Group__32425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_3_in_rule__Parameter__Group__3__Impl2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__02493 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__02496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__12553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__IsMultiAssignment_1_in_rule__TypeRef__Group__1__Impl2580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__0__Impl_in_rule__EFloatObject__Group__02615 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__1_in_rule__EFloatObject__Group__02618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EFloatObject__Group__0__Impl2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__1__Impl_in_rule__EFloatObject__Group__12680 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__2_in_rule__EFloatObject__Group__12683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group__1__Impl2711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__2__Impl_in_rule__EFloatObject__Group__22742 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__3_in_rule__EFloatObject__Group__22745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EFloatObject__Group__2__Impl2773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__3__Impl_in_rule__EFloatObject__Group__32804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group__3__Impl2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02868 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2954 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02989 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__QualifiedName__Group_1__0__Impl3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__InterfaceModel__ModuleAssignment_13120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__InterfaceModel__VersionAssignment_33155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_rule__InterfaceModel__InterfacesAssignment_43186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interface__NameAssignment_13217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Interface__RequiredInterfacesAssignment_2_13252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Interface__RequiredInterfacesAssignment_2_2_13291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__Interface__MethodsAssignment_43326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Method__IsStaticAssignment_03362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Method__TypeAssignment_13401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Method__NameAssignment_23432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Method__ParametersAssignment_33463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__SignaturePartAssignment_03494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Parameter__TypeAssignment_23525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_33556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_03597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TypeRef__IsMultiAssignment_13637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_rule__StringValue__ValueAssignment3676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_rule__IntegerValue__ValueAssignment3707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_rule__FloatValue__ValueAssignment3738 = new BitSet(new long[]{0x0000000000000002L});

}