package chapter08_Interface.sec05_Polymorphism.part02_Field_Polymorphism;

public class CarExample {
	public static void main(String[] args) {
		//Car 객체 생성 -> 모두 한국타이어가 대입됨
		Car myCar = new Car();
		System.out.println("[교체 전]");
		myCar.run();
		System.out.println();
		
		/*
		 * [필드의 다형성]
		 * 	 - Car의 run() 메소드를 수정하지 않고도 다양한 roll() 메소드의 실행결과를 얻을 수 있다. 
		 */
		
		//인터페이스타입 변수에는 해당 인터페이스를 구현한 모든 객체가 대입될 수 있다(자동타입변환)
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		System.out.println("[교체 후]");
		myCar.run();
	}
}
