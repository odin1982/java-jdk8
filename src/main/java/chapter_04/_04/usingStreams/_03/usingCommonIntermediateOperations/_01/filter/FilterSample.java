package chapter_04._04.usingStreams._03.usingCommonIntermediateOperations._01.filter;

import java.util.stream.Stream;

// Stream<T> filter(Predicate<? super T>predicate)
public class FilterSample {
	public static void main(String[] args) {
		Stream<String> s = Stream.of("monkey","gorilla","bonobo","bird");
		s.filter(element -> element.startsWith("m"))
		.forEach((element) -> System.out.println(element));
		
		System.out.println("-----");
		
		Stream<String> s2  = Stream.of("monkey","gorilla","bonobo","bird");
		s2.filter(element -> element.startsWith("b")).forEach(System.out::println);
	}
}
