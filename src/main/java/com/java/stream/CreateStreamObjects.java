package com.java.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

/*
 * Consumer: Represents an operation that accepts a single input argument and returns no result. 
 */
public class CreateStreamObjects {
	public static void main(String[] args) {
		
		//create a stream
		
		Stream<String> stream = Stream.of("a", "b", "c");
		stream.forEach((s) -> System.out.print(s));
		//with method reference
		Stream<String> streamMR = Stream.of("a", "b", "c");
		streamMR.forEach(System.out::print);
		
		//--------------------------------------------------
		
		Collection<String> collection = Arrays.asList("Java","J2EE","Spring","Hibernate");
		Stream<String> stream2 = collection.stream();
		stream2.forEach(System.out::println);
		
		List<String> list = Arrays.asList("Java","J2EE","Spring","Hibernate");
		Stream<String> stream3 = list.stream();
		stream3.forEach(System.out::println);
		
		System.out.println("\n4)");
		Set<String> set = new HashSet<>(list);
		Stream<String> stream4 = set.stream();
		stream4.forEach(System.out::println);
		
		System.out.println("\n5)");
		String[] strArray = {"a","b","c"};
		Stream<String> stream5 = Arrays.stream(strArray);
		stream5.forEach(System.out::println);
		
	}

}
