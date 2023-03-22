package chapter_03._03.usingListSetsMapsQueues.usingQueueInterface.workingWithQueueMethods;

import java.util.ArrayDeque;

public class ArrayDequeExample {
	public static void main(String[] args) {
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		stack.push(10);
		stack.push(4);
		System.out.println(stack.peek());//peek regresa el siguiente elemento 
		System.out.println(stack);
		System.out.println(stack.poll());//remueve y retorna el siguiente elemento 
		System.out.println(stack);
		System.out.println(stack.poll());//remueve y retorna el siguiente elemento 
		System.out.println(stack);
		System.out.println(stack.peek());//peek regresa el siguiente elemento 
		System.out.println(stack);
	}
}
