package chapter07_Inheritance.sec07_Polymorphism.part04_Method_Polymorphism;

public class Taxi extends Vehicle {
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}
