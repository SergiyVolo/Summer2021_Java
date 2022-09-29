package practice;

import java.util.ArrayList;

public class Exercise2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		System.out.println(nums);
		lastElement(nums);
      System.out.println(nums);
	}
	
	public static void lastElement(ArrayList<Integer> list) {
		  list.set((list.size()-1), 0);
	}

}
