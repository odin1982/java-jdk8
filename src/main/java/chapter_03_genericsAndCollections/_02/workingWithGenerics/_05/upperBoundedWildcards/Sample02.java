package chapter_03_genericsAndCollections._02.workingWithGenerics._05.upperBoundedWildcards;

import java.util.List;

public class Sample02 {
	public static long total(List<? extends Number> list) {
		long count = 0;
		for(Number number: list) {
			count += number.longValue();
		}
		return count;
	}

}
