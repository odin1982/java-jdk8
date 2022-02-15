package org._06_.collections.list.cursors;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class _01_CursorsEnumDemo {
	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("Enter the elements: ");
		for(int i=0; i<=8;i++) {
			Scanner s = new Scanner(System.in);
			Integer data = s.nextInt();
			v.add(data);
		}
		System.out.println("Vector: " + v);
		Enumeration e = v.elements();
		
		while(e.hasMoreElements()) {
			Integer element = (Integer)e.nextElement();
			if(element % 3 == 0) {
				System.out.println(element);
			}
		}
	}

}
