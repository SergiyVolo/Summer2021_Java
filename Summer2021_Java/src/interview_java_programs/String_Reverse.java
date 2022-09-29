package interview_java_programs;

public class String_Reverse {

	public static void main(String[] args) {
		
		// recursion 
		// when using recursion it's important to identify stopping condition
		
		String_Reverse obj1 = new String_Reverse();
//		obj1.method1();
		
		obj1.reverseString("Owais");
		
	}
	
	// causes StackOverflowError
	public void method1() {
		method1();
	} 

	// Example: "a" -> "a", null -> null
	// Example: "Owais" -> s  
	public void reverseString(String text) {
		
		if(text == null || text.length() == 1) {
			System.out.println(text);
			// we don't call method within itself here - stopping condition
		} else {
			System.out.print(text.charAt(text.length() - 1));      // siawO
			reverseString(text.substring(0, text.length() - 1));
		}
	}
}

