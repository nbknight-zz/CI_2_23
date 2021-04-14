package day2Class;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Day2Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> animalList = new LinkedList<String>();
		animalList.add("frog");
		animalList.add("giraffe");
		animalList.add("buffalo");
		animalList.add("mongoose");
		System.out.println(animalList);
		
		animalList.addFirst("shark");
		System.out.println(animalList);
		animalList.addLast("koala");
		System.out.println(animalList);
		animalList.add(3,"cuttlefish");
		System.out.println(animalList);
		
		animalList.remove(3);
		System.out.println(animalList);
		animalList.remove("shark");
		System.out.println(animalList);
		System.out.println(animalList.contains("shark"));
		System.out.println(animalList.size());
		System.out.println(animalList.get(3));
		
		
		
		//queues
		Queue<Integer> myQueue = new LinkedList<>();
		for(int i = 5; i < 10; i++) {
			myQueue.add(i);
			System.out.println(i);
		}
		
		System.out.println("Elements of the queue are: " + myQueue);
		int removeHead = myQueue.remove();
		System.out.println("Removed element: " + removeHead);
		
		int head = myQueue.peek();
		System.out.println("Head of the queue is : " + head);
		
		int size = myQueue.size();
		System.out.println("Size of queue = " + size);
		
		//Stacks
		Stack<Integer> myStack = new Stack<>();
		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
		System.out.println(myStack);
		myStack.pop();
		System.out.println(myStack);
		
		System.out.println(myStack.peek());
		
		System.out.println(myStack.empty());
		
	}	

}
