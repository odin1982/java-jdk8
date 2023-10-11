package chapter_04._06.workingWithAdvancedStreamPipelineConcepts._03.collectingResults._02.collectingIntoMaps;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingMapsSample2 {
	public static void main(String[] args) {
		Stream<String> ohMy = Stream.of("lions","tigers","bears");
		Map<Integer,String> map = ohMy.collect(Collectors.toMap(String::length, k -> k));
		System.out.println(map);
	}
}
