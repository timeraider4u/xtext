/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.xtext.generator.web;

import com.google.common.base.Objects;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.name.Names;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.emf.mwe2.runtime.Mandatory;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtext.generator.AbstractGeneratorFragment2;
import org.eclipse.xtext.xtext.generator.CodeConfig;
import org.eclipse.xtext.xtext.generator.ILanguageConfig;
import org.eclipse.xtext.xtext.generator.IXtextProjectConfig;
import org.eclipse.xtext.xtext.generator.Issues;
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming;
import org.eclipse.xtext.xtext.generator.XtextVersion;
import org.eclipse.xtext.xtext.generator.model.FileAccessFactory;
import org.eclipse.xtext.xtext.generator.model.GuiceModuleAccess;
import org.eclipse.xtext.xtext.generator.model.IXtextGeneratorFileSystemAccess;
import org.eclipse.xtext.xtext.generator.model.TextFileAccess;
import org.eclipse.xtext.xtext.generator.model.TypeReference;
import org.eclipse.xtext.xtext.generator.model.XtendFileAccess;
import org.eclipse.xtext.xtext.generator.parser.antlr.GrammarNaming;
import org.eclipse.xtext.xtext.generator.util.GrammarUtil2;
import org.eclipse.xtext.xtext.generator.web.RegexpExtensions;
import org.eclipse.xtext.xtext.generator.xbase.XbaseUsageDetector;

/**
 * Main generator fragment for web integration.
 */
@SuppressWarnings("all")
public class WebIntegrationFragment extends AbstractGeneratorFragment2 {
  private enum Framework {
    ORION,
    
    ACE,
    
    CODEMIRROR;
  }
  
  private final static String REQUIREJS_VERSION = "2.1.17";
  
  private final static String REQUIREJS_TEXT_VERSION = "2.0.10-3";
  
  private final static String JQUERY_VERSION = "2.1.4";
  
  private final static String ACE_VERSION = "1.1.9";
  
  private final static String CODEMIRROR_VERSION = "5.5";
  
  @Inject
  private FileAccessFactory fileAccessFactory;
  
  @Inject
  private CodeConfig codeConfig;
  
  @Inject
  @Extension
  private XtextGeneratorNaming _xtextGeneratorNaming;
  
  @Inject
  @Extension
  private GrammarNaming _grammarNaming;
  
  @Inject
  @Extension
  private XbaseUsageDetector _xbaseUsageDetector;
  
  private final HashSet<String> enabledPatterns = new HashSet<String>();
  
  private final HashSet<String> suppressedPatterns = new HashSet<String>();
  
  private WebIntegrationFragment.Framework framework;
  
  private boolean generateJsHighlighting = true;
  
  private String highlightingModuleName;
  
  private String highlightingPath;
  
  private String keywordsFilter = "\\w+";
  
  private boolean generateServlet = false;
  
  private boolean generateWebXml = false;
  
  private boolean useServlet3Api = true;
  
  private boolean generateJettyLauncher = false;
  
  private boolean generateHtmlExample = false;
  
  /**
   * Choose one of the supported frameworks: {@code "Orion"}, {@code "Ace"}, or {@code "CodeMirror"}
   */
  @Mandatory
  public void setFramework(final String frameworkName) {
    String _upperCase = frameworkName.toUpperCase();
    WebIntegrationFragment.Framework _valueOf = WebIntegrationFragment.Framework.valueOf(_upperCase);
    this.framework = _valueOf;
  }
  
  /**
   * Whether JavaScript-based syntax highlighting should be generated. The default is {@code true}.
   */
  public void setGenerateJsHighlighting(final boolean generateJsHighlighting) {
    this.generateJsHighlighting = generateJsHighlighting;
  }
  
  /**
   * Name of the syntax highlighting RequireJS module to be generated.
   */
  public void setHighlightingModuleName(final String moduleName) {
    this.highlightingModuleName = moduleName;
  }
  
  /**
   * The path of the syntax highlighting JavaScript file to be generated. The default is to
   * derive the path from the {@code highlightingModuleName} property.
   */
  public void setHighlightingPath(final String path) {
    this.highlightingPath = path;
  }
  
  /**
   * Regular expression for filtering those language keywords that should be highlighted. The default
   * is {@code \w+}, i.e. keywords consisting only of letters and digits.
   */
  public void setKeywordsFilter(final String keywordsFilter) {
    this.keywordsFilter = keywordsFilter;
  }
  
  /**
   * Whether a servlet for DSL-specific services should be generated. The default is {@code false}.
   */
  public void setGenerateServlet(final boolean generateServlet) {
    this.generateServlet = generateServlet;
  }
  
  /**
   * Whether a web.xml file should be generated. The default is {@code false} (not necessary for Servlet 3 compatible containers).
   */
  public void setGenerateWebXml(final boolean generateWebXml) {
    this.generateWebXml = generateWebXml;
  }
  
  /**
   * Whether the Servlet 3 API ({@code WebServlet} annotation) should be used for the generated servlet.
   * The default is {@code true}.
   */
  public void setUseServlet3Api(final boolean useServlet3Api) {
    this.useServlet3Api = useServlet3Api;
  }
  
  /**
   * Whether a Java main-class for launching a local Jetty server should be generated. The default
   * is {@code false}.
   */
  public void setGenerateJettyLauncher(final boolean generateJettyLauncher) {
    this.generateJettyLauncher = generateJettyLauncher;
  }
  
  /**
   * Whether an example {@code index.html} file for testing the web-based editor should be generated.
   * The default is {@code false}.
   */
  public void setGenerateHtmlExample(final boolean generateHtmlExample) {
    this.generateHtmlExample = generateHtmlExample;
  }
  
  /**
   * Enable a default pattern for syntax highlighting. See the documentation of the chosen
   * framework for details.
   */
  public void addEnablePattern(final String pattern) {
    this.enabledPatterns.add(pattern);
  }
  
  /**
   * Suppress a default pattern for syntax highlighting. See the documentation of the chosen
   * framework for details.
   */
  public void addSuppressPattern(final String pattern) {
    this.suppressedPatterns.add(pattern);
  }
  
  protected TypeReference getServerLauncherClass(final Grammar grammar) {
    String _webBasePackage = this._xtextGeneratorNaming.getWebBasePackage(grammar);
    String _plus = (_webBasePackage + ".");
    String _plus_1 = (_plus + "ServerLauncher");
    return new TypeReference(_plus_1);
  }
  
  protected TypeReference getServletClass(final Grammar grammar) {
    String _webBasePackage = this._xtextGeneratorNaming.getWebBasePackage(grammar);
    String _plus = (_webBasePackage + ".");
    String _simpleName = GrammarUtil.getSimpleName(grammar);
    String _plus_1 = (_plus + _simpleName);
    String _plus_2 = (_plus_1 + "Servlet");
    return new TypeReference(_plus_2);
  }
  
  @Override
  public void checkConfiguration(final Issues issues) {
    super.checkConfiguration(issues);
    if ((this.framework == null)) {
      issues.addError("The property \'framework\' is required.");
    }
    boolean _and = false;
    if (!this.generateJsHighlighting) {
      _and = false;
    } else {
      IXtextProjectConfig _projectConfig = this.getProjectConfig();
      IXtextGeneratorFileSystemAccess _webApp = _projectConfig.getWebApp();
      boolean _tripleEquals = (_webApp == null);
      _and = _tripleEquals;
    }
    if (_and) {
      issues.addWarning("The \'webApp\' outlet is not defined in the project configuration; JS syntax highlighting is disabled.");
    }
    boolean _and_1 = false;
    if (!this.generateServlet) {
      _and_1 = false;
    } else {
      IXtextProjectConfig _projectConfig_1 = this.getProjectConfig();
      IXtextGeneratorFileSystemAccess _webSrc = _projectConfig_1.getWebSrc();
      boolean _tripleEquals_1 = (_webSrc == null);
      _and_1 = _tripleEquals_1;
    }
    if (_and_1) {
      issues.addWarning("The \'webSrc\' outlet is not defined in the project configuration; the generated servlet is disabled.");
    }
    boolean _and_2 = false;
    if (!this.generateJettyLauncher) {
      _and_2 = false;
    } else {
      IXtextProjectConfig _projectConfig_2 = this.getProjectConfig();
      IXtextGeneratorFileSystemAccess _webSrc_1 = _projectConfig_2.getWebSrc();
      boolean _tripleEquals_2 = (_webSrc_1 == null);
      _and_2 = _tripleEquals_2;
    }
    if (_and_2) {
      issues.addWarning("The \'webSrc\' outlet is not defined in the project configuration; the Jetty launcher is disabled.");
    }
    boolean _and_3 = false;
    if (!this.generateHtmlExample) {
      _and_3 = false;
    } else {
      IXtextProjectConfig _projectConfig_3 = this.getProjectConfig();
      IXtextGeneratorFileSystemAccess _webApp_1 = _projectConfig_3.getWebApp();
      boolean _tripleEquals_3 = (_webApp_1 == null);
      _and_3 = _tripleEquals_3;
    }
    if (_and_3) {
      issues.addWarning("The \'webApp\' outlet is not defined in the project configuration; the example HTML page is disabled.");
    }
    final Function1<String, Boolean> _function = new Function1<String, Boolean>() {
      @Override
      public Boolean apply(final String it) {
        return Boolean.valueOf(WebIntegrationFragment.this.suppressedPatterns.contains(it));
      }
    };
    Iterable<String> _filter = IterableExtensions.<String>filter(this.enabledPatterns, _function);
    for (final String pattern : _filter) {
      issues.addError((("The pattern \'" + pattern) + "\' cannot be enabled and suppressed."));
    }
  }
  
