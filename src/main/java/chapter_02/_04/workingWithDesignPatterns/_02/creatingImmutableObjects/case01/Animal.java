package chapter_02._04.workingWithDesignPatterns._02.creatingImmutableObjects.case01;

import java.util.List;

public final class Animal {
	private final List<String> favoriteFoods;

	public Animal(List<String> favoriteFoods) {
		if(favoriteFoods == null) {
			throw new RuntimeException("favoriteFoods is required");
		}
		this.favoriteFoods = favoriteFoods;
	}

	public List<String> getFavoriteFoods() {
		return favoriteFoods; //MAKE CLASS MUTABLE
	}
	
	
	
	

}
