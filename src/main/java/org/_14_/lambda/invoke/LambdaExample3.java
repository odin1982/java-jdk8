package org._14_.lambda.invoke;

interface MyFunInterface2{
	public int findLength(String s);
}

//class ImplMyFunInterface2 implements MyFunInterface2{
//
//	@Override
//	public int findLength(String s) {
//		return s.length();
//	}
//	
//}


public class LambdaExample3 {
	public static void main(String[] args) {
//		MyFunInterface2 i = new ImplMyFunInterface2();
//		int length = i.findLength("Lambda");
//		System.out.println("length: " + length);
		
		MyFunInterface2 i2 = s -> s.length();
		int length2 = i2.findLength("Hola");
		System.out.println("length2: " + length2);
	}
}
