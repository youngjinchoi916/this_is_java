package chapter15_CollectionFramwork.sec06_LIFO_FIFO.part02_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class my02_Queue2 {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i=5 ; i>0 ; i--) {
			queue.offer(i);
		}
		
		System.out.println("[현재 queue에 들어있는 값 출력하기]");
		for(int num : queue) {
			System.out.println("전 : "+num);
		}
		System.out.println("peek : "+queue.peek());
		System.out.println();
		
		System.out.println("[현재 queue에 들어있는 값에 +1 한 값 출력하기]");
		for(int num : queue) {
			//queue에 있는 값들을 하나씩 받아와서 +1 한 것일 뿐. queue에 들어 있는 값 자체에 변화는 없음.
			num++;
			System.out.println("후 : "+num);
		}
		System.out.println();
		
		//현재 queue에는 5 4 3 2 1 이 저장되어 있음.
		System.out.println("[peek 값이 5보다 크면 제일 앞에 값 제거하기]");
		if(queue.peek()>5) {
			queue.poll();
		}
		System.out.println("크기 : "+queue.size());
		for(int num : queue) {
			System.out.println("num : "+num);
		}
		System.out.println();
		
		System.out.println("[queue에 들어있는 총합 구하기]");
		int sum = 0;
		for(int num : queue) {
			sum += num;
		}
		System.out.println("총합 : "+sum);
		//System.out.println(queue.peek());
		
	}

}
