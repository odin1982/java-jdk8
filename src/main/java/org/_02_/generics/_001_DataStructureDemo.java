package org._02_.generics;

import java.util.ArrayList;

public class _001_DataStructureDemo {
	public static void main(String[] args) {
		String[] strArray = new String[20];
		Employee[] empArray = new Employee[20];
		strArray[0] = "Meenal";
		//strArray[1] = new Employee();// Type safety
		
		ArrayList l = new ArrayList();
		l.add("Meenal");
		l.add(new Employee());
		String name = (String)l.get(0);
	}

}
