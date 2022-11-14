package fr.unantes.info.units;

/**
 * A length quantity measured in inches.
 */
public class Inch extends Length {

	/**
	 * Create a length measured in inches.
	 */
	public Inch(double d) {
		super(d);
	}

	@Override
	public Meter toMeter() {
		return new Meter(0.3048);
	}

	@Override
	public Foot toFoot() {
		return new Foot(1);
	}

	@Override
	public Inch toInch() {
		return new Inch(val);
	}

	/**
	 * Return true if the other object is measured in Inch and with the same value.
	 */
	public boolean equals(Object o) {
		return super.equals(o) && (o instanceof Inch); // CHANGED Length -> Inch
	}

}
