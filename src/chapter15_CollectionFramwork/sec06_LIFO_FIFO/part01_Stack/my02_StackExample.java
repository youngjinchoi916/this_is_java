package chapter15_CollectionFramwork.sec06_LIFO_FIFO.part01_Stack;

import java.util.Stack;

public class my02_StackExample {
	/*
	 * LIFO(Last In First Out, 후입선출) : 나중에 넣은 객체가 먼저 빠져나가는 구조 -> Stack
	 * FIFO(First In First Out, 선입선출) : 먼저 넣은 객체가 먼저 빠져나가는 구조 -> Queue
	 */
	public static void main(String[] args) {
		//Stack 클래스는 LIFO 자료구조를 구현한 클래스이다.
		Stack<my02_Coin> coinBox = new Stack<my02_Coin>();
		
		/* E push(E item) : 주어진 객체를 스택에 넣는다. */
		coinBox.push(new my02_Coin(100));    //리턴값 : new my01_Coin(100) 의 메모리 주소 값
		coinBox.push(new my02_Coin(50));
		coinBox.push(new my02_Coin(500));
		coinBox.push(new my02_Coin(10));

		/* boolean isEmpty() : stack이 비어 있는지 조사 */
		/* E pop() : 스택의 맨 위 객체를 가져온다. 객체를 스택에서 제거한다. */
		while (!coinBox.isEmpty()) {
			my02_Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}
		

	} //end main

} //end class
