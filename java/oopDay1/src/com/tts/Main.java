//package is first
package com.tts;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
//		Car tesla = new Car();
//		tesla.color = "blue";
//		tesla.numberOfDoors = 4;
//		tesla.start();
//		tesla.drive();
//		
//		Car ford = new Car("red");
//		ford.start();
//		ford.drive();
		
		Car sporty = new Car("Red", 2);
		sporty.start();
		sporty.drive();
		
		Car family = new Car();
		family.setCarType(Car.TYPE_FAMILY);
		family.setColor("Green");
		family.setNumberOfDoors(4);
		family.start();
		family.drive();
	
	}
}
