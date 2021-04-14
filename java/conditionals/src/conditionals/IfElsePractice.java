package conditionals;

import java.util.Scanner;

public class IfElsePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Guessing Game
		Scanner input = new Scanner(System.in);
		
		System.out.println("Give me a number between 1 and 100: ");
		int guess = input.nextInt();
		int storedNumber = 7;
		
		if (guess == storedNumber) {
			System.out.println("Amazing");
		} else if (guess >= storedNumber -5 && guess <= storedNumber + 5){
			System.out.println("Close but... well you know the rest");
		}else {
			System.out.println("Nope");
		}
		
		//Grades
//		System.out.println("What grade did you get: ");
//		int grade = Integer.parseInt(input.nextLine());
//		
//		if(grade >= 60) {
//			System.out.println("You passed!");
//		} else {
//			System.out.println("What will your mother say?");
//		}
//		
		

	}

}
