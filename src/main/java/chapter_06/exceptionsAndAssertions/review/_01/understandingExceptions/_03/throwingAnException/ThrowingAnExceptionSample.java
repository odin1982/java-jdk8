package chapter_06.exceptionsAndAssertions.review._01.understandingExceptions._03.throwingAnException;

public class ThrowingAnExceptionSample {
	public static void main(String[] args) {
		String[] animals = new String[0];
		System.out.println(animals[0]);//java.lang.ArrayIndexOutOfBoundsException
	}
}
