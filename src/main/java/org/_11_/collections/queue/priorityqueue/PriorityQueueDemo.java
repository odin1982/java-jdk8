package org._11_.collections.queue.priorityqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.TreeSet;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		// default size = 11
		
		PriorityQueue pq1 = new PriorityQueue(20);
		//PriorityQueue pq2 = new PriorityQueue(int initialCapacity,Comparator c);
		SortedSet s = new TreeSet();
		// PriorityQueue pq1 = new PriorityQueue(SortedSet s);
		PriorityQueue pq3 = new PriorityQueue(s);
		
		
		// PriorityQueue pq1 = new PriorityQueue(Collection c);
		List l = new ArrayList<>();
		PriorityQueue pq4 = new PriorityQueue(l);
		
	}

}
