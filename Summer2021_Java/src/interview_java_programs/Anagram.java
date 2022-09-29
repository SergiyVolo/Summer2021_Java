package interview_java_programs;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String word1 = "restful";
		String word2 = "fluster";

//		System.out.println(m1(word1, word2));
		System.out.println(m2(word1, word2));

	}

	public static boolean m1(String word1, String word2) {
		char[] array1 = new char[word1.length()];
		for (int i = 0; i < word1.length(); i++) {
			array1[i] = word1.charAt(i);
		}
		char[] array2 = new char[word2.length()];
		for (int i = 0; i < word2.length(); i++) {
			array2[i] = word2.charAt(i);
		}
		Arrays.sort(array1);
		Arrays.sort(array2);

		if (Arrays.equals(array1, array2)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean m2(String word1, String word2) {

		char[] array1 = word1.toCharArray();
		char[] array2 = word2.toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array2);
        if (Arrays.equals(array1, array2)) {
			return true;
		} else {
			return false;
		}

	}

}
