package day10_shorthand_unary;

public class CharInInt {
	     /*
		 * Storing a character within an integer
		 */
		
		public static void main(String[] args) {
			
			char char1 = 'A';
			System.out.println(char1);
			
			char char2 = 66;    // will be converted to a char using ASCII table
			System.out.println(char2);
			
			
			int int1 = 45;
			System.out.println(int1);
			
			int int2 = 'C';	 // will be converted to a number using ASCII table
			System.out.println(int2);
			
			
			int int3 = 9;
			int int4 = '9';
			
			System.out.println("Stored number: " + int3);
			System.out.println("Stored character: " + int4);
				
		
		
		
	}

}
