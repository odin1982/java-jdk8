package chapter_06.exceptionsAndAssertions.review._03.recognizingCommonExceptionTypes._01.runtimeExceptions._04.IllegalArgumentException;
// Se usa por lo general cuando quieres validar un parametro introducido y no es legal.
public class IllegalArgumentExceptionSample {
	public static void main(String[] args) {
		setNumberEggs(-1);
	}
	
	public static void setNumberEggs(int numberEggs) {
		if(numberEggs < 0) {
			throw new IllegalArgumentException("# eggs must not be negative");
		}
		System.out.println("numberEggs: " + numberEggs);
	}
}
