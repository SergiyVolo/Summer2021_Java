package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Collection_Practice {

	public static void main(String[] args) {

		Cat cat1 = new Cat("Max", 1);
		Cat cat2 = new Cat("Raven", 2);
		Cat cat3 = new Cat("Pashtet", 3);
		Cat cat4 = new Cat("Murchik", 4);
		Cat cat5 = new Cat("Busya", 5);

		HashSet<Cat> cats = new HashSet<>();
		cats.add(cat1);
		cats.add(cat2);
		cats.add(cat3);
		cats.add(cat4);
		cats.add(cat5);

		System.out.println(cats);

		Iterator<Cat> iter = cats.iterator();

		while (iter.hasNext()) {
			Cat cat = iter.next();
			if (cat.age == 4) {
				System.out.println(cat.name);
				iter.remove();
			}
		}
		System.out.println(cats);

		ArrayList<Cat> restOfCats = new ArrayList<>(cats);
		System.out.println(restOfCats);

//	Since the initial capacity of HashSet is set to a default value of 16, our initial
//	HashSetis is 31.25% full. After removing one object our HashSet is 25% full.	
//	Since the initial capacity of ArrayList is set to a default value of 10,
//	our ArrayList is 40% full.
	}

}
