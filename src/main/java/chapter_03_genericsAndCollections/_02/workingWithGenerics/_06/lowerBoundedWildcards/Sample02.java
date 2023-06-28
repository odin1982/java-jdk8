package chapter_03_genericsAndCollections._02.workingWithGenerics._06.lowerBoundedWildcards;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Sample02 {
	public static void main(String[] args) {
		// ? super class = ? es hijo de class
		List<? super IOException> exceptions = new ArrayList<Exception>();
		exceptions.add(new Exception());
		exceptions.add(new IOException());
		exceptions.add(new FileNotFoundException());
	}
}
