package chapter11_API.sec03_java_lang.part01_Object;

import java.util.HashMap;

public class HashCodeExample {

	public class Key {
		public int number;
		public Key(int number) {
			this.number = number;
		}
		
		//number 값이 같으면 true를 리턴하도록 equals() 메소드 재정의 
		@Override
		public boolean equals(Object obj) {
			//[1] 매개값(obj)이 기준 객체(Key)와 동일타입인지 확인해서 강제 타입 변환
			if(obj instanceof Key) {
				Key compareKey = (Key) obj;
				//[2] 필드값이 동일한지 검사
				if(this.number == compareKey.number) {
					return true;
				}
			}
			return false;
		}
		
		/*
		 * [hashCode()]
		 * 	 - 객체를 식별한 하나의 정수값.
		 * 	 - Object의 hashCode() 메소드는 객체의 메모리 번지를 이용해서 해시코드를 만들어 리턴하기 때문에 객체마다 다른 값을 가지고 있다.
		 * 	 - 동등 객체 비교 순서
		 * 		(1) hashCode() 리턴값 동일
		 * 		(2) equals() 리턴값 동일  -> 동등객체
		 */
		@Override
		public int hashCode() {
			return number;
		}
		
	} //end Key
	
	public static void main(String[] args) {
		HashCodeExample hc = new HashCodeExample();
		
		//Key 객체를 식별키(key)로  사용해서 String값(value)를 저장하는 HashMap 객체 생성
		HashMap<Key, String> map = new HashMap<Key, String>();
		
		map.put(hc.new Key(1), "홍길동");
		//식별키 new Key(1)로 "홍길동"을 읽어 오려하지만, 결과는 null이 나온다.
		//다른 키로 인식되기 때문에 값을 가져오지 못한다.
		String value = map.get(hc.new Key(1));
		System.out.println(value);
		
		/*
		 * "홍길동"을 읽으려면 재정의한 hashCode() 메소드를 Key 클래스에 추가하면 된다.
		 */
		//HashMap은 hashCode()의 리턴값이 같고, equals() 리턴값이 true가 나오기 때문에 동등객체로 평가한다.
		//결론적으로, 객체의 동등비교를 위해서 Object의 equals() 메소드만 재정의 하지 말고, 
		//hashCode() 메소드도 재정의해서 논리적 동등 객체일 경우 동일한 해시코드가 리턴되도록 해야한다.
		
	} //end main

} //end class
