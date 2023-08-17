package com.ravi.map;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {
		 public static void main(String[] args) {
			PriorityQueue<String > queue = new PriorityQueue<>();
			
			queue.add("john");
			queue.add("smith");
			queue.add("orlen");
			//queue.add(null);
			queue.add("ravi");
			System.out.println(queue);
			
			System.out.println(queue.peek());
			
			System.out.println(queue.element());
			System.out.println("===========");
			
		Iterator<String> it = queue.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("============");
		queue.remove();
		queue.poll();
			System.out.println(queue);
		}

}
