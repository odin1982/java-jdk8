package chapter_04._02.workingWithBuiltInFunctionalInterfaces._03.implementingPredicateAndBiPredicate;

import java.util.function.Predicate;

public class PredicateSample {
	public static void main(String[] args) {
		Predicate<String> p1 = (s) -> s.isEmpty();
		Predicate<String> p2 = String::isEmpty;
		
		boolean test = p1.test("Hola");
		System.out.println(test);
		
		boolean test2 = p2.test("");
		System.out.println(test2);
		
		Predicate<String> egg = s -> s.contains("egg");
		Predicate<String> brown = s -> s.contains("brown");
		
		Predicate<String> brownEggs = s -> s.contains("eggs") && s.contains("brown");
		Predicate<String> otherEggs = s -> s.contains("eggs") && !s.contains("brown");
		
		Predicate<String> brownEggs2 = egg.and(brown);
		Predicate<String> otherEggs2 = egg.and(brown.negate());
	}
}
