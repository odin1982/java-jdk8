package chapter_04._06.workingWithAdvancedStreamPipelineConcepts._03.collectingResults._02.collectingIntoMaps;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingMapsSample {
	public static void main(String[] args) {
		Stream<String> ohMy = Stream.of("lions","tigers","bears");
		Map<String,Integer> map = ohMy.collect(Collectors.toMap(s->s, String::length));
		System.out.println(map);
	}
}
