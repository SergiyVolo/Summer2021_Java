package day21_array_arraylist;

import java.util.Arrays;

public class Split_String {

	public static void main(String[] args) {
		
//      split() - splits a given string into multiple parts based on 
//       the provided delimiter and returns an array
		
		//               0   1   2   3    4   5  6      7
		String text = "Today is the best day to learn Java!";
		
		String[] splitArray = text.split(" ");
		System.out.println(Arrays.toString(splitArray));
		
		System.out.println(splitArray[0]);
		System.out.println(splitArray[1]);
		System.out.println(splitArray[2]);
		System.out.println(splitArray[4]);
		System.out.println(splitArray[7]);
		
		System.out.println(splitArray.length);
		
		
//      toCharArray() - breaks down a given string into chars and stores 
//		them in the char array
		
		String str1 = "Orange";
		char[] charArray = str1.toCharArray();
		
		System.out.println(charArray[0]);
		System.out.println(charArray[1]);
		
		// printing all the elements of the array
		for(int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i] + ", ");
		}
		
		System.out.println();
		
		for(int i = 0; i < splitArray.length; i++ ) {
			System.out.print(splitArray[i] + ", ");
		}
		
		
	}
}
