package chapter11_API.sec03_java_lang.part02_String.my02_Method;

public class indexOf {

	public static void main(String[] args) {
		/*
		 * [indexOf()]
		 *   - 매개값으로 주어진 문자열이 시작되는 인덱스를 리턴한다.
		 *   - 만약 주어진 문자열이 포함되어 있지 않으면 -1을 리턴한다.
		 */
		
		String subject = "Java 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println("프로그래밍의 시작 인덱스 : "+location);
		
		if(subject.indexOf("Java") != -1) { //subect에 Java라는 문자열이 포함되어 있으면~
			System.out.println("자바와 관련된 책입니다.");
		} else {
			System.out.println("자바와 관련되지 않았습니다.");
		}

	}

}
