package fr.echoeslabs.migration.utils.progressmonitor;

import java.util.concurrent.Callable;

/**
 * A default progress monitor implementation suitable for subclassing.
 * <p>
 * This implementation supports cancelation. The default implementations of the
 * other methods do nothing.
 * </p>
 * <p>
 * This class can be used without OSGi running.
 * </p>
 */
public class NullProgressMonitor implements ProgressMonitor {

	/**
	 * Indicates whether cancel has been requested.
	 */
	private volatile boolean cancelled = false;

	/**
	 * Constructs a new progress monitor.
	 */
	public NullProgressMonitor() {

		super();
	}

	/**
	 * This implementation does nothing. Subclasses may override this method to
	 * do interesting processing when a task begins.
	 *
	 * @see ProgressMonitor#beginTask(String, int)
	 */
	@Override
	public void beginTask(final String name, final int totalWork) {

		// do nothing
	}

	/**
	 * This implementation does nothing. Subclasses may override this method to
	 * do interesting processing when a task is done.
	 *
	 * @see ProgressMonitor#done()
	 */
	@Override
	public void done() {

		// do nothing
	}

	@Override
	public <R> R executeTask(final String task, final Callable<R> _callable) throws Exception {

		return _callable.call();
	}

	@Override
	public <R> R executeTask(final String taskName, final Callable<R> callable, final int size) throws Exception {

		return callable.call();
	}

	/**
	 * This implementation does nothing. Subclasses may override this method.
	 *
	 * @see ProgressMonitor#internalWorked(double)
	 */
	@Override
	public void internalWorked(final double work) {

		// do nothing
	}

	/**
	 * This implementation returns the value of the internal state variable set
	 * by <code>setCanceled</code>. Subclasses which override this method should
	 * override <code>setCanceled</code> as well.
	 *
	 * @see ProgressMonitor#isCanceled()
	 * @see ProgressMonitor#setCanceled(boolean)
	 */
	@Override
	public boolean isCanceled() {

		return this.cancelled;
	}

	/**
	 * This implementation sets the value of an internal state variable.
	 * Subclasses which override this method should override
	 * <code>isCanceled</code> as well.
	 *
	 * @see ProgressMonitor#isCanceled()
	 * @see ProgressMonitor#setCanceled(boolean)
	 */
	@Override
	public void setCanceled(final boolean cancelled) {

		this.cancelled = cancelled;
	}

	/**
	 * This implementation does nothing. Subclasses may override this method to
	 * do something with the name of the task.
	 *
	 * @see ProgressMonitor#setTaskName(String)
	 */
	@Override
	public void setTaskName(final String name) {

		// do nothing
	}

	/**
	 * This implementation does nothing. Subclasses may override this method to
	 * do interesting processing when a subtask begins.
	 *
	 * @see ProgressMonitor#subTask(String)
	 */
	@Override
	public void subTask(final String name) {

		// do nothing
	}

	/**
	 * This implementation does nothing. Subclasses may override this method to
	 * do interesting processing when some work has been completed.
	 *
	 * @see ProgressMonitor#worked(int)
	 */
	@Override
	public void worked(final int work) {

		// do nothing
	}
}