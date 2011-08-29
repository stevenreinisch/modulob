package de.dubmas.modulob.common.ui.wizard;

import java.lang.reflect.InvocationTargetException;
import java.net.URI;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.ui.wizards.NewContainerWizardPage;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess;

public class NewModuleWizardPage extends NewContainerWizardPage {

	private static final String PACKAGE= "NewModuleWizardPage.package"; //$NON-NLS-1$
	
	private StringDialogField fPackageDialogField;
	
	/*
	 * Status of last validation of the package field
	 */
	private IStatus fPackageStatus;

	private IPackageFragment fCreatedPackageFragment;
	
	public NewModuleWizardPage(String name) {
		super(name);
		
		setTitle("New Module");
		setDescription("Create a new Module");

		fCreatedPackageFragment = null;

		PackageFieldAdapter adapter = new PackageFieldAdapter();

		fPackageDialogField = new StringDialogField();
		fPackageDialogField.setDialogFieldListener(adapter);
		fPackageDialogField.setLabelText("Module name:");

		fPackageStatus = new StatusInfo();
	}

	public void init(IStructuredSelection selection) {
		IJavaElement jelem = getInitialJavaElement(selection);

		initContainerPage(jelem);
		String pName= ""; //$NON-NLS-1$
		if (jelem != null) {
			IPackageFragment pf= (IPackageFragment) jelem.getAncestor(IJavaElement.PACKAGE_FRAGMENT);
			if (pf != null && !pf.isDefaultPackage())
				pName= pf.getElementName();
		}
		setPackageText(pName, true);
		updateStatus(new IStatus[] { fContainerStatus, fPackageStatus });
	}
	
	@Override
	public void createControl(Composite parent) {
		initializeDialogUnits(parent);

		Composite composite= new Composite(parent, SWT.NONE);
		composite.setFont(parent.getFont());
		int nColumns= 3;

		GridLayout layout= new GridLayout();
		layout.numColumns= 3;
		composite.setLayout(layout);

		Label label= new Label(composite, SWT.WRAP);
		label.setText("Enter the name for the new module");
		GridData gd= new GridData();
		gd.widthHint= convertWidthInCharsToPixels(60);
		gd.horizontalSpan= 3;
		label.setLayoutData(gd);

		createContainerControls(composite, nColumns);
		createPackageControls(composite, nColumns);

		setControl(composite);
		Dialog.applyDialogFont(composite);
	}
	
