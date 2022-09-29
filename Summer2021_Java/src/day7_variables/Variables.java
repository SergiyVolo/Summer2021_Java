package day7_variables;

public class Variables {

	public static void main(String[] args) {
		
		byte age; // declaration	
		age = 50; // assignment
		
		System.out.println(age);
		
		short distance = 32000;  // combined declaration and assignment 
		System.out.println(distance);
		
		/*
		 * (MacOS) Command + / -> comment out a whole line
		 * (Windows) CTRL + / -> comment out a whole line
		 */
		
//		byte range = 250;           // value is too big for this datatype
//		System.out.println(range);
		
		// long values
		long spaceDistance = 1_000_000_000_000_000L; // L(l) - is the designation for long datatype
		
		float fraction = 2.5f;  // f(F) - is the designation for float datatype
//		int number = 2.5;      // fractions can't be put into integer
		
		double anotherFraction = 3.6785D; // d(D) - is the designation for float datatype
		
		System.out.println(fraction);
		System.out.println(anotherFraction);
		
		boolean result = true;
		System.out.println(result);
		System.out.println(5<10);
		
		char literal = 'c';
		System.out.println(literal);
		
		char character = 21;            // any number assigned to a char will be converted to a character once printed
		System.out.println(character);
		
		String text = "Hello, students!";
		System.out.println(text);
		
		
		
		
		
	}

}
