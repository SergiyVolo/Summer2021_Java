package interview_java_programs;

public class StringNumericValue {

	public static void main(String[] args) {

		String text = "Sergiy";
		System.out.println(m1(text));

	}

	public static int m1(String text) {

		int sum = 0;
		for (int i = 0; i < text.length(); i++) {
			int num = Integer.valueOf(text.charAt(i));
			sum = sum + num;
		}
		return sum;
	}

}
