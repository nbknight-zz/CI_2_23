package com.tts.day2Class;

public class Person {
	
	//instance variables
	public String name;
	public int age;
	public String location;
	
	//constructors
	
	public Person() {}
	
	public Person (String name) {
		this.name = name;
	}
	

	public Person (String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Person (String personName, int age, String location) {
		this.name = personName;
		this.age = age;
		this.location = location;
	}
	
	//methods
	public void sayHello() {
		System.out.println("Hello " + name);
	}
	
	public void sayHello(String firstName) {
		System.out.println("Hello " + firstName);
	}
	
	public int birthday() {
//		double dbl = 4.0;
		return(age + 1);
	}
	
	public int birthYear(int currentYear) {
		int birthYear = currentYear - age;
		return birthYear;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person firstPerson = new Person();
		firstPerson.name = "Christoph";
		Person secondPerson = new Person("John");
		Person thirdPerson = new Person("Ruby",45,"Quebec");
		Person newPerson = new Person("Blake",29);
		
		firstPerson.sayHello();
		secondPerson.sayHello();
		
		System.out.println("Ruby will be " + thirdPerson.birthday() + " this year.");
		System.out.println("Ruby was born in " + thirdPerson.birthYear(2021));
		System.out.println(newPerson.name);
		
	}

}
