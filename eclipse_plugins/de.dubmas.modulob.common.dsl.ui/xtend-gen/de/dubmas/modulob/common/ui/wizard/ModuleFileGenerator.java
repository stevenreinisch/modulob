package de.dubmas.modulob.common.ui.wizard;

import java.util.List;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ModuleFileGenerator {
  
  private String fqModuleName;
  
  private String simpleModuleName;
  
  public void setModuleName(final String moduleName) {
    {
      this.fqModuleName = moduleName;
      String[] _split = this.fqModuleName.split("\\.");
      String[] segments = _split;
      final String[] typeConverted_segments = (String[])segments;
      final String[] typeConverted_segments_1 = (String[])segments;
      int _size = ((List<String>)Conversions.doWrapArray(typeConverted_segments_1)).size();
      int _operator_minus = IntegerExtensions.operator_minus(((Integer)_size), ((Integer)1));
      String _get = ((List<String>)Conversions.doWrapArray(typeConverted_segments)).get(_operator_minus);
      this.simpleModuleName = _get;
    }
  }
  
  public void doGenerate(final IFileSystemAccess fsa) {
    {
      String _operator_plus = StringExtensions.operator_plus(this.simpleModuleName, "_v1.0.moif");
      StringConcatenation _interfaceFile = this.interfaceFile();
      fsa.generateFile(_operator_plus, IFileSystemAccess.DEFAULT_OUTPUT, _interfaceFile);
      String _operator_plus_1 = StringExtensions.operator_plus(this.simpleModuleName, "_v1.0.modat");
      StringConcatenation _dataFile = this.dataFile();
      fsa.generateFile(_operator_plus_1, IFileSystemAccess.DEFAULT_OUTPUT, _dataFile);
      String _operator_plus_2 = StringExtensions.operator_plus(this.simpleModuleName, "_v1.0.mono");
      StringConcatenation _notificationFile = this.notificationFile();
      fsa.generateFile(_operator_plus_2, IFileSystemAccess.DEFAULT_OUTPUT, _notificationFile);
    }
  }
  
  public StringConcatenation interfaceFile() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("interfaces for module ");
    _builder.append(this.fqModuleName, "");
    _builder.append(" version \"1.0\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("interface AnInterface {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Void foo:String param1 bar:Timestamp param2");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation dataFile() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("entities for module ");
    _builder.append(this.fqModuleName, "");
    _builder.append(" version \"1.0\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("entity AnEntity {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("String uuid;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation notificationFile() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("notifications for module ");
    _builder.append(this.fqModuleName, "");
    _builder.append(" version \"1.0\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("notification aNotification {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("String contextAttribute;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}