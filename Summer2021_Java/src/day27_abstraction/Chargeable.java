package day27_abstraction;

public interface Chargeable {
	
	double TIMETOCHARGE = 1000;
	
	void charge();
	
	public static void superCharge() {
		System.out.println("Super charging");
	}
}
