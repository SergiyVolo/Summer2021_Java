package day14_String_Methods;

public class Replace_Method {

	public static void main(String[] args) {
		
		/* 
		 * replace()
		 * 	- accepts chars
		 *  - accepts Strings
		 * 
		 * 
		 */
		
		String str1 = "What a beautiful day (Oct 30) to go for a walk! day";
		
		System.out.println(str1.replace('a', '?'));
		
		String result = str1.replace('a', '?');
		System.out.println(result);
		
		System.out.println(str1.replace("day", "week"));
		System.out.println(str1.replace("30", "31"));
		
		
		System.out.println(str1.replaceFirst("a", "?"));
		System.out.println(str1.replaceFirst("day", "week"));
		
		

	}

}
