package chapter07_Inheritance.sec04_Override.part00_Basic;

public class ChildExample {

	public static void main(String[] args) {
		//자식 객체 생성
		Child child = new Child();
		
		//자식 객체에 method1()이 정의 된 것이 없으므로 부모의 method1()이 호출됨
		child.method1();
		
		//자식 객체에 overriding된 method2() 가 있으므로 부모의 method2()는 숨겨지고, 자식의 method2()가 호출됨
		child.method2();
		
		//자식 객체에만 있는 method3()가 호출됨.
		child.method3();
		System.out.println();
		
		//부모 객체 생성
		Parent parent = new Parent();
		
		//부모의 메소드만 사용 가능
		parent.method1();
		parent.method2();
		//parent.method3(;)
	}

}
