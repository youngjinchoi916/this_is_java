package chapter07_Inheritance.sec07_Polymorphism.part04_Method_Polymorphism;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		
		//운전기사가 버스를 운전한다.
		//Vehicle vehicle = bus;  -> 자동 타입 변환
		//Bus 객체의 오버라이딩된 drive() 메소드 호출
		driver.drive(bus);
		
		//운전기사가 택시를 운전한다.
		//Vehicle vehicle = new Taxi();  -> 자동 타입 변환
		//Taxi 객체의 오버라이딩된 drive() 메소드 호출
		driver.drive(new Taxi());
	}
}
