package fr.echoeslabs.rapid.api.analysis;

import java.io.File;
import java.util.Collection;

import fr.echoeslabs.migration.utils.progressmonitor.ProgressMonitor;

public interface IAnalysisExecutor {

	/**
	 * Launch a script (audit ,refactoring, analysis);.
	 *
	 * @param files
	 *            the files
	 * @param _progressMonitor
	 *            the _progress monitor
	 * @param _analysisWriter
	 *            the _analysis writer
	 */
	public void launch(Collection<File> files, ProgressMonitor _progressMonitor, AnalysisWriter _analysisWriter);

}
