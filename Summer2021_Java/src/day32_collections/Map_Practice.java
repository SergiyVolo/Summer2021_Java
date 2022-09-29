package day32_collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map_Practice {

	public static void main(String[] args) {
		
		System.out.println("Going to Safeway");
		
		//   Key   -  Value
		Map<String, Integer> shoppingList = new HashMap<>();
		shoppingList.put("tomatoes", 10);
		shoppingList.put("apples", 3);
		shoppingList.put("fish", 1);
		shoppingList.put("bread", 2);
		shoppingList.put("oranges", 5);
		
		System.out.println(shoppingList);
		System.out.println(shoppingList.size());
		
		System.out.println("How many tomatoes? " + shoppingList.get("tomatoes"));
		
		/*
		 * Create an employee salary map, put 5 records in. Print the size of the map.
		 * 
		 * Joel -> 120,000
		 * Joe -> 100,000
		 * 
		 */
		
		
		HashMap<String, Integer> salaries = new HashMap<>();
		salaries.put("Joel", 120_000);
		salaries.put("Joe", 140_000);
		salaries.put("Kian", 1_200_000);
		salaries.put("Owais", 108_743);
		salaries.put("Halida", 135_000);
		
		System.out.println(salaries);
		System.out.println(salaries.size());
		
		ArrayList<String> volunteers = new ArrayList<>();
		volunteers.add("Rashad");
		volunteers.add("Ahmed");
		
		System.out.println("Halida's future salary " + salaries.get("Halida"));
		
		
		Map<Integer, String> zipCodes = new HashMap<>();
		zipCodes.put(22152, "Springfield");
		zipCodes.put(22032, "Fairfax");
		zipCodes.put(20121, "Centreville");
		zipCodes.put(22191, "Woodbridge");
		
		System.out.println(zipCodes);
		
		if(zipCodes.containsKey(20121)) {
			System.out.println("Centreville is in the list");
		}
		
		boolean result1 = zipCodes.containsKey(22207);
		System.out.println(result1);
		
		if(zipCodes.containsValue("Fairfax")) {
			System.out.println("Faitfax is in the list");
		}
		
		boolean result2 = zipCodes.containsValue("Ashburn");
		System.out.println(result2);
		
		zipCodes.put(22152, "Woodbridge");  // this will overwrite the previous value associated with 22152
		System.out.println(zipCodes);
		
		if(!zipCodes.containsKey(22032)) {
			zipCodes.put(22032, "Vienna");  
		}
		
		
		Map<String, String> students = new HashMap<>();
		students.put("Student001", "John Doe");
		students.put("Student002", "Jane Doe");
		students.put("Student003", "Said Doe");
		
		System.out.println(students);
		
		System.out.println(students.keySet());
		System.out.println(students.values());
		System.out.println(students.entrySet());  // Entry class
		
		
		// Find the student ID for Said Doe:
		
		for(Entry<String, String> keyValuePair : students.entrySet()) {
			if(keyValuePair.getValue().equals("Said Doe")) {
				System.out.println(keyValuePair.getKey());
			}
		}
	}
}
