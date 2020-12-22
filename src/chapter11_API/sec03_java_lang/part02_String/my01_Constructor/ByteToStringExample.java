package chapter11_API.sec03_java_lang.part02_String.my01_Constructor;

public class ByteToStringExample {

	public static void main(String[] args) {
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		//byte[] 배열로 문자열 생성
		String str1 = new String(bytes);
		System.out.println(str1);
		
		//byte[] 배열의 offset 인덱스 위치부터 length만큼 String 객체로 생성
		String str2 = new String(bytes, 6, 4);		//6번 인덱스 부터 4개 -> 문자열 생성
		System.out.println(str2);

	}

}
