package chapter_04._04.usingStreams._02.usingCommonTerminalOperations._02.minMax;

import java.util.Optional;
import java.util.stream.Stream;

public class MinMaxSample {
	public static void main(String[] args) {
		Stream<String> s = Stream.of("monkey","ape","bonobo");
		Optional<String> min = s.min((s1,s2) -> s1.length() - s2.length());
		min.ifPresent(System.out::println);
	}
}
