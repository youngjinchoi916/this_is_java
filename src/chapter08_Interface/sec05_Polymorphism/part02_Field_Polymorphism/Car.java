package chapter08_Interface.sec05_Polymorphism.part02_Field_Polymorphism;

public class Car {
	/* 구현객체가 인터페이스 타입으로 자동 변환 */
	//인터페이스타입 변수 = new 구현객체();  
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	//한국타이어의 roll() 메소드 호출
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
