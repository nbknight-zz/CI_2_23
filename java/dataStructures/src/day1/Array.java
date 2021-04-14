package day1;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.LinkedList;
import java.util.*;

public class Array {
	public static void main (String[] args) {
		//creates the array with elements in it
		String[] elements = {"Element 1", "Element2", "Element 3", "And so on" };
		// creates a reference to an array
		int classSize[];
		//Instantiate a new classSize array and store it in memory
		classSize = new int[10]; // creates a new array of ints with a size of 10
		
		//print out the array
		System.out.println(classSize); // ==> [I@26f0a63f is the memory address
		
		//to access the actual element we need to specify the index
		System.out.println(classSize[2]);
		System.out.println(elements[0]);
		
		//directly assign a value to an array's index
		classSize[2] = 24;
		System.out.println(classSize[2]);
		
		//values of empty strings
		int emptyInt[];
		emptyInt = new int[10];
		String[] emptyString;
		emptyString= new String[10];
		boolean emptyBool[];
		emptyBool = new boolean[10];
		// print the values
		System.out.println(emptyInt[1] + " " + emptyString[1] + " " + emptyBool[1]);
		
		// print the array as a String to see all the values at once
		// Uses the Array class
		System.out.println(Arrays.toString(classSize));
		// loop through an array to print the elements
		for (int i = 0; i < elements.length; i++) {
			System.out.println("Index " + i + " is element: " + elements[i]);
		}
		
		//Arrays can be defined as array literals
		
		String[] myStringArray = {"Hello", "World", "you're", "doomed"};
		System.out.println(Arrays.toString(myStringArray));
		
		//Excersize 1
		//Easy: Array literal of your favorite food
		String[] favFoods = {"Pizza", "Burgers", "Cauliflower"};
		System.out.println(Arrays.toString(favFoods));
		//Hard
		//Empty Array of ints and a size of 10
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
		//Print the sum of the numbers at the even indices
		System.out.println(intArray[0] + intArray[2] + intArray[4] + intArray[6]+ intArray[8]);
		int sum = 0;
		for(int i = 0; i < intArray.length; i+=2) {
			sum += intArray[i];
		}System.out.println(sum);
		//Print the product of the odd indexes
		int prod = 1;
		for (int i = 1; i < intArray.length; i+=2 ) {
			prod *= intArray[i];
		}System.out.println(prod);
		System.out.println(intArray[1] * intArray[3] * intArray[5] * intArray[7] * intArray[9]);
		
		//Instantiating different list interfaces:
		
		ArrayList <String> list1= new ArrayList<>();  
		LinkedList <Integer> list2 = new LinkedList<>();  
		Vector <Boolean> list3 = new Vector<>();  
		Stack <Double> list4 = new Stack<>();  
		//ArrayLists
		ArrayList<String> myArrayList; // creates a reference to an array list
		myArrayList = new ArrayList<String>(); // creates a new array list and assigns it to myArrayList
		// Adds values to myArrayList
		myArrayList.add("Hello");
		myArrayList.add("World");
		myArrayList.add("how");
		myArrayList.add("are");
		myArrayList.add("you");
		// add value at a particular index. Shifts values after
		System.out.println(myArrayList);
		myArrayList.add(0, "Goodbye");
		System.out.println(myArrayList);
		//remove a value
		myArrayList.remove("how"); // remove by value
		System.out.println(myArrayList);
		myArrayList.remove(2); // remove by index
		System.out.println(myArrayList);
		// Some common methods
		System.out.println(myArrayList.get(3)); // Get a particular value
		System.out.println(myArrayList.size()); // length of the arrayLIst
		System.out.println(myArrayList.contains("Bob")); // contains a certain value
		System.out.println(myArrayList.isEmpty()); // Are there any values in the arrayList
		Collections.reverse(myArrayList);
		System.out.println(myArrayList);
		myArrayList.clear();// clears the arrayList
		System.out.println(myArrayList);
		
//-------To go from a String to an Array ----------
		
		String myString = "I really love icecream";
		//Split it into an array
		String str[] = myString.split(" ");
		System.out.println(str.length);
		System.out.println(str.getClass());
		System.out.println(Arrays.toString(str));
		System.out.println(str.getClass());
		//Convert the array to an array list
		List<String> arrayString = new ArrayList<String>();
		arrayString = Arrays.asList(str);
		System.out.println(arrayString);
//		arrayString.add("!");
		System.out.println(arrayString.size());
		System.out.println(arrayString.getClass());
		//java.util.Arrays$ArrayList is not mutable
		ArrayList<String> arrayListString = new ArrayList<String>();
		Collections.addAll(arrayListString, str);
		System.out.println(arrayListString.size());
		System.out.println(arrayListString.getClass());
		arrayListString.add("new Words");
		System.out.println(arrayListString);
		
		//-------To go from a Arraylist to a String ----------
		
		//create an arrayList of fruits		
		ArrayList <String> fruitList = new ArrayList<String>();
		fruitList.add("Apple");
		fruitList.add("Banana");
		fruitList.add("Grape");
		System.out.println(fruitList);
		System.out.println(fruitList.getClass());
		
		// Turn the array list into an array(object)
		Object[] fruitArray = fruitList.toArray();
		System.out.println(fruitArray);
		System.out.println(fruitArray.getClass());
		
		// turn the array into a String
		String fruitString = Arrays.toString(fruitArray);
		System.out.println(fruitString);
		System.out.println(fruitString.getClass());
		
		// replace the brackets and commas
		System.out.println(Arrays.toString(fruitArray).replace("[", "")
				.replace("]","").replace(","," "));
		System.out.println(fruitString.getClass());		
		
		/*
		 * Exercise 2
		 */
		
		// Create an ArrayList (String) of your favorite animals
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Shark");
		animals.add("Penguin");
		//print animals
		System.out.println("Animal arrayList contains: " + animals);
		//add pineapple to the middle of your arrayList
		animals.add(animals.size()/2,"Pineapple");
		System.out.println("Animal arrayList contains: " + animals);
		//remove the first element of your ArrayList, and replace it with caribou
		animals.remove(0);
		animals.add(0,"caribou");
		System.out.println("Animal arrayList contains: " + animals);
		
		//Hard
		//Create an ArrayList of Strings with one element - "blank"
		ArrayList<String> blankArray = new ArrayList<String>();
		blankArray.add(" ");
		System.out.println(blankArray);
//		Using Array of favorite foods from the first exercise, 
//		add each element to your new ArrayList one index position higher 
//		(index 0 in the array would be at index 1 in the ArrayList)
		
		//Two ways to do it: Loop and Collections method
		//loop
		for(String value : favFoods) {
			blankArray.add(value);
		}
		
		//Collections method
		ArrayList<String> blankArray2 = new ArrayList<String>();
		blankArray2.add(" ");
		System.out.println("This list has 1 blank value at index 0 " + blankArray2);
		Collections.addAll(blankArray2, favFoods);
		System.out.println("This has favFoods added: " + blankArray2);
		
		//Hashmaps:
		//Like an ArrayList only uses key value pairs and not index's
//		Instantiate with:
		//Creates a HashMap with a String as key and Integer as the value it points to
		HashMap<String, Integer> person = new HashMap<>();
		
		// add to the list with .put
		person.put("Joan", 21);
		person.put("Anna", 34);
		person.put("Mike", 55);
		person.put("Daniel", 42);
		System.out.println(person); // prints the hashmap
		System.out.println(person.get("Joan")); // gets the value for a given key
		
		//Other common methods
		person.remove("Mike"); // removes Mike his value
		System.out.println(person);
		System.out.println(person.containsKey("Daniel"));
		System.out.println(person.containsValue(34));
		System.out.println(person.isEmpty());
		
		//Converting a String to a hashmap
		//new String
		String newStr = "Am I a HashMap?";
		//Convert to an array
		String[] nowAHash = newStr.split(" ");
		System.out.println(Arrays.toString(nowAHash));
		System.out.println(nowAHash.getClass());
		HashMap <String,Integer> hashmap = new HashMap<>();
		for(int i = 0; i < nowAHash.length; i++) {
			hashmap.put(nowAHash[i], i);
			System.out.println(nowAHash[i]);
		}
		
//		LOOPING THROUGH COLLECTIONS ---------->
		//Two ways for loop and for-each loop
		System.out.println(fruitList);
		for(int i = 0; i<fruitList.size(); i+=2) {
			System.out.println(fruitList.get(i)); // sloppy
		}
		
		for(String fruit : fruitList) {
			System.out.println("\n" + fruit);
		}
		
		//loop through a hashmap uses map.entry
		System.out.println(person);
		for (Map.Entry<String,Integer> entry : person.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + ": " + value);
		}
		



		
		
		

		       
		
		
		
	}

}
