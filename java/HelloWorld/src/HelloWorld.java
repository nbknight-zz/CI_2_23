import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		String s1 = "Hello";
		int two = 2;
		String s2 = new String("World " + two);
		
		int len = s1.length();  // equals 5
		boolean sameLen = (s1.length() == s2.length()); // equals true
		
		System.out.print(sameLen + "\n");
		
		String greeting = s1.concat(s2);  // greeting will now hold "HelloWorld" with no space.
		String longGreeting = s1.concat(" ").concat(s2).concat(" from Java!");  
		// longGreeting will now be "Hello World from Java!"
		
		System.out.println(longGreeting);
		
		
		boolean noNums = longGreeting.matches("d.+");  
		System.out.println(noNums);


	}

}
