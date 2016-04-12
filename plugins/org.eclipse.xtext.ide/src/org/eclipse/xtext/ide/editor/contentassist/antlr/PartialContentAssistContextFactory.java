/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ide.editor.contentassist.antlr;

import java.util.Collection;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.Token;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;

public class PartialContentAssistContextFactory extends ContentAssistContextFactory {
	@Override
	protected void createContextsForLastCompleteNode(EObject previousModel, boolean strict) {
		String currentNodePrefix = getPrefix(currentNode);
		if (!Strings.isEmpty(currentNodePrefix) && !currentNode.getText().equals(currentNodePrefix)) {
			lexer.setCharStream(new ANTLRStringStream(currentNodePrefix));
			Token token = lexer.nextToken();
			if (token == lexer.getEOFToken()) {
				return;
			}
			while (token != lexer.getEOFToken()) {
				if (isErrorToken(token)) {
					return;
				}
				token = lexer.nextToken();
			}
		}
		String prefix = "";
		Collection<FollowElement> followElements = parseFollowElements(completionOffset, strict);
		doCreateContexts(lastCompleteNode, currentNode, prefix, previousModel, followElements);
	}

	protected Collection<FollowElement> parseFollowElements(int offset, boolean strict) {
		return ((IPartialContentAssistParser) parser).getFollowElements(parseResult, offset, strict);
	}

	@Override
	protected void handleLastCompleteNodeAsPartOfDatatypeNode(){
		String prefix = getPrefix(datatypeNode);
		Collection<FollowElement> followElements = parseFollowElements(datatypeNode.getOffset(), false);
		INode lastCompleteNodeBeforeDatatype = getLastCompleteNodeByOffset(rootNode, datatypeNode.getTotalOffset());
		doCreateContexts(lastCompleteNodeBeforeDatatype, datatypeNode, prefix, currentModel, followElements);
	}

	@Override
	protected void handleLastCompleteNodeIsAtEndOfDatatypeNode() {
		String prefix = getPrefix(lastCompleteNode);
		INode previousNode = getLastCompleteNodeByOffset(rootNode, lastCompleteNode.getOffset());
		EObject previousModel = previousNode.getSemanticElement();
		INode currentDatatypeNode = getContainingDatatypeRuleNode(currentNode);
		Collection<FollowElement> followElements = parseFollowElements(lastCompleteNode.getOffset(), false);
		int prevSize = contextBuilders.size();
		doCreateContexts(previousNode, currentDatatypeNode, prefix, previousModel, followElements);

		if (lastCompleteNode instanceof ILeafNode && lastCompleteNode.getGrammarElement() == null
				&& contextBuilders.size() != prevSize) {
			handleLastCompleteNodeHasNoGrammarElement(contextBuilders.subList(prevSize, contextBuilders.size()),
					previousModel);
		}
	}
}