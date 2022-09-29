package day14_String_Methods;

public class Recap {

	public static void main(String[] args) {
		
		String str1 = "Good morning!";
		String str2 = "Good morning!";
		String str3 = new String("Good morning!");
		
		System.out.println(str1 == str2);  // true (same location in the memory, both are in String Pool)
		System.out.println(str1 == str3);  // false (different location in the memory)
		System.out.println(str2 == str3);  // false (different location in the memory)
		System.out.println(str1.equals(str2)); // true
		System.out.println(str1.equals(str3)); // true
		System.out.println(str2.equals(str3)); // true
		
		// Java is case-sensitive language!
		
		
		// charAt()
		//       index:012345
		String text = "Coffee";
		System.out.println(text.charAt(4)); // e
		
		char char1 = text.charAt(2);
		System.out.println(char1);
		
		
		// length() - returns the total number of characters in the String
		//              012345
		String text2 = "Donuts";
		System.out.println(text2.length()); // 6
		
		byte byte1 = 100;
		
		//       byte                  int
		byte lengthOfTheString = (byte)text2.length();
		System.out.println(lengthOfTheString);
	}

}
