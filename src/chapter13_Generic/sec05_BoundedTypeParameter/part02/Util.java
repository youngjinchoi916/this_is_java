package chapter13_Generic.sec05_BoundedTypeParameter.part02;

public class Util {
	/*
	 * [제한된 타입 파라미터 <T extends 최상위타입> ]
	 *  타입 파라미터에 지정도는 구체적인 타입을 제한할 필요가 종종 있다.
	 *  예를 들어, 숫자를 연산하는 제네릭 메소드는 매개값으로 Number 타입 또는 Number의 하위 타입(Byte, Short, Integer, Long, Double)의 인스턴스만 가져야 한다.
	 *  
	 *  제한된 타입 파라미터를 선언하려며 타입 파라미터 뒤에 extends 키어드를 붙이고 상위 타입을 명시하면된다.
	 *  상위 타입은 클래스 뿐만 아니라 인터페이스도 가능하다. 인터페이스라고 해서 implements를 사용하지 않는다.
	 */
	//제네릭 타입이 extends Parent 이므로 매개변수는 Parent 타입 또는 Parent의 하위 타입만 가능하다.
	public static <T extends Parent> void testMethod(T t1, T t2) {
		/*
		 * 메소드 중괄호 블록 내에서 타입 파라미터 변수로 사용 가능한 것은 상위 타입의 멤버(필드, 메소드)로 제한된다.
		 * 하위 타입에만 있는 필드와 메소드는 사용할 수 없다. 즉, Parent의 멤버만 사용가능하다.
		 * 단, 상위 타입의 메소드가 하위 타입에서 오버라이딩 되어 있으면 하위 타입의 메소드가 호출 된다.
		 */
		System.out.println("t1.name : "+t1.name);
		t1.method1();
		t1.method2();
		//t1.method3();    //Parent의 필드만 사용 가능
		System.out.println();
		
		System.out.println("t2.name : "+t2.name);
		//System.out.println("t2.id : "+t2.id);    //Parent의 필드만 사용 가능
		t2.method1();
		t2.method2();	//Child의 method2() 호출됨.
		//t2.method3();    //Parent의 메소드만 사용 가능
		System.out.println();
		
		//하위 타입으로 강제타입변환 했을 경우
		if(t2 instanceof Parent) {
			Child c2 = (Child) t2;
			System.out.println("c2.name : "+c2.name);
			System.out.println("c2.id : "+c2.id);
			c2.method1();
			c2.method2();
			c2.method3();
		}
	}
}
