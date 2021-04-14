package com.tts.day1;

public class Calculator {
	private int num1;
	private int num2;
	
	
	public Calculator() {};
	
	public Calculator(int num1) {
		this.num1 = num1;
	}
	
	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int add(int x, int y) {
		return(x + y);
	}
	
	public int subtract(int x, int y) {
		return(x-y);
	}
	
	public int multiplication(int x, int y) {
		return(x*y);
	}
	
	public int division(int x, int y) {
		return(x/y);
	}
	
	public int square(int x) {
		return(x*x);
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.add(2, 2));
		System.out.println(calc.subtract(2, 2));
		System.out.println(calc.multiplication(2, 2));
		System.out.println(calc.division(2, 2));
		System.out.println(calc.square(9));
	}
	

}
