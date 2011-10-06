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
import de.dubmas.modulob.services.BehaviourDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBehaviourDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_DOC_COMMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'behaviours for system'", "'version'", "'behaviour'", "'{'", "'}'", "'interface'", "'reacts to'", "'as'", "'.'", "'by calling'", "':'", "'primitive type'", "'any type'", "'-'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_DOC_COMMENT=7;
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
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalBehaviourDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBehaviourDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBehaviourDslParser.tokenNames; }
    public String getGrammarFileName() { return "../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g"; }



     	private BehaviourDslGrammarAccess grammarAccess;
     	
        public InternalBehaviourDslParser(TokenStream input, BehaviourDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "BehaviouralModel";	
       	}
       	
       	@Override
       	protected BehaviourDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleBehaviouralModel"
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:67:1: entryRuleBehaviouralModel returns [EObject current=null] : iv_ruleBehaviouralModel= ruleBehaviouralModel EOF ;
    public final EObject entryRuleBehaviouralModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviouralModel = null;


        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:68:2: (iv_ruleBehaviouralModel= ruleBehaviouralModel EOF )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:69:2: iv_ruleBehaviouralModel= ruleBehaviouralModel EOF
            {
             newCompositeNode(grammarAccess.getBehaviouralModelRule()); 
            pushFollow(FOLLOW_ruleBehaviouralModel_in_entryRuleBehaviouralModel75);
            iv_ruleBehaviouralModel=ruleBehaviouralModel();

            state._fsp--;

             current =iv_ruleBehaviouralModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBehaviouralModel85); 

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
    // $ANTLR end "entryRuleBehaviouralModel"


    // $ANTLR start "ruleBehaviouralModel"
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:76:1: ruleBehaviouralModel returns [EObject current=null] : (otherlv_0= 'behaviours for system' ( ( ruleQualifiedName ) ) otherlv_2= 'version' ( (lv_version_3_0= RULE_STRING ) ) ( (lv_behaviours_4_0= ruleBehaviour ) )* ) ;
    public final EObject ruleBehaviouralModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_version_3_0=null;
        EObject lv_behaviours_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:79:28: ( (otherlv_0= 'behaviours for system' ( ( ruleQualifiedName ) ) otherlv_2= 'version' ( (lv_version_3_0= RULE_STRING ) ) ( (lv_behaviours_4_0= ruleBehaviour ) )* ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:80:1: (otherlv_0= 'behaviours for system' ( ( ruleQualifiedName ) ) otherlv_2= 'version' ( (lv_version_3_0= RULE_STRING ) ) ( (lv_behaviours_4_0= ruleBehaviour ) )* )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:80:1: (otherlv_0= 'behaviours for system' ( ( ruleQualifiedName ) ) otherlv_2= 'version' ( (lv_version_3_0= RULE_STRING ) ) ( (lv_behaviours_4_0= ruleBehaviour ) )* )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:80:3: otherlv_0= 'behaviours for system' ( ( ruleQualifiedName ) ) otherlv_2= 'version' ( (lv_version_3_0= RULE_STRING ) ) ( (lv_behaviours_4_0= ruleBehaviour ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleBehaviouralModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getBehaviouralModelAccess().getBehavioursForSystemKeyword_0());
                
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:84:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:85:1: ( ruleQualifiedName )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:85:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:86:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBehaviouralModelRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getBehaviouralModelAccess().getSystemSystemCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleBehaviouralModel145);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleBehaviouralModel157); 

                	newLeafNode(otherlv_2, grammarAccess.getBehaviouralModelAccess().getVersionKeyword_2());
                
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:103:1: ( (lv_version_3_0= RULE_STRING ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:104:1: (lv_version_3_0= RULE_STRING )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:104:1: (lv_version_3_0= RULE_STRING )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:105:3: lv_version_3_0= RULE_STRING
            {
            lv_version_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBehaviouralModel174); 

            			newLeafNode(lv_version_3_0, grammarAccess.getBehaviouralModelAccess().getVersionSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBehaviouralModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"version",
                    		lv_version_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:121:2: ( (lv_behaviours_4_0= ruleBehaviour ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:122:1: (lv_behaviours_4_0= ruleBehaviour )
            	    {
            	    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:122:1: (lv_behaviours_4_0= ruleBehaviour )
            	    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:123:3: lv_behaviours_4_0= ruleBehaviour
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBehaviouralModelAccess().getBehavioursBehaviourParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBehaviour_in_ruleBehaviouralModel200);
            	    lv_behaviours_4_0=ruleBehaviour();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBehaviouralModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"behaviours",
            	            		lv_behaviours_4_0, 
            	            		"Behaviour");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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
    // $ANTLR end "ruleBehaviouralModel"


    // $ANTLR start "entryRuleBehaviour"
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:147:1: entryRuleBehaviour returns [EObject current=null] : iv_ruleBehaviour= ruleBehaviour EOF ;
    public final EObject entryRuleBehaviour() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviour = null;


        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:148:2: (iv_ruleBehaviour= ruleBehaviour EOF )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:149:2: iv_ruleBehaviour= ruleBehaviour EOF
            {
             newCompositeNode(grammarAccess.getBehaviourRule()); 
            pushFollow(FOLLOW_ruleBehaviour_in_entryRuleBehaviour237);
            iv_ruleBehaviour=ruleBehaviour();

            state._fsp--;

             current =iv_ruleBehaviour; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBehaviour247); 

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
    // $ANTLR end "entryRuleBehaviour"


    // $ANTLR start "ruleBehaviour"
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:156:1: ruleBehaviour returns [EObject current=null] : (otherlv_0= 'behaviour' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_reactions_3_0= ruleReaction ) )* otherlv_4= '}' ) ;
    public final EObject ruleBehaviour() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_reactions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:159:28: ( (otherlv_0= 'behaviour' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_reactions_3_0= ruleReaction ) )* otherlv_4= '}' ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:160:1: (otherlv_0= 'behaviour' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_reactions_3_0= ruleReaction ) )* otherlv_4= '}' )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:160:1: (otherlv_0= 'behaviour' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_reactions_3_0= ruleReaction ) )* otherlv_4= '}' )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:160:3: otherlv_0= 'behaviour' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_reactions_3_0= ruleReaction ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleBehaviour284); 

                	newLeafNode(otherlv_0, grammarAccess.getBehaviourAccess().getBehaviourKeyword_0());
                
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:164:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:165:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:165:1: (lv_name_1_0= RULE_ID )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:166:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBehaviour301); 

            			newLeafNode(lv_name_1_0, grammarAccess.getBehaviourAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBehaviourRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleBehaviour318); 

                	newLeafNode(otherlv_2, grammarAccess.getBehaviourAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:186:1: ( (lv_reactions_3_0= ruleReaction ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:187:1: (lv_reactions_3_0= ruleReaction )
            	    {
            	    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:187:1: (lv_reactions_3_0= ruleReaction )
            	    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:188:3: lv_reactions_3_0= ruleReaction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBehaviourAccess().getReactionsReactionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleReaction_in_ruleBehaviour339);
            	    lv_reactions_3_0=ruleReaction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBehaviourRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"reactions",
            	            		lv_reactions_3_0, 
            	            		"Reaction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleBehaviour352); 

                	newLeafNode(otherlv_4, grammarAccess.getBehaviourAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleBehaviour"


    // $ANTLR start "entryRuleReaction"
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:216:1: entryRuleReaction returns [EObject current=null] : iv_ruleReaction= ruleReaction EOF ;
    public final EObject entryRuleReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReaction = null;


        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:217:2: (iv_ruleReaction= ruleReaction EOF )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:218:2: iv_ruleReaction= ruleReaction EOF
            {
             newCompositeNode(grammarAccess.getReactionRule()); 
            pushFollow(FOLLOW_ruleReaction_in_entryRuleReaction388);
            iv_ruleReaction=ruleReaction();

            state._fsp--;

             current =iv_ruleReaction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReaction398); 

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
    // $ANTLR end "entryRuleReaction"


    // $ANTLR start "ruleReaction"
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:225:1: ruleReaction returns [EObject current=null] : (otherlv_0= 'interface' ( ( ruleQualifiedName ) ) otherlv_2= 'reacts to' ( ( ruleQualifiedName ) ) (otherlv_4= 'as' ( (lv_order_5_0= RULE_INT ) ) otherlv_6= '.' )? otherlv_7= 'by calling' ( ( ruleReferenceableMethodName ) ) ) ;
    public final EObject ruleReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_order_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:228:28: ( (otherlv_0= 'interface' ( ( ruleQualifiedName ) ) otherlv_2= 'reacts to' ( ( ruleQualifiedName ) ) (otherlv_4= 'as' ( (lv_order_5_0= RULE_INT ) ) otherlv_6= '.' )? otherlv_7= 'by calling' ( ( ruleReferenceableMethodName ) ) ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:229:1: (otherlv_0= 'interface' ( ( ruleQualifiedName ) ) otherlv_2= 'reacts to' ( ( ruleQualifiedName ) ) (otherlv_4= 'as' ( (lv_order_5_0= RULE_INT ) ) otherlv_6= '.' )? otherlv_7= 'by calling' ( ( ruleReferenceableMethodName ) ) )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:229:1: (otherlv_0= 'interface' ( ( ruleQualifiedName ) ) otherlv_2= 'reacts to' ( ( ruleQualifiedName ) ) (otherlv_4= 'as' ( (lv_order_5_0= RULE_INT ) ) otherlv_6= '.' )? otherlv_7= 'by calling' ( ( ruleReferenceableMethodName ) ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:229:3: otherlv_0= 'interface' ( ( ruleQualifiedName ) ) otherlv_2= 'reacts to' ( ( ruleQualifiedName ) ) (otherlv_4= 'as' ( (lv_order_5_0= RULE_INT ) ) otherlv_6= '.' )? otherlv_7= 'by calling' ( ( ruleReferenceableMethodName ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleReaction435); 

                	newLeafNode(otherlv_0, grammarAccess.getReactionAccess().getInterfaceKeyword_0());
                
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:233:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:234:1: ( ruleQualifiedName )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:234:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:235:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReactionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getReactionAccess().getInterfaceInterfaceCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleReaction458);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleReaction470); 

                	newLeafNode(otherlv_2, grammarAccess.getReactionAccess().getReactsToKeyword_2());
                
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:252:1: ( ( ruleQualifiedName ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:253:1: ( ruleQualifiedName )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:253:1: ( ruleQualifiedName )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:254:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReactionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getReactionAccess().getNotificationNotificationCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleReaction493);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:267:2: (otherlv_4= 'as' ( (lv_order_5_0= RULE_INT ) ) otherlv_6= '.' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:267:4: otherlv_4= 'as' ( (lv_order_5_0= RULE_INT ) ) otherlv_6= '.'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleReaction506); 

                        	newLeafNode(otherlv_4, grammarAccess.getReactionAccess().getAsKeyword_4_0());
                        
                    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:271:1: ( (lv_order_5_0= RULE_INT ) )
                    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:272:1: (lv_order_5_0= RULE_INT )
                    {
                    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:272:1: (lv_order_5_0= RULE_INT )
                    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:273:3: lv_order_5_0= RULE_INT
                    {
                    lv_order_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleReaction523); 

                    			newLeafNode(lv_order_5_0, grammarAccess.getReactionAccess().getOrderINTTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getReactionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"order",
                            		lv_order_5_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleReaction540); 

                        	newLeafNode(otherlv_6, grammarAccess.getReactionAccess().getFullStopKeyword_4_2());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleReaction554); 

                	newLeafNode(otherlv_7, grammarAccess.getReactionAccess().getByCallingKeyword_5());
                
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:297:1: ( ( ruleReferenceableMethodName ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:298:1: ( ruleReferenceableMethodName )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:298:1: ( ruleReferenceableMethodName )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:299:3: ruleReferenceableMethodName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReactionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getReactionAccess().getMethodMethodCrossReference_6_0()); 
            	    
            pushFollow(FOLLOW_ruleReferenceableMethodName_in_ruleReaction577);
            ruleReferenceableMethodName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleReaction"


    // $ANTLR start "entryRuleReferenceableMethodName"
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:320:1: entryRuleReferenceableMethodName returns [String current=null] : iv_ruleReferenceableMethodName= ruleReferenceableMethodName EOF ;
    public final String entryRuleReferenceableMethodName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReferenceableMethodName = null;


        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:321:2: (iv_ruleReferenceableMethodName= ruleReferenceableMethodName EOF )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:322:2: iv_ruleReferenceableMethodName= ruleReferenceableMethodName EOF
            {
             newCompositeNode(grammarAccess.getReferenceableMethodNameRule()); 
            pushFollow(FOLLOW_ruleReferenceableMethodName_in_entryRuleReferenceableMethodName614);
            iv_ruleReferenceableMethodName=ruleReferenceableMethodName();

            state._fsp--;

             current =iv_ruleReferenceableMethodName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceableMethodName625); 

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
    // $ANTLR end "entryRuleReferenceableMethodName"


    // $ANTLR start "ruleReferenceableMethodName"
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:329:1: ruleReferenceableMethodName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= ':' (this_ID_2= RULE_ID )? )* ) ;
    public final AntlrDatatypeRuleToken ruleReferenceableMethodName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:332:28: ( (this_ID_0= RULE_ID (kw= ':' (this_ID_2= RULE_ID )? )* ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:333:1: (this_ID_0= RULE_ID (kw= ':' (this_ID_2= RULE_ID )? )* )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:333:1: (this_ID_0= RULE_ID (kw= ':' (this_ID_2= RULE_ID )? )* )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:333:6: this_ID_0= RULE_ID (kw= ':' (this_ID_2= RULE_ID )? )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReferenceableMethodName665); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getReferenceableMethodNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:340:1: (kw= ':' (this_ID_2= RULE_ID )? )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:341:2: kw= ':' (this_ID_2= RULE_ID )?
            	    {
            	    kw=(Token)match(input,22,FOLLOW_22_in_ruleReferenceableMethodName684); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getReferenceableMethodNameAccess().getColonKeyword_1_0()); 
            	        
            	    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:346:1: (this_ID_2= RULE_ID )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==RULE_ID) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:346:6: this_ID_2= RULE_ID
            	            {
            	            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReferenceableMethodName700); 

            	            		current.merge(this_ID_2);
            	                
            	             
            	                newLeafNode(this_ID_2, grammarAccess.getReferenceableMethodNameAccess().getIDTerminalRuleCall_1_1()); 
            	                

            	            }
            	            break;

            	    }


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
    // $ANTLR end "ruleReferenceableMethodName"


    // $ANTLR start "entryRulePrimitive"
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:363:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:364:2: (iv_rulePrimitive= rulePrimitive EOF )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:365:2: iv_rulePrimitive= rulePrimitive EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive751);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;

             current =iv_rulePrimitive; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive761); 

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
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:372:1: rulePrimitive returns [EObject current=null] : (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:375:28: ( (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:376:1: (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:376:1: (otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:376:3: otherlv_0= 'primitive type' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_rulePrimitive798); 

                	newLeafNode(otherlv_0, grammarAccess.getPrimitiveAccess().getPrimitiveTypeKeyword_0());
                
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:380:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:381:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:381:1: (lv_name_1_0= RULE_ID )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:382:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimitive815); 

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
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:406:1: entryRuleAny returns [EObject current=null] : iv_ruleAny= ruleAny EOF ;
    public final EObject entryRuleAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAny = null;


        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:407:2: (iv_ruleAny= ruleAny EOF )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:408:2: iv_ruleAny= ruleAny EOF
            {
             newCompositeNode(grammarAccess.getAnyRule()); 
            pushFollow(FOLLOW_ruleAny_in_entryRuleAny856);
            iv_ruleAny=ruleAny();

            state._fsp--;

             current =iv_ruleAny; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAny866); 

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
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:415:1: ruleAny returns [EObject current=null] : (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAny() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:418:28: ( (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:419:1: (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:419:1: (otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:419:3: otherlv_0= 'any type' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleAny903); 

                	newLeafNode(otherlv_0, grammarAccess.getAnyAccess().getAnyTypeKeyword_0());
                
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:423:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:424:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:424:1: (lv_name_1_0= RULE_ID )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:425:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAny920); 

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
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:453:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:454:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:455:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue965);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue975); 

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
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:462:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEStringObject ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:465:28: ( ( (lv_value_0_0= ruleEStringObject ) ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:466:1: ( (lv_value_0_0= ruleEStringObject ) )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:466:1: ( (lv_value_0_0= ruleEStringObject ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:467:1: (lv_value_0_0= ruleEStringObject )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:467:1: (lv_value_0_0= ruleEStringObject )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:468:3: lv_value_0_0= ruleEStringObject
            {
             
            	        newCompositeNode(grammarAccess.getStringValueAccess().getValueEStringObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEStringObject_in_ruleStringValue1020);
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
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:492:1: entryRuleEStringObject returns [String current=null] : iv_ruleEStringObject= ruleEStringObject EOF ;
    public final String entryRuleEStringObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringObject = null;


        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:493:2: (iv_ruleEStringObject= ruleEStringObject EOF )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:494:2: iv_ruleEStringObject= ruleEStringObject EOF
            {
             newCompositeNode(grammarAccess.getEStringObjectRule()); 
            pushFollow(FOLLOW_ruleEStringObject_in_entryRuleEStringObject1056);
            iv_ruleEStringObject=ruleEStringObject();

            state._fsp--;

             current =iv_ruleEStringObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEStringObject1067); 

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
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:501:1: ruleEStringObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEStringObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:504:28: (this_STRING_0= RULE_STRING )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:505:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEStringObject1106); 

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
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:520:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:521:2: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:522:2: iv_ruleIntegerValue= ruleIntegerValue EOF
            {
             newCompositeNode(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue1150);
            iv_ruleIntegerValue=ruleIntegerValue();

            state._fsp--;

             current =iv_ruleIntegerValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValue1160); 

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
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:529:1: ruleIntegerValue returns [EObject current=null] : ( (lv_value_0_0= ruleEIntegerObject ) ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:532:28: ( ( (lv_value_0_0= ruleEIntegerObject ) ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:533:1: ( (lv_value_0_0= ruleEIntegerObject ) )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:533:1: ( (lv_value_0_0= ruleEIntegerObject ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:534:1: (lv_value_0_0= ruleEIntegerObject )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:534:1: (lv_value_0_0= ruleEIntegerObject )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:535:3: lv_value_0_0= ruleEIntegerObject
            {
             
            	        newCompositeNode(grammarAccess.getIntegerValueAccess().getValueEIntegerObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEIntegerObject_in_ruleIntegerValue1205);
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
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:559:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:560:2: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:561:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
            {
             newCompositeNode(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject1241);
            iv_ruleEIntegerObject=ruleEIntegerObject();

            state._fsp--;

             current =iv_ruleEIntegerObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEIntegerObject1252); 

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
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:568:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:571:28: (this_INT_0= RULE_INT )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:572:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEIntegerObject1291); 

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
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:587:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:588:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:589:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
             newCompositeNode(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue1335);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;

             current =iv_ruleFloatValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue1345); 

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
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:596:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= ruleEFloatObject ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:599:28: ( ( (lv_value_0_0= ruleEFloatObject ) ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:600:1: ( (lv_value_0_0= ruleEFloatObject ) )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:600:1: ( (lv_value_0_0= ruleEFloatObject ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:601:1: (lv_value_0_0= ruleEFloatObject )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:601:1: (lv_value_0_0= ruleEFloatObject )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:602:3: lv_value_0_0= ruleEFloatObject
            {
             
            	        newCompositeNode(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEFloatObject_in_ruleFloatValue1390);
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
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:626:1: entryRuleEFloatObject returns [String current=null] : iv_ruleEFloatObject= ruleEFloatObject EOF ;
    public final String entryRuleEFloatObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloatObject = null;


        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:627:2: (iv_ruleEFloatObject= ruleEFloatObject EOF )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:628:2: iv_ruleEFloatObject= ruleEFloatObject EOF
            {
             newCompositeNode(grammarAccess.getEFloatObjectRule()); 
            pushFollow(FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject1426);
            iv_ruleEFloatObject=ruleEFloatObject();

            state._fsp--;

             current =iv_ruleEFloatObject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEFloatObject1437); 

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
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:635:1: ruleEFloatObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEFloatObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:638:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:639:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:639:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:639:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:639:2: (kw= '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:640:2: kw= '-'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleEFloatObject1476); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:645:3: (this_INT_1= RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:645:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEFloatObject1494); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,20,FOLLOW_20_in_ruleEFloatObject1514); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEFloatObject1529); 

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
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:673:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:674:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:675:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1575);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1586); 

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
    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:682:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:685:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:686:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:686:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:686:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1626); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:693:1: (kw= '.' this_ID_2= RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.dubmas.modulob.behaviour.dsl/src-gen/de/dubmas/modulob/parser/antlr/internal/InternalBehaviourDsl.g:694:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,20,FOLLOW_20_in_ruleQualifiedName1645); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1660); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop8;
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


 

    public static final BitSet FOLLOW_ruleBehaviouralModel_in_entryRuleBehaviouralModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBehaviouralModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleBehaviouralModel122 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBehaviouralModel145 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleBehaviouralModel157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBehaviouralModel174 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleBehaviour_in_ruleBehaviouralModel200 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleBehaviour_in_entryRuleBehaviour237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBehaviour247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleBehaviour284 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBehaviour301 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBehaviour318 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_ruleReaction_in_ruleBehaviour339 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleBehaviour352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReaction_in_entryRuleReaction388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReaction398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleReaction435 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleReaction458 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleReaction470 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleReaction493 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_19_in_ruleReaction506 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleReaction523 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleReaction540 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleReaction554 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleReferenceableMethodName_in_ruleReaction577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceableMethodName_in_entryRuleReferenceableMethodName614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceableMethodName625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReferenceableMethodName665 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleReferenceableMethodName684 = new BitSet(new long[]{0x0000000000400022L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReferenceableMethodName700 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive751 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulePrimitive798 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimitive815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAny_in_entryRuleAny856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAny866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleAny903 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAny920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_ruleStringValue1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStringObject_in_entryRuleEStringObject1056 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEStringObject1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEStringObject1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue1150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_ruleIntegerValue1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject1241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEIntegerObject1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEIntegerObject1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue1335 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_ruleFloatValue1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject1426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEFloatObject1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleEFloatObject1476 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatObject1494 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEFloatObject1514 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatObject1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1626 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleQualifiedName1645 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1660 = new BitSet(new long[]{0x0000000000100002L});

}