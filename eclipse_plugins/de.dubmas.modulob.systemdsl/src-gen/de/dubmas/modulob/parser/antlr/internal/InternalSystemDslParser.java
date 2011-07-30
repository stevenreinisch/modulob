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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'consistsOf'", "','", "'module'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
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
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSystem122); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSystem156); 

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

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:124:4: otherlv_4= ',' ( (lv_modules_5_0= ruleModule ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleSystem190); 

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
    // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:163:1: ruleModule returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:166:28: ( (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:167:1: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:167:1: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:167:3: otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleModule296); 

                	newLeafNode(otherlv_0, grammarAccess.getModuleAccess().getModuleKeyword_0());
                
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:171:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:172:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:172:1: (lv_name_1_0= RULE_ID )
            // ../de.dubmas.modulob.systemdsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalSystemDsl.g:173:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModule313); 

            			newLeafNode(lv_name_1_0, grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModuleRule());
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
    // $ANTLR end "ruleModule"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSystem122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystem139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSystem156 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleModule_in_ruleSystem177 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleSystem190 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleModule_in_ruleSystem211 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleModule296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModule313 = new BitSet(new long[]{0x0000000000000002L});

}