package interview_java_programs;

import java.util.HashMap;

public class CountChracter {

	public static void main(String[] args) {

		String text = "Good morning America!";
		System.out.println(countChracter(text));

	}

	public static HashMap<Character, Integer> countChracter(String text) {
		HashMap<Character, Integer> result = new HashMap<>();
		text = text.toLowerCase();

		for (int i = 0; i < text.length(); i++) {
			if (!result.keySet().contains(text.charAt(i))) {
				result.put(text.charAt(i), 1);
			} else {
				result.put(text.charAt(i), result.get(text.charAt(i)) + 1);
			}

		}
		return result;
	}

}
