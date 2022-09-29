package interview_java_programs;

import java.util.Arrays;

public class Split_String {

	public static void main(String[] args) {

//		split() - splits a given string into multiple parts based on 
//      the provided delimiter and returns an array

		String text = "Good morning America!";

		String[] array = text.split(" ");
		System.out.println(Arrays.toString(array));

	}

}
