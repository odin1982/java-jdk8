package chapter_03_genericsAndCollections._06.additionsInJava8._01.usingMethodReferences;

import java.util.function.Predicate;

public class MethodReferencesSample02 {
	public static void main(String[] args) {
		Predicate<String> lambda3 = s -> s.isEmpty();
		Predicate<String> mref3 = String::isEmpty;
		
		boolean test = lambda3.test("hola");
		System.out.println(test);
		
		boolean test2 = mref3.test("");
		System.out.println(test2);
	}
}
