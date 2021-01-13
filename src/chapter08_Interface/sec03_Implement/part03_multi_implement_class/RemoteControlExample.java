package chapter08_Interface.sec03_Implement.part03_multi_implement_class;

public class RemoteControlExample {
	public static void main(String[] args) {
		//RemoteControl, Searchable 인터페이스를 모두 구현한 SmartTelevision() 객체 생성
		SmartTelevision tv = new SmartTelevision();
		
		//인터페이스 타입에 구현 객체를 대입하면, 인터페이스 타입에 있는 추상메소드에만 접근 가능하다.
		RemoteControl rc = tv;
		
		rc.turnOn();
		rc.setVolume(10);
		
		//RemoteControl에 정의 안 된 추상메소드 접근 불가
		//rc.search("java");	
		
		////////////////////////////////////////////////////////
		
		Searchable searchable = tv;
		
		//Searchable에 정의 안 된 추상메소드 접근 불가
		//searchable.turnOn();
		//searchable.setVolume(10);
		//searchable.turnOn();
		searchable.search("java");
		
		rc.turnOff();
		
	}//end main
	
} //end class