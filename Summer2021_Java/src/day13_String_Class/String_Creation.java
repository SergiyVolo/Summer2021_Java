package day13_String_Class;

public class String_Creation {

	public static void main(String[] args) {
		
		
		// String literal creation
				String text1 = "Hello";  
				String text2 = "Good bye";
				// int num1 = 5;
				
				// Object type creation
				String text3 = new String("Apple");
				String text4 = new String("Watermelon");
				
				// Scanner input = new Scanner();
				
			/*
			 * Differences between String creation:
			 * 	- syntax;
			 * 	- String literal creation places Strings in String Pool
			 * 	- Object type creation places Strings in the Java Heap memory
			 * 
			 *  ==         - will be checking the slots of the memory that two 
			 *  strings occupy
			 * 	.equals()  - will be checking the values of two strings
			 */
				
				String str1 = "Java"; // String pool
				String str2 = "Java"; // String pool
				
				System.out.println(str1 == str2); // we are not occupying the 
				                                  //    same memory slots
				
				String str3 = new String("Python");
				String str4 = new String("Python");
				
				System.out.println(str3 == str4); //false - we are occupying
				                                  //   different memory slots
				
				System.out.println(str3.equals(str4));  // true - checking 
				                                        //   the value equality
				
				String text5 = "Hello";    // String Pool
				String text6 = "Hello";    // String Pool
				System.out.println(text5 == text6); // true
				
				String text7 = new String("Orange");
				String text8 = new String("Orange");
				
				System.out.println(text7 == text8);      // false -> occupying 
				                                         //   diff memory slots
				System.out.println(text7.equals(text8)); // true 
				                                         
				

	}

}
