package chapter08_Interface.sec05_Polymorphism.part04_Method_Polymorphism;

public class Driver {
	/*
	 * [매개변수의 다형성]
	 * 	 - 자동 타입 변환은 필드의 값을 대입할 때에도 발생하지만, 주로 메소드를 호출할 때 많이 발생한다.
	 *  - 매개변수를 인터페이스 타입으로 선언하고 호출할 때에는 구현 객체를 대입한다.(자동타입변환 발생)
	 *  - 매개변수의 타입이 인터페이스일 경우, 어떠한 구현 객체도 매개값으로 사용할 수 있고, 
	 *     어떤 구현 객체가 제공되느냐에 따라 메소드의 실행 결과는 달라질 수 있다.(매개변수의 다형성)
	 */
	public void drive(Vehicle vehicle) {	//호출 시 해당 인터페이스를 구현한 객체 대입 가능
		vehicle.run();
	}
}
