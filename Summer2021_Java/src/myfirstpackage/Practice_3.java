package myfirstpackage;

import java.util.Scanner;

public class Practice_3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
      
		
		
		System.out.println("Please enter first number :");
		double num1 = input.nextDouble();
		
		System.out.println("Please enter second number :");	
		double num2 = input.nextDouble();	
		
		double result = num1 * num2;
		
		System.out.println(num1 + " * " + num2 + " = "  + result);
				
		input.close();
	}

}
