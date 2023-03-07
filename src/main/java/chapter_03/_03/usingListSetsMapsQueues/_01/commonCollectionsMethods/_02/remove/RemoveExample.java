package chapter_03._03.usingListSetsMapsQueues._01.commonCollectionsMethods._02.remove;

import java.util.ArrayList;
import java.util.List;

//boolean remove(Object object)
public class RemoveExample {
	public static void main(String[] args) {
		 List<String> birds = new ArrayList<>();
		 birds.add("hawk");
		 birds.add("hawk");
		 birds.add("hawk");
		 birds.add("hawk");
		 birds.add("hawk");
		 birds.add("hawk");
		 System.out.println(birds.remove("cardinal"));
		 System.out.println(birds.remove("hawk"));
		 System.out.println(birds.remove(3));
		 System.out.println(birds);
	}
}
