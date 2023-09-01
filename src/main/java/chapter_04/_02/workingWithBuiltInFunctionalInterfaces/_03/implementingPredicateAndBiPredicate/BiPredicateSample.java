package chapter_04._02.workingWithBuiltInFunctionalInterfaces._03.implementingPredicateAndBiPredicate;

import java.util.function.BiPredicate;

public class BiPredicateSample {
	public static void main(String[] args) {
		BiPredicate<String,String> b2 = (string,prefix) -> string.startsWith(prefix);
		BiPredicate<String,String> b3 = String::startsWith;
		
		System.out.println(b2.test("chicken", "ch"));
		System.out.println(b3.test("pollo", "po"));
	}
}
