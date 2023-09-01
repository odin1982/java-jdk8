package chapter_04._02.workingWithBuiltInFunctionalInterfaces._05.implementingUnaryOperatorAndBinaryOperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorSample {
	public static void main(String[] args) {
		UnaryOperator<String> u1 = s -> s.toUpperCase();
		UnaryOperator<String> u2 = String::toUpperCase;
		
		System.out.println(u1.apply("hola"));
		System.out.println(u2.apply("mundo"));
	}
}
