package chapter08_Interface.sec03_Implement.part03_multi_implement_class;

public class RemoteControlExample {
	public static void main(String[] args) {
		//RemoteControl, Searchable 인터페이스를 모두 구현한 SmartTelevision() 객체 생성
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		Searchable searchable = tv;
	}
}
