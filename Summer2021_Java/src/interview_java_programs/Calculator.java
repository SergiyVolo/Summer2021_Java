package interview_java_programs;

public class Calculator {
	
	
	int num = 100;
	
	public void calc (int num) {
	//   2 = 2 * 10;
		this.num = num * 10;
	}
	
	public void printNum() {
		System.out.println(num);
	}

	public static void main(String[] args) {
		
		Calculator obj = new Calculator();
		
		int age = 25;
		obj.calc(age);
		System.out.println(age);  // ? 25
		obj.printNum();
		
	}

}
