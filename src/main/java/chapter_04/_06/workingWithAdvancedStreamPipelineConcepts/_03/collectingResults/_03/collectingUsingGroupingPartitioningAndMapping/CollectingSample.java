package chapter_04._06.workingWithAdvancedStreamPipelineConcepts._03.collectingResults._03.collectingUsingGroupingPartitioningAndMapping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingSample {
	public static void main(String[] args) {
		Stream<String> ohMy = Stream.of("lions","tigers","bears");
		Map<Integer,List<String>> map = ohMy.collect(Collectors.groupingBy(String::length));
		System.out.println(map);
	}
}
