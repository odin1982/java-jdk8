package chapter_02._05.creatingObjectsWithTheFactoryPattern;

public class Pellets extends Food{
	public Pellets(int quantity) {
		super(quantity);
	}
	
	@Override
	public void consumed() {
		System.out.println("Pellets eaten: " + getQuantity());
	}
	
}
