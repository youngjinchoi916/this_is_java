package chapter07_Inheritance.sec07_Polymorphism.part06_TypeCheck;

public class InstanceofExample {
	public static void method1(Parent parent) {
		/*
		 * [객체 타입 확인(instanceof)]
		 *  - 강제 타입 변환은 자식 타입이 부모 타입으로 변환되어 있는 상태에서만 가능하다. 부모타입의 변수가 부모 객체를 참조할 경우 자식 타입으로 변환할 수 없다.
		 *  - 부모 변수가 참조하는 객체가 부모 객체 인지 자식 객체인지 확인 해서 자식 객체를 참조할 경우 강제 타입 변환 하게한다.
		 */
		//참조변수 instanceof 타입 -> 좌항의 찹조변수가 우항의 타입이면 true를 리턴함. 아니면 false를 리턴함.
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child로 변환 성공");
	}
	
	public static void main(String[] args) {
		//자동타입변환
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		////////////////////////////////////////////////
		
		//자동타입변환(x) -> 강제타입변환 될 수 없음.
		Parent parentB = new Parent();
		method1(parentB);
		
		//예외 발생 : java.lang.ClassCastException
		//자동타입변환되지 않은 객체를 강제타입변환하려 했기 때문에 예외 발생
		method2(parentB);
	}
}
