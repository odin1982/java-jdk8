package chapter_03._03.usingListSetsMapsQueues._01.commonCollectionsMethods._03.isEmptyAndSize;

import java.util.ArrayList;
import java.util.List;

// boolean isEmpty()
// int size()
public class EmptySizeExample {
	public static void main(String[] args) {
		List<String> birds = new ArrayList<>();
		 birds.add("hawk");
		 birds.add("hawk");
		 birds.add("hawk");
		 birds.add("hawk");
		 birds.add("hawk");
		 birds.add("hawk");
		 
		 System.out.println(birds.isEmpty());
		 System.out.println(birds.size());
	}
}
