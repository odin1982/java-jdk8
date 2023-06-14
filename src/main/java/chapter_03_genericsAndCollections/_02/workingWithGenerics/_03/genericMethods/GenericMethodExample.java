package chapter_03_genericsAndCollections._02.workingWithGenerics._03.genericMethods;

import chapter_03_genericsAndCollections._02.workingWithGenerics._01.genericClasses.Crate;

public class GenericMethodExample {

	public static <T> Crate<T> ship(T t){
		System.out.println("Preparing " + t);
		return new Crate<T>();
	}
}
