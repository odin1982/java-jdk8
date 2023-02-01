package chapter_02._02.implementingPolymorphism.case01;

public class Whale implements LivesInOcean{

	@Override
	public void makeSound() {
		System.out.println("sing");
	}

}
