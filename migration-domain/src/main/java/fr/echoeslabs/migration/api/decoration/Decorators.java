package fr.echoeslabs.migration.api.decoration;

import java.util.Collections;
import java.util.List;

/**
 * The Interface Decorators provides a list of decorators.
 *
 * @author sleroy
 */
public interface Decorators {

	Decorators EMPTY = new Decorators() {

		@Override
		public List<IDecorator> getDecorators() {
			return Collections.emptyList();
		}

		@Override
		public boolean isEmpty() {
			return true;
		}

		@Override
		public int size() {
			return 0;
		}
	};

	/**
	 * Gets the decorators.
	 *
	 * @return the decorators
	 */
	List<IDecorator> getDecorators();

	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 */
	boolean isEmpty();

	/**
	 * Size.
	 *
	 * @return the int
	 */
	int size();

}
