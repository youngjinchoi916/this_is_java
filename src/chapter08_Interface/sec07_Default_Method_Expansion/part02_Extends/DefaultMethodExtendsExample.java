package chapter08_Interface.sec07_Default_Method_Expansion.part02_Extends;

public class DefaultMethodExtendsExample {
	public static void main(String[] args) {
		/* 익명 구현 객체 */
		//인터페이스타입 변수 = new 인터페이스() { 인터페이스에 선언된 추상메소드의 실체메소드 선언 };
		ChildInterface1 ci1 = new ChildInterface1() {
			@Override
			public void method1() {
				System.out.println("ChildInterface1's overriding method1");
			}@Override
			public void method3() {
				System.out.println("ChildInterface1's overriding method3");
			}
		};
		
		ci1.method1();
		ci1.method2();  //ParentInterface의 디폴트 메소드 호출
		ci1.method3();
		System.out.println();
		//-------------------------------------------------------------
		
		ChildInterface2 ci2 = new ChildInterface2() {
			@Override
			public void method1() { 
				System.out.println("ChildInterface2's overriding method1");
			}
			@Override
			public void method3() { 
				System.out.println("ChildInterface2's overriding method3");
			}
		};
		
		ci2.method1();
		ci2.method2();  //ChildInterface2에서 재정의한 디폴트 메소드 method2가 호출됨
		ci2.method3();		
		System.out.println();
		//-------------------------------------------------------------
		
		ChildInterface3 ci3 = new ChildInterface3() {
			@Override
			public void method1() {
				System.out.println("ChildInterface3's overriding method1");
			}
			@Override
			public void method2() {
				System.out.println("ChildInterface3's overriding method2");
			}
			@Override
			public void method3() {
				System.out.println("ChildInterface3's overriding method3");
			}
		};
		
		ci3.method1();
		ci3.method2();  //ChildInterface3에서 추상메소드로 재선언한 method2() 메소드
		ci3.method3();				
	}
}
