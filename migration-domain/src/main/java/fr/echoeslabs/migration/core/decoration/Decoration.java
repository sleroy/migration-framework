package fr.echoeslabs.migration.core.decoration;

import fr.echoeslabs.migration.api.decoration.IDecoration;

/**
 * The Class Decoration implements a decoration.
 *
 * @author sleroy
 */
public class Decoration implements IDecoration {

	private final String	description;
	private final String	label;

	/**
	 * Instantiates a new decoration.
	 *
	 * @param description
	 *            the description
	 * @param label
	 *            the label
	 */
	public Decoration(final String label, final String description) {
		super();
		this.label = label;
		this.description = description;
	}

	@Override
	public boolean equals(final Object obj) {

		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		final Decoration other = (Decoration) obj;
		if (this.description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!this.description.equals(other.description)) {
			return false;
		}
		if (this.label == null) {
			if (other.label != null) {
				return false;
			}
		} else if (!this.label.equals(other.label)) {
			return false;
		}
		return true;
	}

	@Override
	public String getDescription() {

		return this.description;
	}

	@Override
	public String getLabel() {

		return this.label;
	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;
		result = prime * result + (this.description == null ? 0 : this.description.hashCode());
		result = prime * result + (this.label == null ? 0 : this.label.hashCode());
		return result;
	}

	@Override
	public String toString() {

		return "Decoration [description=" + this.description + ", label=" + this.label + "]";
	}

}
