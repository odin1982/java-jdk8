package chapter_06.exceptionsAndAssertions.review._02.usingATryStatement;

public class TrySample {
	public static void main(String[] args) {
		explore();
	}
	
	static void explore() {
		try {
			fall();
			System.out.println("never get here");
		}catch(RuntimeException e) {
			getUp();
		}
		seeAnimals();
	}
	
	static void fall() { throw new RuntimeException(); }
	static void getUp() {}
	static void seeAnimals() {}
}
