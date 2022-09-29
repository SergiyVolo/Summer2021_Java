package day22_arraylist;

import java.util.ArrayList;

public class ArrayList_Practice {

	public static void main(String[] args) {
		
		ArrayList fruits = new ArrayList(); 
		fruits.add("Peach");
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add(2);
		fruits.add(false);
		fruits.add(2.5f);
		
		System.out.println(fruits.size());
		
		for(int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}
		
		// add()
		System.out.println(fruits);
		fruits.add("Orange");
		System.out.println(fruits);
		fruits.add(2, "Grapes");
		System.out.println(fruits);
		
		// set()
		fruits.set(1, "Cherry");
		System.out.println(fruits);
		
		// remove()
		fruits.remove(0);
		System.out.println(fruits);
		fruits.remove("Apple");
		System.out.println(fruits);
		
//		fruits.remove(12);  java.lang.IndexOutOfBoundsException
		System.out.println(fruits.remove("Mango"));  // gives us false, 
		                                            //  exception won't be given
		
		fruits.add(0, "Pineapple");
		System.out.println(fruits);
		fruits.remove(2);     // remove method prioritizes index over the object
		System.out.println(fruits);
		fruits.remove(2.0);
		System.out.println(fruits);
		fruits.remove(2);
		System.out.println(fruits);
		
		for(Object obj : fruits) { // object is the parent of all the classes in java
			System.out.println("element: " + obj);
		}
		
		
		/*
		 * Create an ArrayList called 'shoppingList' and include 5 items
         * print the number of items;
         * print them all in one line;  ? 
         * remove them all one by one
		 * 
		 */
		
		ArrayList shoppingList = new ArrayList();
		shoppingList.add("Games");
		shoppingList.add("Lemons");
		shoppingList.add("TV");
		shoppingList.add("OCA Guide");
		shoppingList.add("Enthuware Tests");
		shoppingList.add(5 > 3);
		shoppingList.add(10L);
		shoppingList.add(1);
		shoppingList.add(1.23);
		
		System.out.println("The number of items: " + shoppingList.size());
		
		System.out.println(shoppingList);
		
	// these are the ways to clear the ArrayLists.
//		shoppingList.remove(0);
//		shoppingList.remove(0);
//		shoppingList.remove(0);
//		shoppingList.remove(0);
//		shoppingList.remove(0);
//		shoppingList.remove(0);
//		shoppingList.remove(0);
//		shoppingList.remove(0);
//		shoppingList.remove(0);
		
//		shoppingList.remove(shoppingList.size() - 1);
//		shoppingList.remove(shoppingList.size() - 1);
//		shoppingList.remove(shoppingList.size() - 1);
//		shoppingList.remove(shoppingList.size() - 1);
//		shoppingList.remove(shoppingList.size() - 1);
//		shoppingList.remove(shoppingList.size() - 1);
//		shoppingList.remove(shoppingList.size() - 1);
//		shoppingList.remove(shoppingList.size() - 1);
		
//		shoppingList.clear();
//		shoppingList.removeAll(shoppingList);
		
		ArrayList shoppingList2 = new ArrayList();
		shoppingList2.add("OCA Guide");
		shoppingList2.add("Lemons");
		
		// similar to inner joins in SQL only the items that can be found in 
//		both shopping lists will be removed.
//		shoppingList.removeAll(shoppingList2);

		System.out.println(shoppingList);
		
		// Looping with regular for loop won't work because the ArrayList 
//		dynamically shrinks
//		for(int i = 0; i < shoppingList.size(); ) {
//			shoppingList.remove(i);
//			System.out.println(shoppingList);
//		}
		
		
		System.out.println(shoppingList.indexOf("OCA Guide"));  // this element is located under the index 3
		System.out.println(shoppingList.contains("Lemons"));    // true, checks if the element is in the ArrayList
		
	}
}
