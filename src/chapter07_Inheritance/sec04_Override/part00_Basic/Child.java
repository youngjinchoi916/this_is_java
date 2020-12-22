package chapter07_Inheritance.sec04_Override.part00_Basic;

public class Child extends Parent{

	//어노테이션은 생략해도 좋으나, 이것을 붙여주게 되면 areaCircle() 메소드가 정확히 오버라이딩된 것인지 
	//컴파일러가 체크 하기 때문에 개발자의 실수를 줄여 준다.
	//Tip : 이클립스에서는 자동완성 기능(ctrl + space) 단축키를 이용해서 오버라이딩 메소드를 자동생성할 수 있다.
	@Override
	public void method2() {
		System.out.println("자식의 method2() 호출");
	}
	
	public void method3() {
		System.out.println("자식의 method3() 호출");
	}
	
	/* 컴파일 에러 : Cannot reduce the visibility of the inherited method from Parent
	 *   -> 오버라이딩된 메소드는 부모  메소드의 접근제한 보다 강한 접근 제한을 가질 수 없다.
	@Override
	void method4() {
		System.out.println("자식의 method4() 호출");
	}
	*/
}
