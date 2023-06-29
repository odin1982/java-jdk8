package chapter_03_genericsAndCollections._03.usingListSetsMapsQueues._01.commonCollectionsMethods._03.isEmptyAndSize;

import java.util.ArrayList;
import java.util.List;

/*
 * boolean isEmpty()
 * int size()
 */
public class Sample01 {
	public static void main(String[] args) {
		List<String> birds =  new ArrayList<>();
		birds.add("perico");
		birds.add("cardenal");
		birds.add("guacamaya");
		
		System.out.println(birds.isEmpty());
		System.out.println(birds.size());
		
		birds = new ArrayList<>();
		System.out.println(birds.isEmpty());
		
		birds = null;
		System.out.println(birds.isEmpty());
	}

}
