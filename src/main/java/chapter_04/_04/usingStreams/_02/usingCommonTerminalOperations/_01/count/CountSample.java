package chapter_04._04.usingStreams._02.usingCommonTerminalOperations._01.count;

import java.util.stream.Stream;

public class CountSample {
	public static void main(String[] args) {
		Stream<String> s = Stream.of("monkey","gorilla","bonobo");
		System.out.println(s.count());
	}
}
