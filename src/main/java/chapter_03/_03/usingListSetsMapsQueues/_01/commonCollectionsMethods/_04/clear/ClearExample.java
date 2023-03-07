package chapter_03._03.usingListSetsMapsQueues._01.commonCollectionsMethods._04.clear;

import java.util.ArrayList;
import java.util.List;

public class ClearExample {
	public static void main(String[] args) {
		List<String> birds = new ArrayList<>();
		birds.add("hawk");
		birds.add("hawk");
		birds.clear();
		System.out.println(birds.isEmpty());
		System.out.println(birds.size());
	}

}
