package day14_String_Methods;

public class Concat_Method {

	public static void main(String[] args) {
		
		String str1 = "Good";
		String str2 = " Morning!";
		
		System.out.println(str1.concat(str2));
		
		String result = str2.concat(str1);
		System.out.println(result);
		
		
//		System.out.println(str1.concat(num1));  // won't compile
		// concat() can't concatenate string and a number
		
		System.out.println(str1.concat(" Afternoon!"));
		
		System.out.println("Hello " + true + 5 + 2.746389f);
		
		
		
	}
	
}
