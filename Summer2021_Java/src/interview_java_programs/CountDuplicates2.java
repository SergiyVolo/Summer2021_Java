package interview_java_programs;

public class CountDuplicates2 {

	public static void main(String[] args) {

		String text = "Hello - my friend, my-, my, my";
		String word = "my";
		System.out.println(m1(text, word));

	}

	public static int m1(String text, String word) {

		int count = 0;
		for (int i = 0; i < text.length() - 1; i++) {
			if (text.substring(i, i + 2).equals(word)) {
				count++;
			}
		}
		return count;

	}

}
