package com.endava.day4;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Dog {
private String name;
private int age;
public Dog(String name, int age) {
	this.name = name;
	this.age = age;
}
@Override
	public boolean equals(Object o) {
	return false;
}
@Override
	public int hashCode() {
	return Objects.hash(name, age);
}
@Override
	public String toString() {
	return "Dog{name='" + name + '\'' + ", age=" + age + '}';
}

	public String getName() {
	return name;
	}

	public Object getAge() {
	return age;
	}
}
