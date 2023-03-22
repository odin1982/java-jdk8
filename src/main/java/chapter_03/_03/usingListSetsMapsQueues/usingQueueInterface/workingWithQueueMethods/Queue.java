package chapter_03._03.usingListSetsMapsQueues.usingQueueInterface.workingWithQueueMethods;

import java.util.ArrayDeque;

public class Queue {
	public static void main(String[] args) {
		ArrayDeque<Integer> queue = new ArrayDeque<>();
		for(int i=1;i<=20;i++) {
			queue.add(i);
		}
		
//		System.out.println(queue.offer(10));
//		System.out.println(queue.offer(4));
		System.out.println(queue.peek());//regresa el siguiente elemento
		System.out.println(queue);
		System.out.println(queue.poll());//quita el siguiente elemento
		System.out.println(queue);
		System.out.println(queue.poll());//quita el siguiente elemento
		System.out.println(queue);
	}
}
