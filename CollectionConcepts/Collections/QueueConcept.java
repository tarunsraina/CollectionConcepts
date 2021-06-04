package Collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueConcept {

	public static void main(String[] args) {
		// FIFO
		// Duplicates are allowed
		// Insertion order is preserved
		
		Queue q=new LinkedList();
		q.add(25);//success->returns true,failure->Exception is raised.
		q.offer(27);//success->returns true,failure->Returns False
		
		q.add(25);
		q.add(788);
		q.add(5);
		q.add(9088);
		q.add("hello");
		
		// add & offer ->Both are used for adding elements.
		System.out.println(q);
		
		System.out.println(q.element());
		System.out.println(q.peek());

		// element & peek will return head element of queue.
		// If queue is empty,element will throw an exception whereas peek will return null
		
		
		System.out.println(q.remove());
		System.out.println(q.poll());
		// remove & poll will remove the head element of queue
		// If the Queue is empty,the remove method will throw an exception whereas poll returns null
		
		
		PriorityQueue pq=new PriorityQueue();
		//In priority queue heterogeneous elements are not allowed.
		
		pq.add(1);
		//pq.add("Hello");--->this throws exception
		
		System.out.println(pq);
		
		
		
		
	}

}
