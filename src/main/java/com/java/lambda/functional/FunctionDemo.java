package com.java.lambda.functional;

import java.util.function.Function;

class FunctionImpl implements Function<String,Integer>{

	@Override
	public Integer apply(String s) {
		
		return s.length();
	}
	
}


public class FunctionDemo {
	public static void main(String[] args) {
		Function<String,Integer> function = (String s) -> s.length();
		
		Integer result = function.apply("Hola");
		System.out.println("result length: " + result);
		
		//--------------------------------
		
		Function<String,Integer> function2 = new FunctionImpl();
		Integer result2 = function2.apply("Hola");
		System.out.println("result2:" + result2);
		
		
		
		
	}
}
