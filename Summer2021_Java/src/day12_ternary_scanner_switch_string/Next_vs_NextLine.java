package day12_ternary_scanner_switch_string;

import java.util.Scanner;

public class Next_vs_NextLine {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Input some text please: ");
		String text = input.nextLine();  // nextLine picks up the whole sentence 
//		String text = input.next();      // next picks up only one word
		
		System.out.println(text);
		
		input.close();

	}

}
