package practice;

public class SqrRoot {

	public static void main(String[] args) {

//		int num = 100;
//		for(int i = 1; i < num; i++) {
//			if(i*i==num) {
//				System.out.println(i);
//			}
//		}

		result(25);

	}
// works only for numbers that have whole number result 
	public static int result(int a) {

		for (int i = 1; i < a; i++) {
			if (i * i == a) {
				System.out.println("Square root of " + a + " is " + i);

			}
		}
		return a;

	}

}
