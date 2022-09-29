package interview_java_programs;

import java.util.Arrays;

public class ExstractFromArray {

	public static void main(String[] args) {

		String[] array = { "John Smith", "Marry Ti Popins", "John F Smith", "Ann S Popins", "Henry Ford" };

//		for (int i = 0; i < array.length; i++) {
//			if (array[i].split(" ").length == 2) {
//				System.out.print(Arrays.toString(array[i].split(" ")));
//			}
//
//		}
//		
		for (String str : array) {

			if (str.split(" ").length == 2) {
				System.out.println(str);
			}

		}

	}

}
