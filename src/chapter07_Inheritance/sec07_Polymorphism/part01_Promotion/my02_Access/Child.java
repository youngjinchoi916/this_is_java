package chapter07_Inheritance.sec07_Polymorphism.part01_Promotion.my02_Access;

public class Child extends Parent {
	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}
	
	public void method3() {
		System.out.println("Child-method3()");
	}
}
