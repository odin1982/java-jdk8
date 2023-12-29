package chapter_06.exceptionsAndAssertions.review._03.recognizingCommonExceptionTypes._01.runtimeExceptions._02.ArrayIndexOutOfBoundsException;

public class ArrayIndexOutOfBoundsExceptionSample {
	public static void main(String[] args) {
		int[] countsOfMoose = new int[3];
		System.out.println(countsOfMoose[4]);
	}
}
