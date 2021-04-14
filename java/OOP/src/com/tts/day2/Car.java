package com.tts.day2;

public class Car {
	
	private String name;
	private String color;
	
	public Car() {};
	public Car(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	
	@Override
	public String toString() {
		return String.format("This %s car is %s.", this.getName(),this.getColor());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car("crossover", "blue");
		
		System.out.println(myCar);

	}

}
