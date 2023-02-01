package chapter_02._02.implementingPolymorphism.case01;

public class Oceanographer {
	public void checkSound(LivesInOcean animal) {
		animal.makeSound();
	}
	
	public static void main(String[] args) {
		Oceanographer o = new Oceanographer();
		o.checkSound(new Dolphin());
		o.checkSound(new Whale());
	}
}
