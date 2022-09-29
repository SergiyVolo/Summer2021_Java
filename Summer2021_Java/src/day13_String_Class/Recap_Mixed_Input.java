package day13_String_Class;

import java.util.Scanner;

public class Recap_Mixed_Input {

	public static void main(String[] args) {
		
Scanner stdin = new Scanner(System.in);
		
		System.out.println("Please enter your age: ");
		byte age = stdin.nextByte();   // 55
		
//		stdin.nextLine(); // shift it to the next line
		System.out.println("Please enter your name: ");
		String name = stdin.next();  // next() will automatically shift you to the next line
	
		System.out.println(name + " " + age);
		
		System.out.println("Please enter boolean: ");
		boolean result = stdin.nextBoolean();  // not case sensitive
		System.out.println(result);
		
		stdin.close();
		

	}

}
