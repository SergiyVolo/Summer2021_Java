package interview_java_programs;

public class Fibo_Recursive {

	// 0,1,1,2,3,5,8,13 fibonacci sequence - each element is equal to the sum 
	//  of the previous two 
	
	// print the first n numbers of the fibonacci sequence using recursion
		public long fibonacci(long n) {
			if (n==0)
				return 0; // element zero doesn't need to be calculated and is 0
			else if (n==1)
				return 1; // element one doesn't need to be calculated and is 1
			else
				return fibonacci(n-1) + fibonacci(n-2); // each element is equal to 
			                                            //  the sum of the previous two
		}
		
		public static void main(String[] args) {
			
			Fibo_Recursive fr = new Fibo_Recursive();
			for (int i = 0; i < 20; i++) {
				System.out.println(fr.fibonacci(i) + " number " + i);
			}
		}
}
