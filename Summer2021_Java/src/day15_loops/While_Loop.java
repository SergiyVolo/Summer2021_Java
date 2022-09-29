package day15_loops;

public class While_Loop {

	public static void main(String[] args) {

		int counter = 0;

		// 5 < 5
		while (counter < 5) {
			System.out.println("Orange");
			counter++;
		}
		int k = 0;
		while (k < 88) {
			System.out.print('*');
			k++;
		}

		k = 0;
		int total = 0;
		while (k <= 4) {
			total += k * k;
			System.out.println(total);
			k++;
		}

	}

}
