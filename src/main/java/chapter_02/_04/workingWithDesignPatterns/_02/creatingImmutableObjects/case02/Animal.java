package chapter_02._04.workingWithDesignPatterns._02.creatingImmutableObjects.case02;

import java.util.ArrayList;
import java.util.List;

public final class Animal {
	private final String species;
	private final int age;
	private final List<String> favoriteFoods;
	
	public Animal(String species, int age, List<String> favoriteFoods) {
		this.species = species;
		this.age = age;
		if(favoriteFoods == null) {
			throw new RuntimeException("favoriteFoods is required"); 
		}
		this.favoriteFoods = new ArrayList<String>(favoriteFoods);//esta forma de asignar es importante
	}
	
	public String getSpecies() {
		return species;
	}
	public int getAge() {
		return age;
	}
	public String getFavoriteFood(int index) {
		return favoriteFoods.get(index);
	}
	
	public int getFavoriteFoodsCount() {
		return favoriteFoods.size();
	}
	
	
}
