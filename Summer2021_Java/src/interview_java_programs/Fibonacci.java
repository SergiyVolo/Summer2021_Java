package interview_java_programs;

public class Fibonacci {

	public static void main(String[] args) {
		
		// 0,1,1,2,3,5,8,13 fibonacci sequence - each element is equal to the sum 
		//   of the previous two
		
		// print first 20 elements of the fibonacci sequence using arrays 
		int amount = 20;
		
		// creating an array of the size 20 and storing all the fibonacci numbers there
		long[] a = new long[amount];
		// first two elements don't need to be calculated
		a[0] = 0;  
		a[1] = 1;
		
// looping 20 times and using formula to determine the value of all the fibo numbers
		for (int i = 2; i < a.length; i++) {
			a[i] = a[i-2] + a[i-1]; 
		}
		
		// once we stored all the fibo numbers in an array we are printing that array
		for (long i : a) {
			System.out.println(i);
		}
	}
}

