package chapter_04._08.reviewQuestions._10;

import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[] args) {
		Stream.generate(() -> "1")
		.filter(x -> x.length()>1)
		.forEach(System.out::println)
		.limit(10);
		//.peek(System.out::println)
		;
	}
}
