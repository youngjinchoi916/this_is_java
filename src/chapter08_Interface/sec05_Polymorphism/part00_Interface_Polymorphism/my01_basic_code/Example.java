package chapter08_Interface.sec05_Polymorphism.part00_Interface_Polymorphism.my01_basic_code;

public class Example {

	public static void main(String[] args) {
		A a = new A();
		
		int num = a.field;
		System.out.println("num : "+num);
		a.method1();
		a.method2();
		a.method3();
		
		System.out.println();
		//A에 문제가 생겨서 B클래스를 새로 만들었다면 A의 필드, 메소드가 사용된 모든 곳들을 찾아서 B의 메소드로 직접 바꿔야 한다.
		
		B b = new B();
		
		int num2 = b.field_b;
		System.out.println("num2 : "+num2);
		b.method_a();
		b.method_b();
		b.method_c();

	}

}
