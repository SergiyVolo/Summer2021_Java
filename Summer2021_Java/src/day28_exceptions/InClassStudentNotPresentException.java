package day28_exceptions;

public class InClassStudentNotPresentException extends RuntimeException {

	public InClassStudentNotPresentException(String text) {
		super(text);
	}
}

