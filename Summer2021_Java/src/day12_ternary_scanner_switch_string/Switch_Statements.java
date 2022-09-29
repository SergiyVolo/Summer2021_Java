package day12_ternary_scanner_switch_string;

import java.util.Scanner;

public class Switch_Statements {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
		
		System.out.println("Please input the day of the week: ");
		String day = input.next();
		
		switch(day) {
			default:
				System.out.println("Invalid day");
				break;
			case "Monday": 
				System.out.println("Monday - Funday!");
				break;
			case "Tuesday":
				System.out.println("Tuesday - Kitten Carousel");
				break;
			case "Sunday":
				System.out.println("Sunday - Scanner Day");
				break;
		}
		
		// break makes java exit the switch statement
		// if we don't have break -> the execution will cascade down 
		
		input.close();
		
		
		// boolean, long, float and double can't be used in switch statements
//		boolean bool1 = true;
//		
//		switch(bool1) {
//		
//		}
	}

}
