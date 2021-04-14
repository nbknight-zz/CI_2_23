package conditionals;

import java.util.Random;
import java.util.Scanner;

public class ConditionalsDay2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an odd number");
		String word = scanner.nextLine();
		int value = Integer.parseInt(word);
		insertOddData(value);
		

	}
	
	
public static void insertOddData(int data)
{
    // equal to 0 check
    if (data == 0)
    { 
        return;
    }
    // Negative check
    if (data < 0)
    {
        return;
    }
    // check to see if data is even or odd
    if ( data%2 == 0)
    {
        return;
    }
 
    // some code here to store the odd data somewhere
    System.out.println("Odd Data Stored");
    return;
}
}
//	public int getArraySum(int[] arr)
//	{
//	    // initialize to a valid default return value
//	    int sum = 0;
//	 
//	    // array must have values to sum
//	    if (arr.length > 0)
//	    {
//	        for( int n : arr)
//	        {
//	            sum += n;
//	        }
//	    }return sum;
//	 
//	    
//	}
//}
	


	
	


	


