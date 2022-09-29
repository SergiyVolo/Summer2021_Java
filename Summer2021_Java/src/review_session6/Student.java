package review_session6;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Student {

	public static void main(String[] args) {
		/*
		 * Create a utility that will pick a random Prime Tech student.
		 */
		
		Map<Integer, String> students = new HashMap<>();
		students.put(1, "Kian");
		students.put(2, "Owais");
		students.put(3, "Ahmed");
		students.put(4, "Salam");
		students.put(5, "Rashad");
		students.put(6, "Sabawoon");
		students.put(7, "Sergiy");
		students.put(8, "Baraa");
		students.put(9, "Ahmed Loubani");
		students.put(10, "Gulpari");
		students.put(11, "Petch & Sasha");
		students.put(12, "Halida");
		students.put(13, "Rani");
		students.put(14, "Vian");
		
		Random rand = new Random();
		int randNum = rand.nextInt(14) + 1;
		
		System.out.println(students.get(randNum));
	}
}
