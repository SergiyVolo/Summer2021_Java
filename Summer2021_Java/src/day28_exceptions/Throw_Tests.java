package day28_exceptions;

public class Throw_Tests {

	public static void main(String[] args) throws InterruptedException {
		throwException();
	}
	
	public static void throwException() throws InterruptedException {
		m1();
	}
	
	public static void m1() throws InterruptedException {
		Thread.sleep(1000);
	}
}
