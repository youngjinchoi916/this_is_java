package chapter07_Inheritance.sec08_Abstract.part03_Abstract_Method;

public class Dog extends Animal {
	
	public Dog() {
		//super(); 		//추상클래스 생성
		this.kind = "포유류";
	}

	//추상메소드 -> 오버라이딩 안하면 컴파일 에러
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
} //end class