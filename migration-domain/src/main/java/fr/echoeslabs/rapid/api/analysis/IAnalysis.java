package fr.echoeslabs.rapid.api.analysis;

import fr.echoeslabs.migration.api.decoration.IDecoratedSource;
import fr.echoeslabs.rapid.api.rules.IRapidRule;

/**
 * The Interface IAnalysis analysis a source and produce a log into a writer.
 *
 * @author sleroy
 */
public interface IAnalysis extends IRapidRule {

	/**
	 * Analysis a source and produces an output to log into the writer.
	 *
	 * @param _source
	 *            the _source
	 * @param _writer
	 *            the _writer
	 * @param _parameters
	 *            the _parameters
	 */
	void analysis(IDecoratedSource _source, AnalysisWriter _writer);

	/**
	 * Begin analysis.
	 *
	 * @param _writer
	 *            the _writer
	 */
	void beginAnalysis(AnalysisWriter _writer);

	/**
	 * End analysis.
	 *
	 * @param _writer
	 *            the _writer
	 */
	void endAnalysis(AnalysisWriter _writer);

}
