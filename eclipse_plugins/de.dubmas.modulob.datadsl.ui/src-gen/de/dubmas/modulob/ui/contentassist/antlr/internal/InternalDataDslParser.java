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
import de.dubmas.modulob.services.DataDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDataDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_DOC_COMMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'persistency'", "'CoreData'", "'entities for module'", "'version'", "'entity'", "'{'", "'}'", "':'", "'@'", "';'", "'='", "'<->'", "'primitive type'", "'any type'", "'-'", "'.'", "'abstract'", "'indexed'", "'-['", "'[]'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_DOC_COMMENT=7;
    public static final int T__29=29;
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
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
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


        public InternalDataDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDataDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDataDslParser.tokenNames; }
    public String getGrammarFileName() { return "../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g"; }


     
     	private DataDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DataDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleEntityModel"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:60:1: entryRuleEntityModel : ruleEntityModel EOF ;
    public final void entryRuleEntityModel() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:61:1: ( ruleEntityModel EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:62:1: ruleEntityModel EOF
            {
             before(grammarAccess.getEntityModelRule()); 
            pushFollow(FOLLOW_ruleEntityModel_in_entryRuleEntityModel61);
            ruleEntityModel();

            state._fsp--;

             after(grammarAccess.getEntityModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityModel68); 

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
    // $ANTLR end "entryRuleEntityModel"


    // $ANTLR start "ruleEntityModel"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:69:1: ruleEntityModel : ( ( rule__EntityModel__Group__0 ) ) ;
    public final void ruleEntityModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:73:2: ( ( ( rule__EntityModel__Group__0 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:74:1: ( ( rule__EntityModel__Group__0 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:74:1: ( ( rule__EntityModel__Group__0 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:75:1: ( rule__EntityModel__Group__0 )
            {
             before(grammarAccess.getEntityModelAccess().getGroup()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:76:1: ( rule__EntityModel__Group__0 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:76:2: rule__EntityModel__Group__0
            {
            pushFollow(FOLLOW_rule__EntityModel__Group__0_in_ruleEntityModel94);
            rule__EntityModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityModel"


    // $ANTLR start "entryRuleEntity"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:88:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:89:1: ( ruleEntity EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:90:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity121);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity128); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:97:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:101:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:102:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:102:1: ( ( rule__Entity__Group__0 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:103:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:104:1: ( rule__Entity__Group__0 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:104:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity154);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAnnotation"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:116:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:117:1: ( ruleAnnotation EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:118:1: ruleAnnotation EOF
            {
             before(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation181);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getAnnotationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation188); 

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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:125:1: ruleAnnotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:129:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:130:1: ( ( rule__Annotation__Group__0 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:130:1: ( ( rule__Annotation__Group__0 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:131:1: ( rule__Annotation__Group__0 )
            {
             before(grammarAccess.getAnnotationAccess().getGroup()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:132:1: ( rule__Annotation__Group__0 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:132:2: rule__Annotation__Group__0
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation214);
            rule__Annotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleFeature"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:144:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:145:1: ( ruleFeature EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:146:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature241);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature248); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:153:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:157:2: ( ( ( rule__Feature__Group__0 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:158:1: ( ( rule__Feature__Group__0 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:158:1: ( ( rule__Feature__Group__0 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:159:1: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:160:1: ( rule__Feature__Group__0 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:160:2: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_rule__Feature__Group__0_in_ruleFeature274);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:174:1: entryRulePrimitive : rulePrimitive EOF ;
    public final void entryRulePrimitive() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:175:1: ( rulePrimitive EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:176:1: rulePrimitive EOF
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:183:1: rulePrimitive : ( ( rule__Primitive__Group__0 ) ) ;
    public final void rulePrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:187:2: ( ( ( rule__Primitive__Group__0 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:188:1: ( ( rule__Primitive__Group__0 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:188:1: ( ( rule__Primitive__Group__0 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:189:1: ( rule__Primitive__Group__0 )
            {
             before(grammarAccess.getPrimitiveAccess().getGroup()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:190:1: ( rule__Primitive__Group__0 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:190:2: rule__Primitive__Group__0
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:202:1: entryRuleAny : ruleAny EOF ;
    public final void entryRuleAny() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:203:1: ( ruleAny EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:204:1: ruleAny EOF
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:211:1: ruleAny : ( ( rule__Any__Group__0 ) ) ;
    public final void ruleAny() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:215:2: ( ( ( rule__Any__Group__0 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:216:1: ( ( rule__Any__Group__0 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:216:1: ( ( rule__Any__Group__0 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:217:1: ( rule__Any__Group__0 )
            {
             before(grammarAccess.getAnyAccess().getGroup()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:218:1: ( rule__Any__Group__0 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:218:2: rule__Any__Group__0
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:230:1: entryRuleTypeRef : ruleTypeRef EOF ;
    public final void entryRuleTypeRef() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:231:1: ( ruleTypeRef EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:232:1: ruleTypeRef EOF
            {
             before(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef423);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getTypeRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef430); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:239:1: ruleTypeRef : ( ( rule__TypeRef__Group__0 ) ) ;
    public final void ruleTypeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:243:2: ( ( ( rule__TypeRef__Group__0 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:244:1: ( ( rule__TypeRef__Group__0 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:244:1: ( ( rule__TypeRef__Group__0 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:245:1: ( rule__TypeRef__Group__0 )
            {
             before(grammarAccess.getTypeRefAccess().getGroup()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:246:1: ( rule__TypeRef__Group__0 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:246:2: rule__TypeRef__Group__0
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef456);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:258:1: entryRuleValueObject : ruleValueObject EOF ;
    public final void entryRuleValueObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:259:1: ( ruleValueObject EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:260:1: ruleValueObject EOF
            {
             before(grammarAccess.getValueObjectRule()); 
            pushFollow(FOLLOW_ruleValueObject_in_entryRuleValueObject483);
            ruleValueObject();

            state._fsp--;

             after(grammarAccess.getValueObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueObject490); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:267:1: ruleValueObject : ( ( rule__ValueObject__Alternatives ) ) ;
    public final void ruleValueObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:271:2: ( ( ( rule__ValueObject__Alternatives ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:272:1: ( ( rule__ValueObject__Alternatives ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:272:1: ( ( rule__ValueObject__Alternatives ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:273:1: ( rule__ValueObject__Alternatives )
            {
             before(grammarAccess.getValueObjectAccess().getAlternatives()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:274:1: ( rule__ValueObject__Alternatives )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:274:2: rule__ValueObject__Alternatives
            {
            pushFollow(FOLLOW_rule__ValueObject__Alternatives_in_ruleValueObject516);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:286:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:287:1: ( ruleStringValue EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:288:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue543);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue550); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:295:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:299:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:300:1: ( ( rule__StringValue__ValueAssignment ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:300:1: ( ( rule__StringValue__ValueAssignment ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:301:1: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:302:1: ( rule__StringValue__ValueAssignment )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:302:2: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue576);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:314:1: entryRuleEStringObject : ruleEStringObject EOF ;
    public final void entryRuleEStringObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:315:1: ( ruleEStringObject EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:316:1: ruleEStringObject EOF
            {
             before(grammarAccess.getEStringObjectRule()); 
            pushFollow(FOLLOW_ruleEStringObject_in_entryRuleEStringObject603);
            ruleEStringObject();

            state._fsp--;

             after(grammarAccess.getEStringObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEStringObject610); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:323:1: ruleEStringObject : ( RULE_STRING ) ;
    public final void ruleEStringObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:327:2: ( ( RULE_STRING ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:328:1: ( RULE_STRING )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:328:1: ( RULE_STRING )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:329:1: RULE_STRING
            {
             before(grammarAccess.getEStringObjectAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEStringObject636); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:342:1: entryRuleIntegerValue : ruleIntegerValue EOF ;
    public final void entryRuleIntegerValue() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:343:1: ( ruleIntegerValue EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:344:1: ruleIntegerValue EOF
            {
             before(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue662);
            ruleIntegerValue();

            state._fsp--;

             after(grammarAccess.getIntegerValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValue669); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:351:1: ruleIntegerValue : ( ( rule__IntegerValue__ValueAssignment ) ) ;
    public final void ruleIntegerValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:355:2: ( ( ( rule__IntegerValue__ValueAssignment ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:356:1: ( ( rule__IntegerValue__ValueAssignment ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:356:1: ( ( rule__IntegerValue__ValueAssignment ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:357:1: ( rule__IntegerValue__ValueAssignment )
            {
             before(grammarAccess.getIntegerValueAccess().getValueAssignment()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:358:1: ( rule__IntegerValue__ValueAssignment )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:358:2: rule__IntegerValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntegerValue__ValueAssignment_in_ruleIntegerValue695);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:370:1: entryRuleEIntegerObject : ruleEIntegerObject EOF ;
    public final void entryRuleEIntegerObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:371:1: ( ruleEIntegerObject EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:372:1: ruleEIntegerObject EOF
            {
             before(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject722);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getEIntegerObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEIntegerObject729); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:379:1: ruleEIntegerObject : ( RULE_INT ) ;
    public final void ruleEIntegerObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:383:2: ( ( RULE_INT ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:384:1: ( RULE_INT )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:384:1: ( RULE_INT )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:385:1: RULE_INT
            {
             before(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEIntegerObject755); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:398:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:399:1: ( ruleFloatValue EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:400:1: ruleFloatValue EOF
            {
             before(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue781);
            ruleFloatValue();

            state._fsp--;

             after(grammarAccess.getFloatValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue788); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:407:1: ruleFloatValue : ( ( rule__FloatValue__ValueAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:411:2: ( ( ( rule__FloatValue__ValueAssignment ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:412:1: ( ( rule__FloatValue__ValueAssignment ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:412:1: ( ( rule__FloatValue__ValueAssignment ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:413:1: ( rule__FloatValue__ValueAssignment )
            {
             before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:414:1: ( rule__FloatValue__ValueAssignment )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:414:2: rule__FloatValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue814);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:426:1: entryRuleEFloatObject : ruleEFloatObject EOF ;
    public final void entryRuleEFloatObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:427:1: ( ruleEFloatObject EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:428:1: ruleEFloatObject EOF
            {
             before(grammarAccess.getEFloatObjectRule()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject841);
            ruleEFloatObject();

            state._fsp--;

             after(grammarAccess.getEFloatObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEFloatObject848); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:435:1: ruleEFloatObject : ( ( rule__EFloatObject__Group__0 ) ) ;
    public final void ruleEFloatObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:439:2: ( ( ( rule__EFloatObject__Group__0 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:440:1: ( ( rule__EFloatObject__Group__0 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:440:1: ( ( rule__EFloatObject__Group__0 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:441:1: ( rule__EFloatObject__Group__0 )
            {
             before(grammarAccess.getEFloatObjectAccess().getGroup()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:442:1: ( rule__EFloatObject__Group__0 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:442:2: rule__EFloatObject__Group__0
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__0_in_ruleEFloatObject874);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:454:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:455:1: ( ruleQualifiedName EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:456:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName901);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName908); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:463:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:467:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:468:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:468:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:469:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:470:1: ( rule__QualifiedName__Group__0 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:470:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName934);
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


    // $ANTLR start "ruleConfigOption"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:483:1: ruleConfigOption : ( ( 'persistency' ) ) ;
    public final void ruleConfigOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:487:1: ( ( ( 'persistency' ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:488:1: ( ( 'persistency' ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:488:1: ( ( 'persistency' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:489:1: ( 'persistency' )
            {
             before(grammarAccess.getConfigOptionAccess().getPersistencyEnumLiteralDeclaration()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:490:1: ( 'persistency' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:490:3: 'persistency'
            {
            match(input,12,FOLLOW_12_in_ruleConfigOption972); 

            }

             after(grammarAccess.getConfigOptionAccess().getPersistencyEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfigOption"


    // $ANTLR start "ruleConfigValue"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:503:1: ruleConfigValue : ( ( 'CoreData' ) ) ;
    public final void ruleConfigValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:507:1: ( ( ( 'CoreData' ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:508:1: ( ( 'CoreData' ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:508:1: ( ( 'CoreData' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:509:1: ( 'CoreData' )
            {
             before(grammarAccess.getConfigValueAccess().getCoreDataEnumLiteralDeclaration()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:510:1: ( 'CoreData' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:510:3: 'CoreData'
            {
            match(input,13,FOLLOW_13_in_ruleConfigValue1011); 

            }

             after(grammarAccess.getConfigValueAccess().getCoreDataEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfigValue"


    // $ANTLR start "rule__ValueObject__Alternatives"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:522:1: rule__ValueObject__Alternatives : ( ( ruleStringValue ) | ( ruleIntegerValue ) | ( ruleFloatValue ) );
    public final void rule__ValueObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:526:1: ( ( ruleStringValue ) | ( ruleIntegerValue ) | ( ruleFloatValue ) )
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

                if ( (LA1_2==27) ) {
                    alt1=3;
                }
                else if ( (LA1_2==EOF||LA1_2==21||LA1_2==23) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case 26:
            case 27:
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
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:527:1: ( ruleStringValue )
                    {
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:527:1: ( ruleStringValue )
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:528:1: ruleStringValue
                    {
                     before(grammarAccess.getValueObjectAccess().getStringValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringValue_in_rule__ValueObject__Alternatives1048);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getValueObjectAccess().getStringValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:533:6: ( ruleIntegerValue )
                    {
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:533:6: ( ruleIntegerValue )
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:534:1: ruleIntegerValue
                    {
                     before(grammarAccess.getValueObjectAccess().getIntegerValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntegerValue_in_rule__ValueObject__Alternatives1065);
                    ruleIntegerValue();

                    state._fsp--;

                     after(grammarAccess.getValueObjectAccess().getIntegerValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:539:6: ( ruleFloatValue )
                    {
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:539:6: ( ruleFloatValue )
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:540:1: ruleFloatValue
                    {
                     before(grammarAccess.getValueObjectAccess().getFloatValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleFloatValue_in_rule__ValueObject__Alternatives1082);
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


    // $ANTLR start "rule__EntityModel__Group__0"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:552:1: rule__EntityModel__Group__0 : rule__EntityModel__Group__0__Impl rule__EntityModel__Group__1 ;
    public final void rule__EntityModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:556:1: ( rule__EntityModel__Group__0__Impl rule__EntityModel__Group__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:557:2: rule__EntityModel__Group__0__Impl rule__EntityModel__Group__1
            {
            pushFollow(FOLLOW_rule__EntityModel__Group__0__Impl_in_rule__EntityModel__Group__01112);
            rule__EntityModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityModel__Group__1_in_rule__EntityModel__Group__01115);
            rule__EntityModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityModel__Group__0"


    // $ANTLR start "rule__EntityModel__Group__0__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:564:1: rule__EntityModel__Group__0__Impl : ( 'entities for module' ) ;
    public final void rule__EntityModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:568:1: ( ( 'entities for module' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:569:1: ( 'entities for module' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:569:1: ( 'entities for module' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:570:1: 'entities for module'
            {
             before(grammarAccess.getEntityModelAccess().getEntitiesForModuleKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__EntityModel__Group__0__Impl1143); 
             after(grammarAccess.getEntityModelAccess().getEntitiesForModuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityModel__Group__0__Impl"


    // $ANTLR start "rule__EntityModel__Group__1"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:583:1: rule__EntityModel__Group__1 : rule__EntityModel__Group__1__Impl rule__EntityModel__Group__2 ;
    public final void rule__EntityModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:587:1: ( rule__EntityModel__Group__1__Impl rule__EntityModel__Group__2 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:588:2: rule__EntityModel__Group__1__Impl rule__EntityModel__Group__2
            {
            pushFollow(FOLLOW_rule__EntityModel__Group__1__Impl_in_rule__EntityModel__Group__11174);
            rule__EntityModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityModel__Group__2_in_rule__EntityModel__Group__11177);
            rule__EntityModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityModel__Group__1"


    // $ANTLR start "rule__EntityModel__Group__1__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:595:1: rule__EntityModel__Group__1__Impl : ( ( rule__EntityModel__ModuleAssignment_1 ) ) ;
    public final void rule__EntityModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:599:1: ( ( ( rule__EntityModel__ModuleAssignment_1 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:600:1: ( ( rule__EntityModel__ModuleAssignment_1 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:600:1: ( ( rule__EntityModel__ModuleAssignment_1 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:601:1: ( rule__EntityModel__ModuleAssignment_1 )
            {
             before(grammarAccess.getEntityModelAccess().getModuleAssignment_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:602:1: ( rule__EntityModel__ModuleAssignment_1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:602:2: rule__EntityModel__ModuleAssignment_1
            {
            pushFollow(FOLLOW_rule__EntityModel__ModuleAssignment_1_in_rule__EntityModel__Group__1__Impl1204);
            rule__EntityModel__ModuleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityModelAccess().getModuleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityModel__Group__1__Impl"


    // $ANTLR start "rule__EntityModel__Group__2"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:612:1: rule__EntityModel__Group__2 : rule__EntityModel__Group__2__Impl rule__EntityModel__Group__3 ;
    public final void rule__EntityModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:616:1: ( rule__EntityModel__Group__2__Impl rule__EntityModel__Group__3 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:617:2: rule__EntityModel__Group__2__Impl rule__EntityModel__Group__3
            {
            pushFollow(FOLLOW_rule__EntityModel__Group__2__Impl_in_rule__EntityModel__Group__21234);
            rule__EntityModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityModel__Group__3_in_rule__EntityModel__Group__21237);
            rule__EntityModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityModel__Group__2"


    // $ANTLR start "rule__EntityModel__Group__2__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:624:1: rule__EntityModel__Group__2__Impl : ( 'version' ) ;
    public final void rule__EntityModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:628:1: ( ( 'version' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:629:1: ( 'version' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:629:1: ( 'version' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:630:1: 'version'
            {
             before(grammarAccess.getEntityModelAccess().getVersionKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__EntityModel__Group__2__Impl1265); 
             after(grammarAccess.getEntityModelAccess().getVersionKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityModel__Group__2__Impl"


    // $ANTLR start "rule__EntityModel__Group__3"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:643:1: rule__EntityModel__Group__3 : rule__EntityModel__Group__3__Impl rule__EntityModel__Group__4 ;
    public final void rule__EntityModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:647:1: ( rule__EntityModel__Group__3__Impl rule__EntityModel__Group__4 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:648:2: rule__EntityModel__Group__3__Impl rule__EntityModel__Group__4
            {
            pushFollow(FOLLOW_rule__EntityModel__Group__3__Impl_in_rule__EntityModel__Group__31296);
            rule__EntityModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityModel__Group__4_in_rule__EntityModel__Group__31299);
            rule__EntityModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityModel__Group__3"


    // $ANTLR start "rule__EntityModel__Group__3__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:655:1: rule__EntityModel__Group__3__Impl : ( ( rule__EntityModel__VersionAssignment_3 ) ) ;
    public final void rule__EntityModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:659:1: ( ( ( rule__EntityModel__VersionAssignment_3 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:660:1: ( ( rule__EntityModel__VersionAssignment_3 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:660:1: ( ( rule__EntityModel__VersionAssignment_3 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:661:1: ( rule__EntityModel__VersionAssignment_3 )
            {
             before(grammarAccess.getEntityModelAccess().getVersionAssignment_3()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:662:1: ( rule__EntityModel__VersionAssignment_3 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:662:2: rule__EntityModel__VersionAssignment_3
            {
            pushFollow(FOLLOW_rule__EntityModel__VersionAssignment_3_in_rule__EntityModel__Group__3__Impl1326);
            rule__EntityModel__VersionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntityModelAccess().getVersionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityModel__Group__3__Impl"


    // $ANTLR start "rule__EntityModel__Group__4"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:672:1: rule__EntityModel__Group__4 : rule__EntityModel__Group__4__Impl ;
    public final void rule__EntityModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:676:1: ( rule__EntityModel__Group__4__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:677:2: rule__EntityModel__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__EntityModel__Group__4__Impl_in_rule__EntityModel__Group__41356);
            rule__EntityModel__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityModel__Group__4"


    // $ANTLR start "rule__EntityModel__Group__4__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:683:1: rule__EntityModel__Group__4__Impl : ( ( rule__EntityModel__EntitiesAssignment_4 )* ) ;
    public final void rule__EntityModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:687:1: ( ( ( rule__EntityModel__EntitiesAssignment_4 )* ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:688:1: ( ( rule__EntityModel__EntitiesAssignment_4 )* )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:688:1: ( ( rule__EntityModel__EntitiesAssignment_4 )* )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:689:1: ( rule__EntityModel__EntitiesAssignment_4 )*
            {
             before(grammarAccess.getEntityModelAccess().getEntitiesAssignment_4()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:690:1: ( rule__EntityModel__EntitiesAssignment_4 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_DOC_COMMENT||LA2_0==16||LA2_0==20||LA2_0==28) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:690:2: rule__EntityModel__EntitiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__EntityModel__EntitiesAssignment_4_in_rule__EntityModel__Group__4__Impl1383);
            	    rule__EntityModel__EntitiesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getEntityModelAccess().getEntitiesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityModel__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:710:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:714:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:715:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01424);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01427);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:722:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__CommentAssignment_0 )? ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:726:1: ( ( ( rule__Entity__CommentAssignment_0 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:727:1: ( ( rule__Entity__CommentAssignment_0 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:727:1: ( ( rule__Entity__CommentAssignment_0 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:728:1: ( rule__Entity__CommentAssignment_0 )?
            {
             before(grammarAccess.getEntityAccess().getCommentAssignment_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:729:1: ( rule__Entity__CommentAssignment_0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_DOC_COMMENT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:729:2: rule__Entity__CommentAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Entity__CommentAssignment_0_in_rule__Entity__Group__0__Impl1454);
                    rule__Entity__CommentAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getCommentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:739:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:743:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:744:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11485);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11488);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:751:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__AnnotationsAssignment_1 )* ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:755:1: ( ( ( rule__Entity__AnnotationsAssignment_1 )* ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:756:1: ( ( rule__Entity__AnnotationsAssignment_1 )* )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:756:1: ( ( rule__Entity__AnnotationsAssignment_1 )* )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:757:1: ( rule__Entity__AnnotationsAssignment_1 )*
            {
             before(grammarAccess.getEntityAccess().getAnnotationsAssignment_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:758:1: ( rule__Entity__AnnotationsAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:758:2: rule__Entity__AnnotationsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Entity__AnnotationsAssignment_1_in_rule__Entity__Group__1__Impl1515);
            	    rule__Entity__AnnotationsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAnnotationsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:768:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:772:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:773:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21546);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21549);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:780:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__IsAbstractAssignment_2 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:784:1: ( ( ( rule__Entity__IsAbstractAssignment_2 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:785:1: ( ( rule__Entity__IsAbstractAssignment_2 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:785:1: ( ( rule__Entity__IsAbstractAssignment_2 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:786:1: ( rule__Entity__IsAbstractAssignment_2 )?
            {
             before(grammarAccess.getEntityAccess().getIsAbstractAssignment_2()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:787:1: ( rule__Entity__IsAbstractAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:787:2: rule__Entity__IsAbstractAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Entity__IsAbstractAssignment_2_in_rule__Entity__Group__2__Impl1576);
                    rule__Entity__IsAbstractAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getIsAbstractAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:797:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:801:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:802:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31607);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31610);
            rule__Entity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:809:1: rule__Entity__Group__3__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:813:1: ( ( 'entity' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:814:1: ( 'entity' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:814:1: ( 'entity' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:815:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__Entity__Group__3__Impl1638); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:828:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:832:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:833:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41669);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41672);
            rule__Entity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:840:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__NameAssignment_4 ) ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:844:1: ( ( ( rule__Entity__NameAssignment_4 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:845:1: ( ( rule__Entity__NameAssignment_4 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:845:1: ( ( rule__Entity__NameAssignment_4 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:846:1: ( rule__Entity__NameAssignment_4 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_4()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:847:1: ( rule__Entity__NameAssignment_4 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:847:2: rule__Entity__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_4_in_rule__Entity__Group__4__Impl1699);
            rule__Entity__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:857:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:861:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:862:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51729);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__51732);
            rule__Entity__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:869:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__Group_5__0 )? ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:873:1: ( ( ( rule__Entity__Group_5__0 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:874:1: ( ( rule__Entity__Group_5__0 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:874:1: ( ( rule__Entity__Group_5__0 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:875:1: ( rule__Entity__Group_5__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_5()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:876:1: ( rule__Entity__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:876:2: rule__Entity__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_5__0_in_rule__Entity__Group__5__Impl1759);
                    rule__Entity__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group__6"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:886:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl rule__Entity__Group__7 ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:890:1: ( rule__Entity__Group__6__Impl rule__Entity__Group__7 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:891:2: rule__Entity__Group__6__Impl rule__Entity__Group__7
            {
            pushFollow(FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__61790);
            rule__Entity__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__61793);
            rule__Entity__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__6"


    // $ANTLR start "rule__Entity__Group__6__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:898:1: rule__Entity__Group__6__Impl : ( '{' ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:902:1: ( ( '{' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:903:1: ( '{' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:903:1: ( '{' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:904:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_17_in_rule__Entity__Group__6__Impl1821); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__6__Impl"


    // $ANTLR start "rule__Entity__Group__7"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:917:1: rule__Entity__Group__7 : rule__Entity__Group__7__Impl rule__Entity__Group__8 ;
    public final void rule__Entity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:921:1: ( rule__Entity__Group__7__Impl rule__Entity__Group__8 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:922:2: rule__Entity__Group__7__Impl rule__Entity__Group__8
            {
            pushFollow(FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__71852);
            rule__Entity__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__8_in_rule__Entity__Group__71855);
            rule__Entity__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__7"


    // $ANTLR start "rule__Entity__Group__7__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:929:1: rule__Entity__Group__7__Impl : ( ( rule__Entity__FeaturesAssignment_7 )* ) ;
    public final void rule__Entity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:933:1: ( ( ( rule__Entity__FeaturesAssignment_7 )* ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:934:1: ( ( rule__Entity__FeaturesAssignment_7 )* )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:934:1: ( ( rule__Entity__FeaturesAssignment_7 )* )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:935:1: ( rule__Entity__FeaturesAssignment_7 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_7()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:936:1: ( rule__Entity__FeaturesAssignment_7 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_DOC_COMMENT)||(LA7_0>=29 && LA7_0<=30)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:936:2: rule__Entity__FeaturesAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_7_in_rule__Entity__Group__7__Impl1882);
            	    rule__Entity__FeaturesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getFeaturesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__7__Impl"


    // $ANTLR start "rule__Entity__Group__8"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:946:1: rule__Entity__Group__8 : rule__Entity__Group__8__Impl ;
    public final void rule__Entity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:950:1: ( rule__Entity__Group__8__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:951:2: rule__Entity__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__8__Impl_in_rule__Entity__Group__81913);
            rule__Entity__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__8"


    // $ANTLR start "rule__Entity__Group__8__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:957:1: rule__Entity__Group__8__Impl : ( '}' ) ;
    public final void rule__Entity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:961:1: ( ( '}' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:962:1: ( '}' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:962:1: ( '}' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:963:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8()); 
            match(input,18,FOLLOW_18_in_rule__Entity__Group__8__Impl1941); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__8__Impl"


    // $ANTLR start "rule__Entity__Group_5__0"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:994:1: rule__Entity__Group_5__0 : rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1 ;
    public final void rule__Entity__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:998:1: ( rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:999:2: rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_5__0__Impl_in_rule__Entity__Group_5__01990);
            rule__Entity__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_5__1_in_rule__Entity__Group_5__01993);
            rule__Entity__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_5__0"


    // $ANTLR start "rule__Entity__Group_5__0__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1006:1: rule__Entity__Group_5__0__Impl : ( ':' ) ;
    public final void rule__Entity__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1010:1: ( ( ':' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1011:1: ( ':' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1011:1: ( ':' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1012:1: ':'
            {
             before(grammarAccess.getEntityAccess().getColonKeyword_5_0()); 
            match(input,19,FOLLOW_19_in_rule__Entity__Group_5__0__Impl2021); 
             after(grammarAccess.getEntityAccess().getColonKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_5__0__Impl"


    // $ANTLR start "rule__Entity__Group_5__1"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1025:1: rule__Entity__Group_5__1 : rule__Entity__Group_5__1__Impl ;
    public final void rule__Entity__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1029:1: ( rule__Entity__Group_5__1__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1030:2: rule__Entity__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_5__1__Impl_in_rule__Entity__Group_5__12052);
            rule__Entity__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_5__1"


    // $ANTLR start "rule__Entity__Group_5__1__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1036:1: rule__Entity__Group_5__1__Impl : ( ( rule__Entity__SuperAssignment_5_1 ) ) ;
    public final void rule__Entity__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1040:1: ( ( ( rule__Entity__SuperAssignment_5_1 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1041:1: ( ( rule__Entity__SuperAssignment_5_1 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1041:1: ( ( rule__Entity__SuperAssignment_5_1 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1042:1: ( rule__Entity__SuperAssignment_5_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperAssignment_5_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1043:1: ( rule__Entity__SuperAssignment_5_1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1043:2: rule__Entity__SuperAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Entity__SuperAssignment_5_1_in_rule__Entity__Group_5__1__Impl2079);
            rule__Entity__SuperAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_5__1__Impl"


    // $ANTLR start "rule__Annotation__Group__0"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1057:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1061:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1062:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__02113);
            rule__Annotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__02116);
            rule__Annotation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__0"


    // $ANTLR start "rule__Annotation__Group__0__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1069:1: rule__Annotation__Group__0__Impl : ( '@' ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1073:1: ( ( '@' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1074:1: ( '@' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1074:1: ( '@' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1075:1: '@'
            {
             before(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Annotation__Group__0__Impl2144); 
             after(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__0__Impl"


    // $ANTLR start "rule__Annotation__Group__1"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1088:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1092:1: ( rule__Annotation__Group__1__Impl rule__Annotation__Group__2 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1093:2: rule__Annotation__Group__1__Impl rule__Annotation__Group__2
            {
            pushFollow(FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__12175);
            rule__Annotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__12178);
            rule__Annotation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__1"


    // $ANTLR start "rule__Annotation__Group__1__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1100:1: rule__Annotation__Group__1__Impl : ( ( rule__Annotation__OptionAssignment_1 ) ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1104:1: ( ( ( rule__Annotation__OptionAssignment_1 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1105:1: ( ( rule__Annotation__OptionAssignment_1 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1105:1: ( ( rule__Annotation__OptionAssignment_1 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1106:1: ( rule__Annotation__OptionAssignment_1 )
            {
             before(grammarAccess.getAnnotationAccess().getOptionAssignment_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1107:1: ( rule__Annotation__OptionAssignment_1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1107:2: rule__Annotation__OptionAssignment_1
            {
            pushFollow(FOLLOW_rule__Annotation__OptionAssignment_1_in_rule__Annotation__Group__1__Impl2205);
            rule__Annotation__OptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getOptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__1__Impl"


    // $ANTLR start "rule__Annotation__Group__2"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1117:1: rule__Annotation__Group__2 : rule__Annotation__Group__2__Impl ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1121:1: ( rule__Annotation__Group__2__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1122:2: rule__Annotation__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__22235);
            rule__Annotation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__2"


    // $ANTLR start "rule__Annotation__Group__2__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1128:1: rule__Annotation__Group__2__Impl : ( ( rule__Annotation__Group_2__0 )? ) ;
    public final void rule__Annotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1132:1: ( ( ( rule__Annotation__Group_2__0 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1133:1: ( ( rule__Annotation__Group_2__0 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1133:1: ( ( rule__Annotation__Group_2__0 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1134:1: ( rule__Annotation__Group_2__0 )?
            {
             before(grammarAccess.getAnnotationAccess().getGroup_2()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1135:1: ( rule__Annotation__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1135:2: rule__Annotation__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Annotation__Group_2__0_in_rule__Annotation__Group__2__Impl2262);
                    rule__Annotation__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnnotationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__2__Impl"


    // $ANTLR start "rule__Annotation__Group_2__0"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1151:1: rule__Annotation__Group_2__0 : rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1 ;
    public final void rule__Annotation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1155:1: ( rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1156:2: rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__0__Impl_in_rule__Annotation__Group_2__02299);
            rule__Annotation__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group_2__1_in_rule__Annotation__Group_2__02302);
            rule__Annotation__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_2__0"


    // $ANTLR start "rule__Annotation__Group_2__0__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1163:1: rule__Annotation__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Annotation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1167:1: ( ( ':' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1168:1: ( ':' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1168:1: ( ':' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1169:1: ':'
            {
             before(grammarAccess.getAnnotationAccess().getColonKeyword_2_0()); 
            match(input,19,FOLLOW_19_in_rule__Annotation__Group_2__0__Impl2330); 
             after(grammarAccess.getAnnotationAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_2__0__Impl"


    // $ANTLR start "rule__Annotation__Group_2__1"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1182:1: rule__Annotation__Group_2__1 : rule__Annotation__Group_2__1__Impl ;
    public final void rule__Annotation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1186:1: ( rule__Annotation__Group_2__1__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1187:2: rule__Annotation__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__1__Impl_in_rule__Annotation__Group_2__12361);
            rule__Annotation__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_2__1"


    // $ANTLR start "rule__Annotation__Group_2__1__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1193:1: rule__Annotation__Group_2__1__Impl : ( ( rule__Annotation__ValueAssignment_2_1 ) ) ;
    public final void rule__Annotation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1197:1: ( ( ( rule__Annotation__ValueAssignment_2_1 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1198:1: ( ( rule__Annotation__ValueAssignment_2_1 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1198:1: ( ( rule__Annotation__ValueAssignment_2_1 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1199:1: ( rule__Annotation__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAnnotationAccess().getValueAssignment_2_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1200:1: ( rule__Annotation__ValueAssignment_2_1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1200:2: rule__Annotation__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Annotation__ValueAssignment_2_1_in_rule__Annotation__Group_2__1__Impl2388);
            rule__Annotation__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_2__1__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1214:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1218:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1219:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__02422);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__02425);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1226:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__CommentAssignment_0 )? ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1230:1: ( ( ( rule__Feature__CommentAssignment_0 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1231:1: ( ( rule__Feature__CommentAssignment_0 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1231:1: ( ( rule__Feature__CommentAssignment_0 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1232:1: ( rule__Feature__CommentAssignment_0 )?
            {
             before(grammarAccess.getFeatureAccess().getCommentAssignment_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1233:1: ( rule__Feature__CommentAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_DOC_COMMENT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1233:2: rule__Feature__CommentAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Feature__CommentAssignment_0_in_rule__Feature__Group__0__Impl2452);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1243:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1247:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1248:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__12483);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__12486);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1255:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__IsIndexedAssignment_1 )? ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1259:1: ( ( ( rule__Feature__IsIndexedAssignment_1 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1260:1: ( ( rule__Feature__IsIndexedAssignment_1 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1260:1: ( ( rule__Feature__IsIndexedAssignment_1 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1261:1: ( rule__Feature__IsIndexedAssignment_1 )?
            {
             before(grammarAccess.getFeatureAccess().getIsIndexedAssignment_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1262:1: ( rule__Feature__IsIndexedAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1262:2: rule__Feature__IsIndexedAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Feature__IsIndexedAssignment_1_in_rule__Feature__Group__1__Impl2513);
                    rule__Feature__IsIndexedAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getIsIndexedAssignment_1()); 

            }


            }

        }
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1272:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1276:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1277:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__22544);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__22547);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1284:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__IsContainmentAssignment_2 )? ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1288:1: ( ( ( rule__Feature__IsContainmentAssignment_2 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1289:1: ( ( rule__Feature__IsContainmentAssignment_2 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1289:1: ( ( rule__Feature__IsContainmentAssignment_2 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1290:1: ( rule__Feature__IsContainmentAssignment_2 )?
            {
             before(grammarAccess.getFeatureAccess().getIsContainmentAssignment_2()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1291:1: ( rule__Feature__IsContainmentAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1291:2: rule__Feature__IsContainmentAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Feature__IsContainmentAssignment_2_in_rule__Feature__Group__2__Impl2574);
                    rule__Feature__IsContainmentAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getIsContainmentAssignment_2()); 

            }


            }

        }
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1301:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1305:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1306:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
            {
            pushFollow(FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__32605);
            rule__Feature__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__4_in_rule__Feature__Group__32608);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1313:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__TypeAssignment_3 ) ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1317:1: ( ( ( rule__Feature__TypeAssignment_3 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1318:1: ( ( rule__Feature__TypeAssignment_3 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1318:1: ( ( rule__Feature__TypeAssignment_3 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1319:1: ( rule__Feature__TypeAssignment_3 )
            {
             before(grammarAccess.getFeatureAccess().getTypeAssignment_3()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1320:1: ( rule__Feature__TypeAssignment_3 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1320:2: rule__Feature__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Feature__TypeAssignment_3_in_rule__Feature__Group__3__Impl2635);
            rule__Feature__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getTypeAssignment_3()); 

            }


            }

        }
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1330:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl rule__Feature__Group__5 ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1334:1: ( rule__Feature__Group__4__Impl rule__Feature__Group__5 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1335:2: rule__Feature__Group__4__Impl rule__Feature__Group__5
            {
            pushFollow(FOLLOW_rule__Feature__Group__4__Impl_in_rule__Feature__Group__42665);
            rule__Feature__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__5_in_rule__Feature__Group__42668);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1342:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__NameAssignment_4 ) ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1346:1: ( ( ( rule__Feature__NameAssignment_4 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1347:1: ( ( rule__Feature__NameAssignment_4 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1347:1: ( ( rule__Feature__NameAssignment_4 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1348:1: ( rule__Feature__NameAssignment_4 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_4()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1349:1: ( rule__Feature__NameAssignment_4 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1349:2: rule__Feature__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__Feature__NameAssignment_4_in_rule__Feature__Group__4__Impl2695);
            rule__Feature__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_4()); 

            }


            }

        }
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1359:1: rule__Feature__Group__5 : rule__Feature__Group__5__Impl rule__Feature__Group__6 ;
    public final void rule__Feature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1363:1: ( rule__Feature__Group__5__Impl rule__Feature__Group__6 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1364:2: rule__Feature__Group__5__Impl rule__Feature__Group__6
            {
            pushFollow(FOLLOW_rule__Feature__Group__5__Impl_in_rule__Feature__Group__52725);
            rule__Feature__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__6_in_rule__Feature__Group__52728);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1371:1: rule__Feature__Group__5__Impl : ( ( rule__Feature__Group_5__0 )? ) ;
    public final void rule__Feature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1375:1: ( ( ( rule__Feature__Group_5__0 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1376:1: ( ( rule__Feature__Group_5__0 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1376:1: ( ( rule__Feature__Group_5__0 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1377:1: ( rule__Feature__Group_5__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_5()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1378:1: ( rule__Feature__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1378:2: rule__Feature__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Feature__Group_5__0_in_rule__Feature__Group__5__Impl2755);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1388:1: rule__Feature__Group__6 : rule__Feature__Group__6__Impl rule__Feature__Group__7 ;
    public final void rule__Feature__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1392:1: ( rule__Feature__Group__6__Impl rule__Feature__Group__7 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1393:2: rule__Feature__Group__6__Impl rule__Feature__Group__7
            {
            pushFollow(FOLLOW_rule__Feature__Group__6__Impl_in_rule__Feature__Group__62786);
            rule__Feature__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__7_in_rule__Feature__Group__62789);
            rule__Feature__Group__7();

            state._fsp--;


            }

        }
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1400:1: rule__Feature__Group__6__Impl : ( ( rule__Feature__Group_6__0 )? ) ;
    public final void rule__Feature__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1404:1: ( ( ( rule__Feature__Group_6__0 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1405:1: ( ( rule__Feature__Group_6__0 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1405:1: ( ( rule__Feature__Group_6__0 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1406:1: ( rule__Feature__Group_6__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_6()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1407:1: ( rule__Feature__Group_6__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1407:2: rule__Feature__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Feature__Group_6__0_in_rule__Feature__Group__6__Impl2816);
                    rule__Feature__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getGroup_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Feature__Group__7"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1417:1: rule__Feature__Group__7 : rule__Feature__Group__7__Impl ;
    public final void rule__Feature__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1421:1: ( rule__Feature__Group__7__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1422:2: rule__Feature__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group__7__Impl_in_rule__Feature__Group__72847);
            rule__Feature__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__7"


    // $ANTLR start "rule__Feature__Group__7__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1428:1: rule__Feature__Group__7__Impl : ( ';' ) ;
    public final void rule__Feature__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1432:1: ( ( ';' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1433:1: ( ';' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1433:1: ( ';' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1434:1: ';'
            {
             before(grammarAccess.getFeatureAccess().getSemicolonKeyword_7()); 
            match(input,21,FOLLOW_21_in_rule__Feature__Group__7__Impl2875); 
             after(grammarAccess.getFeatureAccess().getSemicolonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__7__Impl"


    // $ANTLR start "rule__Feature__Group_5__0"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1463:1: rule__Feature__Group_5__0 : rule__Feature__Group_5__0__Impl rule__Feature__Group_5__1 ;
    public final void rule__Feature__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1467:1: ( rule__Feature__Group_5__0__Impl rule__Feature__Group_5__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1468:2: rule__Feature__Group_5__0__Impl rule__Feature__Group_5__1
            {
            pushFollow(FOLLOW_rule__Feature__Group_5__0__Impl_in_rule__Feature__Group_5__02922);
            rule__Feature__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group_5__1_in_rule__Feature__Group_5__02925);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1475:1: rule__Feature__Group_5__0__Impl : ( '=' ) ;
    public final void rule__Feature__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1479:1: ( ( '=' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1480:1: ( '=' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1480:1: ( '=' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1481:1: '='
            {
             before(grammarAccess.getFeatureAccess().getEqualsSignKeyword_5_0()); 
            match(input,22,FOLLOW_22_in_rule__Feature__Group_5__0__Impl2953); 
             after(grammarAccess.getFeatureAccess().getEqualsSignKeyword_5_0()); 

            }


            }

        }
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1494:1: rule__Feature__Group_5__1 : rule__Feature__Group_5__1__Impl ;
    public final void rule__Feature__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1498:1: ( rule__Feature__Group_5__1__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1499:2: rule__Feature__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group_5__1__Impl_in_rule__Feature__Group_5__12984);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1505:1: rule__Feature__Group_5__1__Impl : ( ( rule__Feature__DefaultValueAssignment_5_1 ) ) ;
    public final void rule__Feature__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1509:1: ( ( ( rule__Feature__DefaultValueAssignment_5_1 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1510:1: ( ( rule__Feature__DefaultValueAssignment_5_1 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1510:1: ( ( rule__Feature__DefaultValueAssignment_5_1 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1511:1: ( rule__Feature__DefaultValueAssignment_5_1 )
            {
             before(grammarAccess.getFeatureAccess().getDefaultValueAssignment_5_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1512:1: ( rule__Feature__DefaultValueAssignment_5_1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1512:2: rule__Feature__DefaultValueAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Feature__DefaultValueAssignment_5_1_in_rule__Feature__Group_5__1__Impl3011);
            rule__Feature__DefaultValueAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getDefaultValueAssignment_5_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Feature__Group_6__0"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1526:1: rule__Feature__Group_6__0 : rule__Feature__Group_6__0__Impl rule__Feature__Group_6__1 ;
    public final void rule__Feature__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1530:1: ( rule__Feature__Group_6__0__Impl rule__Feature__Group_6__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1531:2: rule__Feature__Group_6__0__Impl rule__Feature__Group_6__1
            {
            pushFollow(FOLLOW_rule__Feature__Group_6__0__Impl_in_rule__Feature__Group_6__03045);
            rule__Feature__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group_6__1_in_rule__Feature__Group_6__03048);
            rule__Feature__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_6__0"


    // $ANTLR start "rule__Feature__Group_6__0__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1538:1: rule__Feature__Group_6__0__Impl : ( '<->' ) ;
    public final void rule__Feature__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1542:1: ( ( '<->' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1543:1: ( '<->' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1543:1: ( '<->' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1544:1: '<->'
            {
             before(grammarAccess.getFeatureAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_6_0()); 
            match(input,23,FOLLOW_23_in_rule__Feature__Group_6__0__Impl3076); 
             after(grammarAccess.getFeatureAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_6__0__Impl"


    // $ANTLR start "rule__Feature__Group_6__1"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1557:1: rule__Feature__Group_6__1 : rule__Feature__Group_6__1__Impl ;
    public final void rule__Feature__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1561:1: ( rule__Feature__Group_6__1__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1562:2: rule__Feature__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group_6__1__Impl_in_rule__Feature__Group_6__13107);
            rule__Feature__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_6__1"


    // $ANTLR start "rule__Feature__Group_6__1__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1568:1: rule__Feature__Group_6__1__Impl : ( ( rule__Feature__InverseAssignment_6_1 ) ) ;
    public final void rule__Feature__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1572:1: ( ( ( rule__Feature__InverseAssignment_6_1 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1573:1: ( ( rule__Feature__InverseAssignment_6_1 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1573:1: ( ( rule__Feature__InverseAssignment_6_1 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1574:1: ( rule__Feature__InverseAssignment_6_1 )
            {
             before(grammarAccess.getFeatureAccess().getInverseAssignment_6_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1575:1: ( rule__Feature__InverseAssignment_6_1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1575:2: rule__Feature__InverseAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Feature__InverseAssignment_6_1_in_rule__Feature__Group_6__1__Impl3134);
            rule__Feature__InverseAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getInverseAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_6__1__Impl"


    // $ANTLR start "rule__Primitive__Group__0"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1590:1: rule__Primitive__Group__0 : rule__Primitive__Group__0__Impl rule__Primitive__Group__1 ;
    public final void rule__Primitive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1594:1: ( rule__Primitive__Group__0__Impl rule__Primitive__Group__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1595:2: rule__Primitive__Group__0__Impl rule__Primitive__Group__1
            {
            pushFollow(FOLLOW_rule__Primitive__Group__0__Impl_in_rule__Primitive__Group__03169);
            rule__Primitive__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primitive__Group__1_in_rule__Primitive__Group__03172);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1602:1: rule__Primitive__Group__0__Impl : ( 'primitive type' ) ;
    public final void rule__Primitive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1606:1: ( ( 'primitive type' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1607:1: ( 'primitive type' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1607:1: ( 'primitive type' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1608:1: 'primitive type'
            {
             before(grammarAccess.getPrimitiveAccess().getPrimitiveTypeKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Primitive__Group__0__Impl3200); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1621:1: rule__Primitive__Group__1 : rule__Primitive__Group__1__Impl ;
    public final void rule__Primitive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1625:1: ( rule__Primitive__Group__1__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1626:2: rule__Primitive__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Primitive__Group__1__Impl_in_rule__Primitive__Group__13231);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1632:1: rule__Primitive__Group__1__Impl : ( ( rule__Primitive__NameAssignment_1 ) ) ;
    public final void rule__Primitive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1636:1: ( ( ( rule__Primitive__NameAssignment_1 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1637:1: ( ( rule__Primitive__NameAssignment_1 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1637:1: ( ( rule__Primitive__NameAssignment_1 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1638:1: ( rule__Primitive__NameAssignment_1 )
            {
             before(grammarAccess.getPrimitiveAccess().getNameAssignment_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1639:1: ( rule__Primitive__NameAssignment_1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1639:2: rule__Primitive__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Primitive__NameAssignment_1_in_rule__Primitive__Group__1__Impl3258);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1653:1: rule__Any__Group__0 : rule__Any__Group__0__Impl rule__Any__Group__1 ;
    public final void rule__Any__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1657:1: ( rule__Any__Group__0__Impl rule__Any__Group__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1658:2: rule__Any__Group__0__Impl rule__Any__Group__1
            {
            pushFollow(FOLLOW_rule__Any__Group__0__Impl_in_rule__Any__Group__03292);
            rule__Any__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Any__Group__1_in_rule__Any__Group__03295);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1665:1: rule__Any__Group__0__Impl : ( 'any type' ) ;
    public final void rule__Any__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1669:1: ( ( 'any type' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1670:1: ( 'any type' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1670:1: ( 'any type' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1671:1: 'any type'
            {
             before(grammarAccess.getAnyAccess().getAnyTypeKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Any__Group__0__Impl3323); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1684:1: rule__Any__Group__1 : rule__Any__Group__1__Impl ;
    public final void rule__Any__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1688:1: ( rule__Any__Group__1__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1689:2: rule__Any__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Any__Group__1__Impl_in_rule__Any__Group__13354);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1695:1: rule__Any__Group__1__Impl : ( ( rule__Any__NameAssignment_1 ) ) ;
    public final void rule__Any__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1699:1: ( ( ( rule__Any__NameAssignment_1 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1700:1: ( ( rule__Any__NameAssignment_1 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1700:1: ( ( rule__Any__NameAssignment_1 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1701:1: ( rule__Any__NameAssignment_1 )
            {
             before(grammarAccess.getAnyAccess().getNameAssignment_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1702:1: ( rule__Any__NameAssignment_1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1702:2: rule__Any__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Any__NameAssignment_1_in_rule__Any__Group__1__Impl3381);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1716:1: rule__TypeRef__Group__0 : rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 ;
    public final void rule__TypeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1720:1: ( rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1721:2: rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__03415);
            rule__TypeRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__03418);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1728:1: rule__TypeRef__Group__0__Impl : ( ( rule__TypeRef__ReferencedAssignment_0 ) ) ;
    public final void rule__TypeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1732:1: ( ( ( rule__TypeRef__ReferencedAssignment_0 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1733:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1733:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1734:1: ( rule__TypeRef__ReferencedAssignment_0 )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedAssignment_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1735:1: ( rule__TypeRef__ReferencedAssignment_0 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1735:2: rule__TypeRef__ReferencedAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl3445);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1745:1: rule__TypeRef__Group__1 : rule__TypeRef__Group__1__Impl ;
    public final void rule__TypeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1749:1: ( rule__TypeRef__Group__1__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1750:2: rule__TypeRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__13475);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1756:1: rule__TypeRef__Group__1__Impl : ( ( rule__TypeRef__IsMultiAssignment_1 )? ) ;
    public final void rule__TypeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1760:1: ( ( ( rule__TypeRef__IsMultiAssignment_1 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1761:1: ( ( rule__TypeRef__IsMultiAssignment_1 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1761:1: ( ( rule__TypeRef__IsMultiAssignment_1 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1762:1: ( rule__TypeRef__IsMultiAssignment_1 )?
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiAssignment_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1763:1: ( rule__TypeRef__IsMultiAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1763:2: rule__TypeRef__IsMultiAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TypeRef__IsMultiAssignment_1_in_rule__TypeRef__Group__1__Impl3502);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1777:1: rule__EFloatObject__Group__0 : rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1 ;
    public final void rule__EFloatObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1781:1: ( rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1782:2: rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__0__Impl_in_rule__EFloatObject__Group__03537);
            rule__EFloatObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__1_in_rule__EFloatObject__Group__03540);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1789:1: rule__EFloatObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloatObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1793:1: ( ( ( '-' )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1794:1: ( ( '-' )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1794:1: ( ( '-' )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1795:1: ( '-' )?
            {
             before(grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1796:1: ( '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1797:2: '-'
                    {
                    match(input,26,FOLLOW_26_in_rule__EFloatObject__Group__0__Impl3569); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1808:1: rule__EFloatObject__Group__1 : rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2 ;
    public final void rule__EFloatObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1812:1: ( rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1813:2: rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__1__Impl_in_rule__EFloatObject__Group__13602);
            rule__EFloatObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__2_in_rule__EFloatObject__Group__13605);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1820:1: rule__EFloatObject__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloatObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1824:1: ( ( ( RULE_INT )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1825:1: ( ( RULE_INT )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1825:1: ( ( RULE_INT )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1826:1: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1827:1: ( RULE_INT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1827:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EFloatObject__Group__1__Impl3633); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1837:1: rule__EFloatObject__Group__2 : rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3 ;
    public final void rule__EFloatObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1841:1: ( rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1842:2: rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__2__Impl_in_rule__EFloatObject__Group__23664);
            rule__EFloatObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__3_in_rule__EFloatObject__Group__23667);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1849:1: rule__EFloatObject__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloatObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1853:1: ( ( '.' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1854:1: ( '.' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1854:1: ( '.' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1855:1: '.'
            {
             before(grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__EFloatObject__Group__2__Impl3695); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1868:1: rule__EFloatObject__Group__3 : rule__EFloatObject__Group__3__Impl ;
    public final void rule__EFloatObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1872:1: ( rule__EFloatObject__Group__3__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1873:2: rule__EFloatObject__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__3__Impl_in_rule__EFloatObject__Group__33726);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1879:1: rule__EFloatObject__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloatObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1883:1: ( ( RULE_INT ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1884:1: ( RULE_INT )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1884:1: ( RULE_INT )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1885:1: RULE_INT
            {
             before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EFloatObject__Group__3__Impl3753); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1904:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1908:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1909:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03790);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03793);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1916:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1920:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1921:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1921:1: ( RULE_ID )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1922:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3820); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1933:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1937:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1938:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13849);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1944:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1948:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1949:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1949:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1950:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1951:1: ( rule__QualifiedName__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1951:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3876);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1965:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1969:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1970:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03911);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03914);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1977:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1981:1: ( ( '.' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1982:1: ( '.' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1982:1: ( '.' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1983:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__QualifiedName__Group_1__0__Impl3942); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1996:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2000:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2001:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13973);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2007:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2011:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2012:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2012:1: ( RULE_ID )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2013:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4000); 
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


    // $ANTLR start "rule__EntityModel__ModuleAssignment_1"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2029:1: rule__EntityModel__ModuleAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EntityModel__ModuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2033:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2034:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2034:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2035:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getEntityModelAccess().getModuleModuleCrossReference_1_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2036:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2037:1: ruleQualifiedName
            {
             before(grammarAccess.getEntityModelAccess().getModuleModuleQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__EntityModel__ModuleAssignment_14042);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getEntityModelAccess().getModuleModuleQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getEntityModelAccess().getModuleModuleCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityModel__ModuleAssignment_1"


    // $ANTLR start "rule__EntityModel__VersionAssignment_3"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2048:1: rule__EntityModel__VersionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__EntityModel__VersionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2052:1: ( ( RULE_STRING ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2053:1: ( RULE_STRING )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2053:1: ( RULE_STRING )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2054:1: RULE_STRING
            {
             before(grammarAccess.getEntityModelAccess().getVersionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EntityModel__VersionAssignment_34077); 
             after(grammarAccess.getEntityModelAccess().getVersionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityModel__VersionAssignment_3"


    // $ANTLR start "rule__EntityModel__EntitiesAssignment_4"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2063:1: rule__EntityModel__EntitiesAssignment_4 : ( ruleEntity ) ;
    public final void rule__EntityModel__EntitiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2067:1: ( ( ruleEntity ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2068:1: ( ruleEntity )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2068:1: ( ruleEntity )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2069:1: ruleEntity
            {
             before(grammarAccess.getEntityModelAccess().getEntitiesEntityParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__EntityModel__EntitiesAssignment_44108);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityModelAccess().getEntitiesEntityParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityModel__EntitiesAssignment_4"


    // $ANTLR start "rule__Entity__CommentAssignment_0"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2078:1: rule__Entity__CommentAssignment_0 : ( RULE_DOC_COMMENT ) ;
    public final void rule__Entity__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2082:1: ( ( RULE_DOC_COMMENT ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2083:1: ( RULE_DOC_COMMENT )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2083:1: ( RULE_DOC_COMMENT )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2084:1: RULE_DOC_COMMENT
            {
             before(grammarAccess.getEntityAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_rule__Entity__CommentAssignment_04139); 
             after(grammarAccess.getEntityAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__CommentAssignment_0"


    // $ANTLR start "rule__Entity__AnnotationsAssignment_1"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2093:1: rule__Entity__AnnotationsAssignment_1 : ( ruleAnnotation ) ;
    public final void rule__Entity__AnnotationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2097:1: ( ( ruleAnnotation ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2098:1: ( ruleAnnotation )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2098:1: ( ruleAnnotation )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2099:1: ruleAnnotation
            {
             before(grammarAccess.getEntityAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Entity__AnnotationsAssignment_14170);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__AnnotationsAssignment_1"


    // $ANTLR start "rule__Entity__IsAbstractAssignment_2"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2108:1: rule__Entity__IsAbstractAssignment_2 : ( ( 'abstract' ) ) ;
    public final void rule__Entity__IsAbstractAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2112:1: ( ( ( 'abstract' ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2113:1: ( ( 'abstract' ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2113:1: ( ( 'abstract' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2114:1: ( 'abstract' )
            {
             before(grammarAccess.getEntityAccess().getIsAbstractAbstractKeyword_2_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2115:1: ( 'abstract' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2116:1: 'abstract'
            {
             before(grammarAccess.getEntityAccess().getIsAbstractAbstractKeyword_2_0()); 
            match(input,28,FOLLOW_28_in_rule__Entity__IsAbstractAssignment_24206); 
             after(grammarAccess.getEntityAccess().getIsAbstractAbstractKeyword_2_0()); 

            }

             after(grammarAccess.getEntityAccess().getIsAbstractAbstractKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__IsAbstractAssignment_2"


    // $ANTLR start "rule__Entity__NameAssignment_4"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2131:1: rule__Entity__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2135:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2136:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2136:1: ( RULE_ID )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2137:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_44245); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_4"


    // $ANTLR start "rule__Entity__SuperAssignment_5_1"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2146:1: rule__Entity__SuperAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Entity__SuperAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2150:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2151:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2151:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2152:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getEntityAccess().getSuperEntityCrossReference_5_1_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2153:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2154:1: ruleQualifiedName
            {
             before(grammarAccess.getEntityAccess().getSuperEntityQualifiedNameParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Entity__SuperAssignment_5_14280);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getSuperEntityQualifiedNameParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperEntityCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__SuperAssignment_5_1"


    // $ANTLR start "rule__Entity__FeaturesAssignment_7"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2165:1: rule__Entity__FeaturesAssignment_7 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2169:1: ( ( ruleFeature ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2170:1: ( ruleFeature )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2170:1: ( ruleFeature )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2171:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_74315);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__FeaturesAssignment_7"


    // $ANTLR start "rule__Annotation__OptionAssignment_1"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2180:1: rule__Annotation__OptionAssignment_1 : ( ruleConfigOption ) ;
    public final void rule__Annotation__OptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2184:1: ( ( ruleConfigOption ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2185:1: ( ruleConfigOption )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2185:1: ( ruleConfigOption )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2186:1: ruleConfigOption
            {
             before(grammarAccess.getAnnotationAccess().getOptionConfigOptionEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConfigOption_in_rule__Annotation__OptionAssignment_14346);
            ruleConfigOption();

            state._fsp--;

             after(grammarAccess.getAnnotationAccess().getOptionConfigOptionEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__OptionAssignment_1"


    // $ANTLR start "rule__Annotation__ValueAssignment_2_1"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2195:1: rule__Annotation__ValueAssignment_2_1 : ( ruleConfigValue ) ;
    public final void rule__Annotation__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2199:1: ( ( ruleConfigValue ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2200:1: ( ruleConfigValue )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2200:1: ( ruleConfigValue )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2201:1: ruleConfigValue
            {
             before(grammarAccess.getAnnotationAccess().getValueConfigValueEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleConfigValue_in_rule__Annotation__ValueAssignment_2_14377);
            ruleConfigValue();

            state._fsp--;

             after(grammarAccess.getAnnotationAccess().getValueConfigValueEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__ValueAssignment_2_1"


    // $ANTLR start "rule__Feature__CommentAssignment_0"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2210:1: rule__Feature__CommentAssignment_0 : ( RULE_DOC_COMMENT ) ;
    public final void rule__Feature__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2214:1: ( ( RULE_DOC_COMMENT ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2215:1: ( RULE_DOC_COMMENT )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2215:1: ( RULE_DOC_COMMENT )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2216:1: RULE_DOC_COMMENT
            {
             before(grammarAccess.getFeatureAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_rule__Feature__CommentAssignment_04408); 
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


    // $ANTLR start "rule__Feature__IsIndexedAssignment_1"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2225:1: rule__Feature__IsIndexedAssignment_1 : ( ( 'indexed' ) ) ;
    public final void rule__Feature__IsIndexedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2229:1: ( ( ( 'indexed' ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2230:1: ( ( 'indexed' ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2230:1: ( ( 'indexed' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2231:1: ( 'indexed' )
            {
             before(grammarAccess.getFeatureAccess().getIsIndexedIndexedKeyword_1_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2232:1: ( 'indexed' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2233:1: 'indexed'
            {
             before(grammarAccess.getFeatureAccess().getIsIndexedIndexedKeyword_1_0()); 
            match(input,29,FOLLOW_29_in_rule__Feature__IsIndexedAssignment_14444); 
             after(grammarAccess.getFeatureAccess().getIsIndexedIndexedKeyword_1_0()); 

            }

             after(grammarAccess.getFeatureAccess().getIsIndexedIndexedKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__IsIndexedAssignment_1"


    // $ANTLR start "rule__Feature__IsContainmentAssignment_2"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2248:1: rule__Feature__IsContainmentAssignment_2 : ( ( '-[' ) ) ;
    public final void rule__Feature__IsContainmentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2252:1: ( ( ( '-[' ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2253:1: ( ( '-[' ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2253:1: ( ( '-[' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2254:1: ( '-[' )
            {
             before(grammarAccess.getFeatureAccess().getIsContainmentHyphenMinusLeftSquareBracketKeyword_2_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2255:1: ( '-[' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2256:1: '-['
            {
             before(grammarAccess.getFeatureAccess().getIsContainmentHyphenMinusLeftSquareBracketKeyword_2_0()); 
            match(input,30,FOLLOW_30_in_rule__Feature__IsContainmentAssignment_24488); 
             after(grammarAccess.getFeatureAccess().getIsContainmentHyphenMinusLeftSquareBracketKeyword_2_0()); 

            }

             after(grammarAccess.getFeatureAccess().getIsContainmentHyphenMinusLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__IsContainmentAssignment_2"


    // $ANTLR start "rule__Feature__TypeAssignment_3"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2271:1: rule__Feature__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__Feature__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2275:1: ( ( ruleTypeRef ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2276:1: ( ruleTypeRef )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2276:1: ( ruleTypeRef )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2277:1: ruleTypeRef
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Feature__TypeAssignment_34527);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getTypeTypeRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__TypeAssignment_3"


    // $ANTLR start "rule__Feature__NameAssignment_4"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2286:1: rule__Feature__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2290:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2291:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2291:1: ( RULE_ID )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2292:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_44558); 
             after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__NameAssignment_4"


    // $ANTLR start "rule__Feature__DefaultValueAssignment_5_1"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2301:1: rule__Feature__DefaultValueAssignment_5_1 : ( ruleValueObject ) ;
    public final void rule__Feature__DefaultValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2305:1: ( ( ruleValueObject ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2306:1: ( ruleValueObject )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2306:1: ( ruleValueObject )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2307:1: ruleValueObject
            {
             before(grammarAccess.getFeatureAccess().getDefaultValueValueObjectParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleValueObject_in_rule__Feature__DefaultValueAssignment_5_14589);
            ruleValueObject();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getDefaultValueValueObjectParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__DefaultValueAssignment_5_1"


    // $ANTLR start "rule__Feature__InverseAssignment_6_1"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2316:1: rule__Feature__InverseAssignment_6_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Feature__InverseAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2320:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2321:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2321:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2322:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getFeatureAccess().getInverseFeatureCrossReference_6_1_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2323:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2324:1: ruleQualifiedName
            {
             before(grammarAccess.getFeatureAccess().getInverseFeatureQualifiedNameParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Feature__InverseAssignment_6_14624);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getInverseFeatureQualifiedNameParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getFeatureAccess().getInverseFeatureCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__InverseAssignment_6_1"


    // $ANTLR start "rule__Primitive__NameAssignment_1"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2337:1: rule__Primitive__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Primitive__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2341:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2342:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2342:1: ( RULE_ID )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2343:1: RULE_ID
            {
             before(grammarAccess.getPrimitiveAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Primitive__NameAssignment_14661); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2352:1: rule__Any__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Any__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2356:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2357:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2357:1: ( RULE_ID )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2358:1: RULE_ID
            {
             before(grammarAccess.getAnyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Any__NameAssignment_14692); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2367:1: rule__TypeRef__ReferencedAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TypeRef__ReferencedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2371:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2372:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2372:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2373:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2374:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2375:1: ruleQualifiedName
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_04727);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2386:1: rule__TypeRef__IsMultiAssignment_1 : ( ( '[]' ) ) ;
    public final void rule__TypeRef__IsMultiAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2390:1: ( ( ( '[]' ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2391:1: ( ( '[]' ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2391:1: ( ( '[]' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2392:1: ( '[]' )
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2393:1: ( '[]' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2394:1: '[]'
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            match(input,31,FOLLOW_31_in_rule__TypeRef__IsMultiAssignment_14767); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2409:1: rule__StringValue__ValueAssignment : ( ruleEStringObject ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2413:1: ( ( ruleEStringObject ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2414:1: ( ruleEStringObject )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2414:1: ( ruleEStringObject )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2415:1: ruleEStringObject
            {
             before(grammarAccess.getStringValueAccess().getValueEStringObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEStringObject_in_rule__StringValue__ValueAssignment4806);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2424:1: rule__IntegerValue__ValueAssignment : ( ruleEIntegerObject ) ;
    public final void rule__IntegerValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2428:1: ( ( ruleEIntegerObject ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2429:1: ( ruleEIntegerObject )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2429:1: ( ruleEIntegerObject )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2430:1: ruleEIntegerObject
            {
             before(grammarAccess.getIntegerValueAccess().getValueEIntegerObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_rule__IntegerValue__ValueAssignment4837);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2439:1: rule__FloatValue__ValueAssignment : ( ruleEFloatObject ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2443:1: ( ( ruleEFloatObject ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2444:1: ( ruleEFloatObject )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2444:1: ( ruleEFloatObject )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2445:1: ruleEFloatObject
            {
             before(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_rule__FloatValue__ValueAssignment4868);
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


 

    public static final BitSet FOLLOW_ruleEntityModel_in_entryRuleEntityModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__0_in_ruleEntityModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0_in_ruleFeature274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__0_in_rulePrimitive336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAny_in_entryRuleAny363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAny370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__Group__0_in_ruleAny396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueObject_in_entryRuleValueObject483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueObject490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueObject__Alternatives_in_ruleValueObject516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_entryRuleEStringObject603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEStringObject610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEStringObject636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerValue__ValueAssignment_in_ruleIntegerValue695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEIntegerObject729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEIntegerObject755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEFloatObject848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__0_in_ruleEFloatObject874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleConfigOption972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleConfigValue1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__ValueObject__Alternatives1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_rule__ValueObject__Alternatives1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_rule__ValueObject__Alternatives1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__0__Impl_in_rule__EntityModel__Group__01112 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__1_in_rule__EntityModel__Group__01115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__EntityModel__Group__0__Impl1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__1__Impl_in_rule__EntityModel__Group__11174 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__2_in_rule__EntityModel__Group__11177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__ModuleAssignment_1_in_rule__EntityModel__Group__1__Impl1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__2__Impl_in_rule__EntityModel__Group__21234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__3_in_rule__EntityModel__Group__21237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__EntityModel__Group__2__Impl1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__3__Impl_in_rule__EntityModel__Group__31296 = new BitSet(new long[]{0x0000000010110080L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__4_in_rule__EntityModel__Group__31299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__VersionAssignment_3_in_rule__EntityModel__Group__3__Impl1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__4__Impl_in_rule__EntityModel__Group__41356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__EntitiesAssignment_4_in_rule__EntityModel__Group__4__Impl1383 = new BitSet(new long[]{0x0000000010110082L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01424 = new BitSet(new long[]{0x0000000010110080L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__CommentAssignment_0_in_rule__Entity__Group__0__Impl1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11485 = new BitSet(new long[]{0x0000000010110080L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__AnnotationsAssignment_1_in_rule__Entity__Group__1__Impl1515 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21546 = new BitSet(new long[]{0x0000000010110080L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__IsAbstractAssignment_2_in_rule__Entity__Group__2__Impl1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31607 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Entity__Group__3__Impl1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41669 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_4_in_rule__Entity__Group__4__Impl1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51729 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__51732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_5__0_in_rule__Entity__Group__5__Impl1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__61790 = new BitSet(new long[]{0x00000000600400C0L});
    public static final BitSet FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__61793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Entity__Group__6__Impl1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__71852 = new BitSet(new long[]{0x00000000600400C0L});
    public static final BitSet FOLLOW_rule__Entity__Group__8_in_rule__Entity__Group__71855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_7_in_rule__Entity__Group__7__Impl1882 = new BitSet(new long[]{0x00000000600000C2L});
    public static final BitSet FOLLOW_rule__Entity__Group__8__Impl_in_rule__Entity__Group__81913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Entity__Group__8__Impl1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_5__0__Impl_in_rule__Entity__Group_5__01990 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Entity__Group_5__1_in_rule__Entity__Group_5__01993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Entity__Group_5__0__Impl2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_5__1__Impl_in_rule__Entity__Group_5__12052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__SuperAssignment_5_1_in_rule__Entity__Group_5__1__Impl2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__02113 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__02116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Annotation__Group__0__Impl2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__12175 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__12178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__OptionAssignment_1_in_rule__Annotation__Group__1__Impl2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__22235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__0_in_rule__Annotation__Group__2__Impl2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__0__Impl_in_rule__Annotation__Group_2__02299 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__1_in_rule__Annotation__Group_2__02302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Annotation__Group_2__0__Impl2330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__1__Impl_in_rule__Annotation__Group_2__12361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__ValueAssignment_2_1_in_rule__Annotation__Group_2__1__Impl2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__02422 = new BitSet(new long[]{0x00000000600000C0L});
    public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__02425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__CommentAssignment_0_in_rule__Feature__Group__0__Impl2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__12483 = new BitSet(new long[]{0x00000000600000C0L});
    public static final BitSet FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__12486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__IsIndexedAssignment_1_in_rule__Feature__Group__1__Impl2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__22544 = new BitSet(new long[]{0x00000000600000C0L});
    public static final BitSet FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__22547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__IsContainmentAssignment_2_in_rule__Feature__Group__2__Impl2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__32605 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Feature__Group__4_in_rule__Feature__Group__32608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__TypeAssignment_3_in_rule__Feature__Group__3__Impl2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__4__Impl_in_rule__Feature__Group__42665 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_rule__Feature__Group__5_in_rule__Feature__Group__42668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__NameAssignment_4_in_rule__Feature__Group__4__Impl2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__5__Impl_in_rule__Feature__Group__52725 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_rule__Feature__Group__6_in_rule__Feature__Group__52728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_5__0_in_rule__Feature__Group__5__Impl2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__6__Impl_in_rule__Feature__Group__62786 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_rule__Feature__Group__7_in_rule__Feature__Group__62789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_6__0_in_rule__Feature__Group__6__Impl2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__7__Impl_in_rule__Feature__Group__72847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Feature__Group__7__Impl2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_5__0__Impl_in_rule__Feature__Group_5__02922 = new BitSet(new long[]{0x000000000C000030L});
    public static final BitSet FOLLOW_rule__Feature__Group_5__1_in_rule__Feature__Group_5__02925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Feature__Group_5__0__Impl2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_5__1__Impl_in_rule__Feature__Group_5__12984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__DefaultValueAssignment_5_1_in_rule__Feature__Group_5__1__Impl3011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_6__0__Impl_in_rule__Feature__Group_6__03045 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Feature__Group_6__1_in_rule__Feature__Group_6__03048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Feature__Group_6__0__Impl3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_6__1__Impl_in_rule__Feature__Group_6__13107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__InverseAssignment_6_1_in_rule__Feature__Group_6__1__Impl3134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__0__Impl_in_rule__Primitive__Group__03169 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Primitive__Group__1_in_rule__Primitive__Group__03172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Primitive__Group__0__Impl3200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__1__Impl_in_rule__Primitive__Group__13231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__NameAssignment_1_in_rule__Primitive__Group__1__Impl3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__Group__0__Impl_in_rule__Any__Group__03292 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Any__Group__1_in_rule__Any__Group__03295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Any__Group__0__Impl3323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__Group__1__Impl_in_rule__Any__Group__13354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__NameAssignment_1_in_rule__Any__Group__1__Impl3381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__03415 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__03418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl3445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__13475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__IsMultiAssignment_1_in_rule__TypeRef__Group__1__Impl3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__0__Impl_in_rule__EFloatObject__Group__03537 = new BitSet(new long[]{0x000000000C000030L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__1_in_rule__EFloatObject__Group__03540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__EFloatObject__Group__0__Impl3569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__1__Impl_in_rule__EFloatObject__Group__13602 = new BitSet(new long[]{0x000000000C000030L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__2_in_rule__EFloatObject__Group__13605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group__1__Impl3633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__2__Impl_in_rule__EFloatObject__Group__23664 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__3_in_rule__EFloatObject__Group__23667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__EFloatObject__Group__2__Impl3695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__3__Impl_in_rule__EFloatObject__Group__33726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group__3__Impl3753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03790 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3876 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03911 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__QualifiedName__Group_1__0__Impl3942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__EntityModel__ModuleAssignment_14042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EntityModel__VersionAssignment_34077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__EntityModel__EntitiesAssignment_44108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_rule__Entity__CommentAssignment_04139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Entity__AnnotationsAssignment_14170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Entity__IsAbstractAssignment_24206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_44245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Entity__SuperAssignment_5_14280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_74315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigOption_in_rule__Annotation__OptionAssignment_14346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigValue_in_rule__Annotation__ValueAssignment_2_14377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_rule__Feature__CommentAssignment_04408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Feature__IsIndexedAssignment_14444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Feature__IsContainmentAssignment_24488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Feature__TypeAssignment_34527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_44558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueObject_in_rule__Feature__DefaultValueAssignment_5_14589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Feature__InverseAssignment_6_14624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Primitive__NameAssignment_14661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Any__NameAssignment_14692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_04727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TypeRef__IsMultiAssignment_14767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_rule__StringValue__ValueAssignment4806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_rule__IntegerValue__ValueAssignment4837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_rule__FloatValue__ValueAssignment4868 = new BitSet(new long[]{0x0000000000000002L});

}