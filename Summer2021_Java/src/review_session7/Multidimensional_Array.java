package review_session7;

import java.util.Arrays;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class Multidimensional_Array {
	public static void main(String[] args) {

		int[][] nums = new int[3][4];
		nums[0][0] = 1;
		nums[0][1] = 2;
		nums[0][2] = 3;
		nums[0][3] = 4;

		nums[1][0] = 10;
		nums[1][1] = 20;
		nums[1][2] = 30;
		nums[1][3] = 40;

		nums[2][0] = 25;
		nums[2][1] = 30;
		nums[2][2] = 35;
		nums[2][3] = 40;

		System.out.println(nums[0][3]); // 4

//		for (int i =0; i<nums.length; i++) {
//			System.out.println();
//			for(int j=0; j<nums[i].length; j++) {
//				System.out.println(nums[i][j]);
//			}
//			
//		}

		System.out.println(Arrays.deepToString(nums));

		String[][] classmates = { { "Kian", "Ahmad", "Rashad" }, { "Owais", "Salam", "Sergiy" },
				{ "Halida", "Petch", "Vian", "Sasha" },

		};
		System.out.println(Arrays.deepToString(classmates));

		// Task
		// Build a multidimensional array of fruits; 3->Arrays each having 3 elements
		// inside
		// access the element of the row 3; column 3, and then make an analogy of
		// accessed element to the
		// element at row 1, column3 and make sure to print some "optional" statements
		// at the end of the analogy ?

		String[][] fruits = { { "Apple", "Mango", "Plum" }, { "Kiwi", "star fruit", "Cherry" },
				{ "Banana", "Lemon", "Orange" }, };
		System.out.println(fruits[2][2]);
		System.out.println(fruits[0][2]);

		if (fruits[2][2].equals(fruits[0][2])) {
			System.out.println("Hooray! Java is easy");
		} else {
			System.out.println("Java is easy, but needs practice");
		}

	}

}
