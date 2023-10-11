package chapter_04._04.usingStreams._03.usingCommonIntermediateOperations._06.sorted;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortedSample {
	public static void main(String[] args) {
		Stream<String> s = Stream.of("brown-","bear-");
		s.sorted().forEach(System.out::print);
		
		System.out.println("\n--------");
		
		Stream<String> s2 = Stream.of("brown bear-","grizzly");
		s2.sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}
