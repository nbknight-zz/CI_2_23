package dataTypesLab;

class Bits1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(">>> operator");
		
//		Shift all the bitsin -1(in binary form) to the right by 2 places
		int y = -1 >>> 2;
		System.out.println("-1 >>> 2 = " + y);
		
//		-1 >>> 2 in binary
		System.out.println("-1 >>> 2 in binary form is " + Integer.toBinaryString(y));

	}

}
