package chapter_03_genericsAndCollections._07.reviewQuestions._03;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TestClass19 {
	public static void main(String[] args) {
		List<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(12);
		q.remove(1); //remove(int index)
		System.out.println(q);
		
		Queue<Integer> q2 = new LinkedList<>();
		q2.add(10);
		q2.add(12);
		q2.remove(1); //remove(Object o)
		System.out.println(q2);
	}
}
