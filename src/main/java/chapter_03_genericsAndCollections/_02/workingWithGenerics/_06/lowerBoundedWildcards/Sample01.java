package chapter_03_genericsAndCollections._02.workingWithGenerics._06.lowerBoundedWildcards;

import java.util.ArrayList;
import java.util.List;

public class Sample01 {
	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		strings.add("tweet");
		List<Object> objects = new ArrayList<Object>(strings);
		addSound(strings);
		addSound(objects);
	}
	
	public static void addSound(List<? super String> list) {
		list.add("quack");
	}
}
