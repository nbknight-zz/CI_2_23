package dataTypesLab;

public class TestBitwis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 60;
		System.out.println("a = " + a + " and as a binary is " + Integer.toBinaryString(a)); // 60 = 0011 1100
		int b = 13;
		System.out.println("b = " + b + " and as a binary is " + Integer.toBinaryString(b)); // 13 = 0000 1101
		int c = 0;
		System.out.println("c = " + c + " and as a binary is " + Integer.toBinaryString(c)); // 0 = 0
		
		c = a & b;
		System.out.println("a & b = " + c + ", and as a binary is " + Integer.toBinaryString(c)); 								 				 //  

		c = a | b;
		System.out.println("a | b = " + c + ", and as a binary is " + Integer.toBinaryString(c)); 	
		
		c = a ^ b;
		System.out.println("a ^ b = " + c + ", and as a binary is " + Integer.toBinaryString(c)); 	
		
		c = ~a;
		System.out.println("~a = = " + c + ", and as a binary is " + Integer.toBinaryString(c)); 	
		
		c = a << 2;
		System.out.println("a << b = " + c + ", and as a binary is " + Integer.toBinaryString(c)); 	
		
		c = a >> 2;
		System.out.println("a >> b = " + c + ", and as a binary is " + Integer.toBinaryString(c)); 	
		
		c = a >>> 2;
		System.out.println("a >>> b = " + c + ", and as a binary is " + Integer.toBinaryString(c)); 	
		
		

	}

}
