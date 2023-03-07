package chapter_03._03.usingListSetsMapsQueues._01.commonCollectionsMethods._05.contains;

import java.util.ArrayList;
import java.util.List;

public class ContainsExample {
	public static void main(String[] args) {
		List<String> birds = new ArrayList<>();
		birds.add("hawk");
		birds.add("hawk");
		System.out.println(birds.contains("hawk"));
		System.out.println(birds.contains("robin"));
	}
}
