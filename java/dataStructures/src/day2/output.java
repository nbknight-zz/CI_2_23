package day2;

public class output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] exampleArray = {1,5,6,5,4,1};
        double maximum = exampleArray[0];
        //
        System.out.println("Maximum is = " + maximum + ": This is before the loop");
        int index = 0;
        
        for (int i = 1; i < exampleArray.length; i++){
        	
             if (exampleArray[ i ] > maximum) {
                  maximum = exampleArray[ i ];
                  index = i;
                  System.out.println("Now I\'m in the loop and Maximum = " + maximum + ", i = " + i 
                		  + ", index = " + index);
             }
        }
        System.out.println(index);

	}

}
