package fr.echoeslabs.migration.core.refactoring;

import java.util.HashMap;
import java.util.Map;

import fr.echoeslabs.migration.api.migration.TemporaryCache;

/**
 * The Class TemporaryCacheImpl.
 *
 * @author sleroy
 */
public class TemporaryCacheImpl implements TemporaryCache {

	private final Map<String, Object> map = new HashMap<>();

	@Override
	public boolean exists(final String _parameterName) {

		return this.map.containsKey(_parameterName);
	}

	@Override
	public Object get(final String _parameterName) {

		if (!this.map.containsKey(_parameterName)) {
			throw new IllegalArgumentException("Cache entry was not found " + _parameterName);
		}
		final Object value = this.map.get(_parameterName);

		return value;
	}

	@Override
	public <T> T get(final String _parameterName, final Class<T> _expectedType) {

		if (!this.map.containsKey(_parameterName)) {
			throw new IllegalArgumentException("Cache entry was not found " + _parameterName);
		}

		return _expectedType.cast(this.map.get(_parameterName));
	}

	@Override
	public void put(final String _paramKey, final Object _object) {

		this.map.put(_paramKey, _object);
	}

}
