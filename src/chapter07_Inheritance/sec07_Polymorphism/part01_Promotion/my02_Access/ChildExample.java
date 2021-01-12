package chapter07_Inheritance.sec07_Polymorphism.part01_Promotion.my02_Access;

public class ChildExample {
	public static void main(String[] args) {
		//자식 객체 생성
		Child child = new Child();
		//자식 객체를 부모 타입에 대입 -> 자동 타입 변환
		Parent parent = child;
		
		//Parent parent = new Child();	//위에서 child 변수 선언하고 Parent 타입에 대입하는 것과 동일함.

		/*
		 * [자동 타입 변환]
		 * 	 자동 타입 변환이 발생되면, 
		 *  	(1) 부모 클래스에 있는 필드, 메소드만 사용 가능(자식에만 있는 자원 사용 불가)
		 *  	(2) 단, 자식 클래스에 오버라이딩된 메소드가 있으면, 자식의 오버라이딩된 메소드가 호출된다. 
		 */
		//부모에만 있는 method1() 호출됨.
		parent.method1();
		System.out.println();

		//오버라이딩된 자식의 method2() 호출됨.
		parent.method2();		

		//자동타입변환 -> 자식에만 있는 메소드 호출 불가능
		//컴파일 에러 : The method method3() is undefined for the type Parent
		//parent.method3();
		
	} //end main

} //end class