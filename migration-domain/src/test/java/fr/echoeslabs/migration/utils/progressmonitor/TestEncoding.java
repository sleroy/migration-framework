package fr.echoeslabs.migration.utils.progressmonitor;

import org.junit.Assert;
import org.junit.Test;

import fr.echoeslabs.rapid.api.textnormalization.Encoding;
import fr.echoeslabs.rapid.api.textnormalization.LineSeparator;

public class TestEncoding {

	@Test
	public void testUnixToWindowsLineSeparator() {
		final String inputString = "line1\nline2";
		final String expectedResult = "line1\r\nline2";

		Encoding.getInstance().setLineSeparator(LineSeparator.DOS);

		final String result = Encoding.getInstance().convertToDesiredEncoding(inputString);

		Assert.assertEquals(expectedResult, result);
	}

	@Test
	public void testWindowsToUnixLineSeparator() {
		final String inputString = "line1\r\nline2";
		final String expectedResult = "line1\nline2";

		Encoding.getInstance().setLineSeparator(LineSeparator.UNIX);

		final String result = Encoding.getInstance().convertToDesiredEncoding(inputString);

		Assert.assertEquals(expectedResult, result);
	}
}
