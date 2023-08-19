package chapter_03_genericsAndCollections._05.searchingAndSorting;

import java.util.Set;
import java.util.TreeSet;

import chapter_03_genericsAndCollections._04.comparatorVsComparable._01.comparable.Duck;

public class UseTreeSet {
	static class Rabbit{ int id; }
	public static void main(String[] args) {
		Set<Duck> ducks = new TreeSet<>();
		ducks.add(new Duck("Puddles"));
		Set<Rabbit> rabbit = new TreeSet<>();
		rabbit.add(new Rabbit());
	}
}
