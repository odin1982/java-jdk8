package org._14_.collections.concurrent;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentModiDemo extends Thread{
	private static ArrayList<String> list = new ArrayList<>();
	public static void main(String[] args) {
		ConcurrentModiDemo tchild = new ConcurrentModiDemo();
		
		list.add("John");
		list.add("Rohn");
		list.add("Tom");
		list.add("Shiva");
		
		tchild.start();
		
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			String name = (String)iterator.next();
			System.out.println("Main thread iterating -> " + name);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void run() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		list.add("Ganesh");
	}

}
