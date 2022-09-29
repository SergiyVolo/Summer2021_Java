package day10_shorthand_unary;

public class Kahoot {

	public static void main(String[] args) {
		// Q1
				int a = 20;
				int b = (byte) a;
				System.out.println(b);  // 20
				
				// Q2
//				System.out.println(x + 4);   // line1
//				int x = 3;					 // line2
				
				// Q3
				System.out.print("Text A" + 1 + 0);        // Text A10
				System.out.print("; Text B" + (2) + (1));  // ; Text B21
				// Text A10; Text B21
				
				// Q4
				System.out.print("3 + 2 = " + 1 + 4);      // 3 + 2 = 14
				System.out.print("; 3 + 2 = " + (1 + 4));  // ; 3 + 2 = 5
				// 3 + 2 = 14; 3 + 2 = 5
				
				// Q5
				float a1 = 100.78303040F;
				short b1 = (byte) a1;
				System.out.print(b1);  // 100
				
				// Q6
//				byte a2 = 200;  // > 128 
//				int b2 = 2;
//				System.out.print(a2 + b2 - a2*b2 + a2/b2);
				// Compilation failure
				
				// Q7
				System.out.println((3 + 2) * 2 / 3 % 2);  // 1
				
				// Q8
				// When compiling a Java program its extension...
				// changes from .java to .class
				
				// Q9
	//			int a3 = 5, b3 = 0;
	//			int c3 = a3 / b3;         // can't divide by 0
	//			System.out.println(c3);
				// Exception
				
				// Q10
				long a4 = 3000L;
				double b4 = (float) a4;   // 3000.0d
				int c4 = (short) b4;      // 3000
				
				System.out.println(c4 % 1000);  // 3000 % 1000 = 0
				
				// Q11        3.0
				double a5 = 10/3;        
				System.out.println(a5);   // 3.0
				
				// Q12
				double a6 = 10.0/3;      
				System.out.println(a6);   // 3.11111... 
				
				// Q13
//				String text = "3.5" + 3;  // 3.53
//				int int1 = (int) text;
//				
//				System.out.println(int1);
				
				
				// Q14
				int a7 = 10, b7 = 20, c7 = 30;
				
				a7 = b7 % 5;  // 0
				b7 = c7 % 5;  // 0
				c7 = a7 * b7; // 0
				
				System.out.println(a7 + " " + b7 + " " + c7);  // 0 0 0 
				
				
				// Q15
				// Select the INCORRECT statement:
				// float can be assigned to long  - incorrect statement
				// long can be assigned to float
				
				long num1 = 10;
				float num2 = 15f;
				
//				num1 = num2;   // float can't be assigned to long 
				
				
				// Q16
				double a8,b8,c8 = 10.5;  // a8, b8 are local variables without any value assigned
//				System.out.println(b8);  // compilation fails
				
				
				// Q17
				// The name of a Java class must match the name of the file for it to compile
				// true
				
				
				// Q18
				System.out.println((int) ((int)10.3/3));  // 3
				
				// Q19
//				System.out.println("Text" + 1*3 - 2);
				
				//         		   "Text" + 3 - 2
				//		           "Text3" - 2
				//        		   compilation fails: "-" can't be used with Strings
				
				// Q20
				// Explicit casting is also called narrowing, and implicit - widening.
				// true
	}

}
