package chapter11_API.sec03_java_lang.part02_String.my02_Method;

public class replace {

	public static void main(String[] args) {
		/*
		 * [replace()]
		 *   - 첫번째 매개값인 문자열을 찾아 두번째 매개값인 문자열로 대치한 새로운 문자열을 생성하고 리턴한다.
		 */
		String oldStr = "자바는 객체 지향 언어 입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "java");
		
		System.out.println("oldStr : "+oldStr);
		System.out.println("newStr : "+newStr);

	}

}
