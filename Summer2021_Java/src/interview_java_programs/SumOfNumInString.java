package interview_java_programs;

public class SumOfNumInString {

	public static void main(String[] args) {

		String text = "5618";
		System.out.println(m1(text));

	}

	public static int m1(String text) {
		int sum = 0;
		for (int i = 0; i < text.length(); i++) {
			int num = Integer.parseInt(text.charAt(i) + "");
			sum = sum + num;
		}
		return sum;
	}

}
