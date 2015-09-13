/**
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.xtext.generator.parser.antlr;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xtext.generator.parser.antlr.splitting.AntlrParserSplitter;
import org.eclipse.xtext.xtext.generator.parser.antlr.splitting.PartialClassExtractor;

@Accessors
@SuppressWarnings("all")
public class AntlrOptions {
  private boolean backtrack = false;
  
  private boolean backtrackLexer = false;
  
  private boolean memoize = false;
  
  private int k = (-1);
  
  private boolean ignoreCase = false;
  
  private boolean classSplitting = false;
  
  private int fieldsPerClass = AntlrParserSplitter.FIELDS_PER_CLASS;
  
  private int methodsPerClass = PartialClassExtractor.METHODS_PER_CLASS;
  
  private boolean forceHoisting = false;
  
  @Pure
  public boolean isBacktrack() {
    return this.backtrack;
  }
  
  public void setBacktrack(final boolean backtrack) {
    this.backtrack = backtrack;
  }
  
  @Pure
  public boolean isBacktrackLexer() {
    return this.backtrackLexer;
  }
  
  public void setBacktrackLexer(final boolean backtrackLexer) {
    this.backtrackLexer = backtrackLexer;
  }
  
  @Pure
  public boolean isMemoize() {
    return this.memoize;
  }
  
  public void setMemoize(final boolean memoize) {
    this.memoize = memoize;
  }
  
  @Pure
  public int getK() {
    return this.k;
  }
  
  public void setK(final int k) {
    this.k = k;
  }
  
  @Pure
  public boolean isIgnoreCase() {
    return this.ignoreCase;
  }
  
  public void setIgnoreCase(final boolean ignoreCase) {
    this.ignoreCase = ignoreCase;
  }
  
  @Pure
  public boolean isClassSplitting() {
    return this.classSplitting;
  }
  
  public void setClassSplitting(final boolean classSplitting) {
    this.classSplitting = classSplitting;
  }
  
  @Pure
  public int getFieldsPerClass() {
    return this.fieldsPerClass;
  }
  
  public void setFieldsPerClass(final int fieldsPerClass) {
    this.fieldsPerClass = fieldsPerClass;
  }
  
  @Pure
  public int getMethodsPerClass() {
    return this.methodsPerClass;
  }
  
  public void setMethodsPerClass(final int methodsPerClass) {
    this.methodsPerClass = methodsPerClass;
  }
  
  @Pure
  public boolean isForceHoisting() {
    return this.forceHoisting;
  }
  
  public void setForceHoisting(final boolean forceHoisting) {
    this.forceHoisting = forceHoisting;
  }
}
