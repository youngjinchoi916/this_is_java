package chapter11_API.sec03_java_lang.part02_String.my02_Method;

public class equals {

	public static void main(String[] args) {
		/*
		 * [equals()]
		 * 	 - 기본 타입 변수의 값을 비교할 때에는 == 연산자를 사용한다.
		 *  - 그러나, 문자열을 비교할 때에는 == 연산자를 사용하면 원하지 않는 겨로가가 나올 수 있다
		 */
		
		String str1 = new String("레오");
		String str2 = "레오";
		String str3 = "레오";

		//자바는 문자열 리터럴이 동일하다면 동일한 String 객체를 참조하도록 되어 있다.
		//그래서 str2, str3은 동일한 String 객체를 참조한다. 그러나 str1은 new 연산자로 생성된 다른 String 객체를 참조한다.
		
		//== 연산자는 각 변수에 저장된 번지를 비교한다.
		System.out.println("str1==str2 ? "+(str1==str2));
		System.out.println("str2==str3 ? "+(str2==str3));
		
		//equals() 메소드는 객체의 문자열만 비교한다.
		System.out.println("str1.equals(str2) : " +str1.equals(str2));
		System.out.println("str2.equals(str3) : " +str2.equals(str3));
	}

}
