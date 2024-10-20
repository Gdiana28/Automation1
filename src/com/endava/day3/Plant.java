package com.endava.day3;
public abstract class Plant {
	protected int oxygenProduction;

	public Plant(int oxygenProduction) {
		this.oxygenProduction = oxygenProduction;
	}

	public int getOxygenProduction() {
		return oxygenProduction;
	}

	// Abstract method which must be implemented by subclasses
	public abstract void someAbstractMethod();
}