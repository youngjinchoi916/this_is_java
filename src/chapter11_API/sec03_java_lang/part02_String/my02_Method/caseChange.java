package chapter11_API.sec03_java_lang.part02_String.my02_Method;

public class caseChange {

	public static void main(String[] args) {
		/*
		 * [toLowerCase(), toUpperCase()]
		 *   - 대 소문자 변경 한 새로운 문자열을 생성한 후 리턴한다.
		 */

		String original = "Java Programming";
		String lowerCase = original.toLowerCase();		//새로 생성된 "java programming" 문자열을 참조한다.
		String upperCase = original.toUpperCase();		//새로 생성된 "JAVA PROGRAMMING" 문자열을 참조한다.
		//원래 "Java Programming" 문자열이 변경된 것은 아니다.
		
		System.out.println(original);
		System.out.println(lowerCase);
		System.out.println(upperCase);
		System.out.println();
		
		/*
		 * [equalsIgnoreCase()]
		 *   - 대 소문자가 다른 두 문자열 비교하기
		 */
		String str1 = "java";
		String str2 = "Java";
		System.out.println("str1.equals(str2) : "+str1.equals(str2));
		
		//소문자로 변환 후 equals() 메소드로 같은 문자열인지 비교
		String lower1 = str1.toLowerCase();
		String lower2 = str2.toLowerCase();;
		System.out.println("lower1.equals(lower2) : "+lower1.equals(lower2));
		
		//equalsIgnoreCase() 메소드로 대소문자 변환 하지 않고 같은 문자열인지 비교
		System.out.println("str1.equalsIgnoreCase(str2) : "+str1.equalsIgnoreCase(str2));
		
	} //end main

} //end class
