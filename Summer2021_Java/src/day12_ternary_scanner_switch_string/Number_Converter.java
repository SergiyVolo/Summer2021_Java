package day12_ternary_scanner_switch_string;

import java.util.Scanner;

public class Number_Converter {

	public static void main(String[] args) {
		
		/*
		 * Task: ask user for a number from 1 to 5
		 * 
		 * Take that number, convert it to a textual form using switch (1 -> "One")
		 * and output to the console.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please give me a number from 1 to 5");
		int number = input.nextInt();
		
		switch (number) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
		break;
		case 5:
			System.out.println("Five");
		   break;
		   default:
		   System.out.println("Invalid number");
		
		}
		input.close();
		

	}

}
