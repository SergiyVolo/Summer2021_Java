package day10_shorthand_unary;

public class RelationalOperators {
    public static void main(String[] args) {
    	
    	int number1 = 50;
    	int number2 = 25;
    	boolean bol1 = number1 > number2;
    	System.out.println("First number is greater then second number - " + bol1);
    	
    	boolean bool1 = 5 > 3;
		System.out.println(bool1);
		
		boolean bool2 = 5 >= 5;
		System.out.println(bool2);
		
		boolean bool3 = 3 < 9;
		System.out.println(bool3);
		
		boolean bool4 = -1 <= -5;
		System.out.println(bool4);
		
		boolean bool5 = 10 == 10;
		System.out.println(bool5);
		
		boolean bool6 = 15 != 12;
		System.out.println(bool6);
		
		
		boolean bool7 = "Java" == "Python";
		System.out.println(bool7);
		
		boolean bool8 = "Python" != "Hard";
		System.out.println(bool8);
		
		boolean bool9 = "Sergiy" == "Good guy";
		System.out.println(bool9);
		
		boolean bool10 = 10 == 10.0;
		System.out.println(bool10);
		
		//                65 > 66
		boolean bool11 = 'A' > 'B';   // ASCII values will be used here
		System.out.println(bool11);
		
		//               100 > 126
		boolean bool12 = 100 > 'y';
		System.out.println(bool12);
		
		
		int num1 = 5;
		int num2 = 7;
		
		boolean result = num1 > num2;
		
		System.out.println("First number is greater than the second number – " + result);
		
		
    	
    	
    	
    }
}
