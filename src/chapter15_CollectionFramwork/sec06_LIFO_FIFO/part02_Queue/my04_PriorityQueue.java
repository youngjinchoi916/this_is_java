package chapter15_CollectionFramwork.sec06_LIFO_FIFO.part02_Queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class my04_PriorityQueue {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(4);
		queue.offer(3);
		queue.offer(2);
		queue.offer(1);
		
		System.out.println("[Queue]");
		while(!queue.isEmpty()) {
			Integer num = queue.poll();
			System.out.print(num+" ");
		}
		System.out.println();
		
		
		//Integer의 경우 숫자가 작은게 우선순위가 높드(등수 개념)
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		pq.offer(4);
		pq.offer(3);
		pq.offer(2);
		pq.offer(1);

		//4가 먼저 들어왔더라 하더라도 우선순위가 높은 부터 출력됨
		System.out.println("[PriorityQueue]");
		while(!pq.isEmpty()) {
			Integer num = pq.poll();
			System.out.print(num+" ");
		}
		System.out.println();
		
		PriorityQueue<String> pq2 = new PriorityQueue<>();
		
		pq2.offer("banana");
		pq2.offer("apple");
		pq2.offer("cherry");
		pq2.offer("dance");
		
		System.out.println("[PriorityQueue]");
		while(!pq2.isEmpty()) {
			String temp = pq2.poll();
			System.out.print(temp+" ");
		}
		System.out.println();


	}

}
