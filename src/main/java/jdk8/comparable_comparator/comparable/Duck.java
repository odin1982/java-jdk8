package jdk8.comparable_comparator.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Duck implements Comparable<Duck>{
	private String name;
	
	public Duck(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
	@Override
	public int compareTo(Duck d) {
		return name.compareTo(d.name);// Ascendente
		//return d.name.compareTo(this.name);// Descendente
	}
	
	public static void main(String[] args) {
		List<Duck> ducks = new ArrayList<>();
		ducks.add(new Duck("Quack"));
		ducks.add(new Duck("Puddles"));
		ducks.add(new Duck("quack"));
		ducks.add(new Duck("puddles"));
		Collections.sort(ducks);
		System.out.println(ducks);
	}

}
