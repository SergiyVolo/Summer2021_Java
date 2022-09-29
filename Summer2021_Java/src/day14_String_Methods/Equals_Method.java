package day14_String_Methods;

public class Equals_Method {
	
	public static void main(String[] args) {
		
		String str1 = "Java";
		String str2 = new String("java");
		
		System.out.println(str1.equals(str2)); // false
		
		String str3 = "Java";
		String str4 = new String("Java");
		
		System.out.println(str3.equals(str4)); // true
		
		boolean result = str3.equals(str4);
		System.out.println(result);
		
		
		System.out.println(str1.equalsIgnoreCase(str2));  // true
		
		System.out.println("Hello".equalsIgnoreCase("hELLo"));
		
	}

}
