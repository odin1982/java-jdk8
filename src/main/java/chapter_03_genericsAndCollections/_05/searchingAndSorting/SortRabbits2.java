package chapter_03_genericsAndCollections._05.searchingAndSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Rabbit { 
	int id;
	public Rabbit(int id) { this.id = id; }
	@Override
	public String toString() { return "Rabbit [id=" + id + "]"; }
}

public class SortRabbits2 {

	public static void main(String[] args) {
		List<Rabbit> rabbits = new ArrayList<>();
		rabbits.add(new Rabbit(12));
		rabbits.add(new Rabbit(1));
		rabbits.add(new Rabbit(3));
		rabbits.add(new Rabbit(7));
		Comparator<Rabbit> c = (r1,r2) -> r1.id - r2.id;
		Collections.sort(rabbits,c); //La clase Rabbit is not Comparable
		System.out.println(rabbits);
	}

}
