package interview_java_programs;

public class ToDelete2 {

	public static void main(String[] args) {

		reverseStr("Morning");

	}

	public static String reverseStr(String text) {

		if (text == null || text.length() == 1) {
			return text;
		} else {
			System.out.print(text.charAt(text.length() - 1));
			reverseStr(text.substring(0, text.length() - 1));
		}

		return text;

	}

}
