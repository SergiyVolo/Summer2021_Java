package interview_java_programs;

import java.util.ArrayList;

public class Extract_Numbers {

	// You have a string of numbers “1 2 3 4 5 6 7 8 9” extract all the numbers
	// that are divisible by 3

	public static void main(String[] args) {

		System.out.println(extract("1 2 3 4 5 6 7 8 9"));
	}

	public static ArrayList<Integer> extract(String text) {

		ArrayList<Integer> myNumbers = new ArrayList<>();

		for (int i = 0; i < text.length(); i++) {
			int num;
			try {
				num = Integer.parseInt(text.charAt(i) + "");
			} catch (Exception e) {
				continue;
			}
			if (num % 3 == 0) {
				myNumbers.add(num);
			}
		}
		return myNumbers;
	}
}
