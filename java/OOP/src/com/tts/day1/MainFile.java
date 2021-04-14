package com.tts.day1;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<String> arrList = new ArrayList<>();
//		LinkedList<String> llList = new LinkedList<>();
//		// use a list for something
////		System.out.println("Hello World!");
//		arrList.add("First");
//		arrList.add("Second");
//		System.out.println(arrList.size());
//		String val = arrList.get(1);
//		
//		Car car = new Car();
//		car.color = "blue";
//		car.numberOfDoors = 4;
//		car.start();
//		car.drive();
		
		Car sporty = new Car ("Red", 2);
		sporty.start();
		sporty.drive();
		
		Car family = new Car ();
		
		Car fam = new Car("White",4);
		fam.setCarType(Car.TYPE_FAMILY);
		

	}

}
