package day12_ternary_scanner_switch_string;

public class Recap {

	public static void main(String[] args) {
		
int num1 = 4;
		
		// simple if statement
		if(num1 > 0) {
			System.out.println("num1 is positive");
		}
		
		// if - else
		if(num1 >= 0) {
			System.out.println("num1 is positive");
		} else {
			System.out.println("num1 is negative");
		}
		
		// if - else if - else: cascading/waterfalling process
		if(num1 == 0) {
			System.out.println("num1 is zero");
		} else if (num1 > 0) {
			System.out.println("num1 is positive");
		} else if (num1 < 0) {
			System.out.println("num1 is negative");
		} else {
			System.out.println("You didn't input a number");
		}
		
		System.out.println("=================================");
		
		// if - else without curly brackets
		// if there's only one statement following bool exp curly brackets can be ommited
		if (num1 >= 0) 
			System.out.println("num1 is positive");
		 else 
			System.out.println("num1 is negative");
			System.out.println("num1 is both positive and negative");
			
		System.out.println("Exit");
		
		// always use curly brackets in conditional statements to separate code blocks
		

	}

}
