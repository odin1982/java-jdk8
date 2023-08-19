package chapter_03_genericsAndCollections._05.searchingAndSorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class SortRabbits3 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Fluffy","Hoppy");
		Comparator<String> c = Comparator.reverseOrder();
		int index = Collections.binarySearch(names, "Hoppy", c);
		System.out.println(index);
	}

}
