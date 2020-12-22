package chapter15_CollectionFramwork.sec06_LIFO_FIFO.part01_Stack;

import java.util.Stack;

public class my01_Stack {
	/*
	 * LIFO(Last In First Out, 후입선출) : 나중에 넣은 객체가 먼저 빠져나가는 구조 -> Stack
	 * FIFO(First In First Out, 선입선출) : 먼저 넣은 객체가 먼저 빠져나가는 구조 -> Queue
	 */
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		/* boolean add(E element) : 객체 추가 -> List에서 제공하는 메소드 & 리턴값이 boolean */
		//stack.add(1);
		
		/* E push(E element) : 객체 추가 -> push() : Stack에서 제공하는 메소드 & 리턴값이 E*/
		//차이점은 미미하지만, stack을 사용할 경우 스택을 구현했음을 명확히 하기 위해 push() 메소드를 사용하자.
		//stack.push(1);
		//stack.push(2);
		//stack.push(3);
		//stack.push(4);
		//stack.push(5);
		for(int i=0 ; i<5 ; i++) {
			stack.push(i+1);
		}
		System.out.println("스택에 3이 있다 : "+stack.contains(3));
		System.out.println();
		
		System.out.println("스택의 크기 : "+stack.size());
		System.out.println();
		
		/* E peek() : 맨 위의 객체를 가져온다. 삭제하지는 않는다. 조회의 개념 */
		//가장 최근에 입력된 값을 top이라 하고, 스택은 top에서만 삽입, 삭제, 읽기 등의 동작이 가능하다.
		//top은 데이터의 수에 따라 유동적으로 변하며 데이터가 하나 삽입될 경우 하나 증가하고 데이터가 하나 삭제될 경우 하나 감소하도록 작성
		int top = stack.peek();
		System.out.println("top : "+top);
		System.out.println();
		
		/* int search(Object obj) : 매개변수로 받은 객체의 위치 반환 -> index를 반환하는 것이 아닌 순번을 반환한다. */
		//top을 1번 기준으로 해서 count
		int location = stack.search(4);
		System.out.println("4의 위치 : "+location);    //2 -> 위에서 2번째에 위치한다.
		System.out.println();
		
		/* boolean isEmpty() : stack이 비어 있는지 조사 */
		/* E pop() : 스택의 맨 위 객체를 가져온다. 객체를 스택에서 제거한다. */
		while(!stack.isEmpty()) {
			int num = stack.pop();
			System.out.println("num : "+num);
		}
		
		//스택이 비어 있는데 peek(), pop() 을 이용해서 스택 안의 객체(top)를 꺼내려 할 때 에러 발생 -> isEmpty() 메소드로 stack 확인하고 꺼내야함. 
		stack.peek();    //java.util.EmptyStackException
		stack.pop();    //java.util.EmptyStackException

	} //end main

} //end  class
