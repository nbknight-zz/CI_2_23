package day1Class;

public class MattLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int product = 1;
		int intList[] = {0,1,2,3,4,5,6,7,8,9};
		for (int i = 0; i < intList.length; i+=2) {
			sum += intList[i]; 
		} System.out.println(sum);
		for (int i = 1; i < intList.length; i+=2) {
			product *= intList[i]; 
		} System.out.println(product); //prints 945
		System.out.println(1*3*5*7*9); //equals 945
		int intArray[];
		//Assign a number to each index
		intArray = new int[10];
		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;
		intArray[3] = 4;
		intArray[5] = 6;
		intArray[6] = 7;
		intArray[7] = 8;
		intArray[8] = 9;
		intArray[9] = 10;
		int prod = 1;
		for (int i = 1; i < intArray.length; i+=2 ) {
			prod *= intArray[i];
		}System.out.println(prod);
		System.out.println(intArray[1] * intArray[3] * intArray[5] * intArray[7] * intArray[9]);

	}

}
