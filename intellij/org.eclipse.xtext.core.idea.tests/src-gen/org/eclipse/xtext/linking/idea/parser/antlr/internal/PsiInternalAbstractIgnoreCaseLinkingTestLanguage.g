/*
 * generated by Xtext
 */
grammar PsiInternalAbstractIgnoreCaseLinkingTestLanguage;

options {
	superClass=AbstractPsiAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.linking.idea.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.linking.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.eclipse.xtext.linking.idea.lang.AbstractIgnoreCaseLinkingTestLanguageElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.linking.services.AbstractIgnoreCaseLinkingTestLanguageGrammarAccess;

import com.intellij.lang.PsiBuilder;
}

@parser::members {

	protected AbstractIgnoreCaseLinkingTestLanguageGrammarAccess grammarAccess;

	protected AbstractIgnoreCaseLinkingTestLanguageElementTypeProvider elementTypeProvider;

	public PsiInternalAbstractIgnoreCaseLinkingTestLanguageParser(PsiBuilder builder, TokenStream input, AbstractIgnoreCaseLinkingTestLanguageElementTypeProvider elementTypeProvider, AbstractIgnoreCaseLinkingTestLanguageGrammarAccess grammarAccess) {
		this(input);
		setPsiBuilder(builder);
    	this.grammarAccess = grammarAccess;
		this.elementTypeProvider = elementTypeProvider;
	}

	@Override
	protected String getFirstRuleName() {
		return "Model";
	}

}

//Entry rule entryRuleModel
entryRuleModel:
	{ markComposite(elementTypeProvider.getModelElementType()); }
	ruleModel
	EOF;

// Rule Model
ruleModel:
	(
		(
			{
				markComposite(elementTypeProvider.getModel_ElementsElementParserRuleCall_0ElementType());
			}
			lv_elements_0_0=ruleElement
			{
				doneComposite();
			}
		)
	)+
;

//Entry rule entryRuleElement
entryRuleElement:
	{ markComposite(elementTypeProvider.getElementElementType()); }
	ruleElement
	EOF;

// Rule Element
ruleElement:
	(
		(
			(
				{
					markLeaf(elementTypeProvider.getElement_NameIDTerminalRuleCall_0_0ElementType());
				}
				lv_name_0_0=RULE_ID
				{
					doneLeaf(lv_name_0_0);
				}
			)
		)
		(
			(
				{
					markLeaf(elementTypeProvider.getElement_ReferenceElementCrossReference_1_0ElementType());
				}
				otherlv_1=RULE_ID
				{
					doneLeaf(otherlv_1);
				}
			)
		)?
		{
			markLeaf(elementTypeProvider.getElement_LeftCurlyBracketKeyword_2ElementType());
		}
		otherlv_2='{'
		{
			doneLeaf(otherlv_2);
		}
		(
			(
				{
					markComposite(elementTypeProvider.getElement_ElementsElementParserRuleCall_3_0ElementType());
				}
				lv_elements_3_0=ruleElement
				{
					doneComposite();
				}
			)
		)*
		{
			markLeaf(elementTypeProvider.getElement_RightCurlyBracketKeyword_4ElementType());
		}
		otherlv_4='}'
		{
			doneLeaf(otherlv_4);
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
