package fr.echoeslabs.rapid.api.textnormalization;

/**
 * inspired from Jdom2.LineSeparator
 *
 * @author amorvan
 *
 */
public enum LineSeparator {
	/**
	 * The Separator sequence CRNL which is '\r\n'.
	 * This is the default sequence.
	 */
	CRNL("\r\n"),

	/**
	 * The Separator sequence NL which is '\n'.
	 */
	NL("\n"),
	/**
	 * The Separator sequence CR which is '\r'.
	 */
	CR("\r"),

	/** The 'DOS' Separator sequence CRLF (CRNL) which is '\r\n'. */
	DOS("\r\n"),

	/** The 'UNIX' Separator sequence NL which is '\n'. */
	UNIX("\n"),

	/**
	 * The system-dependent Separator sequence NL which is obtained from
	 * <code>System.getProperty("line.separator")</code>. This should be
	 * the equivalent of {@link #DOS} on windows platforms, and
	 * of {@link #UNIX} on UNIX and Apple systems (after Mac OSX).
	 */
	SYSTEM(System.getProperty("line.separator")),

	/** Perform no end-of-line processing. */
	NONE(null),

	// DEFAULT must be declared last so that you can specify enum names
	// in the system property.
	DEFAULT(getDefaultLineSeparator());

	private static String getDefaultLineSeparator() {
		return UNIX.value();
	}

	private final String value;

	LineSeparator(final String value) {
		this.value = value;
	}

	/**
	 * The String sequence used for this Separator
	 *
	 * @return an End-Of-Line String
	 */
	public String value() {
		return this.value;
	}
}
