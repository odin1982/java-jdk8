package org._04_.collections.list.vector;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector v = new Vector();
		Vector vec = new Vector(60);
		Vector vec1 = new Vector(100,5);
		Vector vec2 = new Vector(v); // new Vector(Collection c)
		v.add("1");
		v.addElement("Hello");
		System.out.println(v);
		v.remove(0);
		System.out.println(v);
		System.out.println(v.elementAt(0));
		
		//get
		System.out.println("firstElement: " + v.firstElement());
		System.out.println("lastElement: " + v.lastElement());
		System.out.println("v[0]: " + v.get(0));
		
		//size
		//capacity
	}
}
