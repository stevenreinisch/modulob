package de.dubmas.modulob.ui.wizard;

import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.xtext.ui.wizard.IProjectCreator;
import org.eclipse.xtext.ui.wizard.IProjectInfo;
import org.eclipse.xtext.ui.wizard.XtextNewProjectWizard;

import com.google.inject.Inject;

import de.dubmas.modulob.ui.wizard.util.SystemDslProjectInfo;

public class SystemDslNewProjectWizard extends XtextNewProjectWizard {

	private WizardNewProjectCreationPage mainPage;

	@Inject
	public SystemDslNewProjectWizard(IProjectCreator projectCreator) {
		super(projectCreator);
		setWindowTitle("New SystemDsl Project");
	}

	/**
	 * Use this method to add pages to the wizard.
	 * The one-time generated version of this class will add a default new project page to the wizard.
	 */
	public void addPages() {
		mainPage = new WizardNewProjectCreationPage("basicNewProjectPage");
		mainPage.setTitle("SystemDsl Project");
		mainPage.setDescription("Create a new SystemDsl project.");
		addPage(mainPage);
	}

	/**
	 * Use this method to read the project settings from the wizard pages and feed them into the project info class.
	 */
	@Override
	protected IProjectInfo getProjectInfo() {
		SystemDslProjectInfo projectInfo = new SystemDslProjectInfo();
		projectInfo.setProjectName(mainPage.getProjectName());
		return projectInfo;
	}

}
