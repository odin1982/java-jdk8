package chapter_07.concurrency._05.workingWithParrallelStream._03.processingParallelReductions._02.combiningResultsWithCollect;

import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Stream;

public class CombiningResultsWithCollectSample {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("w","o","l","f").parallel();
		SortedSet<String> set = stream.collect(ConcurrentSkipListSet::new,Set::add,Set::addAll);
		System.out.println(set);
	}
}
