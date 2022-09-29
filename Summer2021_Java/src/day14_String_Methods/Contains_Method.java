package day14_String_Methods;

public class Contains_Method {

	public static void main(String[] args) {
		
String str1 = "Manchester United won!";
		
		System.out.println(str1.contains("United"));    // true
		System.out.println(str1.contains("Tottenham")); // false
		
		boolean result = "Hello".contains("el");
		System.out.println(result);
	}

}
