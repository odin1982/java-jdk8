package org._06_.collections.list.cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class _03_CursorListItrDemo {
	public static void main(String[] args) {
		ArrayList<String> data = new ArrayList<>();
		data.add("Raj");
		data.add("Odin");
		data.add("Amrish");
		data.add("Ramesh");
		data.add("jai");
		data.add("Khusal");
		
		System.out.println("data: " + data);
		
		ListIterator<String> li = data.listIterator();
		while(li.hasNext()) {
			String item = li.next();
			
			if(item.equals("jai")) {
				li.add("veeru");
			}
			if(item.equals("Odin")) {
				li.remove();
			}
			if(item.equals("Amrish")) {
				li.set("America");
			}
		}
		
		System.out.println("data: " + data);
	}
}
