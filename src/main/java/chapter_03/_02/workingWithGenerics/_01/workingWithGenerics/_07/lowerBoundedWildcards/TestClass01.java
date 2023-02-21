package chapter_03._02.workingWithGenerics._01.workingWithGenerics._07.lowerBoundedWildcards;

import java.util.ArrayList;
import java.util.List;

public class TestClass01 {
	public static void main(String[] args) {
		List<String> strings = new ArrayList<String>();
		strings.add("tweet");
		List<Object> objects = new ArrayList<Object>(strings);
		addSound(strings);
		addSound(objects);
	}
	
	// case 1
	/*
	public static void addSound(List<?> list) {
		list.add("quack");
	}
	*/
	
	// case 2
	/*
	public static void addSound(List<? extends Object> list) {
		list.add("quack");
	}
	*/
	
	// case 3
	/*
	public static void addSound(List<Object> list) {
		list.add("quack");
	}
	*/
	
	//case 4
	public static void addSound(List<? super String>list) {
		list.add("quack");
	}
}
