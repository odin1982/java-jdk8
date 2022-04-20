package org._14_.lambda.introduction;

public class LambdaIntroduction {
	public static void main(String[] args) {
		CallFunInterface funInter = new CallFunInterface();
		funInter.funMethod();
	}
}

interface MyFunctionalInterface{
	public void funMethod();
}


class CallFunInterface implements MyFunctionalInterface{

	@Override
	public void funMethod() {
		System.out.println("FunctionalMethod");
	}
	
}