
package day33_interview_prep;

import java.util.Scanner;

public class SB {

	public static void main(String[] args) {

	// StringBuilder is the enhanced mutable version of a String

	/*
	 * constructors: - new StringBuilder(); sets initial capacity to 16 - new
	 * StringBuilder(int capacity); sets initial capacity to the provided value -
	 * new StringBuilder(String text); copies the passed String into SB - new
	 * StringBuilder(CharSequence cs); - will let us pass SB as a parameter and copy
	 * its contents
	 * 
	 * - load factor: 1 * - growth: (previous cap * 2) + 2
	 * 
	 * methods: - append(): adds text to the end of SB - toString(): converts SB to
	 * String - reverse(): reverses the SB - capacity(): gives you current capacity
	 * - charAt(): - indexOf(): - replace(): - etc..
	 * 
	 * 
	 * 
	 */

		StringBuilder sb = new StringBuilder(); // cap 16
		System.out.println(sb.capacity());

		sb.append("Hello");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.append("123456789abc");
		System.out.println(sb);
		System.out.println(sb.capacity());

		StringBuilder sb1 = new StringBuilder("Hello"); // 21
		System.out.println(sb1.capacity()); // 21

		System.out.println(sb1.reverse());

		StringBuilder sb2 = new StringBuilder("Java");
		sb2.append(" SE 6"); // Java SE 6
		sb2.replace(8, 9, "7");

		System.out.println(sb2);

	/*
	 * - set up a scanner - ask user to input a string - set up a separate method
	 * that accepts a string and returns reversed String (use SB to reverse it) -
	 * call the method with the string that user input via Scanner
	 */

		Scanner input = new Scanner(System.in);

		System.out.println("Please input some text: ");

		String text = input.nextLine();

		String reversedText = reverseStringForOwais1(text);
		System.out.println(reversedText);
		
		input.close();
		
	}

	private static String reverseStringForOwais1(String text) {
		StringBuilder sb = new StringBuilder(text);
		return sb.reverse().toString();
	}

	// StringBuffer - synchronized (good to use in Multi-Threaded environment)
	// version of StringBuilder
	//
	
}
