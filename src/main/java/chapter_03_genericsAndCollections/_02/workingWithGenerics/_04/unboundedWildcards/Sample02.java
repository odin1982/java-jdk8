package chapter_03_genericsAndCollections._02.workingWithGenerics._04.unboundedWildcards;

import java.util.ArrayList;
import java.util.List;

public class Sample02 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(new Integer(42));
		List<Object> objects = numbers;
		objects.add("forty two");
		System.out.println(numbers.get(1));
	}
}
