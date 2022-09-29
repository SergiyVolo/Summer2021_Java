package review_session7;

import java.util.Arrays;

public class Declaring_Initializaion_Arrays {
	public static void main(String[] args) {

		String name1 = "Ahmad";
		int name4 = 3;
		String name2 = "Dave";
		String name3 = "Catherine";

		String[] classmates = { "Ahmad", "Dave", "Catherine", "John" };
		System.out.println(Arrays.toString(classmates));

		double[] numbers = { 2.3, 3.4, 5.7, 'A', 2 };
		System.out.println(Arrays.toString(numbers));
		
		Object[] str = { "Ahmad", 12, 54 > 23 };
		System.out.println(Arrays.toString(str));

		// Declaring an Array

		String[] text; // preferred way
		float[] numericalValue;

		String str1[]; // works, not a preferred way of

		// Declaration and Initializtion of Arrays
		// specified length
		String[] text1 = new String[3];
		text1[0] = "class";
		text1[1] = "school";
		text1[2] = "Prime Tech";

		String[] SDET = new String[] {};
		String[] SDET1 = {};

		/*
		 * String = null int = 0 char= '' boolean = false double = 0.0 float = 0.0
		 */

//		int[] nums = new int[0];
//		nums[0] = 4;
//		System.out.println(Arrays.toString(nums));
//
//		for (int number : nums) {
//			System.out.println(number);
//		}

	}

}
