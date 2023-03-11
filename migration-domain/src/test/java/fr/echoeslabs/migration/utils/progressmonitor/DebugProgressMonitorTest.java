/**
 * @author sleroy
 */
package fr.echoeslabs.migration.utils.progressmonitor;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author sleroy
 *
 */
public class DebugProgressMonitorTest {

	/**
	 * Test method for
	 * {@link DebugProgressMonitor#done()}
	 * .
	 */
	@Test
	public final void testDone() throws Exception {
		final DebugProgressMonitor debugProgressMonitor = new DebugProgressMonitor();
		assertFalse(debugProgressMonitor.isDone());
		debugProgressMonitor.beginTask("gni", 1);
		assertFalse(debugProgressMonitor.isDone());
		debugProgressMonitor.beginTask("gni2", 1);
		assertFalse(debugProgressMonitor.isDone());
		debugProgressMonitor.done();
		assertFalse(debugProgressMonitor.isDone());
		debugProgressMonitor.done();
		assertTrue(debugProgressMonitor.isDone());
	}

}
