package day15_loops;

import java.util.Scanner;

public class Multiplication_Table {

	/*
	 * 5 * 1 = 5
	 * 5 * 2 = 10
	 * 5 * 3 = 15
	 * ....
	 * 5 * 9 = 45
	 * 
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("Please input a positive number: ");
		int num1 = stdin.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(num1 + " * " + i + " = " + num1 * i);
		}
		
		stdin.close();
			
		}
	}


