package chapter_03_genericsAndCollections._06.additionsInJava8._06.computeIfPresent;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class ComputeIfPresentSample {
	public static void main(String[] args) {
		Map<String,Integer> counts = new HashMap<>();
		counts.put("Jenny", 1);
		
		BiFunction<String,Integer,Integer> mapper = (k,v) -> v+1;
		Integer jenny = counts.computeIfPresent("Jenny", mapper);
		Integer sam = counts.computeIfPresent("Sam", mapper);
		System.out.println(counts);
		System.out.println(jenny);
		System.out.println(sam);
	}
}
