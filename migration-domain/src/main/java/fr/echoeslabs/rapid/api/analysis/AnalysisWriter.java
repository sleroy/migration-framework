package fr.echoeslabs.rapid.api.analysis;

import java.text.MessageFormat;

import fr.echoeslabs.migration.api.migration.TemporaryCache;

/**
 * The Interface AnalysisWriter defines the writer to output analysis.
 *
 * @author sleroy
 */
public interface AnalysisWriter {

	/**
	 * Begin analysis.
	 */
	void beginAnalysis(String _fileName);

	/**
	 * End analysis.
	 */
	void endAnalysis();

	/**
	 * Format a string and prints it. See also {@link MessageFormat} for more
	 * explanations.
	 *
	 * @param formatStr
	 *            the format str
	 * @param args
	 *            the args
	 */
	void format(String formatStr, Object... args);

	/**
	 * Gets the temporary cache.
	 *
	 * @return the temporary cache
	 */
	TemporaryCache getTemporaryCache();

	/**
	 * Output error.
	 *
	 * @param _error
	 *            the _error
	 */
	void outputError(Throwable _error);

	/**
	 * Writes a string into the analys log.
	 *
	 * @param string
	 *            the string
	 */
	void println(String string);
}
