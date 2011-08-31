package de.dubmas.modulob.common.ui.contentassist.antlr.internal; 

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
import de.dubmas.modulob.common.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'primitive type'", "'any type'", "'-'", "'.'", "'[]'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_STRING=4;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g"; }


     
     	private DslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleTypeLib"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:60:1: entryRuleTypeLib : ruleTypeLib EOF ;
    public final void entryRuleTypeLib() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:61:1: ( ruleTypeLib EOF )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:62:1: ruleTypeLib EOF
            {
             before(grammarAccess.getTypeLibRule()); 
            pushFollow(FOLLOW_ruleTypeLib_in_entryRuleTypeLib61);
            ruleTypeLib();

            state._fsp--;

             after(grammarAccess.getTypeLibRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeLib68); 

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
    // $ANTLR end "entryRuleTypeLib"


    // $ANTLR start "ruleTypeLib"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:69:1: ruleTypeLib : ( ( rule__TypeLib__Group__0 ) ) ;
    public final void ruleTypeLib() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:73:2: ( ( ( rule__TypeLib__Group__0 ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:74:1: ( ( rule__TypeLib__Group__0 ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:74:1: ( ( rule__TypeLib__Group__0 ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:75:1: ( rule__TypeLib__Group__0 )
            {
             before(grammarAccess.getTypeLibAccess().getGroup()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:76:1: ( rule__TypeLib__Group__0 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:76:2: rule__TypeLib__Group__0
            {
            pushFollow(FOLLOW_rule__TypeLib__Group__0_in_ruleTypeLib94);
            rule__TypeLib__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeLibAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeLib"


    // $ANTLR start "entryRulePrimitive"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:88:1: entryRulePrimitive : rulePrimitive EOF ;
    public final void entryRulePrimitive() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:89:1: ( rulePrimitive EOF )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:90:1: rulePrimitive EOF
            {
             before(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive121);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getPrimitiveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive128); 

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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:97:1: rulePrimitive : ( ( rule__Primitive__Group__0 ) ) ;
    public final void rulePrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:101:2: ( ( ( rule__Primitive__Group__0 ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:102:1: ( ( rule__Primitive__Group__0 ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:102:1: ( ( rule__Primitive__Group__0 ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:103:1: ( rule__Primitive__Group__0 )
            {
             before(grammarAccess.getPrimitiveAccess().getGroup()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:104:1: ( rule__Primitive__Group__0 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:104:2: rule__Primitive__Group__0
            {
            pushFollow(FOLLOW_rule__Primitive__Group__0_in_rulePrimitive154);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:116:1: entryRuleAny : ruleAny EOF ;
    public final void entryRuleAny() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:117:1: ( ruleAny EOF )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:118:1: ruleAny EOF
            {
             before(grammarAccess.getAnyRule()); 
            pushFollow(FOLLOW_ruleAny_in_entryRuleAny181);
            ruleAny();

            state._fsp--;

             after(grammarAccess.getAnyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAny188); 

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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:125:1: ruleAny : ( ( rule__Any__Group__0 ) ) ;
    public final void ruleAny() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:129:2: ( ( ( rule__Any__Group__0 ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:130:1: ( ( rule__Any__Group__0 ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:130:1: ( ( rule__Any__Group__0 ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:131:1: ( rule__Any__Group__0 )
            {
             before(grammarAccess.getAnyAccess().getGroup()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:132:1: ( rule__Any__Group__0 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:132:2: rule__Any__Group__0
            {
            pushFollow(FOLLOW_rule__Any__Group__0_in_ruleAny214);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:146:1: entryRuleTypeRef : ruleTypeRef EOF ;
    public final void entryRuleTypeRef() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:147:1: ( ruleTypeRef EOF )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:148:1: ruleTypeRef EOF
            {
             before(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef243);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getTypeRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef250); 

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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:155:1: ruleTypeRef : ( ( rule__TypeRef__Group__0 ) ) ;
    public final void ruleTypeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:159:2: ( ( ( rule__TypeRef__Group__0 ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:160:1: ( ( rule__TypeRef__Group__0 ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:160:1: ( ( rule__TypeRef__Group__0 ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:161:1: ( rule__TypeRef__Group__0 )
            {
             before(grammarAccess.getTypeRefAccess().getGroup()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:162:1: ( rule__TypeRef__Group__0 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:162:2: rule__TypeRef__Group__0
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef276);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:174:1: entryRuleValueObject : ruleValueObject EOF ;
    public final void entryRuleValueObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:175:1: ( ruleValueObject EOF )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:176:1: ruleValueObject EOF
            {
             before(grammarAccess.getValueObjectRule()); 
            pushFollow(FOLLOW_ruleValueObject_in_entryRuleValueObject303);
            ruleValueObject();

            state._fsp--;

             after(grammarAccess.getValueObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueObject310); 

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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:183:1: ruleValueObject : ( ( rule__ValueObject__Alternatives ) ) ;
    public final void ruleValueObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:187:2: ( ( ( rule__ValueObject__Alternatives ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:188:1: ( ( rule__ValueObject__Alternatives ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:188:1: ( ( rule__ValueObject__Alternatives ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:189:1: ( rule__ValueObject__Alternatives )
            {
             before(grammarAccess.getValueObjectAccess().getAlternatives()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:190:1: ( rule__ValueObject__Alternatives )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:190:2: rule__ValueObject__Alternatives
            {
            pushFollow(FOLLOW_rule__ValueObject__Alternatives_in_ruleValueObject336);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:202:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:203:1: ( ruleStringValue EOF )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:204:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue363);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue370); 

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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:211:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:215:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:216:1: ( ( rule__StringValue__ValueAssignment ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:216:1: ( ( rule__StringValue__ValueAssignment ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:217:1: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:218:1: ( rule__StringValue__ValueAssignment )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:218:2: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue396);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:230:1: entryRuleEStringObject : ruleEStringObject EOF ;
    public final void entryRuleEStringObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:231:1: ( ruleEStringObject EOF )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:232:1: ruleEStringObject EOF
            {
             before(grammarAccess.getEStringObjectRule()); 
            pushFollow(FOLLOW_ruleEStringObject_in_entryRuleEStringObject423);
            ruleEStringObject();

            state._fsp--;

             after(grammarAccess.getEStringObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEStringObject430); 

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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:239:1: ruleEStringObject : ( RULE_STRING ) ;
    public final void ruleEStringObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:243:2: ( ( RULE_STRING ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:244:1: ( RULE_STRING )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:244:1: ( RULE_STRING )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:245:1: RULE_STRING
            {
             before(grammarAccess.getEStringObjectAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEStringObject456); 
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:258:1: entryRuleIntegerValue : ruleIntegerValue EOF ;
    public final void entryRuleIntegerValue() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:259:1: ( ruleIntegerValue EOF )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:260:1: ruleIntegerValue EOF
            {
             before(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue482);
            ruleIntegerValue();

            state._fsp--;

             after(grammarAccess.getIntegerValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValue489); 

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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:267:1: ruleIntegerValue : ( ( rule__IntegerValue__ValueAssignment ) ) ;
    public final void ruleIntegerValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:271:2: ( ( ( rule__IntegerValue__ValueAssignment ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:272:1: ( ( rule__IntegerValue__ValueAssignment ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:272:1: ( ( rule__IntegerValue__ValueAssignment ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:273:1: ( rule__IntegerValue__ValueAssignment )
            {
             before(grammarAccess.getIntegerValueAccess().getValueAssignment()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:274:1: ( rule__IntegerValue__ValueAssignment )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:274:2: rule__IntegerValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntegerValue__ValueAssignment_in_ruleIntegerValue515);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:286:1: entryRuleEIntegerObject : ruleEIntegerObject EOF ;
    public final void entryRuleEIntegerObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:287:1: ( ruleEIntegerObject EOF )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:288:1: ruleEIntegerObject EOF
            {
             before(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject542);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getEIntegerObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEIntegerObject549); 

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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:295:1: ruleEIntegerObject : ( RULE_INT ) ;
    public final void ruleEIntegerObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:299:2: ( ( RULE_INT ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:300:1: ( RULE_INT )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:300:1: ( RULE_INT )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:301:1: RULE_INT
            {
             before(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEIntegerObject575); 
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:314:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:315:1: ( ruleFloatValue EOF )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:316:1: ruleFloatValue EOF
            {
             before(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue601);
            ruleFloatValue();

            state._fsp--;

             after(grammarAccess.getFloatValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue608); 

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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:323:1: ruleFloatValue : ( ( rule__FloatValue__ValueAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:327:2: ( ( ( rule__FloatValue__ValueAssignment ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:328:1: ( ( rule__FloatValue__ValueAssignment ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:328:1: ( ( rule__FloatValue__ValueAssignment ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:329:1: ( rule__FloatValue__ValueAssignment )
            {
             before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:330:1: ( rule__FloatValue__ValueAssignment )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:330:2: rule__FloatValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue634);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:342:1: entryRuleEFloatObject : ruleEFloatObject EOF ;
    public final void entryRuleEFloatObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:343:1: ( ruleEFloatObject EOF )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:344:1: ruleEFloatObject EOF
            {
             before(grammarAccess.getEFloatObjectRule()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject661);
            ruleEFloatObject();

            state._fsp--;

             after(grammarAccess.getEFloatObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEFloatObject668); 

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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:351:1: ruleEFloatObject : ( ( rule__EFloatObject__Group__0 ) ) ;
    public final void ruleEFloatObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:355:2: ( ( ( rule__EFloatObject__Group__0 ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:356:1: ( ( rule__EFloatObject__Group__0 ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:356:1: ( ( rule__EFloatObject__Group__0 ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:357:1: ( rule__EFloatObject__Group__0 )
            {
             before(grammarAccess.getEFloatObjectAccess().getGroup()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:358:1: ( rule__EFloatObject__Group__0 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:358:2: rule__EFloatObject__Group__0
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__0_in_ruleEFloatObject694);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:370:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:371:1: ( ruleQualifiedName EOF )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:372:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName721);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName728); 

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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:379:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:383:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:384:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:384:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:385:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:386:1: ( rule__QualifiedName__Group__0 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:386:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName754);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:398:1: rule__ValueObject__Alternatives : ( ( ruleStringValue ) | ( ruleIntegerValue ) | ( ruleFloatValue ) );
    public final void rule__ValueObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:402:1: ( ( ruleStringValue ) | ( ruleIntegerValue ) | ( ruleFloatValue ) )
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

                if ( (LA1_2==14) ) {
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
            case 13:
            case 14:
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
                    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:403:1: ( ruleStringValue )
                    {
                    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:403:1: ( ruleStringValue )
                    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:404:1: ruleStringValue
                    {
                     before(grammarAccess.getValueObjectAccess().getStringValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringValue_in_rule__ValueObject__Alternatives790);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getValueObjectAccess().getStringValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:409:6: ( ruleIntegerValue )
                    {
                    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:409:6: ( ruleIntegerValue )
                    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:410:1: ruleIntegerValue
                    {
                     before(grammarAccess.getValueObjectAccess().getIntegerValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntegerValue_in_rule__ValueObject__Alternatives807);
                    ruleIntegerValue();

                    state._fsp--;

                     after(grammarAccess.getValueObjectAccess().getIntegerValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:415:6: ( ruleFloatValue )
                    {
                    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:415:6: ( ruleFloatValue )
                    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:416:1: ruleFloatValue
                    {
                     before(grammarAccess.getValueObjectAccess().getFloatValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleFloatValue_in_rule__ValueObject__Alternatives824);
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


    // $ANTLR start "rule__TypeLib__Group__0"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:428:1: rule__TypeLib__Group__0 : rule__TypeLib__Group__0__Impl rule__TypeLib__Group__1 ;
    public final void rule__TypeLib__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:432:1: ( rule__TypeLib__Group__0__Impl rule__TypeLib__Group__1 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:433:2: rule__TypeLib__Group__0__Impl rule__TypeLib__Group__1
            {
            pushFollow(FOLLOW_rule__TypeLib__Group__0__Impl_in_rule__TypeLib__Group__0854);
            rule__TypeLib__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeLib__Group__1_in_rule__TypeLib__Group__0857);
            rule__TypeLib__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLib__Group__0"


    // $ANTLR start "rule__TypeLib__Group__0__Impl"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:440:1: rule__TypeLib__Group__0__Impl : ( ( ( rule__TypeLib__PrimitiveTypesAssignment_0 ) ) ( ( rule__TypeLib__PrimitiveTypesAssignment_0 )* ) ) ;
    public final void rule__TypeLib__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:444:1: ( ( ( ( rule__TypeLib__PrimitiveTypesAssignment_0 ) ) ( ( rule__TypeLib__PrimitiveTypesAssignment_0 )* ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:445:1: ( ( ( rule__TypeLib__PrimitiveTypesAssignment_0 ) ) ( ( rule__TypeLib__PrimitiveTypesAssignment_0 )* ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:445:1: ( ( ( rule__TypeLib__PrimitiveTypesAssignment_0 ) ) ( ( rule__TypeLib__PrimitiveTypesAssignment_0 )* ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:446:1: ( ( rule__TypeLib__PrimitiveTypesAssignment_0 ) ) ( ( rule__TypeLib__PrimitiveTypesAssignment_0 )* )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:446:1: ( ( rule__TypeLib__PrimitiveTypesAssignment_0 ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:447:1: ( rule__TypeLib__PrimitiveTypesAssignment_0 )
            {
             before(grammarAccess.getTypeLibAccess().getPrimitiveTypesAssignment_0()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:448:1: ( rule__TypeLib__PrimitiveTypesAssignment_0 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:448:2: rule__TypeLib__PrimitiveTypesAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeLib__PrimitiveTypesAssignment_0_in_rule__TypeLib__Group__0__Impl886);
            rule__TypeLib__PrimitiveTypesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeLibAccess().getPrimitiveTypesAssignment_0()); 

            }

            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:451:1: ( ( rule__TypeLib__PrimitiveTypesAssignment_0 )* )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:452:1: ( rule__TypeLib__PrimitiveTypesAssignment_0 )*
            {
             before(grammarAccess.getTypeLibAccess().getPrimitiveTypesAssignment_0()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:453:1: ( rule__TypeLib__PrimitiveTypesAssignment_0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:453:2: rule__TypeLib__PrimitiveTypesAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__TypeLib__PrimitiveTypesAssignment_0_in_rule__TypeLib__Group__0__Impl898);
            	    rule__TypeLib__PrimitiveTypesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getTypeLibAccess().getPrimitiveTypesAssignment_0()); 

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
    // $ANTLR end "rule__TypeLib__Group__0__Impl"


    // $ANTLR start "rule__TypeLib__Group__1"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:464:1: rule__TypeLib__Group__1 : rule__TypeLib__Group__1__Impl ;
    public final void rule__TypeLib__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:468:1: ( rule__TypeLib__Group__1__Impl )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:469:2: rule__TypeLib__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeLib__Group__1__Impl_in_rule__TypeLib__Group__1931);
            rule__TypeLib__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLib__Group__1"


    // $ANTLR start "rule__TypeLib__Group__1__Impl"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:475:1: rule__TypeLib__Group__1__Impl : ( ( rule__TypeLib__AnyTypeAssignment_1 ) ) ;
    public final void rule__TypeLib__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:479:1: ( ( ( rule__TypeLib__AnyTypeAssignment_1 ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:480:1: ( ( rule__TypeLib__AnyTypeAssignment_1 ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:480:1: ( ( rule__TypeLib__AnyTypeAssignment_1 ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:481:1: ( rule__TypeLib__AnyTypeAssignment_1 )
            {
             before(grammarAccess.getTypeLibAccess().getAnyTypeAssignment_1()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:482:1: ( rule__TypeLib__AnyTypeAssignment_1 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:482:2: rule__TypeLib__AnyTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__TypeLib__AnyTypeAssignment_1_in_rule__TypeLib__Group__1__Impl958);
            rule__TypeLib__AnyTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeLibAccess().getAnyTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLib__Group__1__Impl"


    // $ANTLR start "rule__Primitive__Group__0"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:496:1: rule__Primitive__Group__0 : rule__Primitive__Group__0__Impl rule__Primitive__Group__1 ;
    public final void rule__Primitive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:500:1: ( rule__Primitive__Group__0__Impl rule__Primitive__Group__1 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:501:2: rule__Primitive__Group__0__Impl rule__Primitive__Group__1
            {
            pushFollow(FOLLOW_rule__Primitive__Group__0__Impl_in_rule__Primitive__Group__0992);
            rule__Primitive__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primitive__Group__1_in_rule__Primitive__Group__0995);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:508:1: rule__Primitive__Group__0__Impl : ( 'primitive type' ) ;
    public final void rule__Primitive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:512:1: ( ( 'primitive type' ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:513:1: ( 'primitive type' )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:513:1: ( 'primitive type' )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:514:1: 'primitive type'
            {
             before(grammarAccess.getPrimitiveAccess().getPrimitiveTypeKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Primitive__Group__0__Impl1023); 
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:527:1: rule__Primitive__Group__1 : rule__Primitive__Group__1__Impl ;
    public final void rule__Primitive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:531:1: ( rule__Primitive__Group__1__Impl )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:532:2: rule__Primitive__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Primitive__Group__1__Impl_in_rule__Primitive__Group__11054);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:538:1: rule__Primitive__Group__1__Impl : ( ( rule__Primitive__NameAssignment_1 ) ) ;
    public final void rule__Primitive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:542:1: ( ( ( rule__Primitive__NameAssignment_1 ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:543:1: ( ( rule__Primitive__NameAssignment_1 ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:543:1: ( ( rule__Primitive__NameAssignment_1 ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:544:1: ( rule__Primitive__NameAssignment_1 )
            {
             before(grammarAccess.getPrimitiveAccess().getNameAssignment_1()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:545:1: ( rule__Primitive__NameAssignment_1 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:545:2: rule__Primitive__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Primitive__NameAssignment_1_in_rule__Primitive__Group__1__Impl1081);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:559:1: rule__Any__Group__0 : rule__Any__Group__0__Impl rule__Any__Group__1 ;
    public final void rule__Any__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:563:1: ( rule__Any__Group__0__Impl rule__Any__Group__1 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:564:2: rule__Any__Group__0__Impl rule__Any__Group__1
            {
            pushFollow(FOLLOW_rule__Any__Group__0__Impl_in_rule__Any__Group__01115);
            rule__Any__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Any__Group__1_in_rule__Any__Group__01118);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:571:1: rule__Any__Group__0__Impl : ( 'any type' ) ;
    public final void rule__Any__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:575:1: ( ( 'any type' ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:576:1: ( 'any type' )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:576:1: ( 'any type' )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:577:1: 'any type'
            {
             before(grammarAccess.getAnyAccess().getAnyTypeKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Any__Group__0__Impl1146); 
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:590:1: rule__Any__Group__1 : rule__Any__Group__1__Impl ;
    public final void rule__Any__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:594:1: ( rule__Any__Group__1__Impl )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:595:2: rule__Any__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Any__Group__1__Impl_in_rule__Any__Group__11177);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:601:1: rule__Any__Group__1__Impl : ( ( rule__Any__NameAssignment_1 ) ) ;
    public final void rule__Any__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:605:1: ( ( ( rule__Any__NameAssignment_1 ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:606:1: ( ( rule__Any__NameAssignment_1 ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:606:1: ( ( rule__Any__NameAssignment_1 ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:607:1: ( rule__Any__NameAssignment_1 )
            {
             before(grammarAccess.getAnyAccess().getNameAssignment_1()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:608:1: ( rule__Any__NameAssignment_1 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:608:2: rule__Any__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Any__NameAssignment_1_in_rule__Any__Group__1__Impl1204);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:625:1: rule__TypeRef__Group__0 : rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 ;
    public final void rule__TypeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:629:1: ( rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:630:2: rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__01241);
            rule__TypeRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__01244);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:637:1: rule__TypeRef__Group__0__Impl : ( ( rule__TypeRef__ReferencedAssignment_0 ) ) ;
    public final void rule__TypeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:641:1: ( ( ( rule__TypeRef__ReferencedAssignment_0 ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:642:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:642:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:643:1: ( rule__TypeRef__ReferencedAssignment_0 )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedAssignment_0()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:644:1: ( rule__TypeRef__ReferencedAssignment_0 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:644:2: rule__TypeRef__ReferencedAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl1271);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:654:1: rule__TypeRef__Group__1 : rule__TypeRef__Group__1__Impl ;
    public final void rule__TypeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:658:1: ( rule__TypeRef__Group__1__Impl )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:659:2: rule__TypeRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__11301);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:665:1: rule__TypeRef__Group__1__Impl : ( ( rule__TypeRef__IsMultiAssignment_1 )? ) ;
    public final void rule__TypeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:669:1: ( ( ( rule__TypeRef__IsMultiAssignment_1 )? ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:670:1: ( ( rule__TypeRef__IsMultiAssignment_1 )? )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:670:1: ( ( rule__TypeRef__IsMultiAssignment_1 )? )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:671:1: ( rule__TypeRef__IsMultiAssignment_1 )?
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiAssignment_1()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:672:1: ( rule__TypeRef__IsMultiAssignment_1 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:672:2: rule__TypeRef__IsMultiAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TypeRef__IsMultiAssignment_1_in_rule__TypeRef__Group__1__Impl1328);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:686:1: rule__EFloatObject__Group__0 : rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1 ;
    public final void rule__EFloatObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:690:1: ( rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:691:2: rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__0__Impl_in_rule__EFloatObject__Group__01363);
            rule__EFloatObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__1_in_rule__EFloatObject__Group__01366);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:698:1: rule__EFloatObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloatObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:702:1: ( ( ( '-' )? ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:703:1: ( ( '-' )? )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:703:1: ( ( '-' )? )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:704:1: ( '-' )?
            {
             before(grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:705:1: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:706:2: '-'
                    {
                    match(input,13,FOLLOW_13_in_rule__EFloatObject__Group__0__Impl1395); 

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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:717:1: rule__EFloatObject__Group__1 : rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2 ;
    public final void rule__EFloatObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:721:1: ( rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:722:2: rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__1__Impl_in_rule__EFloatObject__Group__11428);
            rule__EFloatObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__2_in_rule__EFloatObject__Group__11431);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:729:1: rule__EFloatObject__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloatObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:733:1: ( ( ( RULE_INT )? ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:734:1: ( ( RULE_INT )? )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:734:1: ( ( RULE_INT )? )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:735:1: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:736:1: ( RULE_INT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:736:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EFloatObject__Group__1__Impl1459); 

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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:746:1: rule__EFloatObject__Group__2 : rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3 ;
    public final void rule__EFloatObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:750:1: ( rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:751:2: rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__2__Impl_in_rule__EFloatObject__Group__21490);
            rule__EFloatObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__3_in_rule__EFloatObject__Group__21493);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:758:1: rule__EFloatObject__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloatObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:762:1: ( ( '.' ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:763:1: ( '.' )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:763:1: ( '.' )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:764:1: '.'
            {
             before(grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__EFloatObject__Group__2__Impl1521); 
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:777:1: rule__EFloatObject__Group__3 : rule__EFloatObject__Group__3__Impl ;
    public final void rule__EFloatObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:781:1: ( rule__EFloatObject__Group__3__Impl )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:782:2: rule__EFloatObject__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__3__Impl_in_rule__EFloatObject__Group__31552);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:788:1: rule__EFloatObject__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloatObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:792:1: ( ( RULE_INT ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:793:1: ( RULE_INT )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:793:1: ( RULE_INT )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:794:1: RULE_INT
            {
             before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EFloatObject__Group__3__Impl1579); 
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:813:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:817:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:818:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01616);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01619);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:825:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:829:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:830:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:830:1: ( RULE_ID )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:831:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1646); 
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:842:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:846:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:847:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11675);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:853:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:857:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:858:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:858:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:859:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:860:1: ( rule__QualifiedName__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:860:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1702);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:874:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:878:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:879:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01737);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01740);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:886:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:890:1: ( ( '.' ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:891:1: ( '.' )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:891:1: ( '.' )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:892:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,14,FOLLOW_14_in_rule__QualifiedName__Group_1__0__Impl1768); 
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:905:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:909:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:910:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11799);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:916:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:920:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:921:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:921:1: ( RULE_ID )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:922:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1826); 
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


    // $ANTLR start "rule__TypeLib__PrimitiveTypesAssignment_0"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:938:1: rule__TypeLib__PrimitiveTypesAssignment_0 : ( rulePrimitive ) ;
    public final void rule__TypeLib__PrimitiveTypesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:942:1: ( ( rulePrimitive ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:943:1: ( rulePrimitive )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:943:1: ( rulePrimitive )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:944:1: rulePrimitive
            {
             before(grammarAccess.getTypeLibAccess().getPrimitiveTypesPrimitiveParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePrimitive_in_rule__TypeLib__PrimitiveTypesAssignment_01864);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getTypeLibAccess().getPrimitiveTypesPrimitiveParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLib__PrimitiveTypesAssignment_0"


    // $ANTLR start "rule__TypeLib__AnyTypeAssignment_1"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:953:1: rule__TypeLib__AnyTypeAssignment_1 : ( ruleAny ) ;
    public final void rule__TypeLib__AnyTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:957:1: ( ( ruleAny ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:958:1: ( ruleAny )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:958:1: ( ruleAny )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:959:1: ruleAny
            {
             before(grammarAccess.getTypeLibAccess().getAnyTypeAnyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAny_in_rule__TypeLib__AnyTypeAssignment_11895);
            ruleAny();

            state._fsp--;

             after(grammarAccess.getTypeLibAccess().getAnyTypeAnyParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLib__AnyTypeAssignment_1"


    // $ANTLR start "rule__Primitive__NameAssignment_1"
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:968:1: rule__Primitive__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Primitive__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:972:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:973:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:973:1: ( RULE_ID )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:974:1: RULE_ID
            {
             before(grammarAccess.getPrimitiveAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Primitive__NameAssignment_11926); 
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:983:1: rule__Any__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Any__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:987:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:988:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:988:1: ( RULE_ID )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:989:1: RULE_ID
            {
             before(grammarAccess.getAnyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Any__NameAssignment_11957); 
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1004:1: rule__TypeRef__ReferencedAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TypeRef__ReferencedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1008:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1009:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1009:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1010:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1011:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1012:1: ruleQualifiedName
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_01998);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1023:1: rule__TypeRef__IsMultiAssignment_1 : ( ( '[]' ) ) ;
    public final void rule__TypeRef__IsMultiAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1027:1: ( ( ( '[]' ) ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1028:1: ( ( '[]' ) )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1028:1: ( ( '[]' ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1029:1: ( '[]' )
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1030:1: ( '[]' )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1031:1: '[]'
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            match(input,15,FOLLOW_15_in_rule__TypeRef__IsMultiAssignment_12038); 
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1046:1: rule__StringValue__ValueAssignment : ( ruleEStringObject ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1050:1: ( ( ruleEStringObject ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1051:1: ( ruleEStringObject )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1051:1: ( ruleEStringObject )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1052:1: ruleEStringObject
            {
             before(grammarAccess.getStringValueAccess().getValueEStringObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEStringObject_in_rule__StringValue__ValueAssignment2077);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1061:1: rule__IntegerValue__ValueAssignment : ( ruleEIntegerObject ) ;
    public final void rule__IntegerValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1065:1: ( ( ruleEIntegerObject ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1066:1: ( ruleEIntegerObject )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1066:1: ( ruleEIntegerObject )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1067:1: ruleEIntegerObject
            {
             before(grammarAccess.getIntegerValueAccess().getValueEIntegerObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_rule__IntegerValue__ValueAssignment2108);
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
    // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1076:1: rule__FloatValue__ValueAssignment : ( ruleEFloatObject ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1080:1: ( ( ruleEFloatObject ) )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1081:1: ( ruleEFloatObject )
            {
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1081:1: ( ruleEFloatObject )
            // ../de.dubmas.modulob.common.dsl.ui/src-gen/de/dubmas/modulob/common/ui/contentassist/antlr/internal/InternalDsl.g:1082:1: ruleEFloatObject
            {
             before(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_rule__FloatValue__ValueAssignment2139);
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


 

    public static final BitSet FOLLOW_ruleTypeLib_in_entryRuleTypeLib61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeLib68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeLib__Group__0_in_ruleTypeLib94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__0_in_rulePrimitive154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAny_in_entryRuleAny181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAny188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__Group__0_in_ruleAny214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueObject_in_entryRuleValueObject303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueObject310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueObject__Alternatives_in_ruleValueObject336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_entryRuleEStringObject423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEStringObject430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEStringObject456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerValue__ValueAssignment_in_ruleIntegerValue515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEIntegerObject549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEIntegerObject575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEFloatObject668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__0_in_ruleEFloatObject694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__ValueObject__Alternatives790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_rule__ValueObject__Alternatives807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_rule__ValueObject__Alternatives824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeLib__Group__0__Impl_in_rule__TypeLib__Group__0854 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__TypeLib__Group__1_in_rule__TypeLib__Group__0857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeLib__PrimitiveTypesAssignment_0_in_rule__TypeLib__Group__0__Impl886 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__TypeLib__PrimitiveTypesAssignment_0_in_rule__TypeLib__Group__0__Impl898 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__TypeLib__Group__1__Impl_in_rule__TypeLib__Group__1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeLib__AnyTypeAssignment_1_in_rule__TypeLib__Group__1__Impl958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__0__Impl_in_rule__Primitive__Group__0992 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Primitive__Group__1_in_rule__Primitive__Group__0995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Primitive__Group__0__Impl1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__1__Impl_in_rule__Primitive__Group__11054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__NameAssignment_1_in_rule__Primitive__Group__1__Impl1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__Group__0__Impl_in_rule__Any__Group__01115 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Any__Group__1_in_rule__Any__Group__01118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Any__Group__0__Impl1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__Group__1__Impl_in_rule__Any__Group__11177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__NameAssignment_1_in_rule__Any__Group__1__Impl1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__01241 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__01244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__11301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__IsMultiAssignment_1_in_rule__TypeRef__Group__1__Impl1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__0__Impl_in_rule__EFloatObject__Group__01363 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__1_in_rule__EFloatObject__Group__01366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__EFloatObject__Group__0__Impl1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__1__Impl_in_rule__EFloatObject__Group__11428 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__2_in_rule__EFloatObject__Group__11431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group__1__Impl1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__2__Impl_in_rule__EFloatObject__Group__21490 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__3_in_rule__EFloatObject__Group__21493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__EFloatObject__Group__2__Impl1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__3__Impl_in_rule__EFloatObject__Group__31552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group__3__Impl1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01616 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1702 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01737 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__QualifiedName__Group_1__0__Impl1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_rule__TypeLib__PrimitiveTypesAssignment_01864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAny_in_rule__TypeLib__AnyTypeAssignment_11895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Primitive__NameAssignment_11926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Any__NameAssignment_11957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_01998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__TypeRef__IsMultiAssignment_12038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_rule__StringValue__ValueAssignment2077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_rule__IntegerValue__ValueAssignment2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_rule__FloatValue__ValueAssignment2139 = new BitSet(new long[]{0x0000000000000002L});

}