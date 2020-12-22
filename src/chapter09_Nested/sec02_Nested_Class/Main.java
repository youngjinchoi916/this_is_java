package chapter09_Nested.sec02_Nested_Class;

public class Main {
	public static void main(String[] args) {
		//바깥 클래스 객체 생성
		A a = new A();
		
		//인스턴스 멤버 클래스 객체 생성
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		//정적 멤버 클래스 객체 생성
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;
		//c.field2 = 3;	//정적 필드는 참조변수로 접근할 수 있지만, 객체 자체로 접근하는 것을 권장
		A.C.method2();
		
		//로클 클래스 객체 생성을 위한 메소드
		a.method();
	}
}
