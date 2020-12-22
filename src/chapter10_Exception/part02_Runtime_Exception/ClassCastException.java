package chapter10_Exception.part02_Runtime_Exception;

public class ClassCastException {
	//타입변환은 상위클래스-하위클래스, 인터페이스-구현클래스 간에 발생한다. -> 이러한 관계가 아니라면 클래스는 다른 클래스로 타입변환 할 수 없다.
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	} //end main
	
	public static void changeDog(Animal animal) {
		//ClassCastException 발생 가능
		//Dog dog = (Dog) animal;
		
		//ClassCastException 발생 방지
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;
		}
	}
	
} //end class

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}