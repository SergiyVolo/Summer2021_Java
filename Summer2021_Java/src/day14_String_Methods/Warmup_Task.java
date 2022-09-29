package day14_String_Methods;

import java.util.Scanner;

public class Warmup_Task {

	public static void main(String[] args) {
		
		
		/*
		 * 1. Declare a scanner class object
	     * 2. Ask a user to input first and last name separately
	     * 3. Declare a String variable called full name 
	     * 4. Concatenate first and last name and assign it to full name (space in between)
	     * 5. Display a total number of characters in the full name including the space
	     * 6. Output the initials: Elon Mask -> EM (make sure initials are in upper case)
	     * 7. Output the last letters of both names: Elon Mask -> nk 
		 */
		
		
		
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Please enter your first name: ");
			String firstName = input.next();
			
			System.out.println("Please enter your last name: ");
			String lastName = input.next();
			
			String fullName = firstName + " " + lastName;
			System.out.println(fullName);
			
			System.out.println("Total num of chars: " + fullName.length());
			
			
			char firstNameInitial = firstName.charAt(0);  // E
			char lastNameInitial = lastName.charAt(0);    // M
			
			String upperCaseInitials = ("" + firstNameInitial + lastNameInitial).toUpperCase();
			System.out.println("Initials are: " + upperCaseInitials);
			
			// 01234567
			// Mohammed Rashad 
			char firstNameEnd = firstName.charAt(firstName.length() - 1);  // E
			char lastNameEnd = lastName.charAt(lastName.length() - 1);    // M
		
			System.out.println("Last chars are: " + firstNameEnd + lastNameEnd);
			
			input.close();

}

	}		