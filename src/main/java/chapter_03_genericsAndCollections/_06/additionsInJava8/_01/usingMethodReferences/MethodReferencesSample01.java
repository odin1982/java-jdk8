package chapter_03_genericsAndCollections._06.additionsInJava8._01.usingMethodReferences;

import java.util.function.Predicate;

public class MethodReferencesSample01 {
	public static void main(String[] args) {
		String str = "abc";
		Predicate<String> p1 = str::startsWith;
		boolean test = p1.test("d");
		System.out.println(test);
	}
}
