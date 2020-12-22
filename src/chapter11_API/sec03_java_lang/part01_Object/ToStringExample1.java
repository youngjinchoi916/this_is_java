package chapter11_API.sec03_java_lang.part01_Object;

import java.util.Date;

public class ToStringExample1 {

	public static void main(String[] args) {
		/*
		 * [toString() 메소드]
		 *   - Object 클래스의 toString() 메소드는 객체의 문자 정보를 리턴한다.
		 *   - 객체의 문자 정보란 객체를 문자열로 표현한 값을 말한다. "클래스명@16진수해시코드"로 구성된 문자 정보 리턴
		 *   - Object 클래스의 toString() 메소드의 리턴값은 자바 애플리케이션에서는 별 값어치가 없는 정보이므로 
		 *      Object 하위 클래스는 toString() 메소드를 재정의하여 간결하고 유익한 정보를 리턴하도록 되어 있다.
		 *      예를 들어, java.util.Date 클래스는 toString() 메소드를 재정의하여 현재 시스템의 날짜와 시간 정보를 리턴한다. 
		 */
		Object obj1 = new Object();
		Date obj2 = new Date();
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());

	}

}
