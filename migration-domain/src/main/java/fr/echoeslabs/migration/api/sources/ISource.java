package fr.echoeslabs.migration.api.sources;

import java.io.File;
import java.nio.charset.Charset;

import fr.echoeslabs.migration.utils.dpattern.Adaptable;

/**
 * The Interface ISource provides some methods to manipulate a file that is
 * identified as a source. ISource components are later used by the refactorings
 * to identify the patterns to modify.
 */
public interface ISource extends Adaptable {

	/**
	 * Gets the encoding.
	 *
	 * @return the encoding
	 */
	Charset getCharset();

	/**
	 * Gets the content.
	 *
	 * @return the content
	 */
	String getContent();

	/**
	 * Gets the file.
	 *
	 * @return the file
	 */
	File getFile();

	/**
	 * Gets the file extension.
	 *
	 * @return the file extension
	 */
	String getFileExtension();

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	String getName();

}
