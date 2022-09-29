package day23_inheritance;

import java.util.ArrayList;

public class Wrapper_Class_Practice {

	public static void main(String[] args) {
		
		Integer int1 = new Integer(5);
		
		Integer int2 = 125; 
		Double dbl1 = 5.9;
		Character char1 = 'A';
		
		System.out.println(int1 + int2); // 130
		System.out.println(int2 + dbl1); // 130.9
		
		/*
		 * - intValue(), doubleValue(), charValue() ... convert Wrapper into 
		 * a primitive
		 * - toString() - converts Wrapper to a String
		 * - valueOf() - converts primitive into a Wrapper
		 */
		
		System.out.println("this is primitive int: " + int2.intValue());
		System.out.println("this is primitive double: " + dbl1.doubleValue());
		
		System.out.println(int2.toString().length());
		
		System.out.println(Integer.valueOf("1452") - 2); // ?
		
		
		ArrayList elements = new ArrayList(); 
		elements.add("text");
		elements.add(-1);
		elements.add(1);
		elements.add(1);
		elements.add(true);
		
		System.out.println(elements);
		
		elements.remove(Integer.valueOf(1)); // passing Wrapper Class (object)
		
		System.out.println(elements);
		
		elements.remove(true);
		
		System.out.println(elements);
	}
}

