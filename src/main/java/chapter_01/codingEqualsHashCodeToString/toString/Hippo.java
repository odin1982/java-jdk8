package chapter_01.codingEqualsHashCodeToString.toString;

public class Hippo {
	private String name;
	private double weight;
	
	public Hippo(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "name: " + name + " weight: "+ weight;
	}
	
	public static void main(String[] args) {
		Hippo h1 = new Hippo("Harry", 3100);
		System.out.println(h1);
	}
	
	
}
