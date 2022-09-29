package practice;

public class StrBld {


	
	
	public static void main(String[] args) {
		
		final int AGE = 50;
		
		System.out.println(AGE);
		
		test(AGE);
		
		StringBuilder text = new StringBuilder();
		
		text.append("Good morning!");
		System.out.println(text);
		System.out.println(text.reverse());
		
	}
	
	public static int test(int num) {
		final int AGE = 10;
		System.out.println(AGE + 1);
		return num;
	}

}
