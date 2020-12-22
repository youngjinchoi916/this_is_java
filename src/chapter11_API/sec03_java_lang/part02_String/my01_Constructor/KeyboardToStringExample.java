package chapter11_API.sec03_java_lang.part02_String.my01_Constructor;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		System.out.print("입력 : ");
		
		/*
		 * System.in.read(byte[] bytes) : 배열에 읽은 바이트를 저장하고 읽은 바이트 수를 리턴
		 */
		//Hello를 입력하고 enter를 눌렀다면 Hello+캐리지리턴(\r)+라인피드(\n)의 코드값이 바이트 배열에 저장됨
		//입력 내용 : 			H 		e 		l 		l 		o 		\r 		\n
		//바이트 배열 내용 : 	72		101	108	108	111	13		10
		int readByteNo = System.in.read(bytes);
		
		String str1 = new String(bytes);
		String str2 = new String(bytes, 0, readByteNo-2); //캐리지리턴, 라인피드를 제외하고 문자열로 생성
		
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);

	}

}
