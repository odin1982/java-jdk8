package chapter_03_genericsAndCollections._07.reviewQuestions._03;

import java.util.ArrayList;
import java.util.List;

public class TestClass03 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("one");
		list.add("two");
		list.add(7);
		
		for(String s: list) {
			System.out.println(s);
		}
	}
}
