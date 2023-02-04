package chapter_02._04.workingWithDesignPatterns._03.usingBuilderPattern;

import java.util.Arrays;

public class TestAnimalBuilder {
	public static void main(String[] args) {
		AnimalBuilder duckBuilder = new AnimalBuilder();
		duckBuilder
			.setAge(4)
			.setFavoriteFoods(Arrays.asList("grass","fish"))
			.setSpecies("duck");
		
		Animal duck = duckBuilder.build();
		
		Animal flamingo = new AnimalBuilder()
							.setAge(2)
							.setFavoriteFoods(Arrays.asList("algae","insects"))
							.setSpecies("flamingo")
							.build();
		System.out.println(duck) ;
		System.out.println(flamingo);
	}

}
