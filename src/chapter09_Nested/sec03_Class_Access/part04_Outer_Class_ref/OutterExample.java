package chapter09_Nested.sec03_Class_Access.part04_Outer_Class_ref;

public class OutterExample {
	public static void main(String[] args) {
		//바깥 클래스 객체 생성
		Outter outter = new Outter();
		
		//바깥 클래스 객체 참조를 통해서 중첩클래스(인스턴스 멤버 클래스)에 접근한다
		Outter.Nested nested = outter.new Nested();
		
		nested.print();
	}
}
