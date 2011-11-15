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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_DOC_COMMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'persistency'", "'CoreData'", "'entities for module'", "'version'", "'entity'", "'{'", "'}'", "':'", "'@'", "';'", "'='", "'<->'", "'enum'", "','", "'primitive type'", "'any type'", "'-'", "'.'", "'current'", "'abstract'", "'indexed'", "'-['", "'[]'"
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
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
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


    // $ANTLR start "entryRuleEnum"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:172:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:173:1: ( ruleEnum EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:174:1: ruleEnum EOF
            {
             before(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum301);
            ruleEnum();

            state._fsp--;

             after(grammarAccess.getEnumRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum308); 

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
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:181:1: ruleEnum : ( ( rule__Enum__Group__0 ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:185:2: ( ( ( rule__Enum__Group__0 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:186:1: ( ( rule__Enum__Group__0 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:186:1: ( ( rule__Enum__Group__0 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:187:1: ( rule__Enum__Group__0 )
            {
             before(grammarAccess.getEnumAccess().getGroup()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:188:1: ( rule__Enum__Group__0 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:188:2: rule__Enum__Group__0
            {
            pushFollow(FOLLOW_rule__Enum__Group__0_in_ruleEnum334);
            rule__Enum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleEnumLiteral"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:200:1: entryRuleEnumLiteral : ruleEnumLiteral EOF ;
    public final void entryRuleEnumLiteral() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:201:1: ( ruleEnumLiteral EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:202:1: ruleEnumLiteral EOF
            {
             before(grammarAccess.getEnumLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumLiteral_in_entryRuleEnumLiteral361);
            ruleEnumLiteral();

            state._fsp--;

             after(grammarAccess.getEnumLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumLiteral368); 

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
    // $ANTLR end "entryRuleEnumLiteral"


    // $ANTLR start "ruleEnumLiteral"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:209:1: ruleEnumLiteral : ( ( rule__EnumLiteral__NameAssignment ) ) ;
    public final void ruleEnumLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:213:2: ( ( ( rule__EnumLiteral__NameAssignment ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:214:1: ( ( rule__EnumLiteral__NameAssignment ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:214:1: ( ( rule__EnumLiteral__NameAssignment ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:215:1: ( rule__EnumLiteral__NameAssignment )
            {
             before(grammarAccess.getEnumLiteralAccess().getNameAssignment()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:216:1: ( rule__EnumLiteral__NameAssignment )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:216:2: rule__EnumLiteral__NameAssignment
            {
            pushFollow(FOLLOW_rule__EnumLiteral__NameAssignment_in_ruleEnumLiteral394);
            rule__EnumLiteral__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEnumLiteralAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumLiteral"


    // $ANTLR start "entryRulePrimitive"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:230:1: entryRulePrimitive : rulePrimitive EOF ;
    public final void entryRulePrimitive() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:231:1: ( rulePrimitive EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:232:1: rulePrimitive EOF
            {
             before(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive423);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getPrimitiveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive430); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:239:1: rulePrimitive : ( ( rule__Primitive__Group__0 ) ) ;
    public final void rulePrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:243:2: ( ( ( rule__Primitive__Group__0 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:244:1: ( ( rule__Primitive__Group__0 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:244:1: ( ( rule__Primitive__Group__0 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:245:1: ( rule__Primitive__Group__0 )
            {
             before(grammarAccess.getPrimitiveAccess().getGroup()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:246:1: ( rule__Primitive__Group__0 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:246:2: rule__Primitive__Group__0
            {
            pushFollow(FOLLOW_rule__Primitive__Group__0_in_rulePrimitive456);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:258:1: entryRuleAny : ruleAny EOF ;
    public final void entryRuleAny() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:259:1: ( ruleAny EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:260:1: ruleAny EOF
            {
             before(grammarAccess.getAnyRule()); 
            pushFollow(FOLLOW_ruleAny_in_entryRuleAny483);
            ruleAny();

            state._fsp--;

             after(grammarAccess.getAnyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAny490); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:267:1: ruleAny : ( ( rule__Any__Group__0 ) ) ;
    public final void ruleAny() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:271:2: ( ( ( rule__Any__Group__0 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:272:1: ( ( rule__Any__Group__0 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:272:1: ( ( rule__Any__Group__0 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:273:1: ( rule__Any__Group__0 )
            {
             before(grammarAccess.getAnyAccess().getGroup()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:274:1: ( rule__Any__Group__0 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:274:2: rule__Any__Group__0
            {
            pushFollow(FOLLOW_rule__Any__Group__0_in_ruleAny516);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:286:1: entryRuleTypeRef : ruleTypeRef EOF ;
    public final void entryRuleTypeRef() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:287:1: ( ruleTypeRef EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:288:1: ruleTypeRef EOF
            {
             before(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef543);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getTypeRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef550); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:295:1: ruleTypeRef : ( ( rule__TypeRef__Group__0 ) ) ;
    public final void ruleTypeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:299:2: ( ( ( rule__TypeRef__Group__0 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:300:1: ( ( rule__TypeRef__Group__0 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:300:1: ( ( rule__TypeRef__Group__0 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:301:1: ( rule__TypeRef__Group__0 )
            {
             before(grammarAccess.getTypeRefAccess().getGroup()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:302:1: ( rule__TypeRef__Group__0 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:302:2: rule__TypeRef__Group__0
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef576);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:314:1: entryRuleValueObject : ruleValueObject EOF ;
    public final void entryRuleValueObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:315:1: ( ruleValueObject EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:316:1: ruleValueObject EOF
            {
             before(grammarAccess.getValueObjectRule()); 
            pushFollow(FOLLOW_ruleValueObject_in_entryRuleValueObject603);
            ruleValueObject();

            state._fsp--;

             after(grammarAccess.getValueObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueObject610); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:323:1: ruleValueObject : ( ( rule__ValueObject__Alternatives ) ) ;
    public final void ruleValueObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:327:2: ( ( ( rule__ValueObject__Alternatives ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:328:1: ( ( rule__ValueObject__Alternatives ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:328:1: ( ( rule__ValueObject__Alternatives ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:329:1: ( rule__ValueObject__Alternatives )
            {
             before(grammarAccess.getValueObjectAccess().getAlternatives()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:330:1: ( rule__ValueObject__Alternatives )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:330:2: rule__ValueObject__Alternatives
            {
            pushFollow(FOLLOW_rule__ValueObject__Alternatives_in_ruleValueObject636);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:342:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:343:1: ( ruleStringValue EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:344:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue663);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue670); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:351:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:355:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:356:1: ( ( rule__StringValue__ValueAssignment ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:356:1: ( ( rule__StringValue__ValueAssignment ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:357:1: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:358:1: ( rule__StringValue__ValueAssignment )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:358:2: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue696);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:370:1: entryRuleEStringObject : ruleEStringObject EOF ;
    public final void entryRuleEStringObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:371:1: ( ruleEStringObject EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:372:1: ruleEStringObject EOF
            {
             before(grammarAccess.getEStringObjectRule()); 
            pushFollow(FOLLOW_ruleEStringObject_in_entryRuleEStringObject723);
            ruleEStringObject();

            state._fsp--;

             after(grammarAccess.getEStringObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEStringObject730); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:379:1: ruleEStringObject : ( RULE_STRING ) ;
    public final void ruleEStringObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:383:2: ( ( RULE_STRING ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:384:1: ( RULE_STRING )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:384:1: ( RULE_STRING )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:385:1: RULE_STRING
            {
             before(grammarAccess.getEStringObjectAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEStringObject756); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:398:1: entryRuleIntegerValue : ruleIntegerValue EOF ;
    public final void entryRuleIntegerValue() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:399:1: ( ruleIntegerValue EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:400:1: ruleIntegerValue EOF
            {
             before(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue782);
            ruleIntegerValue();

            state._fsp--;

             after(grammarAccess.getIntegerValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValue789); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:407:1: ruleIntegerValue : ( ( rule__IntegerValue__ValueAssignment ) ) ;
    public final void ruleIntegerValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:411:2: ( ( ( rule__IntegerValue__ValueAssignment ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:412:1: ( ( rule__IntegerValue__ValueAssignment ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:412:1: ( ( rule__IntegerValue__ValueAssignment ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:413:1: ( rule__IntegerValue__ValueAssignment )
            {
             before(grammarAccess.getIntegerValueAccess().getValueAssignment()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:414:1: ( rule__IntegerValue__ValueAssignment )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:414:2: rule__IntegerValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntegerValue__ValueAssignment_in_ruleIntegerValue815);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:426:1: entryRuleEIntegerObject : ruleEIntegerObject EOF ;
    public final void entryRuleEIntegerObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:427:1: ( ruleEIntegerObject EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:428:1: ruleEIntegerObject EOF
            {
             before(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject842);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getEIntegerObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEIntegerObject849); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:435:1: ruleEIntegerObject : ( RULE_INT ) ;
    public final void ruleEIntegerObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:439:2: ( ( RULE_INT ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:440:1: ( RULE_INT )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:440:1: ( RULE_INT )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:441:1: RULE_INT
            {
             before(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEIntegerObject875); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:454:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:455:1: ( ruleFloatValue EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:456:1: ruleFloatValue EOF
            {
             before(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue901);
            ruleFloatValue();

            state._fsp--;

             after(grammarAccess.getFloatValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue908); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:463:1: ruleFloatValue : ( ( rule__FloatValue__ValueAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:467:2: ( ( ( rule__FloatValue__ValueAssignment ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:468:1: ( ( rule__FloatValue__ValueAssignment ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:468:1: ( ( rule__FloatValue__ValueAssignment ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:469:1: ( rule__FloatValue__ValueAssignment )
            {
             before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:470:1: ( rule__FloatValue__ValueAssignment )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:470:2: rule__FloatValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue934);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:482:1: entryRuleEFloatObject : ruleEFloatObject EOF ;
    public final void entryRuleEFloatObject() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:483:1: ( ruleEFloatObject EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:484:1: ruleEFloatObject EOF
            {
             before(grammarAccess.getEFloatObjectRule()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject961);
            ruleEFloatObject();

            state._fsp--;

             after(grammarAccess.getEFloatObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEFloatObject968); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:491:1: ruleEFloatObject : ( ( rule__EFloatObject__Group__0 ) ) ;
    public final void ruleEFloatObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:495:2: ( ( ( rule__EFloatObject__Group__0 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:496:1: ( ( rule__EFloatObject__Group__0 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:496:1: ( ( rule__EFloatObject__Group__0 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:497:1: ( rule__EFloatObject__Group__0 )
            {
             before(grammarAccess.getEFloatObjectAccess().getGroup()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:498:1: ( rule__EFloatObject__Group__0 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:498:2: rule__EFloatObject__Group__0
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__0_in_ruleEFloatObject994);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:510:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:511:1: ( ruleQualifiedName EOF )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:512:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1021);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1028); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:519:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:523:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:524:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:524:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:525:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:526:1: ( rule__QualifiedName__Group__0 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:526:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1054);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:539:1: ruleConfigOption : ( ( 'persistency' ) ) ;
    public final void ruleConfigOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:543:1: ( ( ( 'persistency' ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:544:1: ( ( 'persistency' ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:544:1: ( ( 'persistency' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:545:1: ( 'persistency' )
            {
             before(grammarAccess.getConfigOptionAccess().getPersistencyEnumLiteralDeclaration()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:546:1: ( 'persistency' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:546:3: 'persistency'
            {
            match(input,12,FOLLOW_12_in_ruleConfigOption1092); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:559:1: ruleConfigValue : ( ( 'CoreData' ) ) ;
    public final void ruleConfigValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:563:1: ( ( ( 'CoreData' ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:564:1: ( ( 'CoreData' ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:564:1: ( ( 'CoreData' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:565:1: ( 'CoreData' )
            {
             before(grammarAccess.getConfigValueAccess().getCoreDataEnumLiteralDeclaration()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:566:1: ( 'CoreData' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:566:3: 'CoreData'
            {
            match(input,13,FOLLOW_13_in_ruleConfigValue1131); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:578:1: rule__ValueObject__Alternatives : ( ( ruleStringValue ) | ( ruleIntegerValue ) | ( ruleFloatValue ) );
    public final void rule__ValueObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:582:1: ( ( ruleStringValue ) | ( ruleIntegerValue ) | ( ruleFloatValue ) )
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

                if ( (LA1_2==29) ) {
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
            case 28:
            case 29:
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
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:583:1: ( ruleStringValue )
                    {
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:583:1: ( ruleStringValue )
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:584:1: ruleStringValue
                    {
                     before(grammarAccess.getValueObjectAccess().getStringValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringValue_in_rule__ValueObject__Alternatives1168);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getValueObjectAccess().getStringValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:589:6: ( ruleIntegerValue )
                    {
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:589:6: ( ruleIntegerValue )
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:590:1: ruleIntegerValue
                    {
                     before(grammarAccess.getValueObjectAccess().getIntegerValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntegerValue_in_rule__ValueObject__Alternatives1185);
                    ruleIntegerValue();

                    state._fsp--;

                     after(grammarAccess.getValueObjectAccess().getIntegerValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:595:6: ( ruleFloatValue )
                    {
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:595:6: ( ruleFloatValue )
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:596:1: ruleFloatValue
                    {
                     before(grammarAccess.getValueObjectAccess().getFloatValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleFloatValue_in_rule__ValueObject__Alternatives1202);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:608:1: rule__EntityModel__Group__0 : rule__EntityModel__Group__0__Impl rule__EntityModel__Group__1 ;
    public final void rule__EntityModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:612:1: ( rule__EntityModel__Group__0__Impl rule__EntityModel__Group__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:613:2: rule__EntityModel__Group__0__Impl rule__EntityModel__Group__1
            {
            pushFollow(FOLLOW_rule__EntityModel__Group__0__Impl_in_rule__EntityModel__Group__01232);
            rule__EntityModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityModel__Group__1_in_rule__EntityModel__Group__01235);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:620:1: rule__EntityModel__Group__0__Impl : ( ( rule__EntityModel__CurrentAssignment_0 )? ) ;
    public final void rule__EntityModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:624:1: ( ( ( rule__EntityModel__CurrentAssignment_0 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:625:1: ( ( rule__EntityModel__CurrentAssignment_0 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:625:1: ( ( rule__EntityModel__CurrentAssignment_0 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:626:1: ( rule__EntityModel__CurrentAssignment_0 )?
            {
             before(grammarAccess.getEntityModelAccess().getCurrentAssignment_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:627:1: ( rule__EntityModel__CurrentAssignment_0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==30) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:627:2: rule__EntityModel__CurrentAssignment_0
                    {
                    pushFollow(FOLLOW_rule__EntityModel__CurrentAssignment_0_in_rule__EntityModel__Group__0__Impl1262);
                    rule__EntityModel__CurrentAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityModelAccess().getCurrentAssignment_0()); 

            }


            }

        }
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:637:1: rule__EntityModel__Group__1 : rule__EntityModel__Group__1__Impl rule__EntityModel__Group__2 ;
    public final void rule__EntityModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:641:1: ( rule__EntityModel__Group__1__Impl rule__EntityModel__Group__2 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:642:2: rule__EntityModel__Group__1__Impl rule__EntityModel__Group__2
            {
            pushFollow(FOLLOW_rule__EntityModel__Group__1__Impl_in_rule__EntityModel__Group__11293);
            rule__EntityModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityModel__Group__2_in_rule__EntityModel__Group__11296);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:649:1: rule__EntityModel__Group__1__Impl : ( 'entities for module' ) ;
    public final void rule__EntityModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:653:1: ( ( 'entities for module' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:654:1: ( 'entities for module' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:654:1: ( 'entities for module' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:655:1: 'entities for module'
            {
             before(grammarAccess.getEntityModelAccess().getEntitiesForModuleKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__EntityModel__Group__1__Impl1324); 
             after(grammarAccess.getEntityModelAccess().getEntitiesForModuleKeyword_1()); 

            }


            }

        }
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:668:1: rule__EntityModel__Group__2 : rule__EntityModel__Group__2__Impl rule__EntityModel__Group__3 ;
    public final void rule__EntityModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:672:1: ( rule__EntityModel__Group__2__Impl rule__EntityModel__Group__3 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:673:2: rule__EntityModel__Group__2__Impl rule__EntityModel__Group__3
            {
            pushFollow(FOLLOW_rule__EntityModel__Group__2__Impl_in_rule__EntityModel__Group__21355);
            rule__EntityModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityModel__Group__3_in_rule__EntityModel__Group__21358);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:680:1: rule__EntityModel__Group__2__Impl : ( ( rule__EntityModel__ModuleAssignment_2 ) ) ;
    public final void rule__EntityModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:684:1: ( ( ( rule__EntityModel__ModuleAssignment_2 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:685:1: ( ( rule__EntityModel__ModuleAssignment_2 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:685:1: ( ( rule__EntityModel__ModuleAssignment_2 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:686:1: ( rule__EntityModel__ModuleAssignment_2 )
            {
             before(grammarAccess.getEntityModelAccess().getModuleAssignment_2()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:687:1: ( rule__EntityModel__ModuleAssignment_2 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:687:2: rule__EntityModel__ModuleAssignment_2
            {
            pushFollow(FOLLOW_rule__EntityModel__ModuleAssignment_2_in_rule__EntityModel__Group__2__Impl1385);
            rule__EntityModel__ModuleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityModelAccess().getModuleAssignment_2()); 

            }


            }

        }
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:697:1: rule__EntityModel__Group__3 : rule__EntityModel__Group__3__Impl rule__EntityModel__Group__4 ;
    public final void rule__EntityModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:701:1: ( rule__EntityModel__Group__3__Impl rule__EntityModel__Group__4 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:702:2: rule__EntityModel__Group__3__Impl rule__EntityModel__Group__4
            {
            pushFollow(FOLLOW_rule__EntityModel__Group__3__Impl_in_rule__EntityModel__Group__31415);
            rule__EntityModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityModel__Group__4_in_rule__EntityModel__Group__31418);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:709:1: rule__EntityModel__Group__3__Impl : ( 'version' ) ;
    public final void rule__EntityModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:713:1: ( ( 'version' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:714:1: ( 'version' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:714:1: ( 'version' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:715:1: 'version'
            {
             before(grammarAccess.getEntityModelAccess().getVersionKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__EntityModel__Group__3__Impl1446); 
             after(grammarAccess.getEntityModelAccess().getVersionKeyword_3()); 

            }


            }

        }
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:728:1: rule__EntityModel__Group__4 : rule__EntityModel__Group__4__Impl rule__EntityModel__Group__5 ;
    public final void rule__EntityModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:732:1: ( rule__EntityModel__Group__4__Impl rule__EntityModel__Group__5 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:733:2: rule__EntityModel__Group__4__Impl rule__EntityModel__Group__5
            {
            pushFollow(FOLLOW_rule__EntityModel__Group__4__Impl_in_rule__EntityModel__Group__41477);
            rule__EntityModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityModel__Group__5_in_rule__EntityModel__Group__41480);
            rule__EntityModel__Group__5();

            state._fsp--;


            }

        }
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:740:1: rule__EntityModel__Group__4__Impl : ( ( rule__EntityModel__VersionAssignment_4 ) ) ;
    public final void rule__EntityModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:744:1: ( ( ( rule__EntityModel__VersionAssignment_4 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:745:1: ( ( rule__EntityModel__VersionAssignment_4 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:745:1: ( ( rule__EntityModel__VersionAssignment_4 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:746:1: ( rule__EntityModel__VersionAssignment_4 )
            {
             before(grammarAccess.getEntityModelAccess().getVersionAssignment_4()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:747:1: ( rule__EntityModel__VersionAssignment_4 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:747:2: rule__EntityModel__VersionAssignment_4
            {
            pushFollow(FOLLOW_rule__EntityModel__VersionAssignment_4_in_rule__EntityModel__Group__4__Impl1507);
            rule__EntityModel__VersionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEntityModelAccess().getVersionAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__EntityModel__Group__5"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:757:1: rule__EntityModel__Group__5 : rule__EntityModel__Group__5__Impl rule__EntityModel__Group__6 ;
    public final void rule__EntityModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:761:1: ( rule__EntityModel__Group__5__Impl rule__EntityModel__Group__6 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:762:2: rule__EntityModel__Group__5__Impl rule__EntityModel__Group__6
            {
            pushFollow(FOLLOW_rule__EntityModel__Group__5__Impl_in_rule__EntityModel__Group__51537);
            rule__EntityModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityModel__Group__6_in_rule__EntityModel__Group__51540);
            rule__EntityModel__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityModel__Group__5"


    // $ANTLR start "rule__EntityModel__Group__5__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:769:1: rule__EntityModel__Group__5__Impl : ( ( rule__EntityModel__EntitiesAssignment_5 )* ) ;
    public final void rule__EntityModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:773:1: ( ( ( rule__EntityModel__EntitiesAssignment_5 )* ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:774:1: ( ( rule__EntityModel__EntitiesAssignment_5 )* )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:774:1: ( ( rule__EntityModel__EntitiesAssignment_5 )* )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:775:1: ( rule__EntityModel__EntitiesAssignment_5 )*
            {
             before(grammarAccess.getEntityModelAccess().getEntitiesAssignment_5()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:776:1: ( rule__EntityModel__EntitiesAssignment_5 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_DOC_COMMENT||LA3_0==16||LA3_0==20||LA3_0==31) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:776:2: rule__EntityModel__EntitiesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__EntityModel__EntitiesAssignment_5_in_rule__EntityModel__Group__5__Impl1567);
            	    rule__EntityModel__EntitiesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getEntityModelAccess().getEntitiesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityModel__Group__5__Impl"


    // $ANTLR start "rule__EntityModel__Group__6"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:786:1: rule__EntityModel__Group__6 : rule__EntityModel__Group__6__Impl ;
    public final void rule__EntityModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:790:1: ( rule__EntityModel__Group__6__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:791:2: rule__EntityModel__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__EntityModel__Group__6__Impl_in_rule__EntityModel__Group__61598);
            rule__EntityModel__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityModel__Group__6"


    // $ANTLR start "rule__EntityModel__Group__6__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:797:1: rule__EntityModel__Group__6__Impl : ( ( rule__EntityModel__EnumsAssignment_6 )* ) ;
    public final void rule__EntityModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:801:1: ( ( ( rule__EntityModel__EnumsAssignment_6 )* ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:802:1: ( ( rule__EntityModel__EnumsAssignment_6 )* )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:802:1: ( ( rule__EntityModel__EnumsAssignment_6 )* )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:803:1: ( rule__EntityModel__EnumsAssignment_6 )*
            {
             before(grammarAccess.getEntityModelAccess().getEnumsAssignment_6()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:804:1: ( rule__EntityModel__EnumsAssignment_6 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:804:2: rule__EntityModel__EnumsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__EntityModel__EnumsAssignment_6_in_rule__EntityModel__Group__6__Impl1625);
            	    rule__EntityModel__EnumsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getEntityModelAccess().getEnumsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityModel__Group__6__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:828:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:832:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:833:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01670);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01673);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:840:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__CommentAssignment_0 )? ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:844:1: ( ( ( rule__Entity__CommentAssignment_0 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:845:1: ( ( rule__Entity__CommentAssignment_0 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:845:1: ( ( rule__Entity__CommentAssignment_0 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:846:1: ( rule__Entity__CommentAssignment_0 )?
            {
             before(grammarAccess.getEntityAccess().getCommentAssignment_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:847:1: ( rule__Entity__CommentAssignment_0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_DOC_COMMENT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:847:2: rule__Entity__CommentAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Entity__CommentAssignment_0_in_rule__Entity__Group__0__Impl1700);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:857:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:861:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:862:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11731);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11734);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:869:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__AnnotationsAssignment_1 )* ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:873:1: ( ( ( rule__Entity__AnnotationsAssignment_1 )* ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:874:1: ( ( rule__Entity__AnnotationsAssignment_1 )* )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:874:1: ( ( rule__Entity__AnnotationsAssignment_1 )* )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:875:1: ( rule__Entity__AnnotationsAssignment_1 )*
            {
             before(grammarAccess.getEntityAccess().getAnnotationsAssignment_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:876:1: ( rule__Entity__AnnotationsAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:876:2: rule__Entity__AnnotationsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Entity__AnnotationsAssignment_1_in_rule__Entity__Group__1__Impl1761);
            	    rule__Entity__AnnotationsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:886:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:890:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:891:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21792);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21795);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:898:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__IsAbstractAssignment_2 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:902:1: ( ( ( rule__Entity__IsAbstractAssignment_2 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:903:1: ( ( rule__Entity__IsAbstractAssignment_2 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:903:1: ( ( rule__Entity__IsAbstractAssignment_2 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:904:1: ( rule__Entity__IsAbstractAssignment_2 )?
            {
             before(grammarAccess.getEntityAccess().getIsAbstractAssignment_2()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:905:1: ( rule__Entity__IsAbstractAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==31) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:905:2: rule__Entity__IsAbstractAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Entity__IsAbstractAssignment_2_in_rule__Entity__Group__2__Impl1822);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:915:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:919:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:920:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31853);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31856);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:927:1: rule__Entity__Group__3__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:931:1: ( ( 'entity' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:932:1: ( 'entity' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:932:1: ( 'entity' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:933:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__Entity__Group__3__Impl1884); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:946:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:950:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:951:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41915);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41918);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:958:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__NameAssignment_4 ) ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:962:1: ( ( ( rule__Entity__NameAssignment_4 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:963:1: ( ( rule__Entity__NameAssignment_4 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:963:1: ( ( rule__Entity__NameAssignment_4 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:964:1: ( rule__Entity__NameAssignment_4 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_4()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:965:1: ( rule__Entity__NameAssignment_4 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:965:2: rule__Entity__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_4_in_rule__Entity__Group__4__Impl1945);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:975:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:979:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:980:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51975);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__51978);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:987:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__Group_5__0 )? ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:991:1: ( ( ( rule__Entity__Group_5__0 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:992:1: ( ( rule__Entity__Group_5__0 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:992:1: ( ( rule__Entity__Group_5__0 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:993:1: ( rule__Entity__Group_5__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_5()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:994:1: ( rule__Entity__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:994:2: rule__Entity__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_5__0_in_rule__Entity__Group__5__Impl2005);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1004:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl rule__Entity__Group__7 ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1008:1: ( rule__Entity__Group__6__Impl rule__Entity__Group__7 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1009:2: rule__Entity__Group__6__Impl rule__Entity__Group__7
            {
            pushFollow(FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__62036);
            rule__Entity__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__62039);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1016:1: rule__Entity__Group__6__Impl : ( '{' ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1020:1: ( ( '{' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1021:1: ( '{' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1021:1: ( '{' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1022:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_17_in_rule__Entity__Group__6__Impl2067); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1035:1: rule__Entity__Group__7 : rule__Entity__Group__7__Impl rule__Entity__Group__8 ;
    public final void rule__Entity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1039:1: ( rule__Entity__Group__7__Impl rule__Entity__Group__8 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1040:2: rule__Entity__Group__7__Impl rule__Entity__Group__8
            {
            pushFollow(FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__72098);
            rule__Entity__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__8_in_rule__Entity__Group__72101);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1047:1: rule__Entity__Group__7__Impl : ( ( rule__Entity__FeaturesAssignment_7 )* ) ;
    public final void rule__Entity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1051:1: ( ( ( rule__Entity__FeaturesAssignment_7 )* ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1052:1: ( ( rule__Entity__FeaturesAssignment_7 )* )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1052:1: ( ( rule__Entity__FeaturesAssignment_7 )* )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1053:1: ( rule__Entity__FeaturesAssignment_7 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_7()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1054:1: ( rule__Entity__FeaturesAssignment_7 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_DOC_COMMENT)||(LA9_0>=32 && LA9_0<=33)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1054:2: rule__Entity__FeaturesAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_7_in_rule__Entity__Group__7__Impl2128);
            	    rule__Entity__FeaturesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1064:1: rule__Entity__Group__8 : rule__Entity__Group__8__Impl ;
    public final void rule__Entity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1068:1: ( rule__Entity__Group__8__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1069:2: rule__Entity__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__8__Impl_in_rule__Entity__Group__82159);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1075:1: rule__Entity__Group__8__Impl : ( '}' ) ;
    public final void rule__Entity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1079:1: ( ( '}' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1080:1: ( '}' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1080:1: ( '}' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1081:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8()); 
            match(input,18,FOLLOW_18_in_rule__Entity__Group__8__Impl2187); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1112:1: rule__Entity__Group_5__0 : rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1 ;
    public final void rule__Entity__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1116:1: ( rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1117:2: rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_5__0__Impl_in_rule__Entity__Group_5__02236);
            rule__Entity__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_5__1_in_rule__Entity__Group_5__02239);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1124:1: rule__Entity__Group_5__0__Impl : ( ':' ) ;
    public final void rule__Entity__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1128:1: ( ( ':' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1129:1: ( ':' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1129:1: ( ':' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1130:1: ':'
            {
             before(grammarAccess.getEntityAccess().getColonKeyword_5_0()); 
            match(input,19,FOLLOW_19_in_rule__Entity__Group_5__0__Impl2267); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1143:1: rule__Entity__Group_5__1 : rule__Entity__Group_5__1__Impl ;
    public final void rule__Entity__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1147:1: ( rule__Entity__Group_5__1__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1148:2: rule__Entity__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_5__1__Impl_in_rule__Entity__Group_5__12298);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1154:1: rule__Entity__Group_5__1__Impl : ( ( rule__Entity__SuperAssignment_5_1 ) ) ;
    public final void rule__Entity__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1158:1: ( ( ( rule__Entity__SuperAssignment_5_1 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1159:1: ( ( rule__Entity__SuperAssignment_5_1 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1159:1: ( ( rule__Entity__SuperAssignment_5_1 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1160:1: ( rule__Entity__SuperAssignment_5_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperAssignment_5_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1161:1: ( rule__Entity__SuperAssignment_5_1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1161:2: rule__Entity__SuperAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Entity__SuperAssignment_5_1_in_rule__Entity__Group_5__1__Impl2325);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1175:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1179:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1180:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__02359);
            rule__Annotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__02362);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1187:1: rule__Annotation__Group__0__Impl : ( '@' ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1191:1: ( ( '@' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1192:1: ( '@' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1192:1: ( '@' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1193:1: '@'
            {
             before(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Annotation__Group__0__Impl2390); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1206:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1210:1: ( rule__Annotation__Group__1__Impl rule__Annotation__Group__2 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1211:2: rule__Annotation__Group__1__Impl rule__Annotation__Group__2
            {
            pushFollow(FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__12421);
            rule__Annotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__12424);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1218:1: rule__Annotation__Group__1__Impl : ( ( rule__Annotation__OptionAssignment_1 ) ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1222:1: ( ( ( rule__Annotation__OptionAssignment_1 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1223:1: ( ( rule__Annotation__OptionAssignment_1 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1223:1: ( ( rule__Annotation__OptionAssignment_1 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1224:1: ( rule__Annotation__OptionAssignment_1 )
            {
             before(grammarAccess.getAnnotationAccess().getOptionAssignment_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1225:1: ( rule__Annotation__OptionAssignment_1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1225:2: rule__Annotation__OptionAssignment_1
            {
            pushFollow(FOLLOW_rule__Annotation__OptionAssignment_1_in_rule__Annotation__Group__1__Impl2451);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1235:1: rule__Annotation__Group__2 : rule__Annotation__Group__2__Impl ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1239:1: ( rule__Annotation__Group__2__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1240:2: rule__Annotation__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__22481);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1246:1: rule__Annotation__Group__2__Impl : ( ( rule__Annotation__Group_2__0 )? ) ;
    public final void rule__Annotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1250:1: ( ( ( rule__Annotation__Group_2__0 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1251:1: ( ( rule__Annotation__Group_2__0 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1251:1: ( ( rule__Annotation__Group_2__0 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1252:1: ( rule__Annotation__Group_2__0 )?
            {
             before(grammarAccess.getAnnotationAccess().getGroup_2()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1253:1: ( rule__Annotation__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1253:2: rule__Annotation__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Annotation__Group_2__0_in_rule__Annotation__Group__2__Impl2508);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1269:1: rule__Annotation__Group_2__0 : rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1 ;
    public final void rule__Annotation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1273:1: ( rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1274:2: rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__0__Impl_in_rule__Annotation__Group_2__02545);
            rule__Annotation__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group_2__1_in_rule__Annotation__Group_2__02548);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1281:1: rule__Annotation__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Annotation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1285:1: ( ( ':' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1286:1: ( ':' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1286:1: ( ':' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1287:1: ':'
            {
             before(grammarAccess.getAnnotationAccess().getColonKeyword_2_0()); 
            match(input,19,FOLLOW_19_in_rule__Annotation__Group_2__0__Impl2576); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1300:1: rule__Annotation__Group_2__1 : rule__Annotation__Group_2__1__Impl ;
    public final void rule__Annotation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1304:1: ( rule__Annotation__Group_2__1__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1305:2: rule__Annotation__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__1__Impl_in_rule__Annotation__Group_2__12607);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1311:1: rule__Annotation__Group_2__1__Impl : ( ( rule__Annotation__ValueAssignment_2_1 ) ) ;
    public final void rule__Annotation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1315:1: ( ( ( rule__Annotation__ValueAssignment_2_1 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1316:1: ( ( rule__Annotation__ValueAssignment_2_1 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1316:1: ( ( rule__Annotation__ValueAssignment_2_1 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1317:1: ( rule__Annotation__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAnnotationAccess().getValueAssignment_2_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1318:1: ( rule__Annotation__ValueAssignment_2_1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1318:2: rule__Annotation__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Annotation__ValueAssignment_2_1_in_rule__Annotation__Group_2__1__Impl2634);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1332:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1336:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1337:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__02668);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__02671);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1344:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__CommentAssignment_0 )? ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1348:1: ( ( ( rule__Feature__CommentAssignment_0 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1349:1: ( ( rule__Feature__CommentAssignment_0 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1349:1: ( ( rule__Feature__CommentAssignment_0 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1350:1: ( rule__Feature__CommentAssignment_0 )?
            {
             before(grammarAccess.getFeatureAccess().getCommentAssignment_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1351:1: ( rule__Feature__CommentAssignment_0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_DOC_COMMENT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1351:2: rule__Feature__CommentAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Feature__CommentAssignment_0_in_rule__Feature__Group__0__Impl2698);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1361:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1365:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1366:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__12729);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__12732);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1373:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__IsIndexedAssignment_1 )? ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1377:1: ( ( ( rule__Feature__IsIndexedAssignment_1 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1378:1: ( ( rule__Feature__IsIndexedAssignment_1 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1378:1: ( ( rule__Feature__IsIndexedAssignment_1 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1379:1: ( rule__Feature__IsIndexedAssignment_1 )?
            {
             before(grammarAccess.getFeatureAccess().getIsIndexedAssignment_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1380:1: ( rule__Feature__IsIndexedAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1380:2: rule__Feature__IsIndexedAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Feature__IsIndexedAssignment_1_in_rule__Feature__Group__1__Impl2759);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1390:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1394:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1395:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__22790);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__22793);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1402:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__IsContainmentAssignment_2 )? ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1406:1: ( ( ( rule__Feature__IsContainmentAssignment_2 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1407:1: ( ( rule__Feature__IsContainmentAssignment_2 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1407:1: ( ( rule__Feature__IsContainmentAssignment_2 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1408:1: ( rule__Feature__IsContainmentAssignment_2 )?
            {
             before(grammarAccess.getFeatureAccess().getIsContainmentAssignment_2()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1409:1: ( rule__Feature__IsContainmentAssignment_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1409:2: rule__Feature__IsContainmentAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Feature__IsContainmentAssignment_2_in_rule__Feature__Group__2__Impl2820);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1419:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1423:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1424:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
            {
            pushFollow(FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__32851);
            rule__Feature__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__4_in_rule__Feature__Group__32854);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1431:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__TypeAssignment_3 ) ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1435:1: ( ( ( rule__Feature__TypeAssignment_3 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1436:1: ( ( rule__Feature__TypeAssignment_3 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1436:1: ( ( rule__Feature__TypeAssignment_3 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1437:1: ( rule__Feature__TypeAssignment_3 )
            {
             before(grammarAccess.getFeatureAccess().getTypeAssignment_3()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1438:1: ( rule__Feature__TypeAssignment_3 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1438:2: rule__Feature__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Feature__TypeAssignment_3_in_rule__Feature__Group__3__Impl2881);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1448:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl rule__Feature__Group__5 ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1452:1: ( rule__Feature__Group__4__Impl rule__Feature__Group__5 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1453:2: rule__Feature__Group__4__Impl rule__Feature__Group__5
            {
            pushFollow(FOLLOW_rule__Feature__Group__4__Impl_in_rule__Feature__Group__42911);
            rule__Feature__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__5_in_rule__Feature__Group__42914);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1460:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__NameAssignment_4 ) ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1464:1: ( ( ( rule__Feature__NameAssignment_4 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1465:1: ( ( rule__Feature__NameAssignment_4 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1465:1: ( ( rule__Feature__NameAssignment_4 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1466:1: ( rule__Feature__NameAssignment_4 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_4()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1467:1: ( rule__Feature__NameAssignment_4 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1467:2: rule__Feature__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__Feature__NameAssignment_4_in_rule__Feature__Group__4__Impl2941);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1477:1: rule__Feature__Group__5 : rule__Feature__Group__5__Impl rule__Feature__Group__6 ;
    public final void rule__Feature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1481:1: ( rule__Feature__Group__5__Impl rule__Feature__Group__6 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1482:2: rule__Feature__Group__5__Impl rule__Feature__Group__6
            {
            pushFollow(FOLLOW_rule__Feature__Group__5__Impl_in_rule__Feature__Group__52971);
            rule__Feature__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__6_in_rule__Feature__Group__52974);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1489:1: rule__Feature__Group__5__Impl : ( ( rule__Feature__Group_5__0 )? ) ;
    public final void rule__Feature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1493:1: ( ( ( rule__Feature__Group_5__0 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1494:1: ( ( rule__Feature__Group_5__0 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1494:1: ( ( rule__Feature__Group_5__0 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1495:1: ( rule__Feature__Group_5__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_5()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1496:1: ( rule__Feature__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1496:2: rule__Feature__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Feature__Group_5__0_in_rule__Feature__Group__5__Impl3001);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1506:1: rule__Feature__Group__6 : rule__Feature__Group__6__Impl rule__Feature__Group__7 ;
    public final void rule__Feature__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1510:1: ( rule__Feature__Group__6__Impl rule__Feature__Group__7 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1511:2: rule__Feature__Group__6__Impl rule__Feature__Group__7
            {
            pushFollow(FOLLOW_rule__Feature__Group__6__Impl_in_rule__Feature__Group__63032);
            rule__Feature__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__7_in_rule__Feature__Group__63035);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1518:1: rule__Feature__Group__6__Impl : ( ( rule__Feature__Group_6__0 )? ) ;
    public final void rule__Feature__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1522:1: ( ( ( rule__Feature__Group_6__0 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1523:1: ( ( rule__Feature__Group_6__0 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1523:1: ( ( rule__Feature__Group_6__0 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1524:1: ( rule__Feature__Group_6__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_6()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1525:1: ( rule__Feature__Group_6__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1525:2: rule__Feature__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Feature__Group_6__0_in_rule__Feature__Group__6__Impl3062);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1535:1: rule__Feature__Group__7 : rule__Feature__Group__7__Impl ;
    public final void rule__Feature__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1539:1: ( rule__Feature__Group__7__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1540:2: rule__Feature__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group__7__Impl_in_rule__Feature__Group__73093);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1546:1: rule__Feature__Group__7__Impl : ( ';' ) ;
    public final void rule__Feature__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1550:1: ( ( ';' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1551:1: ( ';' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1551:1: ( ';' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1552:1: ';'
            {
             before(grammarAccess.getFeatureAccess().getSemicolonKeyword_7()); 
            match(input,21,FOLLOW_21_in_rule__Feature__Group__7__Impl3121); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1581:1: rule__Feature__Group_5__0 : rule__Feature__Group_5__0__Impl rule__Feature__Group_5__1 ;
    public final void rule__Feature__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1585:1: ( rule__Feature__Group_5__0__Impl rule__Feature__Group_5__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1586:2: rule__Feature__Group_5__0__Impl rule__Feature__Group_5__1
            {
            pushFollow(FOLLOW_rule__Feature__Group_5__0__Impl_in_rule__Feature__Group_5__03168);
            rule__Feature__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group_5__1_in_rule__Feature__Group_5__03171);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1593:1: rule__Feature__Group_5__0__Impl : ( '=' ) ;
    public final void rule__Feature__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1597:1: ( ( '=' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1598:1: ( '=' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1598:1: ( '=' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1599:1: '='
            {
             before(grammarAccess.getFeatureAccess().getEqualsSignKeyword_5_0()); 
            match(input,22,FOLLOW_22_in_rule__Feature__Group_5__0__Impl3199); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1612:1: rule__Feature__Group_5__1 : rule__Feature__Group_5__1__Impl ;
    public final void rule__Feature__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1616:1: ( rule__Feature__Group_5__1__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1617:2: rule__Feature__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group_5__1__Impl_in_rule__Feature__Group_5__13230);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1623:1: rule__Feature__Group_5__1__Impl : ( ( rule__Feature__DefaultValueAssignment_5_1 ) ) ;
    public final void rule__Feature__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1627:1: ( ( ( rule__Feature__DefaultValueAssignment_5_1 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1628:1: ( ( rule__Feature__DefaultValueAssignment_5_1 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1628:1: ( ( rule__Feature__DefaultValueAssignment_5_1 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1629:1: ( rule__Feature__DefaultValueAssignment_5_1 )
            {
             before(grammarAccess.getFeatureAccess().getDefaultValueAssignment_5_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1630:1: ( rule__Feature__DefaultValueAssignment_5_1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1630:2: rule__Feature__DefaultValueAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Feature__DefaultValueAssignment_5_1_in_rule__Feature__Group_5__1__Impl3257);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1644:1: rule__Feature__Group_6__0 : rule__Feature__Group_6__0__Impl rule__Feature__Group_6__1 ;
    public final void rule__Feature__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1648:1: ( rule__Feature__Group_6__0__Impl rule__Feature__Group_6__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1649:2: rule__Feature__Group_6__0__Impl rule__Feature__Group_6__1
            {
            pushFollow(FOLLOW_rule__Feature__Group_6__0__Impl_in_rule__Feature__Group_6__03291);
            rule__Feature__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group_6__1_in_rule__Feature__Group_6__03294);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1656:1: rule__Feature__Group_6__0__Impl : ( '<->' ) ;
    public final void rule__Feature__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1660:1: ( ( '<->' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1661:1: ( '<->' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1661:1: ( '<->' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1662:1: '<->'
            {
             before(grammarAccess.getFeatureAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_6_0()); 
            match(input,23,FOLLOW_23_in_rule__Feature__Group_6__0__Impl3322); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1675:1: rule__Feature__Group_6__1 : rule__Feature__Group_6__1__Impl ;
    public final void rule__Feature__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1679:1: ( rule__Feature__Group_6__1__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1680:2: rule__Feature__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group_6__1__Impl_in_rule__Feature__Group_6__13353);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1686:1: rule__Feature__Group_6__1__Impl : ( ( rule__Feature__InverseAssignment_6_1 ) ) ;
    public final void rule__Feature__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1690:1: ( ( ( rule__Feature__InverseAssignment_6_1 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1691:1: ( ( rule__Feature__InverseAssignment_6_1 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1691:1: ( ( rule__Feature__InverseAssignment_6_1 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1692:1: ( rule__Feature__InverseAssignment_6_1 )
            {
             before(grammarAccess.getFeatureAccess().getInverseAssignment_6_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1693:1: ( rule__Feature__InverseAssignment_6_1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1693:2: rule__Feature__InverseAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Feature__InverseAssignment_6_1_in_rule__Feature__Group_6__1__Impl3380);
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


    // $ANTLR start "rule__Enum__Group__0"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1707:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1711:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1712:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__03414);
            rule__Enum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__03417);
            rule__Enum__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__0"


    // $ANTLR start "rule__Enum__Group__0__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1719:1: rule__Enum__Group__0__Impl : ( 'enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1723:1: ( ( 'enum' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1724:1: ( 'enum' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1724:1: ( 'enum' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1725:1: 'enum'
            {
             before(grammarAccess.getEnumAccess().getEnumKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Enum__Group__0__Impl3445); 
             after(grammarAccess.getEnumAccess().getEnumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__0__Impl"


    // $ANTLR start "rule__Enum__Group__1"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1738:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1742:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1743:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
            {
            pushFollow(FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__13476);
            rule__Enum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__13479);
            rule__Enum__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__1"


    // $ANTLR start "rule__Enum__Group__1__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1750:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__NameAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1754:1: ( ( ( rule__Enum__NameAssignment_1 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1755:1: ( ( rule__Enum__NameAssignment_1 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1755:1: ( ( rule__Enum__NameAssignment_1 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1756:1: ( rule__Enum__NameAssignment_1 )
            {
             before(grammarAccess.getEnumAccess().getNameAssignment_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1757:1: ( rule__Enum__NameAssignment_1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1757:2: rule__Enum__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Enum__NameAssignment_1_in_rule__Enum__Group__1__Impl3506);
            rule__Enum__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__1__Impl"


    // $ANTLR start "rule__Enum__Group__2"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1767:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1771:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1772:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
            {
            pushFollow(FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__23536);
            rule__Enum__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__23539);
            rule__Enum__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__2"


    // $ANTLR start "rule__Enum__Group__2__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1779:1: rule__Enum__Group__2__Impl : ( '{' ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1783:1: ( ( '{' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1784:1: ( '{' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1784:1: ( '{' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1785:1: '{'
            {
             before(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Enum__Group__2__Impl3567); 
             after(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__2__Impl"


    // $ANTLR start "rule__Enum__Group__3"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1798:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl rule__Enum__Group__4 ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1802:1: ( rule__Enum__Group__3__Impl rule__Enum__Group__4 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1803:2: rule__Enum__Group__3__Impl rule__Enum__Group__4
            {
            pushFollow(FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__33598);
            rule__Enum__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__33601);
            rule__Enum__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__3"


    // $ANTLR start "rule__Enum__Group__3__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1810:1: rule__Enum__Group__3__Impl : ( ( rule__Enum__LiteralsAssignment_3 ) ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1814:1: ( ( ( rule__Enum__LiteralsAssignment_3 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1815:1: ( ( rule__Enum__LiteralsAssignment_3 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1815:1: ( ( rule__Enum__LiteralsAssignment_3 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1816:1: ( rule__Enum__LiteralsAssignment_3 )
            {
             before(grammarAccess.getEnumAccess().getLiteralsAssignment_3()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1817:1: ( rule__Enum__LiteralsAssignment_3 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1817:2: rule__Enum__LiteralsAssignment_3
            {
            pushFollow(FOLLOW_rule__Enum__LiteralsAssignment_3_in_rule__Enum__Group__3__Impl3628);
            rule__Enum__LiteralsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getLiteralsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__3__Impl"


    // $ANTLR start "rule__Enum__Group__4"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1827:1: rule__Enum__Group__4 : rule__Enum__Group__4__Impl rule__Enum__Group__5 ;
    public final void rule__Enum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1831:1: ( rule__Enum__Group__4__Impl rule__Enum__Group__5 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1832:2: rule__Enum__Group__4__Impl rule__Enum__Group__5
            {
            pushFollow(FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__43658);
            rule__Enum__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__5_in_rule__Enum__Group__43661);
            rule__Enum__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__4"


    // $ANTLR start "rule__Enum__Group__4__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1839:1: rule__Enum__Group__4__Impl : ( ( rule__Enum__Group_4__0 )* ) ;
    public final void rule__Enum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1843:1: ( ( ( rule__Enum__Group_4__0 )* ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1844:1: ( ( rule__Enum__Group_4__0 )* )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1844:1: ( ( rule__Enum__Group_4__0 )* )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1845:1: ( rule__Enum__Group_4__0 )*
            {
             before(grammarAccess.getEnumAccess().getGroup_4()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1846:1: ( rule__Enum__Group_4__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==25) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1846:2: rule__Enum__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Enum__Group_4__0_in_rule__Enum__Group__4__Impl3688);
            	    rule__Enum__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getEnumAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__4__Impl"


    // $ANTLR start "rule__Enum__Group__5"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1856:1: rule__Enum__Group__5 : rule__Enum__Group__5__Impl ;
    public final void rule__Enum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1860:1: ( rule__Enum__Group__5__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1861:2: rule__Enum__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group__5__Impl_in_rule__Enum__Group__53719);
            rule__Enum__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__5"


    // $ANTLR start "rule__Enum__Group__5__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1867:1: rule__Enum__Group__5__Impl : ( '}' ) ;
    public final void rule__Enum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1871:1: ( ( '}' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1872:1: ( '}' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1872:1: ( '}' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1873:1: '}'
            {
             before(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__Enum__Group__5__Impl3747); 
             after(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__5__Impl"


    // $ANTLR start "rule__Enum__Group_4__0"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1898:1: rule__Enum__Group_4__0 : rule__Enum__Group_4__0__Impl rule__Enum__Group_4__1 ;
    public final void rule__Enum__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1902:1: ( rule__Enum__Group_4__0__Impl rule__Enum__Group_4__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1903:2: rule__Enum__Group_4__0__Impl rule__Enum__Group_4__1
            {
            pushFollow(FOLLOW_rule__Enum__Group_4__0__Impl_in_rule__Enum__Group_4__03790);
            rule__Enum__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group_4__1_in_rule__Enum__Group_4__03793);
            rule__Enum__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group_4__0"


    // $ANTLR start "rule__Enum__Group_4__0__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1910:1: rule__Enum__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Enum__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1914:1: ( ( ',' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1915:1: ( ',' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1915:1: ( ',' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1916:1: ','
            {
             before(grammarAccess.getEnumAccess().getCommaKeyword_4_0()); 
            match(input,25,FOLLOW_25_in_rule__Enum__Group_4__0__Impl3821); 
             after(grammarAccess.getEnumAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group_4__0__Impl"


    // $ANTLR start "rule__Enum__Group_4__1"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1929:1: rule__Enum__Group_4__1 : rule__Enum__Group_4__1__Impl ;
    public final void rule__Enum__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1933:1: ( rule__Enum__Group_4__1__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1934:2: rule__Enum__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group_4__1__Impl_in_rule__Enum__Group_4__13852);
            rule__Enum__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group_4__1"


    // $ANTLR start "rule__Enum__Group_4__1__Impl"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1940:1: rule__Enum__Group_4__1__Impl : ( ( rule__Enum__LiteralsAssignment_4_1 ) ) ;
    public final void rule__Enum__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1944:1: ( ( ( rule__Enum__LiteralsAssignment_4_1 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1945:1: ( ( rule__Enum__LiteralsAssignment_4_1 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1945:1: ( ( rule__Enum__LiteralsAssignment_4_1 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1946:1: ( rule__Enum__LiteralsAssignment_4_1 )
            {
             before(grammarAccess.getEnumAccess().getLiteralsAssignment_4_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1947:1: ( rule__Enum__LiteralsAssignment_4_1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1947:2: rule__Enum__LiteralsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Enum__LiteralsAssignment_4_1_in_rule__Enum__Group_4__1__Impl3879);
            rule__Enum__LiteralsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getLiteralsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group_4__1__Impl"


    // $ANTLR start "rule__Primitive__Group__0"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1962:1: rule__Primitive__Group__0 : rule__Primitive__Group__0__Impl rule__Primitive__Group__1 ;
    public final void rule__Primitive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1966:1: ( rule__Primitive__Group__0__Impl rule__Primitive__Group__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1967:2: rule__Primitive__Group__0__Impl rule__Primitive__Group__1
            {
            pushFollow(FOLLOW_rule__Primitive__Group__0__Impl_in_rule__Primitive__Group__03914);
            rule__Primitive__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primitive__Group__1_in_rule__Primitive__Group__03917);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1974:1: rule__Primitive__Group__0__Impl : ( 'primitive type' ) ;
    public final void rule__Primitive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1978:1: ( ( 'primitive type' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1979:1: ( 'primitive type' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1979:1: ( 'primitive type' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1980:1: 'primitive type'
            {
             before(grammarAccess.getPrimitiveAccess().getPrimitiveTypeKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Primitive__Group__0__Impl3945); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1993:1: rule__Primitive__Group__1 : rule__Primitive__Group__1__Impl ;
    public final void rule__Primitive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1997:1: ( rule__Primitive__Group__1__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:1998:2: rule__Primitive__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Primitive__Group__1__Impl_in_rule__Primitive__Group__13976);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2004:1: rule__Primitive__Group__1__Impl : ( ( rule__Primitive__NameAssignment_1 ) ) ;
    public final void rule__Primitive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2008:1: ( ( ( rule__Primitive__NameAssignment_1 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2009:1: ( ( rule__Primitive__NameAssignment_1 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2009:1: ( ( rule__Primitive__NameAssignment_1 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2010:1: ( rule__Primitive__NameAssignment_1 )
            {
             before(grammarAccess.getPrimitiveAccess().getNameAssignment_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2011:1: ( rule__Primitive__NameAssignment_1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2011:2: rule__Primitive__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Primitive__NameAssignment_1_in_rule__Primitive__Group__1__Impl4003);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2025:1: rule__Any__Group__0 : rule__Any__Group__0__Impl rule__Any__Group__1 ;
    public final void rule__Any__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2029:1: ( rule__Any__Group__0__Impl rule__Any__Group__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2030:2: rule__Any__Group__0__Impl rule__Any__Group__1
            {
            pushFollow(FOLLOW_rule__Any__Group__0__Impl_in_rule__Any__Group__04037);
            rule__Any__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Any__Group__1_in_rule__Any__Group__04040);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2037:1: rule__Any__Group__0__Impl : ( 'any type' ) ;
    public final void rule__Any__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2041:1: ( ( 'any type' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2042:1: ( 'any type' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2042:1: ( 'any type' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2043:1: 'any type'
            {
             before(grammarAccess.getAnyAccess().getAnyTypeKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Any__Group__0__Impl4068); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2056:1: rule__Any__Group__1 : rule__Any__Group__1__Impl ;
    public final void rule__Any__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2060:1: ( rule__Any__Group__1__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2061:2: rule__Any__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Any__Group__1__Impl_in_rule__Any__Group__14099);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2067:1: rule__Any__Group__1__Impl : ( ( rule__Any__NameAssignment_1 ) ) ;
    public final void rule__Any__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2071:1: ( ( ( rule__Any__NameAssignment_1 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2072:1: ( ( rule__Any__NameAssignment_1 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2072:1: ( ( rule__Any__NameAssignment_1 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2073:1: ( rule__Any__NameAssignment_1 )
            {
             before(grammarAccess.getAnyAccess().getNameAssignment_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2074:1: ( rule__Any__NameAssignment_1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2074:2: rule__Any__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Any__NameAssignment_1_in_rule__Any__Group__1__Impl4126);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2088:1: rule__TypeRef__Group__0 : rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 ;
    public final void rule__TypeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2092:1: ( rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2093:2: rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__04160);
            rule__TypeRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__04163);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2100:1: rule__TypeRef__Group__0__Impl : ( ( rule__TypeRef__ReferencedAssignment_0 ) ) ;
    public final void rule__TypeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2104:1: ( ( ( rule__TypeRef__ReferencedAssignment_0 ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2105:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2105:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2106:1: ( rule__TypeRef__ReferencedAssignment_0 )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedAssignment_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2107:1: ( rule__TypeRef__ReferencedAssignment_0 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2107:2: rule__TypeRef__ReferencedAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl4190);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2117:1: rule__TypeRef__Group__1 : rule__TypeRef__Group__1__Impl ;
    public final void rule__TypeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2121:1: ( rule__TypeRef__Group__1__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2122:2: rule__TypeRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__14220);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2128:1: rule__TypeRef__Group__1__Impl : ( ( rule__TypeRef__IsMultiAssignment_1 )? ) ;
    public final void rule__TypeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2132:1: ( ( ( rule__TypeRef__IsMultiAssignment_1 )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2133:1: ( ( rule__TypeRef__IsMultiAssignment_1 )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2133:1: ( ( rule__TypeRef__IsMultiAssignment_1 )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2134:1: ( rule__TypeRef__IsMultiAssignment_1 )?
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiAssignment_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2135:1: ( rule__TypeRef__IsMultiAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2135:2: rule__TypeRef__IsMultiAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TypeRef__IsMultiAssignment_1_in_rule__TypeRef__Group__1__Impl4247);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2149:1: rule__EFloatObject__Group__0 : rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1 ;
    public final void rule__EFloatObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2153:1: ( rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2154:2: rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__0__Impl_in_rule__EFloatObject__Group__04282);
            rule__EFloatObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__1_in_rule__EFloatObject__Group__04285);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2161:1: rule__EFloatObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloatObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2165:1: ( ( ( '-' )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2166:1: ( ( '-' )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2166:1: ( ( '-' )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2167:1: ( '-' )?
            {
             before(grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2168:1: ( '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2169:2: '-'
                    {
                    match(input,28,FOLLOW_28_in_rule__EFloatObject__Group__0__Impl4314); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2180:1: rule__EFloatObject__Group__1 : rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2 ;
    public final void rule__EFloatObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2184:1: ( rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2185:2: rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__1__Impl_in_rule__EFloatObject__Group__14347);
            rule__EFloatObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__2_in_rule__EFloatObject__Group__14350);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2192:1: rule__EFloatObject__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloatObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2196:1: ( ( ( RULE_INT )? ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2197:1: ( ( RULE_INT )? )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2197:1: ( ( RULE_INT )? )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2198:1: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2199:1: ( RULE_INT )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2199:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EFloatObject__Group__1__Impl4378); 

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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2209:1: rule__EFloatObject__Group__2 : rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3 ;
    public final void rule__EFloatObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2213:1: ( rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2214:2: rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__2__Impl_in_rule__EFloatObject__Group__24409);
            rule__EFloatObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EFloatObject__Group__3_in_rule__EFloatObject__Group__24412);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2221:1: rule__EFloatObject__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloatObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2225:1: ( ( '.' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2226:1: ( '.' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2226:1: ( '.' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2227:1: '.'
            {
             before(grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__EFloatObject__Group__2__Impl4440); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2240:1: rule__EFloatObject__Group__3 : rule__EFloatObject__Group__3__Impl ;
    public final void rule__EFloatObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2244:1: ( rule__EFloatObject__Group__3__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2245:2: rule__EFloatObject__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__3__Impl_in_rule__EFloatObject__Group__34471);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2251:1: rule__EFloatObject__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloatObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2255:1: ( ( RULE_INT ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2256:1: ( RULE_INT )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2256:1: ( RULE_INT )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2257:1: RULE_INT
            {
             before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EFloatObject__Group__3__Impl4498); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2276:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2280:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2281:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04535);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04538);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2288:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2292:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2293:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2293:1: ( RULE_ID )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2294:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4565); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2305:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2309:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2310:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14594);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2316:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2320:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2321:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2321:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2322:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2323:1: ( rule__QualifiedName__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==29) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2323:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4621);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2337:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2341:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2342:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04656);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04659);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2349:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2353:1: ( ( '.' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2354:1: ( '.' )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2354:1: ( '.' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2355:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,29,FOLLOW_29_in_rule__QualifiedName__Group_1__0__Impl4687); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2368:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2372:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2373:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14718);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2379:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2383:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2384:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2384:1: ( RULE_ID )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2385:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4745); 
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


    // $ANTLR start "rule__EntityModel__CurrentAssignment_0"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2401:1: rule__EntityModel__CurrentAssignment_0 : ( ( 'current' ) ) ;
    public final void rule__EntityModel__CurrentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2405:1: ( ( ( 'current' ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2406:1: ( ( 'current' ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2406:1: ( ( 'current' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2407:1: ( 'current' )
            {
             before(grammarAccess.getEntityModelAccess().getCurrentCurrentKeyword_0_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2408:1: ( 'current' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2409:1: 'current'
            {
             before(grammarAccess.getEntityModelAccess().getCurrentCurrentKeyword_0_0()); 
            match(input,30,FOLLOW_30_in_rule__EntityModel__CurrentAssignment_04788); 
             after(grammarAccess.getEntityModelAccess().getCurrentCurrentKeyword_0_0()); 

            }

             after(grammarAccess.getEntityModelAccess().getCurrentCurrentKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityModel__CurrentAssignment_0"


    // $ANTLR start "rule__EntityModel__ModuleAssignment_2"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2424:1: rule__EntityModel__ModuleAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EntityModel__ModuleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2428:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2429:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2429:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2430:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getEntityModelAccess().getModuleModuleCrossReference_2_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2431:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2432:1: ruleQualifiedName
            {
             before(grammarAccess.getEntityModelAccess().getModuleModuleQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__EntityModel__ModuleAssignment_24831);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getEntityModelAccess().getModuleModuleQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getEntityModelAccess().getModuleModuleCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityModel__ModuleAssignment_2"


    // $ANTLR start "rule__EntityModel__VersionAssignment_4"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2443:1: rule__EntityModel__VersionAssignment_4 : ( RULE_STRING ) ;
    public final void rule__EntityModel__VersionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2447:1: ( ( RULE_STRING ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2448:1: ( RULE_STRING )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2448:1: ( RULE_STRING )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2449:1: RULE_STRING
            {
             before(grammarAccess.getEntityModelAccess().getVersionSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EntityModel__VersionAssignment_44866); 
             after(grammarAccess.getEntityModelAccess().getVersionSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityModel__VersionAssignment_4"


    // $ANTLR start "rule__EntityModel__EntitiesAssignment_5"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2458:1: rule__EntityModel__EntitiesAssignment_5 : ( ruleEntity ) ;
    public final void rule__EntityModel__EntitiesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2462:1: ( ( ruleEntity ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2463:1: ( ruleEntity )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2463:1: ( ruleEntity )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2464:1: ruleEntity
            {
             before(grammarAccess.getEntityModelAccess().getEntitiesEntityParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__EntityModel__EntitiesAssignment_54897);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityModelAccess().getEntitiesEntityParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityModel__EntitiesAssignment_5"


    // $ANTLR start "rule__EntityModel__EnumsAssignment_6"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2473:1: rule__EntityModel__EnumsAssignment_6 : ( ruleEnum ) ;
    public final void rule__EntityModel__EnumsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2477:1: ( ( ruleEnum ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2478:1: ( ruleEnum )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2478:1: ( ruleEnum )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2479:1: ruleEnum
            {
             before(grammarAccess.getEntityModelAccess().getEnumsEnumParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleEnum_in_rule__EntityModel__EnumsAssignment_64928);
            ruleEnum();

            state._fsp--;

             after(grammarAccess.getEntityModelAccess().getEnumsEnumParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityModel__EnumsAssignment_6"


    // $ANTLR start "rule__Entity__CommentAssignment_0"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2488:1: rule__Entity__CommentAssignment_0 : ( RULE_DOC_COMMENT ) ;
    public final void rule__Entity__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2492:1: ( ( RULE_DOC_COMMENT ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2493:1: ( RULE_DOC_COMMENT )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2493:1: ( RULE_DOC_COMMENT )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2494:1: RULE_DOC_COMMENT
            {
             before(grammarAccess.getEntityAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_rule__Entity__CommentAssignment_04959); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2503:1: rule__Entity__AnnotationsAssignment_1 : ( ruleAnnotation ) ;
    public final void rule__Entity__AnnotationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2507:1: ( ( ruleAnnotation ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2508:1: ( ruleAnnotation )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2508:1: ( ruleAnnotation )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2509:1: ruleAnnotation
            {
             before(grammarAccess.getEntityAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Entity__AnnotationsAssignment_14990);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2518:1: rule__Entity__IsAbstractAssignment_2 : ( ( 'abstract' ) ) ;
    public final void rule__Entity__IsAbstractAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2522:1: ( ( ( 'abstract' ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2523:1: ( ( 'abstract' ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2523:1: ( ( 'abstract' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2524:1: ( 'abstract' )
            {
             before(grammarAccess.getEntityAccess().getIsAbstractAbstractKeyword_2_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2525:1: ( 'abstract' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2526:1: 'abstract'
            {
             before(grammarAccess.getEntityAccess().getIsAbstractAbstractKeyword_2_0()); 
            match(input,31,FOLLOW_31_in_rule__Entity__IsAbstractAssignment_25026); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2541:1: rule__Entity__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2545:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2546:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2546:1: ( RULE_ID )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2547:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_45065); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2556:1: rule__Entity__SuperAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Entity__SuperAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2560:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2561:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2561:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2562:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getEntityAccess().getSuperEntityCrossReference_5_1_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2563:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2564:1: ruleQualifiedName
            {
             before(grammarAccess.getEntityAccess().getSuperEntityQualifiedNameParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Entity__SuperAssignment_5_15100);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2575:1: rule__Entity__FeaturesAssignment_7 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2579:1: ( ( ruleFeature ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2580:1: ( ruleFeature )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2580:1: ( ruleFeature )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2581:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_75135);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2590:1: rule__Annotation__OptionAssignment_1 : ( ruleConfigOption ) ;
    public final void rule__Annotation__OptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2594:1: ( ( ruleConfigOption ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2595:1: ( ruleConfigOption )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2595:1: ( ruleConfigOption )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2596:1: ruleConfigOption
            {
             before(grammarAccess.getAnnotationAccess().getOptionConfigOptionEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConfigOption_in_rule__Annotation__OptionAssignment_15166);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2605:1: rule__Annotation__ValueAssignment_2_1 : ( ruleConfigValue ) ;
    public final void rule__Annotation__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2609:1: ( ( ruleConfigValue ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2610:1: ( ruleConfigValue )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2610:1: ( ruleConfigValue )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2611:1: ruleConfigValue
            {
             before(grammarAccess.getAnnotationAccess().getValueConfigValueEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleConfigValue_in_rule__Annotation__ValueAssignment_2_15197);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2620:1: rule__Feature__CommentAssignment_0 : ( RULE_DOC_COMMENT ) ;
    public final void rule__Feature__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2624:1: ( ( RULE_DOC_COMMENT ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2625:1: ( RULE_DOC_COMMENT )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2625:1: ( RULE_DOC_COMMENT )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2626:1: RULE_DOC_COMMENT
            {
             before(grammarAccess.getFeatureAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_rule__Feature__CommentAssignment_05228); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2635:1: rule__Feature__IsIndexedAssignment_1 : ( ( 'indexed' ) ) ;
    public final void rule__Feature__IsIndexedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2639:1: ( ( ( 'indexed' ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2640:1: ( ( 'indexed' ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2640:1: ( ( 'indexed' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2641:1: ( 'indexed' )
            {
             before(grammarAccess.getFeatureAccess().getIsIndexedIndexedKeyword_1_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2642:1: ( 'indexed' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2643:1: 'indexed'
            {
             before(grammarAccess.getFeatureAccess().getIsIndexedIndexedKeyword_1_0()); 
            match(input,32,FOLLOW_32_in_rule__Feature__IsIndexedAssignment_15264); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2658:1: rule__Feature__IsContainmentAssignment_2 : ( ( '-[' ) ) ;
    public final void rule__Feature__IsContainmentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2662:1: ( ( ( '-[' ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2663:1: ( ( '-[' ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2663:1: ( ( '-[' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2664:1: ( '-[' )
            {
             before(grammarAccess.getFeatureAccess().getIsContainmentHyphenMinusLeftSquareBracketKeyword_2_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2665:1: ( '-[' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2666:1: '-['
            {
             before(grammarAccess.getFeatureAccess().getIsContainmentHyphenMinusLeftSquareBracketKeyword_2_0()); 
            match(input,33,FOLLOW_33_in_rule__Feature__IsContainmentAssignment_25308); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2681:1: rule__Feature__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__Feature__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2685:1: ( ( ruleTypeRef ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2686:1: ( ruleTypeRef )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2686:1: ( ruleTypeRef )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2687:1: ruleTypeRef
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Feature__TypeAssignment_35347);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2696:1: rule__Feature__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2700:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2701:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2701:1: ( RULE_ID )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2702:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_45378); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2711:1: rule__Feature__DefaultValueAssignment_5_1 : ( ruleValueObject ) ;
    public final void rule__Feature__DefaultValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2715:1: ( ( ruleValueObject ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2716:1: ( ruleValueObject )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2716:1: ( ruleValueObject )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2717:1: ruleValueObject
            {
             before(grammarAccess.getFeatureAccess().getDefaultValueValueObjectParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleValueObject_in_rule__Feature__DefaultValueAssignment_5_15409);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2726:1: rule__Feature__InverseAssignment_6_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Feature__InverseAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2730:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2731:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2731:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2732:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getFeatureAccess().getInverseFeatureCrossReference_6_1_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2733:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2734:1: ruleQualifiedName
            {
             before(grammarAccess.getFeatureAccess().getInverseFeatureQualifiedNameParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Feature__InverseAssignment_6_15444);
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


    // $ANTLR start "rule__Enum__NameAssignment_1"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2745:1: rule__Enum__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2749:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2750:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2750:1: ( RULE_ID )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2751:1: RULE_ID
            {
             before(grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enum__NameAssignment_15479); 
             after(grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__NameAssignment_1"


    // $ANTLR start "rule__Enum__LiteralsAssignment_3"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2760:1: rule__Enum__LiteralsAssignment_3 : ( ruleEnumLiteral ) ;
    public final void rule__Enum__LiteralsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2764:1: ( ( ruleEnumLiteral ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2765:1: ( ruleEnumLiteral )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2765:1: ( ruleEnumLiteral )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2766:1: ruleEnumLiteral
            {
             before(grammarAccess.getEnumAccess().getLiteralsEnumLiteralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEnumLiteral_in_rule__Enum__LiteralsAssignment_35510);
            ruleEnumLiteral();

            state._fsp--;

             after(grammarAccess.getEnumAccess().getLiteralsEnumLiteralParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__LiteralsAssignment_3"


    // $ANTLR start "rule__Enum__LiteralsAssignment_4_1"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2775:1: rule__Enum__LiteralsAssignment_4_1 : ( ruleEnumLiteral ) ;
    public final void rule__Enum__LiteralsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2779:1: ( ( ruleEnumLiteral ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2780:1: ( ruleEnumLiteral )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2780:1: ( ruleEnumLiteral )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2781:1: ruleEnumLiteral
            {
             before(grammarAccess.getEnumAccess().getLiteralsEnumLiteralParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleEnumLiteral_in_rule__Enum__LiteralsAssignment_4_15541);
            ruleEnumLiteral();

            state._fsp--;

             after(grammarAccess.getEnumAccess().getLiteralsEnumLiteralParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__LiteralsAssignment_4_1"


    // $ANTLR start "rule__EnumLiteral__NameAssignment"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2790:1: rule__EnumLiteral__NameAssignment : ( RULE_ID ) ;
    public final void rule__EnumLiteral__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2794:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2795:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2795:1: ( RULE_ID )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2796:1: RULE_ID
            {
             before(grammarAccess.getEnumLiteralAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumLiteral__NameAssignment5572); 
             after(grammarAccess.getEnumLiteralAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiteral__NameAssignment"


    // $ANTLR start "rule__Primitive__NameAssignment_1"
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2807:1: rule__Primitive__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Primitive__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2811:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2812:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2812:1: ( RULE_ID )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2813:1: RULE_ID
            {
             before(grammarAccess.getPrimitiveAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Primitive__NameAssignment_15605); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2822:1: rule__Any__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Any__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2826:1: ( ( RULE_ID ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2827:1: ( RULE_ID )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2827:1: ( RULE_ID )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2828:1: RULE_ID
            {
             before(grammarAccess.getAnyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Any__NameAssignment_15636); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2837:1: rule__TypeRef__ReferencedAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TypeRef__ReferencedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2841:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2842:1: ( ( ruleQualifiedName ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2842:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2843:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2844:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2845:1: ruleQualifiedName
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_05671);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2856:1: rule__TypeRef__IsMultiAssignment_1 : ( ( '[]' ) ) ;
    public final void rule__TypeRef__IsMultiAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2860:1: ( ( ( '[]' ) ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2861:1: ( ( '[]' ) )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2861:1: ( ( '[]' ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2862:1: ( '[]' )
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2863:1: ( '[]' )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2864:1: '[]'
            {
             before(grammarAccess.getTypeRefAccess().getIsMultiLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            match(input,34,FOLLOW_34_in_rule__TypeRef__IsMultiAssignment_15711); 
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2879:1: rule__StringValue__ValueAssignment : ( ruleEStringObject ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2883:1: ( ( ruleEStringObject ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2884:1: ( ruleEStringObject )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2884:1: ( ruleEStringObject )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2885:1: ruleEStringObject
            {
             before(grammarAccess.getStringValueAccess().getValueEStringObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEStringObject_in_rule__StringValue__ValueAssignment5750);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2894:1: rule__IntegerValue__ValueAssignment : ( ruleEIntegerObject ) ;
    public final void rule__IntegerValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2898:1: ( ( ruleEIntegerObject ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2899:1: ( ruleEIntegerObject )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2899:1: ( ruleEIntegerObject )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2900:1: ruleEIntegerObject
            {
             before(grammarAccess.getIntegerValueAccess().getValueEIntegerObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_rule__IntegerValue__ValueAssignment5781);
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
    // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2909:1: rule__FloatValue__ValueAssignment : ( ruleEFloatObject ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2913:1: ( ( ruleEFloatObject ) )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2914:1: ( ruleEFloatObject )
            {
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2914:1: ( ruleEFloatObject )
            // ../de.dubmas.modulob.datadsl.ui/src-gen/de/dubmas/modulob/ui/contentassist/antlr/internal/InternalDataDsl.g:2915:1: ruleEFloatObject
            {
             before(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_rule__FloatValue__ValueAssignment5812);
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
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0_in_ruleEnum334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLiteral_in_entryRuleEnumLiteral361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumLiteral368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumLiteral__NameAssignment_in_ruleEnumLiteral394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__0_in_rulePrimitive456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAny_in_entryRuleAny483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAny490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__Group__0_in_ruleAny516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueObject_in_entryRuleValueObject603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueObject610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueObject__Alternatives_in_ruleValueObject636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_entryRuleEStringObject723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEStringObject730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEStringObject756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerValue__ValueAssignment_in_ruleIntegerValue815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEIntegerObject849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEIntegerObject875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEFloatObject968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__0_in_ruleEFloatObject994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleConfigOption1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleConfigValue1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__ValueObject__Alternatives1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_rule__ValueObject__Alternatives1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_rule__ValueObject__Alternatives1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__0__Impl_in_rule__EntityModel__Group__01232 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__1_in_rule__EntityModel__Group__01235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__CurrentAssignment_0_in_rule__EntityModel__Group__0__Impl1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__1__Impl_in_rule__EntityModel__Group__11293 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__2_in_rule__EntityModel__Group__11296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__EntityModel__Group__1__Impl1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__2__Impl_in_rule__EntityModel__Group__21355 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__3_in_rule__EntityModel__Group__21358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__ModuleAssignment_2_in_rule__EntityModel__Group__2__Impl1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__3__Impl_in_rule__EntityModel__Group__31415 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__4_in_rule__EntityModel__Group__31418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__EntityModel__Group__3__Impl1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__4__Impl_in_rule__EntityModel__Group__41477 = new BitSet(new long[]{0x0000000081110080L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__5_in_rule__EntityModel__Group__41480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__VersionAssignment_4_in_rule__EntityModel__Group__4__Impl1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__5__Impl_in_rule__EntityModel__Group__51537 = new BitSet(new long[]{0x0000000081110080L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__6_in_rule__EntityModel__Group__51540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__EntitiesAssignment_5_in_rule__EntityModel__Group__5__Impl1567 = new BitSet(new long[]{0x0000000080110082L});
    public static final BitSet FOLLOW_rule__EntityModel__Group__6__Impl_in_rule__EntityModel__Group__61598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityModel__EnumsAssignment_6_in_rule__EntityModel__Group__6__Impl1625 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01670 = new BitSet(new long[]{0x0000000080110080L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__CommentAssignment_0_in_rule__Entity__Group__0__Impl1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11731 = new BitSet(new long[]{0x0000000080110080L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__AnnotationsAssignment_1_in_rule__Entity__Group__1__Impl1761 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21792 = new BitSet(new long[]{0x0000000080110080L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__IsAbstractAssignment_2_in_rule__Entity__Group__2__Impl1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31853 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Entity__Group__3__Impl1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41915 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_4_in_rule__Entity__Group__4__Impl1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51975 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__51978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_5__0_in_rule__Entity__Group__5__Impl2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__62036 = new BitSet(new long[]{0x00000003000400C0L});
    public static final BitSet FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__62039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Entity__Group__6__Impl2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__72098 = new BitSet(new long[]{0x00000003000400C0L});
    public static final BitSet FOLLOW_rule__Entity__Group__8_in_rule__Entity__Group__72101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_7_in_rule__Entity__Group__7__Impl2128 = new BitSet(new long[]{0x00000003000000C2L});
    public static final BitSet FOLLOW_rule__Entity__Group__8__Impl_in_rule__Entity__Group__82159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Entity__Group__8__Impl2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_5__0__Impl_in_rule__Entity__Group_5__02236 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Entity__Group_5__1_in_rule__Entity__Group_5__02239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Entity__Group_5__0__Impl2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_5__1__Impl_in_rule__Entity__Group_5__12298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__SuperAssignment_5_1_in_rule__Entity__Group_5__1__Impl2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__02359 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__02362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Annotation__Group__0__Impl2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__12421 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__12424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__OptionAssignment_1_in_rule__Annotation__Group__1__Impl2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__22481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__0_in_rule__Annotation__Group__2__Impl2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__0__Impl_in_rule__Annotation__Group_2__02545 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__1_in_rule__Annotation__Group_2__02548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Annotation__Group_2__0__Impl2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__1__Impl_in_rule__Annotation__Group_2__12607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__ValueAssignment_2_1_in_rule__Annotation__Group_2__1__Impl2634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__02668 = new BitSet(new long[]{0x00000003000000C0L});
    public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__02671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__CommentAssignment_0_in_rule__Feature__Group__0__Impl2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__12729 = new BitSet(new long[]{0x00000003000000C0L});
    public static final BitSet FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__12732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__IsIndexedAssignment_1_in_rule__Feature__Group__1__Impl2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__22790 = new BitSet(new long[]{0x00000003000000C0L});
    public static final BitSet FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__22793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__IsContainmentAssignment_2_in_rule__Feature__Group__2__Impl2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__32851 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Feature__Group__4_in_rule__Feature__Group__32854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__TypeAssignment_3_in_rule__Feature__Group__3__Impl2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__4__Impl_in_rule__Feature__Group__42911 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_rule__Feature__Group__5_in_rule__Feature__Group__42914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__NameAssignment_4_in_rule__Feature__Group__4__Impl2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__5__Impl_in_rule__Feature__Group__52971 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_rule__Feature__Group__6_in_rule__Feature__Group__52974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_5__0_in_rule__Feature__Group__5__Impl3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__6__Impl_in_rule__Feature__Group__63032 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_rule__Feature__Group__7_in_rule__Feature__Group__63035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_6__0_in_rule__Feature__Group__6__Impl3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__7__Impl_in_rule__Feature__Group__73093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Feature__Group__7__Impl3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_5__0__Impl_in_rule__Feature__Group_5__03168 = new BitSet(new long[]{0x0000000030000030L});
    public static final BitSet FOLLOW_rule__Feature__Group_5__1_in_rule__Feature__Group_5__03171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Feature__Group_5__0__Impl3199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_5__1__Impl_in_rule__Feature__Group_5__13230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__DefaultValueAssignment_5_1_in_rule__Feature__Group_5__1__Impl3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_6__0__Impl_in_rule__Feature__Group_6__03291 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Feature__Group_6__1_in_rule__Feature__Group_6__03294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Feature__Group_6__0__Impl3322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_6__1__Impl_in_rule__Feature__Group_6__13353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__InverseAssignment_6_1_in_rule__Feature__Group_6__1__Impl3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__03414 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__03417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Enum__Group__0__Impl3445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__13476 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__13479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__NameAssignment_1_in_rule__Enum__Group__1__Impl3506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__23536 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__23539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Enum__Group__2__Impl3567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__33598 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__33601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__LiteralsAssignment_3_in_rule__Enum__Group__3__Impl3628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__43658 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_rule__Enum__Group__5_in_rule__Enum__Group__43661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group_4__0_in_rule__Enum__Group__4__Impl3688 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__5__Impl_in_rule__Enum__Group__53719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Enum__Group__5__Impl3747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group_4__0__Impl_in_rule__Enum__Group_4__03790 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Enum__Group_4__1_in_rule__Enum__Group_4__03793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Enum__Group_4__0__Impl3821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group_4__1__Impl_in_rule__Enum__Group_4__13852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__LiteralsAssignment_4_1_in_rule__Enum__Group_4__1__Impl3879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__0__Impl_in_rule__Primitive__Group__03914 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Primitive__Group__1_in_rule__Primitive__Group__03917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Primitive__Group__0__Impl3945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__Group__1__Impl_in_rule__Primitive__Group__13976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primitive__NameAssignment_1_in_rule__Primitive__Group__1__Impl4003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__Group__0__Impl_in_rule__Any__Group__04037 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Any__Group__1_in_rule__Any__Group__04040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Any__Group__0__Impl4068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__Group__1__Impl_in_rule__Any__Group__14099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Any__NameAssignment_1_in_rule__Any__Group__1__Impl4126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__04160 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__04163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl4190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__14220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__IsMultiAssignment_1_in_rule__TypeRef__Group__1__Impl4247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__0__Impl_in_rule__EFloatObject__Group__04282 = new BitSet(new long[]{0x0000000030000030L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__1_in_rule__EFloatObject__Group__04285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__EFloatObject__Group__0__Impl4314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__1__Impl_in_rule__EFloatObject__Group__14347 = new BitSet(new long[]{0x0000000030000030L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__2_in_rule__EFloatObject__Group__14350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group__1__Impl4378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__2__Impl_in_rule__EFloatObject__Group__24409 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__3_in_rule__EFloatObject__Group__24412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__EFloatObject__Group__2__Impl4440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__3__Impl_in_rule__EFloatObject__Group__34471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group__3__Impl4498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04535 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4621 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04656 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__QualifiedName__Group_1__0__Impl4687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EntityModel__CurrentAssignment_04788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__EntityModel__ModuleAssignment_24831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EntityModel__VersionAssignment_44866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__EntityModel__EntitiesAssignment_54897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_rule__EntityModel__EnumsAssignment_64928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_rule__Entity__CommentAssignment_04959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Entity__AnnotationsAssignment_14990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Entity__IsAbstractAssignment_25026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_45065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Entity__SuperAssignment_5_15100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_75135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigOption_in_rule__Annotation__OptionAssignment_15166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigValue_in_rule__Annotation__ValueAssignment_2_15197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_rule__Feature__CommentAssignment_05228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Feature__IsIndexedAssignment_15264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Feature__IsContainmentAssignment_25308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Feature__TypeAssignment_35347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_45378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueObject_in_rule__Feature__DefaultValueAssignment_5_15409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Feature__InverseAssignment_6_15444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enum__NameAssignment_15479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLiteral_in_rule__Enum__LiteralsAssignment_35510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLiteral_in_rule__Enum__LiteralsAssignment_4_15541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumLiteral__NameAssignment5572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Primitive__NameAssignment_15605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Any__NameAssignment_15636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_05671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__TypeRef__IsMultiAssignment_15711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_rule__StringValue__ValueAssignment5750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_rule__IntegerValue__ValueAssignment5781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_rule__FloatValue__ValueAssignment5812 = new BitSet(new long[]{0x0000000000000002L});

}