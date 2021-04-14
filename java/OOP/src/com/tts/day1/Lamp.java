package com.tts.day1;

public class Lamp {
	private String style;
	private boolean battery;
	private int globeRating;
	
	public Lamp() {};
	
	public Lamp(String style, boolean battery) {
		this.style = style;
		this.battery = battery;
	}
	
	public Lamp(String style, boolean battery, int globeRating) {
		this.style = style;
		this.battery = battery;
		this.globeRating = globeRating;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public boolean isBattery() {
		return battery;
	}

	public void setBattery(boolean battery) {
		this.battery = battery;
	}

	public int getGlobeRating() {
		return globeRating;
	}

	public void setGlobeRating(int globeRating) {
		this.globeRating = globeRating;
	}
	
	public String turnOn() {
		return("Lamp is turning on...");
	}
	
	public boolean plugIn() {
		return(!isBattery());
	}


}
