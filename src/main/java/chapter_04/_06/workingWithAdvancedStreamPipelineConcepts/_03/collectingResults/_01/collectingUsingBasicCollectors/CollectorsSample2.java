package chapter_04._06.workingWithAdvancedStreamPipelineConcepts._03.collectingResults._01.collectingUsingBasicCollectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsSample2 {
	public static void main(String[] args) {
		Stream<String> ohMy = Stream.of("lions","tigers","bears");
		double result = ohMy.collect(Collectors.averagingInt(String::length));
		System.out.println(result);
	}
}
