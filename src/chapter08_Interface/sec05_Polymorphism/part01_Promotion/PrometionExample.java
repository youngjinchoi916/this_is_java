package chapter08_Interface.sec05_Polymorphism.part01_Promotion;

public class PrometionExample {

	/*
	 *[다형성]
	 *	 - 요즘은 상속 보다는 인터페이스를 통해서 다형성을 구현하는 경우가 더 많다.
	 *  - 다형성은 하나의 타입에 대입되는 객체에 따라서 실행 결과가 다양한 형태로 나오는 성질을 말한다.   
	 *  - 부모타입에 어떤 자식 객체를 대입하느냐에 따라 실행 결과가 달라지듯이, 
	 *    인터페이스 타입에 어떤 구현 객체를 대입하느냐에 따라 실행결과가 달라진다.
	 *  - 상속은 같은 종류의 하위 클래스를 만드는 기술이고, 인터페이스는 사용방법이 동일한 클래스를 만드는 기술이라는 
	 *    개념적 차이점은 있지만  둘다 다형성을 구현하는 기술임에는 틀림 없다.
	 *     
	 *   - 인터페이스를 사용해서 메소드를 호출하도록 코딩했다면, 구현 객체를 교체하는 것은 매우 손쉽고 빠르게 할 수 있다.
	 *       -> 프로그램 소스 코도는 변함이 없는데 구현 객체를 교체함으로서 프로그램의 실행 결과가 다양해진다. -> 인터페이스의 다형성
	 */
	
	/*
	 *  	 A
	 *  B		C   -> implements
	 *  D		E   -> extends
	 */
	public static void main(String[] args) {
		//구현객체 생성
		B b = new B();
		C c = new C();
		
		//자식객체 생성
		D d = new D();
		E e = new E();
		
		/* 최상위타입에 히위 객체 대입 -> 자동 타입 변환 */
		//인터페이스 타입에 구현 객체 대입
		A a1 = b;
		A a2 = c;
		
		//구현 객체의 메소드 사용
		a1.method();
		a2.method();
		
		//인터페이스 구현 클래스를 상속해서 자식클래스를 만들었다면 
		//자식 객체 역시 인터페이스 타입으로 자동 타입 변환 시킬 수 있다.
		A a3 = d;
		A a4 = e;
		
		//구현 객체를 상속한 자식클래스의 재정의 메소드 사용
		a3.method();
		a4.method();

	} //end main

} //end class