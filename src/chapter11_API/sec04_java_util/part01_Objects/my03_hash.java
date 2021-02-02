package chapter11_API.sec04_java_util.part01_Objects;

import java.util.Objects;

public class my03_hash {

	/*
	 * [Objects 클래스]
	 *   - java.util.Objects 클래스는 객체비교, 해시코드 생성, null 여부, 객체 문자열 리턴 등의 
	 *     연산을 수행하는 정적 메소드들로 구성된 Object 클래스의 유틸리티 클래스이다.
	 */
	public static void main(String[] args) {
		/*
		 * [Objects.hash(Object ... values)] 
		 *   - Objects.hash(Object ... values) 메소드는 매개값으로 주어진 값들을 이용해서 해시코드를 생성한다.
		 *   	 -> 주어진 매개값들로 뱅ㄹ을 생성하고 Arrays.hashCode(Object[] )를 호출 해서 해시코드를 얻고 이 값을 리턴한다.
		 *   - 이 메소드는 클래스가 hashCode()를 재정의할 때 리턴값을 생성하기 위해 사용하면 좋다.
		 *   - 클래스가 여러가지 필드를 가지고 있을 때 이 필드들로부터 해시코드를 생성하게 되면 동일한 필드값을 가지는 객체는 동일한 해시코드를 가질 수 있다.
		 *     (클래스가 가지고 있는 필드로 해시코드를 생성하기 때문에 동일한 필드값을 가지면 동일한 해시코드값을 갖는다.)
		 */
		my03_Student student1 = new my03_Student(1,  "홍길동");
		my03_Student student2 = new my03_Student(1,  "홍길동");
		
		//my03_Student 클래스에서 hashCode() 메소드를 재정의 하였음.
		System.out.println(student1.hashCode());	//객체의 hashCode
		System.out.println(Objects.hashCode(student2));	//매개값으로 들어온 객체의 hashCode 리턴
		System.out.println(student1.hashCode() == student2.hashCode());
	
	} //end main

} //end class