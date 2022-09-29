package day14_String_Methods;

public class Starts_Ends_With_Methods {

	public static void main(String[] args) {
		
String str1 = "Prime Tech School";
		
		System.out.println(str1.startsWith("Pr"));      // true
		System.out.println(str1.startsWith("Prime T")); // true
		System.out.println(str1.startsWith("pr"));      // false
		
		if(str1.startsWith("Tech")) {
			System.out.println("Yes, it starts with Prim");
		} else {
			System.out.println("No, it doesn't");
		}
		
		
		System.out.println(str1.endsWith("School"));
		System.out.println(str1.endsWith("SchoOl"));
		System.out.println(str1.endsWith("l"));
		
	}

}
