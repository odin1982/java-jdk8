package chapter_04._06.workingWithAdvancedStreamPipelineConcepts._03.collectingResults._03.collectingUsingGroupingPartitioningAndMapping;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartioningSample {
	public static void main(String[] args) {
		Stream<String> ohMy = Stream.of("lions","tigers","bears");
		Map<Boolean,List<String>> map = ohMy.collect(Collectors.partitioningBy(s->s.length()<=5));
		System.out.println(map);
		
		System.out.println("----------");
		
		Stream<String> p2 = Stream.of("lions","tigers","bears");
		Map<Boolean,List<String>> map2 = p2.collect(Collectors.partitioningBy(s -> s.length() <= 7));
		System.out.println(map2);
		
		System.out.println("----------");
		
		Stream<String> p3 = Stream.of("lions","tigers","bears");
		Map<Boolean,Set<String>> map3 = p3.collect(Collectors.partitioningBy(s->s.length()<=7,Collectors.toSet()));
		System.out.println(map3);
		
		System.out.println("----------");
		
		Stream<String> p4 = Stream.of("lions","tigers","bears");
		Map<Integer,Long> map4 = p4.collect(Collectors.groupingBy(String::length,Collectors.counting()));
		System.out.println(map4);
		
		System.out.println("----------");
		
		Stream<String> p5 = Stream.of("lions","tigers","bears");
		Map<Integer,Optional<Character>> map5 = 
				p5.collect(Collectors.groupingBy(String::length,
						Collectors.mapping(s->s.charAt(0), Collectors.minBy(Comparator.naturalOrder()))));
		System.out.println(map5);
		
	}
}
