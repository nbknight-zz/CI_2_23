package day1Class;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataStructureLecture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] myIntArray;
//		int myIntArray[];
		myIntArray = new int[5];
		System.out.println(myIntArray[0]);
		
		int[] classSize;
		boolean[] brokenLights;
		String[] names = {"John", "Daryl", "Mike", "Sarah", "Michelle"};
		System.out.println(names[3]);
		names[2] = "Steve";
		System.out.println(names[2]);
		int size = names.length;
		
		System.out.println(Arrays.toString(names));
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		//define an array literal of your favorite foods
		// print a String representation of it to the console
		String favFoods[] = {"Pizza","Burgers","Cauliflower","Tofu","Rice","Black Beans"};
		System.out.println(Arrays.toString(favFoods));
		
		//Define an empty Array of ints with a size of 10
		int[] emptyArray;
		emptyArray = new int[10];
		
		//assign a number to each index
		System.out.println(Arrays.toString(emptyArray));
		emptyArray[0] = 1;
		emptyArray[1] = 2;
		emptyArray[2] = 3;
		emptyArray[3] = 4;
		emptyArray[4] = 5;
		emptyArray[5] = 6;
		emptyArray[6] = 7;
		emptyArray[7] = 8;
		emptyArray[8] = 9;
		emptyArray[9] = 10;
		System.out.println(Arrays.toString(emptyArray));
		System.out.println(emptyArray.length);
		
		//Print the sum of the numbers at indices 0,2,4,6,8
		System.out.println(emptyArray[0] + emptyArray[2] + emptyArray[4] +emptyArray[6] + emptyArray[8]);
		int sum = 0;
		for(int i = 0; i < emptyArray.length; i+=2) {
//			sum = sum + emptyArray[i];
			sum += emptyArray[i];
		}
		System.out.println("The sum of emptyArray is " + sum);
		
		//Print the product of the numbers at indices 1,3,5,7,9
		System.out.println(emptyArray[1] * emptyArray[3] * emptyArray[5] * emptyArray[7] * emptyArray[9]);
		
		int prod = 1;
		for(int i = 1; i < emptyArray.length; i+=2) {
			prod *= emptyArray[i];
			System.out.println("i = " + i + ", which has a total of " + prod);
		}System.out.println(prod);
		
//		ARRAYLISTS
		ArrayList<String> stringArray = new ArrayList<String>();
		stringArray.add("Matt");
		stringArray.add("Sherri");
		stringArray.add("Meron");
		System.out.println(stringArray);
		stringArray.add(1,"Zachary");
		System.out.println(stringArray);
		stringArray.remove(2);
		System.out.println(stringArray);
		stringArray.remove("Matt");
		System.out.println(stringArray);
		System.out.println(stringArray.get(1));
		System.out.println(stringArray);
		System.out.println(stringArray.size());
		System.out.println(stringArray.contains("Matt"));
		System.out.println(stringArray.isEmpty());
		Collections.reverse(stringArray);
		System.out.println(stringArray);
		stringArray.clear();
		System.out.println(stringArray);
		
		//create an arrayList of Strings that contains a number of your favorite animals
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Shark");
		animals.add("Penguins");
		System.out.println(animals);
		
		//add the word pineapple to the middle your list
		animals.add(1,"pineapple");
		animals.add(animals.size()/2,"another pineapple");
		System.out.println(animals);
		
		//remove the first element of your array list and replace with caribou
		animals.remove(0);
		animals.add(0,"Caribou");
		System.out.println(animals);
		
		String myString = "I really love icecream!";
		String str[] = myString.split(" ");
		System.out.println(str.length);
		System.out.println(str.getClass());
		List<String> arrayString = new ArrayList<String>();
		arrayString = Arrays.asList(str);
		System.out.println(arrayString.size());
		System.out.println(arrayString.getClass());
//		arrayString.add("!");
		ArrayList<String> arrayListString = new ArrayList<String>();
		Collections.addAll(arrayListString, str);
		System.out.println(arrayListString.size());
		System.out.println(arrayListString.getClass());
		arrayListString.add("new words");
		System.out.println(arrayListString);
		
//------Array List to a string-----
		ArrayList<String> fruitList = new ArrayList<String>();
		fruitList.add("apple");
		fruitList.add("Banana");
		fruitList.add("Grape");
		System.out.println(fruitList);
		System.out.println(fruitList.getClass());
		
		Object[] fruitArray = fruitList.toArray();
		System.out.println(Arrays.toString(fruitArray));
		System.out.println(fruitArray.getClass());
		
		// turn it into a string
		String fruitString = Arrays.toString(fruitArray);
		System.out.println(fruitString);
		System.out.println(fruitString.getClass());
		System.out.println(fruitString.replace("[","").replace("]", "").replace(",", " "));
		
		//Create an ArrayList of Strings with one element; " "
		
		ArrayList<String> blankArray = new ArrayList<String>();
		blankArray.add(" ");
		System.out.println(blankArray);
		
		//Using array of favorite foots add each element to your new ArrayList one index higher
			//[" ","Lasagna",]
		for(String value : favFoods) {
			blankArray.add(value);
		}
		//print
		System.out.println(blankArray);
		
		ArrayList<String> blankArray2 = new ArrayList<String>();
		blankArray2.add(" ");
		System.out.println("This list has 1 blank value at index 0 " + blankArray2);
		Collections.addAll(blankArray2, favFoods);
		System.out.println("This has favFoods added as well: " + blankArray2);

//		HashMaps
		//Creates a HashMap with a String as key and Integer as the value it points to
		HashMap<String, Integer> person = new HashMap<>();
		person.put("Joan", 21);
		person.put("Anna", 34);
		person.put("Mike", 55);
		person.put("Daniel", 42);
		System.out.println(person);
		
		person.remove("Mike");
		System.out.println(person);
		System.out.println(person.containsKey("Daniel"));
		System.out.println(person.containsValue(55));
		System.out.println(person.isEmpty());
		
		// Looping
		System.out.println(fruitList);
		for(int i = 0; i<fruitList.size(); i++) {
			System.out.println(fruitList.get(i));
		}
		
		for(String fruit : fruitList) {
			System.out.println("\n" + fruit);
		}
		
		System.out.println(person);
		
		for(Map.Entry<String,Integer> entry : person.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : " + value);
			
		}

		       
		

	}

}
