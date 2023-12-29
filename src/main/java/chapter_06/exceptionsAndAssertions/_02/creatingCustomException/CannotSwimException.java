package chapter_06.exceptionsAndAssertions._02.creatingCustomException;

public class CannotSwimException extends Exception{
	public CannotSwimException() {
		super();
	}
	
	public CannotSwimException(Exception e) {
		super(e);
	}
	
	public CannotSwimException(String message) {
		super(message);
	}
}
