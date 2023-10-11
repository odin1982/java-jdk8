package chapter_04._04.usingStreams._03.usingCommonIntermediateOperations._07.peek;

import java.util.stream.Stream;

public class PeekSample {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("black bear","brown bear","grizzly");
		long count = stream.filter(s->s.startsWith("g")).peek(System.out::println).count();
		System.out.println(count);
	}
}
