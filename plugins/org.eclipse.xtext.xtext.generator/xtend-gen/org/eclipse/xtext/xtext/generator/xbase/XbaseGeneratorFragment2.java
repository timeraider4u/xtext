/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.xtext.generator.xbase;

import com.google.inject.Inject;
import com.google.inject.name.Names;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.TypeRef;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.ILocationInFileProvider;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xtext.generator.AbstractGeneratorFragment2;
import org.eclipse.xtext.xtext.generator.ILanguageConfig;
import org.eclipse.xtext.xtext.generator.IXtextProjectConfig;
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming;
import org.eclipse.xtext.xtext.generator.model.FileAccessFactory;
import org.eclipse.xtext.xtext.generator.model.GuiceModuleAccess;
import org.eclipse.xtext.xtext.generator.model.IXtextGeneratorFileSystemAccess;
import org.eclipse.xtext.xtext.generator.model.ManifestAccess;
import org.eclipse.xtext.xtext.generator.model.PluginXmlAccess;
import org.eclipse.xtext.xtext.generator.model.TypeReference;
import org.eclipse.xtext.xtext.generator.model.XtendFileAccess;
import org.eclipse.xtext.xtext.generator.util.GenModelUtil2;
import org.eclipse.xtext.xtext.generator.xbase.XbaseUsageDetector;

@SuppressWarnings("all")
public class XbaseGeneratorFragment2 extends AbstractGeneratorFragment2 {
  @Accessors(AccessorType.PUBLIC_SETTER)
  private boolean generateXtendInferrer = true;
  
  @Accessors(AccessorType.PUBLIC_SETTER)
  private boolean useInferredJvmModel = true;
  
  @Accessors(AccessorType.PUBLIC_SETTER)
  private boolean jdtTypeHierarchy = true;
  
  @Accessors(AccessorType.PUBLIC_SETTER)
  private boolean jdtCallHierarchy = true;
  
  @Accessors(AccessorType.PUBLIC_SETTER)
  private boolean skipExportedPackage = false;
  
  @Inject
  private FileAccessFactory fileAccessFactory;
  
  @Inject
  @Extension
  private XtextGeneratorNaming _xtextGeneratorNaming;
  
  @Inject
  @Extension
  private XbaseUsageDetector _xbaseUsageDetector;
  
  protected TypeReference getJvmModelInferrer() {
    Grammar _grammar = this.getGrammar();
    String _runtimeBasePackage = this._xtextGeneratorNaming.getRuntimeBasePackage(_grammar);
    String _plus = (_runtimeBasePackage + ".jvmmodel.");
    Grammar _grammar_1 = this.getGrammar();
    String _simpleName = GrammarUtil.getSimpleName(_grammar_1);
    String _plus_1 = (_plus + _simpleName);
    String _plus_2 = (_plus_1 + "JvmModelInferrer");
    return new TypeReference(_plus_2);
  }
  
  protected TypeReference getImportScopeProvider(final ILanguageConfig langConfig) {
    TypeReference _xifexpression = null;
    Grammar _grammar = langConfig.getGrammar();
    boolean _usesXImportSection = this._xbaseUsageDetector.usesXImportSection(_grammar);
    if (_usesXImportSection) {
      _xifexpression = TypeReference.typeRef("org.eclipse.xtext.xbase.scoping.XImportSectionNamespaceScopeProvider");
    } else {
      _xifexpression = TypeReference.typeRef("org.eclipse.xtext.xbase.scoping.XbaseImportedNamespaceScopeProvider");
    }
    return _xifexpression;
  }
  
