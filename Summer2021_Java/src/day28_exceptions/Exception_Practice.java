package day28_exceptions;

public class Exception_Practice {

	public static void main(String[] args) {
		
			
		int[] nums = {3, 45, -2, 67, 45};
		
		System.out.println(nums[0]);
		System.out.println(nums.length);
		System.out.println(nums[4]);
		
		int i = 5;
		
		try {
			System.out.println(nums[i]);  // program crashes
		} catch (Exception e) {
			System.out.println("Element was > 4");
			System.out.println("Exception was caught");
		}
		
		
		System.out.println("This is the end of the program");
	}
}

