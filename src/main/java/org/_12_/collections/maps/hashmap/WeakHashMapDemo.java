package org._12_.collections.maps.hashmap;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
	public static void main(String[] args) throws InterruptedException {
		HashMap<Object,String> m = new HashMap<>();
		Temp t = new Temp();
		m.put(t, "element");
		System.out.println(m);
		
		t = null;
		System.gc();
		Thread.sleep(3000);
		System.out.println(m);
		
		
		WeakHashMap<Object,String> mw = new WeakHashMap<>();
		Temp tw = new Temp();
		Temp tw2 = new Temp();
		mw.put(tw2, "elementtw2");
		mw.put(tw, "element");
		System.out.println(mw);
		
		tw = null;
		System.gc();
		Thread.sleep(3000);
		System.out.println(mw);
	}
}
