package chapter_03_genericsAndCollections._02.workingWithGenerics._01.genericClasses;

public class SizeLimitedCrate<T,U> {
	private T contents;
	private U sizeLimits;
	
	public SizeLimitedCrate(T contents,U sizeLimit) {
		this.contents = contents;
		this.sizeLimits = sizeLimit;
	}
	
	public static void main(String[] args) {
		Elephant elephant = new Elephant();
		Integer numPounds = 15_000;
		SizeLimitedCrate<Elephant,Integer> c1 = new SizeLimitedCrate<>(elephant,numPounds);
	}
}
