package day16_classes_and_objects;

import java.util.Scanner;

public class Print_Word {

	/*
	 * Ask user to input a word and then print each character on a separate line
	 * 
	 */
	
	// 01234
	// hello
		/*
		 * h
		 *   1
		 * e
		 *   12
		 * l
		 *   123
		 * l
		 *   1234
		 * o
		 *   12345
		 */
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input some text: ");
		String text = input.nextLine();
		
		for(int i = 0; i < text.length(); i++) {
			System.out.println(text.charAt(i));
			System.out.print("   ");
			
			for(int j = 0; j <= i; j++) {
				System.out.print(j + 1);
			}
			System.out.println();
		}
		
		input.close();
	}

}
