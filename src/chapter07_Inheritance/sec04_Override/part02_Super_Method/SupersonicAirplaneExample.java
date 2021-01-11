package chapter07_Inheritance.sec04_Override.part02_Super_Method;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		//자식 객체 생성
		SupersonicAirplane sa = new SupersonicAirplane();		
		
		//부모의 takeOff() 호출 -> 자식 객체에 정의된 takeOff()가 없으니까 부모의 takeOff() 메소드 호출
		sa.takeOff();  
		//오버라이딩된 자식의 fly() 호출(flyMode==NORMAL)
		sa.fly();			
		
		//flyMode 변경
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		//오버라이딩된 자식의 fly() 호출(flyMode==SUPERSONIC)
		sa.fly();
		
		//flyMode 변경
		sa.flyMode = SupersonicAirplane.NORMAL;
		//오버라이딩된 자식의 fly() 호출(flyMode==NORMAL)
		sa.fly();
		
		//부모의 land() 호출 -> 자식 객체에 정의된 land()가 없으니까 부모의 land() 메소드 호출
		sa.land();		

	}

} //end class