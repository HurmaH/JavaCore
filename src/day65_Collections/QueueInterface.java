package day65_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {

	public static void main(String[] args) {
		// Collection
		// Queue Interface extends Collection interface
		// LinkedList , PriorityQueue

		/*
		 * Summary of Queue methods 
		 *           Throws exception   Returns special value 
		 *  Insert   add(e)             offer(e) 
		 *  Remove   remove()           poll() 
		 *  Examine  element()          peek()
		 * 
		 */

		Queue<Integer> queue = new LinkedList<>();

		// adding item
		queue.offer(14);
		queue.offer(40);
		queue.offer(30);
		queue.offer(20);
		queue.offer(50);

		// cann hold double item
		System.out.println(queue);

		// remove and poll (remove throw exception if no element, poll return null)
		System.out.println("remove(): first in first out: " + queue.remove());
		System.out.println(queue);

		System.out.println("poll(): first in first out: " + queue.poll());
		System.out.println(queue);

		while (!queue.isEmpty()) {
			System.out.println("PROCESSING AND REMOVING " + queue.poll());
		}
		
		

		// element and peek
		
		Queue <Integer> queue2 = new LinkedList<>();

		// adding item
		queue2.add(14);
		queue2.add(40);
		queue2.add(30);
		System.out.println(queue2.element());
		System.out.println(queue2.peek());
		
		while (!queue2.isEmpty()) {
			System.out.println(queue2.poll());
		}
		//System.out.println(queue2.element());gives exception
		System.out.println(queue2.peek());

	}

}
