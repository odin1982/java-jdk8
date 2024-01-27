package chapter_07.concurrency._04.usingConcurrentCollections._03.workingWithConcurrentClasses;

import java.util.Deque;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentClassesSample {
	public static void main(String[] args) {
		Map<String,Integer> map = new ConcurrentHashMap<>();
		map.put("zebra", 52);
		map.put("elephant", 10);
		System.out.println(map.get("elephant"));
		
		System.out.println();
		
		Queue<Integer> queue = new ConcurrentLinkedQueue<>();
		queue.offer(31);// + 
		System.out.println(queue.peek()); //Retrieves, but does not remove, the head of this queue,or returns null if this queue is empty
		System.out.println(queue.poll()); //Retrieves and removes the head of this queue,or returns null if this queue is empty.
		System.out.println(queue);
		
		System.out.println();
		
		Deque<Integer> deque = new ConcurrentLinkedDeque<>();
		deque.offer(10);
		deque.push(4);
		System.out.println(deque);
		System.out.println(deque.peek()); //Retrieves, but does not remove, the head of the queue represented bythis deque (in other words, the first element of this deque), orreturns null if this deque is empty
		System.out.println(deque.pop()); //Pops an element from the stack represented by this deque. In otherwords, removes and returns the first element of this deque.
		System.out.println(deque);
		
	}
}
