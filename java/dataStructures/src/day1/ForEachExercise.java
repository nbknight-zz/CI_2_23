package day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ForEachExercise {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give me a number");
		ArrayList<Integer> answer = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			answer.add(scanner.nextInt());
		}
		System.out.println(answer);
		int sum = 0;
		int product = 1;
		for(int i = 0; i < answer.size(); i++) {
			sum += answer.get(i);
			product *= answer.get(i);
		}
		System.out.println("The sum of the list is: " + sum);
		System.out.println("The product of the list is: " + product);
		System.out.println("The largest number is " + Collections.max(answer));
		System.out.println("The smallest number is " + Collections.min(answer));
	}
	

}
