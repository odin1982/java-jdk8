package org._01_.arrays;

public class _001_ArrayIntroduction {
	public static void main(String[] args) {
		int a = 12;
		int b = 13;
		int c = 14;
		
		int[] x = new int[1000];
		System.out.println(x.getClass().getName());
		
		int[] y = new int[0];// is valid
		
		int[] z = new int['a']; // convert 'a' to int
		
		int[] p = new int[-1]; //np compile error but runtimeexception NegativeArraySizeException
		
		
	}

}
