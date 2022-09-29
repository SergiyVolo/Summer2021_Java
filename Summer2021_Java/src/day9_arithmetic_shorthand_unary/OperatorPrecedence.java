package day9_arithmetic_shorthand_unary;

public class OperatorPrecedence {
     public static void main(String[] args) {
    	 
    	// division is higher in the operator precedence table and will be executed first
 		int output = 5 + 8/2;
 		System.out.println(output);
 		
 		System.out.println(9/6);  // 1 - integer division
 		System.out.println(9/6*5%3); // 2?
 		System.out.println(5%3);
 		
 		System.out.println(7.5%3);   // calculator
 		
 		
 		int a = 2;
 		int b = 5;
 		int c = 1;
 		int d = 14;
 		
 		double result = (a + b + c + d) / 4.0;
    	 
    	 System.out.println(result);
    	 
	}
}
