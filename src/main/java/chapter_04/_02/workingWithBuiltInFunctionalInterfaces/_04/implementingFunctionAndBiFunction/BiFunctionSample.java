package chapter_04._02.workingWithBuiltInFunctionalInterfaces._04.implementingFunctionAndBiFunction;

import java.util.function.BiFunction;

public class BiFunctionSample {
	public static void main(String[] args) {
		BiFunction<String,String,String> b1 = String::concat;
		BiFunction<String,String,String> b2 = (string,toAdd) -> string.concat(toAdd);
		
		System.out.println(b1.apply("Hola ", "mundo"));
		System.out.println(b2.apply("Hello ", "world"));
	}
}
