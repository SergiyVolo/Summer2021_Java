package day14_String_Methods;

public class CompareTo_Method {

	public static void main(String[] args) {
		
		String str1 = "ABC";
		String str2 = "abc";
		
		// lexicographical comparison
		
		System.out.println(str1.compareTo(str2));
		
		// str1 < str2 -> negative
		// str2 < str1 -> positive
		// str1 == str2 -> zero
		
		System.out.println(str1.compareToIgnoreCase(str2));
		
		System.out.println("123".compareTo("1234"));
		
	}

}
