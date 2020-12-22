package chapter08_Interface.sec05_Polymorphism.part06_Instaceof;

public class Driver {
	
	public void drive1(Vehicle vehicle) {
		//매개변수(인터페이스 변수)를 무조건 Bus로 casting -> 오류 발생 가능 
		//만약 인터페이스변수에 담긴 주소가 Bus 객체의 주소가 아니라 Taxi 객체의 주소라면 오류 발생
		Bus bus = (Bus) vehicle;
		
		bus.checkFare();
		vehicle.run();
	}
	
	/*
	 * 강제타입변환(casting)이 필요할 경우 instanceof 연산자로 어떤 객체인지 확인하고 안전하게 강테타입변환을 해야 한다. 
	 */
	public void drive2(Vehicle vehicle) {
		//매개변수(인터페이스 변수)가 Bus의 instance 일 경우에만 Bus타입으로 casting
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
	
}
