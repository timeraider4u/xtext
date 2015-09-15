package org.eclipse.xtext.xtext.wizard;

import com.google.common.base.Objects;
import java.util.Collections;
import java.util.Set;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xtext.wizard.Outlet;
import org.eclipse.xtext.xtext.wizard.PomFile;
import org.eclipse.xtext.xtext.wizard.ProjectDescriptor;
import org.eclipse.xtext.xtext.wizard.SourceLayout;
import org.eclipse.xtext.xtext.wizard.TestedProjectDescriptor;
import org.eclipse.xtext.xtext.wizard.WizardConfiguration;

@SuppressWarnings("all")
public abstract class TestProjectDescriptor extends ProjectDescriptor {
  @Accessors
  private final ProjectDescriptor testedProject;
  
  public TestProjectDescriptor(final TestedProjectDescriptor testedProject) {
    super(testedProject.getConfig());
    this.testedProject = testedProject;
  }
  
  @Override
  public Set<String> getSourceFolders() {
    final Function1<Outlet, String> _function = new Function1<Outlet, String>() {
      @Override
      public String apply(final Outlet it) {
        return TestProjectDescriptor.this.sourceFolder(it);
      }
    };
    Iterable<String> _map = IterableExtensions.<Outlet, String>map(Collections.<Outlet>unmodifiableSet(CollectionLiterals.<Outlet>newHashSet(Outlet.TEST_JAVA, Outlet.TEST_RESOURCES, Outlet.TEST_SRC_GEN, Outlet.TEST_XTEND_GEN)), _function);
    return IterableExtensions.<String>toSet(_map);
  }
  
  public boolean isInlined() {
    boolean _and = false;
    boolean _isEnabled = this.isEnabled();
    if (!_isEnabled) {
      _and = false;
    } else {
      WizardConfiguration _config = this.getConfig();
      SourceLayout _sourceLayout = _config.getSourceLayout();
      boolean _notEquals = (!Objects.equal(_sourceLayout, SourceLayout.PLAIN));
      _and = _notEquals;
    }
    return _and;
  }
  
  public boolean isSeparate() {
    boolean _and = false;
    boolean _isEnabled = this.isEnabled();
    if (!_isEnabled) {
      _and = false;
    } else {
      WizardConfiguration _config = this.getConfig();
      SourceLayout _sourceLayout = _config.getSourceLayout();
      boolean _equals = Objects.equal(_sourceLayout, SourceLayout.PLAIN);
      _and = _equals;
    }
    return _and;
  }
  
  @Override
  public String getNameQualifier() {
    String _nameQualifier = this.testedProject.getNameQualifier();
    return (_nameQualifier + ".tests");
  }
  
  @Override
  public Set<? extends ProjectDescriptor> getUpstreamProjects() {
    return Collections.<ProjectDescriptor>unmodifiableSet(CollectionLiterals.<ProjectDescriptor>newHashSet(this.testedProject));
  }
  
  @Override
  public boolean isEclipsePluginProject() {
    return this.testedProject.isEclipsePluginProject();
  }
  
  @Override
  public PomFile pom() {
    PomFile _pom = super.pom();
    final Procedure1<PomFile> _function = new Procedure1<PomFile>() {
      @Override
      public void apply(final PomFile it) {
        String _xifexpression = null;
        boolean _isEclipsePluginProject = TestProjectDescriptor.this.isEclipsePluginProject();
        if (_isEclipsePluginProject) {
          _xifexpression = "eclipse-test-plugin";
        } else {
          _xifexpression = "jar";
        }
        it.setPackaging(_xifexpression);
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("<build>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<plugins>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("<plugin>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("<groupId>org.eclipse.xtend</groupId>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("<artifactId>xtend-maven-plugin</artifactId>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("</plugin>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("</plugins>");
        _builder.newLine();
        _builder.append("</build>");
        _builder.newLine();
        it.setBuildSection(_builder.toString());
      }
    };
    return ObjectExtensions.<PomFile>operator_doubleArrow(_pom, _function);
  }
  
  @Pure
  public ProjectDescriptor getTestedProject() {
    return this.testedProject;
  }
}
