package day15_loops;

import java.util.Scanner;

public class Fix_Name {

	public static void main(String[] args) {
		
		/*
		 * Ask user to input the first name
		 * You need to make sure you output the name with the first letter being capitalized
		 * and all the subsequent letters in lower case
		 * 
		 * Example: John -> John; john -> John; jOhN - John;
		 * 
		 */
		
		
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Please input your first name: ");
			String firstName = scanner.next(); // Sabawoon
			
			String firstLetter = firstName.substring(0, 1);  // S
			String firstLatterCapitalized = firstLetter.toUpperCase();
			
			String secondPortion = firstName.substring(1);   // abawoon
			String secondPortionLowerCase = secondPortion.toLowerCase();
			
			System.out.println(firstLatterCapitalized + secondPortionLowerCase);
			
			scanner.close();
		
	}

}
