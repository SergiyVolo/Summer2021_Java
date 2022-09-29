package day12_ternary_scanner_switch_string;

import java.util.Scanner;

public class Largest_Number {

	public static void main(String[] args) {
		/*
		 * Write a program that asks user to enter three numbers and returns 
		 * the largest number.
		 * 
		 * 1. import Scanner
		 * 2. set up Scanner
		 * 3. prompt for user input for the first variables
		 * 4. store the input in the variable
		 * 5. prompt for user input for the second variables
		 * 6. store the input in the variable
		 * 7. prompt for user input for the third variables
		 * 8. store the input in the variable
		 * 
		 * 9. find the largest number using conditional statements
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the first number: ");
		 int firstNumber = input.nextInt();
		 
		 System.out.println("Please enter the second number: ");
		 int secondNumber = input.nextInt();
		 
		 System.out.println("Please enter the third number: ");
		 int thirdNumber = input.nextInt();
		 
		 if (firstNumber > secondNumber && firstNumber > thirdNumber) {
			 System.out.println(firstNumber + " is the biggest");
			 
		 } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
			 System.out.println(secondNumber + " is the biggest");
			 
		 } else if(thirdNumber > firstNumber && thirdNumber > secondNumber) {
			 System.out.println(thirdNumber + " is the biggest");
		 }
		 
		 input.close();
		 
		 
		 
	}

}
