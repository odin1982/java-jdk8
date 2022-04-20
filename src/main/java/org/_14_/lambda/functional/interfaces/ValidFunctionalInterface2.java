package org._14_.lambda.functional.interfaces;

@FunctionalInterface
public interface ValidFunctionalInterface2 {
	public void method1();
	default void method2() {}
	static void method3() {}
}
