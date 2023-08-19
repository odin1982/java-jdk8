package chapter_03_genericsAndCollections._04.comparatorVsComparable._02.comparator;

import java.util.Comparator;

public class ChainingComparator implements Comparator<Squirrel>{

	@Override
	public int compare(Squirrel s1, Squirrel s2) {
		Comparator<Squirrel> c = Comparator.comparing(s -> s.getSpecies());
		c = c.thenComparing(s -> s.getWeight());
		return c.compare(s1, s2);
	} 
	
	public static void main(String[] args) {
		Squirrel s1 = new Squirrel("voladora");
		Squirrel s2 = new Squirrel("trepadora");
		ChainingComparator chainingComparator = new ChainingComparator();
		chainingComparator.compare(s1, s2);
	}

}
