package de.dubmas.modulob.common.ui.wizard;

import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ModuleFileGenerator {
  
  private String moduleName;
  
  private String destinationDirPath;
  
  public void setModuleName(final String moduleName) {
    this.moduleName = moduleName;
  }
  
  public void setDestinationDirPath(final String path) {
    this.destinationDirPath = path;
  }
  
  public void doGenerate(final IFileSystemAccess fsa) {
    {
      String _operator_plus = StringExtensions.operator_plus(this.moduleName, ".moif");
      StringConcatenation _interfaceFile = this.interfaceFile();
      fsa.generateFile(_operator_plus, IFileSystemAccess.DEFAULT_OUTPUT, _interfaceFile);
      String _operator_plus_1 = StringExtensions.operator_plus(this.moduleName, ".modat");
      StringConcatenation _dataFile = this.dataFile();
      fsa.generateFile(_operator_plus_1, IFileSystemAccess.DEFAULT_OUTPUT, _dataFile);
    }
  }
  
  public StringConcatenation interfaceFile() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("interfaces for module ");
    _builder.append(this.moduleName, "");
    _builder.append(" version \"1.0\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("interface AnInterface {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation dataFile() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("entities for module ");
    _builder.append(this.moduleName, "");
    _builder.append(" version \"1.0\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("entity AnEntity {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}