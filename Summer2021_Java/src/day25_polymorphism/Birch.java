package day25_polymorphism;

public class Birch extends Plant {
	
	boolean isNice = true;
	
	public void grow(boolean isNice) {
		System.out.println("Birch is a nice tree!" + isNice);
	}
	    

}
