package chapter06_Class.sec09_InstanceMember;

public class CarExample {

	public static void main(String[] args) {

		Car myCar = new Car("포르쉐");
		Car yourCar = new Car("벤츠");

		myCar.run();
		yourCar.run();
	
	} //end main
	
} //end class
