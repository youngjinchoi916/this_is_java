package chapter11_API.sec03_java_lang.part02_String.my02_Method;

public class charAt {

	public static void main(String[] args) {
		/*
		 * charAt(int index) : 매개값으로 주어진 특정 위치(인덱스)의 문자 리턴
		 */
		String ssn = "010624-12301230";
		char gender = ssn.charAt(7	);
		switch(gender) {
			case '1' :
			case '3' :
				System.out.println("남자 입니다.");
				break;
			case '2' :
			case '4' :
				System.out.println("여자 입니다.");
				break;
		}

	}

}
