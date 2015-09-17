/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.xtext.generator.model;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xtext.generator.CodeConfig;
import org.eclipse.xtext.xtext.generator.model.TextFileAccess;
import org.eclipse.xtext.xtext.generator.model.TypeReference;

@SuppressWarnings("all")
public class JavaFileAccess extends TextFileAccess {
  private static class JavaTypeAwareStringConcatenation extends StringConcatenation {
    private final JavaFileAccess access;
    
    public JavaTypeAwareStringConcatenation(final JavaFileAccess access) {
      super(access.codeConfig.getLineDelimiter());
      this.access = access;
    }
    
    @Override
    public String getStringRepresentation(final Object object) {
      String _xifexpression = null;
      if ((object instanceof TypeReference)) {
        _xifexpression = this.access.importType(((TypeReference)object));
      } else {
        String _xifexpression_1 = null;
        if ((object instanceof Class<?>)) {
          TypeReference _typeReference = new TypeReference(((Class<?>)object));
          _xifexpression_1 = this.access.importType(_typeReference);
        } else {
          String _xifexpression_2 = null;
          boolean _and = false;
          if (!(object instanceof EClass)) {
            _and = false;
          } else {
            _and = (this.access.resourceSet != null);
          }
          if (_and) {
            TypeReference _typeReference_1 = new TypeReference(((EClass) object), this.access.resourceSet);
            _xifexpression_2 = this.access.importType(_typeReference_1);
          } else {
            _xifexpression_2 = object.toString();
          }
          _xifexpression_1 = _xifexpression_2;
        }
        _xifexpression = _xifexpression_1;
      }
      return _xifexpression;
    }
  }
  
