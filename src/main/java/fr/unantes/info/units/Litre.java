package fr.unantes.info.units;

/**
 * A volume quantity measured in litres.
 */
public class Litre extends Volume {

	public Litre(double d) {
		super(d);
	}

	@Override
	public Gallon toGallon() {
		return new Gallon(val / 4.546);
	}

	@Override
	public Litre toLitre() {
		return this;
	}

	/**
	 * Return true if the other object is measured in Litre and with the same value.
	 */
	@Override
	public boolean equals(Object o) {
		return super.equals(o) && (o instanceof Litre); // ADDED second condition
	}

}
