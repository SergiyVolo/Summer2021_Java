package interview_java_programs;

import java.util.Arrays;

public class CountDuplicates1 {

	public static void main(String[] args) {

		String text = "Hello my friend, my, my, my";
		
		String word = "my";
		System.out.println(m1(text, word));

	}

	public static int m1(String text, String word) {

		String newText = text.replaceAll(",", "");

		String[] array = newText.split(" ");
		
		System.out.println(Arrays.toString(array));

		int count = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i].equals(word)) {
				count++;
			}
		}
		return count;

	}
}
