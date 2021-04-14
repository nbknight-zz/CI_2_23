package com.tts.day2Class;

public class Pet {
	//what do pets have?
	/*
	 * 	name (PRIVATE)
		age (PRIVATE)
		location (PRIVATE)
		type (PRIVATE) 
	 */
	
	private String name;
	private int age;
	private String location;
	private String type;
	
	
	//add my constructors x 2 (one empty, one all);
	
	public Pet() {
	}


	public Pet(String name, String type) {
		this.name = name;
		this.type = type;
	}


	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public String getType() {
		return type;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	

}
