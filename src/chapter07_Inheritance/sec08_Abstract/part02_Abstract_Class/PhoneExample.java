package chapter07_Inheritance.sec08_Abstract.part02_Abstract_Class;

public class PhoneExample {
	public static void main(String[] args) {
		/* 추상클래스는 직접 생성할 수 없다. */
		//Phone phone = new Phone(); (x)
		
		SmartPhone smartPhone = new SmartPhone("레오");
		System.out.println("소유자 : "+smartPhone.owner);
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		System.out.println();
		
		Phone phone = new SmartPhone("선샤인");
		System.out.println("소유자 : "+phone.owner);
		phone.turnOn();
		//phone.internetSearch();		//호출불가
		phone.turnOff();
	
	}
}
