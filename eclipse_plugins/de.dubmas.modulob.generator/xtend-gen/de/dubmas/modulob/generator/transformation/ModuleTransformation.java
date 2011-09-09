package de.dubmas.modulob.generator.transformation;

import de.dubmas.modulob.system.EntityModel;
import de.dubmas.modulob.system.InterfaceModel;
import de.dubmas.modulob.system.Module;
import de.dubmas.modulob.system.NotificationModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.eclipse.xtend.util.stdlib.CloningExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;

@SuppressWarnings("all")
public class ModuleTransformation implements IWorkflowComponent {
  
  private String interfaceModelSlotName;
  
  private String entityModelSlotName;
  
  private String notificationModelSlotName;
  
  private String moduleSlotName;
  
  private String oldVersionEntiyModelSlotName;
  
  public String setInterfaceModelSlotName(final String name) {
    String _interfaceModelSlotName = this.interfaceModelSlotName = name;
    return _interfaceModelSlotName;
  }
  
  public String setEntityModelSlotName(final String name) {
    String _entityModelSlotName = this.entityModelSlotName = name;
    return _entityModelSlotName;
  }
  
  public String setNotificationModelSlotName(final String name) {
    String _notificationModelSlotName = this.notificationModelSlotName = name;
    return _notificationModelSlotName;
  }
  
  public String setModuleModelSlotName(final String name) {
    String _moduleSlotName = this.moduleSlotName = name;
    return _moduleSlotName;
  }
  
  public String setOldVersionEntiyModelSlotName(final String name) {
    String _oldVersionEntiyModelSlotName = this.oldVersionEntiyModelSlotName = name;
    return _oldVersionEntiyModelSlotName;
  }
  
  public void invoke(final IWorkflowContext context) {
    {
      Object _get = context.get(this.moduleSlotName);
      List<Module> modules = ((List<Module>) _get);
      Object _get_1 = context.get(this.interfaceModelSlotName);
      List<InterfaceModel> interfaceModels = ((List<InterfaceModel>) _get_1);
      Object _get_2 = context.get(this.entityModelSlotName);
      List<EntityModel> entityModels = ((List<EntityModel>) _get_2);
      Object _get_3 = context.get(this.notificationModelSlotName);
      List<NotificationModel> notificationModels = ((List<NotificationModel>) _get_3);
      for (final Module m : modules) {
        final Function1<InterfaceModel,Boolean> _function = new Function1<InterfaceModel,Boolean>() {
            public Boolean apply(final InterfaceModel im) {
              Module _module = im.getModule();
              boolean _operator_equals = ObjectExtensions.operator_equals(_module, m);
              return ((Boolean)_operator_equals);
            }
          };
        Iterable<InterfaceModel> _filter = IterableExtensions.<InterfaceModel>filter(interfaceModels, _function);
        InterfaceModel _head = IterableExtensions.<InterfaceModel>head(_filter);
        m.setInterfaceModel(_head);
      }
      Map<String,SortedMap<String,EntityModel>> _sortedEntityModelsGroupedByModule = this.sortedEntityModelsGroupedByModule(entityModels);
      Map<String,SortedMap<String,EntityModel>> groupedEntityModels = _sortedEntityModelsGroupedByModule;
      ArrayList<EntityModel> _arrayList = new ArrayList<EntityModel>(10);
      ArrayList<EntityModel> oldVersionEntityModels = _arrayList;
      for (final Module m_1 : modules) {
        {
          String _name = m_1.getName();
          SortedMap<String,EntityModel> _get_4 = groupedEntityModels.get(_name);
          SortedMap<String,EntityModel> sortedEntityModels = _get_4;
          String _lastKey = sortedEntityModels.lastKey();
          EntityModel _remove = sortedEntityModels.remove(_lastKey);
          EntityModel entityModelWithHighestVersion = _remove;
          Collection<EntityModel> _values = sortedEntityModels.values();
          for (final EntityModel em : _values) {
            {
              Object _clone = CloningExtensions.clone(m_1);
              Module moduleClone = ((Module) _clone);
              moduleClone.setEntityModel(em);
              em.setModule(moduleClone);
            }
          }
          m_1.setEntityModel(entityModelWithHighestVersion);
          Collection<EntityModel> _values_1 = sortedEntityModels.values();
          oldVersionEntityModels.addAll(_values_1);
        }
      }
      context.put(this.oldVersionEntiyModelSlotName, oldVersionEntityModels);
      for (final Module m_2 : modules) {
        final Function1<NotificationModel,Boolean> _function_1 = new Function1<NotificationModel,Boolean>() {
            public Boolean apply(final NotificationModel nm) {
              Module _module_1 = nm.getModule();
              boolean _operator_equals_1 = ObjectExtensions.operator_equals(_module_1, m_2);
              return ((Boolean)_operator_equals_1);
            }
          };
        Iterable<NotificationModel> _filter_1 = IterableExtensions.<NotificationModel>filter(notificationModels, _function_1);
        NotificationModel _head_1 = IterableExtensions.<NotificationModel>head(_filter_1);
        m_2.setNotificationModel(_head_1);
      }
    }
  }
  
  public Map<String,SortedMap<String,EntityModel>> sortedEntityModelsGroupedByModule(final List<EntityModel> entityModels) {
    {
      HashMap<String,SortedMap<String,EntityModel>> _hashMap = new HashMap<String,SortedMap<String,EntityModel>>();
      Map<String,SortedMap<String,EntityModel>> moduleEntityModelsMap = _hashMap;
      for (final EntityModel em : entityModels) {
        {
          Module _module = em.getModule();
          String _name = _module.getName();
          SortedMap<String,EntityModel> _get = moduleEntityModelsMap.get(_name);
          SortedMap<String,EntityModel> entityModelsMap = _get;
          boolean _operator_equals = ObjectExtensions.operator_equals(entityModelsMap, null);
          if (_operator_equals) {
            {
              TreeMap<String,EntityModel> _treeMap = new TreeMap<String,EntityModel>();
              entityModelsMap = _treeMap;
              Module _module_1 = em.getModule();
              String _name_1 = _module_1.getName();
              moduleEntityModelsMap.put(_name_1, entityModelsMap);
            }
          }
          String _version = em.getVersion();
          entityModelsMap.put(_version, em);
        }
      }
      return moduleEntityModelsMap;
    }
  }
  
  public void postInvoke() {
  }
  
  public void preInvoke() {
  }
}