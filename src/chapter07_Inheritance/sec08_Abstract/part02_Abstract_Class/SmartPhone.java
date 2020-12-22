package chapter07_Inheritance.sec08_Abstract.part02_Abstract_Class;

//추상클래스를 상속한 실체클래스
public class SmartPhone extends Phone {
	//생성자
	public SmartPhone(String owner) {
		//super를 쓴 이유 : SmartPhone 객체가 생성될 때 매개변수 owner를 부모클래스(추상클래스)로 전달하기 위해서.
		super(owner);
	}
	
	//메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
