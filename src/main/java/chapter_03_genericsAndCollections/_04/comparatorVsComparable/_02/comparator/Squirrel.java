package chapter_03_genericsAndCollections._04.comparatorVsComparable._02.comparator;

public class Squirrel {
	private int weight;
	private String species;
	
	public Squirrel(String theSpecies) {
		if(theSpecies == null) throw new IllegalArgumentException();
		species = theSpecies;
	}
	
	public int getWeight() { return weight; }
	public void setWeight(int weight) { this.weight = weight; }
	public String getSpecies() { return species; }

}
