package chapter_03.genericsAndCollections._01.reviewingOcaCollections._01.arrayAndArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayAndArrayList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Fluffy");
		list.add("Webby");
		
		String[] array = new String[list.size()];
		array[0] ="new";
		array[1] = list.get(0);
		for(int i=0; i<array.length;i++) {
			System.out.print(array[i] + " - ");
		}
	}

}
