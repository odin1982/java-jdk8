package chapter_04._08.reviewQuestions._06;

import java.util.stream.Stream;

public class StreamTest6 {
	public static void main(String[] args) {
		Stream<String> s = Stream.generate(() -> "meow");//infinite function
		boolean match = s.allMatch(t -> t.isEmpty());
		//boolean match = s.allMatch(String::isEmpty);
		//boolean match = s.anyMatch(String::isEmpty);
		//boolean match = s.findAny(String::isEmpty);
		//boolean match = s.findFirst(String::isEmpty);
		//boolean match = s.noneMatch(String::isEmpty);
		System.out.println(match);
	}
}
