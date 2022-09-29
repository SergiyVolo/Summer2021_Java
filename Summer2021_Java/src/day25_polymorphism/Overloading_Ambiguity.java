package day25_polymorphism;

public class Overloading_Ambiguity {

	public void m1(int num) {
		System.out.println("Primitive int");
	}
	
	public void m1(short num) {
		System.out.println("Primitive short");
	}
	
	public void m1(byte num) {
		System.out.println("Primitive byte");
	}
	
	public void m1(double num) {
		System.out.println("Primitive double");
	}
	
	public void m1(long num) {
		System.out.println("Primitive long");
	}
	
	public void m1(Integer num) {
		System.out.println("Reference type int");
	}

	public void m1(Double num) {
		System.out.println("Reference type double");
	}
}
