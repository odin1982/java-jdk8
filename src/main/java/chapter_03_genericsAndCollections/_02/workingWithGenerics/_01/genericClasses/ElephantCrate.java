package chapter_03_genericsAndCollections._02.workingWithGenerics._01.genericClasses;

public class ElephantCrate {
	public static void main(String[] args) {
		Elephant elephant = new Elephant();
		Crate<Elephant> crateForElephant = new Crate<>();
		crateForElephant.packCrate(elephant);
		Elephant inNewHome = crateForElephant.emptyCrate();
	}
}
