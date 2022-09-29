package interview_java_programs;

import java.util.HashMap;
import java.util.Map;

public class CountTwoNumbers2 {

	public static void main(String[] args) {

		Integer[] nums = { 1, 1, 2, 3, 3, 4, 4, 5 };

		System.out.println(sumUnique(nums));

	}

	public static int sumUnique(Integer[] nums) {

		// setting up sum container
		int sum = 0;

		// setting up map to hold each number and its corresponding number of
		// occurrences
		Map<Integer, Integer> numOfOccur = new HashMap<>();

		// looping through array and getting the number of occurrences of each number
		for (Integer num : nums) {
			if (numOfOccur.containsKey(num)) {
				numOfOccur.put(num, numOfOccur.get(num) + 1);
			} else {
				numOfOccur.put(num, 1);
			}
		}

		// looping through map to see which numbers occurred only once and getting their
		// sum
		for (Integer key : numOfOccur.keySet()) {
			if (numOfOccur.get(key) == 1) {
				sum = sum + key;
			}
		}

		return sum;
	}

}
