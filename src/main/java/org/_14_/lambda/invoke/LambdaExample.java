package org._14_.lambda.invoke;

public class LambdaExample {
	public static void main(String[] args) {
		FunInterfaceExample i = new ImplefunInterfaceExample();
		i.funMethod();
		
		FunInterfaceExample i2 = () -> System.out.println("function without any arguments and r eturn type!");
	}
}

interface FunInterfaceExample{
	public void funMethod();
}

class ImplefunInterfaceExample implements FunInterfaceExample{
	public void funMethod() {
		System.out.println("Function without any argument and return type!");
	}
}