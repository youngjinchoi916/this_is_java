package chapter11_API.sec03_java_lang.part02_String;

public class my02_charAt2 {

	public static void main(String[] args) {
		/*
		 * charAt(int index) : 매개값으로 주어진 특정 위치(인덱스)의 문자 리턴
		 */
		
		//num에 저장된 숫자문자열을 각각 한 개씩 쪼개서 int[] 배열에 담기
		String test = "123456789";
		
		int[] arr1 = new int[test.length()];
		for(int i=0 ; i<arr1.length ; i++) {
			arr1[i] = test.charAt(i);
			//숫자문자를 아스키코드로 저장한다.
			//0 -> 49, 1 -> 50...으로 저장
		}
		
		System.out.println("[arr1]");
		for(int temp : arr1) {
			System.out.print(temp+" ");
		}
		System.out.println();
		System.out.println();
		
		//////////////////////////////////////////////////////////////////
		
		int[] arr2 = new int[test.length()];
		for(int i=0 ; i<arr2.length ; i++) {
			arr2[i] = test.charAt(i)-'0';
		}
		
		System.out.println("[arr2]");
		for(int temp : arr2) {
			System.out.print(temp+" ");
		}
		System.out.println();
		System.out.println();
		
		//////////////////////////////////////////////////////////////////
		
		String test2 = "Hello java";
		char[] charArr = new char[test2.length()];
		for(int i=0 ; i<charArr.length ; i++) {
			charArr[i] = test2.charAt(i);
		}
		
		System.out.println("[charArr]");
		for(char temp : charArr) {
			System.out.print(temp+" ");
		}
		System.out.println();
		
	} //end main

} //end class
