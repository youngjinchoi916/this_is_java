package chapter06_Class.sec13_Modifier.part03_Field_Method.pack01;

public class Banana {

	public Banana() {
		Apple a = new Apple();
		
		a.field1 = 10;
		a.field2 = 20;
		//a.field3 = 30;		//field3은 private 필드이기 때문에 외부 클래스에서는 사용 불가
		
		a.method1();
		a.method2();
		//a.method3();		//method3()은 private 메소드이기 때문에 외부 클래스에서는 사용 불가
	}
}
