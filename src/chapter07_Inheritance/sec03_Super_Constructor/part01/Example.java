package chapter07_Inheritance.sec03_Super_Constructor.part01;

public class Example {

	public static void main(String[] args) {
		//부모 클래스를 상속받은 자식클래스를 객체로 생성하면, 부모 객체가 먼저 생성되고 자식 객체가 그 다음에 생성된다.
		Child child = new Child();

		/*
		 * [부모 객체를 생성하기 위해 부모 생성자를 어디서 호출한 것일까?]
		 * 		- 부모 생성자는 자식 생성자의 맨 첫 줄에서 호출된다
		 * 		- 자식 생성자에서 부모의 생성자 명시적으로 호출하지 않으면, 자동으로 컴파일러에 의해 부모의 기본 생성자를 호출한다.
		 */
	}

}