	/**
	 * @see org.eclipse.jface.dialogs.IDialogPage#setVisible(boolean)
	 */
	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (visible) {
			setFocus();
		}
	}

	/**
	 * Sets the focus to the package name input field.
	 */
	protected void setFocus() {
		fPackageDialogField.setFocus();
	}


	private void createPackageControls(Composite composite, int nColumns) {
		fPackageDialogField.doFillIntoGrid(composite, nColumns - 1);
		Text text= fPackageDialogField.getTextControl(null);
		LayoutUtil.setWidthHint(text, getMaxFieldWidth());
		LayoutUtil.setHorizontalGrabbing(text);
		DialogField.createEmptySpace(composite);
	}

	// -------- PackageFieldAdapter --------

	private class PackageFieldAdapter implements IDialogFieldListener {

		// --------- IDialogFieldListener

		public void dialogFieldChanged(DialogField field) {
			fPackageStatus= packageChanged();
			// tell all others
			handleFieldChanged(PACKAGE);
		}
	}

	// -------- update message ----------------

	/*
	 * @see org.eclipse.jdt.ui.wizards.NewContainerWizardPage#handleFieldChanged(String)
	 */
	@Override
	protected void handleFieldChanged(String fieldName) {
		super.handleFieldChanged(fieldName);
		if (fieldName == CONTAINER) {
			fPackageStatus= packageChanged();
		}
		// do status line update
		updateStatus(new IStatus[] { fContainerStatus, fPackageStatus });
	}

	// ----------- validation ----------

	private IStatus validatePackageName(String text) {
		if(text == null) {
			return new StatusInfo(org.eclipse.core.runtime.IStatus.ERROR, "module name cannot be null");
		} else if (text.equals("")) {
			return new StatusInfo(org.eclipse.core.runtime.IStatus.ERROR, "module name cannot be empty");
		} else if (text.length() < 3) {
			return new StatusInfo(org.eclipse.core.runtime.IStatus.ERROR, "module name must have at least 3 characters");
		} else if (text.contains(" ")) {
			return new StatusInfo(org.eclipse.core.runtime.IStatus.ERROR, "module name cannot contain white spaces");
		}
		
		return new StatusInfo(org.eclipse.core.runtime.IStatus.OK, "module name cannot contain white spaces");
	}

	/*
	 * Verifies the input for the package field.
	 */
	private IStatus packageChanged() {
		StatusInfo status= new StatusInfo();
		String packName= getPackageText();
		if (packName.length() > 0) {
			IStatus val = validatePackageName(packName);
			if (val.getSeverity() == IStatus.ERROR) {
				status.setError(val.getMessage());
				return status;
			} else if (val.getSeverity() == IStatus.WARNING) {
				status.setWarning(val.getMessage());
			}
		} else {
			status.setError("Enter a module name.");
			return status;
		}

		IPackageFragmentRoot root= getPackageFragmentRoot();
		if (root != null && root.getJavaProject().exists()) {
			IPackageFragment pack= root.getPackageFragment(packName);
			try {
				IPath rootPath= root.getPath();
				IPath outputPath= root.getJavaProject().getOutputLocation();
				if (rootPath.isPrefixOf(outputPath) && !rootPath.equals(outputPath)) {
					// if the bin folder is inside of our root, don't allow to name a package
					// like the bin folder
					IPath packagePath= pack.getPath();
					if (outputPath.isPrefixOf(packagePath)) {
						status.setError("Name conflict with output folder.");
						return status;
					}
				}
				if (pack.exists()) {
					if (pack.containsJavaResources() || !pack.hasSubpackages()) {
						status.setError("module already exists");
					} else {
						status.setError("module already exists. Note: Views might filter empty modules.");
					}
				} else {
					IResource resource= pack.getResource();
					if (resource != null && !ResourcesPlugin.getWorkspace().validateFiltered(resource).isOK()) {
						status.setError("This module is hidden in the workspace due to resource filters.");
						return status;
					}
					URI location= pack.getResource().getLocationURI();
					if (location != null) {
						IFileStore store= EFS.getStore(location);
						if (store.fetchInfo().exists()) {
							status.setError("Module already exists with a different case.");
						}
					}
				}
			} catch (CoreException e) {
				throw new RuntimeException(e);
			}
		}
		return status;
	}

	/**
	 * Returns the content of the package input field.
	 *
	 * @return the content of the package input field
	 */
	public String getPackageText() {
		return fPackageDialogField.getText();
	}

	/**
	 * Sets the content of the package input field to the given value.
	 *
	 * @param str the new package input field text
	 * @param canBeModified if <code>true</code> the package input
	 * field can be modified; otherwise it is read-only.
	 */
	public void setPackageText(String str, boolean canBeModified) {
		fPackageDialogField.setText(str);

		fPackageDialogField.setEnabled(canBeModified);
	}

	/**
	 * Returns the resource handle that corresponds to the element to was created or
	 * will be created.
	 * @return A resource or null if the page contains illegal values.
	 * @since 3.0
	 */
	public IResource getModifiedResource() {
		IPackageFragmentRoot root= getPackageFragmentRoot();
		if (root != null) {
			return root.getPackageFragment(getPackageText()).getResource();
		}
		return null;
	}


	// ---- creation ----------------

	/**
	 * Returns a runnable that creates a package using the current settings.
	 *
	 * @return the runnable that creates the new package
	 */
	public IRunnableWithProgress getRunnable() {
		return new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
				try {
					createPackage(monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				}
			}
		};
	}

	/**
	 * Returns the created package fragment. This method only returns a valid value
	 * after <code>getRunnable</code> or <code>createPackage</code> have been
	 * executed.
	 *
	 * @return the created package fragment
	 */
	public IPackageFragment getNewPackageFragment() {
		return fCreatedPackageFragment;
	}

	/**
	 * Creates the new package using the entered field values.
	 *
	 * @param monitor a progress monitor to report progress. The progress
	 * monitor must not be <code>null</code>
	 * @throws CoreException Thrown if creating the package failed.
	 * @throws InterruptedException Thrown when the operation has been canceled.
	 * @since 2.1
	 */
	public void createPackage(IProgressMonitor monitor) throws CoreException, InterruptedException {
		if (monitor == null) {
			monitor= new NullProgressMonitor();
		}

		IPackageFragmentRoot root= getPackageFragmentRoot();
		String packName= getPackageText();
		fCreatedPackageFragment= root.createPackageFragment(packName, true, monitor);

		/*
		 * Create files for interface model, data model, ...
		 */
		ModuleFileGenerator gen = new ModuleFileGenerator();
		gen.setDestinationDirPath("src/" + packName + "/");
		gen.setModuleName(packName);
		
		EclipseResourceFileSystemAccess fsa = new EclipseResourceFileSystemAccess();
		fsa.setRoot(getWorkspaceRoot());
		IPath outputPath = fCreatedPackageFragment.getJavaProject().getPath().append("src/" + packName + "/");
		fsa.setOutputPath(outputPath.toString());
		gen.doGenerate(fsa);
		
		if (monitor.isCanceled()) {
			throw new InterruptedException();
		}
	}
}
