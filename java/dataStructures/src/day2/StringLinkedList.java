package day2;

import java.util.LinkedList;

public class StringLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a linkedlist of strings.
		LinkedList<String> places = new LinkedList<>();
		//add 5 of your favorite places
		places.add("Aruba");
		places.add("Key West");
		places.add("La Paz");
		places.add("Maui");
		
		//Print the linkedlist
		
		System.out.println(places);
				
		//remove the middle element from the linked list
		places.remove(places.size()/2);
		
		//print the result
		System.out.println(places);
		System.out.println(places.getClass());
		
		//hard
		
		//create a linkedlist of Strings
		LinkedList<String> space = new LinkedList<>();
				
		//Add the letters of the word ("S" "P" "A" "C" "E") all as separate elements of the list.
		space.add("S");
		space.add("P");
		space.add("A");
		space.add("C");
		space.add("E");
		System.out.println(space);
		
		//one letter at a time, transform the letters to spell out "RACECAR".
		
		space.removeFirst();
		space.remove("P");
		System.out.println(space);
		space.addFirst("R");
		System.out.println(space);
		space.add("C");
		space.add("A");
		space.add("R");
		
		//turn into a String and print as one word lowercase
		System.out.println(space);
		System.out.println(places.getClass());
		String string = space.toString();
		System.out.println(string.getClass());
		System.out.println(string);
		System.out.println(string.replace("[", "").replace("]", "").replace(",","").replace(" ","").toLowerCase());

	}

}
