package day9_arithmetic_shorthand_unary;

public class Arithmetic_Operators {

	public static void main(String[] args) {
		
		// Addition and concatenation
				System.out.println(10 + 2);
				
				int num1 = 7;
				int num2 = 7;
				System.out.println(num1 + num2);
				
				int total = num1 + num2;
				System.out.println(total);
				
				// concatenation 
				
				System.out.println("Hello" + ","  + " students!");
				System.out.println("Hello, " + 20 + " students!");
				
				int num3 = 50;
				int num4 = 70;
				
				System.out.println("Text" + num3 + num4); // ?
				// System.out.println("Text50" + num4);
				// System.out.println("Text50" + 70);
				// System.out.println("Text5070");
				
				System.out.println(50 + 70 + "Text");
				// System.out.println(120 + "Text");
				// System.out.println("120" + "Text");
				
				
				// Subtraction and negation
				System.out.println(70 - 50);
				
				int num5 = -60;
				System.out.println(-num5);
				
				
				// Multiplication
				System.out.println(50 * 70);
				
				int num6 = 6;
				int num7 = 13;
				
				System.out.println(num6 * num7);
				
				
				// Division
				System.out.println(10 / 3);  // answer:3 - integer division
				System.out.println(5 / 2);  // answer:2 - integer division
				
				System.out.println((double)7/2);
				System.out.println(7/(double)2);
				System.out.println(7.0/2);
				System.out.println(7/2.0);
				System.out.println(7.0/2.0);
				
//				System.out.println(10/0);
				
				
				// Modulus / Modulo %
				
				System.out.println(10 % 3);  // 1 - remainder from an integer division
				System.out.println(12 % 5);  // 2
				System.out.println(15 % 3);  // 0
				
				// 3, 17, 56, 2, 9, 12, 11
				
				// 3 % 2 = 1
				// 17 % 2 = 1
				// 56 % 2 = 0
	}

}
