package chapter07_Inheritance.sec08_Abstract.part02_Abstract_Method;

public class Cat extends Animal {
	public Cat() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("야옹");
	}
}
