package org._16_.lambda.function;

import java.util.function.Function;

public class FunctionExample {
	public static void main(String[] args) {
		String s = "BasicStrong";
		int len = callength(s);
		System.out.println(len);
		
		Function<String,Integer> fun = str -> str.length();
		Integer length = fun.apply(s);
		System.out.println(length);
	}
	
	private static int callength(String s) {
		return s.length();
	}

}
