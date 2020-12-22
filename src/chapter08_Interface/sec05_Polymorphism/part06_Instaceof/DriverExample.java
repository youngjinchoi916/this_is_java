package chapter08_Interface.sec05_Polymorphism.part06_Instaceof;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive1(bus);
		//driver.drive1(taxi);	//->Taxi객체를 Bus타입으로 casting 하려 해서 오류 발생
		
		System.out.println();
		
		driver.drive2(bus);
		driver.drive2(taxi);
	}
}