  @Override
  public void generate() {
    Grammar _grammar = this.getGrammar();
    boolean _inheritsXbase = this._xbaseUsageDetector.inheritsXbase(_grammar);
    boolean _not = (!_inheritsXbase);
    if (_not) {
      return;
    }
    this.contributeRuntimeGuiceBindings();
    this.contributeEclipsePluginGuiceBindings();
    IXtextProjectConfig _projectConfig = this.getProjectConfig();
    PluginXmlAccess _eclipsePluginPluginXml = _projectConfig.getEclipsePluginPluginXml();
    boolean _tripleNotEquals = (_eclipsePluginPluginXml != null);
    if (_tripleNotEquals) {
      this.contributeEclipsePluginExtensions();
    }
    if (this.generateXtendInferrer) {
      this.doGenerateXtendInferrer();
    }
    IXtextProjectConfig _projectConfig_1 = this.getProjectConfig();
    ManifestAccess _runtimeManifest = _projectConfig_1.getRuntimeManifest();
    boolean _tripleNotEquals_1 = (_runtimeManifest != null);
    if (_tripleNotEquals_1) {
      IXtextProjectConfig _projectConfig_2 = this.getProjectConfig();
      ManifestAccess _runtimeManifest_1 = _projectConfig_2.getRuntimeManifest();
      Set<String> _requiredBundles = _runtimeManifest_1.getRequiredBundles();
      _requiredBundles.addAll(
        Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("org.eclipse.xtext.xbase", "org.eclipse.xtext.xbase.lib")));
      if (((this.generateXtendInferrer || this.useInferredJvmModel) && (!this.skipExportedPackage))) {
        IXtextProjectConfig _projectConfig_3 = this.getProjectConfig();
        ManifestAccess _runtimeManifest_2 = _projectConfig_3.getRuntimeManifest();
        Set<String> _exportedPackages = _runtimeManifest_2.getExportedPackages();
        TypeReference _jvmModelInferrer = this.getJvmModelInferrer();
        String _packageName = _jvmModelInferrer.getPackageName();
        _exportedPackages.add(_packageName);
      }
    }
    IXtextProjectConfig _projectConfig_4 = this.getProjectConfig();
    ManifestAccess _eclipsePluginManifest = _projectConfig_4.getEclipsePluginManifest();
    boolean _tripleNotEquals_2 = (_eclipsePluginManifest != null);
    if (_tripleNotEquals_2) {
      IXtextProjectConfig _projectConfig_5 = this.getProjectConfig();
      ManifestAccess _eclipsePluginManifest_1 = _projectConfig_5.getEclipsePluginManifest();
      Set<String> _requiredBundles_1 = _eclipsePluginManifest_1.getRequiredBundles();
      _requiredBundles_1.addAll(
        Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("org.eclipse.xtext.xbase.ui", "org.eclipse.jdt.debug.ui")));
    }
  }
  
  protected void contributeRuntimeGuiceBindings() {
    GuiceModuleAccess.BindingFactory _bindingFactory = new GuiceModuleAccess.BindingFactory();
    TypeReference _typeRef = TypeReference.typeRef(IQualifiedNameProvider.class);
    TypeReference _typeRef_1 = TypeReference.typeRef("org.eclipse.xtext.xbase.scoping.XbaseQualifiedNameProvider");
    final GuiceModuleAccess.BindingFactory bindingFactory = _bindingFactory.addTypeToType(_typeRef, _typeRef_1);
    if (this.useInferredJvmModel) {
      TypeReference _typeRef_2 = TypeReference.typeRef(ILocationInFileProvider.class);
      TypeReference _typeRef_3 = TypeReference.typeRef("org.eclipse.xtext.xbase.jvmmodel.JvmLocationInFileProvider");
      GuiceModuleAccess.BindingFactory _addTypeToType = bindingFactory.addTypeToType(_typeRef_2, _typeRef_3);
      TypeReference _typeRef_4 = TypeReference.typeRef(IGlobalScopeProvider.class);
      TypeReference _typeRef_5 = TypeReference.typeRef("org.eclipse.xtext.common.types.xtext.TypesAwareDefaultGlobalScopeProvider");
      GuiceModuleAccess.BindingFactory _addTypeToType_1 = _addTypeToType.addTypeToType(_typeRef_4, _typeRef_5);
      TypeReference _typeRef_6 = TypeReference.typeRef("org.eclipse.xtext.xbase.validation.FeatureNameValidator");
      TypeReference _typeRef_7 = TypeReference.typeRef("org.eclipse.xtext.xbase.validation.LogicalContainerAwareFeatureNameValidator");
      GuiceModuleAccess.BindingFactory _addTypeToType_2 = _addTypeToType_1.addTypeToType(_typeRef_6, _typeRef_7);
      TypeReference _typeRef_8 = TypeReference.typeRef("org.eclipse.xtext.xbase.typesystem.internal.DefaultBatchTypeResolver");
      TypeReference _typeRef_9 = TypeReference.typeRef("org.eclipse.xtext.xbase.typesystem.internal.LogicalContainerAwareBatchTypeResolver");
      GuiceModuleAccess.BindingFactory _addTypeToType_3 = _addTypeToType_2.addTypeToType(_typeRef_8, _typeRef_9);
      TypeReference _typeRef_10 = TypeReference.typeRef("org.eclipse.xtext.xbase.typesystem.internal.DefaultReentrantTypeResolver");
      TypeReference _typeRef_11 = TypeReference.typeRef("org.eclipse.xtext.xbase.typesystem.internal.LogicalContainerAwareReentrantTypeResolver");
      GuiceModuleAccess.BindingFactory _addTypeToType_4 = _addTypeToType_3.addTypeToType(_typeRef_10, _typeRef_11);
      TypeReference _typeRef_12 = TypeReference.typeRef(IResourceValidator.class);
      TypeReference _typeRef_13 = TypeReference.typeRef("org.eclipse.xtext.xbase.annotations.validation.DerivedStateAwareResourceValidator");
      _addTypeToType_4.addTypeToType(_typeRef_12, _typeRef_13);
      if (this.generateXtendInferrer) {
        TypeReference _typeRef_14 = TypeReference.typeRef("org.eclipse.xtext.xbase.jvmmodel.IJvmModelInferrer");
        TypeReference _jvmModelInferrer = this.getJvmModelInferrer();
        bindingFactory.addTypeToType(_typeRef_14, _jvmModelInferrer);
      }
    } else {
      TypeReference _typeRef_15 = TypeReference.typeRef(ILocationInFileProvider.class);
      TypeReference _typeRef_16 = TypeReference.typeRef("org.eclipse.xtext.xbase.resource.XbaseLocationInFileProvider");
      bindingFactory.addTypeToType(_typeRef_15, _typeRef_16);
    }
    ILanguageConfig _language = this.getLanguage();
    Grammar _grammar = _language.getGrammar();
    boolean _usesXImportSection = this._xbaseUsageDetector.usesXImportSection(_grammar);
    if (_usesXImportSection) {
      StringConcatenationClient _client = new StringConcatenationClient() {
        @Override
        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
          _builder.append("binder.bind(");
          _builder.append(IScopeProvider.class, "");
          _builder.append(".class).annotatedWith(");
          _builder.append(Names.class, "");
          _builder.append(".named(");
          _builder.append(AbstractDeclarativeScopeProvider.class, "");
          _builder.append(".NAMED_DELEGATE)).to(");
          ILanguageConfig _language = XbaseGeneratorFragment2.this.getLanguage();
          TypeReference _importScopeProvider = XbaseGeneratorFragment2.this.getImportScopeProvider(_language);
          _builder.append(_importScopeProvider, "");
          _builder.append(".class);");
          _builder.newLineIfNotEmpty();
        }
      };
      final StringConcatenationClient statement = _client;
      String _simpleName = IScopeProvider.class.getSimpleName();
      String _plus = (_simpleName + "Delegate");
      bindingFactory.addConfiguredBinding(_plus, statement);
    }
    ILanguageConfig _language_1 = this.getLanguage();
    GuiceModuleAccess _runtimeGenModule = _language_1.getRuntimeGenModule();
    bindingFactory.contributeTo(_runtimeGenModule);
    ILanguageConfig _language_2 = this.getLanguage();
    Grammar _grammar_1 = _language_2.getGrammar();
    boolean _inheritsXbaseWithAnnotations = this._xbaseUsageDetector.inheritsXbaseWithAnnotations(_grammar_1);
    if (_inheritsXbaseWithAnnotations) {
      ILanguageConfig _language_3 = this.getLanguage();
      GuiceModuleAccess _runtimeGenModule_1 = _language_3.getRuntimeGenModule();
      TypeReference _typeRef_17 = TypeReference.typeRef("org.eclipse.xtext.xbase.annotations.DefaultXbaseWithAnnotationsRuntimeModule");
      _runtimeGenModule_1.setSuperClass(_typeRef_17);
    } else {
      ILanguageConfig _language_4 = this.getLanguage();
      GuiceModuleAccess _runtimeGenModule_2 = _language_4.getRuntimeGenModule();
      TypeReference _typeRef_18 = TypeReference.typeRef("org.eclipse.xtext.xbase.DefaultXbaseRuntimeModule");
      _runtimeGenModule_2.setSuperClass(_typeRef_18);
    }
  }
  
  protected void contributeEclipsePluginGuiceBindings() {
    final GuiceModuleAccess.BindingFactory bindingFactory = new GuiceModuleAccess.BindingFactory();
    if (this.useInferredJvmModel) {
      StringConcatenationClient _client = new StringConcatenationClient() {
        @Override
        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
          _builder.append("if (");
          TypeReference _typeRef = TypeReference.typeRef("org.eclipse.ui.PlatformUI");
          _builder.append(_typeRef, "");
          _builder.append(".isWorkbenchRunning()) {");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("binder.bind(");
          TypeReference _typeRef_1 = TypeReference.typeRef("org.eclipse.xtext.ui.editor.IURIEditorOpener");
          _builder.append(_typeRef_1, "\t");
          _builder.append(".class).annotatedWith(");
          TypeReference _typeRef_2 = TypeReference.typeRef("org.eclipse.xtext.ui.LanguageSpecific");
          _builder.append(_typeRef_2, "\t");
          _builder.append(".class).to(");
          TypeReference _typeRef_3 = TypeReference.typeRef("org.eclipse.xtext.xbase.ui.jvmmodel.navigation.DerivedMemberAwareEditorOpener");
          _builder.append(_typeRef_3, "\t");
          _builder.append(".class);");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("binder.bind(");
          TypeReference _typeRef_4 = TypeReference.typeRef("org.eclipse.xtext.common.types.ui.navigation.IDerivedMemberAwareEditorOpener");
          _builder.append(_typeRef_4, "\t");
          _builder.append(".class).to(");
          TypeReference _typeRef_5 = TypeReference.typeRef("org.eclipse.xtext.xbase.ui.jvmmodel.navigation.DerivedMemberAwareEditorOpener");
          _builder.append(_typeRef_5, "\t");
          _builder.append(".class);");
          _builder.newLineIfNotEmpty();
          _builder.append("}");
          _builder.newLine();
        }
      };
      final StringConcatenationClient statement = _client;
      TypeReference _typeRef = TypeReference.typeRef("org.eclipse.xtext.ui.editor.findrefs.FindReferencesHandler");
      TypeReference _typeRef_1 = TypeReference.typeRef("org.eclipse.xtext.xbase.ui.jvmmodel.findrefs.JvmModelFindReferenceHandler");
      GuiceModuleAccess.BindingFactory _addTypeToType = bindingFactory.addTypeToType(_typeRef, _typeRef_1);
      TypeReference _typeRef_2 = TypeReference.typeRef("org.eclipse.xtext.ui.editor.findrefs.ReferenceQueryExecutor");
      TypeReference _typeRef_3 = TypeReference.typeRef("org.eclipse.xtext.xbase.ui.jvmmodel.findrefs.JvmModelReferenceQueryExecutor");
      GuiceModuleAccess.BindingFactory _addTypeToType_1 = _addTypeToType.addTypeToType(_typeRef_2, _typeRef_3);
      TypeReference _typeRef_4 = TypeReference.typeRef("org.eclipse.xtext.ui.refactoring.IDependentElementsCalculator");
      TypeReference _typeRef_5 = TypeReference.typeRef("org.eclipse.xtext.xbase.ui.jvmmodel.refactoring.JvmModelDependentElementsCalculator");
      GuiceModuleAccess.BindingFactory _addTypeToType_2 = _addTypeToType_1.addTypeToType(_typeRef_4, _typeRef_5);
      TypeReference _typeRef_6 = TypeReference.typeRef("org.eclipse.xtext.ui.refactoring.IRenameRefactoringProvider");
      TypeReference _typeRef_7 = TypeReference.typeRef("org.eclipse.xtext.xbase.ui.jvmmodel.refactoring.jdt.CombinedJvmJdtRenameRefactoringProvider");
      GuiceModuleAccess.BindingFactory _addTypeToType_3 = _addTypeToType_2.addTypeToType(_typeRef_6, _typeRef_7);
      TypeReference _typeRef_8 = TypeReference.typeRef("org.eclipse.xtext.ui.refactoring.IReferenceUpdater");
      TypeReference _typeRef_9 = TypeReference.typeRef("org.eclipse.xtext.xbase.ui.refactoring.XbaseReferenceUpdater");
      GuiceModuleAccess.BindingFactory _addTypeToType_4 = _addTypeToType_3.addTypeToType(_typeRef_8, _typeRef_9);
      TypeReference _typeRef_10 = TypeReference.typeRef("org.eclipse.xtext.ui.refactoring.ui.IRenameContextFactory");
      TypeReference _typeRef_11 = TypeReference.typeRef("org.eclipse.xtext.xbase.ui.jvmmodel.refactoring.jdt.CombinedJvmJdtRenameContextFactory");
      GuiceModuleAccess.BindingFactory _addfinalTypeToType = _addTypeToType_4.addfinalTypeToType(_typeRef_10, _typeRef_11);
      TypeReference _typeRef_12 = TypeReference.typeRef("org.eclipse.xtext.ui.refactoring.IRenameStrategy");
      TypeReference _typeRef_13 = TypeReference.typeRef("org.eclipse.xtext.xbase.ui.jvmmodel.refactoring.DefaultJvmModelRenameStrategy");
      GuiceModuleAccess.BindingFactory _addTypeToType_5 = _addfinalTypeToType.addTypeToType(_typeRef_12, _typeRef_13);
      TypeReference _typeRef_14 = TypeReference.typeRef("org.eclipse.xtext.common.types.ui.refactoring.participant.JdtRenameParticipant.ContextFactory");
      TypeReference _typeRef_15 = TypeReference.typeRef("org.eclipse.xtext.xbase.ui.jvmmodel.refactoring.JvmModelJdtRenameParticipantContext.ContextFactory");
      GuiceModuleAccess.BindingFactory _addTypeToType_6 = _addTypeToType_5.addTypeToType(_typeRef_14, _typeRef_15);
      TypeReference _typeRef_16 = TypeReference.typeRef("org.eclipse.xtext.ui.editor.outline.impl.OutlineNodeElementOpener");
      TypeReference _typeRef_17 = TypeReference.typeRef("org.eclipse.xtext.xbase.ui.jvmmodel.outline.JvmOutlineNodeElementOpener");
      GuiceModuleAccess.BindingFactory _addTypeToType_7 = _addTypeToType_6.addTypeToType(_typeRef_16, _typeRef_17);
      TypeReference _typeRef_18 = TypeReference.typeRef("org.eclipse.xtext.ui.editor.GlobalURIEditorOpener");
      TypeReference _typeRef_19 = TypeReference.typeRef("org.eclipse.xtext.common.types.ui.navigation.GlobalDerivedMemberAwareURIEditorOpener");
      GuiceModuleAccess.BindingFactory _addTypeToType_8 = _addTypeToType_7.addTypeToType(_typeRef_18, _typeRef_19);
      TypeReference _typeRef_20 = TypeReference.typeRef("org.eclipse.xtext.ui.editor.occurrences.IOccurrenceComputer");
      TypeReference _typeRef_21 = TypeReference.typeRef("org.eclipse.xtext.xbase.ui.jvmmodel.occurrence.JvmModelOccurrenceComputer");
      GuiceModuleAccess.BindingFactory _addTypeToType_9 = _addTypeToType_8.addTypeToType(_typeRef_20, _typeRef_21);
      TypeReference _typeRef_22 = TypeReference.typeRef("org.eclipse.xtext.common.types.ui.query.IJavaSearchParticipation");
      TypeReference _typeRef_23 = TypeReference.typeRef("org.eclipse.xtext.common.types.ui.query.IJavaSearchParticipation.No");
      GuiceModuleAccess.BindingFactory _addTypeToType_10 = _addTypeToType_9.addTypeToType(_typeRef_22, _typeRef_23);
      _addTypeToType_10.addConfiguredBinding("LanguageSpecificURIEditorOpener", statement);
    } else {
      TypeReference _typeRef_24 = TypeReference.typeRef("org.eclipse.xtext.ui.refactoring.IRenameStrategy");
      TypeReference _typeRef_25 = TypeReference.typeRef("org.eclipse.xtext.xbase.ui.refactoring.XbaseRenameStrategy");
      bindingFactory.addTypeToType(_typeRef_24, _typeRef_25);
    }
    ILanguageConfig _language = this.getLanguage();
    Grammar _grammar = _language.getGrammar();
    boolean _usesXImportSection = this._xbaseUsageDetector.usesXImportSection(_grammar);
    if (_usesXImportSection) {
      TypeReference _typeRef_26 = TypeReference.typeRef("org.eclipse.xtext.xbase.imports.IUnresolvedTypeResolver");
      TypeReference _typeRef_27 = TypeReference.typeRef("org.eclipse.xtext.xbase.ui.imports.InteractiveUnresolvedTypeResolver");
      GuiceModuleAccess.BindingFactory _addTypeToType_11 = bindingFactory.addTypeToType(_typeRef_26, _typeRef_27);
      TypeReference _typeRef_28 = TypeReference.typeRef("org.eclipse.xtext.common.types.xtext.ui.ITypesProposalProvider");
      TypeReference _typeRef_29 = TypeReference.typeRef("org.eclipse.xtext.xbase.ui.contentassist.ImportingTypesProposalProvider");
      GuiceModuleAccess.BindingFactory _addTypeToType_12 = _addTypeToType_11.addTypeToType(_typeRef_28, _typeRef_29);
      TypeReference _typeRef_30 = TypeReference.typeRef("org.eclipse.xtext.ui.editor.templates.XtextTemplateContextType");
      TypeReference _typeRef_31 = TypeReference.typeRef("org.eclipse.xtext.xbase.ui.templates.XbaseTemplateContextType");
      _addTypeToType_12.addTypeToType(_typeRef_30, _typeRef_31);
    } else {
      TypeReference _typeRef_32 = TypeReference.typeRef("org.eclipse.xtext.xbase.ui.quickfix.JavaTypeQuickfixes");
      TypeReference _typeRef_33 = TypeReference.typeRef("org.eclipse.xtext.xbase.ui.quickfix.JavaTypeQuickfixesNoImportSection");
      bindingFactory.addTypeToType(_typeRef_32, _typeRef_33);
    }
    ILanguageConfig _language_1 = this.getLanguage();
    GuiceModuleAccess _eclipsePluginGenModule = _language_1.getEclipsePluginGenModule();
    bindingFactory.contributeTo(_eclipsePluginGenModule);
    ILanguageConfig _language_2 = this.getLanguage();
    Grammar _grammar_1 = _language_2.getGrammar();
    boolean _inheritsXbaseWithAnnotations = this._xbaseUsageDetector.inheritsXbaseWithAnnotations(_grammar_1);
    if (_inheritsXbaseWithAnnotations) {
      ILanguageConfig _language_3 = this.getLanguage();
      GuiceModuleAccess _eclipsePluginGenModule_1 = _language_3.getEclipsePluginGenModule();
      TypeReference _typeRef_34 = TypeReference.typeRef("org.eclipse.xtext.xbase.annotations.ui.DefaultXbaseWithAnnotationsUiModule");
      _eclipsePluginGenModule_1.setSuperClass(_typeRef_34);
    } else {
      ILanguageConfig _language_4 = this.getLanguage();
      GuiceModuleAccess _eclipsePluginGenModule_2 = _language_4.getEclipsePluginGenModule();
      TypeReference _typeRef_35 = TypeReference.typeRef("org.eclipse.xtext.xbase.ui.DefaultXbaseUiModule");
      _eclipsePluginGenModule_2.setSuperClass(_typeRef_35);
    }
    ILanguageConfig _language_5 = this.getLanguage();
    GuiceModuleAccess _webGenModule = _language_5.getWebGenModule();
    TypeReference _typeRef_36 = TypeReference.typeRef("org.eclipse.xtext.xbase.web.DefaultXbaseWebModule");
    _webGenModule.setSuperClass(_typeRef_36);
  }
  
  protected void doGenerateXtendInferrer() {
    ILanguageConfig _language = this.getLanguage();
    Grammar _grammar = _language.getGrammar();
    EList<AbstractRule> _rules = _grammar.getRules();
    AbstractRule _head = IterableExtensions.<AbstractRule>head(_rules);
    TypeRef _type = _head.getType();
    EClassifier _classifier = _type.getClassifier();
    ILanguageConfig _language_1 = this.getLanguage();
    Grammar _grammar_1 = _language_1.getGrammar();
    Resource _eResource = _grammar_1.eResource();
    ResourceSet _resourceSet = _eResource.getResourceSet();
    String _javaTypeName = GenModelUtil2.getJavaTypeName(_classifier, _resourceSet);
    final TypeReference firstRuleType = TypeReference.typeRef(_javaTypeName);
    TypeReference _jvmModelInferrer = this.getJvmModelInferrer();
    StringConcatenationClient _client = new StringConcatenationClient() {
      @Override
      protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
        _builder.append("/**");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("* <p>Infers a JVM model from the source model.</p> ");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("*");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("* <p>The JVM model should contain all elements that would appear in the Java code ");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("* which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     ");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("class ");
        TypeReference _jvmModelInferrer = XbaseGeneratorFragment2.this.getJvmModelInferrer();
        String _simpleName = _jvmModelInferrer.getSimpleName();
        _builder.append(_simpleName, "");
        _builder.append(" extends ");
        TypeReference _typeRef = TypeReference.typeRef("org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer");
        _builder.append(_typeRef, "");
        _builder.append(" {");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("    ");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("     ");
        _builder.append("* convenience API to build and initialize JVM types and their members.");
        _builder.newLine();
        _builder.append("     ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@");
        _builder.append(Inject.class, "\t");
        _builder.append(" extension ");
        TypeReference _typeRef_1 = TypeReference.typeRef("org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder");
        _builder.append(_typeRef_1, "\t");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("* The dispatch method {@code infer} is called for each instance of the");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("* given element\'s type that is contained in a resource.");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("* ");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("* @param element");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("*            the model to create one or more");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("*            {@link org.eclipse.xtext.common.types.JvmDeclaredType declared");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("*            types} from.");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("* @param acceptor");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("*            each created");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("*            {@link org.eclipse.xtext.common.types.JvmDeclaredType type}");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("*            without a container should be passed to the acceptor in order");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("*            get attached to the current resource. The acceptor\'s");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("*            {@link IJvmDeclaredTypeAcceptor#accept(org.eclipse.xtext.common.types.JvmDeclaredType)");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("*            accept(..)} method takes the constructed empty type for the");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("*            pre-indexing phase. This one is further initialized in the");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("*            indexing phase using the closure you pass to the returned");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("*            {@link org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing#initializeLater(org.eclipse.xtext.xbase.lib.Procedures.Procedure1)");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("*            initializeLater(..)}.");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("* @param isPreIndexingPhase");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("*            whether the method is called in a pre-indexing phase, i.e.");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("*            when the global index is not yet fully updated. You must not");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("*            rely on linking using the index if isPreIndexingPhase is");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("*            <code>true</code>.");
        _builder.newLine();
        _builder.append("\t ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("def dispatch void infer(");
        _builder.append(firstRuleType, "\t");
        _builder.append(" element, ");
        TypeReference _typeRef_2 = TypeReference.typeRef("org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor");
        _builder.append(_typeRef_2, "\t");
        _builder.append(" acceptor, boolean isPreIndexingPhase) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("// Here you explain how your model is mapped to Java elements, by writing the actual translation code.");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("// An implementation for the initial hello world example could look like this:");
        _builder.newLine();
        _builder.append("//   \t\tacceptor.accept(element.toClass(\"my.company.greeting.MyGreetings\")) [");
        _builder.newLine();
        _builder.append("//   \t\t\tfor (greeting : element.greetings) {");
        _builder.newLine();
        _builder.append("//   \t\t\t\tmembers += greeting.toMethod(\"hello\" + greeting.name, typeRef(String)) [");
        _builder.newLine();
        _builder.append("//   \t\t\t\t\tbody = ");
        _builder.append("\'\'\'", "");
        _builder.newLineIfNotEmpty();
        _builder.append("//\t\t\t\t\t\t\treturn \"Hello ");
        _builder.append("�", "");
        _builder.append("greeting.name");
        _builder.append("�", "");
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
        _builder.append("//   \t\t\t\t\t");
        _builder.append("\'\'\'", "");
        _builder.newLineIfNotEmpty();
        _builder.append("//   \t\t\t\t]");
        _builder.newLine();
        _builder.append("//   \t\t\t}");
        _builder.newLine();
        _builder.append("//   \t\t]");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
      }
    };
    XtendFileAccess _createXtendFile = this.fileAccessFactory.createXtendFile(_jvmModelInferrer, _client);
    IXtextProjectConfig _projectConfig = this.getProjectConfig();
    IXtextGeneratorFileSystemAccess _runtimeSrc = _projectConfig.getRuntimeSrc();
    _createXtendFile.writeTo(_runtimeSrc);
  }
  
  protected boolean contributeEclipsePluginExtensions() {
    boolean _xblockexpression = false;
    {
      ILanguageConfig _language = this.getLanguage();
      Grammar _grammar = _language.getGrammar();
      final String name = _grammar.getName();
      if (this.jdtTypeHierarchy) {
        IXtextProjectConfig _projectConfig = this.getProjectConfig();
        PluginXmlAccess _eclipsePluginPluginXml = _projectConfig.getEclipsePluginPluginXml();
        List<CharSequence> _entries = _eclipsePluginPluginXml.getEntries();
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("<!-- Type Hierarchy  -->");
        _builder.newLine();
        _builder.append("<extension point=\"org.eclipse.ui.handlers\">");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<handler ");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("class=\"");
        Grammar _grammar_1 = this.getGrammar();
        TypeReference _eclipsePluginExecutableExtensionFactory = this._xtextGeneratorNaming.getEclipsePluginExecutableExtensionFactory(_grammar_1);
        _builder.append(_eclipsePluginExecutableExtensionFactory, "\t\t");
        _builder.append(":org.eclipse.xtext.xbase.ui.hierarchy.OpenTypeHierarchyHandler\"");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("commandId=\"org.eclipse.xtext.xbase.ui.hierarchy.OpenTypeHierarchy\">");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("<activeWhen>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("<reference");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("definitionId=\"");
        _builder.append(name, "\t\t\t\t");
        _builder.append(".Editor.opened\">");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("</reference>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("</activeWhen>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("</handler>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<handler ");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("class=\"");
        Grammar _grammar_2 = this.getGrammar();
        TypeReference _eclipsePluginExecutableExtensionFactory_1 = this._xtextGeneratorNaming.getEclipsePluginExecutableExtensionFactory(_grammar_2);
        _builder.append(_eclipsePluginExecutableExtensionFactory_1, "\t\t");
        _builder.append(":org.eclipse.xtext.xbase.ui.hierarchy.QuickTypeHierarchyHandler\"");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("commandId=\"org.eclipse.jdt.ui.edit.text.java.open.hierarchy\">");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("<activeWhen>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("<reference");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("definitionId=\"");
        _builder.append(name, "\t\t\t\t");
        _builder.append(".Editor.opened\">");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("</reference>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("</activeWhen>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("</handler>");
        _builder.newLine();
        {
          ILanguageConfig _language_1 = this.getLanguage();
          Grammar _grammar_3 = _language_1.getGrammar();
          boolean _usesXImportSection = this._xbaseUsageDetector.usesXImportSection(_grammar_3);
          if (_usesXImportSection) {
            _builder.append("\t");
            _builder.append("<handler");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("class=\"");
            Grammar _grammar_4 = this.getGrammar();
            TypeReference _eclipsePluginExecutableExtensionFactory_2 = this._xtextGeneratorNaming.getEclipsePluginExecutableExtensionFactory(_grammar_4);
            _builder.append(_eclipsePluginExecutableExtensionFactory_2, "\t\t");
            _builder.append(":org.eclipse.xtext.xbase.ui.imports.OrganizeImportsHandler\"");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("commandId=\"org.eclipse.xtext.xbase.ui.organizeImports\">");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<activeWhen>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("<reference");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t");
            _builder.append("definitionId=\"");
            _builder.append(name, "\t\t\t\t");
            _builder.append(".Editor.opened\">");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("</reference>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("</activeWhen>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("</handler>");
            _builder.newLine();
          }
        }
        _builder.append("</extension>");
        _builder.newLine();
        _builder.append("<extension point=\"org.eclipse.ui.menus\">");
        _builder.newLine();
        {
          ILanguageConfig _language_2 = this.getLanguage();
          Grammar _grammar_5 = _language_2.getGrammar();
          boolean _usesXImportSection_1 = this._xbaseUsageDetector.usesXImportSection(_grammar_5);
          if (_usesXImportSection_1) {
            _builder.append("\t");
            _builder.append("<menuContribution");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("locationURI=\"popup:#TextEditorContext?after=group.edit\">");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t ");
            _builder.append("<command");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t ");
            _builder.append("commandId=\"org.eclipse.xtext.xbase.ui.organizeImports\"");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t ");
            _builder.append("style=\"push\"");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t ");
            _builder.append("tooltip=\"Organize Imports\">");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("<visibleWhen checkEnabled=\"false\">");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t");
            _builder.append("<reference");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t\t");
            _builder.append("definitionId=\"");
            _builder.append(name, "\t\t\t\t\t");
            _builder.append(".Editor.opened\">");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t\t\t");
            _builder.append("</reference>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("</visibleWhen>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("</command>  ");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("</menuContribution>");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("<menuContribution");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("locationURI=\"popup:#TextEditorContext?after=group.open\">");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("<command commandId=\"org.eclipse.xtext.xbase.ui.hierarchy.OpenTypeHierarchy\"");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("style=\"push\"");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("tooltip=\"Open Type Hierarchy\">");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("<visibleWhen checkEnabled=\"false\">");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("<reference definitionId=\"");
        _builder.append(name, "\t\t\t\t");
        _builder.append(".Editor.opened\"/>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("</visibleWhen>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("</command>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("</menuContribution>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<menuContribution");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("locationURI=\"popup:#TextEditorContext?after=group.open\">");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("<command commandId=\"org.eclipse.jdt.ui.edit.text.java.open.hierarchy\"");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("style=\"push\"");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("tooltip=\"Quick Type Hierarchy\">");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("<visibleWhen checkEnabled=\"false\">");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("<reference definitionId=\"");
        _builder.append(name, "\t\t\t\t");
        _builder.append(".Editor.opened\"/>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("</visibleWhen>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("</command>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("</menuContribution>");
        _builder.newLine();
        _builder.append("</extension>");
        _builder.newLine();
        _entries.add(_builder.toString());
      }
      if (this.jdtCallHierarchy) {
        IXtextProjectConfig _projectConfig_1 = this.getProjectConfig();
        PluginXmlAccess _eclipsePluginPluginXml_1 = _projectConfig_1.getEclipsePluginPluginXml();
        List<CharSequence> _entries_1 = _eclipsePluginPluginXml_1.getEntries();
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("<!-- Call Hierachy -->");
        _builder_1.newLine();
        _builder_1.append("<extension point=\"org.eclipse.ui.handlers\">");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("<handler ");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("class=\"");
        Grammar _grammar_6 = this.getGrammar();
        TypeReference _eclipsePluginExecutableExtensionFactory_3 = this._xtextGeneratorNaming.getEclipsePluginExecutableExtensionFactory(_grammar_6);
        _builder_1.append(_eclipsePluginExecutableExtensionFactory_3, "\t\t");
        _builder_1.append(":org.eclipse.xtext.xbase.ui.hierarchy.OpenCallHierachyHandler\"");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t\t");
        _builder_1.append("commandId=\"org.eclipse.xtext.xbase.ui.hierarchy.OpenCallHierarchy\">");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("<activeWhen>");
        _builder_1.newLine();
        _builder_1.append("\t\t\t");
        _builder_1.append("<reference");
        _builder_1.newLine();
        _builder_1.append("\t\t\t\t");
        _builder_1.append("definitionId=\"");
        _builder_1.append(name, "\t\t\t\t");
        _builder_1.append(".Editor.opened\">");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t\t\t");
        _builder_1.append("</reference>");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("</activeWhen>");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("</handler>");
        _builder_1.newLine();
        _builder_1.append("</extension>");
        _builder_1.newLine();
        _builder_1.append("<extension point=\"org.eclipse.ui.menus\">");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("<menuContribution");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("locationURI=\"popup:#TextEditorContext?after=group.open\">");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("<command commandId=\"org.eclipse.xtext.xbase.ui.hierarchy.OpenCallHierarchy\"");
        _builder_1.newLine();
        _builder_1.append("\t\t\t");
        _builder_1.append("style=\"push\"");
        _builder_1.newLine();
        _builder_1.append("\t\t\t");
        _builder_1.append("tooltip=\"Open Call Hierarchy\">");
        _builder_1.newLine();
        _builder_1.append("\t\t\t");
        _builder_1.append("<visibleWhen checkEnabled=\"false\">");
        _builder_1.newLine();
        _builder_1.append("\t\t\t\t");
        _builder_1.append("<reference definitionId=\"");
        _builder_1.append(name, "\t\t\t\t");
        _builder_1.append(".Editor.opened\"/>");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t\t\t");
        _builder_1.append("</visibleWhen>");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("</command>");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("</menuContribution>");
        _builder_1.newLine();
        _builder_1.append("</extension>");
        _builder_1.newLine();
        _entries_1.add(_builder_1.toString());
      }
      IXtextProjectConfig _projectConfig_2 = this.getProjectConfig();
      PluginXmlAccess _eclipsePluginPluginXml_2 = _projectConfig_2.getEclipsePluginPluginXml();
      List<CharSequence> _entries_2 = _eclipsePluginPluginXml_2.getEntries();
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("<extension point=\"org.eclipse.core.runtime.adapters\">");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("<factory class=\"");
      Grammar _grammar_7 = this.getGrammar();
      TypeReference _eclipsePluginExecutableExtensionFactory_4 = this._xtextGeneratorNaming.getEclipsePluginExecutableExtensionFactory(_grammar_7);
      _builder_2.append(_eclipsePluginExecutableExtensionFactory_4, "\t");
      _builder_2.append(":org.eclipse.xtext.builder.smap.StratumBreakpointAdapterFactory\"");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t\t");
      _builder_2.append("adaptableType=\"org.eclipse.xtext.ui.editor.XtextEditor\">");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("<adapter type=\"org.eclipse.debug.ui.actions.IToggleBreakpointsTarget\"/>");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("</factory> ");
      _builder_2.newLine();
      _builder_2.append("</extension>");
      _builder_2.newLine();
      _builder_2.append("<extension point=\"org.eclipse.ui.editorActions\">");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("<editorContribution targetID=\"");
      _builder_2.append(name, "\t");
      _builder_2.append("\" ");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t\t");
      _builder_2.append("id=\"");
      _builder_2.append(name, "\t\t");
      _builder_2.append(".rulerActions\">");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t\t");
      _builder_2.append("<action");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append("label=\"Not Used\"");
      _builder_2.newLine();
      _builder_2.append(" \t\t\t");
      _builder_2.append("class=\"");
      Grammar _grammar_8 = this.getGrammar();
      TypeReference _eclipsePluginExecutableExtensionFactory_5 = this._xtextGeneratorNaming.getEclipsePluginExecutableExtensionFactory(_grammar_8);
      _builder_2.append(_eclipsePluginExecutableExtensionFactory_5, " \t\t\t");
      _builder_2.append(":org.eclipse.debug.ui.actions.RulerToggleBreakpointActionDelegate\"");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t\t\t");
      _builder_2.append("style=\"push\"");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append("actionID=\"RulerDoubleClick\"");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append("id=\"");
      _builder_2.append(name, "\t\t\t");
      _builder_2.append(".doubleClickBreakpointAction\"/>");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t");
      _builder_2.append("</editorContribution>");
      _builder_2.newLine();
      _builder_2.append("</extension>");
      _builder_2.newLine();
      _builder_2.append("<extension point=\"org.eclipse.ui.popupMenus\">");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("<viewerContribution");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("targetID=\"");
      _builder_2.append(name, "\t\t");
      _builder_2.append(".RulerContext\"");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t\t");
      _builder_2.append("id=\"");
      _builder_2.append(name, "\t\t");
      _builder_2.append(".RulerPopupActions\">");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t\t");
      _builder_2.append("<action");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append("label=\"Toggle Breakpoint\"");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append("class=\"");
      Grammar _grammar_9 = this.getGrammar();
      TypeReference _eclipsePluginExecutableExtensionFactory_6 = this._xtextGeneratorNaming.getEclipsePluginExecutableExtensionFactory(_grammar_9);
      _builder_2.append(_eclipsePluginExecutableExtensionFactory_6, "\t\t\t");
      _builder_2.append(":org.eclipse.debug.ui.actions.RulerToggleBreakpointActionDelegate\"");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t\t\t");
      _builder_2.append("menubarPath=\"debug\"");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append("id=\"");
      _builder_2.append(name, "\t\t\t");
      _builder_2.append(".rulerContextMenu.toggleBreakpointAction\">");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t\t");
      _builder_2.append("</action>");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("<action");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append("label=\"Not used\"");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append("class=\"");
      Grammar _grammar_10 = this.getGrammar();
      TypeReference _eclipsePluginExecutableExtensionFactory_7 = this._xtextGeneratorNaming.getEclipsePluginExecutableExtensionFactory(_grammar_10);
      _builder_2.append(_eclipsePluginExecutableExtensionFactory_7, "\t\t\t");
      _builder_2.append(":org.eclipse.debug.ui.actions.RulerEnableDisableBreakpointActionDelegate\"");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t\t\t");
      _builder_2.append("menubarPath=\"debug\"");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append("id=\"");
      _builder_2.append(name, "\t\t\t");
      _builder_2.append(".rulerContextMenu.enableDisableBreakpointAction\">");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t\t");
      _builder_2.append("</action>");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("<action");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append("label=\"Breakpoint Properties\"");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append("helpContextId=\"breakpoint_properties_action_context\"");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append("class=\"");
      Grammar _grammar_11 = this.getGrammar();
      TypeReference _eclipsePluginExecutableExtensionFactory_8 = this._xtextGeneratorNaming.getEclipsePluginExecutableExtensionFactory(_grammar_11);
      _builder_2.append(_eclipsePluginExecutableExtensionFactory_8, "\t\t\t");
      _builder_2.append(":org.eclipse.jdt.debug.ui.actions.JavaBreakpointPropertiesRulerActionDelegate\"");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t\t\t");
      _builder_2.append("menubarPath=\"group.properties\"");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append("id=\"");
      _builder_2.append(name, "\t\t\t");
      _builder_2.append(".rulerContextMenu.openBreapointPropertiesAction\">");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t\t");
      _builder_2.append("</action>");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("</viewerContribution>");
      _builder_2.newLine();
      _builder_2.append("</extension>");
      _builder_2.newLine();
      _builder_2.append("<!-- Introduce Local Variable Refactoring -->");
      _builder_2.newLine();
      _builder_2.append("<extension point=\"org.eclipse.ui.handlers\">");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("<handler ");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("class=\"");
      Grammar _grammar_12 = this.getGrammar();
      TypeReference _eclipsePluginExecutableExtensionFactory_9 = this._xtextGeneratorNaming.getEclipsePluginExecutableExtensionFactory(_grammar_12);
      _builder_2.append(_eclipsePluginExecutableExtensionFactory_9, "\t\t");
      _builder_2.append(":org.eclipse.xtext.xbase.ui.refactoring.ExtractVariableHandler\"");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t\t");
      _builder_2.append("commandId=\"org.eclipse.xtext.xbase.ui.refactoring.ExtractLocalVariable\">");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("<activeWhen>");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append("<reference");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("definitionId=\"");
      _builder_2.append(name, "\t\t\t\t");
      _builder_2.append(".Editor.opened\">");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t\t\t");
      _builder_2.append("</reference>");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("</activeWhen>");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("</handler>");
      _builder_2.newLine();
      _builder_2.append("</extension>");
      _builder_2.newLine();
      _builder_2.append("<extension point=\"org.eclipse.ui.menus\">");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("<menuContribution");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("locationURI=\"popup:#TextEditorContext?after=group.edit\">");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("<command commandId=\"org.eclipse.xtext.xbase.ui.refactoring.ExtractLocalVariable\"");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append("style=\"push\">");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append("<visibleWhen checkEnabled=\"false\">");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("<reference");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t\t");
      _builder_2.append("definitionId=\"");
      _builder_2.append(name, "\t\t\t\t\t");
      _builder_2.append(".Editor.opened\">");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("</reference>");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append("</visibleWhen>");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("</command>");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("</menuContribution>");
      _builder_2.newLine();
      _builder_2.append("</extension>  ");
      _builder_2.newLine();
      _builder_2.append("<!-- Open implementation -->");
      _builder_2.newLine();
      _builder_2.append("<extension point=\"org.eclipse.ui.handlers\">");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("<handler");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("class=\"");
      Grammar _grammar_13 = this.getGrammar();
      TypeReference _eclipsePluginExecutableExtensionFactory_10 = this._xtextGeneratorNaming.getEclipsePluginExecutableExtensionFactory(_grammar_13);
      _builder_2.append(_eclipsePluginExecutableExtensionFactory_10, "\t\t");
      _builder_2.append(":org.eclipse.xtext.xbase.ui.navigation.OpenImplementationHandler\"");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t\t");
      _builder_2.append("commandId=\"org.eclipse.xtext.xbase.ui.OpenImplementationCommand\">");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("<activeWhen>");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append("<reference");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("definitionId=\"");
      _builder_2.append(name, "\t\t\t\t");
      _builder_2.append(".Editor.opened\">");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t\t\t");
      _builder_2.append("</reference>");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("</activeWhen>");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("</handler>");
      _builder_2.newLine();
      _builder_2.append("</extension>");
      _builder_2.newLine();
      _builder_2.append("<extension point=\"org.eclipse.ui.menus\">");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("<menuContribution");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("locationURI=\"menu:navigate?after=open.ext4\">");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("<command commandId=\"org.eclipse.xtext.xbase.ui.OpenImplementationCommand\">");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append("<visibleWhen checkEnabled=\"false\">");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("<reference");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t\t");
      _builder_2.append("definitionId=\"");
      _builder_2.append(name, "\t\t\t\t\t");
      _builder_2.append(".Editor.opened\">");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("</reference>");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append("</visibleWhen>");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("</command>");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("</menuContribution>");
      _builder_2.newLine();
      _builder_2.append("</extension>");
      _builder_2.newLine();
      _xblockexpression = _entries_2.add(_builder_2.toString());
    }
    return _xblockexpression;
  }
  
  public void setGenerateXtendInferrer(final boolean generateXtendInferrer) {
    this.generateXtendInferrer = generateXtendInferrer;
  }
  
  public void setUseInferredJvmModel(final boolean useInferredJvmModel) {
    this.useInferredJvmModel = useInferredJvmModel;
  }
  
  public void setJdtTypeHierarchy(final boolean jdtTypeHierarchy) {
    this.jdtTypeHierarchy = jdtTypeHierarchy;
  }
  
  public void setJdtCallHierarchy(final boolean jdtCallHierarchy) {
    this.jdtCallHierarchy = jdtCallHierarchy;
  }
  
  public void setSkipExportedPackage(final boolean skipExportedPackage) {
    this.skipExportedPackage = skipExportedPackage;
  }
}
