package org._08_.collections.treeset;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;


public class _01_TreeSetDemo {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
//		TreeSet ts2 = new TreeSet(Comparator c);
		
		SortedSet s = new TreeSet();
		TreeSet ts3 = new TreeSet(s);
		
		HashSet hs = new HashSet();
		TreeSet ts4 = new TreeSet(hs);
		
		// All class in TreeSet must be Comparable
		TreeSet<Employee> ts5 = new TreeSet<Employee>();
		ts5.add(new Employee("John",3000));
	}

}
