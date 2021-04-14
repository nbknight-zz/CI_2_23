package com.tts.day2;

public class Person{

    String name; 
    int age; 
    String location; 
    
    public Person (String name, int age, String location) {
        
        this.name = name; 
        this.age = age; 
        this.location = location; 

    }
    
    //single param constructor
    public Person (String name) {
    	this.name = name;
    }
    
    //empty constructor
    public Person () {
    	
    }
    
    //two param constructor
    
    public Person (String name, Integer age) {
    	this.name = name;
    	this.age = age;
    }
    
    //create first method
    //non static
    public void sayHello() {
    	System.out.println("Hello " + name);
    }
    
    public void sayHello(String firstName) {
    	System.out.println("Hello " + firstName);
    }
    
    //return something
    public int birthday() {
    	return age + 1;
    	//return name; //Common error: Type mismatch: cannot convert from String to int
    	
    	
    }
    
    public int birthYear (int currentYear) {
    	int birthYear = currentYear - age;
    	return birthYear;
    }
    
    public static void main(String[] args) {
    	//create an instance for each constructor
    	Person firstPerson = new Person();
    	Person secondPerson = new Person("John");
    	Person thirdPerson = new Person("Jane", 45, "London");
    	Person new_person = new Person("Michael",31);
    	
    	//call sayHello
    	thirdPerson.sayHello();
    	System.out.println("Jane will be " + thirdPerson.birthday() + " years old next year");
    	System.out.println(thirdPerson.birthYear(2021));
    	System.out.println(new_person.name);
    }
    
    
    
    
    
    

}
