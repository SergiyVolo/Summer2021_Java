package day27_abstraction;

public interface Convertible {         // naming convention - adverbs
	
	public static final int TIMETOOPEN = 5; // full declaration
	int TIMETOCLOSE = 3;                    // shortened declaration
	
	public abstract void openRoof();   // full declaration
	void closeRoof();                  // shortened declaration
	
	public default void openRoofHalfway() {
		startOpening();
		finishOpening();
	}
	
	public static void showOff() {
		showOffinEastCost();
		showOffinHawaii();
	}
	
	private static void showOffinEastCost() {
		System.out.println("Driving with the roof open and sunglasses on");
	}
	
	private static void showOffinHawaii() {
		System.out.println("Accelarating and feeling wind on your face");
	}
	
	private void startOpening() {
		System.out.println("Start opening");
	}
	
	private void finishOpening() {
		System.out.println("Finish opening");
	}
}

