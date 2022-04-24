package org._17_.lambda.method.reference;

public class DoubleColonMethodReference {
	public static void main(String[] args) {
		MyFunInterfaceNew funInter = () -> System.out.println("I am lambda");
		funInter.method1();
	}
	
	public static void method2() {
		System.out.println("I am not a lambda");
	}
	
	public void method3() {
		System.out.println("I am not a lambda 3");
	}
}

@FunctionalInterface
interface MyFunInterfaceNew{
	public void method1();
}

class NewCallerClass{
	public static void main(String[] args) {
		MyFunInterfaceNew i = DoubleColonMethodReference :: method2;
		i.method1();
		
		DoubleColonMethodReference obj = new DoubleColonMethodReference();
		MyFunInterfaceNew i2 = obj :: method3;
		i2.method1();
	}
}
