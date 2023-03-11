package fr.echoeslabs.migration.api.refactoring;

// TODO: Auto-generated Javadoc
/**
 * Some exceptions may occurs when processing a refactoring. In that case, the
 * refactored source can't be fully refactored in order to be sure that it
 * does'nt produce an inconsistent source code.
 *
 * @author antoine
 *
 */
public class RefactoringException extends RuntimeException {

	private static final long	serialVersionUID	= 5683749373015862343L;
	/** The refactoring. */
	private final String		refactoring;

	/**
	 * Instantiates a new refactoring exception.
	 *
	 * @param message
	 *            the message
	 */
	public RefactoringException(final String message) {

		super(message);
		this.refactoring = "";
	}

	/**
	 * Instantiates a new refactoring exception.
	 *
	 * @param message
	 *            the message
	 * @param refactoring
	 *            the refactoring
	 */
	public RefactoringException(final String message, final Class<?> refactoring) {

		super(message + (refactoring != null ? " [" + refactoring.getSimpleName() + "]" : ""));
		if (refactoring != null) {
			this.refactoring = refactoring.getName();
		} else {
			this.refactoring = "null Refactoring";
		}
	}

	/**
	 * Instantiates a new refactoring exception.
	 *
	 * @param message
	 *            the message
	 * @param refactoring
	 *            the refactoring
	 * @param cause
	 *            the cause
	 */
	public RefactoringException(final String message, final Class<?> refactoring, final Throwable cause) {

		super(message, cause);
		this.refactoring = refactoring.getName();

	}

	/**
	 * Instantiates a new refactoring exception.
	 *
	 * @param e
	 *            the e
	 */
	public RefactoringException(final Throwable e) {

		super(e);
		this.refactoring = null;
	}

	/**
	 * Gets the refactoring.
	 *
	 * @return the refactoring
	 */
	public String getRefactoring() {

		return this.refactoring;
	}

}
