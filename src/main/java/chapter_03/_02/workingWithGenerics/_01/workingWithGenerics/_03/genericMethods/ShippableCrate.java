package chapter_03._02.workingWithGenerics._01.workingWithGenerics._03.genericMethods;

public class ShippableCrate<T> {
	public static <T> Crate<T> ship(T t){
		return new Crate<T>();
	}
	
	public static <T> void sink(T t) {}
	public static <T> T identity(T t) {return t;}
	public static T noGood(T t) {return t;} // DOES NOT COMPILE 
}
