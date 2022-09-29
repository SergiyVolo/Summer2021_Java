package day20_static_members;

public class ReverseString {
	
	/*
	 * - Create a method that accepts a String and returns the reversed string
	 * 
	 * - Set up Scanner in the main method 
	 * - Ask user to input a string
	 * - Call the method that you created and pass that string as a parameter
	 * - Print the reversed string to the console
	 * 
	 */
	
	public String reverseString(String str) {
		
		String reversedString = "";
		
		for(int i = str.length() - 1; i >= 0; i--) {
			reversedString = reversedString + str.charAt(i);
		}
		
		return reversedString;
	}

}

	


