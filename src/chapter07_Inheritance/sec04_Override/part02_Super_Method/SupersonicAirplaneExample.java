package chapter07_Inheritance.sec04_Override.part02_Super_Method;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();		
		sa.takeOff();  //부모의 takeOff() 호출
		sa.fly();			//오버라이딩된 자식의 fly() 호출(NORMAL) -> 부모의 fly() 호출
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();			//오버라이딩된 자식의 fly() 호출(SUPERSONIC)
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();			//오버라이딩된 자식의 fly() 호출(NORMAL) -> 부모의 fly() 호출
		sa.land();		//부모의 land() 호출

	}

}
