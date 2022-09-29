package day13_String_Class;

public class String_Comparison_Task {

	public static void main(String[] args) {
		
		/*
		 * Task: 
		 * 1. Create a String using String literal creation with the value "Java"
		 * 2. Create a String using object type creation with the value "Java"
		 * 3. Use two different ways to compare them an explain the result.
		 * 
		 */
		
		
		String text1 = "Java";  
		String text2 = new String("Java");
		
		System.out.println(text1 == text2);
		System.out.println(text1.equals(text2));
		

//		String str = "Java";  			  // String Pool
//		String str2 = new String("Java"); // Java Heap
//		
//		boolean result1 = str == str2; // false - checking if they are located
//		in the same memory slot
//		boolean result2 = str.equals(str2); // true - comparing textual values
//		
//		System.out.println(result1);
//		System.out.println(result2);
//	}

}

}