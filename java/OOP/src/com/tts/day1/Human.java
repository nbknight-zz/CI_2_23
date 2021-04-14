package com.tts.day1;

public class Human {
	//contains instructions for objects should be created and behave.
	
	//attributes (characteristics) of the human
	String name;
	int age;
	int heightInInches;
	String eyeColor;
	
	public Human() {};
	
	// instructions for how humans will behave
	public void speak() {
		System.out.println("Hello, my name is " + name);
		System.out.println("I am " + heightInInches + " inches tall.");
		System.out.println("I am " + age + " years old");
		System.out.println("My eye color is " + eyeColor);
		
	}
	
	public void eat() {
		System.out.println("eating...");
	}
	
	public void walk() {
		System.out.println("walking...");
	}
	
	public void work() {
		System.out.println("working...");
	}
	
	//create the actual objects from this specification.
	//needs a constructor method

}
