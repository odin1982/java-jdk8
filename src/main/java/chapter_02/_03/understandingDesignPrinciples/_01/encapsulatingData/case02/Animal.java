package chapter_02._03.understandingDesignPrinciples._01.encapsulatingData.case02;

public class Animal {
	private String species;
	private int age;
	
	public Animal(String species) {
		this.species = species;
	}

	public String getSpecies() {
		return species;
	}
	
	public void setSpecies(String species) {
		if(species == null || species.trim().length() == 0) {
			throw new IllegalArgumentException("Species is required");
		}
		this.species = species;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age<0) {
			throw new IllegalArgumentException("Age cannot be a negative number");
		}
		this.age = age;
	}

}