  @Override
  public void generate() {
    boolean _and = false;
    if (!this.generateJsHighlighting) {
      _and = false;
    } else {
      IXtextProjectConfig _projectConfig = this.getProjectConfig();
      IXtextGeneratorFileSystemAccess _webApp = _projectConfig.getWebApp();
      boolean _tripleNotEquals = (_webApp != null);
      _and = _tripleNotEquals;
    }
    if (_and) {
      ILanguageConfig _language = this.getLanguage();
      List<String> _fileExtensions = _language.getFileExtensions();
      final String langId = IterableExtensions.<String>head(_fileExtensions);
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(this.highlightingModuleName);
      if (_isNullOrEmpty) {
        String _switchResult = null;
        final WebIntegrationFragment.Framework framework = this.framework;
        if (framework != null) {
          switch (framework) {
            case ORION:
              _switchResult = (("xtext-resources/generated/" + langId) + "-syntax");
              break;
            case ACE:
            case CODEMIRROR:
              _switchResult = ("xtext-resources/generated/mode-" + langId);
              break;
            default:
              break;
          }
        }
        this.highlightingModuleName = _switchResult;
      } else {
        boolean _endsWith = this.highlightingModuleName.endsWith(".js");
        if (_endsWith) {
          int _length = this.highlightingModuleName.length();
          int _minus = (_length - 3);
          String _substring = this.highlightingModuleName.substring(0, _minus);
          this.highlightingModuleName = _substring;
        }
      }
      boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(this.highlightingPath);
      if (_isNullOrEmpty_1) {
        this.highlightingPath = (this.highlightingModuleName + ".js");
      }
      this.generateJsHighlighting(langId);
    }
    boolean _and_1 = false;
    if (!this.generateServlet) {
      _and_1 = false;
    } else {
      IXtextProjectConfig _projectConfig_1 = this.getProjectConfig();
      IXtextGeneratorFileSystemAccess _webSrc = _projectConfig_1.getWebSrc();
      boolean _tripleNotEquals_1 = (_webSrc != null);
      _and_1 = _tripleNotEquals_1;
    }
    if (_and_1) {
      this.generateServlet();
    }
    boolean _and_2 = false;
    if (!this.generateJettyLauncher) {
      _and_2 = false;
    } else {
      IXtextProjectConfig _projectConfig_2 = this.getProjectConfig();
      IXtextGeneratorFileSystemAccess _webSrc_1 = _projectConfig_2.getWebSrc();
      boolean _tripleNotEquals_2 = (_webSrc_1 != null);
      _and_2 = _tripleNotEquals_2;
    }
    if (_and_2) {
      this.generateServerLauncher();
    }
    boolean _and_3 = false;
    if (!this.generateHtmlExample) {
      _and_3 = false;
    } else {
      IXtextProjectConfig _projectConfig_3 = this.getProjectConfig();
      IXtextGeneratorFileSystemAccess _webApp_1 = _projectConfig_3.getWebApp();
      boolean _tripleNotEquals_3 = (_webApp_1 != null);
      _and_3 = _tripleNotEquals_3;
    }
    if (_and_3) {
      this.generateIndexDoc();
      this.generateStyleSheet();
    }
    boolean _and_4 = false;
    if (!this.generateWebXml) {
      _and_4 = false;
    } else {
      IXtextProjectConfig _projectConfig_4 = this.getProjectConfig();
      IXtextGeneratorFileSystemAccess _webApp_2 = _projectConfig_4.getWebApp();
      boolean _tripleNotEquals_4 = (_webApp_2 != null);
      _and_4 = _tripleNotEquals_4;
    }
    if (_and_4) {
      this.generateWebXml();
    }
    StringConcatenationClient _client = new StringConcatenationClient() {
      @Override
      protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
        _builder.append("binder.bind(");
        TypeReference _typeRef = TypeReference.typeRef("org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer");
        _builder.append(_typeRef, "");
        _builder.append(".class).annotatedWith(");
        _builder.append(Names.class, "");
        _builder.append(".named(");
        TypeReference _typeRef_1 = TypeReference.typeRef("org.eclipse.xtext.ide.LexerIdeBindings");
        _builder.append(_typeRef_1, "");
        _builder.append(".CONTENT_ASSIST)).to(");
        Grammar _grammar = WebIntegrationFragment.this.getGrammar();
        TypeReference _internalContentAssistLexerClass = WebIntegrationFragment.this._grammarNaming.getInternalContentAssistLexerClass(_grammar);
        _builder.append(_internalContentAssistLexerClass, "");
        _builder.append(".class);");
      }
    };
    final StringConcatenationClient lexerStatement = _client;
    GuiceModuleAccess.BindingFactory _bindingFactory = new GuiceModuleAccess.BindingFactory();
    GuiceModuleAccess.BindingFactory _addConfiguredBinding = _bindingFactory.addConfiguredBinding("ContentAssistLexer", lexerStatement);
    TypeReference _typeRef = TypeReference.typeRef("org.eclipse.xtext.ide.editor.contentassist.antlr.IContentAssistParser");
    Grammar _grammar = this.getGrammar();
    TypeReference _contentAssistParserClass = this._grammarNaming.getContentAssistParserClass(_grammar);
    GuiceModuleAccess.BindingFactory _addTypeToType = _addConfiguredBinding.addTypeToType(_typeRef, _contentAssistParserClass);
    ILanguageConfig _language_1 = this.getLanguage();
    GuiceModuleAccess _webGenModule = _language_1.getWebGenModule();
    _addTypeToType.contributeTo(_webGenModule);
  }
  
  private final static String DELIMITERS_PATTERN = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("[\\\\s.:;,!?+\\\\-*/&|<>()[\\\\]{}]");
      return _builder.toString();
    }
  }.apply();
  
  protected void generateJsHighlighting(final String langId) {
    Grammar _grammar = this.getGrammar();
    final Set<String> allKeywords = GrammarUtil.getAllKeywords(_grammar);
    final ArrayList<String> wordKeywords = CollectionLiterals.<String>newArrayList();
    final ArrayList<String> nonWordKeywords = CollectionLiterals.<String>newArrayList();
    final Pattern keywordsFilterPattern = Pattern.compile(this.keywordsFilter);
    final Pattern wordKeywordPattern = Pattern.compile("\\w(.*\\w)?");
    final Function1<String, Boolean> _function = new Function1<String, Boolean>() {
      @Override
      public Boolean apply(final String it) {
        Matcher _matcher = keywordsFilterPattern.matcher(it);
        return Boolean.valueOf(_matcher.matches());
      }
    };
    Iterable<String> _filter = IterableExtensions.<String>filter(allKeywords, _function);
    final Procedure1<String> _function_1 = new Procedure1<String>() {
      @Override
      public void apply(final String it) {
        Matcher _matcher = wordKeywordPattern.matcher(it);
        boolean _matches = _matcher.matches();
        if (_matches) {
          wordKeywords.add(it);
        } else {
          nonWordKeywords.add(it);
        }
      }
    };
    IterableExtensions.<String>forEach(_filter, _function_1);
    Collections.<String>sort(wordKeywords);
    Collections.<String>sort(nonWordKeywords);
    final TextFileAccess jsFile = this.fileAccessFactory.createTextFile();
    jsFile.setPath(this.highlightingPath);
    final WebIntegrationFragment.Framework framework = this.framework;
    if (framework != null) {
      switch (framework) {
        case ORION:
          final Collection<String> patterns = this.createOrionPatterns(langId, allKeywords);
          boolean _isEmpty = wordKeywords.isEmpty();
          boolean _not = (!_isEmpty);
          if (_not) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("{name: \"keyword.");
            _builder.append(langId, "");
            _builder.append("\", match: \"\\\\b(?:\" + keywords + \")\\\\b\"}");
            patterns.add(_builder.toString());
          }
          boolean _isEmpty_1 = nonWordKeywords.isEmpty();
          boolean _not_1 = (!_isEmpty_1);
          if (_not_1) {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("{name: \"keyword.extra.");
            _builder_1.append(langId, "");
            _builder_1.append("\", match: \"(?:^|\\\\s)(?:\" + extraKeywords + \")(?=");
            _builder_1.append(WebIntegrationFragment.DELIMITERS_PATTERN, "");
            _builder_1.append("|$)\"}");
            patterns.add(_builder_1.toString());
          }
          StringConcatenationClient _client = new StringConcatenationClient() {
            @Override
            protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
              _builder.append("define(\"");
              _builder.append(WebIntegrationFragment.this.highlightingModuleName, "");
              _builder.append("\", function() {");
              _builder.newLineIfNotEmpty();
              {
                boolean _isEmpty = wordKeywords.isEmpty();
                boolean _not = (!_isEmpty);
                if (_not) {
                  _builder.append("\t");
                  _builder.append("var keywords = \"");
                  {
                    boolean _hasElements = false;
                    for(final String kw : wordKeywords) {
                      if (!_hasElements) {
                        _hasElements = true;
                      } else {
                        _builder.appendImmediate("|", "\t");
                      }
                      String _regexpString = RegexpExtensions.toRegexpString(kw);
                      _builder.append(_regexpString, "\t");
                    }
                  }
                  _builder.append("\";");
                  _builder.newLineIfNotEmpty();
                }
              }
              {
                boolean _isEmpty_1 = nonWordKeywords.isEmpty();
                boolean _not_1 = (!_isEmpty_1);
                if (_not_1) {
                  _builder.append("\t");
                  _builder.append("var extraKeywords = \"");
                  {
                    boolean _hasElements_1 = false;
                    for(final String kw_1 : nonWordKeywords) {
                      if (!_hasElements_1) {
                        _hasElements_1 = true;
                      } else {
                        _builder.appendImmediate("|", "\t");
                      }
                      String _regexpString_1 = RegexpExtensions.toRegexpString(kw_1);
                      _builder.append(_regexpString_1, "\t");
                    }
                  }
                  _builder.append("\";");
                  _builder.newLineIfNotEmpty();
                }
              }
              _builder.append("\t");
              _builder.append("return {");
              _builder.newLine();
              _builder.append("\t\t");
              _builder.append("id: \"xtext.");
              _builder.append(langId, "\t\t");
              _builder.append("\",");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t");
              _builder.append("contentTypes: [\"xtext/");
              _builder.append(langId, "\t\t");
              _builder.append("\"],");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t");
              _builder.append("patterns: [");
              _builder.newLine();
              _builder.append("\t\t\t");
              {
                boolean _hasElements_2 = false;
                for(final String pattern : patterns) {
                  if (!_hasElements_2) {
                    _hasElements_2 = true;
                  } else {
                    _builder.appendImmediate(",\n", "\t\t\t");
                  }
                  _builder.append(pattern, "\t\t\t");
                }
              }
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t");
              _builder.append("]");
              _builder.newLine();
              _builder.append("\t");
              _builder.append("};");
              _builder.newLine();
              _builder.append("});");
              _builder.newLine();
            }
          };
          jsFile.setContent(_client);
          break;
        case ACE:
          final Multimap<String, String> patterns_1 = this.createCodeMirrorPatterns(langId, allKeywords);
          boolean _isEmpty_2 = wordKeywords.isEmpty();
          boolean _not_2 = (!_isEmpty_2);
          if (_not_2) {
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("{token: \"keyword\", regex: \"\\\\b(?:\" + keywords + \")\\\\b\"}");
            patterns_1.put("start", _builder_2.toString());
          }
          boolean _isEmpty_3 = nonWordKeywords.isEmpty();
          boolean _not_3 = (!_isEmpty_3);
          if (_not_3) {
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append("{token: \"keyword\", regex: \"(?:^|\\\\s)(?:\" + extraKeywords + \")(?=");
            _builder_3.append(WebIntegrationFragment.DELIMITERS_PATTERN, "");
            _builder_3.append("|$)\"}");
            patterns_1.put("start", _builder_3.toString());
          }
          StringConcatenationClient _client_1 = new StringConcatenationClient() {
            @Override
            protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
              _builder.append("define(\"");
              _builder.append(WebIntegrationFragment.this.highlightingModuleName, "");
              _builder.append("\", [\"ace/lib/oop\", \"ace/mode/text\", \"ace/mode/text_highlight_rules\"], function(oop, mText, mTextHighlightRules) {");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("var HighlightRules = function() {");
              _builder.newLine();
              {
                boolean _isEmpty = wordKeywords.isEmpty();
                boolean _not = (!_isEmpty);
                if (_not) {
                  _builder.append("\t\t");
                  _builder.append("var keywords = \"");
                  {
                    boolean _hasElements = false;
                    for(final String kw : wordKeywords) {
                      if (!_hasElements) {
                        _hasElements = true;
                      } else {
                        _builder.appendImmediate("|", "\t\t");
                      }
                      String _regexpString = RegexpExtensions.toRegexpString(kw);
                      _builder.append(_regexpString, "\t\t");
                    }
                  }
                  _builder.append("\";");
                  _builder.newLineIfNotEmpty();
                }
              }
              {
                boolean _isEmpty_1 = nonWordKeywords.isEmpty();
                boolean _not_1 = (!_isEmpty_1);
                if (_not_1) {
                  _builder.append("\t\t");
                  _builder.append("var extraKeywords = \"");
                  {
                    boolean _hasElements_1 = false;
                    for(final String kw_1 : nonWordKeywords) {
                      if (!_hasElements_1) {
                        _hasElements_1 = true;
                      } else {
                        _builder.appendImmediate("|", "\t\t");
                      }
                      String _regexpString_1 = RegexpExtensions.toRegexpString(kw_1);
                      _builder.append(_regexpString_1, "\t\t");
                    }
                  }
                  _builder.append("\";");
                  _builder.newLineIfNotEmpty();
                }
              }
              _builder.append("\t\t");
              _builder.append("this.$rules = {");
              _builder.newLine();
              {
                Set<String> _keySet = patterns_1.keySet();
                boolean _hasElements_2 = false;
                for(final String state : _keySet) {
                  if (!_hasElements_2) {
                    _hasElements_2 = true;
                  } else {
                    _builder.appendImmediate(",", "\t\t\t");
                  }
                  _builder.append("\t\t\t");
                  _builder.append("\"");
                  _builder.append(state, "\t\t\t");
                  _builder.append("\": [");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t\t\t");
                  _builder.append("\t");
                  {
                    Collection<String> _get = patterns_1.get(state);
                    boolean _hasElements_3 = false;
                    for(final String rule : _get) {
                      if (!_hasElements_3) {
                        _hasElements_3 = true;
                      } else {
                        _builder.appendImmediate(",\n", "\t\t\t\t");
                      }
                      _builder.append(rule, "\t\t\t\t");
                    }
                  }
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t\t\t");
                  _builder.append("]");
                  _builder.newLine();
                }
              }
              _builder.append("\t\t");
              _builder.append("};");
              _builder.newLine();
              _builder.append("\t");
              _builder.append("};");
              _builder.newLine();
              _builder.append("\t");
              _builder.append("oop.inherits(HighlightRules, mTextHighlightRules.TextHighlightRules);");
              _builder.newLine();
              _builder.append("\t");
              _builder.newLine();
              _builder.append("\t");
              _builder.append("var Mode = function() {");
              _builder.newLine();
              _builder.append("\t\t");
              _builder.append("this.HighlightRules = HighlightRules;");
              _builder.newLine();
              _builder.append("\t");
              _builder.append("};");
              _builder.newLine();
              _builder.append("\t");
              _builder.append("oop.inherits(Mode, mText.Mode);");
              _builder.newLine();
              _builder.append("\t");
              _builder.append("Mode.prototype.$id = \"xtext/");
              _builder.append(langId, "\t");
              _builder.append("\";");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("Mode.prototype.getCompletions = function(state, session, pos, prefix) {");
              _builder.newLine();
              _builder.append("\t\t");
              _builder.append("return [];");
              _builder.newLine();
              _builder.append("\t");
              _builder.append("}");
              _builder.newLine();
              _builder.append("\t");
              _builder.newLine();
              _builder.append("\t");
              _builder.append("return {");
              _builder.newLine();
              _builder.append("\t\t");
              _builder.append("Mode: Mode");
              _builder.newLine();
              _builder.append("\t");
              _builder.append("};");
              _builder.newLine();
              _builder.append("});");
              _builder.newLine();
            }
          };
          jsFile.setContent(_client_1);
          break;
        case CODEMIRROR:
          final Multimap<String, String> patterns_2 = this.createCodeMirrorPatterns(langId, allKeywords);
          boolean _isEmpty_4 = wordKeywords.isEmpty();
          boolean _not_4 = (!_isEmpty_4);
          if (_not_4) {
            StringConcatenation _builder_4 = new StringConcatenation();
            _builder_4.append("{token: \"keyword\", regex: \"\\\\b(?:\" + keywords + \")\\\\b\"}");
            patterns_2.put("start", _builder_4.toString());
          }
          boolean _isEmpty_5 = nonWordKeywords.isEmpty();
          boolean _not_5 = (!_isEmpty_5);
          if (_not_5) {
            StringConcatenation _builder_5 = new StringConcatenation();
            _builder_5.append("{token: \"keyword\", regex: \"(?:^|\\\\s)(?:\" + extraKeywords + \")(?=");
            _builder_5.append(WebIntegrationFragment.DELIMITERS_PATTERN, "");
            _builder_5.append("|$)\"}");
            patterns_2.put("start", _builder_5.toString());
          }
          StringConcatenationClient _client_2 = new StringConcatenationClient() {
            @Override
            protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
              _builder.append("define(\"");
              _builder.append(WebIntegrationFragment.this.highlightingModuleName, "");
              _builder.append("\", [\"codemirror\", \"codemirror/addon/mode/simple\"], function(CodeMirror, SimpleMode) {");
              _builder.newLineIfNotEmpty();
              {
                boolean _isEmpty = wordKeywords.isEmpty();
                boolean _not = (!_isEmpty);
                if (_not) {
                  _builder.append("\t");
                  _builder.append("var keywords = \"");
                  {
                    boolean _hasElements = false;
                    for(final String kw : wordKeywords) {
                      if (!_hasElements) {
                        _hasElements = true;
                      } else {
                        _builder.appendImmediate("|", "\t");
                      }
                      String _regexpString = RegexpExtensions.toRegexpString(kw);
                      _builder.append(_regexpString, "\t");
                    }
                  }
                  _builder.append("\";");
                  _builder.newLineIfNotEmpty();
                }
              }
              {
                boolean _isEmpty_1 = nonWordKeywords.isEmpty();
                boolean _not_1 = (!_isEmpty_1);
                if (_not_1) {
                  _builder.append("\t");
                  _builder.append("var extraKeywords = \"");
                  {
                    boolean _hasElements_1 = false;
                    for(final String kw_1 : nonWordKeywords) {
                      if (!_hasElements_1) {
                        _hasElements_1 = true;
                      } else {
                        _builder.appendImmediate("|", "\t");
                      }
                      String _regexpString_1 = RegexpExtensions.toRegexpString(kw_1);
                      _builder.append(_regexpString_1, "\t");
                    }
                  }
                  _builder.append("\";");
                  _builder.newLineIfNotEmpty();
                }
              }
              _builder.append("\t");
              _builder.append("CodeMirror.defineSimpleMode(\"xtext/");
              _builder.append(langId, "\t");
              _builder.append("\", {");
              _builder.newLineIfNotEmpty();
              {
                Set<String> _keySet = patterns_2.keySet();
                boolean _hasElements_2 = false;
                for(final String state : _keySet) {
                  if (!_hasElements_2) {
                    _hasElements_2 = true;
                  } else {
                    _builder.appendImmediate(",", "\t\t");
                  }
                  _builder.append("\t\t");
                  _builder.append(state, "\t\t");
                  _builder.append(": ");
                  {
                    boolean _equals = Objects.equal(state, "meta");
                    if (_equals) {
                      _builder.append("{");
                    } else {
                      _builder.append("[");
                    }
                  }
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t\t");
                  _builder.append("\t");
                  {
                    Collection<String> _get = patterns_2.get(state);
                    boolean _hasElements_3 = false;
                    for(final String rule : _get) {
                      if (!_hasElements_3) {
                        _hasElements_3 = true;
                      } else {
                        _builder.appendImmediate(",\n", "\t\t\t");
                      }
                      _builder.append(rule, "\t\t\t");
                    }
                  }
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t\t");
                  {
                    boolean _equals_1 = Objects.equal(state, "meta");
                    if (_equals_1) {
                      _builder.append("}");
                    } else {
                      _builder.append("]");
                    }
                  }
                  _builder.newLineIfNotEmpty();
                }
              }
              _builder.append("\t");
              _builder.append("});");
              _builder.newLine();
              _builder.append("});");
              _builder.newLine();
            }
          };
          jsFile.setContent(_client_2);
          break;
        default:
          break;
      }
    }
    IXtextProjectConfig _projectConfig = this.getProjectConfig();
    IXtextGeneratorFileSystemAccess _webApp = _projectConfig.getWebApp();
    jsFile.writeTo(_webApp);
  }
  
  protected Collection<String> createOrionPatterns(final String langId, final Set<String> keywords) {
    Grammar _grammar = this.getGrammar();
    final boolean inheritsTerminals = GrammarUtil2.inherits(_grammar, GrammarUtil2.TERMINALS);
    Grammar _grammar_1 = this.getGrammar();
    final boolean inheritsXbase = this._xbaseUsageDetector.inheritsXbase(_grammar_1);
    final ArrayList<String> patterns = new ArrayList<String>();
    boolean _or = false;
    boolean _contains = this.enabledPatterns.contains("comment_singleLine");
    if (_contains) {
      _or = true;
    } else {
      boolean _and = false;
      if (!(inheritsTerminals || inheritsXbase)) {
        _and = false;
      } else {
        boolean _contains_1 = this.suppressedPatterns.contains("comment_singleLine");
        boolean _not = (!_contains_1);
        _and = _not;
      }
      _or = _and;
    }
    if (_or) {
      patterns.add("{include: \"orion.c-like#comment_singleLine\"}");
    }
    boolean _or_1 = false;
    boolean _contains_2 = this.enabledPatterns.contains("comment_block");
    if (_contains_2) {
      _or_1 = true;
    } else {
      boolean _and_1 = false;
      if (!(inheritsTerminals || inheritsXbase)) {
        _and_1 = false;
      } else {
        boolean _contains_3 = this.suppressedPatterns.contains("comment_block");
        boolean _not_1 = (!_contains_3);
        _and_1 = _not_1;
      }
      _or_1 = _and_1;
    }
    if (_or_1) {
      patterns.add("{include: \"orion.c-like#comment_block\"}");
    }
    boolean _or_2 = false;
    boolean _contains_4 = this.enabledPatterns.contains("string_doubleQuote");
    if (_contains_4) {
      _or_2 = true;
    } else {
      boolean _and_2 = false;
      if (!(inheritsTerminals || inheritsXbase)) {
        _and_2 = false;
      } else {
        boolean _contains_5 = this.suppressedPatterns.contains("string_doubleQuote");
        boolean _not_2 = (!_contains_5);
        _and_2 = _not_2;
      }
      _or_2 = _and_2;
    }
    if (_or_2) {
      patterns.add("{include: \"orion.lib#string_doubleQuote\"}");
    }
    boolean _or_3 = false;
    boolean _contains_6 = this.enabledPatterns.contains("string_singleQuote");
    if (_contains_6) {
      _or_3 = true;
    } else {
      boolean _and_3 = false;
      if (!(inheritsTerminals || inheritsXbase)) {
        _and_3 = false;
      } else {
        boolean _contains_7 = this.suppressedPatterns.contains("string_singleQuote");
        boolean _not_3 = (!_contains_7);
        _and_3 = _not_3;
      }
      _or_3 = _and_3;
    }
    if (_or_3) {
      patterns.add("{include: \"orion.lib#string_singleQuote\"}");
    }
    boolean _or_4 = false;
    boolean _contains_8 = this.enabledPatterns.contains("number_decimal");
    if (_contains_8) {
      _or_4 = true;
    } else {
      boolean _and_4 = false;
      if (!(inheritsTerminals || inheritsXbase)) {
        _and_4 = false;
      } else {
        boolean _contains_9 = this.suppressedPatterns.contains("number_decimal");
        boolean _not_4 = (!_contains_9);
        _and_4 = _not_4;
      }
      _or_4 = _and_4;
    }
    if (_or_4) {
      patterns.add("{include: \"orion.lib#number_decimal\"}");
    }
    boolean _or_5 = false;
    boolean _contains_10 = this.enabledPatterns.contains("number_hex");
    if (_contains_10) {
      _or_5 = true;
    } else {
      boolean _and_5 = false;
      if (!inheritsXbase) {
        _and_5 = false;
      } else {
        boolean _contains_11 = this.suppressedPatterns.contains("number_hex");
        boolean _not_5 = (!_contains_11);
        _and_5 = _not_5;
      }
      _or_5 = _and_5;
    }
    if (_or_5) {
      patterns.add("{include: \"orion.lib#number_hex\"}");
    }
    boolean _or_6 = false;
    boolean _contains_12 = this.enabledPatterns.contains("brace_open");
    if (_contains_12) {
      _or_6 = true;
    } else {
      boolean _and_6 = false;
      boolean _contains_13 = keywords.contains("{");
      if (!_contains_13) {
        _and_6 = false;
      } else {
        boolean _contains_14 = this.suppressedPatterns.contains("brace_open");
        boolean _not_6 = (!_contains_14);
        _and_6 = _not_6;
      }
      _or_6 = _and_6;
    }
    if (_or_6) {
      patterns.add("{include: \"orion.lib#brace_open\"}");
    }
    boolean _or_7 = false;
    boolean _contains_15 = this.enabledPatterns.contains("brace_close");
    if (_contains_15) {
      _or_7 = true;
    } else {
      boolean _and_7 = false;
      boolean _contains_16 = keywords.contains("}");
      if (!_contains_16) {
        _and_7 = false;
      } else {
        boolean _contains_17 = this.suppressedPatterns.contains("brace_close");
        boolean _not_7 = (!_contains_17);
        _and_7 = _not_7;
      }
      _or_7 = _and_7;
    }
    if (_or_7) {
      patterns.add("{include: \"orion.lib#brace_close\"}");
    }
    boolean _or_8 = false;
    boolean _contains_18 = this.enabledPatterns.contains("bracket_open");
    if (_contains_18) {
      _or_8 = true;
    } else {
      boolean _and_8 = false;
      boolean _contains_19 = keywords.contains("[");
      if (!_contains_19) {
        _and_8 = false;
      } else {
        boolean _contains_20 = this.suppressedPatterns.contains("bracket_open");
        boolean _not_8 = (!_contains_20);
        _and_8 = _not_8;
      }
      _or_8 = _and_8;
    }
    if (_or_8) {
      patterns.add("{include: \"orion.lib#bracket_open\"}");
    }
    boolean _or_9 = false;
    boolean _contains_21 = this.enabledPatterns.contains("bracket_close");
    if (_contains_21) {
      _or_9 = true;
    } else {
      boolean _and_9 = false;
      boolean _contains_22 = keywords.contains("]");
      if (!_contains_22) {
        _and_9 = false;
      } else {
        boolean _contains_23 = this.suppressedPatterns.contains("bracket_close");
        boolean _not_9 = (!_contains_23);
        _and_9 = _not_9;
      }
      _or_9 = _and_9;
    }
    if (_or_9) {
      patterns.add("{include: \"orion.lib#bracket_close\"}");
    }
    boolean _or_10 = false;
    boolean _contains_24 = this.enabledPatterns.contains("parenthesis_open");
    if (_contains_24) {
      _or_10 = true;
    } else {
      boolean _and_10 = false;
      boolean _contains_25 = keywords.contains("(");
      if (!_contains_25) {
        _and_10 = false;
      } else {
        boolean _contains_26 = this.suppressedPatterns.contains("parenthesis_open");
        boolean _not_10 = (!_contains_26);
        _and_10 = _not_10;
      }
      _or_10 = _and_10;
    }
    if (_or_10) {
      patterns.add("{include: \"orion.lib#parenthesis_open\"}");
    }
    boolean _or_11 = false;
    boolean _contains_27 = this.enabledPatterns.contains("parenthesis_close");
    if (_contains_27) {
      _or_11 = true;
    } else {
      boolean _and_11 = false;
      boolean _contains_28 = keywords.contains(")");
      if (!_contains_28) {
        _and_11 = false;
      } else {
        boolean _contains_29 = this.suppressedPatterns.contains("parenthesis_close");
        boolean _not_11 = (!_contains_29);
        _and_11 = _not_11;
      }
      _or_11 = _and_11;
    }
    if (_or_11) {
      patterns.add("{include: \"orion.lib#parenthesis_close\"}");
    }
    boolean _contains_30 = this.enabledPatterns.contains("doc_block");
    if (_contains_30) {
      patterns.add("{include: \"orion.lib#doc_block\"}");
    }
    return patterns;
  }
  
  protected Multimap<String, String> createCodeMirrorPatterns(final String langId, final Set<String> keywords) {
    Grammar _grammar = this.getGrammar();
    final boolean inheritsTerminals = GrammarUtil2.inherits(_grammar, GrammarUtil2.TERMINALS);
    Grammar _grammar_1 = this.getGrammar();
    final boolean inheritsXbase = this._xbaseUsageDetector.inheritsXbase(_grammar_1);
    final LinkedHashMultimap<String, String> patterns = LinkedHashMultimap.<String, String>create();
    boolean _or = false;
    boolean _contains = this.enabledPatterns.contains("comment_singleLine");
    if (_contains) {
      _or = true;
    } else {
      boolean _and = false;
      if (!(inheritsTerminals || inheritsXbase)) {
        _and = false;
      } else {
        boolean _contains_1 = this.suppressedPatterns.contains("comment_singleLine");
        boolean _not = (!_contains_1);
        _and = _not;
      }
      _or = _and;
    }
    final boolean hasSingleLineComment = _or;
    if (hasSingleLineComment) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("{token: \"comment\", regex: \"\\\\/\\\\/.*$\"}");
      patterns.put("start", _builder.toString());
    }
    boolean _or_1 = false;
    boolean _contains_2 = this.enabledPatterns.contains("comment_block");
    if (_contains_2) {
      _or_1 = true;
    } else {
      boolean _and_1 = false;
      if (!(inheritsTerminals || inheritsXbase)) {
        _and_1 = false;
      } else {
        boolean _contains_3 = this.suppressedPatterns.contains("comment_block");
        boolean _not_1 = (!_contains_3);
        _and_1 = _not_1;
      }
      _or_1 = _and_1;
    }
    if (_or_1) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("{token: \"comment\", regex: \"\\\\/\\\\*\", next : \"comment\"}");
      patterns.put("start", _builder_1.toString());
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("{token: \"comment\", regex: \".*?\\\\*\\\\/\", next : \"start\"}");
      patterns.put("comment", _builder_2.toString());
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("{token: \"comment\", regex: \".+\"}");
      patterns.put("comment", _builder_3.toString());
    }
    boolean _or_2 = false;
    boolean _contains_4 = this.enabledPatterns.contains("string_doubleQuote");
    if (_contains_4) {
      _or_2 = true;
    } else {
      boolean _and_2 = false;
      if (!(inheritsTerminals || inheritsXbase)) {
        _and_2 = false;
      } else {
        boolean _contains_5 = this.suppressedPatterns.contains("string_doubleQuote");
        boolean _not_2 = (!_contains_5);
        _and_2 = _not_2;
      }
      _or_2 = _and_2;
    }
    if (_or_2) {
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append("{token: \"string\", regex: \'[\"](?:(?:\\\\\\\\.)|(?:[^\"\\\\\\\\]))*?[\"]\'}");
      patterns.put("start", _builder_4.toString());
    }
    boolean _or_3 = false;
    boolean _contains_6 = this.enabledPatterns.contains("string_singleQuote");
    if (_contains_6) {
      _or_3 = true;
    } else {
      boolean _and_3 = false;
      if (!(inheritsTerminals || inheritsXbase)) {
        _and_3 = false;
      } else {
        boolean _contains_7 = this.suppressedPatterns.contains("string_singleQuote");
        boolean _not_3 = (!_contains_7);
        _and_3 = _not_3;
      }
      _or_3 = _and_3;
    }
    if (_or_3) {
      StringConcatenation _builder_5 = new StringConcatenation();
      _builder_5.append("{token: \"string\", regex: \"[\'](?:(?:\\\\\\\\.)|(?:[^\'\\\\\\\\]))*?[\']\"}");
      patterns.put("start", _builder_5.toString());
    }
    boolean _or_4 = false;
    boolean _contains_8 = this.enabledPatterns.contains("number_decimal");
    if (_contains_8) {
      _or_4 = true;
    } else {
      boolean _and_4 = false;
      if (!(inheritsTerminals || inheritsXbase)) {
        _and_4 = false;
      } else {
        boolean _contains_9 = this.suppressedPatterns.contains("number_decimal");
        boolean _not_4 = (!_contains_9);
        _and_4 = _not_4;
      }
      _or_4 = _and_4;
    }
    if (_or_4) {
      StringConcatenation _builder_6 = new StringConcatenation();
      _builder_6.append("{token: \"constant.numeric\", regex: \"[+-]?\\\\d+(?:(?:\\\\.\\\\d*)?(?:[eE][+-]?\\\\d+)?)?\\\\b\"}");
      patterns.put("start", _builder_6.toString());
    }
    boolean _or_5 = false;
    boolean _contains_10 = this.enabledPatterns.contains("number_hex");
    if (_contains_10) {
      _or_5 = true;
    } else {
      boolean _and_5 = false;
      if (!inheritsXbase) {
        _and_5 = false;
      } else {
        boolean _contains_11 = this.suppressedPatterns.contains("number_hex");
        boolean _not_5 = (!_contains_11);
        _and_5 = _not_5;
      }
      _or_5 = _and_5;
    }
    if (_or_5) {
      StringConcatenation _builder_7 = new StringConcatenation();
      _builder_7.append("{token: \"constant.numeric\", regex: \"0[xX][0-9a-fA-F]+\\\\b\"}");
      patterns.put("start", _builder_7.toString());
    }
    boolean _or_6 = false;
    boolean _contains_12 = this.enabledPatterns.contains("bracket_open");
    if (_contains_12) {
      _or_6 = true;
    } else {
      boolean _and_6 = false;
      boolean _contains_13 = keywords.contains("[");
      if (!_contains_13) {
        _and_6 = false;
      } else {
        boolean _contains_14 = this.suppressedPatterns.contains("bracket_open");
        boolean _not_6 = (!_contains_14);
        _and_6 = _not_6;
      }
      _or_6 = _and_6;
    }
    final boolean bracketOpen = _or_6;
    boolean _or_7 = false;
    boolean _contains_15 = this.enabledPatterns.contains("parenthesis_open");
    if (_contains_15) {
      _or_7 = true;
    } else {
      boolean _and_7 = false;
      boolean _contains_16 = keywords.contains("(");
      if (!_contains_16) {
        _and_7 = false;
      } else {
        boolean _contains_17 = this.suppressedPatterns.contains("parenthesis_open");
        boolean _not_7 = (!_contains_17);
        _and_7 = _not_7;
      }
      _or_7 = _and_7;
    }
    final boolean parenOpen = _or_7;
    boolean _or_8 = false;
    boolean _contains_18 = this.enabledPatterns.contains("brace_open");
    if (_contains_18) {
      _or_8 = true;
    } else {
      boolean _and_8 = false;
      boolean _contains_19 = keywords.contains("{");
      if (!_contains_19) {
        _and_8 = false;
      } else {
        boolean _contains_20 = this.suppressedPatterns.contains("brace_open");
        boolean _not_8 = (!_contains_20);
        _and_8 = _not_8;
      }
      _or_8 = _and_8;
    }
    final boolean braceOpen = _or_8;
    boolean _or_9 = false;
    if ((bracketOpen || parenOpen)) {
      _or_9 = true;
    } else {
      _or_9 = braceOpen;
    }
    if (_or_9) {
      StringConcatenation _builder_8 = new StringConcatenation();
      _builder_8.append("{token: \"lparen\", regex: \"[");
      {
        if (bracketOpen) {
          _builder_8.append("\\\\[");
        }
      }
      {
        if (parenOpen) {
          _builder_8.append("(");
        }
      }
      {
        if (braceOpen) {
          _builder_8.append("{");
        }
      }
      _builder_8.append("]\"}");
      patterns.put("start", _builder_8.toString());
    }
    boolean _or_10 = false;
    boolean _contains_21 = this.enabledPatterns.contains("bracket_close");
    if (_contains_21) {
      _or_10 = true;
    } else {
      boolean _and_9 = false;
      boolean _contains_22 = keywords.contains("]");
      if (!_contains_22) {
        _and_9 = false;
      } else {
        boolean _contains_23 = this.suppressedPatterns.contains("bracket_close");
        boolean _not_9 = (!_contains_23);
        _and_9 = _not_9;
      }
      _or_10 = _and_9;
    }
    final boolean bracketClose = _or_10;
    boolean _or_11 = false;
    boolean _contains_24 = this.enabledPatterns.contains("parenthesis_close");
    if (_contains_24) {
      _or_11 = true;
    } else {
      boolean _and_10 = false;
      boolean _contains_25 = keywords.contains(")");
      if (!_contains_25) {
        _and_10 = false;
      } else {
        boolean _contains_26 = this.suppressedPatterns.contains("parenthesis_close");
        boolean _not_10 = (!_contains_26);
        _and_10 = _not_10;
      }
      _or_11 = _and_10;
    }
    final boolean parenClose = _or_11;
    boolean _or_12 = false;
    boolean _contains_27 = this.enabledPatterns.contains("brace_close");
    if (_contains_27) {
      _or_12 = true;
    } else {
      boolean _and_11 = false;
      boolean _contains_28 = keywords.contains("}");
      if (!_contains_28) {
        _and_11 = false;
      } else {
        boolean _contains_29 = this.suppressedPatterns.contains("brace_close");
        boolean _not_11 = (!_contains_29);
        _and_11 = _not_11;
      }
      _or_12 = _and_11;
    }
    final boolean braceClose = _or_12;
    boolean _or_13 = false;
    if ((bracketClose || parenClose)) {
      _or_13 = true;
    } else {
      _or_13 = braceClose;
    }
    if (_or_13) {
      StringConcatenation _builder_9 = new StringConcatenation();
      _builder_9.append("{token: \"rparen\", regex: \"[");
      {
        if (bracketClose) {
          _builder_9.append("\\\\]");
        }
      }
      {
        if (parenClose) {
          _builder_9.append(")");
        }
      }
      {
        if (braceClose) {
          _builder_9.append("}");
        }
      }
      _builder_9.append("]\"}");
      patterns.put("start", _builder_9.toString());
    }
    boolean _and_12 = false;
    boolean _equals = Objects.equal(this.framework, WebIntegrationFragment.Framework.CODEMIRROR);
    if (!_equals) {
      _and_12 = false;
    } else {
      boolean _containsKey = patterns.containsKey("comment");
      _and_12 = _containsKey;
    }
    if (_and_12) {
      StringConcatenation _builder_10 = new StringConcatenation();
      _builder_10.append("dontIndentStates: [\"comment\"]");
      patterns.put("meta", _builder_10.toString());
    }
    boolean _and_13 = false;
    boolean _equals_1 = Objects.equal(this.framework, WebIntegrationFragment.Framework.CODEMIRROR);
    if (!_equals_1) {
      _and_13 = false;
    } else {
      _and_13 = hasSingleLineComment;
    }
    if (_and_13) {
      StringConcatenation _builder_11 = new StringConcatenation();
      _builder_11.append("lineComment: \"//\"");
      patterns.put("meta", _builder_11.toString());
    }
    return patterns;
  }
  
  protected void generateIndexDoc() {
    IXtextProjectConfig _projectConfig = this.getProjectConfig();
    IXtextGeneratorFileSystemAccess _webApp = _projectConfig.getWebApp();
    boolean _isFile = _webApp.isFile("index.html");
    if (_isFile) {
      return;
    }
    final TextFileAccess indexFile = this.fileAccessFactory.createTextFile();
    indexFile.setPath("index.html");
    StringConcatenationClient _client = new StringConcatenationClient() {
      @Override
      protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
        _builder.append("<html>");
        _builder.newLine();
        _builder.append("<head>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<meta http-equiv=\"Content-Language\" content=\"en-us\">");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<title>Example Web Editor</title>");
        _builder.newLine();
        {
          boolean _equals = Objects.equal(WebIntegrationFragment.this.framework, WebIntegrationFragment.Framework.ORION);
          if (_equals) {
            _builder.append("\t");
            _builder.append("<link rel=\"stylesheet\" type=\"text/css\" href=\"orion/code_edit/built-codeEdit.css\"/>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<link rel=\"stylesheet\" type=\"text/css\" href=\"xtext/");
            XtextVersion _xtextVersion = WebIntegrationFragment.this.codeConfig.getXtextVersion();
            _builder.append(_xtextVersion, "\t");
            _builder.append("/xtext-orion.css\"/>");
            _builder.newLineIfNotEmpty();
          } else {
            boolean _equals_1 = Objects.equal(WebIntegrationFragment.this.framework, WebIntegrationFragment.Framework.ACE);
            if (_equals_1) {
              _builder.append("\t");
              _builder.append("<link rel=\"stylesheet\" type=\"text/css\" href=\"xtext/");
              XtextVersion _xtextVersion_1 = WebIntegrationFragment.this.codeConfig.getXtextVersion();
              _builder.append(_xtextVersion_1, "\t");
              _builder.append("/xtext-ace.css\"/>");
              _builder.newLineIfNotEmpty();
            } else {
              boolean _equals_2 = Objects.equal(WebIntegrationFragment.this.framework, WebIntegrationFragment.Framework.CODEMIRROR);
              if (_equals_2) {
                _builder.append("\t");
                _builder.append("<link rel=\"stylesheet\" type=\"text/css\" href=\"webjars/codemirror/");
                _builder.append(WebIntegrationFragment.CODEMIRROR_VERSION, "\t");
                _builder.append("/lib/codemirror.css\"/>");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("<link rel=\"stylesheet\" type=\"text/css\" href=\"webjars/codemirror/");
                _builder.append(WebIntegrationFragment.CODEMIRROR_VERSION, "\t");
                _builder.append("/addon/hint/show-hint.css\"/>");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("<link rel=\"stylesheet\" type=\"text/css\" href=\"xtext/");
                XtextVersion _xtextVersion_2 = WebIntegrationFragment.this.codeConfig.getXtextVersion();
                _builder.append(_xtextVersion_2, "\t");
                _builder.append("/xtext-codemirror.css\"/>");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        _builder.append("\t");
        _builder.append("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\"/>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<script src=\"webjars/requirejs/");
        _builder.append(WebIntegrationFragment.REQUIREJS_VERSION, "\t");
        _builder.append("/require.min.js\"></script>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("<script type=\"text/javascript\">");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("var baseUrl = window.location.pathname;");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("var fileIndex = baseUrl.indexOf(\"index.html\");");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("if (fileIndex > 0)");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("baseUrl = baseUrl.slice(0, fileIndex);");
        _builder.newLine();
        {
          boolean _equals_3 = Objects.equal(WebIntegrationFragment.this.framework, WebIntegrationFragment.Framework.ORION);
          if (_equals_3) {
            _builder.append("\t\t");
            _builder.append("require.config({");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("baseUrl: baseUrl,");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("paths: {");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("\"text\": \"webjars/requirejs-text/");
            _builder.append(WebIntegrationFragment.REQUIREJS_TEXT_VERSION, "\t\t\t\t");
            _builder.append("/text\",");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("\"jquery\": \"webjars/jquery/");
            _builder.append(WebIntegrationFragment.JQUERY_VERSION, "\t\t\t\t");
            _builder.append("/jquery.min\",");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("\"xtext/xtext-orion\": \"xtext/");
            XtextVersion _xtextVersion_3 = WebIntegrationFragment.this.codeConfig.getXtextVersion();
            _builder.append(_xtextVersion_3, "\t\t\t\t");
            _builder.append("/xtext-orion\"");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("});");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("require([\"orion/code_edit/built-codeEdit-amd\"], function() {");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("require([\"xtext/xtext-orion\"], function(xtext) {");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("xtext.createEditor({");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("baseUrl: baseUrl,");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("syntaxDefinition: \"");
            String _xifexpression = null;
            if (WebIntegrationFragment.this.generateJsHighlighting) {
              _xifexpression = WebIntegrationFragment.this.highlightingModuleName;
            } else {
              _xifexpression = "none";
            }
            _builder.append(_xifexpression, "\t\t\t\t\t");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("});");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("});");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("});");
            _builder.newLine();
          } else {
            boolean _equals_4 = Objects.equal(WebIntegrationFragment.this.framework, WebIntegrationFragment.Framework.ACE);
            if (_equals_4) {
              _builder.append("\t\t");
              _builder.append("require.config({");
              _builder.newLine();
              _builder.append("\t\t");
              _builder.append("\t");
              _builder.append("baseUrl: baseUrl,");
              _builder.newLine();
              _builder.append("\t\t");
              _builder.append("\t");
              _builder.append("paths: {");
              _builder.newLine();
              _builder.append("\t\t");
              _builder.append("\t\t");
              _builder.append("\"jquery\": \"webjars/jquery/");
              _builder.append(WebIntegrationFragment.JQUERY_VERSION, "\t\t\t\t");
              _builder.append("/jquery.min\",");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t");
              _builder.append("\t\t");
              _builder.append("\"ace/ext/language_tools\": \"webjars/ace/");
              _builder.append(WebIntegrationFragment.ACE_VERSION, "\t\t\t\t");
              _builder.append("/src/ext-language_tools\",");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t");
              _builder.append("\t\t");
              _builder.append("\"xtext/xtext-ace\": \"xtext/");
              XtextVersion _xtextVersion_4 = WebIntegrationFragment.this.codeConfig.getXtextVersion();
              _builder.append(_xtextVersion_4, "\t\t\t\t");
              _builder.append("/xtext-ace\"");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t");
              _builder.append("\t");
              _builder.append("}");
              _builder.newLine();
              _builder.append("\t\t");
              _builder.append("});");
              _builder.newLine();
              _builder.append("\t\t");
              _builder.append("require([\"webjars/ace/");
              _builder.append(WebIntegrationFragment.ACE_VERSION, "\t\t");
              _builder.append("/src/ace\"], function() {");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t");
              _builder.append("\t");
              _builder.append("require([\"xtext/xtext-ace\"], function(xtext) {");
              _builder.newLine();
              _builder.append("\t\t");
              _builder.append("\t\t");
              _builder.append("xtext.createEditor({");
              _builder.newLine();
              _builder.append("\t\t");
              _builder.append("\t\t\t");
              _builder.append("baseUrl: baseUrl,");
              _builder.newLine();
              _builder.append("\t\t");
              _builder.append("\t\t\t");
              _builder.append("syntaxDefinition: \"");
              String _xifexpression_1 = null;
              if (WebIntegrationFragment.this.generateJsHighlighting) {
                _xifexpression_1 = WebIntegrationFragment.this.highlightingModuleName;
              } else {
                _xifexpression_1 = "none";
              }
              _builder.append(_xifexpression_1, "\t\t\t\t\t");
              _builder.append("\"");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t");
              _builder.append("\t\t");
              _builder.append("});");
              _builder.newLine();
              _builder.append("\t\t");
              _builder.append("\t");
              _builder.append("});");
              _builder.newLine();
              _builder.append("\t\t");
              _builder.append("});");
              _builder.newLine();
            } else {
              boolean _equals_5 = Objects.equal(WebIntegrationFragment.this.framework, WebIntegrationFragment.Framework.CODEMIRROR);
              if (_equals_5) {
                _builder.append("\t\t");
                _builder.append("require.config({");
                _builder.newLine();
                _builder.append("\t\t");
                _builder.append("\t");
                _builder.append("baseUrl: baseUrl,");
                _builder.newLine();
                _builder.append("\t\t");
                _builder.append("\t");
                _builder.append("paths: {");
                _builder.newLine();
                _builder.append("\t\t");
                _builder.append("\t\t");
                _builder.append("\"jquery\": \"webjars/jquery/");
                _builder.append(WebIntegrationFragment.JQUERY_VERSION, "\t\t\t\t");
                _builder.append("/jquery.min\",");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t");
                _builder.append("\t\t");
                _builder.append("\"xtext/xtext-codemirror\": \"xtext/");
                XtextVersion _xtextVersion_5 = WebIntegrationFragment.this.codeConfig.getXtextVersion();
                _builder.append(_xtextVersion_5, "\t\t\t\t");
                _builder.append("/xtext-codemirror\"");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t");
                _builder.append("\t");
                _builder.append("},");
                _builder.newLine();
                _builder.append("\t\t");
                _builder.append("\t");
                _builder.append("packages: [{");
                _builder.newLine();
                _builder.append("\t\t");
                _builder.append("\t\t");
                _builder.append("name: \"codemirror\",");
                _builder.newLine();
                _builder.append("\t\t");
                _builder.append("\t\t");
                _builder.append("location: \"webjars/codemirror/");
                _builder.append(WebIntegrationFragment.CODEMIRROR_VERSION, "\t\t\t\t");
                _builder.append("\",");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t");
                _builder.append("\t\t");
                _builder.append("main: \"lib/codemirror\"");
                _builder.newLine();
                _builder.append("\t\t");
                _builder.append("\t");
                _builder.append("}]");
                _builder.newLine();
                _builder.append("\t\t");
                _builder.append("});");
                _builder.newLine();
                _builder.append("\t\t");
                _builder.append("require([");
                {
                  if (WebIntegrationFragment.this.generateJsHighlighting) {
                    _builder.append("\"");
                    _builder.append(WebIntegrationFragment.this.highlightingModuleName, "\t\t");
                    _builder.append("\", ");
                  }
                }
                _builder.append("\"xtext/xtext-codemirror\"], function(");
                {
                  if (WebIntegrationFragment.this.generateJsHighlighting) {
                    _builder.append("mode, ");
                  }
                }
                _builder.append("xtext) {");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t");
                _builder.append("\t");
                _builder.append("xtext.createEditor({");
                _builder.newLine();
                _builder.append("\t\t");
                _builder.append("\t\t");
                _builder.append("baseUrl: baseUrl");
                {
                  if ((!WebIntegrationFragment.this.generateJsHighlighting)) {
                    _builder.append(",");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t");
                    _builder.append("\t\t");
                    _builder.append("syntaxDefinition: \"none\"");
                    _builder.newLine();
                  }
                }
                _builder.append("\t\t");
                _builder.append("\t");
                _builder.append("});");
                _builder.newLine();
                _builder.append("\t\t");
                _builder.append("});");
                _builder.newLine();
              }
            }
          }
        }
        _builder.append("\t");
        _builder.append("</script>");
        _builder.newLine();
        _builder.append("</head>");
        _builder.newLine();
        _builder.append("<body>");
        _builder.newLine();
        _builder.newLine();
        _builder.append("<div class=\"container\">");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<div class=\"header\">");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("<h1>Example ");
        Grammar _grammar = WebIntegrationFragment.this.getGrammar();
        String _simpleName = GrammarUtil.getSimpleName(_grammar);
        _builder.append(_simpleName, "\t\t");
        _builder.append(" Web Editor</h1>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</div>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<div class=\"content\">");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("<div id=\"xtext-editor\" data-editor-xtext-lang=\"");
        ILanguageConfig _language = WebIntegrationFragment.this.getLanguage();
        List<String> _fileExtensions = _language.getFileExtensions();
        String _head = IterableExtensions.<String>head(_fileExtensions);
        _builder.append(_head, "\t\t");
        _builder.append("\"></div>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</div>");
        _builder.newLine();
        _builder.append("</div>");
        _builder.newLine();
        _builder.newLine();
        _builder.append("</body>");
        _builder.newLine();
        _builder.append("</html>");
        _builder.newLine();
      }
    };
    indexFile.setContent(_client);
    IXtextProjectConfig _projectConfig_1 = this.getProjectConfig();
    IXtextGeneratorFileSystemAccess _webApp_1 = _projectConfig_1.getWebApp();
    indexFile.writeTo(_webApp_1);
  }
  
  protected void generateStyleSheet() {
    IXtextProjectConfig _projectConfig = this.getProjectConfig();
    IXtextGeneratorFileSystemAccess _webApp = _projectConfig.getWebApp();
    boolean _isFile = _webApp.isFile("style.css");
    if (_isFile) {
      return;
    }
    final TextFileAccess styleFile = this.fileAccessFactory.createTextFile();
    styleFile.setPath("style.css");
    StringConcatenationClient _client = new StringConcatenationClient() {
      @Override
      protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
        _builder.append("body {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("width: 100%;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("height: 100%;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("overflow: hidden;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("font: 16px Helvetica,sans-serif;");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("a {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("color: #22a;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("text-decoration: none;");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("a:hover {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("text-decoration: underline;");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append(".container {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("display: block;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("position: absolute;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("top: 0;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("bottom: 0;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("left: 0;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("right: 0;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("margin: 20px;");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append(".header {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("display: block;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("position: absolute;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("background-color: #e8e8e8;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("top: 0;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("left: 0;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("right: 0;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("height: 60px;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("padding: 10px;");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append(".content {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("display: block;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("position: absolute;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("top: 90px;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("bottom: 0;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("left: 0;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("width: 640px;");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("#xtext-editor {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("display: block;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("position: absolute;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("top: 0;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("bottom: 0;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("left: 0;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("right: 0;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("padding: 4px;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("border: 1px solid #aaa;");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
        {
          boolean _equals = Objects.equal(WebIntegrationFragment.this.framework, WebIntegrationFragment.Framework.ORION);
          if (_equals) {
            _builder.newLine();
            _builder.append("/************* Examples for custom icons *************/");
            _builder.newLine();
            _builder.newLine();
            _builder.append("/* For all elements of type Greeting or its subtypes */ ");
            _builder.newLine();
            _builder.append("/*");
            _builder.newLine();
            _builder.append("\t");
            _builder.append(".Greeting-icon {");
            _builder.newLine();
            _builder.append("  \t\t");
            _builder.append("background-image: url(\'images/Greeting.gif\');");
            _builder.newLine();
            _builder.append("  \t");
            _builder.append("}");
            _builder.newLine();
            _builder.append(" ");
            _builder.append("*/");
            _builder.newLine();
            _builder.newLine();
            _builder.append("/* Only in hovers */ ");
            _builder.newLine();
            _builder.append("/*");
            _builder.newLine();
            _builder.append("\t");
            _builder.append(".xtext-hover .Greeting-icon {");
            _builder.newLine();
            _builder.append("  \t\t");
            _builder.append("background-image: url(\'images/Greeting.gif\');");
            _builder.newLine();
            _builder.append("  \t");
            _builder.append("}");
            _builder.newLine();
            _builder.append(" ");
            _builder.append("*/");
            _builder.newLine();
          }
        }
      }
    };
    styleFile.setContent(_client);
    IXtextProjectConfig _projectConfig_1 = this.getProjectConfig();
    IXtextGeneratorFileSystemAccess _webApp_1 = _projectConfig_1.getWebApp();
    styleFile.writeTo(_webApp_1);
  }
  
  protected void generateServerLauncher() {
    Grammar _grammar = this.getGrammar();
    TypeReference _serverLauncherClass = this.getServerLauncherClass(_grammar);
    StringConcatenationClient _client = new StringConcatenationClient() {
      @Override
      protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
        _builder.append("/**");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("* This program starts an HTTP server for testing the web integration of your DSL.");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("* Just execute it and point a web browser to http://localhost:8080/");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("class ");
        Grammar _grammar = WebIntegrationFragment.this.getGrammar();
        TypeReference _serverLauncherClass = WebIntegrationFragment.this.getServerLauncherClass(_grammar);
        String _simpleName = _serverLauncherClass.getSimpleName();
        _builder.append(_simpleName, "");
        _builder.append(" {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("def static void main(String[] args) {");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("val server = new ");
        TypeReference _typeRef = TypeReference.typeRef("org.eclipse.jetty.server.Server");
        _builder.append(_typeRef, "\t\t");
        _builder.append("(new ");
        TypeReference _typeRef_1 = TypeReference.typeRef("java.net.InetSocketAddress");
        _builder.append(_typeRef_1, "\t\t");
        _builder.append("(\'localhost\', 8080))");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("server.handler = new ");
        TypeReference _typeRef_2 = TypeReference.typeRef("org.eclipse.jetty.webapp.WebAppContext");
        _builder.append(_typeRef_2, "\t\t");
        _builder.append(" => [");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("resourceBase = \'");
        IXtextProjectConfig _projectConfig = WebIntegrationFragment.this.getProjectConfig();
        IXtextGeneratorFileSystemAccess _webApp = _projectConfig.getWebApp();
        String _path = _webApp.getPath();
        IXtextProjectConfig _projectConfig_1 = WebIntegrationFragment.this.getProjectConfig();
        IXtextGeneratorFileSystemAccess _webRoot = _projectConfig_1.getWebRoot();
        String _path_1 = _webRoot.getPath();
        String _plus = (_path_1 + "/");
        String _replace = _path.replace(_plus, "");
        _builder.append(_replace, "\t\t\t");
        _builder.append("\'");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("welcomeFiles = #[\"index.html\"]");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("contextPath = \"/\"");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("configurations = #[");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("new ");
        TypeReference _typeRef_3 = TypeReference.typeRef("org.eclipse.jetty.annotations.AnnotationConfiguration");
        _builder.append(_typeRef_3, "\t\t\t\t");
        _builder.append(",");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t");
        _builder.append("new ");
        TypeReference _typeRef_4 = TypeReference.typeRef("org.eclipse.jetty.webapp.WebXmlConfiguration");
        _builder.append(_typeRef_4, "\t\t\t\t");
        _builder.append(",");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t");
        _builder.append("new ");
        TypeReference _typeRef_5 = TypeReference.typeRef("org.eclipse.jetty.webapp.WebInfConfiguration");
        _builder.append(_typeRef_5, "\t\t\t\t");
        _builder.append(",");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t");
        _builder.append("new ");
        TypeReference _typeRef_6 = TypeReference.typeRef("org.eclipse.jetty.webapp.MetaInfConfiguration");
        _builder.append(_typeRef_6, "\t\t\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("]");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("setAttribute(");
        TypeReference _typeRef_7 = TypeReference.typeRef("org.eclipse.jetty.webapp.WebInfConfiguration");
        _builder.append(_typeRef_7, "\t\t\t");
        _builder.append(".CONTAINER_JAR_PATTERN, \'.*/");
        Grammar _grammar_1 = WebIntegrationFragment.this.getGrammar();
        String _webBasePackage = WebIntegrationFragment.this._xtextGeneratorNaming.getWebBasePackage(_grammar_1);
        String _replace_1 = _webBasePackage.replace(".", "\\.");
        _builder.append(_replace_1, "\t\t\t");
        _builder.append(".*,.*/org\\\\.eclipse\\\\.xtext\\\\.web.*,.*/org\\\\.webjars.*\')");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("]");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("val log = new ");
        TypeReference _typeRef_8 = TypeReference.typeRef("org.eclipse.jetty.util.log.Slf4jLog");
        _builder.append(_typeRef_8, "\t\t");
        _builder.append("(");
        Grammar _grammar_2 = WebIntegrationFragment.this.getGrammar();
        TypeReference _serverLauncherClass_1 = WebIntegrationFragment.this.getServerLauncherClass(_grammar_2);
        String _simpleName_1 = _serverLauncherClass_1.getSimpleName();
        _builder.append(_simpleName_1, "\t\t");
        _builder.append(".name)");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("try {");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("server.start");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("log.info(\'Press enter to stop the server...\')");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("new Thread[");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("val key = System.in.read");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("server.stop");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("if (key == -1)");
        _builder.newLine();
        _builder.append("\t\t\t\t\t");
        _builder.append("log.warn(\'The standard input stream is empty.\')");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("].start");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("server.join");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("} catch (Exception exception) {");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("log.warn(exception.message)");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("System.exit(1)");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
      }
    };
    XtendFileAccess _createXtendFile = this.fileAccessFactory.createXtendFile(_serverLauncherClass, _client);
    IXtextProjectConfig _projectConfig = this.getProjectConfig();
    IXtextGeneratorFileSystemAccess _webSrc = _projectConfig.getWebSrc();
    _createXtendFile.writeTo(_webSrc);
  }
  
  protected void generateServlet() {
    Grammar _grammar = this.getGrammar();
    TypeReference _servletClass = this.getServletClass(_grammar);
    StringConcatenationClient _client = new StringConcatenationClient() {
      @Override
      protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
        _builder.append("/**");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("* Deploy this class into a servlet container to enable DSL-specific services.");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        {
          if (WebIntegrationFragment.this.useServlet3Api) {
            _builder.append("@");
            TypeReference _typeReference = new TypeReference("javax.servlet.annotation.WebServlet");
            _builder.append(_typeReference, "");
            _builder.append("(name = \'XtextServices\', urlPatterns = \'/xtext-service/*\')");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("class ");
        Grammar _grammar = WebIntegrationFragment.this.getGrammar();
        TypeReference _servletClass = WebIntegrationFragment.this.getServletClass(_grammar);
        String _simpleName = _servletClass.getSimpleName();
        _builder.append(_simpleName, "");
        _builder.append(" extends ");
        TypeReference _typeRef = TypeReference.typeRef("org.eclipse.xtext.web.servlet.XtextServlet");
        _builder.append(_typeRef, "");
        _builder.append(" {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("val ");
        _builder.append(List.class, "\t");
        _builder.append("<");
        _builder.append(ExecutorService.class, "\t");
        _builder.append("> executorServices = newArrayList");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("override init() {");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("super.init()");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("val ");
        _builder.append(Provider.class, "\t\t");
        _builder.append("<");
        _builder.append(ExecutorService.class, "\t\t");
        _builder.append("> executorServiceProvider = [");
        _builder.append(Executors.class, "\t\t");
        _builder.append(".newCachedThreadPool => [executorServices += it]]");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("new ");
        Grammar _grammar_1 = WebIntegrationFragment.this.getGrammar();
        TypeReference _webSetup = WebIntegrationFragment.this._xtextGeneratorNaming.getWebSetup(_grammar_1);
        _builder.append(_webSetup, "\t\t");
        _builder.append("(executorServiceProvider).createInjectorAndDoEMFRegistration()");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("override destroy() {");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("executorServices.forEach[shutdown()]");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("executorServices.clear()");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("super.destroy()");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
      }
    };
    XtendFileAccess _createXtendFile = this.fileAccessFactory.createXtendFile(_servletClass, _client);
    IXtextProjectConfig _projectConfig = this.getProjectConfig();
    IXtextGeneratorFileSystemAccess _webSrc = _projectConfig.getWebSrc();
    _createXtendFile.writeTo(_webSrc);
  }
  
  protected void generateWebXml() {
    IXtextProjectConfig _projectConfig = this.getProjectConfig();
    IXtextGeneratorFileSystemAccess _webApp = _projectConfig.getWebApp();
    boolean _isFile = _webApp.isFile("WEB-INF/web.xml");
    if (_isFile) {
      return;
    }
    final TextFileAccess xmlFile = this.fileAccessFactory.createTextFile();
    xmlFile.setPath("WEB-INF/web.xml");
    StringConcatenationClient _client = new StringConcatenationClient() {
      @Override
      protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
        _builder.append("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>");
        _builder.newLine();
        _builder.append("<web-app version=\"");
        {
          if (WebIntegrationFragment.this.useServlet3Api) {
            _builder.append("3.0");
          } else {
            _builder.append("2.3");
          }
        }
        _builder.append("\">");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("<display-name>Xtext Example Application</display-name>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<description>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("This Example demonstrates the usage of Xtext with a servlet container.");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("</description>");
        _builder.newLine();
        {
          if (WebIntegrationFragment.this.generateServlet) {
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<servlet>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<servlet-name>XtextServices</servlet-name>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<description>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("Back-end for the DSL-specific services of Xtext.");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("</description>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<servlet-class>");
            Grammar _grammar = WebIntegrationFragment.this.getGrammar();
            TypeReference _servletClass = WebIntegrationFragment.this.getServletClass(_grammar);
            _builder.append(_servletClass, "\t\t");
            _builder.append("</servlet-class>");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("</servlet>");
            _builder.newLine();
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<servlet-mapping>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<servlet-name>XtextServices</servlet-name>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<url-pattern>/xtext-service/*</url-pattern>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("</servlet-mapping>");
            _builder.newLine();
          }
        }
        {
          if ((!WebIntegrationFragment.this.useServlet3Api)) {
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<servlet>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<servlet-name>StaticContentServlet</servlet-name>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<servlet-class>org.eclipse.xtext.web.servlet.StaticContentServlet</servlet-class>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("</servlet>");
            _builder.newLine();
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<servlet-mapping>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<servlet-name>StaticContentServlet</servlet-name>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<url-pattern>/xtext/*</url-pattern>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("</servlet-mapping>");
            _builder.newLine();
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<servlet>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<servlet-name>WebjarsServlet</servlet-name>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<servlet-class>org.webjars.servlet.WebjarsServlet</servlet-class>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("</servlet>");
            _builder.newLine();
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<servlet-mapping>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<servlet-name>WebjarsServlet</servlet-name>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<url-pattern>/webjars/*</url-pattern>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("</servlet-mapping>");
            _builder.newLine();
          }
        }
        {
          if (WebIntegrationFragment.this.generateHtmlExample) {
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<welcome-file-list>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<welcome-file>index.html</welcome-file>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("</welcome-file-list>");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<session-config>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("<session-timeout>30</session-timeout>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("</session-config>");
        _builder.newLine();
        _builder.append("</web-app>");
        _builder.newLine();
      }
    };
    xmlFile.setContent(_client);
    IXtextProjectConfig _projectConfig_1 = this.getProjectConfig();
    IXtextGeneratorFileSystemAccess _webApp_1 = _projectConfig_1.getWebApp();
    xmlFile.writeTo(_webApp_1);
  }
}
