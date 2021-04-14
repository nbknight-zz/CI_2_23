package com.tts.day1;

public class MagicCalculator extends Calculator{
	
	
	public double squareRt(double x) {
		return(Math.sqrt(x));
	}
	
	public double sin(double x) {
		return(Math.sin(x));
	}
	
	public double cosine(double x) {
		return(Math.cos(x));
	}
	
	public double tangent(double x) {
		return(Math.tan(x));
	}
	
	public double factorial(double x) {
		double factorial = 1;
		for (int i = 1; i <= x; i++) {
			factorial *= i;
		}return(factorial);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MagicCalculator mc = new MagicCalculator();
		System.out.println(mc.factorial(60.0));
		System.out.println(mc.tangent(60));

	}

}
