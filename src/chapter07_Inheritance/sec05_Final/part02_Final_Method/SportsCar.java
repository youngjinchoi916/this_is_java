package chapter07_Inheritance.sec05_Final.part02_Final_Method;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
	}

	//stop() 메소드는 부모클래스에서 final 메소드로 선언되어 있기 때문에 오버라이딩을 할 수 없음
	/*
	@Override
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
	*/

}//end class