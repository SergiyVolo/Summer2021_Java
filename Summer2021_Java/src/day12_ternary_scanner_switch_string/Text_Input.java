package day12_ternary_scanner_switch_string;

import java.util.Scanner;

public class Text_Input {

	public static void main(String[] args) {
		
          Scanner input = new Scanner(System.in);
		
		System.out.println("Please input the language you are studing: ");
		String language = input.nextLine();
		
		System.out.println("I'm studying " + language);
		
		input.close();

	}

}
