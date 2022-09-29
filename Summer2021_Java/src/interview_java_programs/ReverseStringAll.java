package interview_java_programs;

public class ReverseStringAll {

	public static void main(String[] args) {

		// reverseString 1- using Recursion
		String text1 = "Hello!";
		reverseString(text1);

		// reverseString 2- StringBuilder
		String text2 = "Java";

		StringBuilder str = new StringBuilder(text2);
		System.out.println(str.reverse());

		// reverseString 3- forLoop
		String text3 = "Monday";

		for (int i = text3.length() - 1; i >= 0; i--) {
			System.out.print(text3.charAt(i));
		}
		
		System.out.println();
		
		// reverseString 4- StringBuffer
		String text4 = "Hooray";

		System.out.print(new StringBuffer(String.valueOf(text4)).reverse());

	}	

	public static void reverseString(String str) {

		if (str == null || str.length() == 1) {
			System.out.println(str);
		} else {
			System.out.print(str.charAt(str.length() - 1));
			reverseString(str.substring(0, str.length() - 1));
		}

	}
}
