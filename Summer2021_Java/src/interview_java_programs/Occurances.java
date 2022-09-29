package interview_java_programs;

import java.util.HashMap;
import java.util.Map;

public class Occurances {

	public static void main(String[] args) {
		
		// Count the number of occurrences of each character in a String. 
		// Example: "Selenium WebDriver"  -> S - 1, e - 4, l - 1, etc..

		String text = "Selenium WebDriver";
		
		Map<Character, Integer> symbols = new HashMap<>();
		
		for(int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			
			if(!symbols.containsKey(letter)) {
				symbols.put(letter, 1);
			} else {
				int counter = symbols.get(letter);
				symbols.put(letter, ++counter);
			}
		}
		
		System.out.println(symbols);
	}
}

