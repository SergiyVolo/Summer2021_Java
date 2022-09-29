package day32_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collections_Practice {

//	Create class "Cat" with two instance variables: name and age, one constructor that accepts both name and age, and assigns their values to instance variables, override toString() method to output name and age of the cat;
//	Create class Collections_Practice with the main method;
//	Declare and instantiate 5 cat objects (come up with names yourself, each cat is one year older than the other: first - 1 y.o., second - 2 y.o., third - 3 y.o etc...)
//	Declare and instantiate a HashSet of cats and store 5 cats there;
//	While iterating through collection find the cat that is 4 y.o., print its name and remove it from the HashSet;
//	Print the HashSet to the console;
//	Store all the remaining cats in the ArrayList (use constructor);
//		- no arg: initial capacity = 10;
//	    - int: initial capacity = 25
//      - Collection c: migrate all the elements into a new arraylist
//	Determine the capacity of both HashSet and ArrayList;
//	Print the ArrayList;
	
	public static void main(String[] args) {
		
		Cat cat1 = new Cat("Fluffy", 1);
		Cat cat2 = new Cat("Said", 2);
		Cat cat3 = new Cat("Orange", 3);
		Cat cat4 = new Cat("Peanut", 4);
		Cat cat5 = new Cat("Keki", 5);
		
		Set<Cat> cats = new HashSet<>();
		cats.add(cat1);
		cats.add(cat2);
		cats.add(cat3);
		cats.add(cat4);
		cats.add(cat5);
		
		System.out.println(cats);
		
		Iterator<Cat> iter = cats.iterator();
		
		while(iter.hasNext()) {
			Cat cat = iter.next();
			if(cat.age == 4) {
				System.out.println(cat.name);
				iter.remove();
			}
		}
		
		System.out.println(cats);
		
		ArrayList<Cat> catAL = new ArrayList<>(cats);
		System.out.println(catAL);
		
		
	}
}

