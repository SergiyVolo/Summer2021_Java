package day16_classes_and_objects;

import java.util.Scanner;

public class Continues_Input {

	public static void main(String[] args) {
		
		/*
		 * Write a program that asks user to input text until the word "Stop"
		 * has been inputted.
		 */
		
		
			
			Scanner input = new Scanner(System.in);

			while(true) {
				System.out.println("Please input some text, if you would like to stop - enter 'Stop' ");
				
				String text = input.nextLine();
				System.out.println("The text you entered is: " + text);
				
				if(text.equals("Stop")) {
					System.out.println("The input is stopped now!");
					break;
				}
			}
			
			input.close();

	}

}
