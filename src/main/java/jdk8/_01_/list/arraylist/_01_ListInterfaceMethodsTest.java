package jdk8._01_.list.arraylist;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Como List es una interface no se puede instanciar, se probara con una ArrayList
 * que es una clase que implementa la interface List.
 * */

public class _01_ListInterfaceMethodsTest {
	private static final Logger LOG = LogManager.getLogger(_01_ListInterfaceMethodsTest.class);
	private static List<Integer> list = new ArrayList<>();
	private static List<Integer> list2 = new ArrayList<>();
	public static void main(String[] args) {
		LOG.info("Method add(E e): ");
		addElementsToList();
		LOG.info("list -> " + list);
		
		LOG.info("Method add(int index, E element): ");
		list.add(1,100000);
		LOG.info("list -> " + list);
		
		list2.add(21);
		list2.add(22);
		list2.add(23);
		LOG.info("Method boolean addAll(Collection<? extends E> c): ");
		list.addAll(list2);
		LOG.info("list -> " + list);
		
		LOG.info("Method boolean addAll(int index, Collection<? extends E> c) : ");
		list.addAll(1,list2);
		LOG.info("list -> " + list);
		
		LOG.info("Method clear() : ");
		list.clear();
		LOG.info("list -> " + list);
		
		
		
	}
	
	private static void addElementsToList() {
		list.add(5);
		list.add(3);
		list.add(7);
	}

}
