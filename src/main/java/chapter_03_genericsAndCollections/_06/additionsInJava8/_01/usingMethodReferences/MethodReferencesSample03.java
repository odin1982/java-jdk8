package chapter_03_genericsAndCollections._06.additionsInJava8._01.usingMethodReferences;

import java.util.ArrayList;
import java.util.function.Supplier;

public class MethodReferencesSample03 {
	public static void main(String[] args) {
		Supplier<ArrayList<String>> lambda4 = () -> new ArrayList<>();
		Supplier<ArrayList<String>> metRef4 = ArrayList::new;
		
	}
}
