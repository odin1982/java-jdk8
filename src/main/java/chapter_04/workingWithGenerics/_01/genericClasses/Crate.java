package chapter_04.workingWithGenerics._01.genericClasses;

public class Crate<T> {
	private T contents;
	
	public T emptyCrate() {
		return contents;
	}
	
	public void packCrate(T contents) {
		this.contents = contents;
	}
}
