package interview_java_programs;

public class Occurances2 {

	public static void main(String[] args) {

		String text = "Good morning";
		System.out.println(m1(text, 'o'));

	}

	public static int m1(String text, char letter) {

		int counter = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == letter) {
				counter++;
			}
		}

		return counter;

	}

}
