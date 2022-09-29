package interview_java_programs;

public class ToDelete {

	public static void main(String[] args) {

//		 Check if the given String is a palindrome
//		               01234
		String text = "Was it a car or a cat I saw";

		String reverseText = "";

		for (int i = text.length() - 1; i >= 0; i--) {
			reverseText = reverseText + text.charAt(i);
		}

		text = text.replaceAll("\\s", "");
//		text = text.replaceAll(".", "");
		reverseText = reverseText.replaceAll("\\s", "");

		System.out.println(reverseText);
		System.out.println(text);

		if (text.equalsIgnoreCase(reverseText)) {
			System.out.println("True - this string is palindrome");
		} else {
			System.out.println("False - this string is not palindrome");
		}

	}

}
