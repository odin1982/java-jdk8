package chapter_03_genericsAndCollections._07.reviewQuestions._03;

import java.util.ArrayDeque;

public class TestClass04 {
	public static void main(String[] args) {
		ArrayDeque<String> greetings = new ArrayDeque<String>();
		greetings.push("hello");
		greetings.push("hi");
		greetings.push("ola");
		greetings.pop();
		greetings.peek();
		
		while(greetings.peek() != null)
			System.out.println(greetings.pop());
	}
}
