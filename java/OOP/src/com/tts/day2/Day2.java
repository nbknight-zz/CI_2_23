package com.tts.day2;

public class Day2 {
	//create a class
	public static void main(String[] args) {
		Integer num = new Integer(5);
		
		//same as 
		Integer anotherNum = 5;
		System.out.println(num.getClass());
		System.out.println(anotherNum.getClass());
		
		String word = new String("Hello");
		String anotherWord = "World";
		System.out.println(word.getClass());
		System.out.println(anotherWord.getClass());
		
		//Instance Variables
				//class level variables, usually at the top, and outside of any method.
			//Constructors
				//Allows for instances of our classes to be created
				//They set up the specifications for each instance
			//Methods
				//describes the kind of functionality and behavior of the class
			
			//access modifiers
				//helps restrict the scope
				//4 types: default, private, protected, public
			
				/*
				 * Default: When no access modifier is specified for a class, method, or data member – 
				 * It is said to be having the default access modifier by default. 
				 * The data members, class or methods which are not declared using any access modifiers 
				 * i.e. having default access modifier are accessible only within the same package.
				 */
			
				/*
				 * Private: can only be accessed within the class it is declared
				 */
				
				/*
				 * Protected: accessible within the same package or sub classes in different packages 
				 */
			
				/*
				 * Public: can be accessed from every where in the program
				 */
				 
				 
			//Instance variables
				
				// Descriptors of the objects
				// Created inside the class, but outside the method
				// Free floating
				// Each instance of the class may have unique values
				// Dependent on the instance of the class. Can't be given a value if a new instance isn't created
				// Can be private, public, or protected
				// Cannot be marked static, because then they'd become class variables.
	
	}
}
