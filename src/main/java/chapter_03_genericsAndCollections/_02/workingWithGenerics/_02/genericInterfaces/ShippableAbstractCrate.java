package chapter_03_genericsAndCollections._02.workingWithGenerics._02.genericInterfaces;

public class ShippableAbstractCrate<U> implements Shippable<U> {
	public void ship(U t) {}

}
