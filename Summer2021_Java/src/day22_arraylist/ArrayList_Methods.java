package day22_arraylist;

import java.util.ArrayList;

public class ArrayList_Methods {
	
// Create a method that accepts an ArrayList and prints its elements to a console
	public static void printList(ArrayList<Integer> list) {
		
		for(int num : list) {
			System.out.println(num);
		}
	}
	
	// Create a method that accepts 5 chars, creates an ArrayList of these 
   //	chars and returns it back to us.
 public static ArrayList<Character> createList(char ch1, char ch2, char ch3, char ch4, char ch5) {
		
		ArrayList<Character> chars = new ArrayList<>();
		chars.add(ch1);
		chars.add(ch2);
		chars.add(ch3);
		chars.add(ch4);
		chars.add(ch5);
		
		return chars;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(5);
		nums.add(17);
		
		printList(nums);
		System.out.println(nums);
		
		ArrayList<Character> chars = createList('A', 'B', 'C', 'D', 'E');
		System.out.println(chars);
	}
}
