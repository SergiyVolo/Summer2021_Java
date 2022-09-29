package day15_loops;

public class Recap {

	public static void main(String[] args) {
		
        String str1 = "Apple";
		
//		System.out.println(str1.substring(2));
		
		String str2 = str1.substring(2);
		
		System.out.println(str2);  // ple
		System.out.println(str1);  // Apple
		
		String str3 = str2.toUpperCase(); // PLE
		
		System.out.println(str3);
		System.out.println(str1);  // Apple
	}

}
