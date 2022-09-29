package day32_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set_Task {

	// print unique characters in the string and show how many duplicates were removed
	// Example: String text = "texttextabc" -> "texabc" (5 chars removed)
	// Hint: use Set!
	
	public static void main(String[] args) {
		
		String text = "texttextabc";
		
		Set<Character> chars = new HashSet<>();
		
		int counter = 0;
		
		for(int i = 0; i < text.length(); i++) {
			if(!chars.add(text.charAt(i))) {
				counter++;
			}
		}
		
		System.out.println(chars);
		System.out.println(counter);
		
		System.out.println(new HashSet<String>(Arrays.asList(text.split(""))));
	}
}
