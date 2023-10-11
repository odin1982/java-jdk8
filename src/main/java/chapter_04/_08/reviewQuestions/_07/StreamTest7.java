package chapter_04._08.reviewQuestions._07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//	sort(List<T> list)
//	Sorts the specified list into ascending order, according to the natural ordering of its elements.

//	sort(List<T> list, Comparator<? super T> c)
//	Sorts the specified list according to the order induced by the specified comparator.

public class StreamTest7 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("mexico","alemania","francia","italia");
		System.out.println(sort(list));
		
		//list.stream().compare((a,b) -> b.compareTo(a)).collect(Collectors.toList()); //compare no se usa en el pipeline de un stream
		//list.stream().compare((a,b) -> b.compareTo(a)).sort();//compare no se usa en el pipeline de un stream
		//list.stream().compareTo((a,b) -> b.compareTo(a)).collect(Collectors.toList());//compareTo no se usa en el pipeline de un stream
		//list.stream().compareTo((a,b) -> b.compareTo(a)).sort();//compareTo no se usa en el pipeline de un stream
		//list.stream().sorted((a,b) -> b.compareTo(a)).collect();
		System.out.println(list.stream().sorted((a,b) -> b.compareTo(a)).collect(Collectors.toList())); 
	}
	
	private static List<String> sort(List<String> list){
		List<String> copy = new ArrayList<>(list);
		Collections.sort(copy,(a,b) -> b.compareTo(a));
		return copy;
	}
}
