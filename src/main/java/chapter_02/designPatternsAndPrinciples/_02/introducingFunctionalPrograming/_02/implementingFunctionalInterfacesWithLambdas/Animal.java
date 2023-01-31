package chapter_02.designPatternsAndPrinciples._02.introducingFunctionalPrograming._02.implementingFunctionalInterfacesWithLambdas;

public class Animal {
	private String species;
	private boolean canHop;
	private boolean canSwim;
	
	public Animal(String speciesName,boolean hopper,boolean swimmer) {
		species = speciesName;
		canHop = hopper;
		canSwim = swimmer;
	}
	
	public boolean canHop() { return canHop;}
	public boolean canSwim() { return canSwim;}
	public String toString() { return species;}
}
