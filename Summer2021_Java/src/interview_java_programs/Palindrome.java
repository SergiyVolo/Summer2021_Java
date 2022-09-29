package interview_java_programs;

public class Palindrome {

//	  Check if the given String is a palindrome

	public static void main(String[] args) {

		String text1 = "WOW";
		String text2 = "Level";

		String reversed1 = "";
		String reversed2 = "";

		for (int i = text1.length() - 1; i >= 0; i--) {
			reversed1 = reversed1 + text1.charAt(i);

		}

		System.out.println(reversed1);

		for (int i = text2.length() - 1; i >= 0; i--) {
			reversed2 = reversed2 + text2.charAt(i);
		}

		System.out.println(reversed2);

		if (text1.equals(reversed1)) {
			System.out.println("True - the first string is a palindrome");
		} else {
			System.out.println("False - the first string is not a palindrome");
		}

		if (text2.equals(reversed2)) {
			System.out.println("True - the second string is a palindrome");
		} else {
			System.out.println("False - the second string is not a palindrome");
		}

	}

}
