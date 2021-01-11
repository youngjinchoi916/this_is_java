package chapter07_Inheritance.sec04_Override.part01_Method_Override;

public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;
		
		//부모 객체 생성
		Calculator calculator = new Calculator();
		//부모의 areaCircle() 메소드 호출 
		//	-> 부모를 참조하는 변수로 areaCircle() 메소드 호출하기 때문에 부모의 areaCircle() 메소드 호출됨
		System.out.println("원면적 : " + calculator.areaCircle(r));	
		System.out.println();
		
		//자식 객체 생성
		Computer computer = new Computer();
		//오버라이딩된 자식의 areaCircle() 메소드 호출
		// 	-> 부모 클래스를 상속한 자식 클래스에서 메소드를 재정의 하였으므로, 오버라이딩된 자식의 areaCircle() 메소드가 호출됨.
		System.out.println("원면적 : " + computer.areaCircle(r));	
	}

}
