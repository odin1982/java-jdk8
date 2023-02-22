package _01_baeldung._01_.theNeedsForGenerics;

import java.util.LinkedList;
import java.util.List;

public class TestClass01 {
	public static void main(String[] args) {
		List list = new LinkedList();
		list.add(new Integer(1));
		
		Integer i = list.iterator().next(); // DOES NOT COMPILE
		
		//solution:resuleve el problema pero nunca podras asegurar que siempre sera un Integer
		Integer i2 = (Integer)list.iterator().next(); 
		
		// solution
		List<Integer> list2 = new LinkedList<>();
	}

}
