package chapter_03_genericsAndCollections._07.reviewQuestions._03;

import java.util.TreeSet;

public class TestClass08 {
	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("one");
		tree.add("One");
		tree.add("ONE");
		System.out.println(tree.ceiling("On"));
	}
}
