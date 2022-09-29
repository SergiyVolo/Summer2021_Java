package interview_java_programs;

import java.util.ArrayList;

public class CountTwoNumbers {

	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(90);
		nums.add(12);
		nums.add(23);
		nums.add(1);
		nums.add(5);

		ArrayList<Integer> result = countTwoNumbers(nums, 13);
		System.out.println(result);

	}

	public static ArrayList<Integer> countTwoNumbers(ArrayList<Integer> nums, int target) {
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 0; i < nums.size(); i++) {
			for (int j = i + 1; j < nums.size(); j++) {
				if (nums.get(i) + nums.get(j) == target) {
					result.add(i);
					result.add(j);
				}
			}
		}
		return result;

	}

}
