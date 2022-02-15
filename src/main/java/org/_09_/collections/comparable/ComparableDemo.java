package org._09_.collections.comparable;
import java.util.TreeSet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// Set don't duplicate elements
public class ComparableDemo {
	static final Logger log = LogManager.getLogger(ComparableDemo.class.getName());
	public static void main(String[] args) {
		TreeSet<Integer> data = new TreeSet<>();
		data.add(152);
		data.add(185);
		data.add(254);
		data.add(10);
		data.add(132);
		data.add(10);
		System.out.println(data);
		log.debug("data" + data);
	}

}

/**
 * 						-----------------152-----------------------
 * 						|										   |
 * 						10----							----------185--------
 * 						     |							|					|
 * 							132							154					254
 * 
 * 
 * 
 * 
 * 
 * 
 */
