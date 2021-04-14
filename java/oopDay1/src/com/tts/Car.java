package com.tts;

public class Car {
	private String color;
	private int numberOfDoors;
	private int speed;
	private int currentRPM;
	private String carType;
	//internal constants
	private static final int MAX_DOORS = 6;
	private static final int MIN_DOORS = 1;
	
	// public (external) constants
    public static final String TYPE_SPORTY = "Sporty";
    public static final String TYPE_FAMILY = "Family";
    
    public String getCarType() {
    	return carType;
    }
    
    public void setCarType(String carType) {
    	this.carType = carType;
    }
	
	public int getSpeed() {
		return speed;
	}
	

	public void setCurrentRPM(int currentRPM) {
		this.currentRPM = currentRPM;
	}



	public void setSpeed(int speed) {
		this.speed = speed;
		setCurrentRPM(calculateRPM(speed));
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
		if(numberOfDoors >= MIN_DOORS && numberOfDoors <= MAX_DOORS ) {
		this.numberOfDoors = numberOfDoors;
	} else {
		this.numberOfDoors = -1;
	}
	}
	public Car() {
		color = "White";
		numberOfDoors = 2;
	}
	
	public Car(String color, int doors) {
		this.color = color;
		this.numberOfDoors = doors;
		
	}
	
	
	public Car(String color) {
		this.color = color;
		this.numberOfDoors = 4;
	}

	public void start() {
		System.out.println("Car Starting...");
	}
	
	public void stop() {
		System.out.println("Car stopping");
	}
	
	public void drive() {
		System.out.println("Car driving...");
	}
	
	public void drive(int miles) {
		System.out.println("Driving for " + miles + " miles");
	}
	
	public void drive(int miles, int speed) {
		System.out.println("Driving " + speed + "mph for " + miles + "miles.");
	}
	
	
	// drive to the specified destination
	public void drive(String destination)
	{
	    System.out.println("Driving to " + destination);
	}
	
	private int calculateRPM(int speed)
	{
	    int rpm = 0;
	 
	    // represents a real rpm calcuation
//	    rpm = speed * getBestGear(speed) * engineFactor();
	 
	    return rpm;
	 
	}



}
