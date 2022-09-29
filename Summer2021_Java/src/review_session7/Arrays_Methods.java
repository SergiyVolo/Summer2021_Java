package review_session7;

import java.util.Arrays;

public class Arrays_Methods {
	public static void main(String[] args) {
		
		// Arrays.toString()
		String [] cars = {"Toyota", "Nissan", "Honda"};
		System.out.println(Arrays.toString(cars));
		
		// Arrays.sort() -> sort out Ascending order, lexicographical order for strings 
		int[] nums = {34,-4, 1, 3};
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		String [] sports = {"Taekwandoo", "Bull fight","Karatae", "Swimming", "Boxing", "Chess" };
		Arrays.sort(sports);
		System.out.println(Arrays.toString(sports));
		
		// Arrays.binarySearch()
		String [] sport = {"Taekwandoo", "Bull fight","Karatae", "Swimming", "Boxing", "Chess" };
		Arrays.sort(sport);
		System.out.println(Arrays.toString(sport));
		System.out.println(Arrays.binarySearch(sport, "football"));
		
		int [] number1 = {1, 2, 4, 9};
		Arrays.sort(number1);
		System.out.println(Arrays.toString(number1));
		System.out.println(Arrays.binarySearch(number1, 5)); //-4
		
		// Arrays.equal(), element should be the same 2. sequence of the elements should be the same 
	
		String [] students = {"Sergiy", "Vian", "Salam", "Yuonus"};
		String [] student1 = {"Sergiy", "Vian", "Salam", "Yuonus"};
		String [] student2 = {"Hamza", "Halida", "Salam", "Yuonus"};
		
		String [] student3 = new String[] {"Hamza", "Halida", "Salam", "Yuonus"};
		
		System.out.println(Arrays.equals(students, student1)); // true
		System.out.println(Arrays.equals(students, student2)); // false
		
		System.out.println(Arrays.equals(student2, student3));
		
	
		
		// Arrays.copy() 
		
		String [] student = {"Hamza", "Halida", "Salam", "Yuonus"};
		String []copy = Arrays.copyOf(student, student.length);
		System.out.println(Arrays.toString(copy));
		
		// clone();
		String[] clone = student.clone();
		System.out.println(Arrays.toString(clone));
		
		
		
		
		
	}

}

