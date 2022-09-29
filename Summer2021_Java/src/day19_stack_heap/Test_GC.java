package day19_stack_heap;

public class Test_GC {

	static int counterGC = 0;
	static int counterObj = 0;
	
	public static void main(String[] args) {
		
		int numOfRuns = 1_000_000;
		
		for(int i = 0; i < numOfRuns; i++) {
			System.out.println("Objects created up to this point: " + counterObj++);
			new Test_GC();
			System.gc(); // we are suggesting GC to start running
		}
		
		System.out.println("My estimated heap space is: " + (numOfRuns - counterGC));
	}
	
	// This method runs only when the object is being garbage collected
	protected void finalize() {
		System.out.println("Objects garbage collected at this point: " + counterGC++);
	}
}
