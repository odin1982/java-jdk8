package chapter_03._01.genericsAndCollections._01.reviewingOcaCollections._03.wrapperClassesAndAutoboxing;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(new Integer(3));
		numbers.add(new Integer(5));
		numbers.remove(1);// remueve el indice
		numbers.remove(new Integer(5));//cuando el parametro es un Objeto remueve el objeto
		System.out.println(numbers);
	}

}
