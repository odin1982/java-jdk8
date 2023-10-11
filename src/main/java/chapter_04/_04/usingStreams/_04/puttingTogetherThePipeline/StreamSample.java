package chapter_04._04.usingStreams._04.puttingTogetherThePipeline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StreamSample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Toby","Ana","Leroy","Alex");
		List<String> filtered = new ArrayList<>();
		
		for(String name:list) {
			if(name.length() == 4) filtered.add(name);
		}
		Collections.sort(filtered);
		Iterator<String> iter = filtered.iterator();
		
		if(iter.hasNext())System.out.println(iter.next());
		if(iter.hasNext())System.out.println(iter.next());
		
		System.out.println("---------");
		List<String> lista = Arrays.asList("Toby","Anna","Leroy","Alex");
		lista.stream().filter(n -> n.length() == 4)
					  .sorted()
					  .limit(2)
					  .forEach(System.out::println);
		
		
	}
}
