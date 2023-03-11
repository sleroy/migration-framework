package fr.echoeslabs.rapid.api.textnormalization;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.Validate;
import org.mozilla.universalchardet.UniversalDetector;

public class Encoding {

	private static final Charset	DEFAULT_CHARSET	= Charset.forName("UTF-8");

	private static final Encoding	instance		= new Encoding();

	public static final Charset detectCharset(final CharSequence _content) {
		final UniversalDetector detector = new UniversalDetector(null);
		final StringBuilder builder = new StringBuilder(_content);
		final String str = new String(builder);
		final byte[] bytes = str.getBytes();
		detector.handleData(bytes, 0, bytes.length);
		detector.dataEnd();
		final String encoding = detector.getDetectedCharset();
		detector.reset();
		if (encoding != null) {
			return Charset.forName(encoding);
		} else {
			return DEFAULT_CHARSET;
		}
	};

	public static final Charset detectCharset(final File _file) throws IOException {
		final String readFileToString = FileUtils.readFileToString(_file);
		return detectCharset(readFileToString);
	}

	public final static LineSeparator detectLineSeparator(final CharSequence _content) {
		final StringBuilder builder = new StringBuilder(_content);
		final String str = new String(builder);
		if (str.matches("(?s).*(\\r\\n).*")) {
			return LineSeparator.DOS;
		} else if (str.matches("(?s).*(\\n).*")) {
			return LineSeparator.UNIX;
		} else if (str.matches("(?s).*(\\r).*")) {
			return LineSeparator.CR;
		} else {
			return LineSeparator.UNIX;
		}
	}

	public static final LineSeparator detectLineSeparator(final File _file) throws IOException {
		final String readFileToString = FileUtils.readFileToString(_file);
		return detectLineSeparator(readFileToString);
	}

	public static final Encoding getInstance() {
		return instance;
	}

	private Charset			charset			= DEFAULT_CHARSET;

	private LineSeparator	lineSeparator	= LineSeparator.DEFAULT;

	private Encoding() {
	}

	public final String convertToDesiredEncoding(String _content) {
		// final Charset inputCharset = detectCharset(_content);
		// final Charset expectedCharset = getCharset();
		// if (!inputCharset.equals(expectedCharset)) {
		// //Fix charset
		// throw new UnsupportedOperationException(String.format("TODO: convert charset from %s to %s.", inputCharset, expectedCharset));
		// }

		final LineSeparator inputLineSeparator = detectLineSeparator(_content);
		final LineSeparator expectedLineSeparator = this.getLineSeparator();
		if (!inputLineSeparator.value().equals(expectedLineSeparator.value())) {
			// Fix line separator
			_content = _content.replace(inputLineSeparator.value(), expectedLineSeparator.value());
			// throw new UnsupportedOperationException(String.format("TODO: convert line separator from %s to %s.", inputLineSeparator, expectedLineSeparator));
		}
		return _content;
	}

	public final Charset getCharset() {
		return this.charset;
	}

	public final Charset getDefaultCharset() {
		return DEFAULT_CHARSET;
	}

	public final LineSeparator getDefaultLineSeparator() {
		return LineSeparator.DEFAULT;
	}

	public final LineSeparator getLineSeparator() {
		return this.lineSeparator;
	}

	public final void setCharset(final Charset _charset) {
		Validate.notNull(_charset);
		this.charset = _charset;
	}

	public final void setCharset(final String _charsetName) {
		Validate.notBlank(_charsetName);
		final boolean supported = Charset.isSupported(_charsetName);
		if (!supported) {
			throw new UnsupportedCharsetException(_charsetName);
		}
		this.setCharset(Charset.forName(_charsetName));
	}

	public final void setLineSeparator(final LineSeparator _lineSeparator) {
		this.lineSeparator = _lineSeparator;
	}

	public final void setLineSeparator(final String _lineSeparator) {
		this.setLineSeparator(LineSeparator.valueOf(_lineSeparator));
	}
}
