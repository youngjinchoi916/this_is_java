package chapter11_API.sec04_java_util.part01_Objects;

import java.util.Arrays;
import java.util.Objects;

public class my02_deepEquals {

	/*
	 * [Objects 클래스]
	 *   - java.util.Objects 클래스는 객체비교, 해시코드 생성, null 여부, 객체 문자열 리턴 등의 
	 *     연산을 수행하는 정적 메소드들로 구성된 Object 클래스의 유틸리티 클래스이다.
	 */
	public static void main(String[] args) {
		/*
		 * [equals() vs deepEquals()] 
		 *   - Objects.equals(Object a, Object b) : 두 객체의 동등 비교
		 *   	 -> a, b가 모두 not null 일 경우 : a.equals(b) 의 결과를 리턴
		 *   	 -> a, b 중 어느 하나가 null/다른 하나가 not null 일 경우 : false 리턴
		 *      -> a, b가 모두 null 일 경우 : true 리턴
		 *      
		 *   - Objects.deepEquals(Object a, Object b) : 두 객체의 동등 비교
		 *      -> a, b가 모두 array이고, not null 일 경우 : Arrays.deepEquals(a, b)의 결과를 리턴
		 *           a, b가 서로 다른 배열일 경우 항목 값이 모두 같다면 true 리턴
		 *      -> a, b가 모두 not array이고, not null 일 경우 : a.equals(b) 의 결과를 리턴
		 *   	 -> a, b 중 어느 하나가 null/다른 하나가 not null 일 경우 : false 리턴
		 *      -> a, b가 모두 null 일 경우 : true 리턴
		 */

		Integer o1 = 1000;
		Integer o2 = 1000;
		System.out.println("[Objets.equals(a, b)]");
		System.out.println("o1 :"+o1+" / o2 : "+o2);
		System.out.println("Objects.equals(o1, o2) : "+Objects.equals(o1, o2));
		System.out.println("Objects.equals(o1, null) : "+Objects.equals(o1, null));
		System.out.println("Objects.equals(null, o2) : "+Objects.equals(null, o2));
		System.out.println("Objects.equals(null, null) : "+Objects.equals(null, null));
		//매개변수가 null이 아닐 경우, equals(a, b) 결과값 리턴.
		System.out.println("Objects.deepEquals(o1, o2) : "+Objects.deepEquals(o1, o2));		
		System.out.println();
		
		Integer[] arr1 = {1, 2, 3};
		Integer[] arr2 = {1, 2, 3};
		System.out.println("arr1 : "+arr1);
		System.out.println("arr2 : "+arr2);
		System.out.println("Objects.equals(arr1, arr2) : "+Objects.equals(arr1, arr2)); //arr1.equals(arr2)의 결과값 리턴
		System.out.println("Objects.deepEquals(arr1, arr2) : "+Objects.deepEquals(arr1, arr2));	//Arrays.deepEquals(arr1, arr2)의 리턴값
		System.out.println("Arrays.deepEquals(arr1, arr2) : "+Arrays.deepEquals(arr1, arr2));
		System.out.println("Objects.deepEquals(null, arr2) : "+Objects.deepEquals(null, arr2));
		System.out.println("Objects.deepEquals(arr1, null) : "+Objects.deepEquals(arr1, null));
		System.out.println("Objects.deepEquals(null, null) : "+Objects.deepEquals(null, null));
		
	} //end main

} //end class