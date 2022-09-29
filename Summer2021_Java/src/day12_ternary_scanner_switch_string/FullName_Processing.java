package day12_ternary_scanner_switch_string;

import java.util.Scanner;

public class FullName_Processing {

	public static void main(String[] args) {
		/* Write a program that asks user to enter 
		 * first name and then last name. The system 
		 * should display user’s full name.
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your first name: ");
		String firstName = input.nextLine();
		
		System.out.println("Please enter your last name: ");
		String lastName = input.nextLine();
		
		System.out.println("My name is: " + firstName+ " " + lastName);
		
		input.close();
		
		
		
		
		
		
		

	}

}
