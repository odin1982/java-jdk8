package chapter_04._02.workingWithBuiltInFunctionalInterfaces._05.implementingUnaryOperatorAndBinaryOperator;

import java.util.function.BinaryOperator;

public class BinaryOperatorSample {
	public static void main(String[] args) {
		BinaryOperator<String> b1 = (string,toAdd) -> string.concat(toAdd);
		BinaryOperator<String> b2 = String::concat;
		
		System.out.println(b1.apply("Hola", " mundo"));
		System.out.println(b2.apply("Hola", " mundo"));
	}
}
