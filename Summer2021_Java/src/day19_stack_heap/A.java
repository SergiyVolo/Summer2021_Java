package day19_stack_heap;

public class A {
	
	private int num1;
	
	public A() {
		num1 = 5;
		System.out.println("The variable num1 has been initialized");
	}
	
	public A(int num1) {
		this();   // java, please execute the no-arg constructor in the same class
		this.num1 = num1;
	}
	
	public static void main(String[] args) {
		
//		A obj1 = new A();
//		System.out.println(obj1.num1);
//		
//		A obj2 = new A();
		
		A obj3 = new A(7);
		System.out.println(obj3.num1);
	}
}
