package interview_java_programs;

import java.util.Arrays;

public class Max_Element_In_Array {

	// how to get the max element in array

	public static void main(String[] args) {

		int[] array = { 12, 0, 25, 125, 6, 10 };
		Arrays.sort(array);
		System.out.println(array[array.length-1]);
		
		
//		int max = array[0];
//
//		for (int i = 1; i < array.length; i++) {
//
//			if (array[i] > max) {
//
//				max = array[i];
//			}
//
//		}
//		System.out.println(max);

//		int[] array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		for (int i = 0; i < 10; i++) {
//			System.out.print(i + " ");
//			i++;
//		}
	}

}
