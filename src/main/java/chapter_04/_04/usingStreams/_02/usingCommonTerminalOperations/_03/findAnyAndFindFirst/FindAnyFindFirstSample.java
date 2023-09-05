package chapter_04._04.usingStreams._02.usingCommonTerminalOperations._03.findAnyAndFindFirst;

import java.util.stream.Stream;

public class FindAnyFindFirstSample {
	public static void main(String[] args) {
		Stream<String> s = Stream.of("monkey","gorilla","bonobo");
		s.findAny().ifPresent(System.out::println);
	}
}
