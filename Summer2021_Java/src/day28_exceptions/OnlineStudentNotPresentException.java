package day28_exceptions;

public class OnlineStudentNotPresentException extends Exception {
	
	public OnlineStudentNotPresentException(String text) {
		super(text);
	}
}
