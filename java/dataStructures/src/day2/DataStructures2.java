package day2;

import org.w3c.dom.Node;
import java.util.*;

public class DataStructures2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> animalList = new LinkedList<>();
		animalList.add("frog");
		animalList.add("giraffe");
		animalList.add("buffalo");
		animalList.add("mongoose");
		System.out.println(animalList);
		// => [frog, giraffe, buffalo, mongoose]

		// Puts shark as the first element in the ArrayList
		animalList.addFirst("shark"); 
		System.out.println(animalList);
		// => [shark, frog, giraffe, buffalo, mongoose]

		// Puts koala as the last element in the ArrayList
		animalList.addLast("koala"); 
		System.out.println(animalList);
		// => [shark, frog, giraffe, buffalo, mongoose, koala]
		    
		// This adds the value cuttlefish to the 3rd index of the LinkedList
		animalList.add(3, "cuttlefish"); 
//		animalList.add(9,"baboon");
		System.out.println(animalList);
		// => [shark, frog, giraffe, cuttlefish, buffalo, mongoose, koala]
		
		//Common methods:
		animalList.remove(3); 
		// Removes the element that is at the 3rd index of the LinkedList
		animalList.remove("piranha"); 
		// Removes the first instance of "piranha" in the LinkedList

		animalList.removeFirst(); 
		// Removes the first element of the LinkedList
		animalList.removeLast(); 
		// Removes the last elements of the LinkedList

		animalList.contains("giraffe"); 
		// Returns `true` if "giraffe" is present in the LinkedList

		animalList.size(); 
		// Returns an integer denoting the size of the LinkedList

		animalList.get(3); 
		// Returns the value located at the 3rd index of the LinkedList
		animalList.set(3, "emu"); 
		//Sets the value at index 4 to "emu"
		System.out.println(animalList);
		// => [frog, giraffe, buffalo, emu]
		
		System.out.println(animalList.indexOf("emu"));
		
//		Queues
		Queue<Integer> myQueue = new LinkedList<>();
		
		for (int i = 5; i < 10; i++) {
			myQueue.add(i);
		}
		System.out.println(myQueue);
		
		//print out head
		System.out.println(myQueue.peek());
		int removeHead = myQueue.remove();
		System.out.println("Removed element " + removeHead);
		System.out.println(myQueue);
		
		//view the head
		System.out.println(myQueue.peek());
		
		//get the size of the queue
		
		int size = myQueue.size();
		System.out.println("The size of the queue is: " + size);
		
		//create a stack
		Stack<Integer> myStack = new Stack<>();
		System.out.println(myStack.getClass());
		
		for(int i = 1; i < 20; i++) {
			myStack.push(i);
			System.out.println("i is equal to: " + i);
		}
		
		System.out.println("myStack contains: " + myStack);
		
		// Remove the last
		
		System.out.println("To the remove the last value (LIFO): " + myStack.pop());
		System.out.println("The contents of my stack are now: " + myStack);
		
		//
		System.out.println(myStack.peek());
		System.out.println(myStack.empty());
		
		
		
		
		
		
		
		

	}
	

}
