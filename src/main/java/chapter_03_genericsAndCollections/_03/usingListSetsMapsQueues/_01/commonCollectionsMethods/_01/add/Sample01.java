package chapter_03_genericsAndCollections._03.usingListSetsMapsQueues._01.commonCollectionsMethods._01.add;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/*
 * boolean add(E element)
 */

public class Sample01 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		System.out.println(list.add("Sparrow"));
		System.out.println(list.add("Sparrow"));
		
		Set<String> set = new HashSet<>(); 
		System.out.println(set.add("Sparrow"));
		System.out.println(set.add("Sparrow"));
	}
}
