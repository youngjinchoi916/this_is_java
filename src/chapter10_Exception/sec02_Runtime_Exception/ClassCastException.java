package chapter10_Exception.sec02_Runtime_Exception;

public class ClassCastException {
	/*
	 * [ClassCastException]
	 *   - 타입변환은 상위클래스-하위클래스, 인터페이스-구현클래스 간에 발생한다. 
	 *     이러한 관계가 아니라면 클래스는 다른 클래스로 타입변환 할 수 없다.
	 *   - 타입이 맞지 않는 클래스로 강제타입변환(casting) 시도할 때 발생
	 */
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	} //end main
	
	public static void changeDog(Animal animal) {
		//타입을 확인하지 않고 Casting 하려고 하면 ClassCastException 발생 가능
		//Dog dog = (Dog) animal;
		
		//타입을 확인해서 안전하게 타입 변환 할 것.(ClassCastException 발생 방지)
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;
		} else {
			System.out.println(animal.getClass()+"은 Dog 타입으로 타입변환이 불가능 합니다.");
		}
	}
	
} //end class

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}