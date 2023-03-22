package chapter_03._03.usingListSetsMapsQueues.usingTheSetInterface.workingWithSetMethods;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample {
	public static void main(String[] args) {
		NavigableSet<Integer> set = new TreeSet<>();
		for(int i=1; i<=20; i++) {
			set.add(i);
		}
		
		System.out.println(set.lower(10));//te da el numero menor al mostrado
		System.out.println(set.floor(10));//te da el numero igual o menor al ingresado
		System.out.println(set.higher(10));//te da el numero mayor al ingresado
		System.out.println(set.ceiling(10));//te da el numero igual mayor al ingresado
		
	}

}
