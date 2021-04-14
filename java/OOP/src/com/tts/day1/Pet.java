package com.tts.day1;

public class Pet {
	//what kinds of things describe this pet
	private String name;
	private int age;
	private String location;
	private String type;
	
	//two constructors; 1 empty, 1 full
	public Pet() {}
	public Pet(String name, int age, String location, String type) {
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
	}
	
	//getters
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getType() {
		return type;
	}
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	

}
