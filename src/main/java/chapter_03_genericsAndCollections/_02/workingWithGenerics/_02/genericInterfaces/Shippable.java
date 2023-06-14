package chapter_03_genericsAndCollections._02.workingWithGenerics._02.genericInterfaces;
//Shippable: envio

public interface Shippable<T> {
	void ship(T t);
}
