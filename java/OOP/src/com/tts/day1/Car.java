package com.tts.day1;

public class Car {
	private String color;
	private int numberOfDoors;
	private int currentRPM;
	private int speed;
	//internal constants
	private static final int MAX_DOORS = 6;
	private static final int MIN_DOORS = 1;
	private String carType;
	//external constants
	public static final String TYPE_SPORTY = "Sporty";
	public static final String TYPE_FAMILY = "Family";
	
	
	
	
	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	
	public void setNumberOfDoors(int numberOfDoors) {
		if(numberOfDoors >=MIN_DOORS && numberOfDoors <= MAX_DOORS) {
			this.numberOfDoors = numberOfDoors;
		} else {
			this.numberOfDoors = -1;
		}
	}
	
	public int getCurrentRPM() {
		return currentRPM;
	}
	
	public void setCurrentRPM(int rpm) {
		currentRPM = rpm;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
		setCurrentRPM(calculateRPM(speed));
	}
	
	public static boolean areDoorsEqual(Car c1, Car c2) {
		return c1.getNumberOfDoors() == c2.getNumberOfDoors();
	}
	
//	public static int convertGrossWeightToKGs(Car c)
//	{
//	    double kgs = c.grossWeightInLbs/2.2;
//	    return (int)kgs;
//	}
	
	public Car() {}
	
	public Car(String color, int doors) {
		this.setColor(color);
		this.setNumberOfDoors(doors);
	}
	
	public Car(String color) {
		this.color = color;
		this.numberOfDoors = 4;
	}
	
	public void start() {
		System.out.println("Car Starting");
	}
	
	public void stop() {
		System.out.println("Car Stopping");
	}
	
	public void drive() {
		System.out.println("Car Driving");
	}
	
	public void drive(int miles) {
		System.out.println("Driving for " + miles + " miles.");
	}
	
	public void drive(int miles, int speed) {
		System.out.println("Driving " + speed + "mph for " + miles + " miles");
	}
	
	public void drive(String destination) {
		System.out.println("Driving to " + destination);
	}
	
	private int calculateRPM(int speed) {
		int rpm = 0;
		rpm = speed * getBestGear(speed) * engineFactor();
		return rpm;
	}

	private int engineFactor() {
		// TODO Auto-generated method stub
		return 0;
	}

	private int getBestGear(int speed2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
