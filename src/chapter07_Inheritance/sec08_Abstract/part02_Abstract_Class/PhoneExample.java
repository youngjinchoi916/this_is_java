package chapter07_Inheritance.sec08_Abstract.part02_Abstract_Class;

public class PhoneExample {
	public static void main(String[] args) {
		/* 추상클래스는 직접 생성할 수 없다. */
		//컴파일 에러 : Cannot instantiate the type Phone
		//Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("레오");
		//SmartPhone의 생성자를 통해서 Phone(추상클래스)를 생성하고, Phone의 필드를 초기화함.
		System.out.println("소유자 : "+smartPhone.owner);
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		System.out.println();
		
		Phone phone = new SmartPhone("선샤인");	//자동타입변환
		//추상클래스는 부모 클래스이다. -> 부모 클래스에서는 자식에만 있는 필드, 메소드 호출 불가능
		System.out.println("소유자 : "+phone.owner);
		phone.turnOn();
		//phone.internetSearch();		//자식 클래스에만 있는 메소드 호출불가
		phone.turnOff();
	
	}
}
