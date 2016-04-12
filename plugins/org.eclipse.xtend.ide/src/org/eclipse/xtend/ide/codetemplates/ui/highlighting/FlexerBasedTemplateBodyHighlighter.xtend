/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.ide.codetemplates.ui.highlighting

import com.google.inject.Inject
import java.io.StringReader
import org.antlr.runtime.Token
import org.eclipse.xtend.core.parser.antlr.internal.FlexerFactory
import org.eclipse.xtext.ui.codetemplates.ui.highlighting.TemplateBodyHighlighter
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor

import static extension org.eclipse.xtext.parser.antlr.TokenTool.*

/**
 * @author Anton Kosyakov - Initial contribution and API
 */
class FlexerBasedTemplateBodyHighlighter extends TemplateBodyHighlighter {

	@Inject
	extension FlexerFactory

	@Inject
	extension AbstractAntlrTokenToAttributeIdMapper

	override doProvideHighlightingFor(String body, IHighlightedPositionAcceptor acceptor) {
		val tokenSource = createTokenSource(new StringReader(body))
		var token = tokenSource.nextToken
		Token eofToken = null;
		if (tokenSource instanceof Lexer) {
			eofToken = ((Lexer)tokenSource).getEOFToken();
		}
		while (token != eofToken) {
			val id = token.type.id
			val offset = token.offset
			val length = token.length
			acceptor.addPosition(offset, length, id)
			token = tokenSource.nextToken
		}
	}

}
