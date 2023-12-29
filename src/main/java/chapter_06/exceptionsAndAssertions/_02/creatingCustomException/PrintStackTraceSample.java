package chapter_06.exceptionsAndAssertions._02.creatingCustomException;

public class PrintStackTraceSample {
	public static void main(String[] args) {
		try {
			throw new CannotSwimException();
		}catch(CannotSwimException e) {
			e.printStackTrace();
		}
	}
}
