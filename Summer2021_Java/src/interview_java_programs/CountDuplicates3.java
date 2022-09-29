package interview_java_programs;

public class CountDuplicates3 {

	public static void main(String[] args) {

		String text = "my car is the best, my car doesn't run though, car and car is red, car with four wheel";
		System.out.println(m1(text, "is"));
	}

	public static int m1(String text, String word) {

		int counter = 0;
		while (text.contains(word)) {
			text = text.replaceFirst(word, "");
			counter++;
		}
		return counter;
	}

}
