package com.endava.day3;
public class Pinidae extends Plant {
	public int numberOfSpecies = 50;

	public Pinidae(int oxygenProduction) {
		super(oxygenProduction);
	}

	public String getGrowthEnvironment() {
		return "mountain";
	}

	@Override
	public void someAbstractMethod() {
		System.out.println("Abstract method implementation in Pinidae");
	}
}