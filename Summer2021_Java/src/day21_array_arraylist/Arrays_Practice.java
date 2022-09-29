package day21_array_arraylist;

import java.util.Arrays;

public class Arrays_Practice {

	public static void main(String[] args) {
		
		String[] cars = {"Honda", "Toyota", "Ferrari", "Jeep", "Chevy"};
		
		// toString() method of the Arrays class lets us easily print an array 
        // to the console
		System.out.println(Arrays.toString(cars));
		
		
		// sort() - depending on the data type sorts either based on the numbers 
       //	or	lexicographically
		int[] nums = {23, 56, -1, 96, 10};
		
		Arrays.sort(nums); // sorting the array
		System.out.println(Arrays.toString(nums));
		
		Arrays.sort(cars); // sorting the cars array
		System.out.println(Arrays.toString(cars));
		
		// sort doesn't work with booleans
        //	boolean[] bools = {false, true, false, 5>3, true, 
        //	"Marat".equals("Good driver")};
        //	Arrays.sort(bools);
		
		// binarySearch() - returns the index of the given number in the sorted
        // array. Usage of the binarySearch() on
		// a non-sorted array will yield non-predictable results
		
		// must be sorted first before binarySearch() can be used
		int[] vars = new int[] {2, 5, 0, 7, 8};
		
		Arrays.sort(vars);
		System.out.println(Arrays.toString(vars));
		
		int index = Arrays.binarySearch(vars, 6);  // [0, 2, 5, 6, 7, 8] index = 3
		System.out.println(index);
		
		/*
		 * If the number is not in the array, java will look for a potential 
		 * position
		 * of that number in the sorted array, negate that potential index and 
		 * subtract one from it.
		 */
		
		
		// equals() method - returns true only if the length of both given arrays 
        //	is the same and the sequence of elements
		// and their values are the same as well.
		
		int[] nums1 = {0, 2, 4, 6, 8};
		int[] nums2 = {0, 2, 4, 6, 8};
		int[] nums3 = {8, 6, 4, 2, 0};
		
		System.out.println(Arrays.equals(nums1, nums2));
		System.out.println(Arrays.equals(nums1, nums3));
		
		
		// copyOf() - will create a copy of a given array up to a specified length
		
		double[] prices = {1.23, 4.67, 7.45, 8.09};
		
		double[] copy = Arrays.copyOf(prices, 10);
		
		System.out.println(Arrays.toString(copy));
		
		
		// clone() - will just copy the whole array
		double[] prices1 = {1.23, 4.87, 7.61, 8.09};
		
		double[] copy1 = prices1.clone();
		
		System.out.println(Arrays.toString(copy1));
		
	}
}

