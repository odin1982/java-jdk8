package chapter_04._04.usingStreams._03.usingCommonIntermediateOperations._03.limitSkip;

import java.util.stream.Stream;

public class LimitSkipSample {
	public static void main(String[] args) {
		Stream<Integer> s = Stream.iterate(1, n -> n + 1);
		s.skip(5).limit(2).forEach(System.out::println);
	}
}
