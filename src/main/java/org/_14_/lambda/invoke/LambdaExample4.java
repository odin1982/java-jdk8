package org._14_.lambda.invoke;

interface MyFunInterface3{
	public int doSomeCalculation(int a);
}

//class ImplMyFunInterface3 implements MyFunInterface3{
//
//	@Override
//	public int doSomeCalculation(int a) {
//		int x = a + 10;
//		x = x/2;
//		return x;
//	}
//
//	
//}

public class LambdaExample4 {
	public static void main(String[] args) {
//		MyFunInterface3 i = new ImplMyFunInterface3();
//		int op = i.doSomeCalculation(100);
//		System.out.println(op);
		
		MyFunInterface3 i = (a) -> {
									int x = a + 10;
									x = x/2;
									return x;
									};
	   
		int op = i.doSomeCalculation(100);
		System.out.println(op);
	}
}
