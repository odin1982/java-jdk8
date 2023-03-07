package chapter_03._03.usingListSetsMapsQueues._01.commonCollectionsMethods._01.add;

import java.util.ArrayList;
import java.util.HashSet;

// boolean add(E element)
public class AddExample {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Sparrow");
		System.out.println("list: " + list);
		
		HashSet<String> set = new HashSet<>();
		boolean isAdded = set.add("Hola");
		System.out.println("isAdded: " + isAdded);
		System.out.println("set: " + set);
	}

}
