package day19_stack_heap;

public class Date {
	
//  - Create a class Date	
//	- Variables: day, month, year.
//	- Generate getters and setters;
//	- Create a no-arg constructor that sets the date to 1/1/2021;
//	- Create a constructor that accepts day, month, year and assigns them to the instance variables;
//	- Create a method called toString() that returns a String and accepts no arguments and returns a date as a string in the following format: 3/5/2000
	
	/*
	 * - encapsulation
	 * - getters and setters
	 * - constructors
	 * 
	 */
	
	private byte day;
	private int month;
	private int year;
	
	public Date() {
		setDay((byte)1);
		setMonth(1);
		setYear(2021);
	}
	
	public Date(byte day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void congratulate(String name) {
		if(name.equals("Salam")) {
			System.out.println("Happy Birthday!");
		} else {
			System.out.println("Enjoy the food!");
		}
	}
	
	public byte getDay() {
		return day;
	}
	
	public void setDay(byte day) {
		this.day = day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public String toString() {
		String fullDate = month + "/" + day + "/" + year;
		return fullDate;
	}
}
