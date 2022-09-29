package day19_stack_heap;

import java.util.ArrayList;

public class Memory_Management {

	
	/*
	 * This is our program to overflow Heap
	 * 
	 * Overflowing heap causes "OutOfMemoryError"
	 */
	
	public static void main(String[] args) {
		
		ArrayList<Memory_Management> list = new ArrayList<>();
		
		long startTime = System.currentTimeMillis();
		
		try {
			for(long i = 0; i < 1_000_000_000_000L; i++) {
				list.add(new Memory_Management());
			}
		} catch (Error e) {
			long endTime = System.currentTimeMillis();
			System.out.println("The time it took to overflow my heap is: " + (endTime - startTime));
		}
	}
}
