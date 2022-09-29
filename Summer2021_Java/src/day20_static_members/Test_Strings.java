package day20_static_members;

import java.util.Scanner;

public class Test_Strings {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input a string: ");
		String text = input.next();
		
		ReverseString obj1 = new ReverseString();
		String reversedString = obj1.reverseString(text);
		
		System.out.println(reversedString);
		
		input.close();
	}
	
	// set up another class here
}
