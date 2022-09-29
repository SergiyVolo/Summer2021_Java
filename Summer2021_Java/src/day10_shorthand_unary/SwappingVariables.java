package day10_shorthand_unary;

public class SwappingVariables {
	/*
	 * We'll need to swap the values stored in those two variables
	 * 
	 */
	
	public static void main(String[] args) {
		
		int a = 4;
		int b = 3;
		
		System.out.println("Values before swapping: a = " + a + ", b = " + b);
		
		// creating a temporary variable
		int temp = 0;
		// a = 4, b = 3, temp = 0
		
		temp = b;   // storing the value of 'b' in the temp variable
		// a = 4, b = 3, temp = 3
		
		b = a;      // b will be equal to 4 (pouring contents of a into b)
		// a = 4, b = 4, temp = 3
		
		a = temp;   // storing the contents of 'temp' into 'a' 
		// a = 3, b = 4, temp = 3
		
		
		System.out.println("Values after swapping: a = " + a + ", b = " + b);
		
		int i = 10;
		int j = 20;
		int temp1 = 0;
		temp1 = j;
		j = i;
		i = temp;
		System.out.println("Values after swapping: i = " + i + ", j = " + j);
		
		int firstPlaceWinner = 10;
		int secondPlaceWinner = 20;
		int temp2 = 0;
		temp2 = secondPlaceWinner;
		secondPlaceWinner = firstPlaceWinner;
		firstPlaceWinner = temp2;
		System.out.println("Values after swapping: firstPlaceWinner = " + firstPlaceWinner + ", secondPlaceWinner = " + secondPlaceWinner);
		
		double bestValues = 1;
		double secondBestValues = 2;
		double temp3;
		temp3 = secondBestValues;
		secondBestValues = bestValues;
		bestValues = temp3;
		System.out.println(bestValues + ","+ secondBestValues);
		
		
		System.out.println("i = " + i + ' '  + "j = " + j);
		
		
		int x = 10;
	    int y = 2;
	    System.out.println(x+" "+y);
	    
	    x = x + y;
	    y = x - y;
	    x = x - y;
	    System.out.println(x+" "+y);
		
		
	}
}
