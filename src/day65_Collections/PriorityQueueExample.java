package day65_Collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String[] args) {

		// Order as is
		Queue<Integer> pQue = new PriorityQueue<>();
		pQue.offer(10);
		pQue.offer(30);
		pQue.offer(40);
		pQue.offer(20);
		pQue.offer(5);
		System.out.println("As is order: " + pQue);

		// Natural Order
		Comparator<Integer> natural = Comparator.naturalOrder();
		pQue = new PriorityQueue<>(natural);
		pQue.offer(10);
		pQue.offer(30);
		pQue.offer(40);
		pQue.offer(20);
		pQue.offer(5);
		System.out.println("Natural order: " + pQue);

		while (!pQue.isEmpty()) {
			System.out.println(pQue.poll());
		}

		// reverse with comparator
		Comparator<Integer> revers = Comparator.reverseOrder();
		pQue = new PriorityQueue<>(revers);
		pQue.offer(10);
		pQue.offer(30);
		pQue.offer(40);
		pQue.offer(20);
		pQue.offer(5);
		System.out.println("Reverse order: " + pQue);

		while (!pQue.isEmpty()) {
			System.out.println(pQue.poll());
		}

	}

}
