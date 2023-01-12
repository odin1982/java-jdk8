package jdk8._001_.assesment.test._010;

public class Grasshopper {
	public Grasshopper(String n) {
		name = n;
	}
	
	public static void main(String[] args) {
		Grasshopper one = new Grasshopper("g1");
		Grasshopper two = new Grasshopper("g2");
		one = two;
		two = null;
		one = null;
		
	}
	
	private String name;

}
