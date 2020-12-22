package chapter11_API.sec03_java_lang.part02_String.my02_Method;

import java.io.UnsupportedEncodingException;

public class getBytes {

	public static void main(String[] args) {
		/*
		 * [getBytes()]
		 *   - 문자열을 바이트 배열로 변환 하는 메소드
		 *   - 예를 들어 네트워크로 문자열을 전송하거나, 문자열을 암호화할 때 문자열을 바이트 배열로 변환한다.
		 */
		
		String greeting = "안녕하세요";
		
		//byte[] bytes = "문자열".getBytes() -> 시스템의 기본 문자셋으로 인코딩된 바이트 배열을 리턴한다.
		byte[] bytes1 = greeting.getBytes();
		for(byte temp : bytes1) {
			System.out.print(temp+" ");
		}
		System.out.println();
		System.out.println("bytes1.length : "+bytes1.length);
		String str1 = new String(bytes1);
		System.out.println("bytes1 -> String : "+str1);
		System.out.println();
		
		//byte[] bytes = "문자열".getBytes(Charset charset) -> 특정 문자셋으로 인코딩된 바이트 배열 리턴
		//getBytes(Charset charset) 사용시 try-catch 구문 사용
		try {
			//UTF-8 : 알파벳은 1바이트, 한글은 3바이트
			byte[] bytes3 = greeting.getBytes("UTF-8");
			for(byte temp : bytes3) {
				System.out.print(temp+" ");
			}
			System.out.println();
			System.out.println("bytes3.length : "+bytes3.length);
			//단순하게 String(byte[] bytes) 생성자를 이용해서 디코딩 하면 시스템의 기본 문자셋을 이용한다.
			String str3 = new String(bytes3);
			System.out.println("bytes3 -> String : "+str3);
			System.out.println();
			
			
			//EUC-KR : 알파벳은 1바이트, 한글은 2바이트
			byte[] bytes2 = greeting.getBytes("EUC-KR");
			for(byte temp : bytes2) {
				System.out.print(temp+" ");
			}
			System.out.println();
			System.out.println("bytes2.length : "+bytes2.length);
			
			//String str2 = new String(bytes2);
			//기본 문자셋과 다르게 인코딩된 바이트 배열일 경우 String(byte[] bytes, String charsetName) 생성자를 이용해서 디코딩 해야 한다.
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2 -> String : "+str2);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	
	} //end main

} //end class
