package org.eclipse.xtext.ui.contentassist.antlr.internal; 

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
import org.eclipse.xtext.services.XtextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

/**
 * @since 2.9
 */
public class InternalXtextParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'#'", "'@init'", "'@after'", "'?'", "'*'", "'+'", "'='", "'+='", "'false'", "'true'", "'?='", "'grammar'", "'with'", "','", "'('", "')'", "'.'", "'generate'", "'as'", "'import'", "'my'", "';'", "'returns'", "'{'", "'}'", "'<'", "'>'", "'::'", "'|'", "'&'", "'current'", "'!'", "'['", "']'", "'terminal'", "'->'", "'EOF'", "'..'", "'enum'", "'hidden'", "'fragment'", "'=>'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalXtextParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXtextParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXtextParser.tokenNames; }
    public String getGrammarFileName() { return "InternalXtext.g"; }


     
     	private XtextGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(XtextGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleGrammar"
    // InternalXtext.g:60:1: entryRuleGrammar : ruleGrammar EOF ;
    public final void entryRuleGrammar() throws RecognitionException {
        try {
            // InternalXtext.g:61:1: ( ruleGrammar EOF )
            // InternalXtext.g:62:1: ruleGrammar EOF
            {
             before(grammarAccess.getGrammarRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGrammar();

            state._fsp--;

             after(grammarAccess.getGrammarRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleGrammar"


    // $ANTLR start "ruleGrammar"
    // InternalXtext.g:69:1: ruleGrammar : ( ( rule__Grammar__Group__0 ) ) ;
    public final void ruleGrammar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:73:2: ( ( ( rule__Grammar__Group__0 ) ) )
            // InternalXtext.g:74:1: ( ( rule__Grammar__Group__0 ) )
            {
            // InternalXtext.g:74:1: ( ( rule__Grammar__Group__0 ) )
            // InternalXtext.g:75:1: ( rule__Grammar__Group__0 )
            {
             before(grammarAccess.getGrammarAccess().getGroup()); 
            // InternalXtext.g:76:1: ( rule__Grammar__Group__0 )
            // InternalXtext.g:76:2: rule__Grammar__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGrammarAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGrammar"


    // $ANTLR start "entryRuleGrammarID"
    // InternalXtext.g:88:1: entryRuleGrammarID : ruleGrammarID EOF ;
    public final void entryRuleGrammarID() throws RecognitionException {
        try {
            // InternalXtext.g:89:1: ( ruleGrammarID EOF )
            // InternalXtext.g:90:1: ruleGrammarID EOF
            {
             before(grammarAccess.getGrammarIDRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGrammarID();

            state._fsp--;

             after(grammarAccess.getGrammarIDRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleGrammarID"


    // $ANTLR start "ruleGrammarID"
    // InternalXtext.g:97:1: ruleGrammarID : ( ( rule__GrammarID__Group__0 ) ) ;
    public final void ruleGrammarID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:101:2: ( ( ( rule__GrammarID__Group__0 ) ) )
            // InternalXtext.g:102:1: ( ( rule__GrammarID__Group__0 ) )
            {
            // InternalXtext.g:102:1: ( ( rule__GrammarID__Group__0 ) )
            // InternalXtext.g:103:1: ( rule__GrammarID__Group__0 )
            {
             before(grammarAccess.getGrammarIDAccess().getGroup()); 
            // InternalXtext.g:104:1: ( rule__GrammarID__Group__0 )
            // InternalXtext.g:104:2: rule__GrammarID__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GrammarID__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGrammarIDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGrammarID"


    // $ANTLR start "entryRuleAbstractRule"
    // InternalXtext.g:116:1: entryRuleAbstractRule : ruleAbstractRule EOF ;
    public final void entryRuleAbstractRule() throws RecognitionException {
        try {
            // InternalXtext.g:117:1: ( ruleAbstractRule EOF )
            // InternalXtext.g:118:1: ruleAbstractRule EOF
            {
             before(grammarAccess.getAbstractRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAbstractRule();

            state._fsp--;

             after(grammarAccess.getAbstractRuleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractRule"


    // $ANTLR start "ruleAbstractRule"
    // InternalXtext.g:125:1: ruleAbstractRule : ( ( rule__AbstractRule__Alternatives ) ) ;
    public final void ruleAbstractRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:129:2: ( ( ( rule__AbstractRule__Alternatives ) ) )
            // InternalXtext.g:130:1: ( ( rule__AbstractRule__Alternatives ) )
            {
            // InternalXtext.g:130:1: ( ( rule__AbstractRule__Alternatives ) )
            // InternalXtext.g:131:1: ( rule__AbstractRule__Alternatives )
            {
             before(grammarAccess.getAbstractRuleAccess().getAlternatives()); 
            // InternalXtext.g:132:1: ( rule__AbstractRule__Alternatives )
            // InternalXtext.g:132:2: rule__AbstractRule__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AbstractRule__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractRuleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractRule"


    // $ANTLR start "entryRuleAbstractMetamodelDeclaration"
    // InternalXtext.g:144:1: entryRuleAbstractMetamodelDeclaration : ruleAbstractMetamodelDeclaration EOF ;
    public final void entryRuleAbstractMetamodelDeclaration() throws RecognitionException {
        try {
            // InternalXtext.g:145:1: ( ruleAbstractMetamodelDeclaration EOF )
            // InternalXtext.g:146:1: ruleAbstractMetamodelDeclaration EOF
            {
             before(grammarAccess.getAbstractMetamodelDeclarationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAbstractMetamodelDeclaration();

            state._fsp--;

             after(grammarAccess.getAbstractMetamodelDeclarationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractMetamodelDeclaration"


    // $ANTLR start "ruleAbstractMetamodelDeclaration"
    // InternalXtext.g:153:1: ruleAbstractMetamodelDeclaration : ( ( rule__AbstractMetamodelDeclaration__Alternatives ) ) ;
    public final void ruleAbstractMetamodelDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:157:2: ( ( ( rule__AbstractMetamodelDeclaration__Alternatives ) ) )
            // InternalXtext.g:158:1: ( ( rule__AbstractMetamodelDeclaration__Alternatives ) )
            {
            // InternalXtext.g:158:1: ( ( rule__AbstractMetamodelDeclaration__Alternatives ) )
            // InternalXtext.g:159:1: ( rule__AbstractMetamodelDeclaration__Alternatives )
            {
             before(grammarAccess.getAbstractMetamodelDeclarationAccess().getAlternatives()); 
            // InternalXtext.g:160:1: ( rule__AbstractMetamodelDeclaration__Alternatives )
            // InternalXtext.g:160:2: rule__AbstractMetamodelDeclaration__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AbstractMetamodelDeclaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractMetamodelDeclarationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractMetamodelDeclaration"


    // $ANTLR start "entryRuleGeneratedMetamodel"
    // InternalXtext.g:172:1: entryRuleGeneratedMetamodel : ruleGeneratedMetamodel EOF ;
    public final void entryRuleGeneratedMetamodel() throws RecognitionException {
        try {
            // InternalXtext.g:173:1: ( ruleGeneratedMetamodel EOF )
            // InternalXtext.g:174:1: ruleGeneratedMetamodel EOF
            {
             before(grammarAccess.getGeneratedMetamodelRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGeneratedMetamodel();

            state._fsp--;

             after(grammarAccess.getGeneratedMetamodelRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleGeneratedMetamodel"


    // $ANTLR start "ruleGeneratedMetamodel"
    // InternalXtext.g:181:1: ruleGeneratedMetamodel : ( ( rule__GeneratedMetamodel__Group__0 ) ) ;
    public final void ruleGeneratedMetamodel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:185:2: ( ( ( rule__GeneratedMetamodel__Group__0 ) ) )
            // InternalXtext.g:186:1: ( ( rule__GeneratedMetamodel__Group__0 ) )
            {
            // InternalXtext.g:186:1: ( ( rule__GeneratedMetamodel__Group__0 ) )
            // InternalXtext.g:187:1: ( rule__GeneratedMetamodel__Group__0 )
            {
             before(grammarAccess.getGeneratedMetamodelAccess().getGroup()); 
            // InternalXtext.g:188:1: ( rule__GeneratedMetamodel__Group__0 )
            // InternalXtext.g:188:2: rule__GeneratedMetamodel__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GeneratedMetamodel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGeneratedMetamodelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeneratedMetamodel"


    // $ANTLR start "entryRuleReferencedMetamodel"
    // InternalXtext.g:200:1: entryRuleReferencedMetamodel : ruleReferencedMetamodel EOF ;
    public final void entryRuleReferencedMetamodel() throws RecognitionException {
        try {
            // InternalXtext.g:201:1: ( ruleReferencedMetamodel EOF )
            // InternalXtext.g:202:1: ruleReferencedMetamodel EOF
            {
             before(grammarAccess.getReferencedMetamodelRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleReferencedMetamodel();

            state._fsp--;

             after(grammarAccess.getReferencedMetamodelRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleReferencedMetamodel"


    // $ANTLR start "ruleReferencedMetamodel"
    // InternalXtext.g:209:1: ruleReferencedMetamodel : ( ( rule__ReferencedMetamodel__Group__0 ) ) ;
    public final void ruleReferencedMetamodel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:213:2: ( ( ( rule__ReferencedMetamodel__Group__0 ) ) )
            // InternalXtext.g:214:1: ( ( rule__ReferencedMetamodel__Group__0 ) )
            {
            // InternalXtext.g:214:1: ( ( rule__ReferencedMetamodel__Group__0 ) )
            // InternalXtext.g:215:1: ( rule__ReferencedMetamodel__Group__0 )
            {
             before(grammarAccess.getReferencedMetamodelAccess().getGroup()); 
            // InternalXtext.g:216:1: ( rule__ReferencedMetamodel__Group__0 )
            // InternalXtext.g:216:2: rule__ReferencedMetamodel__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReferencedMetamodel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferencedMetamodelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReferencedMetamodel"


    // $ANTLR start "entryRuleParserRule"
    // InternalXtext.g:228:1: entryRuleParserRule : ruleParserRule EOF ;
    public final void entryRuleParserRule() throws RecognitionException {
        try {
            // InternalXtext.g:229:1: ( ruleParserRule EOF )
            // InternalXtext.g:230:1: ruleParserRule EOF
            {
             before(grammarAccess.getParserRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParserRule();

            state._fsp--;

             after(grammarAccess.getParserRuleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleParserRule"


    // $ANTLR start "ruleParserRule"
    // InternalXtext.g:237:1: ruleParserRule : ( ( rule__ParserRule__Group__0 ) ) ;
    public final void ruleParserRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:241:2: ( ( ( rule__ParserRule__Group__0 ) ) )
            // InternalXtext.g:242:1: ( ( rule__ParserRule__Group__0 ) )
            {
            // InternalXtext.g:242:1: ( ( rule__ParserRule__Group__0 ) )
            // InternalXtext.g:243:1: ( rule__ParserRule__Group__0 )
            {
             before(grammarAccess.getParserRuleAccess().getGroup()); 
            // InternalXtext.g:244:1: ( rule__ParserRule__Group__0 )
            // InternalXtext.g:244:2: rule__ParserRule__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParserRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParserRule"


    // $ANTLR start "entryRuleMyInitAfterActions"
    // InternalXtext.g:256:1: entryRuleMyInitAfterActions : ruleMyInitAfterActions EOF ;
    public final void entryRuleMyInitAfterActions() throws RecognitionException {
        try {
            // InternalXtext.g:257:1: ( ruleMyInitAfterActions EOF )
            // InternalXtext.g:258:1: ruleMyInitAfterActions EOF
            {
             before(grammarAccess.getMyInitAfterActionsRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMyInitAfterActions();

            state._fsp--;

             after(grammarAccess.getMyInitAfterActionsRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleMyInitAfterActions"


    // $ANTLR start "ruleMyInitAfterActions"
    // InternalXtext.g:265:1: ruleMyInitAfterActions : ( ( rule__MyInitAfterActions__Group__0 ) ) ;
    public final void ruleMyInitAfterActions() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:269:2: ( ( ( rule__MyInitAfterActions__Group__0 ) ) )
            // InternalXtext.g:270:1: ( ( rule__MyInitAfterActions__Group__0 ) )
            {
            // InternalXtext.g:270:1: ( ( rule__MyInitAfterActions__Group__0 ) )
            // InternalXtext.g:271:1: ( rule__MyInitAfterActions__Group__0 )
            {
             before(grammarAccess.getMyInitAfterActionsAccess().getGroup()); 
            // InternalXtext.g:272:1: ( rule__MyInitAfterActions__Group__0 )
            // InternalXtext.g:272:2: rule__MyInitAfterActions__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MyInitAfterActions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMyInitAfterActionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMyInitAfterActions"


    // $ANTLR start "ruleRuleNameAndParams"
    // InternalXtext.g:285:1: ruleRuleNameAndParams : ( ( rule__RuleNameAndParams__Group__0 ) ) ;
    public final void ruleRuleNameAndParams() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:289:2: ( ( ( rule__RuleNameAndParams__Group__0 ) ) )
            // InternalXtext.g:290:1: ( ( rule__RuleNameAndParams__Group__0 ) )
            {
            // InternalXtext.g:290:1: ( ( rule__RuleNameAndParams__Group__0 ) )
            // InternalXtext.g:291:1: ( rule__RuleNameAndParams__Group__0 )
            {
             before(grammarAccess.getRuleNameAndParamsAccess().getGroup()); 
            // InternalXtext.g:292:1: ( rule__RuleNameAndParams__Group__0 )
            // InternalXtext.g:292:2: rule__RuleNameAndParams__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleNameAndParams__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleNameAndParamsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleNameAndParams"


    // $ANTLR start "entryRuleParameter"
    // InternalXtext.g:304:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalXtext.g:305:1: ( ruleParameter EOF )
            // InternalXtext.g:306:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXtext.g:313:1: ruleParameter : ( ( rule__Parameter__NameAssignment ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:317:2: ( ( ( rule__Parameter__NameAssignment ) ) )
            // InternalXtext.g:318:1: ( ( rule__Parameter__NameAssignment ) )
            {
            // InternalXtext.g:318:1: ( ( rule__Parameter__NameAssignment ) )
            // InternalXtext.g:319:1: ( rule__Parameter__NameAssignment )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment()); 
            // InternalXtext.g:320:1: ( rule__Parameter__NameAssignment )
            // InternalXtext.g:320:2: rule__Parameter__NameAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parameter__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment()); 

            }


            }

        }
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
    // InternalXtext.g:332:1: entryRuleTypeRef : ruleTypeRef EOF ;
    public final void entryRuleTypeRef() throws RecognitionException {
        try {
            // InternalXtext.g:333:1: ( ruleTypeRef EOF )
            // InternalXtext.g:334:1: ruleTypeRef EOF
            {
             before(grammarAccess.getTypeRefRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getTypeRefRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXtext.g:341:1: ruleTypeRef : ( ( rule__TypeRef__Group__0 ) ) ;
    public final void ruleTypeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:345:2: ( ( ( rule__TypeRef__Group__0 ) ) )
            // InternalXtext.g:346:1: ( ( rule__TypeRef__Group__0 ) )
            {
            // InternalXtext.g:346:1: ( ( rule__TypeRef__Group__0 ) )
            // InternalXtext.g:347:1: ( rule__TypeRef__Group__0 )
            {
             before(grammarAccess.getTypeRefAccess().getGroup()); 
            // InternalXtext.g:348:1: ( rule__TypeRef__Group__0 )
            // InternalXtext.g:348:2: rule__TypeRef__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
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


    // $ANTLR start "entryRuleAlternatives"
    // InternalXtext.g:360:1: entryRuleAlternatives : ruleAlternatives EOF ;
    public final void entryRuleAlternatives() throws RecognitionException {
        try {
            // InternalXtext.g:361:1: ( ruleAlternatives EOF )
            // InternalXtext.g:362:1: ruleAlternatives EOF
            {
             before(grammarAccess.getAlternativesRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAlternatives();

            state._fsp--;

             after(grammarAccess.getAlternativesRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAlternatives"


    // $ANTLR start "ruleAlternatives"
    // InternalXtext.g:369:1: ruleAlternatives : ( ( rule__Alternatives__Group__0 ) ) ;
    public final void ruleAlternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:373:2: ( ( ( rule__Alternatives__Group__0 ) ) )
            // InternalXtext.g:374:1: ( ( rule__Alternatives__Group__0 ) )
            {
            // InternalXtext.g:374:1: ( ( rule__Alternatives__Group__0 ) )
            // InternalXtext.g:375:1: ( rule__Alternatives__Group__0 )
            {
             before(grammarAccess.getAlternativesAccess().getGroup()); 
            // InternalXtext.g:376:1: ( rule__Alternatives__Group__0 )
            // InternalXtext.g:376:2: rule__Alternatives__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Alternatives__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlternativesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlternatives"


    // $ANTLR start "entryRuleConditionalBranch"
    // InternalXtext.g:388:1: entryRuleConditionalBranch : ruleConditionalBranch EOF ;
    public final void entryRuleConditionalBranch() throws RecognitionException {
        try {
            // InternalXtext.g:389:1: ( ruleConditionalBranch EOF )
            // InternalXtext.g:390:1: ruleConditionalBranch EOF
            {
             before(grammarAccess.getConditionalBranchRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleConditionalBranch();

            state._fsp--;

             after(grammarAccess.getConditionalBranchRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleConditionalBranch"


    // $ANTLR start "ruleConditionalBranch"
    // InternalXtext.g:397:1: ruleConditionalBranch : ( ( rule__ConditionalBranch__Alternatives ) ) ;
    public final void ruleConditionalBranch() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:401:2: ( ( ( rule__ConditionalBranch__Alternatives ) ) )
            // InternalXtext.g:402:1: ( ( rule__ConditionalBranch__Alternatives ) )
            {
            // InternalXtext.g:402:1: ( ( rule__ConditionalBranch__Alternatives ) )
            // InternalXtext.g:403:1: ( rule__ConditionalBranch__Alternatives )
            {
             before(grammarAccess.getConditionalBranchAccess().getAlternatives()); 
            // InternalXtext.g:404:1: ( rule__ConditionalBranch__Alternatives )
            // InternalXtext.g:404:2: rule__ConditionalBranch__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConditionalBranch__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionalBranchAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionalBranch"


    // $ANTLR start "entryRuleUnorderedGroup"
    // InternalXtext.g:416:1: entryRuleUnorderedGroup : ruleUnorderedGroup EOF ;
    public final void entryRuleUnorderedGroup() throws RecognitionException {
        try {
            // InternalXtext.g:417:1: ( ruleUnorderedGroup EOF )
            // InternalXtext.g:418:1: ruleUnorderedGroup EOF
            {
             before(grammarAccess.getUnorderedGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleUnorderedGroup();

            state._fsp--;

             after(grammarAccess.getUnorderedGroupRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleUnorderedGroup"


    // $ANTLR start "ruleUnorderedGroup"
    // InternalXtext.g:425:1: ruleUnorderedGroup : ( ( rule__UnorderedGroup__Group__0 ) ) ;
    public final void ruleUnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:429:2: ( ( ( rule__UnorderedGroup__Group__0 ) ) )
            // InternalXtext.g:430:1: ( ( rule__UnorderedGroup__Group__0 ) )
            {
            // InternalXtext.g:430:1: ( ( rule__UnorderedGroup__Group__0 ) )
            // InternalXtext.g:431:1: ( rule__UnorderedGroup__Group__0 )
            {
             before(grammarAccess.getUnorderedGroupAccess().getGroup()); 
            // InternalXtext.g:432:1: ( rule__UnorderedGroup__Group__0 )
            // InternalXtext.g:432:2: rule__UnorderedGroup__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnorderedGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnorderedGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnorderedGroup"


    // $ANTLR start "entryRuleGroup"
    // InternalXtext.g:444:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // InternalXtext.g:445:1: ( ruleGroup EOF )
            // InternalXtext.g:446:1: ruleGroup EOF
            {
             before(grammarAccess.getGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getGroupRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // InternalXtext.g:453:1: ruleGroup : ( ( rule__Group__Group__0 ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:457:2: ( ( ( rule__Group__Group__0 ) ) )
            // InternalXtext.g:458:1: ( ( rule__Group__Group__0 ) )
            {
            // InternalXtext.g:458:1: ( ( rule__Group__Group__0 ) )
            // InternalXtext.g:459:1: ( rule__Group__Group__0 )
            {
             before(grammarAccess.getGroupAccess().getGroup()); 
            // InternalXtext.g:460:1: ( rule__Group__Group__0 )
            // InternalXtext.g:460:2: rule__Group__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Group__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleAbstractToken"
    // InternalXtext.g:472:1: entryRuleAbstractToken : ruleAbstractToken EOF ;
    public final void entryRuleAbstractToken() throws RecognitionException {
        try {
            // InternalXtext.g:473:1: ( ruleAbstractToken EOF )
            // InternalXtext.g:474:1: ruleAbstractToken EOF
            {
             before(grammarAccess.getAbstractTokenRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAbstractToken();

            state._fsp--;

             after(grammarAccess.getAbstractTokenRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractToken"


    // $ANTLR start "ruleAbstractToken"
    // InternalXtext.g:481:1: ruleAbstractToken : ( ( rule__AbstractToken__Alternatives ) ) ;
    public final void ruleAbstractToken() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:485:2: ( ( ( rule__AbstractToken__Alternatives ) ) )
            // InternalXtext.g:486:1: ( ( rule__AbstractToken__Alternatives ) )
            {
            // InternalXtext.g:486:1: ( ( rule__AbstractToken__Alternatives ) )
            // InternalXtext.g:487:1: ( rule__AbstractToken__Alternatives )
            {
             before(grammarAccess.getAbstractTokenAccess().getAlternatives()); 
            // InternalXtext.g:488:1: ( rule__AbstractToken__Alternatives )
            // InternalXtext.g:488:2: rule__AbstractToken__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AbstractToken__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractTokenAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractToken"


    // $ANTLR start "entryRuleAbstractTokenWithCardinality"
    // InternalXtext.g:500:1: entryRuleAbstractTokenWithCardinality : ruleAbstractTokenWithCardinality EOF ;
    public final void entryRuleAbstractTokenWithCardinality() throws RecognitionException {
        try {
            // InternalXtext.g:501:1: ( ruleAbstractTokenWithCardinality EOF )
            // InternalXtext.g:502:1: ruleAbstractTokenWithCardinality EOF
            {
             before(grammarAccess.getAbstractTokenWithCardinalityRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAbstractTokenWithCardinality();

            state._fsp--;

             after(grammarAccess.getAbstractTokenWithCardinalityRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractTokenWithCardinality"


    // $ANTLR start "ruleAbstractTokenWithCardinality"
    // InternalXtext.g:509:1: ruleAbstractTokenWithCardinality : ( ( rule__AbstractTokenWithCardinality__Group__0 ) ) ;
    public final void ruleAbstractTokenWithCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:513:2: ( ( ( rule__AbstractTokenWithCardinality__Group__0 ) ) )
            // InternalXtext.g:514:1: ( ( rule__AbstractTokenWithCardinality__Group__0 ) )
            {
            // InternalXtext.g:514:1: ( ( rule__AbstractTokenWithCardinality__Group__0 ) )
            // InternalXtext.g:515:1: ( rule__AbstractTokenWithCardinality__Group__0 )
            {
             before(grammarAccess.getAbstractTokenWithCardinalityAccess().getGroup()); 
            // InternalXtext.g:516:1: ( rule__AbstractTokenWithCardinality__Group__0 )
            // InternalXtext.g:516:2: rule__AbstractTokenWithCardinality__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AbstractTokenWithCardinality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAbstractTokenWithCardinalityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractTokenWithCardinality"


    // $ANTLR start "entryRuleAction"
    // InternalXtext.g:528:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalXtext.g:529:1: ( ruleAction EOF )
            // InternalXtext.g:530:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalXtext.g:537:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:541:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalXtext.g:542:1: ( ( rule__Action__Group__0 ) )
            {
            // InternalXtext.g:542:1: ( ( rule__Action__Group__0 ) )
            // InternalXtext.g:543:1: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalXtext.g:544:1: ( rule__Action__Group__0 )
            // InternalXtext.g:544:2: rule__Action__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleAbstractTerminal"
    // InternalXtext.g:556:1: entryRuleAbstractTerminal : ruleAbstractTerminal EOF ;
    public final void entryRuleAbstractTerminal() throws RecognitionException {
        try {
            // InternalXtext.g:557:1: ( ruleAbstractTerminal EOF )
            // InternalXtext.g:558:1: ruleAbstractTerminal EOF
            {
             before(grammarAccess.getAbstractTerminalRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAbstractTerminal();

            state._fsp--;

             after(grammarAccess.getAbstractTerminalRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractTerminal"


    // $ANTLR start "ruleAbstractTerminal"
    // InternalXtext.g:565:1: ruleAbstractTerminal : ( ( rule__AbstractTerminal__Alternatives ) ) ;
    public final void ruleAbstractTerminal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:569:2: ( ( ( rule__AbstractTerminal__Alternatives ) ) )
            // InternalXtext.g:570:1: ( ( rule__AbstractTerminal__Alternatives ) )
            {
            // InternalXtext.g:570:1: ( ( rule__AbstractTerminal__Alternatives ) )
            // InternalXtext.g:571:1: ( rule__AbstractTerminal__Alternatives )
            {
             before(grammarAccess.getAbstractTerminalAccess().getAlternatives()); 
            // InternalXtext.g:572:1: ( rule__AbstractTerminal__Alternatives )
            // InternalXtext.g:572:2: rule__AbstractTerminal__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AbstractTerminal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractTerminalAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractTerminal"


    // $ANTLR start "entryRuleKeyword"
    // InternalXtext.g:584:1: entryRuleKeyword : ruleKeyword EOF ;
    public final void entryRuleKeyword() throws RecognitionException {
        try {
            // InternalXtext.g:585:1: ( ruleKeyword EOF )
            // InternalXtext.g:586:1: ruleKeyword EOF
            {
             before(grammarAccess.getKeywordRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleKeyword();

            state._fsp--;

             after(grammarAccess.getKeywordRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleKeyword"


    // $ANTLR start "ruleKeyword"
    // InternalXtext.g:593:1: ruleKeyword : ( ( rule__Keyword__ValueAssignment ) ) ;
    public final void ruleKeyword() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:597:2: ( ( ( rule__Keyword__ValueAssignment ) ) )
            // InternalXtext.g:598:1: ( ( rule__Keyword__ValueAssignment ) )
            {
            // InternalXtext.g:598:1: ( ( rule__Keyword__ValueAssignment ) )
            // InternalXtext.g:599:1: ( rule__Keyword__ValueAssignment )
            {
             before(grammarAccess.getKeywordAccess().getValueAssignment()); 
            // InternalXtext.g:600:1: ( rule__Keyword__ValueAssignment )
            // InternalXtext.g:600:2: rule__Keyword__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Keyword__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getKeywordAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKeyword"


    // $ANTLR start "entryRuleRuleCall"
    // InternalXtext.g:612:1: entryRuleRuleCall : ruleRuleCall EOF ;
    public final void entryRuleRuleCall() throws RecognitionException {
        try {
            // InternalXtext.g:613:1: ( ruleRuleCall EOF )
            // InternalXtext.g:614:1: ruleRuleCall EOF
            {
             before(grammarAccess.getRuleCallRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleRuleCall();

            state._fsp--;

             after(grammarAccess.getRuleCallRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleRuleCall"


    // $ANTLR start "ruleRuleCall"
    // InternalXtext.g:621:1: ruleRuleCall : ( ( rule__RuleCall__Group__0 ) ) ;
    public final void ruleRuleCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:625:2: ( ( ( rule__RuleCall__Group__0 ) ) )
            // InternalXtext.g:626:1: ( ( rule__RuleCall__Group__0 ) )
            {
            // InternalXtext.g:626:1: ( ( rule__RuleCall__Group__0 ) )
            // InternalXtext.g:627:1: ( rule__RuleCall__Group__0 )
            {
             before(grammarAccess.getRuleCallAccess().getGroup()); 
            // InternalXtext.g:628:1: ( rule__RuleCall__Group__0 )
            // InternalXtext.g:628:2: rule__RuleCall__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleCall"


    // $ANTLR start "entryRuleNamedArgument"
    // InternalXtext.g:640:1: entryRuleNamedArgument : ruleNamedArgument EOF ;
    public final void entryRuleNamedArgument() throws RecognitionException {
        try {
            // InternalXtext.g:641:1: ( ruleNamedArgument EOF )
            // InternalXtext.g:642:1: ruleNamedArgument EOF
            {
             before(grammarAccess.getNamedArgumentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNamedArgument();

            state._fsp--;

             after(grammarAccess.getNamedArgumentRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleNamedArgument"


    // $ANTLR start "ruleNamedArgument"
    // InternalXtext.g:649:1: ruleNamedArgument : ( ( rule__NamedArgument__Group__0 ) ) ;
    public final void ruleNamedArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:653:2: ( ( ( rule__NamedArgument__Group__0 ) ) )
            // InternalXtext.g:654:1: ( ( rule__NamedArgument__Group__0 ) )
            {
            // InternalXtext.g:654:1: ( ( rule__NamedArgument__Group__0 ) )
            // InternalXtext.g:655:1: ( rule__NamedArgument__Group__0 )
            {
             before(grammarAccess.getNamedArgumentAccess().getGroup()); 
            // InternalXtext.g:656:1: ( rule__NamedArgument__Group__0 )
            // InternalXtext.g:656:2: rule__NamedArgument__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NamedArgument__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamedArgumentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamedArgument"


    // $ANTLR start "entryRuleLiteralCondition"
    // InternalXtext.g:668:1: entryRuleLiteralCondition : ruleLiteralCondition EOF ;
    public final void entryRuleLiteralCondition() throws RecognitionException {
        try {
            // InternalXtext.g:669:1: ( ruleLiteralCondition EOF )
            // InternalXtext.g:670:1: ruleLiteralCondition EOF
            {
             before(grammarAccess.getLiteralConditionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleLiteralCondition();

            state._fsp--;

             after(grammarAccess.getLiteralConditionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleLiteralCondition"


    // $ANTLR start "ruleLiteralCondition"
    // InternalXtext.g:677:1: ruleLiteralCondition : ( ( rule__LiteralCondition__Group__0 ) ) ;
    public final void ruleLiteralCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:681:2: ( ( ( rule__LiteralCondition__Group__0 ) ) )
            // InternalXtext.g:682:1: ( ( rule__LiteralCondition__Group__0 ) )
            {
            // InternalXtext.g:682:1: ( ( rule__LiteralCondition__Group__0 ) )
            // InternalXtext.g:683:1: ( rule__LiteralCondition__Group__0 )
            {
             before(grammarAccess.getLiteralConditionAccess().getGroup()); 
            // InternalXtext.g:684:1: ( rule__LiteralCondition__Group__0 )
            // InternalXtext.g:684:2: rule__LiteralCondition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLiteralConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteralCondition"


    // $ANTLR start "entryRuleDisjunction"
    // InternalXtext.g:696:1: entryRuleDisjunction : ruleDisjunction EOF ;
    public final void entryRuleDisjunction() throws RecognitionException {
        try {
            // InternalXtext.g:697:1: ( ruleDisjunction EOF )
            // InternalXtext.g:698:1: ruleDisjunction EOF
            {
             before(grammarAccess.getDisjunctionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDisjunction();

            state._fsp--;

             after(grammarAccess.getDisjunctionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleDisjunction"


    // $ANTLR start "ruleDisjunction"
    // InternalXtext.g:705:1: ruleDisjunction : ( ( rule__Disjunction__Group__0 ) ) ;
    public final void ruleDisjunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:709:2: ( ( ( rule__Disjunction__Group__0 ) ) )
            // InternalXtext.g:710:1: ( ( rule__Disjunction__Group__0 ) )
            {
            // InternalXtext.g:710:1: ( ( rule__Disjunction__Group__0 ) )
            // InternalXtext.g:711:1: ( rule__Disjunction__Group__0 )
            {
             before(grammarAccess.getDisjunctionAccess().getGroup()); 
            // InternalXtext.g:712:1: ( rule__Disjunction__Group__0 )
            // InternalXtext.g:712:2: rule__Disjunction__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Disjunction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDisjunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDisjunction"


    // $ANTLR start "entryRuleConjunction"
    // InternalXtext.g:724:1: entryRuleConjunction : ruleConjunction EOF ;
    public final void entryRuleConjunction() throws RecognitionException {
        try {
            // InternalXtext.g:725:1: ( ruleConjunction EOF )
            // InternalXtext.g:726:1: ruleConjunction EOF
            {
             before(grammarAccess.getConjunctionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleConjunction();

            state._fsp--;

             after(grammarAccess.getConjunctionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleConjunction"


    // $ANTLR start "ruleConjunction"
    // InternalXtext.g:733:1: ruleConjunction : ( ( rule__Conjunction__Group__0 ) ) ;
    public final void ruleConjunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:737:2: ( ( ( rule__Conjunction__Group__0 ) ) )
            // InternalXtext.g:738:1: ( ( rule__Conjunction__Group__0 ) )
            {
            // InternalXtext.g:738:1: ( ( rule__Conjunction__Group__0 ) )
            // InternalXtext.g:739:1: ( rule__Conjunction__Group__0 )
            {
             before(grammarAccess.getConjunctionAccess().getGroup()); 
            // InternalXtext.g:740:1: ( rule__Conjunction__Group__0 )
            // InternalXtext.g:740:2: rule__Conjunction__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Conjunction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConjunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConjunction"


    // $ANTLR start "entryRuleNegation"
    // InternalXtext.g:752:1: entryRuleNegation : ruleNegation EOF ;
    public final void entryRuleNegation() throws RecognitionException {
        try {
            // InternalXtext.g:753:1: ( ruleNegation EOF )
            // InternalXtext.g:754:1: ruleNegation EOF
            {
             before(grammarAccess.getNegationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNegation();

            state._fsp--;

             after(grammarAccess.getNegationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // InternalXtext.g:761:1: ruleNegation : ( ( rule__Negation__Alternatives ) ) ;
    public final void ruleNegation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:765:2: ( ( ( rule__Negation__Alternatives ) ) )
            // InternalXtext.g:766:1: ( ( rule__Negation__Alternatives ) )
            {
            // InternalXtext.g:766:1: ( ( rule__Negation__Alternatives ) )
            // InternalXtext.g:767:1: ( rule__Negation__Alternatives )
            {
             before(grammarAccess.getNegationAccess().getAlternatives()); 
            // InternalXtext.g:768:1: ( rule__Negation__Alternatives )
            // InternalXtext.g:768:2: rule__Negation__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Negation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNegationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNegation"


    // $ANTLR start "entryRuleAtom"
    // InternalXtext.g:780:1: entryRuleAtom : ruleAtom EOF ;
    public final void entryRuleAtom() throws RecognitionException {
        try {
            // InternalXtext.g:781:1: ( ruleAtom EOF )
            // InternalXtext.g:782:1: ruleAtom EOF
            {
             before(grammarAccess.getAtomRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getAtomRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalXtext.g:789:1: ruleAtom : ( ( rule__Atom__Alternatives ) ) ;
    public final void ruleAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:793:2: ( ( ( rule__Atom__Alternatives ) ) )
            // InternalXtext.g:794:1: ( ( rule__Atom__Alternatives ) )
            {
            // InternalXtext.g:794:1: ( ( rule__Atom__Alternatives ) )
            // InternalXtext.g:795:1: ( rule__Atom__Alternatives )
            {
             before(grammarAccess.getAtomAccess().getAlternatives()); 
            // InternalXtext.g:796:1: ( rule__Atom__Alternatives )
            // InternalXtext.g:796:2: rule__Atom__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Atom__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleParenthesizedCondition"
    // InternalXtext.g:808:1: entryRuleParenthesizedCondition : ruleParenthesizedCondition EOF ;
    public final void entryRuleParenthesizedCondition() throws RecognitionException {
        try {
            // InternalXtext.g:809:1: ( ruleParenthesizedCondition EOF )
            // InternalXtext.g:810:1: ruleParenthesizedCondition EOF
            {
             before(grammarAccess.getParenthesizedConditionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParenthesizedCondition();

            state._fsp--;

             after(grammarAccess.getParenthesizedConditionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleParenthesizedCondition"


    // $ANTLR start "ruleParenthesizedCondition"
    // InternalXtext.g:817:1: ruleParenthesizedCondition : ( ( rule__ParenthesizedCondition__Group__0 ) ) ;
    public final void ruleParenthesizedCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:821:2: ( ( ( rule__ParenthesizedCondition__Group__0 ) ) )
            // InternalXtext.g:822:1: ( ( rule__ParenthesizedCondition__Group__0 ) )
            {
            // InternalXtext.g:822:1: ( ( rule__ParenthesizedCondition__Group__0 ) )
            // InternalXtext.g:823:1: ( rule__ParenthesizedCondition__Group__0 )
            {
             before(grammarAccess.getParenthesizedConditionAccess().getGroup()); 
            // InternalXtext.g:824:1: ( rule__ParenthesizedCondition__Group__0 )
            // InternalXtext.g:824:2: rule__ParenthesizedCondition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParenthesizedConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParenthesizedCondition"


    // $ANTLR start "entryRuleParameterReference"
    // InternalXtext.g:836:1: entryRuleParameterReference : ruleParameterReference EOF ;
    public final void entryRuleParameterReference() throws RecognitionException {
        try {
            // InternalXtext.g:837:1: ( ruleParameterReference EOF )
            // InternalXtext.g:838:1: ruleParameterReference EOF
            {
             before(grammarAccess.getParameterReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParameterReference();

            state._fsp--;

             after(grammarAccess.getParameterReferenceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameterReference"


    // $ANTLR start "ruleParameterReference"
    // InternalXtext.g:845:1: ruleParameterReference : ( ( rule__ParameterReference__ParameterAssignment ) ) ;
    public final void ruleParameterReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:849:2: ( ( ( rule__ParameterReference__ParameterAssignment ) ) )
            // InternalXtext.g:850:1: ( ( rule__ParameterReference__ParameterAssignment ) )
            {
            // InternalXtext.g:850:1: ( ( rule__ParameterReference__ParameterAssignment ) )
            // InternalXtext.g:851:1: ( rule__ParameterReference__ParameterAssignment )
            {
             before(grammarAccess.getParameterReferenceAccess().getParameterAssignment()); 
            // InternalXtext.g:852:1: ( rule__ParameterReference__ParameterAssignment )
            // InternalXtext.g:852:2: rule__ParameterReference__ParameterAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParameterReference__ParameterAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameterReferenceAccess().getParameterAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterReference"


    // $ANTLR start "entryRuleTerminalRuleCall"
    // InternalXtext.g:864:1: entryRuleTerminalRuleCall : ruleTerminalRuleCall EOF ;
    public final void entryRuleTerminalRuleCall() throws RecognitionException {
        try {
            // InternalXtext.g:865:1: ( ruleTerminalRuleCall EOF )
            // InternalXtext.g:866:1: ruleTerminalRuleCall EOF
            {
             before(grammarAccess.getTerminalRuleCallRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTerminalRuleCall();

            state._fsp--;

             after(grammarAccess.getTerminalRuleCallRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleTerminalRuleCall"


    // $ANTLR start "ruleTerminalRuleCall"
    // InternalXtext.g:873:1: ruleTerminalRuleCall : ( ( rule__TerminalRuleCall__RuleAssignment ) ) ;
    public final void ruleTerminalRuleCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:877:2: ( ( ( rule__TerminalRuleCall__RuleAssignment ) ) )
            // InternalXtext.g:878:1: ( ( rule__TerminalRuleCall__RuleAssignment ) )
            {
            // InternalXtext.g:878:1: ( ( rule__TerminalRuleCall__RuleAssignment ) )
            // InternalXtext.g:879:1: ( rule__TerminalRuleCall__RuleAssignment )
            {
             before(grammarAccess.getTerminalRuleCallAccess().getRuleAssignment()); 
            // InternalXtext.g:880:1: ( rule__TerminalRuleCall__RuleAssignment )
            // InternalXtext.g:880:2: rule__TerminalRuleCall__RuleAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalRuleCall__RuleAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTerminalRuleCallAccess().getRuleAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminalRuleCall"


    // $ANTLR start "entryRuleRuleID"
    // InternalXtext.g:892:1: entryRuleRuleID : ruleRuleID EOF ;
    public final void entryRuleRuleID() throws RecognitionException {
        try {
            // InternalXtext.g:893:1: ( ruleRuleID EOF )
            // InternalXtext.g:894:1: ruleRuleID EOF
            {
             before(grammarAccess.getRuleIDRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleRuleID();

            state._fsp--;

             after(grammarAccess.getRuleIDRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleRuleID"


    // $ANTLR start "ruleRuleID"
    // InternalXtext.g:901:1: ruleRuleID : ( ( rule__RuleID__Group__0 ) ) ;
    public final void ruleRuleID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:905:2: ( ( ( rule__RuleID__Group__0 ) ) )
            // InternalXtext.g:906:1: ( ( rule__RuleID__Group__0 ) )
            {
            // InternalXtext.g:906:1: ( ( rule__RuleID__Group__0 ) )
            // InternalXtext.g:907:1: ( rule__RuleID__Group__0 )
            {
             before(grammarAccess.getRuleIDAccess().getGroup()); 
            // InternalXtext.g:908:1: ( rule__RuleID__Group__0 )
            // InternalXtext.g:908:2: rule__RuleID__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleID__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleIDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleID"


    // $ANTLR start "entryRuleValidID"
    // InternalXtext.g:920:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // InternalXtext.g:921:1: ( ruleValidID EOF )
            // InternalXtext.g:922:1: ruleValidID EOF
            {
             before(grammarAccess.getValidIDRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getValidIDRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalXtext.g:929:1: ruleValidID : ( ( rule__ValidID__Alternatives ) ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:933:2: ( ( ( rule__ValidID__Alternatives ) ) )
            // InternalXtext.g:934:1: ( ( rule__ValidID__Alternatives ) )
            {
            // InternalXtext.g:934:1: ( ( rule__ValidID__Alternatives ) )
            // InternalXtext.g:935:1: ( rule__ValidID__Alternatives )
            {
             before(grammarAccess.getValidIDAccess().getAlternatives()); 
            // InternalXtext.g:936:1: ( rule__ValidID__Alternatives )
            // InternalXtext.g:936:2: rule__ValidID__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ValidID__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValidIDAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRulePredicatedKeyword"
    // InternalXtext.g:948:1: entryRulePredicatedKeyword : rulePredicatedKeyword EOF ;
    public final void entryRulePredicatedKeyword() throws RecognitionException {
        try {
            // InternalXtext.g:949:1: ( rulePredicatedKeyword EOF )
            // InternalXtext.g:950:1: rulePredicatedKeyword EOF
            {
             before(grammarAccess.getPredicatedKeywordRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            rulePredicatedKeyword();

            state._fsp--;

             after(grammarAccess.getPredicatedKeywordRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRulePredicatedKeyword"


    // $ANTLR start "rulePredicatedKeyword"
    // InternalXtext.g:957:1: rulePredicatedKeyword : ( ( rule__PredicatedKeyword__Group__0 ) ) ;
    public final void rulePredicatedKeyword() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:961:2: ( ( ( rule__PredicatedKeyword__Group__0 ) ) )
            // InternalXtext.g:962:1: ( ( rule__PredicatedKeyword__Group__0 ) )
            {
            // InternalXtext.g:962:1: ( ( rule__PredicatedKeyword__Group__0 ) )
            // InternalXtext.g:963:1: ( rule__PredicatedKeyword__Group__0 )
            {
             before(grammarAccess.getPredicatedKeywordAccess().getGroup()); 
            // InternalXtext.g:964:1: ( rule__PredicatedKeyword__Group__0 )
            // InternalXtext.g:964:2: rule__PredicatedKeyword__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedKeyword__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPredicatedKeywordAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredicatedKeyword"


    // $ANTLR start "entryRulePredicatedRuleCall"
    // InternalXtext.g:976:1: entryRulePredicatedRuleCall : rulePredicatedRuleCall EOF ;
    public final void entryRulePredicatedRuleCall() throws RecognitionException {
        try {
            // InternalXtext.g:977:1: ( rulePredicatedRuleCall EOF )
            // InternalXtext.g:978:1: rulePredicatedRuleCall EOF
            {
             before(grammarAccess.getPredicatedRuleCallRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            rulePredicatedRuleCall();

            state._fsp--;

             after(grammarAccess.getPredicatedRuleCallRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRulePredicatedRuleCall"


    // $ANTLR start "rulePredicatedRuleCall"
    // InternalXtext.g:985:1: rulePredicatedRuleCall : ( ( rule__PredicatedRuleCall__Group__0 ) ) ;
    public final void rulePredicatedRuleCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:989:2: ( ( ( rule__PredicatedRuleCall__Group__0 ) ) )
            // InternalXtext.g:990:1: ( ( rule__PredicatedRuleCall__Group__0 ) )
            {
            // InternalXtext.g:990:1: ( ( rule__PredicatedRuleCall__Group__0 ) )
            // InternalXtext.g:991:1: ( rule__PredicatedRuleCall__Group__0 )
            {
             before(grammarAccess.getPredicatedRuleCallAccess().getGroup()); 
            // InternalXtext.g:992:1: ( rule__PredicatedRuleCall__Group__0 )
            // InternalXtext.g:992:2: rule__PredicatedRuleCall__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedRuleCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPredicatedRuleCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredicatedRuleCall"


    // $ANTLR start "entryRuleAssignment"
    // InternalXtext.g:1004:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalXtext.g:1005:1: ( ruleAssignment EOF )
            // InternalXtext.g:1006:1: ruleAssignment EOF
            {
             before(grammarAccess.getAssignmentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getAssignmentRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalXtext.g:1013:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:1017:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalXtext.g:1018:1: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalXtext.g:1018:1: ( ( rule__Assignment__Group__0 ) )
            // InternalXtext.g:1019:1: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // InternalXtext.g:1020:1: ( rule__Assignment__Group__0 )
            // InternalXtext.g:1020:2: rule__Assignment__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleAssignableTerminal"
    // InternalXtext.g:1032:1: entryRuleAssignableTerminal : ruleAssignableTerminal EOF ;
    public final void entryRuleAssignableTerminal() throws RecognitionException {
        try {
            // InternalXtext.g:1033:1: ( ruleAssignableTerminal EOF )
            // InternalXtext.g:1034:1: ruleAssignableTerminal EOF
            {
             before(grammarAccess.getAssignableTerminalRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAssignableTerminal();

            state._fsp--;

             after(grammarAccess.getAssignableTerminalRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAssignableTerminal"


    // $ANTLR start "ruleAssignableTerminal"
    // InternalXtext.g:1041:1: ruleAssignableTerminal : ( ( rule__AssignableTerminal__Alternatives ) ) ;
    public final void ruleAssignableTerminal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:1045:2: ( ( ( rule__AssignableTerminal__Alternatives ) ) )
            // InternalXtext.g:1046:1: ( ( rule__AssignableTerminal__Alternatives ) )
            {
            // InternalXtext.g:1046:1: ( ( rule__AssignableTerminal__Alternatives ) )
            // InternalXtext.g:1047:1: ( rule__AssignableTerminal__Alternatives )
            {
             before(grammarAccess.getAssignableTerminalAccess().getAlternatives()); 
            // InternalXtext.g:1048:1: ( rule__AssignableTerminal__Alternatives )
            // InternalXtext.g:1048:2: rule__AssignableTerminal__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssignableTerminal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAssignableTerminalAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignableTerminal"


    // $ANTLR start "entryRuleParenthesizedAssignableElement"
    // InternalXtext.g:1060:1: entryRuleParenthesizedAssignableElement : ruleParenthesizedAssignableElement EOF ;
    public final void entryRuleParenthesizedAssignableElement() throws RecognitionException {
        try {
            // InternalXtext.g:1061:1: ( ruleParenthesizedAssignableElement EOF )
            // InternalXtext.g:1062:1: ruleParenthesizedAssignableElement EOF
            {
             before(grammarAccess.getParenthesizedAssignableElementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParenthesizedAssignableElement();

            state._fsp--;

             after(grammarAccess.getParenthesizedAssignableElementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleParenthesizedAssignableElement"


    // $ANTLR start "ruleParenthesizedAssignableElement"
    // InternalXtext.g:1069:1: ruleParenthesizedAssignableElement : ( ( rule__ParenthesizedAssignableElement__Group__0 ) ) ;
    public final void ruleParenthesizedAssignableElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:1073:2: ( ( ( rule__ParenthesizedAssignableElement__Group__0 ) ) )
            // InternalXtext.g:1074:1: ( ( rule__ParenthesizedAssignableElement__Group__0 ) )
            {
            // InternalXtext.g:1074:1: ( ( rule__ParenthesizedAssignableElement__Group__0 ) )
            // InternalXtext.g:1075:1: ( rule__ParenthesizedAssignableElement__Group__0 )
            {
             before(grammarAccess.getParenthesizedAssignableElementAccess().getGroup()); 
            // InternalXtext.g:1076:1: ( rule__ParenthesizedAssignableElement__Group__0 )
            // InternalXtext.g:1076:2: rule__ParenthesizedAssignableElement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedAssignableElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParenthesizedAssignableElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParenthesizedAssignableElement"


    // $ANTLR start "entryRuleAssignableAlternatives"
    // InternalXtext.g:1088:1: entryRuleAssignableAlternatives : ruleAssignableAlternatives EOF ;
    public final void entryRuleAssignableAlternatives() throws RecognitionException {
        try {
            // InternalXtext.g:1089:1: ( ruleAssignableAlternatives EOF )
            // InternalXtext.g:1090:1: ruleAssignableAlternatives EOF
            {
             before(grammarAccess.getAssignableAlternativesRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAssignableAlternatives();

            state._fsp--;

             after(grammarAccess.getAssignableAlternativesRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAssignableAlternatives"


    // $ANTLR start "ruleAssignableAlternatives"
    // InternalXtext.g:1097:1: ruleAssignableAlternatives : ( ( rule__AssignableAlternatives__Group__0 ) ) ;
    public final void ruleAssignableAlternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:1101:2: ( ( ( rule__AssignableAlternatives__Group__0 ) ) )
            // InternalXtext.g:1102:1: ( ( rule__AssignableAlternatives__Group__0 ) )
            {
            // InternalXtext.g:1102:1: ( ( rule__AssignableAlternatives__Group__0 ) )
            // InternalXtext.g:1103:1: ( rule__AssignableAlternatives__Group__0 )
            {
             before(grammarAccess.getAssignableAlternativesAccess().getGroup()); 
            // InternalXtext.g:1104:1: ( rule__AssignableAlternatives__Group__0 )
            // InternalXtext.g:1104:2: rule__AssignableAlternatives__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssignableAlternatives__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignableAlternativesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignableAlternatives"


    // $ANTLR start "entryRuleCrossReference"
    // InternalXtext.g:1116:1: entryRuleCrossReference : ruleCrossReference EOF ;
    public final void entryRuleCrossReference() throws RecognitionException {
        try {
            // InternalXtext.g:1117:1: ( ruleCrossReference EOF )
            // InternalXtext.g:1118:1: ruleCrossReference EOF
            {
             before(grammarAccess.getCrossReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleCrossReference();

            state._fsp--;

             after(grammarAccess.getCrossReferenceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleCrossReference"


    // $ANTLR start "ruleCrossReference"
    // InternalXtext.g:1125:1: ruleCrossReference : ( ( rule__CrossReference__Group__0 ) ) ;
    public final void ruleCrossReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:1129:2: ( ( ( rule__CrossReference__Group__0 ) ) )
            // InternalXtext.g:1130:1: ( ( rule__CrossReference__Group__0 ) )
            {
            // InternalXtext.g:1130:1: ( ( rule__CrossReference__Group__0 ) )
            // InternalXtext.g:1131:1: ( rule__CrossReference__Group__0 )
            {
             before(grammarAccess.getCrossReferenceAccess().getGroup()); 
            // InternalXtext.g:1132:1: ( rule__CrossReference__Group__0 )
            // InternalXtext.g:1132:2: rule__CrossReference__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CrossReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCrossReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCrossReference"


    // $ANTLR start "entryRuleCrossReferenceableTerminal"
    // InternalXtext.g:1144:1: entryRuleCrossReferenceableTerminal : ruleCrossReferenceableTerminal EOF ;
    public final void entryRuleCrossReferenceableTerminal() throws RecognitionException {
        try {
            // InternalXtext.g:1145:1: ( ruleCrossReferenceableTerminal EOF )
            // InternalXtext.g:1146:1: ruleCrossReferenceableTerminal EOF
            {
             before(grammarAccess.getCrossReferenceableTerminalRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleCrossReferenceableTerminal();

            state._fsp--;

             after(grammarAccess.getCrossReferenceableTerminalRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleCrossReferenceableTerminal"


    // $ANTLR start "ruleCrossReferenceableTerminal"
    // InternalXtext.g:1153:1: ruleCrossReferenceableTerminal : ( ( rule__CrossReferenceableTerminal__Alternatives ) ) ;
    public final void ruleCrossReferenceableTerminal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:1157:2: ( ( ( rule__CrossReferenceableTerminal__Alternatives ) ) )
            // InternalXtext.g:1158:1: ( ( rule__CrossReferenceableTerminal__Alternatives ) )
            {
            // InternalXtext.g:1158:1: ( ( rule__CrossReferenceableTerminal__Alternatives ) )
            // InternalXtext.g:1159:1: ( rule__CrossReferenceableTerminal__Alternatives )
            {
             before(grammarAccess.getCrossReferenceableTerminalAccess().getAlternatives()); 
            // InternalXtext.g:1160:1: ( rule__CrossReferenceableTerminal__Alternatives )
            // InternalXtext.g:1160:2: rule__CrossReferenceableTerminal__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CrossReferenceableTerminal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCrossReferenceableTerminalAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCrossReferenceableTerminal"


    // $ANTLR start "entryRuleParenthesizedElement"
    // InternalXtext.g:1172:1: entryRuleParenthesizedElement : ruleParenthesizedElement EOF ;
    public final void entryRuleParenthesizedElement() throws RecognitionException {
        try {
            // InternalXtext.g:1173:1: ( ruleParenthesizedElement EOF )
            // InternalXtext.g:1174:1: ruleParenthesizedElement EOF
            {
             before(grammarAccess.getParenthesizedElementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParenthesizedElement();

            state._fsp--;

             after(grammarAccess.getParenthesizedElementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleParenthesizedElement"


    // $ANTLR start "ruleParenthesizedElement"
    // InternalXtext.g:1181:1: ruleParenthesizedElement : ( ( rule__ParenthesizedElement__Group__0 ) ) ;
    public final void ruleParenthesizedElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:1185:2: ( ( ( rule__ParenthesizedElement__Group__0 ) ) )
            // InternalXtext.g:1186:1: ( ( rule__ParenthesizedElement__Group__0 ) )
            {
            // InternalXtext.g:1186:1: ( ( rule__ParenthesizedElement__Group__0 ) )
            // InternalXtext.g:1187:1: ( rule__ParenthesizedElement__Group__0 )
            {
             before(grammarAccess.getParenthesizedElementAccess().getGroup()); 
            // InternalXtext.g:1188:1: ( rule__ParenthesizedElement__Group__0 )
            // InternalXtext.g:1188:2: rule__ParenthesizedElement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParenthesizedElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParenthesizedElement"


    // $ANTLR start "entryRulePredicatedGroup"
    // InternalXtext.g:1200:1: entryRulePredicatedGroup : rulePredicatedGroup EOF ;
    public final void entryRulePredicatedGroup() throws RecognitionException {
        try {
            // InternalXtext.g:1201:1: ( rulePredicatedGroup EOF )
            // InternalXtext.g:1202:1: rulePredicatedGroup EOF
            {
             before(grammarAccess.getPredicatedGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            rulePredicatedGroup();

            state._fsp--;

             after(grammarAccess.getPredicatedGroupRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRulePredicatedGroup"


    // $ANTLR start "rulePredicatedGroup"
    // InternalXtext.g:1209:1: rulePredicatedGroup : ( ( rule__PredicatedGroup__Group__0 ) ) ;
    public final void rulePredicatedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:1213:2: ( ( ( rule__PredicatedGroup__Group__0 ) ) )
            // InternalXtext.g:1214:1: ( ( rule__PredicatedGroup__Group__0 ) )
            {
            // InternalXtext.g:1214:1: ( ( rule__PredicatedGroup__Group__0 ) )
            // InternalXtext.g:1215:1: ( rule__PredicatedGroup__Group__0 )
            {
             before(grammarAccess.getPredicatedGroupAccess().getGroup()); 
            // InternalXtext.g:1216:1: ( rule__PredicatedGroup__Group__0 )
            // InternalXtext.g:1216:2: rule__PredicatedGroup__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPredicatedGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredicatedGroup"


    // $ANTLR start "entryRuleTerminalRule"
    // InternalXtext.g:1228:1: entryRuleTerminalRule : ruleTerminalRule EOF ;
    public final void entryRuleTerminalRule() throws RecognitionException {
        try {
            // InternalXtext.g:1229:1: ( ruleTerminalRule EOF )
            // InternalXtext.g:1230:1: ruleTerminalRule EOF
            {
             before(grammarAccess.getTerminalRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTerminalRule();

            state._fsp--;

             after(grammarAccess.getTerminalRuleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleTerminalRule"


    // $ANTLR start "ruleTerminalRule"
    // InternalXtext.g:1237:1: ruleTerminalRule : ( ( rule__TerminalRule__Group__0 ) ) ;
    public final void ruleTerminalRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:1241:2: ( ( ( rule__TerminalRule__Group__0 ) ) )
            // InternalXtext.g:1242:1: ( ( rule__TerminalRule__Group__0 ) )
            {
            // InternalXtext.g:1242:1: ( ( rule__TerminalRule__Group__0 ) )
            // InternalXtext.g:1243:1: ( rule__TerminalRule__Group__0 )
            {
             before(grammarAccess.getTerminalRuleAccess().getGroup()); 
            // InternalXtext.g:1244:1: ( rule__TerminalRule__Group__0 )
            // InternalXtext.g:1244:2: rule__TerminalRule__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTerminalRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminalRule"


    // $ANTLR start "entryRuleTerminalAlternatives"
    // InternalXtext.g:1256:1: entryRuleTerminalAlternatives : ruleTerminalAlternatives EOF ;
    public final void entryRuleTerminalAlternatives() throws RecognitionException {
        try {
            // InternalXtext.g:1257:1: ( ruleTerminalAlternatives EOF )
            // InternalXtext.g:1258:1: ruleTerminalAlternatives EOF
            {
             before(grammarAccess.getTerminalAlternativesRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTerminalAlternatives();

            state._fsp--;

             after(grammarAccess.getTerminalAlternativesRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleTerminalAlternatives"


    // $ANTLR start "ruleTerminalAlternatives"
    // InternalXtext.g:1265:1: ruleTerminalAlternatives : ( ( rule__TerminalAlternatives__Group__0 ) ) ;
    public final void ruleTerminalAlternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:1269:2: ( ( ( rule__TerminalAlternatives__Group__0 ) ) )
            // InternalXtext.g:1270:1: ( ( rule__TerminalAlternatives__Group__0 ) )
            {
            // InternalXtext.g:1270:1: ( ( rule__TerminalAlternatives__Group__0 ) )
            // InternalXtext.g:1271:1: ( rule__TerminalAlternatives__Group__0 )
            {
             before(grammarAccess.getTerminalAlternativesAccess().getGroup()); 
            // InternalXtext.g:1272:1: ( rule__TerminalAlternatives__Group__0 )
            // InternalXtext.g:1272:2: rule__TerminalAlternatives__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalAlternatives__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTerminalAlternativesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminalAlternatives"


    // $ANTLR start "entryRuleTerminalGroup"
    // InternalXtext.g:1284:1: entryRuleTerminalGroup : ruleTerminalGroup EOF ;
    public final void entryRuleTerminalGroup() throws RecognitionException {
        try {
            // InternalXtext.g:1285:1: ( ruleTerminalGroup EOF )
            // InternalXtext.g:1286:1: ruleTerminalGroup EOF
            {
             before(grammarAccess.getTerminalGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTerminalGroup();

            state._fsp--;

             after(grammarAccess.getTerminalGroupRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleTerminalGroup"


    // $ANTLR start "ruleTerminalGroup"
    // InternalXtext.g:1293:1: ruleTerminalGroup : ( ( rule__TerminalGroup__Group__0 ) ) ;
    public final void ruleTerminalGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:1297:2: ( ( ( rule__TerminalGroup__Group__0 ) ) )
            // InternalXtext.g:1298:1: ( ( rule__TerminalGroup__Group__0 ) )
            {
            // InternalXtext.g:1298:1: ( ( rule__TerminalGroup__Group__0 ) )
            // InternalXtext.g:1299:1: ( rule__TerminalGroup__Group__0 )
            {
             before(grammarAccess.getTerminalGroupAccess().getGroup()); 
            // InternalXtext.g:1300:1: ( rule__TerminalGroup__Group__0 )
            // InternalXtext.g:1300:2: rule__TerminalGroup__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTerminalGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminalGroup"


    // $ANTLR start "entryRuleTerminalToken"
    // InternalXtext.g:1312:1: entryRuleTerminalToken : ruleTerminalToken EOF ;
    public final void entryRuleTerminalToken() throws RecognitionException {
        try {
            // InternalXtext.g:1313:1: ( ruleTerminalToken EOF )
            // InternalXtext.g:1314:1: ruleTerminalToken EOF
            {
             before(grammarAccess.getTerminalTokenRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTerminalToken();

            state._fsp--;

             after(grammarAccess.getTerminalTokenRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleTerminalToken"


    // $ANTLR start "ruleTerminalToken"
    // InternalXtext.g:1321:1: ruleTerminalToken : ( ( rule__TerminalToken__Group__0 ) ) ;
    public final void ruleTerminalToken() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:1325:2: ( ( ( rule__TerminalToken__Group__0 ) ) )
            // InternalXtext.g:1326:1: ( ( rule__TerminalToken__Group__0 ) )
            {
            // InternalXtext.g:1326:1: ( ( rule__TerminalToken__Group__0 ) )
            // InternalXtext.g:1327:1: ( rule__TerminalToken__Group__0 )
            {
             before(grammarAccess.getTerminalTokenAccess().getGroup()); 
            // InternalXtext.g:1328:1: ( rule__TerminalToken__Group__0 )
            // InternalXtext.g:1328:2: rule__TerminalToken__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalToken__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTerminalTokenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminalToken"


    // $ANTLR start "entryRuleTerminalTokenElement"
    // InternalXtext.g:1340:1: entryRuleTerminalTokenElement : ruleTerminalTokenElement EOF ;
    public final void entryRuleTerminalTokenElement() throws RecognitionException {
        try {
            // InternalXtext.g:1341:1: ( ruleTerminalTokenElement EOF )
            // InternalXtext.g:1342:1: ruleTerminalTokenElement EOF
            {
             before(grammarAccess.getTerminalTokenElementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTerminalTokenElement();

            state._fsp--;

             after(grammarAccess.getTerminalTokenElementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleTerminalTokenElement"


    // $ANTLR start "ruleTerminalTokenElement"
    // InternalXtext.g:1349:1: ruleTerminalTokenElement : ( ( rule__TerminalTokenElement__Alternatives ) ) ;
    public final void ruleTerminalTokenElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:1353:2: ( ( ( rule__TerminalTokenElement__Alternatives ) ) )
            // InternalXtext.g:1354:1: ( ( rule__TerminalTokenElement__Alternatives ) )
            {
            // InternalXtext.g:1354:1: ( ( rule__TerminalTokenElement__Alternatives ) )
            // InternalXtext.g:1355:1: ( rule__TerminalTokenElement__Alternatives )
            {
             before(grammarAccess.getTerminalTokenElementAccess().getAlternatives()); 
            // InternalXtext.g:1356:1: ( rule__TerminalTokenElement__Alternatives )
            // InternalXtext.g:1356:2: rule__TerminalTokenElement__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalTokenElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTerminalTokenElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminalTokenElement"


    // $ANTLR start "entryRuleParenthesizedTerminalElement"
    // InternalXtext.g:1368:1: entryRuleParenthesizedTerminalElement : ruleParenthesizedTerminalElement EOF ;
    public final void entryRuleParenthesizedTerminalElement() throws RecognitionException {
        try {
            // InternalXtext.g:1369:1: ( ruleParenthesizedTerminalElement EOF )
            // InternalXtext.g:1370:1: ruleParenthesizedTerminalElement EOF
            {
             before(grammarAccess.getParenthesizedTerminalElementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParenthesizedTerminalElement();

            state._fsp--;

             after(grammarAccess.getParenthesizedTerminalElementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleParenthesizedTerminalElement"


    // $ANTLR start "ruleParenthesizedTerminalElement"
    // InternalXtext.g:1377:1: ruleParenthesizedTerminalElement : ( ( rule__ParenthesizedTerminalElement__Group__0 ) ) ;
    public final void ruleParenthesizedTerminalElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:1381:2: ( ( ( rule__ParenthesizedTerminalElement__Group__0 ) ) )
            // InternalXtext.g:1382:1: ( ( rule__ParenthesizedTerminalElement__Group__0 ) )
            {
            // InternalXtext.g:1382:1: ( ( rule__ParenthesizedTerminalElement__Group__0 ) )
            // InternalXtext.g:1383:1: ( rule__ParenthesizedTerminalElement__Group__0 )
            {
             before(grammarAccess.getParenthesizedTerminalElementAccess().getGroup()); 
            // InternalXtext.g:1384:1: ( rule__ParenthesizedTerminalElement__Group__0 )
            // InternalXtext.g:1384:2: rule__ParenthesizedTerminalElement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedTerminalElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParenthesizedTerminalElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParenthesizedTerminalElement"


    // $ANTLR start "entryRuleAbstractNegatedToken"
    // InternalXtext.g:1396:1: entryRuleAbstractNegatedToken : ruleAbstractNegatedToken EOF ;
    public final void entryRuleAbstractNegatedToken() throws RecognitionException {
        try {
            // InternalXtext.g:1397:1: ( ruleAbstractNegatedToken EOF )
            // InternalXtext.g:1398:1: ruleAbstractNegatedToken EOF
            {
             before(grammarAccess.getAbstractNegatedTokenRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAbstractNegatedToken();

            state._fsp--;

             after(grammarAccess.getAbstractNegatedTokenRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractNegatedToken"


    // $ANTLR start "ruleAbstractNegatedToken"
    // InternalXtext.g:1405:1: ruleAbstractNegatedToken : ( ( rule__AbstractNegatedToken__Alternatives ) ) ;
    public final void ruleAbstractNegatedToken() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:1409:2: ( ( ( rule__AbstractNegatedToken__Alternatives ) ) )
            // InternalXtext.g:1410:1: ( ( rule__AbstractNegatedToken__Alternatives ) )
            {
            // InternalXtext.g:1410:1: ( ( rule__AbstractNegatedToken__Alternatives ) )
            // InternalXtext.g:1411:1: ( rule__AbstractNegatedToken__Alternatives )
            {
             before(grammarAccess.getAbstractNegatedTokenAccess().getAlternatives()); 
            // InternalXtext.g:1412:1: ( rule__AbstractNegatedToken__Alternatives )
            // InternalXtext.g:1412:2: rule__AbstractNegatedToken__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AbstractNegatedToken__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractNegatedTokenAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractNegatedToken"


    // $ANTLR start "entryRuleNegatedToken"
    // InternalXtext.g:1424:1: entryRuleNegatedToken : ruleNegatedToken EOF ;
    public final void entryRuleNegatedToken() throws RecognitionException {
        try {
            // InternalXtext.g:1425:1: ( ruleNegatedToken EOF )
            // InternalXtext.g:1426:1: ruleNegatedToken EOF
            {
             before(grammarAccess.getNegatedTokenRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNegatedToken();

            state._fsp--;

             after(grammarAccess.getNegatedTokenRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleNegatedToken"


    // $ANTLR start "ruleNegatedToken"
    // InternalXtext.g:1433:1: ruleNegatedToken : ( ( rule__NegatedToken__Group__0 ) ) ;
    public final void ruleNegatedToken() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:1437:2: ( ( ( rule__NegatedToken__Group__0 ) ) )
            // InternalXtext.g:1438:1: ( ( rule__NegatedToken__Group__0 ) )
            {
            // InternalXtext.g:1438:1: ( ( rule__NegatedToken__Group__0 ) )
            // InternalXtext.g:1439:1: ( rule__NegatedToken__Group__0 )
            {
             before(grammarAccess.getNegatedTokenAccess().getGroup()); 
            // InternalXtext.g:1440:1: ( rule__NegatedToken__Group__0 )
            // InternalXtext.g:1440:2: rule__NegatedToken__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NegatedToken__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNegatedTokenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNegatedToken"


    // $ANTLR start "entryRuleUntilToken"
    // InternalXtext.g:1452:1: entryRuleUntilToken : ruleUntilToken EOF ;
    public final void entryRuleUntilToken() throws RecognitionException {
        try {
            // InternalXtext.g:1453:1: ( ruleUntilToken EOF )
            // InternalXtext.g:1454:1: ruleUntilToken EOF
            {
             before(grammarAccess.getUntilTokenRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleUntilToken();

            state._fsp--;

             after(grammarAccess.getUntilTokenRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleUntilToken"


    // $ANTLR start "ruleUntilToken"
    // InternalXtext.g:1461:1: ruleUntilToken : ( ( rule__UntilToken__Group__0 ) ) ;
    public final void ruleUntilToken() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:1465:2: ( ( ( rule__UntilToken__Group__0 ) ) )
            // InternalXtext.g:1466:1: ( ( rule__UntilToken__Group__0 ) )
            {
            // InternalXtext.g:1466:1: ( ( rule__UntilToken__Group__0 ) )
            // InternalXtext.g:1467:1: ( rule__UntilToken__Group__0 )
            {
             before(grammarAccess.getUntilTokenAccess().getGroup()); 
            // InternalXtext.g:1468:1: ( rule__UntilToken__Group__0 )
            // InternalXtext.g:1468:2: rule__UntilToken__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UntilToken__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUntilTokenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUntilToken"


    // $ANTLR start "entryRuleWildcard"
    // InternalXtext.g:1480:1: entryRuleWildcard : ruleWildcard EOF ;
    public final void entryRuleWildcard() throws RecognitionException {
        try {
            // InternalXtext.g:1481:1: ( ruleWildcard EOF )
            // InternalXtext.g:1482:1: ruleWildcard EOF
            {
             before(grammarAccess.getWildcardRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleWildcard();

            state._fsp--;

             after(grammarAccess.getWildcardRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleWildcard"


    // $ANTLR start "ruleWildcard"
    // InternalXtext.g:1489:1: ruleWildcard : ( ( rule__Wildcard__Group__0 ) ) ;
    public final void ruleWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:1493:2: ( ( ( rule__Wildcard__Group__0 ) ) )
            // InternalXtext.g:1494:1: ( ( rule__Wildcard__Group__0 ) )
            {
            // InternalXtext.g:1494:1: ( ( rule__Wildcard__Group__0 ) )
            // InternalXtext.g:1495:1: ( rule__Wildcard__Group__0 )
            {
             before(grammarAccess.getWildcardAccess().getGroup()); 
            // InternalXtext.g:1496:1: ( rule__Wildcard__Group__0 )
            // InternalXtext.g:1496:2: rule__Wildcard__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Wildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWildcardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWildcard"


    // $ANTLR start "entryRuleEOF"
    // InternalXtext.g:1508:1: entryRuleEOF : ruleEOF EOF ;
    public final void entryRuleEOF() throws RecognitionException {
        try {
            // InternalXtext.g:1509:1: ( ruleEOF EOF )
            // InternalXtext.g:1510:1: ruleEOF EOF
            {
             before(grammarAccess.getEOFRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEOF();

            state._fsp--;

             after(grammarAccess.getEOFRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleEOF"


    // $ANTLR start "ruleEOF"
    // InternalXtext.g:1517:1: ruleEOF : ( ( rule__EOF__Group__0 ) ) ;
    public final void ruleEOF() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:1521:2: ( ( ( rule__EOF__Group__0 ) ) )
            // InternalXtext.g:1522:1: ( ( rule__EOF__Group__0 ) )
            {
            // InternalXtext.g:1522:1: ( ( rule__EOF__Group__0 ) )
            // InternalXtext.g:1523:1: ( rule__EOF__Group__0 )
            {
             before(grammarAccess.getEOFAccess().getGroup()); 
            // InternalXtext.g:1524:1: ( rule__EOF__Group__0 )
            // InternalXtext.g:1524:2: rule__EOF__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EOF__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEOFAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEOF"


    // $ANTLR start "entryRuleCharacterRange"
    // InternalXtext.g:1536:1: entryRuleCharacterRange : ruleCharacterRange EOF ;
    public final void entryRuleCharacterRange() throws RecognitionException {
        try {
            // InternalXtext.g:1537:1: ( ruleCharacterRange EOF )
            // InternalXtext.g:1538:1: ruleCharacterRange EOF
            {
             before(grammarAccess.getCharacterRangeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleCharacterRange();

            state._fsp--;

             after(grammarAccess.getCharacterRangeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleCharacterRange"


    // $ANTLR start "ruleCharacterRange"
    // InternalXtext.g:1545:1: ruleCharacterRange : ( ( rule__CharacterRange__Group__0 ) ) ;
    public final void ruleCharacterRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:1549:2: ( ( ( rule__CharacterRange__Group__0 ) ) )
            // InternalXtext.g:1550:1: ( ( rule__CharacterRange__Group__0 ) )
            {
            // InternalXtext.g:1550:1: ( ( rule__CharacterRange__Group__0 ) )
            // InternalXtext.g:1551:1: ( rule__CharacterRange__Group__0 )
            {
             before(grammarAccess.getCharacterRangeAccess().getGroup()); 
            // InternalXtext.g:1552:1: ( rule__CharacterRange__Group__0 )
            // InternalXtext.g:1552:2: rule__CharacterRange__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CharacterRange__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharacterRangeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCharacterRange"


    // $ANTLR start "entryRuleEnumRule"
    // InternalXtext.g:1564:1: entryRuleEnumRule : ruleEnumRule EOF ;
    public final void entryRuleEnumRule() throws RecognitionException {
        try {
            // InternalXtext.g:1565:1: ( ruleEnumRule EOF )
            // InternalXtext.g:1566:1: ruleEnumRule EOF
            {
             before(grammarAccess.getEnumRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEnumRule();

            state._fsp--;

             after(grammarAccess.getEnumRuleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleEnumRule"


    // $ANTLR start "ruleEnumRule"
    // InternalXtext.g:1573:1: ruleEnumRule : ( ( rule__EnumRule__Group__0 ) ) ;
    public final void ruleEnumRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:1577:2: ( ( ( rule__EnumRule__Group__0 ) ) )
            // InternalXtext.g:1578:1: ( ( rule__EnumRule__Group__0 ) )
            {
            // InternalXtext.g:1578:1: ( ( rule__EnumRule__Group__0 ) )
            // InternalXtext.g:1579:1: ( rule__EnumRule__Group__0 )
            {
             before(grammarAccess.getEnumRuleAccess().getGroup()); 
            // InternalXtext.g:1580:1: ( rule__EnumRule__Group__0 )
            // InternalXtext.g:1580:2: rule__EnumRule__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumRule"


    // $ANTLR start "entryRuleEnumLiterals"
    // InternalXtext.g:1592:1: entryRuleEnumLiterals : ruleEnumLiterals EOF ;
    public final void entryRuleEnumLiterals() throws RecognitionException {
        try {
            // InternalXtext.g:1593:1: ( ruleEnumLiterals EOF )
            // InternalXtext.g:1594:1: ruleEnumLiterals EOF
            {
             before(grammarAccess.getEnumLiteralsRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEnumLiterals();

            state._fsp--;

             after(grammarAccess.getEnumLiteralsRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleEnumLiterals"


    // $ANTLR start "ruleEnumLiterals"
    // InternalXtext.g:1601:1: ruleEnumLiterals : ( ( rule__EnumLiterals__Group__0 ) ) ;
    public final void ruleEnumLiterals() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:1605:2: ( ( ( rule__EnumLiterals__Group__0 ) ) )
            // InternalXtext.g:1606:1: ( ( rule__EnumLiterals__Group__0 ) )
            {
            // InternalXtext.g:1606:1: ( ( rule__EnumLiterals__Group__0 ) )
            // InternalXtext.g:1607:1: ( rule__EnumLiterals__Group__0 )
            {
             before(grammarAccess.getEnumLiteralsAccess().getGroup()); 
            // InternalXtext.g:1608:1: ( rule__EnumLiterals__Group__0 )
            // InternalXtext.g:1608:2: rule__EnumLiterals__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumLiterals__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumLiteralsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumLiterals"


    // $ANTLR start "entryRuleEnumLiteralDeclaration"
    // InternalXtext.g:1620:1: entryRuleEnumLiteralDeclaration : ruleEnumLiteralDeclaration EOF ;
    public final void entryRuleEnumLiteralDeclaration() throws RecognitionException {
        try {
            // InternalXtext.g:1621:1: ( ruleEnumLiteralDeclaration EOF )
            // InternalXtext.g:1622:1: ruleEnumLiteralDeclaration EOF
            {
             before(grammarAccess.getEnumLiteralDeclarationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEnumLiteralDeclaration();

            state._fsp--;

             after(grammarAccess.getEnumLiteralDeclarationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleEnumLiteralDeclaration"


    // $ANTLR start "ruleEnumLiteralDeclaration"
    // InternalXtext.g:1629:1: ruleEnumLiteralDeclaration : ( ( rule__EnumLiteralDeclaration__Group__0 ) ) ;
    public final void ruleEnumLiteralDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:1633:2: ( ( ( rule__EnumLiteralDeclaration__Group__0 ) ) )
            // InternalXtext.g:1634:1: ( ( rule__EnumLiteralDeclaration__Group__0 ) )
            {
            // InternalXtext.g:1634:1: ( ( rule__EnumLiteralDeclaration__Group__0 ) )
            // InternalXtext.g:1635:1: ( rule__EnumLiteralDeclaration__Group__0 )
            {
             before(grammarAccess.getEnumLiteralDeclarationAccess().getGroup()); 
            // InternalXtext.g:1636:1: ( rule__EnumLiteralDeclaration__Group__0 )
            // InternalXtext.g:1636:2: rule__EnumLiteralDeclaration__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumLiteralDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumLiteralDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumLiteralDeclaration"


    // $ANTLR start "rule__AbstractRule__Alternatives"
    // InternalXtext.g:1648:1: rule__AbstractRule__Alternatives : ( ( ruleParserRule ) | ( ruleTerminalRule ) | ( ruleEnumRule ) );
    public final void rule__AbstractRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:1652:1: ( ( ruleParserRule ) | ( ruleTerminalRule ) | ( ruleEnumRule ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 20:
            case 21:
            case 52:
                {
                alt1=1;
                }
                break;
            case 46:
                {
                alt1=2;
                }
                break;
            case 50:
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
                    // InternalXtext.g:1653:1: ( ruleParserRule )
                    {
                    // InternalXtext.g:1653:1: ( ruleParserRule )
                    // InternalXtext.g:1654:1: ruleParserRule
                    {
                     before(grammarAccess.getAbstractRuleAccess().getParserRuleParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleParserRule();

                    state._fsp--;

                     after(grammarAccess.getAbstractRuleAccess().getParserRuleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:1659:6: ( ruleTerminalRule )
                    {
                    // InternalXtext.g:1659:6: ( ruleTerminalRule )
                    // InternalXtext.g:1660:1: ruleTerminalRule
                    {
                     before(grammarAccess.getAbstractRuleAccess().getTerminalRuleParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTerminalRule();

                    state._fsp--;

                     after(grammarAccess.getAbstractRuleAccess().getTerminalRuleParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXtext.g:1665:6: ( ruleEnumRule )
                    {
                    // InternalXtext.g:1665:6: ( ruleEnumRule )
                    // InternalXtext.g:1666:1: ruleEnumRule
                    {
                     before(grammarAccess.getAbstractRuleAccess().getEnumRuleParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleEnumRule();

                    state._fsp--;

                     after(grammarAccess.getAbstractRuleAccess().getEnumRuleParserRuleCall_2()); 

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
    // $ANTLR end "rule__AbstractRule__Alternatives"


    // $ANTLR start "rule__AbstractMetamodelDeclaration__Alternatives"
    // InternalXtext.g:1676:1: rule__AbstractMetamodelDeclaration__Alternatives : ( ( ruleGeneratedMetamodel ) | ( ruleReferencedMetamodel ) );
    public final void rule__AbstractMetamodelDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:1680:1: ( ( ruleGeneratedMetamodel ) | ( ruleReferencedMetamodel ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==29) ) {
                alt2=1;
            }
            else if ( (LA2_0==31) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalXtext.g:1681:1: ( ruleGeneratedMetamodel )
                    {
                    // InternalXtext.g:1681:1: ( ruleGeneratedMetamodel )
                    // InternalXtext.g:1682:1: ruleGeneratedMetamodel
                    {
                     before(grammarAccess.getAbstractMetamodelDeclarationAccess().getGeneratedMetamodelParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleGeneratedMetamodel();

                    state._fsp--;

                     after(grammarAccess.getAbstractMetamodelDeclarationAccess().getGeneratedMetamodelParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:1687:6: ( ruleReferencedMetamodel )
                    {
                    // InternalXtext.g:1687:6: ( ruleReferencedMetamodel )
                    // InternalXtext.g:1688:1: ruleReferencedMetamodel
                    {
                     before(grammarAccess.getAbstractMetamodelDeclarationAccess().getReferencedMetamodelParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleReferencedMetamodel();

                    state._fsp--;

                     after(grammarAccess.getAbstractMetamodelDeclarationAccess().getReferencedMetamodelParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractMetamodelDeclaration__Alternatives"


    // $ANTLR start "rule__ParserRule__Alternatives_0"
    // InternalXtext.g:1698:1: rule__ParserRule__Alternatives_0 : ( ( ( rule__ParserRule__Group_0_0__0 ) ) | ( ( rule__ParserRule__Group_0_1__0 ) ) );
    public final void rule__ParserRule__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:1702:1: ( ( ( rule__ParserRule__Group_0_0__0 ) ) | ( ( rule__ParserRule__Group_0_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==52) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID||(LA3_0>=20 && LA3_0<=21)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalXtext.g:1703:1: ( ( rule__ParserRule__Group_0_0__0 ) )
                    {
                    // InternalXtext.g:1703:1: ( ( rule__ParserRule__Group_0_0__0 ) )
                    // InternalXtext.g:1704:1: ( rule__ParserRule__Group_0_0__0 )
                    {
                     before(grammarAccess.getParserRuleAccess().getGroup_0_0()); 
                    // InternalXtext.g:1705:1: ( rule__ParserRule__Group_0_0__0 )
                    // InternalXtext.g:1705:2: rule__ParserRule__Group_0_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ParserRule__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParserRuleAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:1709:6: ( ( rule__ParserRule__Group_0_1__0 ) )
                    {
                    // InternalXtext.g:1709:6: ( ( rule__ParserRule__Group_0_1__0 ) )
                    // InternalXtext.g:1710:1: ( rule__ParserRule__Group_0_1__0 )
                    {
                     before(grammarAccess.getParserRuleAccess().getGroup_0_1()); 
                    // InternalXtext.g:1711:1: ( rule__ParserRule__Group_0_1__0 )
                    // InternalXtext.g:1711:2: rule__ParserRule__Group_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ParserRule__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParserRuleAccess().getGroup_0_1()); 

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
    // $ANTLR end "rule__ParserRule__Alternatives_0"


    // $ANTLR start "rule__ParserRule__Alternatives_0_0_2"
    // InternalXtext.g:1720:1: rule__ParserRule__Alternatives_0_0_2 : ( ( ( rule__ParserRule__WildcardAssignment_0_0_2_0 ) ) | ( ( rule__ParserRule__Group_0_0_2_1__0 )? ) );
    public final void rule__ParserRule__Alternatives_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:1724:1: ( ( ( rule__ParserRule__WildcardAssignment_0_0_2_0 ) ) | ( ( rule__ParserRule__Group_0_0_2_1__0 )? ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=11 && LA5_0<=14)||LA5_0==32||LA5_0==34||LA5_0==51) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalXtext.g:1725:1: ( ( rule__ParserRule__WildcardAssignment_0_0_2_0 ) )
                    {
                    // InternalXtext.g:1725:1: ( ( rule__ParserRule__WildcardAssignment_0_0_2_0 ) )
                    // InternalXtext.g:1726:1: ( rule__ParserRule__WildcardAssignment_0_0_2_0 )
                    {
                     before(grammarAccess.getParserRuleAccess().getWildcardAssignment_0_0_2_0()); 
                    // InternalXtext.g:1727:1: ( rule__ParserRule__WildcardAssignment_0_0_2_0 )
                    // InternalXtext.g:1727:2: rule__ParserRule__WildcardAssignment_0_0_2_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ParserRule__WildcardAssignment_0_0_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParserRuleAccess().getWildcardAssignment_0_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:1731:6: ( ( rule__ParserRule__Group_0_0_2_1__0 )? )
                    {
                    // InternalXtext.g:1731:6: ( ( rule__ParserRule__Group_0_0_2_1__0 )? )
                    // InternalXtext.g:1732:1: ( rule__ParserRule__Group_0_0_2_1__0 )?
                    {
                     before(grammarAccess.getParserRuleAccess().getGroup_0_0_2_1()); 
                    // InternalXtext.g:1733:1: ( rule__ParserRule__Group_0_0_2_1__0 )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==34) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalXtext.g:1733:2: rule__ParserRule__Group_0_0_2_1__0
                            {
                            pushFollow(FollowSets000.FOLLOW_2);
                            rule__ParserRule__Group_0_0_2_1__0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getParserRuleAccess().getGroup_0_0_2_1()); 

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
    // $ANTLR end "rule__ParserRule__Alternatives_0_0_2"


    // $ANTLR start "rule__ParserRule__Alternatives_4"
    // InternalXtext.g:1742:1: rule__ParserRule__Alternatives_4 : ( ( ':' ) | ( '#' ) );
    public final void rule__ParserRule__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:1746:1: ( ( ':' ) | ( '#' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalXtext.g:1747:1: ( ':' )
                    {
                    // InternalXtext.g:1747:1: ( ':' )
                    // InternalXtext.g:1748:1: ':'
                    {
                     before(grammarAccess.getParserRuleAccess().getColonKeyword_4_0()); 
                    match(input,11,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getParserRuleAccess().getColonKeyword_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:1755:6: ( '#' )
                    {
                    // InternalXtext.g:1755:6: ( '#' )
                    // InternalXtext.g:1756:1: '#'
                    {
                     before(grammarAccess.getParserRuleAccess().getNumberSignKeyword_4_1()); 
                    match(input,12,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getParserRuleAccess().getNumberSignKeyword_4_1()); 

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
    // $ANTLR end "rule__ParserRule__Alternatives_4"


    // $ANTLR start "rule__MyInitAfterActions__Alternatives_0"
    // InternalXtext.g:1768:1: rule__MyInitAfterActions__Alternatives_0 : ( ( '@init' ) | ( '@after' ) );
    public final void rule__MyInitAfterActions__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:1772:1: ( ( '@init' ) | ( '@after' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            else if ( (LA7_0==14) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalXtext.g:1773:1: ( '@init' )
                    {
                    // InternalXtext.g:1773:1: ( '@init' )
                    // InternalXtext.g:1774:1: '@init'
                    {
                     before(grammarAccess.getMyInitAfterActionsAccess().getInitKeyword_0_0()); 
                    match(input,13,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getMyInitAfterActionsAccess().getInitKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:1781:6: ( '@after' )
                    {
                    // InternalXtext.g:1781:6: ( '@after' )
                    // InternalXtext.g:1782:1: '@after'
                    {
                     before(grammarAccess.getMyInitAfterActionsAccess().getAfterKeyword_0_1()); 
                    match(input,14,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getMyInitAfterActionsAccess().getAfterKeyword_0_1()); 

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
    // $ANTLR end "rule__MyInitAfterActions__Alternatives_0"


    // $ANTLR start "rule__ConditionalBranch__Alternatives"
    // InternalXtext.g:1794:1: rule__ConditionalBranch__Alternatives : ( ( ruleUnorderedGroup ) | ( ( rule__ConditionalBranch__Group_1__0 ) ) );
    public final void rule__ConditionalBranch__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:1798:1: ( ( ruleUnorderedGroup ) | ( ( rule__ConditionalBranch__Group_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_STRING)||(LA8_0>=20 && LA8_0<=21)||LA8_0==26||LA8_0==35||LA8_0==47||LA8_0==53) ) {
                alt8=1;
            }
            else if ( (LA8_0==37) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalXtext.g:1799:1: ( ruleUnorderedGroup )
                    {
                    // InternalXtext.g:1799:1: ( ruleUnorderedGroup )
                    // InternalXtext.g:1800:1: ruleUnorderedGroup
                    {
                     before(grammarAccess.getConditionalBranchAccess().getUnorderedGroupParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleUnorderedGroup();

                    state._fsp--;

                     after(grammarAccess.getConditionalBranchAccess().getUnorderedGroupParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:1805:6: ( ( rule__ConditionalBranch__Group_1__0 ) )
                    {
                    // InternalXtext.g:1805:6: ( ( rule__ConditionalBranch__Group_1__0 ) )
                    // InternalXtext.g:1806:1: ( rule__ConditionalBranch__Group_1__0 )
                    {
                     before(grammarAccess.getConditionalBranchAccess().getGroup_1()); 
                    // InternalXtext.g:1807:1: ( rule__ConditionalBranch__Group_1__0 )
                    // InternalXtext.g:1807:2: rule__ConditionalBranch__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ConditionalBranch__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionalBranchAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ConditionalBranch__Alternatives"


    // $ANTLR start "rule__AbstractToken__Alternatives"
    // InternalXtext.g:1816:1: rule__AbstractToken__Alternatives : ( ( ruleAbstractTokenWithCardinality ) | ( ruleAction ) );
    public final void rule__AbstractToken__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:1820:1: ( ( ruleAbstractTokenWithCardinality ) | ( ruleAction ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_STRING)||(LA9_0>=20 && LA9_0<=21)||LA9_0==26||LA9_0==47||LA9_0==53) ) {
                alt9=1;
            }
            else if ( (LA9_0==35) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalXtext.g:1821:1: ( ruleAbstractTokenWithCardinality )
                    {
                    // InternalXtext.g:1821:1: ( ruleAbstractTokenWithCardinality )
                    // InternalXtext.g:1822:1: ruleAbstractTokenWithCardinality
                    {
                     before(grammarAccess.getAbstractTokenAccess().getAbstractTokenWithCardinalityParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAbstractTokenWithCardinality();

                    state._fsp--;

                     after(grammarAccess.getAbstractTokenAccess().getAbstractTokenWithCardinalityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:1827:6: ( ruleAction )
                    {
                    // InternalXtext.g:1827:6: ( ruleAction )
                    // InternalXtext.g:1828:1: ruleAction
                    {
                     before(grammarAccess.getAbstractTokenAccess().getActionParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAction();

                    state._fsp--;

                     after(grammarAccess.getAbstractTokenAccess().getActionParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractToken__Alternatives"


    // $ANTLR start "rule__AbstractTokenWithCardinality__Alternatives_0"
    // InternalXtext.g:1838:1: rule__AbstractTokenWithCardinality__Alternatives_0 : ( ( ruleAssignment ) | ( ruleAbstractTerminal ) );
    public final void rule__AbstractTokenWithCardinality__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:1842:1: ( ( ruleAssignment ) | ( ruleAbstractTerminal ) )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalXtext.g:1843:1: ( ruleAssignment )
                    {
                    // InternalXtext.g:1843:1: ( ruleAssignment )
                    // InternalXtext.g:1844:1: ruleAssignment
                    {
                     before(grammarAccess.getAbstractTokenWithCardinalityAccess().getAssignmentParserRuleCall_0_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAssignment();

                    state._fsp--;

                     after(grammarAccess.getAbstractTokenWithCardinalityAccess().getAssignmentParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:1849:6: ( ruleAbstractTerminal )
                    {
                    // InternalXtext.g:1849:6: ( ruleAbstractTerminal )
                    // InternalXtext.g:1850:1: ruleAbstractTerminal
                    {
                     before(grammarAccess.getAbstractTokenWithCardinalityAccess().getAbstractTerminalParserRuleCall_0_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAbstractTerminal();

                    state._fsp--;

                     after(grammarAccess.getAbstractTokenWithCardinalityAccess().getAbstractTerminalParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__AbstractTokenWithCardinality__Alternatives_0"


    // $ANTLR start "rule__AbstractTokenWithCardinality__CardinalityAlternatives_1_0"
    // InternalXtext.g:1860:1: rule__AbstractTokenWithCardinality__CardinalityAlternatives_1_0 : ( ( '?' ) | ( '*' ) | ( '+' ) );
    public final void rule__AbstractTokenWithCardinality__CardinalityAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:1864:1: ( ( '?' ) | ( '*' ) | ( '+' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt11=1;
                }
                break;
            case 16:
                {
                alt11=2;
                }
                break;
            case 17:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalXtext.g:1865:1: ( '?' )
                    {
                    // InternalXtext.g:1865:1: ( '?' )
                    // InternalXtext.g:1866:1: '?'
                    {
                     before(grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityQuestionMarkKeyword_1_0_0()); 
                    match(input,15,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityQuestionMarkKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:1873:6: ( '*' )
                    {
                    // InternalXtext.g:1873:6: ( '*' )
                    // InternalXtext.g:1874:1: '*'
                    {
                     before(grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityAsteriskKeyword_1_0_1()); 
                    match(input,16,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityAsteriskKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXtext.g:1881:6: ( '+' )
                    {
                    // InternalXtext.g:1881:6: ( '+' )
                    // InternalXtext.g:1882:1: '+'
                    {
                     before(grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityPlusSignKeyword_1_0_2()); 
                    match(input,17,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityPlusSignKeyword_1_0_2()); 

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
    // $ANTLR end "rule__AbstractTokenWithCardinality__CardinalityAlternatives_1_0"


    // $ANTLR start "rule__Action__OperatorAlternatives_2_2_0"
    // InternalXtext.g:1894:1: rule__Action__OperatorAlternatives_2_2_0 : ( ( '=' ) | ( '+=' ) );
    public final void rule__Action__OperatorAlternatives_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:1898:1: ( ( '=' ) | ( '+=' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            else if ( (LA12_0==19) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalXtext.g:1899:1: ( '=' )
                    {
                    // InternalXtext.g:1899:1: ( '=' )
                    // InternalXtext.g:1900:1: '='
                    {
                     before(grammarAccess.getActionAccess().getOperatorEqualsSignKeyword_2_2_0_0()); 
                    match(input,18,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getActionAccess().getOperatorEqualsSignKeyword_2_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:1907:6: ( '+=' )
                    {
                    // InternalXtext.g:1907:6: ( '+=' )
                    // InternalXtext.g:1908:1: '+='
                    {
                     before(grammarAccess.getActionAccess().getOperatorPlusSignEqualsSignKeyword_2_2_0_1()); 
                    match(input,19,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getActionAccess().getOperatorPlusSignEqualsSignKeyword_2_2_0_1()); 

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
    // $ANTLR end "rule__Action__OperatorAlternatives_2_2_0"


    // $ANTLR start "rule__AbstractTerminal__Alternatives"
    // InternalXtext.g:1920:1: rule__AbstractTerminal__Alternatives : ( ( ruleKeyword ) | ( ruleRuleCall ) | ( ruleParenthesizedElement ) | ( rulePredicatedKeyword ) | ( rulePredicatedRuleCall ) | ( rulePredicatedGroup ) );
    public final void rule__AbstractTerminal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:1924:1: ( ( ruleKeyword ) | ( ruleRuleCall ) | ( ruleParenthesizedElement ) | ( rulePredicatedKeyword ) | ( rulePredicatedRuleCall ) | ( rulePredicatedGroup ) )
            int alt13=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt13=1;
                }
                break;
            case RULE_ID:
            case 20:
            case 21:
                {
                alt13=2;
                }
                break;
            case 26:
                {
                alt13=3;
                }
                break;
            case 53:
                {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                    {
                    alt13=4;
                    }
                    break;
                case RULE_ID:
                case 20:
                case 21:
                    {
                    alt13=5;
                    }
                    break;
                case 26:
                    {
                    alt13=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 4, input);

                    throw nvae;
                }

                }
                break;
            case 47:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                case 20:
                case 21:
                    {
                    alt13=5;
                    }
                    break;
                case 26:
                    {
                    alt13=6;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt13=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 5, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalXtext.g:1925:1: ( ruleKeyword )
                    {
                    // InternalXtext.g:1925:1: ( ruleKeyword )
                    // InternalXtext.g:1926:1: ruleKeyword
                    {
                     before(grammarAccess.getAbstractTerminalAccess().getKeywordParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleKeyword();

                    state._fsp--;

                     after(grammarAccess.getAbstractTerminalAccess().getKeywordParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:1931:6: ( ruleRuleCall )
                    {
                    // InternalXtext.g:1931:6: ( ruleRuleCall )
                    // InternalXtext.g:1932:1: ruleRuleCall
                    {
                     before(grammarAccess.getAbstractTerminalAccess().getRuleCallParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleRuleCall();

                    state._fsp--;

                     after(grammarAccess.getAbstractTerminalAccess().getRuleCallParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXtext.g:1937:6: ( ruleParenthesizedElement )
                    {
                    // InternalXtext.g:1937:6: ( ruleParenthesizedElement )
                    // InternalXtext.g:1938:1: ruleParenthesizedElement
                    {
                     before(grammarAccess.getAbstractTerminalAccess().getParenthesizedElementParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleParenthesizedElement();

                    state._fsp--;

                     after(grammarAccess.getAbstractTerminalAccess().getParenthesizedElementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXtext.g:1943:6: ( rulePredicatedKeyword )
                    {
                    // InternalXtext.g:1943:6: ( rulePredicatedKeyword )
                    // InternalXtext.g:1944:1: rulePredicatedKeyword
                    {
                     before(grammarAccess.getAbstractTerminalAccess().getPredicatedKeywordParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    rulePredicatedKeyword();

                    state._fsp--;

                     after(grammarAccess.getAbstractTerminalAccess().getPredicatedKeywordParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXtext.g:1949:6: ( rulePredicatedRuleCall )
                    {
                    // InternalXtext.g:1949:6: ( rulePredicatedRuleCall )
                    // InternalXtext.g:1950:1: rulePredicatedRuleCall
                    {
                     before(grammarAccess.getAbstractTerminalAccess().getPredicatedRuleCallParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    rulePredicatedRuleCall();

                    state._fsp--;

                     after(grammarAccess.getAbstractTerminalAccess().getPredicatedRuleCallParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalXtext.g:1955:6: ( rulePredicatedGroup )
                    {
                    // InternalXtext.g:1955:6: ( rulePredicatedGroup )
                    // InternalXtext.g:1956:1: rulePredicatedGroup
                    {
                     before(grammarAccess.getAbstractTerminalAccess().getPredicatedGroupParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    rulePredicatedGroup();

                    state._fsp--;

                     after(grammarAccess.getAbstractTerminalAccess().getPredicatedGroupParserRuleCall_5()); 

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
    // $ANTLR end "rule__AbstractTerminal__Alternatives"


    // $ANTLR start "rule__LiteralCondition__Alternatives_1"
    // InternalXtext.g:1966:1: rule__LiteralCondition__Alternatives_1 : ( ( ( rule__LiteralCondition__TrueAssignment_1_0 ) ) | ( 'false' ) );
    public final void rule__LiteralCondition__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:1970:1: ( ( ( rule__LiteralCondition__TrueAssignment_1_0 ) ) | ( 'false' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            else if ( (LA14_0==20) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalXtext.g:1971:1: ( ( rule__LiteralCondition__TrueAssignment_1_0 ) )
                    {
                    // InternalXtext.g:1971:1: ( ( rule__LiteralCondition__TrueAssignment_1_0 ) )
                    // InternalXtext.g:1972:1: ( rule__LiteralCondition__TrueAssignment_1_0 )
                    {
                     before(grammarAccess.getLiteralConditionAccess().getTrueAssignment_1_0()); 
                    // InternalXtext.g:1973:1: ( rule__LiteralCondition__TrueAssignment_1_0 )
                    // InternalXtext.g:1973:2: rule__LiteralCondition__TrueAssignment_1_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__LiteralCondition__TrueAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralConditionAccess().getTrueAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:1977:6: ( 'false' )
                    {
                    // InternalXtext.g:1977:6: ( 'false' )
                    // InternalXtext.g:1978:1: 'false'
                    {
                     before(grammarAccess.getLiteralConditionAccess().getFalseKeyword_1_1()); 
                    match(input,20,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getLiteralConditionAccess().getFalseKeyword_1_1()); 

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
    // $ANTLR end "rule__LiteralCondition__Alternatives_1"


    // $ANTLR start "rule__Negation__Alternatives"
    // InternalXtext.g:1990:1: rule__Negation__Alternatives : ( ( ruleAtom ) | ( ( rule__Negation__Group_1__0 ) ) );
    public final void rule__Negation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:1994:1: ( ( ruleAtom ) | ( ( rule__Negation__Group_1__0 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID||(LA15_0>=20 && LA15_0<=21)||LA15_0==26) ) {
                alt15=1;
            }
            else if ( (LA15_0==43) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalXtext.g:1995:1: ( ruleAtom )
                    {
                    // InternalXtext.g:1995:1: ( ruleAtom )
                    // InternalXtext.g:1996:1: ruleAtom
                    {
                     before(grammarAccess.getNegationAccess().getAtomParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAtom();

                    state._fsp--;

                     after(grammarAccess.getNegationAccess().getAtomParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:2001:6: ( ( rule__Negation__Group_1__0 ) )
                    {
                    // InternalXtext.g:2001:6: ( ( rule__Negation__Group_1__0 ) )
                    // InternalXtext.g:2002:1: ( rule__Negation__Group_1__0 )
                    {
                     before(grammarAccess.getNegationAccess().getGroup_1()); 
                    // InternalXtext.g:2003:1: ( rule__Negation__Group_1__0 )
                    // InternalXtext.g:2003:2: rule__Negation__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Negation__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNegationAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Negation__Alternatives"


    // $ANTLR start "rule__Atom__Alternatives"
    // InternalXtext.g:2012:1: rule__Atom__Alternatives : ( ( ruleParameterReference ) | ( ruleParenthesizedCondition ) | ( ruleLiteralCondition ) );
    public final void rule__Atom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2016:1: ( ( ruleParameterReference ) | ( ruleParenthesizedCondition ) | ( ruleLiteralCondition ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt16=1;
                }
                break;
            case 26:
                {
                alt16=2;
                }
                break;
            case 20:
            case 21:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalXtext.g:2017:1: ( ruleParameterReference )
                    {
                    // InternalXtext.g:2017:1: ( ruleParameterReference )
                    // InternalXtext.g:2018:1: ruleParameterReference
                    {
                     before(grammarAccess.getAtomAccess().getParameterReferenceParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleParameterReference();

                    state._fsp--;

                     after(grammarAccess.getAtomAccess().getParameterReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:2023:6: ( ruleParenthesizedCondition )
                    {
                    // InternalXtext.g:2023:6: ( ruleParenthesizedCondition )
                    // InternalXtext.g:2024:1: ruleParenthesizedCondition
                    {
                     before(grammarAccess.getAtomAccess().getParenthesizedConditionParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleParenthesizedCondition();

                    state._fsp--;

                     after(grammarAccess.getAtomAccess().getParenthesizedConditionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXtext.g:2029:6: ( ruleLiteralCondition )
                    {
                    // InternalXtext.g:2029:6: ( ruleLiteralCondition )
                    // InternalXtext.g:2030:1: ruleLiteralCondition
                    {
                     before(grammarAccess.getAtomAccess().getLiteralConditionParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleLiteralCondition();

                    state._fsp--;

                     after(grammarAccess.getAtomAccess().getLiteralConditionParserRuleCall_2()); 

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
    // $ANTLR end "rule__Atom__Alternatives"


    // $ANTLR start "rule__ValidID__Alternatives"
    // InternalXtext.g:2040:1: rule__ValidID__Alternatives : ( ( RULE_ID ) | ( 'true' ) | ( 'false' ) );
    public final void rule__ValidID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2044:1: ( ( RULE_ID ) | ( 'true' ) | ( 'false' ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt17=1;
                }
                break;
            case 21:
                {
                alt17=2;
                }
                break;
            case 20:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalXtext.g:2045:1: ( RULE_ID )
                    {
                    // InternalXtext.g:2045:1: ( RULE_ID )
                    // InternalXtext.g:2046:1: RULE_ID
                    {
                     before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:2051:6: ( 'true' )
                    {
                    // InternalXtext.g:2051:6: ( 'true' )
                    // InternalXtext.g:2052:1: 'true'
                    {
                     before(grammarAccess.getValidIDAccess().getTrueKeyword_1()); 
                    match(input,21,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getValidIDAccess().getTrueKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXtext.g:2059:6: ( 'false' )
                    {
                    // InternalXtext.g:2059:6: ( 'false' )
                    // InternalXtext.g:2060:1: 'false'
                    {
                     before(grammarAccess.getValidIDAccess().getFalseKeyword_2()); 
                    match(input,20,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getValidIDAccess().getFalseKeyword_2()); 

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
    // $ANTLR end "rule__ValidID__Alternatives"


    // $ANTLR start "rule__PredicatedKeyword__Alternatives_0"
    // InternalXtext.g:2072:1: rule__PredicatedKeyword__Alternatives_0 : ( ( ( rule__PredicatedKeyword__PredicatedAssignment_0_0 ) ) | ( ( rule__PredicatedKeyword__FirstSetPredicatedAssignment_0_1 ) ) );
    public final void rule__PredicatedKeyword__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2076:1: ( ( ( rule__PredicatedKeyword__PredicatedAssignment_0_0 ) ) | ( ( rule__PredicatedKeyword__FirstSetPredicatedAssignment_0_1 ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==53) ) {
                alt18=1;
            }
            else if ( (LA18_0==47) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalXtext.g:2077:1: ( ( rule__PredicatedKeyword__PredicatedAssignment_0_0 ) )
                    {
                    // InternalXtext.g:2077:1: ( ( rule__PredicatedKeyword__PredicatedAssignment_0_0 ) )
                    // InternalXtext.g:2078:1: ( rule__PredicatedKeyword__PredicatedAssignment_0_0 )
                    {
                     before(grammarAccess.getPredicatedKeywordAccess().getPredicatedAssignment_0_0()); 
                    // InternalXtext.g:2079:1: ( rule__PredicatedKeyword__PredicatedAssignment_0_0 )
                    // InternalXtext.g:2079:2: rule__PredicatedKeyword__PredicatedAssignment_0_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__PredicatedKeyword__PredicatedAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPredicatedKeywordAccess().getPredicatedAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:2083:6: ( ( rule__PredicatedKeyword__FirstSetPredicatedAssignment_0_1 ) )
                    {
                    // InternalXtext.g:2083:6: ( ( rule__PredicatedKeyword__FirstSetPredicatedAssignment_0_1 ) )
                    // InternalXtext.g:2084:1: ( rule__PredicatedKeyword__FirstSetPredicatedAssignment_0_1 )
                    {
                     before(grammarAccess.getPredicatedKeywordAccess().getFirstSetPredicatedAssignment_0_1()); 
                    // InternalXtext.g:2085:1: ( rule__PredicatedKeyword__FirstSetPredicatedAssignment_0_1 )
                    // InternalXtext.g:2085:2: rule__PredicatedKeyword__FirstSetPredicatedAssignment_0_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__PredicatedKeyword__FirstSetPredicatedAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPredicatedKeywordAccess().getFirstSetPredicatedAssignment_0_1()); 

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
    // $ANTLR end "rule__PredicatedKeyword__Alternatives_0"


    // $ANTLR start "rule__PredicatedRuleCall__Alternatives_0"
    // InternalXtext.g:2094:1: rule__PredicatedRuleCall__Alternatives_0 : ( ( ( rule__PredicatedRuleCall__PredicatedAssignment_0_0 ) ) | ( ( rule__PredicatedRuleCall__FirstSetPredicatedAssignment_0_1 ) ) );
    public final void rule__PredicatedRuleCall__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2098:1: ( ( ( rule__PredicatedRuleCall__PredicatedAssignment_0_0 ) ) | ( ( rule__PredicatedRuleCall__FirstSetPredicatedAssignment_0_1 ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==53) ) {
                alt19=1;
            }
            else if ( (LA19_0==47) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalXtext.g:2099:1: ( ( rule__PredicatedRuleCall__PredicatedAssignment_0_0 ) )
                    {
                    // InternalXtext.g:2099:1: ( ( rule__PredicatedRuleCall__PredicatedAssignment_0_0 ) )
                    // InternalXtext.g:2100:1: ( rule__PredicatedRuleCall__PredicatedAssignment_0_0 )
                    {
                     before(grammarAccess.getPredicatedRuleCallAccess().getPredicatedAssignment_0_0()); 
                    // InternalXtext.g:2101:1: ( rule__PredicatedRuleCall__PredicatedAssignment_0_0 )
                    // InternalXtext.g:2101:2: rule__PredicatedRuleCall__PredicatedAssignment_0_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__PredicatedRuleCall__PredicatedAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPredicatedRuleCallAccess().getPredicatedAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:2105:6: ( ( rule__PredicatedRuleCall__FirstSetPredicatedAssignment_0_1 ) )
                    {
                    // InternalXtext.g:2105:6: ( ( rule__PredicatedRuleCall__FirstSetPredicatedAssignment_0_1 ) )
                    // InternalXtext.g:2106:1: ( rule__PredicatedRuleCall__FirstSetPredicatedAssignment_0_1 )
                    {
                     before(grammarAccess.getPredicatedRuleCallAccess().getFirstSetPredicatedAssignment_0_1()); 
                    // InternalXtext.g:2107:1: ( rule__PredicatedRuleCall__FirstSetPredicatedAssignment_0_1 )
                    // InternalXtext.g:2107:2: rule__PredicatedRuleCall__FirstSetPredicatedAssignment_0_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__PredicatedRuleCall__FirstSetPredicatedAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPredicatedRuleCallAccess().getFirstSetPredicatedAssignment_0_1()); 

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
    // $ANTLR end "rule__PredicatedRuleCall__Alternatives_0"


    // $ANTLR start "rule__Assignment__Alternatives_0"
    // InternalXtext.g:2116:1: rule__Assignment__Alternatives_0 : ( ( ( rule__Assignment__PredicatedAssignment_0_0 ) ) | ( ( rule__Assignment__FirstSetPredicatedAssignment_0_1 ) ) );
    public final void rule__Assignment__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2120:1: ( ( ( rule__Assignment__PredicatedAssignment_0_0 ) ) | ( ( rule__Assignment__FirstSetPredicatedAssignment_0_1 ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==53) ) {
                alt20=1;
            }
            else if ( (LA20_0==47) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalXtext.g:2121:1: ( ( rule__Assignment__PredicatedAssignment_0_0 ) )
                    {
                    // InternalXtext.g:2121:1: ( ( rule__Assignment__PredicatedAssignment_0_0 ) )
                    // InternalXtext.g:2122:1: ( rule__Assignment__PredicatedAssignment_0_0 )
                    {
                     before(grammarAccess.getAssignmentAccess().getPredicatedAssignment_0_0()); 
                    // InternalXtext.g:2123:1: ( rule__Assignment__PredicatedAssignment_0_0 )
                    // InternalXtext.g:2123:2: rule__Assignment__PredicatedAssignment_0_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Assignment__PredicatedAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssignmentAccess().getPredicatedAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:2127:6: ( ( rule__Assignment__FirstSetPredicatedAssignment_0_1 ) )
                    {
                    // InternalXtext.g:2127:6: ( ( rule__Assignment__FirstSetPredicatedAssignment_0_1 ) )
                    // InternalXtext.g:2128:1: ( rule__Assignment__FirstSetPredicatedAssignment_0_1 )
                    {
                     before(grammarAccess.getAssignmentAccess().getFirstSetPredicatedAssignment_0_1()); 
                    // InternalXtext.g:2129:1: ( rule__Assignment__FirstSetPredicatedAssignment_0_1 )
                    // InternalXtext.g:2129:2: rule__Assignment__FirstSetPredicatedAssignment_0_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Assignment__FirstSetPredicatedAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssignmentAccess().getFirstSetPredicatedAssignment_0_1()); 

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
    // $ANTLR end "rule__Assignment__Alternatives_0"


    // $ANTLR start "rule__Assignment__OperatorAlternatives_2_0"
    // InternalXtext.g:2138:1: rule__Assignment__OperatorAlternatives_2_0 : ( ( '+=' ) | ( '=' ) | ( '?=' ) );
    public final void rule__Assignment__OperatorAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2142:1: ( ( '+=' ) | ( '=' ) | ( '?=' ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt21=1;
                }
                break;
            case 18:
                {
                alt21=2;
                }
                break;
            case 22:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalXtext.g:2143:1: ( '+=' )
                    {
                    // InternalXtext.g:2143:1: ( '+=' )
                    // InternalXtext.g:2144:1: '+='
                    {
                     before(grammarAccess.getAssignmentAccess().getOperatorPlusSignEqualsSignKeyword_2_0_0()); 
                    match(input,19,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getAssignmentAccess().getOperatorPlusSignEqualsSignKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:2151:6: ( '=' )
                    {
                    // InternalXtext.g:2151:6: ( '=' )
                    // InternalXtext.g:2152:1: '='
                    {
                     before(grammarAccess.getAssignmentAccess().getOperatorEqualsSignKeyword_2_0_1()); 
                    match(input,18,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getAssignmentAccess().getOperatorEqualsSignKeyword_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXtext.g:2159:6: ( '?=' )
                    {
                    // InternalXtext.g:2159:6: ( '?=' )
                    // InternalXtext.g:2160:1: '?='
                    {
                     before(grammarAccess.getAssignmentAccess().getOperatorQuestionMarkEqualsSignKeyword_2_0_2()); 
                    match(input,22,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getAssignmentAccess().getOperatorQuestionMarkEqualsSignKeyword_2_0_2()); 

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
    // $ANTLR end "rule__Assignment__OperatorAlternatives_2_0"


    // $ANTLR start "rule__AssignableTerminal__Alternatives"
    // InternalXtext.g:2172:1: rule__AssignableTerminal__Alternatives : ( ( ruleKeyword ) | ( ruleRuleCall ) | ( ruleParenthesizedAssignableElement ) | ( ruleCrossReference ) );
    public final void rule__AssignableTerminal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2176:1: ( ( ruleKeyword ) | ( ruleRuleCall ) | ( ruleParenthesizedAssignableElement ) | ( ruleCrossReference ) )
            int alt22=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt22=1;
                }
                break;
            case RULE_ID:
            case 20:
            case 21:
                {
                alt22=2;
                }
                break;
            case 26:
                {
                alt22=3;
                }
                break;
            case 44:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalXtext.g:2177:1: ( ruleKeyword )
                    {
                    // InternalXtext.g:2177:1: ( ruleKeyword )
                    // InternalXtext.g:2178:1: ruleKeyword
                    {
                     before(grammarAccess.getAssignableTerminalAccess().getKeywordParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleKeyword();

                    state._fsp--;

                     after(grammarAccess.getAssignableTerminalAccess().getKeywordParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:2183:6: ( ruleRuleCall )
                    {
                    // InternalXtext.g:2183:6: ( ruleRuleCall )
                    // InternalXtext.g:2184:1: ruleRuleCall
                    {
                     before(grammarAccess.getAssignableTerminalAccess().getRuleCallParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleRuleCall();

                    state._fsp--;

                     after(grammarAccess.getAssignableTerminalAccess().getRuleCallParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXtext.g:2189:6: ( ruleParenthesizedAssignableElement )
                    {
                    // InternalXtext.g:2189:6: ( ruleParenthesizedAssignableElement )
                    // InternalXtext.g:2190:1: ruleParenthesizedAssignableElement
                    {
                     before(grammarAccess.getAssignableTerminalAccess().getParenthesizedAssignableElementParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleParenthesizedAssignableElement();

                    state._fsp--;

                     after(grammarAccess.getAssignableTerminalAccess().getParenthesizedAssignableElementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXtext.g:2195:6: ( ruleCrossReference )
                    {
                    // InternalXtext.g:2195:6: ( ruleCrossReference )
                    // InternalXtext.g:2196:1: ruleCrossReference
                    {
                     before(grammarAccess.getAssignableTerminalAccess().getCrossReferenceParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleCrossReference();

                    state._fsp--;

                     after(grammarAccess.getAssignableTerminalAccess().getCrossReferenceParserRuleCall_3()); 

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
    // $ANTLR end "rule__AssignableTerminal__Alternatives"


    // $ANTLR start "rule__CrossReferenceableTerminal__Alternatives"
    // InternalXtext.g:2206:1: rule__CrossReferenceableTerminal__Alternatives : ( ( ruleKeyword ) | ( ruleRuleCall ) );
    public final void rule__CrossReferenceableTerminal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2210:1: ( ( ruleKeyword ) | ( ruleRuleCall ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_ID||(LA23_0>=20 && LA23_0<=21)) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalXtext.g:2211:1: ( ruleKeyword )
                    {
                    // InternalXtext.g:2211:1: ( ruleKeyword )
                    // InternalXtext.g:2212:1: ruleKeyword
                    {
                     before(grammarAccess.getCrossReferenceableTerminalAccess().getKeywordParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleKeyword();

                    state._fsp--;

                     after(grammarAccess.getCrossReferenceableTerminalAccess().getKeywordParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:2217:6: ( ruleRuleCall )
                    {
                    // InternalXtext.g:2217:6: ( ruleRuleCall )
                    // InternalXtext.g:2218:1: ruleRuleCall
                    {
                     before(grammarAccess.getCrossReferenceableTerminalAccess().getRuleCallParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleRuleCall();

                    state._fsp--;

                     after(grammarAccess.getCrossReferenceableTerminalAccess().getRuleCallParserRuleCall_1()); 

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
    // $ANTLR end "rule__CrossReferenceableTerminal__Alternatives"


    // $ANTLR start "rule__PredicatedGroup__Alternatives_0"
    // InternalXtext.g:2228:1: rule__PredicatedGroup__Alternatives_0 : ( ( ( rule__PredicatedGroup__PredicatedAssignment_0_0 ) ) | ( ( rule__PredicatedGroup__FirstSetPredicatedAssignment_0_1 ) ) );
    public final void rule__PredicatedGroup__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2232:1: ( ( ( rule__PredicatedGroup__PredicatedAssignment_0_0 ) ) | ( ( rule__PredicatedGroup__FirstSetPredicatedAssignment_0_1 ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==53) ) {
                alt24=1;
            }
            else if ( (LA24_0==47) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalXtext.g:2233:1: ( ( rule__PredicatedGroup__PredicatedAssignment_0_0 ) )
                    {
                    // InternalXtext.g:2233:1: ( ( rule__PredicatedGroup__PredicatedAssignment_0_0 ) )
                    // InternalXtext.g:2234:1: ( rule__PredicatedGroup__PredicatedAssignment_0_0 )
                    {
                     before(grammarAccess.getPredicatedGroupAccess().getPredicatedAssignment_0_0()); 
                    // InternalXtext.g:2235:1: ( rule__PredicatedGroup__PredicatedAssignment_0_0 )
                    // InternalXtext.g:2235:2: rule__PredicatedGroup__PredicatedAssignment_0_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__PredicatedGroup__PredicatedAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPredicatedGroupAccess().getPredicatedAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:2239:6: ( ( rule__PredicatedGroup__FirstSetPredicatedAssignment_0_1 ) )
                    {
                    // InternalXtext.g:2239:6: ( ( rule__PredicatedGroup__FirstSetPredicatedAssignment_0_1 ) )
                    // InternalXtext.g:2240:1: ( rule__PredicatedGroup__FirstSetPredicatedAssignment_0_1 )
                    {
                     before(grammarAccess.getPredicatedGroupAccess().getFirstSetPredicatedAssignment_0_1()); 
                    // InternalXtext.g:2241:1: ( rule__PredicatedGroup__FirstSetPredicatedAssignment_0_1 )
                    // InternalXtext.g:2241:2: rule__PredicatedGroup__FirstSetPredicatedAssignment_0_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__PredicatedGroup__FirstSetPredicatedAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPredicatedGroupAccess().getFirstSetPredicatedAssignment_0_1()); 

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
    // $ANTLR end "rule__PredicatedGroup__Alternatives_0"


    // $ANTLR start "rule__TerminalRule__Alternatives_1"
    // InternalXtext.g:2250:1: rule__TerminalRule__Alternatives_1 : ( ( ( rule__TerminalRule__Group_1_0__0 ) ) | ( ( rule__TerminalRule__Group_1_1__0 ) ) );
    public final void rule__TerminalRule__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2254:1: ( ( ( rule__TerminalRule__Group_1_0__0 ) ) | ( ( rule__TerminalRule__Group_1_1__0 ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==52) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_ID||(LA25_0>=20 && LA25_0<=21)) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalXtext.g:2255:1: ( ( rule__TerminalRule__Group_1_0__0 ) )
                    {
                    // InternalXtext.g:2255:1: ( ( rule__TerminalRule__Group_1_0__0 ) )
                    // InternalXtext.g:2256:1: ( rule__TerminalRule__Group_1_0__0 )
                    {
                     before(grammarAccess.getTerminalRuleAccess().getGroup_1_0()); 
                    // InternalXtext.g:2257:1: ( rule__TerminalRule__Group_1_0__0 )
                    // InternalXtext.g:2257:2: rule__TerminalRule__Group_1_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TerminalRule__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalRuleAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:2261:6: ( ( rule__TerminalRule__Group_1_1__0 ) )
                    {
                    // InternalXtext.g:2261:6: ( ( rule__TerminalRule__Group_1_1__0 ) )
                    // InternalXtext.g:2262:1: ( rule__TerminalRule__Group_1_1__0 )
                    {
                     before(grammarAccess.getTerminalRuleAccess().getGroup_1_1()); 
                    // InternalXtext.g:2263:1: ( rule__TerminalRule__Group_1_1__0 )
                    // InternalXtext.g:2263:2: rule__TerminalRule__Group_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TerminalRule__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalRuleAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__TerminalRule__Alternatives_1"


    // $ANTLR start "rule__TerminalToken__CardinalityAlternatives_1_0"
    // InternalXtext.g:2272:1: rule__TerminalToken__CardinalityAlternatives_1_0 : ( ( '?' ) | ( '*' ) | ( '+' ) );
    public final void rule__TerminalToken__CardinalityAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2276:1: ( ( '?' ) | ( '*' ) | ( '+' ) )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt26=1;
                }
                break;
            case 16:
                {
                alt26=2;
                }
                break;
            case 17:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalXtext.g:2277:1: ( '?' )
                    {
                    // InternalXtext.g:2277:1: ( '?' )
                    // InternalXtext.g:2278:1: '?'
                    {
                     before(grammarAccess.getTerminalTokenAccess().getCardinalityQuestionMarkKeyword_1_0_0()); 
                    match(input,15,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getTerminalTokenAccess().getCardinalityQuestionMarkKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:2285:6: ( '*' )
                    {
                    // InternalXtext.g:2285:6: ( '*' )
                    // InternalXtext.g:2286:1: '*'
                    {
                     before(grammarAccess.getTerminalTokenAccess().getCardinalityAsteriskKeyword_1_0_1()); 
                    match(input,16,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getTerminalTokenAccess().getCardinalityAsteriskKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXtext.g:2293:6: ( '+' )
                    {
                    // InternalXtext.g:2293:6: ( '+' )
                    // InternalXtext.g:2294:1: '+'
                    {
                     before(grammarAccess.getTerminalTokenAccess().getCardinalityPlusSignKeyword_1_0_2()); 
                    match(input,17,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getTerminalTokenAccess().getCardinalityPlusSignKeyword_1_0_2()); 

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
    // $ANTLR end "rule__TerminalToken__CardinalityAlternatives_1_0"


    // $ANTLR start "rule__TerminalTokenElement__Alternatives"
    // InternalXtext.g:2306:1: rule__TerminalTokenElement__Alternatives : ( ( ruleCharacterRange ) | ( ruleTerminalRuleCall ) | ( ruleParenthesizedTerminalElement ) | ( ruleAbstractNegatedToken ) | ( ruleWildcard ) | ( ruleEOF ) );
    public final void rule__TerminalTokenElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2310:1: ( ( ruleCharacterRange ) | ( ruleTerminalRuleCall ) | ( ruleParenthesizedTerminalElement ) | ( ruleAbstractNegatedToken ) | ( ruleWildcard ) | ( ruleEOF ) )
            int alt27=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt27=1;
                }
                break;
            case RULE_ID:
            case 20:
            case 21:
                {
                alt27=2;
                }
                break;
            case 26:
                {
                alt27=3;
                }
                break;
            case 43:
            case 47:
                {
                alt27=4;
                }
                break;
            case 28:
                {
                alt27=5;
                }
                break;
            case 48:
                {
                alt27=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalXtext.g:2311:1: ( ruleCharacterRange )
                    {
                    // InternalXtext.g:2311:1: ( ruleCharacterRange )
                    // InternalXtext.g:2312:1: ruleCharacterRange
                    {
                     before(grammarAccess.getTerminalTokenElementAccess().getCharacterRangeParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleCharacterRange();

                    state._fsp--;

                     after(grammarAccess.getTerminalTokenElementAccess().getCharacterRangeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:2317:6: ( ruleTerminalRuleCall )
                    {
                    // InternalXtext.g:2317:6: ( ruleTerminalRuleCall )
                    // InternalXtext.g:2318:1: ruleTerminalRuleCall
                    {
                     before(grammarAccess.getTerminalTokenElementAccess().getTerminalRuleCallParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTerminalRuleCall();

                    state._fsp--;

                     after(grammarAccess.getTerminalTokenElementAccess().getTerminalRuleCallParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXtext.g:2323:6: ( ruleParenthesizedTerminalElement )
                    {
                    // InternalXtext.g:2323:6: ( ruleParenthesizedTerminalElement )
                    // InternalXtext.g:2324:1: ruleParenthesizedTerminalElement
                    {
                     before(grammarAccess.getTerminalTokenElementAccess().getParenthesizedTerminalElementParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleParenthesizedTerminalElement();

                    state._fsp--;

                     after(grammarAccess.getTerminalTokenElementAccess().getParenthesizedTerminalElementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXtext.g:2329:6: ( ruleAbstractNegatedToken )
                    {
                    // InternalXtext.g:2329:6: ( ruleAbstractNegatedToken )
                    // InternalXtext.g:2330:1: ruleAbstractNegatedToken
                    {
                     before(grammarAccess.getTerminalTokenElementAccess().getAbstractNegatedTokenParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAbstractNegatedToken();

                    state._fsp--;

                     after(grammarAccess.getTerminalTokenElementAccess().getAbstractNegatedTokenParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXtext.g:2335:6: ( ruleWildcard )
                    {
                    // InternalXtext.g:2335:6: ( ruleWildcard )
                    // InternalXtext.g:2336:1: ruleWildcard
                    {
                     before(grammarAccess.getTerminalTokenElementAccess().getWildcardParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleWildcard();

                    state._fsp--;

                     after(grammarAccess.getTerminalTokenElementAccess().getWildcardParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalXtext.g:2341:6: ( ruleEOF )
                    {
                    // InternalXtext.g:2341:6: ( ruleEOF )
                    // InternalXtext.g:2342:1: ruleEOF
                    {
                     before(grammarAccess.getTerminalTokenElementAccess().getEOFParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleEOF();

                    state._fsp--;

                     after(grammarAccess.getTerminalTokenElementAccess().getEOFParserRuleCall_5()); 

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
    // $ANTLR end "rule__TerminalTokenElement__Alternatives"


    // $ANTLR start "rule__AbstractNegatedToken__Alternatives"
    // InternalXtext.g:2352:1: rule__AbstractNegatedToken__Alternatives : ( ( ruleNegatedToken ) | ( ruleUntilToken ) );
    public final void rule__AbstractNegatedToken__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2356:1: ( ( ruleNegatedToken ) | ( ruleUntilToken ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==43) ) {
                alt28=1;
            }
            else if ( (LA28_0==47) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalXtext.g:2357:1: ( ruleNegatedToken )
                    {
                    // InternalXtext.g:2357:1: ( ruleNegatedToken )
                    // InternalXtext.g:2358:1: ruleNegatedToken
                    {
                     before(grammarAccess.getAbstractNegatedTokenAccess().getNegatedTokenParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleNegatedToken();

                    state._fsp--;

                     after(grammarAccess.getAbstractNegatedTokenAccess().getNegatedTokenParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtext.g:2363:6: ( ruleUntilToken )
                    {
                    // InternalXtext.g:2363:6: ( ruleUntilToken )
                    // InternalXtext.g:2364:1: ruleUntilToken
                    {
                     before(grammarAccess.getAbstractNegatedTokenAccess().getUntilTokenParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleUntilToken();

                    state._fsp--;

                     after(grammarAccess.getAbstractNegatedTokenAccess().getUntilTokenParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractNegatedToken__Alternatives"


    // $ANTLR start "rule__Grammar__Group__0"
    // InternalXtext.g:2376:1: rule__Grammar__Group__0 : rule__Grammar__Group__0__Impl rule__Grammar__Group__1 ;
    public final void rule__Grammar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2380:1: ( rule__Grammar__Group__0__Impl rule__Grammar__Group__1 )
            // InternalXtext.g:2381:2: rule__Grammar__Group__0__Impl rule__Grammar__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Grammar__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group__0"


    // $ANTLR start "rule__Grammar__Group__0__Impl"
    // InternalXtext.g:2388:1: rule__Grammar__Group__0__Impl : ( 'grammar' ) ;
    public final void rule__Grammar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2392:1: ( ( 'grammar' ) )
            // InternalXtext.g:2393:1: ( 'grammar' )
            {
            // InternalXtext.g:2393:1: ( 'grammar' )
            // InternalXtext.g:2394:1: 'grammar'
            {
             before(grammarAccess.getGrammarAccess().getGrammarKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getGrammarAccess().getGrammarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group__0__Impl"


    // $ANTLR start "rule__Grammar__Group__1"
    // InternalXtext.g:2407:1: rule__Grammar__Group__1 : rule__Grammar__Group__1__Impl rule__Grammar__Group__2 ;
    public final void rule__Grammar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2411:1: ( rule__Grammar__Group__1__Impl rule__Grammar__Group__2 )
            // InternalXtext.g:2412:2: rule__Grammar__Group__1__Impl rule__Grammar__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Grammar__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group__1"


    // $ANTLR start "rule__Grammar__Group__1__Impl"
    // InternalXtext.g:2419:1: rule__Grammar__Group__1__Impl : ( ( rule__Grammar__NameAssignment_1 ) ) ;
    public final void rule__Grammar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2423:1: ( ( ( rule__Grammar__NameAssignment_1 ) ) )
            // InternalXtext.g:2424:1: ( ( rule__Grammar__NameAssignment_1 ) )
            {
            // InternalXtext.g:2424:1: ( ( rule__Grammar__NameAssignment_1 ) )
            // InternalXtext.g:2425:1: ( rule__Grammar__NameAssignment_1 )
            {
             before(grammarAccess.getGrammarAccess().getNameAssignment_1()); 
            // InternalXtext.g:2426:1: ( rule__Grammar__NameAssignment_1 )
            // InternalXtext.g:2426:2: rule__Grammar__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGrammarAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group__1__Impl"


    // $ANTLR start "rule__Grammar__Group__2"
    // InternalXtext.g:2436:1: rule__Grammar__Group__2 : rule__Grammar__Group__2__Impl rule__Grammar__Group__3 ;
    public final void rule__Grammar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2440:1: ( rule__Grammar__Group__2__Impl rule__Grammar__Group__3 )
            // InternalXtext.g:2441:2: rule__Grammar__Group__2__Impl rule__Grammar__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Grammar__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group__2"


    // $ANTLR start "rule__Grammar__Group__2__Impl"
    // InternalXtext.g:2448:1: rule__Grammar__Group__2__Impl : ( ( rule__Grammar__Group_2__0 )? ) ;
    public final void rule__Grammar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2452:1: ( ( ( rule__Grammar__Group_2__0 )? ) )
            // InternalXtext.g:2453:1: ( ( rule__Grammar__Group_2__0 )? )
            {
            // InternalXtext.g:2453:1: ( ( rule__Grammar__Group_2__0 )? )
            // InternalXtext.g:2454:1: ( rule__Grammar__Group_2__0 )?
            {
             before(grammarAccess.getGrammarAccess().getGroup_2()); 
            // InternalXtext.g:2455:1: ( rule__Grammar__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==24) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalXtext.g:2455:2: rule__Grammar__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Grammar__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGrammarAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group__2__Impl"


    // $ANTLR start "rule__Grammar__Group__3"
    // InternalXtext.g:2465:1: rule__Grammar__Group__3 : rule__Grammar__Group__3__Impl rule__Grammar__Group__4 ;
    public final void rule__Grammar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2469:1: ( rule__Grammar__Group__3__Impl rule__Grammar__Group__4 )
            // InternalXtext.g:2470:2: rule__Grammar__Group__3__Impl rule__Grammar__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Grammar__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group__3"


    // $ANTLR start "rule__Grammar__Group__3__Impl"
    // InternalXtext.g:2477:1: rule__Grammar__Group__3__Impl : ( ( rule__Grammar__Group_3__0 )? ) ;
    public final void rule__Grammar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2481:1: ( ( ( rule__Grammar__Group_3__0 )? ) )
            // InternalXtext.g:2482:1: ( ( rule__Grammar__Group_3__0 )? )
            {
            // InternalXtext.g:2482:1: ( ( rule__Grammar__Group_3__0 )? )
            // InternalXtext.g:2483:1: ( rule__Grammar__Group_3__0 )?
            {
             before(grammarAccess.getGrammarAccess().getGroup_3()); 
            // InternalXtext.g:2484:1: ( rule__Grammar__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==51) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalXtext.g:2484:2: rule__Grammar__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Grammar__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGrammarAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group__3__Impl"


    // $ANTLR start "rule__Grammar__Group__4"
    // InternalXtext.g:2494:1: rule__Grammar__Group__4 : rule__Grammar__Group__4__Impl rule__Grammar__Group__5 ;
    public final void rule__Grammar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2498:1: ( rule__Grammar__Group__4__Impl rule__Grammar__Group__5 )
            // InternalXtext.g:2499:2: rule__Grammar__Group__4__Impl rule__Grammar__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Grammar__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group__4"


    // $ANTLR start "rule__Grammar__Group__4__Impl"
    // InternalXtext.g:2506:1: rule__Grammar__Group__4__Impl : ( ( rule__Grammar__MetamodelDeclarationsAssignment_4 )* ) ;
    public final void rule__Grammar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2510:1: ( ( ( rule__Grammar__MetamodelDeclarationsAssignment_4 )* ) )
            // InternalXtext.g:2511:1: ( ( rule__Grammar__MetamodelDeclarationsAssignment_4 )* )
            {
            // InternalXtext.g:2511:1: ( ( rule__Grammar__MetamodelDeclarationsAssignment_4 )* )
            // InternalXtext.g:2512:1: ( rule__Grammar__MetamodelDeclarationsAssignment_4 )*
            {
             before(grammarAccess.getGrammarAccess().getMetamodelDeclarationsAssignment_4()); 
            // InternalXtext.g:2513:1: ( rule__Grammar__MetamodelDeclarationsAssignment_4 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==29||LA31_0==31) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalXtext.g:2513:2: rule__Grammar__MetamodelDeclarationsAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    rule__Grammar__MetamodelDeclarationsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getGrammarAccess().getMetamodelDeclarationsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group__4__Impl"


    // $ANTLR start "rule__Grammar__Group__5"
    // InternalXtext.g:2523:1: rule__Grammar__Group__5 : rule__Grammar__Group__5__Impl ;
    public final void rule__Grammar__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2527:1: ( rule__Grammar__Group__5__Impl )
            // InternalXtext.g:2528:2: rule__Grammar__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group__5"


    // $ANTLR start "rule__Grammar__Group__5__Impl"
    // InternalXtext.g:2534:1: rule__Grammar__Group__5__Impl : ( ( ( rule__Grammar__RulesAssignment_5 ) ) ( ( rule__Grammar__RulesAssignment_5 )* ) ) ;
    public final void rule__Grammar__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2538:1: ( ( ( ( rule__Grammar__RulesAssignment_5 ) ) ( ( rule__Grammar__RulesAssignment_5 )* ) ) )
            // InternalXtext.g:2539:1: ( ( ( rule__Grammar__RulesAssignment_5 ) ) ( ( rule__Grammar__RulesAssignment_5 )* ) )
            {
            // InternalXtext.g:2539:1: ( ( ( rule__Grammar__RulesAssignment_5 ) ) ( ( rule__Grammar__RulesAssignment_5 )* ) )
            // InternalXtext.g:2540:1: ( ( rule__Grammar__RulesAssignment_5 ) ) ( ( rule__Grammar__RulesAssignment_5 )* )
            {
            // InternalXtext.g:2540:1: ( ( rule__Grammar__RulesAssignment_5 ) )
            // InternalXtext.g:2541:1: ( rule__Grammar__RulesAssignment_5 )
            {
             before(grammarAccess.getGrammarAccess().getRulesAssignment_5()); 
            // InternalXtext.g:2542:1: ( rule__Grammar__RulesAssignment_5 )
            // InternalXtext.g:2542:2: rule__Grammar__RulesAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__Grammar__RulesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGrammarAccess().getRulesAssignment_5()); 

            }

            // InternalXtext.g:2545:1: ( ( rule__Grammar__RulesAssignment_5 )* )
            // InternalXtext.g:2546:1: ( rule__Grammar__RulesAssignment_5 )*
            {
             before(grammarAccess.getGrammarAccess().getRulesAssignment_5()); 
            // InternalXtext.g:2547:1: ( rule__Grammar__RulesAssignment_5 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID||(LA32_0>=20 && LA32_0<=21)||LA32_0==46||LA32_0==50||LA32_0==52) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalXtext.g:2547:2: rule__Grammar__RulesAssignment_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    rule__Grammar__RulesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getGrammarAccess().getRulesAssignment_5()); 

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
    // $ANTLR end "rule__Grammar__Group__5__Impl"


    // $ANTLR start "rule__Grammar__Group_2__0"
    // InternalXtext.g:2570:1: rule__Grammar__Group_2__0 : rule__Grammar__Group_2__0__Impl rule__Grammar__Group_2__1 ;
    public final void rule__Grammar__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2574:1: ( rule__Grammar__Group_2__0__Impl rule__Grammar__Group_2__1 )
            // InternalXtext.g:2575:2: rule__Grammar__Group_2__0__Impl rule__Grammar__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Grammar__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_2__0"


    // $ANTLR start "rule__Grammar__Group_2__0__Impl"
    // InternalXtext.g:2582:1: rule__Grammar__Group_2__0__Impl : ( 'with' ) ;
    public final void rule__Grammar__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2586:1: ( ( 'with' ) )
            // InternalXtext.g:2587:1: ( 'with' )
            {
            // InternalXtext.g:2587:1: ( 'with' )
            // InternalXtext.g:2588:1: 'with'
            {
             before(grammarAccess.getGrammarAccess().getWithKeyword_2_0()); 
            match(input,24,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getGrammarAccess().getWithKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_2__0__Impl"


    // $ANTLR start "rule__Grammar__Group_2__1"
    // InternalXtext.g:2601:1: rule__Grammar__Group_2__1 : rule__Grammar__Group_2__1__Impl rule__Grammar__Group_2__2 ;
    public final void rule__Grammar__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2605:1: ( rule__Grammar__Group_2__1__Impl rule__Grammar__Group_2__2 )
            // InternalXtext.g:2606:2: rule__Grammar__Group_2__1__Impl rule__Grammar__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Grammar__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_2__1"


    // $ANTLR start "rule__Grammar__Group_2__1__Impl"
    // InternalXtext.g:2613:1: rule__Grammar__Group_2__1__Impl : ( ( rule__Grammar__UsedGrammarsAssignment_2_1 ) ) ;
    public final void rule__Grammar__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2617:1: ( ( ( rule__Grammar__UsedGrammarsAssignment_2_1 ) ) )
            // InternalXtext.g:2618:1: ( ( rule__Grammar__UsedGrammarsAssignment_2_1 ) )
            {
            // InternalXtext.g:2618:1: ( ( rule__Grammar__UsedGrammarsAssignment_2_1 ) )
            // InternalXtext.g:2619:1: ( rule__Grammar__UsedGrammarsAssignment_2_1 )
            {
             before(grammarAccess.getGrammarAccess().getUsedGrammarsAssignment_2_1()); 
            // InternalXtext.g:2620:1: ( rule__Grammar__UsedGrammarsAssignment_2_1 )
            // InternalXtext.g:2620:2: rule__Grammar__UsedGrammarsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__UsedGrammarsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGrammarAccess().getUsedGrammarsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_2__1__Impl"


    // $ANTLR start "rule__Grammar__Group_2__2"
    // InternalXtext.g:2630:1: rule__Grammar__Group_2__2 : rule__Grammar__Group_2__2__Impl ;
    public final void rule__Grammar__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2634:1: ( rule__Grammar__Group_2__2__Impl )
            // InternalXtext.g:2635:2: rule__Grammar__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_2__2"


    // $ANTLR start "rule__Grammar__Group_2__2__Impl"
    // InternalXtext.g:2641:1: rule__Grammar__Group_2__2__Impl : ( ( rule__Grammar__Group_2_2__0 )* ) ;
    public final void rule__Grammar__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2645:1: ( ( ( rule__Grammar__Group_2_2__0 )* ) )
            // InternalXtext.g:2646:1: ( ( rule__Grammar__Group_2_2__0 )* )
            {
            // InternalXtext.g:2646:1: ( ( rule__Grammar__Group_2_2__0 )* )
            // InternalXtext.g:2647:1: ( rule__Grammar__Group_2_2__0 )*
            {
             before(grammarAccess.getGrammarAccess().getGroup_2_2()); 
            // InternalXtext.g:2648:1: ( rule__Grammar__Group_2_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==25) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalXtext.g:2648:2: rule__Grammar__Group_2_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    rule__Grammar__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getGrammarAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_2__2__Impl"


    // $ANTLR start "rule__Grammar__Group_2_2__0"
    // InternalXtext.g:2664:1: rule__Grammar__Group_2_2__0 : rule__Grammar__Group_2_2__0__Impl rule__Grammar__Group_2_2__1 ;
    public final void rule__Grammar__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2668:1: ( rule__Grammar__Group_2_2__0__Impl rule__Grammar__Group_2_2__1 )
            // InternalXtext.g:2669:2: rule__Grammar__Group_2_2__0__Impl rule__Grammar__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Grammar__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_2_2__0"


    // $ANTLR start "rule__Grammar__Group_2_2__0__Impl"
    // InternalXtext.g:2676:1: rule__Grammar__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Grammar__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2680:1: ( ( ',' ) )
            // InternalXtext.g:2681:1: ( ',' )
            {
            // InternalXtext.g:2681:1: ( ',' )
            // InternalXtext.g:2682:1: ','
            {
             before(grammarAccess.getGrammarAccess().getCommaKeyword_2_2_0()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getGrammarAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_2_2__0__Impl"


    // $ANTLR start "rule__Grammar__Group_2_2__1"
    // InternalXtext.g:2695:1: rule__Grammar__Group_2_2__1 : rule__Grammar__Group_2_2__1__Impl ;
    public final void rule__Grammar__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2699:1: ( rule__Grammar__Group_2_2__1__Impl )
            // InternalXtext.g:2700:2: rule__Grammar__Group_2_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_2_2__1"


    // $ANTLR start "rule__Grammar__Group_2_2__1__Impl"
    // InternalXtext.g:2706:1: rule__Grammar__Group_2_2__1__Impl : ( ( rule__Grammar__UsedGrammarsAssignment_2_2_1 ) ) ;
    public final void rule__Grammar__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2710:1: ( ( ( rule__Grammar__UsedGrammarsAssignment_2_2_1 ) ) )
            // InternalXtext.g:2711:1: ( ( rule__Grammar__UsedGrammarsAssignment_2_2_1 ) )
            {
            // InternalXtext.g:2711:1: ( ( rule__Grammar__UsedGrammarsAssignment_2_2_1 ) )
            // InternalXtext.g:2712:1: ( rule__Grammar__UsedGrammarsAssignment_2_2_1 )
            {
             before(grammarAccess.getGrammarAccess().getUsedGrammarsAssignment_2_2_1()); 
            // InternalXtext.g:2713:1: ( rule__Grammar__UsedGrammarsAssignment_2_2_1 )
            // InternalXtext.g:2713:2: rule__Grammar__UsedGrammarsAssignment_2_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__UsedGrammarsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGrammarAccess().getUsedGrammarsAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_2_2__1__Impl"


    // $ANTLR start "rule__Grammar__Group_3__0"
    // InternalXtext.g:2727:1: rule__Grammar__Group_3__0 : rule__Grammar__Group_3__0__Impl rule__Grammar__Group_3__1 ;
    public final void rule__Grammar__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2731:1: ( rule__Grammar__Group_3__0__Impl rule__Grammar__Group_3__1 )
            // InternalXtext.g:2732:2: rule__Grammar__Group_3__0__Impl rule__Grammar__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Grammar__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_3__0"


    // $ANTLR start "rule__Grammar__Group_3__0__Impl"
    // InternalXtext.g:2739:1: rule__Grammar__Group_3__0__Impl : ( ( rule__Grammar__DefinesHiddenTokensAssignment_3_0 ) ) ;
    public final void rule__Grammar__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2743:1: ( ( ( rule__Grammar__DefinesHiddenTokensAssignment_3_0 ) ) )
            // InternalXtext.g:2744:1: ( ( rule__Grammar__DefinesHiddenTokensAssignment_3_0 ) )
            {
            // InternalXtext.g:2744:1: ( ( rule__Grammar__DefinesHiddenTokensAssignment_3_0 ) )
            // InternalXtext.g:2745:1: ( rule__Grammar__DefinesHiddenTokensAssignment_3_0 )
            {
             before(grammarAccess.getGrammarAccess().getDefinesHiddenTokensAssignment_3_0()); 
            // InternalXtext.g:2746:1: ( rule__Grammar__DefinesHiddenTokensAssignment_3_0 )
            // InternalXtext.g:2746:2: rule__Grammar__DefinesHiddenTokensAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__DefinesHiddenTokensAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getGrammarAccess().getDefinesHiddenTokensAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_3__0__Impl"


    // $ANTLR start "rule__Grammar__Group_3__1"
    // InternalXtext.g:2756:1: rule__Grammar__Group_3__1 : rule__Grammar__Group_3__1__Impl rule__Grammar__Group_3__2 ;
    public final void rule__Grammar__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2760:1: ( rule__Grammar__Group_3__1__Impl rule__Grammar__Group_3__2 )
            // InternalXtext.g:2761:2: rule__Grammar__Group_3__1__Impl rule__Grammar__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__Grammar__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_3__1"


    // $ANTLR start "rule__Grammar__Group_3__1__Impl"
    // InternalXtext.g:2768:1: rule__Grammar__Group_3__1__Impl : ( '(' ) ;
    public final void rule__Grammar__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2772:1: ( ( '(' ) )
            // InternalXtext.g:2773:1: ( '(' )
            {
            // InternalXtext.g:2773:1: ( '(' )
            // InternalXtext.g:2774:1: '('
            {
             before(grammarAccess.getGrammarAccess().getLeftParenthesisKeyword_3_1()); 
            match(input,26,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getGrammarAccess().getLeftParenthesisKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_3__1__Impl"


    // $ANTLR start "rule__Grammar__Group_3__2"
    // InternalXtext.g:2787:1: rule__Grammar__Group_3__2 : rule__Grammar__Group_3__2__Impl rule__Grammar__Group_3__3 ;
    public final void rule__Grammar__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2791:1: ( rule__Grammar__Group_3__2__Impl rule__Grammar__Group_3__3 )
            // InternalXtext.g:2792:2: rule__Grammar__Group_3__2__Impl rule__Grammar__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__Grammar__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_3__2"


    // $ANTLR start "rule__Grammar__Group_3__2__Impl"
    // InternalXtext.g:2799:1: rule__Grammar__Group_3__2__Impl : ( ( rule__Grammar__Group_3_2__0 )? ) ;
    public final void rule__Grammar__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2803:1: ( ( ( rule__Grammar__Group_3_2__0 )? ) )
            // InternalXtext.g:2804:1: ( ( rule__Grammar__Group_3_2__0 )? )
            {
            // InternalXtext.g:2804:1: ( ( rule__Grammar__Group_3_2__0 )? )
            // InternalXtext.g:2805:1: ( rule__Grammar__Group_3_2__0 )?
            {
             before(grammarAccess.getGrammarAccess().getGroup_3_2()); 
            // InternalXtext.g:2806:1: ( rule__Grammar__Group_3_2__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID||(LA34_0>=20 && LA34_0<=21)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalXtext.g:2806:2: rule__Grammar__Group_3_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Grammar__Group_3_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGrammarAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_3__2__Impl"


    // $ANTLR start "rule__Grammar__Group_3__3"
    // InternalXtext.g:2816:1: rule__Grammar__Group_3__3 : rule__Grammar__Group_3__3__Impl ;
    public final void rule__Grammar__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2820:1: ( rule__Grammar__Group_3__3__Impl )
            // InternalXtext.g:2821:2: rule__Grammar__Group_3__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_3__3"


    // $ANTLR start "rule__Grammar__Group_3__3__Impl"
    // InternalXtext.g:2827:1: rule__Grammar__Group_3__3__Impl : ( ')' ) ;
    public final void rule__Grammar__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2831:1: ( ( ')' ) )
            // InternalXtext.g:2832:1: ( ')' )
            {
            // InternalXtext.g:2832:1: ( ')' )
            // InternalXtext.g:2833:1: ')'
            {
             before(grammarAccess.getGrammarAccess().getRightParenthesisKeyword_3_3()); 
            match(input,27,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getGrammarAccess().getRightParenthesisKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_3__3__Impl"


    // $ANTLR start "rule__Grammar__Group_3_2__0"
    // InternalXtext.g:2854:1: rule__Grammar__Group_3_2__0 : rule__Grammar__Group_3_2__0__Impl rule__Grammar__Group_3_2__1 ;
    public final void rule__Grammar__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2858:1: ( rule__Grammar__Group_3_2__0__Impl rule__Grammar__Group_3_2__1 )
            // InternalXtext.g:2859:2: rule__Grammar__Group_3_2__0__Impl rule__Grammar__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Grammar__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_3_2__0"


    // $ANTLR start "rule__Grammar__Group_3_2__0__Impl"
    // InternalXtext.g:2866:1: rule__Grammar__Group_3_2__0__Impl : ( ( rule__Grammar__HiddenTokensAssignment_3_2_0 ) ) ;
    public final void rule__Grammar__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2870:1: ( ( ( rule__Grammar__HiddenTokensAssignment_3_2_0 ) ) )
            // InternalXtext.g:2871:1: ( ( rule__Grammar__HiddenTokensAssignment_3_2_0 ) )
            {
            // InternalXtext.g:2871:1: ( ( rule__Grammar__HiddenTokensAssignment_3_2_0 ) )
            // InternalXtext.g:2872:1: ( rule__Grammar__HiddenTokensAssignment_3_2_0 )
            {
             before(grammarAccess.getGrammarAccess().getHiddenTokensAssignment_3_2_0()); 
            // InternalXtext.g:2873:1: ( rule__Grammar__HiddenTokensAssignment_3_2_0 )
            // InternalXtext.g:2873:2: rule__Grammar__HiddenTokensAssignment_3_2_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__HiddenTokensAssignment_3_2_0();

            state._fsp--;


            }

             after(grammarAccess.getGrammarAccess().getHiddenTokensAssignment_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_3_2__0__Impl"


    // $ANTLR start "rule__Grammar__Group_3_2__1"
    // InternalXtext.g:2883:1: rule__Grammar__Group_3_2__1 : rule__Grammar__Group_3_2__1__Impl ;
    public final void rule__Grammar__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2887:1: ( rule__Grammar__Group_3_2__1__Impl )
            // InternalXtext.g:2888:2: rule__Grammar__Group_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_3_2__1"


    // $ANTLR start "rule__Grammar__Group_3_2__1__Impl"
    // InternalXtext.g:2894:1: rule__Grammar__Group_3_2__1__Impl : ( ( rule__Grammar__Group_3_2_1__0 )* ) ;
    public final void rule__Grammar__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2898:1: ( ( ( rule__Grammar__Group_3_2_1__0 )* ) )
            // InternalXtext.g:2899:1: ( ( rule__Grammar__Group_3_2_1__0 )* )
            {
            // InternalXtext.g:2899:1: ( ( rule__Grammar__Group_3_2_1__0 )* )
            // InternalXtext.g:2900:1: ( rule__Grammar__Group_3_2_1__0 )*
            {
             before(grammarAccess.getGrammarAccess().getGroup_3_2_1()); 
            // InternalXtext.g:2901:1: ( rule__Grammar__Group_3_2_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==25) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalXtext.g:2901:2: rule__Grammar__Group_3_2_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    rule__Grammar__Group_3_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getGrammarAccess().getGroup_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_3_2__1__Impl"


    // $ANTLR start "rule__Grammar__Group_3_2_1__0"
    // InternalXtext.g:2915:1: rule__Grammar__Group_3_2_1__0 : rule__Grammar__Group_3_2_1__0__Impl rule__Grammar__Group_3_2_1__1 ;
    public final void rule__Grammar__Group_3_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2919:1: ( rule__Grammar__Group_3_2_1__0__Impl rule__Grammar__Group_3_2_1__1 )
            // InternalXtext.g:2920:2: rule__Grammar__Group_3_2_1__0__Impl rule__Grammar__Group_3_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Grammar__Group_3_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group_3_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_3_2_1__0"


    // $ANTLR start "rule__Grammar__Group_3_2_1__0__Impl"
    // InternalXtext.g:2927:1: rule__Grammar__Group_3_2_1__0__Impl : ( ',' ) ;
    public final void rule__Grammar__Group_3_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2931:1: ( ( ',' ) )
            // InternalXtext.g:2932:1: ( ',' )
            {
            // InternalXtext.g:2932:1: ( ',' )
            // InternalXtext.g:2933:1: ','
            {
             before(grammarAccess.getGrammarAccess().getCommaKeyword_3_2_1_0()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getGrammarAccess().getCommaKeyword_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_3_2_1__0__Impl"


    // $ANTLR start "rule__Grammar__Group_3_2_1__1"
    // InternalXtext.g:2946:1: rule__Grammar__Group_3_2_1__1 : rule__Grammar__Group_3_2_1__1__Impl ;
    public final void rule__Grammar__Group_3_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2950:1: ( rule__Grammar__Group_3_2_1__1__Impl )
            // InternalXtext.g:2951:2: rule__Grammar__Group_3_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__Group_3_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_3_2_1__1"


    // $ANTLR start "rule__Grammar__Group_3_2_1__1__Impl"
    // InternalXtext.g:2957:1: rule__Grammar__Group_3_2_1__1__Impl : ( ( rule__Grammar__HiddenTokensAssignment_3_2_1_1 ) ) ;
    public final void rule__Grammar__Group_3_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2961:1: ( ( ( rule__Grammar__HiddenTokensAssignment_3_2_1_1 ) ) )
            // InternalXtext.g:2962:1: ( ( rule__Grammar__HiddenTokensAssignment_3_2_1_1 ) )
            {
            // InternalXtext.g:2962:1: ( ( rule__Grammar__HiddenTokensAssignment_3_2_1_1 ) )
            // InternalXtext.g:2963:1: ( rule__Grammar__HiddenTokensAssignment_3_2_1_1 )
            {
             before(grammarAccess.getGrammarAccess().getHiddenTokensAssignment_3_2_1_1()); 
            // InternalXtext.g:2964:1: ( rule__Grammar__HiddenTokensAssignment_3_2_1_1 )
            // InternalXtext.g:2964:2: rule__Grammar__HiddenTokensAssignment_3_2_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Grammar__HiddenTokensAssignment_3_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGrammarAccess().getHiddenTokensAssignment_3_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group_3_2_1__1__Impl"


    // $ANTLR start "rule__GrammarID__Group__0"
    // InternalXtext.g:2978:1: rule__GrammarID__Group__0 : rule__GrammarID__Group__0__Impl rule__GrammarID__Group__1 ;
    public final void rule__GrammarID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2982:1: ( rule__GrammarID__Group__0__Impl rule__GrammarID__Group__1 )
            // InternalXtext.g:2983:2: rule__GrammarID__Group__0__Impl rule__GrammarID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GrammarID__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__GrammarID__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammarID__Group__0"


    // $ANTLR start "rule__GrammarID__Group__0__Impl"
    // InternalXtext.g:2990:1: rule__GrammarID__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__GrammarID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:2994:1: ( ( ruleValidID ) )
            // InternalXtext.g:2995:1: ( ruleValidID )
            {
            // InternalXtext.g:2995:1: ( ruleValidID )
            // InternalXtext.g:2996:1: ruleValidID
            {
             before(grammarAccess.getGrammarIDAccess().getValidIDParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getGrammarIDAccess().getValidIDParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammarID__Group__0__Impl"


    // $ANTLR start "rule__GrammarID__Group__1"
    // InternalXtext.g:3007:1: rule__GrammarID__Group__1 : rule__GrammarID__Group__1__Impl ;
    public final void rule__GrammarID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3011:1: ( rule__GrammarID__Group__1__Impl )
            // InternalXtext.g:3012:2: rule__GrammarID__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GrammarID__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammarID__Group__1"


    // $ANTLR start "rule__GrammarID__Group__1__Impl"
    // InternalXtext.g:3018:1: rule__GrammarID__Group__1__Impl : ( ( rule__GrammarID__Group_1__0 )* ) ;
    public final void rule__GrammarID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3022:1: ( ( ( rule__GrammarID__Group_1__0 )* ) )
            // InternalXtext.g:3023:1: ( ( rule__GrammarID__Group_1__0 )* )
            {
            // InternalXtext.g:3023:1: ( ( rule__GrammarID__Group_1__0 )* )
            // InternalXtext.g:3024:1: ( rule__GrammarID__Group_1__0 )*
            {
             before(grammarAccess.getGrammarIDAccess().getGroup_1()); 
            // InternalXtext.g:3025:1: ( rule__GrammarID__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==28) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalXtext.g:3025:2: rule__GrammarID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_12);
            	    rule__GrammarID__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getGrammarIDAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammarID__Group__1__Impl"


    // $ANTLR start "rule__GrammarID__Group_1__0"
    // InternalXtext.g:3039:1: rule__GrammarID__Group_1__0 : rule__GrammarID__Group_1__0__Impl rule__GrammarID__Group_1__1 ;
    public final void rule__GrammarID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3043:1: ( rule__GrammarID__Group_1__0__Impl rule__GrammarID__Group_1__1 )
            // InternalXtext.g:3044:2: rule__GrammarID__Group_1__0__Impl rule__GrammarID__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__GrammarID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__GrammarID__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammarID__Group_1__0"


    // $ANTLR start "rule__GrammarID__Group_1__0__Impl"
    // InternalXtext.g:3051:1: rule__GrammarID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__GrammarID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3055:1: ( ( '.' ) )
            // InternalXtext.g:3056:1: ( '.' )
            {
            // InternalXtext.g:3056:1: ( '.' )
            // InternalXtext.g:3057:1: '.'
            {
             before(grammarAccess.getGrammarIDAccess().getFullStopKeyword_1_0()); 
            match(input,28,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getGrammarIDAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammarID__Group_1__0__Impl"


    // $ANTLR start "rule__GrammarID__Group_1__1"
    // InternalXtext.g:3070:1: rule__GrammarID__Group_1__1 : rule__GrammarID__Group_1__1__Impl ;
    public final void rule__GrammarID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3074:1: ( rule__GrammarID__Group_1__1__Impl )
            // InternalXtext.g:3075:2: rule__GrammarID__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GrammarID__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammarID__Group_1__1"


    // $ANTLR start "rule__GrammarID__Group_1__1__Impl"
    // InternalXtext.g:3081:1: rule__GrammarID__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__GrammarID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3085:1: ( ( ruleValidID ) )
            // InternalXtext.g:3086:1: ( ruleValidID )
            {
            // InternalXtext.g:3086:1: ( ruleValidID )
            // InternalXtext.g:3087:1: ruleValidID
            {
             before(grammarAccess.getGrammarIDAccess().getValidIDParserRuleCall_1_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getGrammarIDAccess().getValidIDParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammarID__Group_1__1__Impl"


    // $ANTLR start "rule__GeneratedMetamodel__Group__0"
    // InternalXtext.g:3102:1: rule__GeneratedMetamodel__Group__0 : rule__GeneratedMetamodel__Group__0__Impl rule__GeneratedMetamodel__Group__1 ;
    public final void rule__GeneratedMetamodel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3106:1: ( rule__GeneratedMetamodel__Group__0__Impl rule__GeneratedMetamodel__Group__1 )
            // InternalXtext.g:3107:2: rule__GeneratedMetamodel__Group__0__Impl rule__GeneratedMetamodel__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__GeneratedMetamodel__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__GeneratedMetamodel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratedMetamodel__Group__0"


    // $ANTLR start "rule__GeneratedMetamodel__Group__0__Impl"
    // InternalXtext.g:3114:1: rule__GeneratedMetamodel__Group__0__Impl : ( 'generate' ) ;
    public final void rule__GeneratedMetamodel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3118:1: ( ( 'generate' ) )
            // InternalXtext.g:3119:1: ( 'generate' )
            {
            // InternalXtext.g:3119:1: ( 'generate' )
            // InternalXtext.g:3120:1: 'generate'
            {
             before(grammarAccess.getGeneratedMetamodelAccess().getGenerateKeyword_0()); 
            match(input,29,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getGeneratedMetamodelAccess().getGenerateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratedMetamodel__Group__0__Impl"


    // $ANTLR start "rule__GeneratedMetamodel__Group__1"
    // InternalXtext.g:3133:1: rule__GeneratedMetamodel__Group__1 : rule__GeneratedMetamodel__Group__1__Impl rule__GeneratedMetamodel__Group__2 ;
    public final void rule__GeneratedMetamodel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3137:1: ( rule__GeneratedMetamodel__Group__1__Impl rule__GeneratedMetamodel__Group__2 )
            // InternalXtext.g:3138:2: rule__GeneratedMetamodel__Group__1__Impl rule__GeneratedMetamodel__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__GeneratedMetamodel__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__GeneratedMetamodel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratedMetamodel__Group__1"


    // $ANTLR start "rule__GeneratedMetamodel__Group__1__Impl"
    // InternalXtext.g:3145:1: rule__GeneratedMetamodel__Group__1__Impl : ( ( rule__GeneratedMetamodel__NameAssignment_1 ) ) ;
    public final void rule__GeneratedMetamodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3149:1: ( ( ( rule__GeneratedMetamodel__NameAssignment_1 ) ) )
            // InternalXtext.g:3150:1: ( ( rule__GeneratedMetamodel__NameAssignment_1 ) )
            {
            // InternalXtext.g:3150:1: ( ( rule__GeneratedMetamodel__NameAssignment_1 ) )
            // InternalXtext.g:3151:1: ( rule__GeneratedMetamodel__NameAssignment_1 )
            {
             before(grammarAccess.getGeneratedMetamodelAccess().getNameAssignment_1()); 
            // InternalXtext.g:3152:1: ( rule__GeneratedMetamodel__NameAssignment_1 )
            // InternalXtext.g:3152:2: rule__GeneratedMetamodel__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GeneratedMetamodel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGeneratedMetamodelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratedMetamodel__Group__1__Impl"


    // $ANTLR start "rule__GeneratedMetamodel__Group__2"
    // InternalXtext.g:3162:1: rule__GeneratedMetamodel__Group__2 : rule__GeneratedMetamodel__Group__2__Impl rule__GeneratedMetamodel__Group__3 ;
    public final void rule__GeneratedMetamodel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3166:1: ( rule__GeneratedMetamodel__Group__2__Impl rule__GeneratedMetamodel__Group__3 )
            // InternalXtext.g:3167:2: rule__GeneratedMetamodel__Group__2__Impl rule__GeneratedMetamodel__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__GeneratedMetamodel__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__GeneratedMetamodel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratedMetamodel__Group__2"


    // $ANTLR start "rule__GeneratedMetamodel__Group__2__Impl"
    // InternalXtext.g:3174:1: rule__GeneratedMetamodel__Group__2__Impl : ( ( rule__GeneratedMetamodel__EPackageAssignment_2 ) ) ;
    public final void rule__GeneratedMetamodel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3178:1: ( ( ( rule__GeneratedMetamodel__EPackageAssignment_2 ) ) )
            // InternalXtext.g:3179:1: ( ( rule__GeneratedMetamodel__EPackageAssignment_2 ) )
            {
            // InternalXtext.g:3179:1: ( ( rule__GeneratedMetamodel__EPackageAssignment_2 ) )
            // InternalXtext.g:3180:1: ( rule__GeneratedMetamodel__EPackageAssignment_2 )
            {
             before(grammarAccess.getGeneratedMetamodelAccess().getEPackageAssignment_2()); 
            // InternalXtext.g:3181:1: ( rule__GeneratedMetamodel__EPackageAssignment_2 )
            // InternalXtext.g:3181:2: rule__GeneratedMetamodel__EPackageAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GeneratedMetamodel__EPackageAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGeneratedMetamodelAccess().getEPackageAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratedMetamodel__Group__2__Impl"


    // $ANTLR start "rule__GeneratedMetamodel__Group__3"
    // InternalXtext.g:3191:1: rule__GeneratedMetamodel__Group__3 : rule__GeneratedMetamodel__Group__3__Impl ;
    public final void rule__GeneratedMetamodel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3195:1: ( rule__GeneratedMetamodel__Group__3__Impl )
            // InternalXtext.g:3196:2: rule__GeneratedMetamodel__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GeneratedMetamodel__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratedMetamodel__Group__3"


    // $ANTLR start "rule__GeneratedMetamodel__Group__3__Impl"
    // InternalXtext.g:3202:1: rule__GeneratedMetamodel__Group__3__Impl : ( ( rule__GeneratedMetamodel__Group_3__0 )? ) ;
    public final void rule__GeneratedMetamodel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3206:1: ( ( ( rule__GeneratedMetamodel__Group_3__0 )? ) )
            // InternalXtext.g:3207:1: ( ( rule__GeneratedMetamodel__Group_3__0 )? )
            {
            // InternalXtext.g:3207:1: ( ( rule__GeneratedMetamodel__Group_3__0 )? )
            // InternalXtext.g:3208:1: ( rule__GeneratedMetamodel__Group_3__0 )?
            {
             before(grammarAccess.getGeneratedMetamodelAccess().getGroup_3()); 
            // InternalXtext.g:3209:1: ( rule__GeneratedMetamodel__Group_3__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==30) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalXtext.g:3209:2: rule__GeneratedMetamodel__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GeneratedMetamodel__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGeneratedMetamodelAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratedMetamodel__Group__3__Impl"


    // $ANTLR start "rule__GeneratedMetamodel__Group_3__0"
    // InternalXtext.g:3227:1: rule__GeneratedMetamodel__Group_3__0 : rule__GeneratedMetamodel__Group_3__0__Impl rule__GeneratedMetamodel__Group_3__1 ;
    public final void rule__GeneratedMetamodel__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3231:1: ( rule__GeneratedMetamodel__Group_3__0__Impl rule__GeneratedMetamodel__Group_3__1 )
            // InternalXtext.g:3232:2: rule__GeneratedMetamodel__Group_3__0__Impl rule__GeneratedMetamodel__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__GeneratedMetamodel__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__GeneratedMetamodel__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratedMetamodel__Group_3__0"


    // $ANTLR start "rule__GeneratedMetamodel__Group_3__0__Impl"
    // InternalXtext.g:3239:1: rule__GeneratedMetamodel__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__GeneratedMetamodel__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3243:1: ( ( 'as' ) )
            // InternalXtext.g:3244:1: ( 'as' )
            {
            // InternalXtext.g:3244:1: ( 'as' )
            // InternalXtext.g:3245:1: 'as'
            {
             before(grammarAccess.getGeneratedMetamodelAccess().getAsKeyword_3_0()); 
            match(input,30,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getGeneratedMetamodelAccess().getAsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratedMetamodel__Group_3__0__Impl"


    // $ANTLR start "rule__GeneratedMetamodel__Group_3__1"
    // InternalXtext.g:3258:1: rule__GeneratedMetamodel__Group_3__1 : rule__GeneratedMetamodel__Group_3__1__Impl ;
    public final void rule__GeneratedMetamodel__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3262:1: ( rule__GeneratedMetamodel__Group_3__1__Impl )
            // InternalXtext.g:3263:2: rule__GeneratedMetamodel__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GeneratedMetamodel__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratedMetamodel__Group_3__1"


    // $ANTLR start "rule__GeneratedMetamodel__Group_3__1__Impl"
    // InternalXtext.g:3269:1: rule__GeneratedMetamodel__Group_3__1__Impl : ( ( rule__GeneratedMetamodel__AliasAssignment_3_1 ) ) ;
    public final void rule__GeneratedMetamodel__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3273:1: ( ( ( rule__GeneratedMetamodel__AliasAssignment_3_1 ) ) )
            // InternalXtext.g:3274:1: ( ( rule__GeneratedMetamodel__AliasAssignment_3_1 ) )
            {
            // InternalXtext.g:3274:1: ( ( rule__GeneratedMetamodel__AliasAssignment_3_1 ) )
            // InternalXtext.g:3275:1: ( rule__GeneratedMetamodel__AliasAssignment_3_1 )
            {
             before(grammarAccess.getGeneratedMetamodelAccess().getAliasAssignment_3_1()); 
            // InternalXtext.g:3276:1: ( rule__GeneratedMetamodel__AliasAssignment_3_1 )
            // InternalXtext.g:3276:2: rule__GeneratedMetamodel__AliasAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GeneratedMetamodel__AliasAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGeneratedMetamodelAccess().getAliasAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratedMetamodel__Group_3__1__Impl"


    // $ANTLR start "rule__ReferencedMetamodel__Group__0"
    // InternalXtext.g:3290:1: rule__ReferencedMetamodel__Group__0 : rule__ReferencedMetamodel__Group__0__Impl rule__ReferencedMetamodel__Group__1 ;
    public final void rule__ReferencedMetamodel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3294:1: ( rule__ReferencedMetamodel__Group__0__Impl rule__ReferencedMetamodel__Group__1 )
            // InternalXtext.g:3295:2: rule__ReferencedMetamodel__Group__0__Impl rule__ReferencedMetamodel__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__ReferencedMetamodel__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReferencedMetamodel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencedMetamodel__Group__0"


    // $ANTLR start "rule__ReferencedMetamodel__Group__0__Impl"
    // InternalXtext.g:3302:1: rule__ReferencedMetamodel__Group__0__Impl : ( 'import' ) ;
    public final void rule__ReferencedMetamodel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3306:1: ( ( 'import' ) )
            // InternalXtext.g:3307:1: ( 'import' )
            {
            // InternalXtext.g:3307:1: ( 'import' )
            // InternalXtext.g:3308:1: 'import'
            {
             before(grammarAccess.getReferencedMetamodelAccess().getImportKeyword_0()); 
            match(input,31,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getReferencedMetamodelAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencedMetamodel__Group__0__Impl"


    // $ANTLR start "rule__ReferencedMetamodel__Group__1"
    // InternalXtext.g:3321:1: rule__ReferencedMetamodel__Group__1 : rule__ReferencedMetamodel__Group__1__Impl rule__ReferencedMetamodel__Group__2 ;
    public final void rule__ReferencedMetamodel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3325:1: ( rule__ReferencedMetamodel__Group__1__Impl rule__ReferencedMetamodel__Group__2 )
            // InternalXtext.g:3326:2: rule__ReferencedMetamodel__Group__1__Impl rule__ReferencedMetamodel__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__ReferencedMetamodel__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReferencedMetamodel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencedMetamodel__Group__1"


    // $ANTLR start "rule__ReferencedMetamodel__Group__1__Impl"
    // InternalXtext.g:3333:1: rule__ReferencedMetamodel__Group__1__Impl : ( ( rule__ReferencedMetamodel__EPackageAssignment_1 ) ) ;
    public final void rule__ReferencedMetamodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3337:1: ( ( ( rule__ReferencedMetamodel__EPackageAssignment_1 ) ) )
            // InternalXtext.g:3338:1: ( ( rule__ReferencedMetamodel__EPackageAssignment_1 ) )
            {
            // InternalXtext.g:3338:1: ( ( rule__ReferencedMetamodel__EPackageAssignment_1 ) )
            // InternalXtext.g:3339:1: ( rule__ReferencedMetamodel__EPackageAssignment_1 )
            {
             before(grammarAccess.getReferencedMetamodelAccess().getEPackageAssignment_1()); 
            // InternalXtext.g:3340:1: ( rule__ReferencedMetamodel__EPackageAssignment_1 )
            // InternalXtext.g:3340:2: rule__ReferencedMetamodel__EPackageAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReferencedMetamodel__EPackageAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReferencedMetamodelAccess().getEPackageAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencedMetamodel__Group__1__Impl"


    // $ANTLR start "rule__ReferencedMetamodel__Group__2"
    // InternalXtext.g:3350:1: rule__ReferencedMetamodel__Group__2 : rule__ReferencedMetamodel__Group__2__Impl ;
    public final void rule__ReferencedMetamodel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3354:1: ( rule__ReferencedMetamodel__Group__2__Impl )
            // InternalXtext.g:3355:2: rule__ReferencedMetamodel__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReferencedMetamodel__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencedMetamodel__Group__2"


    // $ANTLR start "rule__ReferencedMetamodel__Group__2__Impl"
    // InternalXtext.g:3361:1: rule__ReferencedMetamodel__Group__2__Impl : ( ( rule__ReferencedMetamodel__Group_2__0 )? ) ;
    public final void rule__ReferencedMetamodel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3365:1: ( ( ( rule__ReferencedMetamodel__Group_2__0 )? ) )
            // InternalXtext.g:3366:1: ( ( rule__ReferencedMetamodel__Group_2__0 )? )
            {
            // InternalXtext.g:3366:1: ( ( rule__ReferencedMetamodel__Group_2__0 )? )
            // InternalXtext.g:3367:1: ( rule__ReferencedMetamodel__Group_2__0 )?
            {
             before(grammarAccess.getReferencedMetamodelAccess().getGroup_2()); 
            // InternalXtext.g:3368:1: ( rule__ReferencedMetamodel__Group_2__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==30) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalXtext.g:3368:2: rule__ReferencedMetamodel__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ReferencedMetamodel__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferencedMetamodelAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencedMetamodel__Group__2__Impl"


    // $ANTLR start "rule__ReferencedMetamodel__Group_2__0"
    // InternalXtext.g:3384:1: rule__ReferencedMetamodel__Group_2__0 : rule__ReferencedMetamodel__Group_2__0__Impl rule__ReferencedMetamodel__Group_2__1 ;
    public final void rule__ReferencedMetamodel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3388:1: ( rule__ReferencedMetamodel__Group_2__0__Impl rule__ReferencedMetamodel__Group_2__1 )
            // InternalXtext.g:3389:2: rule__ReferencedMetamodel__Group_2__0__Impl rule__ReferencedMetamodel__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__ReferencedMetamodel__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReferencedMetamodel__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencedMetamodel__Group_2__0"


    // $ANTLR start "rule__ReferencedMetamodel__Group_2__0__Impl"
    // InternalXtext.g:3396:1: rule__ReferencedMetamodel__Group_2__0__Impl : ( 'as' ) ;
    public final void rule__ReferencedMetamodel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3400:1: ( ( 'as' ) )
            // InternalXtext.g:3401:1: ( 'as' )
            {
            // InternalXtext.g:3401:1: ( 'as' )
            // InternalXtext.g:3402:1: 'as'
            {
             before(grammarAccess.getReferencedMetamodelAccess().getAsKeyword_2_0()); 
            match(input,30,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getReferencedMetamodelAccess().getAsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencedMetamodel__Group_2__0__Impl"


    // $ANTLR start "rule__ReferencedMetamodel__Group_2__1"
    // InternalXtext.g:3415:1: rule__ReferencedMetamodel__Group_2__1 : rule__ReferencedMetamodel__Group_2__1__Impl ;
    public final void rule__ReferencedMetamodel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3419:1: ( rule__ReferencedMetamodel__Group_2__1__Impl )
            // InternalXtext.g:3420:2: rule__ReferencedMetamodel__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReferencedMetamodel__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencedMetamodel__Group_2__1"


    // $ANTLR start "rule__ReferencedMetamodel__Group_2__1__Impl"
    // InternalXtext.g:3426:1: rule__ReferencedMetamodel__Group_2__1__Impl : ( ( rule__ReferencedMetamodel__AliasAssignment_2_1 ) ) ;
    public final void rule__ReferencedMetamodel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3430:1: ( ( ( rule__ReferencedMetamodel__AliasAssignment_2_1 ) ) )
            // InternalXtext.g:3431:1: ( ( rule__ReferencedMetamodel__AliasAssignment_2_1 ) )
            {
            // InternalXtext.g:3431:1: ( ( rule__ReferencedMetamodel__AliasAssignment_2_1 ) )
            // InternalXtext.g:3432:1: ( rule__ReferencedMetamodel__AliasAssignment_2_1 )
            {
             before(grammarAccess.getReferencedMetamodelAccess().getAliasAssignment_2_1()); 
            // InternalXtext.g:3433:1: ( rule__ReferencedMetamodel__AliasAssignment_2_1 )
            // InternalXtext.g:3433:2: rule__ReferencedMetamodel__AliasAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReferencedMetamodel__AliasAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getReferencedMetamodelAccess().getAliasAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencedMetamodel__Group_2__1__Impl"


    // $ANTLR start "rule__ParserRule__Group__0"
    // InternalXtext.g:3447:1: rule__ParserRule__Group__0 : rule__ParserRule__Group__0__Impl rule__ParserRule__Group__1 ;
    public final void rule__ParserRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3451:1: ( rule__ParserRule__Group__0__Impl rule__ParserRule__Group__1 )
            // InternalXtext.g:3452:2: rule__ParserRule__Group__0__Impl rule__ParserRule__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__ParserRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group__0"


    // $ANTLR start "rule__ParserRule__Group__0__Impl"
    // InternalXtext.g:3459:1: rule__ParserRule__Group__0__Impl : ( ( rule__ParserRule__Alternatives_0 ) ) ;
    public final void rule__ParserRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3463:1: ( ( ( rule__ParserRule__Alternatives_0 ) ) )
            // InternalXtext.g:3464:1: ( ( rule__ParserRule__Alternatives_0 ) )
            {
            // InternalXtext.g:3464:1: ( ( rule__ParserRule__Alternatives_0 ) )
            // InternalXtext.g:3465:1: ( rule__ParserRule__Alternatives_0 )
            {
             before(grammarAccess.getParserRuleAccess().getAlternatives_0()); 
            // InternalXtext.g:3466:1: ( rule__ParserRule__Alternatives_0 )
            // InternalXtext.g:3466:2: rule__ParserRule__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getParserRuleAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group__0__Impl"


    // $ANTLR start "rule__ParserRule__Group__1"
    // InternalXtext.g:3476:1: rule__ParserRule__Group__1 : rule__ParserRule__Group__1__Impl rule__ParserRule__Group__2 ;
    public final void rule__ParserRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3480:1: ( rule__ParserRule__Group__1__Impl rule__ParserRule__Group__2 )
            // InternalXtext.g:3481:2: rule__ParserRule__Group__1__Impl rule__ParserRule__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__ParserRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group__1"


    // $ANTLR start "rule__ParserRule__Group__1__Impl"
    // InternalXtext.g:3488:1: rule__ParserRule__Group__1__Impl : ( ( 'my' )? ) ;
    public final void rule__ParserRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3492:1: ( ( ( 'my' )? ) )
            // InternalXtext.g:3493:1: ( ( 'my' )? )
            {
            // InternalXtext.g:3493:1: ( ( 'my' )? )
            // InternalXtext.g:3494:1: ( 'my' )?
            {
             before(grammarAccess.getParserRuleAccess().getMyKeyword_1()); 
            // InternalXtext.g:3495:1: ( 'my' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==32) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalXtext.g:3496:2: 'my'
                    {
                    match(input,32,FollowSets000.FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getParserRuleAccess().getMyKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group__1__Impl"


    // $ANTLR start "rule__ParserRule__Group__2"
    // InternalXtext.g:3507:1: rule__ParserRule__Group__2 : rule__ParserRule__Group__2__Impl rule__ParserRule__Group__3 ;
    public final void rule__ParserRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3511:1: ( rule__ParserRule__Group__2__Impl rule__ParserRule__Group__3 )
            // InternalXtext.g:3512:2: rule__ParserRule__Group__2__Impl rule__ParserRule__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__ParserRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group__2"


    // $ANTLR start "rule__ParserRule__Group__2__Impl"
    // InternalXtext.g:3519:1: rule__ParserRule__Group__2__Impl : ( ( rule__ParserRule__Group_2__0 )? ) ;
    public final void rule__ParserRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3523:1: ( ( ( rule__ParserRule__Group_2__0 )? ) )
            // InternalXtext.g:3524:1: ( ( rule__ParserRule__Group_2__0 )? )
            {
            // InternalXtext.g:3524:1: ( ( rule__ParserRule__Group_2__0 )? )
            // InternalXtext.g:3525:1: ( rule__ParserRule__Group_2__0 )?
            {
             before(grammarAccess.getParserRuleAccess().getGroup_2()); 
            // InternalXtext.g:3526:1: ( rule__ParserRule__Group_2__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==51) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalXtext.g:3526:2: rule__ParserRule__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ParserRule__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParserRuleAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group__2__Impl"


    // $ANTLR start "rule__ParserRule__Group__3"
    // InternalXtext.g:3536:1: rule__ParserRule__Group__3 : rule__ParserRule__Group__3__Impl rule__ParserRule__Group__4 ;
    public final void rule__ParserRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3540:1: ( rule__ParserRule__Group__3__Impl rule__ParserRule__Group__4 )
            // InternalXtext.g:3541:2: rule__ParserRule__Group__3__Impl rule__ParserRule__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__ParserRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group__3"


    // $ANTLR start "rule__ParserRule__Group__3__Impl"
    // InternalXtext.g:3548:1: rule__ParserRule__Group__3__Impl : ( ( rule__ParserRule__InitAfterActionsAssignment_3 )? ) ;
    public final void rule__ParserRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3552:1: ( ( ( rule__ParserRule__InitAfterActionsAssignment_3 )? ) )
            // InternalXtext.g:3553:1: ( ( rule__ParserRule__InitAfterActionsAssignment_3 )? )
            {
            // InternalXtext.g:3553:1: ( ( rule__ParserRule__InitAfterActionsAssignment_3 )? )
            // InternalXtext.g:3554:1: ( rule__ParserRule__InitAfterActionsAssignment_3 )?
            {
             before(grammarAccess.getParserRuleAccess().getInitAfterActionsAssignment_3()); 
            // InternalXtext.g:3555:1: ( rule__ParserRule__InitAfterActionsAssignment_3 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=13 && LA41_0<=14)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalXtext.g:3555:2: rule__ParserRule__InitAfterActionsAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ParserRule__InitAfterActionsAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParserRuleAccess().getInitAfterActionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group__3__Impl"


    // $ANTLR start "rule__ParserRule__Group__4"
    // InternalXtext.g:3565:1: rule__ParserRule__Group__4 : rule__ParserRule__Group__4__Impl rule__ParserRule__Group__5 ;
    public final void rule__ParserRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3569:1: ( rule__ParserRule__Group__4__Impl rule__ParserRule__Group__5 )
            // InternalXtext.g:3570:2: rule__ParserRule__Group__4__Impl rule__ParserRule__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__ParserRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group__4"


    // $ANTLR start "rule__ParserRule__Group__4__Impl"
    // InternalXtext.g:3577:1: rule__ParserRule__Group__4__Impl : ( ( rule__ParserRule__Alternatives_4 ) ) ;
    public final void rule__ParserRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3581:1: ( ( ( rule__ParserRule__Alternatives_4 ) ) )
            // InternalXtext.g:3582:1: ( ( rule__ParserRule__Alternatives_4 ) )
            {
            // InternalXtext.g:3582:1: ( ( rule__ParserRule__Alternatives_4 ) )
            // InternalXtext.g:3583:1: ( rule__ParserRule__Alternatives_4 )
            {
             before(grammarAccess.getParserRuleAccess().getAlternatives_4()); 
            // InternalXtext.g:3584:1: ( rule__ParserRule__Alternatives_4 )
            // InternalXtext.g:3584:2: rule__ParserRule__Alternatives_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getParserRuleAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group__4__Impl"


    // $ANTLR start "rule__ParserRule__Group__5"
    // InternalXtext.g:3594:1: rule__ParserRule__Group__5 : rule__ParserRule__Group__5__Impl rule__ParserRule__Group__6 ;
    public final void rule__ParserRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3598:1: ( rule__ParserRule__Group__5__Impl rule__ParserRule__Group__6 )
            // InternalXtext.g:3599:2: rule__ParserRule__Group__5__Impl rule__ParserRule__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__ParserRule__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group__5"


    // $ANTLR start "rule__ParserRule__Group__5__Impl"
    // InternalXtext.g:3606:1: rule__ParserRule__Group__5__Impl : ( ( rule__ParserRule__AlternativesAssignment_5 ) ) ;
    public final void rule__ParserRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3610:1: ( ( ( rule__ParserRule__AlternativesAssignment_5 ) ) )
            // InternalXtext.g:3611:1: ( ( rule__ParserRule__AlternativesAssignment_5 ) )
            {
            // InternalXtext.g:3611:1: ( ( rule__ParserRule__AlternativesAssignment_5 ) )
            // InternalXtext.g:3612:1: ( rule__ParserRule__AlternativesAssignment_5 )
            {
             before(grammarAccess.getParserRuleAccess().getAlternativesAssignment_5()); 
            // InternalXtext.g:3613:1: ( rule__ParserRule__AlternativesAssignment_5 )
            // InternalXtext.g:3613:2: rule__ParserRule__AlternativesAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__AlternativesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getParserRuleAccess().getAlternativesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group__5__Impl"


    // $ANTLR start "rule__ParserRule__Group__6"
    // InternalXtext.g:3623:1: rule__ParserRule__Group__6 : rule__ParserRule__Group__6__Impl ;
    public final void rule__ParserRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3627:1: ( rule__ParserRule__Group__6__Impl )
            // InternalXtext.g:3628:2: rule__ParserRule__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group__6"


    // $ANTLR start "rule__ParserRule__Group__6__Impl"
    // InternalXtext.g:3634:1: rule__ParserRule__Group__6__Impl : ( ';' ) ;
    public final void rule__ParserRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3638:1: ( ( ';' ) )
            // InternalXtext.g:3639:1: ( ';' )
            {
            // InternalXtext.g:3639:1: ( ';' )
            // InternalXtext.g:3640:1: ';'
            {
             before(grammarAccess.getParserRuleAccess().getSemicolonKeyword_6()); 
            match(input,33,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParserRuleAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group__6__Impl"


    // $ANTLR start "rule__ParserRule__Group_0_0__0"
    // InternalXtext.g:3667:1: rule__ParserRule__Group_0_0__0 : rule__ParserRule__Group_0_0__0__Impl rule__ParserRule__Group_0_0__1 ;
    public final void rule__ParserRule__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3671:1: ( rule__ParserRule__Group_0_0__0__Impl rule__ParserRule__Group_0_0__1 )
            // InternalXtext.g:3672:2: rule__ParserRule__Group_0_0__0__Impl rule__ParserRule__Group_0_0__1
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__ParserRule__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_0_0__0"


    // $ANTLR start "rule__ParserRule__Group_0_0__0__Impl"
    // InternalXtext.g:3679:1: rule__ParserRule__Group_0_0__0__Impl : ( ( rule__ParserRule__FragmentAssignment_0_0_0 ) ) ;
    public final void rule__ParserRule__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3683:1: ( ( ( rule__ParserRule__FragmentAssignment_0_0_0 ) ) )
            // InternalXtext.g:3684:1: ( ( rule__ParserRule__FragmentAssignment_0_0_0 ) )
            {
            // InternalXtext.g:3684:1: ( ( rule__ParserRule__FragmentAssignment_0_0_0 ) )
            // InternalXtext.g:3685:1: ( rule__ParserRule__FragmentAssignment_0_0_0 )
            {
             before(grammarAccess.getParserRuleAccess().getFragmentAssignment_0_0_0()); 
            // InternalXtext.g:3686:1: ( rule__ParserRule__FragmentAssignment_0_0_0 )
            // InternalXtext.g:3686:2: rule__ParserRule__FragmentAssignment_0_0_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__FragmentAssignment_0_0_0();

            state._fsp--;


            }

             after(grammarAccess.getParserRuleAccess().getFragmentAssignment_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_0_0__0__Impl"


    // $ANTLR start "rule__ParserRule__Group_0_0__1"
    // InternalXtext.g:3696:1: rule__ParserRule__Group_0_0__1 : rule__ParserRule__Group_0_0__1__Impl rule__ParserRule__Group_0_0__2 ;
    public final void rule__ParserRule__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3700:1: ( rule__ParserRule__Group_0_0__1__Impl rule__ParserRule__Group_0_0__2 )
            // InternalXtext.g:3701:2: rule__ParserRule__Group_0_0__1__Impl rule__ParserRule__Group_0_0__2
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__ParserRule__Group_0_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group_0_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_0_0__1"


    // $ANTLR start "rule__ParserRule__Group_0_0__1__Impl"
    // InternalXtext.g:3708:1: rule__ParserRule__Group_0_0__1__Impl : ( ruleRuleNameAndParams ) ;
    public final void rule__ParserRule__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3712:1: ( ( ruleRuleNameAndParams ) )
            // InternalXtext.g:3713:1: ( ruleRuleNameAndParams )
            {
            // InternalXtext.g:3713:1: ( ruleRuleNameAndParams )
            // InternalXtext.g:3714:1: ruleRuleNameAndParams
            {
             before(grammarAccess.getParserRuleAccess().getRuleNameAndParamsParserRuleCall_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRuleNameAndParams();

            state._fsp--;

             after(grammarAccess.getParserRuleAccess().getRuleNameAndParamsParserRuleCall_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_0_0__1__Impl"


    // $ANTLR start "rule__ParserRule__Group_0_0__2"
    // InternalXtext.g:3725:1: rule__ParserRule__Group_0_0__2 : rule__ParserRule__Group_0_0__2__Impl ;
    public final void rule__ParserRule__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3729:1: ( rule__ParserRule__Group_0_0__2__Impl )
            // InternalXtext.g:3730:2: rule__ParserRule__Group_0_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group_0_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_0_0__2"


    // $ANTLR start "rule__ParserRule__Group_0_0__2__Impl"
    // InternalXtext.g:3736:1: rule__ParserRule__Group_0_0__2__Impl : ( ( rule__ParserRule__Alternatives_0_0_2 ) ) ;
    public final void rule__ParserRule__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3740:1: ( ( ( rule__ParserRule__Alternatives_0_0_2 ) ) )
            // InternalXtext.g:3741:1: ( ( rule__ParserRule__Alternatives_0_0_2 ) )
            {
            // InternalXtext.g:3741:1: ( ( rule__ParserRule__Alternatives_0_0_2 ) )
            // InternalXtext.g:3742:1: ( rule__ParserRule__Alternatives_0_0_2 )
            {
             before(grammarAccess.getParserRuleAccess().getAlternatives_0_0_2()); 
            // InternalXtext.g:3743:1: ( rule__ParserRule__Alternatives_0_0_2 )
            // InternalXtext.g:3743:2: rule__ParserRule__Alternatives_0_0_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Alternatives_0_0_2();

            state._fsp--;


            }

             after(grammarAccess.getParserRuleAccess().getAlternatives_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_0_0__2__Impl"


    // $ANTLR start "rule__ParserRule__Group_0_0_2_1__0"
    // InternalXtext.g:3759:1: rule__ParserRule__Group_0_0_2_1__0 : rule__ParserRule__Group_0_0_2_1__0__Impl rule__ParserRule__Group_0_0_2_1__1 ;
    public final void rule__ParserRule__Group_0_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3763:1: ( rule__ParserRule__Group_0_0_2_1__0__Impl rule__ParserRule__Group_0_0_2_1__1 )
            // InternalXtext.g:3764:2: rule__ParserRule__Group_0_0_2_1__0__Impl rule__ParserRule__Group_0_0_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__ParserRule__Group_0_0_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group_0_0_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_0_0_2_1__0"


    // $ANTLR start "rule__ParserRule__Group_0_0_2_1__0__Impl"
    // InternalXtext.g:3771:1: rule__ParserRule__Group_0_0_2_1__0__Impl : ( 'returns' ) ;
    public final void rule__ParserRule__Group_0_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3775:1: ( ( 'returns' ) )
            // InternalXtext.g:3776:1: ( 'returns' )
            {
            // InternalXtext.g:3776:1: ( 'returns' )
            // InternalXtext.g:3777:1: 'returns'
            {
             before(grammarAccess.getParserRuleAccess().getReturnsKeyword_0_0_2_1_0()); 
            match(input,34,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParserRuleAccess().getReturnsKeyword_0_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_0_0_2_1__0__Impl"


    // $ANTLR start "rule__ParserRule__Group_0_0_2_1__1"
    // InternalXtext.g:3790:1: rule__ParserRule__Group_0_0_2_1__1 : rule__ParserRule__Group_0_0_2_1__1__Impl ;
    public final void rule__ParserRule__Group_0_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3794:1: ( rule__ParserRule__Group_0_0_2_1__1__Impl )
            // InternalXtext.g:3795:2: rule__ParserRule__Group_0_0_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group_0_0_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_0_0_2_1__1"


    // $ANTLR start "rule__ParserRule__Group_0_0_2_1__1__Impl"
    // InternalXtext.g:3801:1: rule__ParserRule__Group_0_0_2_1__1__Impl : ( ( rule__ParserRule__TypeAssignment_0_0_2_1_1 ) ) ;
    public final void rule__ParserRule__Group_0_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3805:1: ( ( ( rule__ParserRule__TypeAssignment_0_0_2_1_1 ) ) )
            // InternalXtext.g:3806:1: ( ( rule__ParserRule__TypeAssignment_0_0_2_1_1 ) )
            {
            // InternalXtext.g:3806:1: ( ( rule__ParserRule__TypeAssignment_0_0_2_1_1 ) )
            // InternalXtext.g:3807:1: ( rule__ParserRule__TypeAssignment_0_0_2_1_1 )
            {
             before(grammarAccess.getParserRuleAccess().getTypeAssignment_0_0_2_1_1()); 
            // InternalXtext.g:3808:1: ( rule__ParserRule__TypeAssignment_0_0_2_1_1 )
            // InternalXtext.g:3808:2: rule__ParserRule__TypeAssignment_0_0_2_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__TypeAssignment_0_0_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getParserRuleAccess().getTypeAssignment_0_0_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_0_0_2_1__1__Impl"


    // $ANTLR start "rule__ParserRule__Group_0_1__0"
    // InternalXtext.g:3822:1: rule__ParserRule__Group_0_1__0 : rule__ParserRule__Group_0_1__0__Impl rule__ParserRule__Group_0_1__1 ;
    public final void rule__ParserRule__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3826:1: ( rule__ParserRule__Group_0_1__0__Impl rule__ParserRule__Group_0_1__1 )
            // InternalXtext.g:3827:2: rule__ParserRule__Group_0_1__0__Impl rule__ParserRule__Group_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__ParserRule__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_0_1__0"


    // $ANTLR start "rule__ParserRule__Group_0_1__0__Impl"
    // InternalXtext.g:3834:1: rule__ParserRule__Group_0_1__0__Impl : ( ruleRuleNameAndParams ) ;
    public final void rule__ParserRule__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3838:1: ( ( ruleRuleNameAndParams ) )
            // InternalXtext.g:3839:1: ( ruleRuleNameAndParams )
            {
            // InternalXtext.g:3839:1: ( ruleRuleNameAndParams )
            // InternalXtext.g:3840:1: ruleRuleNameAndParams
            {
             before(grammarAccess.getParserRuleAccess().getRuleNameAndParamsParserRuleCall_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRuleNameAndParams();

            state._fsp--;

             after(grammarAccess.getParserRuleAccess().getRuleNameAndParamsParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_0_1__0__Impl"


    // $ANTLR start "rule__ParserRule__Group_0_1__1"
    // InternalXtext.g:3851:1: rule__ParserRule__Group_0_1__1 : rule__ParserRule__Group_0_1__1__Impl ;
    public final void rule__ParserRule__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3855:1: ( rule__ParserRule__Group_0_1__1__Impl )
            // InternalXtext.g:3856:2: rule__ParserRule__Group_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_0_1__1"


    // $ANTLR start "rule__ParserRule__Group_0_1__1__Impl"
    // InternalXtext.g:3862:1: rule__ParserRule__Group_0_1__1__Impl : ( ( rule__ParserRule__Group_0_1_1__0 )? ) ;
    public final void rule__ParserRule__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3866:1: ( ( ( rule__ParserRule__Group_0_1_1__0 )? ) )
            // InternalXtext.g:3867:1: ( ( rule__ParserRule__Group_0_1_1__0 )? )
            {
            // InternalXtext.g:3867:1: ( ( rule__ParserRule__Group_0_1_1__0 )? )
            // InternalXtext.g:3868:1: ( rule__ParserRule__Group_0_1_1__0 )?
            {
             before(grammarAccess.getParserRuleAccess().getGroup_0_1_1()); 
            // InternalXtext.g:3869:1: ( rule__ParserRule__Group_0_1_1__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==34) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalXtext.g:3869:2: rule__ParserRule__Group_0_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ParserRule__Group_0_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParserRuleAccess().getGroup_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_0_1__1__Impl"


    // $ANTLR start "rule__ParserRule__Group_0_1_1__0"
    // InternalXtext.g:3883:1: rule__ParserRule__Group_0_1_1__0 : rule__ParserRule__Group_0_1_1__0__Impl rule__ParserRule__Group_0_1_1__1 ;
    public final void rule__ParserRule__Group_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3887:1: ( rule__ParserRule__Group_0_1_1__0__Impl rule__ParserRule__Group_0_1_1__1 )
            // InternalXtext.g:3888:2: rule__ParserRule__Group_0_1_1__0__Impl rule__ParserRule__Group_0_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__ParserRule__Group_0_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group_0_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_0_1_1__0"


    // $ANTLR start "rule__ParserRule__Group_0_1_1__0__Impl"
    // InternalXtext.g:3895:1: rule__ParserRule__Group_0_1_1__0__Impl : ( 'returns' ) ;
    public final void rule__ParserRule__Group_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3899:1: ( ( 'returns' ) )
            // InternalXtext.g:3900:1: ( 'returns' )
            {
            // InternalXtext.g:3900:1: ( 'returns' )
            // InternalXtext.g:3901:1: 'returns'
            {
             before(grammarAccess.getParserRuleAccess().getReturnsKeyword_0_1_1_0()); 
            match(input,34,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParserRuleAccess().getReturnsKeyword_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_0_1_1__0__Impl"


    // $ANTLR start "rule__ParserRule__Group_0_1_1__1"
    // InternalXtext.g:3914:1: rule__ParserRule__Group_0_1_1__1 : rule__ParserRule__Group_0_1_1__1__Impl ;
    public final void rule__ParserRule__Group_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3918:1: ( rule__ParserRule__Group_0_1_1__1__Impl )
            // InternalXtext.g:3919:2: rule__ParserRule__Group_0_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group_0_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_0_1_1__1"


    // $ANTLR start "rule__ParserRule__Group_0_1_1__1__Impl"
    // InternalXtext.g:3925:1: rule__ParserRule__Group_0_1_1__1__Impl : ( ( rule__ParserRule__TypeAssignment_0_1_1_1 ) ) ;
    public final void rule__ParserRule__Group_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3929:1: ( ( ( rule__ParserRule__TypeAssignment_0_1_1_1 ) ) )
            // InternalXtext.g:3930:1: ( ( rule__ParserRule__TypeAssignment_0_1_1_1 ) )
            {
            // InternalXtext.g:3930:1: ( ( rule__ParserRule__TypeAssignment_0_1_1_1 ) )
            // InternalXtext.g:3931:1: ( rule__ParserRule__TypeAssignment_0_1_1_1 )
            {
             before(grammarAccess.getParserRuleAccess().getTypeAssignment_0_1_1_1()); 
            // InternalXtext.g:3932:1: ( rule__ParserRule__TypeAssignment_0_1_1_1 )
            // InternalXtext.g:3932:2: rule__ParserRule__TypeAssignment_0_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__TypeAssignment_0_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getParserRuleAccess().getTypeAssignment_0_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_0_1_1__1__Impl"


    // $ANTLR start "rule__ParserRule__Group_2__0"
    // InternalXtext.g:3946:1: rule__ParserRule__Group_2__0 : rule__ParserRule__Group_2__0__Impl rule__ParserRule__Group_2__1 ;
    public final void rule__ParserRule__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3950:1: ( rule__ParserRule__Group_2__0__Impl rule__ParserRule__Group_2__1 )
            // InternalXtext.g:3951:2: rule__ParserRule__Group_2__0__Impl rule__ParserRule__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__ParserRule__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_2__0"


    // $ANTLR start "rule__ParserRule__Group_2__0__Impl"
    // InternalXtext.g:3958:1: rule__ParserRule__Group_2__0__Impl : ( ( rule__ParserRule__DefinesHiddenTokensAssignment_2_0 ) ) ;
    public final void rule__ParserRule__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3962:1: ( ( ( rule__ParserRule__DefinesHiddenTokensAssignment_2_0 ) ) )
            // InternalXtext.g:3963:1: ( ( rule__ParserRule__DefinesHiddenTokensAssignment_2_0 ) )
            {
            // InternalXtext.g:3963:1: ( ( rule__ParserRule__DefinesHiddenTokensAssignment_2_0 ) )
            // InternalXtext.g:3964:1: ( rule__ParserRule__DefinesHiddenTokensAssignment_2_0 )
            {
             before(grammarAccess.getParserRuleAccess().getDefinesHiddenTokensAssignment_2_0()); 
            // InternalXtext.g:3965:1: ( rule__ParserRule__DefinesHiddenTokensAssignment_2_0 )
            // InternalXtext.g:3965:2: rule__ParserRule__DefinesHiddenTokensAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__DefinesHiddenTokensAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getParserRuleAccess().getDefinesHiddenTokensAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_2__0__Impl"


    // $ANTLR start "rule__ParserRule__Group_2__1"
    // InternalXtext.g:3975:1: rule__ParserRule__Group_2__1 : rule__ParserRule__Group_2__1__Impl rule__ParserRule__Group_2__2 ;
    public final void rule__ParserRule__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3979:1: ( rule__ParserRule__Group_2__1__Impl rule__ParserRule__Group_2__2 )
            // InternalXtext.g:3980:2: rule__ParserRule__Group_2__1__Impl rule__ParserRule__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__ParserRule__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_2__1"


    // $ANTLR start "rule__ParserRule__Group_2__1__Impl"
    // InternalXtext.g:3987:1: rule__ParserRule__Group_2__1__Impl : ( '(' ) ;
    public final void rule__ParserRule__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:3991:1: ( ( '(' ) )
            // InternalXtext.g:3992:1: ( '(' )
            {
            // InternalXtext.g:3992:1: ( '(' )
            // InternalXtext.g:3993:1: '('
            {
             before(grammarAccess.getParserRuleAccess().getLeftParenthesisKeyword_2_1()); 
            match(input,26,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParserRuleAccess().getLeftParenthesisKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_2__1__Impl"


    // $ANTLR start "rule__ParserRule__Group_2__2"
    // InternalXtext.g:4006:1: rule__ParserRule__Group_2__2 : rule__ParserRule__Group_2__2__Impl rule__ParserRule__Group_2__3 ;
    public final void rule__ParserRule__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4010:1: ( rule__ParserRule__Group_2__2__Impl rule__ParserRule__Group_2__3 )
            // InternalXtext.g:4011:2: rule__ParserRule__Group_2__2__Impl rule__ParserRule__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__ParserRule__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_2__2"


    // $ANTLR start "rule__ParserRule__Group_2__2__Impl"
    // InternalXtext.g:4018:1: rule__ParserRule__Group_2__2__Impl : ( ( rule__ParserRule__Group_2_2__0 )? ) ;
    public final void rule__ParserRule__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4022:1: ( ( ( rule__ParserRule__Group_2_2__0 )? ) )
            // InternalXtext.g:4023:1: ( ( rule__ParserRule__Group_2_2__0 )? )
            {
            // InternalXtext.g:4023:1: ( ( rule__ParserRule__Group_2_2__0 )? )
            // InternalXtext.g:4024:1: ( rule__ParserRule__Group_2_2__0 )?
            {
             before(grammarAccess.getParserRuleAccess().getGroup_2_2()); 
            // InternalXtext.g:4025:1: ( rule__ParserRule__Group_2_2__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID||(LA43_0>=20 && LA43_0<=21)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalXtext.g:4025:2: rule__ParserRule__Group_2_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ParserRule__Group_2_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParserRuleAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_2__2__Impl"


    // $ANTLR start "rule__ParserRule__Group_2__3"
    // InternalXtext.g:4035:1: rule__ParserRule__Group_2__3 : rule__ParserRule__Group_2__3__Impl ;
    public final void rule__ParserRule__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4039:1: ( rule__ParserRule__Group_2__3__Impl )
            // InternalXtext.g:4040:2: rule__ParserRule__Group_2__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_2__3"


    // $ANTLR start "rule__ParserRule__Group_2__3__Impl"
    // InternalXtext.g:4046:1: rule__ParserRule__Group_2__3__Impl : ( ')' ) ;
    public final void rule__ParserRule__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4050:1: ( ( ')' ) )
            // InternalXtext.g:4051:1: ( ')' )
            {
            // InternalXtext.g:4051:1: ( ')' )
            // InternalXtext.g:4052:1: ')'
            {
             before(grammarAccess.getParserRuleAccess().getRightParenthesisKeyword_2_3()); 
            match(input,27,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParserRuleAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_2__3__Impl"


    // $ANTLR start "rule__ParserRule__Group_2_2__0"
    // InternalXtext.g:4073:1: rule__ParserRule__Group_2_2__0 : rule__ParserRule__Group_2_2__0__Impl rule__ParserRule__Group_2_2__1 ;
    public final void rule__ParserRule__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4077:1: ( rule__ParserRule__Group_2_2__0__Impl rule__ParserRule__Group_2_2__1 )
            // InternalXtext.g:4078:2: rule__ParserRule__Group_2_2__0__Impl rule__ParserRule__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__ParserRule__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_2_2__0"


    // $ANTLR start "rule__ParserRule__Group_2_2__0__Impl"
    // InternalXtext.g:4085:1: rule__ParserRule__Group_2_2__0__Impl : ( ( rule__ParserRule__HiddenTokensAssignment_2_2_0 ) ) ;
    public final void rule__ParserRule__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4089:1: ( ( ( rule__ParserRule__HiddenTokensAssignment_2_2_0 ) ) )
            // InternalXtext.g:4090:1: ( ( rule__ParserRule__HiddenTokensAssignment_2_2_0 ) )
            {
            // InternalXtext.g:4090:1: ( ( rule__ParserRule__HiddenTokensAssignment_2_2_0 ) )
            // InternalXtext.g:4091:1: ( rule__ParserRule__HiddenTokensAssignment_2_2_0 )
            {
             before(grammarAccess.getParserRuleAccess().getHiddenTokensAssignment_2_2_0()); 
            // InternalXtext.g:4092:1: ( rule__ParserRule__HiddenTokensAssignment_2_2_0 )
            // InternalXtext.g:4092:2: rule__ParserRule__HiddenTokensAssignment_2_2_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__HiddenTokensAssignment_2_2_0();

            state._fsp--;


            }

             after(grammarAccess.getParserRuleAccess().getHiddenTokensAssignment_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_2_2__0__Impl"


    // $ANTLR start "rule__ParserRule__Group_2_2__1"
    // InternalXtext.g:4102:1: rule__ParserRule__Group_2_2__1 : rule__ParserRule__Group_2_2__1__Impl ;
    public final void rule__ParserRule__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4106:1: ( rule__ParserRule__Group_2_2__1__Impl )
            // InternalXtext.g:4107:2: rule__ParserRule__Group_2_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_2_2__1"


    // $ANTLR start "rule__ParserRule__Group_2_2__1__Impl"
    // InternalXtext.g:4113:1: rule__ParserRule__Group_2_2__1__Impl : ( ( rule__ParserRule__Group_2_2_1__0 )* ) ;
    public final void rule__ParserRule__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4117:1: ( ( ( rule__ParserRule__Group_2_2_1__0 )* ) )
            // InternalXtext.g:4118:1: ( ( rule__ParserRule__Group_2_2_1__0 )* )
            {
            // InternalXtext.g:4118:1: ( ( rule__ParserRule__Group_2_2_1__0 )* )
            // InternalXtext.g:4119:1: ( rule__ParserRule__Group_2_2_1__0 )*
            {
             before(grammarAccess.getParserRuleAccess().getGroup_2_2_1()); 
            // InternalXtext.g:4120:1: ( rule__ParserRule__Group_2_2_1__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==25) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalXtext.g:4120:2: rule__ParserRule__Group_2_2_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    rule__ParserRule__Group_2_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getParserRuleAccess().getGroup_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_2_2__1__Impl"


    // $ANTLR start "rule__ParserRule__Group_2_2_1__0"
    // InternalXtext.g:4134:1: rule__ParserRule__Group_2_2_1__0 : rule__ParserRule__Group_2_2_1__0__Impl rule__ParserRule__Group_2_2_1__1 ;
    public final void rule__ParserRule__Group_2_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4138:1: ( rule__ParserRule__Group_2_2_1__0__Impl rule__ParserRule__Group_2_2_1__1 )
            // InternalXtext.g:4139:2: rule__ParserRule__Group_2_2_1__0__Impl rule__ParserRule__Group_2_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__ParserRule__Group_2_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group_2_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_2_2_1__0"


    // $ANTLR start "rule__ParserRule__Group_2_2_1__0__Impl"
    // InternalXtext.g:4146:1: rule__ParserRule__Group_2_2_1__0__Impl : ( ',' ) ;
    public final void rule__ParserRule__Group_2_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4150:1: ( ( ',' ) )
            // InternalXtext.g:4151:1: ( ',' )
            {
            // InternalXtext.g:4151:1: ( ',' )
            // InternalXtext.g:4152:1: ','
            {
             before(grammarAccess.getParserRuleAccess().getCommaKeyword_2_2_1_0()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParserRuleAccess().getCommaKeyword_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_2_2_1__0__Impl"


    // $ANTLR start "rule__ParserRule__Group_2_2_1__1"
    // InternalXtext.g:4165:1: rule__ParserRule__Group_2_2_1__1 : rule__ParserRule__Group_2_2_1__1__Impl ;
    public final void rule__ParserRule__Group_2_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4169:1: ( rule__ParserRule__Group_2_2_1__1__Impl )
            // InternalXtext.g:4170:2: rule__ParserRule__Group_2_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__Group_2_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_2_2_1__1"


    // $ANTLR start "rule__ParserRule__Group_2_2_1__1__Impl"
    // InternalXtext.g:4176:1: rule__ParserRule__Group_2_2_1__1__Impl : ( ( rule__ParserRule__HiddenTokensAssignment_2_2_1_1 ) ) ;
    public final void rule__ParserRule__Group_2_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4180:1: ( ( ( rule__ParserRule__HiddenTokensAssignment_2_2_1_1 ) ) )
            // InternalXtext.g:4181:1: ( ( rule__ParserRule__HiddenTokensAssignment_2_2_1_1 ) )
            {
            // InternalXtext.g:4181:1: ( ( rule__ParserRule__HiddenTokensAssignment_2_2_1_1 ) )
            // InternalXtext.g:4182:1: ( rule__ParserRule__HiddenTokensAssignment_2_2_1_1 )
            {
             before(grammarAccess.getParserRuleAccess().getHiddenTokensAssignment_2_2_1_1()); 
            // InternalXtext.g:4183:1: ( rule__ParserRule__HiddenTokensAssignment_2_2_1_1 )
            // InternalXtext.g:4183:2: rule__ParserRule__HiddenTokensAssignment_2_2_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParserRule__HiddenTokensAssignment_2_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getParserRuleAccess().getHiddenTokensAssignment_2_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__Group_2_2_1__1__Impl"


    // $ANTLR start "rule__MyInitAfterActions__Group__0"
    // InternalXtext.g:4197:1: rule__MyInitAfterActions__Group__0 : rule__MyInitAfterActions__Group__0__Impl rule__MyInitAfterActions__Group__1 ;
    public final void rule__MyInitAfterActions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4201:1: ( rule__MyInitAfterActions__Group__0__Impl rule__MyInitAfterActions__Group__1 )
            // InternalXtext.g:4202:2: rule__MyInitAfterActions__Group__0__Impl rule__MyInitAfterActions__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__MyInitAfterActions__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__MyInitAfterActions__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyInitAfterActions__Group__0"


    // $ANTLR start "rule__MyInitAfterActions__Group__0__Impl"
    // InternalXtext.g:4209:1: rule__MyInitAfterActions__Group__0__Impl : ( ( rule__MyInitAfterActions__Alternatives_0 ) ) ;
    public final void rule__MyInitAfterActions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4213:1: ( ( ( rule__MyInitAfterActions__Alternatives_0 ) ) )
            // InternalXtext.g:4214:1: ( ( rule__MyInitAfterActions__Alternatives_0 ) )
            {
            // InternalXtext.g:4214:1: ( ( rule__MyInitAfterActions__Alternatives_0 ) )
            // InternalXtext.g:4215:1: ( rule__MyInitAfterActions__Alternatives_0 )
            {
             before(grammarAccess.getMyInitAfterActionsAccess().getAlternatives_0()); 
            // InternalXtext.g:4216:1: ( rule__MyInitAfterActions__Alternatives_0 )
            // InternalXtext.g:4216:2: rule__MyInitAfterActions__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MyInitAfterActions__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getMyInitAfterActionsAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyInitAfterActions__Group__0__Impl"


    // $ANTLR start "rule__MyInitAfterActions__Group__1"
    // InternalXtext.g:4226:1: rule__MyInitAfterActions__Group__1 : rule__MyInitAfterActions__Group__1__Impl rule__MyInitAfterActions__Group__2 ;
    public final void rule__MyInitAfterActions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4230:1: ( rule__MyInitAfterActions__Group__1__Impl rule__MyInitAfterActions__Group__2 )
            // InternalXtext.g:4231:2: rule__MyInitAfterActions__Group__1__Impl rule__MyInitAfterActions__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__MyInitAfterActions__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__MyInitAfterActions__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyInitAfterActions__Group__1"


    // $ANTLR start "rule__MyInitAfterActions__Group__1__Impl"
    // InternalXtext.g:4238:1: rule__MyInitAfterActions__Group__1__Impl : ( '{' ) ;
    public final void rule__MyInitAfterActions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4242:1: ( ( '{' ) )
            // InternalXtext.g:4243:1: ( '{' )
            {
            // InternalXtext.g:4243:1: ( '{' )
            // InternalXtext.g:4244:1: '{'
            {
             before(grammarAccess.getMyInitAfterActionsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,35,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getMyInitAfterActionsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyInitAfterActions__Group__1__Impl"


    // $ANTLR start "rule__MyInitAfterActions__Group__2"
    // InternalXtext.g:4257:1: rule__MyInitAfterActions__Group__2 : rule__MyInitAfterActions__Group__2__Impl ;
    public final void rule__MyInitAfterActions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4261:1: ( rule__MyInitAfterActions__Group__2__Impl )
            // InternalXtext.g:4262:2: rule__MyInitAfterActions__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MyInitAfterActions__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyInitAfterActions__Group__2"


    // $ANTLR start "rule__MyInitAfterActions__Group__2__Impl"
    // InternalXtext.g:4268:1: rule__MyInitAfterActions__Group__2__Impl : ( '}' ) ;
    public final void rule__MyInitAfterActions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4272:1: ( ( '}' ) )
            // InternalXtext.g:4273:1: ( '}' )
            {
            // InternalXtext.g:4273:1: ( '}' )
            // InternalXtext.g:4274:1: '}'
            {
             before(grammarAccess.getMyInitAfterActionsAccess().getRightCurlyBracketKeyword_2()); 
            match(input,36,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getMyInitAfterActionsAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyInitAfterActions__Group__2__Impl"


    // $ANTLR start "rule__RuleNameAndParams__Group__0"
    // InternalXtext.g:4293:1: rule__RuleNameAndParams__Group__0 : rule__RuleNameAndParams__Group__0__Impl rule__RuleNameAndParams__Group__1 ;
    public final void rule__RuleNameAndParams__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4297:1: ( rule__RuleNameAndParams__Group__0__Impl rule__RuleNameAndParams__Group__1 )
            // InternalXtext.g:4298:2: rule__RuleNameAndParams__Group__0__Impl rule__RuleNameAndParams__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__RuleNameAndParams__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleNameAndParams__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__Group__0"


    // $ANTLR start "rule__RuleNameAndParams__Group__0__Impl"
    // InternalXtext.g:4305:1: rule__RuleNameAndParams__Group__0__Impl : ( ( rule__RuleNameAndParams__NameAssignment_0 ) ) ;
    public final void rule__RuleNameAndParams__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4309:1: ( ( ( rule__RuleNameAndParams__NameAssignment_0 ) ) )
            // InternalXtext.g:4310:1: ( ( rule__RuleNameAndParams__NameAssignment_0 ) )
            {
            // InternalXtext.g:4310:1: ( ( rule__RuleNameAndParams__NameAssignment_0 ) )
            // InternalXtext.g:4311:1: ( rule__RuleNameAndParams__NameAssignment_0 )
            {
             before(grammarAccess.getRuleNameAndParamsAccess().getNameAssignment_0()); 
            // InternalXtext.g:4312:1: ( rule__RuleNameAndParams__NameAssignment_0 )
            // InternalXtext.g:4312:2: rule__RuleNameAndParams__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleNameAndParams__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleNameAndParamsAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__Group__0__Impl"


    // $ANTLR start "rule__RuleNameAndParams__Group__1"
    // InternalXtext.g:4322:1: rule__RuleNameAndParams__Group__1 : rule__RuleNameAndParams__Group__1__Impl ;
    public final void rule__RuleNameAndParams__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4326:1: ( rule__RuleNameAndParams__Group__1__Impl )
            // InternalXtext.g:4327:2: rule__RuleNameAndParams__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleNameAndParams__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__Group__1"


    // $ANTLR start "rule__RuleNameAndParams__Group__1__Impl"
    // InternalXtext.g:4333:1: rule__RuleNameAndParams__Group__1__Impl : ( ( rule__RuleNameAndParams__Group_1__0 )? ) ;
    public final void rule__RuleNameAndParams__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4337:1: ( ( ( rule__RuleNameAndParams__Group_1__0 )? ) )
            // InternalXtext.g:4338:1: ( ( rule__RuleNameAndParams__Group_1__0 )? )
            {
            // InternalXtext.g:4338:1: ( ( rule__RuleNameAndParams__Group_1__0 )? )
            // InternalXtext.g:4339:1: ( rule__RuleNameAndParams__Group_1__0 )?
            {
             before(grammarAccess.getRuleNameAndParamsAccess().getGroup_1()); 
            // InternalXtext.g:4340:1: ( rule__RuleNameAndParams__Group_1__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==37) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalXtext.g:4340:2: rule__RuleNameAndParams__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__RuleNameAndParams__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleNameAndParamsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__Group__1__Impl"


    // $ANTLR start "rule__RuleNameAndParams__Group_1__0"
    // InternalXtext.g:4354:1: rule__RuleNameAndParams__Group_1__0 : rule__RuleNameAndParams__Group_1__0__Impl rule__RuleNameAndParams__Group_1__1 ;
    public final void rule__RuleNameAndParams__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4358:1: ( rule__RuleNameAndParams__Group_1__0__Impl rule__RuleNameAndParams__Group_1__1 )
            // InternalXtext.g:4359:2: rule__RuleNameAndParams__Group_1__0__Impl rule__RuleNameAndParams__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__RuleNameAndParams__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleNameAndParams__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__Group_1__0"


    // $ANTLR start "rule__RuleNameAndParams__Group_1__0__Impl"
    // InternalXtext.g:4366:1: rule__RuleNameAndParams__Group_1__0__Impl : ( '<' ) ;
    public final void rule__RuleNameAndParams__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4370:1: ( ( '<' ) )
            // InternalXtext.g:4371:1: ( '<' )
            {
            // InternalXtext.g:4371:1: ( '<' )
            // InternalXtext.g:4372:1: '<'
            {
             before(grammarAccess.getRuleNameAndParamsAccess().getLessThanSignKeyword_1_0()); 
            match(input,37,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRuleNameAndParamsAccess().getLessThanSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__Group_1__0__Impl"


    // $ANTLR start "rule__RuleNameAndParams__Group_1__1"
    // InternalXtext.g:4385:1: rule__RuleNameAndParams__Group_1__1 : rule__RuleNameAndParams__Group_1__1__Impl rule__RuleNameAndParams__Group_1__2 ;
    public final void rule__RuleNameAndParams__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4389:1: ( rule__RuleNameAndParams__Group_1__1__Impl rule__RuleNameAndParams__Group_1__2 )
            // InternalXtext.g:4390:2: rule__RuleNameAndParams__Group_1__1__Impl rule__RuleNameAndParams__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__RuleNameAndParams__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleNameAndParams__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__Group_1__1"


    // $ANTLR start "rule__RuleNameAndParams__Group_1__1__Impl"
    // InternalXtext.g:4397:1: rule__RuleNameAndParams__Group_1__1__Impl : ( ( rule__RuleNameAndParams__Group_1_1__0 )? ) ;
    public final void rule__RuleNameAndParams__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4401:1: ( ( ( rule__RuleNameAndParams__Group_1_1__0 )? ) )
            // InternalXtext.g:4402:1: ( ( rule__RuleNameAndParams__Group_1_1__0 )? )
            {
            // InternalXtext.g:4402:1: ( ( rule__RuleNameAndParams__Group_1_1__0 )? )
            // InternalXtext.g:4403:1: ( rule__RuleNameAndParams__Group_1_1__0 )?
            {
             before(grammarAccess.getRuleNameAndParamsAccess().getGroup_1_1()); 
            // InternalXtext.g:4404:1: ( rule__RuleNameAndParams__Group_1_1__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalXtext.g:4404:2: rule__RuleNameAndParams__Group_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__RuleNameAndParams__Group_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleNameAndParamsAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__Group_1__1__Impl"


    // $ANTLR start "rule__RuleNameAndParams__Group_1__2"
    // InternalXtext.g:4414:1: rule__RuleNameAndParams__Group_1__2 : rule__RuleNameAndParams__Group_1__2__Impl ;
    public final void rule__RuleNameAndParams__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4418:1: ( rule__RuleNameAndParams__Group_1__2__Impl )
            // InternalXtext.g:4419:2: rule__RuleNameAndParams__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleNameAndParams__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__Group_1__2"


    // $ANTLR start "rule__RuleNameAndParams__Group_1__2__Impl"
    // InternalXtext.g:4425:1: rule__RuleNameAndParams__Group_1__2__Impl : ( '>' ) ;
    public final void rule__RuleNameAndParams__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4429:1: ( ( '>' ) )
            // InternalXtext.g:4430:1: ( '>' )
            {
            // InternalXtext.g:4430:1: ( '>' )
            // InternalXtext.g:4431:1: '>'
            {
             before(grammarAccess.getRuleNameAndParamsAccess().getGreaterThanSignKeyword_1_2()); 
            match(input,38,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRuleNameAndParamsAccess().getGreaterThanSignKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__Group_1__2__Impl"


    // $ANTLR start "rule__RuleNameAndParams__Group_1_1__0"
    // InternalXtext.g:4450:1: rule__RuleNameAndParams__Group_1_1__0 : rule__RuleNameAndParams__Group_1_1__0__Impl rule__RuleNameAndParams__Group_1_1__1 ;
    public final void rule__RuleNameAndParams__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4454:1: ( rule__RuleNameAndParams__Group_1_1__0__Impl rule__RuleNameAndParams__Group_1_1__1 )
            // InternalXtext.g:4455:2: rule__RuleNameAndParams__Group_1_1__0__Impl rule__RuleNameAndParams__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__RuleNameAndParams__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleNameAndParams__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__Group_1_1__0"


    // $ANTLR start "rule__RuleNameAndParams__Group_1_1__0__Impl"
    // InternalXtext.g:4462:1: rule__RuleNameAndParams__Group_1_1__0__Impl : ( ( rule__RuleNameAndParams__ParametersAssignment_1_1_0 ) ) ;
    public final void rule__RuleNameAndParams__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4466:1: ( ( ( rule__RuleNameAndParams__ParametersAssignment_1_1_0 ) ) )
            // InternalXtext.g:4467:1: ( ( rule__RuleNameAndParams__ParametersAssignment_1_1_0 ) )
            {
            // InternalXtext.g:4467:1: ( ( rule__RuleNameAndParams__ParametersAssignment_1_1_0 ) )
            // InternalXtext.g:4468:1: ( rule__RuleNameAndParams__ParametersAssignment_1_1_0 )
            {
             before(grammarAccess.getRuleNameAndParamsAccess().getParametersAssignment_1_1_0()); 
            // InternalXtext.g:4469:1: ( rule__RuleNameAndParams__ParametersAssignment_1_1_0 )
            // InternalXtext.g:4469:2: rule__RuleNameAndParams__ParametersAssignment_1_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleNameAndParams__ParametersAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleNameAndParamsAccess().getParametersAssignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__Group_1_1__0__Impl"


    // $ANTLR start "rule__RuleNameAndParams__Group_1_1__1"
    // InternalXtext.g:4479:1: rule__RuleNameAndParams__Group_1_1__1 : rule__RuleNameAndParams__Group_1_1__1__Impl ;
    public final void rule__RuleNameAndParams__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4483:1: ( rule__RuleNameAndParams__Group_1_1__1__Impl )
            // InternalXtext.g:4484:2: rule__RuleNameAndParams__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleNameAndParams__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__Group_1_1__1"


    // $ANTLR start "rule__RuleNameAndParams__Group_1_1__1__Impl"
    // InternalXtext.g:4490:1: rule__RuleNameAndParams__Group_1_1__1__Impl : ( ( rule__RuleNameAndParams__Group_1_1_1__0 )* ) ;
    public final void rule__RuleNameAndParams__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4494:1: ( ( ( rule__RuleNameAndParams__Group_1_1_1__0 )* ) )
            // InternalXtext.g:4495:1: ( ( rule__RuleNameAndParams__Group_1_1_1__0 )* )
            {
            // InternalXtext.g:4495:1: ( ( rule__RuleNameAndParams__Group_1_1_1__0 )* )
            // InternalXtext.g:4496:1: ( rule__RuleNameAndParams__Group_1_1_1__0 )*
            {
             before(grammarAccess.getRuleNameAndParamsAccess().getGroup_1_1_1()); 
            // InternalXtext.g:4497:1: ( rule__RuleNameAndParams__Group_1_1_1__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==25) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalXtext.g:4497:2: rule__RuleNameAndParams__Group_1_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    rule__RuleNameAndParams__Group_1_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getRuleNameAndParamsAccess().getGroup_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__Group_1_1__1__Impl"


    // $ANTLR start "rule__RuleNameAndParams__Group_1_1_1__0"
    // InternalXtext.g:4511:1: rule__RuleNameAndParams__Group_1_1_1__0 : rule__RuleNameAndParams__Group_1_1_1__0__Impl rule__RuleNameAndParams__Group_1_1_1__1 ;
    public final void rule__RuleNameAndParams__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4515:1: ( rule__RuleNameAndParams__Group_1_1_1__0__Impl rule__RuleNameAndParams__Group_1_1_1__1 )
            // InternalXtext.g:4516:2: rule__RuleNameAndParams__Group_1_1_1__0__Impl rule__RuleNameAndParams__Group_1_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__RuleNameAndParams__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleNameAndParams__Group_1_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__Group_1_1_1__0"


    // $ANTLR start "rule__RuleNameAndParams__Group_1_1_1__0__Impl"
    // InternalXtext.g:4523:1: rule__RuleNameAndParams__Group_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__RuleNameAndParams__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4527:1: ( ( ',' ) )
            // InternalXtext.g:4528:1: ( ',' )
            {
            // InternalXtext.g:4528:1: ( ',' )
            // InternalXtext.g:4529:1: ','
            {
             before(grammarAccess.getRuleNameAndParamsAccess().getCommaKeyword_1_1_1_0()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRuleNameAndParamsAccess().getCommaKeyword_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__RuleNameAndParams__Group_1_1_1__1"
    // InternalXtext.g:4542:1: rule__RuleNameAndParams__Group_1_1_1__1 : rule__RuleNameAndParams__Group_1_1_1__1__Impl ;
    public final void rule__RuleNameAndParams__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4546:1: ( rule__RuleNameAndParams__Group_1_1_1__1__Impl )
            // InternalXtext.g:4547:2: rule__RuleNameAndParams__Group_1_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleNameAndParams__Group_1_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__Group_1_1_1__1"


    // $ANTLR start "rule__RuleNameAndParams__Group_1_1_1__1__Impl"
    // InternalXtext.g:4553:1: rule__RuleNameAndParams__Group_1_1_1__1__Impl : ( ( rule__RuleNameAndParams__ParametersAssignment_1_1_1_1 ) ) ;
    public final void rule__RuleNameAndParams__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4557:1: ( ( ( rule__RuleNameAndParams__ParametersAssignment_1_1_1_1 ) ) )
            // InternalXtext.g:4558:1: ( ( rule__RuleNameAndParams__ParametersAssignment_1_1_1_1 ) )
            {
            // InternalXtext.g:4558:1: ( ( rule__RuleNameAndParams__ParametersAssignment_1_1_1_1 ) )
            // InternalXtext.g:4559:1: ( rule__RuleNameAndParams__ParametersAssignment_1_1_1_1 )
            {
             before(grammarAccess.getRuleNameAndParamsAccess().getParametersAssignment_1_1_1_1()); 
            // InternalXtext.g:4560:1: ( rule__RuleNameAndParams__ParametersAssignment_1_1_1_1 )
            // InternalXtext.g:4560:2: rule__RuleNameAndParams__ParametersAssignment_1_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleNameAndParams__ParametersAssignment_1_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleNameAndParamsAccess().getParametersAssignment_1_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__TypeRef__Group__0"
    // InternalXtext.g:4574:1: rule__TypeRef__Group__0 : rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 ;
    public final void rule__TypeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4578:1: ( rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 )
            // InternalXtext.g:4579:2: rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__TypeRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalXtext.g:4586:1: rule__TypeRef__Group__0__Impl : ( ( rule__TypeRef__Group_0__0 )? ) ;
    public final void rule__TypeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4590:1: ( ( ( rule__TypeRef__Group_0__0 )? ) )
            // InternalXtext.g:4591:1: ( ( rule__TypeRef__Group_0__0 )? )
            {
            // InternalXtext.g:4591:1: ( ( rule__TypeRef__Group_0__0 )? )
            // InternalXtext.g:4592:1: ( rule__TypeRef__Group_0__0 )?
            {
             before(grammarAccess.getTypeRefAccess().getGroup_0()); 
            // InternalXtext.g:4593:1: ( rule__TypeRef__Group_0__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==39) ) {
                    alt48=1;
                }
            }
            switch (alt48) {
                case 1 :
                    // InternalXtext.g:4593:2: rule__TypeRef__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TypeRef__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeRefAccess().getGroup_0()); 

            }


            }

        }
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
    // InternalXtext.g:4603:1: rule__TypeRef__Group__1 : rule__TypeRef__Group__1__Impl ;
    public final void rule__TypeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4607:1: ( rule__TypeRef__Group__1__Impl )
            // InternalXtext.g:4608:2: rule__TypeRef__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalXtext.g:4614:1: rule__TypeRef__Group__1__Impl : ( ( rule__TypeRef__ClassifierAssignment_1 ) ) ;
    public final void rule__TypeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4618:1: ( ( ( rule__TypeRef__ClassifierAssignment_1 ) ) )
            // InternalXtext.g:4619:1: ( ( rule__TypeRef__ClassifierAssignment_1 ) )
            {
            // InternalXtext.g:4619:1: ( ( rule__TypeRef__ClassifierAssignment_1 ) )
            // InternalXtext.g:4620:1: ( rule__TypeRef__ClassifierAssignment_1 )
            {
             before(grammarAccess.getTypeRefAccess().getClassifierAssignment_1()); 
            // InternalXtext.g:4621:1: ( rule__TypeRef__ClassifierAssignment_1 )
            // InternalXtext.g:4621:2: rule__TypeRef__ClassifierAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeRef__ClassifierAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeRefAccess().getClassifierAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__TypeRef__Group_0__0"
    // InternalXtext.g:4635:1: rule__TypeRef__Group_0__0 : rule__TypeRef__Group_0__0__Impl rule__TypeRef__Group_0__1 ;
    public final void rule__TypeRef__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4639:1: ( rule__TypeRef__Group_0__0__Impl rule__TypeRef__Group_0__1 )
            // InternalXtext.g:4640:2: rule__TypeRef__Group_0__0__Impl rule__TypeRef__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__TypeRef__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeRef__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group_0__0"


    // $ANTLR start "rule__TypeRef__Group_0__0__Impl"
    // InternalXtext.g:4647:1: rule__TypeRef__Group_0__0__Impl : ( ( rule__TypeRef__MetamodelAssignment_0_0 ) ) ;
    public final void rule__TypeRef__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4651:1: ( ( ( rule__TypeRef__MetamodelAssignment_0_0 ) ) )
            // InternalXtext.g:4652:1: ( ( rule__TypeRef__MetamodelAssignment_0_0 ) )
            {
            // InternalXtext.g:4652:1: ( ( rule__TypeRef__MetamodelAssignment_0_0 ) )
            // InternalXtext.g:4653:1: ( rule__TypeRef__MetamodelAssignment_0_0 )
            {
             before(grammarAccess.getTypeRefAccess().getMetamodelAssignment_0_0()); 
            // InternalXtext.g:4654:1: ( rule__TypeRef__MetamodelAssignment_0_0 )
            // InternalXtext.g:4654:2: rule__TypeRef__MetamodelAssignment_0_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeRef__MetamodelAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeRefAccess().getMetamodelAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group_0__0__Impl"


    // $ANTLR start "rule__TypeRef__Group_0__1"
    // InternalXtext.g:4664:1: rule__TypeRef__Group_0__1 : rule__TypeRef__Group_0__1__Impl ;
    public final void rule__TypeRef__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4668:1: ( rule__TypeRef__Group_0__1__Impl )
            // InternalXtext.g:4669:2: rule__TypeRef__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeRef__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group_0__1"


    // $ANTLR start "rule__TypeRef__Group_0__1__Impl"
    // InternalXtext.g:4675:1: rule__TypeRef__Group_0__1__Impl : ( '::' ) ;
    public final void rule__TypeRef__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4679:1: ( ( '::' ) )
            // InternalXtext.g:4680:1: ( '::' )
            {
            // InternalXtext.g:4680:1: ( '::' )
            // InternalXtext.g:4681:1: '::'
            {
             before(grammarAccess.getTypeRefAccess().getColonColonKeyword_0_1()); 
            match(input,39,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTypeRefAccess().getColonColonKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group_0__1__Impl"


    // $ANTLR start "rule__Alternatives__Group__0"
    // InternalXtext.g:4698:1: rule__Alternatives__Group__0 : rule__Alternatives__Group__0__Impl rule__Alternatives__Group__1 ;
    public final void rule__Alternatives__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4702:1: ( rule__Alternatives__Group__0__Impl rule__Alternatives__Group__1 )
            // InternalXtext.g:4703:2: rule__Alternatives__Group__0__Impl rule__Alternatives__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__Alternatives__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Alternatives__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__0"


    // $ANTLR start "rule__Alternatives__Group__0__Impl"
    // InternalXtext.g:4710:1: rule__Alternatives__Group__0__Impl : ( ruleConditionalBranch ) ;
    public final void rule__Alternatives__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4714:1: ( ( ruleConditionalBranch ) )
            // InternalXtext.g:4715:1: ( ruleConditionalBranch )
            {
            // InternalXtext.g:4715:1: ( ruleConditionalBranch )
            // InternalXtext.g:4716:1: ruleConditionalBranch
            {
             before(grammarAccess.getAlternativesAccess().getConditionalBranchParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleConditionalBranch();

            state._fsp--;

             after(grammarAccess.getAlternativesAccess().getConditionalBranchParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__0__Impl"


    // $ANTLR start "rule__Alternatives__Group__1"
    // InternalXtext.g:4727:1: rule__Alternatives__Group__1 : rule__Alternatives__Group__1__Impl ;
    public final void rule__Alternatives__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4731:1: ( rule__Alternatives__Group__1__Impl )
            // InternalXtext.g:4732:2: rule__Alternatives__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Alternatives__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__1"


    // $ANTLR start "rule__Alternatives__Group__1__Impl"
    // InternalXtext.g:4738:1: rule__Alternatives__Group__1__Impl : ( ( rule__Alternatives__Group_1__0 )? ) ;
    public final void rule__Alternatives__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4742:1: ( ( ( rule__Alternatives__Group_1__0 )? ) )
            // InternalXtext.g:4743:1: ( ( rule__Alternatives__Group_1__0 )? )
            {
            // InternalXtext.g:4743:1: ( ( rule__Alternatives__Group_1__0 )? )
            // InternalXtext.g:4744:1: ( rule__Alternatives__Group_1__0 )?
            {
             before(grammarAccess.getAlternativesAccess().getGroup_1()); 
            // InternalXtext.g:4745:1: ( rule__Alternatives__Group_1__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==40) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalXtext.g:4745:2: rule__Alternatives__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Alternatives__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAlternativesAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__1__Impl"


    // $ANTLR start "rule__Alternatives__Group_1__0"
    // InternalXtext.g:4759:1: rule__Alternatives__Group_1__0 : rule__Alternatives__Group_1__0__Impl rule__Alternatives__Group_1__1 ;
    public final void rule__Alternatives__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4763:1: ( rule__Alternatives__Group_1__0__Impl rule__Alternatives__Group_1__1 )
            // InternalXtext.g:4764:2: rule__Alternatives__Group_1__0__Impl rule__Alternatives__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__Alternatives__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Alternatives__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group_1__0"


    // $ANTLR start "rule__Alternatives__Group_1__0__Impl"
    // InternalXtext.g:4771:1: rule__Alternatives__Group_1__0__Impl : ( () ) ;
    public final void rule__Alternatives__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4775:1: ( ( () ) )
            // InternalXtext.g:4776:1: ( () )
            {
            // InternalXtext.g:4776:1: ( () )
            // InternalXtext.g:4777:1: ()
            {
             before(grammarAccess.getAlternativesAccess().getAlternativesElementsAction_1_0()); 
            // InternalXtext.g:4778:1: ()
            // InternalXtext.g:4780:1: 
            {
            }

             after(grammarAccess.getAlternativesAccess().getAlternativesElementsAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group_1__0__Impl"


    // $ANTLR start "rule__Alternatives__Group_1__1"
    // InternalXtext.g:4790:1: rule__Alternatives__Group_1__1 : rule__Alternatives__Group_1__1__Impl ;
    public final void rule__Alternatives__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4794:1: ( rule__Alternatives__Group_1__1__Impl )
            // InternalXtext.g:4795:2: rule__Alternatives__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Alternatives__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group_1__1"


    // $ANTLR start "rule__Alternatives__Group_1__1__Impl"
    // InternalXtext.g:4801:1: rule__Alternatives__Group_1__1__Impl : ( ( ( rule__Alternatives__Group_1_1__0 ) ) ( ( rule__Alternatives__Group_1_1__0 )* ) ) ;
    public final void rule__Alternatives__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4805:1: ( ( ( ( rule__Alternatives__Group_1_1__0 ) ) ( ( rule__Alternatives__Group_1_1__0 )* ) ) )
            // InternalXtext.g:4806:1: ( ( ( rule__Alternatives__Group_1_1__0 ) ) ( ( rule__Alternatives__Group_1_1__0 )* ) )
            {
            // InternalXtext.g:4806:1: ( ( ( rule__Alternatives__Group_1_1__0 ) ) ( ( rule__Alternatives__Group_1_1__0 )* ) )
            // InternalXtext.g:4807:1: ( ( rule__Alternatives__Group_1_1__0 ) ) ( ( rule__Alternatives__Group_1_1__0 )* )
            {
            // InternalXtext.g:4807:1: ( ( rule__Alternatives__Group_1_1__0 ) )
            // InternalXtext.g:4808:1: ( rule__Alternatives__Group_1_1__0 )
            {
             before(grammarAccess.getAlternativesAccess().getGroup_1_1()); 
            // InternalXtext.g:4809:1: ( rule__Alternatives__Group_1_1__0 )
            // InternalXtext.g:4809:2: rule__Alternatives__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_28);
            rule__Alternatives__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getAlternativesAccess().getGroup_1_1()); 

            }

            // InternalXtext.g:4812:1: ( ( rule__Alternatives__Group_1_1__0 )* )
            // InternalXtext.g:4813:1: ( rule__Alternatives__Group_1_1__0 )*
            {
             before(grammarAccess.getAlternativesAccess().getGroup_1_1()); 
            // InternalXtext.g:4814:1: ( rule__Alternatives__Group_1_1__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==40) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalXtext.g:4814:2: rule__Alternatives__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__Alternatives__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getAlternativesAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__Alternatives__Group_1__1__Impl"


    // $ANTLR start "rule__Alternatives__Group_1_1__0"
    // InternalXtext.g:4829:1: rule__Alternatives__Group_1_1__0 : rule__Alternatives__Group_1_1__0__Impl rule__Alternatives__Group_1_1__1 ;
    public final void rule__Alternatives__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4833:1: ( rule__Alternatives__Group_1_1__0__Impl rule__Alternatives__Group_1_1__1 )
            // InternalXtext.g:4834:2: rule__Alternatives__Group_1_1__0__Impl rule__Alternatives__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__Alternatives__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Alternatives__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group_1_1__0"


    // $ANTLR start "rule__Alternatives__Group_1_1__0__Impl"
    // InternalXtext.g:4841:1: rule__Alternatives__Group_1_1__0__Impl : ( '|' ) ;
    public final void rule__Alternatives__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4845:1: ( ( '|' ) )
            // InternalXtext.g:4846:1: ( '|' )
            {
            // InternalXtext.g:4846:1: ( '|' )
            // InternalXtext.g:4847:1: '|'
            {
             before(grammarAccess.getAlternativesAccess().getVerticalLineKeyword_1_1_0()); 
            match(input,40,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAlternativesAccess().getVerticalLineKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group_1_1__0__Impl"


    // $ANTLR start "rule__Alternatives__Group_1_1__1"
    // InternalXtext.g:4860:1: rule__Alternatives__Group_1_1__1 : rule__Alternatives__Group_1_1__1__Impl ;
    public final void rule__Alternatives__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4864:1: ( rule__Alternatives__Group_1_1__1__Impl )
            // InternalXtext.g:4865:2: rule__Alternatives__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Alternatives__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group_1_1__1"


    // $ANTLR start "rule__Alternatives__Group_1_1__1__Impl"
    // InternalXtext.g:4871:1: rule__Alternatives__Group_1_1__1__Impl : ( ( rule__Alternatives__ElementsAssignment_1_1_1 ) ) ;
    public final void rule__Alternatives__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4875:1: ( ( ( rule__Alternatives__ElementsAssignment_1_1_1 ) ) )
            // InternalXtext.g:4876:1: ( ( rule__Alternatives__ElementsAssignment_1_1_1 ) )
            {
            // InternalXtext.g:4876:1: ( ( rule__Alternatives__ElementsAssignment_1_1_1 ) )
            // InternalXtext.g:4877:1: ( rule__Alternatives__ElementsAssignment_1_1_1 )
            {
             before(grammarAccess.getAlternativesAccess().getElementsAssignment_1_1_1()); 
            // InternalXtext.g:4878:1: ( rule__Alternatives__ElementsAssignment_1_1_1 )
            // InternalXtext.g:4878:2: rule__Alternatives__ElementsAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Alternatives__ElementsAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAlternativesAccess().getElementsAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group_1_1__1__Impl"


    // $ANTLR start "rule__ConditionalBranch__Group_1__0"
    // InternalXtext.g:4892:1: rule__ConditionalBranch__Group_1__0 : rule__ConditionalBranch__Group_1__0__Impl rule__ConditionalBranch__Group_1__1 ;
    public final void rule__ConditionalBranch__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4896:1: ( rule__ConditionalBranch__Group_1__0__Impl rule__ConditionalBranch__Group_1__1 )
            // InternalXtext.g:4897:2: rule__ConditionalBranch__Group_1__0__Impl rule__ConditionalBranch__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__ConditionalBranch__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConditionalBranch__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalBranch__Group_1__0"


    // $ANTLR start "rule__ConditionalBranch__Group_1__0__Impl"
    // InternalXtext.g:4904:1: rule__ConditionalBranch__Group_1__0__Impl : ( () ) ;
    public final void rule__ConditionalBranch__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4908:1: ( ( () ) )
            // InternalXtext.g:4909:1: ( () )
            {
            // InternalXtext.g:4909:1: ( () )
            // InternalXtext.g:4910:1: ()
            {
             before(grammarAccess.getConditionalBranchAccess().getGroupAction_1_0()); 
            // InternalXtext.g:4911:1: ()
            // InternalXtext.g:4913:1: 
            {
            }

             after(grammarAccess.getConditionalBranchAccess().getGroupAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalBranch__Group_1__0__Impl"


    // $ANTLR start "rule__ConditionalBranch__Group_1__1"
    // InternalXtext.g:4923:1: rule__ConditionalBranch__Group_1__1 : rule__ConditionalBranch__Group_1__1__Impl rule__ConditionalBranch__Group_1__2 ;
    public final void rule__ConditionalBranch__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4927:1: ( rule__ConditionalBranch__Group_1__1__Impl rule__ConditionalBranch__Group_1__2 )
            // InternalXtext.g:4928:2: rule__ConditionalBranch__Group_1__1__Impl rule__ConditionalBranch__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__ConditionalBranch__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConditionalBranch__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalBranch__Group_1__1"


    // $ANTLR start "rule__ConditionalBranch__Group_1__1__Impl"
    // InternalXtext.g:4935:1: rule__ConditionalBranch__Group_1__1__Impl : ( '<' ) ;
    public final void rule__ConditionalBranch__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4939:1: ( ( '<' ) )
            // InternalXtext.g:4940:1: ( '<' )
            {
            // InternalXtext.g:4940:1: ( '<' )
            // InternalXtext.g:4941:1: '<'
            {
             before(grammarAccess.getConditionalBranchAccess().getLessThanSignKeyword_1_1()); 
            match(input,37,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getConditionalBranchAccess().getLessThanSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalBranch__Group_1__1__Impl"


    // $ANTLR start "rule__ConditionalBranch__Group_1__2"
    // InternalXtext.g:4954:1: rule__ConditionalBranch__Group_1__2 : rule__ConditionalBranch__Group_1__2__Impl rule__ConditionalBranch__Group_1__3 ;
    public final void rule__ConditionalBranch__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4958:1: ( rule__ConditionalBranch__Group_1__2__Impl rule__ConditionalBranch__Group_1__3 )
            // InternalXtext.g:4959:2: rule__ConditionalBranch__Group_1__2__Impl rule__ConditionalBranch__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_30);
            rule__ConditionalBranch__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConditionalBranch__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalBranch__Group_1__2"


    // $ANTLR start "rule__ConditionalBranch__Group_1__2__Impl"
    // InternalXtext.g:4966:1: rule__ConditionalBranch__Group_1__2__Impl : ( ( rule__ConditionalBranch__GuardConditionAssignment_1_2 ) ) ;
    public final void rule__ConditionalBranch__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4970:1: ( ( ( rule__ConditionalBranch__GuardConditionAssignment_1_2 ) ) )
            // InternalXtext.g:4971:1: ( ( rule__ConditionalBranch__GuardConditionAssignment_1_2 ) )
            {
            // InternalXtext.g:4971:1: ( ( rule__ConditionalBranch__GuardConditionAssignment_1_2 ) )
            // InternalXtext.g:4972:1: ( rule__ConditionalBranch__GuardConditionAssignment_1_2 )
            {
             before(grammarAccess.getConditionalBranchAccess().getGuardConditionAssignment_1_2()); 
            // InternalXtext.g:4973:1: ( rule__ConditionalBranch__GuardConditionAssignment_1_2 )
            // InternalXtext.g:4973:2: rule__ConditionalBranch__GuardConditionAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConditionalBranch__GuardConditionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionalBranchAccess().getGuardConditionAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalBranch__Group_1__2__Impl"


    // $ANTLR start "rule__ConditionalBranch__Group_1__3"
    // InternalXtext.g:4983:1: rule__ConditionalBranch__Group_1__3 : rule__ConditionalBranch__Group_1__3__Impl rule__ConditionalBranch__Group_1__4 ;
    public final void rule__ConditionalBranch__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4987:1: ( rule__ConditionalBranch__Group_1__3__Impl rule__ConditionalBranch__Group_1__4 )
            // InternalXtext.g:4988:2: rule__ConditionalBranch__Group_1__3__Impl rule__ConditionalBranch__Group_1__4
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__ConditionalBranch__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConditionalBranch__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalBranch__Group_1__3"


    // $ANTLR start "rule__ConditionalBranch__Group_1__3__Impl"
    // InternalXtext.g:4995:1: rule__ConditionalBranch__Group_1__3__Impl : ( '>' ) ;
    public final void rule__ConditionalBranch__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:4999:1: ( ( '>' ) )
            // InternalXtext.g:5000:1: ( '>' )
            {
            // InternalXtext.g:5000:1: ( '>' )
            // InternalXtext.g:5001:1: '>'
            {
             before(grammarAccess.getConditionalBranchAccess().getGreaterThanSignKeyword_1_3()); 
            match(input,38,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getConditionalBranchAccess().getGreaterThanSignKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalBranch__Group_1__3__Impl"


    // $ANTLR start "rule__ConditionalBranch__Group_1__4"
    // InternalXtext.g:5014:1: rule__ConditionalBranch__Group_1__4 : rule__ConditionalBranch__Group_1__4__Impl ;
    public final void rule__ConditionalBranch__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5018:1: ( rule__ConditionalBranch__Group_1__4__Impl )
            // InternalXtext.g:5019:2: rule__ConditionalBranch__Group_1__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConditionalBranch__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalBranch__Group_1__4"


    // $ANTLR start "rule__ConditionalBranch__Group_1__4__Impl"
    // InternalXtext.g:5025:1: rule__ConditionalBranch__Group_1__4__Impl : ( ( ( rule__ConditionalBranch__ElementsAssignment_1_4 ) ) ( ( rule__ConditionalBranch__ElementsAssignment_1_4 )* ) ) ;
    public final void rule__ConditionalBranch__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5029:1: ( ( ( ( rule__ConditionalBranch__ElementsAssignment_1_4 ) ) ( ( rule__ConditionalBranch__ElementsAssignment_1_4 )* ) ) )
            // InternalXtext.g:5030:1: ( ( ( rule__ConditionalBranch__ElementsAssignment_1_4 ) ) ( ( rule__ConditionalBranch__ElementsAssignment_1_4 )* ) )
            {
            // InternalXtext.g:5030:1: ( ( ( rule__ConditionalBranch__ElementsAssignment_1_4 ) ) ( ( rule__ConditionalBranch__ElementsAssignment_1_4 )* ) )
            // InternalXtext.g:5031:1: ( ( rule__ConditionalBranch__ElementsAssignment_1_4 ) ) ( ( rule__ConditionalBranch__ElementsAssignment_1_4 )* )
            {
            // InternalXtext.g:5031:1: ( ( rule__ConditionalBranch__ElementsAssignment_1_4 ) )
            // InternalXtext.g:5032:1: ( rule__ConditionalBranch__ElementsAssignment_1_4 )
            {
             before(grammarAccess.getConditionalBranchAccess().getElementsAssignment_1_4()); 
            // InternalXtext.g:5033:1: ( rule__ConditionalBranch__ElementsAssignment_1_4 )
            // InternalXtext.g:5033:2: rule__ConditionalBranch__ElementsAssignment_1_4
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__ConditionalBranch__ElementsAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getConditionalBranchAccess().getElementsAssignment_1_4()); 

            }

            // InternalXtext.g:5036:1: ( ( rule__ConditionalBranch__ElementsAssignment_1_4 )* )
            // InternalXtext.g:5037:1: ( rule__ConditionalBranch__ElementsAssignment_1_4 )*
            {
             before(grammarAccess.getConditionalBranchAccess().getElementsAssignment_1_4()); 
            // InternalXtext.g:5038:1: ( rule__ConditionalBranch__ElementsAssignment_1_4 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=RULE_ID && LA51_0<=RULE_STRING)||(LA51_0>=20 && LA51_0<=21)||LA51_0==26||LA51_0==35||LA51_0==47||LA51_0==53) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalXtext.g:5038:2: rule__ConditionalBranch__ElementsAssignment_1_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_32);
            	    rule__ConditionalBranch__ElementsAssignment_1_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

             after(grammarAccess.getConditionalBranchAccess().getElementsAssignment_1_4()); 

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
    // $ANTLR end "rule__ConditionalBranch__Group_1__4__Impl"


    // $ANTLR start "rule__UnorderedGroup__Group__0"
    // InternalXtext.g:5059:1: rule__UnorderedGroup__Group__0 : rule__UnorderedGroup__Group__0__Impl rule__UnorderedGroup__Group__1 ;
    public final void rule__UnorderedGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5063:1: ( rule__UnorderedGroup__Group__0__Impl rule__UnorderedGroup__Group__1 )
            // InternalXtext.g:5064:2: rule__UnorderedGroup__Group__0__Impl rule__UnorderedGroup__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_33);
            rule__UnorderedGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnorderedGroup__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnorderedGroup__Group__0"


    // $ANTLR start "rule__UnorderedGroup__Group__0__Impl"
    // InternalXtext.g:5071:1: rule__UnorderedGroup__Group__0__Impl : ( ruleGroup ) ;
    public final void rule__UnorderedGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5075:1: ( ( ruleGroup ) )
            // InternalXtext.g:5076:1: ( ruleGroup )
            {
            // InternalXtext.g:5076:1: ( ruleGroup )
            // InternalXtext.g:5077:1: ruleGroup
            {
             before(grammarAccess.getUnorderedGroupAccess().getGroupParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getUnorderedGroupAccess().getGroupParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnorderedGroup__Group__0__Impl"


    // $ANTLR start "rule__UnorderedGroup__Group__1"
    // InternalXtext.g:5088:1: rule__UnorderedGroup__Group__1 : rule__UnorderedGroup__Group__1__Impl ;
    public final void rule__UnorderedGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5092:1: ( rule__UnorderedGroup__Group__1__Impl )
            // InternalXtext.g:5093:2: rule__UnorderedGroup__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnorderedGroup__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnorderedGroup__Group__1"


    // $ANTLR start "rule__UnorderedGroup__Group__1__Impl"
    // InternalXtext.g:5099:1: rule__UnorderedGroup__Group__1__Impl : ( ( rule__UnorderedGroup__Group_1__0 )? ) ;
    public final void rule__UnorderedGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5103:1: ( ( ( rule__UnorderedGroup__Group_1__0 )? ) )
            // InternalXtext.g:5104:1: ( ( rule__UnorderedGroup__Group_1__0 )? )
            {
            // InternalXtext.g:5104:1: ( ( rule__UnorderedGroup__Group_1__0 )? )
            // InternalXtext.g:5105:1: ( rule__UnorderedGroup__Group_1__0 )?
            {
             before(grammarAccess.getUnorderedGroupAccess().getGroup_1()); 
            // InternalXtext.g:5106:1: ( rule__UnorderedGroup__Group_1__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==41) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalXtext.g:5106:2: rule__UnorderedGroup__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__UnorderedGroup__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUnorderedGroupAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnorderedGroup__Group__1__Impl"


    // $ANTLR start "rule__UnorderedGroup__Group_1__0"
    // InternalXtext.g:5120:1: rule__UnorderedGroup__Group_1__0 : rule__UnorderedGroup__Group_1__0__Impl rule__UnorderedGroup__Group_1__1 ;
    public final void rule__UnorderedGroup__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5124:1: ( rule__UnorderedGroup__Group_1__0__Impl rule__UnorderedGroup__Group_1__1 )
            // InternalXtext.g:5125:2: rule__UnorderedGroup__Group_1__0__Impl rule__UnorderedGroup__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_33);
            rule__UnorderedGroup__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnorderedGroup__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnorderedGroup__Group_1__0"


    // $ANTLR start "rule__UnorderedGroup__Group_1__0__Impl"
    // InternalXtext.g:5132:1: rule__UnorderedGroup__Group_1__0__Impl : ( () ) ;
    public final void rule__UnorderedGroup__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5136:1: ( ( () ) )
            // InternalXtext.g:5137:1: ( () )
            {
            // InternalXtext.g:5137:1: ( () )
            // InternalXtext.g:5138:1: ()
            {
             before(grammarAccess.getUnorderedGroupAccess().getUnorderedGroupElementsAction_1_0()); 
            // InternalXtext.g:5139:1: ()
            // InternalXtext.g:5141:1: 
            {
            }

             after(grammarAccess.getUnorderedGroupAccess().getUnorderedGroupElementsAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnorderedGroup__Group_1__0__Impl"


    // $ANTLR start "rule__UnorderedGroup__Group_1__1"
    // InternalXtext.g:5151:1: rule__UnorderedGroup__Group_1__1 : rule__UnorderedGroup__Group_1__1__Impl ;
    public final void rule__UnorderedGroup__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5155:1: ( rule__UnorderedGroup__Group_1__1__Impl )
            // InternalXtext.g:5156:2: rule__UnorderedGroup__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnorderedGroup__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnorderedGroup__Group_1__1"


    // $ANTLR start "rule__UnorderedGroup__Group_1__1__Impl"
    // InternalXtext.g:5162:1: rule__UnorderedGroup__Group_1__1__Impl : ( ( ( rule__UnorderedGroup__Group_1_1__0 ) ) ( ( rule__UnorderedGroup__Group_1_1__0 )* ) ) ;
    public final void rule__UnorderedGroup__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5166:1: ( ( ( ( rule__UnorderedGroup__Group_1_1__0 ) ) ( ( rule__UnorderedGroup__Group_1_1__0 )* ) ) )
            // InternalXtext.g:5167:1: ( ( ( rule__UnorderedGroup__Group_1_1__0 ) ) ( ( rule__UnorderedGroup__Group_1_1__0 )* ) )
            {
            // InternalXtext.g:5167:1: ( ( ( rule__UnorderedGroup__Group_1_1__0 ) ) ( ( rule__UnorderedGroup__Group_1_1__0 )* ) )
            // InternalXtext.g:5168:1: ( ( rule__UnorderedGroup__Group_1_1__0 ) ) ( ( rule__UnorderedGroup__Group_1_1__0 )* )
            {
            // InternalXtext.g:5168:1: ( ( rule__UnorderedGroup__Group_1_1__0 ) )
            // InternalXtext.g:5169:1: ( rule__UnorderedGroup__Group_1_1__0 )
            {
             before(grammarAccess.getUnorderedGroupAccess().getGroup_1_1()); 
            // InternalXtext.g:5170:1: ( rule__UnorderedGroup__Group_1_1__0 )
            // InternalXtext.g:5170:2: rule__UnorderedGroup__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_34);
            rule__UnorderedGroup__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getUnorderedGroupAccess().getGroup_1_1()); 

            }

            // InternalXtext.g:5173:1: ( ( rule__UnorderedGroup__Group_1_1__0 )* )
            // InternalXtext.g:5174:1: ( rule__UnorderedGroup__Group_1_1__0 )*
            {
             before(grammarAccess.getUnorderedGroupAccess().getGroup_1_1()); 
            // InternalXtext.g:5175:1: ( rule__UnorderedGroup__Group_1_1__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==41) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalXtext.g:5175:2: rule__UnorderedGroup__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_34);
            	    rule__UnorderedGroup__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

             after(grammarAccess.getUnorderedGroupAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__UnorderedGroup__Group_1__1__Impl"


    // $ANTLR start "rule__UnorderedGroup__Group_1_1__0"
    // InternalXtext.g:5190:1: rule__UnorderedGroup__Group_1_1__0 : rule__UnorderedGroup__Group_1_1__0__Impl rule__UnorderedGroup__Group_1_1__1 ;
    public final void rule__UnorderedGroup__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5194:1: ( rule__UnorderedGroup__Group_1_1__0__Impl rule__UnorderedGroup__Group_1_1__1 )
            // InternalXtext.g:5195:2: rule__UnorderedGroup__Group_1_1__0__Impl rule__UnorderedGroup__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__UnorderedGroup__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnorderedGroup__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnorderedGroup__Group_1_1__0"


    // $ANTLR start "rule__UnorderedGroup__Group_1_1__0__Impl"
    // InternalXtext.g:5202:1: rule__UnorderedGroup__Group_1_1__0__Impl : ( '&' ) ;
    public final void rule__UnorderedGroup__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5206:1: ( ( '&' ) )
            // InternalXtext.g:5207:1: ( '&' )
            {
            // InternalXtext.g:5207:1: ( '&' )
            // InternalXtext.g:5208:1: '&'
            {
             before(grammarAccess.getUnorderedGroupAccess().getAmpersandKeyword_1_1_0()); 
            match(input,41,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getUnorderedGroupAccess().getAmpersandKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnorderedGroup__Group_1_1__0__Impl"


    // $ANTLR start "rule__UnorderedGroup__Group_1_1__1"
    // InternalXtext.g:5221:1: rule__UnorderedGroup__Group_1_1__1 : rule__UnorderedGroup__Group_1_1__1__Impl ;
    public final void rule__UnorderedGroup__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5225:1: ( rule__UnorderedGroup__Group_1_1__1__Impl )
            // InternalXtext.g:5226:2: rule__UnorderedGroup__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnorderedGroup__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnorderedGroup__Group_1_1__1"


    // $ANTLR start "rule__UnorderedGroup__Group_1_1__1__Impl"
    // InternalXtext.g:5232:1: rule__UnorderedGroup__Group_1_1__1__Impl : ( ( rule__UnorderedGroup__ElementsAssignment_1_1_1 ) ) ;
    public final void rule__UnorderedGroup__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5236:1: ( ( ( rule__UnorderedGroup__ElementsAssignment_1_1_1 ) ) )
            // InternalXtext.g:5237:1: ( ( rule__UnorderedGroup__ElementsAssignment_1_1_1 ) )
            {
            // InternalXtext.g:5237:1: ( ( rule__UnorderedGroup__ElementsAssignment_1_1_1 ) )
            // InternalXtext.g:5238:1: ( rule__UnorderedGroup__ElementsAssignment_1_1_1 )
            {
             before(grammarAccess.getUnorderedGroupAccess().getElementsAssignment_1_1_1()); 
            // InternalXtext.g:5239:1: ( rule__UnorderedGroup__ElementsAssignment_1_1_1 )
            // InternalXtext.g:5239:2: rule__UnorderedGroup__ElementsAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnorderedGroup__ElementsAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getUnorderedGroupAccess().getElementsAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnorderedGroup__Group_1_1__1__Impl"


    // $ANTLR start "rule__Group__Group__0"
    // InternalXtext.g:5253:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5257:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // InternalXtext.g:5258:2: rule__Group__Group__0__Impl rule__Group__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__Group__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Group__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__0"


    // $ANTLR start "rule__Group__Group__0__Impl"
    // InternalXtext.g:5265:1: rule__Group__Group__0__Impl : ( ruleAbstractToken ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5269:1: ( ( ruleAbstractToken ) )
            // InternalXtext.g:5270:1: ( ruleAbstractToken )
            {
            // InternalXtext.g:5270:1: ( ruleAbstractToken )
            // InternalXtext.g:5271:1: ruleAbstractToken
            {
             before(grammarAccess.getGroupAccess().getAbstractTokenParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAbstractToken();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getAbstractTokenParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__0__Impl"


    // $ANTLR start "rule__Group__Group__1"
    // InternalXtext.g:5282:1: rule__Group__Group__1 : rule__Group__Group__1__Impl ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5286:1: ( rule__Group__Group__1__Impl )
            // InternalXtext.g:5287:2: rule__Group__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Group__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__1"


    // $ANTLR start "rule__Group__Group__1__Impl"
    // InternalXtext.g:5293:1: rule__Group__Group__1__Impl : ( ( rule__Group__Group_1__0 )? ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5297:1: ( ( ( rule__Group__Group_1__0 )? ) )
            // InternalXtext.g:5298:1: ( ( rule__Group__Group_1__0 )? )
            {
            // InternalXtext.g:5298:1: ( ( rule__Group__Group_1__0 )? )
            // InternalXtext.g:5299:1: ( rule__Group__Group_1__0 )?
            {
             before(grammarAccess.getGroupAccess().getGroup_1()); 
            // InternalXtext.g:5300:1: ( rule__Group__Group_1__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=RULE_ID && LA54_0<=RULE_STRING)||(LA54_0>=20 && LA54_0<=21)||LA54_0==26||LA54_0==35||LA54_0==47||LA54_0==53) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalXtext.g:5300:2: rule__Group__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Group__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__1__Impl"


    // $ANTLR start "rule__Group__Group_1__0"
    // InternalXtext.g:5314:1: rule__Group__Group_1__0 : rule__Group__Group_1__0__Impl rule__Group__Group_1__1 ;
    public final void rule__Group__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5318:1: ( rule__Group__Group_1__0__Impl rule__Group__Group_1__1 )
            // InternalXtext.g:5319:2: rule__Group__Group_1__0__Impl rule__Group__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__Group__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Group__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_1__0"


    // $ANTLR start "rule__Group__Group_1__0__Impl"
    // InternalXtext.g:5326:1: rule__Group__Group_1__0__Impl : ( () ) ;
    public final void rule__Group__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5330:1: ( ( () ) )
            // InternalXtext.g:5331:1: ( () )
            {
            // InternalXtext.g:5331:1: ( () )
            // InternalXtext.g:5332:1: ()
            {
             before(grammarAccess.getGroupAccess().getGroupElementsAction_1_0()); 
            // InternalXtext.g:5333:1: ()
            // InternalXtext.g:5335:1: 
            {
            }

             after(grammarAccess.getGroupAccess().getGroupElementsAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_1__0__Impl"


    // $ANTLR start "rule__Group__Group_1__1"
    // InternalXtext.g:5345:1: rule__Group__Group_1__1 : rule__Group__Group_1__1__Impl ;
    public final void rule__Group__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5349:1: ( rule__Group__Group_1__1__Impl )
            // InternalXtext.g:5350:2: rule__Group__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Group__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_1__1"


    // $ANTLR start "rule__Group__Group_1__1__Impl"
    // InternalXtext.g:5356:1: rule__Group__Group_1__1__Impl : ( ( ( rule__Group__ElementsAssignment_1_1 ) ) ( ( rule__Group__ElementsAssignment_1_1 )* ) ) ;
    public final void rule__Group__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5360:1: ( ( ( ( rule__Group__ElementsAssignment_1_1 ) ) ( ( rule__Group__ElementsAssignment_1_1 )* ) ) )
            // InternalXtext.g:5361:1: ( ( ( rule__Group__ElementsAssignment_1_1 ) ) ( ( rule__Group__ElementsAssignment_1_1 )* ) )
            {
            // InternalXtext.g:5361:1: ( ( ( rule__Group__ElementsAssignment_1_1 ) ) ( ( rule__Group__ElementsAssignment_1_1 )* ) )
            // InternalXtext.g:5362:1: ( ( rule__Group__ElementsAssignment_1_1 ) ) ( ( rule__Group__ElementsAssignment_1_1 )* )
            {
            // InternalXtext.g:5362:1: ( ( rule__Group__ElementsAssignment_1_1 ) )
            // InternalXtext.g:5363:1: ( rule__Group__ElementsAssignment_1_1 )
            {
             before(grammarAccess.getGroupAccess().getElementsAssignment_1_1()); 
            // InternalXtext.g:5364:1: ( rule__Group__ElementsAssignment_1_1 )
            // InternalXtext.g:5364:2: rule__Group__ElementsAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__Group__ElementsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getElementsAssignment_1_1()); 

            }

            // InternalXtext.g:5367:1: ( ( rule__Group__ElementsAssignment_1_1 )* )
            // InternalXtext.g:5368:1: ( rule__Group__ElementsAssignment_1_1 )*
            {
             before(grammarAccess.getGroupAccess().getElementsAssignment_1_1()); 
            // InternalXtext.g:5369:1: ( rule__Group__ElementsAssignment_1_1 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=RULE_ID && LA55_0<=RULE_STRING)||(LA55_0>=20 && LA55_0<=21)||LA55_0==26||LA55_0==35||LA55_0==47||LA55_0==53) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalXtext.g:5369:2: rule__Group__ElementsAssignment_1_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_32);
            	    rule__Group__ElementsAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

             after(grammarAccess.getGroupAccess().getElementsAssignment_1_1()); 

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
    // $ANTLR end "rule__Group__Group_1__1__Impl"


    // $ANTLR start "rule__AbstractTokenWithCardinality__Group__0"
    // InternalXtext.g:5384:1: rule__AbstractTokenWithCardinality__Group__0 : rule__AbstractTokenWithCardinality__Group__0__Impl rule__AbstractTokenWithCardinality__Group__1 ;
    public final void rule__AbstractTokenWithCardinality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5388:1: ( rule__AbstractTokenWithCardinality__Group__0__Impl rule__AbstractTokenWithCardinality__Group__1 )
            // InternalXtext.g:5389:2: rule__AbstractTokenWithCardinality__Group__0__Impl rule__AbstractTokenWithCardinality__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__AbstractTokenWithCardinality__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AbstractTokenWithCardinality__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractTokenWithCardinality__Group__0"


    // $ANTLR start "rule__AbstractTokenWithCardinality__Group__0__Impl"
    // InternalXtext.g:5396:1: rule__AbstractTokenWithCardinality__Group__0__Impl : ( ( rule__AbstractTokenWithCardinality__Alternatives_0 ) ) ;
    public final void rule__AbstractTokenWithCardinality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5400:1: ( ( ( rule__AbstractTokenWithCardinality__Alternatives_0 ) ) )
            // InternalXtext.g:5401:1: ( ( rule__AbstractTokenWithCardinality__Alternatives_0 ) )
            {
            // InternalXtext.g:5401:1: ( ( rule__AbstractTokenWithCardinality__Alternatives_0 ) )
            // InternalXtext.g:5402:1: ( rule__AbstractTokenWithCardinality__Alternatives_0 )
            {
             before(grammarAccess.getAbstractTokenWithCardinalityAccess().getAlternatives_0()); 
            // InternalXtext.g:5403:1: ( rule__AbstractTokenWithCardinality__Alternatives_0 )
            // InternalXtext.g:5403:2: rule__AbstractTokenWithCardinality__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AbstractTokenWithCardinality__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getAbstractTokenWithCardinalityAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractTokenWithCardinality__Group__0__Impl"


    // $ANTLR start "rule__AbstractTokenWithCardinality__Group__1"
    // InternalXtext.g:5413:1: rule__AbstractTokenWithCardinality__Group__1 : rule__AbstractTokenWithCardinality__Group__1__Impl ;
    public final void rule__AbstractTokenWithCardinality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5417:1: ( rule__AbstractTokenWithCardinality__Group__1__Impl )
            // InternalXtext.g:5418:2: rule__AbstractTokenWithCardinality__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AbstractTokenWithCardinality__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractTokenWithCardinality__Group__1"


    // $ANTLR start "rule__AbstractTokenWithCardinality__Group__1__Impl"
    // InternalXtext.g:5424:1: rule__AbstractTokenWithCardinality__Group__1__Impl : ( ( rule__AbstractTokenWithCardinality__CardinalityAssignment_1 )? ) ;
    public final void rule__AbstractTokenWithCardinality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5428:1: ( ( ( rule__AbstractTokenWithCardinality__CardinalityAssignment_1 )? ) )
            // InternalXtext.g:5429:1: ( ( rule__AbstractTokenWithCardinality__CardinalityAssignment_1 )? )
            {
            // InternalXtext.g:5429:1: ( ( rule__AbstractTokenWithCardinality__CardinalityAssignment_1 )? )
            // InternalXtext.g:5430:1: ( rule__AbstractTokenWithCardinality__CardinalityAssignment_1 )?
            {
             before(grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityAssignment_1()); 
            // InternalXtext.g:5431:1: ( rule__AbstractTokenWithCardinality__CardinalityAssignment_1 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=15 && LA56_0<=17)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalXtext.g:5431:2: rule__AbstractTokenWithCardinality__CardinalityAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__AbstractTokenWithCardinality__CardinalityAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractTokenWithCardinality__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // InternalXtext.g:5445:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5449:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalXtext.g:5450:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Action__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // InternalXtext.g:5457:1: rule__Action__Group__0__Impl : ( '{' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5461:1: ( ( '{' ) )
            // InternalXtext.g:5462:1: ( '{' )
            {
            // InternalXtext.g:5462:1: ( '{' )
            // InternalXtext.g:5463:1: '{'
            {
             before(grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,35,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // InternalXtext.g:5476:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5480:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalXtext.g:5481:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_36);
            rule__Action__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Action__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // InternalXtext.g:5488:1: rule__Action__Group__1__Impl : ( ( rule__Action__TypeAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5492:1: ( ( ( rule__Action__TypeAssignment_1 ) ) )
            // InternalXtext.g:5493:1: ( ( rule__Action__TypeAssignment_1 ) )
            {
            // InternalXtext.g:5493:1: ( ( rule__Action__TypeAssignment_1 ) )
            // InternalXtext.g:5494:1: ( rule__Action__TypeAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getTypeAssignment_1()); 
            // InternalXtext.g:5495:1: ( rule__Action__TypeAssignment_1 )
            // InternalXtext.g:5495:2: rule__Action__TypeAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Action__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__2"
    // InternalXtext.g:5505:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5509:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // InternalXtext.g:5510:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_36);
            rule__Action__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Action__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2"


    // $ANTLR start "rule__Action__Group__2__Impl"
    // InternalXtext.g:5517:1: rule__Action__Group__2__Impl : ( ( rule__Action__Group_2__0 )? ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5521:1: ( ( ( rule__Action__Group_2__0 )? ) )
            // InternalXtext.g:5522:1: ( ( rule__Action__Group_2__0 )? )
            {
            // InternalXtext.g:5522:1: ( ( rule__Action__Group_2__0 )? )
            // InternalXtext.g:5523:1: ( rule__Action__Group_2__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_2()); 
            // InternalXtext.g:5524:1: ( rule__Action__Group_2__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==28) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalXtext.g:5524:2: rule__Action__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Action__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2__Impl"


    // $ANTLR start "rule__Action__Group__3"
    // InternalXtext.g:5534:1: rule__Action__Group__3 : rule__Action__Group__3__Impl ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5538:1: ( rule__Action__Group__3__Impl )
            // InternalXtext.g:5539:2: rule__Action__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Action__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3"


    // $ANTLR start "rule__Action__Group__3__Impl"
    // InternalXtext.g:5545:1: rule__Action__Group__3__Impl : ( '}' ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5549:1: ( ( '}' ) )
            // InternalXtext.g:5550:1: ( '}' )
            {
            // InternalXtext.g:5550:1: ( '}' )
            // InternalXtext.g:5551:1: '}'
            {
             before(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_3()); 
            match(input,36,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3__Impl"


    // $ANTLR start "rule__Action__Group_2__0"
    // InternalXtext.g:5572:1: rule__Action__Group_2__0 : rule__Action__Group_2__0__Impl rule__Action__Group_2__1 ;
    public final void rule__Action__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5576:1: ( rule__Action__Group_2__0__Impl rule__Action__Group_2__1 )
            // InternalXtext.g:5577:2: rule__Action__Group_2__0__Impl rule__Action__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Action__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Action__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2__0"


    // $ANTLR start "rule__Action__Group_2__0__Impl"
    // InternalXtext.g:5584:1: rule__Action__Group_2__0__Impl : ( '.' ) ;
    public final void rule__Action__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5588:1: ( ( '.' ) )
            // InternalXtext.g:5589:1: ( '.' )
            {
            // InternalXtext.g:5589:1: ( '.' )
            // InternalXtext.g:5590:1: '.'
            {
             before(grammarAccess.getActionAccess().getFullStopKeyword_2_0()); 
            match(input,28,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getActionAccess().getFullStopKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2__0__Impl"


    // $ANTLR start "rule__Action__Group_2__1"
    // InternalXtext.g:5603:1: rule__Action__Group_2__1 : rule__Action__Group_2__1__Impl rule__Action__Group_2__2 ;
    public final void rule__Action__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5607:1: ( rule__Action__Group_2__1__Impl rule__Action__Group_2__2 )
            // InternalXtext.g:5608:2: rule__Action__Group_2__1__Impl rule__Action__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_37);
            rule__Action__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Action__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2__1"


    // $ANTLR start "rule__Action__Group_2__1__Impl"
    // InternalXtext.g:5615:1: rule__Action__Group_2__1__Impl : ( ( rule__Action__FeatureAssignment_2_1 ) ) ;
    public final void rule__Action__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5619:1: ( ( ( rule__Action__FeatureAssignment_2_1 ) ) )
            // InternalXtext.g:5620:1: ( ( rule__Action__FeatureAssignment_2_1 ) )
            {
            // InternalXtext.g:5620:1: ( ( rule__Action__FeatureAssignment_2_1 ) )
            // InternalXtext.g:5621:1: ( rule__Action__FeatureAssignment_2_1 )
            {
             before(grammarAccess.getActionAccess().getFeatureAssignment_2_1()); 
            // InternalXtext.g:5622:1: ( rule__Action__FeatureAssignment_2_1 )
            // InternalXtext.g:5622:2: rule__Action__FeatureAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Action__FeatureAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getFeatureAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2__1__Impl"


    // $ANTLR start "rule__Action__Group_2__2"
    // InternalXtext.g:5632:1: rule__Action__Group_2__2 : rule__Action__Group_2__2__Impl rule__Action__Group_2__3 ;
    public final void rule__Action__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5636:1: ( rule__Action__Group_2__2__Impl rule__Action__Group_2__3 )
            // InternalXtext.g:5637:2: rule__Action__Group_2__2__Impl rule__Action__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_38);
            rule__Action__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Action__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2__2"


    // $ANTLR start "rule__Action__Group_2__2__Impl"
    // InternalXtext.g:5644:1: rule__Action__Group_2__2__Impl : ( ( rule__Action__OperatorAssignment_2_2 ) ) ;
    public final void rule__Action__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5648:1: ( ( ( rule__Action__OperatorAssignment_2_2 ) ) )
            // InternalXtext.g:5649:1: ( ( rule__Action__OperatorAssignment_2_2 ) )
            {
            // InternalXtext.g:5649:1: ( ( rule__Action__OperatorAssignment_2_2 ) )
            // InternalXtext.g:5650:1: ( rule__Action__OperatorAssignment_2_2 )
            {
             before(grammarAccess.getActionAccess().getOperatorAssignment_2_2()); 
            // InternalXtext.g:5651:1: ( rule__Action__OperatorAssignment_2_2 )
            // InternalXtext.g:5651:2: rule__Action__OperatorAssignment_2_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Action__OperatorAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getOperatorAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2__2__Impl"


    // $ANTLR start "rule__Action__Group_2__3"
    // InternalXtext.g:5661:1: rule__Action__Group_2__3 : rule__Action__Group_2__3__Impl ;
    public final void rule__Action__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5665:1: ( rule__Action__Group_2__3__Impl )
            // InternalXtext.g:5666:2: rule__Action__Group_2__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Action__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2__3"


    // $ANTLR start "rule__Action__Group_2__3__Impl"
    // InternalXtext.g:5672:1: rule__Action__Group_2__3__Impl : ( 'current' ) ;
    public final void rule__Action__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5676:1: ( ( 'current' ) )
            // InternalXtext.g:5677:1: ( 'current' )
            {
            // InternalXtext.g:5677:1: ( 'current' )
            // InternalXtext.g:5678:1: 'current'
            {
             before(grammarAccess.getActionAccess().getCurrentKeyword_2_3()); 
            match(input,42,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getActionAccess().getCurrentKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2__3__Impl"


    // $ANTLR start "rule__RuleCall__Group__0"
    // InternalXtext.g:5699:1: rule__RuleCall__Group__0 : rule__RuleCall__Group__0__Impl rule__RuleCall__Group__1 ;
    public final void rule__RuleCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5703:1: ( rule__RuleCall__Group__0__Impl rule__RuleCall__Group__1 )
            // InternalXtext.g:5704:2: rule__RuleCall__Group__0__Impl rule__RuleCall__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__RuleCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCall__Group__0"


    // $ANTLR start "rule__RuleCall__Group__0__Impl"
    // InternalXtext.g:5711:1: rule__RuleCall__Group__0__Impl : ( ( rule__RuleCall__RuleAssignment_0 ) ) ;
    public final void rule__RuleCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5715:1: ( ( ( rule__RuleCall__RuleAssignment_0 ) ) )
            // InternalXtext.g:5716:1: ( ( rule__RuleCall__RuleAssignment_0 ) )
            {
            // InternalXtext.g:5716:1: ( ( rule__RuleCall__RuleAssignment_0 ) )
            // InternalXtext.g:5717:1: ( rule__RuleCall__RuleAssignment_0 )
            {
             before(grammarAccess.getRuleCallAccess().getRuleAssignment_0()); 
            // InternalXtext.g:5718:1: ( rule__RuleCall__RuleAssignment_0 )
            // InternalXtext.g:5718:2: rule__RuleCall__RuleAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleCall__RuleAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleCallAccess().getRuleAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCall__Group__0__Impl"


    // $ANTLR start "rule__RuleCall__Group__1"
    // InternalXtext.g:5728:1: rule__RuleCall__Group__1 : rule__RuleCall__Group__1__Impl ;
    public final void rule__RuleCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5732:1: ( rule__RuleCall__Group__1__Impl )
            // InternalXtext.g:5733:2: rule__RuleCall__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleCall__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCall__Group__1"


    // $ANTLR start "rule__RuleCall__Group__1__Impl"
    // InternalXtext.g:5739:1: rule__RuleCall__Group__1__Impl : ( ( rule__RuleCall__Group_1__0 )? ) ;
    public final void rule__RuleCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5743:1: ( ( ( rule__RuleCall__Group_1__0 )? ) )
            // InternalXtext.g:5744:1: ( ( rule__RuleCall__Group_1__0 )? )
            {
            // InternalXtext.g:5744:1: ( ( rule__RuleCall__Group_1__0 )? )
            // InternalXtext.g:5745:1: ( rule__RuleCall__Group_1__0 )?
            {
             before(grammarAccess.getRuleCallAccess().getGroup_1()); 
            // InternalXtext.g:5746:1: ( rule__RuleCall__Group_1__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==37) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalXtext.g:5746:2: rule__RuleCall__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__RuleCall__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleCallAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCall__Group__1__Impl"


    // $ANTLR start "rule__RuleCall__Group_1__0"
    // InternalXtext.g:5760:1: rule__RuleCall__Group_1__0 : rule__RuleCall__Group_1__0__Impl rule__RuleCall__Group_1__1 ;
    public final void rule__RuleCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5764:1: ( rule__RuleCall__Group_1__0__Impl rule__RuleCall__Group_1__1 )
            // InternalXtext.g:5765:2: rule__RuleCall__Group_1__0__Impl rule__RuleCall__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__RuleCall__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleCall__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCall__Group_1__0"


    // $ANTLR start "rule__RuleCall__Group_1__0__Impl"
    // InternalXtext.g:5772:1: rule__RuleCall__Group_1__0__Impl : ( '<' ) ;
    public final void rule__RuleCall__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5776:1: ( ( '<' ) )
            // InternalXtext.g:5777:1: ( '<' )
            {
            // InternalXtext.g:5777:1: ( '<' )
            // InternalXtext.g:5778:1: '<'
            {
             before(grammarAccess.getRuleCallAccess().getLessThanSignKeyword_1_0()); 
            match(input,37,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRuleCallAccess().getLessThanSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCall__Group_1__0__Impl"


    // $ANTLR start "rule__RuleCall__Group_1__1"
    // InternalXtext.g:5791:1: rule__RuleCall__Group_1__1 : rule__RuleCall__Group_1__1__Impl rule__RuleCall__Group_1__2 ;
    public final void rule__RuleCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5795:1: ( rule__RuleCall__Group_1__1__Impl rule__RuleCall__Group_1__2 )
            // InternalXtext.g:5796:2: rule__RuleCall__Group_1__1__Impl rule__RuleCall__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__RuleCall__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleCall__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCall__Group_1__1"


    // $ANTLR start "rule__RuleCall__Group_1__1__Impl"
    // InternalXtext.g:5803:1: rule__RuleCall__Group_1__1__Impl : ( ( rule__RuleCall__ArgumentsAssignment_1_1 ) ) ;
    public final void rule__RuleCall__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5807:1: ( ( ( rule__RuleCall__ArgumentsAssignment_1_1 ) ) )
            // InternalXtext.g:5808:1: ( ( rule__RuleCall__ArgumentsAssignment_1_1 ) )
            {
            // InternalXtext.g:5808:1: ( ( rule__RuleCall__ArgumentsAssignment_1_1 ) )
            // InternalXtext.g:5809:1: ( rule__RuleCall__ArgumentsAssignment_1_1 )
            {
             before(grammarAccess.getRuleCallAccess().getArgumentsAssignment_1_1()); 
            // InternalXtext.g:5810:1: ( rule__RuleCall__ArgumentsAssignment_1_1 )
            // InternalXtext.g:5810:2: rule__RuleCall__ArgumentsAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleCall__ArgumentsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleCallAccess().getArgumentsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCall__Group_1__1__Impl"


    // $ANTLR start "rule__RuleCall__Group_1__2"
    // InternalXtext.g:5820:1: rule__RuleCall__Group_1__2 : rule__RuleCall__Group_1__2__Impl rule__RuleCall__Group_1__3 ;
    public final void rule__RuleCall__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5824:1: ( rule__RuleCall__Group_1__2__Impl rule__RuleCall__Group_1__3 )
            // InternalXtext.g:5825:2: rule__RuleCall__Group_1__2__Impl rule__RuleCall__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__RuleCall__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleCall__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCall__Group_1__2"


    // $ANTLR start "rule__RuleCall__Group_1__2__Impl"
    // InternalXtext.g:5832:1: rule__RuleCall__Group_1__2__Impl : ( ( rule__RuleCall__Group_1_2__0 )* ) ;
    public final void rule__RuleCall__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5836:1: ( ( ( rule__RuleCall__Group_1_2__0 )* ) )
            // InternalXtext.g:5837:1: ( ( rule__RuleCall__Group_1_2__0 )* )
            {
            // InternalXtext.g:5837:1: ( ( rule__RuleCall__Group_1_2__0 )* )
            // InternalXtext.g:5838:1: ( rule__RuleCall__Group_1_2__0 )*
            {
             before(grammarAccess.getRuleCallAccess().getGroup_1_2()); 
            // InternalXtext.g:5839:1: ( rule__RuleCall__Group_1_2__0 )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==25) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalXtext.g:5839:2: rule__RuleCall__Group_1_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    rule__RuleCall__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

             after(grammarAccess.getRuleCallAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCall__Group_1__2__Impl"


    // $ANTLR start "rule__RuleCall__Group_1__3"
    // InternalXtext.g:5849:1: rule__RuleCall__Group_1__3 : rule__RuleCall__Group_1__3__Impl ;
    public final void rule__RuleCall__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5853:1: ( rule__RuleCall__Group_1__3__Impl )
            // InternalXtext.g:5854:2: rule__RuleCall__Group_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleCall__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCall__Group_1__3"


    // $ANTLR start "rule__RuleCall__Group_1__3__Impl"
    // InternalXtext.g:5860:1: rule__RuleCall__Group_1__3__Impl : ( '>' ) ;
    public final void rule__RuleCall__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5864:1: ( ( '>' ) )
            // InternalXtext.g:5865:1: ( '>' )
            {
            // InternalXtext.g:5865:1: ( '>' )
            // InternalXtext.g:5866:1: '>'
            {
             before(grammarAccess.getRuleCallAccess().getGreaterThanSignKeyword_1_3()); 
            match(input,38,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRuleCallAccess().getGreaterThanSignKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCall__Group_1__3__Impl"


    // $ANTLR start "rule__RuleCall__Group_1_2__0"
    // InternalXtext.g:5887:1: rule__RuleCall__Group_1_2__0 : rule__RuleCall__Group_1_2__0__Impl rule__RuleCall__Group_1_2__1 ;
    public final void rule__RuleCall__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5891:1: ( rule__RuleCall__Group_1_2__0__Impl rule__RuleCall__Group_1_2__1 )
            // InternalXtext.g:5892:2: rule__RuleCall__Group_1_2__0__Impl rule__RuleCall__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__RuleCall__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleCall__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCall__Group_1_2__0"


    // $ANTLR start "rule__RuleCall__Group_1_2__0__Impl"
    // InternalXtext.g:5899:1: rule__RuleCall__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__RuleCall__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5903:1: ( ( ',' ) )
            // InternalXtext.g:5904:1: ( ',' )
            {
            // InternalXtext.g:5904:1: ( ',' )
            // InternalXtext.g:5905:1: ','
            {
             before(grammarAccess.getRuleCallAccess().getCommaKeyword_1_2_0()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRuleCallAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCall__Group_1_2__0__Impl"


    // $ANTLR start "rule__RuleCall__Group_1_2__1"
    // InternalXtext.g:5918:1: rule__RuleCall__Group_1_2__1 : rule__RuleCall__Group_1_2__1__Impl ;
    public final void rule__RuleCall__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5922:1: ( rule__RuleCall__Group_1_2__1__Impl )
            // InternalXtext.g:5923:2: rule__RuleCall__Group_1_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleCall__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCall__Group_1_2__1"


    // $ANTLR start "rule__RuleCall__Group_1_2__1__Impl"
    // InternalXtext.g:5929:1: rule__RuleCall__Group_1_2__1__Impl : ( ( rule__RuleCall__ArgumentsAssignment_1_2_1 ) ) ;
    public final void rule__RuleCall__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5933:1: ( ( ( rule__RuleCall__ArgumentsAssignment_1_2_1 ) ) )
            // InternalXtext.g:5934:1: ( ( rule__RuleCall__ArgumentsAssignment_1_2_1 ) )
            {
            // InternalXtext.g:5934:1: ( ( rule__RuleCall__ArgumentsAssignment_1_2_1 ) )
            // InternalXtext.g:5935:1: ( rule__RuleCall__ArgumentsAssignment_1_2_1 )
            {
             before(grammarAccess.getRuleCallAccess().getArgumentsAssignment_1_2_1()); 
            // InternalXtext.g:5936:1: ( rule__RuleCall__ArgumentsAssignment_1_2_1 )
            // InternalXtext.g:5936:2: rule__RuleCall__ArgumentsAssignment_1_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleCall__ArgumentsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleCallAccess().getArgumentsAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCall__Group_1_2__1__Impl"


    // $ANTLR start "rule__NamedArgument__Group__0"
    // InternalXtext.g:5950:1: rule__NamedArgument__Group__0 : rule__NamedArgument__Group__0__Impl rule__NamedArgument__Group__1 ;
    public final void rule__NamedArgument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5954:1: ( rule__NamedArgument__Group__0__Impl rule__NamedArgument__Group__1 )
            // InternalXtext.g:5955:2: rule__NamedArgument__Group__0__Impl rule__NamedArgument__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__NamedArgument__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__NamedArgument__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedArgument__Group__0"


    // $ANTLR start "rule__NamedArgument__Group__0__Impl"
    // InternalXtext.g:5962:1: rule__NamedArgument__Group__0__Impl : ( ( rule__NamedArgument__Group_0__0 )? ) ;
    public final void rule__NamedArgument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5966:1: ( ( ( rule__NamedArgument__Group_0__0 )? ) )
            // InternalXtext.g:5967:1: ( ( rule__NamedArgument__Group_0__0 )? )
            {
            // InternalXtext.g:5967:1: ( ( rule__NamedArgument__Group_0__0 )? )
            // InternalXtext.g:5968:1: ( rule__NamedArgument__Group_0__0 )?
            {
             before(grammarAccess.getNamedArgumentAccess().getGroup_0()); 
            // InternalXtext.g:5969:1: ( rule__NamedArgument__Group_0__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==18) ) {
                    alt60=1;
                }
            }
            switch (alt60) {
                case 1 :
                    // InternalXtext.g:5969:2: rule__NamedArgument__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__NamedArgument__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNamedArgumentAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedArgument__Group__0__Impl"


    // $ANTLR start "rule__NamedArgument__Group__1"
    // InternalXtext.g:5979:1: rule__NamedArgument__Group__1 : rule__NamedArgument__Group__1__Impl ;
    public final void rule__NamedArgument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5983:1: ( rule__NamedArgument__Group__1__Impl )
            // InternalXtext.g:5984:2: rule__NamedArgument__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NamedArgument__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedArgument__Group__1"


    // $ANTLR start "rule__NamedArgument__Group__1__Impl"
    // InternalXtext.g:5990:1: rule__NamedArgument__Group__1__Impl : ( ( rule__NamedArgument__ValueAssignment_1 ) ) ;
    public final void rule__NamedArgument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:5994:1: ( ( ( rule__NamedArgument__ValueAssignment_1 ) ) )
            // InternalXtext.g:5995:1: ( ( rule__NamedArgument__ValueAssignment_1 ) )
            {
            // InternalXtext.g:5995:1: ( ( rule__NamedArgument__ValueAssignment_1 ) )
            // InternalXtext.g:5996:1: ( rule__NamedArgument__ValueAssignment_1 )
            {
             before(grammarAccess.getNamedArgumentAccess().getValueAssignment_1()); 
            // InternalXtext.g:5997:1: ( rule__NamedArgument__ValueAssignment_1 )
            // InternalXtext.g:5997:2: rule__NamedArgument__ValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NamedArgument__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNamedArgumentAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedArgument__Group__1__Impl"


    // $ANTLR start "rule__NamedArgument__Group_0__0"
    // InternalXtext.g:6011:1: rule__NamedArgument__Group_0__0 : rule__NamedArgument__Group_0__0__Impl rule__NamedArgument__Group_0__1 ;
    public final void rule__NamedArgument__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6015:1: ( rule__NamedArgument__Group_0__0__Impl rule__NamedArgument__Group_0__1 )
            // InternalXtext.g:6016:2: rule__NamedArgument__Group_0__0__Impl rule__NamedArgument__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_40);
            rule__NamedArgument__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__NamedArgument__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedArgument__Group_0__0"


    // $ANTLR start "rule__NamedArgument__Group_0__0__Impl"
    // InternalXtext.g:6023:1: rule__NamedArgument__Group_0__0__Impl : ( ( rule__NamedArgument__ParameterAssignment_0_0 ) ) ;
    public final void rule__NamedArgument__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6027:1: ( ( ( rule__NamedArgument__ParameterAssignment_0_0 ) ) )
            // InternalXtext.g:6028:1: ( ( rule__NamedArgument__ParameterAssignment_0_0 ) )
            {
            // InternalXtext.g:6028:1: ( ( rule__NamedArgument__ParameterAssignment_0_0 ) )
            // InternalXtext.g:6029:1: ( rule__NamedArgument__ParameterAssignment_0_0 )
            {
             before(grammarAccess.getNamedArgumentAccess().getParameterAssignment_0_0()); 
            // InternalXtext.g:6030:1: ( rule__NamedArgument__ParameterAssignment_0_0 )
            // InternalXtext.g:6030:2: rule__NamedArgument__ParameterAssignment_0_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NamedArgument__ParameterAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getNamedArgumentAccess().getParameterAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedArgument__Group_0__0__Impl"


    // $ANTLR start "rule__NamedArgument__Group_0__1"
    // InternalXtext.g:6040:1: rule__NamedArgument__Group_0__1 : rule__NamedArgument__Group_0__1__Impl ;
    public final void rule__NamedArgument__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6044:1: ( rule__NamedArgument__Group_0__1__Impl )
            // InternalXtext.g:6045:2: rule__NamedArgument__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NamedArgument__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedArgument__Group_0__1"


    // $ANTLR start "rule__NamedArgument__Group_0__1__Impl"
    // InternalXtext.g:6051:1: rule__NamedArgument__Group_0__1__Impl : ( ( rule__NamedArgument__CalledByNameAssignment_0_1 ) ) ;
    public final void rule__NamedArgument__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6055:1: ( ( ( rule__NamedArgument__CalledByNameAssignment_0_1 ) ) )
            // InternalXtext.g:6056:1: ( ( rule__NamedArgument__CalledByNameAssignment_0_1 ) )
            {
            // InternalXtext.g:6056:1: ( ( rule__NamedArgument__CalledByNameAssignment_0_1 ) )
            // InternalXtext.g:6057:1: ( rule__NamedArgument__CalledByNameAssignment_0_1 )
            {
             before(grammarAccess.getNamedArgumentAccess().getCalledByNameAssignment_0_1()); 
            // InternalXtext.g:6058:1: ( rule__NamedArgument__CalledByNameAssignment_0_1 )
            // InternalXtext.g:6058:2: rule__NamedArgument__CalledByNameAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NamedArgument__CalledByNameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getNamedArgumentAccess().getCalledByNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedArgument__Group_0__1__Impl"


    // $ANTLR start "rule__LiteralCondition__Group__0"
    // InternalXtext.g:6072:1: rule__LiteralCondition__Group__0 : rule__LiteralCondition__Group__0__Impl rule__LiteralCondition__Group__1 ;
    public final void rule__LiteralCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6076:1: ( rule__LiteralCondition__Group__0__Impl rule__LiteralCondition__Group__1 )
            // InternalXtext.g:6077:2: rule__LiteralCondition__Group__0__Impl rule__LiteralCondition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_41);
            rule__LiteralCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralCondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralCondition__Group__0"


    // $ANTLR start "rule__LiteralCondition__Group__0__Impl"
    // InternalXtext.g:6084:1: rule__LiteralCondition__Group__0__Impl : ( () ) ;
    public final void rule__LiteralCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6088:1: ( ( () ) )
            // InternalXtext.g:6089:1: ( () )
            {
            // InternalXtext.g:6089:1: ( () )
            // InternalXtext.g:6090:1: ()
            {
             before(grammarAccess.getLiteralConditionAccess().getLiteralConditionAction_0()); 
            // InternalXtext.g:6091:1: ()
            // InternalXtext.g:6093:1: 
            {
            }

             after(grammarAccess.getLiteralConditionAccess().getLiteralConditionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralCondition__Group__0__Impl"


    // $ANTLR start "rule__LiteralCondition__Group__1"
    // InternalXtext.g:6103:1: rule__LiteralCondition__Group__1 : rule__LiteralCondition__Group__1__Impl ;
    public final void rule__LiteralCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6107:1: ( rule__LiteralCondition__Group__1__Impl )
            // InternalXtext.g:6108:2: rule__LiteralCondition__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralCondition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralCondition__Group__1"


    // $ANTLR start "rule__LiteralCondition__Group__1__Impl"
    // InternalXtext.g:6114:1: rule__LiteralCondition__Group__1__Impl : ( ( rule__LiteralCondition__Alternatives_1 ) ) ;
    public final void rule__LiteralCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6118:1: ( ( ( rule__LiteralCondition__Alternatives_1 ) ) )
            // InternalXtext.g:6119:1: ( ( rule__LiteralCondition__Alternatives_1 ) )
            {
            // InternalXtext.g:6119:1: ( ( rule__LiteralCondition__Alternatives_1 ) )
            // InternalXtext.g:6120:1: ( rule__LiteralCondition__Alternatives_1 )
            {
             before(grammarAccess.getLiteralConditionAccess().getAlternatives_1()); 
            // InternalXtext.g:6121:1: ( rule__LiteralCondition__Alternatives_1 )
            // InternalXtext.g:6121:2: rule__LiteralCondition__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralCondition__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getLiteralConditionAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralCondition__Group__1__Impl"


    // $ANTLR start "rule__Disjunction__Group__0"
    // InternalXtext.g:6135:1: rule__Disjunction__Group__0 : rule__Disjunction__Group__0__Impl rule__Disjunction__Group__1 ;
    public final void rule__Disjunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6139:1: ( rule__Disjunction__Group__0__Impl rule__Disjunction__Group__1 )
            // InternalXtext.g:6140:2: rule__Disjunction__Group__0__Impl rule__Disjunction__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__Disjunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Disjunction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group__0"


    // $ANTLR start "rule__Disjunction__Group__0__Impl"
    // InternalXtext.g:6147:1: rule__Disjunction__Group__0__Impl : ( ruleConjunction ) ;
    public final void rule__Disjunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6151:1: ( ( ruleConjunction ) )
            // InternalXtext.g:6152:1: ( ruleConjunction )
            {
            // InternalXtext.g:6152:1: ( ruleConjunction )
            // InternalXtext.g:6153:1: ruleConjunction
            {
             before(grammarAccess.getDisjunctionAccess().getConjunctionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleConjunction();

            state._fsp--;

             after(grammarAccess.getDisjunctionAccess().getConjunctionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group__0__Impl"


    // $ANTLR start "rule__Disjunction__Group__1"
    // InternalXtext.g:6164:1: rule__Disjunction__Group__1 : rule__Disjunction__Group__1__Impl ;
    public final void rule__Disjunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6168:1: ( rule__Disjunction__Group__1__Impl )
            // InternalXtext.g:6169:2: rule__Disjunction__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Disjunction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group__1"


    // $ANTLR start "rule__Disjunction__Group__1__Impl"
    // InternalXtext.g:6175:1: rule__Disjunction__Group__1__Impl : ( ( rule__Disjunction__Group_1__0 )* ) ;
    public final void rule__Disjunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6179:1: ( ( ( rule__Disjunction__Group_1__0 )* ) )
            // InternalXtext.g:6180:1: ( ( rule__Disjunction__Group_1__0 )* )
            {
            // InternalXtext.g:6180:1: ( ( rule__Disjunction__Group_1__0 )* )
            // InternalXtext.g:6181:1: ( rule__Disjunction__Group_1__0 )*
            {
             before(grammarAccess.getDisjunctionAccess().getGroup_1()); 
            // InternalXtext.g:6182:1: ( rule__Disjunction__Group_1__0 )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==40) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalXtext.g:6182:2: rule__Disjunction__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__Disjunction__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

             after(grammarAccess.getDisjunctionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group__1__Impl"


    // $ANTLR start "rule__Disjunction__Group_1__0"
    // InternalXtext.g:6196:1: rule__Disjunction__Group_1__0 : rule__Disjunction__Group_1__0__Impl rule__Disjunction__Group_1__1 ;
    public final void rule__Disjunction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6200:1: ( rule__Disjunction__Group_1__0__Impl rule__Disjunction__Group_1__1 )
            // InternalXtext.g:6201:2: rule__Disjunction__Group_1__0__Impl rule__Disjunction__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__Disjunction__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Disjunction__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1__0"


    // $ANTLR start "rule__Disjunction__Group_1__0__Impl"
    // InternalXtext.g:6208:1: rule__Disjunction__Group_1__0__Impl : ( () ) ;
    public final void rule__Disjunction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6212:1: ( ( () ) )
            // InternalXtext.g:6213:1: ( () )
            {
            // InternalXtext.g:6213:1: ( () )
            // InternalXtext.g:6214:1: ()
            {
             before(grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0()); 
            // InternalXtext.g:6215:1: ()
            // InternalXtext.g:6217:1: 
            {
            }

             after(grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1__0__Impl"


    // $ANTLR start "rule__Disjunction__Group_1__1"
    // InternalXtext.g:6227:1: rule__Disjunction__Group_1__1 : rule__Disjunction__Group_1__1__Impl rule__Disjunction__Group_1__2 ;
    public final void rule__Disjunction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6231:1: ( rule__Disjunction__Group_1__1__Impl rule__Disjunction__Group_1__2 )
            // InternalXtext.g:6232:2: rule__Disjunction__Group_1__1__Impl rule__Disjunction__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__Disjunction__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Disjunction__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1__1"


    // $ANTLR start "rule__Disjunction__Group_1__1__Impl"
    // InternalXtext.g:6239:1: rule__Disjunction__Group_1__1__Impl : ( '|' ) ;
    public final void rule__Disjunction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6243:1: ( ( '|' ) )
            // InternalXtext.g:6244:1: ( '|' )
            {
            // InternalXtext.g:6244:1: ( '|' )
            // InternalXtext.g:6245:1: '|'
            {
             before(grammarAccess.getDisjunctionAccess().getVerticalLineKeyword_1_1()); 
            match(input,40,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDisjunctionAccess().getVerticalLineKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1__1__Impl"


    // $ANTLR start "rule__Disjunction__Group_1__2"
    // InternalXtext.g:6258:1: rule__Disjunction__Group_1__2 : rule__Disjunction__Group_1__2__Impl ;
    public final void rule__Disjunction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6262:1: ( rule__Disjunction__Group_1__2__Impl )
            // InternalXtext.g:6263:2: rule__Disjunction__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Disjunction__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1__2"


    // $ANTLR start "rule__Disjunction__Group_1__2__Impl"
    // InternalXtext.g:6269:1: rule__Disjunction__Group_1__2__Impl : ( ( rule__Disjunction__RightAssignment_1_2 ) ) ;
    public final void rule__Disjunction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6273:1: ( ( ( rule__Disjunction__RightAssignment_1_2 ) ) )
            // InternalXtext.g:6274:1: ( ( rule__Disjunction__RightAssignment_1_2 ) )
            {
            // InternalXtext.g:6274:1: ( ( rule__Disjunction__RightAssignment_1_2 ) )
            // InternalXtext.g:6275:1: ( rule__Disjunction__RightAssignment_1_2 )
            {
             before(grammarAccess.getDisjunctionAccess().getRightAssignment_1_2()); 
            // InternalXtext.g:6276:1: ( rule__Disjunction__RightAssignment_1_2 )
            // InternalXtext.g:6276:2: rule__Disjunction__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Disjunction__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDisjunctionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1__2__Impl"


    // $ANTLR start "rule__Conjunction__Group__0"
    // InternalXtext.g:6292:1: rule__Conjunction__Group__0 : rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1 ;
    public final void rule__Conjunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6296:1: ( rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1 )
            // InternalXtext.g:6297:2: rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_33);
            rule__Conjunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Conjunction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group__0"


    // $ANTLR start "rule__Conjunction__Group__0__Impl"
    // InternalXtext.g:6304:1: rule__Conjunction__Group__0__Impl : ( ruleNegation ) ;
    public final void rule__Conjunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6308:1: ( ( ruleNegation ) )
            // InternalXtext.g:6309:1: ( ruleNegation )
            {
            // InternalXtext.g:6309:1: ( ruleNegation )
            // InternalXtext.g:6310:1: ruleNegation
            {
             before(grammarAccess.getConjunctionAccess().getNegationParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleNegation();

            state._fsp--;

             after(grammarAccess.getConjunctionAccess().getNegationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group__0__Impl"


    // $ANTLR start "rule__Conjunction__Group__1"
    // InternalXtext.g:6321:1: rule__Conjunction__Group__1 : rule__Conjunction__Group__1__Impl ;
    public final void rule__Conjunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6325:1: ( rule__Conjunction__Group__1__Impl )
            // InternalXtext.g:6326:2: rule__Conjunction__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Conjunction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group__1"


    // $ANTLR start "rule__Conjunction__Group__1__Impl"
    // InternalXtext.g:6332:1: rule__Conjunction__Group__1__Impl : ( ( rule__Conjunction__Group_1__0 )* ) ;
    public final void rule__Conjunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6336:1: ( ( ( rule__Conjunction__Group_1__0 )* ) )
            // InternalXtext.g:6337:1: ( ( rule__Conjunction__Group_1__0 )* )
            {
            // InternalXtext.g:6337:1: ( ( rule__Conjunction__Group_1__0 )* )
            // InternalXtext.g:6338:1: ( rule__Conjunction__Group_1__0 )*
            {
             before(grammarAccess.getConjunctionAccess().getGroup_1()); 
            // InternalXtext.g:6339:1: ( rule__Conjunction__Group_1__0 )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==41) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalXtext.g:6339:2: rule__Conjunction__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_34);
            	    rule__Conjunction__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

             after(grammarAccess.getConjunctionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group__1__Impl"


    // $ANTLR start "rule__Conjunction__Group_1__0"
    // InternalXtext.g:6353:1: rule__Conjunction__Group_1__0 : rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1 ;
    public final void rule__Conjunction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6357:1: ( rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1 )
            // InternalXtext.g:6358:2: rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_33);
            rule__Conjunction__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Conjunction__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_1__0"


    // $ANTLR start "rule__Conjunction__Group_1__0__Impl"
    // InternalXtext.g:6365:1: rule__Conjunction__Group_1__0__Impl : ( () ) ;
    public final void rule__Conjunction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6369:1: ( ( () ) )
            // InternalXtext.g:6370:1: ( () )
            {
            // InternalXtext.g:6370:1: ( () )
            // InternalXtext.g:6371:1: ()
            {
             before(grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0()); 
            // InternalXtext.g:6372:1: ()
            // InternalXtext.g:6374:1: 
            {
            }

             after(grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_1__0__Impl"


    // $ANTLR start "rule__Conjunction__Group_1__1"
    // InternalXtext.g:6384:1: rule__Conjunction__Group_1__1 : rule__Conjunction__Group_1__1__Impl rule__Conjunction__Group_1__2 ;
    public final void rule__Conjunction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6388:1: ( rule__Conjunction__Group_1__1__Impl rule__Conjunction__Group_1__2 )
            // InternalXtext.g:6389:2: rule__Conjunction__Group_1__1__Impl rule__Conjunction__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__Conjunction__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Conjunction__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_1__1"


    // $ANTLR start "rule__Conjunction__Group_1__1__Impl"
    // InternalXtext.g:6396:1: rule__Conjunction__Group_1__1__Impl : ( '&' ) ;
    public final void rule__Conjunction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6400:1: ( ( '&' ) )
            // InternalXtext.g:6401:1: ( '&' )
            {
            // InternalXtext.g:6401:1: ( '&' )
            // InternalXtext.g:6402:1: '&'
            {
             before(grammarAccess.getConjunctionAccess().getAmpersandKeyword_1_1()); 
            match(input,41,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getConjunctionAccess().getAmpersandKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_1__1__Impl"


    // $ANTLR start "rule__Conjunction__Group_1__2"
    // InternalXtext.g:6415:1: rule__Conjunction__Group_1__2 : rule__Conjunction__Group_1__2__Impl ;
    public final void rule__Conjunction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6419:1: ( rule__Conjunction__Group_1__2__Impl )
            // InternalXtext.g:6420:2: rule__Conjunction__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Conjunction__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_1__2"


    // $ANTLR start "rule__Conjunction__Group_1__2__Impl"
    // InternalXtext.g:6426:1: rule__Conjunction__Group_1__2__Impl : ( ( rule__Conjunction__RightAssignment_1_2 ) ) ;
    public final void rule__Conjunction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6430:1: ( ( ( rule__Conjunction__RightAssignment_1_2 ) ) )
            // InternalXtext.g:6431:1: ( ( rule__Conjunction__RightAssignment_1_2 ) )
            {
            // InternalXtext.g:6431:1: ( ( rule__Conjunction__RightAssignment_1_2 ) )
            // InternalXtext.g:6432:1: ( rule__Conjunction__RightAssignment_1_2 )
            {
             before(grammarAccess.getConjunctionAccess().getRightAssignment_1_2()); 
            // InternalXtext.g:6433:1: ( rule__Conjunction__RightAssignment_1_2 )
            // InternalXtext.g:6433:2: rule__Conjunction__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Conjunction__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getConjunctionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_1__2__Impl"


    // $ANTLR start "rule__Negation__Group_1__0"
    // InternalXtext.g:6449:1: rule__Negation__Group_1__0 : rule__Negation__Group_1__0__Impl rule__Negation__Group_1__1 ;
    public final void rule__Negation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6453:1: ( rule__Negation__Group_1__0__Impl rule__Negation__Group_1__1 )
            // InternalXtext.g:6454:2: rule__Negation__Group_1__0__Impl rule__Negation__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__Negation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Negation__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group_1__0"


    // $ANTLR start "rule__Negation__Group_1__0__Impl"
    // InternalXtext.g:6461:1: rule__Negation__Group_1__0__Impl : ( () ) ;
    public final void rule__Negation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6465:1: ( ( () ) )
            // InternalXtext.g:6466:1: ( () )
            {
            // InternalXtext.g:6466:1: ( () )
            // InternalXtext.g:6467:1: ()
            {
             before(grammarAccess.getNegationAccess().getNegationAction_1_0()); 
            // InternalXtext.g:6468:1: ()
            // InternalXtext.g:6470:1: 
            {
            }

             after(grammarAccess.getNegationAccess().getNegationAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group_1__0__Impl"


    // $ANTLR start "rule__Negation__Group_1__1"
    // InternalXtext.g:6480:1: rule__Negation__Group_1__1 : rule__Negation__Group_1__1__Impl rule__Negation__Group_1__2 ;
    public final void rule__Negation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6484:1: ( rule__Negation__Group_1__1__Impl rule__Negation__Group_1__2 )
            // InternalXtext.g:6485:2: rule__Negation__Group_1__1__Impl rule__Negation__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__Negation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Negation__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group_1__1"


    // $ANTLR start "rule__Negation__Group_1__1__Impl"
    // InternalXtext.g:6492:1: rule__Negation__Group_1__1__Impl : ( '!' ) ;
    public final void rule__Negation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6496:1: ( ( '!' ) )
            // InternalXtext.g:6497:1: ( '!' )
            {
            // InternalXtext.g:6497:1: ( '!' )
            // InternalXtext.g:6498:1: '!'
            {
             before(grammarAccess.getNegationAccess().getExclamationMarkKeyword_1_1()); 
            match(input,43,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getNegationAccess().getExclamationMarkKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group_1__1__Impl"


    // $ANTLR start "rule__Negation__Group_1__2"
    // InternalXtext.g:6511:1: rule__Negation__Group_1__2 : rule__Negation__Group_1__2__Impl ;
    public final void rule__Negation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6515:1: ( rule__Negation__Group_1__2__Impl )
            // InternalXtext.g:6516:2: rule__Negation__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Negation__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group_1__2"


    // $ANTLR start "rule__Negation__Group_1__2__Impl"
    // InternalXtext.g:6522:1: rule__Negation__Group_1__2__Impl : ( ( rule__Negation__ValueAssignment_1_2 ) ) ;
    public final void rule__Negation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6526:1: ( ( ( rule__Negation__ValueAssignment_1_2 ) ) )
            // InternalXtext.g:6527:1: ( ( rule__Negation__ValueAssignment_1_2 ) )
            {
            // InternalXtext.g:6527:1: ( ( rule__Negation__ValueAssignment_1_2 ) )
            // InternalXtext.g:6528:1: ( rule__Negation__ValueAssignment_1_2 )
            {
             before(grammarAccess.getNegationAccess().getValueAssignment_1_2()); 
            // InternalXtext.g:6529:1: ( rule__Negation__ValueAssignment_1_2 )
            // InternalXtext.g:6529:2: rule__Negation__ValueAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Negation__ValueAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getNegationAccess().getValueAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group_1__2__Impl"


    // $ANTLR start "rule__ParenthesizedCondition__Group__0"
    // InternalXtext.g:6545:1: rule__ParenthesizedCondition__Group__0 : rule__ParenthesizedCondition__Group__0__Impl rule__ParenthesizedCondition__Group__1 ;
    public final void rule__ParenthesizedCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6549:1: ( rule__ParenthesizedCondition__Group__0__Impl rule__ParenthesizedCondition__Group__1 )
            // InternalXtext.g:6550:2: rule__ParenthesizedCondition__Group__0__Impl rule__ParenthesizedCondition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__ParenthesizedCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedCondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedCondition__Group__0"


    // $ANTLR start "rule__ParenthesizedCondition__Group__0__Impl"
    // InternalXtext.g:6557:1: rule__ParenthesizedCondition__Group__0__Impl : ( '(' ) ;
    public final void rule__ParenthesizedCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6561:1: ( ( '(' ) )
            // InternalXtext.g:6562:1: ( '(' )
            {
            // InternalXtext.g:6562:1: ( '(' )
            // InternalXtext.g:6563:1: '('
            {
             before(grammarAccess.getParenthesizedConditionAccess().getLeftParenthesisKeyword_0()); 
            match(input,26,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParenthesizedConditionAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedCondition__Group__0__Impl"


    // $ANTLR start "rule__ParenthesizedCondition__Group__1"
    // InternalXtext.g:6576:1: rule__ParenthesizedCondition__Group__1 : rule__ParenthesizedCondition__Group__1__Impl rule__ParenthesizedCondition__Group__2 ;
    public final void rule__ParenthesizedCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6580:1: ( rule__ParenthesizedCondition__Group__1__Impl rule__ParenthesizedCondition__Group__2 )
            // InternalXtext.g:6581:2: rule__ParenthesizedCondition__Group__1__Impl rule__ParenthesizedCondition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_42);
            rule__ParenthesizedCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedCondition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedCondition__Group__1"


    // $ANTLR start "rule__ParenthesizedCondition__Group__1__Impl"
    // InternalXtext.g:6588:1: rule__ParenthesizedCondition__Group__1__Impl : ( ruleDisjunction ) ;
    public final void rule__ParenthesizedCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6592:1: ( ( ruleDisjunction ) )
            // InternalXtext.g:6593:1: ( ruleDisjunction )
            {
            // InternalXtext.g:6593:1: ( ruleDisjunction )
            // InternalXtext.g:6594:1: ruleDisjunction
            {
             before(grammarAccess.getParenthesizedConditionAccess().getDisjunctionParserRuleCall_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDisjunction();

            state._fsp--;

             after(grammarAccess.getParenthesizedConditionAccess().getDisjunctionParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedCondition__Group__1__Impl"


    // $ANTLR start "rule__ParenthesizedCondition__Group__2"
    // InternalXtext.g:6605:1: rule__ParenthesizedCondition__Group__2 : rule__ParenthesizedCondition__Group__2__Impl ;
    public final void rule__ParenthesizedCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6609:1: ( rule__ParenthesizedCondition__Group__2__Impl )
            // InternalXtext.g:6610:2: rule__ParenthesizedCondition__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedCondition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedCondition__Group__2"


    // $ANTLR start "rule__ParenthesizedCondition__Group__2__Impl"
    // InternalXtext.g:6616:1: rule__ParenthesizedCondition__Group__2__Impl : ( ')' ) ;
    public final void rule__ParenthesizedCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6620:1: ( ( ')' ) )
            // InternalXtext.g:6621:1: ( ')' )
            {
            // InternalXtext.g:6621:1: ( ')' )
            // InternalXtext.g:6622:1: ')'
            {
             before(grammarAccess.getParenthesizedConditionAccess().getRightParenthesisKeyword_2()); 
            match(input,27,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParenthesizedConditionAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedCondition__Group__2__Impl"


    // $ANTLR start "rule__RuleID__Group__0"
    // InternalXtext.g:6641:1: rule__RuleID__Group__0 : rule__RuleID__Group__0__Impl rule__RuleID__Group__1 ;
    public final void rule__RuleID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6645:1: ( rule__RuleID__Group__0__Impl rule__RuleID__Group__1 )
            // InternalXtext.g:6646:2: rule__RuleID__Group__0__Impl rule__RuleID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__RuleID__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleID__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleID__Group__0"


    // $ANTLR start "rule__RuleID__Group__0__Impl"
    // InternalXtext.g:6653:1: rule__RuleID__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__RuleID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6657:1: ( ( ruleValidID ) )
            // InternalXtext.g:6658:1: ( ruleValidID )
            {
            // InternalXtext.g:6658:1: ( ruleValidID )
            // InternalXtext.g:6659:1: ruleValidID
            {
             before(grammarAccess.getRuleIDAccess().getValidIDParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getRuleIDAccess().getValidIDParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleID__Group__0__Impl"


    // $ANTLR start "rule__RuleID__Group__1"
    // InternalXtext.g:6670:1: rule__RuleID__Group__1 : rule__RuleID__Group__1__Impl ;
    public final void rule__RuleID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6674:1: ( rule__RuleID__Group__1__Impl )
            // InternalXtext.g:6675:2: rule__RuleID__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleID__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleID__Group__1"


    // $ANTLR start "rule__RuleID__Group__1__Impl"
    // InternalXtext.g:6681:1: rule__RuleID__Group__1__Impl : ( ( rule__RuleID__Group_1__0 )* ) ;
    public final void rule__RuleID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6685:1: ( ( ( rule__RuleID__Group_1__0 )* ) )
            // InternalXtext.g:6686:1: ( ( rule__RuleID__Group_1__0 )* )
            {
            // InternalXtext.g:6686:1: ( ( rule__RuleID__Group_1__0 )* )
            // InternalXtext.g:6687:1: ( rule__RuleID__Group_1__0 )*
            {
             before(grammarAccess.getRuleIDAccess().getGroup_1()); 
            // InternalXtext.g:6688:1: ( rule__RuleID__Group_1__0 )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==39) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalXtext.g:6688:2: rule__RuleID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_43);
            	    rule__RuleID__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

             after(grammarAccess.getRuleIDAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleID__Group__1__Impl"


    // $ANTLR start "rule__RuleID__Group_1__0"
    // InternalXtext.g:6702:1: rule__RuleID__Group_1__0 : rule__RuleID__Group_1__0__Impl rule__RuleID__Group_1__1 ;
    public final void rule__RuleID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6706:1: ( rule__RuleID__Group_1__0__Impl rule__RuleID__Group_1__1 )
            // InternalXtext.g:6707:2: rule__RuleID__Group_1__0__Impl rule__RuleID__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__RuleID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleID__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleID__Group_1__0"


    // $ANTLR start "rule__RuleID__Group_1__0__Impl"
    // InternalXtext.g:6714:1: rule__RuleID__Group_1__0__Impl : ( '::' ) ;
    public final void rule__RuleID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6718:1: ( ( '::' ) )
            // InternalXtext.g:6719:1: ( '::' )
            {
            // InternalXtext.g:6719:1: ( '::' )
            // InternalXtext.g:6720:1: '::'
            {
             before(grammarAccess.getRuleIDAccess().getColonColonKeyword_1_0()); 
            match(input,39,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRuleIDAccess().getColonColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleID__Group_1__0__Impl"


    // $ANTLR start "rule__RuleID__Group_1__1"
    // InternalXtext.g:6733:1: rule__RuleID__Group_1__1 : rule__RuleID__Group_1__1__Impl ;
    public final void rule__RuleID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6737:1: ( rule__RuleID__Group_1__1__Impl )
            // InternalXtext.g:6738:2: rule__RuleID__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RuleID__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleID__Group_1__1"


    // $ANTLR start "rule__RuleID__Group_1__1__Impl"
    // InternalXtext.g:6744:1: rule__RuleID__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__RuleID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6748:1: ( ( ruleValidID ) )
            // InternalXtext.g:6749:1: ( ruleValidID )
            {
            // InternalXtext.g:6749:1: ( ruleValidID )
            // InternalXtext.g:6750:1: ruleValidID
            {
             before(grammarAccess.getRuleIDAccess().getValidIDParserRuleCall_1_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getRuleIDAccess().getValidIDParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleID__Group_1__1__Impl"


    // $ANTLR start "rule__PredicatedKeyword__Group__0"
    // InternalXtext.g:6765:1: rule__PredicatedKeyword__Group__0 : rule__PredicatedKeyword__Group__0__Impl rule__PredicatedKeyword__Group__1 ;
    public final void rule__PredicatedKeyword__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6769:1: ( rule__PredicatedKeyword__Group__0__Impl rule__PredicatedKeyword__Group__1 )
            // InternalXtext.g:6770:2: rule__PredicatedKeyword__Group__0__Impl rule__PredicatedKeyword__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__PredicatedKeyword__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedKeyword__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedKeyword__Group__0"


    // $ANTLR start "rule__PredicatedKeyword__Group__0__Impl"
    // InternalXtext.g:6777:1: rule__PredicatedKeyword__Group__0__Impl : ( ( rule__PredicatedKeyword__Alternatives_0 ) ) ;
    public final void rule__PredicatedKeyword__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6781:1: ( ( ( rule__PredicatedKeyword__Alternatives_0 ) ) )
            // InternalXtext.g:6782:1: ( ( rule__PredicatedKeyword__Alternatives_0 ) )
            {
            // InternalXtext.g:6782:1: ( ( rule__PredicatedKeyword__Alternatives_0 ) )
            // InternalXtext.g:6783:1: ( rule__PredicatedKeyword__Alternatives_0 )
            {
             before(grammarAccess.getPredicatedKeywordAccess().getAlternatives_0()); 
            // InternalXtext.g:6784:1: ( rule__PredicatedKeyword__Alternatives_0 )
            // InternalXtext.g:6784:2: rule__PredicatedKeyword__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedKeyword__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getPredicatedKeywordAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedKeyword__Group__0__Impl"


    // $ANTLR start "rule__PredicatedKeyword__Group__1"
    // InternalXtext.g:6794:1: rule__PredicatedKeyword__Group__1 : rule__PredicatedKeyword__Group__1__Impl ;
    public final void rule__PredicatedKeyword__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6798:1: ( rule__PredicatedKeyword__Group__1__Impl )
            // InternalXtext.g:6799:2: rule__PredicatedKeyword__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedKeyword__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedKeyword__Group__1"


    // $ANTLR start "rule__PredicatedKeyword__Group__1__Impl"
    // InternalXtext.g:6805:1: rule__PredicatedKeyword__Group__1__Impl : ( ( rule__PredicatedKeyword__ValueAssignment_1 ) ) ;
    public final void rule__PredicatedKeyword__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6809:1: ( ( ( rule__PredicatedKeyword__ValueAssignment_1 ) ) )
            // InternalXtext.g:6810:1: ( ( rule__PredicatedKeyword__ValueAssignment_1 ) )
            {
            // InternalXtext.g:6810:1: ( ( rule__PredicatedKeyword__ValueAssignment_1 ) )
            // InternalXtext.g:6811:1: ( rule__PredicatedKeyword__ValueAssignment_1 )
            {
             before(grammarAccess.getPredicatedKeywordAccess().getValueAssignment_1()); 
            // InternalXtext.g:6812:1: ( rule__PredicatedKeyword__ValueAssignment_1 )
            // InternalXtext.g:6812:2: rule__PredicatedKeyword__ValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedKeyword__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPredicatedKeywordAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedKeyword__Group__1__Impl"


    // $ANTLR start "rule__PredicatedRuleCall__Group__0"
    // InternalXtext.g:6826:1: rule__PredicatedRuleCall__Group__0 : rule__PredicatedRuleCall__Group__0__Impl rule__PredicatedRuleCall__Group__1 ;
    public final void rule__PredicatedRuleCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6830:1: ( rule__PredicatedRuleCall__Group__0__Impl rule__PredicatedRuleCall__Group__1 )
            // InternalXtext.g:6831:2: rule__PredicatedRuleCall__Group__0__Impl rule__PredicatedRuleCall__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__PredicatedRuleCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedRuleCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__Group__0"


    // $ANTLR start "rule__PredicatedRuleCall__Group__0__Impl"
    // InternalXtext.g:6838:1: rule__PredicatedRuleCall__Group__0__Impl : ( ( rule__PredicatedRuleCall__Alternatives_0 ) ) ;
    public final void rule__PredicatedRuleCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6842:1: ( ( ( rule__PredicatedRuleCall__Alternatives_0 ) ) )
            // InternalXtext.g:6843:1: ( ( rule__PredicatedRuleCall__Alternatives_0 ) )
            {
            // InternalXtext.g:6843:1: ( ( rule__PredicatedRuleCall__Alternatives_0 ) )
            // InternalXtext.g:6844:1: ( rule__PredicatedRuleCall__Alternatives_0 )
            {
             before(grammarAccess.getPredicatedRuleCallAccess().getAlternatives_0()); 
            // InternalXtext.g:6845:1: ( rule__PredicatedRuleCall__Alternatives_0 )
            // InternalXtext.g:6845:2: rule__PredicatedRuleCall__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedRuleCall__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getPredicatedRuleCallAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__Group__0__Impl"


    // $ANTLR start "rule__PredicatedRuleCall__Group__1"
    // InternalXtext.g:6855:1: rule__PredicatedRuleCall__Group__1 : rule__PredicatedRuleCall__Group__1__Impl rule__PredicatedRuleCall__Group__2 ;
    public final void rule__PredicatedRuleCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6859:1: ( rule__PredicatedRuleCall__Group__1__Impl rule__PredicatedRuleCall__Group__2 )
            // InternalXtext.g:6860:2: rule__PredicatedRuleCall__Group__1__Impl rule__PredicatedRuleCall__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__PredicatedRuleCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedRuleCall__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__Group__1"


    // $ANTLR start "rule__PredicatedRuleCall__Group__1__Impl"
    // InternalXtext.g:6867:1: rule__PredicatedRuleCall__Group__1__Impl : ( ( rule__PredicatedRuleCall__RuleAssignment_1 ) ) ;
    public final void rule__PredicatedRuleCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6871:1: ( ( ( rule__PredicatedRuleCall__RuleAssignment_1 ) ) )
            // InternalXtext.g:6872:1: ( ( rule__PredicatedRuleCall__RuleAssignment_1 ) )
            {
            // InternalXtext.g:6872:1: ( ( rule__PredicatedRuleCall__RuleAssignment_1 ) )
            // InternalXtext.g:6873:1: ( rule__PredicatedRuleCall__RuleAssignment_1 )
            {
             before(grammarAccess.getPredicatedRuleCallAccess().getRuleAssignment_1()); 
            // InternalXtext.g:6874:1: ( rule__PredicatedRuleCall__RuleAssignment_1 )
            // InternalXtext.g:6874:2: rule__PredicatedRuleCall__RuleAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedRuleCall__RuleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPredicatedRuleCallAccess().getRuleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__Group__1__Impl"


    // $ANTLR start "rule__PredicatedRuleCall__Group__2"
    // InternalXtext.g:6884:1: rule__PredicatedRuleCall__Group__2 : rule__PredicatedRuleCall__Group__2__Impl ;
    public final void rule__PredicatedRuleCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6888:1: ( rule__PredicatedRuleCall__Group__2__Impl )
            // InternalXtext.g:6889:2: rule__PredicatedRuleCall__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedRuleCall__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__Group__2"


    // $ANTLR start "rule__PredicatedRuleCall__Group__2__Impl"
    // InternalXtext.g:6895:1: rule__PredicatedRuleCall__Group__2__Impl : ( ( rule__PredicatedRuleCall__Group_2__0 )? ) ;
    public final void rule__PredicatedRuleCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6899:1: ( ( ( rule__PredicatedRuleCall__Group_2__0 )? ) )
            // InternalXtext.g:6900:1: ( ( rule__PredicatedRuleCall__Group_2__0 )? )
            {
            // InternalXtext.g:6900:1: ( ( rule__PredicatedRuleCall__Group_2__0 )? )
            // InternalXtext.g:6901:1: ( rule__PredicatedRuleCall__Group_2__0 )?
            {
             before(grammarAccess.getPredicatedRuleCallAccess().getGroup_2()); 
            // InternalXtext.g:6902:1: ( rule__PredicatedRuleCall__Group_2__0 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==37) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalXtext.g:6902:2: rule__PredicatedRuleCall__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__PredicatedRuleCall__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPredicatedRuleCallAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__Group__2__Impl"


    // $ANTLR start "rule__PredicatedRuleCall__Group_2__0"
    // InternalXtext.g:6918:1: rule__PredicatedRuleCall__Group_2__0 : rule__PredicatedRuleCall__Group_2__0__Impl rule__PredicatedRuleCall__Group_2__1 ;
    public final void rule__PredicatedRuleCall__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6922:1: ( rule__PredicatedRuleCall__Group_2__0__Impl rule__PredicatedRuleCall__Group_2__1 )
            // InternalXtext.g:6923:2: rule__PredicatedRuleCall__Group_2__0__Impl rule__PredicatedRuleCall__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__PredicatedRuleCall__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedRuleCall__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__Group_2__0"


    // $ANTLR start "rule__PredicatedRuleCall__Group_2__0__Impl"
    // InternalXtext.g:6930:1: rule__PredicatedRuleCall__Group_2__0__Impl : ( '<' ) ;
    public final void rule__PredicatedRuleCall__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6934:1: ( ( '<' ) )
            // InternalXtext.g:6935:1: ( '<' )
            {
            // InternalXtext.g:6935:1: ( '<' )
            // InternalXtext.g:6936:1: '<'
            {
             before(grammarAccess.getPredicatedRuleCallAccess().getLessThanSignKeyword_2_0()); 
            match(input,37,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPredicatedRuleCallAccess().getLessThanSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__Group_2__0__Impl"


    // $ANTLR start "rule__PredicatedRuleCall__Group_2__1"
    // InternalXtext.g:6949:1: rule__PredicatedRuleCall__Group_2__1 : rule__PredicatedRuleCall__Group_2__1__Impl rule__PredicatedRuleCall__Group_2__2 ;
    public final void rule__PredicatedRuleCall__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6953:1: ( rule__PredicatedRuleCall__Group_2__1__Impl rule__PredicatedRuleCall__Group_2__2 )
            // InternalXtext.g:6954:2: rule__PredicatedRuleCall__Group_2__1__Impl rule__PredicatedRuleCall__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__PredicatedRuleCall__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedRuleCall__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__Group_2__1"


    // $ANTLR start "rule__PredicatedRuleCall__Group_2__1__Impl"
    // InternalXtext.g:6961:1: rule__PredicatedRuleCall__Group_2__1__Impl : ( ( rule__PredicatedRuleCall__ArgumentsAssignment_2_1 ) ) ;
    public final void rule__PredicatedRuleCall__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6965:1: ( ( ( rule__PredicatedRuleCall__ArgumentsAssignment_2_1 ) ) )
            // InternalXtext.g:6966:1: ( ( rule__PredicatedRuleCall__ArgumentsAssignment_2_1 ) )
            {
            // InternalXtext.g:6966:1: ( ( rule__PredicatedRuleCall__ArgumentsAssignment_2_1 ) )
            // InternalXtext.g:6967:1: ( rule__PredicatedRuleCall__ArgumentsAssignment_2_1 )
            {
             before(grammarAccess.getPredicatedRuleCallAccess().getArgumentsAssignment_2_1()); 
            // InternalXtext.g:6968:1: ( rule__PredicatedRuleCall__ArgumentsAssignment_2_1 )
            // InternalXtext.g:6968:2: rule__PredicatedRuleCall__ArgumentsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedRuleCall__ArgumentsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPredicatedRuleCallAccess().getArgumentsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__Group_2__1__Impl"


    // $ANTLR start "rule__PredicatedRuleCall__Group_2__2"
    // InternalXtext.g:6978:1: rule__PredicatedRuleCall__Group_2__2 : rule__PredicatedRuleCall__Group_2__2__Impl rule__PredicatedRuleCall__Group_2__3 ;
    public final void rule__PredicatedRuleCall__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6982:1: ( rule__PredicatedRuleCall__Group_2__2__Impl rule__PredicatedRuleCall__Group_2__3 )
            // InternalXtext.g:6983:2: rule__PredicatedRuleCall__Group_2__2__Impl rule__PredicatedRuleCall__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__PredicatedRuleCall__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedRuleCall__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__Group_2__2"


    // $ANTLR start "rule__PredicatedRuleCall__Group_2__2__Impl"
    // InternalXtext.g:6990:1: rule__PredicatedRuleCall__Group_2__2__Impl : ( ( rule__PredicatedRuleCall__Group_2_2__0 )* ) ;
    public final void rule__PredicatedRuleCall__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:6994:1: ( ( ( rule__PredicatedRuleCall__Group_2_2__0 )* ) )
            // InternalXtext.g:6995:1: ( ( rule__PredicatedRuleCall__Group_2_2__0 )* )
            {
            // InternalXtext.g:6995:1: ( ( rule__PredicatedRuleCall__Group_2_2__0 )* )
            // InternalXtext.g:6996:1: ( rule__PredicatedRuleCall__Group_2_2__0 )*
            {
             before(grammarAccess.getPredicatedRuleCallAccess().getGroup_2_2()); 
            // InternalXtext.g:6997:1: ( rule__PredicatedRuleCall__Group_2_2__0 )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==25) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalXtext.g:6997:2: rule__PredicatedRuleCall__Group_2_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    rule__PredicatedRuleCall__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

             after(grammarAccess.getPredicatedRuleCallAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__Group_2__2__Impl"


    // $ANTLR start "rule__PredicatedRuleCall__Group_2__3"
    // InternalXtext.g:7007:1: rule__PredicatedRuleCall__Group_2__3 : rule__PredicatedRuleCall__Group_2__3__Impl ;
    public final void rule__PredicatedRuleCall__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7011:1: ( rule__PredicatedRuleCall__Group_2__3__Impl )
            // InternalXtext.g:7012:2: rule__PredicatedRuleCall__Group_2__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedRuleCall__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__Group_2__3"


    // $ANTLR start "rule__PredicatedRuleCall__Group_2__3__Impl"
    // InternalXtext.g:7018:1: rule__PredicatedRuleCall__Group_2__3__Impl : ( '>' ) ;
    public final void rule__PredicatedRuleCall__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7022:1: ( ( '>' ) )
            // InternalXtext.g:7023:1: ( '>' )
            {
            // InternalXtext.g:7023:1: ( '>' )
            // InternalXtext.g:7024:1: '>'
            {
             before(grammarAccess.getPredicatedRuleCallAccess().getGreaterThanSignKeyword_2_3()); 
            match(input,38,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPredicatedRuleCallAccess().getGreaterThanSignKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__Group_2__3__Impl"


    // $ANTLR start "rule__PredicatedRuleCall__Group_2_2__0"
    // InternalXtext.g:7045:1: rule__PredicatedRuleCall__Group_2_2__0 : rule__PredicatedRuleCall__Group_2_2__0__Impl rule__PredicatedRuleCall__Group_2_2__1 ;
    public final void rule__PredicatedRuleCall__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7049:1: ( rule__PredicatedRuleCall__Group_2_2__0__Impl rule__PredicatedRuleCall__Group_2_2__1 )
            // InternalXtext.g:7050:2: rule__PredicatedRuleCall__Group_2_2__0__Impl rule__PredicatedRuleCall__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__PredicatedRuleCall__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedRuleCall__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__Group_2_2__0"


    // $ANTLR start "rule__PredicatedRuleCall__Group_2_2__0__Impl"
    // InternalXtext.g:7057:1: rule__PredicatedRuleCall__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__PredicatedRuleCall__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7061:1: ( ( ',' ) )
            // InternalXtext.g:7062:1: ( ',' )
            {
            // InternalXtext.g:7062:1: ( ',' )
            // InternalXtext.g:7063:1: ','
            {
             before(grammarAccess.getPredicatedRuleCallAccess().getCommaKeyword_2_2_0()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPredicatedRuleCallAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__Group_2_2__0__Impl"


    // $ANTLR start "rule__PredicatedRuleCall__Group_2_2__1"
    // InternalXtext.g:7076:1: rule__PredicatedRuleCall__Group_2_2__1 : rule__PredicatedRuleCall__Group_2_2__1__Impl ;
    public final void rule__PredicatedRuleCall__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7080:1: ( rule__PredicatedRuleCall__Group_2_2__1__Impl )
            // InternalXtext.g:7081:2: rule__PredicatedRuleCall__Group_2_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedRuleCall__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__Group_2_2__1"


    // $ANTLR start "rule__PredicatedRuleCall__Group_2_2__1__Impl"
    // InternalXtext.g:7087:1: rule__PredicatedRuleCall__Group_2_2__1__Impl : ( ( rule__PredicatedRuleCall__ArgumentsAssignment_2_2_1 ) ) ;
    public final void rule__PredicatedRuleCall__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7091:1: ( ( ( rule__PredicatedRuleCall__ArgumentsAssignment_2_2_1 ) ) )
            // InternalXtext.g:7092:1: ( ( rule__PredicatedRuleCall__ArgumentsAssignment_2_2_1 ) )
            {
            // InternalXtext.g:7092:1: ( ( rule__PredicatedRuleCall__ArgumentsAssignment_2_2_1 ) )
            // InternalXtext.g:7093:1: ( rule__PredicatedRuleCall__ArgumentsAssignment_2_2_1 )
            {
             before(grammarAccess.getPredicatedRuleCallAccess().getArgumentsAssignment_2_2_1()); 
            // InternalXtext.g:7094:1: ( rule__PredicatedRuleCall__ArgumentsAssignment_2_2_1 )
            // InternalXtext.g:7094:2: rule__PredicatedRuleCall__ArgumentsAssignment_2_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedRuleCall__ArgumentsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPredicatedRuleCallAccess().getArgumentsAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__Group_2_2__1__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // InternalXtext.g:7108:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7112:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalXtext.g:7113:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_44);
            rule__Assignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // InternalXtext.g:7120:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__Alternatives_0 )? ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7124:1: ( ( ( rule__Assignment__Alternatives_0 )? ) )
            // InternalXtext.g:7125:1: ( ( rule__Assignment__Alternatives_0 )? )
            {
            // InternalXtext.g:7125:1: ( ( rule__Assignment__Alternatives_0 )? )
            // InternalXtext.g:7126:1: ( rule__Assignment__Alternatives_0 )?
            {
             before(grammarAccess.getAssignmentAccess().getAlternatives_0()); 
            // InternalXtext.g:7127:1: ( rule__Assignment__Alternatives_0 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==47||LA66_0==53) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalXtext.g:7127:2: rule__Assignment__Alternatives_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Assignment__Alternatives_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssignmentAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // InternalXtext.g:7137:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7141:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalXtext.g:7142:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_45);
            rule__Assignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // InternalXtext.g:7149:1: rule__Assignment__Group__1__Impl : ( ( rule__Assignment__FeatureAssignment_1 ) ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7153:1: ( ( ( rule__Assignment__FeatureAssignment_1 ) ) )
            // InternalXtext.g:7154:1: ( ( rule__Assignment__FeatureAssignment_1 ) )
            {
            // InternalXtext.g:7154:1: ( ( rule__Assignment__FeatureAssignment_1 ) )
            // InternalXtext.g:7155:1: ( rule__Assignment__FeatureAssignment_1 )
            {
             before(grammarAccess.getAssignmentAccess().getFeatureAssignment_1()); 
            // InternalXtext.g:7156:1: ( rule__Assignment__FeatureAssignment_1 )
            // InternalXtext.g:7156:2: rule__Assignment__FeatureAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__FeatureAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getFeatureAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__2"
    // InternalXtext.g:7166:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl rule__Assignment__Group__3 ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7170:1: ( rule__Assignment__Group__2__Impl rule__Assignment__Group__3 )
            // InternalXtext.g:7171:2: rule__Assignment__Group__2__Impl rule__Assignment__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_46);
            rule__Assignment__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2"


    // $ANTLR start "rule__Assignment__Group__2__Impl"
    // InternalXtext.g:7178:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__OperatorAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7182:1: ( ( ( rule__Assignment__OperatorAssignment_2 ) ) )
            // InternalXtext.g:7183:1: ( ( rule__Assignment__OperatorAssignment_2 ) )
            {
            // InternalXtext.g:7183:1: ( ( rule__Assignment__OperatorAssignment_2 ) )
            // InternalXtext.g:7184:1: ( rule__Assignment__OperatorAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getOperatorAssignment_2()); 
            // InternalXtext.g:7185:1: ( rule__Assignment__OperatorAssignment_2 )
            // InternalXtext.g:7185:2: rule__Assignment__OperatorAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__OperatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getOperatorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2__Impl"


    // $ANTLR start "rule__Assignment__Group__3"
    // InternalXtext.g:7195:1: rule__Assignment__Group__3 : rule__Assignment__Group__3__Impl ;
    public final void rule__Assignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7199:1: ( rule__Assignment__Group__3__Impl )
            // InternalXtext.g:7200:2: rule__Assignment__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__3"


    // $ANTLR start "rule__Assignment__Group__3__Impl"
    // InternalXtext.g:7206:1: rule__Assignment__Group__3__Impl : ( ( rule__Assignment__TerminalAssignment_3 ) ) ;
    public final void rule__Assignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7210:1: ( ( ( rule__Assignment__TerminalAssignment_3 ) ) )
            // InternalXtext.g:7211:1: ( ( rule__Assignment__TerminalAssignment_3 ) )
            {
            // InternalXtext.g:7211:1: ( ( rule__Assignment__TerminalAssignment_3 ) )
            // InternalXtext.g:7212:1: ( rule__Assignment__TerminalAssignment_3 )
            {
             before(grammarAccess.getAssignmentAccess().getTerminalAssignment_3()); 
            // InternalXtext.g:7213:1: ( rule__Assignment__TerminalAssignment_3 )
            // InternalXtext.g:7213:2: rule__Assignment__TerminalAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__TerminalAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getTerminalAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__3__Impl"


    // $ANTLR start "rule__ParenthesizedAssignableElement__Group__0"
    // InternalXtext.g:7231:1: rule__ParenthesizedAssignableElement__Group__0 : rule__ParenthesizedAssignableElement__Group__0__Impl rule__ParenthesizedAssignableElement__Group__1 ;
    public final void rule__ParenthesizedAssignableElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7235:1: ( rule__ParenthesizedAssignableElement__Group__0__Impl rule__ParenthesizedAssignableElement__Group__1 )
            // InternalXtext.g:7236:2: rule__ParenthesizedAssignableElement__Group__0__Impl rule__ParenthesizedAssignableElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_46);
            rule__ParenthesizedAssignableElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedAssignableElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedAssignableElement__Group__0"


    // $ANTLR start "rule__ParenthesizedAssignableElement__Group__0__Impl"
    // InternalXtext.g:7243:1: rule__ParenthesizedAssignableElement__Group__0__Impl : ( '(' ) ;
    public final void rule__ParenthesizedAssignableElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7247:1: ( ( '(' ) )
            // InternalXtext.g:7248:1: ( '(' )
            {
            // InternalXtext.g:7248:1: ( '(' )
            // InternalXtext.g:7249:1: '('
            {
             before(grammarAccess.getParenthesizedAssignableElementAccess().getLeftParenthesisKeyword_0()); 
            match(input,26,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParenthesizedAssignableElementAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedAssignableElement__Group__0__Impl"


    // $ANTLR start "rule__ParenthesizedAssignableElement__Group__1"
    // InternalXtext.g:7262:1: rule__ParenthesizedAssignableElement__Group__1 : rule__ParenthesizedAssignableElement__Group__1__Impl rule__ParenthesizedAssignableElement__Group__2 ;
    public final void rule__ParenthesizedAssignableElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7266:1: ( rule__ParenthesizedAssignableElement__Group__1__Impl rule__ParenthesizedAssignableElement__Group__2 )
            // InternalXtext.g:7267:2: rule__ParenthesizedAssignableElement__Group__1__Impl rule__ParenthesizedAssignableElement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_42);
            rule__ParenthesizedAssignableElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedAssignableElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedAssignableElement__Group__1"


    // $ANTLR start "rule__ParenthesizedAssignableElement__Group__1__Impl"
    // InternalXtext.g:7274:1: rule__ParenthesizedAssignableElement__Group__1__Impl : ( ruleAssignableAlternatives ) ;
    public final void rule__ParenthesizedAssignableElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7278:1: ( ( ruleAssignableAlternatives ) )
            // InternalXtext.g:7279:1: ( ruleAssignableAlternatives )
            {
            // InternalXtext.g:7279:1: ( ruleAssignableAlternatives )
            // InternalXtext.g:7280:1: ruleAssignableAlternatives
            {
             before(grammarAccess.getParenthesizedAssignableElementAccess().getAssignableAlternativesParserRuleCall_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAssignableAlternatives();

            state._fsp--;

             after(grammarAccess.getParenthesizedAssignableElementAccess().getAssignableAlternativesParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedAssignableElement__Group__1__Impl"


    // $ANTLR start "rule__ParenthesizedAssignableElement__Group__2"
    // InternalXtext.g:7291:1: rule__ParenthesizedAssignableElement__Group__2 : rule__ParenthesizedAssignableElement__Group__2__Impl ;
    public final void rule__ParenthesizedAssignableElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7295:1: ( rule__ParenthesizedAssignableElement__Group__2__Impl )
            // InternalXtext.g:7296:2: rule__ParenthesizedAssignableElement__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedAssignableElement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedAssignableElement__Group__2"


    // $ANTLR start "rule__ParenthesizedAssignableElement__Group__2__Impl"
    // InternalXtext.g:7302:1: rule__ParenthesizedAssignableElement__Group__2__Impl : ( ')' ) ;
    public final void rule__ParenthesizedAssignableElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7306:1: ( ( ')' ) )
            // InternalXtext.g:7307:1: ( ')' )
            {
            // InternalXtext.g:7307:1: ( ')' )
            // InternalXtext.g:7308:1: ')'
            {
             before(grammarAccess.getParenthesizedAssignableElementAccess().getRightParenthesisKeyword_2()); 
            match(input,27,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParenthesizedAssignableElementAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedAssignableElement__Group__2__Impl"


    // $ANTLR start "rule__AssignableAlternatives__Group__0"
    // InternalXtext.g:7327:1: rule__AssignableAlternatives__Group__0 : rule__AssignableAlternatives__Group__0__Impl rule__AssignableAlternatives__Group__1 ;
    public final void rule__AssignableAlternatives__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7331:1: ( rule__AssignableAlternatives__Group__0__Impl rule__AssignableAlternatives__Group__1 )
            // InternalXtext.g:7332:2: rule__AssignableAlternatives__Group__0__Impl rule__AssignableAlternatives__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__AssignableAlternatives__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssignableAlternatives__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignableAlternatives__Group__0"


    // $ANTLR start "rule__AssignableAlternatives__Group__0__Impl"
    // InternalXtext.g:7339:1: rule__AssignableAlternatives__Group__0__Impl : ( ruleAssignableTerminal ) ;
    public final void rule__AssignableAlternatives__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7343:1: ( ( ruleAssignableTerminal ) )
            // InternalXtext.g:7344:1: ( ruleAssignableTerminal )
            {
            // InternalXtext.g:7344:1: ( ruleAssignableTerminal )
            // InternalXtext.g:7345:1: ruleAssignableTerminal
            {
             before(grammarAccess.getAssignableAlternativesAccess().getAssignableTerminalParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAssignableTerminal();

            state._fsp--;

             after(grammarAccess.getAssignableAlternativesAccess().getAssignableTerminalParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignableAlternatives__Group__0__Impl"


    // $ANTLR start "rule__AssignableAlternatives__Group__1"
    // InternalXtext.g:7356:1: rule__AssignableAlternatives__Group__1 : rule__AssignableAlternatives__Group__1__Impl ;
    public final void rule__AssignableAlternatives__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7360:1: ( rule__AssignableAlternatives__Group__1__Impl )
            // InternalXtext.g:7361:2: rule__AssignableAlternatives__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssignableAlternatives__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignableAlternatives__Group__1"


    // $ANTLR start "rule__AssignableAlternatives__Group__1__Impl"
    // InternalXtext.g:7367:1: rule__AssignableAlternatives__Group__1__Impl : ( ( rule__AssignableAlternatives__Group_1__0 )? ) ;
    public final void rule__AssignableAlternatives__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7371:1: ( ( ( rule__AssignableAlternatives__Group_1__0 )? ) )
            // InternalXtext.g:7372:1: ( ( rule__AssignableAlternatives__Group_1__0 )? )
            {
            // InternalXtext.g:7372:1: ( ( rule__AssignableAlternatives__Group_1__0 )? )
            // InternalXtext.g:7373:1: ( rule__AssignableAlternatives__Group_1__0 )?
            {
             before(grammarAccess.getAssignableAlternativesAccess().getGroup_1()); 
            // InternalXtext.g:7374:1: ( rule__AssignableAlternatives__Group_1__0 )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==40) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalXtext.g:7374:2: rule__AssignableAlternatives__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__AssignableAlternatives__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssignableAlternativesAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignableAlternatives__Group__1__Impl"


    // $ANTLR start "rule__AssignableAlternatives__Group_1__0"
    // InternalXtext.g:7388:1: rule__AssignableAlternatives__Group_1__0 : rule__AssignableAlternatives__Group_1__0__Impl rule__AssignableAlternatives__Group_1__1 ;
    public final void rule__AssignableAlternatives__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7392:1: ( rule__AssignableAlternatives__Group_1__0__Impl rule__AssignableAlternatives__Group_1__1 )
            // InternalXtext.g:7393:2: rule__AssignableAlternatives__Group_1__0__Impl rule__AssignableAlternatives__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__AssignableAlternatives__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssignableAlternatives__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignableAlternatives__Group_1__0"


    // $ANTLR start "rule__AssignableAlternatives__Group_1__0__Impl"
    // InternalXtext.g:7400:1: rule__AssignableAlternatives__Group_1__0__Impl : ( () ) ;
    public final void rule__AssignableAlternatives__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7404:1: ( ( () ) )
            // InternalXtext.g:7405:1: ( () )
            {
            // InternalXtext.g:7405:1: ( () )
            // InternalXtext.g:7406:1: ()
            {
             before(grammarAccess.getAssignableAlternativesAccess().getAlternativesElementsAction_1_0()); 
            // InternalXtext.g:7407:1: ()
            // InternalXtext.g:7409:1: 
            {
            }

             after(grammarAccess.getAssignableAlternativesAccess().getAlternativesElementsAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignableAlternatives__Group_1__0__Impl"


    // $ANTLR start "rule__AssignableAlternatives__Group_1__1"
    // InternalXtext.g:7419:1: rule__AssignableAlternatives__Group_1__1 : rule__AssignableAlternatives__Group_1__1__Impl ;
    public final void rule__AssignableAlternatives__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7423:1: ( rule__AssignableAlternatives__Group_1__1__Impl )
            // InternalXtext.g:7424:2: rule__AssignableAlternatives__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssignableAlternatives__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignableAlternatives__Group_1__1"


    // $ANTLR start "rule__AssignableAlternatives__Group_1__1__Impl"
    // InternalXtext.g:7430:1: rule__AssignableAlternatives__Group_1__1__Impl : ( ( ( rule__AssignableAlternatives__Group_1_1__0 ) ) ( ( rule__AssignableAlternatives__Group_1_1__0 )* ) ) ;
    public final void rule__AssignableAlternatives__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7434:1: ( ( ( ( rule__AssignableAlternatives__Group_1_1__0 ) ) ( ( rule__AssignableAlternatives__Group_1_1__0 )* ) ) )
            // InternalXtext.g:7435:1: ( ( ( rule__AssignableAlternatives__Group_1_1__0 ) ) ( ( rule__AssignableAlternatives__Group_1_1__0 )* ) )
            {
            // InternalXtext.g:7435:1: ( ( ( rule__AssignableAlternatives__Group_1_1__0 ) ) ( ( rule__AssignableAlternatives__Group_1_1__0 )* ) )
            // InternalXtext.g:7436:1: ( ( rule__AssignableAlternatives__Group_1_1__0 ) ) ( ( rule__AssignableAlternatives__Group_1_1__0 )* )
            {
            // InternalXtext.g:7436:1: ( ( rule__AssignableAlternatives__Group_1_1__0 ) )
            // InternalXtext.g:7437:1: ( rule__AssignableAlternatives__Group_1_1__0 )
            {
             before(grammarAccess.getAssignableAlternativesAccess().getGroup_1_1()); 
            // InternalXtext.g:7438:1: ( rule__AssignableAlternatives__Group_1_1__0 )
            // InternalXtext.g:7438:2: rule__AssignableAlternatives__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_28);
            rule__AssignableAlternatives__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignableAlternativesAccess().getGroup_1_1()); 

            }

            // InternalXtext.g:7441:1: ( ( rule__AssignableAlternatives__Group_1_1__0 )* )
            // InternalXtext.g:7442:1: ( rule__AssignableAlternatives__Group_1_1__0 )*
            {
             before(grammarAccess.getAssignableAlternativesAccess().getGroup_1_1()); 
            // InternalXtext.g:7443:1: ( rule__AssignableAlternatives__Group_1_1__0 )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==40) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalXtext.g:7443:2: rule__AssignableAlternatives__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__AssignableAlternatives__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

             after(grammarAccess.getAssignableAlternativesAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__AssignableAlternatives__Group_1__1__Impl"


    // $ANTLR start "rule__AssignableAlternatives__Group_1_1__0"
    // InternalXtext.g:7458:1: rule__AssignableAlternatives__Group_1_1__0 : rule__AssignableAlternatives__Group_1_1__0__Impl rule__AssignableAlternatives__Group_1_1__1 ;
    public final void rule__AssignableAlternatives__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7462:1: ( rule__AssignableAlternatives__Group_1_1__0__Impl rule__AssignableAlternatives__Group_1_1__1 )
            // InternalXtext.g:7463:2: rule__AssignableAlternatives__Group_1_1__0__Impl rule__AssignableAlternatives__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_46);
            rule__AssignableAlternatives__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssignableAlternatives__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignableAlternatives__Group_1_1__0"


    // $ANTLR start "rule__AssignableAlternatives__Group_1_1__0__Impl"
    // InternalXtext.g:7470:1: rule__AssignableAlternatives__Group_1_1__0__Impl : ( '|' ) ;
    public final void rule__AssignableAlternatives__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7474:1: ( ( '|' ) )
            // InternalXtext.g:7475:1: ( '|' )
            {
            // InternalXtext.g:7475:1: ( '|' )
            // InternalXtext.g:7476:1: '|'
            {
             before(grammarAccess.getAssignableAlternativesAccess().getVerticalLineKeyword_1_1_0()); 
            match(input,40,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAssignableAlternativesAccess().getVerticalLineKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignableAlternatives__Group_1_1__0__Impl"


    // $ANTLR start "rule__AssignableAlternatives__Group_1_1__1"
    // InternalXtext.g:7489:1: rule__AssignableAlternatives__Group_1_1__1 : rule__AssignableAlternatives__Group_1_1__1__Impl ;
    public final void rule__AssignableAlternatives__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7493:1: ( rule__AssignableAlternatives__Group_1_1__1__Impl )
            // InternalXtext.g:7494:2: rule__AssignableAlternatives__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssignableAlternatives__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignableAlternatives__Group_1_1__1"


    // $ANTLR start "rule__AssignableAlternatives__Group_1_1__1__Impl"
    // InternalXtext.g:7500:1: rule__AssignableAlternatives__Group_1_1__1__Impl : ( ( rule__AssignableAlternatives__ElementsAssignment_1_1_1 ) ) ;
    public final void rule__AssignableAlternatives__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7504:1: ( ( ( rule__AssignableAlternatives__ElementsAssignment_1_1_1 ) ) )
            // InternalXtext.g:7505:1: ( ( rule__AssignableAlternatives__ElementsAssignment_1_1_1 ) )
            {
            // InternalXtext.g:7505:1: ( ( rule__AssignableAlternatives__ElementsAssignment_1_1_1 ) )
            // InternalXtext.g:7506:1: ( rule__AssignableAlternatives__ElementsAssignment_1_1_1 )
            {
             before(grammarAccess.getAssignableAlternativesAccess().getElementsAssignment_1_1_1()); 
            // InternalXtext.g:7507:1: ( rule__AssignableAlternatives__ElementsAssignment_1_1_1 )
            // InternalXtext.g:7507:2: rule__AssignableAlternatives__ElementsAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssignableAlternatives__ElementsAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAssignableAlternativesAccess().getElementsAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignableAlternatives__Group_1_1__1__Impl"


    // $ANTLR start "rule__CrossReference__Group__0"
    // InternalXtext.g:7521:1: rule__CrossReference__Group__0 : rule__CrossReference__Group__0__Impl rule__CrossReference__Group__1 ;
    public final void rule__CrossReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7525:1: ( rule__CrossReference__Group__0__Impl rule__CrossReference__Group__1 )
            // InternalXtext.g:7526:2: rule__CrossReference__Group__0__Impl rule__CrossReference__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__CrossReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__CrossReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossReference__Group__0"


    // $ANTLR start "rule__CrossReference__Group__0__Impl"
    // InternalXtext.g:7533:1: rule__CrossReference__Group__0__Impl : ( '[' ) ;
    public final void rule__CrossReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7537:1: ( ( '[' ) )
            // InternalXtext.g:7538:1: ( '[' )
            {
            // InternalXtext.g:7538:1: ( '[' )
            // InternalXtext.g:7539:1: '['
            {
             before(grammarAccess.getCrossReferenceAccess().getLeftSquareBracketKeyword_0()); 
            match(input,44,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getCrossReferenceAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossReference__Group__0__Impl"


    // $ANTLR start "rule__CrossReference__Group__1"
    // InternalXtext.g:7552:1: rule__CrossReference__Group__1 : rule__CrossReference__Group__1__Impl rule__CrossReference__Group__2 ;
    public final void rule__CrossReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7556:1: ( rule__CrossReference__Group__1__Impl rule__CrossReference__Group__2 )
            // InternalXtext.g:7557:2: rule__CrossReference__Group__1__Impl rule__CrossReference__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_47);
            rule__CrossReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__CrossReference__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossReference__Group__1"


    // $ANTLR start "rule__CrossReference__Group__1__Impl"
    // InternalXtext.g:7564:1: rule__CrossReference__Group__1__Impl : ( ( rule__CrossReference__TypeAssignment_1 ) ) ;
    public final void rule__CrossReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7568:1: ( ( ( rule__CrossReference__TypeAssignment_1 ) ) )
            // InternalXtext.g:7569:1: ( ( rule__CrossReference__TypeAssignment_1 ) )
            {
            // InternalXtext.g:7569:1: ( ( rule__CrossReference__TypeAssignment_1 ) )
            // InternalXtext.g:7570:1: ( rule__CrossReference__TypeAssignment_1 )
            {
             before(grammarAccess.getCrossReferenceAccess().getTypeAssignment_1()); 
            // InternalXtext.g:7571:1: ( rule__CrossReference__TypeAssignment_1 )
            // InternalXtext.g:7571:2: rule__CrossReference__TypeAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CrossReference__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCrossReferenceAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossReference__Group__1__Impl"


    // $ANTLR start "rule__CrossReference__Group__2"
    // InternalXtext.g:7581:1: rule__CrossReference__Group__2 : rule__CrossReference__Group__2__Impl rule__CrossReference__Group__3 ;
    public final void rule__CrossReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7585:1: ( rule__CrossReference__Group__2__Impl rule__CrossReference__Group__3 )
            // InternalXtext.g:7586:2: rule__CrossReference__Group__2__Impl rule__CrossReference__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_47);
            rule__CrossReference__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__CrossReference__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossReference__Group__2"


    // $ANTLR start "rule__CrossReference__Group__2__Impl"
    // InternalXtext.g:7593:1: rule__CrossReference__Group__2__Impl : ( ( rule__CrossReference__Group_2__0 )? ) ;
    public final void rule__CrossReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7597:1: ( ( ( rule__CrossReference__Group_2__0 )? ) )
            // InternalXtext.g:7598:1: ( ( rule__CrossReference__Group_2__0 )? )
            {
            // InternalXtext.g:7598:1: ( ( rule__CrossReference__Group_2__0 )? )
            // InternalXtext.g:7599:1: ( rule__CrossReference__Group_2__0 )?
            {
             before(grammarAccess.getCrossReferenceAccess().getGroup_2()); 
            // InternalXtext.g:7600:1: ( rule__CrossReference__Group_2__0 )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==40) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalXtext.g:7600:2: rule__CrossReference__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__CrossReference__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCrossReferenceAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossReference__Group__2__Impl"


    // $ANTLR start "rule__CrossReference__Group__3"
    // InternalXtext.g:7610:1: rule__CrossReference__Group__3 : rule__CrossReference__Group__3__Impl ;
    public final void rule__CrossReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7614:1: ( rule__CrossReference__Group__3__Impl )
            // InternalXtext.g:7615:2: rule__CrossReference__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CrossReference__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossReference__Group__3"


    // $ANTLR start "rule__CrossReference__Group__3__Impl"
    // InternalXtext.g:7621:1: rule__CrossReference__Group__3__Impl : ( ']' ) ;
    public final void rule__CrossReference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7625:1: ( ( ']' ) )
            // InternalXtext.g:7626:1: ( ']' )
            {
            // InternalXtext.g:7626:1: ( ']' )
            // InternalXtext.g:7627:1: ']'
            {
             before(grammarAccess.getCrossReferenceAccess().getRightSquareBracketKeyword_3()); 
            match(input,45,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getCrossReferenceAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossReference__Group__3__Impl"


    // $ANTLR start "rule__CrossReference__Group_2__0"
    // InternalXtext.g:7648:1: rule__CrossReference__Group_2__0 : rule__CrossReference__Group_2__0__Impl rule__CrossReference__Group_2__1 ;
    public final void rule__CrossReference__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7652:1: ( rule__CrossReference__Group_2__0__Impl rule__CrossReference__Group_2__1 )
            // InternalXtext.g:7653:2: rule__CrossReference__Group_2__0__Impl rule__CrossReference__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_48);
            rule__CrossReference__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__CrossReference__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossReference__Group_2__0"


    // $ANTLR start "rule__CrossReference__Group_2__0__Impl"
    // InternalXtext.g:7660:1: rule__CrossReference__Group_2__0__Impl : ( '|' ) ;
    public final void rule__CrossReference__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7664:1: ( ( '|' ) )
            // InternalXtext.g:7665:1: ( '|' )
            {
            // InternalXtext.g:7665:1: ( '|' )
            // InternalXtext.g:7666:1: '|'
            {
             before(grammarAccess.getCrossReferenceAccess().getVerticalLineKeyword_2_0()); 
            match(input,40,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getCrossReferenceAccess().getVerticalLineKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossReference__Group_2__0__Impl"


    // $ANTLR start "rule__CrossReference__Group_2__1"
    // InternalXtext.g:7679:1: rule__CrossReference__Group_2__1 : rule__CrossReference__Group_2__1__Impl ;
    public final void rule__CrossReference__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7683:1: ( rule__CrossReference__Group_2__1__Impl )
            // InternalXtext.g:7684:2: rule__CrossReference__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CrossReference__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossReference__Group_2__1"


    // $ANTLR start "rule__CrossReference__Group_2__1__Impl"
    // InternalXtext.g:7690:1: rule__CrossReference__Group_2__1__Impl : ( ( rule__CrossReference__TerminalAssignment_2_1 ) ) ;
    public final void rule__CrossReference__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7694:1: ( ( ( rule__CrossReference__TerminalAssignment_2_1 ) ) )
            // InternalXtext.g:7695:1: ( ( rule__CrossReference__TerminalAssignment_2_1 ) )
            {
            // InternalXtext.g:7695:1: ( ( rule__CrossReference__TerminalAssignment_2_1 ) )
            // InternalXtext.g:7696:1: ( rule__CrossReference__TerminalAssignment_2_1 )
            {
             before(grammarAccess.getCrossReferenceAccess().getTerminalAssignment_2_1()); 
            // InternalXtext.g:7697:1: ( rule__CrossReference__TerminalAssignment_2_1 )
            // InternalXtext.g:7697:2: rule__CrossReference__TerminalAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CrossReference__TerminalAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCrossReferenceAccess().getTerminalAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossReference__Group_2__1__Impl"


    // $ANTLR start "rule__ParenthesizedElement__Group__0"
    // InternalXtext.g:7711:1: rule__ParenthesizedElement__Group__0 : rule__ParenthesizedElement__Group__0__Impl rule__ParenthesizedElement__Group__1 ;
    public final void rule__ParenthesizedElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7715:1: ( rule__ParenthesizedElement__Group__0__Impl rule__ParenthesizedElement__Group__1 )
            // InternalXtext.g:7716:2: rule__ParenthesizedElement__Group__0__Impl rule__ParenthesizedElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__ParenthesizedElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedElement__Group__0"


    // $ANTLR start "rule__ParenthesizedElement__Group__0__Impl"
    // InternalXtext.g:7723:1: rule__ParenthesizedElement__Group__0__Impl : ( '(' ) ;
    public final void rule__ParenthesizedElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7727:1: ( ( '(' ) )
            // InternalXtext.g:7728:1: ( '(' )
            {
            // InternalXtext.g:7728:1: ( '(' )
            // InternalXtext.g:7729:1: '('
            {
             before(grammarAccess.getParenthesizedElementAccess().getLeftParenthesisKeyword_0()); 
            match(input,26,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParenthesizedElementAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedElement__Group__0__Impl"


    // $ANTLR start "rule__ParenthesizedElement__Group__1"
    // InternalXtext.g:7742:1: rule__ParenthesizedElement__Group__1 : rule__ParenthesizedElement__Group__1__Impl rule__ParenthesizedElement__Group__2 ;
    public final void rule__ParenthesizedElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7746:1: ( rule__ParenthesizedElement__Group__1__Impl rule__ParenthesizedElement__Group__2 )
            // InternalXtext.g:7747:2: rule__ParenthesizedElement__Group__1__Impl rule__ParenthesizedElement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_42);
            rule__ParenthesizedElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedElement__Group__1"


    // $ANTLR start "rule__ParenthesizedElement__Group__1__Impl"
    // InternalXtext.g:7754:1: rule__ParenthesizedElement__Group__1__Impl : ( ruleAlternatives ) ;
    public final void rule__ParenthesizedElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7758:1: ( ( ruleAlternatives ) )
            // InternalXtext.g:7759:1: ( ruleAlternatives )
            {
            // InternalXtext.g:7759:1: ( ruleAlternatives )
            // InternalXtext.g:7760:1: ruleAlternatives
            {
             before(grammarAccess.getParenthesizedElementAccess().getAlternativesParserRuleCall_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAlternatives();

            state._fsp--;

             after(grammarAccess.getParenthesizedElementAccess().getAlternativesParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedElement__Group__1__Impl"


    // $ANTLR start "rule__ParenthesizedElement__Group__2"
    // InternalXtext.g:7771:1: rule__ParenthesizedElement__Group__2 : rule__ParenthesizedElement__Group__2__Impl ;
    public final void rule__ParenthesizedElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7775:1: ( rule__ParenthesizedElement__Group__2__Impl )
            // InternalXtext.g:7776:2: rule__ParenthesizedElement__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedElement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedElement__Group__2"


    // $ANTLR start "rule__ParenthesizedElement__Group__2__Impl"
    // InternalXtext.g:7782:1: rule__ParenthesizedElement__Group__2__Impl : ( ')' ) ;
    public final void rule__ParenthesizedElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7786:1: ( ( ')' ) )
            // InternalXtext.g:7787:1: ( ')' )
            {
            // InternalXtext.g:7787:1: ( ')' )
            // InternalXtext.g:7788:1: ')'
            {
             before(grammarAccess.getParenthesizedElementAccess().getRightParenthesisKeyword_2()); 
            match(input,27,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParenthesizedElementAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedElement__Group__2__Impl"


    // $ANTLR start "rule__PredicatedGroup__Group__0"
    // InternalXtext.g:7807:1: rule__PredicatedGroup__Group__0 : rule__PredicatedGroup__Group__0__Impl rule__PredicatedGroup__Group__1 ;
    public final void rule__PredicatedGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7811:1: ( rule__PredicatedGroup__Group__0__Impl rule__PredicatedGroup__Group__1 )
            // InternalXtext.g:7812:2: rule__PredicatedGroup__Group__0__Impl rule__PredicatedGroup__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__PredicatedGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedGroup__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedGroup__Group__0"


    // $ANTLR start "rule__PredicatedGroup__Group__0__Impl"
    // InternalXtext.g:7819:1: rule__PredicatedGroup__Group__0__Impl : ( ( rule__PredicatedGroup__Alternatives_0 ) ) ;
    public final void rule__PredicatedGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7823:1: ( ( ( rule__PredicatedGroup__Alternatives_0 ) ) )
            // InternalXtext.g:7824:1: ( ( rule__PredicatedGroup__Alternatives_0 ) )
            {
            // InternalXtext.g:7824:1: ( ( rule__PredicatedGroup__Alternatives_0 ) )
            // InternalXtext.g:7825:1: ( rule__PredicatedGroup__Alternatives_0 )
            {
             before(grammarAccess.getPredicatedGroupAccess().getAlternatives_0()); 
            // InternalXtext.g:7826:1: ( rule__PredicatedGroup__Alternatives_0 )
            // InternalXtext.g:7826:2: rule__PredicatedGroup__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedGroup__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getPredicatedGroupAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedGroup__Group__0__Impl"


    // $ANTLR start "rule__PredicatedGroup__Group__1"
    // InternalXtext.g:7836:1: rule__PredicatedGroup__Group__1 : rule__PredicatedGroup__Group__1__Impl rule__PredicatedGroup__Group__2 ;
    public final void rule__PredicatedGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7840:1: ( rule__PredicatedGroup__Group__1__Impl rule__PredicatedGroup__Group__2 )
            // InternalXtext.g:7841:2: rule__PredicatedGroup__Group__1__Impl rule__PredicatedGroup__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__PredicatedGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedGroup__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedGroup__Group__1"


    // $ANTLR start "rule__PredicatedGroup__Group__1__Impl"
    // InternalXtext.g:7848:1: rule__PredicatedGroup__Group__1__Impl : ( '(' ) ;
    public final void rule__PredicatedGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7852:1: ( ( '(' ) )
            // InternalXtext.g:7853:1: ( '(' )
            {
            // InternalXtext.g:7853:1: ( '(' )
            // InternalXtext.g:7854:1: '('
            {
             before(grammarAccess.getPredicatedGroupAccess().getLeftParenthesisKeyword_1()); 
            match(input,26,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPredicatedGroupAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedGroup__Group__1__Impl"


    // $ANTLR start "rule__PredicatedGroup__Group__2"
    // InternalXtext.g:7867:1: rule__PredicatedGroup__Group__2 : rule__PredicatedGroup__Group__2__Impl rule__PredicatedGroup__Group__3 ;
    public final void rule__PredicatedGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7871:1: ( rule__PredicatedGroup__Group__2__Impl rule__PredicatedGroup__Group__3 )
            // InternalXtext.g:7872:2: rule__PredicatedGroup__Group__2__Impl rule__PredicatedGroup__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_42);
            rule__PredicatedGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedGroup__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedGroup__Group__2"


    // $ANTLR start "rule__PredicatedGroup__Group__2__Impl"
    // InternalXtext.g:7879:1: rule__PredicatedGroup__Group__2__Impl : ( ( rule__PredicatedGroup__ElementsAssignment_2 ) ) ;
    public final void rule__PredicatedGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7883:1: ( ( ( rule__PredicatedGroup__ElementsAssignment_2 ) ) )
            // InternalXtext.g:7884:1: ( ( rule__PredicatedGroup__ElementsAssignment_2 ) )
            {
            // InternalXtext.g:7884:1: ( ( rule__PredicatedGroup__ElementsAssignment_2 ) )
            // InternalXtext.g:7885:1: ( rule__PredicatedGroup__ElementsAssignment_2 )
            {
             before(grammarAccess.getPredicatedGroupAccess().getElementsAssignment_2()); 
            // InternalXtext.g:7886:1: ( rule__PredicatedGroup__ElementsAssignment_2 )
            // InternalXtext.g:7886:2: rule__PredicatedGroup__ElementsAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedGroup__ElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPredicatedGroupAccess().getElementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedGroup__Group__2__Impl"


    // $ANTLR start "rule__PredicatedGroup__Group__3"
    // InternalXtext.g:7896:1: rule__PredicatedGroup__Group__3 : rule__PredicatedGroup__Group__3__Impl ;
    public final void rule__PredicatedGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7900:1: ( rule__PredicatedGroup__Group__3__Impl )
            // InternalXtext.g:7901:2: rule__PredicatedGroup__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PredicatedGroup__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedGroup__Group__3"


    // $ANTLR start "rule__PredicatedGroup__Group__3__Impl"
    // InternalXtext.g:7907:1: rule__PredicatedGroup__Group__3__Impl : ( ')' ) ;
    public final void rule__PredicatedGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7911:1: ( ( ')' ) )
            // InternalXtext.g:7912:1: ( ')' )
            {
            // InternalXtext.g:7912:1: ( ')' )
            // InternalXtext.g:7913:1: ')'
            {
             before(grammarAccess.getPredicatedGroupAccess().getRightParenthesisKeyword_3()); 
            match(input,27,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPredicatedGroupAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedGroup__Group__3__Impl"


    // $ANTLR start "rule__TerminalRule__Group__0"
    // InternalXtext.g:7934:1: rule__TerminalRule__Group__0 : rule__TerminalRule__Group__0__Impl rule__TerminalRule__Group__1 ;
    public final void rule__TerminalRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7938:1: ( rule__TerminalRule__Group__0__Impl rule__TerminalRule__Group__1 )
            // InternalXtext.g:7939:2: rule__TerminalRule__Group__0__Impl rule__TerminalRule__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__TerminalRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group__0"


    // $ANTLR start "rule__TerminalRule__Group__0__Impl"
    // InternalXtext.g:7946:1: rule__TerminalRule__Group__0__Impl : ( 'terminal' ) ;
    public final void rule__TerminalRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7950:1: ( ( 'terminal' ) )
            // InternalXtext.g:7951:1: ( 'terminal' )
            {
            // InternalXtext.g:7951:1: ( 'terminal' )
            // InternalXtext.g:7952:1: 'terminal'
            {
             before(grammarAccess.getTerminalRuleAccess().getTerminalKeyword_0()); 
            match(input,46,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTerminalRuleAccess().getTerminalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group__0__Impl"


    // $ANTLR start "rule__TerminalRule__Group__1"
    // InternalXtext.g:7965:1: rule__TerminalRule__Group__1 : rule__TerminalRule__Group__1__Impl rule__TerminalRule__Group__2 ;
    public final void rule__TerminalRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7969:1: ( rule__TerminalRule__Group__1__Impl rule__TerminalRule__Group__2 )
            // InternalXtext.g:7970:2: rule__TerminalRule__Group__1__Impl rule__TerminalRule__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_49);
            rule__TerminalRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group__1"


    // $ANTLR start "rule__TerminalRule__Group__1__Impl"
    // InternalXtext.g:7977:1: rule__TerminalRule__Group__1__Impl : ( ( rule__TerminalRule__Alternatives_1 ) ) ;
    public final void rule__TerminalRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7981:1: ( ( ( rule__TerminalRule__Alternatives_1 ) ) )
            // InternalXtext.g:7982:1: ( ( rule__TerminalRule__Alternatives_1 ) )
            {
            // InternalXtext.g:7982:1: ( ( rule__TerminalRule__Alternatives_1 ) )
            // InternalXtext.g:7983:1: ( rule__TerminalRule__Alternatives_1 )
            {
             before(grammarAccess.getTerminalRuleAccess().getAlternatives_1()); 
            // InternalXtext.g:7984:1: ( rule__TerminalRule__Alternatives_1 )
            // InternalXtext.g:7984:2: rule__TerminalRule__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalRule__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getTerminalRuleAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group__1__Impl"


    // $ANTLR start "rule__TerminalRule__Group__2"
    // InternalXtext.g:7994:1: rule__TerminalRule__Group__2 : rule__TerminalRule__Group__2__Impl rule__TerminalRule__Group__3 ;
    public final void rule__TerminalRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:7998:1: ( rule__TerminalRule__Group__2__Impl rule__TerminalRule__Group__3 )
            // InternalXtext.g:7999:2: rule__TerminalRule__Group__2__Impl rule__TerminalRule__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_50);
            rule__TerminalRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group__2"


    // $ANTLR start "rule__TerminalRule__Group__2__Impl"
    // InternalXtext.g:8006:1: rule__TerminalRule__Group__2__Impl : ( ':' ) ;
    public final void rule__TerminalRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8010:1: ( ( ':' ) )
            // InternalXtext.g:8011:1: ( ':' )
            {
            // InternalXtext.g:8011:1: ( ':' )
            // InternalXtext.g:8012:1: ':'
            {
             before(grammarAccess.getTerminalRuleAccess().getColonKeyword_2()); 
            match(input,11,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTerminalRuleAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group__2__Impl"


    // $ANTLR start "rule__TerminalRule__Group__3"
    // InternalXtext.g:8025:1: rule__TerminalRule__Group__3 : rule__TerminalRule__Group__3__Impl rule__TerminalRule__Group__4 ;
    public final void rule__TerminalRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8029:1: ( rule__TerminalRule__Group__3__Impl rule__TerminalRule__Group__4 )
            // InternalXtext.g:8030:2: rule__TerminalRule__Group__3__Impl rule__TerminalRule__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__TerminalRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group__3"


    // $ANTLR start "rule__TerminalRule__Group__3__Impl"
    // InternalXtext.g:8037:1: rule__TerminalRule__Group__3__Impl : ( ( rule__TerminalRule__AlternativesAssignment_3 ) ) ;
    public final void rule__TerminalRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8041:1: ( ( ( rule__TerminalRule__AlternativesAssignment_3 ) ) )
            // InternalXtext.g:8042:1: ( ( rule__TerminalRule__AlternativesAssignment_3 ) )
            {
            // InternalXtext.g:8042:1: ( ( rule__TerminalRule__AlternativesAssignment_3 ) )
            // InternalXtext.g:8043:1: ( rule__TerminalRule__AlternativesAssignment_3 )
            {
             before(grammarAccess.getTerminalRuleAccess().getAlternativesAssignment_3()); 
            // InternalXtext.g:8044:1: ( rule__TerminalRule__AlternativesAssignment_3 )
            // InternalXtext.g:8044:2: rule__TerminalRule__AlternativesAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalRule__AlternativesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTerminalRuleAccess().getAlternativesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group__3__Impl"


    // $ANTLR start "rule__TerminalRule__Group__4"
    // InternalXtext.g:8054:1: rule__TerminalRule__Group__4 : rule__TerminalRule__Group__4__Impl ;
    public final void rule__TerminalRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8058:1: ( rule__TerminalRule__Group__4__Impl )
            // InternalXtext.g:8059:2: rule__TerminalRule__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalRule__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group__4"


    // $ANTLR start "rule__TerminalRule__Group__4__Impl"
    // InternalXtext.g:8065:1: rule__TerminalRule__Group__4__Impl : ( ';' ) ;
    public final void rule__TerminalRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8069:1: ( ( ';' ) )
            // InternalXtext.g:8070:1: ( ';' )
            {
            // InternalXtext.g:8070:1: ( ';' )
            // InternalXtext.g:8071:1: ';'
            {
             before(grammarAccess.getTerminalRuleAccess().getSemicolonKeyword_4()); 
            match(input,33,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTerminalRuleAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group__4__Impl"


    // $ANTLR start "rule__TerminalRule__Group_1_0__0"
    // InternalXtext.g:8094:1: rule__TerminalRule__Group_1_0__0 : rule__TerminalRule__Group_1_0__0__Impl rule__TerminalRule__Group_1_0__1 ;
    public final void rule__TerminalRule__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8098:1: ( rule__TerminalRule__Group_1_0__0__Impl rule__TerminalRule__Group_1_0__1 )
            // InternalXtext.g:8099:2: rule__TerminalRule__Group_1_0__0__Impl rule__TerminalRule__Group_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__TerminalRule__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalRule__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group_1_0__0"


    // $ANTLR start "rule__TerminalRule__Group_1_0__0__Impl"
    // InternalXtext.g:8106:1: rule__TerminalRule__Group_1_0__0__Impl : ( ( rule__TerminalRule__FragmentAssignment_1_0_0 ) ) ;
    public final void rule__TerminalRule__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8110:1: ( ( ( rule__TerminalRule__FragmentAssignment_1_0_0 ) ) )
            // InternalXtext.g:8111:1: ( ( rule__TerminalRule__FragmentAssignment_1_0_0 ) )
            {
            // InternalXtext.g:8111:1: ( ( rule__TerminalRule__FragmentAssignment_1_0_0 ) )
            // InternalXtext.g:8112:1: ( rule__TerminalRule__FragmentAssignment_1_0_0 )
            {
             before(grammarAccess.getTerminalRuleAccess().getFragmentAssignment_1_0_0()); 
            // InternalXtext.g:8113:1: ( rule__TerminalRule__FragmentAssignment_1_0_0 )
            // InternalXtext.g:8113:2: rule__TerminalRule__FragmentAssignment_1_0_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalRule__FragmentAssignment_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getTerminalRuleAccess().getFragmentAssignment_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group_1_0__0__Impl"


    // $ANTLR start "rule__TerminalRule__Group_1_0__1"
    // InternalXtext.g:8123:1: rule__TerminalRule__Group_1_0__1 : rule__TerminalRule__Group_1_0__1__Impl ;
    public final void rule__TerminalRule__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8127:1: ( rule__TerminalRule__Group_1_0__1__Impl )
            // InternalXtext.g:8128:2: rule__TerminalRule__Group_1_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalRule__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group_1_0__1"


    // $ANTLR start "rule__TerminalRule__Group_1_0__1__Impl"
    // InternalXtext.g:8134:1: rule__TerminalRule__Group_1_0__1__Impl : ( ( rule__TerminalRule__NameAssignment_1_0_1 ) ) ;
    public final void rule__TerminalRule__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8138:1: ( ( ( rule__TerminalRule__NameAssignment_1_0_1 ) ) )
            // InternalXtext.g:8139:1: ( ( rule__TerminalRule__NameAssignment_1_0_1 ) )
            {
            // InternalXtext.g:8139:1: ( ( rule__TerminalRule__NameAssignment_1_0_1 ) )
            // InternalXtext.g:8140:1: ( rule__TerminalRule__NameAssignment_1_0_1 )
            {
             before(grammarAccess.getTerminalRuleAccess().getNameAssignment_1_0_1()); 
            // InternalXtext.g:8141:1: ( rule__TerminalRule__NameAssignment_1_0_1 )
            // InternalXtext.g:8141:2: rule__TerminalRule__NameAssignment_1_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalRule__NameAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTerminalRuleAccess().getNameAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group_1_0__1__Impl"


    // $ANTLR start "rule__TerminalRule__Group_1_1__0"
    // InternalXtext.g:8155:1: rule__TerminalRule__Group_1_1__0 : rule__TerminalRule__Group_1_1__0__Impl rule__TerminalRule__Group_1_1__1 ;
    public final void rule__TerminalRule__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8159:1: ( rule__TerminalRule__Group_1_1__0__Impl rule__TerminalRule__Group_1_1__1 )
            // InternalXtext.g:8160:2: rule__TerminalRule__Group_1_1__0__Impl rule__TerminalRule__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__TerminalRule__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalRule__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group_1_1__0"


    // $ANTLR start "rule__TerminalRule__Group_1_1__0__Impl"
    // InternalXtext.g:8167:1: rule__TerminalRule__Group_1_1__0__Impl : ( ( rule__TerminalRule__NameAssignment_1_1_0 ) ) ;
    public final void rule__TerminalRule__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8171:1: ( ( ( rule__TerminalRule__NameAssignment_1_1_0 ) ) )
            // InternalXtext.g:8172:1: ( ( rule__TerminalRule__NameAssignment_1_1_0 ) )
            {
            // InternalXtext.g:8172:1: ( ( rule__TerminalRule__NameAssignment_1_1_0 ) )
            // InternalXtext.g:8173:1: ( rule__TerminalRule__NameAssignment_1_1_0 )
            {
             before(grammarAccess.getTerminalRuleAccess().getNameAssignment_1_1_0()); 
            // InternalXtext.g:8174:1: ( rule__TerminalRule__NameAssignment_1_1_0 )
            // InternalXtext.g:8174:2: rule__TerminalRule__NameAssignment_1_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalRule__NameAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTerminalRuleAccess().getNameAssignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group_1_1__0__Impl"


    // $ANTLR start "rule__TerminalRule__Group_1_1__1"
    // InternalXtext.g:8184:1: rule__TerminalRule__Group_1_1__1 : rule__TerminalRule__Group_1_1__1__Impl ;
    public final void rule__TerminalRule__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8188:1: ( rule__TerminalRule__Group_1_1__1__Impl )
            // InternalXtext.g:8189:2: rule__TerminalRule__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalRule__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group_1_1__1"


    // $ANTLR start "rule__TerminalRule__Group_1_1__1__Impl"
    // InternalXtext.g:8195:1: rule__TerminalRule__Group_1_1__1__Impl : ( ( rule__TerminalRule__Group_1_1_1__0 )? ) ;
    public final void rule__TerminalRule__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8199:1: ( ( ( rule__TerminalRule__Group_1_1_1__0 )? ) )
            // InternalXtext.g:8200:1: ( ( rule__TerminalRule__Group_1_1_1__0 )? )
            {
            // InternalXtext.g:8200:1: ( ( rule__TerminalRule__Group_1_1_1__0 )? )
            // InternalXtext.g:8201:1: ( rule__TerminalRule__Group_1_1_1__0 )?
            {
             before(grammarAccess.getTerminalRuleAccess().getGroup_1_1_1()); 
            // InternalXtext.g:8202:1: ( rule__TerminalRule__Group_1_1_1__0 )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==34) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalXtext.g:8202:2: rule__TerminalRule__Group_1_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TerminalRule__Group_1_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTerminalRuleAccess().getGroup_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group_1_1__1__Impl"


    // $ANTLR start "rule__TerminalRule__Group_1_1_1__0"
    // InternalXtext.g:8216:1: rule__TerminalRule__Group_1_1_1__0 : rule__TerminalRule__Group_1_1_1__0__Impl rule__TerminalRule__Group_1_1_1__1 ;
    public final void rule__TerminalRule__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8220:1: ( rule__TerminalRule__Group_1_1_1__0__Impl rule__TerminalRule__Group_1_1_1__1 )
            // InternalXtext.g:8221:2: rule__TerminalRule__Group_1_1_1__0__Impl rule__TerminalRule__Group_1_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__TerminalRule__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalRule__Group_1_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group_1_1_1__0"


    // $ANTLR start "rule__TerminalRule__Group_1_1_1__0__Impl"
    // InternalXtext.g:8228:1: rule__TerminalRule__Group_1_1_1__0__Impl : ( 'returns' ) ;
    public final void rule__TerminalRule__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8232:1: ( ( 'returns' ) )
            // InternalXtext.g:8233:1: ( 'returns' )
            {
            // InternalXtext.g:8233:1: ( 'returns' )
            // InternalXtext.g:8234:1: 'returns'
            {
             before(grammarAccess.getTerminalRuleAccess().getReturnsKeyword_1_1_1_0()); 
            match(input,34,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTerminalRuleAccess().getReturnsKeyword_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__TerminalRule__Group_1_1_1__1"
    // InternalXtext.g:8247:1: rule__TerminalRule__Group_1_1_1__1 : rule__TerminalRule__Group_1_1_1__1__Impl ;
    public final void rule__TerminalRule__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8251:1: ( rule__TerminalRule__Group_1_1_1__1__Impl )
            // InternalXtext.g:8252:2: rule__TerminalRule__Group_1_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalRule__Group_1_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group_1_1_1__1"


    // $ANTLR start "rule__TerminalRule__Group_1_1_1__1__Impl"
    // InternalXtext.g:8258:1: rule__TerminalRule__Group_1_1_1__1__Impl : ( ( rule__TerminalRule__TypeAssignment_1_1_1_1 ) ) ;
    public final void rule__TerminalRule__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8262:1: ( ( ( rule__TerminalRule__TypeAssignment_1_1_1_1 ) ) )
            // InternalXtext.g:8263:1: ( ( rule__TerminalRule__TypeAssignment_1_1_1_1 ) )
            {
            // InternalXtext.g:8263:1: ( ( rule__TerminalRule__TypeAssignment_1_1_1_1 ) )
            // InternalXtext.g:8264:1: ( rule__TerminalRule__TypeAssignment_1_1_1_1 )
            {
             before(grammarAccess.getTerminalRuleAccess().getTypeAssignment_1_1_1_1()); 
            // InternalXtext.g:8265:1: ( rule__TerminalRule__TypeAssignment_1_1_1_1 )
            // InternalXtext.g:8265:2: rule__TerminalRule__TypeAssignment_1_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalRule__TypeAssignment_1_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTerminalRuleAccess().getTypeAssignment_1_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__TerminalAlternatives__Group__0"
    // InternalXtext.g:8279:1: rule__TerminalAlternatives__Group__0 : rule__TerminalAlternatives__Group__0__Impl rule__TerminalAlternatives__Group__1 ;
    public final void rule__TerminalAlternatives__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8283:1: ( rule__TerminalAlternatives__Group__0__Impl rule__TerminalAlternatives__Group__1 )
            // InternalXtext.g:8284:2: rule__TerminalAlternatives__Group__0__Impl rule__TerminalAlternatives__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__TerminalAlternatives__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalAlternatives__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalAlternatives__Group__0"


    // $ANTLR start "rule__TerminalAlternatives__Group__0__Impl"
    // InternalXtext.g:8291:1: rule__TerminalAlternatives__Group__0__Impl : ( ruleTerminalGroup ) ;
    public final void rule__TerminalAlternatives__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8295:1: ( ( ruleTerminalGroup ) )
            // InternalXtext.g:8296:1: ( ruleTerminalGroup )
            {
            // InternalXtext.g:8296:1: ( ruleTerminalGroup )
            // InternalXtext.g:8297:1: ruleTerminalGroup
            {
             before(grammarAccess.getTerminalAlternativesAccess().getTerminalGroupParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTerminalGroup();

            state._fsp--;

             after(grammarAccess.getTerminalAlternativesAccess().getTerminalGroupParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalAlternatives__Group__0__Impl"


    // $ANTLR start "rule__TerminalAlternatives__Group__1"
    // InternalXtext.g:8308:1: rule__TerminalAlternatives__Group__1 : rule__TerminalAlternatives__Group__1__Impl ;
    public final void rule__TerminalAlternatives__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8312:1: ( rule__TerminalAlternatives__Group__1__Impl )
            // InternalXtext.g:8313:2: rule__TerminalAlternatives__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalAlternatives__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalAlternatives__Group__1"


    // $ANTLR start "rule__TerminalAlternatives__Group__1__Impl"
    // InternalXtext.g:8319:1: rule__TerminalAlternatives__Group__1__Impl : ( ( rule__TerminalAlternatives__Group_1__0 )? ) ;
    public final void rule__TerminalAlternatives__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8323:1: ( ( ( rule__TerminalAlternatives__Group_1__0 )? ) )
            // InternalXtext.g:8324:1: ( ( rule__TerminalAlternatives__Group_1__0 )? )
            {
            // InternalXtext.g:8324:1: ( ( rule__TerminalAlternatives__Group_1__0 )? )
            // InternalXtext.g:8325:1: ( rule__TerminalAlternatives__Group_1__0 )?
            {
             before(grammarAccess.getTerminalAlternativesAccess().getGroup_1()); 
            // InternalXtext.g:8326:1: ( rule__TerminalAlternatives__Group_1__0 )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==40) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalXtext.g:8326:2: rule__TerminalAlternatives__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TerminalAlternatives__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTerminalAlternativesAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalAlternatives__Group__1__Impl"


    // $ANTLR start "rule__TerminalAlternatives__Group_1__0"
    // InternalXtext.g:8340:1: rule__TerminalAlternatives__Group_1__0 : rule__TerminalAlternatives__Group_1__0__Impl rule__TerminalAlternatives__Group_1__1 ;
    public final void rule__TerminalAlternatives__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8344:1: ( rule__TerminalAlternatives__Group_1__0__Impl rule__TerminalAlternatives__Group_1__1 )
            // InternalXtext.g:8345:2: rule__TerminalAlternatives__Group_1__0__Impl rule__TerminalAlternatives__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__TerminalAlternatives__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalAlternatives__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalAlternatives__Group_1__0"


    // $ANTLR start "rule__TerminalAlternatives__Group_1__0__Impl"
    // InternalXtext.g:8352:1: rule__TerminalAlternatives__Group_1__0__Impl : ( () ) ;
    public final void rule__TerminalAlternatives__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8356:1: ( ( () ) )
            // InternalXtext.g:8357:1: ( () )
            {
            // InternalXtext.g:8357:1: ( () )
            // InternalXtext.g:8358:1: ()
            {
             before(grammarAccess.getTerminalAlternativesAccess().getAlternativesElementsAction_1_0()); 
            // InternalXtext.g:8359:1: ()
            // InternalXtext.g:8361:1: 
            {
            }

             after(grammarAccess.getTerminalAlternativesAccess().getAlternativesElementsAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalAlternatives__Group_1__0__Impl"


    // $ANTLR start "rule__TerminalAlternatives__Group_1__1"
    // InternalXtext.g:8371:1: rule__TerminalAlternatives__Group_1__1 : rule__TerminalAlternatives__Group_1__1__Impl ;
    public final void rule__TerminalAlternatives__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8375:1: ( rule__TerminalAlternatives__Group_1__1__Impl )
            // InternalXtext.g:8376:2: rule__TerminalAlternatives__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalAlternatives__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalAlternatives__Group_1__1"


    // $ANTLR start "rule__TerminalAlternatives__Group_1__1__Impl"
    // InternalXtext.g:8382:1: rule__TerminalAlternatives__Group_1__1__Impl : ( ( ( rule__TerminalAlternatives__Group_1_1__0 ) ) ( ( rule__TerminalAlternatives__Group_1_1__0 )* ) ) ;
    public final void rule__TerminalAlternatives__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8386:1: ( ( ( ( rule__TerminalAlternatives__Group_1_1__0 ) ) ( ( rule__TerminalAlternatives__Group_1_1__0 )* ) ) )
            // InternalXtext.g:8387:1: ( ( ( rule__TerminalAlternatives__Group_1_1__0 ) ) ( ( rule__TerminalAlternatives__Group_1_1__0 )* ) )
            {
            // InternalXtext.g:8387:1: ( ( ( rule__TerminalAlternatives__Group_1_1__0 ) ) ( ( rule__TerminalAlternatives__Group_1_1__0 )* ) )
            // InternalXtext.g:8388:1: ( ( rule__TerminalAlternatives__Group_1_1__0 ) ) ( ( rule__TerminalAlternatives__Group_1_1__0 )* )
            {
            // InternalXtext.g:8388:1: ( ( rule__TerminalAlternatives__Group_1_1__0 ) )
            // InternalXtext.g:8389:1: ( rule__TerminalAlternatives__Group_1_1__0 )
            {
             before(grammarAccess.getTerminalAlternativesAccess().getGroup_1_1()); 
            // InternalXtext.g:8390:1: ( rule__TerminalAlternatives__Group_1_1__0 )
            // InternalXtext.g:8390:2: rule__TerminalAlternatives__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_28);
            rule__TerminalAlternatives__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getTerminalAlternativesAccess().getGroup_1_1()); 

            }

            // InternalXtext.g:8393:1: ( ( rule__TerminalAlternatives__Group_1_1__0 )* )
            // InternalXtext.g:8394:1: ( rule__TerminalAlternatives__Group_1_1__0 )*
            {
             before(grammarAccess.getTerminalAlternativesAccess().getGroup_1_1()); 
            // InternalXtext.g:8395:1: ( rule__TerminalAlternatives__Group_1_1__0 )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==40) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalXtext.g:8395:2: rule__TerminalAlternatives__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__TerminalAlternatives__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);

             after(grammarAccess.getTerminalAlternativesAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__TerminalAlternatives__Group_1__1__Impl"


    // $ANTLR start "rule__TerminalAlternatives__Group_1_1__0"
    // InternalXtext.g:8410:1: rule__TerminalAlternatives__Group_1_1__0 : rule__TerminalAlternatives__Group_1_1__0__Impl rule__TerminalAlternatives__Group_1_1__1 ;
    public final void rule__TerminalAlternatives__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8414:1: ( rule__TerminalAlternatives__Group_1_1__0__Impl rule__TerminalAlternatives__Group_1_1__1 )
            // InternalXtext.g:8415:2: rule__TerminalAlternatives__Group_1_1__0__Impl rule__TerminalAlternatives__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_50);
            rule__TerminalAlternatives__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalAlternatives__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalAlternatives__Group_1_1__0"


    // $ANTLR start "rule__TerminalAlternatives__Group_1_1__0__Impl"
    // InternalXtext.g:8422:1: rule__TerminalAlternatives__Group_1_1__0__Impl : ( '|' ) ;
    public final void rule__TerminalAlternatives__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8426:1: ( ( '|' ) )
            // InternalXtext.g:8427:1: ( '|' )
            {
            // InternalXtext.g:8427:1: ( '|' )
            // InternalXtext.g:8428:1: '|'
            {
             before(grammarAccess.getTerminalAlternativesAccess().getVerticalLineKeyword_1_1_0()); 
            match(input,40,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTerminalAlternativesAccess().getVerticalLineKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalAlternatives__Group_1_1__0__Impl"


    // $ANTLR start "rule__TerminalAlternatives__Group_1_1__1"
    // InternalXtext.g:8441:1: rule__TerminalAlternatives__Group_1_1__1 : rule__TerminalAlternatives__Group_1_1__1__Impl ;
    public final void rule__TerminalAlternatives__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8445:1: ( rule__TerminalAlternatives__Group_1_1__1__Impl )
            // InternalXtext.g:8446:2: rule__TerminalAlternatives__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalAlternatives__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalAlternatives__Group_1_1__1"


    // $ANTLR start "rule__TerminalAlternatives__Group_1_1__1__Impl"
    // InternalXtext.g:8452:1: rule__TerminalAlternatives__Group_1_1__1__Impl : ( ( rule__TerminalAlternatives__ElementsAssignment_1_1_1 ) ) ;
    public final void rule__TerminalAlternatives__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8456:1: ( ( ( rule__TerminalAlternatives__ElementsAssignment_1_1_1 ) ) )
            // InternalXtext.g:8457:1: ( ( rule__TerminalAlternatives__ElementsAssignment_1_1_1 ) )
            {
            // InternalXtext.g:8457:1: ( ( rule__TerminalAlternatives__ElementsAssignment_1_1_1 ) )
            // InternalXtext.g:8458:1: ( rule__TerminalAlternatives__ElementsAssignment_1_1_1 )
            {
             before(grammarAccess.getTerminalAlternativesAccess().getElementsAssignment_1_1_1()); 
            // InternalXtext.g:8459:1: ( rule__TerminalAlternatives__ElementsAssignment_1_1_1 )
            // InternalXtext.g:8459:2: rule__TerminalAlternatives__ElementsAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalAlternatives__ElementsAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTerminalAlternativesAccess().getElementsAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalAlternatives__Group_1_1__1__Impl"


    // $ANTLR start "rule__TerminalGroup__Group__0"
    // InternalXtext.g:8473:1: rule__TerminalGroup__Group__0 : rule__TerminalGroup__Group__0__Impl rule__TerminalGroup__Group__1 ;
    public final void rule__TerminalGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8477:1: ( rule__TerminalGroup__Group__0__Impl rule__TerminalGroup__Group__1 )
            // InternalXtext.g:8478:2: rule__TerminalGroup__Group__0__Impl rule__TerminalGroup__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_50);
            rule__TerminalGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalGroup__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalGroup__Group__0"


    // $ANTLR start "rule__TerminalGroup__Group__0__Impl"
    // InternalXtext.g:8485:1: rule__TerminalGroup__Group__0__Impl : ( ruleTerminalToken ) ;
    public final void rule__TerminalGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8489:1: ( ( ruleTerminalToken ) )
            // InternalXtext.g:8490:1: ( ruleTerminalToken )
            {
            // InternalXtext.g:8490:1: ( ruleTerminalToken )
            // InternalXtext.g:8491:1: ruleTerminalToken
            {
             before(grammarAccess.getTerminalGroupAccess().getTerminalTokenParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTerminalToken();

            state._fsp--;

             after(grammarAccess.getTerminalGroupAccess().getTerminalTokenParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalGroup__Group__0__Impl"


    // $ANTLR start "rule__TerminalGroup__Group__1"
    // InternalXtext.g:8502:1: rule__TerminalGroup__Group__1 : rule__TerminalGroup__Group__1__Impl ;
    public final void rule__TerminalGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8506:1: ( rule__TerminalGroup__Group__1__Impl )
            // InternalXtext.g:8507:2: rule__TerminalGroup__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalGroup__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalGroup__Group__1"


    // $ANTLR start "rule__TerminalGroup__Group__1__Impl"
    // InternalXtext.g:8513:1: rule__TerminalGroup__Group__1__Impl : ( ( rule__TerminalGroup__Group_1__0 )? ) ;
    public final void rule__TerminalGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8517:1: ( ( ( rule__TerminalGroup__Group_1__0 )? ) )
            // InternalXtext.g:8518:1: ( ( rule__TerminalGroup__Group_1__0 )? )
            {
            // InternalXtext.g:8518:1: ( ( rule__TerminalGroup__Group_1__0 )? )
            // InternalXtext.g:8519:1: ( rule__TerminalGroup__Group_1__0 )?
            {
             before(grammarAccess.getTerminalGroupAccess().getGroup_1()); 
            // InternalXtext.g:8520:1: ( rule__TerminalGroup__Group_1__0 )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( ((LA73_0>=RULE_ID && LA73_0<=RULE_STRING)||(LA73_0>=20 && LA73_0<=21)||LA73_0==26||LA73_0==28||LA73_0==43||(LA73_0>=47 && LA73_0<=48)) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalXtext.g:8520:2: rule__TerminalGroup__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TerminalGroup__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTerminalGroupAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalGroup__Group__1__Impl"


    // $ANTLR start "rule__TerminalGroup__Group_1__0"
    // InternalXtext.g:8534:1: rule__TerminalGroup__Group_1__0 : rule__TerminalGroup__Group_1__0__Impl rule__TerminalGroup__Group_1__1 ;
    public final void rule__TerminalGroup__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8538:1: ( rule__TerminalGroup__Group_1__0__Impl rule__TerminalGroup__Group_1__1 )
            // InternalXtext.g:8539:2: rule__TerminalGroup__Group_1__0__Impl rule__TerminalGroup__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_50);
            rule__TerminalGroup__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalGroup__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalGroup__Group_1__0"


    // $ANTLR start "rule__TerminalGroup__Group_1__0__Impl"
    // InternalXtext.g:8546:1: rule__TerminalGroup__Group_1__0__Impl : ( () ) ;
    public final void rule__TerminalGroup__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8550:1: ( ( () ) )
            // InternalXtext.g:8551:1: ( () )
            {
            // InternalXtext.g:8551:1: ( () )
            // InternalXtext.g:8552:1: ()
            {
             before(grammarAccess.getTerminalGroupAccess().getGroupElementsAction_1_0()); 
            // InternalXtext.g:8553:1: ()
            // InternalXtext.g:8555:1: 
            {
            }

             after(grammarAccess.getTerminalGroupAccess().getGroupElementsAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalGroup__Group_1__0__Impl"


    // $ANTLR start "rule__TerminalGroup__Group_1__1"
    // InternalXtext.g:8565:1: rule__TerminalGroup__Group_1__1 : rule__TerminalGroup__Group_1__1__Impl ;
    public final void rule__TerminalGroup__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8569:1: ( rule__TerminalGroup__Group_1__1__Impl )
            // InternalXtext.g:8570:2: rule__TerminalGroup__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalGroup__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalGroup__Group_1__1"


    // $ANTLR start "rule__TerminalGroup__Group_1__1__Impl"
    // InternalXtext.g:8576:1: rule__TerminalGroup__Group_1__1__Impl : ( ( ( rule__TerminalGroup__ElementsAssignment_1_1 ) ) ( ( rule__TerminalGroup__ElementsAssignment_1_1 )* ) ) ;
    public final void rule__TerminalGroup__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8580:1: ( ( ( ( rule__TerminalGroup__ElementsAssignment_1_1 ) ) ( ( rule__TerminalGroup__ElementsAssignment_1_1 )* ) ) )
            // InternalXtext.g:8581:1: ( ( ( rule__TerminalGroup__ElementsAssignment_1_1 ) ) ( ( rule__TerminalGroup__ElementsAssignment_1_1 )* ) )
            {
            // InternalXtext.g:8581:1: ( ( ( rule__TerminalGroup__ElementsAssignment_1_1 ) ) ( ( rule__TerminalGroup__ElementsAssignment_1_1 )* ) )
            // InternalXtext.g:8582:1: ( ( rule__TerminalGroup__ElementsAssignment_1_1 ) ) ( ( rule__TerminalGroup__ElementsAssignment_1_1 )* )
            {
            // InternalXtext.g:8582:1: ( ( rule__TerminalGroup__ElementsAssignment_1_1 ) )
            // InternalXtext.g:8583:1: ( rule__TerminalGroup__ElementsAssignment_1_1 )
            {
             before(grammarAccess.getTerminalGroupAccess().getElementsAssignment_1_1()); 
            // InternalXtext.g:8584:1: ( rule__TerminalGroup__ElementsAssignment_1_1 )
            // InternalXtext.g:8584:2: rule__TerminalGroup__ElementsAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_51);
            rule__TerminalGroup__ElementsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTerminalGroupAccess().getElementsAssignment_1_1()); 

            }

            // InternalXtext.g:8587:1: ( ( rule__TerminalGroup__ElementsAssignment_1_1 )* )
            // InternalXtext.g:8588:1: ( rule__TerminalGroup__ElementsAssignment_1_1 )*
            {
             before(grammarAccess.getTerminalGroupAccess().getElementsAssignment_1_1()); 
            // InternalXtext.g:8589:1: ( rule__TerminalGroup__ElementsAssignment_1_1 )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( ((LA74_0>=RULE_ID && LA74_0<=RULE_STRING)||(LA74_0>=20 && LA74_0<=21)||LA74_0==26||LA74_0==28||LA74_0==43||(LA74_0>=47 && LA74_0<=48)) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalXtext.g:8589:2: rule__TerminalGroup__ElementsAssignment_1_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_51);
            	    rule__TerminalGroup__ElementsAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);

             after(grammarAccess.getTerminalGroupAccess().getElementsAssignment_1_1()); 

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
    // $ANTLR end "rule__TerminalGroup__Group_1__1__Impl"


    // $ANTLR start "rule__TerminalToken__Group__0"
    // InternalXtext.g:8604:1: rule__TerminalToken__Group__0 : rule__TerminalToken__Group__0__Impl rule__TerminalToken__Group__1 ;
    public final void rule__TerminalToken__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8608:1: ( rule__TerminalToken__Group__0__Impl rule__TerminalToken__Group__1 )
            // InternalXtext.g:8609:2: rule__TerminalToken__Group__0__Impl rule__TerminalToken__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__TerminalToken__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalToken__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalToken__Group__0"


    // $ANTLR start "rule__TerminalToken__Group__0__Impl"
    // InternalXtext.g:8616:1: rule__TerminalToken__Group__0__Impl : ( ruleTerminalTokenElement ) ;
    public final void rule__TerminalToken__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8620:1: ( ( ruleTerminalTokenElement ) )
            // InternalXtext.g:8621:1: ( ruleTerminalTokenElement )
            {
            // InternalXtext.g:8621:1: ( ruleTerminalTokenElement )
            // InternalXtext.g:8622:1: ruleTerminalTokenElement
            {
             before(grammarAccess.getTerminalTokenAccess().getTerminalTokenElementParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTerminalTokenElement();

            state._fsp--;

             after(grammarAccess.getTerminalTokenAccess().getTerminalTokenElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalToken__Group__0__Impl"


    // $ANTLR start "rule__TerminalToken__Group__1"
    // InternalXtext.g:8633:1: rule__TerminalToken__Group__1 : rule__TerminalToken__Group__1__Impl ;
    public final void rule__TerminalToken__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8637:1: ( rule__TerminalToken__Group__1__Impl )
            // InternalXtext.g:8638:2: rule__TerminalToken__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalToken__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalToken__Group__1"


    // $ANTLR start "rule__TerminalToken__Group__1__Impl"
    // InternalXtext.g:8644:1: rule__TerminalToken__Group__1__Impl : ( ( rule__TerminalToken__CardinalityAssignment_1 )? ) ;
    public final void rule__TerminalToken__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8648:1: ( ( ( rule__TerminalToken__CardinalityAssignment_1 )? ) )
            // InternalXtext.g:8649:1: ( ( rule__TerminalToken__CardinalityAssignment_1 )? )
            {
            // InternalXtext.g:8649:1: ( ( rule__TerminalToken__CardinalityAssignment_1 )? )
            // InternalXtext.g:8650:1: ( rule__TerminalToken__CardinalityAssignment_1 )?
            {
             before(grammarAccess.getTerminalTokenAccess().getCardinalityAssignment_1()); 
            // InternalXtext.g:8651:1: ( rule__TerminalToken__CardinalityAssignment_1 )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( ((LA75_0>=15 && LA75_0<=17)) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalXtext.g:8651:2: rule__TerminalToken__CardinalityAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TerminalToken__CardinalityAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTerminalTokenAccess().getCardinalityAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalToken__Group__1__Impl"


    // $ANTLR start "rule__ParenthesizedTerminalElement__Group__0"
    // InternalXtext.g:8665:1: rule__ParenthesizedTerminalElement__Group__0 : rule__ParenthesizedTerminalElement__Group__0__Impl rule__ParenthesizedTerminalElement__Group__1 ;
    public final void rule__ParenthesizedTerminalElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8669:1: ( rule__ParenthesizedTerminalElement__Group__0__Impl rule__ParenthesizedTerminalElement__Group__1 )
            // InternalXtext.g:8670:2: rule__ParenthesizedTerminalElement__Group__0__Impl rule__ParenthesizedTerminalElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_50);
            rule__ParenthesizedTerminalElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedTerminalElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedTerminalElement__Group__0"


    // $ANTLR start "rule__ParenthesizedTerminalElement__Group__0__Impl"
    // InternalXtext.g:8677:1: rule__ParenthesizedTerminalElement__Group__0__Impl : ( '(' ) ;
    public final void rule__ParenthesizedTerminalElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8681:1: ( ( '(' ) )
            // InternalXtext.g:8682:1: ( '(' )
            {
            // InternalXtext.g:8682:1: ( '(' )
            // InternalXtext.g:8683:1: '('
            {
             before(grammarAccess.getParenthesizedTerminalElementAccess().getLeftParenthesisKeyword_0()); 
            match(input,26,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParenthesizedTerminalElementAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedTerminalElement__Group__0__Impl"


    // $ANTLR start "rule__ParenthesizedTerminalElement__Group__1"
    // InternalXtext.g:8696:1: rule__ParenthesizedTerminalElement__Group__1 : rule__ParenthesizedTerminalElement__Group__1__Impl rule__ParenthesizedTerminalElement__Group__2 ;
    public final void rule__ParenthesizedTerminalElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8700:1: ( rule__ParenthesizedTerminalElement__Group__1__Impl rule__ParenthesizedTerminalElement__Group__2 )
            // InternalXtext.g:8701:2: rule__ParenthesizedTerminalElement__Group__1__Impl rule__ParenthesizedTerminalElement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_42);
            rule__ParenthesizedTerminalElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedTerminalElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedTerminalElement__Group__1"


    // $ANTLR start "rule__ParenthesizedTerminalElement__Group__1__Impl"
    // InternalXtext.g:8708:1: rule__ParenthesizedTerminalElement__Group__1__Impl : ( ruleTerminalAlternatives ) ;
    public final void rule__ParenthesizedTerminalElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8712:1: ( ( ruleTerminalAlternatives ) )
            // InternalXtext.g:8713:1: ( ruleTerminalAlternatives )
            {
            // InternalXtext.g:8713:1: ( ruleTerminalAlternatives )
            // InternalXtext.g:8714:1: ruleTerminalAlternatives
            {
             before(grammarAccess.getParenthesizedTerminalElementAccess().getTerminalAlternativesParserRuleCall_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTerminalAlternatives();

            state._fsp--;

             after(grammarAccess.getParenthesizedTerminalElementAccess().getTerminalAlternativesParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedTerminalElement__Group__1__Impl"


    // $ANTLR start "rule__ParenthesizedTerminalElement__Group__2"
    // InternalXtext.g:8725:1: rule__ParenthesizedTerminalElement__Group__2 : rule__ParenthesizedTerminalElement__Group__2__Impl ;
    public final void rule__ParenthesizedTerminalElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8729:1: ( rule__ParenthesizedTerminalElement__Group__2__Impl )
            // InternalXtext.g:8730:2: rule__ParenthesizedTerminalElement__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedTerminalElement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedTerminalElement__Group__2"


    // $ANTLR start "rule__ParenthesizedTerminalElement__Group__2__Impl"
    // InternalXtext.g:8736:1: rule__ParenthesizedTerminalElement__Group__2__Impl : ( ')' ) ;
    public final void rule__ParenthesizedTerminalElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8740:1: ( ( ')' ) )
            // InternalXtext.g:8741:1: ( ')' )
            {
            // InternalXtext.g:8741:1: ( ')' )
            // InternalXtext.g:8742:1: ')'
            {
             before(grammarAccess.getParenthesizedTerminalElementAccess().getRightParenthesisKeyword_2()); 
            match(input,27,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParenthesizedTerminalElementAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedTerminalElement__Group__2__Impl"


    // $ANTLR start "rule__NegatedToken__Group__0"
    // InternalXtext.g:8761:1: rule__NegatedToken__Group__0 : rule__NegatedToken__Group__0__Impl rule__NegatedToken__Group__1 ;
    public final void rule__NegatedToken__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8765:1: ( rule__NegatedToken__Group__0__Impl rule__NegatedToken__Group__1 )
            // InternalXtext.g:8766:2: rule__NegatedToken__Group__0__Impl rule__NegatedToken__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_50);
            rule__NegatedToken__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__NegatedToken__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegatedToken__Group__0"


    // $ANTLR start "rule__NegatedToken__Group__0__Impl"
    // InternalXtext.g:8773:1: rule__NegatedToken__Group__0__Impl : ( '!' ) ;
    public final void rule__NegatedToken__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8777:1: ( ( '!' ) )
            // InternalXtext.g:8778:1: ( '!' )
            {
            // InternalXtext.g:8778:1: ( '!' )
            // InternalXtext.g:8779:1: '!'
            {
             before(grammarAccess.getNegatedTokenAccess().getExclamationMarkKeyword_0()); 
            match(input,43,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getNegatedTokenAccess().getExclamationMarkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegatedToken__Group__0__Impl"


    // $ANTLR start "rule__NegatedToken__Group__1"
    // InternalXtext.g:8792:1: rule__NegatedToken__Group__1 : rule__NegatedToken__Group__1__Impl ;
    public final void rule__NegatedToken__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8796:1: ( rule__NegatedToken__Group__1__Impl )
            // InternalXtext.g:8797:2: rule__NegatedToken__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NegatedToken__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegatedToken__Group__1"


    // $ANTLR start "rule__NegatedToken__Group__1__Impl"
    // InternalXtext.g:8803:1: rule__NegatedToken__Group__1__Impl : ( ( rule__NegatedToken__TerminalAssignment_1 ) ) ;
    public final void rule__NegatedToken__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8807:1: ( ( ( rule__NegatedToken__TerminalAssignment_1 ) ) )
            // InternalXtext.g:8808:1: ( ( rule__NegatedToken__TerminalAssignment_1 ) )
            {
            // InternalXtext.g:8808:1: ( ( rule__NegatedToken__TerminalAssignment_1 ) )
            // InternalXtext.g:8809:1: ( rule__NegatedToken__TerminalAssignment_1 )
            {
             before(grammarAccess.getNegatedTokenAccess().getTerminalAssignment_1()); 
            // InternalXtext.g:8810:1: ( rule__NegatedToken__TerminalAssignment_1 )
            // InternalXtext.g:8810:2: rule__NegatedToken__TerminalAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NegatedToken__TerminalAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNegatedTokenAccess().getTerminalAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegatedToken__Group__1__Impl"


    // $ANTLR start "rule__UntilToken__Group__0"
    // InternalXtext.g:8824:1: rule__UntilToken__Group__0 : rule__UntilToken__Group__0__Impl rule__UntilToken__Group__1 ;
    public final void rule__UntilToken__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8828:1: ( rule__UntilToken__Group__0__Impl rule__UntilToken__Group__1 )
            // InternalXtext.g:8829:2: rule__UntilToken__Group__0__Impl rule__UntilToken__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_50);
            rule__UntilToken__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__UntilToken__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntilToken__Group__0"


    // $ANTLR start "rule__UntilToken__Group__0__Impl"
    // InternalXtext.g:8836:1: rule__UntilToken__Group__0__Impl : ( '->' ) ;
    public final void rule__UntilToken__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8840:1: ( ( '->' ) )
            // InternalXtext.g:8841:1: ( '->' )
            {
            // InternalXtext.g:8841:1: ( '->' )
            // InternalXtext.g:8842:1: '->'
            {
             before(grammarAccess.getUntilTokenAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
            match(input,47,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getUntilTokenAccess().getHyphenMinusGreaterThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntilToken__Group__0__Impl"


    // $ANTLR start "rule__UntilToken__Group__1"
    // InternalXtext.g:8855:1: rule__UntilToken__Group__1 : rule__UntilToken__Group__1__Impl ;
    public final void rule__UntilToken__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8859:1: ( rule__UntilToken__Group__1__Impl )
            // InternalXtext.g:8860:2: rule__UntilToken__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UntilToken__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntilToken__Group__1"


    // $ANTLR start "rule__UntilToken__Group__1__Impl"
    // InternalXtext.g:8866:1: rule__UntilToken__Group__1__Impl : ( ( rule__UntilToken__TerminalAssignment_1 ) ) ;
    public final void rule__UntilToken__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8870:1: ( ( ( rule__UntilToken__TerminalAssignment_1 ) ) )
            // InternalXtext.g:8871:1: ( ( rule__UntilToken__TerminalAssignment_1 ) )
            {
            // InternalXtext.g:8871:1: ( ( rule__UntilToken__TerminalAssignment_1 ) )
            // InternalXtext.g:8872:1: ( rule__UntilToken__TerminalAssignment_1 )
            {
             before(grammarAccess.getUntilTokenAccess().getTerminalAssignment_1()); 
            // InternalXtext.g:8873:1: ( rule__UntilToken__TerminalAssignment_1 )
            // InternalXtext.g:8873:2: rule__UntilToken__TerminalAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UntilToken__TerminalAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUntilTokenAccess().getTerminalAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntilToken__Group__1__Impl"


    // $ANTLR start "rule__Wildcard__Group__0"
    // InternalXtext.g:8887:1: rule__Wildcard__Group__0 : rule__Wildcard__Group__0__Impl rule__Wildcard__Group__1 ;
    public final void rule__Wildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8891:1: ( rule__Wildcard__Group__0__Impl rule__Wildcard__Group__1 )
            // InternalXtext.g:8892:2: rule__Wildcard__Group__0__Impl rule__Wildcard__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__Wildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Wildcard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wildcard__Group__0"


    // $ANTLR start "rule__Wildcard__Group__0__Impl"
    // InternalXtext.g:8899:1: rule__Wildcard__Group__0__Impl : ( () ) ;
    public final void rule__Wildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8903:1: ( ( () ) )
            // InternalXtext.g:8904:1: ( () )
            {
            // InternalXtext.g:8904:1: ( () )
            // InternalXtext.g:8905:1: ()
            {
             before(grammarAccess.getWildcardAccess().getWildcardAction_0()); 
            // InternalXtext.g:8906:1: ()
            // InternalXtext.g:8908:1: 
            {
            }

             after(grammarAccess.getWildcardAccess().getWildcardAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wildcard__Group__0__Impl"


    // $ANTLR start "rule__Wildcard__Group__1"
    // InternalXtext.g:8918:1: rule__Wildcard__Group__1 : rule__Wildcard__Group__1__Impl ;
    public final void rule__Wildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8922:1: ( rule__Wildcard__Group__1__Impl )
            // InternalXtext.g:8923:2: rule__Wildcard__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Wildcard__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wildcard__Group__1"


    // $ANTLR start "rule__Wildcard__Group__1__Impl"
    // InternalXtext.g:8929:1: rule__Wildcard__Group__1__Impl : ( '.' ) ;
    public final void rule__Wildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8933:1: ( ( '.' ) )
            // InternalXtext.g:8934:1: ( '.' )
            {
            // InternalXtext.g:8934:1: ( '.' )
            // InternalXtext.g:8935:1: '.'
            {
             before(grammarAccess.getWildcardAccess().getFullStopKeyword_1()); 
            match(input,28,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getWildcardAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wildcard__Group__1__Impl"


    // $ANTLR start "rule__EOF__Group__0"
    // InternalXtext.g:8952:1: rule__EOF__Group__0 : rule__EOF__Group__0__Impl rule__EOF__Group__1 ;
    public final void rule__EOF__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8956:1: ( rule__EOF__Group__0__Impl rule__EOF__Group__1 )
            // InternalXtext.g:8957:2: rule__EOF__Group__0__Impl rule__EOF__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_50);
            rule__EOF__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EOF__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EOF__Group__0"


    // $ANTLR start "rule__EOF__Group__0__Impl"
    // InternalXtext.g:8964:1: rule__EOF__Group__0__Impl : ( () ) ;
    public final void rule__EOF__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8968:1: ( ( () ) )
            // InternalXtext.g:8969:1: ( () )
            {
            // InternalXtext.g:8969:1: ( () )
            // InternalXtext.g:8970:1: ()
            {
             before(grammarAccess.getEOFAccess().getEOFAction_0()); 
            // InternalXtext.g:8971:1: ()
            // InternalXtext.g:8973:1: 
            {
            }

             after(grammarAccess.getEOFAccess().getEOFAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EOF__Group__0__Impl"


    // $ANTLR start "rule__EOF__Group__1"
    // InternalXtext.g:8983:1: rule__EOF__Group__1 : rule__EOF__Group__1__Impl ;
    public final void rule__EOF__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8987:1: ( rule__EOF__Group__1__Impl )
            // InternalXtext.g:8988:2: rule__EOF__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EOF__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EOF__Group__1"


    // $ANTLR start "rule__EOF__Group__1__Impl"
    // InternalXtext.g:8994:1: rule__EOF__Group__1__Impl : ( 'EOF' ) ;
    public final void rule__EOF__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:8998:1: ( ( 'EOF' ) )
            // InternalXtext.g:8999:1: ( 'EOF' )
            {
            // InternalXtext.g:8999:1: ( 'EOF' )
            // InternalXtext.g:9000:1: 'EOF'
            {
             before(grammarAccess.getEOFAccess().getEOFKeyword_1()); 
            match(input,48,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEOFAccess().getEOFKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EOF__Group__1__Impl"


    // $ANTLR start "rule__CharacterRange__Group__0"
    // InternalXtext.g:9017:1: rule__CharacterRange__Group__0 : rule__CharacterRange__Group__0__Impl rule__CharacterRange__Group__1 ;
    public final void rule__CharacterRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9021:1: ( rule__CharacterRange__Group__0__Impl rule__CharacterRange__Group__1 )
            // InternalXtext.g:9022:2: rule__CharacterRange__Group__0__Impl rule__CharacterRange__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_52);
            rule__CharacterRange__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__CharacterRange__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterRange__Group__0"


    // $ANTLR start "rule__CharacterRange__Group__0__Impl"
    // InternalXtext.g:9029:1: rule__CharacterRange__Group__0__Impl : ( ruleKeyword ) ;
    public final void rule__CharacterRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9033:1: ( ( ruleKeyword ) )
            // InternalXtext.g:9034:1: ( ruleKeyword )
            {
            // InternalXtext.g:9034:1: ( ruleKeyword )
            // InternalXtext.g:9035:1: ruleKeyword
            {
             before(grammarAccess.getCharacterRangeAccess().getKeywordParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleKeyword();

            state._fsp--;

             after(grammarAccess.getCharacterRangeAccess().getKeywordParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterRange__Group__0__Impl"


    // $ANTLR start "rule__CharacterRange__Group__1"
    // InternalXtext.g:9046:1: rule__CharacterRange__Group__1 : rule__CharacterRange__Group__1__Impl ;
    public final void rule__CharacterRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9050:1: ( rule__CharacterRange__Group__1__Impl )
            // InternalXtext.g:9051:2: rule__CharacterRange__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CharacterRange__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterRange__Group__1"


    // $ANTLR start "rule__CharacterRange__Group__1__Impl"
    // InternalXtext.g:9057:1: rule__CharacterRange__Group__1__Impl : ( ( rule__CharacterRange__Group_1__0 )? ) ;
    public final void rule__CharacterRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9061:1: ( ( ( rule__CharacterRange__Group_1__0 )? ) )
            // InternalXtext.g:9062:1: ( ( rule__CharacterRange__Group_1__0 )? )
            {
            // InternalXtext.g:9062:1: ( ( rule__CharacterRange__Group_1__0 )? )
            // InternalXtext.g:9063:1: ( rule__CharacterRange__Group_1__0 )?
            {
             before(grammarAccess.getCharacterRangeAccess().getGroup_1()); 
            // InternalXtext.g:9064:1: ( rule__CharacterRange__Group_1__0 )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==49) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalXtext.g:9064:2: rule__CharacterRange__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__CharacterRange__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCharacterRangeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterRange__Group__1__Impl"


    // $ANTLR start "rule__CharacterRange__Group_1__0"
    // InternalXtext.g:9078:1: rule__CharacterRange__Group_1__0 : rule__CharacterRange__Group_1__0__Impl rule__CharacterRange__Group_1__1 ;
    public final void rule__CharacterRange__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9082:1: ( rule__CharacterRange__Group_1__0__Impl rule__CharacterRange__Group_1__1 )
            // InternalXtext.g:9083:2: rule__CharacterRange__Group_1__0__Impl rule__CharacterRange__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_52);
            rule__CharacterRange__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__CharacterRange__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterRange__Group_1__0"


    // $ANTLR start "rule__CharacterRange__Group_1__0__Impl"
    // InternalXtext.g:9090:1: rule__CharacterRange__Group_1__0__Impl : ( () ) ;
    public final void rule__CharacterRange__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9094:1: ( ( () ) )
            // InternalXtext.g:9095:1: ( () )
            {
            // InternalXtext.g:9095:1: ( () )
            // InternalXtext.g:9096:1: ()
            {
             before(grammarAccess.getCharacterRangeAccess().getCharacterRangeLeftAction_1_0()); 
            // InternalXtext.g:9097:1: ()
            // InternalXtext.g:9099:1: 
            {
            }

             after(grammarAccess.getCharacterRangeAccess().getCharacterRangeLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterRange__Group_1__0__Impl"


    // $ANTLR start "rule__CharacterRange__Group_1__1"
    // InternalXtext.g:9109:1: rule__CharacterRange__Group_1__1 : rule__CharacterRange__Group_1__1__Impl rule__CharacterRange__Group_1__2 ;
    public final void rule__CharacterRange__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9113:1: ( rule__CharacterRange__Group_1__1__Impl rule__CharacterRange__Group_1__2 )
            // InternalXtext.g:9114:2: rule__CharacterRange__Group_1__1__Impl rule__CharacterRange__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__CharacterRange__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__CharacterRange__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterRange__Group_1__1"


    // $ANTLR start "rule__CharacterRange__Group_1__1__Impl"
    // InternalXtext.g:9121:1: rule__CharacterRange__Group_1__1__Impl : ( '..' ) ;
    public final void rule__CharacterRange__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9125:1: ( ( '..' ) )
            // InternalXtext.g:9126:1: ( '..' )
            {
            // InternalXtext.g:9126:1: ( '..' )
            // InternalXtext.g:9127:1: '..'
            {
             before(grammarAccess.getCharacterRangeAccess().getFullStopFullStopKeyword_1_1()); 
            match(input,49,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getCharacterRangeAccess().getFullStopFullStopKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterRange__Group_1__1__Impl"


    // $ANTLR start "rule__CharacterRange__Group_1__2"
    // InternalXtext.g:9140:1: rule__CharacterRange__Group_1__2 : rule__CharacterRange__Group_1__2__Impl ;
    public final void rule__CharacterRange__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9144:1: ( rule__CharacterRange__Group_1__2__Impl )
            // InternalXtext.g:9145:2: rule__CharacterRange__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CharacterRange__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterRange__Group_1__2"


    // $ANTLR start "rule__CharacterRange__Group_1__2__Impl"
    // InternalXtext.g:9151:1: rule__CharacterRange__Group_1__2__Impl : ( ( rule__CharacterRange__RightAssignment_1_2 ) ) ;
    public final void rule__CharacterRange__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9155:1: ( ( ( rule__CharacterRange__RightAssignment_1_2 ) ) )
            // InternalXtext.g:9156:1: ( ( rule__CharacterRange__RightAssignment_1_2 ) )
            {
            // InternalXtext.g:9156:1: ( ( rule__CharacterRange__RightAssignment_1_2 ) )
            // InternalXtext.g:9157:1: ( rule__CharacterRange__RightAssignment_1_2 )
            {
             before(grammarAccess.getCharacterRangeAccess().getRightAssignment_1_2()); 
            // InternalXtext.g:9158:1: ( rule__CharacterRange__RightAssignment_1_2 )
            // InternalXtext.g:9158:2: rule__CharacterRange__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CharacterRange__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getCharacterRangeAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterRange__Group_1__2__Impl"


    // $ANTLR start "rule__EnumRule__Group__0"
    // InternalXtext.g:9174:1: rule__EnumRule__Group__0 : rule__EnumRule__Group__0__Impl rule__EnumRule__Group__1 ;
    public final void rule__EnumRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9178:1: ( rule__EnumRule__Group__0__Impl rule__EnumRule__Group__1 )
            // InternalXtext.g:9179:2: rule__EnumRule__Group__0__Impl rule__EnumRule__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__EnumRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__Group__0"


    // $ANTLR start "rule__EnumRule__Group__0__Impl"
    // InternalXtext.g:9186:1: rule__EnumRule__Group__0__Impl : ( 'enum' ) ;
    public final void rule__EnumRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9190:1: ( ( 'enum' ) )
            // InternalXtext.g:9191:1: ( 'enum' )
            {
            // InternalXtext.g:9191:1: ( 'enum' )
            // InternalXtext.g:9192:1: 'enum'
            {
             before(grammarAccess.getEnumRuleAccess().getEnumKeyword_0()); 
            match(input,50,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEnumRuleAccess().getEnumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__Group__0__Impl"


    // $ANTLR start "rule__EnumRule__Group__1"
    // InternalXtext.g:9205:1: rule__EnumRule__Group__1 : rule__EnumRule__Group__1__Impl rule__EnumRule__Group__2 ;
    public final void rule__EnumRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9209:1: ( rule__EnumRule__Group__1__Impl rule__EnumRule__Group__2 )
            // InternalXtext.g:9210:2: rule__EnumRule__Group__1__Impl rule__EnumRule__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_53);
            rule__EnumRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__Group__1"


    // $ANTLR start "rule__EnumRule__Group__1__Impl"
    // InternalXtext.g:9217:1: rule__EnumRule__Group__1__Impl : ( ( rule__EnumRule__NameAssignment_1 ) ) ;
    public final void rule__EnumRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9221:1: ( ( ( rule__EnumRule__NameAssignment_1 ) ) )
            // InternalXtext.g:9222:1: ( ( rule__EnumRule__NameAssignment_1 ) )
            {
            // InternalXtext.g:9222:1: ( ( rule__EnumRule__NameAssignment_1 ) )
            // InternalXtext.g:9223:1: ( rule__EnumRule__NameAssignment_1 )
            {
             before(grammarAccess.getEnumRuleAccess().getNameAssignment_1()); 
            // InternalXtext.g:9224:1: ( rule__EnumRule__NameAssignment_1 )
            // InternalXtext.g:9224:2: rule__EnumRule__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumRule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumRuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__Group__1__Impl"


    // $ANTLR start "rule__EnumRule__Group__2"
    // InternalXtext.g:9234:1: rule__EnumRule__Group__2 : rule__EnumRule__Group__2__Impl rule__EnumRule__Group__3 ;
    public final void rule__EnumRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9238:1: ( rule__EnumRule__Group__2__Impl rule__EnumRule__Group__3 )
            // InternalXtext.g:9239:2: rule__EnumRule__Group__2__Impl rule__EnumRule__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_53);
            rule__EnumRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__Group__2"


    // $ANTLR start "rule__EnumRule__Group__2__Impl"
    // InternalXtext.g:9246:1: rule__EnumRule__Group__2__Impl : ( ( rule__EnumRule__Group_2__0 )? ) ;
    public final void rule__EnumRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9250:1: ( ( ( rule__EnumRule__Group_2__0 )? ) )
            // InternalXtext.g:9251:1: ( ( rule__EnumRule__Group_2__0 )? )
            {
            // InternalXtext.g:9251:1: ( ( rule__EnumRule__Group_2__0 )? )
            // InternalXtext.g:9252:1: ( rule__EnumRule__Group_2__0 )?
            {
             before(grammarAccess.getEnumRuleAccess().getGroup_2()); 
            // InternalXtext.g:9253:1: ( rule__EnumRule__Group_2__0 )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==34) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalXtext.g:9253:2: rule__EnumRule__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__EnumRule__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumRuleAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__Group__2__Impl"


    // $ANTLR start "rule__EnumRule__Group__3"
    // InternalXtext.g:9263:1: rule__EnumRule__Group__3 : rule__EnumRule__Group__3__Impl rule__EnumRule__Group__4 ;
    public final void rule__EnumRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9267:1: ( rule__EnumRule__Group__3__Impl rule__EnumRule__Group__4 )
            // InternalXtext.g:9268:2: rule__EnumRule__Group__3__Impl rule__EnumRule__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__EnumRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__Group__3"


    // $ANTLR start "rule__EnumRule__Group__3__Impl"
    // InternalXtext.g:9275:1: rule__EnumRule__Group__3__Impl : ( ':' ) ;
    public final void rule__EnumRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9279:1: ( ( ':' ) )
            // InternalXtext.g:9280:1: ( ':' )
            {
            // InternalXtext.g:9280:1: ( ':' )
            // InternalXtext.g:9281:1: ':'
            {
             before(grammarAccess.getEnumRuleAccess().getColonKeyword_3()); 
            match(input,11,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEnumRuleAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__Group__3__Impl"


    // $ANTLR start "rule__EnumRule__Group__4"
    // InternalXtext.g:9294:1: rule__EnumRule__Group__4 : rule__EnumRule__Group__4__Impl rule__EnumRule__Group__5 ;
    public final void rule__EnumRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9298:1: ( rule__EnumRule__Group__4__Impl rule__EnumRule__Group__5 )
            // InternalXtext.g:9299:2: rule__EnumRule__Group__4__Impl rule__EnumRule__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__EnumRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumRule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__Group__4"


    // $ANTLR start "rule__EnumRule__Group__4__Impl"
    // InternalXtext.g:9306:1: rule__EnumRule__Group__4__Impl : ( ( rule__EnumRule__AlternativesAssignment_4 ) ) ;
    public final void rule__EnumRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9310:1: ( ( ( rule__EnumRule__AlternativesAssignment_4 ) ) )
            // InternalXtext.g:9311:1: ( ( rule__EnumRule__AlternativesAssignment_4 ) )
            {
            // InternalXtext.g:9311:1: ( ( rule__EnumRule__AlternativesAssignment_4 ) )
            // InternalXtext.g:9312:1: ( rule__EnumRule__AlternativesAssignment_4 )
            {
             before(grammarAccess.getEnumRuleAccess().getAlternativesAssignment_4()); 
            // InternalXtext.g:9313:1: ( rule__EnumRule__AlternativesAssignment_4 )
            // InternalXtext.g:9313:2: rule__EnumRule__AlternativesAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumRule__AlternativesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEnumRuleAccess().getAlternativesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__Group__4__Impl"


    // $ANTLR start "rule__EnumRule__Group__5"
    // InternalXtext.g:9323:1: rule__EnumRule__Group__5 : rule__EnumRule__Group__5__Impl ;
    public final void rule__EnumRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9327:1: ( rule__EnumRule__Group__5__Impl )
            // InternalXtext.g:9328:2: rule__EnumRule__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumRule__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__Group__5"


    // $ANTLR start "rule__EnumRule__Group__5__Impl"
    // InternalXtext.g:9334:1: rule__EnumRule__Group__5__Impl : ( ';' ) ;
    public final void rule__EnumRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9338:1: ( ( ';' ) )
            // InternalXtext.g:9339:1: ( ';' )
            {
            // InternalXtext.g:9339:1: ( ';' )
            // InternalXtext.g:9340:1: ';'
            {
             before(grammarAccess.getEnumRuleAccess().getSemicolonKeyword_5()); 
            match(input,33,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEnumRuleAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__Group__5__Impl"


    // $ANTLR start "rule__EnumRule__Group_2__0"
    // InternalXtext.g:9365:1: rule__EnumRule__Group_2__0 : rule__EnumRule__Group_2__0__Impl rule__EnumRule__Group_2__1 ;
    public final void rule__EnumRule__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9369:1: ( rule__EnumRule__Group_2__0__Impl rule__EnumRule__Group_2__1 )
            // InternalXtext.g:9370:2: rule__EnumRule__Group_2__0__Impl rule__EnumRule__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__EnumRule__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumRule__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__Group_2__0"


    // $ANTLR start "rule__EnumRule__Group_2__0__Impl"
    // InternalXtext.g:9377:1: rule__EnumRule__Group_2__0__Impl : ( 'returns' ) ;
    public final void rule__EnumRule__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9381:1: ( ( 'returns' ) )
            // InternalXtext.g:9382:1: ( 'returns' )
            {
            // InternalXtext.g:9382:1: ( 'returns' )
            // InternalXtext.g:9383:1: 'returns'
            {
             before(grammarAccess.getEnumRuleAccess().getReturnsKeyword_2_0()); 
            match(input,34,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEnumRuleAccess().getReturnsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__Group_2__0__Impl"


    // $ANTLR start "rule__EnumRule__Group_2__1"
    // InternalXtext.g:9396:1: rule__EnumRule__Group_2__1 : rule__EnumRule__Group_2__1__Impl ;
    public final void rule__EnumRule__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9400:1: ( rule__EnumRule__Group_2__1__Impl )
            // InternalXtext.g:9401:2: rule__EnumRule__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumRule__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__Group_2__1"


    // $ANTLR start "rule__EnumRule__Group_2__1__Impl"
    // InternalXtext.g:9407:1: rule__EnumRule__Group_2__1__Impl : ( ( rule__EnumRule__TypeAssignment_2_1 ) ) ;
    public final void rule__EnumRule__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9411:1: ( ( ( rule__EnumRule__TypeAssignment_2_1 ) ) )
            // InternalXtext.g:9412:1: ( ( rule__EnumRule__TypeAssignment_2_1 ) )
            {
            // InternalXtext.g:9412:1: ( ( rule__EnumRule__TypeAssignment_2_1 ) )
            // InternalXtext.g:9413:1: ( rule__EnumRule__TypeAssignment_2_1 )
            {
             before(grammarAccess.getEnumRuleAccess().getTypeAssignment_2_1()); 
            // InternalXtext.g:9414:1: ( rule__EnumRule__TypeAssignment_2_1 )
            // InternalXtext.g:9414:2: rule__EnumRule__TypeAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumRule__TypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumRuleAccess().getTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__Group_2__1__Impl"


    // $ANTLR start "rule__EnumLiterals__Group__0"
    // InternalXtext.g:9428:1: rule__EnumLiterals__Group__0 : rule__EnumLiterals__Group__0__Impl rule__EnumLiterals__Group__1 ;
    public final void rule__EnumLiterals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9432:1: ( rule__EnumLiterals__Group__0__Impl rule__EnumLiterals__Group__1 )
            // InternalXtext.g:9433:2: rule__EnumLiterals__Group__0__Impl rule__EnumLiterals__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__EnumLiterals__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumLiterals__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiterals__Group__0"


    // $ANTLR start "rule__EnumLiterals__Group__0__Impl"
    // InternalXtext.g:9440:1: rule__EnumLiterals__Group__0__Impl : ( ruleEnumLiteralDeclaration ) ;
    public final void rule__EnumLiterals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9444:1: ( ( ruleEnumLiteralDeclaration ) )
            // InternalXtext.g:9445:1: ( ruleEnumLiteralDeclaration )
            {
            // InternalXtext.g:9445:1: ( ruleEnumLiteralDeclaration )
            // InternalXtext.g:9446:1: ruleEnumLiteralDeclaration
            {
             before(grammarAccess.getEnumLiteralsAccess().getEnumLiteralDeclarationParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEnumLiteralDeclaration();

            state._fsp--;

             after(grammarAccess.getEnumLiteralsAccess().getEnumLiteralDeclarationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiterals__Group__0__Impl"


    // $ANTLR start "rule__EnumLiterals__Group__1"
    // InternalXtext.g:9457:1: rule__EnumLiterals__Group__1 : rule__EnumLiterals__Group__1__Impl ;
    public final void rule__EnumLiterals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9461:1: ( rule__EnumLiterals__Group__1__Impl )
            // InternalXtext.g:9462:2: rule__EnumLiterals__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumLiterals__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiterals__Group__1"


    // $ANTLR start "rule__EnumLiterals__Group__1__Impl"
    // InternalXtext.g:9468:1: rule__EnumLiterals__Group__1__Impl : ( ( rule__EnumLiterals__Group_1__0 )? ) ;
    public final void rule__EnumLiterals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9472:1: ( ( ( rule__EnumLiterals__Group_1__0 )? ) )
            // InternalXtext.g:9473:1: ( ( rule__EnumLiterals__Group_1__0 )? )
            {
            // InternalXtext.g:9473:1: ( ( rule__EnumLiterals__Group_1__0 )? )
            // InternalXtext.g:9474:1: ( rule__EnumLiterals__Group_1__0 )?
            {
             before(grammarAccess.getEnumLiteralsAccess().getGroup_1()); 
            // InternalXtext.g:9475:1: ( rule__EnumLiterals__Group_1__0 )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==40) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalXtext.g:9475:2: rule__EnumLiterals__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__EnumLiterals__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumLiteralsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiterals__Group__1__Impl"


    // $ANTLR start "rule__EnumLiterals__Group_1__0"
    // InternalXtext.g:9489:1: rule__EnumLiterals__Group_1__0 : rule__EnumLiterals__Group_1__0__Impl rule__EnumLiterals__Group_1__1 ;
    public final void rule__EnumLiterals__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9493:1: ( rule__EnumLiterals__Group_1__0__Impl rule__EnumLiterals__Group_1__1 )
            // InternalXtext.g:9494:2: rule__EnumLiterals__Group_1__0__Impl rule__EnumLiterals__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__EnumLiterals__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumLiterals__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiterals__Group_1__0"


    // $ANTLR start "rule__EnumLiterals__Group_1__0__Impl"
    // InternalXtext.g:9501:1: rule__EnumLiterals__Group_1__0__Impl : ( () ) ;
    public final void rule__EnumLiterals__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9505:1: ( ( () ) )
            // InternalXtext.g:9506:1: ( () )
            {
            // InternalXtext.g:9506:1: ( () )
            // InternalXtext.g:9507:1: ()
            {
             before(grammarAccess.getEnumLiteralsAccess().getAlternativesElementsAction_1_0()); 
            // InternalXtext.g:9508:1: ()
            // InternalXtext.g:9510:1: 
            {
            }

             after(grammarAccess.getEnumLiteralsAccess().getAlternativesElementsAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiterals__Group_1__0__Impl"


    // $ANTLR start "rule__EnumLiterals__Group_1__1"
    // InternalXtext.g:9520:1: rule__EnumLiterals__Group_1__1 : rule__EnumLiterals__Group_1__1__Impl ;
    public final void rule__EnumLiterals__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9524:1: ( rule__EnumLiterals__Group_1__1__Impl )
            // InternalXtext.g:9525:2: rule__EnumLiterals__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumLiterals__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiterals__Group_1__1"


    // $ANTLR start "rule__EnumLiterals__Group_1__1__Impl"
    // InternalXtext.g:9531:1: rule__EnumLiterals__Group_1__1__Impl : ( ( ( rule__EnumLiterals__Group_1_1__0 ) ) ( ( rule__EnumLiterals__Group_1_1__0 )* ) ) ;
    public final void rule__EnumLiterals__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9535:1: ( ( ( ( rule__EnumLiterals__Group_1_1__0 ) ) ( ( rule__EnumLiterals__Group_1_1__0 )* ) ) )
            // InternalXtext.g:9536:1: ( ( ( rule__EnumLiterals__Group_1_1__0 ) ) ( ( rule__EnumLiterals__Group_1_1__0 )* ) )
            {
            // InternalXtext.g:9536:1: ( ( ( rule__EnumLiterals__Group_1_1__0 ) ) ( ( rule__EnumLiterals__Group_1_1__0 )* ) )
            // InternalXtext.g:9537:1: ( ( rule__EnumLiterals__Group_1_1__0 ) ) ( ( rule__EnumLiterals__Group_1_1__0 )* )
            {
            // InternalXtext.g:9537:1: ( ( rule__EnumLiterals__Group_1_1__0 ) )
            // InternalXtext.g:9538:1: ( rule__EnumLiterals__Group_1_1__0 )
            {
             before(grammarAccess.getEnumLiteralsAccess().getGroup_1_1()); 
            // InternalXtext.g:9539:1: ( rule__EnumLiterals__Group_1_1__0 )
            // InternalXtext.g:9539:2: rule__EnumLiterals__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_28);
            rule__EnumLiterals__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumLiteralsAccess().getGroup_1_1()); 

            }

            // InternalXtext.g:9542:1: ( ( rule__EnumLiterals__Group_1_1__0 )* )
            // InternalXtext.g:9543:1: ( rule__EnumLiterals__Group_1_1__0 )*
            {
             before(grammarAccess.getEnumLiteralsAccess().getGroup_1_1()); 
            // InternalXtext.g:9544:1: ( rule__EnumLiterals__Group_1_1__0 )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==40) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalXtext.g:9544:2: rule__EnumLiterals__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__EnumLiterals__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

             after(grammarAccess.getEnumLiteralsAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__EnumLiterals__Group_1__1__Impl"


    // $ANTLR start "rule__EnumLiterals__Group_1_1__0"
    // InternalXtext.g:9559:1: rule__EnumLiterals__Group_1_1__0 : rule__EnumLiterals__Group_1_1__0__Impl rule__EnumLiterals__Group_1_1__1 ;
    public final void rule__EnumLiterals__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9563:1: ( rule__EnumLiterals__Group_1_1__0__Impl rule__EnumLiterals__Group_1_1__1 )
            // InternalXtext.g:9564:2: rule__EnumLiterals__Group_1_1__0__Impl rule__EnumLiterals__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__EnumLiterals__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumLiterals__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiterals__Group_1_1__0"


    // $ANTLR start "rule__EnumLiterals__Group_1_1__0__Impl"
    // InternalXtext.g:9571:1: rule__EnumLiterals__Group_1_1__0__Impl : ( '|' ) ;
    public final void rule__EnumLiterals__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9575:1: ( ( '|' ) )
            // InternalXtext.g:9576:1: ( '|' )
            {
            // InternalXtext.g:9576:1: ( '|' )
            // InternalXtext.g:9577:1: '|'
            {
             before(grammarAccess.getEnumLiteralsAccess().getVerticalLineKeyword_1_1_0()); 
            match(input,40,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEnumLiteralsAccess().getVerticalLineKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiterals__Group_1_1__0__Impl"


    // $ANTLR start "rule__EnumLiterals__Group_1_1__1"
    // InternalXtext.g:9590:1: rule__EnumLiterals__Group_1_1__1 : rule__EnumLiterals__Group_1_1__1__Impl ;
    public final void rule__EnumLiterals__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9594:1: ( rule__EnumLiterals__Group_1_1__1__Impl )
            // InternalXtext.g:9595:2: rule__EnumLiterals__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumLiterals__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiterals__Group_1_1__1"


    // $ANTLR start "rule__EnumLiterals__Group_1_1__1__Impl"
    // InternalXtext.g:9601:1: rule__EnumLiterals__Group_1_1__1__Impl : ( ( rule__EnumLiterals__ElementsAssignment_1_1_1 ) ) ;
    public final void rule__EnumLiterals__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9605:1: ( ( ( rule__EnumLiterals__ElementsAssignment_1_1_1 ) ) )
            // InternalXtext.g:9606:1: ( ( rule__EnumLiterals__ElementsAssignment_1_1_1 ) )
            {
            // InternalXtext.g:9606:1: ( ( rule__EnumLiterals__ElementsAssignment_1_1_1 ) )
            // InternalXtext.g:9607:1: ( rule__EnumLiterals__ElementsAssignment_1_1_1 )
            {
             before(grammarAccess.getEnumLiteralsAccess().getElementsAssignment_1_1_1()); 
            // InternalXtext.g:9608:1: ( rule__EnumLiterals__ElementsAssignment_1_1_1 )
            // InternalXtext.g:9608:2: rule__EnumLiterals__ElementsAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumLiterals__ElementsAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumLiteralsAccess().getElementsAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiterals__Group_1_1__1__Impl"


    // $ANTLR start "rule__EnumLiteralDeclaration__Group__0"
    // InternalXtext.g:9622:1: rule__EnumLiteralDeclaration__Group__0 : rule__EnumLiteralDeclaration__Group__0__Impl rule__EnumLiteralDeclaration__Group__1 ;
    public final void rule__EnumLiteralDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9626:1: ( rule__EnumLiteralDeclaration__Group__0__Impl rule__EnumLiteralDeclaration__Group__1 )
            // InternalXtext.g:9627:2: rule__EnumLiteralDeclaration__Group__0__Impl rule__EnumLiteralDeclaration__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_40);
            rule__EnumLiteralDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumLiteralDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiteralDeclaration__Group__0"


    // $ANTLR start "rule__EnumLiteralDeclaration__Group__0__Impl"
    // InternalXtext.g:9634:1: rule__EnumLiteralDeclaration__Group__0__Impl : ( ( rule__EnumLiteralDeclaration__EnumLiteralAssignment_0 ) ) ;
    public final void rule__EnumLiteralDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9638:1: ( ( ( rule__EnumLiteralDeclaration__EnumLiteralAssignment_0 ) ) )
            // InternalXtext.g:9639:1: ( ( rule__EnumLiteralDeclaration__EnumLiteralAssignment_0 ) )
            {
            // InternalXtext.g:9639:1: ( ( rule__EnumLiteralDeclaration__EnumLiteralAssignment_0 ) )
            // InternalXtext.g:9640:1: ( rule__EnumLiteralDeclaration__EnumLiteralAssignment_0 )
            {
             before(grammarAccess.getEnumLiteralDeclarationAccess().getEnumLiteralAssignment_0()); 
            // InternalXtext.g:9641:1: ( rule__EnumLiteralDeclaration__EnumLiteralAssignment_0 )
            // InternalXtext.g:9641:2: rule__EnumLiteralDeclaration__EnumLiteralAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumLiteralDeclaration__EnumLiteralAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEnumLiteralDeclarationAccess().getEnumLiteralAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiteralDeclaration__Group__0__Impl"


    // $ANTLR start "rule__EnumLiteralDeclaration__Group__1"
    // InternalXtext.g:9651:1: rule__EnumLiteralDeclaration__Group__1 : rule__EnumLiteralDeclaration__Group__1__Impl ;
    public final void rule__EnumLiteralDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9655:1: ( rule__EnumLiteralDeclaration__Group__1__Impl )
            // InternalXtext.g:9656:2: rule__EnumLiteralDeclaration__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumLiteralDeclaration__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiteralDeclaration__Group__1"


    // $ANTLR start "rule__EnumLiteralDeclaration__Group__1__Impl"
    // InternalXtext.g:9662:1: rule__EnumLiteralDeclaration__Group__1__Impl : ( ( rule__EnumLiteralDeclaration__Group_1__0 )? ) ;
    public final void rule__EnumLiteralDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9666:1: ( ( ( rule__EnumLiteralDeclaration__Group_1__0 )? ) )
            // InternalXtext.g:9667:1: ( ( rule__EnumLiteralDeclaration__Group_1__0 )? )
            {
            // InternalXtext.g:9667:1: ( ( rule__EnumLiteralDeclaration__Group_1__0 )? )
            // InternalXtext.g:9668:1: ( rule__EnumLiteralDeclaration__Group_1__0 )?
            {
             before(grammarAccess.getEnumLiteralDeclarationAccess().getGroup_1()); 
            // InternalXtext.g:9669:1: ( rule__EnumLiteralDeclaration__Group_1__0 )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==18) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalXtext.g:9669:2: rule__EnumLiteralDeclaration__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__EnumLiteralDeclaration__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumLiteralDeclarationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiteralDeclaration__Group__1__Impl"


    // $ANTLR start "rule__EnumLiteralDeclaration__Group_1__0"
    // InternalXtext.g:9683:1: rule__EnumLiteralDeclaration__Group_1__0 : rule__EnumLiteralDeclaration__Group_1__0__Impl rule__EnumLiteralDeclaration__Group_1__1 ;
    public final void rule__EnumLiteralDeclaration__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9687:1: ( rule__EnumLiteralDeclaration__Group_1__0__Impl rule__EnumLiteralDeclaration__Group_1__1 )
            // InternalXtext.g:9688:2: rule__EnumLiteralDeclaration__Group_1__0__Impl rule__EnumLiteralDeclaration__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__EnumLiteralDeclaration__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumLiteralDeclaration__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiteralDeclaration__Group_1__0"


    // $ANTLR start "rule__EnumLiteralDeclaration__Group_1__0__Impl"
    // InternalXtext.g:9695:1: rule__EnumLiteralDeclaration__Group_1__0__Impl : ( '=' ) ;
    public final void rule__EnumLiteralDeclaration__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9699:1: ( ( '=' ) )
            // InternalXtext.g:9700:1: ( '=' )
            {
            // InternalXtext.g:9700:1: ( '=' )
            // InternalXtext.g:9701:1: '='
            {
             before(grammarAccess.getEnumLiteralDeclarationAccess().getEqualsSignKeyword_1_0()); 
            match(input,18,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEnumLiteralDeclarationAccess().getEqualsSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiteralDeclaration__Group_1__0__Impl"


    // $ANTLR start "rule__EnumLiteralDeclaration__Group_1__1"
    // InternalXtext.g:9714:1: rule__EnumLiteralDeclaration__Group_1__1 : rule__EnumLiteralDeclaration__Group_1__1__Impl ;
    public final void rule__EnumLiteralDeclaration__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9718:1: ( rule__EnumLiteralDeclaration__Group_1__1__Impl )
            // InternalXtext.g:9719:2: rule__EnumLiteralDeclaration__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumLiteralDeclaration__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiteralDeclaration__Group_1__1"


    // $ANTLR start "rule__EnumLiteralDeclaration__Group_1__1__Impl"
    // InternalXtext.g:9725:1: rule__EnumLiteralDeclaration__Group_1__1__Impl : ( ( rule__EnumLiteralDeclaration__LiteralAssignment_1_1 ) ) ;
    public final void rule__EnumLiteralDeclaration__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9729:1: ( ( ( rule__EnumLiteralDeclaration__LiteralAssignment_1_1 ) ) )
            // InternalXtext.g:9730:1: ( ( rule__EnumLiteralDeclaration__LiteralAssignment_1_1 ) )
            {
            // InternalXtext.g:9730:1: ( ( rule__EnumLiteralDeclaration__LiteralAssignment_1_1 ) )
            // InternalXtext.g:9731:1: ( rule__EnumLiteralDeclaration__LiteralAssignment_1_1 )
            {
             before(grammarAccess.getEnumLiteralDeclarationAccess().getLiteralAssignment_1_1()); 
            // InternalXtext.g:9732:1: ( rule__EnumLiteralDeclaration__LiteralAssignment_1_1 )
            // InternalXtext.g:9732:2: rule__EnumLiteralDeclaration__LiteralAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumLiteralDeclaration__LiteralAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumLiteralDeclarationAccess().getLiteralAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiteralDeclaration__Group_1__1__Impl"


    // $ANTLR start "rule__Grammar__NameAssignment_1"
    // InternalXtext.g:9747:1: rule__Grammar__NameAssignment_1 : ( ruleGrammarID ) ;
    public final void rule__Grammar__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9751:1: ( ( ruleGrammarID ) )
            // InternalXtext.g:9752:1: ( ruleGrammarID )
            {
            // InternalXtext.g:9752:1: ( ruleGrammarID )
            // InternalXtext.g:9753:1: ruleGrammarID
            {
             before(grammarAccess.getGrammarAccess().getNameGrammarIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGrammarID();

            state._fsp--;

             after(grammarAccess.getGrammarAccess().getNameGrammarIDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__NameAssignment_1"


    // $ANTLR start "rule__Grammar__UsedGrammarsAssignment_2_1"
    // InternalXtext.g:9762:1: rule__Grammar__UsedGrammarsAssignment_2_1 : ( ( ruleGrammarID ) ) ;
    public final void rule__Grammar__UsedGrammarsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9766:1: ( ( ( ruleGrammarID ) ) )
            // InternalXtext.g:9767:1: ( ( ruleGrammarID ) )
            {
            // InternalXtext.g:9767:1: ( ( ruleGrammarID ) )
            // InternalXtext.g:9768:1: ( ruleGrammarID )
            {
             before(grammarAccess.getGrammarAccess().getUsedGrammarsGrammarCrossReference_2_1_0()); 
            // InternalXtext.g:9769:1: ( ruleGrammarID )
            // InternalXtext.g:9770:1: ruleGrammarID
            {
             before(grammarAccess.getGrammarAccess().getUsedGrammarsGrammarGrammarIDParserRuleCall_2_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGrammarID();

            state._fsp--;

             after(grammarAccess.getGrammarAccess().getUsedGrammarsGrammarGrammarIDParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getGrammarAccess().getUsedGrammarsGrammarCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__UsedGrammarsAssignment_2_1"


    // $ANTLR start "rule__Grammar__UsedGrammarsAssignment_2_2_1"
    // InternalXtext.g:9781:1: rule__Grammar__UsedGrammarsAssignment_2_2_1 : ( ( ruleGrammarID ) ) ;
    public final void rule__Grammar__UsedGrammarsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9785:1: ( ( ( ruleGrammarID ) ) )
            // InternalXtext.g:9786:1: ( ( ruleGrammarID ) )
            {
            // InternalXtext.g:9786:1: ( ( ruleGrammarID ) )
            // InternalXtext.g:9787:1: ( ruleGrammarID )
            {
             before(grammarAccess.getGrammarAccess().getUsedGrammarsGrammarCrossReference_2_2_1_0()); 
            // InternalXtext.g:9788:1: ( ruleGrammarID )
            // InternalXtext.g:9789:1: ruleGrammarID
            {
             before(grammarAccess.getGrammarAccess().getUsedGrammarsGrammarGrammarIDParserRuleCall_2_2_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGrammarID();

            state._fsp--;

             after(grammarAccess.getGrammarAccess().getUsedGrammarsGrammarGrammarIDParserRuleCall_2_2_1_0_1()); 

            }

             after(grammarAccess.getGrammarAccess().getUsedGrammarsGrammarCrossReference_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__UsedGrammarsAssignment_2_2_1"


    // $ANTLR start "rule__Grammar__DefinesHiddenTokensAssignment_3_0"
    // InternalXtext.g:9800:1: rule__Grammar__DefinesHiddenTokensAssignment_3_0 : ( ( 'hidden' ) ) ;
    public final void rule__Grammar__DefinesHiddenTokensAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9804:1: ( ( ( 'hidden' ) ) )
            // InternalXtext.g:9805:1: ( ( 'hidden' ) )
            {
            // InternalXtext.g:9805:1: ( ( 'hidden' ) )
            // InternalXtext.g:9806:1: ( 'hidden' )
            {
             before(grammarAccess.getGrammarAccess().getDefinesHiddenTokensHiddenKeyword_3_0_0()); 
            // InternalXtext.g:9807:1: ( 'hidden' )
            // InternalXtext.g:9808:1: 'hidden'
            {
             before(grammarAccess.getGrammarAccess().getDefinesHiddenTokensHiddenKeyword_3_0_0()); 
            match(input,51,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getGrammarAccess().getDefinesHiddenTokensHiddenKeyword_3_0_0()); 

            }

             after(grammarAccess.getGrammarAccess().getDefinesHiddenTokensHiddenKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__DefinesHiddenTokensAssignment_3_0"


    // $ANTLR start "rule__Grammar__HiddenTokensAssignment_3_2_0"
    // InternalXtext.g:9823:1: rule__Grammar__HiddenTokensAssignment_3_2_0 : ( ( ruleRuleID ) ) ;
    public final void rule__Grammar__HiddenTokensAssignment_3_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9827:1: ( ( ( ruleRuleID ) ) )
            // InternalXtext.g:9828:1: ( ( ruleRuleID ) )
            {
            // InternalXtext.g:9828:1: ( ( ruleRuleID ) )
            // InternalXtext.g:9829:1: ( ruleRuleID )
            {
             before(grammarAccess.getGrammarAccess().getHiddenTokensAbstractRuleCrossReference_3_2_0_0()); 
            // InternalXtext.g:9830:1: ( ruleRuleID )
            // InternalXtext.g:9831:1: ruleRuleID
            {
             before(grammarAccess.getGrammarAccess().getHiddenTokensAbstractRuleRuleIDParserRuleCall_3_2_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRuleID();

            state._fsp--;

             after(grammarAccess.getGrammarAccess().getHiddenTokensAbstractRuleRuleIDParserRuleCall_3_2_0_0_1()); 

            }

             after(grammarAccess.getGrammarAccess().getHiddenTokensAbstractRuleCrossReference_3_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__HiddenTokensAssignment_3_2_0"


    // $ANTLR start "rule__Grammar__HiddenTokensAssignment_3_2_1_1"
    // InternalXtext.g:9842:1: rule__Grammar__HiddenTokensAssignment_3_2_1_1 : ( ( ruleRuleID ) ) ;
    public final void rule__Grammar__HiddenTokensAssignment_3_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9846:1: ( ( ( ruleRuleID ) ) )
            // InternalXtext.g:9847:1: ( ( ruleRuleID ) )
            {
            // InternalXtext.g:9847:1: ( ( ruleRuleID ) )
            // InternalXtext.g:9848:1: ( ruleRuleID )
            {
             before(grammarAccess.getGrammarAccess().getHiddenTokensAbstractRuleCrossReference_3_2_1_1_0()); 
            // InternalXtext.g:9849:1: ( ruleRuleID )
            // InternalXtext.g:9850:1: ruleRuleID
            {
             before(grammarAccess.getGrammarAccess().getHiddenTokensAbstractRuleRuleIDParserRuleCall_3_2_1_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRuleID();

            state._fsp--;

             after(grammarAccess.getGrammarAccess().getHiddenTokensAbstractRuleRuleIDParserRuleCall_3_2_1_1_0_1()); 

            }

             after(grammarAccess.getGrammarAccess().getHiddenTokensAbstractRuleCrossReference_3_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__HiddenTokensAssignment_3_2_1_1"


    // $ANTLR start "rule__Grammar__MetamodelDeclarationsAssignment_4"
    // InternalXtext.g:9861:1: rule__Grammar__MetamodelDeclarationsAssignment_4 : ( ruleAbstractMetamodelDeclaration ) ;
    public final void rule__Grammar__MetamodelDeclarationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9865:1: ( ( ruleAbstractMetamodelDeclaration ) )
            // InternalXtext.g:9866:1: ( ruleAbstractMetamodelDeclaration )
            {
            // InternalXtext.g:9866:1: ( ruleAbstractMetamodelDeclaration )
            // InternalXtext.g:9867:1: ruleAbstractMetamodelDeclaration
            {
             before(grammarAccess.getGrammarAccess().getMetamodelDeclarationsAbstractMetamodelDeclarationParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAbstractMetamodelDeclaration();

            state._fsp--;

             after(grammarAccess.getGrammarAccess().getMetamodelDeclarationsAbstractMetamodelDeclarationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__MetamodelDeclarationsAssignment_4"


    // $ANTLR start "rule__Grammar__RulesAssignment_5"
    // InternalXtext.g:9876:1: rule__Grammar__RulesAssignment_5 : ( ruleAbstractRule ) ;
    public final void rule__Grammar__RulesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9880:1: ( ( ruleAbstractRule ) )
            // InternalXtext.g:9881:1: ( ruleAbstractRule )
            {
            // InternalXtext.g:9881:1: ( ruleAbstractRule )
            // InternalXtext.g:9882:1: ruleAbstractRule
            {
             before(grammarAccess.getGrammarAccess().getRulesAbstractRuleParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAbstractRule();

            state._fsp--;

             after(grammarAccess.getGrammarAccess().getRulesAbstractRuleParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__RulesAssignment_5"


    // $ANTLR start "rule__GeneratedMetamodel__NameAssignment_1"
    // InternalXtext.g:9891:1: rule__GeneratedMetamodel__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__GeneratedMetamodel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9895:1: ( ( ruleValidID ) )
            // InternalXtext.g:9896:1: ( ruleValidID )
            {
            // InternalXtext.g:9896:1: ( ruleValidID )
            // InternalXtext.g:9897:1: ruleValidID
            {
             before(grammarAccess.getGeneratedMetamodelAccess().getNameValidIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getGeneratedMetamodelAccess().getNameValidIDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratedMetamodel__NameAssignment_1"


    // $ANTLR start "rule__GeneratedMetamodel__EPackageAssignment_2"
    // InternalXtext.g:9906:1: rule__GeneratedMetamodel__EPackageAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__GeneratedMetamodel__EPackageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9910:1: ( ( ( RULE_STRING ) ) )
            // InternalXtext.g:9911:1: ( ( RULE_STRING ) )
            {
            // InternalXtext.g:9911:1: ( ( RULE_STRING ) )
            // InternalXtext.g:9912:1: ( RULE_STRING )
            {
             before(grammarAccess.getGeneratedMetamodelAccess().getEPackageEPackageCrossReference_2_0()); 
            // InternalXtext.g:9913:1: ( RULE_STRING )
            // InternalXtext.g:9914:1: RULE_STRING
            {
             before(grammarAccess.getGeneratedMetamodelAccess().getEPackageEPackageSTRINGTerminalRuleCall_2_0_1()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getGeneratedMetamodelAccess().getEPackageEPackageSTRINGTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getGeneratedMetamodelAccess().getEPackageEPackageCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratedMetamodel__EPackageAssignment_2"


    // $ANTLR start "rule__GeneratedMetamodel__AliasAssignment_3_1"
    // InternalXtext.g:9925:1: rule__GeneratedMetamodel__AliasAssignment_3_1 : ( ruleValidID ) ;
    public final void rule__GeneratedMetamodel__AliasAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9929:1: ( ( ruleValidID ) )
            // InternalXtext.g:9930:1: ( ruleValidID )
            {
            // InternalXtext.g:9930:1: ( ruleValidID )
            // InternalXtext.g:9931:1: ruleValidID
            {
             before(grammarAccess.getGeneratedMetamodelAccess().getAliasValidIDParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getGeneratedMetamodelAccess().getAliasValidIDParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratedMetamodel__AliasAssignment_3_1"


    // $ANTLR start "rule__ReferencedMetamodel__EPackageAssignment_1"
    // InternalXtext.g:9940:1: rule__ReferencedMetamodel__EPackageAssignment_1 : ( ( RULE_STRING ) ) ;
    public final void rule__ReferencedMetamodel__EPackageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9944:1: ( ( ( RULE_STRING ) ) )
            // InternalXtext.g:9945:1: ( ( RULE_STRING ) )
            {
            // InternalXtext.g:9945:1: ( ( RULE_STRING ) )
            // InternalXtext.g:9946:1: ( RULE_STRING )
            {
             before(grammarAccess.getReferencedMetamodelAccess().getEPackageEPackageCrossReference_1_0()); 
            // InternalXtext.g:9947:1: ( RULE_STRING )
            // InternalXtext.g:9948:1: RULE_STRING
            {
             before(grammarAccess.getReferencedMetamodelAccess().getEPackageEPackageSTRINGTerminalRuleCall_1_0_1()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getReferencedMetamodelAccess().getEPackageEPackageSTRINGTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getReferencedMetamodelAccess().getEPackageEPackageCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencedMetamodel__EPackageAssignment_1"


    // $ANTLR start "rule__ReferencedMetamodel__AliasAssignment_2_1"
    // InternalXtext.g:9959:1: rule__ReferencedMetamodel__AliasAssignment_2_1 : ( ruleValidID ) ;
    public final void rule__ReferencedMetamodel__AliasAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9963:1: ( ( ruleValidID ) )
            // InternalXtext.g:9964:1: ( ruleValidID )
            {
            // InternalXtext.g:9964:1: ( ruleValidID )
            // InternalXtext.g:9965:1: ruleValidID
            {
             before(grammarAccess.getReferencedMetamodelAccess().getAliasValidIDParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getReferencedMetamodelAccess().getAliasValidIDParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencedMetamodel__AliasAssignment_2_1"


    // $ANTLR start "rule__ParserRule__FragmentAssignment_0_0_0"
    // InternalXtext.g:9974:1: rule__ParserRule__FragmentAssignment_0_0_0 : ( ( 'fragment' ) ) ;
    public final void rule__ParserRule__FragmentAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:9978:1: ( ( ( 'fragment' ) ) )
            // InternalXtext.g:9979:1: ( ( 'fragment' ) )
            {
            // InternalXtext.g:9979:1: ( ( 'fragment' ) )
            // InternalXtext.g:9980:1: ( 'fragment' )
            {
             before(grammarAccess.getParserRuleAccess().getFragmentFragmentKeyword_0_0_0_0()); 
            // InternalXtext.g:9981:1: ( 'fragment' )
            // InternalXtext.g:9982:1: 'fragment'
            {
             before(grammarAccess.getParserRuleAccess().getFragmentFragmentKeyword_0_0_0_0()); 
            match(input,52,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParserRuleAccess().getFragmentFragmentKeyword_0_0_0_0()); 

            }

             after(grammarAccess.getParserRuleAccess().getFragmentFragmentKeyword_0_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__FragmentAssignment_0_0_0"


    // $ANTLR start "rule__ParserRule__WildcardAssignment_0_0_2_0"
    // InternalXtext.g:9997:1: rule__ParserRule__WildcardAssignment_0_0_2_0 : ( ( '*' ) ) ;
    public final void rule__ParserRule__WildcardAssignment_0_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10001:1: ( ( ( '*' ) ) )
            // InternalXtext.g:10002:1: ( ( '*' ) )
            {
            // InternalXtext.g:10002:1: ( ( '*' ) )
            // InternalXtext.g:10003:1: ( '*' )
            {
             before(grammarAccess.getParserRuleAccess().getWildcardAsteriskKeyword_0_0_2_0_0()); 
            // InternalXtext.g:10004:1: ( '*' )
            // InternalXtext.g:10005:1: '*'
            {
             before(grammarAccess.getParserRuleAccess().getWildcardAsteriskKeyword_0_0_2_0_0()); 
            match(input,16,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParserRuleAccess().getWildcardAsteriskKeyword_0_0_2_0_0()); 

            }

             after(grammarAccess.getParserRuleAccess().getWildcardAsteriskKeyword_0_0_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__WildcardAssignment_0_0_2_0"


    // $ANTLR start "rule__ParserRule__TypeAssignment_0_0_2_1_1"
    // InternalXtext.g:10020:1: rule__ParserRule__TypeAssignment_0_0_2_1_1 : ( ruleTypeRef ) ;
    public final void rule__ParserRule__TypeAssignment_0_0_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10024:1: ( ( ruleTypeRef ) )
            // InternalXtext.g:10025:1: ( ruleTypeRef )
            {
            // InternalXtext.g:10025:1: ( ruleTypeRef )
            // InternalXtext.g:10026:1: ruleTypeRef
            {
             before(grammarAccess.getParserRuleAccess().getTypeTypeRefParserRuleCall_0_0_2_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getParserRuleAccess().getTypeTypeRefParserRuleCall_0_0_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__TypeAssignment_0_0_2_1_1"


    // $ANTLR start "rule__ParserRule__TypeAssignment_0_1_1_1"
    // InternalXtext.g:10035:1: rule__ParserRule__TypeAssignment_0_1_1_1 : ( ruleTypeRef ) ;
    public final void rule__ParserRule__TypeAssignment_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10039:1: ( ( ruleTypeRef ) )
            // InternalXtext.g:10040:1: ( ruleTypeRef )
            {
            // InternalXtext.g:10040:1: ( ruleTypeRef )
            // InternalXtext.g:10041:1: ruleTypeRef
            {
             before(grammarAccess.getParserRuleAccess().getTypeTypeRefParserRuleCall_0_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getParserRuleAccess().getTypeTypeRefParserRuleCall_0_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__TypeAssignment_0_1_1_1"


    // $ANTLR start "rule__ParserRule__DefinesHiddenTokensAssignment_2_0"
    // InternalXtext.g:10050:1: rule__ParserRule__DefinesHiddenTokensAssignment_2_0 : ( ( 'hidden' ) ) ;
    public final void rule__ParserRule__DefinesHiddenTokensAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10054:1: ( ( ( 'hidden' ) ) )
            // InternalXtext.g:10055:1: ( ( 'hidden' ) )
            {
            // InternalXtext.g:10055:1: ( ( 'hidden' ) )
            // InternalXtext.g:10056:1: ( 'hidden' )
            {
             before(grammarAccess.getParserRuleAccess().getDefinesHiddenTokensHiddenKeyword_2_0_0()); 
            // InternalXtext.g:10057:1: ( 'hidden' )
            // InternalXtext.g:10058:1: 'hidden'
            {
             before(grammarAccess.getParserRuleAccess().getDefinesHiddenTokensHiddenKeyword_2_0_0()); 
            match(input,51,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParserRuleAccess().getDefinesHiddenTokensHiddenKeyword_2_0_0()); 

            }

             after(grammarAccess.getParserRuleAccess().getDefinesHiddenTokensHiddenKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__DefinesHiddenTokensAssignment_2_0"


    // $ANTLR start "rule__ParserRule__HiddenTokensAssignment_2_2_0"
    // InternalXtext.g:10073:1: rule__ParserRule__HiddenTokensAssignment_2_2_0 : ( ( ruleRuleID ) ) ;
    public final void rule__ParserRule__HiddenTokensAssignment_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10077:1: ( ( ( ruleRuleID ) ) )
            // InternalXtext.g:10078:1: ( ( ruleRuleID ) )
            {
            // InternalXtext.g:10078:1: ( ( ruleRuleID ) )
            // InternalXtext.g:10079:1: ( ruleRuleID )
            {
             before(grammarAccess.getParserRuleAccess().getHiddenTokensAbstractRuleCrossReference_2_2_0_0()); 
            // InternalXtext.g:10080:1: ( ruleRuleID )
            // InternalXtext.g:10081:1: ruleRuleID
            {
             before(grammarAccess.getParserRuleAccess().getHiddenTokensAbstractRuleRuleIDParserRuleCall_2_2_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRuleID();

            state._fsp--;

             after(grammarAccess.getParserRuleAccess().getHiddenTokensAbstractRuleRuleIDParserRuleCall_2_2_0_0_1()); 

            }

             after(grammarAccess.getParserRuleAccess().getHiddenTokensAbstractRuleCrossReference_2_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__HiddenTokensAssignment_2_2_0"


    // $ANTLR start "rule__ParserRule__HiddenTokensAssignment_2_2_1_1"
    // InternalXtext.g:10092:1: rule__ParserRule__HiddenTokensAssignment_2_2_1_1 : ( ( ruleRuleID ) ) ;
    public final void rule__ParserRule__HiddenTokensAssignment_2_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10096:1: ( ( ( ruleRuleID ) ) )
            // InternalXtext.g:10097:1: ( ( ruleRuleID ) )
            {
            // InternalXtext.g:10097:1: ( ( ruleRuleID ) )
            // InternalXtext.g:10098:1: ( ruleRuleID )
            {
             before(grammarAccess.getParserRuleAccess().getHiddenTokensAbstractRuleCrossReference_2_2_1_1_0()); 
            // InternalXtext.g:10099:1: ( ruleRuleID )
            // InternalXtext.g:10100:1: ruleRuleID
            {
             before(grammarAccess.getParserRuleAccess().getHiddenTokensAbstractRuleRuleIDParserRuleCall_2_2_1_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRuleID();

            state._fsp--;

             after(grammarAccess.getParserRuleAccess().getHiddenTokensAbstractRuleRuleIDParserRuleCall_2_2_1_1_0_1()); 

            }

             after(grammarAccess.getParserRuleAccess().getHiddenTokensAbstractRuleCrossReference_2_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__HiddenTokensAssignment_2_2_1_1"


    // $ANTLR start "rule__ParserRule__InitAfterActionsAssignment_3"
    // InternalXtext.g:10111:1: rule__ParserRule__InitAfterActionsAssignment_3 : ( ruleMyInitAfterActions ) ;
    public final void rule__ParserRule__InitAfterActionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10115:1: ( ( ruleMyInitAfterActions ) )
            // InternalXtext.g:10116:1: ( ruleMyInitAfterActions )
            {
            // InternalXtext.g:10116:1: ( ruleMyInitAfterActions )
            // InternalXtext.g:10117:1: ruleMyInitAfterActions
            {
             before(grammarAccess.getParserRuleAccess().getInitAfterActionsMyInitAfterActionsParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMyInitAfterActions();

            state._fsp--;

             after(grammarAccess.getParserRuleAccess().getInitAfterActionsMyInitAfterActionsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__InitAfterActionsAssignment_3"


    // $ANTLR start "rule__ParserRule__AlternativesAssignment_5"
    // InternalXtext.g:10126:1: rule__ParserRule__AlternativesAssignment_5 : ( ruleAlternatives ) ;
    public final void rule__ParserRule__AlternativesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10130:1: ( ( ruleAlternatives ) )
            // InternalXtext.g:10131:1: ( ruleAlternatives )
            {
            // InternalXtext.g:10131:1: ( ruleAlternatives )
            // InternalXtext.g:10132:1: ruleAlternatives
            {
             before(grammarAccess.getParserRuleAccess().getAlternativesAlternativesParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAlternatives();

            state._fsp--;

             after(grammarAccess.getParserRuleAccess().getAlternativesAlternativesParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserRule__AlternativesAssignment_5"


    // $ANTLR start "rule__RuleNameAndParams__NameAssignment_0"
    // InternalXtext.g:10141:1: rule__RuleNameAndParams__NameAssignment_0 : ( ruleValidID ) ;
    public final void rule__RuleNameAndParams__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10145:1: ( ( ruleValidID ) )
            // InternalXtext.g:10146:1: ( ruleValidID )
            {
            // InternalXtext.g:10146:1: ( ruleValidID )
            // InternalXtext.g:10147:1: ruleValidID
            {
             before(grammarAccess.getRuleNameAndParamsAccess().getNameValidIDParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getRuleNameAndParamsAccess().getNameValidIDParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__NameAssignment_0"


    // $ANTLR start "rule__RuleNameAndParams__ParametersAssignment_1_1_0"
    // InternalXtext.g:10156:1: rule__RuleNameAndParams__ParametersAssignment_1_1_0 : ( ruleParameter ) ;
    public final void rule__RuleNameAndParams__ParametersAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10160:1: ( ( ruleParameter ) )
            // InternalXtext.g:10161:1: ( ruleParameter )
            {
            // InternalXtext.g:10161:1: ( ruleParameter )
            // InternalXtext.g:10162:1: ruleParameter
            {
             before(grammarAccess.getRuleNameAndParamsAccess().getParametersParameterParserRuleCall_1_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getRuleNameAndParamsAccess().getParametersParameterParserRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__ParametersAssignment_1_1_0"


    // $ANTLR start "rule__RuleNameAndParams__ParametersAssignment_1_1_1_1"
    // InternalXtext.g:10171:1: rule__RuleNameAndParams__ParametersAssignment_1_1_1_1 : ( ruleParameter ) ;
    public final void rule__RuleNameAndParams__ParametersAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10175:1: ( ( ruleParameter ) )
            // InternalXtext.g:10176:1: ( ruleParameter )
            {
            // InternalXtext.g:10176:1: ( ruleParameter )
            // InternalXtext.g:10177:1: ruleParameter
            {
             before(grammarAccess.getRuleNameAndParamsAccess().getParametersParameterParserRuleCall_1_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getRuleNameAndParamsAccess().getParametersParameterParserRuleCall_1_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleNameAndParams__ParametersAssignment_1_1_1_1"


    // $ANTLR start "rule__Parameter__NameAssignment"
    // InternalXtext.g:10186:1: rule__Parameter__NameAssignment : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10190:1: ( ( RULE_ID ) )
            // InternalXtext.g:10191:1: ( RULE_ID )
            {
            // InternalXtext.g:10191:1: ( RULE_ID )
            // InternalXtext.g:10192:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment"


    // $ANTLR start "rule__TypeRef__MetamodelAssignment_0_0"
    // InternalXtext.g:10201:1: rule__TypeRef__MetamodelAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__TypeRef__MetamodelAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10205:1: ( ( ( RULE_ID ) ) )
            // InternalXtext.g:10206:1: ( ( RULE_ID ) )
            {
            // InternalXtext.g:10206:1: ( ( RULE_ID ) )
            // InternalXtext.g:10207:1: ( RULE_ID )
            {
             before(grammarAccess.getTypeRefAccess().getMetamodelAbstractMetamodelDeclarationCrossReference_0_0_0()); 
            // InternalXtext.g:10208:1: ( RULE_ID )
            // InternalXtext.g:10209:1: RULE_ID
            {
             before(grammarAccess.getTypeRefAccess().getMetamodelAbstractMetamodelDeclarationIDTerminalRuleCall_0_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTypeRefAccess().getMetamodelAbstractMetamodelDeclarationIDTerminalRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getTypeRefAccess().getMetamodelAbstractMetamodelDeclarationCrossReference_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__MetamodelAssignment_0_0"


    // $ANTLR start "rule__TypeRef__ClassifierAssignment_1"
    // InternalXtext.g:10220:1: rule__TypeRef__ClassifierAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__TypeRef__ClassifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10224:1: ( ( ( RULE_ID ) ) )
            // InternalXtext.g:10225:1: ( ( RULE_ID ) )
            {
            // InternalXtext.g:10225:1: ( ( RULE_ID ) )
            // InternalXtext.g:10226:1: ( RULE_ID )
            {
             before(grammarAccess.getTypeRefAccess().getClassifierEClassifierCrossReference_1_0()); 
            // InternalXtext.g:10227:1: ( RULE_ID )
            // InternalXtext.g:10228:1: RULE_ID
            {
             before(grammarAccess.getTypeRefAccess().getClassifierEClassifierIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTypeRefAccess().getClassifierEClassifierIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getTypeRefAccess().getClassifierEClassifierCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__ClassifierAssignment_1"


    // $ANTLR start "rule__Alternatives__ElementsAssignment_1_1_1"
    // InternalXtext.g:10239:1: rule__Alternatives__ElementsAssignment_1_1_1 : ( ruleConditionalBranch ) ;
    public final void rule__Alternatives__ElementsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10243:1: ( ( ruleConditionalBranch ) )
            // InternalXtext.g:10244:1: ( ruleConditionalBranch )
            {
            // InternalXtext.g:10244:1: ( ruleConditionalBranch )
            // InternalXtext.g:10245:1: ruleConditionalBranch
            {
             before(grammarAccess.getAlternativesAccess().getElementsConditionalBranchParserRuleCall_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleConditionalBranch();

            state._fsp--;

             after(grammarAccess.getAlternativesAccess().getElementsConditionalBranchParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__ElementsAssignment_1_1_1"


    // $ANTLR start "rule__ConditionalBranch__GuardConditionAssignment_1_2"
    // InternalXtext.g:10254:1: rule__ConditionalBranch__GuardConditionAssignment_1_2 : ( ruleDisjunction ) ;
    public final void rule__ConditionalBranch__GuardConditionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10258:1: ( ( ruleDisjunction ) )
            // InternalXtext.g:10259:1: ( ruleDisjunction )
            {
            // InternalXtext.g:10259:1: ( ruleDisjunction )
            // InternalXtext.g:10260:1: ruleDisjunction
            {
             before(grammarAccess.getConditionalBranchAccess().getGuardConditionDisjunctionParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDisjunction();

            state._fsp--;

             after(grammarAccess.getConditionalBranchAccess().getGuardConditionDisjunctionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalBranch__GuardConditionAssignment_1_2"


    // $ANTLR start "rule__ConditionalBranch__ElementsAssignment_1_4"
    // InternalXtext.g:10269:1: rule__ConditionalBranch__ElementsAssignment_1_4 : ( ruleAbstractToken ) ;
    public final void rule__ConditionalBranch__ElementsAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10273:1: ( ( ruleAbstractToken ) )
            // InternalXtext.g:10274:1: ( ruleAbstractToken )
            {
            // InternalXtext.g:10274:1: ( ruleAbstractToken )
            // InternalXtext.g:10275:1: ruleAbstractToken
            {
             before(grammarAccess.getConditionalBranchAccess().getElementsAbstractTokenParserRuleCall_1_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAbstractToken();

            state._fsp--;

             after(grammarAccess.getConditionalBranchAccess().getElementsAbstractTokenParserRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalBranch__ElementsAssignment_1_4"


    // $ANTLR start "rule__UnorderedGroup__ElementsAssignment_1_1_1"
    // InternalXtext.g:10284:1: rule__UnorderedGroup__ElementsAssignment_1_1_1 : ( ruleGroup ) ;
    public final void rule__UnorderedGroup__ElementsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10288:1: ( ( ruleGroup ) )
            // InternalXtext.g:10289:1: ( ruleGroup )
            {
            // InternalXtext.g:10289:1: ( ruleGroup )
            // InternalXtext.g:10290:1: ruleGroup
            {
             before(grammarAccess.getUnorderedGroupAccess().getElementsGroupParserRuleCall_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getUnorderedGroupAccess().getElementsGroupParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnorderedGroup__ElementsAssignment_1_1_1"


    // $ANTLR start "rule__Group__ElementsAssignment_1_1"
    // InternalXtext.g:10299:1: rule__Group__ElementsAssignment_1_1 : ( ruleAbstractToken ) ;
    public final void rule__Group__ElementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10303:1: ( ( ruleAbstractToken ) )
            // InternalXtext.g:10304:1: ( ruleAbstractToken )
            {
            // InternalXtext.g:10304:1: ( ruleAbstractToken )
            // InternalXtext.g:10305:1: ruleAbstractToken
            {
             before(grammarAccess.getGroupAccess().getElementsAbstractTokenParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAbstractToken();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getElementsAbstractTokenParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__ElementsAssignment_1_1"


    // $ANTLR start "rule__AbstractTokenWithCardinality__CardinalityAssignment_1"
    // InternalXtext.g:10314:1: rule__AbstractTokenWithCardinality__CardinalityAssignment_1 : ( ( rule__AbstractTokenWithCardinality__CardinalityAlternatives_1_0 ) ) ;
    public final void rule__AbstractTokenWithCardinality__CardinalityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10318:1: ( ( ( rule__AbstractTokenWithCardinality__CardinalityAlternatives_1_0 ) ) )
            // InternalXtext.g:10319:1: ( ( rule__AbstractTokenWithCardinality__CardinalityAlternatives_1_0 ) )
            {
            // InternalXtext.g:10319:1: ( ( rule__AbstractTokenWithCardinality__CardinalityAlternatives_1_0 ) )
            // InternalXtext.g:10320:1: ( rule__AbstractTokenWithCardinality__CardinalityAlternatives_1_0 )
            {
             before(grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityAlternatives_1_0()); 
            // InternalXtext.g:10321:1: ( rule__AbstractTokenWithCardinality__CardinalityAlternatives_1_0 )
            // InternalXtext.g:10321:2: rule__AbstractTokenWithCardinality__CardinalityAlternatives_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AbstractTokenWithCardinality__CardinalityAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractTokenWithCardinality__CardinalityAssignment_1"


    // $ANTLR start "rule__Action__TypeAssignment_1"
    // InternalXtext.g:10330:1: rule__Action__TypeAssignment_1 : ( ruleTypeRef ) ;
    public final void rule__Action__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10334:1: ( ( ruleTypeRef ) )
            // InternalXtext.g:10335:1: ( ruleTypeRef )
            {
            // InternalXtext.g:10335:1: ( ruleTypeRef )
            // InternalXtext.g:10336:1: ruleTypeRef
            {
             before(grammarAccess.getActionAccess().getTypeTypeRefParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getActionAccess().getTypeTypeRefParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__TypeAssignment_1"


    // $ANTLR start "rule__Action__FeatureAssignment_2_1"
    // InternalXtext.g:10345:1: rule__Action__FeatureAssignment_2_1 : ( ruleValidID ) ;
    public final void rule__Action__FeatureAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10349:1: ( ( ruleValidID ) )
            // InternalXtext.g:10350:1: ( ruleValidID )
            {
            // InternalXtext.g:10350:1: ( ruleValidID )
            // InternalXtext.g:10351:1: ruleValidID
            {
             before(grammarAccess.getActionAccess().getFeatureValidIDParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getActionAccess().getFeatureValidIDParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__FeatureAssignment_2_1"


    // $ANTLR start "rule__Action__OperatorAssignment_2_2"
    // InternalXtext.g:10360:1: rule__Action__OperatorAssignment_2_2 : ( ( rule__Action__OperatorAlternatives_2_2_0 ) ) ;
    public final void rule__Action__OperatorAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10364:1: ( ( ( rule__Action__OperatorAlternatives_2_2_0 ) ) )
            // InternalXtext.g:10365:1: ( ( rule__Action__OperatorAlternatives_2_2_0 ) )
            {
            // InternalXtext.g:10365:1: ( ( rule__Action__OperatorAlternatives_2_2_0 ) )
            // InternalXtext.g:10366:1: ( rule__Action__OperatorAlternatives_2_2_0 )
            {
             before(grammarAccess.getActionAccess().getOperatorAlternatives_2_2_0()); 
            // InternalXtext.g:10367:1: ( rule__Action__OperatorAlternatives_2_2_0 )
            // InternalXtext.g:10367:2: rule__Action__OperatorAlternatives_2_2_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Action__OperatorAlternatives_2_2_0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getOperatorAlternatives_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__OperatorAssignment_2_2"


    // $ANTLR start "rule__Keyword__ValueAssignment"
    // InternalXtext.g:10376:1: rule__Keyword__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__Keyword__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10380:1: ( ( RULE_STRING ) )
            // InternalXtext.g:10381:1: ( RULE_STRING )
            {
            // InternalXtext.g:10381:1: ( RULE_STRING )
            // InternalXtext.g:10382:1: RULE_STRING
            {
             before(grammarAccess.getKeywordAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getKeywordAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keyword__ValueAssignment"


    // $ANTLR start "rule__RuleCall__RuleAssignment_0"
    // InternalXtext.g:10391:1: rule__RuleCall__RuleAssignment_0 : ( ( ruleRuleID ) ) ;
    public final void rule__RuleCall__RuleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10395:1: ( ( ( ruleRuleID ) ) )
            // InternalXtext.g:10396:1: ( ( ruleRuleID ) )
            {
            // InternalXtext.g:10396:1: ( ( ruleRuleID ) )
            // InternalXtext.g:10397:1: ( ruleRuleID )
            {
             before(grammarAccess.getRuleCallAccess().getRuleAbstractRuleCrossReference_0_0()); 
            // InternalXtext.g:10398:1: ( ruleRuleID )
            // InternalXtext.g:10399:1: ruleRuleID
            {
             before(grammarAccess.getRuleCallAccess().getRuleAbstractRuleRuleIDParserRuleCall_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRuleID();

            state._fsp--;

             after(grammarAccess.getRuleCallAccess().getRuleAbstractRuleRuleIDParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getRuleCallAccess().getRuleAbstractRuleCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCall__RuleAssignment_0"


    // $ANTLR start "rule__RuleCall__ArgumentsAssignment_1_1"
    // InternalXtext.g:10410:1: rule__RuleCall__ArgumentsAssignment_1_1 : ( ruleNamedArgument ) ;
    public final void rule__RuleCall__ArgumentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10414:1: ( ( ruleNamedArgument ) )
            // InternalXtext.g:10415:1: ( ruleNamedArgument )
            {
            // InternalXtext.g:10415:1: ( ruleNamedArgument )
            // InternalXtext.g:10416:1: ruleNamedArgument
            {
             before(grammarAccess.getRuleCallAccess().getArgumentsNamedArgumentParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleNamedArgument();

            state._fsp--;

             after(grammarAccess.getRuleCallAccess().getArgumentsNamedArgumentParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCall__ArgumentsAssignment_1_1"


    // $ANTLR start "rule__RuleCall__ArgumentsAssignment_1_2_1"
    // InternalXtext.g:10425:1: rule__RuleCall__ArgumentsAssignment_1_2_1 : ( ruleNamedArgument ) ;
    public final void rule__RuleCall__ArgumentsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10429:1: ( ( ruleNamedArgument ) )
            // InternalXtext.g:10430:1: ( ruleNamedArgument )
            {
            // InternalXtext.g:10430:1: ( ruleNamedArgument )
            // InternalXtext.g:10431:1: ruleNamedArgument
            {
             before(grammarAccess.getRuleCallAccess().getArgumentsNamedArgumentParserRuleCall_1_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleNamedArgument();

            state._fsp--;

             after(grammarAccess.getRuleCallAccess().getArgumentsNamedArgumentParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCall__ArgumentsAssignment_1_2_1"


    // $ANTLR start "rule__NamedArgument__ParameterAssignment_0_0"
    // InternalXtext.g:10440:1: rule__NamedArgument__ParameterAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__NamedArgument__ParameterAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10444:1: ( ( ( RULE_ID ) ) )
            // InternalXtext.g:10445:1: ( ( RULE_ID ) )
            {
            // InternalXtext.g:10445:1: ( ( RULE_ID ) )
            // InternalXtext.g:10446:1: ( RULE_ID )
            {
             before(grammarAccess.getNamedArgumentAccess().getParameterParameterCrossReference_0_0_0()); 
            // InternalXtext.g:10447:1: ( RULE_ID )
            // InternalXtext.g:10448:1: RULE_ID
            {
             before(grammarAccess.getNamedArgumentAccess().getParameterParameterIDTerminalRuleCall_0_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getNamedArgumentAccess().getParameterParameterIDTerminalRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getNamedArgumentAccess().getParameterParameterCrossReference_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedArgument__ParameterAssignment_0_0"


    // $ANTLR start "rule__NamedArgument__CalledByNameAssignment_0_1"
    // InternalXtext.g:10459:1: rule__NamedArgument__CalledByNameAssignment_0_1 : ( ( '=' ) ) ;
    public final void rule__NamedArgument__CalledByNameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10463:1: ( ( ( '=' ) ) )
            // InternalXtext.g:10464:1: ( ( '=' ) )
            {
            // InternalXtext.g:10464:1: ( ( '=' ) )
            // InternalXtext.g:10465:1: ( '=' )
            {
             before(grammarAccess.getNamedArgumentAccess().getCalledByNameEqualsSignKeyword_0_1_0()); 
            // InternalXtext.g:10466:1: ( '=' )
            // InternalXtext.g:10467:1: '='
            {
             before(grammarAccess.getNamedArgumentAccess().getCalledByNameEqualsSignKeyword_0_1_0()); 
            match(input,18,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getNamedArgumentAccess().getCalledByNameEqualsSignKeyword_0_1_0()); 

            }

             after(grammarAccess.getNamedArgumentAccess().getCalledByNameEqualsSignKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedArgument__CalledByNameAssignment_0_1"


    // $ANTLR start "rule__NamedArgument__ValueAssignment_1"
    // InternalXtext.g:10482:1: rule__NamedArgument__ValueAssignment_1 : ( ruleDisjunction ) ;
    public final void rule__NamedArgument__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10486:1: ( ( ruleDisjunction ) )
            // InternalXtext.g:10487:1: ( ruleDisjunction )
            {
            // InternalXtext.g:10487:1: ( ruleDisjunction )
            // InternalXtext.g:10488:1: ruleDisjunction
            {
             before(grammarAccess.getNamedArgumentAccess().getValueDisjunctionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDisjunction();

            state._fsp--;

             after(grammarAccess.getNamedArgumentAccess().getValueDisjunctionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedArgument__ValueAssignment_1"


    // $ANTLR start "rule__LiteralCondition__TrueAssignment_1_0"
    // InternalXtext.g:10497:1: rule__LiteralCondition__TrueAssignment_1_0 : ( ( 'true' ) ) ;
    public final void rule__LiteralCondition__TrueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10501:1: ( ( ( 'true' ) ) )
            // InternalXtext.g:10502:1: ( ( 'true' ) )
            {
            // InternalXtext.g:10502:1: ( ( 'true' ) )
            // InternalXtext.g:10503:1: ( 'true' )
            {
             before(grammarAccess.getLiteralConditionAccess().getTrueTrueKeyword_1_0_0()); 
            // InternalXtext.g:10504:1: ( 'true' )
            // InternalXtext.g:10505:1: 'true'
            {
             before(grammarAccess.getLiteralConditionAccess().getTrueTrueKeyword_1_0_0()); 
            match(input,21,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getLiteralConditionAccess().getTrueTrueKeyword_1_0_0()); 

            }

             after(grammarAccess.getLiteralConditionAccess().getTrueTrueKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralCondition__TrueAssignment_1_0"


    // $ANTLR start "rule__Disjunction__RightAssignment_1_2"
    // InternalXtext.g:10520:1: rule__Disjunction__RightAssignment_1_2 : ( ruleConjunction ) ;
    public final void rule__Disjunction__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10524:1: ( ( ruleConjunction ) )
            // InternalXtext.g:10525:1: ( ruleConjunction )
            {
            // InternalXtext.g:10525:1: ( ruleConjunction )
            // InternalXtext.g:10526:1: ruleConjunction
            {
             before(grammarAccess.getDisjunctionAccess().getRightConjunctionParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleConjunction();

            state._fsp--;

             after(grammarAccess.getDisjunctionAccess().getRightConjunctionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__RightAssignment_1_2"


    // $ANTLR start "rule__Conjunction__RightAssignment_1_2"
    // InternalXtext.g:10535:1: rule__Conjunction__RightAssignment_1_2 : ( ruleNegation ) ;
    public final void rule__Conjunction__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10539:1: ( ( ruleNegation ) )
            // InternalXtext.g:10540:1: ( ruleNegation )
            {
            // InternalXtext.g:10540:1: ( ruleNegation )
            // InternalXtext.g:10541:1: ruleNegation
            {
             before(grammarAccess.getConjunctionAccess().getRightNegationParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleNegation();

            state._fsp--;

             after(grammarAccess.getConjunctionAccess().getRightNegationParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__RightAssignment_1_2"


    // $ANTLR start "rule__Negation__ValueAssignment_1_2"
    // InternalXtext.g:10550:1: rule__Negation__ValueAssignment_1_2 : ( ruleNegation ) ;
    public final void rule__Negation__ValueAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10554:1: ( ( ruleNegation ) )
            // InternalXtext.g:10555:1: ( ruleNegation )
            {
            // InternalXtext.g:10555:1: ( ruleNegation )
            // InternalXtext.g:10556:1: ruleNegation
            {
             before(grammarAccess.getNegationAccess().getValueNegationParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleNegation();

            state._fsp--;

             after(grammarAccess.getNegationAccess().getValueNegationParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__ValueAssignment_1_2"


    // $ANTLR start "rule__ParameterReference__ParameterAssignment"
    // InternalXtext.g:10565:1: rule__ParameterReference__ParameterAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ParameterReference__ParameterAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10569:1: ( ( ( RULE_ID ) ) )
            // InternalXtext.g:10570:1: ( ( RULE_ID ) )
            {
            // InternalXtext.g:10570:1: ( ( RULE_ID ) )
            // InternalXtext.g:10571:1: ( RULE_ID )
            {
             before(grammarAccess.getParameterReferenceAccess().getParameterParameterCrossReference_0()); 
            // InternalXtext.g:10572:1: ( RULE_ID )
            // InternalXtext.g:10573:1: RULE_ID
            {
             before(grammarAccess.getParameterReferenceAccess().getParameterParameterIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParameterReferenceAccess().getParameterParameterIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getParameterReferenceAccess().getParameterParameterCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterReference__ParameterAssignment"


    // $ANTLR start "rule__TerminalRuleCall__RuleAssignment"
    // InternalXtext.g:10584:1: rule__TerminalRuleCall__RuleAssignment : ( ( ruleRuleID ) ) ;
    public final void rule__TerminalRuleCall__RuleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10588:1: ( ( ( ruleRuleID ) ) )
            // InternalXtext.g:10589:1: ( ( ruleRuleID ) )
            {
            // InternalXtext.g:10589:1: ( ( ruleRuleID ) )
            // InternalXtext.g:10590:1: ( ruleRuleID )
            {
             before(grammarAccess.getTerminalRuleCallAccess().getRuleAbstractRuleCrossReference_0()); 
            // InternalXtext.g:10591:1: ( ruleRuleID )
            // InternalXtext.g:10592:1: ruleRuleID
            {
             before(grammarAccess.getTerminalRuleCallAccess().getRuleAbstractRuleRuleIDParserRuleCall_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRuleID();

            state._fsp--;

             after(grammarAccess.getTerminalRuleCallAccess().getRuleAbstractRuleRuleIDParserRuleCall_0_1()); 

            }

             after(grammarAccess.getTerminalRuleCallAccess().getRuleAbstractRuleCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRuleCall__RuleAssignment"


    // $ANTLR start "rule__PredicatedKeyword__PredicatedAssignment_0_0"
    // InternalXtext.g:10603:1: rule__PredicatedKeyword__PredicatedAssignment_0_0 : ( ( '=>' ) ) ;
    public final void rule__PredicatedKeyword__PredicatedAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10607:1: ( ( ( '=>' ) ) )
            // InternalXtext.g:10608:1: ( ( '=>' ) )
            {
            // InternalXtext.g:10608:1: ( ( '=>' ) )
            // InternalXtext.g:10609:1: ( '=>' )
            {
             before(grammarAccess.getPredicatedKeywordAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0()); 
            // InternalXtext.g:10610:1: ( '=>' )
            // InternalXtext.g:10611:1: '=>'
            {
             before(grammarAccess.getPredicatedKeywordAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0()); 
            match(input,53,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPredicatedKeywordAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0()); 

            }

             after(grammarAccess.getPredicatedKeywordAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedKeyword__PredicatedAssignment_0_0"


    // $ANTLR start "rule__PredicatedKeyword__FirstSetPredicatedAssignment_0_1"
    // InternalXtext.g:10626:1: rule__PredicatedKeyword__FirstSetPredicatedAssignment_0_1 : ( ( '->' ) ) ;
    public final void rule__PredicatedKeyword__FirstSetPredicatedAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10630:1: ( ( ( '->' ) ) )
            // InternalXtext.g:10631:1: ( ( '->' ) )
            {
            // InternalXtext.g:10631:1: ( ( '->' ) )
            // InternalXtext.g:10632:1: ( '->' )
            {
             before(grammarAccess.getPredicatedKeywordAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0()); 
            // InternalXtext.g:10633:1: ( '->' )
            // InternalXtext.g:10634:1: '->'
            {
             before(grammarAccess.getPredicatedKeywordAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0()); 
            match(input,47,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPredicatedKeywordAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0()); 

            }

             after(grammarAccess.getPredicatedKeywordAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedKeyword__FirstSetPredicatedAssignment_0_1"


    // $ANTLR start "rule__PredicatedKeyword__ValueAssignment_1"
    // InternalXtext.g:10649:1: rule__PredicatedKeyword__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__PredicatedKeyword__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10653:1: ( ( RULE_STRING ) )
            // InternalXtext.g:10654:1: ( RULE_STRING )
            {
            // InternalXtext.g:10654:1: ( RULE_STRING )
            // InternalXtext.g:10655:1: RULE_STRING
            {
             before(grammarAccess.getPredicatedKeywordAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPredicatedKeywordAccess().getValueSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedKeyword__ValueAssignment_1"


    // $ANTLR start "rule__PredicatedRuleCall__PredicatedAssignment_0_0"
    // InternalXtext.g:10664:1: rule__PredicatedRuleCall__PredicatedAssignment_0_0 : ( ( '=>' ) ) ;
    public final void rule__PredicatedRuleCall__PredicatedAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10668:1: ( ( ( '=>' ) ) )
            // InternalXtext.g:10669:1: ( ( '=>' ) )
            {
            // InternalXtext.g:10669:1: ( ( '=>' ) )
            // InternalXtext.g:10670:1: ( '=>' )
            {
             before(grammarAccess.getPredicatedRuleCallAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0()); 
            // InternalXtext.g:10671:1: ( '=>' )
            // InternalXtext.g:10672:1: '=>'
            {
             before(grammarAccess.getPredicatedRuleCallAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0()); 
            match(input,53,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPredicatedRuleCallAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0()); 

            }

             after(grammarAccess.getPredicatedRuleCallAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__PredicatedAssignment_0_0"


    // $ANTLR start "rule__PredicatedRuleCall__FirstSetPredicatedAssignment_0_1"
    // InternalXtext.g:10687:1: rule__PredicatedRuleCall__FirstSetPredicatedAssignment_0_1 : ( ( '->' ) ) ;
    public final void rule__PredicatedRuleCall__FirstSetPredicatedAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10691:1: ( ( ( '->' ) ) )
            // InternalXtext.g:10692:1: ( ( '->' ) )
            {
            // InternalXtext.g:10692:1: ( ( '->' ) )
            // InternalXtext.g:10693:1: ( '->' )
            {
             before(grammarAccess.getPredicatedRuleCallAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0()); 
            // InternalXtext.g:10694:1: ( '->' )
            // InternalXtext.g:10695:1: '->'
            {
             before(grammarAccess.getPredicatedRuleCallAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0()); 
            match(input,47,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPredicatedRuleCallAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0()); 

            }

             after(grammarAccess.getPredicatedRuleCallAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__FirstSetPredicatedAssignment_0_1"


    // $ANTLR start "rule__PredicatedRuleCall__RuleAssignment_1"
    // InternalXtext.g:10710:1: rule__PredicatedRuleCall__RuleAssignment_1 : ( ( ruleRuleID ) ) ;
    public final void rule__PredicatedRuleCall__RuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10714:1: ( ( ( ruleRuleID ) ) )
            // InternalXtext.g:10715:1: ( ( ruleRuleID ) )
            {
            // InternalXtext.g:10715:1: ( ( ruleRuleID ) )
            // InternalXtext.g:10716:1: ( ruleRuleID )
            {
             before(grammarAccess.getPredicatedRuleCallAccess().getRuleAbstractRuleCrossReference_1_0()); 
            // InternalXtext.g:10717:1: ( ruleRuleID )
            // InternalXtext.g:10718:1: ruleRuleID
            {
             before(grammarAccess.getPredicatedRuleCallAccess().getRuleAbstractRuleRuleIDParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRuleID();

            state._fsp--;

             after(grammarAccess.getPredicatedRuleCallAccess().getRuleAbstractRuleRuleIDParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPredicatedRuleCallAccess().getRuleAbstractRuleCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__RuleAssignment_1"


    // $ANTLR start "rule__PredicatedRuleCall__ArgumentsAssignment_2_1"
    // InternalXtext.g:10729:1: rule__PredicatedRuleCall__ArgumentsAssignment_2_1 : ( ruleNamedArgument ) ;
    public final void rule__PredicatedRuleCall__ArgumentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10733:1: ( ( ruleNamedArgument ) )
            // InternalXtext.g:10734:1: ( ruleNamedArgument )
            {
            // InternalXtext.g:10734:1: ( ruleNamedArgument )
            // InternalXtext.g:10735:1: ruleNamedArgument
            {
             before(grammarAccess.getPredicatedRuleCallAccess().getArgumentsNamedArgumentParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleNamedArgument();

            state._fsp--;

             after(grammarAccess.getPredicatedRuleCallAccess().getArgumentsNamedArgumentParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__ArgumentsAssignment_2_1"


    // $ANTLR start "rule__PredicatedRuleCall__ArgumentsAssignment_2_2_1"
    // InternalXtext.g:10744:1: rule__PredicatedRuleCall__ArgumentsAssignment_2_2_1 : ( ruleNamedArgument ) ;
    public final void rule__PredicatedRuleCall__ArgumentsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10748:1: ( ( ruleNamedArgument ) )
            // InternalXtext.g:10749:1: ( ruleNamedArgument )
            {
            // InternalXtext.g:10749:1: ( ruleNamedArgument )
            // InternalXtext.g:10750:1: ruleNamedArgument
            {
             before(grammarAccess.getPredicatedRuleCallAccess().getArgumentsNamedArgumentParserRuleCall_2_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleNamedArgument();

            state._fsp--;

             after(grammarAccess.getPredicatedRuleCallAccess().getArgumentsNamedArgumentParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedRuleCall__ArgumentsAssignment_2_2_1"


    // $ANTLR start "rule__Assignment__PredicatedAssignment_0_0"
    // InternalXtext.g:10759:1: rule__Assignment__PredicatedAssignment_0_0 : ( ( '=>' ) ) ;
    public final void rule__Assignment__PredicatedAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10763:1: ( ( ( '=>' ) ) )
            // InternalXtext.g:10764:1: ( ( '=>' ) )
            {
            // InternalXtext.g:10764:1: ( ( '=>' ) )
            // InternalXtext.g:10765:1: ( '=>' )
            {
             before(grammarAccess.getAssignmentAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0()); 
            // InternalXtext.g:10766:1: ( '=>' )
            // InternalXtext.g:10767:1: '=>'
            {
             before(grammarAccess.getAssignmentAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0()); 
            match(input,53,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0()); 

            }

             after(grammarAccess.getAssignmentAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__PredicatedAssignment_0_0"


    // $ANTLR start "rule__Assignment__FirstSetPredicatedAssignment_0_1"
    // InternalXtext.g:10782:1: rule__Assignment__FirstSetPredicatedAssignment_0_1 : ( ( '->' ) ) ;
    public final void rule__Assignment__FirstSetPredicatedAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10786:1: ( ( ( '->' ) ) )
            // InternalXtext.g:10787:1: ( ( '->' ) )
            {
            // InternalXtext.g:10787:1: ( ( '->' ) )
            // InternalXtext.g:10788:1: ( '->' )
            {
             before(grammarAccess.getAssignmentAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0()); 
            // InternalXtext.g:10789:1: ( '->' )
            // InternalXtext.g:10790:1: '->'
            {
             before(grammarAccess.getAssignmentAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0()); 
            match(input,47,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0()); 

            }

             after(grammarAccess.getAssignmentAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__FirstSetPredicatedAssignment_0_1"


    // $ANTLR start "rule__Assignment__FeatureAssignment_1"
    // InternalXtext.g:10805:1: rule__Assignment__FeatureAssignment_1 : ( ruleValidID ) ;
    public final void rule__Assignment__FeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10809:1: ( ( ruleValidID ) )
            // InternalXtext.g:10810:1: ( ruleValidID )
            {
            // InternalXtext.g:10810:1: ( ruleValidID )
            // InternalXtext.g:10811:1: ruleValidID
            {
             before(grammarAccess.getAssignmentAccess().getFeatureValidIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getFeatureValidIDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__FeatureAssignment_1"


    // $ANTLR start "rule__Assignment__OperatorAssignment_2"
    // InternalXtext.g:10820:1: rule__Assignment__OperatorAssignment_2 : ( ( rule__Assignment__OperatorAlternatives_2_0 ) ) ;
    public final void rule__Assignment__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10824:1: ( ( ( rule__Assignment__OperatorAlternatives_2_0 ) ) )
            // InternalXtext.g:10825:1: ( ( rule__Assignment__OperatorAlternatives_2_0 ) )
            {
            // InternalXtext.g:10825:1: ( ( rule__Assignment__OperatorAlternatives_2_0 ) )
            // InternalXtext.g:10826:1: ( rule__Assignment__OperatorAlternatives_2_0 )
            {
             before(grammarAccess.getAssignmentAccess().getOperatorAlternatives_2_0()); 
            // InternalXtext.g:10827:1: ( rule__Assignment__OperatorAlternatives_2_0 )
            // InternalXtext.g:10827:2: rule__Assignment__OperatorAlternatives_2_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__OperatorAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getOperatorAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__OperatorAssignment_2"


    // $ANTLR start "rule__Assignment__TerminalAssignment_3"
    // InternalXtext.g:10836:1: rule__Assignment__TerminalAssignment_3 : ( ruleAssignableTerminal ) ;
    public final void rule__Assignment__TerminalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10840:1: ( ( ruleAssignableTerminal ) )
            // InternalXtext.g:10841:1: ( ruleAssignableTerminal )
            {
            // InternalXtext.g:10841:1: ( ruleAssignableTerminal )
            // InternalXtext.g:10842:1: ruleAssignableTerminal
            {
             before(grammarAccess.getAssignmentAccess().getTerminalAssignableTerminalParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAssignableTerminal();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getTerminalAssignableTerminalParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__TerminalAssignment_3"


    // $ANTLR start "rule__AssignableAlternatives__ElementsAssignment_1_1_1"
    // InternalXtext.g:10851:1: rule__AssignableAlternatives__ElementsAssignment_1_1_1 : ( ruleAssignableTerminal ) ;
    public final void rule__AssignableAlternatives__ElementsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10855:1: ( ( ruleAssignableTerminal ) )
            // InternalXtext.g:10856:1: ( ruleAssignableTerminal )
            {
            // InternalXtext.g:10856:1: ( ruleAssignableTerminal )
            // InternalXtext.g:10857:1: ruleAssignableTerminal
            {
             before(grammarAccess.getAssignableAlternativesAccess().getElementsAssignableTerminalParserRuleCall_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAssignableTerminal();

            state._fsp--;

             after(grammarAccess.getAssignableAlternativesAccess().getElementsAssignableTerminalParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignableAlternatives__ElementsAssignment_1_1_1"


    // $ANTLR start "rule__CrossReference__TypeAssignment_1"
    // InternalXtext.g:10866:1: rule__CrossReference__TypeAssignment_1 : ( ruleTypeRef ) ;
    public final void rule__CrossReference__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10870:1: ( ( ruleTypeRef ) )
            // InternalXtext.g:10871:1: ( ruleTypeRef )
            {
            // InternalXtext.g:10871:1: ( ruleTypeRef )
            // InternalXtext.g:10872:1: ruleTypeRef
            {
             before(grammarAccess.getCrossReferenceAccess().getTypeTypeRefParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getCrossReferenceAccess().getTypeTypeRefParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossReference__TypeAssignment_1"


    // $ANTLR start "rule__CrossReference__TerminalAssignment_2_1"
    // InternalXtext.g:10881:1: rule__CrossReference__TerminalAssignment_2_1 : ( ruleCrossReferenceableTerminal ) ;
    public final void rule__CrossReference__TerminalAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10885:1: ( ( ruleCrossReferenceableTerminal ) )
            // InternalXtext.g:10886:1: ( ruleCrossReferenceableTerminal )
            {
            // InternalXtext.g:10886:1: ( ruleCrossReferenceableTerminal )
            // InternalXtext.g:10887:1: ruleCrossReferenceableTerminal
            {
             before(grammarAccess.getCrossReferenceAccess().getTerminalCrossReferenceableTerminalParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleCrossReferenceableTerminal();

            state._fsp--;

             after(grammarAccess.getCrossReferenceAccess().getTerminalCrossReferenceableTerminalParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossReference__TerminalAssignment_2_1"


    // $ANTLR start "rule__PredicatedGroup__PredicatedAssignment_0_0"
    // InternalXtext.g:10896:1: rule__PredicatedGroup__PredicatedAssignment_0_0 : ( ( '=>' ) ) ;
    public final void rule__PredicatedGroup__PredicatedAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10900:1: ( ( ( '=>' ) ) )
            // InternalXtext.g:10901:1: ( ( '=>' ) )
            {
            // InternalXtext.g:10901:1: ( ( '=>' ) )
            // InternalXtext.g:10902:1: ( '=>' )
            {
             before(grammarAccess.getPredicatedGroupAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0()); 
            // InternalXtext.g:10903:1: ( '=>' )
            // InternalXtext.g:10904:1: '=>'
            {
             before(grammarAccess.getPredicatedGroupAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0()); 
            match(input,53,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPredicatedGroupAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0()); 

            }

             after(grammarAccess.getPredicatedGroupAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedGroup__PredicatedAssignment_0_0"


    // $ANTLR start "rule__PredicatedGroup__FirstSetPredicatedAssignment_0_1"
    // InternalXtext.g:10919:1: rule__PredicatedGroup__FirstSetPredicatedAssignment_0_1 : ( ( '->' ) ) ;
    public final void rule__PredicatedGroup__FirstSetPredicatedAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10923:1: ( ( ( '->' ) ) )
            // InternalXtext.g:10924:1: ( ( '->' ) )
            {
            // InternalXtext.g:10924:1: ( ( '->' ) )
            // InternalXtext.g:10925:1: ( '->' )
            {
             before(grammarAccess.getPredicatedGroupAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0()); 
            // InternalXtext.g:10926:1: ( '->' )
            // InternalXtext.g:10927:1: '->'
            {
             before(grammarAccess.getPredicatedGroupAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0()); 
            match(input,47,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPredicatedGroupAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0()); 

            }

             after(grammarAccess.getPredicatedGroupAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedGroup__FirstSetPredicatedAssignment_0_1"


    // $ANTLR start "rule__PredicatedGroup__ElementsAssignment_2"
    // InternalXtext.g:10942:1: rule__PredicatedGroup__ElementsAssignment_2 : ( ruleAlternatives ) ;
    public final void rule__PredicatedGroup__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10946:1: ( ( ruleAlternatives ) )
            // InternalXtext.g:10947:1: ( ruleAlternatives )
            {
            // InternalXtext.g:10947:1: ( ruleAlternatives )
            // InternalXtext.g:10948:1: ruleAlternatives
            {
             before(grammarAccess.getPredicatedGroupAccess().getElementsAlternativesParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAlternatives();

            state._fsp--;

             after(grammarAccess.getPredicatedGroupAccess().getElementsAlternativesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicatedGroup__ElementsAssignment_2"


    // $ANTLR start "rule__TerminalRule__FragmentAssignment_1_0_0"
    // InternalXtext.g:10957:1: rule__TerminalRule__FragmentAssignment_1_0_0 : ( ( 'fragment' ) ) ;
    public final void rule__TerminalRule__FragmentAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10961:1: ( ( ( 'fragment' ) ) )
            // InternalXtext.g:10962:1: ( ( 'fragment' ) )
            {
            // InternalXtext.g:10962:1: ( ( 'fragment' ) )
            // InternalXtext.g:10963:1: ( 'fragment' )
            {
             before(grammarAccess.getTerminalRuleAccess().getFragmentFragmentKeyword_1_0_0_0()); 
            // InternalXtext.g:10964:1: ( 'fragment' )
            // InternalXtext.g:10965:1: 'fragment'
            {
             before(grammarAccess.getTerminalRuleAccess().getFragmentFragmentKeyword_1_0_0_0()); 
            match(input,52,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTerminalRuleAccess().getFragmentFragmentKeyword_1_0_0_0()); 

            }

             after(grammarAccess.getTerminalRuleAccess().getFragmentFragmentKeyword_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__FragmentAssignment_1_0_0"


    // $ANTLR start "rule__TerminalRule__NameAssignment_1_0_1"
    // InternalXtext.g:10980:1: rule__TerminalRule__NameAssignment_1_0_1 : ( ruleValidID ) ;
    public final void rule__TerminalRule__NameAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10984:1: ( ( ruleValidID ) )
            // InternalXtext.g:10985:1: ( ruleValidID )
            {
            // InternalXtext.g:10985:1: ( ruleValidID )
            // InternalXtext.g:10986:1: ruleValidID
            {
             before(grammarAccess.getTerminalRuleAccess().getNameValidIDParserRuleCall_1_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getTerminalRuleAccess().getNameValidIDParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__NameAssignment_1_0_1"


    // $ANTLR start "rule__TerminalRule__NameAssignment_1_1_0"
    // InternalXtext.g:10995:1: rule__TerminalRule__NameAssignment_1_1_0 : ( ruleValidID ) ;
    public final void rule__TerminalRule__NameAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:10999:1: ( ( ruleValidID ) )
            // InternalXtext.g:11000:1: ( ruleValidID )
            {
            // InternalXtext.g:11000:1: ( ruleValidID )
            // InternalXtext.g:11001:1: ruleValidID
            {
             before(grammarAccess.getTerminalRuleAccess().getNameValidIDParserRuleCall_1_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getTerminalRuleAccess().getNameValidIDParserRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__NameAssignment_1_1_0"


    // $ANTLR start "rule__TerminalRule__TypeAssignment_1_1_1_1"
    // InternalXtext.g:11010:1: rule__TerminalRule__TypeAssignment_1_1_1_1 : ( ruleTypeRef ) ;
    public final void rule__TerminalRule__TypeAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:11014:1: ( ( ruleTypeRef ) )
            // InternalXtext.g:11015:1: ( ruleTypeRef )
            {
            // InternalXtext.g:11015:1: ( ruleTypeRef )
            // InternalXtext.g:11016:1: ruleTypeRef
            {
             before(grammarAccess.getTerminalRuleAccess().getTypeTypeRefParserRuleCall_1_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getTerminalRuleAccess().getTypeTypeRefParserRuleCall_1_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__TypeAssignment_1_1_1_1"


    // $ANTLR start "rule__TerminalRule__AlternativesAssignment_3"
    // InternalXtext.g:11025:1: rule__TerminalRule__AlternativesAssignment_3 : ( ruleTerminalAlternatives ) ;
    public final void rule__TerminalRule__AlternativesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:11029:1: ( ( ruleTerminalAlternatives ) )
            // InternalXtext.g:11030:1: ( ruleTerminalAlternatives )
            {
            // InternalXtext.g:11030:1: ( ruleTerminalAlternatives )
            // InternalXtext.g:11031:1: ruleTerminalAlternatives
            {
             before(grammarAccess.getTerminalRuleAccess().getAlternativesTerminalAlternativesParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTerminalAlternatives();

            state._fsp--;

             after(grammarAccess.getTerminalRuleAccess().getAlternativesTerminalAlternativesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalRule__AlternativesAssignment_3"


    // $ANTLR start "rule__TerminalAlternatives__ElementsAssignment_1_1_1"
    // InternalXtext.g:11040:1: rule__TerminalAlternatives__ElementsAssignment_1_1_1 : ( ruleTerminalGroup ) ;
    public final void rule__TerminalAlternatives__ElementsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:11044:1: ( ( ruleTerminalGroup ) )
            // InternalXtext.g:11045:1: ( ruleTerminalGroup )
            {
            // InternalXtext.g:11045:1: ( ruleTerminalGroup )
            // InternalXtext.g:11046:1: ruleTerminalGroup
            {
             before(grammarAccess.getTerminalAlternativesAccess().getElementsTerminalGroupParserRuleCall_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTerminalGroup();

            state._fsp--;

             after(grammarAccess.getTerminalAlternativesAccess().getElementsTerminalGroupParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalAlternatives__ElementsAssignment_1_1_1"


    // $ANTLR start "rule__TerminalGroup__ElementsAssignment_1_1"
    // InternalXtext.g:11055:1: rule__TerminalGroup__ElementsAssignment_1_1 : ( ruleTerminalToken ) ;
    public final void rule__TerminalGroup__ElementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:11059:1: ( ( ruleTerminalToken ) )
            // InternalXtext.g:11060:1: ( ruleTerminalToken )
            {
            // InternalXtext.g:11060:1: ( ruleTerminalToken )
            // InternalXtext.g:11061:1: ruleTerminalToken
            {
             before(grammarAccess.getTerminalGroupAccess().getElementsTerminalTokenParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTerminalToken();

            state._fsp--;

             after(grammarAccess.getTerminalGroupAccess().getElementsTerminalTokenParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalGroup__ElementsAssignment_1_1"


    // $ANTLR start "rule__TerminalToken__CardinalityAssignment_1"
    // InternalXtext.g:11070:1: rule__TerminalToken__CardinalityAssignment_1 : ( ( rule__TerminalToken__CardinalityAlternatives_1_0 ) ) ;
    public final void rule__TerminalToken__CardinalityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:11074:1: ( ( ( rule__TerminalToken__CardinalityAlternatives_1_0 ) ) )
            // InternalXtext.g:11075:1: ( ( rule__TerminalToken__CardinalityAlternatives_1_0 ) )
            {
            // InternalXtext.g:11075:1: ( ( rule__TerminalToken__CardinalityAlternatives_1_0 ) )
            // InternalXtext.g:11076:1: ( rule__TerminalToken__CardinalityAlternatives_1_0 )
            {
             before(grammarAccess.getTerminalTokenAccess().getCardinalityAlternatives_1_0()); 
            // InternalXtext.g:11077:1: ( rule__TerminalToken__CardinalityAlternatives_1_0 )
            // InternalXtext.g:11077:2: rule__TerminalToken__CardinalityAlternatives_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TerminalToken__CardinalityAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTerminalTokenAccess().getCardinalityAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalToken__CardinalityAssignment_1"


    // $ANTLR start "rule__NegatedToken__TerminalAssignment_1"
    // InternalXtext.g:11086:1: rule__NegatedToken__TerminalAssignment_1 : ( ruleTerminalTokenElement ) ;
    public final void rule__NegatedToken__TerminalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:11090:1: ( ( ruleTerminalTokenElement ) )
            // InternalXtext.g:11091:1: ( ruleTerminalTokenElement )
            {
            // InternalXtext.g:11091:1: ( ruleTerminalTokenElement )
            // InternalXtext.g:11092:1: ruleTerminalTokenElement
            {
             before(grammarAccess.getNegatedTokenAccess().getTerminalTerminalTokenElementParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTerminalTokenElement();

            state._fsp--;

             after(grammarAccess.getNegatedTokenAccess().getTerminalTerminalTokenElementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegatedToken__TerminalAssignment_1"


    // $ANTLR start "rule__UntilToken__TerminalAssignment_1"
    // InternalXtext.g:11101:1: rule__UntilToken__TerminalAssignment_1 : ( ruleTerminalTokenElement ) ;
    public final void rule__UntilToken__TerminalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:11105:1: ( ( ruleTerminalTokenElement ) )
            // InternalXtext.g:11106:1: ( ruleTerminalTokenElement )
            {
            // InternalXtext.g:11106:1: ( ruleTerminalTokenElement )
            // InternalXtext.g:11107:1: ruleTerminalTokenElement
            {
             before(grammarAccess.getUntilTokenAccess().getTerminalTerminalTokenElementParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTerminalTokenElement();

            state._fsp--;

             after(grammarAccess.getUntilTokenAccess().getTerminalTerminalTokenElementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UntilToken__TerminalAssignment_1"


    // $ANTLR start "rule__CharacterRange__RightAssignment_1_2"
    // InternalXtext.g:11116:1: rule__CharacterRange__RightAssignment_1_2 : ( ruleKeyword ) ;
    public final void rule__CharacterRange__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:11120:1: ( ( ruleKeyword ) )
            // InternalXtext.g:11121:1: ( ruleKeyword )
            {
            // InternalXtext.g:11121:1: ( ruleKeyword )
            // InternalXtext.g:11122:1: ruleKeyword
            {
             before(grammarAccess.getCharacterRangeAccess().getRightKeywordParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleKeyword();

            state._fsp--;

             after(grammarAccess.getCharacterRangeAccess().getRightKeywordParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterRange__RightAssignment_1_2"


    // $ANTLR start "rule__EnumRule__NameAssignment_1"
    // InternalXtext.g:11131:1: rule__EnumRule__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__EnumRule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:11135:1: ( ( ruleValidID ) )
            // InternalXtext.g:11136:1: ( ruleValidID )
            {
            // InternalXtext.g:11136:1: ( ruleValidID )
            // InternalXtext.g:11137:1: ruleValidID
            {
             before(grammarAccess.getEnumRuleAccess().getNameValidIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getEnumRuleAccess().getNameValidIDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__NameAssignment_1"


    // $ANTLR start "rule__EnumRule__TypeAssignment_2_1"
    // InternalXtext.g:11146:1: rule__EnumRule__TypeAssignment_2_1 : ( ruleTypeRef ) ;
    public final void rule__EnumRule__TypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:11150:1: ( ( ruleTypeRef ) )
            // InternalXtext.g:11151:1: ( ruleTypeRef )
            {
            // InternalXtext.g:11151:1: ( ruleTypeRef )
            // InternalXtext.g:11152:1: ruleTypeRef
            {
             before(grammarAccess.getEnumRuleAccess().getTypeTypeRefParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getEnumRuleAccess().getTypeTypeRefParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__TypeAssignment_2_1"


    // $ANTLR start "rule__EnumRule__AlternativesAssignment_4"
    // InternalXtext.g:11161:1: rule__EnumRule__AlternativesAssignment_4 : ( ruleEnumLiterals ) ;
    public final void rule__EnumRule__AlternativesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:11165:1: ( ( ruleEnumLiterals ) )
            // InternalXtext.g:11166:1: ( ruleEnumLiterals )
            {
            // InternalXtext.g:11166:1: ( ruleEnumLiterals )
            // InternalXtext.g:11167:1: ruleEnumLiterals
            {
             before(grammarAccess.getEnumRuleAccess().getAlternativesEnumLiteralsParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEnumLiterals();

            state._fsp--;

             after(grammarAccess.getEnumRuleAccess().getAlternativesEnumLiteralsParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__AlternativesAssignment_4"


    // $ANTLR start "rule__EnumLiterals__ElementsAssignment_1_1_1"
    // InternalXtext.g:11176:1: rule__EnumLiterals__ElementsAssignment_1_1_1 : ( ruleEnumLiteralDeclaration ) ;
    public final void rule__EnumLiterals__ElementsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:11180:1: ( ( ruleEnumLiteralDeclaration ) )
            // InternalXtext.g:11181:1: ( ruleEnumLiteralDeclaration )
            {
            // InternalXtext.g:11181:1: ( ruleEnumLiteralDeclaration )
            // InternalXtext.g:11182:1: ruleEnumLiteralDeclaration
            {
             before(grammarAccess.getEnumLiteralsAccess().getElementsEnumLiteralDeclarationParserRuleCall_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEnumLiteralDeclaration();

            state._fsp--;

             after(grammarAccess.getEnumLiteralsAccess().getElementsEnumLiteralDeclarationParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiterals__ElementsAssignment_1_1_1"


    // $ANTLR start "rule__EnumLiteralDeclaration__EnumLiteralAssignment_0"
    // InternalXtext.g:11191:1: rule__EnumLiteralDeclaration__EnumLiteralAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__EnumLiteralDeclaration__EnumLiteralAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:11195:1: ( ( ( RULE_ID ) ) )
            // InternalXtext.g:11196:1: ( ( RULE_ID ) )
            {
            // InternalXtext.g:11196:1: ( ( RULE_ID ) )
            // InternalXtext.g:11197:1: ( RULE_ID )
            {
             before(grammarAccess.getEnumLiteralDeclarationAccess().getEnumLiteralEEnumLiteralCrossReference_0_0()); 
            // InternalXtext.g:11198:1: ( RULE_ID )
            // InternalXtext.g:11199:1: RULE_ID
            {
             before(grammarAccess.getEnumLiteralDeclarationAccess().getEnumLiteralEEnumLiteralIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEnumLiteralDeclarationAccess().getEnumLiteralEEnumLiteralIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getEnumLiteralDeclarationAccess().getEnumLiteralEEnumLiteralCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiteralDeclaration__EnumLiteralAssignment_0"


    // $ANTLR start "rule__EnumLiteralDeclaration__LiteralAssignment_1_1"
    // InternalXtext.g:11210:1: rule__EnumLiteralDeclaration__LiteralAssignment_1_1 : ( ruleKeyword ) ;
    public final void rule__EnumLiteralDeclaration__LiteralAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXtext.g:11214:1: ( ( ruleKeyword ) )
            // InternalXtext.g:11215:1: ( ruleKeyword )
            {
            // InternalXtext.g:11215:1: ( ruleKeyword )
            // InternalXtext.g:11216:1: ruleKeyword
            {
             before(grammarAccess.getEnumLiteralDeclarationAccess().getLiteralKeywordParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleKeyword();

            state._fsp--;

             after(grammarAccess.getEnumLiteralDeclarationAccess().getLiteralKeywordParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiteralDeclaration__LiteralAssignment_1_1"

    // Delegated rules


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\13\uffff";
    static final String DFA10_eofS =
        "\3\uffff\3\6\1\uffff\3\6\1\uffff";
    static final String DFA10_minS =
        "\6\4\1\uffff\3\4\1\uffff";
    static final String DFA10_maxS =
        "\1\65\2\32\3\65\1\uffff\3\65\1\uffff";
    static final String DFA10_acceptS =
        "\6\uffff\1\2\3\uffff\1\1";
    static final String DFA10_specialS =
        "\13\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\3\1\6\16\uffff\1\5\1\4\4\uffff\1\6\24\uffff\1\2\5\uffff\1\1",
            "\1\7\1\6\16\uffff\1\11\1\10\4\uffff\1\6",
            "\1\7\1\6\16\uffff\1\11\1\10\4\uffff\1\6",
            "\2\6\11\uffff\3\6\2\12\2\6\1\12\3\uffff\2\6\5\uffff\1\6\1\uffff\1\6\1\uffff\1\6\1\uffff\3\6\5\uffff\1\6\5\uffff\1\6",
            "\2\6\11\uffff\3\6\2\12\2\6\1\12\3\uffff\2\6\5\uffff\1\6\1\uffff\1\6\1\uffff\1\6\1\uffff\3\6\5\uffff\1\6\5\uffff\1\6",
            "\2\6\11\uffff\3\6\2\12\2\6\1\12\3\uffff\2\6\5\uffff\1\6\1\uffff\1\6\1\uffff\1\6\1\uffff\3\6\5\uffff\1\6\5\uffff\1\6",
            "",
            "\2\6\11\uffff\3\6\2\12\2\6\1\12\3\uffff\2\6\5\uffff\1\6\1\uffff\1\6\1\uffff\1\6\1\uffff\3\6\5\uffff\1\6\5\uffff\1\6",
            "\2\6\11\uffff\3\6\2\12\2\6\1\12\3\uffff\2\6\5\uffff\1\6\1\uffff\1\6\1\uffff\1\6\1\uffff\3\6\5\uffff\1\6\5\uffff\1\6",
            "\2\6\11\uffff\3\6\2\12\2\6\1\12\3\uffff\2\6\5\uffff\1\6\1\uffff\1\6\1\uffff\1\6\1\uffff\3\6\5\uffff\1\6\5\uffff\1\6",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1838:1: rule__AbstractTokenWithCardinality__Alternatives_0 : ( ( ruleAssignment ) | ( ruleAbstractTerminal ) );";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000300010L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x001C4000A1300010L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000A0000002L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x001C4000A1300012L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008300010L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0008000100007800L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0020802804300030L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0010000000300010L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400010000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000010L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000080004300010L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0020800804300030L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0020800804300032L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000038000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001010000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000004002000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000004300010L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000008000000002L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0020800000300010L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00000000004C0000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000100004300030L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000210000000000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000300030L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0001880014300030L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0001880014300032L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000400000800L});
    }


}