package day13_String_Class;

import java.util.Scanner;

public class String_Methods {

	public static void main(String[] args) {
		
//		String str1 = "Banana";
//		
//		System.out.println(str1.charAt(3));
//		
//		char char1 = str1.charAt(4);
//		System.out.println("The char that's located under index 4 is " + char1);
		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("Please enter your first name: ");
//		String firstName = input.nextLine();
//		
//		System.out.println(firstName.charAt(2));
//	
//		input.close();
//		
		String text1 = "Wednesday";
		String text2 = "Friday";
		
//		System.out.println(text1.length());
//		System.out.println(text2.length());
		
		int difference;
		difference = text1.length() - text2.length(); 
		
//		System.out.println(text1.length() > text2.length() ?  "Word 'Thursday' is longer than word 'Friday' by " + difference + " " + " letters" : "the opposite");
//		System.out.print("Thursday is a " + text1.length() + " " + "letters word and ");
//		System.out.println("Friday is a " + text2.length() + " " + "letters word.");

				boolean res = text1.length() > text2.length();
		System.out.println(res);
		
		
	}
}
