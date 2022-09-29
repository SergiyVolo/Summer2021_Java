package day21_array_arraylist;

public class Days_Of_Week {

	public static void main(String[] args) {
		
		String[] daysOfWeek = new String[7];
		
		daysOfWeek[0] = "Monday";
		daysOfWeek[1] = "Tuesday";
		daysOfWeek[2] = "Wednesday";
		daysOfWeek[3] = "Thursday";
		daysOfWeek[4] = "Friday";
		daysOfWeek[5] = "Saturday";
		daysOfWeek[6] = "Sunday";
		
		System.out.println("Today is " + daysOfWeek[6]);
//		System.out.println("Today is " + daysOfWeek[12]);  // Exception because 
//		the size of array is 7
		
		int[] nums = new int[5];
		System.out.println(nums[3]);
//		nums[0] = "five";  arrays can only accept one data type 
		nums[0] = 34;
		nums[3] = 12;
		nums[4] = 5;
		
		System.out.println("The first element of nums array " + nums[0]);
		nums[0] = 6;
		System.out.println("The first element of nums array " + nums[0]);
		
		System.out.println("Yesterday was " + daysOfWeek[5]);
		System.out.println("Tomorrow is " + daysOfWeek[0]);
		
//		Create an array called numbers that can hold 6 integers
//		Assign different values for each index
//		Print the sum of the first and third element of the array
//		Print the product of the second and fourth elements of the array.
		
		int[] numbers = new int[7];
		numbers[0] = 5;
		numbers[1] = 13;
		numbers[3] = 2;
		numbers[4] = 11;
		numbers[5] = 16;
		numbers[0] = numbers[0]+2;
		System.out.println(numbers[0]);
		
		int sum = numbers[1] + numbers[3];
		int product = numbers[2] * numbers[4];
		
		System.out.println("The sum of the first and third elements is " + sum);
		System.out.println("The product of the second and fourth elements is " + product);
		
		System.out.println("The size of the 'numbers' array is " + numbers.length);
		
//		create an array named vegetables and initialize it with 5 vegetables;
//		print the length of this array;
//		print the last element;  try to make it dynamic!
//		assign the value of the third element to the second element
		
		
		String[] vegetables = new String[5];
		vegetables[0] = "tomato";
		vegetables[1] = "onion";
		vegetables[2] = "pumpkin";
		vegetables[3] = "cucumber";
		vegetables[4] = "celery";
		
		System.out.println("the length is " + vegetables.length);
		System.out.println(vegetables[vegetables.length - 1]);
		vegetables[2] = vegetables[3];
		
		System.out.println(vegetables[2]);
		System.out.println(vegetables[3]);
		
		//                       0   1   2    3   4   5   6
		int[] nums1 = new int[] {12, 34, 56, 71, 89, 78, 100};
		System.out.println(nums1.length);
		
		//              0  1    2  3   4
		int[] nums2 = {34, 67, 56, 0, -1};
		
	}
}
