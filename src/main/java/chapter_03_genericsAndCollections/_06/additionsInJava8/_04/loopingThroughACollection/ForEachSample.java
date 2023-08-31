package chapter_03_genericsAndCollections._06.additionsInJava8._04.loopingThroughACollection;

import java.util.Arrays;
import java.util.List;

public class ForEachSample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Annie","Ripley");
		list.forEach(c -> System.out.println(c));
		list.forEach(System.out::println);
	}
}
