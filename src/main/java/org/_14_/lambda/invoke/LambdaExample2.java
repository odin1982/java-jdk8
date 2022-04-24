package org._14_.lambda.invoke;

interface MyFunInterface{
	public void funMethodAdd(int a, int b);
}

class CallFunInterface implements MyFunInterface{

	@Override
	public void funMethodAdd(int a, int b) {
		System.out.println("Sum of a and b: " + a + b);
	}
	
}

public class LambdaExample2 {
	public static void main(String[] args) {
		MyFunInterface m2 = new CallFunInterface();
		m2.funMethodAdd(10, 20);
		
		MyFunInterface m = (a,b) -> System.out.println("Suma of a and b: " + (a + b));
		m.funMethodAdd(30, 40);
	}
}
 
