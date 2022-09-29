package interview_java_programs;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String[] array = { "Salam", "Mohammad", "Mohammad", "Sergiy", "Owais", "Vian", "Baraa", "Salam", "Sergiy" };
		Set<String> names = new HashSet<>();

		for (int i = 0; i < array.length; i++)
			names.add(array[i]);
		System.out.println(names);

		int[] numbers = { 2, 4, 4, 4, 5, 0, 0, 14, 25, 0, 25, 4, 1, 7 };
		Set<Integer> newNumbers= new HashSet<>();

		for (int i = 0; i < numbers.length; i++)
			newNumbers.add(numbers[i]);
		System.out.println(newNumbers);

	}
}
