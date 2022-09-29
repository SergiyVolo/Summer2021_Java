package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exercise6 {

	public static void main(String[] args) {

		String[] names = { "Tom", "Steve", "John" };
		for (String var : names)
			System.out.print(var + " ");

		System.out.println(Arrays.toString(names));

		for (int i = 1; i <= 10; i++) {
			System.out.println(i * i);
		}
		System.out.println("------------------------------");

		int sum = 0;
		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);

		System.out.println("------------------------------");

//		Write a program that calculates the sum of even numbers between 0 and 20 
//		using while loop.

		int total = 0;
		int i = 0;
		while (i <= 20) {
			if (i % 2 == 0) {
				total += i;
			}
			i++;
		}
		System.out.println(total);

		String text = "Good morning, Luda!";
		int num = 0;
		while (num < 5) {
			System.out.println(text);
			num++;
		}

		String[] employees = new String[3];
		employees[0] = "Steve";
		employees[1] = "Sam";
		employees[2] = "Samuel";

		System.out.println(Arrays.toString(employees));

		for (int j = 0; j < employees.length; j++) {
			System.out.println(employees[j]);
		}

		for (String k : employees)
			System.out.println(k + " ");

		String[][] fruits = { { "Apple", "Grape", "Orange" }, { "Peach", "Fruit", "Mango" },
				{ "Fruit2", "Pear", "Appricot" }, };
		System.out.println(fruits[2][2]);
		System.out.println(fruits[0][2]);
		System.out.println(fruits.toString());
		System.out.println(Arrays.deepToString(fruits));

	}
}
