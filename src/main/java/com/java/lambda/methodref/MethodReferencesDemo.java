package com.java.lambda.methodref;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReferencesDemo {
	public static int addition(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		//1. Method reference to a static method
		Function<Integer,Double> function = (input) -> Math.sqrt(input);
		System.out.println(function.apply(5));
		
		// using method reference
		//Function<Integer,Double> functionmethodRef = (input) -> Math.sqrt(input);
		Function<Integer,Double> functionmethodRef = Math::sqrt;
		System.out.println(functionmethodRef.apply(3));
		
		//lambda expresion
		//BiFunction<Integer,Integer,Integer> biFunctionLambda =  (a,b) -> MethodReferencesDemo.addition(a, b);
		BiFunction<Integer,Integer,Integer> biFunctionLambda =  MethodReferencesDemo::addition;
		System.out.println(biFunctionLambda.apply(1, 2));
		
		
		
	}
}
