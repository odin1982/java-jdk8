package chapter_04._04.usingStreams._02.usingCommonTerminalOperations._07.collect;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectSample2 {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("w","o","l","f");
		TreeSet<String> set = stream.collect(TreeSet::new,TreeSet::add,TreeSet::addAll);
		System.out.println(set);
		
		Stream<String> s1 = Stream.of("w","o","l","f");
		TreeSet<String> set2 = s1.collect(Collectors.toCollection(TreeSet::new));
		System.out.println(set2);
		
		Stream<String> s2 = Stream.of("w","o","l","f");
		Set<String> set3 = s2.collect(Collectors.toSet());
		System.out.println(set3);
	}
}
