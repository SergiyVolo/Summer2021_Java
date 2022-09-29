package day31_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Set_Practice {

	public static void main(String[] args) {

		Set<String> furniture = new HashSet<>();
		furniture.add("Sofa");
		furniture.add("Love Seat");
		furniture.add("Chair");
		furniture.add("Table");
		furniture.add("Chair"); // duplicate value won't be allowed in the set
		furniture.add("Chair"); // any other duplicate values will be discarded as well
		furniture.add("Chair"); // any other duplicate values will be discarded as well

		System.out.println(furniture); // set is unordered and elements won't appear
										// in the order that they were placed in the set

		if (furniture.contains("Sofa")) {
			System.out.println("We have sofa");
		}

		furniture.remove("Table");
		System.out.println(furniture);

		/*
		 * - Create a set of fruits; - add 5 elements inside (at least two of them must
		 * be duplicates) - remove("Orange");
		 */

		Set<String> fruits = new HashSet<>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Grapes");
		fruits.add("Mango");
		fruits.add("Mango");

		System.out.println(fruits);

		System.out.println("The result of removing Orange: " + fruits.remove("Orange"));

		System.out.println(fruits.add("Orange")); // true
		System.out.println(fruits.add("Mango")); // false

		// both method add() and remove() return boolean corresponding to the success
		// of the operation

//		for(String fruit : fruits) {
//			System.out.println(fruit);
//			fruits.remove("Apple");    // ConcurrentModificationException
//		}						  // can't loop and remove elements using foreach loop

		System.out.println(fruits);

		// using iterator interface to loop through a collection
		// (allows concurrent modification)
		Iterator<String> iter = fruits.iterator();

// iter stores a reference pointing to a current element and can be moved to the next element with next()
// doesn't iterate in any particular order, just goes from one element to the next randomly
		while (iter.hasNext()) { // while there's still another element keep looping
			String fruit = iter.next(); // shift reference to the first element, retrieve it and store it in the String
										// variable
			if (fruit.equals("Orange")) {
				iter.remove(); // remove current element that the reference is pointing to
			}
		}

		System.out.println(fruits);

		Set<String> vehicles = new TreeSet<>();
		vehicles.add("Bus");
		vehicles.add("Car");
		vehicles.add("Truck");
		vehicles.add("SUV");
		vehicles.add("Bus");

		System.out.println(vehicles); // sorted in lexicographical order
	}
}
