package day19_stack_heap;

public class Stack_Overflow {

	public static void main(String[] args) {
		
		Stack_Overflow obj1 = new Stack_Overflow();
		obj1.infiniteLoop();
	}
	
	public void infiniteLoop() {
		System.out.println("Happy Holidays!");
		infiniteLoop();
	}
	
	/*
	 * infiniteLoop() method is being infinitely invoked from within itself - this produces enough stack
	 * frames to overflow the stack.
	 * 
	 * recursion - calling a method within itself
	 */
}
