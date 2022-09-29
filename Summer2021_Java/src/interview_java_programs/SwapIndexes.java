package interview_java_programs;

import java.util.ArrayList;

public class SwapIndexes {
	
	//Write a method that accepts two numbers and reverses the elements 
	//of the ArrayList under those two indexes.

	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(4);
		nums.add(6);
		nums.add(1);
		nums.add(0);
		nums.add(5);
		System.out.println(nums);

		System.out.println(swapIndexes(nums, 2, 3));

	}

	public static ArrayList<Integer> swapIndexes(ArrayList<Integer> nums, int index1, int index2) {
		if (nums.size() == 0 || nums.size() == 1) {
			return nums;
		}
		int temp1 = nums.get(index1);
		int temp2 = nums.get(index2);
		nums.set(index1, temp2);
		nums.set(index2, temp1);
		return nums;

	}

}
