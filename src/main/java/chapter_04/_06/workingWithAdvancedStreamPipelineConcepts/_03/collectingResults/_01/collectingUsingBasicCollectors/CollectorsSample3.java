package chapter_04._06.workingWithAdvancedStreamPipelineConcepts._03.collectingResults._01.collectingUsingBasicCollectors;

import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsSample3 {
	public static void main(String[] args) {
		Stream<String> ohMy = Stream.of("lions","tigers","bears", "tigers", "tundras");
		TreeSet<String> result = ohMy.filter(s -> s.startsWith("t"))
									.collect(Collectors.toCollection(TreeSet::new));
		System.out.println(result);
	}
}
