package org._01_.arrays;

public class _003_ArraysDemo {
	public static void main(String[] args) {
		// Declaring array
		int[] x;
		
		// Decalring and initialazing array
		int[] y = {1,2,3,4,5};
		
		int[] z = new int[3];
		System.out.println(z[0]);
		System.out.println(z[1]);
		System.out.println(z[2]);
		
		z[0] = 10;
		z[1] = 20;
		z[2] = 30;
		
		System.out.println("\nLoop array z[]:");
		for(int i=0;i<z.length;i++) {
			System.out.println(z[i]);
		}
		
		System.out.println("z -> " + z);
		
		//---------------------------------------------
		
		int[][] a;
		int[][] b = new int[2][];
		System.out.println("b[0] ->" + b[0]);
		//System.out.println("b[0][0] ->" + b[0][0]); //NullPointerException
		
		b[0] = new int[2];
		b[1] = new int[3];
		System.out.println("b[0][0] -> " + b[0][0]);
		
		b[0][0] = 55;
		System.out.println("b[0][0] -> " + b[0][0]);
		
		int[][] c = {{1,2,3},{6,7}};
		
		for(int[] array : c) {
			for(int ele : array) {
				System.out.println(ele);
			}
		}
	}
}
