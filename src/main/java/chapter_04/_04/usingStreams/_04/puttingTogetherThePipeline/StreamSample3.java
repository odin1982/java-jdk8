package chapter_04._04.usingStreams._04.puttingTogetherThePipeline;

import java.util.stream.Stream;

public class StreamSample3 {
	public static void main(String[] args) {
		Stream<Integer> infinite = Stream.iterate(1, x -> x+1);
		infinite.limit(5)
			.filter(x -> x%2 == 1)
			.forEach(System.out::println);
	}
}
