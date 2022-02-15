package org._10_.collections.comparator;
import java.util.TreeSet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// Set don't duplicate elements
// Ther order will be in reverse
public class ComparatorDemo {
	static final Logger log = LogManager.getLogger(ComparatorDemo.class.getName());
	public static void main(String[] args) {
		TreeSet<Integer> data = new TreeSet<>(new MySorting());
		data.add(152);
		data.add(185);
		data.add(254);
		data.add(10);
		data.add(132);
		System.out.println(data);
	}

}
