package chapter09_Nested.sec05_Anonymous.part03_Local_Access;

public class Anonymous {
	private int field;
	
	public void method(final int arg1, int arg2) {
		//익명객체에서 사용된 매개변수와 로컬변수는 모두 final 특성을 갖는다.
		final int var1 = 0;
		int var2 = 0;
		
		//필드
		field = 10;
		
		//final을 선언하든 안하든 익명 객체에서 사용된 매개변수는 final 특성을 갖는다.
		//arg1 = 20; (x)
		//arg2 = 20; (x)
		
		//final을 선언하든 안하든 익명 객체에서 사용된 로컬변수는 final 특성을 갖는다.
		//var1 = 30; (x)
		var2 = 30;		//익명 객체 내에서 사용하지 않았기 때문에 final의 특성을 갖지 않는다.
		
		/*
		 * [익명 객체의 로컬 변수 사용]
		 * 	 - 익명 객체 내부에서는 바깥 클래스의 필드나 메소드는 제한 없이 사용할 수 있다. 
		 *     문제는 메소드의 매개변수나 로컬변수를 익명 객체에서 사용할 때이다.
		 *  - 메소드 내에서 생성된 익명 객체는 메소드 실행이 끝나도 힙 메모리에 존재해서 계속 사용할 수 있다.
		 *    매개변수나 로컬변수는 메소드 실행이 끝나면 스택 메모리에서 사라지기 때문에 익명 객체에서 사용할 수 없게 되므로 문제가 발생한다.
		 *     
		 */
		Calculatable calc = new Calculatable() {
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1;
				return result;
			}
		};
		System.out.println("var2 : "+var2);
		System.out.println("sum : "+calc.sum());
	} //end method
	
}