  /**
   * A list of keywords in the Java language. Use this to avoid illegal variable names.
   */
  public final static Set<String> JAVA_KEYWORDS = Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("abstract", "continue", "for", "new", "switch", "assert", "default", "goto", "package", "synchronized", "boolean", "do", "if", "private", "this", "break", "double", "implements", "protected", "throw", "byte", "else", "import", "public", "throws", "case", "enum", "instanceof", "return", "transient", "catch", "extends", "int", "short", "try", "char", "final", "interface", "static", "void", "class", "finally", "long", "strictfp", "volatile", "const", "float", "native", "super", "while"));
  
  /**
   * Set this value for the 'importNestedTypeThreshold' property to disable importing of nested types
   */
  public final static int DONT_IMPORT_NESTED_TYPES = Integer.MAX_VALUE;
  
  protected final Map<String, String> imports = CollectionLiterals.<String, String>newHashMap();
  
  protected final TypeReference javaType;
  
  protected final CodeConfig codeConfig;
  
  @Accessors
  private int importNestedTypeThreshold = 8;
  
  @Accessors
  private boolean markedAsGenerated;
  
  @Accessors(AccessorType.PROTECTED_SETTER)
  private ResourceSet resourceSet;
  
  protected JavaFileAccess(final TypeReference typeRef, final CodeConfig codeConfig) {
    List<String> _simpleNames = typeRef.getSimpleNames();
    int _length = ((Object[])Conversions.unwrapArray(_simpleNames, Object.class)).length;
    boolean _greaterThan = (_length > 1);
    if (_greaterThan) {
      throw new IllegalArgumentException(("Nested type cannot be serialized: " + typeRef));
    }
    this.javaType = typeRef;
    this.codeConfig = codeConfig;
    String _path = typeRef.getPath();
    String _plus = (_path + ".");
    String _fileExtension = this.getFileExtension();
    String _plus_1 = (_plus + _fileExtension);
    this.setPath(_plus_1);
  }
  
  protected String getFileExtension() {
    return "java";
  }
  
  public String importType(final TypeReference typeRef) {
    final List<String> simpleNames = typeRef.getSimpleNames();
    String usableName = null;
    boolean _or = false;
    String _packageName = typeRef.getPackageName();
    boolean _equals = Objects.equal(_packageName, "java.lang");
    if (_equals) {
      _or = true;
    } else {
      String _packageName_1 = typeRef.getPackageName();
      String _packageName_2 = this.javaType.getPackageName();
      boolean _equals_1 = Objects.equal(_packageName_1, _packageName_2);
      _or = _equals_1;
    }
    if (_or) {
      String _join = IterableExtensions.join(simpleNames, ".");
      usableName = _join;
    } else {
      boolean found = false;
      for (int i = (((Object[])Conversions.unwrapArray(simpleNames, Object.class)).length - 1); ((i >= 0) && (!found)); i--) {
        {
          final String simpleName = simpleNames.get(i);
          if ((usableName == null)) {
            usableName = simpleName;
          } else {
            usableName = ((simpleName + ".") + usableName);
          }
          boolean _and = false;
          boolean _isJavaDefaultType = CodeGenUtil.isJavaDefaultType(simpleName);
          boolean _not = (!_isJavaDefaultType);
          if (!_not) {
            _and = false;
          } else {
            boolean _and_1 = false;
            if (!(i > 0)) {
              _and_1 = false;
            } else {
              int _length = simpleName.length();
              boolean _lessEqualsThan = (_length <= this.importNestedTypeThreshold);
              _and_1 = _lessEqualsThan;
            }
            boolean _not_1 = (!_and_1);
            _and = _not_1;
          }
          if (_and) {
            String _packageName_3 = typeRef.getPackageName();
            String _plus = (_packageName_3 + ".");
            List<String> _subList = simpleNames.subList(0, (i + 1));
            String _join_1 = IterableExtensions.join(_subList, ".");
            final String importable = (_plus + _join_1);
            final String imported = this.imports.get(usableName);
            if ((imported == null)) {
              this.imports.put(usableName, importable);
              found = true;
            } else {
              boolean _equals_2 = Objects.equal(imported, importable);
              if (_equals_2) {
                found = true;
              }
            }
          }
        }
      }
      if ((!found)) {
        String _name = typeRef.getName();
        usableName = _name;
      }
    }
    List<TypeReference> _typeArguments = typeRef.getTypeArguments();
    final Function1<TypeReference, CharSequence> _function = new Function1<TypeReference, CharSequence>() {
      @Override
      public CharSequence apply(final TypeReference it) {
        return JavaFileAccess.this.importType(it);
      }
    };
    String _join_1 = IterableExtensions.<TypeReference>join(_typeArguments, "<", ", ", ">", _function);
    return (usableName + _join_1);
  }
  
  @Override
  public CharSequence setContent(final StringConcatenationClient javaContent) {
    CharSequence _xblockexpression = null;
    {
      final JavaFileAccess.JavaTypeAwareStringConcatenation javaStringConcat = new JavaFileAccess.JavaTypeAwareStringConcatenation(this);
      javaStringConcat.append(javaContent);
      _xblockexpression = this.internalContents = javaStringConcat;
    }
    return _xblockexpression;
  }
  
  protected boolean appendSemicolons() {
    return true;
  }
  
  @Override
  public CharSequence getContent() {
    Collection<String> _values = this.imports.values();
    final ArrayList<String> sortedImports = Lists.<String>newArrayList(_values);
    Collections.<String>sort(sortedImports);
    StringConcatenation _builder = new StringConcatenation();
    String _fileHeader = this.codeConfig.getFileHeader();
    _builder.append(_fileHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _packageName = this.javaType.getPackageName();
    _builder.append(_packageName, "");
    {
      boolean _appendSemicolons = this.appendSemicolons();
      if (_appendSemicolons) {
        _builder.append(";");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      for(final String importName : sortedImports) {
        _builder.append("import ");
        _builder.append(importName, "");
        {
          boolean _appendSemicolons_1 = this.appendSemicolons();
          if (_appendSemicolons_1) {
            _builder.append(";");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append(this.internalContents, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Pure
  public int getImportNestedTypeThreshold() {
    return this.importNestedTypeThreshold;
  }
  
  public void setImportNestedTypeThreshold(final int importNestedTypeThreshold) {
    this.importNestedTypeThreshold = importNestedTypeThreshold;
  }
  
  @Pure
  public boolean isMarkedAsGenerated() {
    return this.markedAsGenerated;
  }
  
  public void setMarkedAsGenerated(final boolean markedAsGenerated) {
    this.markedAsGenerated = markedAsGenerated;
  }
  
  protected void setResourceSet(final ResourceSet resourceSet) {
    this.resourceSet = resourceSet;
  }
}
