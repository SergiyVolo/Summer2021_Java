package interview_java_programs;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {

		m1();
	}

	public static void m1() {

		String word = "Stop";
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("Please enter a word: ");
			String text = input.nextLine();
			System.out.println("You entered " + text);
			if (text.equalsIgnoreCase(word)) {
				System.out.println("You entered \"" + word + "\" the program is closing.");
				break;
			}
		}
		input.close();
	}

}
