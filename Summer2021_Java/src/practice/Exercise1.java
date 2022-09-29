package practice;

import java.util.Arrays;

public class Exercise1 {
	
	public static void main(String[] args) {
		
//1. write a program that can set the last element of the Integer arraylist to zero ex:
//	list = [1,2,3,4,5]; output: [1,2,3,4,0];
		int[] array = {1, 2, 3, 4, 5, 6, 7, 1};
		System.out.println(Arrays.toString(array));
		
		lastElement(array);
		System.out.println(Arrays.toString(array));
		}
	
	public static void lastElement(int[] array) {
		array[array.length - 1] = 0;  
	}
	

}
