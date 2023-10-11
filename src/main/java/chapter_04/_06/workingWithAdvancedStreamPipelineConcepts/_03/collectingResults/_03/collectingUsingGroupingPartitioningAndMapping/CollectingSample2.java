package chapter_04._06.workingWithAdvancedStreamPipelineConcepts._03.collectingResults._03.collectingUsingGroupingPartitioningAndMapping;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingSample2 {
	public static void main(String[] args) {
		Stream<String> ohMy = Stream.of("lions","tigers","bears","tigers");
		Map<Integer,Set<String>> map = ohMy.collect(Collectors.groupingBy(String::length,Collectors.toSet()));
		System.out.println(map);
		
		
		Stream<String> ohMy2 = Stream.of("lions","tigers","bears","tigers");
		TreeMap<Integer,Set<String>> map2 = ohMy2.collect(Collectors.groupingBy(String::length,TreeMap::new,Collectors.toSet()));
		System.out.println(map2);
		
		Stream<String> ohMy3 = Stream.of("lions","tigers","bears","tigers");
		TreeMap<Integer,List<String>> map3 = ohMy3.collect(Collectors.groupingBy(String::length,TreeMap::new,Collectors.toList()));
		System.out.println(map3);
	}
}
