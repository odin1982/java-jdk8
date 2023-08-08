package chapter_03_genericsAndCollections._03.usingListSetsMapsQueues._03.usingSetInterface._02.workingWithQueueMethods;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeFIFOSample {
	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<>();
		System.out.println(queue.offer(10));//offer agrega elemento
		System.out.println(queue);
		
		System.out.println(queue.offer(4));//offer agrega elemento
		System.out.println(queue);
		
		System.out.println(queue.peek()); // peek: regresa el siguiente elemento a salir de la cola
		
		System.out.println(queue.poll()); //poll: remueve y retorna el siguiente elemento
		System.out.println(queue);
		
		System.out.println(queue.poll()); //poll: remueve y retorna el siguiente elemento
		System.out.println(queue);
		
		System.out.println(queue.peek());
	}
}
