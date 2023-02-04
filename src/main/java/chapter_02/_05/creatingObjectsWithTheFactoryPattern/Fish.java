package chapter_02._05.creatingObjectsWithTheFactoryPattern;

public class Fish extends Food{
	public Fish(int quantity) {
		super(quantity);
	}
	@Override
	public void consumed() {
		System.out.println("fish eaten: " + getQuantity());
	}
	
}
