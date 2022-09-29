package interview_java_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class ArrayDuplicates {

	public static void main(String[] args) {

		// Hi guys this task is how to found duplicate in array
		// I used HashSet because no duplicate is allowed

		String[] array = { "Salam", "Mohammad", "Mohammad", "Sergiy", "Owais", "Vian", "Baraa", "Salam", "Sergiy" };

		HashSet<String> names = new HashSet<>();

		for (String name : array) {

			if (names.add(name) == false) {
				System.out.println("Found Duplicate: " + name);
			} else if (names.add(name) == true) {
				System.out.println("Not found Duplicate");
			}

		}

		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 6, 7));
		LinkedHashSet<Integer> link = new LinkedHashSet<Integer>(numbers);
		

		System.out.println(link);

		ArrayList<Integer> withoutDublicates = new ArrayList<Integer>(link);
		System.out.println(withoutDublicates);

	}
}
