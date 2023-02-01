package chapter_02.designPatternsAndPrinciples._05.applyingPredicateInterface;

public class Animal {
	private String species;
	private boolean canHop;
	private boolean canSwim;
	
	public Animal(String species, boolean canHop, boolean canSwim) {
		this.species = species;
		this.canHop = canHop;
		this.canSwim = canSwim;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public boolean canHop() {
		return canHop;
	}


	public boolean canSwim() {
		return canSwim;
	}

	@Override
	public String toString() {
		return "Animal [species=" + species + ", canHop=" + canHop + ", canSwim=" + canSwim + "]";
	}
	
}
