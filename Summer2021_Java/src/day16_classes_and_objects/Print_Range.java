package day16_classes_and_objects;

import java.util.Scanner;

public class Print_Range {

	public static void main(String[] args) {

		/*
		 * Write a program that accepts two numbers from a user,
		 * and prints the sum of all the even numbers in that range
		 * 
		 * Example: 5 - 15: -> 6 + 8 + 10 + 12 + 14 = 50
		 * 
		 * 1. Process the input of two numbers
		 * 2. Loop starting with the lowest number and go all the way towards the bigger number
		 * 3. Identify the even numbers
		 * 4. Get the sum of all the even numbers 
		 * 
		 */
	         int sum = 0;
			Scanner stdin = new Scanner(System.in);
			
			System.out.println("Please input the first number: ");
			int num1 = stdin.nextInt();
			
			System.out.println("Please input the second number: ");
			int num2 = stdin.nextInt();
			//         5          15
			for(int i = num1; i <= num2; i++) {
				if(i%2 == 0) {
					System.out.print(i + " ");
					sum += i;
				}
			}
			
			System.out.println("The sum of even numbers in that range is: " + sum);
			
			stdin.close();
	}
      
      
      

	}


