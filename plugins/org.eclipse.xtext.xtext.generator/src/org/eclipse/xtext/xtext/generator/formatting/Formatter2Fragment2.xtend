/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xtext.generator.formatting

import com.google.common.collect.LinkedHashMultimap
import com.google.common.collect.Multimap
import com.google.inject.Inject
import java.util.Collection
import java.util.Set
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.xtend2.lib.StringConcatenationClient
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.GrammarUtil
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.FormatterPreferenceValuesProvider
import org.eclipse.xtext.formatting2.FormatterPreferences
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.eclipse.xtext.formatting2.IFormatter2
import org.eclipse.xtext.preferences.IPreferenceValuesProvider
import org.eclipse.xtext.xtext.generator.AbstractGeneratorFragment2
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming
import org.eclipse.xtext.xtext.generator.grammarAccess.GrammarAccessExtensions
import org.eclipse.xtext.xtext.generator.model.FileAccessFactory
import org.eclipse.xtext.xtext.generator.model.GuiceModuleAccess
import org.eclipse.xtext.xtext.generator.model.TypeReference
import org.eclipse.xtext.xtext.generator.model.XtendFileAccess
import org.eclipse.xtext.xtext.generator.util.GenModelUtil2

import static extension org.eclipse.xtext.GrammarUtil.*
import static extension org.eclipse.xtext.xtext.generator.model.TypeReference.*
import static extension org.eclipse.xtext.xtext.generator.util.GrammarUtil2.*

class Formatter2Fragment2 extends AbstractGeneratorFragment2 {
	
	@Inject FileAccessFactory fileAccessFactory
	
	@Inject extension XtextGeneratorNaming
	@Inject extension GrammarAccessExtensions
	
	protected def TypeReference getFormatter2Stub(Grammar grammar) {
		new TypeReference(grammar.runtimeBasePackage + '.formatting2.' + GrammarUtil.getSimpleName(grammar) + 'Formatter')
	}
	
	override generate() {
		val StringConcatenationClient statement =
			'''binder.bind(�IPreferenceValuesProvider�.class).annotatedWith(�FormatterPreferences�.class).to(�FormatterPreferenceValuesProvider�.class);'''
		new GuiceModuleAccess.BindingFactory()
			.addTypeToType(IFormatter2.typeRef, language.grammar.formatter2Stub)
			.addConfiguredBinding(FormatterPreferences.simpleName, statement)
			.contributeTo(language.runtimeGenModule)
		new GuiceModuleAccess.BindingFactory()
			.addTypeToType('org.eclipse.xtext.ui.editor.formatting.IContentFormatterFactory'.typeRef,
					'org.eclipse.xtext.ui.editor.formatting2.ContentFormatterFactory'.typeRef)
			.contributeTo(language.eclipsePluginGenModule)
		
		doGenerateStubFile()
	}

	protected def doGenerateStubFile() {
		val xtendFile = fileAccessFactory.createXtendFile(grammar.formatter2Stub)
		
		val type2ref = LinkedHashMultimap.<EClass, EReference>create
		getLocallyAssignedContainmentReferences(language.grammar, type2ref)
		val inheritedTypes = LinkedHashMultimap.<EClass, EReference>create
		getInheritedContainmentReferences(language.grammar, inheritedTypes, newHashSet)
		
		xtendFile.content = '''
			class �grammar.formatter2Stub.simpleName� extends �stubSuperClass� {
				
				@�Inject� extension �grammar.grammarAccess�
				�FOR type : type2ref.keySet�

					�type.generateFormatMethod(type2ref.get(type), inheritedTypes.containsKey(type))�
				�ENDFOR�	
			}
		'''
		xtendFile.writeTo(projectConfig.runtimeSrc)
	}
	
	protected def StringConcatenationClient generateFormatMethod(EClass clazz, Collection<EReference> containmentRefs, boolean isOverriding) '''
		�IF isOverriding�override�ELSE�def�ENDIF� dispatch void format(�clazz.typeRef(language)� �clazz.toVarName�, extension �IFormattableDocument� document) {
			// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
			�FOR ref:containmentRefs�
				�IF ref.isMany�
					for (�ref.EReferenceType.typeRef(language)� �ref.toVarName� : �clazz.toVarName�.�ref.getGetAccessor()�()) {
						format(�ref.toVarName�, document);
					}
				�ELSE�
					format(�clazz.toVarName�.�ref.getGetAccessor()�(), document);
				�ENDIF�
			�ENDFOR�
		}
	'''

	protected def void getLocallyAssignedContainmentReferences(Grammar grammar, Multimap<EClass, EReference> type2ref) {
		for (assignment : grammar.containedAssignments) {
			val type = assignment.findCurrentType
			if (type instanceof EClass) {
				val feature = type.getEStructuralFeature(assignment.feature)
				if (feature instanceof EReference && (feature as EReference).isContainment) {
					type2ref.put(type, feature as EReference)
				}
			}
		}
		for (action : grammar.containedActions) {
			val featureName = action.feature
			if (featureName != null) {
				val type = action.type.classifier
				if (type instanceof EClass) {
					val feature = type.getEStructuralFeature(featureName)
					if (feature instanceof EReference && (feature as EReference).isContainment) {
						type2ref.put(type, feature as EReference)
					}
				}
			}
		}
	}
	
	protected def void getInheritedContainmentReferences(Grammar grammar, Multimap<EClass, EReference> type2ref,
			Set<Grammar> visitedGrammars) {
		visitedGrammars.add(grammar)
		for (Grammar usedGrammar : grammar.usedGrammars) {
			if (!visitedGrammars.contains(usedGrammar)) {
				getLocallyAssignedContainmentReferences(usedGrammar, type2ref)
				getInheritedContainmentReferences(usedGrammar, type2ref, visitedGrammars)
			}
		}
	}

	protected def TypeReference getStubSuperClass() {
		val superGrammar = language.grammar.nonTerminalsSuperGrammar
		if (superGrammar != null)
			return superGrammar.formatter2Stub
		else
			return AbstractFormatter2.typeRef
	}
	
	protected def String toVarName(ENamedElement element) {
		val name = element.name.toFirstLower
		if (XtendFileAccess.XTEND_KEYWORDS.contains(name))
			'_' + name
		else
			name
	}
	
	protected def String getGetAccessor(EStructuralFeature feature) {
		GenModelUtil2.getGenFeature(feature, language.resourceSet).getAccessor
	}
	
}