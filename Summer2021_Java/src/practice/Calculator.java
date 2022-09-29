package practice;

public class Calculator {
	
	static {
		System.out.println("This runs first");
	}

	int num = 100;

	public void calc(int num) {
		this.num = num * 10;
           
	}

	public void printNum() {
		System.out.println(num);

	}

	public static void main(String[] args) {

		Calculator obj = new Calculator();
		obj.calc(2);
		obj.printNum();
		
		
	}

}
