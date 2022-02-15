package org._03_.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		List al2 = new ArrayList();
		ArrayList aList = new ArrayList(30);
		ArrayList aList1 = new ArrayList(al2);
		ArrayList<String> alString = new ArrayList<>();
		
		aList.add("John");
		aList.add(true);
		aList.add(10);
		
		System.out.println(aList);
		
		aList.remove(1);
		System.out.println(aList);
		
		aList.remove(new Integer(10));
		System.out.println(aList);
		
		System.out.println(aList.get(0));
	}
}
