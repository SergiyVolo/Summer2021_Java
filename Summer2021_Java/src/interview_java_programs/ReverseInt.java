package interview_java_programs;

public class ReverseInt {

	public static void main(String[] args) {

//		Example: 123456 -> 654321 Reverse an integer

		int a = 123456789;
//		int num = 123456;

		// using StringBuffer
		long num2 = 123456;
		System.out.println(new StringBuffer(String.valueOf(num2)).reverse());

//		reverseInt(a);
		reverseNumber(a);

//		String numToStr = num + "";              //convert int to String
//		String numToStr = Integer.toString(num);//convert int to String
//		System.out.println(numToStr);
//		
//		for(int i=numToStr.length()-1; i >= 0; i--) {
//			System.out.print(numToStr.charAt(i));
//		}

//		System.out.println(numToStr);

	}

	public static void reverseInt(int num) {

		int reverseNum = 0;

		while (num != 0) {
			reverseNum = reverseNum * 10 + num % 10;
			num = num / 10;
		}

		System.out.println(reverseNum);
	}

	public static int reverseNumber(int a) {
		String aToStr = a + "";
		for (int i = aToStr.length() - 1; i >= 0; i--) {
			System.out.print(aToStr.charAt(i));

		}

		return a;

	}
}
