package chapter07_Inheritance.sec06_Protected.pack02;

import chapter07_Inheritance.sec06_Protected.pack01.A;

//다른 패키지의 A클래스를 상속함 -> 자식 클래스에서는 A클래스의 protected 멤버에 접근 가능
public class D extends A {

	public D() {
		//A a = new A();
		/*
		 * [protected 생성자]
		 *   - 생성자가 protected 이면 다른 패키지의 클래스에서 new 연산자를 직접 생성(호출)할 수 없다.
		 *   - 대신에, 자식 클래스의 생성자에서 super() 키워드로로 부모의 protected 생성자를 호출할 수 있다. 
		 *  		-> 왜? 아무리 상속을 받았다고는 하지만 다른 패키지에 있어서 new 연산자로 직접 호출이 불가능한 건가?
		 *  		-> 생성자가 protected로 선언되어 있기때문에 안됨. 다른 패키지 더라도 생성자가 public 이면 부모 생성자 호출 가능
		 */
		super();  //부모 생성자 호출
		this.field = "value";
		this.method();
	}
	
	public static void main(String[] args) {
		D d = new D();
		
		System.out.println();
		System.out.println("field : "+d.field);
		//A의 method()는 protected 여서 오버라이딩 안됨.
		d.method();
	}
	
} //end class
