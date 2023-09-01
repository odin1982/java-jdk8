package chapter_04._02.workingWithBuiltInFunctionalInterfaces._04.implementingFunctionAndBiFunction;

import java.util.function.Function;

public class FunctionSample {
	public static void main(String[] args) {
		Function<String,Integer> f1 = x -> x.length();
		Function<String,Integer> f2 = String::length;
		
		System.out.println(f1.apply("Hola"));
		System.out.println(f2.apply("Futbol"));
		
	}
}
