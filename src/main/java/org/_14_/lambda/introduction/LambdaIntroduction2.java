package org._14_.lambda.introduction;

public class LambdaIntroduction2 {
	public static void main(String[] args) {
//		CallFunInterface funInter = new CallFunInterface();
//		funInter.funMethod();
		MyFunctionalInterface2 funInterLambda = () -> System.out.println("FunctionalMethod");
		funInterLambda.funMethod();
	}
}

interface MyFunctionalInterface2{
	public void funMethod();
}


//class CallFunInterface implements MyFunctionalInterface{
//
//	@Override
//	public void funMethod() {
//		System.out.println("FunctionalMethod");
//	}
//	
//}