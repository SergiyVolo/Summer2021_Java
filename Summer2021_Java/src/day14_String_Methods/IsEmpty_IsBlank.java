package day14_String_Methods;

public class IsEmpty_IsBlank {

	public static void main(String[] args) {
		

		// isEmpty()
		String str1 = "Table";
		String str2 = "";
		String str3 = " ";  // contains space and tabs
		
		System.out.println(str1.isEmpty());
		System.out.println(str2.isEmpty());
		System.out.println(str3.isEmpty());
		
		System.out.println(str3.length());  // 1 - white space is still considered as a character
		
		// isBlank()
		System.out.println(str1.isBlank());
		System.out.println(str2.isBlank());
		System.out.println(str3.isBlank());
		
		boolean bool1 = str1.isEmpty();
		boolean bool2 = str2.isBlank();
		
		System.out.println(bool1 + " " + bool2);
		
		if(str1.isEmpty()) {
			System.out.println("It's empty");
		} else {
			System.out.println("String is not empty");
		}
		  

	}

}
