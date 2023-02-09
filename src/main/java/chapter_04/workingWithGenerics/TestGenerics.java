package chapter_04.workingWithGenerics;

import java.util.ArrayList;
import java.util.List;

public class TestGenerics {
	static void printNames(List list) {
		for(int i=0;i<list.size();i++) {
			String name =(String)list.get(i);
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
		List names = new ArrayList();
		names.add(new StringBuilder("Webby"));
		printNames(names);
	}
}
