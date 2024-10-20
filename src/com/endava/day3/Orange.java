package com.endava.day3;
public class Orange extends Plant implements Fructiferous, Eatable {
	private int age;
	private double height;
	private String color;
	private String timeToHarvest;

	public Orange(int oxygenProduction, int age, double height) {
		super(oxygenProduction);
		this.age = age;
		this.height = height;
		this.color = color;
		this.timeToHarvest = timeToHarvest;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public String getTimeToHarvest() {
		return timeToHarvest;
	}

	@Override
	public void someAbstractMethod() {
		System.out.println("Abstract method implementation in Orange");
	}

	@Override
	public boolean isEatable() {
		return true;
	}

	// Main method to demonstrate usage
	public static void main(String[] args) {
		Orange orangeTree = new Orange(50, 10, 5.0);
		System.out.println("Oxygen production: " + orangeTree.getOxygenProduction());
		System.out.println("Age: " + orangeTree.getAge() + " years");
		System.out.println("Height: " + orangeTree.getHeight() + " meters");
		System.out.println("Color: " + orangeTree.getColor());
		System.out.println("Time to harvest: " + orangeTree.getTimeToHarvest());
		System.out.println("Is eatable: " + orangeTree.isEatable());
		orangeTree.someAbstractMethod();
	}
}