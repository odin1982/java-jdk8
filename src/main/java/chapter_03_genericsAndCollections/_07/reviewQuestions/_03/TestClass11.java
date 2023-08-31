package chapter_03_genericsAndCollections._07.reviewQuestions._03;

import java.util.HashMap;
import java.util.Map;

public class TestClass11 {
	public static void main(String[] args) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=1;i<=10;i++) {
			map.put(i,i*i);
		}
		System.out.println(map.get(4));
	}
}
