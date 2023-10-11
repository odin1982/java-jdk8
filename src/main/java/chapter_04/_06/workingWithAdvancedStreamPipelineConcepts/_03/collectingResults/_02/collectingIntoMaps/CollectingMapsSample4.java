package chapter_04._06.workingWithAdvancedStreamPipelineConcepts._03.collectingResults._02.collectingIntoMaps;

import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingMapsSample4 {
	public static void main(String[] args) {
		Stream<String> ohMy = Stream.of("lions","tigers","bears");
		TreeMap<Integer,String> map = ohMy.collect(Collectors.toMap(String::length,k->k,(s1,s2)->s1+","+s2,TreeMap::new));
		System.out.println(map);
		System.out.println(map.getClass());
	}
}
