package day23_inheritance;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_Practice {

	public static void main(String[] args) {
		
		ArrayList<String> furniture = new ArrayList<>();
		furniture.add("sofa");
		furniture.add("love seat");
		furniture.add("chair");
		furniture.add("arm chair");
		
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(128);
		nums.add(51);
		nums.add(124);
		
		System.out.println(nums);
		Collections.sort(nums);
		System.out.println(nums);
		
		int index = Collections.binarySearch(nums, 124);
		System.out.println(index);
		
		System.out.println(furniture);
		Collections.sort(furniture);
		System.out.println(furniture);
	}
}

