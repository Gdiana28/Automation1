package com.endava.day4;

import java.util.ArrayList;
import java.util.List;

public class Main{
	public static void main(String[] args) throws DogException {
		List<Dog> dogList = new ArrayList<>();
		Dog dog1= new Dog("Everest", 1);
		dogList.add(dog1);
		Dog dog2= new Dog("Zuma", 2);
		dogList.add(dog2);
		Dog dog3= new Dog("Chase", 3);
		dogList.add(dog3);
		Dog dog4= new Dog("Marshall", 4);
		dogList.add(dog4);
		Dog dog5= new Dog("Sky", 1);
		dogList.add(dog5);
		Dog dog6= new Dog("Rocky", 6);
		dogList.add(dog6);
		System.out.println("Dog List: " + dogList);
		System.out.println("Contains dog1: " + dog1);
		System.out.println("Contains dog5: " + dog5);
		addDogToList(dogList, dog5);
	}

	public static void addDogToList(List<Dog> dogList, Dog newDog) throws DogException {
			for(Dog dog : dogList)
			{
				if (dog.getName().equals(newDog.getName()) && dog.getAge() == newDog.getAge())
				{
					throw new DogException("Dog with name " + newDog.getName() + " and age" + newDog.getAge() + "already exist in the list.");

				}
			}
			dogList.add(newDog);
			System.out.println(newDog + "added to the List");
			}
		
		}