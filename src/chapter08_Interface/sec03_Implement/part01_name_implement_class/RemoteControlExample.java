package chapter08_Interface.sec03_Implement.part01_name_implement_class;

public class RemoteControlExample {
	public static void main(String[] args) {
		
		//Television타입 변수에 대입한다고 인터페이스를 사용하는 것이 아니다
		//Television tv = new Television();
		
		//인터페이스로 구현 객체를 사용하려면 다음과 같이 인터페이스 변수를 선언하고 구현 객체를 대입해야 한다.
		//인터페이스 변수는 참조 타입이기 때문에 구현객체가 대입될 경우 구현 객체의 번지를 저장한다.
		RemoteControl rc;
		rc = new Television();
		rc = new Audio();
	}
}
