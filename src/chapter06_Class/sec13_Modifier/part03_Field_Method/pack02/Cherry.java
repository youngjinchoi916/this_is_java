package chapter06_Class.sec13_Modifier.part03_Field_Method.pack02;

import chapter06_Class.sec13_Modifier.part03_Field_Method.pack01.Apple;

public class Cherry {

	public Cherry() {
		Apple a = new Apple();
		
		a.field1 = 10;
		//a.field2 = 20;		//field2는 default 필드이기 때문에 다른 패키지의 클래스에서는 사용 불가
		//a.field3 = 30;		//field3은 private 필드이기 때문에 외부 클래스에서는 사용 불가
		
		a.method1();
		//a.method2();		//method2()은 default 메소드이기 때문에 다른 패키지의 클래스에서는 사용 불가
		//a.method3();		//method3()은 private 메소드이기 때문에 외부 클래스에서는 사용 불가
	}
}
