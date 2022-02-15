package org._01_.arrays;

public class _005_TraversingArray {
	public static void main(String[] args) {
		int[] a = new int[5];
		for(int i: a) {
			System.out.println(i);
		}
		
		int len = a.length;
		for(int i=0 ; i<len ; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		//-------------------------------------------------
		int[][] b = new int[2][3];
		
		for(int[] arr :b) {
			for(int e : arr) {
				System.out.println(e);
			}
		}
		
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.println("b["+i+"]["+j+"] = " + b[i][j]);
			}
		}
		
	}
}
