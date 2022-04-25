package org._18_.streams._01_.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsIntroduction {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("list: " + list);
		
		ArrayList<Integer> newList = new ArrayList<>();
		for(Integer i : list) {
			if(i >= 30) {
				newList.add(i);
			}
		}
		
		System.out.println("newList: " + newList);
		
		//Stream
		//filter
		List<Integer> l1 = list.stream().filter(i -> i >= 20).collect(Collectors.toList());
		System.out.println("l1: " + l1);
		
		//map
		List<Integer> l2 = list.stream().map(i -> i*2).collect(Collectors.toList());
		System.out.println("l2: " + l2);
		
		//count
		long cantidad = list.stream().filter(i -> i>=30).count();
		System.out.println("cantidad: " + cantidad);
		
		// default natural sorting: sorted()
		List<Integer> l3 = list.stream().sorted().collect(Collectors.toList());
		System.out.println("l3: " + l3);
		
		// custom sorting: sorted(Comparator c)
		List<Integer> l4 = list.stream().sorted((i1,i2) -> i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println("l4: " + l4);
	}
}

