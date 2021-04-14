package dataTypesLab;

public class Main {
	static int methodCount;
	static String className;

	public static void main(String[] args) {
		int mainInt = 1;
		// TODO Auto-generated method stub
		
		System.out.println("Hellow World!");
		System.out.println("Method count: " + methodCount);
		System.out.println("Class name: " + className);
		
		methodCount += mainInt;
		
		float f1 = 845.4f;
//		int f2 = 845.4f; //Type mismatch, can't convert a float to an int without cast;
		int castF1 = (int)f1;
		
		System.out.println("Float: " + f1 + ", Cast float: " + castF1);
		
		//declare 3 ints with values
		int x = 5;
		int y = 6;
		int z = 2;
		//Add them together and print the results in a third variable
		int aa = x + y + z;
		System.out.println(aa);
		
		//Declare another variable with an initial value;
		int bb = 3;
		//print 3 different statements to show order of operations
		System.out.println(bb*x+y+z);
		System.out.println(bb*(x+y)*z);
		System.out.println(bb*x+(y*z));
		
		x+=15;
		System.out.println("x now equals: " + x);
		x += y;
		System.out.println("Adding x to y equals: " + x);
		
		z += (x+2) - 6;
		System.out.println("z now equals: " + z);
		x = y = 13;
		z = 15;
		System.out.println("x = " + x + ", y = " + y + ", z = " + z);
		System.out.println(x == y);
		System.out.println(x <= y);
		System.out.println(x != y);
		System.out.println(x > y);
		System.out.println(z < (x+y));
		System.out.println(z > (x+2));
		
		//------------------------- Binary OPERATORS ------------------------------------------//
		int b1 = 50;
		System.out.println("b1 = " + b1 + " and as a binary is " + Integer.toBinaryString(b1)); // 50 = 00110010
		int b2 = 19;
		System.out.println("b2 = " + b2 + " and as a binary is " + Integer.toBinaryString(b2)); // 13 = 0010011
		int b3 = 0;
		System.out.println("b3 = " + b3 + " and as a binary is " + Integer.toBinaryString(b3)); // 0 = 0
		
		b3 = b1 & b2;
		/*
		 * The AND operator “&” produces a 1 bit if both operands are 1 otherwise 0 bit. Similarly, for boolean operands, 
		 * it will result in true if both operands are true else result will be false.
		 */
		System.out.println("b1 & b2 = " + b3 + ", and as a binary is " + Integer.toBinaryString(b3)); 
		
		//------------------------------------//
		
		b1 = 50;
		b2 = 19;
		b3 = 0;
		
		b3 = b1 | b2;
		/*
		 * The OR operator “|” produces a 0 bit if both operands are 0 otherwise 1 bit. Similarly, for boolean operands, 
		 * it will result in false if both operands are false else result will be true.
		 */
		System.out.println("b1 | b2 = " + b3 + ", and as a binary is " + Integer.toBinaryString(b3)); 	
		
		//------------------------------------//
		
		b1 = 50;
		b2 = 19;
		b3 = 0;
		
		b3 = b1 ^ b2;
		/*
		 * The XOR operator “^” produces a 0 bit if both operands are same (either both 0 or both 1) otherwise 1 bit. 
		 * Similarly, for boolean operands, it will result in false if both operands are same (either both are false or both true) 
		 * else result will be true.
		 */
		System.out.println("b1 ^ b2 = " + b3 + ", and as a binary is " + Integer.toBinaryString(b3)); 	
		
		//------------------------------------//
		
		b1 = 50;
		b2 = 19;
		b3 = 0;
		
		b3 = ~b1;
		System.out.println("~50 = " + b3 + ", and as a binary is " + Integer.toBinaryString(b3)); 	
		//inverts all numbers: 00110010 becomes 11001101
		/*
		 * Also called the bitwise complement, the unary NOT operator, ~, inverts all of the bits of its operand. If applied on integer operand 
		 * it will reverse all bits similarly if applied to boolean literal it will reverse it.
		 */
		
		
		//------------------------- SHIFT OPERATORS ------------------------------------------//
		/*
		 * Shift Operators: These operators are used to shift the bits of a number left or right thereby multiplying or 
		 * dividing the number by two respectively. They can be used when we have to multiply or divide a number by two.  
		 */
		
		b1 = 50;
		b2 = 19;
		b3 = 0;
		
		b3 = b2 >>> 2;
		/*
		 * Shifts the bits of the number to the right and fills 0 on voids left as a result. 
		 * The leftmost bit is set to 0. (>>>) is unsigned-shift; it’ll insert 0. (>>) is signed, and will extend the sign bit.
		 */
		
		System.out.println("19 SHIFT RIGHT (NON CARRY) 2 is: " + b3 + ", and as a binary: " + Integer.toBinaryString(b3));
		// 10011 becomes 11100
		
		//------------------------------------//
		
		
		b1 = 50;
		b2 = 19;
		b3 = 0;	
		
		b3 = (~b2)>>2;
		System.out.println("~19 COMP SHIFT RIGHT (CARRY) 2 is: " + b3 + ", and in a binary: " + Integer.toBinaryString(b3));
		// 10011 becomes 01100 and shifts two to the right (011) and keeps the negative
		
		b1 = 50;
		b2 = 19;
		b3 = 0;	
		
		//------------------------------------//
		
		b3 = (~b2)>>>2;
		System.out.println("~19 COMP SHIFT RIGHT (NON CARRY) 2 is: " + b3 + ", and in a binary: " + Integer.toBinaryString(b3));
		// 10011 becomes 01100 then shift two to the right 011 but loses the negative
		
		System.out.println(Integer.compare(b1, b3));
		
		String str = "This is a string of a determined length";
		int dd = str.length();
		System.out.println(dd);
		
		for(int i = 0; i < str.length(); i++) {
			System.out.println(i);
		}
		
		//Using Object.equals() checks value equality and is best for string comparisons

		String word1 = "Hello";
		String word2 = "Hello";
		String word3 = "Goodbye";

		word1.equals(word2); //true
		word1.equals(word3); //false

		// These two have the same value
		new String("Hello World").equals("Hello World"); // --> true 

//		// "==" checks if they are the same object, and they are not the same object
//		//One is a string object the other is a literal
//		new String("Hello World") = "Hello World"; // --> false 
//
//		// These are both String objects, but not the same 
//		new String("Hello World") == new String("Hello World") // --> false 
//
//		// Literals are interned strings and seen as the same object by the compiler 
//		"test" == "test" // --> true 
//
//		// String literals are concatenated by the compiler yet the results are not seen as the same object.
//		"Hello World" == "Hello " + "World" // --> false




		
		
		

		
		
		
		
		

	}

}
