package day20_static_members;

public class Check_References {

	/*
	 * Which object and at what line will become eligible for GC?
	 * 
	 * new String("a"): 0 - eligible for GC
	 * new String("b"): 2
	 * 
	 */
	
	public static void main(String[] args) {
		
		String one, two;
		one = new String("a"); 
		two = new String("b");
		one = two;                 // new String("a") becomes eligible for GC
		System.gc();
		
		String three = one;        // no more objects will become eligible for GC
		one = null;                // no more objects will become eligible for GC
		
		// only one object will be eligible for GC
		// Which object and at what line will be GC'ed? - we don't know
	}
}
