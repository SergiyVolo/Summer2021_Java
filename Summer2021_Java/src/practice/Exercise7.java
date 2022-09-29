package practice;

import java.util.ArrayList;

public class Exercise7 {

	public static void main(String[] args) {

		System.out.println(extract("1 2 3 4 5 6 7 8 9"));

		String text = "Good morning!";

		for (int i = text.length() - 1; i >= 0; i--) {
			System.out.print(text.charAt(i));
		}

		reverseStr("Hello everybody!");

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
			if (num % 2 == 0) {

				myNumbers.add(num);
			}

		}
		return myNumbers;

	}

	public static String reverseStr(String text) {

		for (int i = text.length() - 1; i >= 0; i--) {
			System.out.print(text.charAt(i));
		}
		return text;
	}

}
