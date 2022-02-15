package org._06_.collections.list.cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class _02_CursorItrDemo {
	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList<>();
		data.add(12);
		data.add(23);
		data.add(36);
		
		Iterator<Integer> itr = data.iterator();
		
		while(itr.hasNext()) {
			Integer i = itr.next();
			if(i % 3 == 0) {
				System.out.println(i);
			}else {
				itr.remove();
			}
		}
		System.out.println("data: " + data);
	}
}
