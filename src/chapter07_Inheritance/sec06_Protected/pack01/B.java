package chapter07_Inheritance.sec06_Protected.pack01;

public class B {

	/*
	 * 같은 패키지 내에 있는 B클래스에서는 A의 필드, 생성자, 메소드에 접근가능하다.
	 */
	public void method() {
		 A a = new A();
		 
		 a.field = "value";
		 a.method();
	}
}
