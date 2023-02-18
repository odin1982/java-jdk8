package chapter_03._02.workingWithGenerics._01.workingWithGenerics._05.unboundedWildcards;

import java.util.ArrayList;
import java.util.List;

public class Unbounded {
	public static void printList(List<Object> list) {
		for(Object x: list)System.out.println();
	}
	
	public static void printList2(List<?> list) {
		for(Object x: list)System.out.println(x);
	}
	
	public static void main(String[] args) {
		List<String> keywords = new ArrayList<>();
		keywords.add("java");
		printlList(keywords);
		
		//pereciera que no hay ningun error String es una sublclase de Object pero Java trata de protegernos
		// se mostrara un ejemplo a continuación
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(new Integer(42));
		List<Object> objects = numbers;
		objects.add("forty two");
		System.out.println(numbers.get(1));
		
		
		List<String> keywords = new ArrayList<>();
		keywords.add("java");
		printList2(keywords);
		
		
	}

}
