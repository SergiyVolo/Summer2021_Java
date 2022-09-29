package interview_java_programs;

public class Reverse_String {

	public static void main(String[] args) {
		
		int[] array = new int[2];
		System.out.println(array[0]); //default value 0
		System.out.println(array[1]); //default value 0

		reverseStr("good morning");

	}

	public static String reverseStr(String text) {

		if (text == null || text.length() == 1) {
			System.out.println(text);
		} else {
			System.out.print(text.charAt(text.length() - 1));
			reverseStr(text.substring(0, text.length() - 1));
		}
		return text;

	}

}
