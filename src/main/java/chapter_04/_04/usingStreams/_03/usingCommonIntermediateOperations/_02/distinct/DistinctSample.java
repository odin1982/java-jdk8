package chapter_04._04.usingStreams._03.usingCommonIntermediateOperations._02.distinct;

import java.util.stream.Stream;

public class DistinctSample {
	public static void main(String[] args) {
		Stream<String> s = Stream.of("duck", "duck","duck","goose");
		s.distinct().forEach(System.out::println);
	}
}
