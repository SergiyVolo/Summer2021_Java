package day16_classes_and_objects;

public class Remove_Duplicate_Values {

	/*
	 * Create a program that will take a string and remove all the duplicate
	 * characters
	 * 
	 * Ex: "aabbcc" -> "abc"
	 * 
	 */

	public static void main(String[] args) {

		String text = "Good morning!";
		String noDuplicates = "";

		for (int i = 0; i < text.length(); i++) {
			if (!noDuplicates.contains("" + text.charAt(i))) {
				noDuplicates = noDuplicates + text.charAt(i);
			}
		}

		System.out.println(noDuplicates);
	}

}
