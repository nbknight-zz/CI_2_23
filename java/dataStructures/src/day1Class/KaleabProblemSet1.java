package day1Class;

import java.util.*;

public class KaleabProblemSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner userInput = new Scanner(System.in);
	       System.out.println("Enter 5 numbers");
	       ArrayList<String> numbers = new ArrayList<String>();
	       String output = userInput.nextLine();
	       Collections.addAll(numbers, output.split(" "));
	       System.out.println(numbers);
	       String max = Collections.max(numbers);
	       String min = Collections.min(numbers);
	       int sum = 0;
	       int product = 1;
	       for(String num: numbers) {
	    	   sum += Integer.parseInt(num);
	    	   product *= Integer.parseInt(num);
	       }
	       System.out.println("Sum: " + sum);
	       System.out.println("Product " + product);

	}

}
