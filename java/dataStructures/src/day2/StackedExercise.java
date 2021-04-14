package day2;

import java.util.Stack;

public class StackedExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a stack that consists of the following numbers: 1,2,4,9,6,3,0,-3 
		//with one being on the top of the stack
		Stack<Integer> newStack = new Stack<>();
		newStack.push(-3);
		newStack.push(0);
		newStack.push(3);
		newStack.push(6);
		newStack.push(9);
		newStack.push(4);
		newStack.push(2);
		newStack.push(1);
		System.out.println("Stack contains: " + newStack);
		System.out.println(newStack.pop());
		System.out.println("Stack contains: " + newStack);
		/*
		 * What will the Stack look like if we pop it once more
		 * peek at it, 
		 * push number 7 to it, 
		 * check if it's empty, 
		 * push the number 5 to it, 
		 * and pop it again?
		 * Print the stack
		 */
		
		newStack.pop(); //pop
		System.out.println(newStack.peek());// peek
		newStack.push(7);
		System.out.println(newStack.empty());
		newStack.push(5);
		newStack.pop();
		System.out.println("Stack contains: " + newStack);
		//how many elements in the stack now?
		System.out.println("Stack count is: " + newStack.size());
		
//		If a retailer is creating a mobile app where customers have 
//		to wait in line for exclusive offers, what kind of data structure should we use?
		Stack<String> nameStack = new Stack<>();
		nameStack.push("Nick");
		nameStack.push("Knight");
		nameStack.push("Norman");
		nameStack.push("Rice and black beans");
		System.out.println("My hometown is: " + nameStack.get(nameStack.indexOf("Norman")));
//		or
		int indexOfHT = nameStack.indexOf("Norman");
		System.out.println("My hometown is: " + nameStack.get(indexOfHT));
		System.out.println("My first name is: " + nameStack.firstElement());
		System.out.println("The top of my stack is: " + nameStack.peek());
		
		
		
		

	}

}
