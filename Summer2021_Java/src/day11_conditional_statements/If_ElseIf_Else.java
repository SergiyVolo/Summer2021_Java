package day11_conditional_statements;

public class If_ElseIf_Else {

	public static void main(String[] args) {
		/*
		 * 
		 * Create the following Java program:
         *  • declare 4 numbers;
         *  • display which one is the smallest among them.
		 */
		
		int a = 3;
		int b = 5;
		int c = 1;
		int d = 0;
		
		if(a < b && a < c && a < d) {
			System.out.println("a is the smallest one");
		} else if (b < a && b < c && b < d) {
			System.out.println("b is the smallest one");
		} else if (c < a && c < b && c < d) {
			System.out.println("c is the smallest one");
		} else {
			System.out.println("d is the smallest one");
		}
		
		
		// determining if the number is even or odd
		int num1 = 7;
		
		if (num1 % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		
		// A triangle is valid if the sum of all the three angles is 
		// equal to 180 degrees. Write a program that declares three 
		// integers as angles and check whether a triangle is valid or not.
		
		double firstAngle = 60;
		double secondAngle = 60;
		double thirdAngle = 61;
		
		double sum = firstAngle + secondAngle + thirdAngle;
		
		if (sum == 180) {
			System.out.println("Congratulations, the triangle is valid!");
		} else {
			System.out.println("The triangle is not valid, the sum = " + sum);
		}
		
		/*
		 * Write a Java program to implement the following logic using if-else statement
         * a) if hour is less than 12 noon, it’s time for Breakfast
         * b) if hour is greater than or equal 12 noon but less than 2 pm, it’s time for Lunch
         * c) if hour is greater than or equal to 5 pm, it’s time for Dinner
		 * 
		 * 
		 */
		
		int time = 4;
		
		if(time > 4 && time < 12) {
			System.out.println("Breakfast");
		} else if (time >= 12 && time <= 14) {
			System.out.println("Lunch");
		} else if (time >= 17 && time <= 24) {
			System.out.println("Dinner");
		} else {
			System.out.println("The restaurant is closed");
		}
		
		boolean isPremiumCustomer;
		int nbooksPurchased = 12;
		int freeBooks = 0;;
		
		if (isPremiumCustomer = true && nbooksPurchased >= 5){
			freeBooks +=1;
			System.out.println("As a premium customer you get one free book!");
			
			} else if (isPremiumCustomer = true && nbooksPurchased >= 8) {
			freeBooks +=2;
			System.out.println("As a premium customer you get two free books!");
			
			} else if (isPremiumCustomer = false && nbooksPurchased >=7) {
			freeBooks +=1;
			System.out.println("As a regular customer you get one free book!");
			
			} else if (isPremiumCustomer = false && nbooksPurchased >= 12) {
			freeBooks +=2;
			System.out.println("As a regular customer you get two free books!");
			
			} else {
		      System.out.println("No free books!");
				
          }
         
		
		
		
	}

}
