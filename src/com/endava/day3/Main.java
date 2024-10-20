package com.endava.day3;

public class Main {
		public static void main(String[] args) {
			// Creating an orange tree object with the specified properties
			Orange orangeTree = new Orange(50, 10, 5);

			// Printing the details of the orange tree
			System.out.println("Orange Tree Details:");
			System.out.println("Age: " + orangeTree.getAge());
			System.out.println("Height: " + orangeTree.getHeight());
			System.out.println("Is Eatable: " + orangeTree.isEatable());
			System.out.println("Time to Harvest: " + orangeTree.getTimeToHarvest());
			System.out.println("Oxygen Production: " + orangeTree.getOxygenProduction());
			System.out.println("Color: " + orangeTree.getColor());
		}
	}
