package chapter_06.exceptionsAndAssertions.review._03.recognizingCommonExceptionTypes._01.runtimeExceptions._03.classCastException;

public class ClassCastExceptionSample {
	public static void main(String[] args) {
		String type = "moose";
		Object objeto = type;
		Integer number = (Integer)objeto;
	}
}
