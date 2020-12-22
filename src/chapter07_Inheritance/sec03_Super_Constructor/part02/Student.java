package chapter07_Inheritance.sec03_Super_Constructor.part02;

public class Student extends People{
	public int studentNo;

	//명시적으로 부모 생성자 호출 하는 방법
	public Student(String name, String ssn, int studentNo) {
		/*
		 * super(매개값,...); 은 매개값의 타입과 일치하는 부모 생성자를 호출한다.
		 * 만약 매개값의 타입과 일치하는 부모 생성자가 없을 경우 컴파일 오류가 발생한다.
		 */
		
		super(name, ssn);  //부모 클래스에 String 매개값을 2개 받는 생성자가 반드시 있어야함.
		
		/*
		 * super(매개값,...) 가 생략되면 컴파일러에 의해 super()가 자동적으로 추가되기 때문에 부모의 기본생성자가 존재해야 한다.
		 * super(매개값, ...) 이 생략되면 부모의 name, ssn 필드는 null로 초기화 된다.
		 */
		this.studentNo = studentNo;
	}
}
