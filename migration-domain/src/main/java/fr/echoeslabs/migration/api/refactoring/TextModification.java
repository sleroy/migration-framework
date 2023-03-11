package fr.echoeslabs.migration.api.refactoring;

import java.io.IOException;
import java.io.Writer;

import org.apache.commons.io.output.StringBuilderWriter;

import fr.echoeslabs.migration.api.migration.ISourceModification;
import fr.echoeslabs.rapid.api.textnormalization.Encoding;

/**
 * The Class TextModification.
 *
 * @author sleroy
 */
public class TextModification implements ISourceModification {

	/** The string builder. */
	private final StringBuilder stringBuilder = new StringBuilder();

	/**
	 * Instantiates a new text modification.
	 */
	public TextModification() {

		super();
	}

	/**
	 * Instantiates a new text modification.
	 *
	 * @param _content
	 *            the _content
	 */
	public TextModification(final String _content) {
		this.stringBuilder.append(_content);
	}

	/**
	 * Apply.
	 *
	 * @param _writer
	 *            the _writer
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	@Override
	public void apply(final Writer _writer) throws IOException {
		final String convertToDesiredEncoding = Encoding.getInstance().convertToDesiredEncoding(this.stringBuilder.toString());
		_writer.write(convertToDesiredEncoding);
	}

	/**
	 * Close.
	 *
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	@Override
	public void close() throws IOException {

		this.stringBuilder.setLength(0);

	}

	/**
	 * Gets the string writer.
	 *
	 * @return the string writer
	 */
	public Writer getStringWriter() {

		return new StringBuilderWriter(this.stringBuilder);
	}

}
