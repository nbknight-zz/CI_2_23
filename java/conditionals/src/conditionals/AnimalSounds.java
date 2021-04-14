package conditionals;

import java.util.Scanner;

public class AnimalSounds {

	public static void main(String[] args) {
		//I need to take in the user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an animal: ");
		String animal = input.nextLine();
		
		//Create a set of options: if the user picks an animal give the sound
		if(animal.equalsIgnoreCase("dog")) {
			System.out.println("woof");
		} else if (animal.equalsIgnoreCase("cat")){
			System.out.println("meow");
		} else if (animal.equalsIgnoreCase("duck")) {
			System.out.println("quack");
		} else if (animal.equalsIgnoreCase("mouse") || animal.equalsIgnoreCase("rat") || animal.equalsIgnoreCase("swamp rat")) {
			System.out.println("squeak");
		} else if (animal.equalsIgnoreCase("snake")) {
			System.out.println("Hisssssssssss");
		} else {
			System.out.println("No idea what you're talking about");
		}
		
		//if the animal is not in the options, give them an answer

	}

}
