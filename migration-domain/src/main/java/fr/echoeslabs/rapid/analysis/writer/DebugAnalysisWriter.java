package fr.echoeslabs.rapid.analysis.writer;

import java.text.MessageFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.echoeslabs.migration.api.migration.TemporaryCache;
import fr.echoeslabs.migration.core.refactoring.TemporaryCacheImpl;
import fr.echoeslabs.rapid.api.analysis.AnalysisWriter;

/**
 * The Class DebugAnalysisWriter simply output the results of an analysis.
 *
 * @author sleroy
 */
public class DebugAnalysisWriter implements AnalysisWriter {

	private static final Logger		LOGGER			= LoggerFactory.getLogger(DebugAnalysisWriter.class);
	private final TemporaryCache	temporaryCache	= new TemporaryCacheImpl();

	@Override
	public void beginAnalysis(final String _fileName) {
		LOGGER.debug("Begin of the analysis {}", _fileName);

	}

	@Override
	public void endAnalysis() {
		//
		LOGGER.debug("End of the analysis");
	}

	@Override
	public void format(final String formatStr, final Object... args) {

		LOGGER.info(MessageFormat.format(formatStr, args));
	}

	@Override
	public TemporaryCache getTemporaryCache() {

		return this.temporaryCache;
	}

	@Override
	public void outputError(final Throwable _error) {

		LOGGER.error(_error.getMessage(), _error);
	}

	@Override
	public void println(final String string) {

		LOGGER.info(string);
	}
}
