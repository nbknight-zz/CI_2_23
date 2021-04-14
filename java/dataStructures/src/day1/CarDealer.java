package day1;

import java.util.HashMap;
import java.util.Scanner;

public class CarDealer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> cars = new HashMap<>();
		cars.put("Mustang", "Ford");
		cars.put("Camaro", "Chevy");
		cars.put("Tundra", "Toyota");
		cars.put("Corvette", "Chevy");
		cars.put("Chevelle", "Chevy");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hi there. What model are you looking for?");
		String model = scanner.nextLine();
		if(cars.containsKey(model)) {
			System.out.println("Oh you're looking for a " + model + "? Our " 
		+ cars.get(model));
		} else {
			System.out.println("I'm sorry we don't carry that model.");
		}
		

	}

}
