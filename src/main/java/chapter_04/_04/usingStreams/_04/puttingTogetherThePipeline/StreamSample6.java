package chapter_04._04.usingStreams._04.puttingTogetherThePipeline;

import java.util.stream.Stream;

public class StreamSample6 {
	public static void main(String[] args) {
		Stream<Integer> infinite = Stream.iterate(1, x -> x+1);
		infinite.filter(x -> x%2 == 1)
			.peek(System.out::println)
			.limit(5)
			.forEach(System.out::println);
	}
}
