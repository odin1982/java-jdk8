package chapter_04._04.usingStreams._02.usingCommonTerminalOperations._05.forEach;

import java.util.stream.Stream;

public class ForEachSample {
	public static void main(String[] args) {
		Stream<String> s = Stream.of("Monkey","Gorilla","Bonobo");
		s.forEach(System.out::println);
	}
}
