/**
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.parser.antlr;

import java.io.Reader;
import java.io.StringReader;
import org.eclipse.xtext.parser.antlr.TokenSourceProvider;

/**
 * @author kosyakov - Initial contribution and API
 * @since 2.8
 */
@SuppressWarnings("all")
public abstract class AbstractTokenSourceProvider implements TokenSourceProvider {
  protected /* CharStream */Object getCharStream(final Reader reader) {
    throw new Error("Unresolved compilation problems:"
      + "\nANTLRReaderStream cannot be resolved.");
  }
  
  protected StringReader getReader(final CharSequence text) {
    String _string = text.toString();
    return new StringReader(_string);
  }
  
  @Override
  public TokenSource createTokenSource(final CharSequence text) {
    StringReader _reader = this.getReader(text);
    return this.createTokenSource(_reader);
  }
  
  @Override
  public TokenSource createTokenSource(final Reader reader) {
    throw new Error("Unresolved compilation problems:"
      + "\ncreateTokenSource cannot be resolved");
  }
}
