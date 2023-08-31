package chapter_03_genericsAndCollections._07.reviewQuestions._03;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestClass21 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("1","2","3");
		Iterator iter = list.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
	}
}
