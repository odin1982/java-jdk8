package chapter_03_genericsAndCollections._07.reviewQuestions._03;

import java.util.HashSet;
import java.util.Set;

public class TestClass24 {
	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		s.add("lion");
		s.add("tiger");
		s.add("bear");
		//s.forEach(() -> System.out.println(s));
		//s.forEach(s -> System.out.println(s));
		//s.forEach((s) -> System.out.println(s));
		//s.forEach(System.out.println(s));
		//s.forEach(System::out::println);
		//s.forEach(System.out::println);
	}
}
