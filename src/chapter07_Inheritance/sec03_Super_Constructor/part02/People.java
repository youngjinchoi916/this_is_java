package chapter07_Inheritance.sec03_Super_Constructor.part02;

public class People {
	public String name;
	public String ssn;

	/* -> 기본 생성자는 항상 선언하는 것을 권장
	public People() {}
	*/
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
} //end class
