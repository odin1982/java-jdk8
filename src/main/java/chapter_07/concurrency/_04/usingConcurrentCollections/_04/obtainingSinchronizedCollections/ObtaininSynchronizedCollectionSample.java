package chapter_07.concurrency._04.usingConcurrentCollections._04.obtainingSinchronizedCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ObtaininSynchronizedCollectionSample {
	public static void main(String[] args) {
		List<Integer> list = Collections.synchronizedList(new ArrayList<>(Arrays.asList(4,3,52)));
		synchronized(list) {
			for(int data:list)
				System.out.println(data + " ");
		}
	}
}
