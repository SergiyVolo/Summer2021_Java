package interview_java_programs;

public class CountN {

	public static void main(String[] args) {

		count(1);

	}

	public static void count(int n) {

		if (n == 11) {
			System.out.println("Done!");
		} else {
			System.out.println(n);
			n++;
			count(n);
		}

	}

}
