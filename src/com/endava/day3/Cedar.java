package com.endava.day3;
public class Cedar extends Pinidae {
	public int numberOfSpecies = 10;

	public Cedar(int oxygenProduction) {
		super(oxygenProduction);
	}

	@Override
	public String getGrowthEnvironment() {
		return "mountain and Mediterranean";
	}

	@Override
	public void someAbstractMethod() {
		System.out.println("Abstract method implementation in Cedar");
	}

	// Main method to demonstrate usage
	public static void main(String[] args) {
		Cedar cedar = new Cedar(30);
		System.out.println("Oxygen production: " + cedar.getOxygenProduction());
		System.out.println("Number of species: " + cedar.numberOfSpecies);
		System.out.println("Growth environment: " + cedar.getGrowthEnvironment());
		cedar.someAbstractMethod();
	}
}