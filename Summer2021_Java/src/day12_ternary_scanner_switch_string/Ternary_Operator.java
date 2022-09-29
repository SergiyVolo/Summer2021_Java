package day12_ternary_scanner_switch_string;

public class Ternary_Operator {

	public static void main(String[] args) {
		int FICO = 750;
		int minimum = 760;

//			if(FICO >= minimum) {
//				System.out.println("You are approved!");
//			} else {
//				System.out.println("Denied");
//			}

		// Ternary Operator
		System.out.println(FICO >= minimum ? "You are approved!" : "Denied");

		String result = FICO >= minimum ? "You are approved!" : "Denied";
		System.out.println(result);

		System.out.println(2 > 3 ? "five is bigger than 3" : "that's not the case");

		int average = 88;

		if (average >= 90 && average <= 100) {
			System.out.println("A");
		} else if (average >= 80 && average <= 89) {
			System.out.println("B");
		} else if (average >= 70 && average <= 79) {
			System.out.println("C");
		} else if (average >= 60 && average <= 69) {
			System.out.println("D");
		} else if (average >= 0 && average <= 59) {
			System.out.println("F");
		}

		// bool exp ? true result : false result
		String grade = average >= 90 && average <= 100 ? "A"
				: average >= 80 && average <= 89 ? "B"
						: average >= 70 && average <= 79 ? "C"
								: average >= 60 && average <= 69 ? "D"
										: average >= 0 && average <= 59 ? "F" : "Invalid input";
		System.out.println(grade);

		String grade1 = average >= 90 && average <= 100 ? "A"
				: average >= 80 && average <= 89 ? "B"
						: average >= 70 && average <= 79 ? "C"
								: average >= 60 && average <= 69 ? "D"
										: average >= 0 && average <= 59 ? "F" : "Invalid input";

	}
}
