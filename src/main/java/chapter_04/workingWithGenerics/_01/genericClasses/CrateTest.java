package chapter_04.workingWithGenerics._01.genericClasses;

public class CrateTest {
	public static void main(String[] args) {
		Elephant e = new Elephant();
		Crate<Elephant> crateForElephant = new Crate<>();
		crateForElephant.packCrate(e);
		Elephant inNewHome = crateForElephant.emptyCrate();
		
		Zebra z = new Zebra();
		Crate<Zebra> crateForZebra = new Crate<>();
	}
}
