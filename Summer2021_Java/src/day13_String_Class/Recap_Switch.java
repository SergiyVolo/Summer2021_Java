package day13_String_Class;

import java.util.Scanner;

public class Recap_Switch {

	public static void main(String[] args) {
		
		/*
		 * Write a program that takes a country as an input
		 * provide switch statement that would determine what the capital of that country is (3 options)
		 * use ternary operator to find out if there are more than 1 mil people live there
		 * > 1 mil -> "more than a mil"
		 * < 1 mil -> "less than a mil"
		 * 
		 */
		
		String country;
		String capital;
		int population;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input a country: ");
		country = input.next();
		
		switch(country) {
			case "USA":
				capital = "Washington, DC";
				population = 650_000;
				break;
			case "Jordan":
				capital = "Amman";
				population = 3_000_000;
				break;
			case "Iraq":
				capital = "Baghdad";
				population = 6_000_000;
				break;
			default:
				System.out.println("Invalid input");
				capital = "";
				population = 0;
				break;	
		}
		
		System.out.println("The capital is " + capital + ". Polulation is " + population);
		
		String result = population > 1_000_000 ? "population is greater than 1 mil" : "population is less than 1 mil";
		System.out.println(result);
		
		input.close();
		
	}

}
