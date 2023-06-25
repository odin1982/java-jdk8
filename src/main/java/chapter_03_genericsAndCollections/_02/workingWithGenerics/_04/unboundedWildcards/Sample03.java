package chapter_03_genericsAndCollections._02.workingWithGenerics._04.unboundedWildcards;

import java.util.ArrayList;
import java.util.List;

public class Sample03 {
	public static void printList(List<?> list) {
		for(Object x : list) System.out.println(x);
	}
	
	public static void main(String[] args) {
		List<String> keywords = new ArrayList<>();
		keywords.add("java");
		printList(keywords);
	}

}
