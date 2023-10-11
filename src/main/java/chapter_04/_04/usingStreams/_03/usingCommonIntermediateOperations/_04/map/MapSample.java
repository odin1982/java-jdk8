package chapter_04._04.usingStreams._03.usingCommonIntermediateOperations._04.map;

import java.util.stream.Stream;

public class MapSample {
	public static void main(String[] args) {
		Stream<String> s = Stream.of("monkey","gorilla","bonobo");
		s.map(element -> element.length()).forEach(System.out::print);
	}
}
