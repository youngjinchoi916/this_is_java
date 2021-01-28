package chapter11_API.sec03_java_lang.part01_Object;

public class my04_ToStringExample2 {

	public class SmartPhone {
		private String company;
		private String os;
		
		public SmartPhone(String company, String os) {
			this.company = company;
			this.os = os;
		}
		
		//Object 클래스의 toString() 메소드를 재정의하여 좀 더 유용한 정보를 리턴하도록 한다.
		@Override
		public String toString() {
			//"제작회사-운영체제" 형태로 리턴
			return company+" - " +os;
		}
	}
	
	public static void main(String[] args) {
		/*
		 * [toString() 메소드]
		 *   - Object 클래스의 toString() 메소드는 객체의 문자 정보를 리턴한다.
		 *   - 객체의 문자 정보란 객체를 문자열로 표현한 값을 말한다. -> "클래스명@16진수해시코드"로 구성된 문자 정보 리턴
		 *   - Object 클래스의 toString() 메소드의 리턴값은 자바 애플리케이션에서는 별 값어치가 없는 정보이므로 
		 *     Object 하위 클래스는 toString() 메소드를 재정의하여 간결하고 유익한 정보를 리턴하도록 되어 있다.
		 *     예를 들어, java.util.Date 클래스는 toString() 메소드를 재정의하여 현재 시스템의 날짜와 시간 정보를 리턴한다. 
		 */
		my04_ToStringExample2 ex = new my04_ToStringExample2();
		SmartPhone sp = ex.new SmartPhone("구글", "안드로이드");
		
		System.out.println(sp.toString());
		
		/*
		 * [System.out.println() 메소드]
		 *   - 매개값이 기본 타입일 경우, 해당 값을 그대로 출력한다.
		 *   - 매개값이 객체일 경우 해당 객체의 toString() 메소드를 호출해서 리턴값을 받아 출력한다.
		 *     즉, 객체에서 toString() 메소드를 재정의 하지 않았다면 해당 매개값(객체)의 메모리 번지를 출력한다.
		 */ 
		//sp.toString()을 자동 호출해서 리턴값을 얻은 후에 출력한다.
		System.out.println(sp);
	
	} //end main

} //end class