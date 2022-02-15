package org._01_.arrays;

public class _007_VariableAssigments {
	public static void main(String[] args) {
		int[] x = new int[2];
		int[] a = x;
		x[0] = 1;
		
		System.out.println("x[0] ->" + x[0]);
		System.out.println("a[0] ->" + a[0]);
		
		a[1] = 2;
		
		System.out.println("x[1] ->" + x[1]);
		System.out.println("a[1] ->" + a[1]);
		
		//--------------------------------------
		
		int[] b = {1,2,3};
		int[] c = {11,22};
		
		b = c;
		System.out.println("\nb:");
		for(int element:b) {
			System.out.println(element);
		}
		
		System.out.println("\nc:");
		for(int element:c) {
			System.out.println(element);
		}
		
		String[] s = new String[3];
		Object[] objArr = s;
		
		short[] shorts = new short[2];	//[S
		//int[] ints = shorts;			//[I

	}
}
