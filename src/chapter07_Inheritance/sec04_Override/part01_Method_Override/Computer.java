package chapter07_Inheritance.sec04_Override.part01_Method_Override;

public class Computer extends Calculator{
	/*
	 * [메소드 오버라이딩]
	 *  - 상속된 메소드의 내용이 자식 클래스에 맞지 않을 경우, 자식 클래스에서 동일한 메소드를 재정의 하는 것을 말한다.
	 *  - 메소드가 오버라이딩되었다면 부모 객체의 메소드는 숨겨지기 때문에, 자식 객체에서 메소드를 호출하면 오버라이딩된 자식 메소드가 호출된다.
	 */
	
	/*
	 * [메소드 오버라이딩 시 규칙]
	 *  (1) 부모의 메소드와 동일한 시그너처(리턴타입, 메소드이름, 매개변수 리스트)를 가져야 한다.
	 *  (2) 접근 제한을 부모 보다 더 강하게 오버라이딩 할 수 없다.
	 *  	   부모 메소드가 public 이면 오버라이딩하는 자식 메소드는 default나 private로 수정할 수 없다.
	 *        부모 메소드가 default 이면 오버라이딩하는 자식 메소드는 default나 public이 될 수 있다.
	 *  (3) 새로운 예외를 throws 할 수 없다.
	 */
	@Override
	double areaCircle(double r) {
	System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
