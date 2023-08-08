package chapter_03_genericsAndCollections._03.usingListSetsMapsQueues._03.usingSetInterface._02.workingWithQueueMethods;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeLIFOSample {
	public static void main(String[] args) {
		ArrayDeque<Integer> queue = new ArrayDeque<>();
		queue.push(10);//offer agrega elemento
		System.out.println(queue);
		
		queue.push(4);//offer agrega elemento
		System.out.println(queue);
		
		System.out.println(queue.peek()); // peek: regresa el siguiente elemento a salir de la cola
		
		System.out.println(queue.poll()); //poll: remueve y retorna el siguiente elemento
		System.out.println(queue);
		
		System.out.println(queue.poll()); //poll: remueve y retorna el siguiente elemento
		System.out.println(queue);
		
		System.out.println(queue.peek());
	}
}
