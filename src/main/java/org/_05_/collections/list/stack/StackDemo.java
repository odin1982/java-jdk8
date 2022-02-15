package org._05_.collections.list.stack;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(30);
		s.push(true);
		System.out.println("s: " + s);
		Object popObject = s.pop();
		System.out.println("pop object: " + popObject);
		Object peekElement = s.peek();// returns the top element
		System.out.println("peek element(top element): " + peekElement);
		System.out.println("s: " + s);
		boolean isEmpty = s.empty();
		System.out.println("isEmpty: " + isEmpty);
		System.out.println("s: " + s);
		System.out.println("search [10]: " + s.search(10));
	}

}
