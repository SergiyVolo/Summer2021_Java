package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercise3 {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.addAll(Arrays.asList(0, 2, 3, 4, 5, 6, 7, 8));

		System.out.println(numbers);

		Collections.swap(numbers, 6, numbers.size() - 1);// index of last number:
															// numbers.size()-1
		System.out.println(numbers);

	}

}
