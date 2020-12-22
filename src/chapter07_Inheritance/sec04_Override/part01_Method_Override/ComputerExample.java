package chapter07_Inheritance.sec04_Override.part01_Method_Override;

public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;
		//부모 객체 생성
		Calculator calculator = new Calculator();
		System.out.println("원면적 : " + calculator.areaCircle(r));	//부모의 areaCircle() 메소드 호출
		System.out.println();
		
		//자식 객체 생성
		Computer computer = new Computer();
		System.out.println("원면적 : " + computer.areaCircle(r));	//오버라이딩된 자식의 areaCircle() 메소드 호출
	}

}
