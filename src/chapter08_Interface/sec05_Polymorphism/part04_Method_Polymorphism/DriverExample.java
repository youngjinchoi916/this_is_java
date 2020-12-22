package chapter08_Interface.sec05_Polymorphism.part04_Method_Polymorphism;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//인터페이스의 구현 객체 대입 -> 자동타입변환 & 매개변수의 다형성
		driver.drive(bus);
		driver.drive(taxi);
	}
}
