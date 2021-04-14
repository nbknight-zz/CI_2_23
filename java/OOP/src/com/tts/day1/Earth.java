package com.tts.day1;

public class Earth {
	public static void main(String[] args) {
		//entry point for all java applications
		
		Human tom;
		tom = new Human();
		tom.age = 5;
		tom.eyeColor = "brown";
		tom.heightInInches = 72;
		tom.name = "Tom Zsabo";
		tom.speak();
		
		Human joe = new Human();
		joe.age = 7;
		joe.eyeColor = "blue";
		joe.heightInInches = 68;
		joe.name = "Joe Noname";
		joe.speak();
		
	}
}
