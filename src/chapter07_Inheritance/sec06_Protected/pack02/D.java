package chapter07_Inheritance.sec06_Protected.pack02;

import chapter07_Inheritance.sec06_Protected.pack01.A;

public class D extends A {

	public D() {
		//A a = new A();
		/*
		 * new 연산자를 사용해서 생성자를 직접 호출할 수는 없고, 자식 생성자에서 super() 로 생성자를 호출할 수 있다. 
		 *  -> 왜? 아무리 상속을 받았다고는 하지만 다른 패키지에 있어서 new 연산자로 직접 호출이 불가능한 건가?
		 */
		super();  //부모 생성자 호출
		this.field = "value";
		this.method();
	}
	
	public static void main(String[] args) {
		D d = new D();
		
		System.out.println();
		System.out.println("field : "+d.field);
		d.method();
	}
}
