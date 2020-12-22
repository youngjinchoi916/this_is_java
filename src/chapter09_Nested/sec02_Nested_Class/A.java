package chapter09_Nested.sec02_Nested_Class;
/*
 * [중첩 클래스]
 * 	 - 어떤 클래스는 여러 클래스와 관계를 맺지만, 어떤 클래스는 특정 클래스와 관계를 맺는다.
 *     클래스가 여러 클래스와 관계를 맺는 겨우에는 독립적으로 선언하는 것이 좋지만, 특정 클래스와 관계를 맺을 경우에는 관계 클래스를 클래스 내부에 선언하는 것이 좋다.
 *  - 중첩 클래스란 클래스 내부에 선언한 클래스를 말한다.
 *      (1) 중첩클래스를 사용하면 두 클래스의 멤버들을 서로 쉽게 접근할 수 있다.
 *      (2) 중첩클래스를 사용하면 외부에는 불필요한 관계 클래스를 감춤으로써 코드의 복잡성을 줄일 수 있다.
 *  - 중첩 클래스는 클래스 내부에 선언되는 위치에 따라 두가지로 분류된다.
 *      (1) 멤버 클래스 : 클래스의 멤버로서 선언되는 중첩 클래스 -> 클래스나 객체가 사용 중이라면 언제든지 재사용 가능하다.
 *     			* 인스턴스 멤버 클래스 : 바깥 클래스를 객체로 생성해야만 사용할 수 있는 클래스
 *     			* 정적 멤버 클래스 : 바깥 클래스로 바로 접근 할 수 있는 클래스(바깥 클래스의 객체 생성이 필요 없다)
 *      (2) 로컬 클래스 : 메소드 내부에서 선언되는 중첩 클래스 -> 메소드 실행 시에만 사용되고, 메소드가 실행 종료되면 없어진다.
 */

/** 바깥 클래스 -> 디폴트 클래스 **/
class A {
	A() { System.out.println("A 객체가 생성됨"); }
	
	/** 인스턴스 멤버 클래스 **/
	//static 키워드 없이 선언된 클래스
	//인스턴스 멤버 클래스는 인스턴스 필드, 인스턴스 메소드만 선언이 가능하고 정적 필드와 정적 메소드는 선언할 수 없다.
	public class B {
		B() { System.out.println("B 객체가 생성됨"); }
		int field1;
		//static int field2;					//정적 필드 선언 불가
		void method1() { }
		//static void method2() { }		//정적 메소드 선언 불가
	}
	//end class B
	
	/** 정적 멤버 클래스 **/
	//static 키워드로 선언된 클래스
	//모든 종류(인스턴스, 정적)의 필드와 메소드를 선언할 수 있다. 
	static class C {
		C() { System.out.println("C 객체가 생성됨"); }
		int field1;
		static int field2;
		void method1() { }
		static void method2() { }
	}
	//end class C
	
	void method() {
		/** 로컬 클래스 -> 메소드가 실행될 때 메소드 내에서 객체를 생성하고 사용(ex. 비동기 처리) **/
		//메소드 내부에 선언된 클래스
		//접근제한자(public, protected, private) 및 static 키워드 사용 불가 -> 로컬 클래스는 메소드 내부에서만 사용되므로 접근을 제한할 필요가 없다.
		//로컬 클래스 내부에는 인스턴스 필드, 인스턴스 메소드만 선언이 가능하고 정적 필드와 정적 메소드는 선언할 수 없다.
		class D {
			D() { System.out.println("D 객체가 생성됨"); }
			int field1;
			//static int field2;
			void method1() { }
			//static void method2() { }
		} //end class D
		
		//메소드 내에서 객체를 생성고 사용해야 한다.
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
	//end method()

} //end class A
