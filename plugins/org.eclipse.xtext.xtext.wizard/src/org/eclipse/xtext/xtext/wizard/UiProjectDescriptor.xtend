package org.eclipse.xtext.xtext.wizard

import static org.eclipse.xtext.xtext.wizard.ExternalDependency.*

class UiProjectDescriptor extends TestedProjectDescriptor {
	UiTestProjectDescriptor testProject
	
	new(WizardConfiguration config) {
		super(config)
		this.testProject = new UiTestProjectDescriptor(this)
	}
	
	override getTestProject() {
		testProject
	}
	
	override getUpstreamProjects() {
		#{config.runtimeProject, config.ideProject}.filter[enabled].toSet
	}
	
	override getNameQualifier() {
		".ui"
	}
	
	override isEclipsePluginProject() {
		true
	}
	
	override isPartOfGradleBuild() {
		false
	}
	
	override isPartOfMavenBuild() {
		true
	}
	
	override getExternalDependencies() {
		val deps = newLinkedHashSet
		deps += super.externalDependencies
		deps += createXtextDependency("org.eclipse.xtext.ui")
		deps += new ExternalDependency => [
			p2 [
				bundleId = "org.eclipse.ui.editors"
				version = "3.5.0"
			]
		]
		deps += new ExternalDependency => [
			p2 [
				bundleId = "org.eclipse.ui.ide"
				version = "3.5.0"
			]
		]
		if (!config.ideProject.enabled) {
			deps += config.ideProject.externalDependencies
		}
		deps
	}
	
	override getBinIncludes() {
		val includes = newLinkedHashSet
		includes += super.binIncludes
		includes += "plugin.xml"
		includes
	}
	
	override pom() {
		super.pom => [
			buildSection = '''
				<build>
					<plugins>
						<plugin>
							<groupId>org.eclipse.xtend</groupId>
							<artifactId>xtend-maven-plugin</artifactId>
						</plugin>
					</plugins>
				</build>
			'''
			packaging = "eclipse-plugin"
		]
	}
}