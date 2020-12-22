package chapter15_CollectionFramwork.sec06_LIFO_FIFO.part02_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class my01_Queue {

	/*
	 * Queue 인터페이스를 구현한 대표적인 클래스는 LinkedList 이다.
	 * LinkedList는 List 인터페이스를 구현했기 때문에 List 컬렉션 이기도 하다.
	 */
	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		
		/* boolean offer(E e) : 주어진 객체를 넣는다 */
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);
		queue.offer(5);

		/* E peek() : 객체를 하나 가져온다. 객체를 큐에서 제거하지 않는다. */
		//가져오는 값은 맨 앞의 값이다. 즉, 맨 처음 들어간 값.
		System.out.println("맨 앞의 값 : "+queue.peek());
		System.out.println("크기 : "+queue.size());
		System.out.println();
		/* E poll() : 객체를 하나 가져온다. 객체를 큐에서 제거한다. */
		//가져오는 값은 맨 앞의 값이다. 즉, 맨 처음 들어간 값.
		queue.poll();
		System.out.println("맨 앞의 값 : "+queue.peek());
		System.out.println("크기 : "+queue.size());
		System.out.println();
		
		/* boolean isEmpty() : 큐 객체가 비어있는지 체크 */
		while(!queue.isEmpty()) {
			int num = queue.poll();
			System.out.println("num : "+num);
		}
		System.out.println();
		
		System.out.println("size : "+queue.size());
		//queue가 비어있는데 peek(), poll() 하더라도 오류는 안남. 그래도 확인하고 꺼내야 된다.
		System.out.println(queue.peek());  //null
		System.out.println(queue.poll());

	}

}
