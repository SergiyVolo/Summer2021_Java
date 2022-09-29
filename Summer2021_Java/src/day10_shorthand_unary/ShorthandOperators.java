package day10_shorthand_unary;

public class ShorthandOperators {
      public static void main(String[] args) {
    	  
    	  int x = 10;
  		System.out.println(x += 5);  // x = x + 5 -> x = 10 + 5
  		
  		int y = 99;
  		System.out.println(y -= 13); // y = y - 13 -> y = 99 - 13
  		
  		int a = 14;
  		System.out.println(a *= 5); // a = a * 5 -> a = 14 * 5
  		
  		int b = 9;
  		System.out.println(b /= 3); // b = b / 3 -> b = 9/3
  		
  		int c = 20;
  		System.out.println(c %= 6); // c = c % 6 -> c = 20 % 6 = 2
  		
  		// c = 2
  		int num1 = c += 5;   // num1 = c = c + 5; num1 = c = 7; num1 = 7
  		System.out.println(num1);
  		
  		// associativity rule for the assignment sign is right to left
  		int num2 = y = b = ++x * 8;
  		
  		// c = 7
  		int num3 = c /= 4;        // num3 = c = c / 4; num3 = c = 7/4;
  		System.out.println(num3);
    	  
      }
}
