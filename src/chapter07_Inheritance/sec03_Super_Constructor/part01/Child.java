package chapter07_Inheritance.sec03_Super_Constructor.part01;

public class Child extends Parent{

	public Child() {
		//super();		//부모의 기본 생성자를 호출한다. 안 써있어도 자동으로 컴파일러에 의해 추가됨.
		System.out.println("자식 생성자 호출 -> 자식 객체 생성");

	}
}
