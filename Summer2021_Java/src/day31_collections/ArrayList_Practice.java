package day31_collections;

import java.util.ArrayList;

public class ArrayList_Practice {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>(); // initial capacity = 10
		list1.add("Mango"); // load factor = 0.75
		list1.add("Mango"); // growth rate = 50%
		list1.add("Mango");
		list1.add("Mango");
		list1.add("Mango");
		list1.add("Mango");
		list1.add("Mango"); // load factor * initial capacity = 7; We are creating 
		                    //   a new array of 15
							// elements and destroying the previous one

		// Constructor that accepts one int sets initial capacity to our desired value
		ArrayList<String> list2 = new ArrayList<>(25); // initial capacity = 25

		// Seed arraylist to pass as a parameter to another arraylist
		ArrayList<String> seedList = new ArrayList<>();
		seedList.add("Hello");
		seedList.add("Good morning");

		// Passing seed arraylist to initialize a new arraylist with seed elements
		ArrayList<String> list3 = new ArrayList<>(seedList); // initial capacity = 10
		System.out.println(list3);
	}

}
