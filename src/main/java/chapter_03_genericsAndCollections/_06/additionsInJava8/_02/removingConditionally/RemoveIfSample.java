package chapter_03_genericsAndCollections._06.additionsInJava8._02.removingConditionally;

import java.util.ArrayList;
import java.util.List;

public class RemoveIfSample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Magician");
		list.add("Assistant");
		list.add("Doctor");
		list.add("Actrees");
		list.add("Astronaut");
		list.add("Dentist");
		list.add("Carpenter");
		System.out.println(list);
		list.removeIf(s -> s.startsWith("A"));
		System.out.println(list);
	}
}
