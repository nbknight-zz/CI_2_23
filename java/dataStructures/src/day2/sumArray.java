package day2;

public class sumArray {
	//write a program to sum all the values of a given Array
	
	public static void main(String[] args) {
		int sum = 0;
		int[] sumArray = {1,6,4,8,6,4,3,2};
		for(int value : sumArray) {
//			int total = 0;
			sum += value;
			//sum = sum + value
			System.out.println("The sum is: " + sum + ", and the value is: " + value);
		}
		System.out.println("The sum is: " + sum);
	
	}

}
