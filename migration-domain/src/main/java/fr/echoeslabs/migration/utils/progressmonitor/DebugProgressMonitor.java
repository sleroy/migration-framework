package fr.echoeslabs.migration.utils.progressmonitor;

import java.util.Stack;
import java.util.concurrent.Callable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
public class DebugProgressMonitor implements ProgressMonitor {

	private static class Task {

		private final String	name;

		private int				totalWork	= 0;
		private int				worked		= 0;

		public Task(final String name2, final int totalWork) {

			this.name = name2;
			this.totalWork = totalWork;
		}

		public void inc(final int work) {

			this.worked += work;

		}

		@Override
		public String toString() {

			return "[PROGRESS] Task " + this.name + " progress " + this.worked + "/" + this.totalWork;
		}
	}

	private static final Logger	LOGGER		= LoggerFactory.getLogger(DebugProgressMonitor.class);

	/**
	 * Indicates whether cancel has been requested.
	 */
	private volatile boolean	cancelled	= false;

	private boolean				done		= false;

	private final Stack<Task>	taskQueue	= new Stack<Task>();

	/**
	 * Constructs a new progress monitor.
	 */
	public DebugProgressMonitor() {

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

		this.taskQueue.push(new Task(name, totalWork));
		this.message("[PROGRESS] Begin task {} with amount of work {}", this.getTaskName(), totalWork);
		if (this.taskQueue.size() > 1) {
			this.subTask(name);
		}
	}

	/**
	 * This implementation does nothing. Subclasses may override this method to
	 * do interesting processing when a task is done.
	 *
	 * @see ProgressMonitor#done()
	 */
	@Override
	public void done() {

		this.message("[PROGRESS] Task {} done", this.getTaskName());
		this.taskQueue.pop();
		if (this.taskQueue.isEmpty()) {
			this.done = true;
		}
	}

	@Override
	public <R> R executeTask(final String task, final Callable<R> _callable) throws Exception {

		return this.executeTask(task, _callable, 1);
	}

	@Override
	public <R> R executeTask(final String taskName, final Callable<R> callable, final int size) throws Exception {

		R res = null;
		try {
			this.beginTask(taskName, size);
			// message("[PROGRESS]> Begin {}", getTaskName());
			res = callable.call();
			// message("[PROGRESS]< End {}", taskName);
		} finally {
			this.done();
		}
		return res;

	}

	/**
	 * Gets the indent.
	 *
	 * @return the indent
	 */
	public String getIndent() {

		final StringBuilder sb = new StringBuilder();
		for (int i = 0; i < this.taskQueue.size(); ++i) {
			sb.append(' ');
		}
		return sb.toString();
	}

	/**
	 * Gets the progression.
	 *
	 * @return the progression
	 */
	public long getProgression() {

		double totalamount = 0;
		double consumed = 0;
		for (final Task task : this.taskQueue) {
			totalamount *= task.totalWork;
			consumed *= task.worked;
		}
		if (Double.doubleToRawLongBits(totalamount) == 0) {
			return 0;
		}
		return Math.round(consumed * 100 / totalamount);
	}

	private String getTaskName() {

		final StringBuilder sv = new StringBuilder();
		for (final Task task : this.taskQueue) {
			sv.append(':').append(task.name);
		}
		return sv.toString();
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
	 * Checks if is done.
	 *
	 * @return true, if is done
	 */
	public boolean isDone() {

		return this.cancelled || this.done;
	}

	/**
	 * Message.
	 *
	 * @param _format
	 *            the _format
	 * @param args
	 *            the args
	 */
	public void message(final String _format, final Object... args) {

		final Object[] args2 = new Object[args.length + 1];
		args2[0] = this.getIndent();
		System.arraycopy(args, 0, args2, 1, args.length);
		LOGGER.warn("{} " + _format, args2);
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

		this.message("[PROGRESS] CANCEL!!! ProgressMonitor received cancellation");
		this.cancelled = cancelled;
		this.done = true;
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

	@Override
	public String toString() {

		return this.taskQueue.isEmpty() ? "No task" : this.taskQueue.peek().toString();

	}

	/**
	 * This implementation does nothing. Subclasses may override this method to
	 * do interesting processing when some work has been completed.
	 *
	 * @see ProgressMonitor#worked(int)
	 */
	@Override
	public void worked(final int work) {

		this.taskQueue.peek().inc(work);
		this.message(this.taskQueue.peek().toString());
	}

}