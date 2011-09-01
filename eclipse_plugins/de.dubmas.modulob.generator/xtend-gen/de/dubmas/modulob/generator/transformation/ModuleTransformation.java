package de.dubmas.modulob.generator.transformation;

import de.dubmas.modulob.system.EntityModel;
import de.dubmas.modulob.system.InterfaceModel;
import de.dubmas.modulob.system.Module;
import de.dubmas.modulob.system.NotificationModel;
import java.util.List;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;

@SuppressWarnings("all")
public class ModuleTransformation implements IWorkflowComponent {
  
  private String interfaceModelSlotName;
  
  private String entityModelSlotName;
  
  private String notificationModelSlotName;
  
  private String moduleSlotName;
  
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
      for (final Module m_1 : modules) {
        final Function1<EntityModel,Boolean> _function_1 = new Function1<EntityModel,Boolean>() {
            public Boolean apply(final EntityModel em) {
              Module _module_1 = em.getModule();
              boolean _operator_equals_1 = ObjectExtensions.operator_equals(_module_1, m_1);
              return ((Boolean)_operator_equals_1);
            }
          };
        Iterable<EntityModel> _filter_1 = IterableExtensions.<EntityModel>filter(entityModels, _function_1);
        EntityModel _head_1 = IterableExtensions.<EntityModel>head(_filter_1);
        m_1.setEntityModel(_head_1);
      }
      for (final Module m_2 : modules) {
        final Function1<NotificationModel,Boolean> _function_2 = new Function1<NotificationModel,Boolean>() {
            public Boolean apply(final NotificationModel nm) {
              Module _module_2 = nm.getModule();
              boolean _operator_equals_2 = ObjectExtensions.operator_equals(_module_2, m_2);
              return ((Boolean)_operator_equals_2);
            }
          };
        Iterable<NotificationModel> _filter_2 = IterableExtensions.<NotificationModel>filter(notificationModels, _function_2);
        NotificationModel _head_2 = IterableExtensions.<NotificationModel>head(_filter_2);
        m_2.setNotificationModel(_head_2);
      }
    }
  }
  
  public void postInvoke() {
  }
  
  public void preInvoke() {
  }
}