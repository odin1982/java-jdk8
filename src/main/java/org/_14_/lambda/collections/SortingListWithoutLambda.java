package org._14_.lambda.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingListWithoutLambda {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(5);
		list.add(0);
		list.add(3);
		list.add(11);
		System.out.println(list);
		
		Collections.sort(list,new MyComparator());
		System.out.println(list);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(100);
		list2.add(50);
		list2.add(0);
		list2.add(30);
		list2.add(110);
		Collections.sort(list2,(o1,o2) -> {return o2-o1;});
		System.out.println(list2);
	}
}

//descending order
class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}
	
}
