package de.dubmas.modulob.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.dubmas.modulob.services.SystemDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSystemDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOC_COMMENT", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'consistsOf'", "','", "'module'", "'primitive type'", "'any type'", "'-'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_DOC_COMMENT=5;
    public static final int RULE_ANY_OTHER=11;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
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
    public String getGrammarFileName() { return "../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g"; }



     	private SystemDslGrammarAccess grammarAccess;
     	
        public InternalSystemDslParser(TokenStream input, SystemDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "System";	
       	}
       	
       	@Override
       	protected SystemDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSystem"
    // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:67:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:68:2: (iv_ruleSystem= ruleSystem EOF )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:69:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_ruleSystem_in_entryRuleSystem75);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystem85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:76:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'consistsOf' ( (lv_modules_3_0= ruleModule ) ) (otherlv_4= ',' ( (lv_modules_5_0= ruleModule ) ) )* ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_modules_3_0 = null;

        EObject lv_modules_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:79:28: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'consistsOf' ( (lv_modules_3_0= ruleModule ) ) (otherlv_4= ',' ( (lv_modules_5_0= ruleModule ) ) )* ) )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:80:1: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'consistsOf' ( (lv_modules_3_0= ruleModule ) ) (otherlv_4= ',' ( (lv_modules_5_0= ruleModule ) ) )* )
            {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:80:1: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'consistsOf' ( (lv_modules_3_0= ruleModule ) ) (otherlv_4= ',' ( (lv_modules_5_0= ruleModule ) ) )* )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:80:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'consistsOf' ( (lv_modules_3_0= ruleModule ) ) (otherlv_4= ',' ( (lv_modules_5_0= ruleModule ) ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleSystem122); 

                	newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
                
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:85:1: (lv_name_1_0= RULE_ID )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystem139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleSystem156); 

                	newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getConsistsOfKeyword_2());
                
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:106:1: ( (lv_modules_3_0= ruleModule ) )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:107:1: (lv_modules_3_0= ruleModule )
            {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:107:1: (lv_modules_3_0= ruleModule )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:108:3: lv_modules_3_0= ruleModule
            {
             
            	        newCompositeNode(grammarAccess.getSystemAccess().getModulesModuleParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleModule_in_ruleSystem177);
            lv_modules_3_0=ruleModule();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSystemRule());
            	        }
                   		add(
                   			current, 
                   			"modules",
                    		lv_modules_3_0, 
                    		"Module");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:124:2: (otherlv_4= ',' ( (lv_modules_5_0= ruleModule ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:124:4: otherlv_4= ',' ( (lv_modules_5_0= ruleModule ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleSystem190); 

            	        	newLeafNode(otherlv_4, grammarAccess.getSystemAccess().getCommaKeyword_4_0());
            	        
            	    // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:128:1: ( (lv_modules_5_0= ruleModule ) )
            	    // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:129:1: (lv_modules_5_0= ruleModule )
            	    {
            	    // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:129:1: (lv_modules_5_0= ruleModule )
            	    // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:130:3: lv_modules_5_0= ruleModule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSystemAccess().getModulesModuleParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleModule_in_ruleSystem211);
            	    lv_modules_5_0=ruleModule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"modules",
            	            		lv_modules_5_0, 
            	            		"Module");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleModule"
    // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:154:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:155:2: (iv_ruleModule= ruleModule EOF )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:156:2: iv_ruleModule= ruleModule EOF
            {
             newCompositeNode(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule249);
            iv_ruleModule=ruleModule();

            state._fsp--;

             current =iv_ruleModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule259); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:163:1: ruleModule returns [EObject current=null] : ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:166:28: ( ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:167:1: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:167:1: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:167:2: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:167:2: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_DOC_COMMENT) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:168:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                    {
                    // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:168:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                    // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:169:3: lv_comment_0_0= RULE_DOC_COMMENT
                    {
                    lv_comment_0_0=(Token)match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_ruleModule301); 

                    			newLeafNode(lv_comment_0_0, grammarAccess.getModuleAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModuleRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"comment",
                            		lv_comment_0_0, 
                            		"DOC_COMMENT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleModule319); 

                	newLeafNode(otherlv_1, grammarAccess.getModuleAccess().getModuleKeyword_1());
                
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:189:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:190:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:190:1: (lv_name_2_0= RULE_ID )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:191:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModule336); 

            			newLeafNode(lv_name_2_0, grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRulePrimitive"
    // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:217:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:218:2: (iv_rulePrimitive= rulePrimitive EOF )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:219:2: iv_rulePrimitive= rulePrimitive EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive379);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;

             current =iv_rulePrimitive; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive389); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:226:1: rulePrimitive returns [EObject current=null] : (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:229:28: ( (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:230:1: (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:230:1: (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:230:3: otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_rulePrimitive426); 

                	newLeafNode(otherlv_0, grammarAccess.getPrimitiveAccess().getPrimitiveTypeKeyword_0());
                
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:234:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:235:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:235:1: (lv_name_1_0= RULE_ID )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:236:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimitive443); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPrimitiveAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPrimitiveRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleAny"
    // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:260:1: entryRuleAny returns [EObject current=null] : iv_ruleAny= ruleAny EOF ;
    public final EObject entryRuleAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAny = null;


        try {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:261:2: (iv_ruleAny= ruleAny EOF )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:262:2: iv_ruleAny= ruleAny EOF
            {
             newCompositeNode(grammarAccess.getAnyRule()); 
            pushFollow(FOLLOW_ruleAny_in_entryRuleAny484);
            iv_ruleAny=ruleAny();

            state._fsp--;

             current =iv_ruleAny; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAny494); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAny"


    // $ANTLR start "ruleAny"
    // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:269:1: ruleAny returns [EObject current=null] : (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAny() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:272:28: ( (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:273:1: (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:273:1: (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:273:3: otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleAny531); 

                	newLeafNode(otherlv_0, grammarAccess.getAnyAccess().getAnyTypeKeyword_0());
                
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:277:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:278:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:278:1: (lv_name_1_0= RULE_ID )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:279:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAny548); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAnyAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAnyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAny"


    // $ANTLR start "entryRuleStringValue"
    // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:307:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:308:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:309:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue593);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue603); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:316:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEStringObject ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:319:28: ( ( (lv_value_0_0= ruleEStringObject ) ) )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:320:1: ( (lv_value_0_0= ruleEStringObject ) )
            {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:320:1: ( (lv_value_0_0= ruleEStringObject ) )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:321:1: (lv_value_0_0= ruleEStringObject )
            {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:321:1: (lv_value_0_0= ruleEStringObject )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:322:3: lv_value_0_0= ruleEStringObject
            {
             
            	        newCompositeNode(grammarAccess.getStringValueAccess().getValueEStringObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEStringObject_in_ruleStringValue648);
            lv_value_0_0=ruleEStringObject();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStringValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"EStringObject");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleEStringObject"
    // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:346:1: entryRuleEStringObject returns [String current=null] : iv_ruleEStringObject= ruleEStringObject EOF ;
    public final String entryRuleEStringObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringObject = null;


        try {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:347:2: (iv_ruleEStringObject= ruleEStringObject EOF )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:348:2: iv_ruleEStringObject= ruleEStringObject EOF
            {
             newCompositeNode(grammarAccess.getEStringObjectRule()); 
            pushFollow(FOLLOW_ruleEStringObject_in_entryRuleEStringObject684);
            iv_ruleEStringObject=ruleEStringObject();

            state._fsp--;

             current =iv_ruleEStringObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEStringObject695); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEStringObject"


    // $ANTLR start "ruleEStringObject"
    // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:355:1: ruleEStringObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEStringObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:358:28: (this_STRING_0= RULE_STRING )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:359:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEStringObject734); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getEStringObjectAccess().getSTRINGTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEStringObject"


    // $ANTLR start "entryRuleIntegerValue"
    // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:374:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:375:2: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:376:2: iv_ruleIntegerValue= ruleIntegerValue EOF
            {
             newCompositeNode(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue778);
            iv_ruleIntegerValue=ruleIntegerValue();

            state._fsp--;

             current =iv_ruleIntegerValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValue788); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerValue"


    // $ANTLR start "ruleIntegerValue"
    // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:383:1: ruleIntegerValue returns [EObject current=null] : ( (lv_value_0_0= ruleEIntegerObject ) ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:386:28: ( ( (lv_value_0_0= ruleEIntegerObject ) ) )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:387:1: ( (lv_value_0_0= ruleEIntegerObject ) )
            {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:387:1: ( (lv_value_0_0= ruleEIntegerObject ) )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:388:1: (lv_value_0_0= ruleEIntegerObject )
            {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:388:1: (lv_value_0_0= ruleEIntegerObject )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:389:3: lv_value_0_0= ruleEIntegerObject
            {
             
            	        newCompositeNode(grammarAccess.getIntegerValueAccess().getValueEIntegerObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEIntegerObject_in_ruleIntegerValue833);
            lv_value_0_0=ruleEIntegerObject();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntegerValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"EIntegerObject");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerValue"


    // $ANTLR start "entryRuleEIntegerObject"
    // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:413:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:414:2: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:415:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
            {
             newCompositeNode(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject869);
            iv_ruleEIntegerObject=ruleEIntegerObject();

            state._fsp--;

             current =iv_ruleEIntegerObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEIntegerObject880); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEIntegerObject"


    // $ANTLR start "ruleEIntegerObject"
    // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:422:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:425:28: (this_INT_0= RULE_INT )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:426:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEIntegerObject919); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEIntegerObject"


    // $ANTLR start "entryRuleFloatValue"
    // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:441:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:442:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:443:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
             newCompositeNode(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue963);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;

             current =iv_ruleFloatValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue973); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatValue"


    // $ANTLR start "ruleFloatValue"
    // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:450:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= ruleEFloatObject ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:453:28: ( ( (lv_value_0_0= ruleEFloatObject ) ) )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:454:1: ( (lv_value_0_0= ruleEFloatObject ) )
            {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:454:1: ( (lv_value_0_0= ruleEFloatObject ) )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:455:1: (lv_value_0_0= ruleEFloatObject )
            {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:455:1: (lv_value_0_0= ruleEFloatObject )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:456:3: lv_value_0_0= ruleEFloatObject
            {
             
            	        newCompositeNode(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEFloatObject_in_ruleFloatValue1018);
            lv_value_0_0=ruleEFloatObject();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFloatValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"EFloatObject");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloatValue"


    // $ANTLR start "entryRuleEFloatObject"
    // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:480:1: entryRuleEFloatObject returns [String current=null] : iv_ruleEFloatObject= ruleEFloatObject EOF ;
    public final String entryRuleEFloatObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloatObject = null;


        try {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:481:2: (iv_ruleEFloatObject= ruleEFloatObject EOF )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:482:2: iv_ruleEFloatObject= ruleEFloatObject EOF
            {
             newCompositeNode(grammarAccess.getEFloatObjectRule()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject1054);
            iv_ruleEFloatObject=ruleEFloatObject();

            state._fsp--;

             current =iv_ruleEFloatObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEFloatObject1065); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEFloatObject"


    // $ANTLR start "ruleEFloatObject"
    // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:489:1: ruleEFloatObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEFloatObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:492:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ) )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:493:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT )
            {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:493:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:493:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT
            {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:493:2: (kw= '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:494:2: kw= '-'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleEFloatObject1104); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:499:3: (this_INT_1= RULE_INT )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:499:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEFloatObject1122); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,19,FOLLOW_19_in_ruleEFloatObject1142); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEFloatObject1157); 

            		current.merge(this_INT_3);
                
             
                newLeafNode(this_INT_3, grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_3()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEFloatObject"


    // $ANTLR start "entryRuleQualifiedName"
    // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:527:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:528:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:529:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1203);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1214); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:536:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:539:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:540:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:540:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:540:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1254); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:547:1: (kw= '.' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:548:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,19,FOLLOW_19_in_ruleQualifiedName1273); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1288); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleSystem122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystem139 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSystem156 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_ruleModule_in_ruleSystem177 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleSystem190 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_ruleModule_in_ruleSystem211 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_ruleModule301 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleModule319 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModule336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePrimitive426 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimitive443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAny_in_entryRuleAny484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAny494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleAny531 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAny548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_ruleStringValue648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_entryRuleEStringObject684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEStringObject695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEStringObject734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_ruleIntegerValue833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEIntegerObject880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEIntegerObject919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_ruleFloatValue1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject1054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEFloatObject1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleEFloatObject1104 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatObject1122 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEFloatObject1142 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatObject1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1254 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleQualifiedName1273 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1288 = new BitSet(new long[]{0x0000000000080002L});

}