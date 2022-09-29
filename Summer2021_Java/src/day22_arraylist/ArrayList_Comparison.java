package day22_arraylist;

import java.util.ArrayList;

public class ArrayList_Comparison {

	public static void main(String[] args) {
		
		
		ArrayList<Byte> bytes1 = new ArrayList<>();
		bytes1.add((byte)3);
		bytes1.add((byte)6);
		bytes1.add((byte)9);
		
		ArrayList<Byte> bytes2 = new ArrayList<>();
		bytes2.add((byte)3);
		bytes2.add((byte)6);
		bytes2.add((byte)9);
		
		System.out.println(bytes1 == bytes2);        // false
		System.out.println(bytes1.equals(bytes2));   // true
	}
}
