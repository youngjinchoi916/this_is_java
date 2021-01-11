package chapter07_Inheritance.sec05_Final.part02_Final_Method;

public class Car {
	// 필드
	public int speed;

	// 메소드
	public void speedUp() {
		speed += 1;
	}

	//final 메소드 -> 자식클래스에서 오버라이딩 못함.
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
	
} //end class
