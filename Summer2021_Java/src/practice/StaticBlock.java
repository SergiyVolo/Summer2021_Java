package practice;

public class StaticBlock {
	
	static {
		String text = "test";
		System.out.println("Runs first");
		System.out.println(text);
	}

	public static void main(String[] args) {
		
	}

}
